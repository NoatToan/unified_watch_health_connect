package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f6629x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6631b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f6633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f6634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f6635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f6636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f6637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f6638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f6639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f6641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f6642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f6647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0092c f6648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f6649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f6651v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6632c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f6652w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f14) {
            float f15 = f14 - 1.0f;
            return (f15 * f15 * f15 * f15 * f15) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.r(0);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0092c {
        public int clampViewPositionHorizontal(View view2, int i14, int i15) {
            return 0;
        }

        public int clampViewPositionVertical(View view2, int i14, int i15) {
            return 0;
        }

        public int getOrderedChildIndex(int i14) {
            return i14;
        }

        public int getViewHorizontalDragRange(View view2) {
            return 0;
        }

        public int getViewVerticalDragRange(View view2) {
            return 0;
        }

        public void onEdgeDragStarted(int i14, int i15) {
        }

        public boolean onEdgeLock(int i14) {
            return false;
        }

        public void onEdgeTouched(int i14, int i15) {
        }

        public void onViewCaptured(View view2, int i14) {
        }

        public void onViewDragStateChanged(int i14) {
        }

        public void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
        }

        public void onViewReleased(View view2, float f14, float f15) {
        }

        public abstract boolean tryCaptureView(View view2, int i14);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0092c abstractC0092c) {
        if (viewGroup == null) {
            h.s("Parent view may not be null");
            throw null;
        }
        if (abstractC0092c == null) {
            h.s("Callback may not be null");
            throw null;
        }
        this.f6651v = viewGroup;
        this.f6648s = abstractC0092c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i14 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6645p = i14;
        this.f6644o = i14;
        this.f6631b = viewConfiguration.getScaledTouchSlop();
        this.f6642m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6643n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6647r = new OverScroller(context, f6629x);
    }

    public static c i(ViewGroup viewGroup, float f14, AbstractC0092c abstractC0092c) {
        c cVarJ = j(viewGroup, abstractC0092c);
        cVarJ.f6631b = (int) ((1.0f / f14) * cVarJ.f6631b);
        return cVarJ;
    }

    public static c j(ViewGroup viewGroup, AbstractC0092c abstractC0092c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0092c);
    }

    public final void a() {
        b();
        if (this.f6630a == 2) {
            OverScroller overScroller = this.f6647r;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f6648s.onViewPositionChanged(this.f6649t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        r(0);
    }

    public final void b() {
        this.f6632c = -1;
        float[] fArr = this.f6633d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6634e, 0.0f);
            Arrays.fill(this.f6635f, 0.0f);
            Arrays.fill(this.f6636g, 0.0f);
            Arrays.fill(this.f6637h, 0);
            Arrays.fill(this.f6638i, 0);
            Arrays.fill(this.f6639j, 0);
            this.f6640k = 0;
        }
        VelocityTracker velocityTracker = this.f6641l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6641l = null;
        }
    }

    public final void c(int i14, View view2) {
        ViewParent parent = view2.getParent();
        ViewGroup viewGroup = this.f6651v;
        if (parent != viewGroup) {
            e.l("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup, ")");
            return;
        }
        this.f6649t = view2;
        this.f6632c = i14;
        this.f6648s.onViewCaptured(view2, i14);
        r(1);
    }

    public final boolean d(float f14, float f15, int i14, int i15) {
        float fAbs = Math.abs(f14);
        float fAbs2 = Math.abs(f15);
        if ((this.f6637h[i14] & i15) == i15 && (this.f6646q & i15) != 0 && (this.f6639j[i14] & i15) != i15 && (this.f6638i[i14] & i15) != i15) {
            float f16 = this.f6631b;
            if (fAbs > f16 || fAbs2 > f16) {
                if (fAbs < fAbs2 * 0.5f && this.f6648s.onEdgeLock(i15)) {
                    int[] iArr = this.f6639j;
                    iArr[i14] = iArr[i14] | i15;
                    return false;
                }
                if ((this.f6638i[i14] & i15) == 0 && fAbs > this.f6631b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e(float f14, float f15, View view2) {
        if (view2 == null) {
            return false;
        }
        AbstractC0092c abstractC0092c = this.f6648s;
        boolean z14 = abstractC0092c.getViewHorizontalDragRange(view2) > 0;
        boolean z15 = abstractC0092c.getViewVerticalDragRange(view2) > 0;
        if (z14 && z15) {
            float f16 = (f15 * f15) + (f14 * f14);
            int i14 = this.f6631b;
            return f16 > ((float) (i14 * i14));
        }
        if (z14) {
            return Math.abs(f14) > ((float) this.f6631b);
        }
        return z15 && Math.abs(f15) > ((float) this.f6631b);
    }

    public final void f(int i14) {
        float[] fArr = this.f6633d;
        if (fArr != null) {
            int i15 = this.f6640k;
            int i16 = 1 << i14;
            if ((i15 & i16) != 0) {
                fArr[i14] = 0.0f;
                this.f6634e[i14] = 0.0f;
                this.f6635f[i14] = 0.0f;
                this.f6636g[i14] = 0.0f;
                this.f6637h[i14] = 0;
                this.f6638i[i14] = 0;
                this.f6639j[i14] = 0;
                this.f6640k = (~i16) & i15;
            }
        }
    }

    public final int g(int i14, int i15, int i16) {
        if (i14 == 0) {
            return 0;
        }
        int width = this.f6651v.getWidth();
        float f14 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i14) / width) - 0.5f) * 0.47123894f)) * f14) + f14;
        int iAbs = Math.abs(i15);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i14) / i16) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f6630a == 2) {
            OverScroller overScroller = this.f6647r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f6649t.getLeft();
            int top = currY - this.f6649t.getTop();
            if (left != 0) {
                View view2 = this.f6649t;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view3 = this.f6649t;
                WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                view3.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f6648s.onViewPositionChanged(this.f6649t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f6651v.post(this.f6652w);
            }
        }
        return this.f6630a == 2;
    }

    public final View k(int i14, int i15) {
        ViewGroup viewGroup = this.f6651v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f6648s.getOrderedChildIndex(childCount));
            if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && i15 >= childAt.getTop() && i15 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i14, int i15, int i16, int i17) {
        float f14;
        float f15;
        float f16;
        float f17;
        int left = this.f6649t.getLeft();
        int top = this.f6649t.getTop();
        int i18 = i14 - left;
        int i19 = i15 - top;
        OverScroller overScroller = this.f6647r;
        if (i18 == 0 && i19 == 0) {
            overScroller.abortAnimation();
            r(0);
            return false;
        }
        View view2 = this.f6649t;
        int i24 = (int) this.f6643n;
        int i25 = (int) this.f6642m;
        int iAbs = Math.abs(i16);
        if (iAbs < i24) {
            i16 = 0;
        } else if (iAbs > i25) {
            i16 = i16 > 0 ? i25 : -i25;
        }
        int i26 = (int) this.f6643n;
        int iAbs2 = Math.abs(i17);
        if (iAbs2 < i26) {
            i17 = 0;
        } else if (iAbs2 > i25) {
            i17 = i17 > 0 ? i25 : -i25;
        }
        int iAbs3 = Math.abs(i18);
        int iAbs4 = Math.abs(i19);
        int iAbs5 = Math.abs(i16);
        int iAbs6 = Math.abs(i17);
        int i27 = iAbs5 + iAbs6;
        int i28 = iAbs3 + iAbs4;
        if (i16 != 0) {
            f14 = iAbs5;
            f15 = i27;
        } else {
            f14 = iAbs3;
            f15 = i28;
        }
        float f18 = f14 / f15;
        if (i17 != 0) {
            f16 = iAbs6;
            f17 = i27;
        } else {
            f16 = iAbs4;
            f17 = i28;
        }
        float f19 = f16 / f17;
        AbstractC0092c abstractC0092c = this.f6648s;
        overScroller.startScroll(left, top, i18, i19, (int) ((g(i19, i17, abstractC0092c.getViewVerticalDragRange(view2)) * f19) + (g(i18, i16, abstractC0092c.getViewHorizontalDragRange(view2)) * f18)));
        r(2);
        return true;
    }

    public final void m(MotionEvent motionEvent) {
        int i14;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f6641l == null) {
            this.f6641l = VelocityTracker.obtain();
        }
        this.f6641l.addMovement(motionEvent);
        AbstractC0092c abstractC0092c = this.f6648s;
        int i15 = 0;
        if (actionMasked == 0) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewK = k((int) x14, (int) y14);
            p(x14, y14, pointerId);
            v(pointerId, viewK);
            int i16 = this.f6637h[pointerId] & this.f6646q;
            if (i16 != 0) {
                abstractC0092c.onEdgeTouched(i16, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f6630a == 1) {
                n();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f6630a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i17 = 0; i17 < pointerCount; i17++) {
                    int pointerId2 = motionEvent.getPointerId(i17);
                    if ((this.f6640k & (1 << pointerId2)) != 0) {
                        float x15 = motionEvent.getX(i17);
                        float y15 = motionEvent.getY(i17);
                        float f14 = x15 - this.f6633d[pointerId2];
                        float f15 = y15 - this.f6634e[pointerId2];
                        o(f14, f15, pointerId2);
                        if (this.f6630a == 1) {
                            break;
                        }
                        View viewK2 = k((int) x15, (int) y15);
                        if (e(f14, f15, viewK2) && v(pointerId2, viewK2)) {
                            break;
                        }
                    }
                }
                q(motionEvent);
                return;
            }
            int i18 = this.f6632c;
            if (((this.f6640k & (1 << i18)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i18);
            float x16 = motionEvent.getX(iFindPointerIndex);
            float y16 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f6635f;
            int i19 = this.f6632c;
            int i24 = (int) (x16 - fArr[i19]);
            int i25 = (int) (y16 - this.f6636g[i19]);
            int left = this.f6649t.getLeft() + i24;
            int top = this.f6649t.getTop() + i25;
            int left2 = this.f6649t.getLeft();
            int top2 = this.f6649t.getTop();
            if (i24 != 0) {
                left = abstractC0092c.clampViewPositionHorizontal(this.f6649t, left, i24);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                this.f6649t.offsetLeftAndRight(left - left2);
            }
            int i26 = left;
            if (i25 != 0) {
                top = abstractC0092c.clampViewPositionVertical(this.f6649t, top, i25);
                WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                this.f6649t.offsetTopAndBottom(top - top2);
            }
            int i27 = top;
            if (i24 != 0 || i25 != 0) {
                this.f6648s.onViewPositionChanged(this.f6649t, i26, i27, i26 - left2, i27 - top2);
            }
            q(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f6630a == 1) {
                this.f6650u = true;
                abstractC0092c.onViewReleased(this.f6649t, 0.0f, 0.0f);
                this.f6650u = false;
                if (this.f6630a == 1) {
                    r(0);
                }
            }
            b();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f6630a == 1 && pointerId3 == this.f6632c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i15 >= pointerCount2) {
                        i14 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i15);
                    if (pointerId4 != this.f6632c) {
                        View viewK3 = k((int) motionEvent.getX(i15), (int) motionEvent.getY(i15));
                        View view2 = this.f6649t;
                        if (viewK3 == view2 && v(pointerId4, view2)) {
                            i14 = this.f6632c;
                            break;
                        }
                    }
                    i15++;
                }
                if (i14 == -1) {
                    n();
                }
            }
            f(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x17 = motionEvent.getX(actionIndex);
        float y17 = motionEvent.getY(actionIndex);
        p(x17, y17, pointerId5);
        if (this.f6630a == 0) {
            v(pointerId5, k((int) x17, (int) y17));
            int i28 = this.f6637h[pointerId5] & this.f6646q;
            if (i28 != 0) {
                abstractC0092c.onEdgeTouched(i28, pointerId5);
                return;
            }
            return;
        }
        int i29 = (int) x17;
        int i30 = (int) y17;
        View view3 = this.f6649t;
        if (view3 != null && i29 >= view3.getLeft() && i29 < view3.getRight() && i30 >= view3.getTop() && i30 < view3.getBottom()) {
            i15 = 1;
        }
        if (i15 != 0) {
            v(pointerId5, this.f6649t);
        }
    }

    public final void n() {
        VelocityTracker velocityTracker = this.f6641l;
        float f14 = this.f6642m;
        velocityTracker.computeCurrentVelocity(1000, f14);
        float xVelocity = this.f6641l.getXVelocity(this.f6632c);
        float f15 = this.f6643n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f15) {
            xVelocity = 0.0f;
        } else if (fAbs > f14) {
            xVelocity = xVelocity > 0.0f ? f14 : -f14;
        }
        float yVelocity = this.f6641l.getYVelocity(this.f6632c);
        float f16 = this.f6643n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f16) {
            f14 = 0.0f;
        } else if (fAbs2 <= f14) {
            f14 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f14 = -f14;
        }
        this.f6650u = true;
        this.f6648s.onViewReleased(this.f6649t, xVelocity, f14);
        this.f6650u = false;
        if (this.f6630a == 1) {
            r(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o(float f14, float f15, int i14) {
        int i15;
        boolean zD = d(f14, f15, i14, 1);
        ?? r14 = zD;
        if (d(f15, f14, i14, 4)) {
            r14 = (zD ? 1 : 0) | 4;
        }
        ?? r15 = r14;
        if (d(f14, f15, i14, 2)) {
            r15 = (r14 == true ? 1 : 0) | 2;
        }
        ?? r16 = r15;
        if (d(f15, f14, i14, 8)) {
            i15 = (r15 == true ? 1 : 0) | 8;
        }
        if (r16 == 0) {
            r16 = i15;
            return;
        }
        r16 = i15;
        int[] iArr = this.f6638i;
        iArr[i14] = (iArr[i14] | r16) == true ? 1 : 0;
        this.f6648s.onEdgeDragStarted(r16, i14);
    }

    public final void p(float f14, float f15, int i14) {
        float[] fArr = this.f6633d;
        if (fArr == null || fArr.length <= i14) {
            int i15 = i14 + 1;
            float[] fArr2 = new float[i15];
            float[] fArr3 = new float[i15];
            float[] fArr4 = new float[i15];
            float[] fArr5 = new float[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6634e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6635f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6636g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6637h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6638i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6639j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6633d = fArr2;
            this.f6634e = fArr3;
            this.f6635f = fArr4;
            this.f6636g = fArr5;
            this.f6637h = iArr;
            this.f6638i = iArr2;
            this.f6639j = iArr3;
        }
        float[] fArr9 = this.f6633d;
        this.f6635f[i14] = f14;
        fArr9[i14] = f14;
        float[] fArr10 = this.f6634e;
        this.f6636g[i14] = f15;
        fArr10[i14] = f15;
        int[] iArr7 = this.f6637h;
        int i16 = (int) f14;
        int i17 = (int) f15;
        ViewGroup viewGroup = this.f6651v;
        int i18 = i16 < viewGroup.getLeft() + this.f6644o ? 1 : 0;
        if (i17 < viewGroup.getTop() + this.f6644o) {
            i18 |= 4;
        }
        if (i16 > viewGroup.getRight() - this.f6644o) {
            i18 |= 2;
        }
        if (i17 > viewGroup.getBottom() - this.f6644o) {
            i18 |= 8;
        }
        iArr7[i14] = i18;
        this.f6640k |= 1 << i14;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i14 = 0; i14 < pointerCount; i14++) {
            int pointerId = motionEvent.getPointerId(i14);
            if ((this.f6640k & (1 << pointerId)) != 0) {
                float x14 = motionEvent.getX(i14);
                float y14 = motionEvent.getY(i14);
                this.f6635f[pointerId] = x14;
                this.f6636g[pointerId] = y14;
            }
        }
    }

    public final void r(int i14) {
        this.f6651v.removeCallbacks(this.f6652w);
        if (this.f6630a != i14) {
            this.f6630a = i14;
            this.f6648s.onViewDragStateChanged(i14);
            if (this.f6630a == 0) {
                this.f6649t = null;
            }
        }
    }

    public final boolean s(int i14, int i15) {
        if (this.f6650u) {
            return l(i14, i15, (int) this.f6641l.getXVelocity(this.f6632c), (int) this.f6641l.getYVelocity(this.f6632c));
        }
        h.z("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    public final boolean t(MotionEvent motionEvent) {
        View viewK;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f6641l == null) {
            this.f6641l = VelocityTracker.obtain();
        }
        this.f6641l.addMovement(motionEvent);
        AbstractC0092c abstractC0092c = this.f6648s;
        if (actionMasked == 0) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            p(x14, y14, pointerId);
            View viewK2 = k((int) x14, (int) y14);
            if (viewK2 == this.f6649t && this.f6630a == 2) {
                v(pointerId, viewK2);
            }
            int i14 = this.f6637h[pointerId] & this.f6646q;
            if (i14 != 0) {
                abstractC0092c.onEdgeTouched(i14, pointerId);
            }
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x15 = motionEvent.getX(actionIndex);
                float y15 = motionEvent.getY(actionIndex);
                p(x15, y15, pointerId2);
                int i15 = this.f6630a;
                if (i15 == 0) {
                    int i16 = this.f6637h[pointerId2] & this.f6646q;
                    if (i16 != 0) {
                        abstractC0092c.onEdgeTouched(i16, pointerId2);
                    }
                } else if (i15 == 2 && (viewK = k((int) x15, (int) y15)) == this.f6649t) {
                    v(pointerId2, viewK);
                }
            } else if (actionMasked == 6) {
                f(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f6633d != null && this.f6634e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i17 = 0; i17 < pointerCount; i17++) {
                int pointerId3 = motionEvent.getPointerId(i17);
                if ((this.f6640k & (1 << pointerId3)) != 0) {
                    float x16 = motionEvent.getX(i17);
                    float y16 = motionEvent.getY(i17);
                    float f14 = x16 - this.f6633d[pointerId3];
                    float f15 = y16 - this.f6634e[pointerId3];
                    View viewK3 = k((int) x16, (int) y16);
                    boolean z14 = viewK3 != null && e(f14, f15, viewK3);
                    if (!z14) {
                        o(f14, f15, pointerId3);
                        if (this.f6630a != 1) {
                            break;
                        }
                    } else {
                        int left = viewK3.getLeft();
                        int i18 = (int) f14;
                        int iClampViewPositionHorizontal = abstractC0092c.clampViewPositionHorizontal(viewK3, left + i18, i18);
                        int top = viewK3.getTop();
                        int i19 = (int) f15;
                        int iClampViewPositionVertical = abstractC0092c.clampViewPositionVertical(viewK3, top + i19, i19);
                        int viewHorizontalDragRange = abstractC0092c.getViewHorizontalDragRange(viewK3);
                        int viewVerticalDragRange = abstractC0092c.getViewVerticalDragRange(viewK3);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        o(f14, f15, pointerId3);
                        if (this.f6630a != 1 || (z14 && v(pointerId3, viewK3))) {
                            break;
                        }
                    }
                }
            }
            q(motionEvent);
        }
        return this.f6630a == 1;
    }

    public final boolean u(View view2, int i14, int i15) {
        this.f6649t = view2;
        this.f6632c = -1;
        boolean zL = l(i14, i15, 0, 0);
        if (!zL && this.f6630a == 0 && this.f6649t != null) {
            this.f6649t = null;
        }
        return zL;
    }

    public final boolean v(int i14, View view2) {
        if (view2 == this.f6649t && this.f6632c == i14) {
            return true;
        }
        if (view2 == null || !this.f6648s.tryCaptureView(view2, i14)) {
            return false;
        }
        this.f6632c = i14;
        c(i14, view2);
        return true;
    }
}
