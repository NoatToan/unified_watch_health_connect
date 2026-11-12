package com.xiaomi.fitness.trail.data;

import com.xiaomi.fitness.sync.model.ICalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType;", "", "<init>", "()V", "CALORIE", ICalendar.Property.DURATION, "TIMES", "Step", "SpeedSecKM", "SpeedSecHM", "SpeedKMHour", "Count", "Lcom/xiaomi/fitness/trail/data/ValueType$CALORIE;", "Lcom/xiaomi/fitness/trail/data/ValueType$Count;", "Lcom/xiaomi/fitness/trail/data/ValueType$DURATION;", "Lcom/xiaomi/fitness/trail/data/ValueType$SpeedKMHour;", "Lcom/xiaomi/fitness/trail/data/ValueType$SpeedSecHM;", "Lcom/xiaomi/fitness/trail/data/ValueType$SpeedSecKM;", "Lcom/xiaomi/fitness/trail/data/ValueType$Step;", "Lcom/xiaomi/fitness/trail/data/ValueType$TIMES;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ValueType {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$CALORIE;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CALORIE extends ValueType {

        @NotNull
        public static final CALORIE INSTANCE = new CALORIE();

        private CALORIE() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$Count;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Count extends ValueType {

        @NotNull
        public static final Count INSTANCE = new Count();

        private Count() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$DURATION;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DURATION extends ValueType {

        @NotNull
        public static final DURATION INSTANCE = new DURATION();

        private DURATION() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$SpeedKMHour;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpeedKMHour extends ValueType {

        @NotNull
        public static final SpeedKMHour INSTANCE = new SpeedKMHour();

        private SpeedKMHour() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$SpeedSecHM;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpeedSecHM extends ValueType {

        @NotNull
        public static final SpeedSecHM INSTANCE = new SpeedSecHM();

        private SpeedSecHM() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$SpeedSecKM;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpeedSecKM extends ValueType {

        @NotNull
        public static final SpeedSecKM INSTANCE = new SpeedSecKM();

        private SpeedSecKM() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$Step;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Step extends ValueType {

        @NotNull
        public static final Step INSTANCE = new Step();

        private Step() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ValueType$TIMES;", "Lcom/xiaomi/fitness/trail/data/ValueType;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TIMES extends ValueType {

        @NotNull
        public static final TIMES INSTANCE = new TIMES();

        private TIMES() {
            super(null);
        }
    }

    private ValueType() {
    }

    public /* synthetic */ ValueType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
