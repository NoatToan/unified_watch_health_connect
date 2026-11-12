package com.garmin.android.apps.connectmobile.userprofile.presentation.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/view/CirclePageIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "", "setViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "Landroid/database/DataSetObserver;", "o", "Landroid/database/DataSetObserver;", "getDataSetObserver", "()Landroid/database/DataSetObserver;", "dataSetObserver", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CirclePageIndicator extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f47179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f47186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Animator f47187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Animator f47188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Animator f47189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Animator f47190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f47192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f47193o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/view/CirclePageIndicator$b;", "Landroid/view/animation/Interpolator;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f14) {
            return (float) Math.abs(1.0f - f14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/presentation/view/CirclePageIndicator$c", "Landroid/database/DataSetObserver;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends DataSetObserver {
        public c() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            int currentItem;
            super.onChanged();
            CirclePageIndicator circlePageIndicator = CirclePageIndicator.this;
            ViewPager viewPager = circlePageIndicator.f47179a;
            if (viewPager == null) {
                return;
            }
            fe.a adapter = viewPager.getAdapter();
            int f149591t = adapter != null ? adapter.getF149591t() : 0;
            if (f149591t == circlePageIndicator.getChildCount()) {
                return;
            }
            if (circlePageIndicator.f47191m < f149591t) {
                ViewPager viewPager2 = circlePageIndicator.f47179a;
                if (viewPager2 == null) {
                    return;
                } else {
                    currentItem = viewPager2.getCurrentItem();
                }
            } else {
                currentItem = -1;
            }
            circlePageIndicator.f47191m = currentItem;
            circlePageIndicator.b();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/presentation/view/CirclePageIndicator$d", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements ViewPager.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f47196b;

        public d(Context context) {
            this.f47196b = context;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            CirclePageIndicator circlePageIndicator = CirclePageIndicator.this;
            ViewPager viewPager = circlePageIndicator.f47179a;
            fe.a adapter = viewPager != null ? viewPager.getAdapter() : null;
            if (adapter == null || adapter.getF149591t() <= 0) {
                return;
            }
            Animator animator = circlePageIndicator.f47188j;
            if (animator != null && animator.isRunning()) {
                Animator animator2 = circlePageIndicator.f47188j;
                if (animator2 != null) {
                    animator2.end();
                }
                Animator animator3 = circlePageIndicator.f47188j;
                if (animator3 != null) {
                    animator3.cancel();
                }
            }
            Animator animator4 = circlePageIndicator.f47187i;
            if (animator4 != null && animator4.isRunning()) {
                Animator animator5 = circlePageIndicator.f47187i;
                if (animator5 != null) {
                    animator5.end();
                }
                Animator animator6 = circlePageIndicator.f47187i;
                if (animator6 != null) {
                    animator6.cancel();
                }
            }
            View childAt = circlePageIndicator.getChildAt(circlePageIndicator.f47191m);
            if (circlePageIndicator.f47191m >= 0) {
                if (childAt != null) {
                    childAt.setBackgroundResource(circlePageIndicator.f47184f);
                }
                Animator animator7 = circlePageIndicator.f47188j;
                if (animator7 != null) {
                    animator7.setTarget(childAt);
                }
                Animator animator8 = circlePageIndicator.f47188j;
                if (animator8 != null) {
                    animator8.start();
                }
            }
            View childAt2 = circlePageIndicator.getChildAt(i14);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(circlePageIndicator.f47183e);
                childAt2.setBackgroundTintList(ColorStateList.valueOf(a7.b.getColor(this.f47196b, R.color.gcm_icon_primary)));
                Animator animator9 = circlePageIndicator.f47187i;
                if (animator9 != null) {
                    animator9.setTarget(childAt2);
                }
                Animator animator10 = circlePageIndicator.f47187i;
                if (animator10 != null) {
                    animator10.start();
                }
            }
            circlePageIndicator.f47191m = i14;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i14) {
        Animator animatorLoadAnimator;
        Animator animatorLoadAnimator2;
        super(context, attributeSet, i14);
        context.getClass();
        this.f47180b = -1;
        this.f47181c = -1;
        this.f47182d = -1;
        int i15 = R.drawable.circle_white;
        this.f47183e = R.drawable.circle_white;
        this.f47184f = R.drawable.circle_white;
        int i16 = R.animator.scale_with_alpha;
        this.f47185g = R.animator.scale_with_alpha;
        this.f47191m = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xb1.a.f189872a, 0, 0);
            this.f47181c = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, -1);
            this.f47182d = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
            this.f47180b = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1);
            this.f47185g = typedArrayObtainStyledAttributes.getResourceId(3, R.animator.scale_with_alpha);
            this.f47186h = typedArrayObtainStyledAttributes.getResourceId(4, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.drawable.circle_white);
            this.f47183e = resourceId;
            this.f47184f = typedArrayObtainStyledAttributes.getResourceId(7, resourceId);
            setGravity(typedArrayObtainStyledAttributes.getInt(0, 17));
            typedArrayObtainStyledAttributes.recycle();
        }
        int i17 = this.f47181c;
        this.f47181c = i17 < 0 ? (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f) : i17;
        int i18 = this.f47182d;
        this.f47182d = i18 < 0 ? (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f) : i18;
        int i19 = this.f47180b;
        this.f47180b = i19 < 0 ? (int) ((5.0f * getResources().getDisplayMetrics().density) + 0.5f) : i19;
        int i24 = this.f47185g;
        i16 = i24 != 0 ? i24 : i16;
        this.f47185g = i16;
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(context, i16);
        animatorLoadAnimator3.getClass();
        this.f47187i = animatorLoadAnimator3;
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(context, this.f47185g);
        animatorLoadAnimator4.getClass();
        animatorLoadAnimator4.setDuration(0L);
        this.f47189k = animatorLoadAnimator4;
        int i25 = this.f47186h;
        if (i25 == 0) {
            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, this.f47185g);
            animatorLoadAnimator.getClass();
            animatorLoadAnimator.setInterpolator(new b());
        } else {
            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i25);
            animatorLoadAnimator.getClass();
        }
        this.f47188j = animatorLoadAnimator;
        int i26 = this.f47186h;
        if (i26 == 0) {
            animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, this.f47185g);
            animatorLoadAnimator2.getClass();
            animatorLoadAnimator2.setInterpolator(new b());
        } else {
            animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, i26);
            animatorLoadAnimator2.getClass();
        }
        animatorLoadAnimator2.setDuration(0L);
        this.f47190l = animatorLoadAnimator2;
        int i27 = this.f47183e;
        i15 = i27 != 0 ? i27 : i15;
        this.f47183e = i15;
        int i28 = this.f47184f;
        this.f47184f = i28 != 0 ? i28 : i15;
        this.f47192n = new d(context);
        this.f47193o = new c();
    }

    public final void a(int i14, int i15, Animator animator) {
        if (animator == null) {
            return;
        }
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view2 = new View(getContext());
        view2.setBackgroundResource(i15);
        view2.setBackgroundTintList(ColorStateList.valueOf(a7.b.getColor(getContext(), R.color.gcm_icon_primary)));
        addView(view2, this.f47181c, this.f47182d);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i16 = this.f47180b;
        if (i14 == 0) {
            layoutParams2.leftMargin = i16;
            layoutParams2.rightMargin = i16;
        } else {
            layoutParams2.topMargin = i16;
            layoutParams2.bottomMargin = i16;
        }
        view2.setLayoutParams(layoutParams2);
        animator.setTarget(view2);
        animator.start();
    }

    public final void b() {
        fe.a adapter;
        removeAllViews();
        ViewPager viewPager = this.f47179a;
        int f149591t = (viewPager == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.getF149591t();
        if (f149591t <= 0) {
            return;
        }
        ViewPager viewPager2 = this.f47179a;
        Integer numValueOf = viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null;
        int orientation = getOrientation();
        for (int i14 = 0; i14 < f149591t; i14++) {
            if (numValueOf != null && numValueOf.intValue() == i14) {
                a(orientation, this.f47183e, this.f47189k);
            } else {
                a(orientation, this.f47184f, this.f47190l);
            }
        }
    }

    public final DataSetObserver getDataSetObserver() {
        return this.f47193o;
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f47179a = viewPager;
        fe.a adapter = viewPager != null ? viewPager.getAdapter() : null;
        if (viewPager == null || adapter == null) {
            return;
        }
        this.f47191m = -1;
        b();
        d dVar = this.f47192n;
        viewPager.z(dVar);
        viewPager.c(dVar);
        dVar.onPageSelected(viewPager.getCurrentItem());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/view/CirclePageIndicator$a;", "", "<init>", "()V", "", "DEFAULT_INDICATOR_WIDTH", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ CirclePageIndicator(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
