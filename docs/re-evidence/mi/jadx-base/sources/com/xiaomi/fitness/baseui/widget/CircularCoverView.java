package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class CircularCoverView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11674b;
    public int c;
    public int d;
    public int e;

    public CircularCoverView(Context context) {
        this(context, null, 0);
    }

    public final Bitmap a(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(this.e);
        int i3 = this.f11673a;
        canvas.drawRect(new RectF(0.0f, 0.0f, i3, i3), paint);
        int height = getHeight();
        int i4 = this.f11674b;
        canvas.drawRect(new RectF(0.0f, height - i4, i4, getHeight()), paint);
        canvas.drawRect(new RectF(getWidth() - this.c, 0.0f, getWidth(), this.c), paint);
        canvas.drawRect(new RectF(getWidth() - this.d, getHeight() - this.d, getWidth(), getHeight()), paint);
        return bitmapCreateBitmap;
    }

    public final Bitmap b(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-13244);
        int i3 = this.f11673a;
        canvas.drawArc(new RectF(0.0f, 0.0f, i3 * 2, i3 * 2), 180.0f, 90.0f, true, paint);
        int height = getHeight();
        int i4 = this.f11674b;
        canvas.drawArc(new RectF(0.0f, height - (i4 * 2), i4 * 2, getHeight()), 90.0f, 90.0f, true, paint);
        canvas.drawArc(new RectF(getWidth() - (this.c * 2), 0.0f, getWidth(), this.c * 2), 270.0f, 90.0f, true, paint);
        canvas.drawArc(new RectF(getWidth() - (this.d * 2), getHeight() - (this.d * 2), getWidth(), getHeight()), 0.0f, 90.0f, true, paint);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setFilterBitmap(false);
        paint.setStyle(Paint.Style.FILL);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawBitmap(b(getWidth(), getHeight()), 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawBitmap(a(getWidth(), getHeight()), 0.0f, 0.0f, paint);
        paint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void setCoverColor(int i) {
        this.e = i;
    }

    public CircularCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11673a = 30;
        this.f11674b = 30;
        this.c = 30;
        this.d = 30;
        this.e = -1381654;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.U);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.X, this.f11673a);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.W, this.f11674b);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.Z, this.c);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.Y, this.d);
        if (AppUtil.isRTLDirection()) {
            this.f11673a = dimensionPixelSize3;
            this.f11674b = dimensionPixelSize4;
            this.c = dimensionPixelSize;
            this.d = dimensionPixelSize2;
        } else {
            this.f11673a = dimensionPixelSize;
            this.f11674b = dimensionPixelSize2;
            this.c = dimensionPixelSize3;
            this.d = dimensionPixelSize4;
        }
        this.e = typedArrayObtainStyledAttributes.getColor(z4j.V, this.e);
        typedArrayObtainStyledAttributes.recycle();
    }
}
