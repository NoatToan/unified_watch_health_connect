package miuix.smooth;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.e3n;
import defpackage.p5j;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothFrameLayout2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f26882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26883b;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public Path g;
    public float[] h;
    public float[] i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26884k;

    public SmoothFrameLayout2(Context context) {
        this(context, null);
    }

    private void setSmoothCornerEnable(boolean z) {
        e3n.e(this, z);
    }

    public final void a(Canvas canvas) {
        this.g.reset();
        float f = this.e * 0.5f;
        float[] fArr = this.h;
        if (fArr == null) {
            Path path = this.g;
            RectF rectF = this.f26882a;
            float f2 = rectF.left + f;
            float f3 = rectF.top + f;
            float f4 = rectF.right - f;
            float f5 = rectF.bottom - f;
            float f6 = this.f26883b;
            path.addRoundRect(f2, f3, f4, f5, f6 - f, f6 - f, Path.Direction.CW);
        } else {
            float[] fArr2 = (float[]) fArr.clone();
            this.i = fArr2;
            float[] fArr3 = this.h;
            fArr2[0] = fArr3[0] - f;
            fArr2[1] = fArr3[1] - f;
            fArr2[2] = fArr3[2] - f;
            fArr2[3] = fArr3[3] - f;
            Path path2 = this.g;
            RectF rectF2 = this.f26882a;
            path2.addRoundRect(rectF2.left + f, rectF2.top + f, rectF2.right - f, rectF2.bottom - f, fArr2, Path.Direction.CW);
        }
        canvas.clipPath(this.g);
    }

    public final void b(Canvas canvas) {
        this.g.reset();
        float[] fArr = this.h;
        if (fArr == null) {
            Path path = this.g;
            RectF rectF = this.f26882a;
            float f = this.f26883b;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else {
            this.g.addRoundRect(this.f26882a, fArr, Path.Direction.CW);
        }
        canvas.clipPath(this.g);
    }

    public final void c(Canvas canvas) {
        this.g.reset();
        float f = this.e * 0.5f;
        float[] fArr = this.h;
        if (fArr == null) {
            Path path = this.g;
            RectF rectF = this.f26882a;
            float f2 = rectF.left + f;
            float f3 = rectF.top + f;
            float f4 = rectF.right - f;
            float f5 = rectF.bottom - f;
            float f6 = this.f26883b;
            path.addRoundRect(f2, f3, f4, f5, f6 + f, f6 + f, Path.Direction.CW);
        } else {
            float[] fArr2 = (float[]) fArr.clone();
            this.i = fArr2;
            float[] fArr3 = this.h;
            fArr2[0] = fArr3[0] + f;
            fArr2[1] = fArr3[1] + f;
            fArr2[2] = fArr3[2] + f;
            fArr2[3] = fArr3[3] + f;
            Path path2 = this.g;
            RectF rectF2 = this.f26882a;
            path2.addRoundRect(rectF2.left + f, rectF2.top + f, rectF2.right - f, rectF2.bottom - f, fArr2, Path.Direction.CW);
        }
        canvas.drawPath(this.g, this.d);
    }

    public final void d() {
        invalidateOutline();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (!this.f26884k) {
            b(canvas);
        }
        if (this.e > 0) {
            int iSave2 = canvas.save();
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            super.dispatchDraw(canvas);
        }
        if (!this.f26884k && this.e > 0) {
            c(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        b(canvas);
        this.f26884k = true;
        if (this.e > 0) {
            int iSave2 = canvas.save();
            a(canvas);
            super.draw(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            super.draw(canvas);
        }
        if (this.e > 0) {
            c(canvas);
        }
        this.f26884k = false;
        canvas.restoreToCount(iSave);
    }

    public float[] getCornerRadii() {
        return (float[]) this.h.clone();
    }

    public float getCornerRadius() {
        return this.f26883b;
    }

    public int getStrokeColor() {
        return this.f;
    }

    public int getStrokeWidth() {
        return this.e;
    }

    public boolean getUseSmooth() {
        return this.j;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f26882a.set(0.0f, 0.0f, i, i2);
    }

    public void setCornerRadii(float[] fArr) {
        this.h = fArr;
        d();
    }

    public void setCornerRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f26883b = f;
        this.h = null;
        d();
    }

    public void setStrokeColor(int i) {
        this.f = i;
        d();
    }

    public void setStrokeWidth(int i) {
        this.e = i;
        d();
    }

    public void setUseSmooth(boolean z) {
        this.j = z;
        setSmoothCornerEnable(z);
    }

    public SmoothFrameLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothFrameLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26882a = new RectF();
        this.g = new Path();
        this.f26884k = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p5j.N);
        this.f26883b = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.O, 0);
        if (typedArrayObtainStyledAttributes.hasValue(p5j.P) || typedArrayObtainStyledAttributes.hasValue(p5j.Q) || typedArrayObtainStyledAttributes.hasValue(p5j.S) || typedArrayObtainStyledAttributes.hasValue(p5j.R)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.P, 0);
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.Q, 0);
            float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.S, 0);
            float dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.R, 0);
            setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(p5j.U, 0);
        this.f = typedArrayObtainStyledAttributes.getColor(p5j.T, 0);
        this.j = typedArrayObtainStyledAttributes.getBoolean(p5j.D, true);
        Boolean bool = e3n.f16229a;
        if (bool != null) {
            this.j = bool.booleanValue();
        }
        if (this.j) {
            setSmoothCornerEnable(true);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.c = paint;
        paint.setFlags(1);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setFlags(1);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(this.e);
        this.d.setColor(this.f);
    }
}
