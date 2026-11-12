package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class m1a extends Drawable implements Drawable.Callback, byp, ayp, o47 {
    public static final Matrix d = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f25645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p47 f25646b = new p47();
    public byp c;

    public m1a(Drawable drawable) {
        this.f25645a = drawable;
        y47.d(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // defpackage.byp
    public void f(RectF rectF) {
        byp bypVar = this.c;
        if (bypVar != null) {
            bypVar.f(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void g(Matrix matrix) {
        m(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f25645a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f25645a;
    }

    @Override // defpackage.o47
    public Drawable getDrawable() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25645a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25645a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25645a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f25645a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // defpackage.o47
    public Drawable h(Drawable drawable) {
        return n(drawable);
    }

    @Override // defpackage.ayp
    public void i(byp bypVar) {
        this.c = bypVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f25645a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public void m(Matrix matrix) {
        byp bypVar = this.c;
        if (bypVar != null) {
            bypVar.g(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public Drawable n(Drawable drawable) {
        Drawable drawableO = o(drawable);
        invalidateSelf();
        return drawableO;
    }

    public Drawable o(Drawable drawable) {
        Drawable drawable2 = this.f25645a;
        y47.d(drawable2, null, null);
        y47.d(drawable, null, null);
        y47.e(drawable, this.f25646b);
        y47.a(drawable, this);
        y47.d(drawable, this, this);
        this.f25645a = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f25645a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f25645a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f25646b.b(i);
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25646b.c(colorFilter);
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f25646b.d(z);
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f25646b.e(z);
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f25645a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f25645a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
