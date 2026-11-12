package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;
import defpackage.f9p;
import defpackage.lf1;
import defpackage.qii;
import defpackage.ufp;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f1576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lf1 f1577b;
    public boolean c;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            lf1Var.c();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            return lf1Var.d();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            return lf1Var.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1577b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            lf1Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null && drawable != null && !this.c) {
            lf1Var.h(drawable);
        }
        super.setImageDrawable(drawable);
        lf1 lf1Var2 = this.f1577b;
        if (lf1Var2 != null) {
            lf1Var2.c();
            if (this.c) {
                return;
            }
            this.f1577b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f1577b.i(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            lf1Var.c();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1576a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(ColorStateList colorStateList) {
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            lf1Var.j(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        lf1 lf1Var = this.f1577b;
        if (lf1Var != null) {
            lf1Var.k(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.F);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(ufp.b(context), attributeSet, i);
        this.c = false;
        f9p.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1576a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i);
        lf1 lf1Var = new lf1(this);
        this.f1577b = lf1Var;
        lf1Var.g(attributeSet, i);
    }
}
