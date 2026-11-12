package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.du3;
import defpackage.qim;
import defpackage.s02;

/* JADX INFO: loaded from: classes7.dex */
public class SleepChartRecyclerView extends BaseChartRecyclerView<qim, s02> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11778b;
    public boolean c;
    public boolean d;
    public Runnable e;
    public Handler f;
    public Long g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SleepChartRecyclerView sleepChartRecyclerView = SleepChartRecyclerView.this;
            sleepChartRecyclerView.c = true;
            sleepChartRecyclerView.performHapticFeedback(0);
        }
    }

    public SleepChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new a();
        this.f = new Handler();
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    public qim getAttrs(Context context, AttributeSet attributeSet) {
        return du3.f(context, attributeSet, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX(0);
        int y = (int) motionEvent.getY(0);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.g != null) {
                this.clickTwoStatus = Boolean.valueOf(System.currentTimeMillis() - this.g.longValue() < 200);
            }
            if (!this.clickTwoStatus.booleanValue() || Math.abs(this.f11777a - x) >= DisplayUtil.dip2px(20.0f) || Math.abs(this.f11778b - y) >= DisplayUtil.dip2px(20.0f)) {
                this.c = false;
                this.d = false;
                this.f11777a = x;
                this.f11778b = y;
                if (y < getPaddingTop()) {
                    BaseChartRecyclerView.a aVar = this.onChartTouchListener;
                    if (aVar != null) {
                        aVar.e();
                    }
                    return false;
                }
                this.f.postDelayed(this.e, 400L);
            } else {
                BaseChartRecyclerView.a aVar2 = this.onChartTouchListener;
                if (aVar2 != null) {
                    aVar2.d();
                }
            }
        } else if (action == 1) {
            this.g = Long.valueOf(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append("ACTION_UP, isLongPress = ");
            sb.append(this.c);
            this.c = false;
            this.d = false;
            this.f.removeCallbacks(this.e);
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ACTION_MOVE,isLongPress = ");
            sb2.append(this.c);
            if (!this.c) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.d && (Math.abs(this.f11777a - x) > DisplayUtil.dip2px(3.0f) || Math.abs(this.f11778b - y) > DisplayUtil.dip2px(3.0f))) {
                this.d = true;
                this.f.removeCallbacks(this.e);
            }
        } else if (action == 3) {
            this.g = Long.valueOf(System.currentTimeMillis());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ACTION_UP, isLongPress = ");
            sb3.append(this.c);
            this.c = false;
            this.d = false;
            this.f.removeCallbacks(this.e);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }
}
