package com.huami.device.feature.health.util;

import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0007\"\u0016\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0019\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroid/view/View;", "", "isVisible", "", "setVisible", "", "timestamp", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus;", "generateCorrectStatus", "", "generateCorrectDay", "", TrainingWebConst.QueryParam.VIDEO_FORMAT, "BLOOD_PRESSURE_CORRECT_DAY", LogUtil.I, "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "getSYSTOLIC_RANGE", "()Lkotlin/ranges/IntRange;", "SYSTOLIC_RANGE", "b", "getDIASTOLIC_RANGE", "DIASTOLIC_RANGE", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureExtKt {
    public static final int BLOOD_PRESSURE_CORRECT_DAY = 28;

    @NotNull
    private static final IntRange a = new IntRange(80, 170);

    @NotNull
    private static final IntRange b = new IntRange(50, 110);

    @NotNull
    public static final String format(@NotNull BloodPressureCorrectDayStatus bloodPressureCorrectDayStatus) {
        if (bloodPressureCorrectDayStatus instanceof BloodPressureCorrectDayStatus.INVALID) {
            return HealthDetect.INSTANCE.getContext().getString(R.string.blood_pressure_re_correct);
        }
        return bloodPressureCorrectDayStatus instanceof BloodPressureCorrectDayStatus.VALID ? HealthDetect.INSTANCE.getContext().getString(R.string.blood_pressure_has_correct) : HealthDetect.INSTANCE.getContext().getString(R.string.blood_pressure_not_correct);
    }

    public static final int generateCorrectDay(long j) {
        return ((int) ((System.currentTimeMillis() / 86400000) - (j / 86400000))) + 1;
    }

    @NotNull
    public static final BloodPressureCorrectDayStatus generateCorrectStatus(long j) {
        if (j == 0) {
            return BloodPressureCorrectDayStatus.NOT_CORRECT.INSTANCE;
        }
        int iGenerateCorrectDay = generateCorrectDay(j);
        return iGenerateCorrectDay <= 28 ? new BloodPressureCorrectDayStatus.VALID(iGenerateCorrectDay) : BloodPressureCorrectDayStatus.INVALID.INSTANCE;
    }

    @NotNull
    public static final IntRange getDIASTOLIC_RANGE() {
        return b;
    }

    @NotNull
    public static final IntRange getSYSTOLIC_RANGE() {
        return a;
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }
}
