package com.xiaomi.fitness.net.downloadV2.listener;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import com.xiaomi.fitness.net.downloadV2.DownloadProgress;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/listener/BaseSingleFileDownloadListener;", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "<init>", "()V", LifecycleConstantKt.ON_START, "", "contentLength", "", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/fitness/net/downloadV2/DownloadProgress;", "onSuccess", "path", "", "onError", PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/fitness/net/downloadV2/DownloadException;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseSingleFileDownloadListener implements ISingleFileDownloadListener {
    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onError(@NotNull DownloadException e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onProgress(@NotNull DownloadProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onStart(long contentLength) {
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onSuccess(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
    }
}
