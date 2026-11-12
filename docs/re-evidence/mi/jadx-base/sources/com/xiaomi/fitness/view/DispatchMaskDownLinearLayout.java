package com.xiaomi.fitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class DispatchMaskDownLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LineChartRecyclerView f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BarChartRecyclerView f13339b;

    public DispatchMaskDownLinearLayout(Context context) {
        super(context);
    }

    public void a(LineChartRecyclerView lineChartRecyclerView, BarChartRecyclerView barChartRecyclerView) {
        this.f13338a = lineChartRecyclerView;
        this.f13339b = barChartRecyclerView;
    }

    public final boolean b(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (view.getMeasuredHeight() + i2)) && f >= ((float) i) && f <= ((float) (view.getMeasuredWidth() + i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 5) {
            return true;
        }
        if (this.f13338a.getScrollState() == 0 || !b(this.f13339b, motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Logger.d("DispatchMaskDown", " LineRecyclerView is scrolling, BarRecyclerView want to scroll, stop All!!");
        this.f13338a.stopScroll();
        this.f13339b.stopScroll();
        return true;
    }

    public DispatchMaskDownLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DispatchMaskDownLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
