package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.ui.DefaultTimeBar;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public class StepView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f7475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f7476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f7477c;
    private float d;
    private float e;
    private Context f;
    private int g;
    private float h;
    private float i;
    private float j;
    private RectF k;
    private float l;
    private float m;
    private RectF n;
    private float o;
    private Paint p;
    private Paint q;
    private float r;
    private float s;
    private OnStepViewClickListener t;
    private float u;
    private float w;
    private Paint x;
    private float y;

    public interface OnStepViewClickListener {
        void onStepViewRightCircleClick();
    }

    public StepView(Context context) {
        this(context, null);
    }

    public StepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StepView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = qrs.d(getContext(), 15.0f);
        this.w = qrs.d(getContext(), 53.5f);
        this.u = qrs.d(getContext(), 7.5f);
        this.e = qrs.d(getContext(), 2.0f);
        this.h = qrs.d(getContext(), 1.0f);
        this.j = qrs.d(getContext(), 1.25f);
        this.f7477c = qrs.d(getContext(), 0.9f);
        this.g = 0;
        this.d = qrs.d(getContext(), 1.0f);
        this.f = context;
        this.g = new HealthColumnSystem(this.f, 1).j();
        this.r = 0.0f;
        this.s = 0.0f;
        setLayerType(1, null);
        Context context2 = getContext();
        if (e()) {
            this.y = qrs.d(context2, 15.0f);
            this.w = qrs.d(context2, 40.0f);
            this.u = qrs.d(context2, 7.5f);
        }
        if (qrs.v()) {
            this.w = qrs.d(context2, 60.0f);
        }
        d();
    }

    private boolean e() {
        return this.g >= 8;
    }

    private void d() {
        Paint paint = new Paint();
        this.q = paint;
        paint.setAntiAlias(true);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        this.q.setStrokeWidth(this.y);
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setAntiAlias(true);
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setStrokeJoin(Paint.Join.ROUND);
        this.x.setStrokeCap(Paint.Cap.ROUND);
        this.x.setColor(-1);
        this.x.setStrokeWidth(this.y);
        Paint paint3 = new Paint();
        this.p = paint3;
        paint3.setAntiAlias(true);
        this.p.setStrokeWidth(this.y);
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(-1);
        if (qrs.af(this.f)) {
            this.p.setShadowLayer(5.5f, 9.0f, 0.0f, 1308588059);
        } else {
            this.p.setShadowLayer(7.5f, 11.0f, 0.0f, 1308588059);
        }
        Paint paint4 = new Paint();
        this.f7476b = paint4;
        paint4.setAntiAlias(true);
        this.f7476b.setFilterBitmap(true);
        this.f7476b.setStyle(Paint.Style.FILL);
        this.f7476b.setStrokeCap(Paint.Cap.ROUND);
        this.f7476b.setStrokeWidth(this.f7477c);
        Paint paint5 = new Paint();
        this.f7475a = paint5;
        paint5.setAntiAlias(true);
        this.f7475a.setColor(-301790);
        this.f7475a.setStyle(Paint.Style.STROKE);
        this.f7475a.setStrokeCap(Paint.Cap.ROUND);
        this.f7475a.setStrokeWidth(this.d);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (qrs.af(this.f)) {
            this.i = qrs.d(this.f, 40.0f) + (this.y / 2.0f);
            this.o = qrs.d(this.f, 40.0f) + (this.y / 2.0f);
        } else if (qrs.v()) {
            this.i = qrs.d(this.f, 60.0f) + (this.y / 2.0f);
            this.o = qrs.d(this.f, 60.0f) + (this.y / 2.0f);
        } else {
            this.i = qrs.d(this.f, 53.5f) + (this.y / 2.0f);
            this.o = qrs.d(this.f, 53.5f) + (this.y / 2.0f);
        }
        float f = this.y / 2.0f;
        float f2 = this.i;
        float f3 = this.w;
        this.n = new RectF(f, f, f2 + f3, this.o + f3);
        if (qrs.af(this.f)) {
            this.m = i - (qrs.d(this.f, 40.0f) + (this.y / 2.0f));
            this.l = qrs.d(this.f, 40.0f) + (this.y / 2.0f);
        } else if (qrs.v()) {
            this.m = i - (qrs.d(this.f, 60.0f) + (this.y / 2.0f));
            this.l = qrs.d(this.f, 60.0f) + (this.y / 2.0f);
        } else {
            this.m = i - (qrs.d(this.f, 53.5f) + (this.y / 2.0f));
            this.l = qrs.d(this.f, 53.5f) + (this.y / 2.0f);
        }
        float f4 = this.m;
        float f5 = this.w;
        float f6 = this.l;
        this.k = new RectF(f4 - f5, f6 - f5, f4 + f5, f6 + f5);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (c(motionEvent.getX())) {
                return true;
            }
        } else {
            if (action == 1) {
                return true;
            }
            if (action == 2) {
                if (c(motionEvent.getX())) {
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean c(float f) {
        OnStepViewClickListener onStepViewClickListener;
        if (LanguageUtil.ba(this.f)) {
            if (f <= this.y / 2.0f || f >= this.i + this.w || (onStepViewClickListener = this.t) == null) {
                return false;
            }
            onStepViewClickListener.onStepViewRightCircleClick();
            return true;
        }
        if (f <= this.m - this.w) {
            return false;
        }
        OnStepViewClickListener onStepViewClickListener2 = this.t;
        if (onStepViewClickListener2 != null) {
            onStepViewClickListener2.onStepViewRightCircleClick();
        }
        return true;
    }

    public void setOnStepViewListener(OnStepViewClickListener onStepViewClickListener) {
        this.t = onStepViewClickListener;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
        a(canvas);
        Context context = this.f;
        if (context != null && LanguageUtil.ba(context)) {
            b(canvas, this.r, this.i, this.o);
        } else {
            b(canvas, this.s, this.m, this.l);
        }
    }

    private void b(Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < 60; i++) {
            if (i % 20 == 0) {
                if ((i * 6.0f) / 360.0f <= 0.016666668f + f && f > 0.0f) {
                    this.f7476b.setColor(-1390924);
                } else {
                    this.f7476b.setColor(-1073741825);
                }
                this.f7476b.setStrokeWidth(this.j);
                float f4 = this.w;
                float f5 = this.e;
                float f6 = f3 - f4;
                canvas.drawLine(f2, f6 - f5, f2, f6 + f5, this.f7476b);
            } else {
                if ((i * 6.0f) / 360.0f <= 0.015277778f + f && f > 0.0f) {
                    this.f7476b.setColor(-1121058);
                } else {
                    this.f7476b.setColor(1660944383);
                }
                this.f7476b.setStrokeWidth(this.h);
                float f7 = this.w;
                float f8 = this.e;
                float f9 = f3 - f7;
                canvas.drawLine(f2, f9 - f8, f2, f9 + f8, this.f7476b);
            }
            canvas.rotate(6.0f, f2, f3);
        }
    }

    private void a(Canvas canvas) {
        LogUtil.a("StepView", "drawCircle left ", Float.valueOf(this.r), " right ", Float.valueOf(this.s));
        e(canvas, this.m, this.l, this.s, this.k);
        e(canvas, this.i, this.o, this.r, this.n);
    }

    private void e(Canvas canvas, float f, float f2, float f3, RectF rectF) {
        if (f3 >= 1.0f) {
            canvas.drawCircle(f, f2, this.w, this.x);
            float fD = d(f3);
            canvas.save();
            canvas.rotate(fD * 360.0f, f, f2);
            canvas.drawCircle(f, f2 - this.w, this.u, this.p);
            canvas.restore();
            return;
        }
        canvas.drawArc(rectF, -90.0f, f3 * 360.0f, false, this.x);
    }

    private void c(Canvas canvas) {
        canvas.drawCircle(this.i, this.o, this.w, this.q);
        canvas.drawCircle(this.m, this.l, this.w, this.q);
    }

    public void setLeftProgress(float f) {
        if (f > 1.0f) {
            f = d(f) + 1.0f;
        }
        Context context = this.f;
        if (context != null && LanguageUtil.ba(context)) {
            setProgress(this.r, f);
        } else {
            setProgress(f, this.s);
        }
    }

    public void setRightProgress(float f) {
        if (f > 1.0f) {
            f = d(f) + 1.0f;
        }
        Context context = this.f;
        if (context != null && LanguageUtil.ba(context)) {
            setProgress(f, this.s);
        } else {
            setProgress(this.r, f);
        }
    }

    public void setProgress(float f, float f2) {
        this.r = f;
        this.s = f2;
        postInvalidate();
    }

    private float d(float f) {
        return f - ((float) Math.floor(f));
    }
}
