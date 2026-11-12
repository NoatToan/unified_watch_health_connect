package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f4919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f4920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i14) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i14);
        t0.a(context);
        r0.a(getContext(), this);
        w wVar = new w(this);
        this.f4919c = wVar;
        wVar.f(attributeSet, i14);
        wVar.b();
        e eVar = new e(this);
        this.f4918b = eVar;
        eVar.d(attributeSet, i14);
        g gVar = new g(this);
        this.f4917a = gVar;
        CheckedTextView checkedTextView = gVar.f5109a;
        Context context2 = checkedTextView.getContext();
        int[] iArr = h.a.f80432l;
        w0 w0VarG = w0.g(context2, attributeSet, iArr, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        androidx.core.view.s0.q(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, w0VarG.f5271b, i14, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    checkedTextView.setCheckMarkDrawable(j.a.a(checkedTextView.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        checkedTextView.setCheckMarkDrawable(j.a.a(checkedTextView.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                checkedTextView.setCheckMarkDrawable(j.a.a(checkedTextView.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                checkedTextView.setCheckMarkTintList(w0VarG.a(2));
            }
            if (typedArray.hasValue(3)) {
                checkedTextView.setCheckMarkTintMode(c0.c(typedArray.getInt(3, -1), null));
            }
            w0VarG.h();
            getEmojiTextViewHelper().c(attributeSet, i14);
        } catch (Throwable th3) {
            w0VarG.h();
            throw th3;
        }
    }

    private k getEmojiTextViewHelper() {
        if (this.f4920d == null) {
            this.f4920d = new k(this);
        }
        return this.f4920d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f4919c;
        if (wVar != null) {
            wVar.b();
        }
        e eVar = this.f4918b;
        if (eVar != null) {
            eVar.a();
        }
        g gVar = this.f4917a;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p7.e.c(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f4918b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f4918b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g gVar = this.f4917a;
        if (gVar != null) {
            return gVar.f5110b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        g gVar = this.f4917a;
        if (gVar != null) {
            return gVar.f5111c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4919c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4919c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(this, inputConnectionOnCreateInputConnection, editorInfo);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z14) {
        super.setAllCaps(z14);
        getEmojiTextViewHelper().d(z14);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f4918b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i14) {
        super.setBackgroundResource(i14);
        e eVar = this.f4918b;
        if (eVar != null) {
            eVar.f(i14);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g gVar = this.f4917a;
        if (gVar != null) {
            if (gVar.f5114f) {
                gVar.f5114f = false;
            } else {
                gVar.f5114f = true;
                gVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f4919c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f4919c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z14) {
        getEmojiTextViewHelper().e(z14);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f4918b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f4918b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g gVar = this.f4917a;
        if (gVar != null) {
            gVar.f5110b = colorStateList;
            gVar.f5112d = true;
            gVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g gVar = this.f4917a;
        if (gVar != null) {
            gVar.f5111c = mode;
            gVar.f5113e = true;
            gVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w wVar = this.f4919c;
        wVar.h(colorStateList);
        wVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w wVar = this.f4919c;
        wVar.i(mode);
        wVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i14) {
        super.setTextAppearance(context, i14);
        w wVar = this.f4919c;
        if (wVar != null) {
            wVar.g(i14, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i14) {
        setCheckMarkDrawable(j.a.a(getContext(), i14));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }
}
