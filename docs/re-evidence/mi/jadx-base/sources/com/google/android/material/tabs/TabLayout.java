package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.core.util.Pools;
import androidx.viewpager.widget.ViewPager;
import defpackage.auk;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c48;
import defpackage.c5f;
import defpackage.c9p;
import defpackage.eih;
import defpackage.h2j;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.kwi;
import defpackage.l8f;
import defpackage.m80;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.of1;
import defpackage.pii;
import defpackage.pmi;
import defpackage.s8p;
import defpackage.t2i;
import defpackage.tip;
import defpackage.wc1;
import defpackage.z5j;
import defpackage.z79;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    public static final int R = k3j.o;
    public static final Pools.Pool<g> S = new Pools.SynchronizedPool(16);
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public com.google.android.material.tabs.a F;
    public c G;
    public final ArrayList<c> H;
    public c I;
    public ValueAnimator J;
    public ViewPager K;
    public eih L;
    public DataSetObserver M;
    public h N;
    public b O;
    public boolean P;
    public final Pools.Pool<TabView> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<g> f8839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f8840b;
    public final f c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ColorStateList i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f8841k;
    public Drawable l;
    public int m;
    public PorterDuff.Mode n;
    public float o;
    public float p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8842r;
    public final int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f8843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f8844b;
        public ImageView c;
        public View d;
        public com.google.android.material.badge.a e;
        public View f;
        public TextView g;
        public ImageView h;
        public Drawable i;
        public int j;

        public class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f8846a;

            public a(View view) {
                this.f8846a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f8846a.getVisibility() == 0) {
                    TabView.this.s(this.f8846a);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            this.j = 2;
            u(context);
            androidx.core.view.c.J0(this, TabLayout.this.d, TabLayout.this.e, TabLayout.this.f, TabLayout.this.g);
            setGravity(17);
            setOrientation(!TabLayout.this.A ? 1 : 0);
            setClickable(true);
            androidx.core.view.c.K0(this, t2i.b(getContext(), 1002));
        }

        private com.google.android.material.badge.a getBadge() {
            return this.e;
        }

        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.e == null) {
                this.e = com.google.android.material.badge.a.c(getContext());
            }
            r();
            com.google.android.material.badge.a aVar = this.e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            if (drawable != null && drawable.isStateful() && this.i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        public final float g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        public int getContentHeight() {
            View[] viewArr = {this.f8844b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f8844b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f8843a;
        }

        public final void h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        public final FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void j(Canvas canvas) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.i.draw(canvas);
            }
        }

        public final FrameLayout k(View view) {
            if ((view == this.c || view == this.f8844b) && com.google.android.material.badge.b.f8542a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean l() {
            return this.e != null;
        }

        public final void m() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.b.f8542a) {
                FrameLayout frameLayoutI = i();
                addView(frameLayoutI, 0);
                viewGroup = frameLayoutI;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(kwi.e, viewGroup, false);
            this.c = imageView;
            viewGroup.addView(imageView, 0);
        }

        public final void n() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.b.f8542a) {
                FrameLayout frameLayoutI = i();
                addView(frameLayoutI);
                viewGroup = frameLayoutI;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(kwi.f, viewGroup, false);
            this.f8844b = textView;
            viewGroup.addView(textView);
        }

        public void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.e;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.e.g()));
            }
            m80 m80VarP0 = m80.P0(accessibilityNodeInfo);
            m80VarP0.l0(m80.f.b(0, 1, this.f8843a.g(), 1, false, isSelected()));
            if (isSelected()) {
                m80VarP0.j0(false);
                m80VarP0.a0(m80.a.i);
            }
            m80VarP0.D0(getResources().getString(h2j.h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f8842r, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f8844b != null) {
                float f = TabLayout.this.o;
                int i3 = this.j;
                ImageView imageView = this.c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f8844b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.p;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f8844b.getTextSize();
                int lineCount = this.f8844b.getLineCount();
                int iD = s8p.d(this.f8844b);
                if (f != textSize || (iD >= 0 && i3 != iD)) {
                    if (TabLayout.this.z != 1 || f <= textSize || lineCount != 1 || ((layout = this.f8844b.getLayout()) != null && g(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f8844b.setTextSize(0, f);
                        this.f8844b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public final void p(View view) {
            if (l() && view != null) {
                h(false);
                com.google.android.material.badge.b.a(this.e, view, k(view));
                this.d = view;
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f8843a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f8843a.m();
            return true;
        }

        public final void q() {
            if (l()) {
                h(true);
                View view = this.d;
                if (view != null) {
                    com.google.android.material.badge.b.d(this.e, view);
                    this.d = null;
                }
            }
        }

        public final void r() {
            g gVar;
            g gVar2;
            if (l()) {
                if (this.f != null) {
                    q();
                    return;
                }
                if (this.c != null && (gVar2 = this.f8843a) != null && gVar2.f() != null) {
                    View view = this.d;
                    ImageView imageView = this.c;
                    if (view == imageView) {
                        s(imageView);
                        return;
                    } else {
                        q();
                        p(this.c);
                        return;
                    }
                }
                if (this.f8844b == null || (gVar = this.f8843a) == null || gVar.h() != 1) {
                    q();
                    return;
                }
                View view2 = this.d;
                TextView textView = this.f8844b;
                if (view2 == textView) {
                    s(textView);
                } else {
                    q();
                    p(this.f8844b);
                }
            }
        }

        public final void s(View view) {
            if (l() && view == this.d) {
                com.google.android.material.badge.b.e(this.e, view, k(view));
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f8844b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f8843a) {
                this.f8843a = gVar;
                t();
            }
        }

        public final void t() {
            g gVar = this.f8843a;
            View viewE = gVar != null ? gVar.e() : null;
            if (viewE != null) {
                ViewParent parent = viewE.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewE);
                    }
                    addView(viewE);
                }
                this.f = viewE;
                TextView textView = this.f8844b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.g = textView2;
                if (textView2 != null) {
                    this.j = s8p.d(textView2);
                }
                this.h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view = this.f;
                if (view != null) {
                    removeView(view);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    m();
                }
                if (this.f8844b == null) {
                    n();
                    this.j = s8p.d(this.f8844b);
                }
                s8p.o(this.f8844b, TabLayout.this.h);
                ColorStateList colorStateList = TabLayout.this.i;
                if (colorStateList != null) {
                    this.f8844b.setTextColor(colorStateList);
                }
                w(this.f8844b, this.c);
                r();
                f(this.c);
                f(this.f8844b);
            } else {
                TextView textView3 = this.g;
                if (textView3 != null || this.h != null) {
                    w(textView3, this.h);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.d)) {
                setContentDescription(gVar.d);
            }
            setSelected(gVar != null && gVar.k());
        }

        public final void u(Context context) {
            GradientDrawable gradientDrawable;
            int i = TabLayout.this.q;
            if (i != 0) {
                Drawable drawableB = of1.b(context, i);
                this.i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f8841k != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = auk.a(TabLayout.this.f8841k);
                boolean z = TabLayout.this.E;
                if (z) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable3);
            }
            androidx.core.view.c.v0(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        public final void v() {
            setOrientation(!TabLayout.this.A ? 1 : 0);
            TextView textView = this.g;
            if (textView == null && this.h == null) {
                w(this.f8844b, this.c);
            } else {
                w(textView, this.h);
            }
        }

        public final void w(TextView textView, ImageView imageView) {
            g gVar = this.f8843a;
            Drawable drawableMutate = (gVar == null || gVar.f() == null) ? null : k47.r(this.f8843a.f()).mutate();
            if (drawableMutate != null) {
                k47.o(drawableMutate, TabLayout.this.j);
                PorterDuff.Mode mode = TabLayout.this.n;
                if (mode != null) {
                    k47.p(drawableMutate, mode);
                }
            }
            g gVar2 = this.f8843a;
            CharSequence charSequenceJ = gVar2 != null ? gVar2.j() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceJ);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequenceJ);
                    if (this.f8843a.g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iD = (z && imageView.getVisibility() == 0) ? (int) ayq.d(getContext(), 8) : 0;
                if (TabLayout.this.A) {
                    if (iD != c5f.a(marginLayoutParams)) {
                        c5f.c(marginLayoutParams, iD);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iD != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iD;
                    c5f.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f8843a;
            CharSequence charSequence = gVar3 != null ? gVar3.d : null;
            if (!z) {
                charSequenceJ = charSequence;
            }
            tip.a(this, charSequenceJ);
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8849a;

        public b() {
        }

        public void a(boolean z) {
            this.f8849a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, eih eihVar, eih eihVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.K == viewPager) {
                tabLayout.H(eihVar2, this.f8849a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.B();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.B();
        }
    }

    public class f extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ValueAnimator f8852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8853b;
        public float c;
        public int d;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f8854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f8855b;

            public a(View view, View view2) {
                this.f8854a = view;
                this.f8855b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.h(this.f8854a, this.f8855b, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f8856a;

            public b(int i) {
                this.f8856a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f8853b = this.f8856a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f8853b = this.f8856a;
            }
        }

        public f(Context context) {
            super(context);
            this.f8853b = -1;
            this.d = -1;
            setWillNotDraw(false);
        }

        public void c(int i, int i2) {
            ValueAnimator valueAnimator = this.f8852a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f8852a.cancel();
            }
            i(true, i, i2);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.l.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.l.getIntrinsicHeight();
            }
            int i = TabLayout.this.y;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.l.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.l.getBounds();
                TabLayout.this.l.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableR = tabLayout.l;
                if (tabLayout.m != 0) {
                    drawableR = k47.r(drawableR);
                    k47.n(drawableR, TabLayout.this.m);
                } else {
                    k47.o(drawableR, null);
                }
                drawableR.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void e() {
            View childAt = getChildAt(this.f8853b);
            com.google.android.material.tabs.a aVar = TabLayout.this.F;
            TabLayout tabLayout = TabLayout.this;
            aVar.c(tabLayout, childAt, tabLayout.l);
        }

        public void f(int i, float f) {
            ValueAnimator valueAnimator = this.f8852a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f8852a.cancel();
            }
            this.f8853b = i;
            this.c = f;
            h(getChildAt(i), getChildAt(this.f8853b + 1), this.c);
        }

        public void g(int i) {
            Rect bounds = TabLayout.this.l.getBounds();
            TabLayout.this.l.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void h(View view, View view2, float f) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.l;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.l.getBounds().bottom);
            } else {
                com.google.android.material.tabs.a aVar = TabLayout.this.F;
                TabLayout tabLayout = TabLayout.this;
                aVar.d(tabLayout, view, view2, f, tabLayout.l);
            }
            androidx.core.view.c.h0(this);
        }

        public final void i(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f8853b);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.f8852a.removeAllUpdateListeners();
                this.f8852a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8852a = valueAnimator;
            valueAnimator.setInterpolator(wc1.f37827b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i));
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f8852a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.f8853b, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.w == 1 || tabLayout.z == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ayq.d(getContext(), 16)) * 2)) {
                    boolean z = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.w = 0;
                    tabLayout2.P(false);
                }
                super.onMeasure(i, i2);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f8859b;
        public CharSequence c;
        public CharSequence d;
        public View f;
        public TabLayout h;
        public TabView i;
        public int e = -1;
        public int g = 1;
        public int j = -1;

        public View e() {
            return this.f;
        }

        public Drawable f() {
            return this.f8859b;
        }

        public int g() {
            return this.e;
        }

        public int h() {
            return this.g;
        }

        public Object i() {
            return this.f8858a;
        }

        public CharSequence j() {
            return this.c;
        }

        public boolean k() {
            TabLayout tabLayout = this.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.e;
        }

        public void l() {
            this.h = null;
            this.i = null;
            this.f8858a = null;
            this.f8859b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void m() {
            TabLayout tabLayout = this.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.F(this);
        }

        public g n(CharSequence charSequence) {
            this.d = charSequence;
            w();
            return this;
        }

        public g o(int i) {
            return p(LayoutInflater.from(this.i.getContext()).inflate(i, (ViewGroup) this.i, false));
        }

        public g p(View view) {
            this.f = view;
            w();
            return this;
        }

        public g q(Drawable drawable) {
            this.f8859b = drawable;
            TabLayout tabLayout = this.h;
            if (tabLayout.w == 1 || tabLayout.z == 2) {
                tabLayout.P(true);
            }
            w();
            if (com.google.android.material.badge.b.f8542a && this.i.l() && this.i.e.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        public g r(int i) {
            this.j = i;
            TabView tabView = this.i;
            if (tabView != null) {
                tabView.setId(i);
            }
            return this;
        }

        public void s(int i) {
            this.e = i;
        }

        public g t(Object obj) {
            this.f8858a = obj;
            return this;
        }

        public g u(int i) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return v(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g v(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            w();
            return this;
        }

        public void w() {
            TabView tabView = this.i;
            if (tabView != null) {
                tabView.t();
            }
        }
    }

    public static class h implements ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<TabLayout> f8860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8861b;
        public int c;

        public h(TabLayout tabLayout) {
            this.f8860a = new WeakReference<>(tabLayout);
        }

        public void a() {
            this.c = 0;
            this.f8861b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i) {
            this.f8861b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f8860a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                tabLayout.J(i, f, i3 != 2 || this.f8861b == 1, (i3 == 2 && this.f8861b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f8860a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.G(tabLayout.x(i), i2 == 0 || (i2 == 2 && this.f8861b == 0));
        }
    }

    public static class i implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f8862a;

        public i(ViewPager viewPager) {
            this.f8862a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(g gVar) {
            this.f8862a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f8839a.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f8839a.get(i2);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.j())) {
                if (!this.A) {
                    return 72;
                }
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.z;
        if (i3 == 0 || i3 == 2) {
            return this.u;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList p(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.c.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.c.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    public g A() {
        g gVarR = r();
        gVarR.h = this;
        gVarR.i = s(gVarR);
        if (gVarR.j != -1) {
            gVarR.i.setId(gVarR.j);
        }
        return gVarR;
    }

    public void B() {
        int currentItem;
        D();
        eih eihVar = this.L;
        if (eihVar != null) {
            int count = eihVar.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                f(A().v(this.L.getPageTitle(i2)), false);
            }
            ViewPager viewPager = this.K;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            F(x(currentItem));
        }
    }

    public boolean C(g gVar) {
        return S.release(gVar);
    }

    public void D() {
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            E(childCount);
        }
        Iterator<g> it = this.f8839a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.l();
            C(next);
        }
        this.f8840b = null;
    }

    public final void E(int i2) {
        TabView tabView = (TabView) this.c.getChildAt(i2);
        this.c.removeViewAt(i2);
        if (tabView != null) {
            tabView.o();
            this.Q.release(tabView);
        }
        requestLayout();
    }

    public void F(g gVar) {
        G(gVar, true);
    }

    public void G(g gVar, boolean z) {
        g gVar2 = this.f8840b;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                t(gVar);
                j(gVar.g());
                return;
            }
            return;
        }
        int iG = gVar != null ? gVar.g() : -1;
        if (z) {
            if ((gVar2 == null || gVar2.g() == -1) && iG != -1) {
                I(iG, 0.0f, true);
            } else {
                j(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f8840b = gVar;
        if (gVar2 != null) {
            v(gVar2);
        }
        if (gVar != null) {
            u(gVar);
        }
    }

    public void H(eih eihVar, boolean z) {
        DataSetObserver dataSetObserver;
        eih eihVar2 = this.L;
        if (eihVar2 != null && (dataSetObserver = this.M) != null) {
            eihVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.L = eihVar;
        if (z && eihVar != null) {
            if (this.M == null) {
                this.M = new e();
            }
            eihVar.registerDataSetObserver(this.M);
        }
        B();
    }

    public void I(int i2, float f2, boolean z) {
        J(i2, f2, z, true);
    }

    public void J(int i2, float f2, boolean z, boolean z2) {
        int iRound = Math.round(i2 + f2);
        if (iRound < 0 || iRound >= this.c.getChildCount()) {
            return;
        }
        if (z2) {
            this.c.f(i2, f2);
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.J.cancel();
        }
        scrollTo(i2 < 0 ? 0 : m(i2, f2), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    public void K(int i2, int i3) {
        setTabTextColors(p(i2, i3));
    }

    public void L(ViewPager viewPager, boolean z) {
        M(viewPager, z, false);
    }

    public final void M(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.K;
        if (viewPager2 != null) {
            h hVar = this.N;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.O;
            if (bVar != null) {
                this.K.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.I;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.I = null;
        }
        if (viewPager != null) {
            this.K = viewPager;
            if (this.N == null) {
                this.N = new h(this);
            }
            this.N.a();
            viewPager.addOnPageChangeListener(this.N);
            i iVar = new i(viewPager);
            this.I = iVar;
            addOnTabSelectedListener((c) iVar);
            eih adapter = viewPager.getAdapter();
            if (adapter != null) {
                H(adapter, z);
            }
            if (this.O == null) {
                this.O = new b();
            }
            this.O.a(z);
            viewPager.addOnAdapterChangeListener(this.O);
            I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.K = null;
            H(null, false);
        }
        this.P = z2;
    }

    public final void N() {
        int size = this.f8839a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f8839a.get(i2).w();
        }
    }

    public final void O(LinearLayout.LayoutParams layoutParams) {
        if (this.z == 1 && this.w == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void P(boolean z) {
        for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
            View childAt = this.c.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            O((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addOnTabSelectedListener(d dVar) {
        addOnTabSelectedListener((c) dVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        i(view);
    }

    public void c(g gVar) {
        f(gVar, this.f8839a.isEmpty());
    }

    public void d(g gVar, int i2) {
        e(gVar, i2, this.f8839a.isEmpty());
    }

    public void e(g gVar, int i2, boolean z) {
        if (gVar.h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        o(gVar, i2);
        h(gVar);
        if (z) {
            gVar.m();
        }
    }

    public void f(g gVar, boolean z) {
        e(gVar, this.f8839a.size(), z);
    }

    public final void g(TabItem tabItem) {
        g gVarA = A();
        CharSequence charSequence = tabItem.f8837a;
        if (charSequence != null) {
            gVarA.v(charSequence);
        }
        Drawable drawable = tabItem.f8838b;
        if (drawable != null) {
            gVarA.q(drawable);
        }
        int i2 = tabItem.c;
        if (i2 != 0) {
            gVarA.o(i2);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            gVarA.n(tabItem.getContentDescription());
        }
        c(gVarA);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f8840b;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f8839a.size();
    }

    public int getTabGravity() {
        return this.w;
    }

    public ColorStateList getTabIconTint() {
        return this.j;
    }

    public int getTabIndicatorAnimationMode() {
        return this.D;
    }

    public int getTabIndicatorGravity() {
        return this.y;
    }

    public int getTabMaxWidth() {
        return this.f8842r;
    }

    public int getTabMode() {
        return this.z;
    }

    public ColorStateList getTabRippleColor() {
        return this.f8841k;
    }

    public Drawable getTabSelectedIndicator() {
        return this.l;
    }

    public ColorStateList getTabTextColors() {
        return this.i;
    }

    public final void h(g gVar) {
        TabView tabView = gVar.i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.c.addView(tabView, gVar.g(), q());
    }

    public final void i(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        g((TabItem) view);
    }

    public final void j(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !androidx.core.view.c.U(this) || this.c.d()) {
            I(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM = m(i2, 0.0f);
        if (scrollX != iM) {
            w();
            this.J.setIntValues(scrollX, iM);
            this.J.start();
        }
        this.c.c(i2, this.x);
    }

    public final void k(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                this.c.setGravity(1);
                return;
            } else if (i2 != 2) {
                return;
            }
        }
        this.c.setGravity(8388611);
    }

    public final void l() {
        int i2 = this.z;
        androidx.core.view.c.J0(this.c, (i2 == 0 || i2 == 2) ? Math.max(0, this.v - this.d) : 0, 0, 0, 0);
        int i3 = this.z;
        if (i3 == 0) {
            k(this.w);
        } else if (i3 == 1 || i3 == 2) {
            this.c.setGravity(1);
        }
        P(true);
    }

    public final int m(int i2, float f2) {
        View childAt;
        int i3 = this.z;
        if ((i3 != 0 && i3 != 2) || (childAt = this.c.getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < this.c.getChildCount() ? this.c.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return androidx.core.view.c.A(this) == 0 ? left + i5 : left - i5;
    }

    public void n() {
        this.H.clear();
    }

    public final void o(g gVar, int i2) {
        gVar.s(i2);
        this.f8839a.add(i2, gVar);
        int size = this.f8839a.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.f8839a.get(i2).s(i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.e(this);
        if (this.K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                M((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            setupWithViewPager(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
            View childAt = this.c.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m80.P0(accessibilityNodeInfo).k0(m80.e.b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return y() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iRound = Math.round(ayq.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int iD = this.t;
            if (iD <= 0) {
                iD = (int) (size - ayq.d(getContext(), 56));
            }
            this.f8842r = iD;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.z;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || y()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final LinearLayout.LayoutParams q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        O(layoutParams);
        return layoutParams;
    }

    public g r() {
        g gVarAcquire = S.acquire();
        return gVarAcquire == null ? new g() : gVarAcquire;
    }

    public void removeOnTabSelectedListener(d dVar) {
        removeOnTabSelectedListener((c) dVar);
    }

    public final TabView s(g gVar) {
        Pools.Pool<TabView> pool = this.Q;
        TabView tabViewAcquire = pool != null ? pool.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new TabView(getContext());
        }
        tabViewAcquire.setTab(gVar);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.d)) {
            tabViewAcquire.setContentDescription(gVar.c);
        } else {
            tabViewAcquire.setContentDescription(gVar.d);
        }
        return tabViewAcquire;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        m8f.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.A != z) {
            this.A = z;
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).v();
                }
            }
            l();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        w();
        this.J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.l = drawable;
            int intrinsicHeight = this.C;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.c.g(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.m = i2;
        P(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.y != i2) {
            this.y = i2;
            androidx.core.view.c.h0(this.c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.C = i2;
        this.c.g(i2);
    }

    public void setTabGravity(int i2) {
        if (this.w != i2) {
            this.w = i2;
            l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            N();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(of1.a(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.D = i2;
        if (i2 == 0) {
            this.F = new com.google.android.material.tabs.a();
            return;
        }
        if (i2 == 1) {
            this.F = new c48();
        } else {
            if (i2 == 2) {
                this.F = new z79();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.B = z;
        this.c.e();
        androidx.core.view.c.h0(this.c);
    }

    public void setTabMode(int i2) {
        if (i2 != this.z) {
            this.z = i2;
            l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f8841k != colorStateList) {
            this.f8841k = colorStateList;
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(of1.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(eih eihVar) {
        H(eihVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.E != z) {
            this.E = z;
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        L(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(g gVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).onTabReselected(gVar);
        }
    }

    public final void u(g gVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).onTabSelected(gVar);
        }
    }

    public final void v(g gVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).onTabUnselected(gVar);
        }
    }

    public final void w() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(wc1.f37827b);
            this.J.setDuration(this.x);
            this.J.addUpdateListener(new a());
        }
    }

    public g x(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f8839a.get(i2);
    }

    public final boolean y() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public boolean z() {
        return this.B;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.d0);
    }

    @Deprecated
    public void addOnTabSelectedListener(c cVar) {
        if (this.H.contains(cVar)) {
            return;
        }
        this.H.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(c cVar) {
        this.H.remove(cVar);
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.G;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.G = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        int i3 = R;
        super(n8f.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f8839a = new ArrayList<>();
        this.l = new GradientDrawable();
        this.m = 0;
        this.f8842r = Integer.MAX_VALUE;
        this.C = -1;
        this.H = new ArrayList<>();
        this.Q = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.c = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.z8, i2, i3, b4j.X8);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            l8f l8fVar = new l8f();
            l8fVar.b0(ColorStateList.valueOf(colorDrawable.getColor()));
            l8fVar.Q(context2);
            l8fVar.a0(androidx.core.view.c.v(this));
            androidx.core.view.c.v0(this, l8fVar);
        }
        setSelectedTabIndicator(k8f.e(context2, typedArrayH, b4j.F8));
        setSelectedTabIndicatorColor(typedArrayH.getColor(b4j.I8, 0));
        fVar.g(typedArrayH.getDimensionPixelSize(b4j.L8, -1));
        setSelectedTabIndicatorGravity(typedArrayH.getInt(b4j.K8, 0));
        setTabIndicatorAnimationMode(typedArrayH.getInt(b4j.H8, 0));
        setTabIndicatorFullWidth(typedArrayH.getBoolean(b4j.J8, true));
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(b4j.Q8, 0);
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.d = typedArrayH.getDimensionPixelSize(b4j.T8, dimensionPixelSize);
        this.e = typedArrayH.getDimensionPixelSize(b4j.U8, this.e);
        this.f = typedArrayH.getDimensionPixelSize(b4j.S8, this.f);
        this.g = typedArrayH.getDimensionPixelSize(b4j.R8, this.g);
        int resourceId = typedArrayH.getResourceId(b4j.X8, k3j.d);
        this.h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, z5j.c3);
        try {
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5j.d3, 0);
            this.i = k8f.b(context2, typedArrayObtainStyledAttributes, z5j.g3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayH.hasValue(b4j.Y8)) {
                this.i = k8f.b(context2, typedArrayH, b4j.Y8);
            }
            if (typedArrayH.hasValue(b4j.W8)) {
                this.i = p(this.i.getDefaultColor(), typedArrayH.getColor(b4j.W8, 0));
            }
            this.j = k8f.b(context2, typedArrayH, b4j.D8);
            this.n = ayq.k(typedArrayH.getInt(b4j.E8, -1), null);
            this.f8841k = k8f.b(context2, typedArrayH, b4j.V8);
            this.x = typedArrayH.getInt(b4j.G8, 300);
            this.s = typedArrayH.getDimensionPixelSize(b4j.O8, -1);
            this.t = typedArrayH.getDimensionPixelSize(b4j.N8, -1);
            this.q = typedArrayH.getResourceId(b4j.A8, 0);
            this.v = typedArrayH.getDimensionPixelSize(b4j.B8, 0);
            this.z = typedArrayH.getInt(b4j.P8, 1);
            this.w = typedArrayH.getInt(b4j.C8, 0);
            this.A = typedArrayH.getBoolean(b4j.M8, false);
            this.E = typedArrayH.getBoolean(b4j.Z8, false);
            typedArrayH.recycle();
            Resources resources = getResources();
            this.p = resources.getDimensionPixelSize(pmi.p);
            this.u = resources.getDimensionPixelSize(pmi.o);
            l();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(of1.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
