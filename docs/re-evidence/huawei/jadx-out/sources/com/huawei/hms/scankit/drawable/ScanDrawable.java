package com.huawei.hms.scankit.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.scankit.R;
import com.huawei.hms.scankit.p.b1;
import com.huawei.hms.scankit.p.b6;
import com.huawei.hms.scankit.p.n6;
import com.huawei.hms.scankit.p.y5;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes34.dex */
public class ScanDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueAnimator f15932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ValueAnimator f15933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f15934c;
    private final Paint d;
    private final Paint e;
    private final ColorMatrix f;
    private final Matrix g;
    private final Rect h;
    private final Rect i;
    private final Rect j;
    private final Rect k;
    private int l;
    private int m;
    private float n;
    private boolean o;
    private float p;
    private int q;
    private y5 r;
    private float s;
    private boolean t;
    private Bitmap u;
    private Bitmap v;
    private AnimatorSet w;
    private static final int[] x = {13625597, 357325};
    private static final Interpolator y = new b1(0.4f, 0.0f, 0.4f, 1.0f);
    private static final Interpolator z = new b1(0.4f, 0.0f, 0.7f, 1.0f);
    private static final Interpolator A = new b1(0.25f, 0.0f, 0.4f, 1.0f);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) ScanDrawable.this.f15933b.getAnimatedValue()).floatValue();
            ScanDrawable scanDrawable = ScanDrawable.this;
            scanDrawable.q = scanDrawable.k.top + ((int) (ScanDrawable.this.k.height() * ScanDrawable.y.getInterpolation(fFloatValue)));
            if (fFloatValue < 0.389f) {
                ScanDrawable.this.p = ScanDrawable.z.getInterpolation(fFloatValue / 0.389f);
            } else {
                ScanDrawable.this.p = 1.0f - ScanDrawable.A.getInterpolation((fFloatValue - 0.389f) / 0.611f);
            }
            ScanDrawable.this.invalidateSelf();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            ScanDrawable scanDrawable = ScanDrawable.this;
            scanDrawable.o = !scanDrawable.o;
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            float fAbs = Math.abs(((Float) ScanDrawable.this.f15933b.getAnimatedValue()).floatValue() - 0.5f);
            ScanDrawable scanDrawable = ScanDrawable.this;
            scanDrawable.t = !scanDrawable.t;
            if (ScanDrawable.this.t) {
                if (fAbs > 0.35f) {
                    ScanDrawable.this.n = 0.0f;
                } else {
                    ScanDrawable.this.n = n6.a(0.5f);
                }
            }
        }
    }

    public ScanDrawable() {
        this.f15932a = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15933b = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15934c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new ColorMatrix();
        this.g = new Matrix();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.n = 0.5f;
        this.o = false;
        this.p = 0.0f;
        this.t = true;
        this.w = new AnimatorSet();
        d();
    }

    private void e() {
        this.f15932a.setInterpolator(new LinearInterpolator());
        this.f15932a.setRepeatMode(2);
        this.f15932a.setRepeatCount(-1);
        this.f15932a.setDuration(500L);
        this.f15932a.setStartDelay(200L);
        this.f15932a.addListener(new c());
    }

    private void f() {
        this.f15933b.setDuration(2000L);
        this.f15933b.setInterpolator(new LinearInterpolator());
        this.f15933b.setRepeatCount(-1);
        this.f15933b.setRepeatMode(2);
        this.f15933b.addUpdateListener(new a());
        this.f15933b.addListener(new b());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!isRunning() || canvas == null) {
            Log.w("ScanDrawable", "animator is not running or canvas is null.");
            return;
        }
        if (this.o) {
            int i = this.q;
            this.i.set(0, i, getBounds().right, ((int) (this.m * this.p * 0.5f)) + i);
            int i2 = this.q;
            this.j.set(0, i2, getBounds().right, ((int) (this.m * this.p)) + i2);
        } else {
            int i3 = this.q;
            this.i.set(0, i3, getBounds().right, i3 - ((int) ((this.m * this.p) * 0.5f)));
            int i4 = this.q;
            this.j.set(0, i4, getBounds().right, i4 - ((int) (this.m * this.p)));
        }
        a(canvas, this.j);
        b(canvas);
        a(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (resources == null || xmlPullParser == null || attributeSet == null) {
            Log.e("ScanDrawable", "resources, xmlPullParser or attributeSet is null when inflating drawable");
        } else {
            a(resources);
            super.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.w.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (rect == null) {
            Log.e("ScanDrawable", "on bounds change: bounds is null!");
        } else {
            super.onBoundsChange(rect);
            a(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            Log.i("ScanDrawable", "start failed, animator is running");
            return;
        }
        this.o = false;
        this.t = true;
        a(getBounds());
        this.w.start();
        Log.i("ScanDrawable", "start scan animator success");
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (!isRunning()) {
            Log.i("ScanDrawable", "stop failed, animator is not running");
            return;
        }
        this.w.end();
        this.r = null;
        Log.i("ScanDrawable", "stop scan animator success");
    }

    private void d() {
        f();
        e();
        AnimatorSet animatorSet = new AnimatorSet();
        this.w = animatorSet;
        animatorSet.playTogether(this.f15933b, this.f15932a);
    }

    private void b(Canvas canvas) {
        y5 y5Var = this.r;
        if (y5Var == null) {
            Log.e("ScanDrawable", "drawParticle failed, mParticle is null");
        } else {
            y5Var.a(canvas, this.i);
        }
    }

    private void a(Resources resources) {
        if (resources == null) {
            Log.e("ScanDrawable", "resources is null when init drawable");
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.scankit_scan_light);
        this.v = Bitmap.createBitmap(bitmapDecodeResource.getWidth() * 2, bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas();
        canvas.setBitmap(this.v);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        paint.setShader(new BitmapShader(bitmapDecodeResource, tileMode, tileMode));
        canvas.drawRect(0.0f, 0.0f, bitmapDecodeResource.getWidth() * 2, bitmapDecodeResource.getHeight() * 2, paint);
        this.u = BitmapFactory.decodeResource(resources, R.drawable.scankit_scan_tail);
        this.s = resources.getDisplayMetrics().density;
    }

    private void a(Rect rect) {
        if (rect.height() == 0) {
            Log.d("ScanDrawable", "initBounds bounds is null");
            return;
        }
        this.k.set(rect);
        this.k.inset(0, (int) (rect.height() * 0.1f));
        this.l = (int) (rect.height() * 0.18f);
        this.m = (int) (rect.height() * 0.36f);
        Rect rect2 = new Rect(rect);
        rect2.inset((int) (rect.width() * 0.2f), 0);
        float f = this.s;
        int iWidth = (int) ((f != 0.0f ? 0.001f / (f * f) : 0.001f) * rect2.width() * rect2.height());
        this.r = new y5(new b6(iWidth, 500L).b(0.33f, 1.0f).a(0, -1, 0L, 100L, new LinearInterpolator()).a(-1, 0, 400L, 500L, new LinearInterpolator()), rect2, iWidth, this.s * 2.0f, x);
    }

    public ScanDrawable(Resources resources) {
        this();
        a(resources);
    }

    private void a(Canvas canvas, Rect rect) {
        Bitmap bitmap = this.u;
        if (bitmap != null && bitmap.getWidth() != 0 && this.u.getHeight() != 0) {
            this.f15934c.setScale(rect.width() / this.u.getWidth(), rect.height() / this.u.getHeight());
            this.f15934c.postTranslate(rect.left, rect.top);
            canvas.drawBitmap(this.u, this.f15934c, this.d);
            this.f15934c.reset();
            return;
        }
        Log.e("ScanDrawable", "dawTail failed, input bitmap is null");
    }

    private void a(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null && bitmap.getWidth() != 0 && this.v.getHeight() != 0) {
            float fFloatValue = (this.p * 0.5f) + (((Float) this.f15932a.getAnimatedValue()).floatValue() * this.n);
            float f = (1.5f - fFloatValue) * 0.05f;
            float f2 = f + 1.0f;
            this.f.set(new float[]{1.0f, f, f, f, 0.0f, f, f2, f, f, 0.0f, f, f, f2, f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            this.e.setColorFilter(new ColorMatrixColorFilter(this.f));
            int i = (int) (this.l * ((fFloatValue * 0.2f) + 0.4f));
            if (this.o) {
                int i2 = this.q;
                this.h.set(0, i2 + i, getBounds().right, i2 - i);
            } else {
                int i3 = this.q;
                this.h.set(0, i3 - i, getBounds().right, i3 + i);
            }
            this.g.setScale(this.h.width() / this.v.getWidth(), this.h.height() / this.v.getHeight());
            Matrix matrix = this.g;
            Rect rect = this.h;
            matrix.postTranslate(rect.left, rect.top);
            canvas.drawBitmap(this.v, this.g, this.e);
            this.g.reset();
            return;
        }
        Log.e("ScanDrawable", "drawLight failed, light bitmap is null");
    }
}
