package com.huawei.ui.commonui.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.R;
import defpackage.qjj;
import defpackage.qjo;

/* JADX INFO: loaded from: classes16.dex */
public class HealthCalendarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewGroup f23308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HealthWeekViewPager f23309c;
    HealthMonthViewPager d;
    HealthCalendarView e;
    private float f;
    private boolean g;
    private final int h;
    private boolean i;
    private int j;
    private final int k;
    private float l;
    private qjo m;
    private int n;
    private float o;
    private final VelocityTracker q;
    private int r;
    private int s;
    private final int t;

    public HealthCalendarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthCalendarLayout);
        this.t = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HealthCalendarLayout_calendar_content_view_id, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthCalendarLayout_default_status, 0);
        this.j = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthCalendarLayout_calendar_display_mode, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.q = VelocityTracker.obtain();
        this.k = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    final void a(qjo qjoVar) {
        this.m = qjoVar;
        this.n = qjoVar.c();
        e(qjoVar.o.isAvailable() ? qjoVar.o : qjoVar.b());
        g();
    }

    private void e(HealthCalendar healthCalendar) {
        e((qjj.a(healthCalendar, this.m.aa()) + healthCalendar.getDay()) - 1);
    }

    final void e(int i) {
        this.r = (((i + 7) / 7) - 1) * this.n;
    }

    final void b(int i) {
        this.r = (i - 1) * this.n;
    }

    void g() {
        ViewGroup viewGroup;
        this.s = qjj.c(this.m.f46318a, this.m) - this.n;
        if (this.f23309c.getVisibility() != 0 || (viewGroup = this.f23308b) == null) {
            return;
        }
        viewGroup.setTranslationY(-this.s);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        HealthCalendarView healthCalendarView;
        int iB;
        if (!f() || this.f23308b == null || (healthCalendarView = this.e) == null || healthCalendarView.getVisibility() == 8) {
            return false;
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        this.q.addMovement(motionEvent);
        if (action == 0) {
            this.f23307a = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.o = y;
            this.f = y;
            return true;
        }
        if (action == 1) {
            e(motionEvent);
        } else {
            if (action == 2) {
                return a(motionEvent);
            }
            if (action == 3) {
                iB = b(motionEvent, this.f23307a);
                if (this.f23307a != -1) {
                    this.o = motionEvent.getY(iB);
                }
            } else if (action == 5) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f23307a = pointerId;
                if (pointerId == 0) {
                    this.o = motionEvent.getY(pointerId);
                }
            } else if (action == 6) {
                iB = b(motionEvent, this.f23307a);
                if (this.f23307a != -1) {
                    this.o = motionEvent.getY(iB);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    private boolean a(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        b(motionEvent, this.f23307a);
        if (this.f23307a == -1) {
            this.o = y;
            this.f23307a = 1;
        }
        float f = y - this.o;
        float translationY = 0.0f;
        if (f < 0.0f && j()) {
            this.o = y;
            motionEvent.setAction(0);
            dispatchTouchEvent(motionEvent);
            this.f23309c.setVisibility(0);
            this.d.setVisibility(4);
            if (!this.g && this.m.l != null) {
                this.m.l.onViewChange(false);
            }
            this.g = true;
            return true;
        }
        if (f <= 0.0f || this.f23308b.getTranslationY() + f < 0.0f) {
            if (f < 0.0f) {
                float translationY2 = this.f23308b.getTranslationY() + f;
                float f2 = -this.s;
                if (translationY2 <= f2) {
                    translationY = f2;
                } else {
                    translationY = this.f23308b.getTranslationY() + f;
                }
            } else {
                translationY = this.f23308b.getTranslationY() + f;
            }
        }
        this.f23308b.setTranslationY(translationY);
        o();
        this.o = y;
        d(false);
        return super.onTouchEvent(motionEvent);
    }

    private void e(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.q;
        velocityTracker.computeCurrentVelocity(1000, this.k);
        float yVelocity = velocityTracker.getYVelocity();
        if (h() || this.f23308b.getTranslationY() == this.s) {
            a();
            return;
        }
        if (Math.abs(yVelocity) >= 800.0f) {
            if (yVelocity < 0.0f) {
                e();
                return;
            } else {
                a();
                return;
            }
        }
        if (motionEvent.getY() - this.f > 0.0f) {
            a();
        } else {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        if (this.i || !f()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        HealthCalendarView healthCalendarView = this.e;
        if (healthCalendarView == null || healthCalendarView.getVisibility() == 8 || (viewGroup = this.f23308b) == null || viewGroup.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 2 && motionEvent.getY() - this.o > 0.0f && j() && d()) {
            requestDisallowInterceptTouchEvent(false);
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        if (this.i) {
            return true;
        }
        HealthCalendarView healthCalendarView = this.e;
        if (healthCalendarView == null || healthCalendarView.getVisibility() == 8 || (viewGroup = this.f23308b) == null || viewGroup.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!f()) {
            return false;
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        if (action == 0) {
            this.f23307a = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.o = y;
            this.f = y;
            this.l = x;
        } else if (action == 2) {
            float f = y - this.o;
            if (f < 0.0f && j()) {
                return false;
            }
            if (f > 0.0f && j() && y >= this.m.c() + this.m.ab() && !d()) {
                return false;
            }
            if (f > 0.0f && h()) {
                return false;
            }
            if (Math.abs(f) > Math.abs(x - this.l) && ((f > 0.0f && this.f23308b.getTranslationY() <= 0.0f) || (f < 0.0f && this.f23308b.getTranslationY() >= (-this.s)))) {
                this.o = y;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private int b(MotionEvent motionEvent, int i) {
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex == -1) {
            this.f23307a = -1;
        }
        return iFindPointerIndex;
    }

    private boolean f() {
        int i = this.j;
        return (i == 2 || i == 1) ? false : true;
    }

    private boolean j() {
        return this.f23308b.getTranslationY() == ((float) (-this.s));
    }

    private boolean h() {
        return this.f23308b.getTranslationY() == 0.0f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f23308b == null || this.e == null) {
            super.onMeasure(i, i2);
            return;
        }
        int iAb = this.m.ab();
        int iC = qjj.c(this.m.f46318a, this.m) + iAb + this.m.v();
        int size = View.MeasureSpec.getSize(i2);
        if (iC >= size && this.d.getHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iC + iAb + iAb, 1073741824);
        } else if (iC < size && this.d.getHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        super.onMeasure(i, i2);
        a(size, i);
    }

    private void a(int i, int i2) {
        int height;
        if (this.j == 2 || this.e.getVisibility() == 8) {
            height = this.e.getVisibility() == 8 ? 0 : this.e.getHeight();
        } else {
            i = (i - this.m.ab()) - this.n;
            height = this.m.v();
        }
        this.f23308b.measure(i2, View.MeasureSpec.makeMeasureSpec(i - height, 1073741824));
        ViewGroup viewGroup = this.f23308b;
        viewGroup.layout(viewGroup.getLeft(), this.f23308b.getTop(), this.f23308b.getRight(), this.f23308b.getBottom());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = (HealthMonthViewPager) findViewById(R.id.vp_month);
        this.f23309c = (HealthWeekViewPager) findViewById(R.id.vp_week);
        if (getChildCount() > 0 && (getChildAt(0) instanceof HealthCalendarView)) {
            this.e = (HealthCalendarView) getChildAt(0);
        }
        this.f23308b = (ViewGroup) findViewById(this.t);
    }

    private void o() {
        a(this.f23308b.getTranslationY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        int i = this.s;
        if (i == 0) {
            return;
        }
        this.d.setTranslationY(this.r * (f / i));
    }

    public void setCanlendarViewDisplayMode(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isUnfolded", b());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("super");
            final boolean z = bundle.getBoolean("isUnfolded");
            post(new Runnable() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        HealthCalendarLayout.this.c(0);
                    } else {
                        HealthCalendarLayout.this.d(0);
                    }
                }
            });
            super.onRestoreInstanceState(parcelable2);
        }
    }

    public final boolean b() {
        return this.d.getVisibility() == 0;
    }

    public boolean a() {
        return c(240);
    }

    public boolean c(int i) {
        if (this.i || this.j == 1 || this.f23308b == null) {
            return false;
        }
        if (this.d.getVisibility() != 0) {
            this.f23309c.setVisibility(8);
            k();
            this.g = false;
            this.d.setVisibility(0);
        }
        ObjectAnimator objectAnimatorB = b(i, this.f23308b.getTranslationY(), 0.0f);
        objectAnimatorB.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                HealthCalendarLayout.this.i = false;
                HealthCalendarLayout.this.d(true);
                if (HealthCalendarLayout.this.m.l != null && HealthCalendarLayout.this.g) {
                    HealthCalendarLayout.this.m.l.onViewChange(true);
                }
                HealthCalendarLayout.this.g = false;
            }
        });
        objectAnimatorB.start();
        return true;
    }

    public boolean e() {
        return d(240);
    }

    public boolean d(int i) {
        ViewGroup viewGroup;
        if (this.i || (viewGroup = this.f23308b) == null) {
            return false;
        }
        ObjectAnimator objectAnimatorB = b(i, viewGroup.getTranslationY(), -this.s);
        objectAnimatorB.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                HealthCalendarLayout.this.i = false;
                HealthCalendarLayout.this.i();
                HealthCalendarLayout.this.g = true;
            }
        });
        objectAnimatorB.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator b(int i, float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f23308b, "translationY", f, f2);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getAnimatedValue() instanceof Float) {
                    HealthCalendarLayout.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                HealthCalendarLayout.this.i = true;
            }
        });
        return objectAnimatorOfFloat;
    }

    final void c() {
        if ((this.h == 1 || this.j == 1) && this.j != 2) {
            if (this.f23308b == null) {
                this.f23309c.setVisibility(0);
                this.d.setVisibility(8);
                return;
            } else {
                post(new Runnable() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.2
                    @Override // java.lang.Runnable
                    public void run() {
                        HealthCalendarLayout healthCalendarLayout = HealthCalendarLayout.this;
                        ObjectAnimator objectAnimatorB = healthCalendarLayout.b(0, healthCalendarLayout.f23308b.getTranslationY(), -HealthCalendarLayout.this.s);
                        objectAnimatorB.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.2.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                HealthCalendarLayout.this.i = false;
                                HealthCalendarLayout.this.g = true;
                                HealthCalendarLayout.this.i();
                                if (HealthCalendarLayout.this.m == null || HealthCalendarLayout.this.m.l == null) {
                                    return;
                                }
                                HealthCalendarLayout.this.m.l.onViewChange(false);
                            }
                        });
                        objectAnimatorB.start();
                    }
                });
                return;
            }
        }
        if (this.m.l == null) {
            return;
        }
        post(new Runnable() { // from class: com.huawei.ui.commonui.calendarview.HealthCalendarLayout.6
            @Override // java.lang.Runnable
            public void run() {
                HealthCalendarLayout.this.m.l.onViewChange(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (z) {
            k();
        }
        this.f23309c.setVisibility(8);
        this.d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        n();
        HealthWeekViewPager healthWeekViewPager = this.f23309c;
        if (healthWeekViewPager != null && healthWeekViewPager.getAdapter() != null) {
            this.f23309c.getAdapter().notifyDataSetChanged();
            this.f23309c.setVisibility(0);
        }
        this.d.setVisibility(4);
    }

    private void n() {
        if (this.f23309c.getVisibility() == 0 || this.m.l == null || this.g) {
            return;
        }
        this.m.l.onViewChange(false);
    }

    private void k() {
        qjo qjoVar;
        if (this.d.getVisibility() == 0 || (qjoVar = this.m) == null || qjoVar.l == null || !this.g) {
            return;
        }
        this.m.l.onViewChange(true);
    }

    protected boolean d() {
        ViewGroup viewGroup = this.f23308b;
        if (viewGroup instanceof RecyclerView) {
            return ((RecyclerView) viewGroup).computeVerticalScrollOffset() == 0;
        }
        if (!(viewGroup instanceof AbsListView)) {
            return viewGroup.getScrollY() == 0;
        }
        AbsListView absListView = (AbsListView) viewGroup;
        return absListView.getFirstVisiblePosition() == 0 && absListView.getChildAt(0).getTop() == 0;
    }
}
