package com.huawei.uikit.hwbottomsheet.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.huawei.operation.utils.Constants;
import com.huawei.uikit.hwbottomsheet.R;
import defpackage.xea;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public class HwViewDragHelper {
    private bqmxo aa;
    private boolean ac;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f29292c;
    private float[] e;
    private float[] f;
    private int[] g;
    private float[] h;
    private int[] i;
    private int[] j;
    private int k;
    private int l;
    private float m;
    private float n;
    private int o;
    private Context p;
    private int q;
    private boolean r;
    private View t;
    private int u;
    private final ViewGroup v;
    private VelocityTracker x;
    private final Callback y;
    private int s = -1;
    private final Runnable w = new d();
    private final Interpolator ab = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f29291b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xea f29290a = new xea();
    private xea d = new xea();

    public static abstract class Callback {
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(View view, int i);
    }

    interface bqmxo {
        void a(int i, int i2);
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwViewDragHelper.this.d(0);
        }
    }

    public HwViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        this.f29290a.c(3.5f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewGroup;
        this.y = callback;
        this.p = context;
        try {
            this.r = context.getResources().getBoolean(R.bool.hwbottomsheet_animation_enable);
        } catch (Resources.NotFoundException unused) {
            this.r = true;
            Log.e("HwViewDragHelper", "HwViewDragHelper: resource animationEnabled not found");
        }
        this.k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
    }

    public static HwViewDragHelper a(ViewGroup viewGroup, Callback callback) {
        return new HwViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void k() {
        this.f29291b = true;
        this.x.computeCurrentVelocity(1000, this.n);
        c(b(this.x.getXVelocity(this.s), this.m, this.n), b(this.x.getYVelocity(this.s), this.m, this.n));
    }

    protected void a(boolean z) {
        this.f29291b = z;
    }

    protected float b() {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[PHI: r10
      0x0044: PHI (r10v12 int) = (r10v5 int), (r10v13 int) binds: [B:22:0x0042, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    protected boolean b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View view = this.t;
        if (view == null) {
            Log.w("HwViewDragHelper", "slideViewAt: mCapturedView is null!");
            return false;
        }
        int left = view.getLeft();
        int top = this.t.getTop();
        int i7 = i2 - top;
        if (i - left == 0 && i7 == 0) {
            d(0);
            this.d.c();
            this.f29290a.c();
            return false;
        }
        if (i7 != 0) {
            if (i4 == 0) {
                i4 = i7 < 0 ? -9000 : 9000;
            }
            if (i4 > 0) {
                i6 = 2000;
                if (i4 <= 2000) {
                    i5 = i6;
                } else {
                    if (i4 < 0) {
                        i6 = -2000;
                        if (i4 >= -2000) {
                            i5 = i6;
                        }
                    }
                    Log.e("HwViewDragHelper", "None of the above conditions are met.");
                    i5 = i4;
                }
            } else {
                if (i4 < 0) {
                    i6 = -2000;
                    if (i4 >= -2000) {
                        i5 = i6;
                    }
                }
                Log.e("HwViewDragHelper", "None of the above conditions are met.");
                i5 = i4;
            }
            if (i7 > 0 && i5 > 0) {
                this.f29290a.d(null, top, i5, Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else if ((i7 >= 0 || i5 <= 0) && i7 < 0) {
                this.f29290a.d(null, top, i5, Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else {
                this.f29290a.d(null, top, -i5, Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
            this.f29290a.b(((double) Math.abs(i7)) / Math.abs(this.f29290a.h() - top));
        }
        d(2);
        return true;
    }

    public void d(int i) {
        if (this.o != i) {
            this.o = i;
            if (i == 0) {
                this.t = null;
            }
            this.y.onViewDragStateChanged(i);
        }
        this.v.removeCallbacks(this.w);
    }

    protected boolean d() {
        return this.f29291b;
    }

    public View e() {
        return this.t;
    }

    public xea f() {
        return this.f29290a;
    }

    public int g() {
        return this.o;
    }

    public int h() {
        return this.u;
    }

    protected boolean i() {
        return this.d.b() || this.f29290a.b();
    }

    public xea j() {
        return this.d;
    }

    private void a(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.i;
            if (i >= iArr.length || (i2 = iArr[i] & this.l) == 0) {
                return;
            }
            this.y.onEdgeTouched(i2, i);
        }
    }

    private void c(int i, int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (i4 != 0) {
            this.t.offsetTopAndBottom(i4);
        }
        if (i3 != 0) {
            this.t.offsetLeftAndRight(i3);
        }
        this.y.onViewPositionChanged(this.t, i, i2, i3, i4);
    }

    public static HwViewDragHelper d(ViewGroup viewGroup, float f, Callback callback) {
        HwViewDragHelper hwViewDragHelperA = a(viewGroup, callback);
        hwViewDragHelperA.u = (int) (hwViewDragHelperA.u * (Float.compare(f, 0.0f) != 0 ? 1.0f / f : 1.0f));
        return hwViewDragHelperA;
    }

    public void a() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.x = null;
        }
        float[] fArr = this.f29292c;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.h, 0.0f);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.g, 0);
        Arrays.fill(this.j, 0);
        this.q = 0;
        this.s = -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    public boolean b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.e("HwViewDragHelper", "shouldInterceptTouchEvent: Motion event is null!");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a();
        }
        j(motionEvent);
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            h(motionEvent);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            f(motionEvent);
        } else if (actionMasked == 3) {
            a();
        } else if (actionMasked == 5) {
            c(motionEvent, actionIndex);
        } else if (actionMasked == 6) {
            e(motionEvent.getPointerId(actionIndex));
        }
        return this.o == 1;
    }

    protected void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            int pointerId = motionEvent.getPointerId(i);
            if (!a(pointerId, this.f, this.h)) {
                return;
            }
            this.f[pointerId] = x;
            this.h[pointerId] = y;
        }
    }

    public void e(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwViewDragHelper", "processTouchEvent: Parameter motionEvent is null");
            return;
        }
        if (motionEvent.getActionMasked() == 0) {
            a();
        }
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        this.x.addMovement(motionEvent);
        g(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    private void f(MotionEvent motionEvent) {
        if (this.e == null || this.f29292c == null) {
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (!a(pointerId, this.f29292c, this.e)) {
                return;
            }
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            float f = x - this.f29292c[pointerId];
            float f2 = y - this.e[pointerId];
            View viewC = c((int) x, (int) y);
            boolean zE = e(viewC, f, f2);
            if (zE) {
                int top = viewC.getTop();
                int i2 = (int) f2;
                int iClampViewPositionVertical = this.y.clampViewPositionVertical(viewC, top + i2, i2);
                int left = viewC.getLeft();
                int i3 = (int) f;
                int iClampViewPositionHorizontal = this.y.clampViewPositionHorizontal(viewC, left + i3, i3);
                int viewHorizontalDragRange = this.y.getViewHorizontalDragRange(viewC);
                int viewVerticalDragRange = this.y.getViewVerticalDragRange(viewC);
                boolean z = iClampViewPositionHorizontal != left && viewHorizontalDragRange >= 0;
                boolean z2 = iClampViewPositionVertical != top && viewVerticalDragRange >= 0;
                if (!z && !z2) {
                    break;
                }
                a(f, f2, pointerId);
                if (this.o != 1 || (zE && a(viewC, pointerId))) {
                    break;
                }
            } else {
                a(f, f2, pointerId);
                if (this.o != 1) {
                    break;
                }
            }
        }
        c(motionEvent);
    }

    private void j(MotionEvent motionEvent) {
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        this.x.addMovement(motionEvent);
    }

    public void d(View view, int i) {
        if (view != null) {
            if (view.getParent() != this.v) {
                Log.w("HwViewDragHelper", "captureChildView: Parameter must be a descendant of the HwViewDragHelper's tracked parent view (" + this.v + Constants.RIGHT_BRACKET_ONLY);
                return;
            }
            this.s = i;
            this.y.onViewCaptured(view, i);
            this.t = view;
            d(1);
            return;
        }
        Log.w("HwViewDragHelper", "captureChildView: Parameter childView is null");
    }

    public boolean e(int i, int i2) {
        if (!this.ac) {
            Log.w("HwViewDragHelper", "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            return false;
        }
        return b(i, i2, (int) this.x.getXVelocity(this.s), (int) this.x.getYVelocity(this.s));
    }

    private boolean i(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.s);
        if (iFindPointerIndex == -1) {
            return false;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        if (!a(this.s, this.f, this.h)) {
            return false;
        }
        float[] fArr = this.f;
        int i = this.s;
        int i2 = (int) (x - fArr[i]);
        int i3 = (int) (y - this.h[i]);
        d(this.t.getLeft() + i2, this.t.getTop() + i3, 0, i3);
        c(motionEvent);
        return true;
    }

    public void b(int i) {
        this.u = i;
    }

    private void h(MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId(0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        e(x, y, pointerId);
        View viewC = c((int) x, (int) y);
        if (this.o == 2 && viewC == this.t) {
            a(viewC, pointerId);
        }
        a(pointerId);
    }

    public boolean e(View view, int i, int i2) {
        this.s = -1;
        this.t = view;
        boolean zB = b(i, i2, 0, 0);
        if (!zB && this.o == 0 && this.t != null) {
            this.t = null;
        }
        return zB;
    }

    public void c() {
        a();
        if (this.o == 2) {
            int iA = this.d.a();
            int iA2 = this.f29290a.a();
            this.d.c();
            this.f29290a.c();
            int iA3 = this.d.a();
            int iA4 = this.f29290a.a();
            this.y.onViewPositionChanged(this.t, iA3, iA4, iA3 - iA, iA4 - iA2);
        }
        d(0);
    }

    boolean a(View view, int i) {
        if (view == this.t && this.s == i) {
            return true;
        }
        if (view == null || !this.y.tryCaptureView(view, i)) {
            return false;
        }
        this.s = i;
        d(view, i);
        return true;
    }

    private void c(MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        e(x, y, pointerId);
        int i2 = this.o;
        if (i2 == 2) {
            View viewC = c((int) x, (int) y);
            if (viewC == this.t) {
                a(viewC, pointerId);
                return;
            }
            return;
        }
        if (i2 == 0) {
            a(pointerId);
        } else {
            Log.w("HwViewDragHelper", "interceptActionPointerDown: Wrong drag view state!");
        }
    }

    private void e(float f, float f2, int i) {
        float[] fArr = this.f29292c;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr, 0, iArr5.length);
                int[] iArr6 = this.g;
                System.arraycopy(iArr6, 0, iArr2, 0, iArr6.length);
            }
            this.f29292c = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.h = fArr5;
            this.j = iArr3;
            this.i = iArr;
            this.g = iArr2;
        }
        if (a(i, this.f29292c, this.e, this.f, this.h) && d(i, this.i, this.g, this.j)) {
            this.f29292c[i] = f;
            this.f[i] = f;
            this.e[i] = f2;
            this.h[i] = f2;
            this.i[i] = d((int) f, (int) f2);
            this.q |= 1 << i;
        }
    }

    private int d(int i, int i2) {
        int i3 = i < this.v.getLeft() + this.k ? 1 : 0;
        if (i > this.v.getRight() - this.k) {
            i3 |= 2;
        }
        if (i2 < this.v.getTop() + this.k) {
            i3 |= 4;
        }
        return i2 > this.v.getBottom() - this.k ? i3 | 8 : i3;
    }

    private void g(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            d(motionEvent);
            this.f29291b = true;
            return;
        }
        if (actionMasked == 1) {
            if (this.o == 1) {
                k();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.r) {
                a(motionEvent);
            }
            this.f29291b = true;
        } else if (actionMasked == 3) {
            if (this.o == 1) {
                c(0.0f, 0.0f);
            }
            a();
        } else if (actionMasked == 5) {
            d(motionEvent, actionIndex);
            this.f29291b = true;
        } else {
            if (actionMasked != 6) {
                return;
            }
            a(motionEvent, actionIndex);
        }
    }

    private float b(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs > f3) {
            return f >= 0.0f ? f3 : -f3;
        }
        if (fAbs < f2) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    public boolean c(boolean z) {
        if (this.t == null || this.o != 2) {
            return false;
        }
        boolean zI = i();
        int iA = this.r ? this.d.a() : this.d.h();
        int iA2 = this.r ? this.f29290a.a() : this.f29290a.h();
        this.t.getLeft();
        c(iA, iA2, 0, iA2 - this.t.getTop());
        boolean z2 = (iA == this.d.h()) && (iA2 == this.f29290a.h());
        if (zI && z2) {
            this.d.c();
            this.f29290a.c();
            if (this.d.i() && this.f29290a.i()) {
                if (!z) {
                    d(0);
                } else {
                    this.v.post(this.w);
                }
            }
        } else if (!zI) {
            if (!z) {
                d(0);
            } else {
                this.v.post(this.w);
            }
        }
        return this.o == 2;
    }

    private void e(int i) {
        if (a(i, this.f29292c, this.e, this.f, this.h) && d(i, this.i, this.g, this.j)) {
            this.f29292c[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.h[i] = 0.0f;
            this.i[i] = 0;
            this.g[i] = 0;
            this.j[i] = 0;
        }
    }

    private void a(MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i);
        if (pointerId == this.s && this.o != 1) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (pointerId2 != this.s) {
                    View viewC = c((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.t;
                    if (viewC == view && a(view, pointerId2)) {
                        if (this.s == -1) {
                            break;
                        }
                        e(pointerId);
                        return;
                    }
                }
            }
            k();
            e(pointerId);
            return;
        }
        e(pointerId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper$Callback] */
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
    private void a(float f, float f2, int i) {
        ?? r0;
        int i2;
        if (d(i, this.g)) {
            boolean zC = c(f, f2, i, 1);
            if (c(f, f2, i, 2)) {
                r0 = zC;
                r0 = (zC ? 1 : 0) | 2;
            }
            r0 = zC;
            ?? r1 = r0;
            if (c(f2, f, i, 4)) {
                r1 = (r0 == true ? 1 : 0) | 4;
            }
            ?? r2 = r1;
            if (c(f2, f, i, 8)) {
                i2 = (r1 == true ? 1 : 0) | 8;
            }
            if (r2 == 0) {
                r2 = i2;
                return;
            }
            r2 = i2;
            this.y.onEdgeDragStarted(r2, i);
            int[] iArr = this.g;
            iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        }
    }

    private void d(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int pointerId = motionEvent.getPointerId(0);
        View viewC = c((int) x, (int) y);
        e(x, y, pointerId);
        a(viewC, pointerId);
        a(pointerId);
    }

    public View c(int i, int i2) {
        int childCount = this.v.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.v.getChildAt(this.y.getOrderedChildIndex(childCount));
            if (childAt == null) {
                Log.w("HwViewDragHelper", "findTopChildUnder: Child view is null！");
                return null;
            }
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    private boolean c(float f, float f2, int i, int i2) {
        if (!d(i, this.i, this.j, this.g)) {
            return false;
        }
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        float f3 = this.u;
        boolean z = fAbs > f3 || fAbs2 > f3;
        boolean z2 = ((this.i[i] & i2) == i2 || (this.l & i2) != 0) && !((this.g[i] & i2) == i2 || (this.j[i] & i2) == i2);
        if (z && z2) {
            if (fAbs < fAbs2 * 0.5f && this.y.onEdgeLock(i2)) {
                int[] iArr = this.j;
                iArr[i] = iArr[i] | i2;
                return false;
            }
            if (Float.compare(fAbs, this.u) > 0 && (this.g[i] & i2) == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean e(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.y.getViewVerticalDragRange(view) > 0;
        boolean z2 = this.y.getViewHorizontalDragRange(view) > 0;
        if (z2 && z) {
            int i = this.u;
            return (f2 * f2) + (f * f) > ((float) (i * i));
        }
        if (z2) {
            return Math.abs(f) > ((float) this.u);
        }
        return z && Math.abs(f2) > ((float) this.u);
    }

    private boolean a(int i, float[]... fArr) {
        if (fArr == null) {
            return false;
        }
        for (float[] fArr2 : fArr) {
            if (fArr2 == null || i > fArr2.length - 1 || i < 0) {
                return false;
            }
        }
        return true;
    }

    private boolean d(int i, int[]... iArr) {
        if (iArr == null) {
            return false;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2 == null || i > iArr2.length - 1 || i < 0) {
                return false;
            }
        }
        return true;
    }

    private void a(MotionEvent motionEvent) {
        if (this.o == 1) {
            i(motionEvent);
            return;
        }
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            int pointerId = motionEvent.getPointerId(i);
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            if (!a(pointerId, this.f, this.h)) {
                return;
            }
            float f = x - this.f29292c[pointerId];
            float f2 = y - this.e[pointerId];
            a(f, f2, pointerId);
            if (this.o == 1) {
                return;
            }
            View viewC = c((int) x, (int) y);
            if (e(viewC, f, f2) && a(viewC, pointerId)) {
                return;
            }
        }
    }

    private void d(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i4 != 0) {
            i2 = this.y.clampViewPositionVertical(this.t, i2, i4);
            this.t.offsetTopAndBottom(i2 - top);
        }
        int i5 = i2;
        if (i3 != 0) {
            i = this.y.clampViewPositionHorizontal(this.t, i, i3);
            this.t.offsetLeftAndRight(i - left);
        }
        int i6 = i;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.y.onViewPositionChanged(this.t, i6, i5, i6 - left, i5 - top);
        bqmxo bqmxoVar = this.aa;
        if (bqmxoVar != null) {
            bqmxoVar.a(i3, i4);
        }
    }

    private void d(MotionEvent motionEvent, int i) {
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        int pointerId = motionEvent.getPointerId(i);
        e(x, y, pointerId);
        if (this.o == 0) {
            a(c((int) x, (int) y), pointerId);
            a(pointerId);
        } else if (c(this.t, (int) x, (int) y)) {
            a(this.t, pointerId);
        } else {
            Log.w("HwViewDragHelper", "doActionPointerDown: Wrong State");
        }
    }

    private void c(float f, float f2) {
        this.ac = true;
        this.f29291b = true;
        this.y.onViewReleased(this.t, f, f2);
        this.ac = false;
        if (this.o == 1) {
            d(0);
        }
    }

    public boolean c(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        return (i >= view.getLeft() && i < view.getRight()) && (i2 >= view.getTop() && i2 < view.getBottom());
    }

    void e(bqmxo bqmxoVar) {
        this.aa = bqmxoVar;
    }
}
