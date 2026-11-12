package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import defpackage.r7c;
import defpackage.ttc;
import defpackage.wye;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class MarkerView extends RelativeLayout implements ttc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wye f7790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wye f7791b;
    public WeakReference<Chart> c;

    private void setupLayoutResource(int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    @Override // defpackage.ttc
    public void a(Canvas canvas, float f, float f2) {
        wye wyeVarC = c(f, f2);
        int iSave = canvas.save();
        canvas.translate(f + wyeVarC.c, f2 + wyeVarC.d);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.ttc
    public void b(Entry entry, r7c r7cVar) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public wye c(float f, float f2) {
        wye offset = getOffset();
        wye wyeVar = this.f7791b;
        wyeVar.c = offset.c;
        wyeVar.d = offset.d;
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        wye wyeVar2 = this.f7791b;
        float f3 = wyeVar2.c;
        if (f + f3 < 0.0f) {
            wyeVar2.c = -f;
        } else if (chartView != null && f + width + f3 > chartView.getWidth()) {
            this.f7791b.c = (chartView.getWidth() - f) - width;
        }
        wye wyeVar3 = this.f7791b;
        float f4 = wyeVar3.d;
        if (f2 + f4 < 0.0f) {
            wyeVar3.d = -f2;
        } else if (chartView != null && f2 + height + f4 > chartView.getHeight()) {
            this.f7791b.d = (chartView.getHeight() - f2) - height;
        }
        return this.f7791b;
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public wye getOffset() {
        return this.f7790a;
    }

    public void setChartView(Chart chart) {
        this.c = new WeakReference<>(chart);
    }

    public void setOffset(wye wyeVar) {
        this.f7790a = wyeVar;
        if (wyeVar == null) {
            this.f7790a = new wye();
        }
    }
}
