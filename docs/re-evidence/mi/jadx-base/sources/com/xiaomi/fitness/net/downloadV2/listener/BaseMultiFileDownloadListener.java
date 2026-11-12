package com.xiaomi.fitness.net.downloadV2.listener;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/listener/BaseMultiFileDownloadListener;", "Lcom/xiaomi/fitness/net/downloadV2/listener/IMultiFileDownloadListener;", "<init>", "()V", "onSubmit", "", "totalCount", "", "onProgress", "successCount", "onComplete", "failCount", "onError", PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/fitness/net/downloadV2/DownloadException;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseMultiFileDownloadListener implements IMultiFileDownloadListener {
    @Override // com.xiaomi.fitness.net.downloadV2.listener.IMultiFileDownloadListener
    public void onComplete(int successCount, int failCount, int totalCount) {
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.IMultiFileDownloadListener
    public void onError(@NotNull DownloadException e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.IMultiFileDownloadListener
    public void onProgress(int successCount, int totalCount) {
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.IMultiFileDownloadListener
    public void onSubmit(int totalCount) {
    }
}
