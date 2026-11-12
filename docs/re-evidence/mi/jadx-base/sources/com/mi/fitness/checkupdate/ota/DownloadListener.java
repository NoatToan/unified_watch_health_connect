package com.mi.fitness.checkupdate.ota;

import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/DownloadListener;", "", "onProgress", "", "type", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "result", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DownloadListener {
    void onFinish(boolean result);

    void onProgress(@Nullable FwType type, int progress);
}
