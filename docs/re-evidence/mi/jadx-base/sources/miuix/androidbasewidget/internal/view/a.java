package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 24)
public class a extends GradientDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1019a f26239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26240b;
    public int c;

    public a() {
        this.f26240b = -1;
        this.c = -1;
        C1019a c1019aA = a();
        this.f26239a = c1019aA;
        c1019aA.b(super.getConstantState());
    }

    public C1019a a() {
        return new C1019a();
    }

    public void b() {
    }

    public void c() {
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26239a;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26240b;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842919) {
                z = true;
            }
        }
        if (z) {
            b();
        }
        if (!z) {
            c();
        }
        return zOnStateChange;
    }

    /* JADX INFO: renamed from: miuix.androidbasewidget.internal.view.a$a, reason: collision with other inner class name */
    public static class C1019a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable.ConstantState f26241a;

        public Drawable a(Resources resources, Resources.Theme theme, C1019a c1019a) {
            return new a(resources, theme, c1019a);
        }

        public void b(Drawable.ConstantState constantState) {
            this.f26241a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f26241a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f26241a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            if (this.f26241a == null) {
                return null;
            }
            return a(null, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            if (this.f26241a == null) {
                return null;
            }
            return a(resources, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            if (this.f26241a == null) {
                return null;
            }
            return a(resources, theme, this);
        }
    }

    public a(Resources resources, Resources.Theme theme, C1019a c1019a) {
        Drawable drawableNewDrawable;
        this.f26240b = -1;
        this.c = -1;
        if (resources == null) {
            drawableNewDrawable = c1019a.f26241a.newDrawable();
        } else if (theme == null) {
            drawableNewDrawable = c1019a.f26241a.newDrawable(resources);
        } else {
            drawableNewDrawable = c1019a.f26241a.newDrawable(resources, theme);
        }
        c1019a.f26241a = drawableNewDrawable.getConstantState();
        C1019a c1019aA = a();
        this.f26239a = c1019aA;
        c1019aA.b(c1019a.f26241a);
        this.f26240b = drawableNewDrawable.getIntrinsicWidth();
        this.c = drawableNewDrawable.getIntrinsicHeight();
        if (drawableNewDrawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawableNewDrawable;
            setCornerRadius(gradientDrawable.getCornerRadius());
            setShape(gradientDrawable.getShape());
            setColor(gradientDrawable.getColor());
        }
    }
}
