package com.huawei.ucd.cloveranimation;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.qhx;
import defpackage.qic;

/* JADX INFO: loaded from: classes43.dex */
public class CloverLoadingView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AddFrameListener f23185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AddFrameListener f23187c;
    private boolean d;
    private Runnable e;
    private qhx f;
    private float g;
    private float h;
    private RectF i;
    private float j;
    private Paint k;
    private float l;
    private Paint m;
    private Bitmap n;
    private Bitmap o;
    private Bitmap q;
    private float r;
    private float t;

    public CloverLoadingView(Context context) {
        this(context, null);
    }

    public CloverLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloverLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 1.0f;
        this.h = 0.74f;
        this.j = 0.74f;
        this.g = 0.74f;
        this.o = null;
        this.q = null;
        this.n = null;
        this.f23186b = false;
        this.e = new Runnable() { // from class: com.huawei.ucd.cloveranimation.CloverLoadingView.5
            @Override // java.lang.Runnable
            public void run() {
                CloverLoadingView cloverLoadingView = CloverLoadingView.this;
                cloverLoadingView.o = cloverLoadingView.c(R.drawable.health_model_static_sport);
                CloverLoadingView cloverLoadingView2 = CloverLoadingView.this;
                cloverLoadingView2.q = cloverLoadingView2.c(R.drawable.health_model_static_mood);
                CloverLoadingView cloverLoadingView3 = CloverLoadingView.this;
                cloverLoadingView3.n = cloverLoadingView3.c(R.drawable.health_model_static_slumber);
                CloverLoadingView.this.f23186b = true;
                CloverLoadingView.this.postInvalidate();
                if (CloverLoadingView.this.f23185a != null) {
                    CloverLoadingView.this.f23185a.onFinished();
                }
            }
        };
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap c(int i) {
        Bitmap bitmapB = b(i);
        Matrix matrix = new Matrix();
        float f = this.l;
        matrix.preScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapB, 0, 0, bitmapB.getWidth(), bitmapB.getHeight(), matrix, true);
        if (bitmapB.isRecycled()) {
            bitmapB.recycle();
        }
        return bitmapCreateBitmap;
    }

    private Bitmap b(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeStream(getResources().openRawResource(i), null, options);
    }

    public void setAddFrameListener(AddFrameListener addFrameListener) {
        this.f23185a = addFrameListener;
    }

    public void setLoadingEndListener(AddFrameListener addFrameListener) {
        this.f23187c = addFrameListener;
    }

    public void setCustom(boolean z) {
        this.d = z;
    }

    public qhx getCloverData() {
        return this.f;
    }

    private void a() {
        this.f = new qhx();
        this.k = new Paint(1);
        this.i = new RectF();
        this.m = new Paint(1);
    }

    private void e() {
        new Thread(this.e).start();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        float f = i;
        float f2 = i2;
        this.i.set(0.0f, 0.0f, f, f2);
        this.t = (f / 2.0f) - (this.f.j() / 2.0f);
        this.r = (f2 * 0.56f) - this.f.i();
        this.l = Math.min(i, i2) / (Math.max(this.f.j(), this.f.i()) * 2.0f);
        e();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.k.setShader(null);
        this.k.setAlpha(255);
        d(canvas);
        c(canvas);
    }

    private void d(Canvas canvas, int i, int i2, float f) {
        canvas.save();
        this.m.setAlpha(255);
        if (this.o == null) {
            return;
        }
        float f2 = this.h;
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() * 0.56f);
        canvas.drawBitmap(this.o, (getWidth() - i) / 2.0f, ((getHeight() * 0.56f) - i2) - f, this.m);
        canvas.restore();
    }

    private void b(Canvas canvas, int i, int i2, float f) {
        if (this.n == null) {
            return;
        }
        canvas.save();
        this.m.setAlpha(255);
        float f2 = this.j;
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() * 0.56f);
        canvas.drawBitmap(this.n, ((getWidth() / 2.0f) - i) - f, ((getHeight() * 0.56f) - (i2 * 0.211f)) + f, this.m);
        canvas.restore();
    }

    private void d(Canvas canvas, int i, float f) {
        if (this.q == null) {
            return;
        }
        canvas.save();
        this.m.setAlpha(255);
        float f2 = this.g;
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() * 0.56f);
        canvas.drawBitmap(this.q, (getWidth() / 2.0f) + f, ((getHeight() * 0.56f) - (i * 0.211f)) + f, this.m);
        canvas.restore();
    }

    private void c(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f23186b || (bitmap = this.o) == null || this.n == null || this.q == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = this.o.getHeight();
        float height2 = getHeight() * 0.03f;
        d(canvas, width, height, height2);
        float f = height2 * 0.707f;
        d(canvas, height, f);
        b(canvas, width, height, f);
    }

    private void setPetalBackgroundColor(LinearGradient linearGradient) {
        if (this.d) {
            this.k.setShader(linearGradient);
        } else {
            this.k.setShader(this.f.a());
        }
    }

    private void d(Canvas canvas) {
        canvas.save();
        float f = this.j * this.l;
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() * 0.56f);
        setPetalBackgroundColor(this.f.e());
        canvas.translate(this.t, this.r);
        canvas.rotate(-120.0f, this.f.g().x, this.f.g().y);
        canvas.drawPath(this.f.f(), this.k);
        canvas.restore();
        canvas.save();
        float f2 = this.g * this.l;
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() * 0.56f);
        setPetalBackgroundColor(this.f.l());
        canvas.translate(this.t, this.r);
        canvas.rotate(120.0f, this.f.g().x, this.f.g().y);
        canvas.drawPath(this.f.f(), this.k);
        canvas.restore();
        canvas.save();
        float f3 = this.h * this.l;
        canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * 0.56f);
        setPetalBackgroundColor(this.f.h());
        canvas.translate(this.t, this.r);
        canvas.drawPath(this.f.f(), this.k);
        canvas.restore();
    }

    private PropertyValuesHolder d(qic qicVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.74f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.1875f, 1.0f);
        keyframeOfFloat2.setInterpolator(qicVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.375f, 0.74f);
        keyframeOfFloat3.setInterpolator(qicVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.5f, 1.0f);
        keyframeOfFloat4.setInterpolator(qicVar);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.625f, 0.74f);
        keyframeOfFloat5.setInterpolator(qicVar);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(0.8125f, 1.0f);
        keyframeOfFloat6.setInterpolator(qicVar);
        Keyframe keyframeOfFloat7 = Keyframe.ofFloat(1.0f, 0.74f);
        keyframeOfFloat7.setInterpolator(qicVar);
        return PropertyValuesHolder.ofKeyframe("scale", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6, keyframeOfFloat7);
    }

    private ValueAnimator getScaleValueAnimator() {
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(d(new qic()));
        valueAnimatorOfPropertyValuesHolder.setInterpolator(new qic());
        valueAnimatorOfPropertyValuesHolder.setDuration(2667L);
        valueAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        return valueAnimatorOfPropertyValuesHolder;
    }
}
