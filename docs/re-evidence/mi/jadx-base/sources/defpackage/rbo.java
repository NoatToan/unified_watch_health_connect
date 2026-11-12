package defpackage;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.c;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
public class rbo extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f32391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32392b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public View.OnLongClickListener g;
    public boolean h;

    public rbo(TextInputLayout textInputLayout, xfp xfpVar) {
        super(textInputLayout.getContext());
        this.f32391a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(kwi.n, (ViewGroup) this, false);
        this.d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f32392b = appCompatTextView;
        g(xfpVar);
        f(xfpVar);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public CharSequence a() {
        return this.c;
    }

    public ColorStateList b() {
        return this.f32392b.getTextColors();
    }

    public TextView c() {
        return this.f32392b;
    }

    public CharSequence d() {
        return this.d.getContentDescription();
    }

    public Drawable e() {
        return this.d.getDrawable();
    }

    public final void f(xfp xfpVar) {
        this.f32392b.setVisibility(8);
        this.f32392b.setId(iqi.e0);
        this.f32392b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c.t0(this.f32392b, 1);
        l(xfpVar.n(b4j.ua, 0));
        if (xfpVar.s(b4j.va)) {
            m(xfpVar.c(b4j.va));
        }
        k(xfpVar.p(b4j.ta));
    }

    public final void g(xfp xfpVar) {
        if (k8f.i(getContext())) {
            c5f.c((ViewGroup.MarginLayoutParams) this.d.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (xfpVar.s(b4j.za)) {
            this.e = k8f.a(getContext(), xfpVar, b4j.za);
        }
        if (xfpVar.s(b4j.Aa)) {
            this.f = ayq.k(xfpVar.k(b4j.Aa, -1), null);
        }
        if (xfpVar.s(b4j.ya)) {
            p(xfpVar.g(b4j.ya));
            if (xfpVar.s(b4j.xa)) {
                o(xfpVar.p(b4j.xa));
            }
            n(xfpVar.a(b4j.wa, true));
        }
    }

    public boolean h() {
        return this.d.getVisibility() == 0;
    }

    public void i(boolean z) {
        this.h = z;
        v();
    }

    public void j() {
        w1d.c(this.f32391a, this.d, this.e);
    }

    public void k(CharSequence charSequence) {
        this.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f32392b.setText(charSequence);
        v();
    }

    public void l(int i) {
        s8p.o(this.f32392b, i);
    }

    public void m(ColorStateList colorStateList) {
        this.f32392b.setTextColor(colorStateList);
    }

    public void n(boolean z) {
        this.d.setCheckable(z);
    }

    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        u();
    }

    public void p(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            w1d.a(this.f32391a, this.d, this.e, this.f);
            s(true);
            j();
        } else {
            s(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            o(null);
        }
    }

    public void q(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            w1d.a(this.f32391a, this.d, colorStateList, this.f);
        }
    }

    public void r(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            w1d.a(this.f32391a, this.d, this.e, mode);
        }
    }

    public void s(boolean z) {
        if (h() != z) {
            this.d.setVisibility(z ? 0 : 8);
            u();
            v();
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        w1d.e(this.d, onClickListener, this.g);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.g = onLongClickListener;
        w1d.f(this.d, onLongClickListener);
    }

    public void t(m80 m80Var) {
        if (this.f32392b.getVisibility() != 0) {
            m80Var.M0(this.d);
        } else {
            m80Var.u0(this.f32392b);
            m80Var.M0(this.f32392b);
        }
    }

    public void u() {
        EditText editText = this.f32391a.e;
        if (editText == null) {
            return;
        }
        c.J0(this.f32392b, h() ? 0 : c.F(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(pmi.L), editText.getCompoundPaddingBottom());
    }

    public final void v() {
        int i = (this.c == null || this.h) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f32392b.setVisibility(i);
        this.f32391a.o0();
    }
}
