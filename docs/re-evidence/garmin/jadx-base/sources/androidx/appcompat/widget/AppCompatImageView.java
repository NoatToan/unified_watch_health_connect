package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final n mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        t0.a(context);
        this.mHasLevel = false;
        r0.a(getContext(), this);
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i14);
        n nVar = new n(this);
        this.mImageHelper = nVar;
        nVar.b(attributeSet, i14);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        u0 u0Var;
        n nVar = this.mImageHelper;
        if (nVar == null || (u0Var = nVar.f5179b) == null) {
            return null;
        }
        return u0Var.f5248a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        u0 u0Var;
        n nVar = this.mImageHelper;
        if (nVar == null || (u0Var = nVar.f5179b) == null) {
            return null;
        }
        return u0Var.f5249b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f5178a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i14) {
        super.setBackgroundResource(i14);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i14);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n nVar = this.mImageHelper;
        if (nVar != null && drawable != null && !this.mHasLevel) {
            nVar.f5180c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        n nVar2 = this.mImageHelper;
        if (nVar2 != null) {
            nVar2.a();
            if (this.mHasLevel) {
                return;
            }
            n nVar3 = this.mImageHelper;
            ImageView imageView = nVar3.f5178a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(nVar3.f5180c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i14) {
        super.setImageLevel(i14);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i14) {
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.c(i14);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.mImageHelper;
        if (nVar != null) {
            if (nVar.f5179b == null) {
                nVar.f5179b = new u0();
            }
            u0 u0Var = nVar.f5179b;
            u0Var.f5248a = colorStateList;
            u0Var.f5251d = true;
            nVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.mImageHelper;
        if (nVar != null) {
            if (nVar.f5179b == null) {
                nVar.f5179b = new u0();
            }
            u0 u0Var = nVar.f5179b;
            u0Var.f5249b = mode;
            u0Var.f5250c = true;
            nVar.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
