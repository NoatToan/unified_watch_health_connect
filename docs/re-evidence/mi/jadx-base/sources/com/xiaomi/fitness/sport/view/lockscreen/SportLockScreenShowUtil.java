package com.xiaomi.fitness.sport.view.lockscreen;

import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.CheckOverlayPermission;
import com.xiaomi.fitness.common.utils.DisplayPopupWindowWhileRunningInBgUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.ioe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport/view/lockscreen/SportLockScreenShowUtil;", "", "<init>", "()V", "TAG", "", "shouldShowDataWhenLockScreen", "", "context", "Landroid/content/Context;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportLockScreenShowUtil {

    @NotNull
    public static final SportLockScreenShowUtil INSTANCE = new SportLockScreenShowUtil();

    @NotNull
    public static final String TAG = "SportLockScreenShowUtil";

    private SportLockScreenShowUtil() {
    }

    public final boolean shouldShowDataWhenLockScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zA = RomUtils.isXiaomi() ? ioe.a(context) : true;
        boolean zCheckFloatPermission = CheckOverlayPermission.INSTANCE.checkFloatPermission(context);
        boolean zDisplayPopupWindowWhileRunningInBg = DisplayPopupWindowWhileRunningInBgUtil.INSTANCE.displayPopupWindowWhileRunningInBg(context);
        Logger.i(TAG, "canShowWhenLocked=" + zA + " checkFloatingPermission=" + zCheckFloatPermission + " displayPopupWindowWhileRunningInBg=" + zDisplayPopupWindowWhileRunningInBg);
        return zA && zCheckFloatPermission && zDisplayPopupWindowWhileRunningInBg;
    }
}
