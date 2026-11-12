package com.huami.device.core.sync.api.type;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/device/core/sync/api/type/JobType;", "", "other", "", "equals", "", "hashCode", "", "toString", "value", LogUtil.I, "getValue", "()I", "<init>", "(I)V", "Companion", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class JobType {

    @NotNull
    private static final JobType AF;

    @NotNull
    private static final JobType Activities;

    @NotNull
    private static final JobType BODY_TEMPERATURE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final JobType DEVICE_STATISTIC;

    @NotNull
    private static final JobType ECG;

    @NotNull
    private static final JobType FEMALE_HEALTH;

    @NotNull
    private static final JobType FIRST_BEAT;

    @NotNull
    private static final JobType HEADSET_HEARING_INFO;

    @NotNull
    private static final JobType HR;

    @NotNull
    private static final JobType PAI;

    @NotNull
    private static final JobType PPG;

    @NotNull
    private static final JobType PRESSURE;

    @NotNull
    private static final JobType SPO2;

    @NotNull
    private static final JobType SportRecords;

    @NotNull
    private static final JobType WEIGHT_FAT;

    @NotNull
    private static final JobType ZeppCoach;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u001a\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u001c\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\tR\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u0019\u0010 \u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\tR\u0019\u0010\"\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR\u0019\u0010$\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\tR\u0019\u0010&\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\t¨\u0006*"}, d2 = {"Lcom/huami/device/core/sync/api/type/JobType$Companion;", "", "", "value", "Lcom/huami/device/core/sync/api/type/JobType;", "create", "Activities", "Lcom/huami/device/core/sync/api/type/JobType;", "getActivities", "()Lcom/huami/device/core/sync/api/type/JobType;", "SportRecords", "getSportRecords", "HR", "getHR", "FIRST_BEAT", "getFIRST_BEAT", "PAI", "getPAI", SensorRecordsEnity.SensorType.SENSOR_ECG, "getECG", SensorRecordsEnity.SensorType.SENSOR_PPG, "getPPG", "PRESSURE", "getPRESSURE", "SPO2", "getSPO2", "AF", "getAF", "WEIGHT_FAT", "getWEIGHT_FAT", "FEMALE_HEALTH", "getFEMALE_HEALTH", "BODY_TEMPERATURE", "getBODY_TEMPERATURE", "DEVICE_STATISTIC", "getDEVICE_STATISTIC", "HEADSET_HEARING_INFO", "getHEADSET_HEARING_INFO", "ZeppCoach", "getZeppCoach", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JobType create(int value) {
            return new JobType(value);
        }

        @NotNull
        public final JobType getAF() {
            return JobType.AF;
        }

        @NotNull
        public final JobType getActivities() {
            return JobType.Activities;
        }

        @NotNull
        public final JobType getBODY_TEMPERATURE() {
            return JobType.BODY_TEMPERATURE;
        }

        @NotNull
        public final JobType getDEVICE_STATISTIC() {
            return JobType.DEVICE_STATISTIC;
        }

        @NotNull
        public final JobType getECG() {
            return JobType.ECG;
        }

        @NotNull
        public final JobType getFEMALE_HEALTH() {
            return JobType.FEMALE_HEALTH;
        }

        @NotNull
        public final JobType getFIRST_BEAT() {
            return JobType.FIRST_BEAT;
        }

        @NotNull
        public final JobType getHEADSET_HEARING_INFO() {
            return JobType.HEADSET_HEARING_INFO;
        }

        @NotNull
        public final JobType getHR() {
            return JobType.HR;
        }

        @NotNull
        public final JobType getPAI() {
            return JobType.PAI;
        }

        @NotNull
        public final JobType getPPG() {
            return JobType.PPG;
        }

        @NotNull
        public final JobType getPRESSURE() {
            return JobType.PRESSURE;
        }

        @NotNull
        public final JobType getSPO2() {
            return JobType.SPO2;
        }

        @NotNull
        public final JobType getSportRecords() {
            return JobType.SportRecords;
        }

        @NotNull
        public final JobType getWEIGHT_FAT() {
            return JobType.WEIGHT_FAT;
        }

        @NotNull
        public final JobType getZeppCoach() {
            return JobType.ZeppCoach;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        Activities = companion.create(1);
        SportRecords = companion.create(2);
        HR = companion.create(3);
        FIRST_BEAT = companion.create(4);
        PAI = companion.create(5);
        ECG = companion.create(6);
        PPG = companion.create(7);
        PRESSURE = companion.create(8);
        SPO2 = companion.create(9);
        AF = companion.create(10);
        WEIGHT_FAT = companion.create(11);
        FEMALE_HEALTH = companion.create(12);
        BODY_TEMPERATURE = companion.create(13);
        DEVICE_STATISTIC = companion.create(14);
        HEADSET_HEARING_INFO = companion.create(15);
        ZeppCoach = companion.create(16);
    }

    public JobType(int i) {
        this.value = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(JobType.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.device.core.sync.api.type.JobType");
        return this.value == ((JobType) other).value;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "JobType(value=" + this.value + ')';
    }
}
