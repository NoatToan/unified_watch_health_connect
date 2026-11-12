package com.huami.device.feature.health.ui.bloodpressure.model;

import com.alipay.sdk.m.f0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "", "<init>", "()V", "DISCONNECT", "FAIL", "MEASURE", "REMEASURE", "REST", c.p, "VALUE_INVALID", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$REST;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$MEASURE;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$REMEASURE;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$FAIL;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$SUCCESS;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$DISCONNECT;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$VALUE_INVALID;", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureMeasureStatus {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$DISCONNECT;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class DISCONNECT extends BloodPressureMeasureStatus {

        @NotNull
        public static final DISCONNECT INSTANCE = new DISCONNECT();

        private DISCONNECT() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$FAIL;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class FAIL extends BloodPressureMeasureStatus {

        @NotNull
        public static final FAIL INSTANCE = new FAIL();

        private FAIL() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$MEASURE;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class MEASURE extends BloodPressureMeasureStatus {

        @NotNull
        public static final MEASURE INSTANCE = new MEASURE();

        private MEASURE() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$REMEASURE;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class REMEASURE extends BloodPressureMeasureStatus {

        @NotNull
        public static final REMEASURE INSTANCE = new REMEASURE();

        private REMEASURE() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$REST;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class REST extends BloodPressureMeasureStatus {

        @NotNull
        public static final REST INSTANCE = new REST();

        private REST() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$SUCCESS;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class SUCCESS extends BloodPressureMeasureStatus {

        @NotNull
        public static final SUCCESS INSTANCE = new SUCCESS();

        private SUCCESS() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus$VALUE_INVALID;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class VALUE_INVALID extends BloodPressureMeasureStatus {

        @NotNull
        public static final VALUE_INVALID INSTANCE = new VALUE_INVALID();

        private VALUE_INVALID() {
            super(null);
        }
    }

    private BloodPressureMeasureStatus() {
    }

    public /* synthetic */ BloodPressureMeasureStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
