package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.e5j;
import defpackage.ni4;
import defpackage.qki;
import defpackage.s8p;
import defpackage.u7d;
import defpackage.y2j;
import defpackage.yhi;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f26262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.widget.EditText f26263b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final u7d j;

    public TextInputLayout(Context context) {
        this(context, null, yhi.g);
    }

    private int getErrorTextAppearance() {
        return this.j.e();
    }

    public void a(TextView textView, int i) {
        try {
            s8p.o(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        s8p.o(textView, y2j.f39717a);
        textView.setTextColor(ni4.c(getContext(), qki.f31606a));
    }

    public final void b(int i, int i2, int i3, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setPadding((int) TypedValue.applyDimension(1, i, displayMetrics), (int) TypedValue.applyDimension(1, i3, displayMetrics), (int) TypedValue.applyDimension(1, i2, displayMetrics), (int) TypedValue.applyDimension(1, i4, displayMetrics));
    }

    public android.widget.EditText getEditText() {
        this.f26263b = null;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof android.widget.EditText) {
                this.f26263b = (android.widget.EditText) childAt;
                break;
            }
        }
        return this.f26263b;
    }

    public CharSequence getError() {
        return this.f26262a;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.c();
    }

    public CharSequence getErrorContentDescription() {
        return this.j.d();
    }

    public int getErrorCurrentTextColors() {
        return this.j.g();
    }

    public TextView getErrorView() {
        return this.j.f();
    }

    public void setError(CharSequence charSequence) {
        if (!this.j.l()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f26262a = null;
            this.j.h();
            return;
        }
        this.f26262a = charSequence;
        this.j.v(charSequence);
        android.widget.EditText editText = this.f26263b;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                charSequence = ((Object) charSequence) + text.toString();
            }
            setContentDescription(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.j.o(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.j.p(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.j.q(z);
    }

    public void setErrorTextAppearance(int i) {
        this.j.r(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.j.s(colorStateList);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, yhi.g);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 8;
        this.d = 16;
        this.e = 12;
        this.f = 12;
        this.g = 0;
        this.h = 1;
        this.i = 2;
        this.j = new u7d(this);
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5j.s0, i, y2j.f);
        this.f26262a = typedArrayObtainStyledAttributes.hasValue(e5j.t0) ? typedArrayObtainStyledAttributes.getText(e5j.t0) : null;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(e5j.w0, getErrorTextAppearance());
        CharSequence text = typedArrayObtainStyledAttributes.hasValue(e5j.v0) ? typedArrayObtainStyledAttributes.getText(e5j.v0) : this.f26262a;
        int i2 = typedArrayObtainStyledAttributes.getInt(e5j.u0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(e5j.x0)) {
            setErrorTextColor(typedArrayObtainStyledAttributes.getColorStateList(e5j.x0));
        }
        typedArrayObtainStyledAttributes.recycle();
        b(12, 12, 8, 16);
        setErrorTextAppearance(resourceId);
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setErrorEnabled(false);
    }
}
