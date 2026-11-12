package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.a52;
import defpackage.b52;
import defpackage.sf2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseChartRecyclerView<T extends a52, I extends b52> extends RecyclerView {
    public Boolean clickTwoStatus;
    public T mAttrs;
    public I mItemDecoration;
    public a onChartTouchListener;

    public interface a {
        void a(MotionEvent motionEvent);

        void b(MotionEvent motionEvent);

        void c(MotionEvent motionEvent);

        void d();

        void e();
    }

    public BaseChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clickTwoStatus = Boolean.FALSE;
        this.mAttrs = (T) getAttrs(context, attributeSet);
    }

    private void setRecyclerViewDefaultPadding() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.mAttrs.o) {
            paddingRight = DisplayUtil.dip2px(36.0f);
        }
        if (this.mAttrs.p) {
            paddingLeft = DisplayUtil.dip2px(36.0f);
        }
        if (!AppUtil.isRTLDirection()) {
            paddingRight = paddingLeft;
        }
        if (!AppUtil.isRTLDirection()) {
            paddingLeft = paddingRight;
        }
        setPadding(paddingRight, getPaddingTop(), paddingLeft, getPaddingBottom());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addItemDecoration(RecyclerView.n nVar) {
        super.addItemDecoration(nVar);
        if (nVar instanceof b52) {
            this.mItemDecoration = (I) nVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        double d = i;
        double d2 = this.mAttrs.g;
        return super.fling((int) (d * d2), (int) (((double) i2) * d2));
    }

    public abstract T getAttrs(Context context, AttributeSet attributeSet);

    public I getItemDecoration() {
        return this.mItemDecoration;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (motionEvent.getActionMasked() == 0) {
            a aVar2 = this.onChartTouchListener;
            if (aVar2 != null) {
                aVar2.b(motionEvent);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a aVar3 = this.onChartTouchListener;
            if (aVar3 != null) {
                aVar3.a(motionEvent);
            }
        } else if (motionEvent.getActionMasked() == 2 && (aVar = this.onChartTouchListener) != null) {
            aVar.c(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnChartTouchListener(a aVar) {
        this.onChartTouchListener = aVar;
    }

    public <Y extends sf2> void setYAxis(Y y) {
        this.mItemDecoration.setYAxis(y);
    }
}
