package miuix.miuixbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.c;
import defpackage.a2j;
import defpackage.a3j;
import defpackage.aii;
import defpackage.alb;
import defpackage.dwi;
import defpackage.emi;
import defpackage.j5j;
import defpackage.m80;
import defpackage.p56;
import defpackage.s8p;
import defpackage.tc8;
import defpackage.ysi;
import defpackage.zkb;
import java.util.ArrayList;
import miuix.miuixbasewidget.widget.internal.TabViewContainerView;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class FilterSortView2 extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Integer> f26665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26666b;
    public boolean c;
    public TabViewContainerView d;
    public boolean e;
    public int f;
    public int g;
    public final int h;

    public static class TabView extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f26667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f26668b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;
        public Drawable g;
        public zkb h;
        public int i;
        public int j;

        public class a extends androidx.core.view.a {
            public a() {
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
                m80Var.G0(view.isActivated());
                TextView textView = (TextView) view.findViewById(R.id.text1);
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    m80Var.m0(textView.getText());
                }
                if (view.isActivated()) {
                    m80Var.j0(false);
                    m80Var.a0(m80.a.i);
                } else {
                    m80Var.j0(true);
                    m80Var.K0(TabView.this.getContext().getResources().getString(a2j.f550a));
                }
            }
        }

        public interface b {
        }

        public TabView(Context context) {
            this(context, null);
        }

        private zkb getHapticFeedbackCompat() {
            if (this.h == null) {
                this.h = new zkb(getContext());
            }
            return this.h;
        }

        private void setDescending(boolean z) {
            this.d = z;
            if (z) {
                this.f26668b.setRotationX(0.0f);
            } else {
                this.f26668b.setRotationX(180.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiltered(boolean z) {
            TabView tabView;
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (z && viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof TabView) && (tabView = (TabView) childAt) != this && tabView.c) {
                        tabView.setFiltered(false);
                    }
                }
            }
            this.c = z;
            h();
            this.f26667a.setActivated(z);
            this.f26668b.setActivated(z);
            setActivated(z);
            if (viewGroup != null && z) {
                viewGroup.post(new Runnable() { // from class: xm9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39261a.f();
                    }
                });
            }
        }

        public void d(CharSequence charSequence, boolean z) {
            this.f26668b.setBackground(this.g);
            this.f26667a.setText(charSequence);
            this.f26668b.setVisibility(this.f);
            setDescending(z);
            h();
        }

        public boolean e() {
            return this.c;
        }

        public final /* synthetic */ void f() {
        }

        public final /* synthetic */ void g(View.OnClickListener onClickListener, View view) {
            if (!this.c) {
                setFiltered(true);
            } else if (this.e) {
                setDescending(!this.d);
            }
            onClickListener.onClick(view);
            if (HapticCompat.c("2.0")) {
                getHapticFeedbackCompat().c(204);
            } else {
                HapticCompat.performHapticFeedback(view, alb.f1169k);
            }
        }

        public View getArrowView() {
            return this.f26668b;
        }

        public boolean getDescendingEnabled() {
            return this.e;
        }

        public ImageView getIconView() {
            return this.f26668b;
        }

        public int getTabLayoutResource() {
            return dwi.c;
        }

        public TextView getTextView() {
            return this.f26667a;
        }

        public final void h() {
            if (this.f26667a != null) {
                if (e()) {
                    s8p.o(this.f26667a, this.j);
                } else {
                    s8p.o(this.f26667a, this.i);
                }
                requestLayout();
            }
        }

        public void setActivatedTextAppearance(int i) {
            this.j = i;
            h();
        }

        public void setDescendingEnabled(boolean z) {
            this.e = z;
        }

        @Override // android.view.View
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            this.f26667a.setEnabled(z);
        }

        public void setIconView(ImageView imageView) {
            this.f26668b = imageView;
        }

        public void setIndicatorVisibility(int i) {
            this.f26668b.setVisibility(i);
        }

        @Override // android.view.View
        public void setOnClickListener(final View.OnClickListener onClickListener) {
            super.setOnClickListener(new View.OnClickListener() { // from class: wm9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38121a.g(onClickListener, view);
                }
            });
        }

        public void setOnFilteredListener(b bVar) {
        }

        public void setTextAppearance(int i) {
            this.i = i;
            h();
        }

        public void setTextView(TextView textView) {
            this.f26667a = textView;
        }

        public TabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, aii.f1062a);
        }

        public TabView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.e = true;
            LayoutInflater.from(context).inflate(getTabLayoutResource(), (ViewGroup) this, true);
            TextView textView = (TextView) findViewById(R.id.text1);
            this.f26667a = textView;
            textView.setMaxLines(1);
            this.f26667a.setEllipsize(TextUtils.TruncateAt.END);
            this.f26668b = (ImageView) findViewById(ysi.f40493a);
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5j.J, i, a3j.f578b);
                String string = typedArrayObtainStyledAttributes.getString(j5j.K);
                boolean z = typedArrayObtainStyledAttributes.getBoolean(j5j.M, true);
                this.f = typedArrayObtainStyledAttributes.getInt(j5j.T, 0);
                this.g = typedArrayObtainStyledAttributes.getDrawable(j5j.L);
                setBackground(typedArrayObtainStyledAttributes.getDrawable(j5j.N));
                setForeground(typedArrayObtainStyledAttributes.getDrawable(j5j.O));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j5j.P, emi.f16814k);
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(j5j.S, emi.l);
                findViewById(ysi.c).setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                this.i = typedArrayObtainStyledAttributes.getResourceId(j5j.R, 0);
                this.j = typedArrayObtainStyledAttributes.getResourceId(j5j.Q, 0);
                typedArrayObtainStyledAttributes.recycle();
                d(string, z);
            }
            if (getId() == -1) {
                setId(View.generateViewId());
            }
            setImportantForAccessibility(1);
            c.r0(this, new a());
        }
    }

    public FilterSortView2(Context context) {
        this(context, null);
    }

    private void g() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TabViewContainerView tabViewContainerView = new TabViewContainerView(getContext());
        this.d = tabViewContainerView;
        tabViewContainerView.setLayoutParams(layoutParams);
        this.d.setHorizontalScrollBarEnabled(false);
        addView(this.d);
    }

    public final void a(TabView tabView, int i) {
        tabView.setEnabled(this.c);
        tabView.setSelected(this.e);
        b(tabView, i);
        this.f26665a.add(Integer.valueOf(tabView.getId()));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    public void b(TabView tabView, int i) {
        if (tabView != null) {
            if (i > this.f || i < 0) {
                this.d.addView(tabView, -1, new FrameLayout.LayoutParams(-2, -2));
            } else {
                this.d.addView(tabView, i, new FrameLayout.LayoutParams(-2, -2));
            }
            this.f++;
        }
    }

    public void c(int i) {
        this.f26665a.add(Integer.valueOf(i));
    }

    public final void d(View view) {
        if (!(view instanceof TabView)) {
            throw new IllegalArgumentException("Illegal View! Only support TabView!");
        }
    }

    public void e() {
        this.f26665a.clear();
    }

    public TabView f(int i) {
        if (i <= -1) {
            return null;
        }
        View childAt = this.d.getChildAt((this.d.getChildCount() - this.f) + i);
        if (childAt instanceof TabView) {
            return (TabView) childAt;
        }
        return null;
    }

    public boolean getEnabled() {
        return this.c;
    }

    public int getTabCount() {
        return this.f;
    }

    public final void h() {
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = this.d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setEnabled(this.c);
            }
        }
    }

    public void i() {
        this.d.removeAllViews();
        e();
        this.f = 0;
    }

    public void j(int i) {
        if (i <= -1) {
            return;
        }
        View childAt = this.d.getChildAt(i);
        if (childAt instanceof TabView) {
            this.d.removeView(childAt);
            this.f--;
            k(childAt.getId());
        }
    }

    public void k(int i) {
        this.f26665a.remove(Integer.valueOf(i));
    }

    public void l() {
        if (this.f26665a.isEmpty()) {
            int childCount = this.d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.d.getChildAt(i);
                if (childAt instanceof TabView) {
                    this.f26665a.add(Integer.valueOf(((TabView) childAt).getId()));
                }
            }
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i3 = this.g;
        int i4 = 2;
        if (i3 == 0) {
            int i5 = (int) ((size * 1.0f) / f);
            int i6 = (int) ((tc8.l(getContext()).x * 1.0f) / f);
            if (this.h != 2 || i5 <= 410 || i6 <= 640) {
                i4 = 0;
            } else {
                i4 = 1;
            }
        } else if (i3 == 1) {
            int i7 = (int) ((tc8.l(getContext()).x * 1.0f) / f);
            if (this.h != 2 || i7 <= 640) {
                i4 = 0;
            } else {
                i4 = 1;
            }
        } else if (i3 == 3) {
            i4 = 1;
        } else if (i3 != 4) {
            i4 = 0;
        }
        this.d.setTabViewLayoutMode(i4);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.c != z) {
            this.c = z;
            h();
        }
    }

    public void setFilteredTab(TabView tabView) {
        if (this.f26666b != tabView.getId()) {
            this.f26666b = tabView.getId();
        }
        tabView.setFiltered(true);
        l();
    }

    public void setLayoutConfig(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setParentApplyBlur(boolean z) {
        if (this.e != z) {
            this.e = z;
        }
        TabViewContainerView tabViewContainerView = this.d;
        if (tabViewContainerView != null) {
            int childCount = tabViewContainerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = tabViewContainerView.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).setSelected(z);
                }
            }
        }
    }

    public void setTabIndicatorVisibility(int i) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setIndicatorVisibility(i);
            }
        }
    }

    public FilterSortView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aii.f1063b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        if (view == null) {
            throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    public FilterSortView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26665a = new ArrayList<>();
        this.f26666b = -1;
        this.e = false;
        this.f = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5j.Y, i, a3j.d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(j5j.a0);
        this.c = typedArrayObtainStyledAttributes.getBoolean(j5j.Z, true);
        this.g = typedArrayObtainStyledAttributes.getInt(j5j.b0, 0);
        typedArrayObtainStyledAttributes.recycle();
        g();
        setBackground(drawable);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.h = p56.a(context);
        setOverScrollMode(2);
    }

    public void setFilteredTab(int i) {
        TabView tabViewF = f(i);
        if (tabViewF != null) {
            if (this.f26666b != tabViewF.getId()) {
                this.f26666b = tabViewF.getId();
            }
            tabViewF.setFiltered(true);
        }
        l();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, (ViewGroup.LayoutParams) null);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.d == view) {
            super.addView(view, i, layoutParams);
        } else {
            d(view);
            a((TabView) view, i);
        }
    }
}
