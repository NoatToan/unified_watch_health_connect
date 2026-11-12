package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import defpackage.awi;
import defpackage.hm1;
import defpackage.nx1;
import defpackage.wc0;
import defpackage.z1j;
import defpackage.zhi;
import java.lang.ref.WeakReference;
import miuix.miuixbasewidget.widget.FilterSortView2;

/* JADX INFO: loaded from: classes3.dex */
public class SecondaryTabContainerView extends FilterSortView2 implements wc0.a {
    public a i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26465k;
    public int l;
    public int m;

    public static class SecondaryTabView extends FilterSortView2.TabView {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ActionBar.c f26466k;
        public SecondaryTabContainerView l;
        public View m;
        public final nx1 n;
        public boolean o;
        public boolean p;

        public SecondaryTabView(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBadgeDisappearOnClick(boolean z) {
            this.p = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBadgeNeeded(boolean z) {
            this.o = z;
            r();
        }

        public ActionBar.c getTab() {
            return this.f26466k;
        }

        public void m(SecondaryTabContainerView secondaryTabContainerView, ActionBar.c cVar) {
            this.l = secondaryTabContainerView;
            this.f26466k = cVar;
            q();
        }

        public final void n() {
            nx1 nx1Var = this.n;
            if (nx1Var != null) {
                nx1Var.a(this);
            }
        }

        public final void o() {
            nx1 nx1Var = this.n;
            if (nx1Var != null) {
                nx1Var.d();
            }
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            s();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            r();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.o) {
                StringBuilder sb = new StringBuilder();
                TextView textView = getTextView();
                if (textView != null && textView.getText() != null) {
                    sb.append(textView.getText());
                }
                sb.append(getResources().getString(z1j.g));
                accessibilityNodeInfo.setContentDescription(sb);
            }
        }

        public final void p(CharSequence charSequence) {
            super.d(charSequence, true);
        }

        public void q() {
            ActionBar.c cVar = this.f26466k;
            View viewB = cVar.b();
            ImageView iconView = getIconView();
            TextView textView = getTextView();
            if (viewB != null) {
                this.m = this.l.A(this, viewB, textView, iconView);
                return;
            }
            View view = this.m;
            if (view != null) {
                removeView(view);
                this.m = null;
            }
            Context context = getContext();
            Drawable drawableC = cVar.c();
            CharSequence charSequenceE = cVar.e();
            if (drawableC != null) {
                if (iconView == null) {
                    ImageView imageView = new ImageView(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    imageView.setLayoutParams(layoutParams);
                    addView(imageView, 0);
                    setIconView(imageView);
                } else {
                    iconView.setImageDrawable(drawableC);
                    iconView.setVisibility(0);
                }
            } else if (iconView != null) {
                iconView.setVisibility(8);
                iconView.setImageDrawable(null);
            }
            if (charSequenceE != null) {
                if (textView == null) {
                    TextView textView2 = new TextView(context);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    textView2.setLayoutParams(layoutParams2);
                    addView(textView2);
                    setTextView(textView2);
                } else {
                    textView.setText(charSequenceE);
                    textView.setVisibility(0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
            if (iconView != null) {
                iconView.setContentDescription(cVar.a());
            }
        }

        public final void r() {
            if (this.o) {
                n();
            } else {
                o();
            }
        }

        public final void s() {
            ImageView iconView = getIconView();
            if (iconView != null) {
                iconView.setImageDrawable(this.f26466k.c());
            }
        }

        public SecondaryTabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public SecondaryTabView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.o = false;
            this.p = true;
            this.n = new nx1(context, 2);
        }
    }

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<SecondaryTabContainerView> f26467a;

        public a(SecondaryTabContainerView secondaryTabContainerView) {
            this.f26467a = new WeakReference<>(secondaryTabContainerView);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeakReference<SecondaryTabContainerView> weakReference = this.f26467a;
            SecondaryTabContainerView secondaryTabContainerView = weakReference != null ? weakReference.get() : null;
            if (secondaryTabContainerView == null) {
                return;
            }
            SecondaryTabView secondaryTabView = (SecondaryTabView) view;
            secondaryTabView.getTab().f();
            int tabCount = secondaryTabContainerView.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                FilterSortView2.TabView tabViewF = secondaryTabContainerView.f(i);
                tabViewF.setActivated(tabViewF == view);
            }
            if (secondaryTabView.p) {
                secondaryTabView.setBadgeNeeded(false);
            }
        }
    }

    public SecondaryTabContainerView(Context context) {
        super(context);
        s(context);
    }

    public View A(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        return null;
    }

    public void B(int i) {
        FilterSortView2.TabView tabViewF = f(i);
        if (tabViewF instanceof SecondaryTabView) {
            ((SecondaryTabView) tabViewF).q();
        }
        if (this.f26465k) {
            requestLayout();
        }
    }

    public int getDefaultTabTextStyle() {
        return zhi.m;
    }

    public int getTabActivatedTextStyle() {
        return zhi.i;
    }

    public int getTabContainerHeight() {
        return -2;
    }

    public SecondaryTabView o(ActionBar.c cVar, int i, boolean z) {
        SecondaryTabView secondaryTabViewR = r(cVar);
        b(secondaryTabViewR, i);
        c(secondaryTabViewR.getId());
        secondaryTabViewR.p(cVar.e());
        secondaryTabViewR.setSelected(this.e);
        if (z) {
            setFilteredTab(secondaryTabViewR);
            secondaryTabViewR.setActivated(true);
        }
        requestLayout();
        return secondaryTabViewR;
    }

    @Override // miuix.miuixbasewidget.widget.FilterSortView2, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.j;
        if (i3 != -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // wc0.a
    public void onPageScrollStateChanged(int i) {
    }

    @Override // wc0.a
    public void onPageScrolled(int i, float f, boolean z, boolean z2) {
    }

    @Override // wc0.a
    public void onPageSelected(int i) {
        FilterSortView2.TabView tabViewF = f(i);
        if (tabViewF instanceof SecondaryTabView) {
            setFilteredTab(tabViewF);
        }
    }

    public SecondaryTabView p(ActionBar.c cVar, boolean z) {
        SecondaryTabView secondaryTabViewR = r(cVar);
        b(secondaryTabViewR, -1);
        c(secondaryTabViewR.getId());
        secondaryTabViewR.p(cVar.e());
        secondaryTabViewR.setSelected(this.e);
        if (z) {
            setFilteredTab(secondaryTabViewR);
            secondaryTabViewR.setActivated(true);
        }
        requestLayout();
        return secondaryTabViewR;
    }

    public void q(int i) {
        setFilteredTab(i);
    }

    public SecondaryTabView r(ActionBar.c cVar) {
        SecondaryTabView secondaryTabView = (SecondaryTabView) LayoutInflater.from(getContext()).inflate(awi.f3517b, (ViewGroup) null);
        secondaryTabView.m(this, cVar);
        secondaryTabView.setFocusable(true);
        if (this.i == null) {
            this.i = new a(this);
        }
        secondaryTabView.setOnClickListener(this.i);
        secondaryTabView.setEnabled(getEnabled());
        secondaryTabView.setTextAppearance(this.l);
        secondaryTabView.setActivatedTextAppearance(this.m);
        return secondaryTabView;
    }

    public final void s(Context context) {
        this.l = hm1.c(context, getDefaultTabTextStyle());
        this.m = hm1.c(context, getTabActivatedTextStyle());
    }

    public void setAllowCollapse(boolean z) {
        this.f26465k = z;
    }

    public void setContentHeight(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
        }
    }

    public void setTabSelected(int i) {
        setFilteredTab(i);
    }

    public void t() {
        i();
        e();
        if (this.f26465k) {
            requestLayout();
        }
    }

    public void u(int i) {
        FilterSortView2.TabView tabViewF = f(i);
        if (tabViewF instanceof SecondaryTabView) {
            j(i);
            k(tabViewF.getId());
        }
        if (this.f26465k) {
            requestLayout();
        }
    }

    public void v(int i, boolean z) {
        if (i >= getTabCount()) {
            return;
        }
        FilterSortView2.TabView tabViewF = f(i);
        if (tabViewF instanceof SecondaryTabView) {
            ((SecondaryTabView) tabViewF).setBadgeNeeded(z);
        }
    }

    public void w(int i, boolean z) {
        if (i >= getTabCount()) {
            return;
        }
        FilterSortView2.TabView tabViewF = f(i);
        if (tabViewF instanceof SecondaryTabView) {
            ((SecondaryTabView) tabViewF).setBadgeDisappearOnClick(z);
        }
    }

    public void x(int i, int i2, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        FilterSortView2.TabView tabViewF;
        TextView textView;
        if (i > getChildCount() - 1 || (tabViewF = f(i)) == null || (textView = tabViewF.getTextView()) == null) {
            return;
        }
        textView.setCompoundDrawablePadding(i2);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Deprecated
    public void y(int i, int i2) {
        z(i, i2, i2);
    }

    public void z(int i, int i2, int i3) {
        FilterSortView2.TabView tabViewF;
        if (i < 0 || i >= getTabCount() || (tabViewF = f(i)) == null) {
            return;
        }
        tabViewF.setTextAppearance(i2);
        tabViewF.setActivatedTextAppearance(i3);
    }

    public SecondaryTabContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(context);
    }

    public SecondaryTabContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s(context);
    }
}
