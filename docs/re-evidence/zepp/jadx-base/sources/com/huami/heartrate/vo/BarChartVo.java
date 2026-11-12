package com.huami.heartrate.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/heartrate/vo/BarChartVo;", "", "", "component1", "", "component2", "", "component3", "index", "heartRateValue", "extra", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "[I", "getHeartRateValue", "()[I", "c", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "<init>", "(I[ILjava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final int[] heartRateValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    public BarChartVo(int i, @Nullable int[] iArr, @Nullable String str) {
        this.index = i;
        this.heartRateValue = iArr;
        this.extra = str;
    }

    public static /* synthetic */ BarChartVo copy$default(BarChartVo barChartVo, int i, int[] iArr, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = barChartVo.index;
        }
        if ((i2 & 2) != 0) {
            iArr = barChartVo.heartRateValue;
        }
        if ((i2 & 4) != 0) {
            str = barChartVo.extra;
        }
        return barChartVo.copy(i, iArr, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int[] getHeartRateValue() {
        return this.heartRateValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final BarChartVo copy(int index, @Nullable int[] heartRateValue, @Nullable String extra) {
        return new BarChartVo(index, heartRateValue, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarChartVo)) {
            return false;
        }
        BarChartVo barChartVo = (BarChartVo) other;
        return this.index == barChartVo.index && Intrinsics.areEqual(this.heartRateValue, barChartVo.heartRateValue) && Intrinsics.areEqual(this.extra, barChartVo.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final int[] getHeartRateValue() {
        return this.heartRateValue;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int i = this.index * 31;
        int[] iArr = this.heartRateValue;
        int iHashCode = (i + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        String str = this.extra;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BarChartVo(index=" + this.index + ", heartRateValue=" + Arrays.toString(this.heartRateValue) + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ BarChartVo(int i, int[] iArr, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, iArr, (i2 & 4) != 0 ? null : str);
    }
}
