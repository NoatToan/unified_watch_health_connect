package com.xiaomi.wearable.hm;

import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"SILENT_PUSHING_ACTION", "", "SILENT_PUSHING_PROGRESS", "SILENT_PUSHING_CANCEL", "SILENT_PUSHING_STOP", "SILENT_PUSHING_FINISH", "SILENT_PUSHING_ERROR", "broadcastUpgradeProgress", "", "state", "fwType", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "result", "", "huami-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BroadcastsKt {

    @NotNull
    public static final String SILENT_PUSHING_ACTION = "com.xiaomi.wearable.hm.SilentPushingAction";

    @NotNull
    public static final String SILENT_PUSHING_CANCEL = "cancel";

    @NotNull
    public static final String SILENT_PUSHING_ERROR = "error";

    @NotNull
    public static final String SILENT_PUSHING_FINISH = "finish";

    @NotNull
    public static final String SILENT_PUSHING_PROGRESS = "progress";

    @NotNull
    public static final String SILENT_PUSHING_STOP = "stop";

    public static final void broadcastUpgradeProgress(@NotNull String state, @Nullable FwType fwType, @Nullable Progress progress, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intent intent = new Intent(SILENT_PUSHING_ACTION);
        intent.putExtra("state", state);
        intent.putExtra(SILENT_PUSHING_PROGRESS, progress);
        intent.putExtra("fw_type", fwType);
        intent.putExtra("result", z);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static /* synthetic */ void broadcastUpgradeProgress$default(String str, FwType fwType, Progress progress, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            fwType = null;
        }
        if ((i & 4) != 0) {
            progress = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        broadcastUpgradeProgress(str, fwType, progress, z);
    }
}
