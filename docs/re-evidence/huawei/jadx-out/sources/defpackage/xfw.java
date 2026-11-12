package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.huawei.uikit.hwscrollbarview.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes44.dex */
public class xfw extends Drawable {
    private int f;
    private int i;
    private Interpolator n;
    private Animator o;
    private int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f52853c = new Paint(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RectF f52851a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52852b = 8;
    private int d = 8;
    private boolean g = false;
    private int j = 0;
    private int h = 0;
    private int k = 255;
    private float l = 0.0f;
    private boolean m = false;
    private long t = 150;
    private long p = 150;

    public xfw() {
        this.f52853c.setStyle(Paint.Style.FILL);
    }

    private int a(int i, int i2) {
        return ((((i2 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i2 << 8) >>> 8);
    }

    private boolean d(boolean z) {
        if (this.m == z) {
            return false;
        }
        this.m = z;
        return true;
    }

    public void a(int i) {
        this.f52852b = i;
    }

    public void a(long j) {
        this.t = j;
    }

    public void b(int i) {
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
    }

    public void b(Interpolator interpolator) {
        this.n = interpolator;
    }

    public void c(int i) {
        this.d = i;
    }

    public void c(long j) {
        this.p = j;
    }

    public void d(int i) {
        this.e = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.h;
        int i2 = this.j;
        if (i2 != 0) {
            i = i2;
        }
        this.f52853c.setColor(a(this.k, i));
        RectF rectF = this.f52851a;
        Rect bounds = getBounds();
        if (e()) {
            float f = bounds.left + this.e;
            rectF.left = f;
            rectF.right = f + this.i;
        } else {
            float f2 = bounds.right - this.e;
            rectF.right = f2;
            rectF.left = f2 - this.i;
        }
        rectF.top = bounds.top;
        rectF.bottom = bounds.bottom;
        float fWidth = this.l;
        if (Float.compare(fWidth, 0.0f) <= 0) {
            fWidth = rectF.width() * 0.5f;
        }
        canvas.drawRoundRect(rectF, fWidth, fWidth, this.f52853c);
    }

    public void e(int i) {
        this.h = i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (this.j >>> 24) == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayC = c(resources, theme, attributeSet, R.styleable.HwScrollbarDrawable);
        b(null, typedArrayC);
        typedArrayC.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (b(iArr)) {
            this.f = this.d;
            z = true;
        } else {
            this.f = this.f52852b;
            z = false;
        }
        if (!d(z)) {
            return false;
        }
        Animator animator = this.o;
        if (animator != null && animator.isRunning()) {
            this.o.cancel();
        }
        Animator animatorB = b(z);
        this.o = animatorB;
        animatorB.start();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.k != i) {
            this.k = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.j = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f52853c.setColorFilter(colorFilter);
    }

    private boolean b(int[] iArr) {
        return a(iArr, android.R.attr.state_pressed);
    }

    private boolean e() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    private Animator b(boolean z) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "scrollbarWidth", this.i, this.f);
        Interpolator interpolator = this.n;
        if (interpolator != null) {
            objectAnimatorOfInt.setInterpolator(interpolator);
        }
        if (z) {
            objectAnimatorOfInt.setDuration(this.t);
            return objectAnimatorOfInt;
        }
        objectAnimatorOfInt.setDuration(this.p);
        return objectAnimatorOfInt;
    }

    public void b(Context context, AttributeSet attributeSet, int i) {
        if (context == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwScrollbarDrawable, i, R.style.Widget_Emui_HwScrollbarDrawable);
        b(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void b(Context context, TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.HwScrollbarDrawable_hwScrollbarNormalWidth, 8);
        a(dimensionPixelSize);
        b(dimensionPixelSize);
        c(typedArray.getDimensionPixelSize(R.styleable.HwScrollbarDrawable_hwScrollbarActivatedWidth, 8));
        d(typedArray.getDimensionPixelSize(R.styleable.HwScrollbarDrawable_hwScrollbarEndMargin, 8));
        e(typedArray.getColor(R.styleable.HwScrollbarDrawable_hwScrollbarColor, 0));
        int resourceId = typedArray.getResourceId(R.styleable.HwScrollbarDrawable_hwScrollbarInterpolator, android.R.anim.linear_interpolator);
        if (resourceId > 0 && context != null) {
            b(AnimationUtils.loadInterpolator(context, resourceId));
        }
        a(typedArray.getInt(R.styleable.HwScrollbarDrawable_hwScrollbarToActivatedDuration, 150));
        c(typedArray.getInt(R.styleable.HwScrollbarDrawable_hwScrollbarToUnactivatedDuration, 150));
    }

    private TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
