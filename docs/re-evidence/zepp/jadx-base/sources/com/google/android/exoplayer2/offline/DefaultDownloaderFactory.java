package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.dash.offline.DashDownloader;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloader;
import com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.jy0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private static final SparseArray<Constructor<? extends Downloader>> c = b();
    private final CacheDataSource.Factory a;
    private final Executor b;

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory cacheDataSourceFactory) {
        this(cacheDataSourceFactory, jy0.a);
    }

    private Downloader a(DownloadRequest request, int contentType) {
        Constructor<? extends Downloader> constructor = c.get(contentType);
        if (constructor == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Module missing for content type ");
            sb.append(contentType);
            throw new IllegalStateException(sb.toString());
        }
        try {
            return constructor.newInstance(new MediaItem.Builder().setUri(request.uri).setStreamKeys(request.streamKeys).setCustomCacheKey(request.customCacheKey).setDrmKeySetId(request.keySetId).build(), this.a, this.b);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Failed to instantiate downloader for content type ");
            sb2.append(contentType);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private static SparseArray<Constructor<? extends Downloader>> b() {
        SparseArray<Constructor<? extends Downloader>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, c(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, c(HlsDownloader.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, c(SsDownloader.class));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends Downloader> c(Class<?> clazz) {
        try {
            return clazz.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest request) {
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(request.uri, request.mimeType);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 1 || iInferContentTypeForUriAndMimeType == 2) {
            return a(request, iInferContentTypeForUriAndMimeType);
        }
        if (iInferContentTypeForUriAndMimeType == 4) {
            return new ProgressiveDownloader(new MediaItem.Builder().setUri(request.uri).setCustomCacheKey(request.customCacheKey).build(), this.a, this.b);
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unsupported type: ");
        sb.append(iInferContentTypeForUriAndMimeType);
        throw new IllegalArgumentException(sb.toString());
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
        this.a = (CacheDataSource.Factory) Assertions.checkNotNull(cacheDataSourceFactory);
        this.b = (Executor) Assertions.checkNotNull(executor);
    }
}
