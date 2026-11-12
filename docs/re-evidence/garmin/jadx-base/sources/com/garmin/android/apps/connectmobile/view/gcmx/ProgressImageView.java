package com.garmin.android.apps.connectmobile.view.gcmx;

import a7.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressImageView extends AppCompatImageView {
    public static final Bitmap.Config E = Bitmap.Config.ARGB_8888;
    public Paint A;
    public int B;
    public AnimatorSet C;
    public int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f47650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f47651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f47652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f47653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f47654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f47655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f47656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f47657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f47658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f47659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f47660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f47661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f47662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f47663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f47664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f47665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f47667r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f47668t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f47669v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f47671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f47672y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f47673z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ProgressImageView progressImageView = ProgressImageView.this;
            progressImageView.setBorderColor(b.getColor(progressImageView.getContext(), R.color.gcm_progress_border_sync_color));
        }
    }

    public ProgressImageView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47650a = new RectF();
        this.f47651b = new RectF();
        this.f47652c = new Rect();
        this.f47653d = new Paint(1);
        this.f47654e = new Paint(1);
        this.f47655f = new Paint(1);
        this.f47656g = 0.0f;
        this.f47657h = 0.0f;
        this.f47658i = 0.0f;
        this.f47659j = 0;
        this.f47660k = 0;
        this.f47661l = 0;
        this.f47662m = 0;
        this.f47670w = true;
        this.A = new Paint();
        this.D = 3;
        int color = b.getColor(context, R.color.gcm_progress_border_sync_color);
        this.f47660k = color;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149716r, i14, 0);
        this.f47656g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f47657h = dimensionPixelSize;
        if (dimensionPixelSize == 0.0f) {
            this.f47657h = this.f47656g;
        }
        this.f47659j = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.f47668t = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f47661l = typedArrayObtainStyledAttributes.getColor(4, 0);
        typedArrayObtainStyledAttributes.getColor(5, 0);
        this.f47660k = typedArrayObtainStyledAttributes.getColor(7, color);
        this.f47662m = typedArrayObtainStyledAttributes.getColor(6, 0);
        this.f47671x = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 15);
        this.f47658i = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    public final void c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f47664o);
        this.f47665p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f47665p.addUpdateListener(new w22.a(this));
        this.f47665p.addListener(new w22.b(this));
        this.f47666q = true;
        if (this.f47667r) {
            e();
            this.f47667r = false;
        }
    }

    public final void d() {
        Bitmap bitmap = null;
        if (this.f47669v) {
            this.f47663n = null;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        boolean z14 = drawable instanceof ColorDrawable;
                        Bitmap.Config config = E;
                        Bitmap bitmapCreateBitmap = z14 ? Bitmap.createBitmap(2, 2, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        bitmap = bitmapCreateBitmap;
                    } catch (Exception unused) {
                        i2.i("ProgressImageView", "Error to create bitmap");
                    }
                }
            }
            this.f47663n = bitmap;
        }
        e();
    }

    public final void e() {
        if (!this.f47666q) {
            this.f47667r = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f47663n == null) {
            invalidate();
            return;
        }
        setLayerType(1, null);
        Paint paint = this.f47653d;
        paint.setAntiAlias(true);
        if (getImageTintList() != null) {
            paint.setColorFilter(new PorterDuffColorFilter(getImageTintList().getDefaultColor(), PorterDuff.Mode.SRC_ATOP));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f47654e;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f47659j);
        paint2.setStrokeWidth(this.f47656g);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint3 = this.f47655f;
        int i14 = this.f47661l;
        paint3.setColor(i14);
        RectF rectF = new RectF(getBorderWidth() * 2.0f, getBorderWidth() * 2.0f, getWidth() - (getBorderWidth() * 2.0f), getHeight() - (getBorderWidth() * 2.0f));
        RectF rectF2 = this.f47651b;
        rectF2.set(rectF);
        rectF2.roundOut(this.f47652c);
        float paddingTop = rectF2.top + getPaddingTop();
        float paddingBottom = rectF2.bottom - getPaddingBottom();
        int iC = (int) hb.a.c(this.f47663n.getWidth(), (paddingBottom - paddingTop) / this.f47663n.getHeight(), rectF2.width(), 2.0f);
        if (iC < 0) {
            iC = 0;
        }
        float f14 = iC;
        float f15 = rectF2.left + f14;
        float f16 = rectF2.right - f14;
        RectF rectF3 = this.f47650a;
        rectF3.set(f15, paddingTop, f16, paddingBottom);
        Paint paint4 = new Paint();
        this.A = paint4;
        paint4.setAntiAlias(true);
        this.A.setStrokeWidth(7.0f);
        this.A.setStyle(style);
        this.A.setStrokeCap(cap);
        this.A.setColor(i14);
        if (!isInEditMode()) {
            this.A.setShadowLayer(getBorderWidth() * 1.5f, 0.0f, 0.0f, i14);
        }
        double d14 = ((double) (360.0f - this.f47658i)) * 0.017453292519943295d;
        this.f47672y = (float) ((Math.cos(d14) * ((double) ((getWidth() - (getBorderWidth() * 4.0f)) / 2.0f))) + ((double) rectF3.centerX()));
        this.f47673z = (float) (((double) rectF3.centerY()) - (Math.sin(d14) * ((double) ((getWidth() - (getBorderWidth() * 4.0f)) / 2.0f))));
        invalidate();
    }

    public int getBorderColor() {
        return this.f47659j;
    }

    public float getBorderWidth() {
        return this.f47656g;
    }

    public float getProgressValue() {
        return this.f47664o;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f47669v) {
            super.onDraw(canvas);
            return;
        }
        if (this.f47663n == null) {
            return;
        }
        canvas.save();
        RectF rectF = this.f47650a;
        canvas.rotate(this.f47658i, rectF.centerX(), rectF.centerY());
        float f14 = this.f47656g;
        RectF rectF2 = this.f47651b;
        Paint paint = this.f47654e;
        if (f14 > 0.0f) {
            paint.setColor(this.f47659j);
            canvas2 = canvas;
            canvas2.drawArc(rectF2, 0.0f, 360.0f, false, paint);
        } else {
            canvas2 = canvas;
        }
        paint.setColor(this.f47660k);
        paint.setStrokeWidth(this.f47657h);
        float f15 = (this.f47664o / 100.0f) * 360.0f;
        if (this.f47668t) {
            f15 = -f15;
        }
        canvas2.drawArc(rectF2, 0.0f, f15, false, paint);
        canvas2.restore();
        paint.setStrokeWidth(this.f47656g);
        canvas2.drawBitmap(this.f47663n, (Rect) null, rectF, this.f47653d);
        int i14 = this.D;
        int i15 = this.f47671x;
        Paint paint2 = this.f47655f;
        if (i14 == 0) {
            paint2.setColor(this.f47661l);
            canvas2.drawCircle(this.f47672y, this.f47673z, i15 / 2, paint2);
        } else if (i14 == 2) {
            paint2.setColor(this.f47662m);
            canvas2.drawCircle(this.f47672y, this.f47673z, i15 / 2, paint2);
        }
        if (this.B > 0 || this.A.getAlpha() != 0) {
            this.A.setAlpha(this.B);
            int i16 = this.B;
            Paint paint3 = this.A;
            if (i16 == 0) {
                paint3.setStrokeWidth(0.0f);
            } else {
                paint3.setStrokeWidth(7.0f);
            }
            canvas2.drawArc(rectF2, 0.0f, 360.0f, false, this.A);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        e();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z14) {
        if (z14) {
            i2.i("ProgressImageView", "Adjust view bounds not supported.");
        }
    }

    public void setBorderColor(int i14) {
        if (i14 == this.f47659j) {
            return;
        }
        this.f47659j = i14;
        this.f47654e.setColor(i14);
        invalidate();
    }

    public void setBorderProgressColor(int i14) {
        if (i14 == this.f47660k) {
            return;
        }
        this.f47660k = i14;
        invalidate();
    }

    public void setBorderWidth(int i14) {
        float f14 = i14;
        if (f14 == this.f47656g) {
            return;
        }
        this.f47656g = f14;
        e();
    }

    public void setDeviceStatus(int i14) {
        this.D = i14;
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z14) {
        if (this.f47669v == z14) {
            return;
        }
        this.f47669v = z14;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i14) {
        super.setImageResource(i14);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d();
    }

    @Override // android.view.View
    public final void setPadding(int i14, int i15, int i16, int i17) {
        super.setPadding(i14, i15, i16, i17);
        e();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i14, int i15, int i16, int i17) {
        super.setPaddingRelative(i14, i15, i16, i17);
        e();
    }

    public void setProgressAnimationState(boolean z14) {
        this.f47670w = z14;
    }

    public void setProgressAnimatorInterpolator(TimeInterpolator timeInterpolator) {
        this.f47665p.setInterpolator(timeInterpolator);
    }

    public void setValue(float f14) {
        if (!this.f47670w) {
            this.f47664o = f14;
            invalidate();
            return;
        }
        if (this.f47665p.isRunning()) {
            this.f47665p.cancel();
        }
        AnimatorSet animatorSet = this.C;
        if (animatorSet == null || !animatorSet.isRunning()) {
            this.f47665p.setFloatValues(this.f47664o, f14);
            this.f47665p.start();
        }
    }

    public void setValueWithBorder(float f14) {
        if (!this.f47670w) {
            this.f47664o = f14;
            invalidate();
            return;
        }
        if (this.f47665p.isRunning()) {
            this.f47665p.cancel();
        }
        AnimatorSet animatorSet = this.C;
        if (animatorSet == null || !animatorSet.isRunning()) {
            this.f47665p.setFloatValues(this.f47664o, f14);
            this.f47665p.removeAllListeners();
            this.f47665p.addListener(new a());
            this.f47665p.start();
        }
    }

    public void setValueWithNoAnimation(float f14) {
        this.f47664o = f14;
        invalidate();
    }

    public ProgressImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressImageView(Context context) {
        super(context);
        this.f47650a = new RectF();
        this.f47651b = new RectF();
        this.f47652c = new Rect();
        this.f47653d = new Paint(1);
        this.f47654e = new Paint(1);
        this.f47655f = new Paint(1);
        this.f47656g = 0.0f;
        this.f47657h = 0.0f;
        this.f47658i = 0.0f;
        this.f47659j = 0;
        this.f47660k = 0;
        this.f47661l = 0;
        this.f47662m = 0;
        this.f47670w = true;
        this.A = new Paint();
        this.D = 3;
        c();
    }
}
