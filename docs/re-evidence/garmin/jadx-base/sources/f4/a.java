package f4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.i1;
import p1.u0;
import p3.j2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001\u000eBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lf4/a;", "Lf4/f;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lf4/j;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(JLf4/j;Le23/l;Le23/l;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f68706o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<Object, Unit> f68707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.l<Object, Unit> f68708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f68709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0<g0> f68710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f68711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f68712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f68713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f68714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f68715n;

    static {
        new C1422a(null);
        f68706o = new int[0];
    }

    public a(long j8, j jVar, e23.l<Object, Unit> lVar, e23.l<Object, Unit> lVar2) {
        super(j8, jVar, (p005kotlin.jvm.internal.j) null);
        this.f68707f = lVar;
        this.f68708g = lVar2;
        j.f68751e.getClass();
        this.f68712k = j.f68752f;
        this.f68713l = f68706o;
        this.f68714m = 1;
    }

    public final void A(long j8) {
        synchronized (l.f68775c) {
            this.f68712k = this.f68712k.e(j8);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void B(u0<g0> u0Var) {
        this.f68710i = u0Var;
    }

    public a C(e23.l<Object, Unit> lVar, e23.l<Object, Unit> lVar2) throws Throwable {
        if (this.f68738c) {
            j2.a("Cannot use a disposed snapshot");
        }
        if (this.f68715n && this.f68739d < 0) {
            j2.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(getF68737b());
        Object obj = l.f68775c;
        synchronized (obj) {
            try {
                long j8 = l.f68777e;
                long j14 = 1;
                l.f68777e = j8 + j14;
                l.f68776d = l.f68776d.e(j8);
                j f68736a = getF68736a();
                r(f68736a.e(j8));
                try {
                    b bVar = new b(j8, l.c(f68736a, getF68737b() + j14, j8), l.j(lVar, true, getF68793s()), l.k(lVar2, i()), this);
                    if (this.f68715n || this.f68738c) {
                        return bVar;
                    }
                    long f68737b = getF68737b();
                    synchronized (obj) {
                        long j15 = l.f68777e;
                        l.f68777e = j15 + j14;
                        s(j15);
                        l.f68776d = l.f68776d.e(getF68737b());
                        Unit unit = Unit.INSTANCE;
                    }
                    r(l.c(getF68736a(), f68737b + j14, getF68737b()));
                    return bVar;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // f4.f
    public final void b() {
        l.f68776d = l.f68776d.b(getF68737b()).a(this.f68712k);
    }

    @Override // f4.f
    public void c() {
        if (this.f68738c) {
            return;
        }
        super.c();
        l();
    }

    @Override // f4.f
    public boolean f() {
        return false;
    }

    @Override // f4.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getF68709h() {
        return this.f68709h;
    }

    @Override // f4.f
    public e23.l<Object, Unit> i() {
        return this.f68708g;
    }

    @Override // f4.f
    public void k() {
        this.f68714m++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // f4.f
    public void l() {
        if (this.f68714m <= 0) {
            j2.a("no pending nested snapshots");
        }
        int i14 = this.f68714m - 1;
        this.f68714m = i14;
        if (i14 != 0 || this.f68715n) {
            return;
        }
        u0<g0> u0VarX = x();
        if (u0VarX != null) {
            if (this.f68715n) {
                j2.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long f68737b = getF68737b();
            Object[] objArr = u0VarX.f134733b;
            long[] jArr = u0VarX.f134732a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j8 = jArr[i15];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j8) < 128) {
                                for (i0 i0VarM = ((g0) objArr[(i15 << 3) + i17]).m(); i0VarM != null; i0VarM = i0VarM.f68750b) {
                                    long j14 = i0VarM.f68749a;
                                    if (j14 == f68737b || p13.h0.R(this.f68712k, Long.valueOf(j14))) {
                                        f21.g0 g0Var = l.f68773a;
                                        i0VarM.f68749a = 0L;
                                    }
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // f4.f
    public void m() {
        if (this.f68715n || this.f68738c) {
            return;
        }
        v();
    }

    @Override // f4.f
    public void n(g0 g0Var) {
        u0<g0> u0VarX = x();
        if (u0VarX == null) {
            u0VarX = i1.a();
            B(u0VarX);
        }
        u0VarX.d(g0Var);
    }

    @Override // f4.f
    public final void p() {
        int length = this.f68713l.length;
        for (int i14 = 0; i14 < length; i14++) {
            l.t(this.f68713l[i14]);
        }
        o();
    }

    @Override // f4.f
    public void t(int i14) {
        this.f68709h = i14;
    }

    @Override // f4.f
    public f u(e23.l<Object, Unit> lVar) throws Throwable {
        if (this.f68738c) {
            j2.a("Cannot use a disposed snapshot");
        }
        if (this.f68715n && this.f68739d < 0) {
            j2.b("Unsupported operation on a disposed or applied snapshot");
        }
        long f68737b = getF68737b();
        A(getF68737b());
        Object obj = l.f68775c;
        synchronized (obj) {
            try {
                long j8 = l.f68777e;
                long j14 = 1;
                l.f68777e = j8 + j14;
                l.f68776d = l.f68776d.e(j8);
                try {
                    c cVar = new c(j8, l.c(getF68736a(), f68737b + j14, j8), l.j(lVar, true, getF68793s()), this);
                    if (this.f68715n || this.f68738c) {
                        return cVar;
                    }
                    long f68737b2 = getF68737b();
                    synchronized (obj) {
                        long j15 = l.f68777e;
                        l.f68777e = j15 + j14;
                        s(j15);
                        l.f68776d = l.f68776d.e(getF68737b());
                        Unit unit = Unit.INSTANCE;
                    }
                    r(l.c(getF68736a(), f68737b2 + j14, getF68737b()));
                    return cVar;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void v() {
        long j8;
        A(getF68737b());
        Unit unit = Unit.INSTANCE;
        if (this.f68715n || this.f68738c) {
            return;
        }
        long f68737b = getF68737b();
        synchronized (l.f68775c) {
            long j14 = l.f68777e;
            j8 = 1;
            l.f68777e = j14 + j8;
            s(j14);
            l.f68776d = l.f68776d.e(getF68737b());
        }
        r(l.c(getF68736a(), f68737b + j8, getF68737b()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0153 A[EDGE_INSN: B:102:0x0153->B:77:0x0153 BREAK  A[LOOP:4: B:66:0x0124->B:76:0x0150], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111 A[Catch: all -> 0x0106, LOOP:2: B:48:0x00de->B:60:0x0111, LOOP_END, TryCatch #1 {all -> 0x0106, blocks: (B:43:0x00c2, B:45:0x00d2, B:48:0x00de, B:50:0x00ea, B:52:0x00f4, B:54:0x00fa, B:57:0x0109, B:63:0x011a, B:66:0x0124, B:68:0x012e, B:70:0x0138, B:72:0x013e, B:73:0x0148, B:76:0x0150, B:77:0x0153, B:79:0x0157, B:81:0x015e, B:82:0x016a, B:60:0x0111), top: B:92:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:75:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0150 A[Catch: all -> 0x0106, LOOP:4: B:66:0x0124->B:76:0x0150, LOOP_END, TryCatch #1 {all -> 0x0106, blocks: (B:43:0x00c2, B:45:0x00d2, B:48:0x00de, B:50:0x00ea, B:52:0x00f4, B:54:0x00fa, B:57:0x0109, B:63:0x011a, B:66:0x0124, B:68:0x012e, B:70:0x0138, B:72:0x013e, B:73:0x0148, B:76:0x0150, B:77:0x0153, B:79:0x0157, B:81:0x015e, B:82:0x016a, B:60:0x0111), top: B:92:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0118 A[EDGE_INSN: B:97:0x0118->B:62:0x0118 BREAK  A[LOOP:2: B:48:0x00de->B:60:0x0111], SYNTHETIC] */
    public g w() {
        HashMap mapA;
        List<? extends e23.p<? super Set<? extends Object>, ? super f, Unit>> list;
        u0<g0> u0Var;
        long j8;
        long j14;
        u0<g0> u0VarX = x();
        if (u0VarX != null) {
            long j15 = l.f68782j.f68737b;
            mapA = l.a(j15, this, l.f68776d.b(j15));
        } else {
            mapA = null;
        }
        p13.j0 j0Var = p13.j0.f134944a;
        synchronized (l.f68775c) {
            try {
                l.b(this);
                if (u0VarX == null || u0VarX.f134735d == 0) {
                    b();
                    androidx.compose.runtime.snapshots.a aVar = l.f68782j;
                    u0<g0> u0Var2 = aVar.f68710i;
                    l.u(aVar, l.f68773a);
                    if (u0Var2 == null || !u0Var2.c()) {
                        list = j0Var;
                        u0Var = null;
                    } else {
                        list = l.f68780h;
                        u0Var = u0Var2;
                    }
                } else {
                    androidx.compose.runtime.snapshots.a aVar2 = l.f68782j;
                    g gVarZ = z(l.f68777e, u0VarX, mapA, l.f68776d.b(aVar2.f68737b));
                    if (!p005kotlin.jvm.internal.s.g(gVarZ, g.b.f68741a)) {
                        return gVarZ;
                    }
                    b();
                    u0Var = aVar2.f68710i;
                    l.u(aVar2, l.f68773a);
                    B(null);
                    aVar2.f68710i = null;
                    list = l.f68780h;
                }
                Unit unit = Unit.INSTANCE;
                this.f68715n = true;
                if (u0Var != null) {
                    q3.e eVar = new q3.e(u0Var);
                    if (!eVar.f142365a.b()) {
                        int i14 = g4.f.f75739a;
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            list.get(i15).invoke(eVar, this);
                        }
                    }
                }
                if (u0VarX != null && u0VarX.c()) {
                    q3.e eVar2 = new q3.e(u0VarX);
                    int i16 = g4.f.f75739a;
                    int size2 = list.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        list.get(i17).invoke(eVar2, this);
                    }
                }
                synchronized (l.f68775c) {
                    try {
                        p();
                        l.e();
                        if (u0Var != null) {
                            Object[] objArr = u0Var.f134733b;
                            long[] jArr = u0Var.f134732a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i18 = 0;
                                j8 = 128;
                                while (true) {
                                    long j16 = jArr[i18];
                                    j14 = 255;
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i18 != length) {
                                            break;
                                            break;
                                        }
                                        i18++;
                                    } else {
                                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                                        for (int i24 = 0; i24 < i19; i24++) {
                                            if ((j16 & 255) < 128) {
                                                l.p((g0) objArr[(i18 << 3) + i24]);
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i19 != 8) {
                                            break;
                                        }
                                        if (i18 != length) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            } else {
                                j8 = 128;
                                j14 = 255;
                            }
                        } else {
                            j8 = 128;
                            j14 = 255;
                        }
                        if (u0VarX != null) {
                            Object[] objArr2 = u0VarX.f134733b;
                            long[] jArr2 = u0VarX.f134732a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j17 = jArr2[i25];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i25 != length2) {
                                            break;
                                            break;
                                        }
                                        i25++;
                                    } else {
                                        int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            if ((j17 & j14) < j8) {
                                                l.p((g0) objArr2[(i25 << 3) + i27]);
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i26 != 8) {
                                            break;
                                        }
                                        if (i25 != length2) {
                                            break;
                                        }
                                        i25++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f68711j;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i28 = 0; i28 < size3; i28++) {
                                l.p((g0) arrayList.get(i28));
                            }
                        }
                        this.f68711j = null;
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return g.b.f68741a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public u0<g0> x() {
        return this.f68710i;
    }

    @Override // f4.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public e23.l<Object, Unit> getF68724f() {
        return this.f68707f;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab A[LOOP:3: B:79:0x01a9->B:80:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final g z(long j8, u0 u0Var, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListC0;
        ArrayList arrayList2;
        int size;
        int i14;
        ArrayList arrayList3;
        int size2;
        int i15;
        g0 g0Var;
        i0 i0Var;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i16;
        long j14;
        ArrayList arrayList4;
        i0 i0VarO;
        j jVarD = getF68736a().e(getF68737b()).d(this.f68712k);
        Object[] objArr3 = u0Var.f134733b;
        long[] jArr3 = u0Var.f134732a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i17 = 0;
            arrayList2 = null;
            arrayListC0 = null;
            while (true) {
                long j15 = jArr3[i17];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j15 & 255) < 128) {
                            objArr2 = objArr3;
                            g0 g0Var2 = (g0) objArr3[(i17 << 3) + i19];
                            jArr2 = jArr3;
                            i0 i0VarM = g0Var2.m();
                            i16 = i19;
                            ArrayList arrayList5 = arrayList2;
                            i0 i0VarR = l.r(i0VarM, j8, jVar);
                            if (i0VarR == null) {
                                jVar3 = jVarD;
                                arrayList4 = arrayListC0;
                                j14 = j15;
                            } else {
                                arrayList4 = arrayListC0;
                                j14 = j15;
                                i0 i0VarR2 = l.r(i0VarM, getF68737b(), jVarD);
                                if (i0VarR2 == null) {
                                    jVar3 = jVarD;
                                } else {
                                    jVar3 = jVarD;
                                    if (i0VarR2.f68749a != 1 && !i0VarR.equals(i0VarR2)) {
                                        i0 i0VarR3 = l.r(i0VarM, getF68737b(), getF68736a());
                                        if (i0VarR3 == null) {
                                            l.q();
                                            throw null;
                                        }
                                        if (map == null || (i0VarO = (i0) map.get(i0VarR)) == null) {
                                            i0VarO = g0Var2.o(i0VarR2, i0VarR, i0VarR3);
                                        }
                                        if (i0VarO == null) {
                                            return new g.a(this);
                                        }
                                        if (!i0VarO.equals(i0VarR3)) {
                                            if (i0VarO.equals(i0VarR)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new o13.p(g0Var2, i0VarR.c(getF68737b())));
                                                arrayListC0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListC0.add(g0Var2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!i0VarO.equals(i0VarR2) ? new o13.p(g0Var2, i0VarO) : new o13.p(g0Var2, i0VarR2.c(getF68737b())));
                                            }
                                        }
                                        arrayListC0 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListC0 = arrayList4;
                        } else {
                            jVar3 = jVarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i16 = i19;
                            j14 = j15;
                        }
                        j15 = j14 >> 8;
                        i19 = i16 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarD = jVar3;
                    }
                    jVar2 = jVarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i17 != length) {
                    i17++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    jVarD = jVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i15 = 0; i15 < size2; i15++) {
                    o13.p pVar = (o13.p) arrayList2.get(i15);
                    g0Var = (g0) pVar.f128594a;
                    i0Var = (i0) pVar.f128595b;
                    i0Var.f68749a = j8;
                    synchronized (l.f68775c) {
                        i0Var.f68750b = g0Var.m();
                        g0Var.q(i0Var);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (arrayListC0 != null) {
                size = arrayListC0.size();
                for (i14 = 0; i14 < size; i14++) {
                    u0Var.l((g0) arrayListC0.get(i14));
                }
                arrayList3 = this.f68711j;
                if (arrayList3 != null) {
                    arrayListC0 = p13.h0.C0(arrayList3, arrayListC0);
                }
                this.f68711j = arrayListC0;
            }
            return g.b.f68741a;
        }
        arrayList = null;
        arrayListC0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i15 < size2) {
                o13.p pVar2 = (o13.p) arrayList2.get(i15);
                g0Var = (g0) pVar2.f128594a;
                i0Var = (i0) pVar2.f128595b;
                i0Var.f68749a = j8;
                synchronized (l.f68775c) {
                    i0Var.f68750b = g0Var.m();
                    g0Var.q(i0Var);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        if (arrayListC0 != null) {
            size = arrayListC0.size();
            while (i14 < size) {
                u0Var.l((g0) arrayListC0.get(i14));
            }
            arrayList3 = this.f68711j;
            if (arrayList3 != null) {
                arrayListC0 = p13.h0.C0(arrayList3, arrayListC0);
            }
            this.f68711j = arrayListC0;
        }
        return g.b.f68741a;
    }

    /* JADX INFO: renamed from: f4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf4/a$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1422a {
        public /* synthetic */ C1422a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1422a() {
        }
    }
}
