package b0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.w1;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b3<?> f13966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b3<?> f13967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet f13968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b3<?> f13969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q2 f13970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b3<?> f13971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f13972k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.camera.core.impl.l0 f13974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.camera.core.impl.l0 f13975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f13976o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13962a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f13963b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13964c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f13965d = b.INACTIVE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f13973l = new Matrix();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l2 f13977p = l2.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l2 f13978q = l2.a();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13979a;

        static {
            int[] iArr = new int[f0.e.b.values().length];
            f13979a = iArr;
            try {
                iArr[f0.e.b.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13979a[f0.e.b.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13979a[f0.e.b.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        ACTIVE,
        INACTIVE
    }

    public interface c {
        void d(i1 i1Var);

        void k(i1 i1Var);

        void l(i1 i1Var);

        void m(i1 i1Var);
    }

    public i1(b3<?> b3Var) {
        this.f13967f = b3Var;
        this.f13969h = b3Var;
    }

    public void A(Matrix matrix) {
        this.f13973l = new Matrix(matrix);
    }

    public final boolean B(int i14) {
        Size sizeK;
        int iD = ((n1) this.f13969h).D(-1);
        if (iD != -1 && iD == i14) {
            return false;
        }
        b3.b<?, ?, ?> bVarM = m(this.f13967f);
        n1 n1Var = (n1) bVarM.b();
        int iD2 = n1Var.D(-1);
        if (iD2 == -1 || iD2 != i14) {
            ((n1.a) bVarM).c(i14);
        }
        if (iD2 != -1 && i14 != -1 && iD2 != i14) {
            if (Math.abs(j0.c.b(i14) - j0.c.b(iD2)) % 180 == 90 && (sizeK = n1Var.k()) != null) {
                ((n1.a) bVarM).a(new Size(sizeK.getHeight(), sizeK.getWidth()));
            }
        }
        this.f13967f = bVarM.b();
        androidx.camera.core.impl.l0 l0VarC = c();
        if (l0VarC == null) {
            this.f13969h = this.f13967f;
            return true;
        }
        this.f13969h = p(l0VarC.c(), this.f13966e, this.f13971j);
        return true;
    }

    public void C(Rect rect) {
        this.f13972k = rect;
    }

    public final void D(androidx.camera.core.impl.l0 l0Var) {
        z();
        synchronized (this.f13964c) {
            try {
                androidx.camera.core.impl.l0 l0Var2 = this.f13974m;
                if (l0Var == l0Var2) {
                    this.f13963b.remove(l0Var2);
                    this.f13974m = null;
                }
                androidx.camera.core.impl.l0 l0Var3 = this.f13975n;
                if (l0Var == l0Var3) {
                    this.f13963b.remove(l0Var3);
                    this.f13975n = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f13970i = null;
        this.f13972k = null;
        this.f13969h = this.f13967f;
        this.f13966e = null;
        this.f13971j = null;
    }

    public final void E(List<l2> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f13977p = list.get(0);
        if (list.size() > 1) {
            this.f13978q = list.get(1);
        }
        Iterator<l2> it = list.iterator();
        while (it.hasNext()) {
            for (DeferrableSurface deferrableSurface : it.next().b()) {
                if (deferrableSurface.f5476j == null) {
                    deferrableSurface.f5476j = getClass();
                }
            }
        }
    }

    public final void a(l2.b bVar, q2 q2Var) {
        if (!q2.f5715a.equals(q2Var.c())) {
            Range<Integer> rangeC = q2Var.c();
            androidx.camera.core.impl.v0.a aVar = bVar.f5612b;
            aVar.getClass();
            aVar.f5822b.X(androidx.camera.core.impl.v0.f5812k, rangeC);
            return;
        }
        synchronized (this.f13964c) {
            try {
                androidx.camera.core.impl.l0 l0Var = this.f13974m;
                l0Var.getClass();
                ArrayList arrayListC = l0Var.c().j().c(AeFpsRangeQuirk.class);
                boolean z14 = true;
                if (arrayListC.size() > 1) {
                    z14 = false;
                }
                k7.h.b(z14, "There should not have more than one AeFpsRangeQuirk.");
                if (!arrayListC.isEmpty()) {
                    Range<Integer> rangeE = ((AeFpsRangeQuirk) arrayListC.get(0)).e();
                    androidx.camera.core.impl.v0.a aVar2 = bVar.f5612b;
                    aVar2.getClass();
                    aVar2.f5822b.X(androidx.camera.core.impl.v0.f5812k, rangeE);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void b(androidx.camera.core.impl.l0 l0Var, androidx.camera.core.impl.l0 l0Var2, b3<?> b3Var, b3<?> b3Var2) {
        synchronized (this.f13964c) {
            this.f13974m = l0Var;
            this.f13975n = l0Var2;
            this.f13963b.add(l0Var);
            if (l0Var2 != null) {
                this.f13963b.add(l0Var2);
            }
        }
        this.f13966e = b3Var;
        this.f13971j = b3Var2;
        this.f13969h = p(l0Var.c(), this.f13966e, this.f13971j);
        s();
    }

    public final androidx.camera.core.impl.l0 c() {
        androidx.camera.core.impl.l0 l0Var;
        synchronized (this.f13964c) {
            l0Var = this.f13974m;
        }
        return l0Var;
    }

    public final CameraControlInternal d() {
        synchronized (this.f13964c) {
            try {
                androidx.camera.core.impl.l0 l0Var = this.f13974m;
                if (l0Var == null) {
                    return CameraControlInternal.f5462a;
                }
                return l0Var.n();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String e() {
        androidx.camera.core.impl.l0 l0VarC = c();
        k7.h.e(l0VarC, "No camera attached to use case: " + this);
        return l0VarC.c().q();
    }

    public abstract b3<?> f(boolean z14, c3 c3Var);

    public final String g() {
        String strJ = this.f13969h.j("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strJ);
        return strJ;
    }

    public final int h(androidx.camera.core.impl.l0 l0Var, boolean z14) {
        int iR = l0Var.c().r(l());
        return (l0Var.j() || !z14) ? iR : j0.v.l(-iR);
    }

    public final androidx.camera.core.impl.l0 i() {
        androidx.camera.core.impl.l0 l0Var;
        synchronized (this.f13964c) {
            l0Var = this.f13975n;
        }
        return l0Var;
    }

    public Set<b0> j(androidx.camera.core.impl.k0 k0Var) {
        return null;
    }

    public Set<Integer> k() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    public final int l() {
        return ((n1) this.f13969h).D(0);
    }

    public abstract b3.b<?, ?, ?> m(androidx.camera.core.impl.x0 x0Var);

    public final boolean n(int i14) {
        Iterator<Integer> it = k().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if ((i14 & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(androidx.camera.core.impl.l0 l0Var) {
        int iF = ((n1) this.f13969h).F();
        if (iF == -1 || iF == 0) {
            return false;
        }
        if (iF == 1) {
            return true;
        }
        if (iF == 2) {
            return l0Var.e();
        }
        vb.h.q(am.j.h(iF, "Unknown mirrorMode: "));
        return false;
    }

    public final b3<?> p(androidx.camera.core.impl.k0 k0Var, b3<?> b3Var, b3<?> b3Var2) {
        w1 w1VarU;
        if (b3Var2 != null) {
            w1VarU = w1.V(b3Var2);
            w1VarU.N.remove(m0.m.K);
        } else {
            w1VarU = w1.U();
        }
        TreeMap<androidx.camera.core.impl.x0.a<?>, Map<androidx.camera.core.impl.x0.b, Object>> treeMap = w1VarU.N;
        if (this.f13967f.b(n1.f5643k) || this.f13967f.b(n1.f5647o)) {
            androidx.camera.core.impl.h hVar = n1.f5651s;
            if (treeMap.containsKey(hVar)) {
                treeMap.remove(hVar);
            }
        }
        b3<?> b3Var3 = this.f13967f;
        androidx.camera.core.impl.h hVar2 = n1.f5651s;
        if (b3Var3.b(hVar2)) {
            androidx.camera.core.impl.h hVar3 = n1.f5649q;
            if (treeMap.containsKey(hVar3) && ((u0.c) this.f13967f.e(hVar2)).f167325b != null) {
                treeMap.remove(hVar3);
            }
        }
        Iterator<androidx.camera.core.impl.x0.a<?>> it = this.f13967f.d().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.x0.E(w1VarU, w1VarU, this.f13967f, it.next());
        }
        if (b3Var != null) {
            for (androidx.camera.core.impl.x0.a<?> aVar : b3Var.d()) {
                if (!aVar.b().equals(m0.m.K.f5564a)) {
                    androidx.camera.core.impl.x0.E(w1VarU, w1VarU, b3Var, aVar);
                }
            }
        }
        if (treeMap.containsKey(n1.f5647o)) {
            androidx.camera.core.impl.h hVar4 = n1.f5643k;
            if (treeMap.containsKey(hVar4)) {
                treeMap.remove(hVar4);
            }
        }
        androidx.camera.core.impl.h hVar5 = n1.f5651s;
        if (treeMap.containsKey(hVar5) && ((u0.c) w1VarU.e(hVar5)).f167327d != 0) {
            w1VarU.X(b3.C, Boolean.TRUE);
        }
        Objects.toString(this.f13968g);
        toString();
        HashSet<d0.a> hashSet = this.f13968g;
        if (hashSet != null) {
            b0 b0Var = f0.a.f67623d;
            Range<Integer> range = q2.f5715a;
            f0.e.b bVar = f0.e.f67638d;
            for (d0.a aVar2 : hashSet) {
                if (aVar2 instanceof f0.a) {
                    b0Var = ((f0.a) aVar2).f67624b;
                } else if (aVar2 instanceof f0.c) {
                    f0.c cVar = (f0.c) aVar2;
                    range = new Range<>(Integer.valueOf(cVar.f67633b), Integer.valueOf(cVar.f67634c));
                } else if (aVar2 instanceof f0.e) {
                    bVar = ((f0.e) aVar2).f67639b;
                }
            }
            if ((this instanceof w0) || CameraUseCaseAdapter.A(this)) {
                w1VarU.X(m1.f5634j, b0Var);
            }
            w1VarU.X(b3.A, range);
            int i14 = a.f13979a[bVar.ordinal()];
            if (i14 == 1) {
                w1VarU.X(b3.F, 1);
                w1VarU.X(b3.G, 1);
            } else if (i14 == 2) {
                w1VarU.X(b3.F, 0);
                w1VarU.X(b3.G, 2);
            } else if (i14 == 3) {
                w1VarU.X(b3.F, 2);
                w1VarU.X(b3.G, 0);
            }
        }
        return u(k0Var, m(w1VarU));
    }

    public final void q() {
        Iterator it = this.f13963b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).k(this);
        }
    }

    public final void r() {
        int iOrdinal = this.f13965d.ordinal();
        HashSet hashSet = this.f13963b;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).m(this);
            }
        }
    }

    public void s() {
    }

    public void t() {
    }

    public b3<?> u(androidx.camera.core.impl.k0 k0Var, b3.b<?, ?, ?> bVar) {
        return bVar.b();
    }

    public void v() {
        this.f13962a = true;
    }

    public void w() {
        this.f13962a = false;
    }

    public q2 x(androidx.camera.core.impl.x0 x0Var) {
        q2 q2Var = this.f13970i;
        if (q2Var == null) {
            org.apache.commons.lang3.e.w("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        androidx.camera.core.impl.q.b bVarI = q2Var.i();
        bVarI.f5710f = x0Var;
        return bVarI.a();
    }

    public q2 y(q2 q2Var, q2 q2Var2) {
        return q2Var;
    }

    public void z() {
    }
}
