package com.huami.sleepassistant.lib.widget.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.sleepassistant.lib.R;

/* JADX INFO: loaded from: classes13.dex */
public class CircleImageView extends AppCompatImageView {
    private static final boolean A = false;
    private static final ImageView.ScaleType u = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config v = Bitmap.Config.ARGB_8888;
    private static final int w = 2;
    private static final int x = 0;
    private static final int y = -16777216;
    private static final int z = 0;
    private final RectF a;
    private final RectF b;
    private final Matrix c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private int g;
    private int h;
    private int i;
    private Bitmap j;
    private BitmapShader k;
    private int l;
    private int m;
    private float n;
    private float o;
    private ColorFilter p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;

    public CircleImageView(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = -16777216;
        this.h = 0;
        this.i = 0;
        d();
    }

    private void a() {
        Paint paint = this.d;
        if (paint != null) {
            paint.setColorFilter(this.p);
        }
    }

    private RectF b() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = getPaddingLeft() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    private Bitmap c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), v);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void d() {
        super.setScaleType(u);
        this.q = true;
        if (this.r) {
            f();
            this.r = false;
        }
    }

    private void e() {
        if (this.t) {
            this.j = null;
        } else {
            this.j = c(getDrawable());
        }
        f();
    }

    private void f() {
        int i;
        if (!this.q) {
            this.r = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.j == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.j;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.k = new BitmapShader(bitmap, tileMode, tileMode);
        this.d.setAntiAlias(true);
        this.d.setShader(this.k);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setAntiAlias(true);
        this.e.setColor(this.g);
        this.e.setStrokeWidth(this.h);
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAntiAlias(true);
        this.f.setColor(this.i);
        this.m = this.j.getHeight();
        this.l = this.j.getWidth();
        this.b.set(b());
        this.o = Math.min((this.b.height() - this.h) / 2.0f, (this.b.width() - this.h) / 2.0f);
        this.a.set(this.b);
        if (!this.s && (i = this.h) > 0) {
            this.a.inset(i - 1.0f, i - 1.0f);
        }
        this.n = Math.min(this.a.height() / 2.0f, this.a.width() / 2.0f);
        a();
        g();
        invalidate();
    }

    private void g() {
        float fWidth;
        float fHeight;
        this.c.set(null);
        float fWidth2 = 0.0f;
        if (this.l * this.a.height() > this.a.width() * this.m) {
            fWidth = this.a.height() / this.m;
            fWidth2 = (this.a.width() - (this.l * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = this.a.width() / this.l;
            fHeight = (this.a.height() - (this.m * fWidth)) * 0.5f;
        }
        this.c.setScale(fWidth, fWidth);
        Matrix matrix = this.c;
        RectF rectF = this.a;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.k.setLocalMatrix(this.c);
    }

    public int getBorderColor() {
        return this.g;
    }

    public int getBorderWidth() {
        return this.h;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.p;
    }

    @Deprecated
    public int getFillColor() {
        return this.i;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return u;
    }

    public boolean isBorderOverlay() {
        return this.s;
    }

    public boolean isDisableCircularTransformation() {
        return this.t;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.t) {
            super.onDraw(canvas);
            return;
        }
        if (this.j == null) {
            return;
        }
        if (this.i != 0) {
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.n, this.f);
        }
        canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.n, this.d);
        if (this.h > 0) {
            canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.o, this.e);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h, int oldW, int oldH) {
        super.onSizeChanged(w2, h, oldW, oldH);
        f();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean adjustViewBounds) {
        if (adjustViewBounds) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int borderColor) {
        if (borderColor == this.g) {
            return;
        }
        this.g = borderColor;
        this.e.setColor(borderColor);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(@ColorRes int borderColorRes) {
        setBorderColor(getContext().getResources().getColor(borderColorRes));
    }

    public void setBorderOverlay(boolean borderOverlay) {
        if (borderOverlay == this.s) {
            return;
        }
        this.s = borderOverlay;
        f();
    }

    public void setBorderWidth(int borderWidth) {
        if (borderWidth == this.h) {
            return;
        }
        this.h = borderWidth;
        f();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter cf) {
        if (cf == this.p) {
            return;
        }
        this.p = cf;
        a();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean disableCircularTransformation) {
        if (this.t == disableCircularTransformation) {
            return;
        }
        this.t = disableCircularTransformation;
        e();
    }

    @Deprecated
    public void setFillColor(@ColorInt int fillColor) {
        if (fillColor == this.i) {
            return;
        }
        this.i = fillColor;
        this.f.setColor(fillColor);
        invalidate();
    }

    @Deprecated
    public void setFillColorResource(@ColorRes int fillColorRes) {
        setFillColor(getContext().getResources().getColor(fillColorRes));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int resId) {
        super.setImageResource(resId);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        f();
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        super.setPaddingRelative(start, top, end, bottom);
        f();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != u) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = -16777216;
        this.h = 0;
        this.i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.Sls_CircleImageView, defStyle, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Sls_CircleImageView_sls_civ_border_width, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_CircleImageView_sls_civ_border_color, -16777216);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Sls_CircleImageView_sls_civ_border_overlay, false);
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_CircleImageView_sls_civ_fill_color, 0);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }
}
