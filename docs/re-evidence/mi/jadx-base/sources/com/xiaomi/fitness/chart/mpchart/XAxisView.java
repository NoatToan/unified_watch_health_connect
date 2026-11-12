package com.xiaomi.fitness.chart.mpchart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.aji;
import defpackage.g4j;
import defpackage.o8p;

/* JADX INFO: loaded from: classes7.dex */
public class XAxisView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f11771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f11772b;
    public int c;
    public float d;

    public XAxisView(Context context) {
        super(context);
        this.f11771a = new String[]{"00:00", "12:00", "24:00"};
        a();
    }

    public final void a() {
        Paint paint = new Paint();
        this.f11772b = paint;
        paint.reset();
        this.f11772b.setAntiAlias(true);
        this.f11772b.setStyle(Paint.Style.FILL);
        this.f11772b.setColor(this.c);
        this.f11772b.setTextSize(this.d);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fMeasureText = this.f11772b.measureText(this.f11771a[0]);
        float width = getWidth();
        String[] strArr = this.f11771a;
        float length = (width - (strArr.length * fMeasureText)) / (strArr.length - 1);
        getBottom();
        float fI = o8p.i(this.f11772b);
        for (int i = 0; i < this.f11771a.length; i++) {
            float left = getLeft() + (i * (length + fMeasureText));
            RectF rectF = new RectF(left, getTop(), left + fMeasureText, getBottom());
            o8p.h(rectF, this.f11772b);
            canvas.drawText(this.f11771a[i], rectF.left, fI / 2.0f, this.f11772b);
        }
    }

    public void setValues(String[] strArr) {
        this.f11771a = strArr;
        invalidate();
    }

    public XAxisView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11771a = new String[]{"00:00", "12:00", "24:00"};
        a();
    }

    public XAxisView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11771a = new String[]{"00:00", "12:00", "24:00"};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4j.ca);
        this.c = typedArrayObtainStyledAttributes.getColor(g4j.da, getResources().getColor(aji.g0));
        this.d = typedArrayObtainStyledAttributes.getDimension(g4j.ea, DisplayUtil.sp2px(8.0f));
        a();
        typedArrayObtainStyledAttributes.recycle();
    }
}
