package com.xiaomi.hm.health.bt.model;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b'\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LB¯\u0001\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bH\u0010IBM\b\u0016\u0012\u0006\u0010J\u001a\u00020\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bH\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\tJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0006J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0006J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0006J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\tJ¸\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010'\u001a\u00020&HÖ\u0001J\u0013\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0006R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\tR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010\u0006R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\tR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010\u0006R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010\tR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010\u0006R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u0010\tR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010\u0006R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u0010\tR\u001b\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010\u0006R\u001b\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u0010\tR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010\u0006R\u001b\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010\t¨\u0006M"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HMTarget;", "", "", "toString", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "stepRemind", "stepTarget", "calorieRemind", "calorieTarget", "distanceRemind", "distanceTarget", "weightRemind", "weightTarget", "sleepRemind", "sleepTarget", "standRemind", "standTarget", "activityRemind", "activityTarget", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/xiaomi/hm/health/bt/model/HMTarget;", "", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getStepRemind", "b", "Ljava/lang/Long;", "getStepTarget", "c", "getCalorieRemind", GoogleApiAvailabilityLight.a, "getCalorieTarget", "e", "getDistanceRemind", "f", "getDistanceTarget", "g", "getWeightRemind", "h", "getWeightTarget", "i", "getSleepRemind", z.j, "getSleepTarget", hl.k, "getStandRemind", "l", "getStandTarget", "m", "getActivityRemind", GoogleApiAvailabilityLight.b, "getActivityTarget", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V", "goalRemind", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMTarget {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String o = "HMTarget";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Boolean stepRemind;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Long stepTarget;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Boolean calorieRemind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Long calorieTarget;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Boolean distanceRemind;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Long distanceTarget;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final Boolean weightRemind;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Long weightTarget;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Boolean sleepRemind;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Long sleepTarget;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final Boolean standRemind;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final Long standTarget;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Boolean activityRemind;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private final Long activityTarget;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HMTarget$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/model/HMTarget;", "fromByteArray", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final HMTarget fromByteArray(@NotNull byte[] byteArray) {
            Boolean bool;
            Long lValueOf;
            int i;
            Boolean boolValueOf;
            Long lValueOf2;
            Boolean bool2;
            Long lValueOf3;
            try {
                byte b = byteArray[0];
                if ((b & 1) != 0) {
                    Boolean boolValueOf2 = Boolean.valueOf(byteArray[4] == 1);
                    i = 9;
                    lValueOf = Long.valueOf(GattUtils.bytesToLong(byteArray, 5, 4));
                    bool = boolValueOf2;
                } else {
                    bool = null;
                    lValueOf = null;
                    i = 4;
                }
                if ((b & 2) != 0) {
                    int i2 = i + 1;
                    boolValueOf = Boolean.valueOf(byteArray[i] == 1);
                    lValueOf2 = Long.valueOf(GattUtils.bytesToLong(byteArray, i2, 4));
                    i = i2 + 4;
                } else {
                    boolValueOf = null;
                    lValueOf2 = null;
                }
                if ((b & 4) != 0) {
                    int i3 = i + 1;
                    Boolean boolValueOf3 = Boolean.valueOf(byteArray[i] == 1);
                    lValueOf3 = Long.valueOf(GattUtils.bytesToLong(byteArray, i3, 4));
                    bool2 = boolValueOf3;
                } else {
                    bool2 = null;
                    lValueOf3 = null;
                }
                return new HMTarget(bool, lValueOf, boolValueOf, lValueOf2, bool2, lValueOf3, null, null, null, null, null, null, null, null, 16320, null);
            } catch (Exception e) {
                Debug.fi(HMTarget.o, Intrinsics.stringPlus("fromByteArray, e: ", e));
                return null;
            }
        }
    }

    public HMTarget() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public HMTarget(@Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable Long l2, @Nullable Boolean bool3, @Nullable Long l3, @Nullable Boolean bool4, @Nullable Long l4, @Nullable Boolean bool5, @Nullable Long l5, @Nullable Boolean bool6, @Nullable Long l6, @Nullable Boolean bool7, @Nullable Long l7) {
        this.stepRemind = bool;
        this.stepTarget = l;
        this.calorieRemind = bool2;
        this.calorieTarget = l2;
        this.distanceRemind = bool3;
        this.distanceTarget = l3;
        this.weightRemind = bool4;
        this.weightTarget = l4;
        this.sleepRemind = bool5;
        this.sleepTarget = l5;
        this.standRemind = bool6;
        this.standTarget = l6;
        this.activityRemind = bool7;
        this.activityTarget = l7;
    }

    @JvmStatic
    @Nullable
    public static final HMTarget fromByteArray(@NotNull byte[] bArr) {
        return INSTANCE.fromByteArray(bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getStepRemind() {
        return this.stepRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getSleepTarget() {
        return this.sleepTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getStandRemind() {
        return this.standRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getStandTarget() {
        return this.standTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getActivityRemind() {
        return this.activityRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getActivityTarget() {
        return this.activityTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStepTarget() {
        return this.stepTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getCalorieRemind() {
        return this.calorieRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCalorieTarget() {
        return this.calorieTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getDistanceRemind() {
        return this.distanceRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDistanceTarget() {
        return this.distanceTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getWeightRemind() {
        return this.weightRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getWeightTarget() {
        return this.weightTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getSleepRemind() {
        return this.sleepRemind;
    }

    @NotNull
    public final HMTarget copy(@Nullable Boolean stepRemind, @Nullable Long stepTarget, @Nullable Boolean calorieRemind, @Nullable Long calorieTarget, @Nullable Boolean distanceRemind, @Nullable Long distanceTarget, @Nullable Boolean weightRemind, @Nullable Long weightTarget, @Nullable Boolean sleepRemind, @Nullable Long sleepTarget, @Nullable Boolean standRemind, @Nullable Long standTarget, @Nullable Boolean activityRemind, @Nullable Long activityTarget) {
        return new HMTarget(stepRemind, stepTarget, calorieRemind, calorieTarget, distanceRemind, distanceTarget, weightRemind, weightTarget, sleepRemind, sleepTarget, standRemind, standTarget, activityRemind, activityTarget);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMTarget)) {
            return false;
        }
        HMTarget hMTarget = (HMTarget) other;
        return Intrinsics.areEqual(this.stepRemind, hMTarget.stepRemind) && Intrinsics.areEqual(this.stepTarget, hMTarget.stepTarget) && Intrinsics.areEqual(this.calorieRemind, hMTarget.calorieRemind) && Intrinsics.areEqual(this.calorieTarget, hMTarget.calorieTarget) && Intrinsics.areEqual(this.distanceRemind, hMTarget.distanceRemind) && Intrinsics.areEqual(this.distanceTarget, hMTarget.distanceTarget) && Intrinsics.areEqual(this.weightRemind, hMTarget.weightRemind) && Intrinsics.areEqual(this.weightTarget, hMTarget.weightTarget) && Intrinsics.areEqual(this.sleepRemind, hMTarget.sleepRemind) && Intrinsics.areEqual(this.sleepTarget, hMTarget.sleepTarget) && Intrinsics.areEqual(this.standRemind, hMTarget.standRemind) && Intrinsics.areEqual(this.standTarget, hMTarget.standTarget) && Intrinsics.areEqual(this.activityRemind, hMTarget.activityRemind) && Intrinsics.areEqual(this.activityTarget, hMTarget.activityTarget);
    }

    @Nullable
    public final Boolean getActivityRemind() {
        return this.activityRemind;
    }

    @Nullable
    public final Long getActivityTarget() {
        return this.activityTarget;
    }

    @Nullable
    public final Boolean getCalorieRemind() {
        return this.calorieRemind;
    }

    @Nullable
    public final Long getCalorieTarget() {
        return this.calorieTarget;
    }

    @Nullable
    public final Boolean getDistanceRemind() {
        return this.distanceRemind;
    }

    @Nullable
    public final Long getDistanceTarget() {
        return this.distanceTarget;
    }

    @Nullable
    public final Boolean getSleepRemind() {
        return this.sleepRemind;
    }

    @Nullable
    public final Long getSleepTarget() {
        return this.sleepTarget;
    }

    @Nullable
    public final Boolean getStandRemind() {
        return this.standRemind;
    }

    @Nullable
    public final Long getStandTarget() {
        return this.standTarget;
    }

    @Nullable
    public final Boolean getStepRemind() {
        return this.stepRemind;
    }

    @Nullable
    public final Long getStepTarget() {
        return this.stepTarget;
    }

    @Nullable
    public final Boolean getWeightRemind() {
        return this.weightRemind;
    }

    @Nullable
    public final Long getWeightTarget() {
        return this.weightTarget;
    }

    public int hashCode() {
        Boolean bool = this.stepRemind;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.stepTarget;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.calorieRemind;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.calorieTarget;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool3 = this.distanceRemind;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l3 = this.distanceTarget;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool4 = this.weightRemind;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l4 = this.weightTarget;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool5 = this.sleepRemind;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l5 = this.sleepTarget;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool6 = this.standRemind;
        int iHashCode11 = (iHashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l6 = this.standTarget;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool7 = this.activityRemind;
        int iHashCode13 = (iHashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Long l7 = this.activityTarget;
        return iHashCode13 + (l7 != null ? l7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HMTarget: stepRemind: " + this.stepRemind + ", stepTarget: " + this.stepTarget + ", calorieRemind: " + this.calorieRemind + ", calorieTarget: " + this.calorieTarget + ", distanceRemind: " + this.distanceRemind + ", distanceTarget: " + this.distanceTarget + "weightRemind: " + this.weightRemind + ", weightTarget: " + this.weightTarget + "sleepRemind: " + this.sleepRemind + ", sleepTarget: " + this.sleepTarget;
    }

    public /* synthetic */ HMTarget(Boolean bool, Long l, Boolean bool2, Long l2, Boolean bool3, Long l3, Boolean bool4, Long l4, Boolean bool5, Long l5, Boolean bool6, Long l6, Boolean bool7, Long l7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : l4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : l5, (i & 1024) != 0 ? null : bool6, (i & 2048) != 0 ? null : l6, (i & 4096) != 0 ? null : bool7, (i & 8192) == 0 ? l7 : null);
    }

    public HMTarget(boolean z, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6) {
        this(Boolean.valueOf(z), l, Boolean.valueOf(z), l2, null, null, Boolean.valueOf(z), l3, Boolean.valueOf(z), l4, Boolean.valueOf(z), l5, Boolean.valueOf(z), l6, 48, null);
    }
}
