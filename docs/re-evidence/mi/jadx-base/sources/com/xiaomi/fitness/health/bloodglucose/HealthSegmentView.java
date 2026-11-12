package com.xiaomi.fitness.health.bloodglucose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil.FingerMealTimeRecycleModel;
import defpackage.iji;
import defpackage.o8p;

/* JADX INFO: loaded from: classes9.dex */
public class HealthSegmentView<T extends BloodGlucoseDataUtil.FingerMealTimeRecycleModel> extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f12223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f12224b;
    public Paint c;
    public Context d;
    public float e;

    public HealthSegmentView(Context context) {
        this(context, null);
        this.d = context;
    }

    public final void a(Context context, Canvas canvas, T t, RectF rectF, float f, float f2) {
        RectF rectF2 = new RectF();
        String drawText = t.getDrawText();
        if (drawText.equals("--")) {
            this.c.setColor(context.getColor(iji.r3));
            this.c.setAlpha(102);
        }
        float fMeasureText = this.c.measureText(drawText) + f;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 1) {
            f = f2 - f;
        }
        if (layoutDirection == 1) {
            fMeasureText = f2 - fMeasureText;
        }
        rectF2.set(f, rectF.top, fMeasureText, rectF.bottom);
        float fH = o8p.h(rectF2, this.c);
        Typeface typeface = this.c.getTypeface();
        if (layoutDirection == 1) {
            f = fMeasureText;
        }
        canvas.drawText(drawText, f, fH, this.c);
        this.c.setTypeface(typeface);
    }

    public final void b() {
        this.e = DisplayUtil.dip2px(10.0f);
        Paint paint = new Paint();
        this.f12224b = paint;
        paint.reset();
        this.f12224b.setAntiAlias(true);
        Paint paint2 = this.f12224b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f12224b.setColor(-16777216);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.reset();
        this.c.setAntiAlias(true);
        this.c.setTextSize(DisplayUtil.sp2px(10.0f));
        this.c.setStyle(style);
        this.c.setTypeface(Typeface.DEFAULT_BOLD);
        this.c.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f12223a == null) {
            return;
        }
        canvas.save();
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float fDip2px = DisplayUtil.dip2px(10.0f);
        float width = getWidth();
        RectF rectF2 = new RectF();
        float drawPercent = (this.f12223a.getDrawPercent() * width) / 100.0f;
        if (drawPercent < DisplayUtil.dip2px(30.0f) && this.f12223a.getDrawPercent() > 0.0f) {
            drawPercent = DisplayUtil.dip2px(30.0f);
        }
        float f = drawPercent + 0.0f;
        float f2 = getLayoutDirection() == 1 ? width - 0.0f : 0.0f;
        if (getLayoutDirection() == 1) {
            f = width - f;
        }
        rectF2.set(f2, 0.0f, f, getHeight());
        int color = this.f12224b.getColor();
        this.f12224b.setColor(this.f12223a.getDrawColor());
        this.f12224b.setAlpha(255);
        float f3 = this.e;
        canvas.drawRoundRect(rectF2, f3, f3, this.f12224b);
        this.f12224b.setAlpha(21);
        float f4 = this.e;
        canvas.drawRoundRect(rectF, f4, f4, this.f12224b);
        this.f12224b.setColor(color);
        a(this.d, canvas, this.f12223a, rectF2, fDip2px, width);
    }

    public void setModel(T t) {
        this.f12223a = t;
        invalidate();
    }

    public HealthSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.d = context;
    }

    public HealthSegmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
        b();
    }
}
