package com.xiaomi.fitness.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.n9f;
import defpackage.pni;
import defpackage.uz6;

/* JADX INFO: loaded from: classes10.dex */
public class HealthDistributeSegmentView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uz6 f13342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f13343b;
    public Paint c;
    public Context d;
    public float e;
    public View f;
    public ImageView g;
    public Boolean h;
    public Boolean i;
    public Boolean j;

    public HealthDistributeSegmentView(Context context) {
        this(context, null);
        this.d = context;
    }

    public final Drawable a(int i) {
        if (i == 1) {
            return AppUtil.getApp().getDrawable(pni.o3);
        }
        if (i != 2) {
            return i != 3 ? AppUtil.getApp().getDrawable(pni.s3) : AppUtil.getApp().getDrawable(pni.m3);
        }
        return AppUtil.getApp().getDrawable(pni.q3);
    }

    public final n9f b(int i) {
        if (i == 0) {
            return new n9f(20.0f, 0.0f);
        }
        if (i == 1) {
            return new n9f(30.0f, 10.0f);
        }
        if (i != 2) {
            return i != 3 ? new n9f(0.0f, 0.0f) : new n9f(40.0f, 20.0f);
        }
        return this.j.booleanValue() ? new n9f(60.0f, 20.0f) : new n9f(80.0f, 60.0f);
    }

    public final void c() {
        this.e = DisplayUtil.dip2px(5.0f);
        Paint paint = new Paint();
        this.f13343b = paint;
        paint.reset();
        this.f13343b.setAntiAlias(true);
        Paint paint2 = this.f13343b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f13343b.setColor(-16777216);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.reset();
        this.c.setAntiAlias(true);
        this.c.setTextSize(DisplayUtil.sp2px(12.0f));
        this.c.setStyle(style);
        this.c.setTypeface(Typeface.DEFAULT_BOLD);
        this.c.setColor(-1);
    }

    public void d(uz6 uz6Var, View view, ImageView imageView, Boolean bool, Boolean bool2) {
        this.f13342a = uz6Var;
        this.f = view;
        this.g = imageView;
        this.h = bool;
        this.j = bool2;
        invalidate();
    }

    public final void e() {
        ObjectAnimator objectAnimatorOfFloat = this.h.booleanValue() ? ObjectAnimator.ofFloat(this.f, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f) : ObjectAnimator.ofFloat(this.f, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f13342a == null) {
            return;
        }
        canvas.save();
        new RectF().set(0.0f, 0.0f, getWidth(), getHeight());
        DisplayUtil.dip2px(10.0f);
        float width = getWidth();
        RectF rectF = new RectF();
        uz6 uz6Var = this.f13342a;
        int i = uz6Var.f39601a;
        float fDip2px = ((float) i) != 0.0f ? (i / 100.0f) * width : width;
        n9f n9fVarB = b(uz6Var.e());
        float f = ((n9fVarB.f27682b / 100.0f) * width) + 0.0f;
        float f2 = ((n9fVarB.f27681a / 100.0f) * width) + 0.0f;
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = (int) Math.abs(f2 - f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart((int) f);
        this.f.setLayoutParams(marginLayoutParams);
        this.g.setBackground(a(this.f13342a.e()));
        if (this.f13342a.e() == 0) {
            int i2 = this.f13342a.f39601a;
            fDip2px = i2 < 10 ? (i2 / 10.0f) * width : width * 0.9f;
        }
        if (fDip2px < DisplayUtil.dip2px(35.0f)) {
            fDip2px = DisplayUtil.dip2px(35.0f);
        }
        if (this.i != this.h) {
            e();
            this.i = this.h;
        }
        float f3 = fDip2px + 0.0f;
        float f4 = getLayoutDirection() == 1 ? width - 0.0f : 0.0f;
        if (getLayoutDirection() == 1) {
            f3 = width - f3;
        }
        rectF.set(f4, 0.0f, f3, getHeight());
        int color = this.f13343b.getColor();
        this.f13343b.setColor(this.f13342a.a());
        this.f13343b.setAlpha(255);
        float f5 = this.e;
        canvas.drawRoundRect(rectF, f5, f5, this.f13343b);
        this.f13343b.setColor(color);
    }

    public HealthDistributeSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.d = context;
    }

    public HealthDistributeSegmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
        c();
    }
}
