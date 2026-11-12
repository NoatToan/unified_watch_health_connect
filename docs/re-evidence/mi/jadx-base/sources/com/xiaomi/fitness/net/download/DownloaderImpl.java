package com.xiaomi.fitness.net.download;

import android.util.LruCache;
import androidx.work.Data;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.net.download.engine.RealDownloadRequest;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/net/download/DownloaderImpl;", "Lcom/xiaomi/fitness/net/download/Downloader;", "<init>", "()V", "mRequest", "Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest;", "mCache", "Landroid/util/LruCache;", "", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "download", "", "request", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/net/download/DownloadListener;", "pause", "url", BroadcastsKt.SILENT_PUSHING_CANCEL, "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloaderImpl implements Downloader {

    @NotNull
    private final RealDownloadRequest mRequest = new RealDownloadRequest();

    @NotNull
    private final LruCache<String, DownloadRequest> mCache = new LruCache<>(Data.MAX_DATA_BYTES);

    @Override // com.xiaomi.fitness.net.download.Downloader
    public void cancel(@Nullable String url) {
        DownloadRequest downloadRequestRemove = this.mCache.remove(url);
        Intrinsics.checkNotNullExpressionValue(downloadRequestRemove, "remove(...)");
        DownloadRequest downloadRequest = downloadRequestRemove;
        downloadRequest.getShadow().delete();
        downloadRequest.getTmp().delete();
    }

    @Override // com.xiaomi.fitness.net.download.Downloader
    public void download(@NotNull DownloadRequest request, @Nullable DownloadListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.mCache.put(request.getUrl(), request);
        this.mRequest.download(request, listener);
    }

    @Override // com.xiaomi.fitness.net.download.Downloader
    public void pause(@Nullable String url) {
    }
}
