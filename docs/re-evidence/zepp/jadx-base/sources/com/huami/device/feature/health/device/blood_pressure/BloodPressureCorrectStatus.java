package com.huami.device.feature.health.device.blood_pressure;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "", "", "a", LogUtil.I, "getStatus", "()I", "status", "<init>", "(I)V", "CORRECTING", "FINISH", "IDEL", "PREPARE", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$IDEL;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$PREPARE;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$CORRECTING;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$FINISH;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureCorrectStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$CORRECTING;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class CORRECTING extends BloodPressureCorrectStatus {

        @NotNull
        public static final CORRECTING INSTANCE = new CORRECTING();

        private CORRECTING() {
            super(2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$FINISH;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class FINISH extends BloodPressureCorrectStatus {

        @NotNull
        public static final FINISH INSTANCE = new FINISH();

        private FINISH() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$IDEL;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class IDEL extends BloodPressureCorrectStatus {

        @NotNull
        public static final IDEL INSTANCE = new IDEL();

        private IDEL() {
            super(0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus$PREPARE;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class PREPARE extends BloodPressureCorrectStatus {

        @NotNull
        public static final PREPARE INSTANCE = new PREPARE();

        private PREPARE() {
            super(1, null);
        }
    }

    private BloodPressureCorrectStatus(int i) {
        this.status = i;
    }

    public /* synthetic */ BloodPressureCorrectStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getStatus() {
        return this.status;
    }
}
