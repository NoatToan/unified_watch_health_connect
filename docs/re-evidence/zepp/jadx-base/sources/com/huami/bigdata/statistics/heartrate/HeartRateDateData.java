package com.huami.bigdata.statistics.heartrate;

import androidx.annotation.Keep;
import com.google.gson.annotations.JsonAdapter;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huami/bigdata/statistics/heartrate/HeartRateDateData;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "", "other", "", "equals", "", "hashCode", "", "component1", "values", "copy", "", "toString", "[I", "getValues", "()[I", "setValues", "([I)V", "<init>", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateDateData extends AbstractDateData {

    @JsonAdapter(DataArrayValueConvertAdapter.class)
    @Action(type = ActionType.PLUS)
    @NotNull
    private int[] values;

    public HeartRateDateData(@NotNull int[] iArr) {
        super(null, 1, null);
        this.values = iArr;
    }

    public static /* synthetic */ HeartRateDateData copy$default(HeartRateDateData heartRateDateData, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = heartRateDateData.values;
        }
        return heartRateDateData.copy(iArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int[] getValues() {
        return this.values;
    }

    @NotNull
    public final HeartRateDateData copy(@NotNull int[] values) {
        return new HeartRateDateData(values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HeartRateDateData.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.bigdata.statistics.heartrate.HeartRateDateData");
        return Arrays.equals(this.values, ((HeartRateDateData) other).values);
    }

    @NotNull
    public final int[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }

    public final void setValues(@NotNull int[] iArr) {
        this.values = iArr;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractDateData
    @NotNull
    public String toString() {
        return "HeartRateDateData(values=" + Arrays.toString(this.values) + ")";
    }
}
