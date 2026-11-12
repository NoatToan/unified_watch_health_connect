package com.huami.device.feature.health.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.ui.dialog.HrModeDialogKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\f¨\u0006\r"}, d2 = {"", "model", "deviceSource", "", "getHrDetectModelResId", "type", "normalDetectModelResMap", "getNormalDetectModelSummaryRes", "a", "Landroidx/fragment/app/FragmentActivity;", "", "showHrModeSelectDialog", "Landroidx/fragment/app/Fragment;", "health-ui_release"}, k = 2, mv = {1, 5, 1})
public final class HrModeExtKt {
    private static final String a(int i) {
        if (i != 0) {
            return i != 2 ? AppResKt.getHealthStr().getHrDetectClose() : AppResKt.getHealthStr().getAlldayHr();
        }
        return AppResKt.getHealthStr().getHrDetectClose();
    }

    @NotNull
    public static final String getHrDetectModelResId(int i, int i2) {
        return i2 != 65 ? normalDetectModelResMap(i) : a(i);
    }

    public static /* synthetic */ String getHrDetectModelResId$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return getHrDetectModelResId(i, i2);
    }

    @NotNull
    public static final String getNormalDetectModelSummaryRes(int i) {
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return AppResKt.getHealthStr().getHrModeSleepSummary();
        }
        if (i == 2) {
            return AppResKt.getHealthStr().getHrModeAutoSummary();
        }
        if (i != 3) {
            return i != 4 ? "" : AppResKt.getHealthStr().getHrModeAtrialSummary();
        }
        return AppResKt.getHealthStr().getHrModeAutoSleepSummary();
    }

    @NotNull
    public static final String normalDetectModelResMap(int i) {
        if (i == 0) {
            return AppResKt.getHealthStr().getClose();
        }
        if (i == 1) {
            return AppResKt.getHealthStr().getHrModeSleep();
        }
        if (i == 2) {
            return AppResKt.getHealthStr().getHrModeAuto();
        }
        if (i != 3) {
            return i != 4 ? AppResKt.getHealthStr().getClose() : AppResKt.getHealthStr().getHrAtrialFib();
        }
        return AppResKt.getHealthStr().getHrModeAutoSleep();
    }

    public static final void showHrModeSelectDialog(@NotNull FragmentActivity fragmentActivity) {
        HrModeDialogKt.showHrModeDialog(fragmentActivity, fragmentActivity.getSupportFragmentManager());
    }

    public static final void showHrModeSelectDialog(@NotNull Fragment fragment) {
        HrModeDialogKt.showHrModeDialog(fragment.requireActivity(), fragment.getChildFragmentManager());
    }
}
