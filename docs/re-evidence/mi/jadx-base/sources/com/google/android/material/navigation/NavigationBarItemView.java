package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.g;
import defpackage.fpi;
import defpackage.h2j;
import defpackage.iqi;
import defpackage.k47;
import defpackage.k8f;
import defpackage.kti;
import defpackage.m80;
import defpackage.ni4;
import defpackage.pii;
import defpackage.pmi;
import defpackage.s8p;
import defpackage.t2i;
import defpackage.tip;
import defpackage.w8g;
import defpackage.wc1;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    public static final int[] C = {R.attr.state_checked};
    public static final d D;
    public static final d E;
    public int A;
    public com.google.android.material.badge.a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8749b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public boolean h;
    public final FrameLayout i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f8750k;
    public final ViewGroup l;
    public final TextView m;
    public final TextView n;
    public int o;
    public g p;
    public ColorStateList q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f8751r;
    public Drawable s;
    public ValueAnimator t;
    public d u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f8750k.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.u(navigationBarItemView.f8750k);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8753a;

        public b(int i) {
            this.f8753a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.v(this.f8753a);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f8755a;

        public c(float f) {
            this.f8755a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f8755a);
        }
    }

    public static class d {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public float a(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return wc1.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f);
        }

        public float b(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return wc1.a(0.4f, 1.0f, f);
        }

        public float c(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return 1.0f;
        }

        public void d(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, View view) {
            view.setScaleX(b(f, f2));
            view.setScaleY(c(f, f2));
            view.setAlpha(a(f, f2));
        }
    }

    public static class e extends d {
        public e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.d
        public float c(float f, float f2) {
            return b(f, f2);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        D = new d(aVar);
        E = new e(aVar);
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f8748a = false;
        this.o = -1;
        this.u = D;
        this.v = 0.0f;
        this.w = false;
        this.x = 0;
        this.y = 0;
        this.z = false;
        this.A = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.i = (FrameLayout) findViewById(iqi.navigation_bar_item_icon_container);
        this.j = findViewById(iqi.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(iqi.navigation_bar_item_icon_view);
        this.f8750k = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(iqi.navigation_bar_item_labels_group);
        this.l = viewGroup;
        TextView textView = (TextView) findViewById(iqi.navigation_bar_item_small_label_view);
        this.m = textView;
        TextView textView2 = (TextView) findViewById(iqi.navigation_bar_item_large_label_view);
        this.n = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f8749b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.c = viewGroup.getPaddingBottom();
        androidx.core.view.c.C0(textView, 2);
        androidx.core.view.c.C0(textView2, 2);
        setFocusable(true);
        g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.i;
        return frameLayout != null ? frameLayout : this.f8750k;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        com.google.android.material.badge.a aVar = this.B;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f8750k.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.B;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.B.i();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f8750k.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    public static void p(TextView textView, int i) {
        s8p.o(textView, i);
        int iH = k8f.h(textView.getContext(), i, 0);
        if (iH != 0) {
            textView.setTextSize(0, iH);
        }
    }

    public static void q(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void r(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void x(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void e(g gVar, int i) {
        this.p = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        tip.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f8748a = true;
    }

    public final void g(float f, float f2) {
        this.d = f - f2;
        this.e = (f2 * 1.0f) / f;
        this.f = (f * 1.0f) / f2;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.j;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.B;
    }

    public int getItemBackgroundResId() {
        return fpi.g;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public g getItemData() {
        return this.p;
    }

    public int getItemDefaultMarginResId() {
        return pmi.m0;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.o;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.l.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.l.getMeasuredWidth() + layoutParams.rightMargin);
    }

    public void h() {
        n();
        this.p = null;
        this.v = 0.0f;
        this.f8748a = false;
    }

    public final FrameLayout i(View view) {
        ImageView imageView = this.f8750k;
        if (view == imageView && com.google.android.material.badge.b.f8542a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    public final boolean j() {
        return this.B != null;
    }

    public final boolean k() {
        return this.z && this.g == 2;
    }

    public final void l(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (!this.w || !this.f8748a || !androidx.core.view.c.T(this)) {
            o(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.t = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, f);
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f));
        this.t.setInterpolator(w8g.e(getContext(), pii.O, wc1.f37827b));
        this.t.setDuration(w8g.d(getContext(), pii.N, getResources().getInteger(kti.f24282b)));
        this.t.start();
    }

    public final void m() {
        g gVar = this.p;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    public void n() {
        t(this.f8750k);
    }

    public final void o(@FloatRange(from = 0.0d, to = 1.0d) float f, float f2) {
        View view = this.j;
        if (view != null) {
            this.u.d(f, f2, view);
        }
        this.v = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.p;
        if (gVar != null && gVar.isCheckable() && this.p.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.B;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.p.getTitle();
            if (!TextUtils.isEmpty(this.p.getContentDescription())) {
                title = this.p.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.B.g()));
        }
        m80 m80VarP0 = m80.P0(accessibilityNodeInfo);
        m80VarP0.l0(m80.f.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            m80VarP0.j0(false);
            m80VarP0.a0(m80.a.i);
        }
        m80VarP0.D0(getResources().getString(h2j.h));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    public final void s(View view) {
        if (j() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.a(this.B, view, i(view));
        }
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.j;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.w = z;
        View view = this.j;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.y = i;
        v(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.A = i;
        v(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.z = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.x = i;
        v(getWidth());
    }

    public void setBadge(com.google.android.material.badge.a aVar) {
        if (this.B == aVar) {
            return;
        }
        if (j() && this.f8750k != null) {
            t(this.f8750k);
        }
        this.B = aVar;
        ImageView imageView = this.f8750k;
        if (imageView != null) {
            s(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.n;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.n;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.m;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.m;
        textView4.setPivotY(textView4.getBaseline());
        l(z ? 1.0f : 0.0f);
        int i = this.g;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    r(getIconOrContainer(), this.f8749b, 49);
                    x(this.l, this.c);
                    this.n.setVisibility(0);
                } else {
                    r(getIconOrContainer(), this.f8749b, 17);
                    x(this.l, 0);
                    this.n.setVisibility(4);
                }
                this.m.setVisibility(4);
            } else if (i == 1) {
                x(this.l, this.c);
                if (z) {
                    r(getIconOrContainer(), (int) (this.f8749b + this.d), 49);
                    q(this.n, 1.0f, 1.0f, 0);
                    TextView textView5 = this.m;
                    float f = this.e;
                    q(textView5, f, f, 4);
                } else {
                    r(getIconOrContainer(), this.f8749b, 49);
                    TextView textView6 = this.n;
                    float f2 = this.f;
                    q(textView6, f2, f2, 4);
                    q(this.m, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                r(getIconOrContainer(), this.f8749b, 17);
                this.n.setVisibility(8);
                this.m.setVisibility(8);
            }
        } else if (this.h) {
            if (z) {
                r(getIconOrContainer(), this.f8749b, 49);
                x(this.l, this.c);
                this.n.setVisibility(0);
            } else {
                r(getIconOrContainer(), this.f8749b, 17);
                x(this.l, 0);
                this.n.setVisibility(4);
            }
            this.m.setVisibility(4);
        } else {
            x(this.l, this.c);
            if (z) {
                r(getIconOrContainer(), (int) (this.f8749b + this.d), 49);
                q(this.n, 1.0f, 1.0f, 0);
                TextView textView7 = this.m;
                float f3 = this.e;
                q(textView7, f3, f3, 4);
            } else {
                r(getIconOrContainer(), this.f8749b, 49);
                TextView textView8 = this.n;
                float f4 = this.f;
                q(textView8, f4, f4, 4);
                q(this.m, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.m.setEnabled(z);
        this.n.setEnabled(z);
        this.f8750k.setEnabled(z);
        if (z) {
            androidx.core.view.c.K0(this, t2i.b(getContext(), 1002));
        } else {
            androidx.core.view.c.K0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f8751r) {
            return;
        }
        this.f8751r = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = k47.r(drawable).mutate();
            this.s = drawable;
            ColorStateList colorStateList = this.q;
            if (colorStateList != null) {
                k47.o(drawable, colorStateList);
            }
        }
        this.f8750k.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8750k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f8750k.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.q = colorStateList;
        if (this.p == null || (drawable = this.s) == null) {
            return;
        }
        k47.o(drawable, colorStateList);
        this.s.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ni4.e(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.c != i) {
            this.c = i;
            m();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f8749b != i) {
            this.f8749b = i;
            m();
        }
    }

    public void setItemPosition(int i) {
        this.o = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.g != i) {
            this.g = i;
            w();
            v(getWidth());
            m();
        }
    }

    public void setShifting(boolean z) {
        if (this.h != z) {
            this.h = z;
            m();
        }
    }

    public void setTextAppearanceActive(int i) {
        p(this.n, i);
        g(this.m.getTextSize(), this.n.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        p(this.m, i);
        g(this.m.getTextSize(), this.n.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m.setTextColor(colorStateList);
            this.n.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.m.setText(charSequence);
        this.n.setText(charSequence);
        g gVar = this.p;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.p;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.p.getTooltipText();
        }
        tip.a(this, charSequence);
    }

    public final void t(View view) {
        if (j()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.b.d(this.B, view);
            }
            this.B = null;
        }
    }

    public final void u(View view) {
        if (j()) {
            com.google.android.material.badge.b.e(this.B, view, i(view));
        }
    }

    public final void v(int i) {
        if (this.j == null) {
            return;
        }
        int iMin = Math.min(this.x, i - (this.A * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.height = k() ? iMin : this.y;
        layoutParams.width = iMin;
        this.j.setLayoutParams(layoutParams);
    }

    public final void w() {
        if (k()) {
            this.u = E;
        } else {
            this.u = D;
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        androidx.core.view.c.v0(this, drawable);
    }
}
