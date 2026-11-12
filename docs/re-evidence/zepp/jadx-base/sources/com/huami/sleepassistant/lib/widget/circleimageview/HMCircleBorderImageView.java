package com.huami.sleepassistant.lib.widget.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.sleepassistant.lib.R;

/* JADX INFO: loaded from: classes13.dex */
public class HMCircleBorderImageView extends AppCompatImageView {
    private static final int i = 0;
    private static final int j = 0;
    private static final int k = 0;
    private static final int l = 0;
    private final Paint a;
    private final Paint b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final Matrix g;
    private final Matrix h;

    public HMCircleBorderImageView(Context context) {
        this(context, null);
    }

    private void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.g.set(getImageMatrix());
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAntiAlias(true);
        this.a.setColor(this.f);
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setAntiAlias(true);
        this.b.setColor(this.e);
        this.b.setStrokeWidth(this.d);
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
        float f2 = f - this.d;
        float paddingLeft = getPaddingLeft() + f;
        float paddingTop = getPaddingTop() + f;
        if (this.f != 0) {
            canvas.drawCircle(paddingLeft, paddingTop, f, this.a);
        }
        int i2 = this.c;
        if (i2 == 0) {
            float f3 = fMin * 1.0f;
            float f4 = iWidth;
            float f5 = iHeight;
            float fMin2 = Math.min(f3 / f4, f3 / f5);
            this.h.set(this.g);
            this.h.postTranslate(paddingLeft - (f4 / 2.0f), paddingTop - (f5 / 2.0f));
            this.h.postScale(fMin2, fMin2, paddingLeft, paddingTop);
            setImageMatrix(this.h);
        } else if (i2 > 0 && f - i2 > 0.0f) {
            float f6 = iWidth;
            float f7 = iHeight;
            float fMin3 = Math.min((fMin - (i2 * 2.0f)) / f6, (fMin - (i2 * 2.0f)) / f7);
            this.h.set(this.g);
            this.h.postTranslate(paddingLeft - (f6 / 2.0f), paddingTop - (f7 / 2.0f));
            this.h.postScale(fMin3, fMin3, paddingLeft, paddingTop);
            setImageMatrix(this.h);
        }
        if (this.d <= 0 || f2 <= 0.0f) {
            return;
        }
        canvas.drawCircle(paddingLeft, paddingTop, f2, this.b);
    }

    public void setBorderWidth(int borderWidth) {
        this.d = borderWidth;
        this.b.setStrokeWidth(borderWidth);
        invalidate();
    }

    public HMCircleBorderImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HMCircleBorderImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = new Paint();
        this.b = new Paint();
        this.g = new Matrix();
        this.h = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.Sls_HMCircleBorderImageView, defStyleAttr, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Sls_HMCircleBorderImageView_sls_hm_civ_image_padding, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Sls_HMCircleBorderImageView_sls_hm_civ_border_width, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_HMCircleBorderImageView_sls_hm_civ_border_color, 0);
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_HMCircleBorderImageView_sls_hm_civ_fill_color, 0);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
