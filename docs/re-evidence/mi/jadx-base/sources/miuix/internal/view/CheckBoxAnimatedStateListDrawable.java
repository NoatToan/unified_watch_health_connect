package miuix.internal.view;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import defpackage.g5j;
import defpackage.yu3;
import defpackage.z2j;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public class CheckBoxAnimatedStateListDrawable extends miuix.internal.view.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yu3 f26633b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;

    public static class a extends miuix.internal.view.a.C1033a {
        @Override // miuix.internal.view.a.C1033a
        public Drawable a(Resources resources, Resources.Theme theme, miuix.internal.view.a.C1033a c1033a) {
            return new CheckBoxAnimatedStateListDrawable(resources, theme, c1033a);
        }
    }

    public CheckBoxAnimatedStateListDrawable() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = false;
        this.f = false;
    }

    @Override // miuix.internal.view.a
    public miuix.internal.view.a.C1033a a() {
        return new a();
    }

    @Override // android.graphics.drawable.AnimatedStateListDrawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(b(), g5j.s0);
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.isLightTheme, typedValue, true);
        boolean zEquals = "true".equals(TypedValue.coerceToString(typedValue.type, typedValue.data));
        int color = zEquals ? Color.parseColor("#000000") : Color.parseColor("#ffffff");
        this.f26634a.f26636b = g(typedArrayObtainStyledAttributes, g5j.x0, color);
        this.f26634a.c = g(typedArrayObtainStyledAttributes, g5j.v0, color);
        this.f26634a.d = g(typedArrayObtainStyledAttributes, g5j.w0, Color.parseColor(zEquals ? "#3482FF" : "#277AF7"));
        this.f26634a.e = g(typedArrayObtainStyledAttributes, g5j.y0, Color.parseColor("#ffffff"));
        this.f26634a.f = h(typedArrayObtainStyledAttributes, g5j.u0, zEquals ? 15 : 51);
        this.f26634a.g = h(typedArrayObtainStyledAttributes, g5j.t0, zEquals ? 15 : 51);
        this.f26634a.h = h(typedArrayObtainStyledAttributes, g5j.A0, zEquals ? 255 : 0);
        this.f26634a.i = h(typedArrayObtainStyledAttributes, g5j.z0, zEquals ? 255 : 0);
        this.f26634a.j = f(typedArrayObtainStyledAttributes, g5j.B0, false);
        typedArrayObtainStyledAttributes.recycle();
        boolean zE = e();
        miuix.internal.view.a.C1033a c1033a = this.f26634a;
        this.f26633b = new yu3(this, zE, c1033a.f26636b, c1033a.c, c1033a.d, c1033a.f, c1033a.g, c1033a.e, c1033a.h, c1033a.i);
    }

    public int b() {
        return z2j.l;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.c;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable current = getCurrent();
        if (current != null && (current instanceof BitmapDrawable)) {
            super.draw(canvas);
            return;
        }
        if (!this.f26634a.j) {
            yu3 yu3Var = this.f26633b;
            if (yu3Var != null) {
                yu3Var.e(canvas);
            }
            super.draw(canvas);
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 2));
        if (this.g) {
            yu3 yu3Var2 = this.f26633b;
            if (yu3Var2 != null) {
                yu3Var2.e(canvas);
            }
            setAlpha((int) (this.d * 255.0f));
        } else {
            setAlpha(76);
        }
        canvas.save();
        Rect bounds = getBounds();
        float f = this.c;
        canvas.scale(f, f, (bounds.left + bounds.right) / 2, (bounds.top + bounds.bottom) / 2);
        super.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public final boolean f(TypedArray typedArray, int i, boolean z) {
        try {
            return typedArray.getBoolean(i, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public final int g(TypedArray typedArray, int i, int i2) {
        try {
            return typedArray.getColor(i, i2);
        } catch (UnsupportedOperationException unused) {
            return i2;
        }
    }

    public final int h(TypedArray typedArray, int i, int i2) {
        try {
            return typedArray.getInt(i, i2);
        } catch (Exception unused) {
            return i2;
        }
    }

    public void i(int i, int i2, int i3, int i4) {
        yu3 yu3Var = this.f26633b;
        if (yu3Var != null) {
            yu3Var.i(i, i2, i3, i4);
        }
    }

    public void j(Rect rect) {
        yu3 yu3Var = this.f26633b;
        if (yu3Var != null) {
            yu3Var.j(rect);
        }
    }

    public void k(float f) {
        this.d = f;
    }

    public void l(float f) {
        this.c = f;
    }

    public void m(boolean z) {
        yu3 yu3Var = this.f26633b;
        if (yu3Var != null) {
            yu3Var.l(z, this.f26634a.j);
        }
    }

    public void n(boolean z) {
        yu3 yu3Var = this.f26633b;
        if (yu3Var != null) {
            yu3Var.m(z, this.f26634a.j);
        }
    }

    public void o(boolean z, boolean z2) {
        yu3 yu3Var = this.f26633b;
        if (yu3Var != null) {
            yu3Var.n(z, z2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.AnimatedStateListDrawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f26633b == null) {
            return zOnStateChange;
        }
        Drawable current = getCurrent();
        if (current != null && (current instanceof BitmapDrawable)) {
            return super.onStateChange(iArr);
        }
        this.g = false;
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842919) {
                z = true;
            } else if (i == 16842912) {
                z2 = true;
            } else if (i == 16842910) {
                this.g = true;
            }
        }
        if (z) {
            m(z2);
        }
        if (!this.e && !z) {
            o(z2, this.g);
        }
        if (!z && (this.e || z2 != this.f)) {
            n(z2);
        }
        this.e = z;
        this.f = z2;
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        i(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        j(rect);
    }

    public CheckBoxAnimatedStateListDrawable(Resources resources, Resources.Theme theme, miuix.internal.view.a.C1033a c1033a) {
        super(resources, theme, c1033a);
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = false;
        this.f = false;
        this.f26633b = new yu3(this, e(), c1033a.f26636b, c1033a.c, c1033a.d, c1033a.f, c1033a.g, c1033a.e, c1033a.h, c1033a.i);
    }
}
