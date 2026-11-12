package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.j1j;
import defpackage.o8p;

/* JADX INFO: loaded from: classes8.dex */
public class ShareBottomCard extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12892b;
    public Paint c;
    public Paint d;
    public Context e;

    public ShareBottomCard(Context context) {
        super(context);
        this.e = context;
        a();
    }

    public final void a() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-16777216);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(2.0f);
        this.d.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setColor(-16777216);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
        this.c.setTypeface(Typeface.DEFAULT_BOLD);
        this.c.setTextSize(DisplayUtil.sp2px(12.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float fDip2px = DisplayUtil.dip2px(5.0f);
        RectF rectF = new RectF();
        rectF.set(fDip2px, fDip2px, this.f12891a - fDip2px, this.f12892b - fDip2px);
        float f = fDip2px / 2.0f;
        canvas.drawRoundRect(rectF, f, f, this.d);
        float strokeWidth = this.d.getStrokeWidth();
        float fDip2px2 = (this.f12892b / 4) - DisplayUtil.dip2px(8.0f);
        this.d.setStrokeWidth(15.0f);
        int i = this.f12892b;
        canvas.drawCircle((i / 4) + fDip2px, (i / 4) + fDip2px, fDip2px2, this.d);
        this.d.setStrokeWidth(strokeWidth);
        this.c.setTextSize(DisplayUtil.sp2px(12.0f));
        String string = this.e.getString(j1j.f22328a);
        float fI = o8p.i(this.c);
        float f2 = 2.0f * fDip2px;
        float f3 = (this.f12892b / 2) + fDip2px;
        RectF rectF2 = new RectF(f3, f2, this.c.measureText(string) + f3, f2 + fI);
        canvas.drawText(string, rectF2.left, o8p.h(rectF2, this.c), this.c);
        String string2 = this.e.getString(j1j.l2);
        float f4 = rectF2.bottom;
        float f5 = (this.f12892b / 2) + fDip2px;
        RectF rectF3 = new RectF(f5, f4, this.c.measureText(string2) + f5, fI + f4);
        canvas.drawText(string2, rectF3.left, o8p.h(rectF3, this.c), this.c);
        float textSize = this.c.getTextSize();
        this.c.setTextSize(DisplayUtil.sp2px(9.8f));
        String string3 = getContext().getString(j1j.m2);
        int i2 = this.f12892b;
        RectF rectF4 = new RectF(f2, i2 / 2, this.c.measureText(string3) + f2, i2 - fDip2px);
        canvas.drawText(string3, rectF4.left, o8p.h(rectF4, this.c), this.c);
        this.c.setTextSize(textSize);
        canvas.restore();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        String string = this.e.getString(j1j.m2);
        this.c.setTextSize(DisplayUtil.sp2px(10.0f));
        this.f12891a = Math.max((int) (this.c.measureText(string) + DisplayUtil.dip2px(15.0f)), DisplayUtil.getScreenWidth() / 2);
        int size = View.MeasureSpec.getSize(i2);
        this.f12892b = size;
        setMeasuredDimension(this.f12891a, size);
    }

    public ShareBottomCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        a();
    }

    public ShareBottomCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = context;
        a();
    }
}
