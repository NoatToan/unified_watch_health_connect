package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f5195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f5196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatSpinner f5197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5202h;

    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return p0.this.f5196b.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i14) {
            return ((b) p0.this.f5196b.getChildAt(i14)).f5204a;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i14) {
            return i14;
        }

        @Override // android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            if (view2 != null) {
                b bVar = (b) view2;
                bVar.f5204a = (i.a.d) getItem(i14);
                bVar.a();
                return view2;
            }
            i.a.d dVar = (i.a.d) getItem(i14);
            p0 p0Var = p0.this;
            p0Var.getClass();
            b bVar2 = p0Var.new b(p0Var.getContext(), dVar, true);
            bVar2.setBackgroundDrawable(null);
            bVar2.setLayoutParams(new AbsListView.LayoutParams(-1, p0Var.f5201g));
            return bVar2;
        }
    }

    public class b extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i.a.d f5204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AppCompatTextView f5205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View f5206c;

        public b(Context context, i.a.d dVar, boolean z14) {
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {android.R.attr.background};
            this.f5204a = dVar;
            w0 w0VarG = w0.g(context, null, iArr, R.attr.actionBarTabStyle, 0);
            if (w0VarG.f5271b.hasValue(0)) {
                setBackgroundDrawable(w0VarG.b(0));
            }
            w0VarG.h();
            if (z14) {
                setGravity(8388627);
            }
            a();
        }

        public final void a() {
            this.f5204a.getClass();
            View view2 = this.f5206c;
            if (view2 != null) {
                removeView(view2);
                this.f5206c = null;
            }
            boolean zIsEmpty = TextUtils.isEmpty(null);
            AppCompatTextView appCompatTextView = this.f5205b;
            if (!zIsEmpty) {
                if (appCompatTextView == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams);
                    addView(appCompatTextView2);
                    this.f5205b = appCompatTextView2;
                }
                this.f5205b.setText((CharSequence) null);
                this.f5205b.setVisibility(0);
            } else if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
                this.f5205b.setText((CharSequence) null);
            }
            a1.a(this, null);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i14, int i15) {
            super.onMeasure(i14, i15);
            p0 p0Var = p0.this;
            if (p0Var.f5199e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i16 = p0Var.f5199e;
                if (measuredWidth > i16) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), i15);
                }
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z14) {
            boolean z15 = isSelected() != z14;
            super.setSelected(z14);
            if (z15 && z14) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5208a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5208a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f5208a) {
                return;
            }
            p0 p0Var = p0.this;
            p0Var.getClass();
            p0Var.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            p0.this.setVisibility(0);
            this.f5208a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public p0(Context context) {
        super(context);
        new c();
        setHorizontalScrollBarEnabled(false);
        m.a aVarA = m.a.a(context);
        setContentHeight(aVarA.c());
        this.f5200f = aVarA.f115421a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.f5196b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        AppCompatSpinner appCompatSpinner = this.f5197c;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.f5197c);
        addView(this.f5196b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f5197c.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0 o0Var = this.f5195a;
        if (o0Var != null) {
            post(o0Var);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m.a aVarA = m.a.a(getContext());
        setContentHeight(aVarA.c());
        this.f5200f = aVarA.f115421a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f5195a;
        if (o0Var != null) {
            removeCallbacks(o0Var);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
        ((b) view2).f5204a.b();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        boolean z14 = mode == 1073741824;
        setFillViewport(z14);
        LinearLayoutCompat linearLayoutCompat = this.f5196b;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5199e = -1;
        } else {
            if (childCount > 2) {
                this.f5199e = (int) (View.MeasureSpec.getSize(i14) * 0.4f);
            } else {
                this.f5199e = View.MeasureSpec.getSize(i14) / 2;
            }
            this.f5199e = Math.min(this.f5199e, this.f5200f);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5201g, 1073741824);
        if (z14 || !this.f5198d) {
            a();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i14)) {
                AppCompatSpinner appCompatSpinner = this.f5197c;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f5197c == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f5197c = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f5197c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f5197c.getAdapter() == null) {
                        this.f5197c.setAdapter((SpinnerAdapter) new a());
                    }
                    Runnable runnable = this.f5195a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f5195a = null;
                    }
                    this.f5197c.setSelection(this.f5202h);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i14, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z14 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f5202h);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z14) {
        this.f5198d = z14;
    }

    public void setContentHeight(int i14) {
        this.f5201g = i14;
        requestLayout();
    }

    public void setTabSelected(int i14) {
        this.f5202h = i14;
        LinearLayoutCompat linearLayoutCompat = this.f5196b;
        int childCount = linearLayoutCompat.getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i15);
            boolean z14 = i15 == i14;
            childAt.setSelected(z14);
            if (z14) {
                View childAt2 = linearLayoutCompat.getChildAt(i14);
                Runnable runnable = this.f5195a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                o0 o0Var = new o0(this, childAt2);
                this.f5195a = o0Var;
                post(o0Var);
            }
            i15++;
        }
        AppCompatSpinner appCompatSpinner = this.f5197c;
        if (appCompatSpinner == null || i14 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i14);
    }
}
