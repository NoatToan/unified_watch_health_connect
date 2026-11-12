package com.xiaomi.hm.health.device.headset.viewmodel;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "", "", "a", "B", "getValue", "()B", "value", "<init>", "(B)V", "Companion", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "FailedAlgorithm", "OutputValue", "Successful", "UnWear", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$Successful;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$Failed;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$FailedAlgorithm;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$OutputValue;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$UnWear;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class CalibrationResultCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "valueOf", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CalibrationResultCode valueOf(byte value) {
            Successful successful = Successful.INSTANCE;
            if (value == successful.getValue()) {
                return successful;
            }
            Failed failed = Failed.INSTANCE;
            if (value == failed.getValue()) {
                return failed;
            }
            FailedAlgorithm failedAlgorithm = FailedAlgorithm.INSTANCE;
            if (value == failedAlgorithm.getValue()) {
                return failedAlgorithm;
            }
            OutputValue outputValue = OutputValue.INSTANCE;
            return value == outputValue.getValue() ? outputValue : UnWear.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$Failed;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Failed extends CalibrationResultCode {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super((byte) 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$FailedAlgorithm;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class FailedAlgorithm extends CalibrationResultCode {

        @NotNull
        public static final FailedAlgorithm INSTANCE = new FailedAlgorithm();

        private FailedAlgorithm() {
            super((byte) 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$OutputValue;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class OutputValue extends CalibrationResultCode {

        @NotNull
        public static final OutputValue INSTANCE = new OutputValue();

        private OutputValue() {
            super((byte) 16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$Successful;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Successful extends CalibrationResultCode {

        @NotNull
        public static final Successful INSTANCE = new Successful();

        private Successful() {
            super((byte) 0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode$UnWear;", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class UnWear extends CalibrationResultCode {

        @NotNull
        public static final UnWear INSTANCE = new UnWear();

        private UnWear() {
            super((byte) -1, null);
        }
    }

    private CalibrationResultCode(byte b) {
        this.value = b;
    }

    public /* synthetic */ CalibrationResultCode(byte b, DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    @JvmStatic
    @NotNull
    public static final CalibrationResultCode valueOf(byte b) {
        return INSTANCE.valueOf(b);
    }

    public final byte getValue() {
        return this.value;
    }
}
