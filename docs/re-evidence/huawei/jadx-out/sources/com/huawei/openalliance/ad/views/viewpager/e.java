package com.huawei.openalliance.ad.views.viewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e extends ViewGroup {
    private float A;
    private float B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private int Q;
    private List<d> R;
    private h S;
    private int T;
    private int U;
    private EdgeEffect V;
    private EdgeEffect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21377a;
    private int aa;
    private ArrayList<View> ab;
    private final Runnable ad;
    private int ae;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f21378b;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private Scroller l;
    private final ArrayList<a> m;
    private final a n;
    private ClassLoader o;
    private final Rect p;
    private Drawable q;
    private Parcelable r;
    private float s;
    private float t;
    private g u;
    private int v;
    private boolean w;
    private boolean x;
    private float y;
    private float z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<a> f21376c = new Comparator<a>() { // from class: com.huawei.openalliance.ad.views.viewpager.e.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            return aVar.f21371b - aVar2.f21371b;
        }
    };
    private static final Interpolator d = new Interpolator() { // from class: com.huawei.openalliance.ad.views.viewpager.e.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final j ac = new j();

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    void setScrollState(int i) {
        if (this.ae == i) {
            return;
        }
        this.ae = i;
        if (this.S != null) {
            b(i != 0);
        }
        g(i);
    }

    public void setCurrentItem(int i) {
        this.x = false;
        a(i, !this.M, false);
    }

    public void setAdapter(f fVar) {
        f fVar2 = this.f21378b;
        if (fVar2 != null) {
            fVar2.a((DataSetObserver) null);
            this.f21378b.a((ViewGroup) this);
            for (int i = 0; i < this.m.size(); i++) {
                a aVar = this.m.get(i);
                this.f21378b.a(this, aVar.f21371b, aVar.f21370a);
            }
            this.f21378b.b(this);
            this.m.clear();
            i();
            this.f21377a = 0;
            scrollTo(0, 0);
        }
        this.f21378b = fVar;
        this.g = 0;
        if (fVar != null) {
            if (this.u == null) {
                this.u = new g(this);
            }
            this.f21378b.a((DataSetObserver) this.u);
            this.x = false;
            boolean z = this.M;
            this.M = true;
            this.g = this.f21378b.a();
            if (this.h < 0) {
                if (z) {
                    requestLayout();
                    return;
                } else {
                    b();
                    return;
                }
            }
            this.f21378b.a(this.r, this.o);
            a(this.h, false, true);
            this.h = -1;
            this.r = null;
            this.o = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f fVar;
        boolean zA;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (fVar = this.f21378b) == null || fVar.a() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                zA = a(motionEvent, false);
            } else if (action == 2) {
                zA = b(motionEvent, false);
            } else if (action == 3) {
                zA = c(false);
            } else if (action == 5) {
                c(motionEvent);
            } else if (action == 6) {
                b(motionEvent);
            }
            if (zA) {
                postInvalidateOnAnimation();
            }
        } else {
            d(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.v;
            a(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedStatePPS savedStatePPS = new SavedStatePPS(super.onSaveInstanceState());
        savedStatePPS.f21368b = this.f21377a;
        f fVar = this.f21378b;
        if (fVar != null) {
            savedStatePPS.f21369c = fVar.b();
        }
        return savedStatePPS;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedStatePPS)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedStatePPS savedStatePPS = (SavedStatePPS) parcelable;
        super.onRestoreInstanceState(savedStatePPS.a());
        f fVar = this.f21378b;
        if (fVar != null) {
            fVar.a(savedStatePPS.f21369c, savedStatePPS.d);
            a(savedStatePPS.f21368b, false, true);
        } else {
            this.h = savedStatePPS.f21368b;
            this.r = savedStatePPS.f21369c;
            this.o = savedStatePPS.d;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        a aVarA;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (aVarA = a(childAt)) != null && aVarA.f21371b == this.f21377a && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        i iVar;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.F = Math.min(measuredWidth / 10, this.P);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            int i8 = 1073741824;
            if (i7 >= childCount) {
                this.e = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                this.f = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                e(paddingLeft);
                return;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (iVar = (i) childAt.getLayoutParams()) != null && iVar.f21384b) {
                int i9 = iVar.f21385c & 7;
                int i10 = iVar.f21385c & 112;
                boolean z2 = true;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (i9 != 3 && i9 != 5) {
                    z2 = z;
                }
                int i11 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (iVar.width != -2) {
                    i5 = iVar.width != -1 ? iVar.width : paddingLeft;
                    i4 = 1073741824;
                } else {
                    i4 = i11;
                    i5 = paddingLeft;
                }
                if (iVar.height != -2) {
                    i6 = iVar.height != -1 ? iVar.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i4), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int iMax;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = paddingTop;
        int measuredHeight2 = paddingBottom;
        int i8 = 0;
        int i9 = paddingLeft;
        int measuredWidth3 = paddingRight;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                i iVar = (i) childAt.getLayoutParams();
                if (iVar.f21384b) {
                    int i11 = iVar.f21385c & 7;
                    int i12 = iVar.f21385c & 112;
                    if (i11 == 1) {
                        measuredWidth2 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, i9);
                    } else {
                        if (i11 == 5) {
                            measuredWidth2 = (i5 - measuredWidth3) - childAt.getMeasuredWidth();
                            measuredWidth3 += childAt.getMeasuredWidth();
                        } else {
                            measuredWidth = i11 == 3 ? childAt.getMeasuredWidth() + i9 : i9;
                        }
                        if (i12 == 80) {
                            iMax = (i6 - measuredHeight2) - childAt.getMeasuredHeight();
                            measuredHeight2 += childAt.getMeasuredHeight();
                        } else {
                            if (i12 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + i7;
                            } else if (i12 == 16) {
                                iMax = Math.max((i6 - childAt.getMeasuredHeight()) / 2, i7);
                            } else {
                                measuredHeight = i7;
                            }
                            int i13 = i9 + scrollX;
                            childAt.layout(i13, i7, childAt.getMeasuredWidth() + i13, i7 + childAt.getMeasuredHeight());
                            i8++;
                            i7 = measuredHeight;
                            i9 = measuredWidth;
                        }
                        int i14 = i7;
                        i7 = iMax;
                        measuredHeight = i14;
                        int i15 = i9 + scrollX;
                        childAt.layout(i15, i7, childAt.getMeasuredWidth() + i15, i7 + childAt.getMeasuredHeight());
                        i8++;
                        i7 = measuredHeight;
                        i9 = measuredWidth;
                    }
                    int i16 = measuredWidth2;
                    measuredWidth = i9;
                    i9 = i16;
                    if (i12 == 80) {
                        iMax = (i6 - measuredHeight2) - childAt.getMeasuredHeight();
                        measuredHeight2 += childAt.getMeasuredHeight();
                    } else {
                        if (i12 == 48) {
                            measuredHeight = childAt.getMeasuredHeight() + i7;
                        } else if (i12 == 16) {
                            iMax = Math.max((i6 - childAt.getMeasuredHeight()) / 2, i7);
                        } else {
                            measuredHeight = i7;
                        }
                        int i17 = i9 + scrollX;
                        childAt.layout(i17, i7, childAt.getMeasuredWidth() + i17, i7 + childAt.getMeasuredHeight());
                        i8++;
                        i7 = measuredHeight;
                        i9 = measuredWidth;
                    }
                    int i18 = i7;
                    i7 = iMax;
                    measuredHeight = i18;
                    int i19 = i9 + scrollX;
                    childAt.layout(i19, i7, childAt.getMeasuredWidth() + i19, i7 + childAt.getMeasuredHeight());
                    i8++;
                    i7 = measuredHeight;
                    i9 = measuredWidth;
                }
            }
        }
        a(childCount, i9, i7, measuredWidth3, measuredHeight2, i5, i6);
        this.j = i7;
        this.k = i6 - measuredHeight2;
        this.Q = i8;
        if (this.M) {
            z2 = false;
            a(this.f21377a, false, 0, false);
        } else {
            z2 = false;
        }
        this.M = z2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            l();
            return false;
        }
        if (action != 0) {
            if (this.D) {
                return true;
            }
            if (this.O) {
                return false;
            }
        }
        if (action == 0) {
            a(motionEvent);
        } else if (action == 2) {
            int i = this.H;
            if (i != -1 && a(motionEvent, i)) {
                return false;
            }
        } else if (action == 6) {
            e(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        return this.D;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.v <= 0 || this.q == null || this.m.size() <= 0 || this.f21378b == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.v / f3;
        int i = 0;
        a aVar = this.m.get(0);
        float f5 = aVar.e;
        int size = this.m.size();
        int i2 = aVar.f21371b;
        int i3 = this.m.get(size - 1).f21371b;
        while (i2 < i3) {
            while (i2 > aVar.f21371b && i < size) {
                i++;
                aVar = this.m.get(i);
            }
            if (i2 == aVar.f21371b) {
                f = (aVar.e + aVar.d) * f3;
                f2 = aVar.e + aVar.d + f4;
            } else {
                float fA = this.f21378b.a(i2);
                float f6 = fA + f4 + f5;
                f = (f5 + fA) * f3;
                f2 = f6;
            }
            if (this.v + f > scrollX) {
                this.q.setBounds(Math.round(f), this.j, Math.round(this.v + f), this.k);
                this.q.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i2++;
            f5 = f2;
            f4 = f4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ad);
        Scroller scroller = this.l;
        if (scroller != null && !scroller.isFinished()) {
            this.l.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
    }

    public int getCurrentItem() {
        return this.f21377a;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.aa == 2) {
            i2 = (i - 1) - i2;
        }
        return ((i) this.ab.get(i2).getLayoutParams()).g;
    }

    public f getAdapter() {
        return this.f21378b;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        f fVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (fVar = this.f21378b) == null || fVar.a() <= 1)) {
            this.V.finish();
            this.W.finish();
            return;
        }
        if (this.V.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.s * width);
            this.V.setSize(height, width);
            zDraw = this.V.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.W.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.t + 1.0f)) * width2);
            this.W.setSize((height2 - paddingTop) - paddingBottom, width2);
            zDraw |= this.W.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        a aVarA;
        if (4096 == accessibilityEvent.getEventType()) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (aVarA = a(childAt)) != null && aVarA.f21371b == this.f21377a && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    boolean d() {
        int i = this.f21377a;
        if (i <= 0) {
            return false;
        }
        a(i - 1, true);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.i = true;
        if (this.l.isFinished() || !this.l.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.l.getCurrX();
        int currY = this.l.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!f(currX)) {
                this.l.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof i) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f21378b == null) {
            return false;
        }
        int clientViewWidth = getClientViewWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientViewWidth) * this.s));
        }
        return i > 0 && scrollX < ((int) (((float) clientViewWidth) * this.t));
    }

    public boolean c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            viewFindFocus = c(viewFindFocus);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zD = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            zD = a(i, viewFindFocus, false, viewFindNextFocus);
        } else if (i == 17 || i == 1) {
            zD = d();
        } else if (i == 66 || i == 2) {
            zD = c();
        }
        if (zD) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zD;
    }

    boolean c() {
        f fVar = this.f21378b;
        if (fVar == null || this.f21377a >= fVar.a() - 1) {
            return false;
        }
        a(this.f21377a + 1, true);
        return true;
    }

    void b() {
        a(this.f21377a);
    }

    a b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    a b(int i) {
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            a aVar = this.m.get(i2);
            if (aVar.f21371b == i) {
                return aVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        i iVar = (i) layoutParams;
        if (!this.w) {
            super.addView(view, i, layoutParams);
        } else {
            if (iVar != null && iVar.f21384b) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            iVar.e = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        a aVarA;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (aVarA = a(childAt)) != null && aVarA.f21371b == this.f21377a) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        a aVarA;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (aVarA = a(childAt)) != null && aVarA.f21371b == this.f21377a) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    protected boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (a(i2, i3, scrollX, scrollY, childAt) && a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
                return false;
            }
            if (keyEvent.hasModifiers(2)) {
                return c();
            }
            i = 66;
        } else {
            if (keyEvent.hasModifiers(2)) {
                return d();
            }
            i = 17;
        }
        return c(i);
    }

    public void a(d dVar) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(dVar);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        f fVar = this.f21378b;
        if (fVar == null || fVar.a() <= 0) {
            setScrollingCacheEnabledStatus(false);
            return;
        }
        if (!z2 && this.f21377a == i && this.m.size() != 0) {
            setScrollingCacheEnabledStatus(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f21378b.a()) {
            i = this.f21378b.a() - 1;
        }
        int i3 = this.C;
        int i4 = this.f21377a;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.m.size(); i5++) {
                this.m.get(i5).f21372c = true;
            }
        }
        boolean z3 = this.f21377a != i;
        if (!this.M) {
            a(i);
            a(i, z, i2, z3);
        } else {
            this.f21377a = i;
            if (z3) {
                h(i);
            }
            requestLayout();
        }
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    public void a(int i, boolean z) {
        this.x = false;
        a(i, z, false);
    }

    void a(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabledStatus(false);
            return;
        }
        Scroller scroller = this.l;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.i ? this.l.getCurrX() : this.l.getStartX();
            this.l.abortAnimation();
            setScrollingCacheEnabledStatus(false);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            b();
            setScrollState(0);
        } else {
            setScrollingCacheEnabledStatus(true);
            setScrollState(2);
            a(i3, i4, scrollY, i5, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    protected void a(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.Q > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                i iVar = (i) childAt.getLayoutParams();
                if (iVar.f21384b) {
                    int i4 = iVar.f21385c & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        b(i, f, i2);
        if (this.S != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((i) childAt2.getLayoutParams()).f21384b) {
                    this.S.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientViewWidth());
                }
            }
        }
        this.N = true;
    }

    void a(int i) {
        a aVarB;
        a aVarA;
        int i2 = this.f21377a;
        if (i2 != i) {
            aVarB = b(i2);
            this.f21377a = i;
        } else {
            aVarB = null;
        }
        if (this.f21378b == null) {
            k();
            return;
        }
        if (this.x) {
            k();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f21378b.a((ViewGroup) this);
        int i3 = this.C;
        int iMax = Math.max(0, this.f21377a - i3);
        int iA = this.f21378b.a();
        int iMin = Math.min(iA - 1, this.f21377a + i3);
        if (iA != this.g) {
            throw new IllegalStateException("populate exception");
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.m.size()) {
                aVarA = this.m.get(i4);
                if (aVarA.f21371b >= this.f21377a) {
                    if (aVarA.f21371b == this.f21377a) {
                        break;
                    } else {
                        break;
                    }
                }
                i4++;
            }
            aVarA = null;
            break;
        }
        if (aVarA == null && iA > 0) {
            aVarA = a(this.f21377a, i4);
        }
        if (aVarA != null) {
            int i5 = i4 - 1;
            a aVar = i5 >= 0 ? this.m.get(i5) : null;
            int clientViewWidth = getClientViewWidth();
            int iA2 = a(iMax, i4, 0.0f, i5, aVar, clientViewWidth <= 0 ? 0.0f : (2.0f - aVarA.d) + (getPaddingLeft() / clientViewWidth));
            float f = aVarA.d;
            if (f < 2.0f) {
                a(iA, iMin, iA2 + 1, clientViewWidth, f);
            }
            a(aVarA, iA2, aVarB);
            this.f21378b.b(this, this.f21377a, aVarA.f21370a);
        }
        j();
    }

    void a() {
        int iA = this.f21378b.a();
        this.g = iA;
        boolean z = this.m.size() < (this.C * 2) + 1 && this.m.size() < iA;
        int iMax = this.f21377a;
        int i = 0;
        boolean z2 = false;
        while (i < this.m.size()) {
            a aVar = this.m.get(i);
            int iA2 = this.f21378b.a(aVar.f21370a);
            if (iA2 != -1) {
                if (iA2 == -2) {
                    this.m.remove(i);
                    i--;
                    if (!z2) {
                        this.f21378b.a((ViewGroup) this);
                        z2 = true;
                    }
                    this.f21378b.a(this, aVar.f21371b, aVar.f21370a);
                    if (this.f21377a == aVar.f21371b) {
                        iMax = Math.max(0, Math.min(this.f21377a, iA - 1));
                    }
                } else if (aVar.f21371b != iA2) {
                    if (aVar.f21371b == this.f21377a) {
                        iMax = iA2;
                    }
                    aVar.f21371b = iA2;
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f21378b.b(this);
        }
        Collections.sort(this.m, f21376c);
        if (z) {
            d(iMax);
        }
    }

    a a(View view) {
        for (int i = 0; i < this.m.size(); i++) {
            a aVar = this.m.get(i);
            if (this.f21378b.a(view, aVar.f21370a)) {
                return aVar;
            }
        }
        return null;
    }

    a a(int i, int i2) {
        a aVar = new a();
        aVar.f21371b = i;
        aVar.f21370a = this.f21378b.a(this, i);
        aVar.d = this.f21378b.a(i);
        if (i2 < 0 || i2 >= this.m.size()) {
            this.m.add(aVar);
            return aVar;
        }
        this.m.add(i2, aVar);
        return aVar;
    }

    float a(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void setScrollingCacheEnabledStatus(boolean z) {
        if (this.E != z) {
            this.E = z;
        }
    }

    private void n() {
        this.D = false;
        this.O = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private a m() {
        int i;
        int clientViewWidth = getClientViewWidth();
        float f = 0.0f;
        float scrollX = clientViewWidth > 0 ? getScrollX() / clientViewWidth : 0.0f;
        float f2 = clientViewWidth > 0 ? this.v / clientViewWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        a aVar = null;
        float f3 = 0.0f;
        while (i2 < this.m.size()) {
            a aVar2 = this.m.get(i2);
            if (!z && aVar2.f21371b != (i = i3 + 1)) {
                aVar2 = this.n;
                aVar2.e = f + f3 + f2;
                aVar2.f21371b = i;
                aVar2.d = this.f21378b.a(aVar2.f21371b);
                i2--;
            }
            a aVar3 = aVar2;
            f = aVar3.e;
            float f4 = aVar3.d;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 + f + f2 || i2 == this.m.size() - 1) {
                return aVar3;
            }
            i3 = aVar3.f21371b;
            i2++;
            z = false;
            aVar = aVar3;
            f3 = aVar3.d;
        }
        return aVar;
    }

    private boolean l() {
        this.H = -1;
        n();
        this.V.onRelease();
        this.W.onRelease();
        return this.V.isFinished() || this.W.isFinished();
    }

    private void k() {
        if (this.aa != 0) {
            ArrayList<View> arrayList = this.ab;
            if (arrayList == null) {
                this.ab = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ab.add(getChildAt(i));
            }
            Collections.sort(this.ab, ac);
        }
    }

    private void j() {
        a aVarA;
        this.f21378b.b(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            i iVar = (i) childAt.getLayoutParams();
            iVar.g = i;
            if (!iVar.f21384b && iVar.d == 0.0f && (aVarA = a(childAt)) != null) {
                iVar.d = aVarA.d;
                iVar.f = aVarA.f21371b;
            }
        }
        k();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            a aVarB = viewFindFocus != null ? b(viewFindFocus) : null;
            if (aVarB == null || aVarB.f21371b != this.f21377a) {
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt2 = getChildAt(i2);
                    a aVarA2 = a(childAt2);
                    if (aVarA2 != null && aVarA2.f21371b == this.f21377a && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    private void i() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((i) getChildAt(i).getLayoutParams()).f21384b) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void h(int i) {
        List<d> list = this.R;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.R.get(i2);
                if (dVar != null) {
                    dVar.a(i);
                }
            }
        }
    }

    private void h() {
        e();
        g();
        f();
    }

    private int getClientViewWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void g(int i) {
        List<d> list = this.R;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.R.get(i2);
                if (dVar != null) {
                    dVar.b(i);
                }
            }
        }
    }

    private void g() {
        Context context = getContext();
        this.l = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.G = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.V = new EdgeEffect(context);
        this.W = new EdgeEffect(context);
        this.L = (int) (25.0f * f);
        this.U = (int) (2.0f * f);
        this.P = (int) (f * 16.0f);
        setAccessibilityDelegate(new b(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private boolean f(int i) {
        if (this.m.size() == 0) {
            if (this.M) {
                return false;
            }
            this.N = false;
            a(0, 0.0f, 0);
            if (this.N) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        a aVarM = m();
        if (aVarM == null) {
            return false;
        }
        int clientViewWidth = getClientViewWidth();
        int i2 = this.v;
        float f = clientViewWidth;
        int i3 = aVarM.f21371b;
        float f2 = ((i / f) - aVarM.e) / (aVarM.d + (i2 / f));
        this.N = false;
        a(i3, f2, (int) ((clientViewWidth + i2) * f2));
        if (this.N) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void f() {
        setOnApplyWindowInsetsListener(new c(this));
    }

    private void e(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i = actionIndex == 0 ? 1 : 0;
            this.y = motionEvent.getX(i);
            this.H = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void e(int i) {
        int iMakeMeasureSpec;
        this.w = true;
        b();
        this.w = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i iVar = (i) childAt.getLayoutParams();
                if (iVar == null) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                } else if (!iVar.f21384b) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (i * iVar.d), 1073741824);
                }
                childAt.measure(iMakeMeasureSpec, this.f);
            }
        }
    }

    private void e() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
    }

    private void d(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void d(MotionEvent motionEvent) {
        this.l.abortAnimation();
        this.x = false;
        b();
        float x = motionEvent.getX();
        this.A = x;
        this.y = x;
        float y = motionEvent.getY();
        this.B = y;
        this.z = y;
        this.H = motionEvent.getPointerId(0);
    }

    private void d(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            i iVar = (i) getChildAt(i2).getLayoutParams();
            if (!iVar.f21384b) {
                iVar.d = 0.0f;
            }
        }
        a(i, false, true);
        requestLayout();
    }

    private boolean c(boolean z) {
        if (!this.D) {
            return z;
        }
        a(this.f21377a, true, 0, false);
        return l();
    }

    private void c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        this.y = motionEvent.getX(actionIndex);
        this.H = motionEvent.getPointerId(actionIndex);
    }

    private View c(View view) {
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (parent == this) {
                return view;
            }
        }
        view.getClass().getSimpleName();
        for (ViewParent parent2 = view.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
            parent2.getClass().getSimpleName();
        }
        return null;
    }

    private boolean b(MotionEvent motionEvent, boolean z) {
        if (!this.D) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
            if (iFindPointerIndex == -1) {
                return l();
            }
            float x = motionEvent.getX(iFindPointerIndex);
            float fAbs = Math.abs(x - this.y);
            float y = motionEvent.getY(iFindPointerIndex);
            float fAbs2 = Math.abs(y - this.z);
            if (fAbs > this.G && fAbs > fAbs2) {
                this.D = true;
                d(true);
                float f = this.A;
                this.y = x - f > 0.0f ? f + this.G : f - this.G;
                this.z = y;
                setScrollState(1);
                setScrollingCacheEnabledStatus(true);
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return this.D ? b(motionEvent.getX(motionEvent.findPointerIndex(this.H))) | z : z;
    }

    private boolean b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.y;
        this.y = f;
        float scrollX = getScrollX() + (f2 - f);
        float clientViewWidth = getClientViewWidth();
        float f3 = this.s * clientViewWidth;
        float f4 = this.t * clientViewWidth;
        boolean z3 = false;
        a aVar = this.m.get(0);
        ArrayList<a> arrayList = this.m;
        a aVar2 = arrayList.get(arrayList.size() - 1);
        if (aVar.f21371b != 0) {
            f3 = aVar.e * clientViewWidth;
            z = false;
        } else {
            z = true;
        }
        if (aVar2.f21371b != this.f21378b.a() - 1) {
            f4 = aVar2.e * clientViewWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.V.onPull(Math.abs(f3 - scrollX) / clientViewWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.W.onPull(Math.abs(scrollX - f4) / clientViewWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.y += scrollX - i;
        scrollTo(i, getScrollY());
        f(i);
        return z3;
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.T : 0, null);
        }
    }

    private void b(MotionEvent motionEvent) {
        e(motionEvent);
        this.y = motionEvent.getX(motionEvent.findPointerIndex(this.H));
    }

    private void b(int i, float f, int i2) {
        List<d> list = this.R;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = this.R.get(i3);
                if (dVar != null) {
                    dVar.a(i, f, i2);
                }
            }
        }
    }

    private boolean a(MotionEvent motionEvent, boolean z) {
        if (!this.D) {
            return z;
        }
        VelocityTracker velocityTracker = this.I;
        velocityTracker.computeCurrentVelocity(1000, this.K);
        int xVelocity = (int) velocityTracker.getXVelocity(this.H);
        this.x = true;
        int clientViewWidth = getClientViewWidth();
        int scrollX = getScrollX();
        a aVarM = m();
        if (aVarM == null) {
            return l();
        }
        float f = clientViewWidth;
        a(a(aVarM.f21371b, ((scrollX / f) - aVarM.e) / (aVarM.d + (this.v / f)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.A)), true, true, xVelocity);
        return l();
    }

    private boolean a(MotionEvent motionEvent, int i) {
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(iFindPointerIndex);
        float f = x - this.y;
        float fAbs = Math.abs(f);
        float y = motionEvent.getY(iFindPointerIndex);
        float fAbs2 = Math.abs(y - this.B);
        if (f != 0.0f && !a(this.y, f) && a((View) this, false, (int) f, (int) x, (int) y)) {
            this.y = x;
            this.z = y;
            this.O = true;
            return true;
        }
        float f2 = this.G;
        if (fAbs > f2 && fAbs * 0.5f > fAbs2) {
            this.D = true;
            d(true);
            setScrollState(1);
            float f3 = this.A;
            float f4 = this.G;
            this.y = f > 0.0f ? f3 + f4 : f3 - f4;
            this.z = y;
            setScrollingCacheEnabledStatus(true);
        } else if (fAbs2 > f2) {
            this.O = true;
        }
        if (!this.D || !b(x)) {
            return false;
        }
        postInvalidateOnAnimation();
        return false;
    }

    private boolean a(int i, View view, boolean z, View view2) {
        if (i == 17) {
            return (view == null || a(this.p, view2).left < a(this.p, view).left) ? view2.requestFocus() : d();
        }
        if (i == 66) {
            return (view == null || a(this.p, view2).left > a(this.p, view).left) ? view2.requestFocus() : c();
        }
        return z;
    }

    private boolean a(int i, int i2, int i3, int i4, View view) {
        int i5;
        int i6 = i + i3;
        return i6 >= view.getLeft() && i6 < view.getRight() && (i5 = i2 + i4) >= view.getTop() && i5 < view.getBottom();
    }

    private boolean a(float f, float f2) {
        if (f >= this.F || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.F)) && f2 < 0.0f;
        }
        return true;
    }

    private void a(boolean z) {
        boolean z2 = this.ae == 2;
        if (z2) {
            setScrollingCacheEnabledStatus(false);
            if (!this.l.isFinished()) {
                this.l.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.l.getCurrX();
                int currY = this.l.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        f(currX);
                    }
                }
            }
        }
        this.x = false;
        for (int i = 0; i < this.m.size(); i++) {
            a aVar = this.m.get(i);
            if (aVar.f21372c) {
                aVar.f21372c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.ad);
            } else {
                this.ad.run();
            }
        }
    }

    private void a(a aVar, int i, a aVar2) {
        a aVar3;
        a aVar4;
        int iA = this.f21378b.a();
        int clientViewWidth = getClientViewWidth();
        float f = clientViewWidth > 0 ? this.v / clientViewWidth : 0.0f;
        if (aVar2 != null) {
            int i2 = aVar2.f21371b;
            if (i2 < aVar.f21371b) {
                float fA = aVar2.e + aVar2.d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= aVar.f21371b && i4 < this.m.size()) {
                    while (true) {
                        aVar4 = this.m.get(i4);
                        if (i3 <= aVar4.f21371b || i4 >= this.m.size() - 1) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    while (i3 < aVar4.f21371b) {
                        fA += this.f21378b.a(i3) + f;
                        i3++;
                    }
                    aVar4.e = fA;
                    fA += aVar4.d + f;
                    i3++;
                }
            } else if (i2 > aVar.f21371b) {
                int size = this.m.size() - 1;
                float fA2 = aVar2.e;
                while (true) {
                    i2--;
                    if (i2 < aVar.f21371b || size < 0) {
                        break;
                    }
                    while (true) {
                        aVar3 = this.m.get(size);
                        if (i2 >= aVar3.f21371b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i2 > aVar3.f21371b) {
                        fA2 -= this.f21378b.a(i2) + f;
                        i2--;
                    }
                    fA2 -= aVar3.d + f;
                    aVar3.e = fA2;
                }
            }
        }
        a(aVar, i, iA, f);
    }

    private void a(a aVar, int i, int i2, float f) {
        int size = this.m.size();
        float fA = aVar.e;
        int i3 = aVar.f21371b - 1;
        this.s = aVar.f21371b == 0 ? aVar.e : -3.4028235E38f;
        int i4 = i2 - 1;
        this.t = aVar.f21371b == i4 ? (aVar.e + aVar.d) - 1.0f : Float.MAX_VALUE;
        int i5 = i - 1;
        while (i5 >= 0) {
            a aVar2 = this.m.get(i5);
            while (i3 > aVar2.f21371b) {
                fA -= this.f21378b.a(i3) + f;
                i3--;
            }
            fA -= aVar2.d + f;
            aVar2.e = fA;
            if (aVar2.f21371b == 0) {
                this.s = fA;
            }
            i5--;
            i3--;
        }
        float fA2 = aVar.e + aVar.d + f;
        int i6 = aVar.f21371b + 1;
        int i7 = i + 1;
        while (i7 < size) {
            a aVar3 = this.m.get(i7);
            while (i6 < aVar3.f21371b) {
                fA2 += this.f21378b.a(i6) + f;
                i6++;
            }
            if (aVar3.f21371b == i4) {
                this.t = (aVar3.d + fA2) - 1.0f;
            }
            aVar3.e = fA2;
            fA2 += aVar3.d + f;
            i7++;
            i6++;
        }
    }

    private void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        this.A = x;
        this.y = x;
        float y = motionEvent.getY();
        this.B = y;
        this.z = y;
        this.H = motionEvent.getPointerId(0);
        this.O = false;
        this.i = true;
        this.l.computeScrollOffset();
        if (this.ae != 2 || Math.abs(this.l.getFinalX() - this.l.getCurrX()) <= this.U) {
            a(false);
            this.D = false;
            return;
        }
        this.l.abortAnimation();
        this.x = false;
        b();
        this.D = true;
        d(true);
        setScrollState(1);
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        a aVarB = b(i);
        int clientViewWidth = aVarB != null ? (int) (getClientViewWidth() * Math.max(this.s, Math.min(aVarB.e, this.t))) : 0;
        if (z) {
            a(clientViewWidth, 0, i2);
            if (z2) {
                h(i);
                return;
            }
            return;
        }
        if (z2) {
            h(i);
        }
        a(false);
        scrollTo(clientViewWidth, 0);
        f(clientViewWidth);
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        a aVarA;
        for (int i8 = 0; i8 < i; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                i iVar = (i) childAt.getLayoutParams();
                if (!iVar.f21384b && (aVarA = a(childAt)) != null) {
                    float f = (i6 - i2) - i4;
                    int i9 = ((int) (aVarA.e * f)) + i2;
                    if (iVar.e) {
                        iVar.e = false;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * iVar.d), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - i3) - i5, 1073741824));
                    }
                    childAt.layout(i9, i3, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + i3);
                }
            }
        }
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        int iAbs;
        int clientViewWidth = getClientViewWidth();
        int i6 = clientViewWidth / 2;
        float f = clientViewWidth;
        float f2 = i6;
        float fA = a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / f));
        int iAbs2 = Math.abs(i);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs((f2 + (fA * f2)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((f * this.f21378b.a(this.f21377a)) + this.v)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.i = false;
        this.l.startScroll(i2, i3, i4, i5, iMin);
        postInvalidateOnAnimation();
    }

    private void a(int i, int i2, int i3, int i4, float f) {
        a aVar = i3 < this.m.size() ? this.m.get(i3) : null;
        float paddingRight = i4 <= 0 ? 0.0f : 2.0f + (getPaddingRight() / i4);
        int i5 = this.f21377a;
        while (true) {
            i5++;
            if (i5 >= i) {
                return;
            }
            if (f < paddingRight || i5 <= i2) {
                if (aVar == null || i5 != aVar.f21371b) {
                    a aVarA = a(i5, i3);
                    i3++;
                    f += aVarA.d;
                    aVar = i3 < this.m.size() ? this.m.get(i3) : null;
                } else {
                    f += aVar.d;
                    i3++;
                    if (i3 < this.m.size()) {
                    }
                }
            } else {
                if (aVar == null) {
                    return;
                }
                if (i5 == aVar.f21371b && !aVar.f21372c) {
                    this.m.remove(i3);
                    this.f21378b.a(this, i5, aVar.f21370a);
                    if (i3 < this.m.size()) {
                    }
                }
            }
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.m.isEmpty()) {
            a aVarB = b(this.f21377a);
            int iMin = (int) ((aVarB != null ? Math.min(aVarB.e, this.t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                a(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        if (!this.l.isFinished()) {
            this.l.setFinalX(getCurrentItem() * getClientViewWidth());
            return;
        }
        int paddingLeft = getPaddingLeft();
        scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - paddingLeft) - getPaddingRight()) + i3)), getScrollY());
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        rect.left = view.getLeft();
        rect.right = view.getRight();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046 A[PHI: r5 r6 r7
      0x0046: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v6 int) binds: [B:23:0x0044, B:20:0x0036, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r6v4 float) = (r6v2 float), (r6v3 float), (r6v1 float) binds: [B:23:0x0044, B:20:0x0036, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v6 int) binds: [B:23:0x0044, B:20:0x0036, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    private int a(int i, int i2, float f, int i3, a aVar, float f2) {
        for (int i4 = this.f21377a - 1; i4 >= 0; i4--) {
            a aVar2 = null;
            if (f < f2 || i4 >= i) {
                if (aVar == null || i4 != aVar.f21371b) {
                    f += a(i4, i3 + 1).d;
                    i2++;
                    if (i3 >= 0) {
                        aVar2 = this.m.get(i3);
                    }
                } else {
                    f += aVar.d;
                    i3--;
                    if (i3 >= 0) {
                        aVar2 = this.m.get(i3);
                    }
                }
                aVar = aVar2;
            } else {
                if (aVar == null) {
                    break;
                }
                if (i4 == aVar.f21371b && !aVar.f21372c) {
                    this.m.remove(i3);
                    this.f21378b.a(this, i4, aVar.f21370a);
                    i3--;
                    i2--;
                    if (i3 >= 0) {
                        aVar2 = this.m.get(i3);
                    }
                    aVar = aVar2;
                }
            }
        }
        return i2;
    }

    private int a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.L || Math.abs(i2) <= this.J) {
            i += (int) (f + (i >= this.f21377a ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.m.size() <= 0) {
            return i;
        }
        a aVar = this.m.get(0);
        ArrayList<a> arrayList = this.m;
        return Math.max(aVar.f21371b, Math.min(i, arrayList.get(arrayList.size() - 1).f21371b));
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        this.m = new ArrayList<>();
        this.n = new a();
        this.o = null;
        this.p = new Rect();
        this.r = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.C = 1;
        this.H = -1;
        this.M = true;
        this.ad = new Runnable() { // from class: com.huawei.openalliance.ad.views.viewpager.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.setScrollState(0);
                e.this.b();
            }
        };
        this.ae = 0;
        h();
    }

    public e(Context context) {
        super(context);
        this.h = -1;
        this.m = new ArrayList<>();
        this.n = new a();
        this.o = null;
        this.p = new Rect();
        this.r = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.C = 1;
        this.H = -1;
        this.M = true;
        this.ad = new Runnable() { // from class: com.huawei.openalliance.ad.views.viewpager.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.setScrollState(0);
                e.this.b();
            }
        };
        this.ae = 0;
        h();
    }
}
