package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.c;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f34410b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public Animator f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34411k;
    public TextView l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f34412r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f34414b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.f34413a = i;
            this.f34414b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t7d.this.h = this.f34413a;
            t7d.this.f = null;
            TextView textView = this.f34414b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && t7d.this.l != null) {
                    t7d.this.l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t7d.this.f34410b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t7d(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f34409a = context;
        this.f34410b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(pmi.q);
    }

    public boolean A() {
        return this.q;
    }

    public void B(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.c == null) {
            return;
        }
        if (!y(i) || (frameLayout = this.e) == null) {
            this.c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        M(this.c, i2);
    }

    public final void C(int i, int i2) {
        TextView textViewM;
        TextView textViewM2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (textViewM2 = m(i2)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewM = m(i)) != null) {
            textViewM.setVisibility(4);
            if (i == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.h = i2;
    }

    public void D(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void E(boolean z) {
        if (this.f34411k == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f34409a);
            this.l = appCompatTextView;
            appCompatTextView.setId(iqi.b0);
            this.l.setTextAlignment(5);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.l.setTypeface(typeface);
            }
            F(this.n);
            G(this.o);
            D(this.m);
            this.l.setVisibility(4);
            c.t0(this.l, 1);
            e(this.l, 0);
        } else {
            v();
            B(this.l, 0);
            this.l = null;
            this.f34410b.p0();
            this.f34410b.C0();
        }
        this.f34411k = z;
    }

    public void F(int i) {
        this.n = i;
        TextView textView = this.l;
        if (textView != null) {
            this.f34410b.b0(textView, i);
        }
    }

    public void G(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void H(int i) {
        this.s = i;
        TextView textView = this.f34412r;
        if (textView != null) {
            s8p.o(textView, i);
        }
    }

    public void I(boolean z) {
        if (this.q == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f34409a);
            this.f34412r = appCompatTextView;
            appCompatTextView.setId(iqi.c0);
            this.f34412r.setTextAlignment(5);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.f34412r.setTypeface(typeface);
            }
            this.f34412r.setVisibility(4);
            c.t0(this.f34412r, 1);
            H(this.s);
            J(this.t);
            e(this.f34412r, 1);
            this.f34412r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f34412r, 1);
            this.f34412r = null;
            this.f34410b.p0();
            this.f34410b.C0();
        }
        this.q = z;
    }

    public void J(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.f34412r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void L(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            K(this.l, typeface);
            K(this.f34412r, typeface);
        }
    }

    public final void M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean N(TextView textView, CharSequence charSequence) {
        return c.U(this.f34410b) && this.f34410b.isEnabled() && !(this.i == this.h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public void O(CharSequence charSequence) {
        h();
        this.j = charSequence;
        this.l.setText(charSequence);
        int i = this.h;
        if (i != 1) {
            this.i = 1;
        }
        Q(i, this.i, N(this.l, charSequence));
    }

    public void P(CharSequence charSequence) {
        h();
        this.p = charSequence;
        this.f34412r.setText(charSequence);
        int i = this.h;
        if (i != 2) {
            this.i = 2;
        }
        Q(i, this.i, N(this.f34412r, charSequence));
    }

    public final void Q(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.q, this.f34412r, 2, i, i2);
            i(arrayList, this.f34411k, this.l, 1, i, i2);
            zc1.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m(i), i, m(i2)));
            animatorSet.start();
        } else {
            C(i, i2);
        }
        this.f34410b.p0();
        this.f34410b.u0(z);
        this.f34410b.C0();
    }

    public void e(TextView textView, int i) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f34409a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.f34410b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.f34409a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f34410b.getEditText() != null) {
                f();
            }
        }
        if (y(i)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f34410b.getEditText();
            boolean zI = k8f.i(this.f34409a);
            c.J0(this.c, u(zI, pmi.J, c.F(editText)), u(zI, pmi.K, this.f34409a.getResources().getDimensionPixelSize(pmi.I)), u(zI, pmi.J, c.E(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.c == null || this.f34410b.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(j(textView, i3 == i));
            if (i3 == i) {
                list.add(k(textView));
            }
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(wc1.f37826a);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(wc1.d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return x(this.i);
    }

    public final TextView m(int i) {
        if (i == 1) {
            return this.l;
        }
        if (i != 2) {
            return null;
        }
        return this.f34412r;
    }

    public CharSequence n() {
        return this.m;
    }

    public CharSequence o() {
        return this.j;
    }

    public int p() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList q() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence r() {
        return this.p;
    }

    public View s() {
        return this.f34412r;
    }

    public int t() {
        TextView textView = this.f34412r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int u(boolean z, int i, int i2) {
        return z ? this.f34409a.getResources().getDimensionPixelSize(i) : i2;
    }

    public void v() {
        this.j = null;
        h();
        if (this.h == 1) {
            if (!this.q || TextUtils.isEmpty(this.p)) {
                this.i = 0;
            } else {
                this.i = 2;
            }
        }
        Q(this.h, this.i, N(this.l, ""));
    }

    public void w() {
        h();
        int i = this.h;
        if (i == 2) {
            this.i = 0;
        }
        Q(i, this.i, N(this.f34412r, ""));
    }

    public final boolean x(int i) {
        return (i != 1 || this.l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    public boolean y(int i) {
        return i == 0 || i == 1;
    }

    public boolean z() {
        return this.f34411k;
    }
}
