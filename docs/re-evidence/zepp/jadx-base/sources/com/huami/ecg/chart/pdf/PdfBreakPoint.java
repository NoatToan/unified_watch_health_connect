package com.huami.ecg.chart.pdf;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#¨\u0006,"}, d2 = {"Lcom/huami/ecg/chart/pdf/PdfBreakPoint;", "", "", "component1", "component2", "", "component3", "component4", "component5", "rectLeft", "rectRight", DTransferConstants.PAGE, "line", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getRectLeft", "()F", "setRectLeft", "(F)V", "b", "getRectRight", "setRectRight", "c", LogUtil.I, "getPage", "()I", "setPage", "(I)V", GoogleApiAvailabilityLight.a, "getLine", "setLine", "e", "getType", "setType", "<init>", "(FFIII)V", "ecg-chart_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class PdfBreakPoint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private float rectLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private float rectRight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int page;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int line;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int type;

    public PdfBreakPoint() {
        this(0.0f, 0.0f, 0, 0, 0, 31, null);
    }

    public PdfBreakPoint(float f, float f2, int i, int i2, int i3) {
        this.rectLeft = f;
        this.rectRight = f2;
        this.page = i;
        this.line = i2;
        this.type = i3;
    }

    public static /* synthetic */ PdfBreakPoint copy$default(PdfBreakPoint pdfBreakPoint, float f, float f2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f = pdfBreakPoint.rectLeft;
        }
        if ((i4 & 2) != 0) {
            f2 = pdfBreakPoint.rectRight;
        }
        float f3 = f2;
        if ((i4 & 4) != 0) {
            i = pdfBreakPoint.page;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = pdfBreakPoint.line;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = pdfBreakPoint.type;
        }
        return pdfBreakPoint.copy(f, f3, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getRectLeft() {
        return this.rectLeft;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getRectRight() {
        return this.rectRight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLine() {
        return this.line;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final PdfBreakPoint copy(float rectLeft, float rectRight, int page, int line, int type) {
        return new PdfBreakPoint(rectLeft, rectRight, page, line, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfBreakPoint)) {
            return false;
        }
        PdfBreakPoint pdfBreakPoint = (PdfBreakPoint) other;
        return Float.compare(this.rectLeft, pdfBreakPoint.rectLeft) == 0 && Float.compare(this.rectRight, pdfBreakPoint.rectRight) == 0 && this.page == pdfBreakPoint.page && this.line == pdfBreakPoint.line && this.type == pdfBreakPoint.type;
    }

    public final int getLine() {
        return this.line;
    }

    public final int getPage() {
        return this.page;
    }

    public final float getRectLeft() {
        return this.rectLeft;
    }

    public final float getRectRight() {
        return this.rectRight;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.rectLeft) * 31) + Float.floatToIntBits(this.rectRight)) * 31) + this.page) * 31) + this.line) * 31) + this.type;
    }

    public final void setLine(int i) {
        this.line = i;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setRectLeft(float f) {
        this.rectLeft = f;
    }

    public final void setRectRight(float f) {
        this.rectRight = f;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "PdfBreakPoint(rectLeft=" + this.rectLeft + ", rectRight=" + this.rectRight + ", page=" + this.page + ", line=" + this.line + ", type=" + this.type + ")";
    }

    public /* synthetic */ PdfBreakPoint(float f, float f2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1.0f : f, (i4 & 2) == 0 ? f2 : -1.0f, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? -1 : i3);
    }
}
