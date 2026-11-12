package v0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.r2;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.x0;
import b0.a0;
import b0.b0;
import b0.i1;
import b0.w0;
import j0.u;
import j0.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import r0.o;
import r0.r;
import r0.s;

/* JADX INFO: loaded from: classes.dex */
public class d extends i1 {
    public o A;
    public o B;
    public o C;
    public o D;
    public o E;
    public l2.b F;
    public l2.b G;
    public l2.c H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f174162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f174163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0 f174164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a0 f174165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f174166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f174167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s0.f f174168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r f174169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f174170z;

    public interface a {
    }

    public d(l0 l0Var, l0 l0Var2, a0 a0Var, a0 a0Var2, Set<i1> set, c3 c3Var) {
        super(L(set));
        this.f174162r = L(set);
        this.f174164t = a0Var;
        this.f174165u = a0Var2;
        this.f174163s = new h(l0Var, l0Var2, set, c3Var, new tr2.b(this, 19));
        HashSet hashSet = set.iterator().next().f13968g;
        this.f13968g = hashSet != null ? new HashSet(hashSet) : null;
    }

    public static ArrayList K(i1 i1Var) {
        ArrayList arrayList = new ArrayList();
        if (!(i1Var instanceof d)) {
            arrayList.add(i1Var.f13969h.y());
            return arrayList;
        }
        Iterator<i1> it = ((d) i1Var).f174163s.f174176a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f13969h.y());
        }
        return arrayList;
    }

    public static f L(Set<i1> set) {
        e eVar = new e();
        androidx.camera.core.impl.h hVar = m1.f5632h;
        w1 w1Var = eVar.f174171a;
        w1Var.X(hVar, 34);
        ArrayList arrayList = new ArrayList();
        for (i1 i1Var : set) {
            if (i1Var.f13969h.b(b3.E)) {
                arrayList.add(i1Var.f13969h.y());
            }
        }
        w1Var.X(f.O, arrayList);
        w1Var.X(n1.f5646n, 2);
        w1Var.X(b3.I, r2.PREVIEW_VIDEO_STILL);
        return new f(a2.T(w1Var));
    }

    public final void F() {
        l2.c cVar = this.H;
        if (cVar != null) {
            cVar.b();
            this.H = null;
        }
        o oVar = this.f174170z;
        if (oVar != null) {
            oVar.c();
            this.f174170z = null;
        }
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.c();
            this.A = null;
        }
        o oVar3 = this.B;
        if (oVar3 != null) {
            oVar3.c();
            this.B = null;
        }
        o oVar4 = this.C;
        if (oVar4 != null) {
            oVar4.c();
            this.C = null;
        }
        o oVar5 = this.D;
        if (oVar5 != null) {
            oVar5.c();
            this.D = null;
        }
        o oVar6 = this.E;
        if (oVar6 != null) {
            oVar6.c();
            this.E = null;
        }
        r rVar = this.f174167w;
        if (rVar != null) {
            rVar.b();
            this.f174167w = null;
        }
        s0.f fVar = this.f174168x;
        if (fVar != null) {
            fVar.f155270a.release();
            u.c(new po.g(fVar, 19));
            this.f174168x = null;
        }
        r rVar2 = this.f174166v;
        if (rVar2 != null) {
            rVar2.b();
            this.f174166v = null;
        }
        r rVar3 = this.f174169y;
        if (rVar3 != null) {
            rVar3.b();
            this.f174169y = null;
        }
    }

    public final r G(l0 l0Var, q2 q2Var) {
        b0.l lVar = this.f13976o;
        if (lVar == null || lVar.f14009b != 1) {
            return new r(l0Var, new r0.e(q2Var.b()));
        }
        r rVar = new r(l0Var, new s(lVar));
        this.f174166v = rVar;
        return rVar;
    }

    public final List<l2> H(String str, String str2, b3<?> b3Var, q2 q2Var, q2 q2Var2) {
        w0 w0Var;
        u.a();
        if (q2Var2 == null) {
            o oVarI = I(str, str2, b3Var, q2Var, null);
            l0 l0VarC = c();
            Objects.requireNonNull(l0VarC);
            r rVarG = G(l0VarC, q2Var);
            this.f174167w = rVarG;
            N(oVarI, rVarG, false);
            Object[] objArr = {this.F.c()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        o oVarI2 = I(str, str2, b3Var, q2Var, q2Var2);
        Matrix matrix = this.f13973l;
        l0 l0VarI = i();
        Objects.requireNonNull(l0VarI);
        boolean zJ = l0VarI.j();
        Size sizeF = q2Var2.f();
        Rect rect = this.f13972k;
        if (rect == null) {
            rect = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
        }
        Rect rect2 = rect;
        l0 l0VarI2 = i();
        Objects.requireNonNull(l0VarI2);
        int iH = h(l0VarI2, false);
        l0 l0VarI3 = i();
        Objects.requireNonNull(l0VarI3);
        o oVar = new o(3, 34, q2Var2, matrix, zJ, rect2, iH, -1, o(l0VarI3));
        this.A = oVar;
        Objects.requireNonNull(i());
        this.C = oVar;
        l2.b bVarJ = J(this.A, b3Var, q2Var2);
        this.G = bVarJ;
        l2.c cVar = this.H;
        if (cVar != null) {
            cVar.b();
        }
        l2.c cVar2 = new l2.c(new c(this, str, str2, b3Var, q2Var, q2Var2));
        this.H = cVar2;
        bVarJ.f5616f = cVar2;
        o oVar2 = this.C;
        s0.f fVar = new s0.f(c(), i(), new s0.e(q2Var.b(), this.f174164t, this.f174165u));
        this.f174168x = fVar;
        b0.l lVar = this.f13976o;
        Rect rect3 = this.f13972k;
        h hVar = this.f174163s;
        if (lVar != null) {
            boolean z14 = rect3 != null;
            int iL = l();
            Iterator<i1> it = hVar.f174176a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    w0Var = null;
                    break;
                }
                i1 next = it.next();
                if (next instanceof w0) {
                    w0Var = (w0) next;
                    break;
                }
            }
            w0 w0Var2 = w0Var;
            w0Var2.getClass();
            o next2 = fVar.b(new s0.b(oVarI2, oVar2, Arrays.asList(new s0.a(hVar.q(w0Var2, hVar.f174186k, hVar.f174181f, oVarI2, iL, z14, false), hVar.q(w0Var2, hVar.f174186k, hVar.f174182g, oVar2, iL, z14, false))))).values().iterator().next();
            this.D = next2;
            if (this.f13976o.f14009b == 1) {
                this.E = next2;
            } else {
                Objects.requireNonNull(next2);
                l0 l0VarC2 = c();
                Objects.requireNonNull(l0VarC2);
                this.E = M(next2, l0VarC2);
            }
            l0 l0VarC3 = c();
            Objects.requireNonNull(l0VarC3);
            r rVarG2 = G(l0VarC3, q2Var);
            this.f174169y = rVarG2;
            N(this.E, rVarG2, true);
        } else {
            boolean z15 = rect3 != null;
            int iL2 = l();
            hVar.getClass();
            HashMap map = new HashMap();
            for (i1 i1Var : hVar.f174176a) {
                t0.b bVarQ = hVar.q(i1Var, hVar.f174186k, hVar.f174181f, oVarI2, iL2, z15, false);
                b bVar = hVar.f174187l;
                Objects.requireNonNull(bVar);
                l0 l0Var = hVar.f174182g;
                Objects.requireNonNull(l0Var);
                t0.b bVarQ2 = hVar.q(i1Var, bVar, l0Var, oVar2, iL2, z15, false);
                int iR = hVar.f174181f.b().r(((n1) i1Var.f13969h).D(0));
                g gVar = (g) hVar.f174178c.get(i1Var);
                Objects.requireNonNull(gVar);
                gVar.f174174c.f174197c = iR;
                map.put(i1Var, new s0.a(bVarQ, bVarQ2));
            }
            boolean z16 = z15;
            s0.f.c cVarB = this.f174168x.b(new s0.b(oVarI2, oVar2, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((i1) entry.getKey(), cVarB.get(entry.getValue()));
            }
            hVar.w(map2, hVar.t(oVarI2, z16));
        }
        Object[] objArr2 = {this.F.c(), this.G.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i14 = 0; i14 < 2; i14++) {
            Object obj2 = objArr2[i14];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final o I(String str, String str2, b3<?> b3Var, q2 q2Var, q2 q2Var2) {
        Matrix matrix = this.f13973l;
        l0 l0VarC = c();
        Objects.requireNonNull(l0VarC);
        boolean zJ = l0VarC.j();
        Size sizeF = q2Var.f();
        Rect rect = this.f13972k;
        if (rect == null) {
            rect = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
        }
        Rect rect2 = rect;
        l0 l0VarC2 = c();
        Objects.requireNonNull(l0VarC2);
        int iH = h(l0VarC2, false);
        l0 l0VarC3 = c();
        Objects.requireNonNull(l0VarC3);
        o oVar = new o(3, 34, q2Var, matrix, zJ, rect2, iH, -1, o(l0VarC3));
        this.f174170z = oVar;
        boolean z14 = str2 != null;
        l0 l0VarC4 = c();
        Objects.requireNonNull(l0VarC4);
        b0.l lVar = this.f13976o;
        if (lVar != null && lVar.f14010c != 2 && !z14 && lVar.f14009b != 1) {
            oVar = M(oVar, l0VarC4);
        }
        this.B = oVar;
        l2.b bVarJ = J(this.f174170z, b3Var, q2Var);
        this.F = bVarJ;
        l2.c cVar = this.H;
        if (cVar != null) {
            cVar.b();
        }
        l2.c cVar2 = new l2.c(new c(this, str, str2, b3Var, q2Var, q2Var2));
        this.H = cVar2;
        bVarJ.f5616f = cVar2;
        return this.B;
    }

    public final l2.b J(o oVar, b3<?> b3Var, q2 q2Var) {
        l2.b bVarD = l2.b.d(b3Var, q2Var.f());
        v0.a aVar = bVarD.f5612b;
        h hVar = this.f174163s;
        Iterator<i1> it = hVar.f174176a.iterator();
        int i14 = -1;
        while (it.hasNext()) {
            int i15 = it.next().f13969h.I().f5608g.f5815c;
            List<Integer> list = l2.f5601j;
            if (list.indexOf(Integer.valueOf(i14)) < list.indexOf(Integer.valueOf(i15))) {
                i14 = i15;
            }
        }
        if (i14 != -1) {
            aVar.f5823c = i14;
        }
        Size sizeF = q2Var.f();
        Iterator<i1> it3 = hVar.f174176a.iterator();
        while (it3.hasNext()) {
            l2 l2VarC = l2.b.d(it3.next().f13969h, sizeF).c();
            v0 v0Var = l2VarC.f5608g;
            aVar.a(v0Var.f5817e);
            List<androidx.camera.core.impl.s> list2 = l2VarC.f5606e;
            ArrayList arrayList = bVarD.f5615e;
            for (androidx.camera.core.impl.s sVar : list2) {
                aVar.b(sVar);
                if (!arrayList.contains(sVar)) {
                    arrayList.add(sVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : l2VarC.f5605d) {
                ArrayList arrayList2 = bVarD.f5614d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : l2VarC.f5604c) {
                ArrayList arrayList3 = bVarD.f5613c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            bVarD.a(v0Var.f5814b);
        }
        oVar.getClass();
        u.a();
        oVar.b();
        k7.h.f(!oVar.f148752j, "Consumer can only be linked once.");
        oVar.f148752j = true;
        bVarD.b(oVar.f148754l, q2Var.b(), -1);
        aVar.b(hVar.f174183h);
        if (q2Var.d() != null) {
            bVarD.a(q2Var.d());
        }
        bVarD.f5618h = q2Var.g();
        a(bVarD, q2Var);
        return bVarD;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    public final o M(o oVar, l0 l0Var) {
        int iH;
        boolean z14;
        b0.l lVar = this.f13976o;
        lVar.getClass();
        this.f174166v = new r(l0Var, new s(lVar));
        b0.l lVar2 = this.f13976o;
        lVar2.getClass();
        if (lVar2.f14010c == 1) {
            l0 l0VarC = c();
            l0VarC.getClass();
            iH = h(l0VarC, false);
        } else {
            iH = 0;
        }
        b0.l lVar3 = this.f13976o;
        lVar3.getClass();
        Rect rectJ = lVar3.f14010c == 1 ? v.j(oVar.f148749g.f()) : oVar.f148746d;
        int i14 = oVar.f148748f;
        int i15 = oVar.f148743a;
        Size sizeI = v.i(v.g(rectJ), iH);
        b0.l lVar4 = this.f13976o;
        lVar4.getClass();
        if (lVar4.f14010c == 1) {
            l0 l0VarC2 = c();
            l0VarC2.getClass();
            if (l0VarC2.e() && l0VarC2.j()) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        t0.b bVar = new t0.b(UUID.randomUUID(), i14, i15, rectJ, sizeI, iH, z14, true);
        o oVar2 = this.f174166v.c(new r0.c(oVar, Collections.singletonList(bVar))).get(bVar);
        Objects.requireNonNull(oVar2);
        return oVar2;
    }

    public final void N(o oVar, r rVar, boolean z14) {
        boolean z15 = this.f13972k != null;
        int iL = l();
        h hVar = this.f174163s;
        hVar.getClass();
        HashMap map = new HashMap();
        for (i1 i1Var : hVar.f174176a) {
            o oVar2 = oVar;
            boolean z16 = z14;
            t0.b bVarQ = hVar.q(i1Var, hVar.f174186k, hVar.f174181f, oVar2, iL, z15, z16);
            int iR = hVar.f174181f.b().r(((n1) i1Var.f13969h).D(0));
            g gVar = (g) hVar.f174178c.get(i1Var);
            Objects.requireNonNull(gVar);
            gVar.f174174c.f174197c = iR;
            map.put(i1Var, bVarQ);
            oVar = oVar2;
            z14 = z16;
        }
        o oVar3 = oVar;
        r.c cVarC = rVar.c(new r0.c(oVar3, new ArrayList(map.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((i1) entry.getKey(), cVarC.get(entry.getValue()));
        }
        hVar.w(map2, hVar.t(oVar3, z15));
    }

    @Override // b0.i1
    public final b3<?> f(boolean z14, c3 c3Var) {
        f fVar = this.f174162r;
        x0 x0VarA = c3Var.a(fVar.y(), 1);
        if (z14) {
            x0VarA = x0.P(x0VarA, fVar.N);
        }
        if (x0VarA == null) {
            return null;
        }
        return ((e) m(x0VarA)).b();
    }

    @Override // b0.i1
    public final Set<b0> j(k0 k0Var) {
        Set<i1> set = this.f174163s.f174176a;
        HashSet hashSet = null;
        if (set.isEmpty()) {
            return null;
        }
        Iterator<i1> it = set.iterator();
        while (it.hasNext()) {
            Set<b0> setJ = it.next().j(k0Var);
            if (setJ != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setJ);
                } else {
                    hashSet.retainAll(setJ);
                }
            }
        }
        return hashSet;
    }

    @Override // b0.i1
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // b0.i1
    public final b3.b<?, ?, ?> m(x0 x0Var) {
        return new e(w1.V(x0Var));
    }

    @Override // b0.i1
    public final void s() {
        h hVar = this.f174163s;
        for (i1 i1Var : hVar.f174176a) {
            g gVar = (g) hVar.f174178c.get(i1Var);
            Objects.requireNonNull(gVar);
            i1Var.b(gVar, null, null, i1Var.f(true, hVar.f174180e));
        }
    }

    @Override // b0.i1
    public final void t() {
        Iterator<i1> it = this.f174163s.f174176a.iterator();
        while (it.hasNext()) {
            it.next().t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // b0.i1
    public final b3<?> u(k0 k0Var, b3.b<?, ?, ?> bVar) {
        b3<?> b3Var;
        Object b0Var;
        ?? r14;
        ?? r15;
        List<Size> arrayList;
        u0.c cVarR;
        x0 x0VarD = bVar.d();
        h hVar = this.f174163s;
        HashSet hashSet = hVar.f174184i;
        b bVar2 = hVar.f174186k;
        k0 k0Var2 = bVar2.f174152f;
        List<Size> supportedResolutions = k0Var2.getSupportedResolutions(34);
        Set<b3<?>> set = bVar2.f174150d;
        for (b3<?> b3Var2 : set) {
            if (!b3Var2.A() && (b3Var2 instanceof n1) && (cVarR = ((n1) b3Var2).r()) != null && cVarR.f167327d == 1) {
                ArrayList arrayList2 = new ArrayList(supportedResolutions);
                arrayList2.addAll(k0Var2.v(34));
                supportedResolutions = arrayList2;
                break;
            }
        }
        b3<?> b3Var3 = null;
        List list = (List) ((a2) x0VarD).f(n1.f5650r, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList = new ArrayList<>();
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).equals(34)) {
                    arrayList = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
            supportedResolutions = arrayList;
        }
        Rational rational = bVar2.f174149c;
        ArrayList arrayList3 = new ArrayList();
        HashSet<Size> hashSet2 = new HashSet();
        Iterator<b3<?>> it3 = set.iterator();
        while (it3.hasNext()) {
            hashSet2.addAll(bVar2.c(it3.next()));
        }
        for (Size size : hashSet2) {
            Rational rational2 = j0.a.f95902a;
            if (!j0.a.a(size, rational, q0.c.f141973c)) {
                arrayList3.addAll(bVar2.g(bVar2.f174148b, supportedResolutions, false));
                break;
            }
        }
        int size2 = arrayList3.size();
        if (!set.isEmpty()) {
            Iterator<b3<?>> it4 = set.iterator();
            loop9: while (true) {
                if (!it4.hasNext()) {
                    b3Var = b3Var3;
                    size2 = 0;
                    break;
                }
                boolean z14 = false;
                boolean z15 = false;
                for (Size size3 : bVar2.c(it4.next())) {
                    b3Var = b3Var3;
                    Rational rational3 = j0.a.f95902a;
                    boolean zA = j0.a.a(size3, rational, q0.c.f141973c);
                    if (zA) {
                        z14 = true;
                    }
                    if (z15 && zA) {
                        break loop9;
                    }
                    if (!zA) {
                        z15 = true;
                    }
                    b3Var3 = b3Var;
                }
                b3Var = b3Var3;
                if (!z14) {
                    break;
                }
                b3Var3 = b3Var;
            }
        } else {
            b3Var = null;
        }
        arrayList3.addAll(size2, bVar2.g(rational, supportedResolutions, false));
        arrayList3.addAll(bVar2.f(supportedResolutions, false));
        if (arrayList3.isEmpty()) {
            arrayList3.addAll(bVar2.f(supportedResolutions, true));
        }
        arrayList3.toString();
        w1 w1Var = (w1) x0VarD;
        w1Var.X(n1.f5652t, arrayList3);
        androidx.camera.core.impl.h hVar2 = b3.f5512y;
        Iterator it5 = hashSet.iterator();
        int iMax = 0;
        while (it5.hasNext()) {
            iMax = Math.max(iMax, ((b3) it5.next()).w());
        }
        w1Var.X(hVar2, Integer.valueOf(iMax));
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            arrayList4.add(((b3) it6.next()).o());
        }
        if (arrayList4.isEmpty()) {
            b0Var = b3Var;
            break;
        }
        b0 b0Var2 = (b0) arrayList4.get(0);
        ?? ValueOf = Integer.valueOf(b0Var2.f13860a);
        ?? ValueOf2 = Integer.valueOf(b0Var2.f13861b);
        int i14 = 1;
        while (true) {
            if (i14 >= arrayList4.size()) {
                b0Var = new b0(ValueOf.intValue(), ValueOf2.intValue());
                break;
            }
            b0 b0Var3 = (b0) arrayList4.get(i14);
            Integer numValueOf = Integer.valueOf(b0Var3.f13860a);
            if (ValueOf.equals(0)) {
                r14 = ValueOf;
                r14 = numValueOf;
            } else if (!numValueOf.equals(0)) {
                if (!ValueOf.equals(2) || numValueOf.equals(1)) {
                    r14 = ValueOf;
                    r14 = ValueOf;
                    if (!numValueOf.equals(2) || ValueOf.equals(1)) {
                        r14 = ValueOf;
                        boolean zEquals = ValueOf.equals(numValueOf);
                        r14 = ValueOf;
                        if (!zEquals) {
                            r14 = b3Var;
                        }
                    }
                } else {
                    r14 = ValueOf;
                    r14 = numValueOf;
                }
            }
            r14 = ValueOf;
            r14 = ValueOf;
            Integer numValueOf2 = Integer.valueOf(b0Var3.f13861b);
            if (ValueOf2.equals(0)) {
                r15 = numValueOf2;
            } else if (!numValueOf2.equals(0) && !ValueOf2.equals(numValueOf2)) {
                r15 = ValueOf2;
                r15 = ValueOf2;
                r15 = b3Var;
            }
            if (r14 == 0 || r15 == 0) {
                b0Var = b3Var;
                break;
            }
            i14++;
            ValueOf2 = r15;
            ValueOf = r14;
        }
        if (b0Var == null) {
            vb.h.s("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return b3Var;
        }
        w1Var.X(m1.f5634j, b0Var);
        androidx.camera.core.impl.h hVar3 = b3.A;
        Range<Integer> rangeExtend = q2.f5715a;
        Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            Range<Integer> rangeM = ((b3) it7.next()).M(rangeExtend);
            Objects.requireNonNull(rangeM);
            if (q2.f5715a.equals(rangeExtend)) {
                rangeExtend = rangeM;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(rangeM);
                } catch (IllegalArgumentException unused) {
                    Objects.toString(rangeExtend);
                    rangeM.toString();
                    rangeExtend = rangeExtend.extend(rangeM);
                }
            }
        }
        w1Var.X(hVar3, rangeExtend);
        Iterator<i1> it8 = hVar.f174176a.iterator();
        while (it8.hasNext()) {
            b3 b3Var4 = (b3) hVar.f174185j.get(it8.next());
            Objects.requireNonNull(b3Var4);
            if (b3Var4.l() != 0) {
                w1Var.X(b3.G, Integer.valueOf(b3Var4.l()));
            }
            if (b3Var4.C() != 0) {
                w1Var.X(b3.F, Integer.valueOf(b3Var4.C()));
            }
        }
        return bVar.b();
    }

    @Override // b0.i1
    public final void v() {
        this.f13962a = true;
        Iterator<i1> it = this.f174163s.f174176a.iterator();
        while (it.hasNext()) {
            it.next().v();
        }
    }

    @Override // b0.i1
    public final void w() {
        this.f13962a = false;
        Iterator<i1> it = this.f174163s.f174176a.iterator();
        while (it.hasNext()) {
            it.next().w();
        }
    }

    @Override // b0.i1
    public final q2 x(x0 x0Var) {
        this.F.f5612b.c(x0Var);
        Object[] objArr = {this.F.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q.b bVarI = this.f13970i.i();
        bVarI.f5710f = x0Var;
        return bVarI.a();
    }

    @Override // b0.i1
    public final q2 y(q2 q2Var, q2 q2Var2) {
        Objects.toString(q2Var);
        Objects.toString(q2Var2);
        E(H(e(), i() == null ? null : i().c().q(), this.f13969h, q2Var, q2Var2));
        this.f13965d = i1.b.ACTIVE;
        r();
        return q2Var;
    }

    @Override // b0.i1
    public final void z() {
        F();
        h hVar = this.f174163s;
        for (i1 i1Var : hVar.f174176a) {
            g gVar = (g) hVar.f174178c.get(i1Var);
            Objects.requireNonNull(gVar);
            i1Var.D(gVar);
        }
    }
}
