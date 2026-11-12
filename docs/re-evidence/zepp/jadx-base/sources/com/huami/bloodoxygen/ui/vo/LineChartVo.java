package com.huami.bloodoxygen.ui.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/LineChartVo;", "", "", "component1", "component2", "", "component3", "index", "value", "extra", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "getValue", "c", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LineChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    public LineChartVo(int i, int i2, @Nullable String str) {
        this.index = i;
        this.value = i2;
        this.extra = str;
    }

    public static /* synthetic */ LineChartVo copy$default(LineChartVo lineChartVo, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = lineChartVo.index;
        }
        if ((i3 & 2) != 0) {
            i2 = lineChartVo.value;
        }
        if ((i3 & 4) != 0) {
            str = lineChartVo.extra;
        }
        return lineChartVo.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final LineChartVo copy(int index, int value, @Nullable String extra) {
        return new LineChartVo(index, value, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineChartVo)) {
            return false;
        }
        LineChartVo lineChartVo = (LineChartVo) other;
        return this.index == lineChartVo.index && this.value == lineChartVo.value && Intrinsics.areEqual(this.extra, lineChartVo.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = ((this.index * 31) + this.value) * 31;
        String str = this.extra;
        return i + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "LineChartVo(index=" + this.index + ", value=" + this.value + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ LineChartVo(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str);
    }
}
