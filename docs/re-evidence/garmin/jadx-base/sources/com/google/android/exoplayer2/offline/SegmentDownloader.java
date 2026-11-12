package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private static final long MAX_MERGED_SEGMENT_START_TIME_DIFF_US = 20000000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j8, int i14, long j14, int i15) {
            this.progressListener = progressListener;
            this.contentLength = j8;
            this.totalSegments = i14;
            this.bytesDownloaded = j14;
            this.segmentsDownloaded = i15;
        }

        private float getPercentDownloaded() {
            long j8 = this.contentLength;
            if (j8 != -1 && j8 != 0) {
                return (this.bytesDownloaded * 100.0f) / j8;
            }
            int i14 = this.totalSegments;
            if (i14 != 0) {
                return (this.segmentsDownloaded * 100.0f) / i14;
            }
            return -1.0f;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long j8, long j14, long j15) {
            long j16 = this.bytesDownloaded + j15;
            this.bytesDownloaded = j16;
            this.progressListener.onProgress(this.contentLength, j16, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j8, DataSpec dataSpec) {
            this.startTimeUs = j8;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }
    }

    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, CacheDataSource cacheDataSource, ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public Void doWork() {
            this.cacheWriter.cache();
            ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (Cache) Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new InterruptedException();
                }
                this.activeRunnables.add(runnableFutureTask);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j8 = dataSpec.length;
        return j8 != -1 && dataSpec.position + j8 == dataSpec2.position && Util.areEqual(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory) {
        HashMap map = new HashMap();
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            Segment segment = list.get(i15);
            String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) map.get(strBuildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + MAX_MERGED_SEGMENT_START_TIME_DIFF_US || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, Integer.valueOf(i14));
                list.set(i14, segment);
                i14++;
            } else {
                long j8 = segment.dataSpec.length;
                list.set(((Integer) Assertions.checkNotNull(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, j8 != -1 ? segment2.dataSpec.length + j8 : -1L)));
            }
        }
        Util.removeRange(list, i14, list.size());
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i14 = 0; i14 < this.activeRunnables.size(); i14++) {
                    this.activeRunnables.get(i14).cancel(true);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[EDGE_INSN: B:101:0x01ae->B:84:0x01ae BREAK  A[LOOP:1: B:81:0x0197->B:83:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1 A[LOOP:1: B:81:0x0197->B:83:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6 A[LOOP:2: B:85:0x01b4->B:86:0x01b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cb  */
    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void download(Downloader.ProgressListener progressListener) throws Throwable {
        int i14;
        int size;
        ArrayList<RunnableFutureTask<?, ?>> arrayList;
        int size2;
        PriorityTaskManager priorityTaskManager;
        ArrayList<RunnableFutureTask<?, ?>> arrayList2;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.add(-1000);
        }
        boolean z14 = true;
        try {
            CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
            FilterableManifest manifest = getManifest(cacheDataSourceCreateDataSourceForDownloading2, this.manifestDataSpec, false);
            if (!this.streamKeys.isEmpty()) {
                manifest = (FilterableManifest) manifest.copy(this.streamKeys);
            }
            List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
            Collections.sort(segments);
            mergeSegments(segments, this.cacheKeyFactory);
            int size3 = segments.size();
            int size4 = segments.size() - 1;
            int i15 = 0;
            long j8 = 0;
            long j14 = 0;
            while (size4 >= 0) {
                try {
                    DataSpec dataSpec = segments.get(size4).dataSpec;
                    String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
                    boolean z15 = z14;
                    long j15 = dataSpec.length;
                    if (j15 == -1) {
                        long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                        if (contentLength != -1) {
                            j15 = contentLength - dataSpec.position;
                        }
                    }
                    long j16 = j15;
                    long cachedBytes = this.cache.getCachedBytes(strBuildCacheKey, dataSpec.position, j16);
                    j14 += cachedBytes;
                    if (j16 != -1) {
                        if (j16 == cachedBytes) {
                            i15++;
                            segments.remove(size4);
                        }
                        if (j8 != -1) {
                            j8 += j16;
                        }
                    } else {
                        j8 = -1;
                    }
                    size4--;
                    z14 = z15;
                } catch (Throwable th3) {
                    th = th3;
                    i14 = 0;
                    while (true) {
                        size = this.activeRunnables.size();
                        arrayList = this.activeRunnables;
                        if (i14 < size) {
                            break;
                        }
                        arrayList.get(i14).cancel(true);
                        i14++;
                    }
                    for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        this.activeRunnables.get(size2).blockUntilFinished();
                        removeActiveRunnable(size2);
                    }
                    priorityTaskManager = this.priorityTaskManager;
                    if (priorityTaskManager != null) {
                        priorityTaskManager.remove(-1000);
                    }
                    throw th;
                }
            }
            boolean z16 = z14;
            ProgressNotifier progressNotifier = progressListener != null ? new ProgressNotifier(progressListener, j8, size3, j14, i15) : null;
            arrayDeque.addAll(segments);
            while (!this.isCanceled && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.proceed(-1000);
                }
                if (arrayDeque2.isEmpty()) {
                    cacheDataSourceCreateDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                    bArr = new byte[131072];
                } else {
                    SegmentDownloadRunnable segmentDownloadRunnable = (SegmentDownloadRunnable) arrayDeque2.removeFirst();
                    cacheDataSourceCreateDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                    bArr = segmentDownloadRunnable.temporaryBuffer;
                }
                SegmentDownloadRunnable segmentDownloadRunnable2 = new SegmentDownloadRunnable((Segment) arrayDeque.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, progressNotifier, bArr);
                addActiveRunnable(segmentDownloadRunnable2);
                this.executor.execute(segmentDownloadRunnable2);
                for (int size5 = this.activeRunnables.size() - 1; size5 >= 0; size5--) {
                    SegmentDownloadRunnable segmentDownloadRunnable3 = (SegmentDownloadRunnable) this.activeRunnables.get(size5);
                    if (arrayDeque.isEmpty() || segmentDownloadRunnable3.isDone()) {
                        try {
                            segmentDownloadRunnable3.get();
                            removeActiveRunnable(size5);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        } catch (ExecutionException e4) {
                            Throwable th4 = (Throwable) Assertions.checkNotNull(e4.getCause());
                            if (!(th4 instanceof PriorityTaskManager.PriorityTooLowException)) {
                                if (th4 instanceof IOException) {
                                    throw ((IOException) th4);
                                }
                                Util.sneakyThrow(th4);
                                i14 = 0;
                                while (true) {
                                    size = this.activeRunnables.size();
                                    arrayList = this.activeRunnables;
                                    if (i14 < size) {
                                        break;
                                        break;
                                    } else {
                                        arrayList.get(i14).cancel(true);
                                        i14++;
                                    }
                                }
                                while (size2 >= 0) {
                                    this.activeRunnables.get(size2).blockUntilFinished();
                                    removeActiveRunnable(size2);
                                }
                                priorityTaskManager = this.priorityTaskManager;
                                if (priorityTaskManager != null) {
                                    priorityTaskManager.remove(-1000);
                                }
                                throw th;
                            }
                            arrayDeque.addFirst(segmentDownloadRunnable3.segment);
                            removeActiveRunnable(size5);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        }
                    }
                }
                segmentDownloadRunnable2.blockUntilStarted();
            }
            int i16 = 0;
            while (true) {
                int size6 = this.activeRunnables.size();
                arrayList2 = this.activeRunnables;
                if (i16 >= size6) {
                    break;
                }
                arrayList2.get(i16).cancel(z16);
                i16++;
            }
            for (int size7 = arrayList2.size() - (z16 ? 1 : 0); size7 >= 0; size7--) {
                this.activeRunnables.get(size7).blockUntilFinished();
                removeActiveRunnable(size7);
            }
            PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.remove(-1000);
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final <T> T execute(RunnableFutureTask<T, ?> runnableFutureTask, boolean z14) throws Throwable {
        if (z14) {
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (ExecutionException e4) {
                Throwable th3 = (Throwable) Assertions.checkNotNull(e4.getCause());
                if (th3 instanceof IOException) {
                    throw ((IOException) th3);
                }
                Util.sneakyThrow(e4);
            }
        }
        while (!this.isCanceled) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-1000);
            }
            addActiveRunnable(runnableFutureTask);
            this.executor.execute(runnableFutureTask);
            try {
                T t7 = runnableFutureTask.get();
                runnableFutureTask.blockUntilFinished();
                removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                return t7;
            } catch (ExecutionException e14) {
                try {
                    Throwable th4 = (Throwable) Assertions.checkNotNull(e14.getCause());
                    if (!(th4 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th4 instanceof IOException) {
                            throw ((IOException) th4);
                        }
                        Util.sneakyThrow(e14);
                    }
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                } catch (Throwable th5) {
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                    throw th5;
                }
            }
        }
        throw new InterruptedException();
    }

    public final M getManifest(final DataSource dataSource, final DataSpec dataSpec, boolean z14) {
        return (M) execute(new RunnableFutureTask<M, IOException>() { // from class: com.google.android.exoplayer2.offline.SegmentDownloader.1
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public M doWork() {
                return (M) ParsingLoadable.load(dataSource, SegmentDownloader.this.manifestParser, dataSpec, 4);
            }
        }, z14);
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M m14, boolean z14);

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            try {
                List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
                int i14 = 0;
                while (true) {
                    int size = segments.size();
                    Cache cache = this.cache;
                    CacheKeyFactory cacheKeyFactory = this.cacheKeyFactory;
                    if (i14 >= size) {
                        cache.removeResource(cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
                        return;
                    } else {
                        cache.removeResource(cacheKeyFactory.buildCacheKey(segments.get(i14).dataSpec));
                        i14++;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
            } catch (Exception unused2) {
                this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
            }
        } catch (Throwable th3) {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
            throw th3;
        }
    }

    private void removeActiveRunnable(int i14) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i14);
        }
    }
}
