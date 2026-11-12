package com.huami.bloodpressure_ui.ext;

import androidx.annotation.Keep;
import defpackage.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J?\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodpressure_ui/ext/BloodPressureDto;", "", "", "toString", "", "component1", "Lkotlin/Pair;", "", "component2", "component3", "time", "lowValue", "heightValue", "copy", "hashCode", "other", "", "equals", "J", "getTime", "()J", "Lkotlin/Pair;", "getLowValue", "()Lkotlin/Pair;", "getHeightValue", "<init>", "(JLkotlin/Pair;Lkotlin/Pair;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureDto {

    @NotNull
    private final Pair<Integer, Integer> heightValue;

    @NotNull
    private final Pair<Integer, Integer> lowValue;
    private final long time;

    public BloodPressureDto(long j, @NotNull Pair<Integer, Integer> pair, @NotNull Pair<Integer, Integer> pair2) {
        this.time = j;
        this.lowValue = pair;
        this.heightValue = pair2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloodPressureDto copy$default(BloodPressureDto bloodPressureDto, long j, Pair pair, Pair pair2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bloodPressureDto.time;
        }
        if ((i & 2) != 0) {
            pair = bloodPressureDto.lowValue;
        }
        if ((i & 4) != 0) {
            pair2 = bloodPressureDto.heightValue;
        }
        return bloodPressureDto.copy(j, pair, pair2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final Pair<Integer, Integer> component2() {
        return this.lowValue;
    }

    @NotNull
    public final Pair<Integer, Integer> component3() {
        return this.heightValue;
    }

    @NotNull
    public final BloodPressureDto copy(long time, @NotNull Pair<Integer, Integer> lowValue, @NotNull Pair<Integer, Integer> heightValue) {
        return new BloodPressureDto(time, lowValue, heightValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureDto)) {
            return false;
        }
        BloodPressureDto bloodPressureDto = (BloodPressureDto) other;
        return this.time == bloodPressureDto.time && Intrinsics.areEqual(this.lowValue, bloodPressureDto.lowValue) && Intrinsics.areEqual(this.heightValue, bloodPressureDto.heightValue);
    }

    @NotNull
    public final Pair<Integer, Integer> getHeightValue() {
        return this.heightValue;
    }

    @NotNull
    public final Pair<Integer, Integer> getLowValue() {
        return this.lowValue;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((b.a(this.time) * 31) + this.lowValue.hashCode()) * 31) + this.heightValue.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureDto(time='" + this.time + "', lowValue=" + this.lowValue + ", heightValue=" + this.heightValue + ")";
    }
}
