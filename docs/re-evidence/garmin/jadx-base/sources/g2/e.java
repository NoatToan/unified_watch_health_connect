package g2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg2/e;", "", "Lg2/t;", "cacheWindow", "", "enableInitialPrefetch", "<init>", "(Lg2/t;Z)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f75076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.i0<List<z0.b>> f75078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.j0 f75079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.i0<g> f75080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f75081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f75084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f75085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f75086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f75087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f75088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f75089n;

    public e(t tVar, boolean z14) {
        this.f75076a = tVar;
        this.f75077b = z14;
        this.f75078c = p1.o.a();
        int[] iArr = p1.q.f134798a;
        this.f75079d = new p1.j0(0, 1, null);
        this.f75080e = p1.o.a();
        this.f75082g = -1;
        this.f75084i = Integer.MAX_VALUE;
        this.f75085j = Integer.MIN_VALUE;
    }

    public final int f(f fVar, int i14, boolean z14) {
        List<z0.b> listB;
        List<z0.b> listB2;
        p1.i0<g> i0Var = this.f75080e;
        if (i0Var.a(i14)) {
            g gVarB = i0Var.b(i14);
            gVarB.getClass();
            return gVarB.f75118b;
        }
        p1.i0<List<z0.b>> i0Var2 = this.f75078c;
        int i15 = 0;
        if (i0Var2.a(i14)) {
            if (!z14 || (listB2 = i0Var2.b(i14)) == null) {
                return -1;
            }
            int size = listB2.size();
            while (i15 < size) {
                listB2.get(i15).d();
                i15++;
            }
            return -1;
        }
        i0Var2.i(i14, fVar.e(i14, new d(this, fVar, 0)));
        if (!z14 || (listB = i0Var2.b(i14)) == null) {
            return -1;
        }
        int size2 = listB.size();
        while (i15 < size2) {
            listB.get(i15).d();
            i15++;
        }
        return -1;
    }

    public final boolean g() {
        return (this.f75084i == Integer.MAX_VALUE || this.f75085j == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public final void h(f fVar, int i14, int i15) {
        int i16;
        g.a aVar = g.f75116c;
        p1.i0<g> i0Var = this.f75080e;
        g gVarB = i0Var.b(i14);
        if (gVarB != null) {
            gVarB.f75118b = i15;
            gVarB.f75117a = aVar;
        } else {
            gVarB = new g(aVar, i15);
        }
        i0Var.i(i14, gVarB);
        if (i14 > this.f75085j) {
            this.f75085j = i14;
            this.f75087l -= i15;
        } else if (i14 < this.f75084i) {
            this.f75084i = i14;
            this.f75086k -= i15;
        }
        if (Math.signum(this.f75081f) <= 0.0f) {
            if (this.f75087l > 0) {
                i16 = this.f75085j + 1;
            } else {
                i16 = -1;
            }
        } else if (Math.signum(this.f75081f) <= 0.0f || this.f75086k <= 0) {
            i16 = -1;
        } else {
            i16 = this.f75084i - 1;
        }
        if (i16 > 0 && fVar.g(i16) != -1 && fVar.g(i16) < this.f75089n) {
            this.f75078c.i(i16, fVar.e(i16, new d(this, fVar, 1)));
        }
        n();
    }

    public final void i(f fVar, int i14, int i15, int i16, int i17, int i18, float f14, boolean z14) {
        int i19;
        boolean z15 = Math.signum(f14) == Math.signum(this.f75081f);
        if (!z14) {
            if (!z15 || this.f75088m) {
                this.f75086k = i16 - i18;
                this.f75084i = i14;
            } else {
                int iC = MathKt.c(Math.abs(f14)) + this.f75086k;
                int i24 = i16 - i18;
                if (iC > i24) {
                    iC = i24;
                }
                this.f75086k = iC;
            }
            while (this.f75086k > 0 && (i19 = this.f75084i) > 0) {
                int iF = f(fVar, this.f75084i - 1, i19 + (-1) == i14 + (-1) && f14 != 0.0f && Math.abs(f14) >= ((float) i18));
                if (iF == -1) {
                    return;
                }
                this.f75084i--;
                this.f75086k -= iF;
            }
            return;
        }
        if (!z15 || this.f75088m) {
            this.f75087l = i16 - i17;
            this.f75085j = i15;
        } else {
            int iC2 = MathKt.c(Math.abs(f14)) + this.f75087l;
            int i25 = i16 - i17;
            if (iC2 > i25) {
                iC2 = i25;
            }
            this.f75087l = iC2;
        }
        while (this.f75087l > 0 && fVar.g(this.f75085j) != -1 && fVar.g(this.f75085j) < this.f75089n - 1) {
            int iF2 = f(fVar, this.f75085j + 1, this.f75085j + 1 == i15 + 1 && f14 != 0.0f && Math.abs(f14) >= ((float) i17));
            if (iF2 == -1) {
                return;
            }
            this.f75085j++;
            this.f75087l -= iF2;
        }
    }

    public final void j(f fVar, float f14) {
        int i14;
        int i15;
        n();
        boolean zA = fVar.a();
        t tVar = this.f75076a;
        if (zA) {
            fVar.c();
            if (fVar.getDensity() != null) {
                tVar.getClass();
            }
            this.f75089n = fVar.d();
            int iL = fVar.l();
            int iN = fVar.n();
            int iD = fVar.d();
            int iH = fVar.h();
            int i16 = fVar.i();
            p1.i0<g> i0Var = this.f75080e;
            if (f14 <= 0.0f) {
                this.f75086k = 0 - iH;
                this.f75084i = iL;
                while (this.f75086k > 0 && (i15 = this.f75084i) > 0 && i0Var.a(i15 - 1)) {
                    g gVarB = i0Var.b(this.f75084i - 1);
                    gVarB.getClass();
                    int i17 = gVarB.f75118b;
                    this.f75084i--;
                    this.f75086k -= i17;
                }
                l(0, this.f75084i - 1);
            } else {
                this.f75087l = 0 - i16;
                this.f75085j = iN;
                while (this.f75087l > 0 && (i14 = this.f75085j) < iD - 1 && i0Var.a(i14 + 1)) {
                    g gVarB2 = i0Var.b(this.f75085j + 1);
                    gVarB2.getClass();
                    int i18 = gVarB2.f75118b;
                    this.f75085j++;
                    this.f75087l -= i18;
                }
                l(this.f75085j + 1, iD - 1);
            }
        }
        if (fVar.a()) {
            fVar.c();
            int iA = fVar.getDensity() != null ? tVar.a() : 0;
            int iL2 = fVar.l();
            int iN2 = fVar.n();
            int iH2 = fVar.h();
            boolean z14 = false;
            int i19 = fVar.i();
            if (f14 <= 0.0f) {
                z14 = true;
            }
            i(fVar, iL2, iN2, iA, i19, iH2, f14, z14);
        }
        this.f75081f = f14;
        n();
    }

    public final void k(f fVar) {
        e eVar;
        f fVar2;
        int iA;
        boolean z14 = this.f75083h;
        t tVar = this.f75076a;
        if (!z14 && this.f75077b) {
            if (fVar.getDensity() != null) {
                fVar.c();
                iA = tVar.a();
            } else {
                iA = 0;
            }
            if (iA != 0) {
                this.f75088m = true;
            }
            this.f75083h = true;
        }
        int i14 = this.f75082g;
        if (i14 != -1 && i14 != fVar.d()) {
            this.f75088m = true;
            int i15 = this.f75084i;
            if (i15 < 0) {
                i15 = 0;
            }
            this.f75084i = i15;
            int iK = fVar.k();
            if (iK != -1) {
                int i16 = this.f75085j;
                if (i16 <= iK) {
                    iK = i16;
                }
                this.f75085j = iK;
            }
            if (this.f75081f <= 0.0f) {
                l(fVar.n(), this.f75089n - 1);
            } else {
                l(0, fVar.l());
            }
        }
        this.f75089n = fVar.d();
        if (fVar.a()) {
            int iM = fVar.m();
            for (int i17 = 0; i17 < iM; i17++) {
                int iF = fVar.f(i17);
                Object objJ = fVar.j(i17);
                int iB = fVar.b(i17);
                if (iF != -1) {
                    p1.i0<g> i0Var = this.f75080e;
                    if (i0Var.a(iF)) {
                        g gVarB = i0Var.b(iF);
                        gVarB.getClass();
                        int i18 = gVarB.f75118b;
                        g gVarB2 = i0Var.b(iF);
                        gVarB2.getClass();
                        Object obj = gVarB2.f75117a;
                        if (i18 != iB || !p005kotlin.jvm.internal.s.g(obj, objJ)) {
                            this.f75088m = true;
                        }
                    }
                    g gVarB3 = i0Var.b(iF);
                    if (gVarB3 != null) {
                        gVarB3.f75118b = iB;
                        gVarB3.f75117a = objJ;
                    } else {
                        gVarB3 = new g(g.f75116c, iB);
                    }
                    i0Var.i(iF, gVarB3);
                    this.f75084i = Math.min(this.f75084i, iF);
                    this.f75085j = Math.max(this.f75085j, iF);
                    List<z0.b> listG = this.f75078c.g(iF);
                    if (listG != null) {
                        int size = listG.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            listG.get(i19).cancel();
                        }
                    }
                }
            }
            if (this.f75088m) {
                boolean z15 = this.f75081f <= 0.0f;
                if (fVar.a()) {
                    fVar.c();
                    eVar = this;
                    fVar2 = fVar;
                    eVar.i(fVar2, fVar.l(), fVar.n(), fVar.getDensity() != null ? tVar.a() : 0, fVar.i(), fVar.h(), 0.0f, z15);
                } else {
                    eVar = this;
                    fVar2 = fVar;
                }
                eVar.f75088m = false;
            } else {
                eVar = this;
                fVar2 = fVar;
            }
        } else {
            eVar = this;
            fVar2 = fVar;
            m();
        }
        eVar.f75082g = fVar2.d();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0063 A[EDGE_INSN: B:63:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void l(int i14, int i15) {
        char c14;
        long j8;
        long j14;
        long j15;
        char c15;
        char c16;
        int i16;
        p1.j0 j0Var = this.f75079d;
        j0Var.c();
        p1.i0<List<z0.b>> i0Var = this.f75078c;
        int[] iArr = i0Var.f134773b;
        long[] jArr = i0Var.f134772a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i17 = 0;
            j8 = 128;
            j14 = 255;
            while (true) {
                long j16 = jArr[i17];
                c14 = 7;
                j15 = -9187201950435737472L;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j16 & 255) < 128 && i14 <= (i16 = iArr[(i17 << 3) + i19]) && i16 <= i15) {
                            j0Var.b(i16);
                        }
                        j16 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        } else {
            c14 = 7;
            j8 = 128;
            j14 = 255;
            j15 = -9187201950435737472L;
        }
        p1.i0<g> i0Var2 = this.f75080e;
        int[] iArr2 = i0Var2.f134773b;
        long[] jArr2 = i0Var2.f134772a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j17 = jArr2[i24];
                if ((((~j17) << c14) & j17 & j15) != j15) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j17 & j14) < j8) {
                            c16 = c14;
                            int i27 = iArr2[(i24 << 3) + i26];
                            if (i14 <= i27 && i27 <= i15) {
                                j0Var.b(i27);
                            }
                        } else {
                            c16 = c14;
                        }
                        j17 >>= 8;
                        i26++;
                        c14 = c16;
                    }
                    c15 = c14;
                    if (i25 != 8) {
                        break;
                    }
                } else {
                    c15 = c14;
                }
                if (i24 == length2) {
                    break;
                }
                i24++;
                c14 = c15;
            }
        } else {
            c15 = c14;
        }
        int[] iArr3 = j0Var.f134794b;
        long[] jArr3 = j0Var.f134793a;
        int length3 = jArr3.length - 2;
        if (length3 < 0) {
            return;
        }
        int i28 = 0;
        while (true) {
            long j18 = jArr3[i28];
            if ((((~j18) << c15) & j18 & j15) != j15) {
                int i29 = 8 - ((~(i28 - length3)) >>> 31);
                for (int i30 = 0; i30 < i29; i30++) {
                    if ((j18 & j14) < j8) {
                        int i34 = iArr3[(i28 << 3) + i30];
                        List<z0.b> listG = i0Var.g(i34);
                        if (listG != null) {
                            int size = listG.size();
                            for (int i35 = 0; i35 < size; i35++) {
                                listG.get(i35).cancel();
                            }
                        }
                        i0Var2.g(i34);
                    }
                    j18 >>= 8;
                }
                if (i29 != 8) {
                    return;
                }
            }
            if (i28 == length3) {
                return;
            } else {
                i28++;
            }
        }
    }

    public final void m() {
        this.f75084i = Integer.MAX_VALUE;
        this.f75085j = Integer.MIN_VALUE;
        this.f75086k = 0;
        this.f75087l = 0;
        this.f75088m = false;
        this.f75080e.c();
        p1.i0<List<z0.b>> i0Var = this.f75078c;
        long[] jArr = i0Var.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        int i17 = (i14 << 3) + i16;
                        int i18 = i0Var.f134773b[i17];
                        List list = (List) i0Var.f134774c[i17];
                        int size = list.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            ((z0.b) list.get(i19)).cancel();
                        }
                        i0Var.h(i17);
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final void n() {
        i6.a.a(this.f75086k, "prefetchWindowStartExtraSpace");
        i6.a.a(this.f75087l, "prefetchWindowEndExtraSpace");
        i6.a.a(this.f75084i, "prefetchWindowStartIndex");
        i6.a.a(this.f75085j, "prefetchWindowEndIndex");
    }

    public /* synthetic */ e(t tVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(tVar, (i14 & 2) != 0 ? true : z14);
    }
}
