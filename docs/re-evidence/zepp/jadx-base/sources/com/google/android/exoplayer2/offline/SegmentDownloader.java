package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
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

/* JADX INFO: loaded from: classes2.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int k = 131072;
    private static final long l = 20000000;
    private final DataSpec a;
    private final ParsingLoadable.Parser<M> b;
    private final ArrayList<StreamKey> c;
    private final CacheDataSource.Factory d;
    private final Cache e;
    private final CacheKeyFactory f;

    @Nullable
    private final PriorityTaskManager g;
    private final Executor h;
    private final ArrayList<RunnableFutureTask<?, ?>> i;
    private volatile boolean j;

    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long startTimeUs, DataSpec dataSpec) {
            this.startTimeUs = startTimeUs;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment other) {
            return Util.compareLong(this.startTimeUs, other.startTimeUs);
        }
    }

    public class a extends RunnableFutureTask<M, IOException> {
        public final /* synthetic */ DataSource h;
        public final /* synthetic */ DataSpec i;

        public a(final DataSource val$dataSource, final DataSpec val$dataSpec) {
            this.h = val$dataSource;
            this.i = val$dataSpec;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public M doWork() throws IOException {
            return (M) ParsingLoadable.load(this.h, SegmentDownloader.this.b, this.i, 4);
        }
    }

    public static final class b implements CacheWriter.ProgressListener {
        private final Downloader.ProgressListener a;
        private final long b;
        private final int c;
        private long d;
        private int e;

        public b(Downloader.ProgressListener progressListener, long contentLength, int totalSegments, long bytesDownloaded, int segmentsDownloaded) {
            this.a = progressListener;
            this.b = contentLength;
            this.c = totalSegments;
            this.d = bytesDownloaded;
            this.e = segmentsDownloaded;
        }

        private float a() {
            long j = this.b;
            if (j != -1 && j != 0) {
                return (this.d * 100.0f) / j;
            }
            int i = this.c;
            if (i != 0) {
                return (this.e * 100.0f) / i;
            }
            return -1.0f;
        }

        public void b() {
            this.e++;
            this.a.onProgress(this.b, this.d, a());
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long requestLength, long bytesCached, long newBytesCached) {
            long j = this.d + newBytesCached;
            this.d = j;
            this.a.onProgress(this.b, j, a());
        }
    }

    public static final class c extends RunnableFutureTask<Void, IOException> {
        public final Segment h;
        public final CacheDataSource i;

        @Nullable
        private final b j;
        public final byte[] k;
        private final CacheWriter l;

        public c(Segment segment, CacheDataSource dataSource, @Nullable b progressNotifier, byte[] temporaryBuffer) {
            this.h = segment;
            this.i = dataSource;
            this.j = progressNotifier;
            this.k = temporaryBuffer;
            this.l = new CacheWriter(dataSource, segment.dataSpec, temporaryBuffer, progressNotifier);
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doWork() throws IOException {
            this.l.cache();
            b bVar = this.j;
            if (bVar == null) {
                return null;
            }
            bVar.b();
            return null;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public void cancelWork() {
            this.l.cancel();
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> manifestParser, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
        Assertions.checkNotNull(mediaItem.playbackProperties);
        this.a = getCompressibleDataSpec(mediaItem.playbackProperties.uri);
        this.b = manifestParser;
        this.c = new ArrayList<>(mediaItem.playbackProperties.streamKeys);
        this.d = cacheDataSourceFactory;
        this.h = executor;
        this.e = (Cache) Assertions.checkNotNull(cacheDataSourceFactory.getCache());
        this.f = cacheDataSourceFactory.getCacheKeyFactory();
        this.g = cacheDataSourceFactory.getUpstreamPriorityTaskManager();
        this.i = new ArrayList<>();
    }

    private <T> void b(RunnableFutureTask<T, ?> runnable) throws InterruptedException {
        synchronized (this.i) {
            if (this.j) {
                throw new InterruptedException();
            }
            this.i.add(runnable);
        }
    }

    private static boolean c(DataSpec dataSpec1, DataSpec dataSpec2) {
        if (dataSpec1.uri.equals(dataSpec2.uri)) {
            long j = dataSpec1.length;
            if (j != -1 && dataSpec1.position + j == dataSpec2.position && Util.areEqual(dataSpec1.key, dataSpec2.key) && dataSpec1.flags == dataSpec2.flags && dataSpec1.httpMethod == dataSpec2.httpMethod && dataSpec1.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders)) {
                return true;
            }
        }
        return false;
    }

    private static void d(List<Segment> segments, CacheKeyFactory keyFactory) {
        HashMap map = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < segments.size(); i2++) {
            Segment segment = segments.get(i2);
            String strBuildCacheKey = keyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) map.get(strBuildCacheKey);
            Segment segment2 = num == null ? null : segments.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + l || !c(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, Integer.valueOf(i));
                segments.set(i, segment);
                i++;
            } else {
                long j = segment.dataSpec.length;
                segments.set(((Integer) Assertions.checkNotNull(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, j != -1 ? segment2.dataSpec.length + j : -1L)));
            }
        }
        Util.removeRange(segments, i, segments.size());
    }

    private void e(int index) {
        synchronized (this.i) {
            this.i.remove(index);
        }
    }

    private void f(RunnableFutureTask<?, ?> runnable) {
        synchronized (this.i) {
            this.i.remove(runnable);
        }
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        synchronized (this.i) {
            this.j = true;
            for (int i = 0; i < this.i.size(); i++) {
                this.i.get(i).cancel(true);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0199 */
    @Override // com.google.android.exoplayer2.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(@Nullable Downloader.ProgressListener progressListener) throws Throwable {
        SegmentDownloader<M> segmentDownloader;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        SegmentDownloader<M> segmentDownloader2 = this;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager = segmentDownloader2.g;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-1000);
        }
        try {
            CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = segmentDownloader2.d.createDataSourceForDownloading();
            FilterableManifest manifest = segmentDownloader2.getManifest(cacheDataSourceCreateDataSourceForDownloading2, segmentDownloader2.a, false);
            if (!segmentDownloader2.c.isEmpty()) {
                manifest = (FilterableManifest) manifest.copy(segmentDownloader2.c);
            }
            List<Segment> segments = segmentDownloader2.getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
            Collections.sort(segments);
            d(segments, segmentDownloader2.f);
            int size = segments.size();
            int size2 = segments.size() - 1;
            long j = 0;
            long j2 = 0;
            int i = 0;
            while (size2 >= 0) {
                try {
                    DataSpec dataSpec = segments.get(size2).dataSpec;
                    String strBuildCacheKey = segmentDownloader2.f.buildCacheKey(dataSpec);
                    long j3 = dataSpec.length;
                    if (j3 == -1) {
                        long jA = com.google.android.exoplayer2.upstream.cache.e.a(segmentDownloader2.e.getContentMetadata(strBuildCacheKey));
                        if (jA != -1) {
                            j3 = jA - dataSpec.position;
                        }
                    }
                    ArrayDeque arrayDeque3 = arrayDeque;
                    long cachedBytes = segmentDownloader2.e.getCachedBytes(strBuildCacheKey, dataSpec.position, j3);
                    j2 += cachedBytes;
                    if (j3 != -1) {
                        if (j3 == cachedBytes) {
                            i++;
                            segments.remove(size2);
                        }
                        if (j != -1) {
                            j += j3;
                        }
                    } else {
                        j = -1;
                    }
                    size2--;
                    segmentDownloader2 = this;
                    arrayDeque = arrayDeque3;
                } catch (Throwable th) {
                    th = th;
                    segmentDownloader = this;
                    for (int i2 = 0; i2 < segmentDownloader.i.size(); i2++) {
                        segmentDownloader.i.get(i2).cancel(true);
                    }
                    for (int size3 = segmentDownloader.i.size() - 1; size3 >= 0; size3--) {
                        segmentDownloader.i.get(size3).blockUntilFinished();
                        segmentDownloader.e(size3);
                    }
                    PriorityTaskManager priorityTaskManager2 = segmentDownloader.g;
                    if (priorityTaskManager2 != null) {
                        priorityTaskManager2.remove(-1000);
                    }
                    throw th;
                }
            }
            ArrayDeque arrayDeque4 = arrayDeque;
            b bVar = progressListener != null ? new b(progressListener, j, size, j2, i) : null;
            arrayDeque4.addAll(segments);
            segmentDownloader = this;
            while (!segmentDownloader.j && !arrayDeque4.isEmpty()) {
                PriorityTaskManager priorityTaskManager3 = segmentDownloader.g;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.proceed(-1000);
                }
                if (arrayDeque2.isEmpty()) {
                    cacheDataSourceCreateDataSourceForDownloading = segmentDownloader.d.createDataSourceForDownloading();
                    bArr = new byte[131072];
                } else {
                    c cVar = (c) arrayDeque2.removeFirst();
                    cacheDataSourceCreateDataSourceForDownloading = cVar.i;
                    bArr = cVar.k;
                }
                c cVar2 = new c((Segment) arrayDeque4.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, bVar, bArr);
                segmentDownloader.b(cVar2);
                segmentDownloader.h.execute(cVar2);
                for (int size4 = segmentDownloader.i.size() - 1; size4 >= 0; size4--) {
                    c cVar3 = (c) segmentDownloader.i.get(size4);
                    if (arrayDeque4.isEmpty() || cVar3.isDone()) {
                        try {
                            cVar3.get();
                            segmentDownloader.e(size4);
                            arrayDeque2.addLast(cVar3);
                        } catch (ExecutionException e) {
                            Throwable th2 = (Throwable) Assertions.checkNotNull(e.getCause());
                            if (th2 instanceof PriorityTaskManager.PriorityTooLowException) {
                                arrayDeque4.addFirst(cVar3.h);
                                segmentDownloader.e(size4);
                                arrayDeque2.addLast(cVar3);
                            } else {
                                if (th2 instanceof IOException) {
                                    throw ((IOException) th2);
                                }
                                Util.sneakyThrow(th2);
                            }
                        }
                    }
                }
                cVar2.blockUntilStarted();
            }
            for (int i3 = 0; i3 < segmentDownloader.i.size(); i3++) {
                segmentDownloader.i.get(i3).cancel(true);
            }
            for (int size5 = segmentDownloader.i.size() - 1; size5 >= 0; size5--) {
                segmentDownloader.i.get(size5).blockUntilFinished();
                segmentDownloader.e(size5);
            }
            PriorityTaskManager priorityTaskManager4 = segmentDownloader.g;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.remove(-1000);
            }
        } catch (Throwable th3) {
            th = th3;
            segmentDownloader = segmentDownloader2;
        }
    }

    public final <T> T execute(RunnableFutureTask<T, ?> runnable, boolean removing) throws Throwable {
        if (removing) {
            runnable.run();
            try {
                return runnable.get();
            } catch (ExecutionException e) {
                Throwable th = (Throwable) Assertions.checkNotNull(e.getCause());
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                Util.sneakyThrow(e);
            }
        }
        while (!this.j) {
            PriorityTaskManager priorityTaskManager = this.g;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-1000);
            }
            b(runnable);
            this.h.execute(runnable);
            try {
                T t = runnable.get();
                runnable.blockUntilFinished();
                f(runnable);
                return t;
            } catch (ExecutionException e2) {
                try {
                    Throwable th2 = (Throwable) Assertions.checkNotNull(e2.getCause());
                    if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        Util.sneakyThrow(e2);
                    }
                    runnable.blockUntilFinished();
                    f(runnable);
                } catch (Throwable th3) {
                    runnable.blockUntilFinished();
                    f(runnable);
                    throw th3;
                }
            }
        }
        throw new InterruptedException();
    }

    public final M getManifest(DataSource dataSource, DataSpec dataSpec, boolean removing) throws InterruptedException, IOException {
        return (M) execute(new a(dataSource, dataSpec), removing);
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M manifest, boolean removing) throws InterruptedException, IOException;

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.d.createDataSourceForRemovingDownload();
        try {
            List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.a, true), true);
            for (int i = 0; i < segments.size(); i++) {
                this.e.removeResource(this.f.buildCacheKey(segments.get(i).dataSpec));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            this.e.removeResource(this.f.buildCacheKey(this.a));
        }
    }
}
