package defpackage;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.collection.ScatterMapKt;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class u43 extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f35353b;

    @Dimension
    public float h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35354k;
    public int l;
    public int m;
    public r2m o;
    public ColorStateList p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2m f35352a = s2m.k();
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final b g = new b();
    public boolean n = true;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return u43.this;
        }
    }

    public u43(r2m r2mVar) {
        this.o = r2mVar;
        Paint paint = new Paint(1);
        this.f35353b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader a() {
        Rect rect = this.d;
        copyBounds(rect);
        float fHeight = this.h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{z44.j(this.i, this.m), z44.j(this.j, this.m), z44.j(z44.p(this.j, 0), this.m), z44.j(z44.p(this.l, 0), this.m), z44.j(this.l, this.m), z44.j(this.f35354k, this.m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    public RectF b() {
        this.f.set(getBounds());
        return this.f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m = colorStateList.getColorForState(getState(), this.m);
        }
        this.p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    public void d(@Dimension float f) {
        if (this.h != f) {
            this.h = f;
            this.f35353b.setStrokeWidth(f * 1.3333f);
            this.n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            this.f35353b.setShader(a());
            this.n = false;
        }
        float strokeWidth = this.f35353b.getStrokeWidth() / 2.0f;
        copyBounds(this.d);
        this.e.set(this.d);
        float fMin = Math.min(this.o.r().a(b()), this.e.width() / 2.0f);
        if (this.o.u(b())) {
            this.e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.e, fMin, fMin, this.f35353b);
        }
    }

    public void e(int i, int i2, int i3, int i4) {
        this.i = i;
        this.j = i2;
        this.f35354k = i3;
        this.l = i4;
    }

    public void f(r2m r2mVar) {
        this.o = r2mVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.o.u(b())) {
            outline.setRoundRect(getBounds(), this.o.r().a(b()));
            return;
        }
        copyBounds(this.d);
        this.e.set(this.d);
        this.f35352a.e(this.o, 1.0f, this.e, this.c);
        if (this.c.isConvex()) {
            outline.setConvexPath(this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i) {
        this.f35353b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35353b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
