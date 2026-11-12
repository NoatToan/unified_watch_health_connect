package com.huami.android.zxing;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.huami.android.qrcode.R;
import com.huami.android.zxing.camera.CameraManager;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewfinderView extends View {
    private static final long r = 15;
    private static final int s = 10;
    private int a;
    private int b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final Paint m;
    private int n;
    private CameraManager o;
    private final Paint p;
    public Rect q;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.n = 2147483637;
        this.q = new Rect(0, 0, 0, 0);
        a(context, attributeSet);
        Resources resources = context.getResources();
        this.j = resources.getDimensionPixelSize(R.dimen.border_width);
        this.i = resources.getDimensionPixelSize(R.dimen.border_length);
        this.k = resources.getDimensionPixelSize(R.dimen.border_padding);
        this.a = resources.getDimensionPixelSize(R.dimen.scan_font_size);
        this.b = resources.getDimensionPixelSize(R.dimen.scan_font_top_margin);
        this.c = resources.getString(R.string.scan_label);
        this.e = resources.getDimensionPixelSize(R.dimen.title_top_margin);
        this.l = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
        this.h = resources.getColor(R.color.viewfinder_mask);
        this.p = new Paint(1);
        Paint paint = new Paint(1);
        this.m = paint;
        paint.setColor(this.g);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null || context == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewfinderView);
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_cornerColor, this.f);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_scannerColor, this.g);
    }

    public void drawViewfinder() {
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        if (this.o == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect framingRect = this.o.getFramingRect();
        Rect framingRectInPreview = this.o.getFramingRectInPreview();
        if (framingRect == null || framingRectInPreview == null) {
            return;
        }
        framingRect.width();
        int i = framingRect.left;
        int i2 = framingRect.top;
        int i3 = framingRect.bottom;
        int i4 = framingRect.right;
        this.p.setColor(this.h);
        float f = measuredWidth;
        float f2 = i2;
        canvas.drawRect(0.0f, 0.0f, f, f2, this.p);
        float f3 = i3 + 1;
        canvas.drawRect(0.0f, f2, i, f3, this.p);
        canvas.drawRect(i4 + 1, f2, f, f3, this.p);
        canvas.drawRect(0.0f, f3, f, measuredHeight, this.p);
        this.p.setColor(this.f);
        int i5 = this.j;
        int i6 = this.k;
        int i7 = i + i5 + i6;
        int i8 = i4 - (i5 + i6);
        int i9 = i2 + i5 + i6;
        int i10 = i3 - (i6 + i5);
        float f4 = i7;
        float f5 = i9;
        canvas.drawRect(f4, f5, this.i + i7, i5 + i9, this.p);
        float f6 = i8;
        canvas.drawRect(i8 - this.i, f5, f6, this.j + i9, this.p);
        float f7 = i10;
        canvas.drawRect(f4, i10 - this.j, this.i + i7, f7, this.p);
        canvas.drawRect(i8 - this.i, i10 - this.j, f6, f7, this.p);
        canvas.drawRect(f4, f5, this.j + i7, this.i + i9, this.p);
        canvas.drawRect(f4, i10 - this.i, this.j + i7, f7, this.p);
        canvas.drawRect(i8 - this.j, f5, f6, this.i + i9, this.p);
        canvas.drawRect(i8 - this.j, i10 - this.i, f6, f7, this.p);
        this.p.setColor(-16777216);
        int i11 = this.n + 10;
        this.n = i11;
        if (i11 >= i10) {
            this.n = i9 - this.l;
        }
        int i12 = this.n;
        int i13 = this.l + i12;
        if (i13 > i10) {
            i13 = i10;
        }
        Rect rect = this.q;
        rect.left = i7;
        rect.bottom = i13;
        rect.right = i8;
        if (i12 < i9) {
            rect.top = i9;
        } else {
            rect.top = i12;
        }
        canvas.drawRect(rect, this.m);
        canvas.save();
        canvas.restore();
        this.p.setColor(-1);
        this.p.setTextSize(this.a);
        String[] strArrSplit = this.c.split("\n");
        if (strArrSplit == null || strArrSplit.length == 0) {
            return;
        }
        float fDescent = this.b + i10;
        for (String str : strArrSplit) {
            if (str != null) {
                int iMeasureText = (measuredWidth - ((int) this.p.measureText(str))) / 2;
                if (iMeasureText <= 0) {
                    iMeasureText = i7;
                }
                fDescent += this.p.descent() - this.p.ascent();
                canvas.drawText(str, iMeasureText, fDescent, this.p);
            }
        }
        String str2 = this.d;
        if (str2 != null) {
            int iMeasureText2 = (measuredWidth - ((int) this.p.measureText(str2))) / 2;
            if (iMeasureText2 <= 0) {
                iMeasureText2 = i7;
            }
            canvas.drawText(this.d, iMeasureText2, this.e, this.p);
        }
        postInvalidateDelayed(15L, i7, i9, i8, i10);
    }

    public void setCameraManager(CameraManager cameraManager) {
        this.o = cameraManager;
    }

    public void setLabel(String str) {
        this.c = str;
    }

    public void setTitle(String str) {
        this.d = str;
    }
}
