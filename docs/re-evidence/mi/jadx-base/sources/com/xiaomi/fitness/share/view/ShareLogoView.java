package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.w4j;

/* JADX INFO: loaded from: classes8.dex */
public class ShareLogoView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12896b;
    public int c;
    public Paint d;
    public Context e;
    public int f;
    public int g;

    public ShareLogoView(Context context) {
        this(context, null);
    }

    public final void a() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(this.g);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(this.f);
        this.d.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float fDip2px = DisplayUtil.dip2px(5.0f);
        int i = this.c;
        canvas.drawCircle((i / 2) + fDip2px, (i / 2) + fDip2px, (i / 2) - (2.0f * fDip2px), this.d);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12896b = View.MeasureSpec.getSize(i);
        this.c = View.MeasureSpec.getSize(i2);
    }

    public ShareLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12895a = 10;
        this.e = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.Q3, i, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(w4j.S3, 10);
        this.g = typedArrayObtainStyledAttributes.getColor(w4j.R3, -1);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
