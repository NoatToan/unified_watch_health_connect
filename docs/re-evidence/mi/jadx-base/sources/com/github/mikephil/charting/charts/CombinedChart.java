package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.Entry;
import defpackage.bge;
import defpackage.cel;
import defpackage.d54;
import defpackage.h54;
import defpackage.hpc;
import defpackage.i54;
import defpackage.j54;
import defpackage.o53;
import defpackage.r7c;
import defpackage.ui3;
import defpackage.w02;

/* JADX INFO: loaded from: classes4.dex */
public class CombinedChart extends BarLineChartBase<h54> implements i54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7771b;
    public boolean c;
    public DrawOrder[] d;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.f7770a = true;
        this.f7771b = false;
        this.c = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void drawMarkers(Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i = 0;
        while (true) {
            r7c[] r7cVarArr = this.mIndicesToHighlight;
            if (i >= r7cVarArr.length) {
                return;
            }
            r7c r7cVar = r7cVarArr[i];
            hpc<? extends Entry> hpcVarD = ((h54) this.mData).D(r7cVar);
            Entry entryN = ((h54) this.mData).n(r7cVar);
            if (entryN != null && hpcVarD.c(entryN) <= hpcVarD.O0() * this.mAnimator.h()) {
                float[] markerPosition = getMarkerPosition(r7cVar);
                if (this.mViewPortHandler.z(markerPosition[0], markerPosition[1])) {
                    this.mMarker.b(entryN, r7cVar);
                    this.mMarker.a(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i++;
        }
    }

    @Override // defpackage.x02
    public w02 getBarData() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((h54) t).z();
    }

    @Override // defpackage.p53
    public o53 getBubbleData() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((h54) t).A();
    }

    @Override // defpackage.vi3
    public ui3 getCandleData() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((h54) t).B();
    }

    @Override // defpackage.i54
    public h54 getCombinedData() {
        return (h54) this.mData;
    }

    public DrawOrder[] getDrawOrder() {
        return this.d;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public r7c getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            return null;
        }
        r7c r7cVarA = getHighlighter().a(f, f2);
        return (r7cVarA == null || !isHighlightFullBarEnabled()) ? r7cVarA : new r7c(r7cVarA.h(), r7cVarA.j(), r7cVarA.i(), r7cVarA.k(), r7cVarA.d(), -1, r7cVarA.b());
    }

    @Override // defpackage.cge
    public bge getLineData() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((h54) t).E();
    }

    @Override // defpackage.del
    public cel getScatterData() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((h54) t).F();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.d = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new j54(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new d54(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // defpackage.x02
    public boolean isDrawBarShadowEnabled() {
        return this.c;
    }

    @Override // defpackage.x02
    public boolean isDrawValueAboveBarEnabled() {
        return this.f7770a;
    }

    @Override // defpackage.x02
    public boolean isHighlightFullBarEnabled() {
        return this.f7771b;
    }

    public void setDrawBarShadow(boolean z) {
        this.c = z;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.d = drawOrderArr;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f7770a = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f7771b = z;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(h54 h54Var) {
        super.setData(h54Var);
        setHighlighter(new j54(this, this));
        ((d54) this.mRenderer).a();
        this.mRenderer.initBuffers();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7770a = true;
        this.f7771b = false;
        this.c = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7770a = true;
        this.f7771b = false;
        this.c = false;
    }
}
