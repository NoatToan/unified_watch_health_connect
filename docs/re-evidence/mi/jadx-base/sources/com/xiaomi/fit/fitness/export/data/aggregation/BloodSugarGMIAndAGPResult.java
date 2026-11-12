package com.xiaomi.fit.fitness.export.data.aggregation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "", "startTime", "", "endTime", "gmi", "", "agpResult", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "<init>", "(JJLjava/lang/Float;Ljava/util/Map;)V", "getStartTime", "()J", "getEndTime", "getGmi", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAgpResult", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(JJLjava/lang/Float;Ljava/util/Map;)Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodSugarGMIAndAGPResult {

    @Nullable
    private final Map<Integer, AGPItem> agpResult;
    private final long endTime;

    @Nullable
    private final Float gmi;
    private final long startTime;

    public BloodSugarGMIAndAGPResult(long j, long j2, @Nullable Float f, @Nullable Map<Integer, AGPItem> map) {
        this.startTime = j;
        this.endTime = j2;
        this.gmi = f;
        this.agpResult = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloodSugarGMIAndAGPResult copy$default(BloodSugarGMIAndAGPResult bloodSugarGMIAndAGPResult, long j, long j2, Float f, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bloodSugarGMIAndAGPResult.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = bloodSugarGMIAndAGPResult.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = bloodSugarGMIAndAGPResult.gmi;
        }
        Float f2 = f;
        if ((i & 8) != 0) {
            map = bloodSugarGMIAndAGPResult.agpResult;
        }
        return bloodSugarGMIAndAGPResult.copy(j3, j4, f2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getGmi() {
        return this.gmi;
    }

    @Nullable
    public final Map<Integer, AGPItem> component4() {
        return this.agpResult;
    }

    @NotNull
    public final BloodSugarGMIAndAGPResult copy(long startTime, long endTime, @Nullable Float gmi, @Nullable Map<Integer, AGPItem> agpResult) {
        return new BloodSugarGMIAndAGPResult(startTime, endTime, gmi, agpResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodSugarGMIAndAGPResult)) {
            return false;
        }
        BloodSugarGMIAndAGPResult bloodSugarGMIAndAGPResult = (BloodSugarGMIAndAGPResult) other;
        return this.startTime == bloodSugarGMIAndAGPResult.startTime && this.endTime == bloodSugarGMIAndAGPResult.endTime && Intrinsics.areEqual((Object) this.gmi, (Object) bloodSugarGMIAndAGPResult.gmi) && Intrinsics.areEqual(this.agpResult, bloodSugarGMIAndAGPResult.agpResult);
    }

    @Nullable
    public final Map<Integer, AGPItem> getAgpResult() {
        return this.agpResult;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Float getGmi() {
        return this.gmi;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31;
        Float f = this.gmi;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Map<Integer, AGPItem> map = this.agpResult;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BloodSugarGMIAndAGPResult(startTime=" + this.startTime + ", endTime=" + this.endTime + ", gmi=" + this.gmi + ", agpResult=" + this.agpResult + ")";
    }

    public /* synthetic */ BloodSugarGMIAndAGPResult(long j, long j2, Float f, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : map);
    }
}
