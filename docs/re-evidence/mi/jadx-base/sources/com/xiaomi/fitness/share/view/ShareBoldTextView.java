package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.o8p;
import defpackage.w4j;

/* JADX INFO: loaded from: classes8.dex */
public class ShareBoldTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f12888b;
    public int c;
    public int d;
    public int e;
    public float f;
    public Paint g;

    public ShareBoldTextView(Context context) {
        this(context, null);
    }

    public float d(String str) {
        return this.f12888b.measureText(str);
    }

    public final void f() {
        Paint paint = new Paint();
        this.f12888b = paint;
        paint.setColor(getCurrentTextColor());
        this.f12888b.setStyle(Paint.Style.STROKE);
        this.f12888b.setStrokeWidth(this.e);
        this.f12888b.setTextSize(this.f);
        this.f12888b.setFakeBoldText(true);
        this.f12888b.setAntiAlias(true);
    }

    public final void g() {
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(getCurrentTextColor());
        this.g.setStyle(Paint.Style.FILL);
        this.g.setTextSize(this.f);
        this.g.setFakeBoldText(true);
        this.g.setAntiAlias(true);
    }

    public float getTextWidth() {
        return this.f12888b.measureText(getText().toString());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        String string = getText().toString();
        float fI = o8p.i(this.f12888b);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, this.c, fI);
        canvas.drawText(string, 0.0f, o8p.h(rectF, this.f12888b), this.f12888b);
        canvas.drawText(string, 0.0f, o8p.h(rectF, this.g), this.g);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = View.MeasureSpec.getSize(i);
        this.d = View.MeasureSpec.getSize(i2);
    }

    public ShareBoldTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareBoldTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12887a = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.K3, i, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(w4j.M3, 8);
        this.f = typedArrayObtainStyledAttributes.getDimension(w4j.L3, DisplayUtil.sp2px(60.0f));
        typedArrayObtainStyledAttributes.recycle();
        f();
        g();
    }
}
