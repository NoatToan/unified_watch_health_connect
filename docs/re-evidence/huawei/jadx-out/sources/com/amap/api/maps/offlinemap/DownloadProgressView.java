package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.map3d.R;

/* JADX INFO: loaded from: classes21.dex */
public class DownloadProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3448c;
    private float d;
    private float e;
    private TextPaint f;
    private TextPaint g;
    private float h;
    private float i;

    public DownloadProgressView(Context context) {
        super(context);
        this.f3447b = SupportMenu.CATEGORY_MASK;
        this.f3448c = SupportMenu.CATEGORY_MASK;
        this.d = 0.0f;
        this.e = 0.6f;
        a(null, 0);
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3447b = SupportMenu.CATEGORY_MASK;
        this.f3448c = SupportMenu.CATEGORY_MASK;
        this.d = 0.0f;
        this.e = 0.6f;
        a(attributeSet, 0);
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3447b = SupportMenu.CATEGORY_MASK;
        this.f3448c = SupportMenu.CATEGORY_MASK;
        this.d = 0.0f;
        this.e = 0.6f;
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f3366a, i, 0);
        this.f3446a = typedArrayObtainStyledAttributes.getString(0);
        this.f3447b = typedArrayObtainStyledAttributes.getColor(3, this.f3447b);
        this.d = typedArrayObtainStyledAttributes.getDimension(1, this.d);
        this.f3448c = typedArrayObtainStyledAttributes.getColor(2, this.f3448c);
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

    private void a() {
        this.f.setTextSize(this.d);
        this.f.setColor(this.f3447b);
        this.g.setColor(this.f3448c);
        this.h = this.f.measureText(this.f3446a);
        this.i = this.f.getFontMetrics().bottom;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = (getHeight() - paddingTop) - paddingBottom;
        double d = height * 0.8f;
        float f = (width - paddingLeft) - paddingRight;
        double d2 = this.e * f;
        String str = String.valueOf((int) (this.e * 100.0f)) + "%";
        canvas.drawRect(new Rect(0, (int) d, (int) (f * this.e), height), this.g);
        canvas.drawText(str, (int) d2, (int) (d - 3.0d), this.f);
    }

    public void setProgress(int i) {
        if (i > 100 || i < 0) {
            return;
        }
        this.e = i / 100.0f;
        invalidate();
    }
}
