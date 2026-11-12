package com.xiaomi.fitness.net.download;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/net/download/Downloader;", "", "download", "", "request", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/net/download/DownloadListener;", "pause", "url", "", BroadcastsKt.SILENT_PUSHING_CANCEL, "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Downloader {
    void cancel(@Nullable String url);

    void download(@NotNull DownloadRequest request, @Nullable DownloadListener listener);

    void pause(@Nullable String url);
}
