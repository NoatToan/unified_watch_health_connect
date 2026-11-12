package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import defpackage.jy0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ProgressiveDownloader implements Downloader {
    private final Executor a;
    private final DataSpec b;
    private final CacheDataSource c;
    private final CacheWriter d;

    @Nullable
    private final PriorityTaskManager e;

    @Nullable
    private Downloader.ProgressListener f;
    private volatile RunnableFutureTask<Void, IOException> g;
    private volatile boolean h;

    public class a extends RunnableFutureTask<Void, IOException> {
        public a() {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doWork() throws IOException {
            ProgressiveDownloader.this.d.cache();
            return null;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public void cancelWork() {
            ProgressiveDownloader.this.d.cancel();
        }
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory) {
        this(mediaItem, cacheDataSourceFactory, jy0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long contentLength, long bytesCached, long newBytesCached) {
        Downloader.ProgressListener progressListener = this.f;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(contentLength, bytesCached, (contentLength == -1 || contentLength == 0) ? -1.0f : (bytesCached * 100.0f) / contentLength);
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        this.h = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.g;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // com.google.android.exoplayer2.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void download(@Nullable Downloader.ProgressListener progressListener) throws InterruptedException, IOException {
        this.f = progressListener;
        this.g = new a();
        PriorityTaskManager priorityTaskManager = this.e;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-1000);
        }
        boolean z = false;
        while (!z) {
            if (this.h) {
                break;
            }
            PriorityTaskManager priorityTaskManager2 = this.e;
            if (priorityTaskManager2 != null) {
                priorityTaskManager2.proceed(-1000);
            }
            this.a.execute(this.g);
            try {
                this.g.get();
                z = true;
            } catch (ExecutionException e) {
                Throwable th = (Throwable) Assertions.checkNotNull(e.getCause());
                if (!(th instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (th instanceof IOException) {
                        throw ((IOException) th);
                    }
                    Util.sneakyThrow(th);
                }
            }
        }
        this.g.blockUntilFinished();
        PriorityTaskManager priorityTaskManager3 = this.e;
        if (priorityTaskManager3 != null) {
            priorityTaskManager3.remove(-1000);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
        this.c.getCache().removeResource(this.c.getCacheKeyFactory().buildCacheKey(this.b));
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
        this.a = (Executor) Assertions.checkNotNull(executor);
        Assertions.checkNotNull(mediaItem.playbackProperties);
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(mediaItem.playbackProperties.uri).setKey(mediaItem.playbackProperties.customCacheKey).setFlags(4).build();
        this.b = dataSpecBuild;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading = cacheDataSourceFactory.createDataSourceForDownloading();
        this.c = cacheDataSourceCreateDataSourceForDownloading;
        this.d = new CacheWriter(cacheDataSourceCreateDataSourceForDownloading, dataSpecBuild, null, new CacheWriter.ProgressListener() { // from class: h46
            @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
            public final void onProgress(long j, long j2, long j3) {
                this.a.c(j, j2, j3);
            }
        });
        this.e = cacheDataSourceFactory.getUpstreamPriorityTaskManager();
    }
}
