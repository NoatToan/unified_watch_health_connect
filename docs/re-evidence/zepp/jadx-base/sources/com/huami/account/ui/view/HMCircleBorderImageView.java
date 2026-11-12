package com.huami.account.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.account.ui.R;

/* JADX INFO: loaded from: classes4.dex */
public class HMCircleBorderImageView extends AppCompatImageView {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Paint i;
    private final Paint j;
    private Matrix k;
    private Matrix l;

    public HMCircleBorderImageView(Context context) {
        this(context, null);
    }

    private void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.k.set(getImageMatrix());
        this.i.setStyle(Paint.Style.FILL);
        this.i.setAntiAlias(true);
        this.i.setColor(this.h);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setAntiAlias(true);
        this.j.setColor(this.g);
        this.j.setStrokeWidth(this.f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int iWidth = getDrawable().getBounds().width();
        int iHeight = getDrawable().getBounds().height();
        if (iWidth <= 0 || iHeight <= 0) {
            return;
        }
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f = fMin / 2.0f;
        float f2 = f - this.f;
        float paddingLeft = getPaddingLeft() + f;
        float paddingTop = getPaddingTop() + f;
        if (this.h != 0) {
            canvas.drawCircle(paddingLeft, paddingTop, f, this.i);
        }
        int i = this.e;
        if (i == 0) {
            float f3 = fMin * 1.0f;
            float f4 = iWidth;
            float f5 = iHeight;
            float fMin2 = Math.min(f3 / f4, f3 / f5);
            this.l.set(this.k);
            this.l.postTranslate(paddingLeft - (f4 / 2.0f), paddingTop - (f5 / 2.0f));
            this.l.postScale(fMin2, fMin2, paddingLeft, paddingTop);
            setImageMatrix(this.l);
        } else if (i > 0 && f - i > 0.0f) {
            float f6 = iWidth;
            float f7 = iHeight;
            float fMin3 = Math.min((fMin - (i * 2.0f)) / f6, (fMin - (i * 2.0f)) / f7);
            this.l.set(this.k);
            this.l.postTranslate(paddingLeft - (f6 / 2.0f), paddingTop - (f7 / 2.0f));
            this.l.postScale(fMin3, fMin3, paddingLeft, paddingTop);
            setImageMatrix(this.l);
        }
        if (this.f <= 0 || f2 <= 0.0f) {
            return;
        }
        canvas.drawCircle(paddingLeft, paddingTop, f2, this.j);
    }

    public void setBorderWidth(int i) {
        this.f = i;
        this.j.setStrokeWidth(i);
        invalidate();
    }

    public HMCircleBorderImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HMCircleBorderImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = new Paint();
        this.j = new Paint();
        this.k = new Matrix();
        this.l = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HMCircleBorderImageView, i, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HMCircleBorderImageView_hm_civ_image_padding, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HMCircleBorderImageView_hm_civ_border_width, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.HMCircleBorderImageView_hm_civ_border_color, 0);
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.HMCircleBorderImageView_hm_civ_fill_color, 0);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
