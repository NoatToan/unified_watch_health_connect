package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class ScanningView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f21098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f21099c;
    private Paint d;
    private Paint e;
    private PorterDuffXfermode f;
    private float g;
    private float h;
    private float i;
    private ValueAnimator j;
    private Animator.AnimatorListener k;

    public void setSrcBitmap(Bitmap bitmap) {
        this.f21098b = bitmap;
    }

    public void setAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.k = animatorListener;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
        float f = i2;
        this.h = f;
        this.g = f;
        this.i = -i2;
    }

    public Bitmap getSrcBitmap() {
        return this.f21098b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f21098b == null) {
            return;
        }
        try {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.d, 31);
            canvas.drawBitmap(this.f21099c, 0.0f, this.g, this.d);
            this.d.setXfermode(this.f);
            canvas.drawBitmap(this.f21098b, 0.0f, 0.0f, this.d);
            this.d.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        } catch (Throwable th) {
            hw.c("ScanningView", "draw exception: %s", th.getClass().getSimpleName());
        }
        super.draw(canvas);
    }

    public void b() {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.j.cancel();
        }
        this.g = this.h;
        postInvalidate();
    }

    public void a() {
        if (this.f21098b == null) {
            hw.b("ScanningView", "start, mSrcBitmap is null");
        } else {
            post(new Runnable() { // from class: com.huawei.openalliance.ad.views.ScanningView.3
                @Override // java.lang.Runnable
                public void run() {
                    if (ScanningView.this.j == null) {
                        ScanningView.this.e();
                    } else if (ScanningView.this.j.isRunning()) {
                        ScanningView.this.j.cancel();
                    }
                    ScanningView.this.j.start();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.h, this.i);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new gx(0.33f, 0.0f, 0.67f, 1.0f));
        this.j.setDuration(2500L);
        this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.openalliance.ad.views.ScanningView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.this.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ScanningView.this.postInvalidate();
            }
        });
        this.j.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.openalliance.ad.views.ScanningView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ScanningView.this.setVisibility(0);
                if (ScanningView.this.k != null) {
                    ScanningView.this.k.onAnimationStart(animator);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ScanningView.this.setVisibility(8);
                if (ScanningView.this.k != null) {
                    ScanningView.this.k.onAnimationEnd(animator);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ScanningView.this.setVisibility(8);
                if (ScanningView.this.k != null) {
                    ScanningView.this.k.onAnimationCancel(animator);
                }
            }
        });
    }

    private void d() {
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setDither(true);
        this.d.setFilterBitmap(true);
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setDither(true);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setColor(-1);
        this.e.setFilterBitmap(true);
        this.f = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void c() {
        this.f21099c = BitmapFactory.decodeResource(getResources(), this.f21097a);
    }

    public ScanningView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScanningView);
        this.f21097a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ScanningView_lightImage, R.drawable.hiad_arrow_scan);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ScanningView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScanningView(Context context) {
        super(context);
        d();
    }
}
