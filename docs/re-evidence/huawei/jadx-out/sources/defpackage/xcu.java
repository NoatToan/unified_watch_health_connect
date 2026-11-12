package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import com.huawei.operation.utils.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public class xcu extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f52713a;
    private boolean e;
    private final int[] f;
    private final ArgbEvaluator g;
    private ValueAnimator h;
    private final int[] i;
    private final int[] j;
    private int k;
    private int l;
    private final float[] m;
    private float n;
    private int o;
    private boolean p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f52712c = {-1, -394759, -1315861, -1973269, -2038542};
    private static final int[] d = {-8741633, -11108097, -14855696, -16762657, -16435250};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f52711b = {0.0f, 0.3f, 0.6f, 0.8f, 1.0f};

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f52714a;
        final /* synthetic */ int[] e;

        b(int[] iArr, int[] iArr2) {
            this.f52714a = iArr;
            this.e = iArr2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.w("HwFloatingBubbleRadialDrawable", "onAnimationUpdate: animation is null");
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < xcu.this.j.length; i++) {
                xcu.this.j[i] = ((Integer) xcu.this.g.evaluate(fFloatValue, Integer.valueOf(this.f52714a[i]), Integer.valueOf(this.e[i]))).intValue();
            }
            xcu.this.invalidateSelf();
        }
    }

    public float a() {
        return this.n;
    }

    public void b(int i, int i2, int i3, float f) {
        float fMax = Float.compare(f, 1.2f) == -1 ? Math.max(((f - 1.2f) * 1.111111f) + 1.0f, 0.0f) : 1.0f;
        boolean z = Float.compare(fMax, this.n) == 0;
        if (this.o == i && this.l == i2 && this.k == i3 && z) {
            return;
        }
        this.o = i;
        this.l = i2;
        this.k = i3;
        this.n = fMax;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fWidth = bounds.width() * 0.5f;
        float f = this.o * 0.5f;
        float fWidth2 = f - (this.l + (bounds.width() * 0.5f));
        float fHeight = 0.0f - (this.k + (bounds.height() * 0.5f));
        float[] fArr = {fWidth2, fHeight};
        float fSqrt = (float) Math.sqrt((fWidth2 * fWidth2) + (fHeight * fHeight));
        float fMin = (Math.min(fSqrt / ((float) Math.sqrt((f * f) + 0.0f)), 1.0f) * fWidth) / fSqrt;
        float[] fArr2 = {fArr[0] * fMin, fMin * fArr[1]};
        float fCenterX = bounds.centerX() + fArr2[0];
        float fCenterY = bounds.centerY();
        float f2 = fArr2[1];
        float f3 = fCenterY + f2;
        float f4 = fArr2[0];
        float fSqrt2 = ((float) Math.sqrt((f4 * f4) + (f2 * f2))) + fWidth;
        this.f52713a.setShader(new RadialGradient(fCenterX, f3, fSqrt2, this.j, this.m, Shader.TileMode.CLAMP));
        if (Float.compare(this.n, 1.0f) == -1) {
            this.f52713a.setAlpha((int) (this.n * 255.0f));
            if (this.p) {
                this.f52713a.setMaskFilter(new BlurMaskFilter((1.0f - this.n) * 25.0f, BlurMaskFilter.Blur.INNER));
            }
        } else {
            this.f52713a.setAlpha(255);
            if (this.p) {
                this.f52713a.setMaskFilter(null);
            }
        }
        try {
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), fWidth, this.f52713a);
        } catch (IllegalArgumentException unused) {
            Log.w("HwFloatingBubbleRadialDrawable", "draw: bounds=" + bounds.toString() + " mParentWidth=" + this.o + ", mLeft=" + this.l + ", mTop=" + this.k);
            Log.e("HwFloatingBubbleRadialDrawable", "draw failed: cx=" + bounds.centerX() + ", cy=" + bounds.centerY() + ", radius=" + fWidth + ", Shader(cx=" + fCenterX + ", cy=" + f3 + ", radius=" + fSqrt2 + ", colors=" + Arrays.toString(this.j) + ", stops=" + Arrays.toString(this.m) + Constants.RIGHT_BRACKET_ONLY);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (iArr == null) {
            return false;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] == 16842913) {
                z = true;
                break;
            }
            i++;
        }
        if (z == this.e) {
            return false;
        }
        this.e = z;
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.h.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.h.setDuration(300L);
        this.h.addUpdateListener(new b(Arrays.copyOf(this.j, 5), this.e ? Arrays.copyOf(this.f, 5) : Arrays.copyOf(this.i, 5)));
        this.h.start();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
