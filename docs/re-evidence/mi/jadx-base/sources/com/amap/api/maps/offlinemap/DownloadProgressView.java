package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.w3j;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6464b;
    private int c;
    private float d;
    private float e;
    private TextPaint f;
    private TextPaint g;
    private float h;
    private float i;

    public DownloadProgressView(Context context) {
        super(context);
        this.f6464b = MenuBuilder.CATEGORY_MASK;
        this.c = MenuBuilder.CATEGORY_MASK;
        this.d = 0.0f;
        this.e = 0.6f;
        a(null, 0);
    }

    private void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w3j.f37516a, i, 0);
        this.f6463a = typedArrayObtainStyledAttributes.getString(0);
        this.f6464b = typedArrayObtainStyledAttributes.getColor(3, this.f6464b);
        this.d = typedArrayObtainStyledAttributes.getDimension(1, this.d);
        this.c = typedArrayObtainStyledAttributes.getColor(2, this.c);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setFlags(1);
        this.f.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        textPaint2.setStyle(Paint.Style.FILL);
        a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int width = (getWidth() - paddingLeft) - paddingRight;
        int height = (getHeight() - paddingTop) - paddingBottom;
        double d = height * 0.8f;
        float f = width;
        String str = String.valueOf((int) (this.e * 100.0f)) + "%";
        canvas.drawRect(new Rect(0, (int) d, (int) (f * this.e), height), this.g);
        canvas.drawText(str, (int) (this.e * f), (int) (d - 3.0d), this.f);
    }

    public void setProgress(int i) {
        if (i > 100 || i < 0) {
            return;
        }
        this.e = i / 100.0f;
        invalidate();
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6464b = MenuBuilder.CATEGORY_MASK;
        this.c = MenuBuilder.CATEGORY_MASK;
        this.d = 0.0f;
        this.e = 0.6f;
        a(attributeSet, 0);
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6464b = MenuBuilder.CATEGORY_MASK;
        this.c = MenuBuilder.CATEGORY_MASK;
        this.d = 0.0f;
        this.e = 0.6f;
        a(attributeSet, i);
    }

    private void a() {
        this.f.setTextSize(this.d);
        this.f.setColor(this.f6464b);
        this.g.setColor(this.c);
        this.h = this.f.measureText(this.f6463a);
        this.i = this.f.getFontMetrics().bottom;
    }
}
