package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.du3;
import defpackage.vfe;
import defpackage.yfe;

/* JADX INFO: loaded from: classes7.dex */
public class BloodSugarLineChartRecyclerView extends BaseChartRecyclerView<vfe, yfe> {
    public BloodSugarLineChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        BaseChartRecyclerView.a aVar;
        int y = (int) motionEvent.getY(0);
        if (motionEvent.getActionMasked() == 0) {
            if (this.onChartTouchListener != null) {
                if (y < getPaddingTop()) {
                    this.onChartTouchListener.e();
                    return false;
                }
                this.onChartTouchListener.b(motionEvent);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            BaseChartRecyclerView.a aVar2 = this.onChartTouchListener;
            if (aVar2 != null) {
                aVar2.a(motionEvent);
            }
        } else if (motionEvent.getActionMasked() == 2 && (aVar = this.onChartTouchListener) != null) {
            aVar.c(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    public vfe getAttrs(Context context, AttributeSet attributeSet) {
        return du3.c(context, attributeSet);
    }
}
