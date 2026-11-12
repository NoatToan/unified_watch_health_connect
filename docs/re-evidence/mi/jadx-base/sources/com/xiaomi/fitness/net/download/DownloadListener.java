package com.xiaomi.fitness.net.download;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/net/download/DownloadListener;", "", LifecycleConstantKt.ON_START, "", SportDataTypeKt.DIMEN_TOTAL, "", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "onSuccess", "file", "Ljava/io/File;", "onError", PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/fitness/net/response/ApiException;", "onCancel", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DownloadListener {
    void onCancel();

    void onError(@NotNull ApiException e);

    void onProgress(@Nullable DownloadProgress progress);

    void onStart(long total);

    void onSuccess(@Nullable File file);
}
