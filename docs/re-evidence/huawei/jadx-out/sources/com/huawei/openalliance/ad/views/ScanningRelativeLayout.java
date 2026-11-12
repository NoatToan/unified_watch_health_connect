package com.huawei.openalliance.ad.views;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.profile.profile.ProfileExtendConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class ScanningRelativeLayout extends AutoScaleSizeRelativeLayout implements com.huawei.openalliance.ad.views.interfaces.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f21094c;
    private Bitmap d;
    private Paint e;
    private Paint f;
    private float g;
    private float h;
    private float i;
    private ValueAnimator j;
    private PorterDuffXfermode k;
    private boolean l;
    private boolean m;

    public void setRadius(int i) {
        this.f21093b = i;
        setRectCornerRadius(as.a(getContext(), i));
    }

    public void setLeft(float f) {
        this.g = f;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.e
    public void setAutoRepeat(boolean z) {
        this.l = z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator;
        super.onSizeChanged(i, i2, i3, i4);
        hw.b("ScanningRelativeLayout", "onSizeChanged");
        f();
        this.i = i;
        if (!this.m && this.l && (valueAnimator = this.j) != null) {
            boolean zIsRunning = valueAnimator.isRunning();
            if (zIsRunning) {
                this.j.cancel();
            }
            this.j = null;
            g();
            ValueAnimator valueAnimator2 = this.j;
            if (valueAnimator2 != null && zIsRunning) {
                valueAnimator2.start();
            }
        }
        if (i == 0 || i2 == 0) {
            return;
        }
        this.m = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.j.cancel();
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "animator cancel exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21094c == null) {
            return;
        }
        try {
            canvas.drawBitmap(this.d, this.g, 0.0f, this.f);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.f, 31);
            this.f.setXfermode(this.k);
            canvas.drawBitmap(this.f21094c, 0.0f, 0.0f, this.f);
            this.f.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "dispatchDraw exception: %s", th.getClass().getSimpleName());
        }
    }

    public void d() {
        hw.b("ScanningRelativeLayout", "start");
        post(new Runnable() { // from class: com.huawei.openalliance.ad.views.ScanningRelativeLayout.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (ScanningRelativeLayout.this.j == null) {
                        ScanningRelativeLayout.this.g();
                    } else if (ScanningRelativeLayout.this.j.isRunning()) {
                        ScanningRelativeLayout.this.j.cancel();
                    }
                    ScanningRelativeLayout.this.j.start();
                } catch (Throwable th) {
                    hw.c("ScanningRelativeLayout", "start scan exception: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public void c() {
        hw.b("ScanningRelativeLayout", ParamConstants.CallbackMethod.ON_PREPARE);
        try {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator == null) {
                g();
            } else if (valueAnimator.isRunning()) {
                this.j.cancel();
            }
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "prepare scan exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.e
    public boolean b() {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator == null) {
            return false;
        }
        return valueAnimator.isRunning();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.e
    public void a(View view, AdLandingPageData adLandingPageData) {
        d();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.e
    public void a() {
        hw.b("ScanningRelativeLayout", "stop");
        try {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
            }
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "cancel animation exception: %s", th.getClass().getSimpleName());
        }
        this.g = this.h;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(dk.c() ? PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, this.i), Keyframe.ofFloat(1.0f, this.h)) : PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, this.h), Keyframe.ofFloat(1.0f, this.i)));
            this.j = valueAnimatorOfPropertyValuesHolder;
            valueAnimatorOfPropertyValuesHolder.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
            this.j.setDuration(ProfileExtendConstants.TIME_OUT);
            if (this.l) {
                this.j.setRepeatCount(-1);
            }
            this.j.addUpdateListener(new a(this));
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "init animator exception: %s", th.getClass().getSimpleName());
        }
    }

    private void f() {
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        try {
            this.f21094c = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(this.f21094c).drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), as.a(getContext(), this.f21093b), as.a(getContext(), this.f21093b), this.e);
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "createBitMapException: %s", th.getClass().getSimpleName());
        }
    }

    private void e() {
        hw.b("ScanningRelativeLayout", "init");
        try {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.f21092a);
            this.d = bitmapDecodeResource;
            if (bitmapDecodeResource != null && dk.c()) {
                Matrix matrix = new Matrix();
                matrix.postScale(-1.0f, 1.0f);
                Bitmap bitmap = this.d;
                this.d = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.d.getHeight(), matrix, false);
            }
            float f = -this.d.getWidth();
            this.h = f;
            this.g = f;
            Paint paint = new Paint(1);
            this.f = paint;
            paint.setDither(true);
            this.f.setFilterBitmap(true);
            Paint paint2 = new Paint(1);
            this.e = paint2;
            paint2.setDither(true);
            this.e.setStyle(Paint.Style.FILL);
            this.e.setColor(-1);
            this.e.setFilterBitmap(true);
            this.k = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } catch (Throwable th) {
            hw.c("ScanningRelativeLayout", "init exception: %s", th.getClass().getSimpleName());
        }
    }

    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ScanningRelativeLayout> f21096a;

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScanningRelativeLayout scanningRelativeLayout = this.f21096a.get();
            if (scanningRelativeLayout == null || valueAnimator == null) {
                return;
            }
            scanningRelativeLayout.setLeft(((Float) valueAnimator.getAnimatedValue()).floatValue());
            scanningRelativeLayout.postInvalidate();
        }

        public a(ScanningRelativeLayout scanningRelativeLayout) {
            this.f21096a = new WeakReference<>(scanningRelativeLayout);
        }
    }

    public ScanningRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
        this.m = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScanningRelativeLayout);
        this.f21092a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ScanningRelativeLayout_layoutScanImage, R.drawable.hiad_scan);
        this.f21093b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ScanningRelativeLayout_layoutRadius, 36);
        typedArrayObtainStyledAttributes.recycle();
        e();
    }

    public ScanningRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScanningRelativeLayout(Context context) {
        super(context);
        this.l = false;
        this.m = true;
        e();
    }
}
