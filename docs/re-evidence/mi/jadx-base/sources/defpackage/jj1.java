package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class jj1 extends Drawable implements Drawable.Callback, byp, ayp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byp f22849a;
    public final Drawable[] c;
    public final o47[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p47 f22850b = new p47();
    public final Rect e = new Rect();
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public class a implements o47 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f22851a;

        public a(int i) {
            this.f22851a = i;
        }

        @Override // defpackage.o47
        public Drawable getDrawable() {
            return jj1.this.b(this.f22851a);
        }

        @Override // defpackage.o47
        public Drawable h(Drawable drawable) {
            return jj1.this.e(this.f22851a, drawable);
        }
    }

    public jj1(Drawable[] drawableArr) {
        int i = 0;
        b6i.g(drawableArr);
        this.c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.c;
            if (i >= drawableArr2.length) {
                this.d = new o47[drawableArr2.length];
                return;
            } else {
                y47.d(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    public final o47 a(int i) {
        return new a(i);
    }

    public Drawable b(int i) {
        b6i.b(i >= 0);
        b6i.b(i < this.c.length);
        return this.c[i];
    }

    public o47 c(int i) {
        b6i.b(i >= 0);
        b6i.b(i < this.d.length);
        o47[] o47VarArr = this.d;
        if (o47VarArr[i] == null) {
            o47VarArr[i] = a(i);
        }
        return this.d[i];
    }

    public int d() {
        return this.c.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i++;
        }
    }

    public Drawable e(int i, Drawable drawable) {
        b6i.b(i >= 0);
        b6i.b(i < this.c.length);
        Drawable drawable2 = this.c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.h) {
                drawable.mutate();
            }
            y47.d(this.c[i], null, null);
            y47.d(drawable, null, null);
            y47.e(drawable, this.f22850b);
            y47.a(drawable, this);
            y47.d(drawable, this, this);
            this.g = false;
            this.c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // defpackage.byp
    public void f(RectF rectF) {
        byp bypVar = this.f22849a;
        if (bypVar != null) {
            bypVar.f(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // defpackage.byp
    public void g(Matrix matrix) {
        byp bypVar = this.f22849a;
        if (bypVar != null) {
            bypVar.g(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.c.length == 0) {
            return -2;
        }
        int i = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.e;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // defpackage.ayp
    public void i(byp bypVar) {
        this.f22849a = bypVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.g) {
            this.f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f = z2 | z;
                i++;
            }
            this.g = true;
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                this.h = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f22850b.b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f22850b.c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f22850b.d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f22850b.e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
