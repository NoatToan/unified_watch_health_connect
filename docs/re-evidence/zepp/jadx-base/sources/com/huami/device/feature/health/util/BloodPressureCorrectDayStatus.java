package com.huami.device.feature.health.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus;", "", "<init>", "()V", "INVALID", "NOT_CORRECT", "VALID", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus$NOT_CORRECT;", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus$VALID;", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus$INVALID;", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureCorrectDayStatus {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus$INVALID;", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class INVALID extends BloodPressureCorrectDayStatus {

        @NotNull
        public static final INVALID INSTANCE = new INVALID();

        private INVALID() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus$NOT_CORRECT;", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class NOT_CORRECT extends BloodPressureCorrectDayStatus {

        @NotNull
        public static final NOT_CORRECT INSTANCE = new NOT_CORRECT();

        private NOT_CORRECT() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus$VALID;", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus;", "", "a", LogUtil.I, "getDay", "()I", "day", "<init>", "(I)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class VALID extends BloodPressureCorrectDayStatus {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int day;

        public VALID(int i) {
            super(null);
            this.day = i;
        }

        public final int getDay() {
            return this.day;
        }
    }

    private BloodPressureCorrectDayStatus() {
    }

    public /* synthetic */ BloodPressureCorrectDayStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
