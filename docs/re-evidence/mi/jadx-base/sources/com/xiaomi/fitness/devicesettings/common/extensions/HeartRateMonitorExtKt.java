package com.xiaomi.fitness.devicesettings.common.extensions;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.av9;
import defpackage.ls9;
import defpackage.qyi;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a\u0011\u0010\r\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0010\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0011\u001a\u0011\u0010\u0018\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0011\u001a\u0011\u0010\u0019\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0011\u001a\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lls9;", "", "isMonitorSwitchOn", "(Lls9;)Z", "isWarningAvailable", "isHrWarningSwitchOn", "isHrWarningAvailable", "isSupportHighHrWarning", "isSupportLowHrWarning", "isLowHrWarningSwitchOn", "isLowHrWarningAvailable", "isSupportSportWarning", "isSupportHeartHealthy", "isSportWarningSwitchOn", "isHeartHeathySwitchOn", "", "getHrWarningStr", "(Lls9;)Ljava/lang/String;", "getLowHrWarningStr", "getSportHrWarningStr", "", "freq", "(I)Ljava/lang/String;", "getHrFreqStr", "getHightStr", "getLowStr", "switchOn", "(ZI)Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class HeartRateMonitorExtKt {
    @NotNull
    public static final String getHightStr(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return !ls9Var.f ? ResourceExtKt.getString(wzi.q3) : getHrWarningStr(ls9Var.g);
    }

    @NotNull
    public static final String getHrFreqStr(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return getHrFreqStr(ls9Var.c == 0, ls9Var.d);
    }

    @NotNull
    public static final String getHrWarningStr(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return getHrWarningStr(ls9Var.g);
    }

    @NotNull
    public static final String getLowHrWarningStr(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        av9 av9Var = ls9Var.h;
        return getHrWarningStr(av9Var != null ? av9Var.d : 0);
    }

    @NotNull
    public static final String getLowStr(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        av9 av9Var = ls9Var.h;
        return (av9Var == null || !av9Var.c) ? ResourceExtKt.getString(wzi.q3) : getHrWarningStr(av9Var.d);
    }

    @NotNull
    public static final String getSportHrWarningStr(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        av9 av9Var = ls9Var.m;
        return getHrWarningStr(av9Var != null ? av9Var.d : 0);
    }

    public static final boolean isHeartHeathySwitchOn(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return ls9Var.i == 1;
    }

    public static final boolean isHrWarningAvailable(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return isWarningAvailable(ls9Var) && isHrWarningSwitchOn(ls9Var);
    }

    public static final boolean isHrWarningSwitchOn(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return isMonitorSwitchOn(ls9Var) && ls9Var.f;
    }

    public static final boolean isLowHrWarningAvailable(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return isWarningAvailable(ls9Var) && isLowHrWarningSwitchOn(ls9Var);
    }

    public static final boolean isLowHrWarningSwitchOn(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        av9 av9Var = ls9Var.h;
        if (av9Var != null) {
            return av9Var.c;
        }
        return false;
    }

    public static final boolean isMonitorSwitchOn(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return ls9Var.c == 0;
    }

    public static final boolean isSportWarningSwitchOn(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        av9 av9Var = ls9Var.m;
        if (av9Var != null) {
            return av9Var.c;
        }
        return false;
    }

    public static final boolean isSupportHeartHealthy(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return ls9Var.i != 0;
    }

    public static final boolean isSupportHighHrWarning(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return ls9Var.f || ls9Var.g > 0;
    }

    public static final boolean isSupportLowHrWarning(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return ls9Var.h != null;
    }

    public static final boolean isSupportSportWarning(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return ls9Var.m != null;
    }

    public static final boolean isWarningAvailable(@NotNull ls9 ls9Var) {
        Intrinsics.checkNotNullParameter(ls9Var, "<this>");
        return isMonitorSwitchOn(ls9Var) && (ls9Var.d <= 10);
    }

    private static final String getHrWarningStr(int i) {
        String quantityString = AppUtil.getApp().getResources().getQuantityString(qyi.j, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @NotNull
    public static final String getHrFreqStr(boolean z, int i) {
        if (!z) {
            return ResourceExtKt.getString(wzi.V4);
        }
        if (i == -1) {
            return ResourceExtKt.getString(wzi.V4);
        }
        if (i != 0) {
            String quantityString = AppUtil.getApp().getResources().getQuantityString(qyi.i, i, Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        return ResourceExtKt.getString(wzi.U4);
    }
}
