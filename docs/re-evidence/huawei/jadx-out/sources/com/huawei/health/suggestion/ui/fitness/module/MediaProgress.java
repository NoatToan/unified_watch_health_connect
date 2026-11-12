package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MediaProgress extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f9393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f9394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9395c;
    private int d;
    private int e;
    private float f;
    private List<Motion> g;
    private RectF h;
    private int i;
    private List<Float> j;
    private List<e> k;
    private int l;
    private int m;
    private int n;
    private int o;
    private e p;
    private int r;
    private Paint s;
    private RectF t;

    public MediaProgress(Context context) {
        super(context);
        this.m = 3;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = 0;
        this.n = Color.parseColor("#20ffffff");
        this.o = Color.parseColor("#ffffff");
        this.e = Color.parseColor("#80ffffff");
        this.g = new ArrayList();
        this.f9395c = context;
    }

    public MediaProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 3;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = 0;
        this.n = Color.parseColor("#20ffffff");
        this.o = Color.parseColor("#ffffff");
        this.e = Color.parseColor("#80ffffff");
        this.g = new ArrayList();
        this.f9395c = context;
    }

    public MediaProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 3;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = 0;
        this.n = Color.parseColor("#20ffffff");
        this.o = Color.parseColor("#ffffff");
        this.e = Color.parseColor("#80ffffff");
        this.g = new ArrayList();
        this.f9395c = context;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.s = new Paint(1);
        this.f9394b = new Paint(1);
        this.f9393a = new Paint(1);
        this.s.setColor(this.n);
        this.f9394b.setColor(this.e);
        this.f9393a.setColor(this.n);
        this.m = d(this.f9395c, this.m);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), this.m);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i = Math.max(i2, i);
        this.l = this.g.size();
        int i5 = this.i;
        this.k.clear();
        float f = 0.0f;
        for (int i6 = 0; i6 < this.l; i6++) {
            float fFloatValue = ((this.j.get(i6).floatValue() * 1.0f) / this.r) * 1.0f * i5;
            this.k.add(new e(f, fFloatValue));
            f += fFloatValue;
        }
        this.f9394b.setStrokeWidth(d(this.f9395c, 1));
        this.h = new RectF(0.0f, 0.0f, this.i, this.m);
        this.t = new RectF(0.0f, 0.0f, 0.0f, this.m);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.k.size() <= 0) {
            return;
        }
        this.f9393a.setColor(this.n);
        RectF rectF = this.h;
        float f = this.m / 2.0f;
        canvas.drawRoundRect(rectF, f, f, this.f9393a);
        this.s.setColor(this.o);
        for (int i = 0; i <= this.d; i++) {
            e eVar = this.k.get(i);
            this.p = eVar;
            if (i == this.d) {
                float fA = eVar.a() + (this.p.c() * this.f);
                RectF rectF2 = this.t;
                if (fA >= this.p.a() + this.p.c()) {
                    fA = this.p.a() + this.p.c();
                }
                rectF2.right = fA;
            } else {
                this.t.right = eVar.a() + this.p.c();
            }
        }
        for (int i2 = 1; i2 < this.l; i2++) {
            float fA2 = this.k.get(i2).a();
            float f2 = this.m / 2.0f;
            canvas.drawCircle(fA2, f2, f2 - 0.5f, this.f9394b);
        }
        RectF rectF3 = this.t;
        float f3 = this.m / 2.0f;
        canvas.drawRoundRect(rectF3, f3, f3, this.s);
    }

    class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f9396a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f9398c;
        RectF d;

        e(float f, float f2) {
            this.f9396a = f;
            this.f9398c = f2;
            this.d = new RectF(f, 0.0f, f2 + f, MediaProgress.this.m);
        }

        public float a() {
            return this.f9396a;
        }

        public float c() {
            return this.f9398c;
        }
    }

    public void setProgress(int i, int i2, float f) {
        if (i < 0 || i >= this.g.size() || i >= this.j.size()) {
            return;
        }
        this.d = i;
        if (this.g.get(i) != null && Math.abs(this.j.get(i).floatValue()) > 1.0E-6d) {
            this.f = ((i2 * this.g.get(i).acquireDuration()) + f) / this.j.get(i).floatValue();
        }
        invalidate();
    }

    public void setMotions(List<Motion> list) {
        if (list == null) {
            return;
        }
        this.g.clear();
        this.g.addAll(list);
        this.l = list.size();
        for (Motion motion : list) {
            if (motion != null) {
                this.r = (int) (this.r + (motion.acquireDuration() * motion.acquireGroups()));
                this.j.add(Float.valueOf(motion.acquireDuration() * motion.acquireGroups()));
            }
        }
    }

    public float d(int i) {
        if (i < 0 || i >= this.j.size()) {
            return 0.0f;
        }
        return this.j.get(i).floatValue();
    }

    public float getTotalTime() {
        return this.r;
    }

    public void setIntervalColor(int i) {
        this.e = i;
    }

    public void setIntervalColor(String str) {
        this.e = Color.parseColor(str);
    }

    public void setProgressBgColor(int i) {
        this.n = i;
    }

    public void setProgressBgColor(String str) {
        this.n = Color.parseColor(str);
    }

    public void setProgressColor(int i) {
        this.o = i;
    }

    public void setProgressColor(String str) {
        this.o = Color.parseColor(str);
    }

    public void setProgressHeight(int i) {
        this.m = i;
    }

    private static int d(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
