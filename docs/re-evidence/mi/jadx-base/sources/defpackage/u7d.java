package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import miuix.androidbasewidget.widget.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class u7d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f35492b;
    public final TextInputLayout c;
    public LinearLayout d;
    public int e;
    public FrameLayout f;
    public int g;
    public int h;
    public CharSequence i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f35493k;
    public CharSequence l;
    public int m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35491a = 8;
    public ColorStateList o = j(yhi.e);
    public int n = i(yhi.f);

    public u7d(TextInputLayout textInputLayout) {
        this.f35492b = textInputLayout.getContext();
        this.c = textInputLayout;
    }

    public void a(TextView textView, int i) {
        if (this.d == null && this.f == null) {
            LinearLayout linearLayout = new LinearLayout(this.f35492b);
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.c.addView(this.d, -2, -2);
            t(8);
            this.f = new FrameLayout(this.f35492b);
            this.d.addView(this.f, new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
        if (k(i)) {
            this.f.setVisibility(0);
            this.f.addView(textView);
        } else {
            this.d.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.d.setVisibility(0);
        this.e++;
    }

    public final TextView b(int i) {
        if (i != 1) {
            return null;
        }
        return this.f35493k;
    }

    public int c() {
        return this.m;
    }

    public CharSequence d() {
        return this.l;
    }

    public int e() {
        return this.n;
    }

    public TextView f() {
        return this.f35493k;
    }

    public int g() {
        TextView textView = this.f35493k;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void h() {
        int i = this.g;
        if (i == 1) {
            this.h = 0;
        }
        w(i, this.h);
    }

    public final int i(int i) {
        TypedValue typedValue = new TypedValue();
        return this.f35492b.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.resourceId : y2j.g;
    }

    public final ColorStateList j(int i) {
        TypedValue typedValue = new TypedValue();
        return ni4.d(this.f35492b, this.f35492b.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.resourceId : qki.i);
    }

    public boolean k(int i) {
        return i == 0;
    }

    public boolean l() {
        return this.j;
    }

    public void m(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.d == null) {
            return;
        }
        if (!k(i) || (frameLayout = this.f) == null) {
            this.d.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.e - 1;
        this.e = i2;
        u(this.d, i2);
    }

    public final void n(int i, int i2) {
        TextView textViewB;
        TextView textViewB2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (textViewB2 = b(i2)) != null) {
            textViewB2.setVisibility(0);
            textViewB2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewB = b(i)) != null) {
            textViewB.setVisibility(4);
            if (i == 1) {
                textViewB.setText((CharSequence) null);
            }
        }
        this.g = i2;
    }

    public void o(int i) {
        this.m = i;
        TextView textView = this.f35493k;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public void p(CharSequence charSequence) {
        this.l = charSequence;
        TextView textView = this.f35493k;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void q(boolean z) {
        if (this.j == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f35492b);
            this.f35493k = appCompatTextView;
            appCompatTextView.setId(usi.f36089a);
            this.f35493k.setTextAlignment(5);
            r(this.n);
            s(this.o);
            p(this.l);
            o(this.m);
            this.f35493k.setVisibility(4);
            a(this.f35493k, 0);
        } else {
            h();
            m(this.f35493k, 0);
            this.f35493k = null;
        }
        this.j = z;
    }

    public void r(int i) {
        this.n = i;
        TextView textView = this.f35493k;
        if (textView != null) {
            this.c.a(textView, i);
        }
    }

    public void s(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.f35493k;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void t(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.setMargins((int) TypedValue.applyDimension(1, i, this.f35492b.getResources().getDisplayMetrics()), 0, 0, 0);
        this.d.setLayoutParams(layoutParams);
    }

    public final void u(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public void v(CharSequence charSequence) {
        this.i = charSequence;
        this.f35493k.setText(charSequence);
        int i = this.g;
        if (i != 1) {
            this.h = 1;
        }
        w(i, this.h);
        this.f35493k.announceForAccessibility(charSequence);
    }

    public final void w(int i, int i2) {
        if (i == i2) {
            return;
        }
        n(i, i2);
    }
}
