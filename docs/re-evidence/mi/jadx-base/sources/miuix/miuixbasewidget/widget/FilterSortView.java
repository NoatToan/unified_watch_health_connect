package miuix.miuixbasewidget.widget;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.a2j;
import defpackage.a3j;
import defpackage.alb;
import defpackage.dwi;
import defpackage.emi;
import defpackage.j5j;
import defpackage.m80;
import defpackage.y94;
import defpackage.ysi;
import defpackage.zkb;
import defpackage.zoi;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class FilterSortView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Integer> f26652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26653b;
    public TabView c;
    public boolean d;
    public View e;
    public final int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TabView.e f26654k;
    public TabView.d l;

    public static class TabView extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f26655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f26656b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;
        public FilterSortView g;
        public Drawable h;
        public ColorStateList i;
        public e j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public d f26657k;
        public zkb l;

        public class a extends androidx.core.view.a {
            public a() {
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
                if (TabView.this.f26655a != null && !TextUtils.isEmpty(TabView.this.f26655a.getText())) {
                    m80Var.m0(TabView.this.f26655a.getText());
                }
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

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f26659a;

            public b(boolean z) {
                this.f26659a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TabView.this.j == null || !this.f26659a) {
                    return;
                }
                TabView.this.j.a(TabView.this, this.f26659a);
            }
        }

        public class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View.OnClickListener f26661a;

            public c(View.OnClickListener onClickListener) {
                this.f26661a = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TabView.this.c) {
                    TabView.this.setFiltered(true);
                } else if (TabView.this.e) {
                    TabView tabView = TabView.this;
                    tabView.setDescending(true ^ tabView.d);
                }
                this.f26661a.onClick(view);
                if (HapticCompat.c("2.0")) {
                    TabView.this.getHapticFeedbackCompat().c(204);
                } else {
                    HapticCompat.performHapticFeedback(view, alb.f1169k);
                }
            }
        }

        public interface d {
            void a();

            void b();

            void c();

            void d(float f, float f2);
        }

        public interface e {
            void a(TabView tabView, boolean z);
        }

        public TabView(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public zkb getHapticFeedbackCompat() {
            if (this.l == null) {
                this.l = new zkb(getContext());
            }
            return this.l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescending(boolean z) {
            this.d = z;
            if (z) {
                this.f26656b.setRotationX(0.0f);
            } else {
                this.f26656b.setRotationX(180.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiltered(boolean z) {
            TabView tabView;
            FilterSortView filterSortView = (FilterSortView) getParent();
            this.g = filterSortView;
            if (z && filterSortView != null) {
                int childCount = filterSortView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.g.getChildAt(i);
                    if ((childAt instanceof TabView) && (tabView = (TabView) childAt) != this && tabView.c) {
                        tabView.setFiltered(false);
                    }
                }
            }
            this.c = z;
            this.f26655a.setSelected(z);
            this.f26656b.setSelected(z);
            setSelected(z);
            this.g.setNeedAnim(true);
            this.g.post(new b(z));
        }

        public View getArrowView() {
            return this.f26656b;
        }

        public boolean getDescendingEnabled() {
            return this.e;
        }

        public ImageView getIconView() {
            return this.f26656b;
        }

        public int getTabLayoutResource() {
            return dwi.f15993b;
        }

        public TextView getTextView() {
            return this.f26655a;
        }

        public void k(CharSequence charSequence, boolean z) {
            setGravity(17);
            if (getBackground() == null) {
                setBackground(m());
            }
            this.f26656b.setBackground(this.h);
            ColorStateList colorStateList = this.i;
            if (colorStateList != null) {
                this.f26655a.setTextColor(colorStateList);
            }
            this.f26655a.setText(charSequence);
            setDescending(z);
            setOnHoverListener(new View.OnHoverListener() { // from class: vm9
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return this.f37021a.l(view, motionEvent);
                }
            });
        }

        public final /* synthetic */ boolean l(View view, MotionEvent motionEvent) {
            if (this.f26657k == null || motionEvent.getSource() == 4098) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 9) {
                if (this.c) {
                    this.f26657k.c();
                }
                this.f26657k.a();
                return true;
            }
            if (actionMasked != 10) {
                return true;
            }
            if (this.c) {
                this.f26657k.b();
            }
            this.f26657k.d(motionEvent.getX() + getLeft(), motionEvent.getY());
            return true;
        }

        public final Drawable m() {
            return getResources().getDrawable(zoi.c);
        }

        public void setDescendingEnabled(boolean z) {
            this.e = z;
        }

        @Override // android.view.View
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            this.f26655a.setEnabled(z);
        }

        public void setFilterHoverListener(d dVar) {
            this.f26657k = dVar;
        }

        public void setIconView(ImageView imageView) {
            this.f26656b = imageView;
        }

        public void setIndicatorVisibility(int i) {
            this.f26656b.setVisibility(i);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(new c(onClickListener));
        }

        public void setOnFilteredListener(e eVar) {
            this.j = eVar;
        }

        public void setTextView(TextView textView) {
            this.f26655a = textView;
        }

        public TabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public TabView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.e = true;
            int tabLayoutResource = getTabLayoutResource();
            LayoutInflater.from(context).inflate(tabLayoutResource, (ViewGroup) this, true);
            this.f26655a = (TextView) findViewById(R.id.text1);
            this.f26656b = (ImageView) findViewById(ysi.f40493a);
            this.f26655a.setImportantForAccessibility(2);
            this.f26656b.setImportantForAccessibility(2);
            if (attributeSet != null && tabLayoutResource == dwi.f15993b) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5j.D, i, a3j.c);
                String string = typedArrayObtainStyledAttributes.getString(j5j.E);
                boolean z = typedArrayObtainStyledAttributes.getBoolean(j5j.G, true);
                this.f = typedArrayObtainStyledAttributes.getInt(j5j.I, 0);
                this.h = typedArrayObtainStyledAttributes.getDrawable(j5j.F);
                this.i = typedArrayObtainStyledAttributes.getColorStateList(j5j.H);
                typedArrayObtainStyledAttributes.recycle();
                k(string, z);
            }
            this.f26656b.setVisibility(this.f);
            if (getId() == -1) {
                setId(View.generateViewId());
            }
            androidx.core.view.c.r0(this, new a());
        }
    }

    public class a implements TabView.e {
        public a() {
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.e
        public void a(TabView tabView, boolean z) {
            FilterSortView.this.m();
            if (z && FilterSortView.this.c.getVisibility() == 0 && FilterSortView.this.h && !FilterSortView.this.i) {
                Folme.useAt(FilterSortView.this.c).state().setFlags(1L).to(new AnimState("target").add(ViewProperty.X, tabView.getX()).add(ViewProperty.WIDTH, tabView.getWidth()), new AnimConfig[0]);
                FilterSortView.this.h = false;
                FilterSortView.this.i = true;
            }
            if (z) {
                FilterSortView.this.f26653b = tabView.getId();
            }
        }
    }

    public class b implements TabView.d {
        public b() {
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.d
        public void a() {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.e, SleepAnalyzerAlpha.NAME_ALPHA, FilterSortView.this.e.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(350L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            objectAnimatorOfFloat.start();
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.d
        public void b() {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.c, "scaleX", FilterSortView.this.c.getScaleX(), 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(FilterSortView.this.c, "scaleY", FilterSortView.this.c.getScaleY(), 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
            animatorSet.start();
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.d
        public void c() {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.c, "scaleX", FilterSortView.this.c.getScaleX(), 1.05f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(FilterSortView.this.c, "scaleY", FilterSortView.this.c.getScaleY(), 1.05f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
            animatorSet.start();
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.d
        public void d(float f, float f2) {
            if (f < FilterSortView.this.f || f2 < 0.0f || f > (FilterSortView.this.getRight() - FilterSortView.this.getLeft()) - (FilterSortView.this.f * 2) || f2 > (FilterSortView.this.getBottom() - FilterSortView.this.getTop()) - (FilterSortView.this.f * 2)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.e, SleepAnalyzerAlpha.NAME_ALPHA, FilterSortView.this.e.getAlpha(), 0.0f);
                objectAnimatorOfFloat.setDuration(350L);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
                objectAnimatorOfFloat.start();
            }
        }
    }

    public FilterSortView(Context context) {
        this(context, null);
    }

    private void s() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setEnabled(this.d);
            }
        }
    }

    public boolean getEnabled() {
        return this.d;
    }

    public TabView.d getFilterHoverListener() {
        return this.l;
    }

    public TabView.e getOnFilteredListener() {
        return this.f26654k;
    }

    public int getTabCount() {
        return this.j;
    }

    public TabView k(CharSequence charSequence) {
        return l(charSequence, true);
    }

    public TabView l(CharSequence charSequence, boolean z) {
        TabView tabViewO = o();
        tabViewO.setOnFilteredListener(this.f26654k);
        tabViewO.setEnabled(this.d);
        tabViewO.setFilterHoverListener(this.l);
        this.g = false;
        this.h = false;
        addView(tabViewO);
        this.j++;
        this.f26652a.add(Integer.valueOf(tabViewO.getId()));
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.s(this);
        v(aVar);
        aVar.i(this);
        tabViewO.k(charSequence, z);
        return tabViewO;
    }

    public void m() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) == this.c) {
                return;
            }
        }
        addView(this.c, 0);
    }

    public TabView n(int i) {
        if (i <= -1) {
            return null;
        }
        View childAt = getChildAt((getChildCount() - this.j) + i);
        if (childAt instanceof TabView) {
            return (TabView) childAt;
        }
        return null;
    }

    public final TabView o() {
        return (TabView) LayoutInflater.from(getContext()).inflate(dwi.f15992a, (ViewGroup) null);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabView tabView;
        super.onLayout(z, i, i2, i3, i4);
        if (this.c.getVisibility() != 8) {
            int left = this.c.getLeft();
            int i5 = this.f;
            this.c.layout(left, i5, this.c.getMeasuredWidth() + left, this.c.getMeasuredHeight() + i5);
        }
        int i6 = this.f26653b;
        if (i6 == -1 || this.g || (tabView = (TabView) findViewById(i6)) == null) {
            return;
        }
        u(tabView);
        if (tabView.getWidth() > 0) {
            this.g = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f26653b == -1 || this.c.getVisibility() == 8) {
            return;
        }
        this.c.measure(View.MeasureSpec.makeMeasureSpec(((TabView) findViewById(this.f26653b)).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (this.f * 2), 1073741824));
    }

    public final void p(Drawable drawable) {
        TabView tabViewO = o();
        this.c = tabViewO;
        tabViewO.setBackground(drawable);
        this.c.f26656b.setVisibility(8);
        this.c.f26655a.setVisibility(8);
        this.c.setVisibility(4);
        this.c.setEnabled(this.d);
        this.c.setImportantForAccessibility(2);
        addView(this.c);
    }

    public final void q() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        View view = new View(getContext());
        this.e = view;
        view.setLayoutParams(layoutParams);
        this.e.setId(View.generateViewId());
        this.e.setBackgroundResource(zoi.f41525b);
        this.e.setAlpha(0.0f);
        addView(this.e);
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.s(this);
        aVar.v(this.e.getId(), 3, getId(), 3);
        aVar.v(this.e.getId(), 4, getId(), 4);
        aVar.v(this.e.getId(), 6, getId(), 6);
        aVar.v(this.e.getId(), 7, getId(), 7);
        aVar.i(this);
    }

    public final /* synthetic */ void r(ConstraintLayout.LayoutParams layoutParams) {
        this.c.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.d != z) {
            this.d = z;
            s();
        }
    }

    public void setFilteredTab(TabView tabView) {
        if (this.f26653b != tabView.getId()) {
            this.h = this.f26653b != -1;
            this.i = false;
            this.f26653b = tabView.getId();
        } else if (this.i) {
            this.h = false;
        }
        tabView.setFiltered(true);
        t();
    }

    public void setFilteredUpdated(boolean z) {
        this.g = z;
    }

    public void setNeedAnim(boolean z) {
        this.h = z;
        this.i = false;
    }

    public void setTabIncatorVisibility(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setIndicatorVisibility(i);
            }
        }
    }

    public void t() {
        if (this.f26652a.size() == 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    if (tabView.getId() != this.c.getId()) {
                        tabView.setOnFilteredListener(this.f26654k);
                        this.f26652a.add(Integer.valueOf(tabView.getId()));
                        tabView.setFilterHoverListener(this.l);
                    }
                }
            }
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.s(this);
            v(aVar);
            aVar.i(this);
        }
    }

    public final void u(TabView tabView) {
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        final ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.c.getLayoutParams();
        this.c.setX(tabView.getX());
        this.c.setY(this.f);
        post(new Runnable() { // from class: um9
            @Override // java.lang.Runnable
            public final void run() {
                this.f35929a.r(layoutParams);
            }
        });
    }

    public void v(androidx.constraintlayout.widget.a aVar) {
        int i = 0;
        while (i < this.f26652a.size()) {
            int iIntValue = this.f26652a.get(i).intValue();
            aVar.A(iIntValue, 0);
            aVar.y(iIntValue, -2);
            aVar.c0(iIntValue, 1.0f);
            int iIntValue2 = i == 0 ? 0 : this.f26652a.get(i - 1).intValue();
            int iIntValue3 = i == this.f26652a.size() + (-1) ? 0 : this.f26652a.get(i + 1).intValue();
            aVar.p(iIntValue, 0);
            aVar.w(iIntValue, 6, iIntValue2, iIntValue2 == 0 ? 6 : 7, iIntValue2 == 0 ? this.f : 0);
            aVar.w(iIntValue, 7, iIntValue3, iIntValue3 == 0 ? 7 : 6, iIntValue3 == 0 ? this.f : 0);
            aVar.w(iIntValue, 3, 0, 3, this.f);
            aVar.w(iIntValue, 4, 0, 4, this.f);
            i++;
        }
    }

    public FilterSortView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterSortView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26652a = new ArrayList();
        this.f26653b = -1;
        this.d = true;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.f26654k = new a();
        this.l = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5j.U, i, a3j.e);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(j5j.X);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(j5j.W);
        this.d = typedArrayObtainStyledAttributes.getBoolean(j5j.V, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f = getResources().getDimensionPixelSize(emi.p);
        setBackground(drawable);
        q();
        p(drawable2);
        y94.b(this, false);
    }

    public void setFilteredTab(int i) {
        TabView tabViewN = n(i);
        if (tabViewN != null) {
            if (this.f26653b != tabViewN.getId()) {
                this.h = this.f26653b != -1;
                this.i = false;
                this.f26653b = tabViewN.getId();
            } else if (this.i) {
                this.h = false;
            }
            tabViewN.setFiltered(true);
        }
        t();
    }
}
