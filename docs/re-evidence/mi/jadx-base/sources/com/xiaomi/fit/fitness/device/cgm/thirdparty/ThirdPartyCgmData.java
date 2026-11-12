package com.xiaomi.fit.fitness.device.cgm.thirdparty;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJP\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmData;", "", "glucoseList", "", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseItem;", "target", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseTarget;", "targetRate", "", "highestGlucose", "", "lowesGlucose", "<init>", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseTarget;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)V", "getGlucoseList", "()Ljava/util/List;", "setGlucoseList", "(Ljava/util/List;)V", "getTarget", "()Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseTarget;", "setTarget", "(Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseTarget;)V", "getTargetRate", "()Ljava/lang/Integer;", "setTargetRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHighestGlucose", "()Ljava/lang/Float;", "setHighestGlucose", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getLowesGlucose", "setLowesGlucose", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseTarget;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmData;", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyCgmData {

    @SerializedName("glucose_list")
    @Nullable
    private List<ThirdPartyGlucoseItem> glucoseList;

    @SerializedName("highest_glucose")
    @Nullable
    private Float highestGlucose;

    @SerializedName("lowest_glucose")
    @Nullable
    private Float lowesGlucose;

    @SerializedName("glucose_target")
    @Nullable
    private ThirdPartyGlucoseTarget target;

    @SerializedName("glucose_target_rate")
    @Nullable
    private Integer targetRate;

    public ThirdPartyCgmData() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirdPartyCgmData copy$default(ThirdPartyCgmData thirdPartyCgmData, List list, ThirdPartyGlucoseTarget thirdPartyGlucoseTarget, Integer num, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = thirdPartyCgmData.glucoseList;
        }
        if ((i & 2) != 0) {
            thirdPartyGlucoseTarget = thirdPartyCgmData.target;
        }
        ThirdPartyGlucoseTarget thirdPartyGlucoseTarget2 = thirdPartyGlucoseTarget;
        if ((i & 4) != 0) {
            num = thirdPartyCgmData.targetRate;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            f = thirdPartyCgmData.highestGlucose;
        }
        Float f3 = f;
        if ((i & 16) != 0) {
            f2 = thirdPartyCgmData.lowesGlucose;
        }
        return thirdPartyCgmData.copy(list, thirdPartyGlucoseTarget2, num2, f3, f2);
    }

    @Nullable
    public final List<ThirdPartyGlucoseItem> component1() {
        return this.glucoseList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ThirdPartyGlucoseTarget getTarget() {
        return this.target;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTargetRate() {
        return this.targetRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getHighestGlucose() {
        return this.highestGlucose;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getLowesGlucose() {
        return this.lowesGlucose;
    }

    @NotNull
    public final ThirdPartyCgmData copy(@Nullable List<ThirdPartyGlucoseItem> glucoseList, @Nullable ThirdPartyGlucoseTarget target, @Nullable Integer targetRate, @Nullable Float highestGlucose, @Nullable Float lowesGlucose) {
        return new ThirdPartyCgmData(glucoseList, target, targetRate, highestGlucose, lowesGlucose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyCgmData)) {
            return false;
        }
        ThirdPartyCgmData thirdPartyCgmData = (ThirdPartyCgmData) other;
        return Intrinsics.areEqual(this.glucoseList, thirdPartyCgmData.glucoseList) && Intrinsics.areEqual(this.target, thirdPartyCgmData.target) && Intrinsics.areEqual(this.targetRate, thirdPartyCgmData.targetRate) && Intrinsics.areEqual((Object) this.highestGlucose, (Object) thirdPartyCgmData.highestGlucose) && Intrinsics.areEqual((Object) this.lowesGlucose, (Object) thirdPartyCgmData.lowesGlucose);
    }

    @Nullable
    public final List<ThirdPartyGlucoseItem> getGlucoseList() {
        return this.glucoseList;
    }

    @Nullable
    public final Float getHighestGlucose() {
        return this.highestGlucose;
    }

    @Nullable
    public final Float getLowesGlucose() {
        return this.lowesGlucose;
    }

    @Nullable
    public final ThirdPartyGlucoseTarget getTarget() {
        return this.target;
    }

    @Nullable
    public final Integer getTargetRate() {
        return this.targetRate;
    }

    public int hashCode() {
        List<ThirdPartyGlucoseItem> list = this.glucoseList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ThirdPartyGlucoseTarget thirdPartyGlucoseTarget = this.target;
        int iHashCode2 = (iHashCode + (thirdPartyGlucoseTarget == null ? 0 : thirdPartyGlucoseTarget.hashCode())) * 31;
        Integer num = this.targetRate;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.highestGlucose;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.lowesGlucose;
        return iHashCode4 + (f2 != null ? f2.hashCode() : 0);
    }

    public final void setGlucoseList(@Nullable List<ThirdPartyGlucoseItem> list) {
        this.glucoseList = list;
    }

    public final void setHighestGlucose(@Nullable Float f) {
        this.highestGlucose = f;
    }

    public final void setLowesGlucose(@Nullable Float f) {
        this.lowesGlucose = f;
    }

    public final void setTarget(@Nullable ThirdPartyGlucoseTarget thirdPartyGlucoseTarget) {
        this.target = thirdPartyGlucoseTarget;
    }

    public final void setTargetRate(@Nullable Integer num) {
        this.targetRate = num;
    }

    @NotNull
    public String toString() {
        return "ThirdPartyCgmData(glucoseList=" + this.glucoseList + ", target=" + this.target + ", targetRate=" + this.targetRate + ", highestGlucose=" + this.highestGlucose + ", lowesGlucose=" + this.lowesGlucose + ")";
    }

    public ThirdPartyCgmData(@Nullable List<ThirdPartyGlucoseItem> list, @Nullable ThirdPartyGlucoseTarget thirdPartyGlucoseTarget, @Nullable Integer num, @Nullable Float f, @Nullable Float f2) {
        this.glucoseList = list;
        this.target = thirdPartyGlucoseTarget;
        this.targetRate = num;
        this.highestGlucose = f;
        this.lowesGlucose = f2;
    }

    public /* synthetic */ ThirdPartyCgmData(List list, ThirdPartyGlucoseTarget thirdPartyGlucoseTarget, Integer num, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : thirdPartyGlucoseTarget, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : f2);
    }
}
