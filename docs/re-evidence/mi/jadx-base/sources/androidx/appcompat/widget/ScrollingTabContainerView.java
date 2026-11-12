package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import defpackage.nd0;
import defpackage.qii;
import defpackage.tip;
import defpackage.xfp;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public static final Interpolator l = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f1629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1630b;
    public LinearLayoutCompat c;
    public Spinner d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ViewPropertyAnimator j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f1631k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1632a;

        public a(View view) {
            this.f1632a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f1632a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f1632a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f1629a = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) ScrollingTabContainerView.this.c.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.f((ActionBar.c) getItem(i), true);
            }
            ((d) view).a((ActionBar.c) getItem(i));
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().f();
            int childCount = ScrollingTabContainerView.this.c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.c.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ActionBar.c f1637b;
        public TextView c;
        public ImageView d;
        public View e;

        public d(Context context, ActionBar.c cVar, boolean z) {
            super(context, null, qii.e);
            int[] iArr = {R.attr.background};
            this.f1636a = iArr;
            this.f1637b = cVar;
            xfp xfpVarV = xfp.v(context, null, iArr, qii.e, 0);
            if (xfpVarV.s(0)) {
                setBackgroundDrawable(xfpVarV.g(0));
            }
            xfpVarV.w();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(ActionBar.c cVar) {
            this.f1637b = cVar;
            c();
        }

        public ActionBar.c b() {
            return this.f1637b;
        }

        public void c() {
            ActionBar.c cVar = this.f1637b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.e = viewB;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.e;
            if (view != null) {
                removeView(view);
                this.e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceE = cVar.e();
            if (drawableC != null) {
                if (this.d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.d = appCompatImageView;
                }
                this.d.setImageDrawable(drawableC);
                this.d.setVisibility(0);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceE);
            if (z) {
                if (this.c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, qii.f);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.c = appCompatTextView;
                }
                this.c.setText(charSequenceE);
                this.c.setVisibility(0);
            } else {
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            tip.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1638a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1639b;

        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1638a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1638a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.j = null;
            scrollingTabContainerView.setVisibility(this.f1639b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f1638a = false;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.f1631k = new e();
        setHorizontalScrollBarEnabled(false);
        nd0 nd0VarB = nd0.b(context);
        setContentHeight(nd0VarB.f());
        this.g = nd0VarB.e();
        LinearLayoutCompat linearLayoutCompatE = e();
        this.c = linearLayoutCompatE;
        addView(linearLayoutCompatE, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(ActionBar.c cVar, int i, boolean z) {
        d dVarF = f(cVar, false);
        this.c.addView(dVarF, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            dVarF.setSelected(true);
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void b(ActionBar.c cVar, boolean z) {
        d dVarF = f(cVar, false);
        this.c.addView(dVarF, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            dVarF.setSelected(true);
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void c(int i) {
        View childAt = this.c.getChildAt(i);
        Runnable runnable = this.f1629a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1629a = aVar;
        post(aVar);
    }

    public final Spinner d() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, qii.i);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public final LinearLayoutCompat e() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, qii.d);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    public d f(ActionBar.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
        } else {
            dVar.setFocusable(true);
            if (this.f1630b == null) {
                this.f1630b = new c();
            }
            dVar.setOnClickListener(this.f1630b);
        }
        return dVar;
    }

    public final boolean g() {
        Spinner spinner = this.d;
        return spinner != null && spinner.getParent() == this;
    }

    public final void h() {
        if (g()) {
            return;
        }
        if (this.d == null) {
            this.d = d();
        }
        removeView(this.c);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        if (this.d.getAdapter() == null) {
            this.d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1629a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1629a = null;
        }
        this.d.setSelection(this.i);
    }

    public final boolean i() {
        if (!g()) {
            return false;
        }
        removeView(this.d);
        addView(this.c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.d.getSelectedItemPosition());
        return false;
    }

    public void j() {
        this.c.removeAllViews();
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void k(int i) {
        this.c.removeViewAt(i);
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void l(int i) {
        ((d) this.c.getChildAt(i)).c();
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.e) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1629a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nd0 nd0VarB = nd0.b(getContext());
        setContentHeight(nd0VarB.f());
        this.g = nd0VarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1629a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().f();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f = -1;
        } else {
            if (childCount > 2) {
                this.f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f = Math.min(this.f, this.g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        if (z || !this.e) {
            i();
        } else {
            this.c.measure(0, iMakeMeasureSpec);
            if (this.c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                h();
            } else {
                i();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.e = z;
    }

    public void setContentHeight(int i) {
        this.h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.i = i;
        int childCount = this.c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.c.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                c(i);
            }
            i2++;
        }
        Spinner spinner = this.d;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
