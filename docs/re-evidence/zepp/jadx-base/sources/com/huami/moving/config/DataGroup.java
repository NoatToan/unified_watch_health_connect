package com.huami.moving.config;

import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.stress.StressScopeNames;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0016\u000e\u000f\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0015#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lcom/huami/moving/config/DataGroup;", "", "", "a", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "b", "getId", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", SportAnalytics.ParamValue.DataName.ALTITUDE, "Brandish", "Consume", "Counter", SportAnalytics.ParamValue.DataName.DISTANCE, "Duration", "ExternalDevice", "Floor", "Freq", "Glide", "GolfSwing", "Hr", StatEvent.OTHER, "Pace", "Rowing", "Slope", "Speed", "Step", StressScopeNames.STRESS, "Swim", "Temperature", "Lcom/huami/moving/config/DataGroup$Distance;", "Lcom/huami/moving/config/DataGroup$Counter;", "Lcom/huami/moving/config/DataGroup$Glide;", "Lcom/huami/moving/config/DataGroup$Duration;", "Lcom/huami/moving/config/DataGroup$Floor;", "Lcom/huami/moving/config/DataGroup$Swim;", "Lcom/huami/moving/config/DataGroup$Pace;", "Lcom/huami/moving/config/DataGroup$Speed;", "Lcom/huami/moving/config/DataGroup$Step;", "Lcom/huami/moving/config/DataGroup$Altitude;", "Lcom/huami/moving/config/DataGroup$Slope;", "Lcom/huami/moving/config/DataGroup$Brandish;", "Lcom/huami/moving/config/DataGroup$Consume;", "Lcom/huami/moving/config/DataGroup$Rowing;", "Lcom/huami/moving/config/DataGroup$Freq;", "Lcom/huami/moving/config/DataGroup$Hr;", "Lcom/huami/moving/config/DataGroup$Temperature;", "Lcom/huami/moving/config/DataGroup$Stress;", "Lcom/huami/moving/config/DataGroup$GolfSwing;", "Lcom/huami/moving/config/DataGroup$Other;", "Lcom/huami/moving/config/DataGroup$ExternalDevice;", "moving_release"}, k = 1, mv = {1, 5, 1})
public abstract class DataGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String id;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Altitude;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Altitude extends DataGroup {

        @NotNull
        public static final Altitude INSTANCE = new Altitude();

        private Altitude() {
            super("海拔类", "altitude_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Brandish;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Brandish extends DataGroup {

        @NotNull
        public static final Brandish INSTANCE = new Brandish();

        private Brandish() {
            super("挥拍类", "brandish_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/moving/config/DataGroup$Companion;", "", "", "id", "Lcom/huami/moving/config/DataGroup;", "getGroupById", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final DataGroup getGroupById(@NotNull String id) {
            Object next;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new DataGroup[]{Distance.INSTANCE, Counter.INSTANCE, Glide.INSTANCE, Duration.INSTANCE, Floor.INSTANCE, Swim.INSTANCE, Pace.INSTANCE, Speed.INSTANCE, Step.INSTANCE, Altitude.INSTANCE, Slope.INSTANCE, Brandish.INSTANCE, Consume.INSTANCE, Rowing.INSTANCE, Freq.INSTANCE, Hr.INSTANCE, Temperature.INSTANCE, Stress.INSTANCE, GolfSwing.INSTANCE, Other.INSTANCE, ExternalDevice.INSTANCE}).iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.areEqual(((DataGroup) next).getId(), id)) {
                    return (DataGroup) next;
                }
            }
            next = null;
            return (DataGroup) next;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Consume;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Consume extends DataGroup {

        @NotNull
        public static final Consume INSTANCE = new Consume();

        private Consume() {
            super("消耗类", "consume_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Counter;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Counter extends DataGroup {

        @NotNull
        public static final Counter INSTANCE = new Counter();

        private Counter() {
            super("计数类", "counter_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Distance;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Distance extends DataGroup {

        @NotNull
        public static final Distance INSTANCE = new Distance();

        private Distance() {
            super("距离类", "distance_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Duration;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Duration extends DataGroup {

        @NotNull
        public static final Duration INSTANCE = new Duration();

        private Duration() {
            super("用时类", "duration_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$ExternalDevice;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ExternalDevice extends DataGroup {

        @NotNull
        public static final ExternalDevice INSTANCE = new ExternalDevice();

        private ExternalDevice() {
            super("外部设备类", "device_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Floor;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Floor extends DataGroup {

        @NotNull
        public static final Floor INSTANCE = new Floor();

        private Floor() {
            super("爬楼类", "floor_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Freq;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Freq extends DataGroup {

        @NotNull
        public static final Freq INSTANCE = new Freq();

        private Freq() {
            super("频率类", "freq_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Glide;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Glide extends DataGroup {

        @NotNull
        public static final Glide INSTANCE = new Glide();

        private Glide() {
            super("滑降类", "glide_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$GolfSwing;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfSwing extends DataGroup {

        @NotNull
        public static final GolfSwing INSTANCE = new GolfSwing();

        private GolfSwing() {
            super("高尔夫类", "golf_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Hr;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hr extends DataGroup {

        @NotNull
        public static final Hr INSTANCE = new Hr();

        private Hr() {
            super("心率类", "hr_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Other;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Other extends DataGroup {

        @NotNull
        public static final Other INSTANCE = new Other();

        private Other() {
            super("其他类", "other_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Pace;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Pace extends DataGroup {

        @NotNull
        public static final Pace INSTANCE = new Pace();

        private Pace() {
            super("配速类", "pace_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Rowing;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rowing extends DataGroup {

        @NotNull
        public static final Rowing INSTANCE = new Rowing();

        private Rowing() {
            super("划船类", "rowing_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Slope;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Slope extends DataGroup {

        @NotNull
        public static final Slope INSTANCE = new Slope();

        private Slope() {
            super("坡度类", "slope_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Speed;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Speed extends DataGroup {

        @NotNull
        public static final Speed INSTANCE = new Speed();

        private Speed() {
            super("速度类", "speed_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Step;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Step extends DataGroup {

        @NotNull
        public static final Step INSTANCE = new Step();

        private Step() {
            super("步伐类", "step_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Stress;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Stress extends DataGroup {

        @NotNull
        public static final Stress INSTANCE = new Stress();

        private Stress() {
            super("压力类", "stress_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Swim;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Swim extends DataGroup {

        @NotNull
        public static final Swim INSTANCE = new Swim();

        private Swim() {
            super("游泳类", "swim_group", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataGroup$Temperature;", "Lcom/huami/moving/config/DataGroup;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Temperature extends DataGroup {

        @NotNull
        public static final Temperature INSTANCE = new Temperature();

        private Temperature() {
            super("温度类", "temp_group", null);
        }
    }

    private DataGroup(String str, String str2) {
        this.desc = str;
        this.id = str2;
    }

    public /* synthetic */ DataGroup(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @JvmStatic
    @Nullable
    public static final DataGroup getGroupById(@NotNull String str) {
        return INSTANCE.getGroupById(str);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
