package com.xiaomi.hm.health.healthdata.ui.vo;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bo\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b*\u0010+J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0081\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00052\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR'\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00058\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "Lkotlin/Pair;", "component2", "component3", "component4", "component5", "", "component6", "index", "highValue", "highOffset", "lowValue", "lowOffset", "extra", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Lkotlin/Pair;", "getHighValue", "()Lkotlin/Pair;", "c", "getHighOffset", GoogleApiAvailabilityLight.a, "getLowValue", "e", "getLowOffset", "f", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "<init>", "(ILkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarChartVo<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<T, T> highValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<T, T> highOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<T, T> lowValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<T, T> lowOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    /* JADX WARN: Multi-variable type inference failed */
    public BarChartVo(int i, @Nullable Pair<? extends T, ? extends T> pair, @NotNull Pair<? extends T, ? extends T> pair2, @Nullable Pair<? extends T, ? extends T> pair3, @NotNull Pair<? extends T, ? extends T> pair4, @Nullable String str) {
        this.index = i;
        this.highValue = pair;
        this.highOffset = pair2;
        this.lowValue = pair3;
        this.lowOffset = pair4;
        this.extra = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarChartVo copy$default(BarChartVo barChartVo, int i, Pair pair, Pair pair2, Pair pair3, Pair pair4, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = barChartVo.index;
        }
        if ((i2 & 2) != 0) {
            pair = barChartVo.highValue;
        }
        Pair pair5 = pair;
        if ((i2 & 4) != 0) {
            pair2 = barChartVo.highOffset;
        }
        Pair pair6 = pair2;
        if ((i2 & 8) != 0) {
            pair3 = barChartVo.lowValue;
        }
        Pair pair7 = pair3;
        if ((i2 & 16) != 0) {
            pair4 = barChartVo.lowOffset;
        }
        Pair pair8 = pair4;
        if ((i2 & 32) != 0) {
            str = barChartVo.extra;
        }
        return barChartVo.copy(i, pair5, pair6, pair7, pair8, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final Pair<T, T> component2() {
        return this.highValue;
    }

    @NotNull
    public final Pair<T, T> component3() {
        return this.highOffset;
    }

    @Nullable
    public final Pair<T, T> component4() {
        return this.lowValue;
    }

    @NotNull
    public final Pair<T, T> component5() {
        return this.lowOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final BarChartVo<T> copy(int index, @Nullable Pair<? extends T, ? extends T> highValue, @NotNull Pair<? extends T, ? extends T> highOffset, @Nullable Pair<? extends T, ? extends T> lowValue, @NotNull Pair<? extends T, ? extends T> lowOffset, @Nullable String extra) {
        return new BarChartVo<>(index, highValue, highOffset, lowValue, lowOffset, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarChartVo)) {
            return false;
        }
        BarChartVo barChartVo = (BarChartVo) other;
        return this.index == barChartVo.index && Intrinsics.areEqual(this.highValue, barChartVo.highValue) && Intrinsics.areEqual(this.highOffset, barChartVo.highOffset) && Intrinsics.areEqual(this.lowValue, barChartVo.lowValue) && Intrinsics.areEqual(this.lowOffset, barChartVo.lowOffset) && Intrinsics.areEqual(this.extra, barChartVo.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final Pair<T, T> getHighOffset() {
        return this.highOffset;
    }

    @Nullable
    public final Pair<T, T> getHighValue() {
        return this.highValue;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Pair<T, T> getLowOffset() {
        return this.lowOffset;
    }

    @Nullable
    public final Pair<T, T> getLowValue() {
        return this.lowValue;
    }

    public int hashCode() {
        int i = this.index * 31;
        Pair<T, T> pair = this.highValue;
        int iHashCode = (((i + (pair == null ? 0 : pair.hashCode())) * 31) + this.highOffset.hashCode()) * 31;
        Pair<T, T> pair2 = this.lowValue;
        int iHashCode2 = (((iHashCode + (pair2 == null ? 0 : pair2.hashCode())) * 31) + this.lowOffset.hashCode()) * 31;
        String str = this.extra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BarChartVo(index=" + this.index + ", highValue=" + this.highValue + ", highOffset=" + this.highOffset + ", lowValue=" + this.lowValue + ", lowOffset=" + this.lowOffset + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ BarChartVo(int i, Pair pair, Pair pair2, Pair pair3, Pair pair4, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, pair, pair2, pair3, pair4, (i2 & 32) != 0 ? null : str);
    }
}
