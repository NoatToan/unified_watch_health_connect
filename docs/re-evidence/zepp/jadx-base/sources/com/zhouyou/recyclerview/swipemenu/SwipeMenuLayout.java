package com.zhouyou.recyclerview.swipemenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.widget.ScrollerCompat;
import com.zhouyou.recyclerviewsdk.R;

/* JADX INFO: loaded from: classes22.dex */
public class SwipeMenuLayout extends FrameLayout {
    private static final int q = 0;
    private static final int r = 1;
    private static final boolean s;
    private int a;
    private View b;
    private View c;
    private int d;
    private int e;
    private GestureDetectorCompat f;
    private GestureDetector.OnGestureListener g;
    private boolean h;
    private ScrollerCompat i;
    private ScrollerCompat j;
    private int k;
    private Interpolator l;
    private Interpolator m;
    private ViewConfiguration n;
    private boolean o;
    private int p;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            SwipeMenuLayout.this.h = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (f > SwipeMenuLayout.this.n.getScaledMinimumFlingVelocity() || f2 > SwipeMenuLayout.this.n.getScaledMinimumFlingVelocity()) {
                SwipeMenuLayout.this.h = true;
            }
            return SwipeMenuLayout.this.h;
        }
    }

    static {
        s = Build.VERSION.SDK_INT >= 11;
    }

    public SwipeMenuLayout(Context context) {
        this(context, null);
    }

    private void d(int i) {
        if (Math.signum(i) != this.a) {
            i = 0;
        } else if (Math.abs(i) > this.c.getWidth()) {
            i = this.c.getWidth() * this.a;
            this.e = 1;
        }
        int paddingLeft = getPaddingLeft() + ((FrameLayout.LayoutParams) this.b.getLayoutParams()).leftMargin;
        View view = this.b;
        int i2 = paddingLeft - i;
        int top = view.getTop();
        boolean z = s;
        view.layout(i2, top, (paddingLeft + (z ? this.b.getMeasuredWidthAndState() : this.b.getMeasuredWidth())) - i, this.b.getBottom());
        if (this.a != 1) {
            View view2 = this.c;
            view2.layout((-(z ? view2.getMeasuredWidthAndState() : view2.getMeasuredWidth())) - i, this.c.getTop(), -i, this.c.getBottom());
            return;
        }
        View view3 = this.c;
        int measuredWidth = getMeasuredWidth() - i;
        int top2 = this.c.getTop();
        int measuredWidth2 = getMeasuredWidth();
        View view4 = this.c;
        view3.layout(measuredWidth, top2, (measuredWidth2 + (z ? view4.getMeasuredWidthAndState() : view4.getMeasuredWidth())) - i, this.c.getBottom());
    }

    public void closeMenu() {
        if (this.j.computeScrollOffset()) {
            this.j.abortAnimation();
        }
        if (this.e == 1) {
            this.e = 0;
            d(0);
        }
    }

    public void closeOpenedMenu() {
        this.e = 0;
        if (this.a == 1) {
            this.k = -this.b.getLeft();
            this.j.startScroll(0, 0, this.c.getWidth(), 0, this.p);
        } else {
            this.k = this.c.getRight();
            this.j.startScroll(0, 0, this.c.getWidth(), 0, this.p);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.e == 1) {
            if (this.i.computeScrollOffset()) {
                d(this.i.getCurrX() * this.a);
                postInvalidate();
                return;
            }
            return;
        }
        if (this.j.computeScrollOffset()) {
            d((this.k - this.j.getCurrX()) * this.a);
            postInvalidate();
        }
    }

    public View getContentView() {
        return this.b;
    }

    public View getMenuView() {
        return this.c;
    }

    public void init() {
        this.g = new a();
        this.f = new GestureDetectorCompat(getContext(), this.g);
        this.j = ScrollerCompat.create(getContext());
        this.i = ScrollerCompat.create(getContext());
    }

    public boolean isOpen() {
        return this.e == 1;
    }

    public boolean isSwipeEnable() {
        return this.o;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setClickable(true);
        View viewFindViewById = findViewById(R.id.smContentView);
        this.b = viewFindViewById;
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("not find contentView by id smContentView");
        }
        View viewFindViewById2 = findViewById(R.id.smMenuView);
        this.c = viewFindViewById2;
        if (viewFindViewById2 == null) {
            throw new IllegalArgumentException("not find menuView by id smMenuView");
        }
        this.n = ViewConfiguration.get(getContext());
        init();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
        int paddingTop = getPaddingTop() + layoutParams.topMargin;
        View view = this.b;
        boolean z2 = s;
        view.layout(paddingLeft, paddingTop, (z2 ? view.getMeasuredWidthAndState() : view.getMeasuredWidth()) + paddingLeft, (z2 ? this.b.getMeasuredHeightAndState() : this.b.getMeasuredHeight()) + paddingTop);
        int paddingTop2 = getPaddingTop() + ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin;
        if (this.a == 1) {
            this.c.layout(getMeasuredWidth(), paddingTop2, getMeasuredWidth() + (z2 ? this.c.getMeasuredWidthAndState() : this.c.getMeasuredWidth()), this.c.getMeasuredHeightAndState() + paddingTop2);
        } else {
            View view2 = this.c;
            view2.layout(-(z2 ? view2.getMeasuredWidthAndState() : view2.getMeasuredWidth()), paddingTop2, 0, this.c.getMeasuredHeightAndState() + paddingTop2);
        }
    }

    public boolean onSwipe(MotionEvent motionEvent) {
        this.f.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = (int) motionEvent.getX();
            this.h = false;
        } else if (action != 1) {
            if (action == 2) {
                int x = (int) (this.d - motionEvent.getX());
                if (this.e == 1) {
                    x += this.c.getWidth() * this.a;
                }
                d(x);
            }
        } else {
            if ((!this.h && Math.abs(this.d - motionEvent.getX()) <= this.c.getWidth() / 3) || Math.signum(this.d - motionEvent.getX()) != this.a) {
                smoothCloseMenu();
                return false;
            }
            smoothOpenMenu();
        }
        return true;
    }

    public void openMenu() {
        if (this.e == 0) {
            this.e = 1;
            d(this.c.getWidth() * this.a);
        }
    }

    public void setCloseInterpolator(Interpolator interpolator) {
        this.l = interpolator;
        if (interpolator != null) {
            this.j = ScrollerCompat.create(getContext(), this.l);
        }
    }

    public void setOpenInterpolator(Interpolator interpolator) {
        this.m = interpolator;
        if (interpolator != null) {
            this.i = ScrollerCompat.create(getContext(), this.m);
        }
    }

    public void setSwipeDirection(int i) {
        this.a = i;
    }

    public void setSwipeEnable(boolean z) {
        this.o = z;
    }

    public void smoothCloseMenu() {
        closeOpenedMenu();
    }

    public void smoothOpenMenu() {
        this.e = 1;
        if (this.a == 1) {
            this.i.startScroll(-this.b.getLeft(), 0, this.c.getWidth(), 0, this.p);
        } else {
            this.i.startScroll(this.b.getLeft(), 0, this.c.getWidth(), 0, this.p);
        }
        postInvalidate();
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        this.o = true;
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwipeMenu, 0, i);
        this.p = typedArrayObtainStyledAttributes.getInteger(R.styleable.SwipeMenu_anim_duration, 500);
        typedArrayObtainStyledAttributes.recycle();
    }
}
