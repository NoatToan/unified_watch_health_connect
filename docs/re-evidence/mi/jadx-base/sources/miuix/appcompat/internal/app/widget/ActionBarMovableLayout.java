package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.g5j;
import defpackage.mfh;
import defpackage.q56;
import defpackage.qc1;
import defpackage.wc0;
import defpackage.zhi;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarMovableLayout extends ActionBarOverlayLayout {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public View k0;
    public mfh l0;
    public int m0;
    public boolean n0;
    public float o0;
    public float p0;
    public int q0;
    public int r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public ActionBarMovableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r0 = -1;
        this.v0 = -1;
        this.x0 = -1;
        this.z0 = 8;
        this.B0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.E, zhi.c, 0);
        if (q56.a()) {
            this.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.F, 0);
        }
        this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.G, -1);
        this.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.H, -1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.s0 = viewConfiguration.getScaledTouchSlop();
        this.l0 = new mfh(context);
        this.t0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.u0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setOverScrollMode(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void e0() {
        VelocityTracker velocityTracker = this.D0;
        if (velocityTracker == null) {
            this.D0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void f0() {
        if (this.D0 == null) {
            this.D0 = VelocityTracker.obtain();
        }
    }

    private void l0(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.m0) {
            int i = action == 0 ? 1 : 0;
            this.o0 = (int) motionEvent.getY(i);
            this.m0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.D0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void m0() {
        VelocityTracker velocityTracker = this.D0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D0 = null;
        }
    }

    public void Z(float f) {
        float fH0 = h0(f);
        this.c.setTranslationY(fH0);
        b0();
        View view = this.k0;
        if (view != null) {
            view.setTranslationY(fH0);
        }
    }

    public int a0() {
        VelocityTracker velocityTracker = this.D0;
        velocityTracker.computeCurrentVelocity(1000, this.u0);
        return (int) velocityTracker.getYVelocity(this.m0);
    }

    public void b0() {
        this.k0 = this.f26405b.getTabContainer();
    }

    public void c0(int i) {
        int overScrollDistance = getOverScrollDistance();
        this.l0.d(0, this.q0, 0, i, 0, 0, 0, getScrollRange(), 0, overScrollDistance);
        this.C0 = true;
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.l0.b()) {
            if (this.C0) {
                o0();
                this.C0 = false;
                return;
            }
            return;
        }
        int i = this.q0;
        int iJ = this.l0.j();
        if (i != iJ) {
            overScrollBy(0, iJ - i, 0, this.q0, 0, getScrollRange(), 0, getOverScrollDistance(), true);
        }
        qc1.a(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return getScrollRange();
    }

    public final boolean d0(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int y = (int) view.getY();
        int x = (int) view.getX();
        int y2 = (int) (view.getY() + view.getHeight());
        int x2 = (int) (view.getX() + view.getWidth());
        if (view == this.k0) {
            int top = this.f26405b.getTop();
            y += top;
            y2 += top;
        }
        return i2 >= y && i2 < y2 && i >= x && i < x2;
    }

    public final boolean g0() {
        int visibility;
        b0();
        View view = this.k0;
        if (view == null || (visibility = view.getVisibility()) == this.z0) {
            return false;
        }
        this.z0 = visibility;
        return true;
    }

    public int getOverScrollDistance() {
        if (q56.a()) {
            return this.w0;
        }
        return 0;
    }

    public int getScrollRange() {
        return this.v0;
    }

    public int getScrollStart() {
        return this.y0;
    }

    public float h0(float f) {
        float f2 = (((-this.w0) + f) - this.v0) - this.y0;
        b0();
        View view = this.k0;
        return (view == null || view.getVisibility() != 0) ? f2 : f2 - this.k0.getHeight();
    }

    public void i0(float f) {
        Z(f);
    }

    public void j0() {
    }

    public void k0() {
        this.r0 = -1;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view != this.c) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, ((((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.bottomMargin) + this.f26404a.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) this.f26404a.getLayoutParams()).topMargin) - getScrollRange()) - getOverScrollDistance()) - this.y0, marginLayoutParams.height));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    public boolean n0(MotionEvent motionEvent) {
        int iFindPointerIndex;
        boolean z;
        int i = this.m0;
        if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
            return false;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        int i2 = (int) (y - this.o0);
        int iAbs = Math.abs(i2);
        int iAbs2 = (int) Math.abs(x - this.p0);
        int i3 = (int) x;
        int i4 = (int) y;
        if (!(d0(this.c, i3, i4) || d0(this.k0, i3, i4)) || iAbs <= this.s0 || iAbs <= iAbs2) {
            z = false;
        } else {
            if (this.q0 == 0) {
                if (i2 < 0) {
                    z = false;
                }
            } else if (i2 > 0) {
                getOverScrollDistance();
            }
            z = true;
        }
        if (z) {
            this.o0 = y;
            this.p0 = x;
            this.r0 = i2 > 0 ? 1 : 0;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return z;
    }

    public void o0() {
        if (this.B0) {
            int scrollRange = getScrollRange();
            int i = this.q0;
            this.l0.w(0, i, 0, i > scrollRange / 2 ? scrollRange - i : -i, 800);
            qc1.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View contentMask = getContentMask();
        if (contentMask != null && contentMask.getVisibility() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.n0) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            this.o0 = motionEvent.getY();
            this.p0 = motionEvent.getX();
            this.m0 = motionEvent.getPointerId(0);
            e0();
            this.D0.addMovement(motionEvent);
            this.l0.e(true);
        } else if (i == 1) {
            this.n0 = false;
            this.m0 = -1;
            m0();
            k0();
        } else if (i != 2) {
            if (i == 3) {
                this.n0 = false;
                this.m0 = -1;
                m0();
                k0();
            } else if (i == 6) {
                l0(motionEvent);
            }
        } else if (n0(motionEvent)) {
            this.n0 = true;
            f0();
            this.D0.addMovement(motionEvent);
            j0();
        }
        return this.n0;
    }

    @Override // miuix.appcompat.internal.app.widget.ActionBarOverlayLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = !this.A0 || g0();
        if (!this.A0) {
            if (this.x0 < 0) {
                this.x0 = this.v0;
            }
            this.q0 = this.x0;
            this.A0 = true;
        }
        if (z2) {
            Z(this.q0);
        }
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        i0(i2);
        this.q0 = i2;
        if (i2 == 0 && z2) {
            Math.abs(a0());
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    @Override // miuix.appcompat.internal.app.widget.ActionBarOverlayLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iA0;
        f0();
        this.D0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.o0 = motionEvent.getY();
            this.m0 = motionEvent.getPointerId(0);
        } else if (action == 1) {
            if (this.n0) {
                this.n0 = false;
                this.m0 = -1;
                iA0 = a0();
                if (Math.abs(iA0) > this.t0) {
                    c0(iA0);
                } else {
                    if (this.l0.u(0, this.q0, 0, 0, 0, getScrollRange())) {
                        invalidate();
                    } else {
                        o0();
                    }
                }
            }
        } else if (action != 2) {
            if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.o0 = (int) motionEvent.getY(actionIndex);
                    this.m0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l0(motionEvent);
                    this.o0 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.m0));
                }
            } else if (this.n0) {
                this.n0 = false;
                this.m0 = -1;
                iA0 = a0();
                if (Math.abs(iA0) > this.t0) {
                    c0(iA0);
                } else {
                    if (this.l0.u(0, this.q0, 0, 0, 0, getScrollRange())) {
                        invalidate();
                    } else {
                        o0();
                    }
                }
            }
        } else if (this.n0) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.m0);
            if (iFindPointerIndex == -1) {
                return false;
            }
            float y = motionEvent.getY(iFindPointerIndex);
            boolean zOverScrollBy = overScrollBy(0, (int) (y - this.o0), 0, this.q0, 0, getScrollRange(), 0, getOverScrollDistance(), true);
            this.o0 = y;
            if (zOverScrollBy) {
                if (this.q0 == 0) {
                    this.n0 = false;
                    this.m0 = -1;
                    motionEvent.setAction(0);
                    dispatchTouchEvent(motionEvent);
                }
                this.D0.clear();
            }
        } else if (n0(motionEvent)) {
            this.n0 = true;
            f0();
            this.D0.addMovement(motionEvent);
            j0();
        }
        return true;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int overScrollMode = getOverScrollMode();
        boolean z2 = true;
        int i9 = i4 + i2;
        if (!(overScrollMode == 0 || (overScrollMode == 1 && (computeVerticalScrollRange() > computeVerticalScrollExtent())))) {
            i8 = 0;
        }
        int i10 = i8 + i6;
        if (i9 > i10) {
            i9 = i10;
        } else if (i9 < 0) {
            i9 = 0;
        } else {
            z2 = false;
        }
        onOverScrolled(0, i9, false, z2);
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public void setInitialMotionY(int i) {
        this.x0 = i;
    }

    public void setMotionY(int i) {
        this.q0 = i;
        i0(i);
    }

    public void setOnScrollListener(wc0.b bVar) {
    }

    public void setOverScrollDistance(int i) {
        if (q56.a()) {
            this.w0 = i;
        }
    }

    public void setScrollRange(int i) {
        this.v0 = i;
    }

    public void setScrollStart(int i) {
        this.y0 = i;
    }

    public void setSpringBackEnabled(boolean z) {
        this.B0 = z;
    }
}
