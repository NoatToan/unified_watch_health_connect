package g2;

import ch.qos.logback.core.CoreConstants;
import g2.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lg2/b0;", "Lg2/t0;", "T", "", "<init>", "()V", "c", "a", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0<T extends t0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f75036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75037c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f75044j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.t0<Object, b0<T>.c> f75035a = p1.g1.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.u0<Object> f75038d = p1.i1.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f75039e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f75040f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f75041g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f75042h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f75043i = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h4.r f75045k = new a(this);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/b0$a;", "Lh5/x0;", "Lg2/b0$b;", "Lg2/b0;", "animator", "<init>", "(Lg2/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends h5.x0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0<?> f75046a;

        public a(b0<?> b0Var) {
            this.f75046a = b0Var;
        }

        @Override // h5.x0
        public final h4.r.c create() {
            return new b(this.f75046a);
        }

        @Override // h5.x0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f75046a, ((a) obj).f75046a);
        }

        @Override // h5.x0
        public final int hashCode() {
            return this.f75046a.hashCode();
        }

        @Override // h5.x0
        public final void inspectableProperties(m2 m2Var) {
            m2Var.f91341a = "DisplayingDisappearingItemsElement";
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f75046a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // h5.x0
        public final void update(h4.r.c cVar) {
            b bVar = (b) cVar;
            b0<?> b0Var = bVar.f75047a;
            b0<?> b0Var2 = this.f75046a;
            if (p005kotlin.jvm.internal.s.g(b0Var, b0Var2) || !bVar.getNode().getIsAttached()) {
                return;
            }
            b0<?> b0Var3 = bVar.f75047a;
            b0Var3.e();
            b0Var3.f75036b = null;
            b0Var3.f75037c = -1;
            b0Var2.f75044j = bVar;
            bVar.f75047a = b0Var2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/b0$b;", "Lh4/r$c;", "Lh5/s;", "Lg2/b0;", "animator", "<init>", "(Lg2/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends h4.r.c implements h5.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0<?> f75047a;

        public b(b0<?> b0Var) {
            this.f75047a = b0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f75047a, ((b) obj).f75047a);
        }

        public final int hashCode() {
            return this.f75047a.hashCode();
        }

        @Override // h4.r.c
        public final void onAttach() {
            this.f75047a.f75044j = this;
        }

        @Override // h4.r.c
        public final void onDetach() {
            b0<?> b0Var = this.f75047a;
            b0Var.e();
            b0Var.f75036b = null;
            b0Var.f75037c = -1;
        }

        @Override // h5.s
        public final void p(h5.h0 h0Var) {
            q4.a aVar = h0Var.f81825a;
            ArrayList arrayList = this.f75047a.f75043i;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                v vVar = (v) arrayList.get(i14);
                r4.c cVar = vVar.f75265n;
                if (cVar != null) {
                    long j8 = vVar.f75264m;
                    g6.k.a aVar2 = g6.k.f76003b;
                    long j14 = cVar.f150160t;
                    float f14 = ((int) (j8 >> 32)) - ((int) (j14 >> 32));
                    float f15 = ((int) (j8 & 4294967295L)) - ((int) (j14 & 4294967295L));
                    aVar.f142543b.f142550a.h(f14, f15);
                    try {
                        r4.e.a(h0Var, cVar);
                        aVar.f142543b.f142550a.h(-f14, -f15);
                    } catch (Throwable th3) {
                        aVar.f142543b.f142550a.h(-f14, -f15);
                        throw th3;
                    }
                }
            }
            h0Var.m1();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f75047a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/b0$c;", "", "<init>", "(Lg2/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g6.a f75049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f75050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f75051d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f75053f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f75054g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v[] f75048a = p.f75195a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f75052e = 1;

        public c() {
        }

        public static void b(c cVar, t0 t0Var, o53.b0 b0Var, o4.q0 q0Var, int i14, int i15) {
            long j8;
            b0.this.getClass();
            long jO = t0Var.o(0);
            if (t0Var.getF62561c()) {
                g6.k.a aVar = g6.k.f76003b;
                j8 = jO >> 32;
            } else {
                g6.k.a aVar2 = g6.k.f76003b;
                j8 = jO & 4294967295L;
            }
            cVar.a(t0Var, b0Var, q0Var, i14, i15, (int) j8);
        }

        public final void a(T t7, o53.b0 b0Var, o4.q0 q0Var, int i14, int i15, int i16) {
            v[] vVarArr;
            v[] vVarArr2 = this.f75048a;
            int length = vVarArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    this.f75053f = i14;
                    this.f75054g = i15;
                    break;
                } else {
                    v vVar = vVarArr2[i17];
                    if (vVar != null && vVar.f75258g) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            int iB = t7.b();
            int length2 = this.f75048a.length;
            while (true) {
                vVarArr = this.f75048a;
                if (iB >= length2) {
                    break;
                }
                v vVar2 = vVarArr[iB];
                if (vVar2 != null) {
                    vVar2.c();
                }
                iB++;
            }
            if (vVarArr.length != t7.b()) {
                this.f75048a = (v[]) Arrays.copyOf(this.f75048a, t7.b());
            }
            this.f75049b = g6.a.a(t7.getF62573o());
            this.f75050c = i16;
            this.f75051d = t7.getF68161n();
            this.f75052e = t7.getF62576r();
            int iB2 = t7.b();
            for (int i18 = 0; i18 < iB2; i18++) {
                Object objN = t7.n(i18);
                m mVar = objN instanceof m ? (m) objN : null;
                v[] vVarArr3 = this.f75048a;
                if (mVar == null) {
                    v vVar3 = vVarArr3[i18];
                    if (vVar3 != null) {
                        vVar3.c();
                    }
                    this.f75048a[i18] = null;
                } else {
                    v vVar4 = vVarArr3[i18];
                    if (vVar4 == null) {
                        vVar4 = new v(b0Var, q0Var, new fe2.z(b0.this, 9));
                        this.f75048a[i18] = vVar4;
                    }
                    vVar4.f75255d = mVar.f75167a;
                    vVar4.f75256e = mVar.f75168b;
                    vVar4.f75257f = mVar.f75169c;
                }
            }
        }
    }

    public static void c(t0 t0Var, int i14, c cVar) {
        int i15 = 0;
        long jO = t0Var.o(0);
        long jB = t0Var.getF62561c() ? g6.k.b(0, i14, 1, jO) : g6.k.b(i14, 0, 2, jO);
        v[] vVarArr = cVar.f75048a;
        int length = vVarArr.length;
        int i16 = 0;
        while (i15 < length) {
            v vVar = vVarArr[i15];
            int i17 = i16 + 1;
            if (vVar != null) {
                vVar.f75263l = g6.k.e(jB, g6.k.d(t0Var.o(i16), jO));
            }
            i15++;
            i16 = i17;
        }
    }

    public static int h(int[] iArr, t0 t0Var) {
        int iJ = t0Var.getF68161n();
        int iL = t0Var.getF62576r() + iJ;
        int iMax = 0;
        while (iJ < iL) {
            int i14 = t0Var.getF62577s() + iArr[iJ];
            iArr[iJ] = i14;
            iMax = Math.max(iMax, i14);
            iJ++;
        }
        return iMax;
    }

    public final v a(int i14, Object obj) {
        b0<T>.c cVarD = this.f75035a.d(obj);
        if (cVarD != null) {
            return cVarD.f75048a[i14];
        }
        return null;
    }

    public final long b() {
        g6.m.f76012b.getClass();
        ArrayList arrayList = this.f75043i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            v vVar = (v) arrayList.get(i14);
            r4.c cVar = vVar.f75265n;
            if (cVar != null) {
                long j8 = vVar.f75263l;
                g6.k.a aVar = g6.k.f76003b;
                int iMax = Math.max((int) (jMax >> 32), ((int) (j8 >> 32)) + ((int) (cVar.f150161u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (vVar.f75263l & 4294967295L)) + ((int) (cVar.f150161u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:253:0x00dd A[EDGE_INSN: B:253:0x00dd->B:48:0x00dd BREAK  A[LOOP:2: B:35:0x00a3->B:47:0x00da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[LOOP:2: B:35:0x00a3->B:47:0x00da, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v26, types: [o53.d0, t13.d, t13.g] */
    public final void d(int i14, int i15, int i16, ArrayList arrayList, k0 k0Var, u0 u0Var, boolean z14, boolean z15, int i17, boolean z16, int i18, int i19, o53.b0 b0Var, o4.q0 q0Var) {
        p1.t0<Object, b0<T>.c> t0Var;
        Object obj;
        long j8;
        long j14;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        p1.t0<Object, b0<T>.c> t0Var2;
        p1.u0<Object> u0Var2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        k0 k0Var2;
        int[] iArr2;
        p1.t0<Object, b0<T>.c> t0Var3;
        int i24;
        long j15;
        long[] jArr;
        int i25;
        long[] jArr2;
        p1.u0<Object> u0Var3;
        p1.t0<Object, b0<T>.c> t0Var4;
        long j16;
        ArrayList arrayList7;
        int i26;
        int i27;
        long j17;
        ArrayList arrayList8 = arrayList;
        int i28 = i17;
        k0 k0Var3 = this.f75036b;
        this.f75036b = k0Var;
        int size = arrayList8.size();
        int i29 = 0;
        loop0: while (true) {
            t0Var = this.f75035a;
            if (i29 >= size) {
                obj = null;
                if (!t0Var.e()) {
                    break;
                }
                e();
                return;
            }
            t0 t0Var5 = (t0) arrayList8.get(i29);
            int iB = t0Var5.b();
            for (int i30 = 0; i30 < iB; i30++) {
                obj = null;
                Object objN = t0Var5.n(i30);
                if ((objN instanceof m ? (m) objN : null) != null) {
                    break loop0;
                }
            }
            i29++;
        }
        int i34 = this.f75037c;
        t0 t0Var6 = (t0) p13.h0.d0(arrayList8);
        this.f75037c = t0Var6 != null ? t0Var6.getF62559a() : 0;
        if (z14) {
            j8 = 4294967295L;
            j14 = (((long) i14) & 4294967295L) | (((long) 0) << 32);
            g6.k.a aVar = g6.k.f76003b;
        } else {
            j8 = 4294967295L;
            j14 = (((long) i14) << 32) | (((long) 0) & 4294967295L);
            g6.k.a aVar2 = g6.k.f76003b;
        }
        boolean z17 = z15 || !z16;
        Object[] objArr = t0Var.f134721b;
        long[] jArr3 = t0Var.f134720a;
        int length = jArr3.length - 2;
        p1.u0<Object> u0Var4 = this.f75038d;
        boolean z18 = z17;
        if (length >= 0) {
            int i35 = 0;
            while (true) {
                long j18 = jArr3[i35];
                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i35 != length) {
                        break;
                        break;
                    }
                    i35++;
                } else {
                    int i36 = 8 - ((~(i35 - length)) >>> 31);
                    for (int i37 = 0; i37 < i36; i37++) {
                        if ((j18 & 255) < 128) {
                            u0Var4.d(objArr[(i35 << 3) + i37]);
                        }
                        j18 >>= 8;
                    }
                    if (i36 != 8) {
                        break;
                    } else if (i35 != length) {
                        break;
                    } else {
                        i35++;
                    }
                }
            }
        }
        int size2 = arrayList8.size();
        int i38 = 0;
        while (true) {
            arrayList2 = this.f75043i;
            arrayList3 = this.f75040f;
            arrayList4 = this.f75039e;
            if (i38 >= size2) {
                break;
            }
            t0 t0Var7 = (t0) arrayList8.get(i38);
            int i39 = size2;
            u0Var4.l(t0Var7.getF62570l());
            int iB2 = t0Var7.b();
            int i44 = i38;
            int i45 = 0;
            while (true) {
                if (i45 >= iB2) {
                    f(t0Var7.getF62570l());
                    Unit unit = Unit.INSTANCE;
                    break;
                }
                int i46 = iB2;
                Object objN2 = t0Var7.n(i45);
                int i47 = i45;
                if ((objN2 instanceof m ? (m) objN2 : obj) != null) {
                    b0<T>.c cVarD = t0Var.d(t0Var7.getF62570l());
                    int iA = k0Var3 != null ? k0Var3.a(t0Var7.getF62570l()) : -1;
                    boolean z19 = iA == -1 && k0Var3 != null;
                    if (cVarD != null) {
                        boolean z24 = z19;
                        if (z18) {
                            c.b(cVarD, t0Var7, b0Var, q0Var, i18, i19);
                            v[] vVarArr = cVarD.f75048a;
                            int length2 = vVarArr.length;
                            int i48 = 0;
                            while (i48 < length2) {
                                v[] vVarArr2 = vVarArr;
                                v vVar = vVarArr2[i48];
                                int i49 = length2;
                                int i54 = i48;
                                if (vVar != null) {
                                    long j19 = vVar.f75263l;
                                    v.f75250s.getClass();
                                    if (!g6.k.c(j19, v.f75251t)) {
                                        vVar.f75263l = g6.k.e(vVar.f75263l, j14);
                                    }
                                }
                                i48 = i54 + 1;
                                vVarArr = vVarArr2;
                                length2 = i49;
                            }
                            if (z24) {
                                for (v vVar2 : cVarD.f75048a) {
                                    if (vVar2 != null) {
                                        if (vVar2.b()) {
                                            arrayList2.remove(vVar2);
                                            b bVar = this.f75044j;
                                            if (bVar != null) {
                                                h5.t.a(bVar);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                        }
                                        vVar2.a();
                                    }
                                }
                            }
                            g(t0Var7, false);
                        }
                        Unit unit3 = Unit.INSTANCE;
                        break;
                    }
                    b0<T>.c cVar = new c();
                    c.b(cVar, t0Var7, b0Var, q0Var, i18, i19);
                    boolean z25 = z19;
                    t0Var.m(t0Var7.getF62570l(), cVar);
                    if (t0Var7.getF62559a() != iA && iA != -1) {
                        if (iA < i34) {
                            arrayList4.add(t0Var7);
                            break;
                        } else {
                            arrayList3.add(t0Var7);
                            break;
                        }
                    }
                    long jO = t0Var7.o(0);
                    if (t0Var7.getF62561c()) {
                        g6.k.a aVar3 = g6.k.f76003b;
                        j17 = jO & j8;
                    } else {
                        g6.k.a aVar4 = g6.k.f76003b;
                        j17 = jO >> 32;
                    }
                    c(t0Var7, (int) j17, cVar);
                    if (z25) {
                        v[] vVarArr3 = cVar.f75048a;
                        for (v vVar3 : vVarArr3) {
                            if (vVar3 != null) {
                                vVar3.a();
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                    }
                    Unit unit5 = Unit.INSTANCE;
                    break;
                }
                i45 = i47 + 1;
                iB2 = i46;
            }
            i38 = i44 + 1;
            arrayList8 = arrayList;
            size2 = i39;
        }
        int[] iArr3 = new int[i28];
        if (z18 && k0Var3 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    p13.c0.u(arrayList4, new e0(k0Var3));
                }
                int size3 = arrayList4.size();
                for (int i55 = 0; i55 < size3; i55++) {
                    t0 t0Var8 = (t0) arrayList4.get(i55);
                    int iH = i18 - h(iArr3, t0Var8);
                    b0<T>.c cVarD2 = t0Var.d(t0Var8.getF62570l());
                    cVarD2.getClass();
                    c(t0Var8, iH, cVarD2);
                    g(t0Var8, false);
                }
                Arrays.fill(iArr3, 0, i28, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    p13.c0.u(arrayList3, new c0(k0Var3));
                }
                int size4 = arrayList3.size();
                for (int i56 = 0; i56 < size4; i56++) {
                    t0 t0Var9 = (t0) arrayList3.get(i56);
                    int iH2 = (h(iArr3, t0Var9) + i19) - t0Var9.getF62577s();
                    b0<T>.c cVarD3 = t0Var.d(t0Var9.getF62570l());
                    cVarD3.getClass();
                    c(t0Var9, iH2, cVarD3);
                    g(t0Var9, false);
                }
                Arrays.fill(iArr3, 0, i28, 0);
            }
        }
        Object[] objArr2 = u0Var4.f134733b;
        long[] jArr4 = u0Var4.f134732a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList9 = this.f75042h;
        ArrayList arrayList10 = this.f75041g;
        if (length3 >= 0) {
            p1.u0<Object> u0Var5 = u0Var4;
            arrayList5 = arrayList3;
            int i57 = 0;
            while (true) {
                long j24 = jArr4[i57];
                iArr = iArr3;
                Object[] objArr3 = objArr2;
                if ((((~j24) << 7) & j24 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i58 = 8 - ((~(i57 - length3)) >>> 31);
                    int i59 = 0;
                    while (i59 < i58) {
                        if ((j24 & 255) < 128) {
                            i25 = i59;
                            Object obj2 = objArr3[(i57 << 3) + i59];
                            jArr2 = jArr4;
                            b0<T>.c cVarD4 = t0Var.d(obj2);
                            if (cVarD4 != 0) {
                                u0Var3 = u0Var5;
                                j16 = j24;
                                int iA2 = k0Var.a(obj2);
                                int iMin = Math.min(i28, cVarD4.f75052e);
                                cVarD4.f75052e = iMin;
                                arrayList7 = arrayList4;
                                cVarD4.f75051d = Math.min(i28 - iMin, cVarD4.f75051d);
                                if (iA2 == -1) {
                                    v[] vVarArr4 = cVarD4.f75048a;
                                    int length4 = vVarArr4.length;
                                    int i64 = 0;
                                    boolean z26 = false;
                                    int i65 = 0;
                                    while (i64 < length4) {
                                        v[] vVarArr5 = vVarArr4;
                                        v vVar4 = vVarArr5[i64];
                                        int i66 = i65 + 1;
                                        if (vVar4 != null) {
                                            if (vVar4.b()) {
                                                Unit unit6 = Unit.INSTANCE;
                                                t0Var = t0Var;
                                                i26 = i64;
                                                i27 = length4;
                                                z26 = true;
                                            } else {
                                                i26 = i64;
                                                if (((Boolean) vVar4.f75262k.getF182175a()).booleanValue()) {
                                                    vVar4.c();
                                                    cVarD4.f75048a[i65] = obj;
                                                    arrayList2.remove(vVar4);
                                                    b bVar2 = this.f75044j;
                                                    if (bVar2 != null) {
                                                        h5.t.a(bVar2);
                                                        Unit unit7 = Unit.INSTANCE;
                                                    }
                                                } else {
                                                    r4.c cVar2 = vVar4.f75265n;
                                                    if (cVar2 != null) {
                                                        i27 = length4;
                                                        s1.f0<Float> f0Var = vVar4.f75257f;
                                                        if (!vVar4.b() && f0Var != null) {
                                                            vVar4.e(true);
                                                            ?? r14 = obj;
                                                            ge1.b.T(vVar4.f75252a, r14, r14, new x(vVar4, f0Var, cVar2, r14), 3);
                                                        }
                                                    } else {
                                                        i27 = length4;
                                                    }
                                                    if (vVar4.b()) {
                                                        arrayList2.add(vVar4);
                                                        b bVar3 = this.f75044j;
                                                        if (bVar3 != null) {
                                                            h5.t.a(bVar3);
                                                            Unit unit8 = Unit.INSTANCE;
                                                        }
                                                        obj = null;
                                                        z26 = true;
                                                    } else {
                                                        vVar4.c();
                                                        obj = null;
                                                        cVarD4.f75048a[i65] = null;
                                                    }
                                                    Unit unit9 = Unit.INSTANCE;
                                                }
                                            }
                                            i64 = i26 + 1;
                                            vVarArr4 = vVarArr5;
                                            i65 = i66;
                                            length4 = i27;
                                            t0Var = t0Var;
                                        } else {
                                            i26 = i64;
                                        }
                                        i27 = length4;
                                        i64 = i26 + 1;
                                        vVarArr4 = vVarArr5;
                                        i65 = i66;
                                        length4 = i27;
                                        t0Var = t0Var;
                                    }
                                    t0Var4 = t0Var;
                                    if (!z26) {
                                        f(obj2);
                                    }
                                    Unit unit10 = Unit.INSTANCE;
                                } else {
                                    t0Var4 = t0Var;
                                    g6.a aVar5 = cVarD4.f75049b;
                                    aVar5.getClass();
                                    t0 t0VarA = u0Var.a(iA2, cVarD4.f75051d, cVarD4.f75052e, aVar5.f75988a);
                                    t0VarA.k();
                                    v[] vVarArr6 = cVarD4.f75048a;
                                    int length5 = vVarArr6.length;
                                    int i67 = 0;
                                    while (true) {
                                        if (i67 < length5) {
                                            v vVar5 = vVarArr6[i67];
                                            if (vVar5 == null || !((Boolean) vVar5.f75259h.getF182175a()).booleanValue()) {
                                                i67++;
                                            }
                                        } else if (k0Var3 != null && iA2 == k0Var3.a(obj2)) {
                                            f(obj2);
                                            Unit unit11 = Unit.INSTANCE;
                                        }
                                        cVarD4.a(t0VarA, b0Var, q0Var, i18, i19, cVarD4.f75050c);
                                        if (iA2 < this.f75037c) {
                                            arrayList10.add(t0VarA);
                                        } else {
                                            arrayList9.add(t0VarA);
                                        }
                                    }
                                }
                            }
                            j24 = j16 >> 8;
                            i28 = i17;
                            i59 = i25 + 1;
                            u0Var5 = u0Var3;
                            jArr4 = jArr2;
                            arrayList4 = arrayList7;
                            t0Var = t0Var4;
                        } else {
                            i25 = i59;
                            jArr2 = jArr4;
                        }
                        u0Var3 = u0Var5;
                        t0Var4 = t0Var;
                        j16 = j24;
                        arrayList7 = arrayList4;
                        j24 = j16 >> 8;
                        i28 = i17;
                        i59 = i25 + 1;
                        u0Var5 = u0Var3;
                        jArr4 = jArr2;
                        arrayList4 = arrayList7;
                        t0Var = t0Var4;
                    }
                    jArr = jArr4;
                    u0Var2 = u0Var5;
                    t0Var2 = t0Var;
                    arrayList6 = arrayList4;
                    if (i58 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    u0Var2 = u0Var5;
                    t0Var2 = t0Var;
                    arrayList6 = arrayList4;
                }
                if (i57 == length3) {
                    break;
                }
                i57++;
                i28 = i17;
                iArr3 = iArr;
                objArr2 = objArr3;
                u0Var5 = u0Var2;
                jArr4 = jArr;
                arrayList4 = arrayList6;
                t0Var = t0Var2;
            }
        } else {
            iArr = iArr3;
            t0Var2 = t0Var;
            u0Var2 = u0Var4;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
        }
        if (arrayList10.isEmpty()) {
            k0Var2 = k0Var;
            iArr2 = iArr;
            t0Var3 = t0Var2;
        } else {
            if (arrayList10.size() > 1) {
                k0Var2 = k0Var;
                p13.c0.u(arrayList10, new f0(k0Var2));
            } else {
                k0Var2 = k0Var;
            }
            int size5 = arrayList10.size();
            int i68 = 0;
            while (i68 < size5) {
                t0 t0Var10 = (t0) arrayList10.get(i68);
                p1.t0<Object, b0<T>.c> t0Var11 = t0Var2;
                b0<T>.c cVarD5 = t0Var11.d(t0Var10.getF62570l());
                cVarD5.getClass();
                b0<T>.c cVar3 = cVarD5;
                int[] iArr4 = iArr;
                int iH3 = h(iArr4, t0Var10);
                if (z15) {
                    t0 t0Var12 = (t0) p13.h0.b0(arrayList);
                    long jO2 = t0Var12.o(0);
                    if (t0Var12.getF62561c()) {
                        g6.k.a aVar6 = g6.k.f76003b;
                        j15 = jO2 & j8;
                    } else {
                        g6.k.a aVar7 = g6.k.f76003b;
                        j15 = jO2 >> 32;
                    }
                    i24 = (int) j15;
                } else {
                    i24 = cVar3.f75053f;
                }
                t0Var10.c(i24 - iH3, cVar3.f75050c, i15, i16);
                if (z18) {
                    g(t0Var10, true);
                }
                i68++;
                t0Var2 = t0Var11;
                iArr = iArr4;
            }
            iArr2 = iArr;
            t0Var3 = t0Var2;
            Arrays.fill(iArr2, 0, i17, 0);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > 1) {
                p13.c0.u(arrayList9, new d0(k0Var2));
            }
            int size6 = arrayList9.size();
            for (int i69 = 0; i69 < size6; i69++) {
                t0 t0Var13 = (t0) arrayList9.get(i69);
                b0<T>.c cVarD6 = t0Var3.d(t0Var13.getF62570l());
                cVarD6.getClass();
                b0<T>.c cVar4 = cVarD6;
                t0Var13.c((cVar4.f75054g - t0Var13.getF62577s()) + h(iArr2, t0Var13), cVar4.f75050c, i15, i16);
                if (z18) {
                    g(t0Var13, true);
                }
            }
        }
        Collections.reverse(arrayList10);
        Unit unit12 = Unit.INSTANCE;
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        u0Var2.e();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void e() {
        p1.t0<Object, b0<T>.c> t0Var = this.f75035a;
        if (t0Var.f()) {
            Object[] objArr = t0Var.f134722c;
            long[] jArr = t0Var.f134720a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j8) < 128) {
                                for (v vVar : ((c) objArr[(i14 << 3) + i16]).f75048a) {
                                    if (vVar != null) {
                                        vVar.c();
                                    }
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        } else if (i14 != length) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
            t0Var.g();
        }
    }

    public final void f(Object obj) {
        b0<T>.c cVarK = this.f75035a.k(obj);
        if (cVarK != null) {
            for (v vVar : cVarK.f75048a) {
                if (vVar != null) {
                    vVar.c();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(T t7, boolean z14) {
        b0<T>.c cVarD = this.f75035a.d(t7.getF62570l());
        cVarD.getClass();
        v[] vVarArr = cVarD.f75048a;
        int length = vVarArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            v vVar = vVarArr[i14];
            int i16 = i15 + 1;
            if (vVar != null) {
                long jO = t7.o(i15);
                long j8 = vVar.f75263l;
                v.f75250s.getClass();
                if (!g6.k.c(j8, v.f75251t) && !g6.k.c(j8, jO)) {
                    long jD = g6.k.d(jO, j8);
                    s1.f0<g6.k> f0Var = vVar.f75256e;
                    if (f0Var != null) {
                        long jD2 = g6.k.d(((g6.k) vVar.f75268q.getF182175a()).f76005a, jD);
                        vVar.g(jD2);
                        vVar.f(true);
                        vVar.f75258g = z14;
                        ge1.b.T(vVar.f75252a, null, null, new y(vVar, f0Var, jD2, null), 3);
                    }
                }
                vVar.f75263l = jO;
            }
            i14++;
            i15 = i16;
        }
    }
}
