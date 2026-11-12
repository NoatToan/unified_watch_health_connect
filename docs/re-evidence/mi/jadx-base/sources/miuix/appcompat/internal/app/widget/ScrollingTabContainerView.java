package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import defpackage.a2j;
import defpackage.dyq;
import defpackage.g5j;
import defpackage.hm1;
import defpackage.m80;
import defpackage.md0;
import defpackage.wc0;
import defpackage.zhi;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemClickListener, wc0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f26439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f26440b;
    public int c;
    public int d;
    public b e;
    public LinearLayout f;
    public Spinner g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f26441k;
    public boolean l;
    public float m;
    public Paint n;
    public int o;
    public float p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f26442r;
    public WeakHashMap<TextView, Integer> s;

    public static class TabView extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionBar.c f26443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f26444b;
        public ImageView c;
        public View d;
        public ImageView e;
        public ScrollingTabContainerView f;

        public class a extends androidx.core.view.a {
            public a() {
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
                m80Var.G0(view.isSelected());
                if (view.isSelected()) {
                    m80Var.j0(false);
                    m80Var.a0(m80.a.i);
                } else {
                    m80Var.j0(true);
                    m80Var.K0(TabView.this.getContext().getResources().getString(a2j.f550a));
                }
            }
        }

        public TabView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
            e();
        }

        public void c(ScrollingTabContainerView scrollingTabContainerView, ActionBar.c cVar, boolean z) {
            this.f = scrollingTabContainerView;
            this.f26443a = cVar;
            if (z) {
                setGravity(8388627);
            }
            f();
        }

        public void d(ActionBar.c cVar) {
            this.f26443a = cVar;
            f();
        }

        public final void e() {
            androidx.core.view.c.r0(this, new a());
        }

        public void f() {
            Drawable drawableH;
            int intrinsicHeight;
            int lineHeight;
            ActionBar.c cVar = this.f26443a;
            View viewB = cVar.b();
            if (viewB != null) {
                this.d = this.f.p(this, viewB, this.f26444b, this.c);
            } else {
                View view = this.d;
                if (view != null) {
                    removeView(view);
                    this.d = null;
                }
                Context context = getContext();
                Drawable drawableC = cVar.c();
                CharSequence charSequenceE = cVar.e();
                if (drawableC != null) {
                    if (this.c == null) {
                        ImageView imageView = new ImageView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        imageView.setLayoutParams(layoutParams);
                        addView(imageView, 0);
                        this.c = imageView;
                    }
                    this.c.setImageDrawable(drawableC);
                    this.c.setVisibility(0);
                } else {
                    ImageView imageView2 = this.c;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                        this.c.setImageDrawable(null);
                    }
                }
                if (charSequenceE != null) {
                    if (this.f26444b == null) {
                        ScrollingTabTextView scrollingTabTextView = new ScrollingTabTextView(context, null, this.f.getDefaultTabTextStyle());
                        scrollingTabTextView.setEllipsize(TextUtils.TruncateAt.END);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 16;
                        scrollingTabTextView.setLayoutParams(layoutParams2);
                        addView(scrollingTabTextView);
                        this.f26444b = scrollingTabTextView;
                    }
                    this.f26444b.setText(charSequenceE);
                    this.f26444b.setVisibility(0);
                    if (this.e == null && (drawableH = hm1.h(context, zhi.j)) != null) {
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setImageDrawable(drawableH);
                        imageView3.setVisibility(8);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.gravity = 48;
                        Drawable background = getBackground();
                        if (background != null && (intrinsicHeight = background.getIntrinsicHeight()) > (lineHeight = this.f26444b.getLineHeight())) {
                            layoutParams3.topMargin = (intrinsicHeight - lineHeight) / 2;
                        }
                        imageView3.setLayoutParams(layoutParams3);
                        addView(imageView3);
                        this.e = imageView3;
                    }
                } else {
                    TextView textView = this.f26444b;
                    if (textView != null) {
                        textView.setVisibility(8);
                        this.f26444b.setText((CharSequence) null);
                    }
                }
                ImageView imageView4 = this.c;
                if (imageView4 != null) {
                    imageView4.setContentDescription(cVar.a());
                }
            }
            this.f.r(this.f26444b);
        }

        public ActionBar.c getTab() {
            return this.f26443a;
        }

        public TextView getTextView() {
            return this.f26444b;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            TextView textView = this.f26444b;
            if (textView != null) {
                this.f26444b.setTextAppearance(this.f.g(textView));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setImageDrawable(this.f26443a.c());
            }
        }
    }

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScrollingTabContainerView f26446a;

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f26446a.f.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((TabView) this.f26446a.f.getChildAt(i)).getTab();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.f26446a.e((ActionBar.c) getItem(i), true);
            }
            ((TabView) view).d((ActionBar.c) getItem(i));
            return view;
        }
    }

    public static class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ScrollingTabContainerView> f26447a;

        public b(ScrollingTabContainerView scrollingTabContainerView) {
            this.f26447a = new WeakReference<>(scrollingTabContainerView);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeakReference<ScrollingTabContainerView> weakReference = this.f26447a;
            ScrollingTabContainerView scrollingTabContainerView = weakReference != null ? weakReference.get() : null;
            if (scrollingTabContainerView == null) {
                return;
            }
            ((TabView) view).getTab().f();
            int childCount = scrollingTabContainerView.f.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = scrollingTabContainerView.f.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ScrollingTabContainerView> f26448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26449b;

        public c(ScrollingTabContainerView scrollingTabContainerView, int i) {
            this.f26448a = new WeakReference<>(scrollingTabContainerView);
            this.f26449b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt;
            WeakReference<ScrollingTabContainerView> weakReference = this.f26448a;
            ScrollingTabContainerView scrollingTabContainerView = weakReference != null ? weakReference.get() : null;
            if (scrollingTabContainerView == null || (childAt = scrollingTabContainerView.f.getChildAt(this.f26449b)) == null) {
                return;
            }
            scrollingTabContainerView.smoothScrollTo(childAt.getLeft() - ((scrollingTabContainerView.getWidth() - childAt.getWidth()) / 2), 0);
            scrollingTabContainerView.f26440b = null;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.n = new Paint();
        this.o = -1;
        this.q = false;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f26439a = layoutInflaterFrom;
        md0 md0VarB = md0.b(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g5j.f18626a, R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(g5j.z);
        this.l = typedArrayObtainStyledAttributes.getBoolean(g5j.C, true);
        this.f26441k = f(drawable);
        typedArrayObtainStyledAttributes.recycle();
        if (this.l) {
            this.n.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        setHorizontalScrollBarEnabled(false);
        this.d = md0VarB.c();
        LinearLayout linearLayout = (LinearLayout) layoutInflaterFrom.inflate(getTabBarLayoutRes(), (ViewGroup) this, false);
        this.f = linearLayout;
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        this.f26442r = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public void b(ActionBar.c cVar, int i, boolean z) {
        TabView tabViewE = e(cVar, false);
        this.f.addView(tabViewE, i);
        Spinner spinner = this.g;
        if (spinner != null) {
            ((a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            tabViewE.setSelected(true);
            this.o = this.f.getChildCount() - 1;
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void c(ActionBar.c cVar, boolean z) {
        TabView tabViewE = e(cVar, false);
        this.f.addView(tabViewE);
        Spinner spinner = this.g;
        if (spinner != null) {
            ((a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            tabViewE.setSelected(true);
            this.o = this.f.getChildCount() - 1;
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void d(int i) {
        Runnable runnable = this.f26440b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        c cVar = new c(this, i);
        this.f26440b = cVar;
        post(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Bitmap bitmap = this.f26441k;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.m, getHeight() - this.f26441k.getHeight(), this.n);
        }
    }

    public final TabView e(ActionBar.c cVar, boolean z) {
        TabView tabView = (TabView) this.f26439a.inflate(getTabViewLayoutRes(), (ViewGroup) this.f, false);
        tabView.c(this, cVar, z);
        if (z) {
            tabView.setBackground(null);
            tabView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.i));
        } else {
            tabView.setFocusable(true);
            if (this.e == null) {
                this.e = new b(this);
            }
            tabView.setOnClickListener(this.e);
        }
        if (this.f.getChildCount() != 0) {
            ((LinearLayout.LayoutParams) tabView.getLayoutParams()).setMarginStart(getTabViewMarginHorizontal());
        }
        return tabView;
    }

    public final Bitmap f(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = this.l ? Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ALPHA_8) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public int g(TextView textView) {
        WeakHashMap<TextView, Integer> weakHashMap;
        return (textView == null || (weakHashMap = this.s) == null || !weakHashMap.containsKey(textView)) ? hm1.c(getContext(), getDefaultTabTextStyle()) : this.s.get(textView).intValue();
    }

    public abstract int getDefaultTabTextStyle();

    public abstract int getTabBarLayoutRes();

    public abstract int getTabContainerHeight();

    public float getTabIndicatorPosition() {
        return this.m;
    }

    public abstract int getTabViewLayoutRes();

    public abstract int getTabViewMarginHorizontal();

    public void h() {
        this.f.removeAllViews();
        Spinner spinner = this.g;
        if (spinner != null) {
            ((a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void i(int i) {
        LinearLayout linearLayout = this.f;
        if (linearLayout != null && linearLayout.getChildAt(i) != null) {
            this.f.removeViewAt(i);
        }
        Spinner spinner = this.g;
        if (spinner != null) {
            ((a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void j(int i) {
        View childAt = this.f.getChildAt(i);
        scrollTo(childAt.getLeft() - ((getWidth() - childAt.getWidth()) / 2), 0);
    }

    public void k(int i, boolean z) {
        ImageView imageView;
        if (i <= this.f.getChildCount() - 1 && (imageView = ((TabView) this.f.getChildAt(i)).e) != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void l(int i, int i2, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        TextView textView;
        if (i <= this.f.getChildCount() - 1 && (textView = ((TabView) this.f.getChildAt(i)).f26444b) != null) {
            textView.setCompoundDrawablePadding(i2);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public void m(int i, float f) {
        if (this.f26441k != null) {
            View childAt = this.f.getChildAt(i);
            View childAt2 = this.f.getChildAt(i + 1);
            this.m = childAt.getLeft() + ((childAt.getWidth() - this.f26441k.getWidth()) / 2) + ((childAt2 == null ? childAt.getWidth() : (childAt.getWidth() + childAt2.getWidth()) / 2.0f) * f);
            invalidate();
        }
    }

    public void n(int i, boolean z) {
        this.j = i;
        int childCount = this.f.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f.getChildAt(i2);
            boolean z2 = i2 == i;
            childAt.setSelected(z2);
            if (z2) {
                if (z) {
                    d(i);
                } else {
                    j(i);
                }
            }
            i2++;
        }
    }

    public void o(int i, int i2) {
        TextView textView;
        if (i < 0 || i > this.f.getChildCount() - 1 || (textView = ((TabView) this.f.getChildAt(i)).f26444b) == null) {
            return;
        }
        if (this.s == null) {
            this.s = new WeakHashMap<>();
        }
        this.s.put(textView, Integer.valueOf(i2));
        textView.setTextAppearance(textView.getContext(), i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f26440b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        md0 md0VarB = md0.b(getContext());
        setContentHeight(getTabContainerHeight());
        this.d = md0VarB.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f26440b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.p = motionEvent.getX();
            this.q = false;
        } else if (motionEvent.getActionMasked() == 2) {
            this.q = Math.abs(motionEvent.getX() - this.p) > ((float) this.f26442r);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.q = false;
        }
        if (!this.q) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(0);
        super.onInterceptTouchEvent(motionEventObtain);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ((TabView) view).getTab().f();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f.getChildAt(this.j) != null) {
            setTabIndicatorPosition(this.j);
            j(this.j);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.c = -1;
        } else {
            if (childCount > 2) {
                this.c = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.c = (int) (View.MeasureSpec.getSize(i) * 0.6f);
            }
            this.c = Math.min(this.c, this.d);
        }
        int i3 = this.i;
        if (i3 != -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.j);
    }

    @Override // wc0.a
    public void onPageScrollStateChanged(int i) {
    }

    @Override // wc0.a
    public void onPageScrolled(int i, float f, boolean z, boolean z2) {
        m(i, f);
    }

    @Override // wc0.a
    public void onPageSelected(int i) {
        TabView tabView = (TabView) this.f.getChildAt(i);
        if (tabView != null) {
            tabView.sendAccessibilityEvent(4);
        }
        setTabIndicatorPosition(i);
        int i2 = this.o;
        if (i2 != -1) {
            boolean z = true;
            if (Math.abs(i2 - i) == 1) {
                TabView tabView2 = (TabView) this.f.getChildAt(this.o);
                ScrollingTabTextView scrollingTabTextView = tabView2 != null ? (ScrollingTabTextView) tabView2.getTextView() : null;
                ScrollingTabTextView scrollingTabTextView2 = tabView != null ? (ScrollingTabTextView) tabView.getTextView() : null;
                if (scrollingTabTextView != null && scrollingTabTextView2 != null) {
                    z = dyq.e(this) ? false : false;
                    scrollingTabTextView.c(z);
                    scrollingTabTextView2.c(z);
                }
            }
        }
        this.o = i;
    }

    public View p(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        return null;
    }

    public void q(int i) {
        ((TabView) this.f.getChildAt(i)).f();
        Spinner spinner = this.g;
        if (spinner != null) {
            ((a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void r(TextView textView) {
    }

    public void setAllowCollapse(boolean z) {
        this.h = z;
    }

    public void setContentHeight(int i) {
        if (this.i != i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setEmbeded(boolean z) {
        setHorizontalFadingEdgeEnabled(true);
    }

    public void setTabIndicatorPosition(int i) {
        m(i, 0.0f);
    }

    public void setTabSelected(int i) {
        n(i, true);
    }
}
