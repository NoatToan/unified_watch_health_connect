package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.d;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.e0;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.x0;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import b0.a0;
import b0.b0;
import b0.i1;
import b0.k;
import b0.k1;
import b0.l;
import b0.q;
import b0.r;
import b0.w0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k7.h;
import lc.u0;
import m0.i;
import m0.j;
import m0.m;
import m0.o;
import p0.e;

/* JADX INFO: loaded from: classes.dex */
public final class CameraUseCaseAdapter implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f5885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f5886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0.a f5889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k1 f5890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<l> f5891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Range<Integer> f5892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0 f5893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x0 f5896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i1 f5897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v0.d f5898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0 f5899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a0 f5900r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f5901t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f5902v;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b3<?> f5903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b3<?> f5904b;

        public a(b3<?> b3Var, b3<?> b3Var2) {
            this.f5903a = b3Var;
            this.f5904b = b3Var2;
        }
    }

    public CameraUseCaseAdapter(l0 l0Var, l0 l0Var2, c cVar, c cVar2, a0 a0Var, a0 a0Var2, c0.a aVar, j jVar, c3 c3Var) {
        this.f5887e = new ArrayList();
        this.f5888f = new ArrayList();
        this.f5891i = Collections.EMPTY_LIST;
        this.f5892j = q2.f5715a;
        this.f5894l = new Object();
        this.f5895m = true;
        this.f5896n = null;
        this.f5901t = new e();
        this.f5893k = cVar.f5517d;
        this.f5883a = new d(l0Var, cVar);
        if (l0Var2 == null || cVar2 == null) {
            this.f5884b = null;
        } else {
            this.f5884b = new d(l0Var2, cVar2);
        }
        this.f5899q = a0Var;
        this.f5900r = a0Var2;
        this.f5889g = aVar;
        this.f5885c = c3Var;
        q.f14044c.getClass();
        this.f5886d = q.a.b(cVar, cVar2);
        this.f5902v = jVar;
    }

    public static boolean A(i1 i1Var) {
        if (i1Var != null) {
            if (!i1Var.f13969h.b(b3.E)) {
                i1Var.toString();
            } else if (i1Var.f13969h.y() == c3.b.VIDEO_CAPTURE) {
                return true;
            }
        }
        return false;
    }

    public static void C(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            i1 i1Var = (i1) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                i1Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            i1Var.f13968g = hashSet;
        }
    }

    public static ArrayList D(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            i1Var.getClass();
            i1Var.f13976o = null;
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                l lVar = (l) it3.next();
                if (i1Var.n(lVar.f14008a)) {
                    h.f(i1Var.f13976o == null, i1Var + " already has effect" + i1Var.f13976o);
                    h.a(i1Var.n(lVar.f14008a));
                    i1Var.f13976o = lVar;
                    arrayList.remove(lVar);
                }
            }
        }
        return arrayList;
    }

    public static HashMap l(LinkedHashSet linkedHashSet, e0.c cVar) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            map.put(i1Var, i1Var.f13968g);
            HashSet hashSet = null;
            Set<d0.a> set = cVar != null ? cVar.f61821a : null;
            if (set != null) {
                hashSet = new HashSet(set);
            }
            i1Var.f13968g = hashSet;
        }
        return map;
    }

    public static Matrix r(Rect rect, Size size) {
        h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap u(ArrayList arrayList, c3 c3Var, c3 c3Var2, Range range) {
        b3 b3VarF;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var instanceof v0.d) {
                v0.d dVar = (v0.d) i1Var;
                d2 d2Var = new d2(a2.T(new w0.a().f14085a));
                n1.s(d2Var);
                b3<?> b3VarF2 = new w0(d2Var).f(false, c3Var);
                if (b3VarF2 == null) {
                    b3VarF = null;
                } else {
                    w1 w1VarV = w1.V(b3VarF2);
                    w1VarV.N.remove(m.L);
                    b3VarF = ((v0.e) dVar.m(w1VarV)).b();
                }
            } else {
                b3VarF = i1Var.f(false, c3Var);
            }
            b3<?> b3VarF3 = i1Var.f(true, c3Var2);
            w1 w1VarV2 = b3VarF3 != null ? w1.V(b3VarF3) : w1.U();
            w1VarV2.X(b3.f5513z, 0);
            if (!q2.f5715a.equals(range)) {
                w1VarV2.W(b3.A, x0.b.HIGH_PRIORITY_REQUIRED, range);
                w1VarV2.X(b3.B, Boolean.TRUE);
            }
            map.put(i1Var, new a(b3VarF, i1Var.m(w1VarV2).b()));
        }
        return map;
    }

    public static boolean y(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var instanceof b0.l0) {
                b3<?> b3Var = i1Var.f13969h;
                androidx.camera.core.impl.h hVar = l1.S;
                if (b3Var.b(hVar)) {
                    Integer num = (Integer) b3Var.e(hVar);
                    num.getClass();
                    if (num.intValue() == 2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean z(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            if (A((i1) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void B(ArrayList arrayList) {
        synchronized (this.f5894l) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i1) it.next()).f13968g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f5887e);
            linkedHashSet.removeAll(arrayList);
            k(q(linkedHashSet, this.f5884b != null));
        }
    }

    @Override // b0.k
    public final CameraControl a() {
        return this.f5883a.f5529c;
    }

    @Override // b0.k
    public final r b() {
        return this.f5883a.f5528b;
    }

    public final void d(Collection<i1> collection, e0.c cVar) {
        Objects.toString(collection);
        Objects.toString(cVar);
        synchronized (this.f5894l) {
            try {
                d dVar = this.f5883a;
                e0 e0Var = this.f5893k;
                dVar.f(e0Var);
                d dVar2 = this.f5884b;
                if (dVar2 != null) {
                    dVar2.f(e0Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f5887e);
                linkedHashSet.addAll(collection);
                HashMap mapL = l(linkedHashSet, cVar);
                try {
                    k(q(linkedHashSet, this.f5884b != null));
                } catch (IllegalArgumentException e4) {
                    C(mapL);
                    throw new CameraException(e4);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(androidx.camera.core.internal.a aVar) {
        Map<i1, q2> map = aVar.f5913i.f115502a;
        Collection<i1> collection = aVar.f5906b;
        synchronized (this.f5894l) {
            try {
                if (this.f5890h != null && !collection.isEmpty()) {
                    boolean z14 = this.f5883a.f5528b.f5574a.b() == 0;
                    Rect rectT = this.f5883a.f5528b.f5574a.t();
                    k1 k1Var = this.f5890h;
                    Rational rational = k1Var.f14000b;
                    int iR = this.f5883a.f5528b.f5574a.r(k1Var.f14001c);
                    k1 k1Var2 = this.f5890h;
                    HashMap mapA = o.a(rectT, z14, rational, iR, k1Var2.f13999a, k1Var2.f14002d, map);
                    for (i1 i1Var : collection) {
                        Rect rect = (Rect) mapA.get(i1Var);
                        rect.getClass();
                        i1Var.C(rect);
                    }
                }
                for (i1 i1Var2 : collection) {
                    Rect rectT2 = this.f5883a.f5528b.f5574a.t();
                    q2 q2Var = map.get(i1Var2);
                    q2Var.getClass();
                    i1Var2.A(r(rectT2, q2Var.f()));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        List<l> list = this.f5891i;
        Collection<i1> collection2 = aVar.f5906b;
        Collection<i1> collection3 = aVar.f5905a;
        ArrayList arrayListD = D(list, collection2);
        ArrayList arrayList = new ArrayList(collection3);
        arrayList.removeAll(collection2);
        ArrayList arrayListD2 = D(arrayListD, arrayList);
        if (!arrayListD2.isEmpty()) {
            arrayListD2.toString();
        }
        Iterator<i1> it = aVar.f5909e.iterator();
        while (it.hasNext()) {
            it.next().D(this.f5883a);
        }
        this.f5883a.p(aVar.f5909e);
        if (this.f5884b != null) {
            for (i1 i1Var3 : aVar.f5909e) {
                d dVar = this.f5884b;
                Objects.requireNonNull(dVar);
                i1Var3.D(dVar);
            }
            d dVar2 = this.f5884b;
            Objects.requireNonNull(dVar2);
            dVar2.p(aVar.f5909e);
        }
        if (aVar.f5909e.isEmpty()) {
            for (i1 i1Var4 : aVar.f5908d) {
                Map<i1, q2> map2 = aVar.f5913i.f115502a;
                if (map2.containsKey(i1Var4)) {
                    q2 q2Var2 = map2.get(i1Var4);
                    Objects.requireNonNull(q2Var2);
                    x0 x0VarD = q2Var2.d();
                    if (x0VarD != null) {
                        l2 l2Var = i1Var4.f13977p;
                        x0 x0VarD2 = q2Var2.d();
                        x0 x0Var = l2Var.f5608g.f5814b;
                        Objects.requireNonNull(x0VarD2);
                        if (x0VarD2.d().size() == l2Var.f5608g.f5814b.d().size()) {
                            Iterator<x0.a<?>> it3 = x0VarD2.d().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    x0.a<?> next = it3.next();
                                    if (!x0Var.b(next) || !Objects.equals(x0Var.e(next), x0VarD2.e(next))) {
                                    }
                                }
                            }
                        }
                        i1Var4.f13970i = i1Var4.x(x0VarD);
                        if (this.f5895m) {
                            this.f5883a.l(i1Var4);
                            d dVar3 = this.f5884b;
                            if (dVar3 != null) {
                                dVar3.l(i1Var4);
                            }
                        }
                    }
                }
            }
        }
        for (i1 i1Var5 : aVar.f5907c) {
            a aVar2 = aVar.f5912h.get(i1Var5);
            Objects.requireNonNull(aVar2);
            d dVar4 = this.f5884b;
            d dVar5 = this.f5883a;
            b3<?> b3Var = aVar2.f5903a;
            if (dVar4 != null) {
                i1Var5.b(dVar5, dVar4, b3Var, aVar2.f5904b);
                q2 q2Var3 = aVar.f5913i.f115502a.get(i1Var5);
                q2Var3.getClass();
                i iVar = aVar.f5914j;
                iVar.getClass();
                i1Var5.f13970i = i1Var5.y(q2Var3, iVar.f115502a.get(i1Var5));
            } else {
                i1Var5.b(dVar5, null, b3Var, aVar2.f5904b);
                q2 q2Var4 = aVar.f5913i.f115502a.get(i1Var5);
                q2Var4.getClass();
                i1Var5.f13970i = i1Var5.y(q2Var4, null);
            }
        }
        if (this.f5895m) {
            this.f5883a.i(aVar.f5907c);
            d dVar6 = this.f5884b;
            if (dVar6 != null) {
                dVar6.i(aVar.f5907c);
            }
        }
        Iterator<i1> it4 = aVar.f5907c.iterator();
        while (it4.hasNext()) {
            it4.next().r();
        }
        this.f5887e.clear();
        this.f5887e.addAll(aVar.f5905a);
        this.f5888f.clear();
        this.f5888f.addAll(aVar.f5906b);
        this.f5897o = aVar.f5911g;
        this.f5898p = aVar.f5910f;
    }

    public final void m() {
        synchronized (this.f5894l) {
            try {
                if (!this.f5895m) {
                    if (!this.f5888f.isEmpty()) {
                        this.f5883a.f(this.f5893k);
                        d dVar = this.f5884b;
                        if (dVar != null) {
                            dVar.f(this.f5893k);
                        }
                    }
                    this.f5883a.i(this.f5888f);
                    d dVar2 = this.f5884b;
                    if (dVar2 != null) {
                        dVar2.i(this.f5888f);
                    }
                    synchronized (this.f5894l) {
                        try {
                            x0 x0Var = this.f5896n;
                            if (x0Var != null) {
                                this.f5883a.f5529c.i(x0Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Iterator it = this.f5888f.iterator();
                    while (it.hasNext()) {
                        ((i1) it.next()).r();
                    }
                    this.f5895m = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:202:0x02fa  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0182, code lost:
    
        if (r7 != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.camera.core.internal.a q(LinkedHashSet linkedHashSet, boolean z14) {
        v0.d dVar;
        boolean z15;
        i1 i1Var;
        i1 i1VarF;
        i1 i1Var2;
        boolean z16;
        boolean z17;
        i iVarA = null;
        if (x()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                b0 b0VarO = ((i1) it.next()).f13969h.o();
                boolean z18 = b0VarO.f13861b == 10;
                int i14 = b0VarO.f13860a;
                boolean z19 = (i14 == 1 || i14 == 0) ? false : true;
                if (z18 || z19) {
                    vb.h.s("Extensions are only supported for use with standard dynamic range.");
                    return null;
                }
            }
            if (y(linkedHashSet)) {
                vb.h.s("Extensions are not supported for use with Raw image capture.");
                return null;
            }
        }
        synchronized (this.f5894l) {
            try {
                if (!this.f5891i.isEmpty()) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        i1 i1Var3 = (i1) it3.next();
                        if (i1Var3 instanceof b0.l0) {
                            b3<?> b3Var = i1Var3.f13969h;
                            androidx.camera.core.impl.h hVar = l1.S;
                            if (b3Var.b(hVar)) {
                                Integer num = (Integer) b3Var.e(hVar);
                                num.getClass();
                                if (num.intValue() == 1) {
                                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (!y(linkedHashSet)) {
                    }
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z14) {
            if (!x() || !z(linkedHashSet)) {
                e eVar = this.f5901t;
                String strQ = this.f5883a.f5528b.f5574a.q();
                if (eVar.f134646a != null) {
                    HashSet hashSet = ImageCaptureFailedForSpecificCombinationQuirk.f5918a;
                    String str = Build.BRAND;
                    if ("oneplus".equalsIgnoreCase(str)) {
                    }
                } else if (eVar.f134647b != null) {
                    PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.f5923a;
                    strQ.getClass();
                    PreviewGreenTintQuirk.f5923a.getClass();
                    if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && strQ.equals("0") && linkedHashSet.size() == 2) {
                        if (linkedHashSet.isEmpty()) {
                            z16 = false;
                            break;
                        }
                        Iterator it4 = linkedHashSet.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z16 = false;
                                break;
                            }
                            if (((i1) it4.next()) instanceof w0) {
                                z16 = true;
                                break;
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            z17 = false;
                            break;
                        }
                        Iterator it5 = linkedHashSet.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z17 = false;
                                break;
                            }
                            i1 i1Var4 = (i1) it5.next();
                            if (i1Var4.f13969h.b(b3.E) && i1Var4.f13969h.y() == c3.b.VIDEO_CAPTURE) {
                                z17 = true;
                                break;
                            }
                        }
                        if (z16) {
                        }
                    }
                }
            }
            return q(linkedHashSet, true);
        }
        synchronized (this.f5894l) {
            try {
                HashSet hashSetV = v(linkedHashSet, z14);
                if (hashSetV.size() >= 2 || (x() && z(hashSetV))) {
                    v0.d dVar2 = this.f5898p;
                    if (dVar2 == null || !dVar2.f174163s.f174176a.equals(hashSetV)) {
                        int[] iArr = {1, 2, 4};
                        HashSet hashSet2 = new HashSet();
                        Iterator it6 = hashSetV.iterator();
                        loop8: while (true) {
                            if (!it6.hasNext()) {
                                dVar = new v0.d(this.f5883a, this.f5884b, this.f5899q, this.f5900r, hashSetV, this.f5885c);
                                break;
                            }
                            i1 i1Var5 = (i1) it6.next();
                            int i15 = 0;
                            while (true) {
                                if (i15 < 3) {
                                    int i16 = iArr[i15];
                                    if (i1Var5.n(i16)) {
                                        if (!hashSet2.contains(Integer.valueOf(i16))) {
                                            hashSet2.add(Integer.valueOf(i16));
                                        }
                                    }
                                    i15++;
                                }
                            }
                        }
                    } else {
                        v0.d dVar3 = this.f5898p;
                        dVar3.getClass();
                        HashSet hashSet3 = ((i1) hashSetV.iterator().next()).f13968g;
                        dVar3.f13968g = hashSet3 != null ? new HashSet(hashSet3) : null;
                        v0.d dVar4 = this.f5898p;
                        Objects.requireNonNull(dVar4);
                        dVar = dVar4;
                    }
                }
                dVar = null;
                break loop8;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        synchronized (this.f5894l) {
            try {
                ArrayList<i1> arrayList = new ArrayList(linkedHashSet);
                if (dVar != null) {
                    arrayList.add(dVar);
                    arrayList.removeAll(dVar.f174163s.f174176a);
                }
                synchronized (this.f5894l) {
                    z15 = ((Integer) this.f5893k.f(e0.f5532b, 0)).intValue() == 1;
                }
                if (z15) {
                    boolean z24 = false;
                    boolean z25 = false;
                    for (i1 i1Var6 : arrayList) {
                        if ((i1Var6 instanceof w0) || (i1Var6 instanceof v0.d)) {
                            z25 = true;
                        } else if (i1Var6 instanceof b0.l0) {
                            z24 = true;
                        }
                    }
                    if (!z24 || z25) {
                        boolean z26 = false;
                        boolean z27 = false;
                        for (i1 i1Var7 : arrayList) {
                            if ((i1Var7 instanceof w0) || (i1Var7 instanceof v0.d)) {
                                z26 = true;
                            } else if (i1Var7 instanceof b0.l0) {
                                z27 = true;
                            }
                        }
                        if (!z26 || z27) {
                            i1Var = null;
                        } else {
                            i1 i1Var8 = this.f5897o;
                            if (i1Var8 instanceof b0.l0) {
                                i1VarF = i1Var8;
                            } else {
                                b0.l0.b bVar = new b0.l0.b();
                                bVar.f14025a.X(m.K, "ImageCapture-Extra");
                                i1VarF = bVar.f();
                            }
                        }
                    } else {
                        i1Var2 = this.f5897o;
                        if (!(i1Var2 instanceof w0)) {
                            i1VarF = i1Var2;
                            w0.a aVar = new w0.a();
                            aVar.f14085a.X(m.K, "Preview-Extra");
                            d2 d2Var = new d2(a2.T(aVar.f14085a));
                            n1.s(d2Var);
                            w0 w0Var = new w0(d2Var);
                            w0Var.G(new u0(20));
                            i1VarF = w0Var;
                        }
                    }
                    i1VarF = i1Var2;
                    i1Var = i1VarF;
                } else {
                    i1Var = null;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet);
        if (i1Var != null) {
            arrayList2.add(i1Var);
        }
        if (dVar != null) {
            arrayList2.add(dVar);
            arrayList2.removeAll(dVar.f174163s.f174176a);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.removeAll(this.f5888f);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        arrayList4.retainAll(this.f5888f);
        ArrayList arrayList5 = new ArrayList(this.f5888f);
        arrayList5.removeAll(arrayList2);
        e0 e0Var = this.f5893k;
        e0Var.getClass();
        HashMap mapU = u(arrayList3, (c3) e0Var.f(e0.f5531a, c3.f5519a), this.f5885c, this.f5892j);
        List[] listArr = {arrayList3, arrayList4};
        boolean z28 = false;
        for (int i17 = 0; i17 < 2; i17++) {
            Iterator it7 = listArr[i17].iterator();
            while (it7.hasNext()) {
                if (((i1) it7.next()).f13968g != null) {
                    z28 = true;
                    break;
                }
            }
            if (z28) {
                break;
            }
        }
        boolean z29 = z28;
        try {
            i iVarA2 = this.f5902v.a(t(), this.f5883a.f5528b, arrayList3, arrayList4, this.f5893k, this.f5892j, z29);
            if (this.f5884b != null) {
                j jVar = this.f5902v;
                int iT = t();
                d dVar5 = this.f5884b;
                Objects.requireNonNull(dVar5);
                iVarA = jVar.a(iT, dVar5.f5528b, arrayList3, arrayList4, this.f5893k, this.f5892j, z29);
            }
            return new androidx.camera.core.internal.a(linkedHashSet, arrayList2, arrayList3, arrayList4, arrayList5, dVar, i1Var, mapU, iVarA2, iVarA);
        } catch (IllegalArgumentException e4) {
            if (z14 || x() || this.f5884b != null) {
                throw e4;
            }
            return q(linkedHashSet, true);
        }
    }

    public final void s() {
        synchronized (this.f5894l) {
            try {
                if (this.f5895m) {
                    this.f5883a.p(new ArrayList(this.f5888f));
                    d dVar = this.f5884b;
                    if (dVar != null) {
                        dVar.p(new ArrayList(this.f5888f));
                    }
                    synchronized (this.f5894l) {
                        androidx.camera.core.impl.b bVar = this.f5883a.f5529c;
                        this.f5896n = bVar.f5567b.d();
                        bVar.e();
                    }
                    this.f5895m = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final int t() {
        synchronized (this.f5894l) {
            try {
                return ((z.a) this.f5889g).b() == 2 ? 1 : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final HashSet v(LinkedHashSet linkedHashSet, boolean z14) {
        int i14;
        HashSet hashSet = new HashSet();
        synchronized (this.f5894l) {
            try {
                Iterator<l> it = this.f5891i.iterator();
                l lVar = null;
                while (true) {
                    i14 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    l next = it.next();
                    int i15 = 0;
                    for (int i16 = next.f14008a; i16 != 0; i16 >>= 1) {
                        i15 += i16 & 1;
                    }
                    if (i15 > 1) {
                        h.f(lVar == null, "Can only have one sharing effect.");
                        lVar = next;
                    }
                }
                if (lVar != null) {
                    i14 = lVar.f14008a;
                }
                if (z14) {
                    i14 |= 3;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            i1 i1Var = (i1) it3.next();
            h.b(!(i1Var instanceof v0.d), "Only support one level of sharing for now.");
            if (i1Var.n(i14)) {
                hashSet.add(i1Var);
            }
        }
        return hashSet;
    }

    public final List<i1> w() {
        ArrayList arrayList;
        synchronized (this.f5894l) {
            arrayList = new ArrayList(this.f5887e);
        }
        return arrayList;
    }

    public final boolean x() {
        boolean z14;
        synchronized (this.f5894l) {
            z14 = this.f5893k.t() != null;
        }
        return z14;
    }

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }

        public CameraException(Throwable th3) {
            super(th3);
        }
    }

    public CameraUseCaseAdapter(l0 l0Var, c0.a aVar, j jVar, c3 c3Var) {
        c cVar = new c(l0Var.c(), g0.f5557a);
        a0 a0Var = a0.f13841d;
        this(l0Var, null, cVar, null, a0Var, a0Var, aVar, jVar, c3Var);
    }
}
