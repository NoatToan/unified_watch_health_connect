package miuix.smooth;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.f3n;
import defpackage.p5j;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothFrameLayout extends FrameLayout {
    public static final PorterDuffXfermode d = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f3n f26880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f26881b;
    public RectF c;

    public SmoothFrameLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        b();
        invalidateOutline();
        invalidate();
    }

    public final void b() {
        this.f26880a.i(this.f26881b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSaveLayer = getLayerType() != 2 ? canvas.saveLayer(this.c, null, 31) : -1;
        super.dispatchDraw(canvas);
        this.f26880a.a(canvas, d);
        if (getLayerType() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f26880a.b(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSaveLayer = getLayerType() != 2 ? canvas.saveLayer(this.c, null, 31) : -1;
        super.draw(canvas);
        this.f26880a.a(canvas, d);
        if (getLayerType() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f26880a.b(canvas);
    }

    public float[] getCornerRadii() {
        if (this.f26880a.c() == null) {
            return null;
        }
        return (float[]) this.f26880a.c().clone();
    }

    public float getCornerRadius() {
        return this.f26880a.d();
    }

    public int getStrokeColor() {
        return this.f26880a.g();
    }

    public int getStrokeWidth() {
        return this.f26880a.h();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f26881b.set(0, 0, i, i2);
        this.c.set(0.0f, 0.0f, i, i2);
        b();
    }

    public void setCornerRadii(float[] fArr) {
        this.f26880a.k(fArr);
        if (fArr == null) {
            this.f26880a.l(0.0f);
        }
        a();
    }

    public void setCornerRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f26880a.l(f);
        this.f26880a.k(null);
        a();
    }

    public void setStrokeColor(int i) {
        if (this.f26880a.g() != i) {
            this.f26880a.m(i);
            a();
        }
    }

    public void setStrokeWidth(int i) {
        if (this.f26880a.h() != i) {
            this.f26880a.n(i);
            a();
        }
    }

    public SmoothFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26881b = new Rect();
        this.c = new RectF();
        this.f26880a = new f3n();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p5j.E);
        setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.F, 0));
        if (typedArrayObtainStyledAttributes.hasValue(p5j.G) || typedArrayObtainStyledAttributes.hasValue(p5j.H) || typedArrayObtainStyledAttributes.hasValue(p5j.J) || typedArrayObtainStyledAttributes.hasValue(p5j.I)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.G, 0);
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.H, 0);
            float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.J, 0);
            float dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.I, 0);
            setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.M, 0));
        setStrokeColor(typedArrayObtainStyledAttributes.getColor(p5j.L, 0));
        setLayerType(typedArrayObtainStyledAttributes.getColor(p5j.K, 2), null);
        typedArrayObtainStyledAttributes.recycle();
    }
}
