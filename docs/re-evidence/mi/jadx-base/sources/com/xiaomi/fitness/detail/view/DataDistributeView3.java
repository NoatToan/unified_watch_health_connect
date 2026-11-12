package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.uz6;
import defpackage.w4j;

/* JADX INFO: loaded from: classes8.dex */
public class DataDistributeView3 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uz6 f11869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f11870b;
    public Context c;
    public float d;

    public DataDistributeView3(Context context) {
        this(context, null);
        this.c = context;
    }

    public final void a() {
        Paint paint = new Paint();
        this.f11870b = paint;
        paint.reset();
        this.f11870b.setAntiAlias(true);
        this.f11870b.setStyle(Paint.Style.FILL);
        this.f11870b.setColor(-16777216);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11869a == null) {
            return;
        }
        canvas.save();
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f11870b.setColor(this.f11869a.a());
        this.f11870b.setAlpha(18);
        float f = this.d;
        canvas.drawRoundRect(rectF, f, f, this.f11870b);
        RectF rectF2 = new RectF();
        float width = getWidth() * (this.f11869a.b() / 100.0f);
        if (width > getWidth()) {
            width = getWidth();
        }
        int width2 = getWidth();
        float f2 = getLayoutDirection() == 1 ? width2 : 0.0f;
        if (getLayoutDirection() == 1) {
            width = width2 - width;
        }
        rectF2.set(f2, 0.0f, width, getHeight());
        this.f11870b.setAlpha(255);
        float f3 = this.d;
        canvas.drawRoundRect(rectF2, f3, f3, this.f11870b);
        canvas.restore();
    }

    public void setModel(uz6 uz6Var) {
        this.f11869a = uz6Var;
        invalidate();
    }

    public DataDistributeView3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.c = context;
    }

    public DataDistributeView3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.v0);
            this.d = typedArrayObtainStyledAttributes.getDimension(w4j.w0, DisplayUtil.dip2px(4.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        a();
    }
}
