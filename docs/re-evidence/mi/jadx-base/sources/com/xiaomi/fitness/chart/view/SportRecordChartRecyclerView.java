package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.du3;
import defpackage.s02;
import defpackage.vfe;

/* JADX INFO: loaded from: classes7.dex */
public class SportRecordChartRecyclerView extends BaseChartRecyclerView<vfe, s02> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11781b;
    public boolean c;
    public boolean d;
    public Runnable e;
    public Handler f;
    public float g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f11782k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f11783r;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SportRecordChartRecyclerView sportRecordChartRecyclerView = SportRecordChartRecyclerView.this;
            sportRecordChartRecyclerView.c = true;
            sportRecordChartRecyclerView.performHapticFeedback(0);
        }
    }

    public interface b {
        void a(float f, float f2);
    }

    public SportRecordChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 1.0f;
        this.f11782k = 0.0f;
        this.l = 0.0f;
        this.e = new a();
        this.f = new Handler();
    }

    public float a() {
        return (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
    }

    public final float c(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public final float d(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0112  */
    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX(0);
        int y = (int) motionEvent.getY(0);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("ACTION_UP, isLongPress = ");
                sb.append(this.c);
                this.c = false;
                this.d = false;
                this.q = false;
                this.f.removeCallbacks(this.e);
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ACTION_MOVE,isLongPress = ");
                sb2.append(this.c);
                if (!this.c) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (motionEvent.getPointerCount() >= 2) {
                    this.q = true;
                    float fD = d(motionEvent);
                    this.g *= fD / c(this.m, this.n, this.o, this.p);
                    this.h *= fD / c(this.m, this.n, this.o, this.p);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("parent get Action!");
                    sb3.append(fD);
                    sb3.append("   ");
                    sb3.append(c(this.m, this.n, this.o, this.p));
                    sb3.append("  ");
                    sb3.append(this.g);
                    float fMin = Math.min(this.i, this.g);
                    this.g = fMin;
                    this.g = Math.max(this.j, fMin);
                    float fMax = Math.max(1.0f, this.h);
                    this.h = fMax;
                    this.f11783r.a(this.g, fMax);
                }
                this.m = motionEvent.getX(0);
                this.n = motionEvent.getY(0);
                if (motionEvent.getPointerCount() >= 2) {
                    this.o = motionEvent.getX(1);
                    this.p = motionEvent.getY(1);
                }
                if (!this.d && (Math.abs(this.f11780a - x) > DisplayUtil.dip2px(3.0f) || Math.abs(this.f11781b - y) > DisplayUtil.dip2px(3.0f))) {
                    this.d = true;
                    this.f.removeCallbacks(this.e);
                }
            } else if (action == 3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("ACTION_UP, isLongPress = ");
                sb4.append(this.c);
                this.c = false;
                this.d = false;
                this.q = false;
                this.f.removeCallbacks(this.e);
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (action == 5) {
                this.o = motionEvent.getX(1);
                this.p = motionEvent.getY(1);
                return true;
            }
        } else {
            if (y < getPaddingTop()) {
                this.onChartTouchListener.e();
                return false;
            }
            this.m = motionEvent.getX(0);
            this.n = motionEvent.getY(0);
            getParent().requestDisallowInterceptTouchEvent(true);
            this.c = false;
            this.d = false;
            this.q = false;
            this.f11780a = x;
            this.f11781b = y;
            this.f.postDelayed(this.e, 400L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnChartClickListener(b bVar) {
        this.f11783r = bVar;
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    public vfe getAttrs(Context context, AttributeSet attributeSet) {
        return du3.c(context, attributeSet);
    }
}
