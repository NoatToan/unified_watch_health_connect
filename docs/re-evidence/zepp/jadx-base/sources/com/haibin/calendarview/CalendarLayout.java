package com.haibin.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class CalendarLayout extends LinearLayout {
    private static final int A = 2;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 0;
    private static final int E = 2;
    private static final int w = 1;
    private static final int x = -1;
    private static final int y = 0;
    private static final int z = 1;
    private int a;
    private int b;
    private boolean c;
    public WeekBar d;
    public MonthViewPager e;
    public CalendarView f;
    public WeekViewPager g;
    public YearViewPager h;
    public ViewGroup i;
    private int j;
    private int k;
    private int l;
    private int m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    private VelocityTracker s;
    private int t;
    private int u;
    private com.haibin.calendarview.c v;

    public interface CalendarScrollView {
        boolean isScrollToTop();
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarLayout.this.expand(0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarLayout.this.shrink(0);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.l;
            CalendarLayout calendarLayout = CalendarLayout.this;
            calendarLayout.e.setTranslationY(calendarLayout.m * fFloatValue);
            CalendarLayout.this.q = true;
        }
    }

    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarLayout.this.q = false;
            if (CalendarLayout.this.j == 2) {
                CalendarLayout.this.requestLayout();
            }
            CalendarLayout.this.l(true);
            if (CalendarLayout.this.v.w0 != null && CalendarLayout.this.c) {
                CalendarLayout.this.v.w0.onViewChange(true);
            }
            CalendarLayout.this.c = false;
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.l;
            CalendarLayout calendarLayout = CalendarLayout.this;
            calendarLayout.e.setTranslationY(calendarLayout.m * fFloatValue);
            CalendarLayout.this.q = true;
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarLayout.this.q = false;
            CalendarLayout.this.r();
            CalendarLayout.this.c = true;
        }
    }

    public class h implements Runnable {

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.l;
                CalendarLayout calendarLayout = CalendarLayout.this;
                calendarLayout.e.setTranslationY(calendarLayout.m * fFloatValue);
                CalendarLayout.this.q = true;
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.q = false;
                CalendarLayout.this.c = true;
                CalendarLayout.this.r();
                if (CalendarLayout.this.v == null || CalendarLayout.this.v.w0 == null) {
                    return;
                }
                CalendarLayout.this.v.w0.onViewChange(false);
            }
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = CalendarLayout.this.i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -CalendarLayout.this.l);
            objectAnimatorOfFloat.setDuration(0L);
            objectAnimatorOfFloat.addUpdateListener(new a());
            objectAnimatorOfFloat.addListener(new b());
            objectAnimatorOfFloat.start();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarLayout.this.v.w0.onViewChange(true);
        }
    }

    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarLayout.this.i.setVisibility(4);
            CalendarLayout.this.i.clearAnimation();
        }
    }

    public CalendarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 0;
        this.q = false;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarLayout);
        this.r = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CalendarLayout_calendar_content_view_id, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarLayout_default_status, 0);
        this.k = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarLayout_calendar_show_mode, 0);
        this.j = typedArrayObtainStyledAttributes.getInt(R.styleable.CalendarLayout_gesture_mode, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.s = VelocityTracker.obtain();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private int getCalendarViewHeight() {
        int iP;
        int iF;
        if (this.e.getVisibility() == 0) {
            iP = this.v.P();
            iF = this.e.getHeight();
        } else {
            iP = this.v.P();
            iF = this.v.f();
        }
        return iP + iF;
    }

    private int j(MotionEvent motionEvent, int i2) {
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex == -1) {
            this.a = -1;
        }
        return iFindPointerIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z2) {
        if (z2) {
            o();
        }
        this.g.setVisibility(8);
        this.e.setVisibility(0);
    }

    private void m(Calendar calendar) {
        v((com.haibin.calendarview.b.n(calendar, this.v.S()) + calendar.getDay()) - 1);
    }

    private void o() {
        com.haibin.calendarview.c cVar;
        CalendarView.OnViewChangeListener onViewChangeListener;
        if (this.e.getVisibility() == 0 || (cVar = this.v) == null || (onViewChangeListener = cVar.w0) == null || !this.c) {
            return;
        }
        onViewChangeListener.onViewChange(true);
    }

    private void p() {
        com.haibin.calendarview.c cVar;
        CalendarView.OnViewChangeListener onViewChangeListener;
        if (this.g.getVisibility() == 0 || (cVar = this.v) == null || (onViewChangeListener = cVar.w0) == null || this.c) {
            return;
        }
        onViewChangeListener.onViewChange(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        p();
        WeekViewPager weekViewPager = this.g;
        if (weekViewPager != null && weekViewPager.getAdapter() != null) {
            this.g.getAdapter().notifyDataSetChanged();
            this.g.setVisibility(0);
        }
        this.e.setVisibility(4);
    }

    private void s() {
        this.e.setTranslationY(this.m * ((this.i.getTranslationY() * 1.0f) / this.l));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.q) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.j == 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.h == null || (calendarView = this.f) == null || calendarView.getVisibility() == 8 || (viewGroup = this.i) == null || viewGroup.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i2 = this.k;
        if (i2 == 2 || i2 == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.h.getVisibility() == 0 || this.v.U) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y2 = motionEvent.getY();
        if (action != 2 || y2 - this.o <= 0.0f || this.i.getTranslationY() != (-this.l) || !isScrollTop()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean expand() {
        return expand(240);
    }

    public void hideCalendarView() {
        CalendarView calendarView = this.f;
        if (calendarView == null) {
            return;
        }
        calendarView.setVisibility(8);
        if (!isExpand()) {
            expand(0);
        }
        requestLayout();
    }

    public final boolean isExpand() {
        return this.e.getVisibility() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isScrollTop() {
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof CalendarScrollView) {
            return ((CalendarScrollView) viewGroup).isScrollToTop();
        }
        if (viewGroup instanceof RecyclerView) {
            return ((RecyclerView) viewGroup).computeVerticalScrollOffset() == 0;
        }
        if (!(viewGroup instanceof AbsListView)) {
            return viewGroup.getScrollY() == 0;
        }
        AbsListView absListView = (AbsListView) viewGroup;
        if (absListView.getFirstVisiblePosition() == 0) {
            return absListView.getChildAt(0).getTop() == 0;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final void k() {
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().translationY(getHeight() - this.e.getHeight()).setDuration(220L).setInterpolator(new LinearInterpolator()).setListener(new j());
    }

    public final void n() {
        if ((this.b != 1 && this.k != 1) || this.k == 2) {
            if (this.v.w0 == null) {
                return;
            }
            post(new i());
        } else if (this.i != null) {
            post(new h());
        } else {
            this.g.setVisibility(0);
            this.e.setVisibility(8);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = (MonthViewPager) findViewById(R.id.vp_month);
        this.g = (WeekViewPager) findViewById(R.id.vp_week);
        if (getChildCount() > 0) {
            this.f = (CalendarView) getChildAt(0);
        }
        this.i = (ViewGroup) findViewById(this.r);
        this.h = (YearViewPager) findViewById(R.id.selectLayout);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.q) {
            return true;
        }
        if (this.j == 2) {
            return false;
        }
        if (this.h == null || (calendarView = this.f) == null || calendarView.getVisibility() == 8 || (viewGroup = this.i) == null || viewGroup.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i2 = this.k;
        if (i2 == 2 || i2 == 1) {
            return false;
        }
        if (this.h.getVisibility() == 0 || this.v.U) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y2 = motionEvent.getY();
        float x2 = motionEvent.getX();
        if (action == 0) {
            this.a = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.n = y2;
            this.o = y2;
            this.p = x2;
        } else if (action == 2) {
            float f2 = y2 - this.o;
            float f3 = x2 - this.p;
            if (f2 < 0.0f && this.i.getTranslationY() == (-this.l)) {
                return false;
            }
            if (f2 > 0.0f && this.i.getTranslationY() == (-this.l) && y2 >= this.v.f() + this.v.P() && !isScrollTop()) {
                return false;
            }
            if (f2 > 0.0f && this.i.getTranslationY() == 0.0f && y2 >= com.haibin.calendarview.b.c(getContext(), 98.0f)) {
                return false;
            }
            if (Math.abs(f2) > Math.abs(f3) && ((f2 > 0.0f && this.i.getTranslationY() <= 0.0f) || (f2 < 0.0f && this.i.getTranslationY() >= (-this.l)))) {
                this.o = y2;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.i == null || this.f == null) {
            super.onMeasure(i2, i3);
            return;
        }
        int year = this.v.z0.getYear();
        int month = this.v.z0.getMonth();
        int iC = com.haibin.calendarview.b.c(getContext(), 1.0f) + this.v.P();
        int iK = com.haibin.calendarview.b.k(year, month, this.v.f(), this.v.S(), this.v.B()) + iC;
        int size = View.MeasureSpec.getSize(i3);
        if (this.v.o0()) {
            super.onMeasure(i2, i3);
            this.i.measure(i2, View.MeasureSpec.makeMeasureSpec((size - iC) - this.v.f(), 1073741824));
            ViewGroup viewGroup = this.i;
            viewGroup.layout(viewGroup.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            return;
        }
        if (iK >= size && this.e.getHeight() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(iK + iC + this.v.P(), 1073741824);
            size = iK;
        } else if (iK < size && this.e.getHeight() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (this.k == 2 || this.f.getVisibility() == 8) {
            iK = this.f.getVisibility() == 8 ? 0 : this.f.getHeight();
        } else if (this.j != 2 || this.q || !isExpand()) {
            size -= iC;
            iK = this.u;
        }
        super.onMeasure(i2, i3);
        this.i.measure(i2, View.MeasureSpec.makeMeasureSpec(size - iK, 1073741824));
        ViewGroup viewGroup2 = this.i;
        viewGroup2.layout(viewGroup2.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        if (bundle.getBoolean("isExpand")) {
            post(new b());
        } else {
            post(new c());
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", isExpand());
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        com.haibin.calendarview.c cVar;
        CalendarView calendarView;
        CalendarView.OnViewChangeListener onViewChangeListener;
        int iJ;
        if (this.j == 2 || (i2 = this.k) == 2 || i2 == 1 || (cVar = this.v) == null || cVar.U || this.i == null || (calendarView = this.f) == null || calendarView.getVisibility() == 8) {
            return false;
        }
        int action = motionEvent.getAction();
        float y2 = motionEvent.getY();
        this.s.addMovement(motionEvent);
        if (action == 0) {
            this.a = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.n = y2;
            this.o = y2;
            return true;
        }
        if (action == 1) {
            VelocityTracker velocityTracker = this.s;
            velocityTracker.computeCurrentVelocity(1000, this.t);
            float yVelocity = velocityTracker.getYVelocity();
            if (this.i.getTranslationY() == 0.0f || this.i.getTranslationY() == this.l) {
                expand();
            } else {
                if (Math.abs(yVelocity) >= 800.0f) {
                    if (yVelocity < 0.0f) {
                        shrink();
                    } else {
                        expand();
                    }
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getY() - this.n > 0.0f) {
                    expand();
                } else {
                    shrink();
                }
            }
        } else if (action == 2) {
            j(motionEvent, this.a);
            if (this.a == -1) {
                this.o = y2;
                this.a = 1;
            }
            float f2 = y2 - this.o;
            if (f2 < 0.0f && this.i.getTranslationY() == (-this.l)) {
                this.o = y2;
                motionEvent.setAction(0);
                dispatchTouchEvent(motionEvent);
                this.g.setVisibility(0);
                this.e.setVisibility(4);
                if (!this.c && (onViewChangeListener = this.v.w0) != null) {
                    onViewChangeListener.onViewChange(false);
                }
                this.c = true;
                return false;
            }
            l(false);
            if (f2 > 0.0f && this.i.getTranslationY() + f2 >= 0.0f) {
                this.i.setTranslationY(0.0f);
                s();
                this.o = y2;
                return super.onTouchEvent(motionEvent);
            }
            if (f2 < 0.0f) {
                float translationY = this.i.getTranslationY() + f2;
                int i3 = this.l;
                if (translationY <= (-i3)) {
                    this.i.setTranslationY(-i3);
                    s();
                    this.o = y2;
                    return super.onTouchEvent(motionEvent);
                }
            }
            ViewGroup viewGroup = this.i;
            viewGroup.setTranslationY(viewGroup.getTranslationY() + f2);
            s();
            this.o = y2;
        } else if (action == 3) {
            iJ = j(motionEvent, this.a);
            if (this.a != -1) {
                this.o = motionEvent.getY(iJ);
            }
        } else if (action == 5) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.a = pointerId;
            if (pointerId == 0) {
                this.o = motionEvent.getY(pointerId);
            }
        } else if (action == 6) {
            iJ = j(motionEvent, this.a);
            if (this.a != -1) {
                this.o = motionEvent.getY(iJ);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @SuppressLint({"NewApi"})
    public final void q() {
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(getHeight() - this.e.getHeight());
        this.i.setVisibility(0);
        this.i.animate().translationY(0.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new a());
    }

    public void setModeBothMonthWeekView() {
        this.k = 0;
        requestLayout();
    }

    public void setModeOnlyMonthView() {
        this.k = 2;
        requestLayout();
    }

    public void setModeOnlyWeekView() {
        this.k = 1;
        requestLayout();
    }

    public final void setup(com.haibin.calendarview.c cVar) {
        this.v = cVar;
        this.u = cVar.f();
        m(cVar.y0.isAvailable() ? cVar.y0 : cVar.e());
        u();
    }

    public void showCalendarView() {
        this.f.setVisibility(0);
        requestLayout();
    }

    public boolean shrink() {
        return shrink(240);
    }

    public final void t() {
        this.u = this.v.f();
        if (this.i == null) {
            return;
        }
        com.haibin.calendarview.c cVar = this.v;
        Calendar calendar = cVar.z0;
        w(com.haibin.calendarview.b.v(calendar, cVar.S()));
        if (this.v.B() == 0) {
            this.l = this.u * 5;
        } else {
            this.l = com.haibin.calendarview.b.j(calendar.getYear(), calendar.getMonth(), this.u, this.v.S()) - this.u;
        }
        s();
        if (this.g.getVisibility() == 0) {
            this.i.setTranslationY(-this.l);
        }
    }

    public void u() {
        ViewGroup viewGroup;
        com.haibin.calendarview.c cVar = this.v;
        Calendar calendar = cVar.z0;
        if (cVar.B() == 0) {
            this.l = this.u * 5;
        } else {
            this.l = com.haibin.calendarview.b.j(calendar.getYear(), calendar.getMonth(), this.u, this.v.S()) - this.u;
        }
        if (this.g.getVisibility() != 0 || (viewGroup = this.i) == null) {
            return;
        }
        viewGroup.setTranslationY(-this.l);
    }

    public final void v(int i2) {
        this.m = (((i2 + 7) / 7) - 1) * this.u;
    }

    public final void w(int i2) {
        this.m = (i2 - 1) * this.u;
    }

    public boolean expand(int i2) {
        if (this.q || this.k == 1 || this.i == null) {
            return false;
        }
        if (this.e.getVisibility() != 0) {
            this.g.setVisibility(8);
            o();
            this.c = false;
            this.e.setVisibility(0);
        }
        ViewGroup viewGroup = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        objectAnimatorOfFloat.setDuration(i2);
        objectAnimatorOfFloat.addUpdateListener(new d());
        objectAnimatorOfFloat.addListener(new e());
        objectAnimatorOfFloat.start();
        return true;
    }

    public boolean shrink(int i2) {
        ViewGroup viewGroup;
        if (this.j == 2) {
            requestLayout();
        }
        if (this.q || (viewGroup = this.i) == null) {
            return false;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -this.l);
        objectAnimatorOfFloat.setDuration(i2);
        objectAnimatorOfFloat.addUpdateListener(new f());
        objectAnimatorOfFloat.addListener(new g());
        objectAnimatorOfFloat.start();
        return true;
    }
}
