package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class z extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f5289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f5290c;

    public z(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        r0.a(getContext(), this);
        e eVar = new e(this);
        this.f5288a = eVar;
        eVar.d(attributeSet, i14);
        w wVar = new w(this);
        this.f5289b = wVar;
        wVar.f(attributeSet, i14);
        getEmojiTextViewHelper().c(attributeSet, i14);
    }

    private k getEmojiTextViewHelper() {
        if (this.f5290c == null) {
            this.f5290c = new k(this);
        }
        return this.f5290c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f5288a;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.f5289b;
        if (wVar != null) {
            wVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f5288a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f5288a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5289b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5289b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z14) {
        super.setAllCaps(z14);
        getEmojiTextViewHelper().d(z14);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f5288a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i14) {
        super.setBackgroundResource(i14);
        e eVar = this.f5288a;
        if (eVar != null) {
            eVar.f(i14);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f5289b;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f5289b;
        if (wVar != null) {
            wVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z14) {
        getEmojiTextViewHelper().e(z14);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f5288a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f5288a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w wVar = this.f5289b;
        wVar.h(colorStateList);
        wVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w wVar = this.f5289b;
        wVar.i(mode);
        wVar.b();
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public z(Context context) {
        this(context, null);
    }
}
