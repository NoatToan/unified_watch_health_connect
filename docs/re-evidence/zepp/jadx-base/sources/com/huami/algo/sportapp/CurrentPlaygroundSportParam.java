package com.huami.algo.sportapp;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/algo/sportapp/CurrentPlaygroundSportParam;", "", "", "component1", "component2", "component3", "loopDistance", "outlierToleranceDistance", "gpsDistance", "copy", "", "toString", "", "hashCode", "other", "", "equals", "F", "getLoopDistance", "()F", "getOutlierToleranceDistance", "getGpsDistance", "<init>", "(FFF)V", "sportapp_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CurrentPlaygroundSportParam {
    private final float gpsDistance;
    private final float loopDistance;
    private final float outlierToleranceDistance;

    public CurrentPlaygroundSportParam(float f, float f2, float f3) {
        this.loopDistance = f;
        this.outlierToleranceDistance = f2;
        this.gpsDistance = f3;
    }

    public static /* synthetic */ CurrentPlaygroundSportParam copy$default(CurrentPlaygroundSportParam currentPlaygroundSportParam, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = currentPlaygroundSportParam.loopDistance;
        }
        if ((i & 2) != 0) {
            f2 = currentPlaygroundSportParam.outlierToleranceDistance;
        }
        if ((i & 4) != 0) {
            f3 = currentPlaygroundSportParam.gpsDistance;
        }
        return currentPlaygroundSportParam.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLoopDistance() {
        return this.loopDistance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOutlierToleranceDistance() {
        return this.outlierToleranceDistance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getGpsDistance() {
        return this.gpsDistance;
    }

    @NotNull
    public final CurrentPlaygroundSportParam copy(float loopDistance, float outlierToleranceDistance, float gpsDistance) {
        return new CurrentPlaygroundSportParam(loopDistance, outlierToleranceDistance, gpsDistance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentPlaygroundSportParam)) {
            return false;
        }
        CurrentPlaygroundSportParam currentPlaygroundSportParam = (CurrentPlaygroundSportParam) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.loopDistance), (Object) Float.valueOf(currentPlaygroundSportParam.loopDistance)) && Intrinsics.areEqual((Object) Float.valueOf(this.outlierToleranceDistance), (Object) Float.valueOf(currentPlaygroundSportParam.outlierToleranceDistance)) && Intrinsics.areEqual((Object) Float.valueOf(this.gpsDistance), (Object) Float.valueOf(currentPlaygroundSportParam.gpsDistance));
    }

    public final float getGpsDistance() {
        return this.gpsDistance;
    }

    public final float getLoopDistance() {
        return this.loopDistance;
    }

    public final float getOutlierToleranceDistance() {
        return this.outlierToleranceDistance;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.loopDistance) * 31) + Float.floatToIntBits(this.outlierToleranceDistance)) * 31) + Float.floatToIntBits(this.gpsDistance);
    }

    @NotNull
    public String toString() {
        return "CurrentPlaygroundSportParam(loopDistance=" + this.loopDistance + ", outlierToleranceDistance=" + this.outlierToleranceDistance + ", gpsDistance=" + this.gpsDistance + ")";
    }
}
