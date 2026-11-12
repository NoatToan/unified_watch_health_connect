package com.xiaomi.hm.health.bt.profile.sport.coaching;

import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u0001:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0019\b\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "", "", "isCrossfitType", "", "toString", "a", "Ljava/lang/String;", "getName$bluetooth_release", "()Ljava/lang/String;", "name", "", "b", LogUtil.I, "getType", "()I", "type", "<init>", "(Ljava/lang/String;I)V", "Companion", "CrossFitAddScoreOff", "CrossFitAddScoreOn", "Custom", "HR", DatabaseHelper.codePair_Interval, "Unknown", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Interval;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$HR;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Custom;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$CrossFitAddScoreOff;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$CrossFitAddScoreOn;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Unknown;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class CoachingWorkoutType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CoachingWorkoutType valueOf(int type) {
            Interval interval = Interval.INSTANCE;
            if (type == interval.getType()) {
                return interval;
            }
            HR hr = HR.INSTANCE;
            if (type == hr.getType()) {
                return hr;
            }
            Custom custom = Custom.INSTANCE;
            if (type == custom.getType()) {
                return custom;
            }
            CrossFitAddScoreOff crossFitAddScoreOff = CrossFitAddScoreOff.INSTANCE;
            if (type == crossFitAddScoreOff.getType()) {
                return crossFitAddScoreOff;
            }
            CrossFitAddScoreOn crossFitAddScoreOn = CrossFitAddScoreOn.INSTANCE;
            return type == crossFitAddScoreOn.getType() ? crossFitAddScoreOn : Unknown.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$CrossFitAddScoreOff;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CrossFitAddScoreOff extends CoachingWorkoutType {

        @NotNull
        public static final CrossFitAddScoreOff INSTANCE = new CrossFitAddScoreOff();

        private CrossFitAddScoreOff() {
            super("CrossFitAddScoreOff", 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$CrossFitAddScoreOn;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CrossFitAddScoreOn extends CoachingWorkoutType {

        @NotNull
        public static final CrossFitAddScoreOn INSTANCE = new CrossFitAddScoreOn();

        private CrossFitAddScoreOn() {
            super("CrossFitAddScoreOn", 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Custom;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Custom extends CoachingWorkoutType {

        @NotNull
        public static final Custom INSTANCE = new Custom();

        private Custom() {
            super("Custom", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$HR;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HR extends CoachingWorkoutType {

        @NotNull
        public static final HR INSTANCE = new HR();

        private HR() {
            super("HR", 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Interval;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Interval extends CoachingWorkoutType {

        @NotNull
        public static final Interval INSTANCE = new Interval();

        private Interval() {
            super(DatabaseHelper.codePair_Interval, 0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Unknown extends CoachingWorkoutType {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("Unknown", -1, null);
        }
    }

    private CoachingWorkoutType(String str, int i) {
        this.name = str;
        this.type = i;
    }

    public /* synthetic */ CoachingWorkoutType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @JvmStatic
    @NotNull
    public static final CoachingWorkoutType valueOf(int i) {
        return INSTANCE.valueOf(i);
    }

    @NotNull
    /* JADX INFO: renamed from: getName$bluetooth_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isCrossfitType() {
        if (Intrinsics.areEqual(this, CrossFitAddScoreOff.INSTANCE)) {
            return true;
        }
        return Intrinsics.areEqual(this, CrossFitAddScoreOn.INSTANCE);
    }

    @NotNull
    public String toString() {
        return "CoachingWorkoutType(name='" + this.name + "', type='" + this.type + "')";
    }
}
