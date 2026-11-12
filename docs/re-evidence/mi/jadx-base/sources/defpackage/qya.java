package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.swmansion.gesturehandler.PointerEventsConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class qya {
    public static final PointF o = new PointF();
    public static final float[] p = new float[2];
    public static final Matrix q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float[] f31963r = new float[2];
    public static final Comparator<oya> s = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f31964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rya f31965b;
    public final nsq c;
    public final oya[] d = new oya[20];
    public final oya[] e = new oya[20];
    public final oya[] f = new oya[20];
    public final oya[] g = new oya[20];
    public int h = 0;
    public int i = 0;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31966k = 0;
    public boolean l = false;
    public int m = 0;
    public float n = 0.0f;

    public class a implements Comparator<oya> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(oya oyaVar, oya oyaVar2) {
            boolean z;
            boolean z2 = oyaVar.v;
            if ((z2 && oyaVar2.v) || ((z = oyaVar.w) && oyaVar2.w)) {
                return Integer.signum(oyaVar2.u - oyaVar.u);
            }
            if (z2) {
                return -1;
            }
            if (oyaVar2.v) {
                return 1;
            }
            if (z) {
                return -1;
            }
            return oyaVar2.w ? 1 : 0;
        }
    }

    public qya(ViewGroup viewGroup, rya ryaVar, nsq nsqVar) {
        this.f31964a = viewGroup;
        this.f31965b = ryaVar;
        this.c = nsqVar;
    }

    public static void A(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = p;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = q;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f3 = fArr[0];
            scrollY = fArr[1];
            scrollX = f3;
        }
        pointF.set(scrollX, scrollY);
    }

    public static boolean c(oya oyaVar, oya oyaVar2) {
        return oyaVar == oyaVar2 || oyaVar.O(oyaVar2) || oyaVar2.O(oyaVar);
    }

    public static boolean n(int i) {
        return i == 3 || i == 1 || i == 5;
    }

    public static boolean o(float f, float f2, View view) {
        return f >= 0.0f && f <= ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    public static boolean x(oya oyaVar, oya oyaVar2) {
        if (!oyaVar.t(oyaVar2) || c(oyaVar, oyaVar2)) {
            return false;
        }
        if (oyaVar == oyaVar2) {
            return true;
        }
        if (oyaVar.w || oyaVar.p() == 4) {
            return oyaVar.N(oyaVar2);
        }
        return true;
    }

    public static boolean y(oya oyaVar, oya oyaVar2) {
        return oyaVar != oyaVar2 && (oyaVar.Q(oyaVar2) || oyaVar2.P(oyaVar));
    }

    public static boolean z(View view, float[] fArr) {
        return !((view instanceof ViewGroup) && view.getBackground() == null) && o(fArr[0], fArr[1], view);
    }

    public final boolean B(View view, float[] fArr, int i) {
        PointerEventsConfig pointerEventsConfigC = this.c.c(view);
        if (pointerEventsConfigC == PointerEventsConfig.NONE) {
            return false;
        }
        if (pointerEventsConfigC == PointerEventsConfig.BOX_ONLY) {
            return u(view, fArr, i) || z(view, fArr);
        }
        if (pointerEventsConfigC == PointerEventsConfig.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return k((ViewGroup) view, fArr, i);
            }
            return false;
        }
        if (pointerEventsConfigC == PointerEventsConfig.AUTO) {
            return u(view, fArr, i) || (view instanceof ViewGroup ? k((ViewGroup) view, fArr, i) : false) || z(view, fArr);
        }
        throw new IllegalArgumentException("Unknown pointer event type: " + pointerEventsConfigC.toString());
    }

    public final void C(oya oyaVar) {
        if (l(oyaVar)) {
            a(oyaVar);
        } else {
            q(oyaVar);
            oyaVar.w = false;
        }
    }

    public final void a(oya oyaVar) {
        int i = 0;
        while (true) {
            int i2 = this.i;
            if (i >= i2) {
                oya[] oyaVarArr = this.e;
                if (i2 >= oyaVarArr.length) {
                    throw new IllegalStateException("Too many recognizers");
                }
                this.i = i2 + 1;
                oyaVarArr[i2] = oyaVar;
                oyaVar.w = true;
                int i3 = this.m;
                this.m = i3 + 1;
                oyaVar.u = i3;
                return;
            }
            if (this.e[i] == oyaVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean b(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.n;
    }

    public final void d() {
        for (int i = this.i - 1; i >= 0; i--) {
            this.e[i].d();
        }
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f[i3] = this.d[i3];
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f[i4].d();
        }
    }

    public final void e() {
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            oya[] oyaVarArr = this.e;
            oya oyaVar = oyaVarArr[i2];
            if (oyaVar.w) {
                oyaVarArr[i] = oyaVar;
                i++;
            }
        }
        this.i = i;
    }

    public final void f() {
        boolean z = false;
        for (int i = this.h - 1; i >= 0; i--) {
            oya oyaVar = this.d[i];
            if (n(oyaVar.p()) && !oyaVar.w) {
                this.d[i] = null;
                oyaVar.G();
                oyaVar.v = false;
                oyaVar.w = false;
                oyaVar.u = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.h; i3++) {
                oya[] oyaVarArr = this.d;
                oya oyaVar2 = oyaVarArr[i3];
                if (oyaVar2 != null) {
                    oyaVarArr[i2] = oyaVar2;
                    i2++;
                }
            }
            this.h = i2;
        }
        this.l = false;
    }

    public final void g(oya oyaVar, MotionEvent motionEvent) {
        if (!p(oyaVar.r())) {
            oyaVar.d();
            return;
        }
        if (oyaVar.T()) {
            int actionMasked = motionEvent.getActionMasked();
            if (oyaVar.w && actionMasked == 2) {
                return;
            }
            float[] fArr = f31963r;
            i(oyaVar.r(), motionEvent, fArr);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            motionEvent.setLocation(fArr[0], fArr[1]);
            oyaVar.s(motionEvent);
            if (oyaVar.v) {
                oyaVar.f(motionEvent);
            }
            motionEvent.setLocation(x, y);
            if (actionMasked == 1 || actionMasked == 6) {
                oyaVar.S(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
    }

    public void h(MotionEvent motionEvent) {
        int i = this.h;
        System.arraycopy(this.d, 0, this.f, 0, i);
        Arrays.sort(this.f, 0, i, s);
        for (int i2 = 0; i2 < i; i2++) {
            g(this.f[i2], motionEvent);
        }
    }

    public final void i(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f31964a) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else {
            if (view == null || !(view.getParent() instanceof ViewGroup)) {
                throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            i(viewGroup, motionEvent, fArr);
            PointF pointF = o;
            A(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f31963r;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        B(this.f31964a, fArr, pointerId);
        k(this.f31964a, fArr, pointerId);
    }

    public final boolean k(ViewGroup viewGroup, float[] fArr, int i) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View viewB = this.c.b(viewGroup, childCount);
            if (b(viewB)) {
                PointF pointF = o;
                A(fArr[0], fArr[1], viewGroup, viewB, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zB = (!m(viewB) || o(fArr[0], fArr[1], viewB)) ? B(viewB, fArr, i) : false;
                fArr[0] = f;
                fArr[1] = f2;
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l(oya oyaVar) {
        for (int i = 0; i < this.h; i++) {
            oya oyaVar2 = this.d[i];
            if (!n(oyaVar2.p()) && y(oyaVar, oyaVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(View view) {
        return !(view instanceof ViewGroup) || this.c.a((ViewGroup) view);
    }

    public final boolean p(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f31964a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f31964a) {
            parent = parent.getParent();
        }
        return parent == this.f31964a;
    }

    public final void q(oya oyaVar) {
        int iP = oyaVar.p();
        oyaVar.w = false;
        oyaVar.v = true;
        int i = this.m;
        this.m = i + 1;
        oyaVar.u = i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.h; i3++) {
            oya oyaVar2 = this.d[i3];
            if (x(oyaVar2, oyaVar)) {
                this.g[i2] = oyaVar2;
                i2++;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.g[i4].d();
        }
        for (int i5 = this.i - 1; i5 >= 0; i5--) {
            oya oyaVar3 = this.e[i5];
            if (x(oyaVar3, oyaVar)) {
                oyaVar3.d();
                oyaVar3.w = false;
            }
        }
        e();
        oyaVar.e(4, 2);
        if (iP != 4) {
            oyaVar.e(5, 4);
            if (iP != 5) {
                oyaVar.e(0, 5);
            }
        }
    }

    public void r(oya oyaVar, int i, int i2) {
        this.f31966k++;
        if (n(i)) {
            for (int i3 = 0; i3 < this.i; i3++) {
                oya oyaVar2 = this.e[i3];
                if (y(oyaVar2, oyaVar)) {
                    if (i == 5) {
                        oyaVar2.d();
                        oyaVar2.w = false;
                    } else {
                        C(oyaVar2);
                    }
                }
            }
            e();
        }
        if (i == 4) {
            C(oyaVar);
        } else if ((i2 != 4 && i2 != 5) || oyaVar.v) {
            oyaVar.e(i, i2);
        }
        this.f31966k--;
        v();
    }

    public boolean s(MotionEvent motionEvent) {
        this.j = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            j(motionEvent);
        } else if (actionMasked == 3) {
            d();
        }
        h(motionEvent);
        this.j = false;
        if (this.l && this.f31966k == 0) {
            f();
        }
        return true;
    }

    public final void t(oya oyaVar, View view) {
        int i = 0;
        while (true) {
            int i2 = this.h;
            if (i >= i2) {
                oya[] oyaVarArr = this.d;
                if (i2 >= oyaVarArr.length) {
                    throw new IllegalStateException("Too many recognizers");
                }
                this.h = i2 + 1;
                oyaVarArr[i2] = oyaVar;
                oyaVar.v = false;
                oyaVar.w = false;
                oyaVar.u = Integer.MAX_VALUE;
                oyaVar.F(view, this);
                return;
            }
            if (this.d[i] == oyaVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean u(View view, float[] fArr, int i) {
        ArrayList<oya> arrayListA = this.f31965b.a(view);
        if (arrayListA == null) {
            return false;
        }
        int size = arrayListA.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            oya oyaVar = arrayListA.get(i2);
            if (oyaVar.w() && oyaVar.y(view, fArr[0], fArr[1])) {
                t(oyaVar, view);
                oyaVar.R(i);
                z = true;
            }
        }
        return z;
    }

    public final void v() {
        if (this.j || this.f31966k != 0) {
            this.l = true;
        } else {
            f();
        }
    }

    public void w(float f) {
        this.n = f;
    }
}
