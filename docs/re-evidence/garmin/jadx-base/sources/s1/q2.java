package s1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\b\u0016\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBE\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls1/q2;", "Ls1/r;", "V", "Ls1/k2;", "", "", "Lo13/p;", "Ls1/b0;", "keyframes", "durationMillis", "delayMillis", "<init>", "(Ljava/util/Map;II)V", "Lp1/l;", "timestamps", "Lp1/n;", "Ls1/p2;", "defaultEasing", "Ls1/t;", "initialArcMode", "(Lp1/l;Lp1/n;IILs1/b0;ILkotlin/jvm/internal/j;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q2<V extends r> implements k2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.l f155708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.n<p2<V>> f155709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f155711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f155712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f155713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f155714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f155715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public V f155716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public V f155717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V f155718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V f155719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f155720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f155721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f155722o;

    /* JADX WARN: Multi-variable type inference failed */
    public q2(Map<Integer, ? extends o13.p<? extends V, ? extends b0>> map, int i14, int i15) {
        p1.h0 h0Var = new p1.h0(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends o13.p<? extends V, ? extends b0>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            h0Var.d(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            h0Var.c();
        }
        if (!map.containsKey(Integer.valueOf(i14))) {
            h0Var.d(i14);
        }
        int i16 = h0Var.f134763b;
        if (i16 != 0) {
            int[] iArr = h0Var.f134762a;
            iArr.getClass();
            Arrays.sort(iArr, 0, i16);
        }
        p1.i0 i0Var = new p1.i0(0, 1, null);
        for (Map.Entry<Integer, ? extends o13.p<? extends V, ? extends b0>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            o13.p<? extends V, ? extends b0> value = entry.getValue();
            r rVar = (r) value.f128594a;
            b0 b0Var = (b0) value.f128595b;
            t.f155740b.getClass();
            i0Var.i(iIntValue, new p2(rVar, b0Var, 0, null));
        }
        c0 c0Var = e0.f155563d;
        t.f155740b.getClass();
        this(h0Var, i0Var, i14, i15, c0Var, 0, null);
    }

    @Override // s1.k2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF155710c() {
        return this.f155710c;
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        int[] iArr = i2.f155600a;
        long j14 = (j8 / 1000000) - ((long) this.f155711d);
        long j15 = this.f155710c;
        if (j14 < 0) {
            j14 = 0;
        }
        long j16 = j14 > j15 ? j15 : j14;
        if (j16 < 0) {
            return v16;
        }
        j(v14, v15, v16);
        V v17 = this.f155717j;
        v17.getClass();
        int i14 = 0;
        if (this.f155722o != i2.f155602c) {
            int i15 = (int) j16;
            float fI = i(h(i15), i15, false);
            float[] fArr = this.f155721n;
            u.a[][] aVarArr = this.f155722o.f155789a;
            float f14 = aVarArr[0][0].f155790a;
            float f15 = aVarArr[aVarArr.length - 1][0].f155791b;
            if (fI < f14) {
                fI = f14;
            }
            if (fI <= f15) {
                f15 = fI;
            }
            int length = fArr.length;
            boolean z14 = false;
            for (u.a[] aVarArr2 : aVarArr) {
                int i16 = 0;
                int i17 = 0;
                while (i16 < length - 1) {
                    u.a aVar = aVarArr2[i17];
                    if (f15 <= aVar.f155791b) {
                        if (aVar.f155805p) {
                            fArr[i16] = aVar.f155806q;
                            fArr[i16 + 1] = aVar.f155807r;
                        } else {
                            aVar.c(f15);
                            fArr[i16] = aVar.a();
                            fArr[i16 + 1] = aVar.b();
                        }
                        z14 = true;
                    }
                    i16 += 2;
                    i17++;
                }
                if (z14) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i14 < length2) {
                v17.e(fArr[i14], i14);
                i14++;
            }
        } else {
            r rVarF = f((j16 - 1) * 1000000, v14, v15, v16);
            r rVarF2 = f(j16 * 1000000, v14, v15, v16);
            int f155699e = rVarF.getF155699e();
            while (i14 < f155699e) {
                v17.e((rVarF.a(i14) - rVarF2.a(i14)) * 1000.0f, i14);
                i14++;
            }
        }
        return v17;
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        V v17;
        V v18;
        float f14;
        V v19 = v14;
        V v24 = v15;
        int[] iArr = i2.f155600a;
        long j14 = (j8 / 1000000) - ((long) this.f155711d);
        int i14 = this.f155710c;
        long j15 = i14;
        if (j14 < 0) {
            j14 = 0;
        }
        if (j14 <= j15) {
            j15 = j14;
        }
        int i15 = (int) j15;
        p1.n<p2<V>> nVar = this.f155709b;
        p2<V> p2VarB = nVar.b(i15);
        if (p2VarB != null) {
            return p2VarB.f155692a;
        }
        if (i15 >= i14) {
            return v24;
        }
        if (i15 <= 0) {
            return v19;
        }
        j(v19, v24, v16);
        V v25 = this.f155716i;
        v25.getClass();
        int i16 = 0;
        boolean z14 = true;
        if (this.f155722o != i2.f155602c) {
            float fI = i(h(i15), i15, false);
            float[] fArr = this.f155720m;
            u.a[][] aVarArr = this.f155722o.f155789a;
            int length = aVarArr.length - 1;
            float f15 = aVarArr[0][0].f155790a;
            float f16 = aVarArr[length][0].f155791b;
            int length2 = fArr.length;
            if (fI < f15 || fI > f16) {
                if (fI > f16) {
                    f15 = f16;
                } else {
                    length = 0;
                }
                float f17 = fI - f15;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length2 - 1) {
                    u.a aVar = aVarArr[length][i18];
                    boolean z15 = aVar.f155805p;
                    float f18 = aVar.f155807r;
                    float f19 = aVar.f155806q;
                    if (z15) {
                        float f22 = aVar.f155790a;
                        float f24 = aVar.f155800k;
                        f14 = f17;
                        float f25 = aVar.f155792c;
                        fArr[i17] = (f14 * f19) + j20.x.a(aVar.f155794e, f25, (f15 - f22) * f24, f25);
                        float f26 = (f15 - f22) * f24;
                        float f27 = aVar.f155793d;
                        fArr[i17 + 1] = (f14 * f18) + j20.x.a(aVar.f155795f, f27, f26, f27);
                    } else {
                        f14 = f17;
                        aVar.c(f15);
                        fArr[i17] = (aVar.a() * f14) + (aVar.f155803n * aVar.f155797h) + f19;
                        fArr[i17 + 1] = (aVar.b() * f14) + (aVar.f155804o * aVar.f155798i) + f18;
                    }
                    i17 += 2;
                    i18++;
                    f17 = f14;
                    aVarArr = aVarArr;
                }
            } else {
                int length3 = aVarArr.length;
                int i19 = 0;
                boolean z16 = false;
                while (i19 < length3) {
                    int i24 = i16;
                    int i25 = i24;
                    while (i24 < length2 - 1) {
                        u.a aVar2 = aVarArr[i19][i25];
                        if (fI <= aVar2.f155791b) {
                            if (aVar2.f155805p) {
                                float f28 = aVar2.f155790a;
                                float f29 = aVar2.f155800k;
                                float f34 = aVar2.f155792c;
                                fArr[i24] = j20.x.a(aVar2.f155794e, f34, (fI - f28) * f29, f34);
                                float f35 = aVar2.f155793d;
                                fArr[i24 + 1] = j20.x.a(aVar2.f155795f, f35, (fI - f28) * f29, f35);
                            } else {
                                aVar2.c(fI);
                                fArr[i24] = (aVar2.f155803n * aVar2.f155797h) + aVar2.f155806q;
                                fArr[i24 + 1] = (aVar2.f155804o * aVar2.f155798i) + aVar2.f155807r;
                            }
                            z16 = z14;
                        } else {
                            z14 = z14;
                        }
                        i24 += 2;
                        i25++;
                        z14 = z14;
                    }
                    boolean z17 = z14;
                    if (z16) {
                        break;
                    }
                    i19++;
                    z14 = z17;
                    i16 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i26 = 0; i26 < length4; i26++) {
                v25.e(fArr[i26], i26);
            }
        } else {
            int iH = h(i15);
            float fI2 = i(iH, i15, true);
            p1.l lVar = this.f155708a;
            p2<V> p2VarB2 = nVar.b(lVar.a(iH));
            if (p2VarB2 != null && (v18 = p2VarB2.f155692a) != null) {
                v19 = v18;
            }
            p2<V> p2VarB3 = nVar.b(lVar.a(iH + 1));
            if (p2VarB3 != null && (v17 = p2VarB3.f155692a) != null) {
                v24 = v17;
            }
            int f155699e = v25.getF155699e();
            for (int i27 = 0; i27 < f155699e; i27++) {
                v25.e((v24.a(i27) * fI2) + ((1 - fI2) * v19.a(i27)), i27);
            }
        }
        return v25;
    }

    @Override // s1.k2
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF155711d() {
        return this.f155711d;
    }

    public final int h(int i14) {
        int i15;
        p1.l lVar = this.f155708a;
        int i16 = lVar.f134763b;
        lVar.getClass();
        if (i16 <= 0 || i16 > lVar.f134763b) {
            org.apache.commons.lang3.e.v("");
            return 0;
        }
        int i17 = i16 - 1;
        int i18 = 0;
        while (true) {
            if (i18 <= i17) {
                i15 = (i18 + i17) >>> 1;
                int i19 = lVar.f134762a[i15];
                if (i19 >= i14) {
                    if (i19 <= i14) {
                        break;
                    }
                    i17 = i15 - 1;
                } else {
                    i18 = i15 + 1;
                }
            } else {
                i15 = -(i18 + 1);
                break;
            }
        }
        return i15 < -1 ? -(i15 + 2) : i15;
    }

    public final float i(int i14, int i15, boolean z14) {
        b0 b0Var;
        float f14;
        p1.l lVar = this.f155708a;
        if (i14 >= lVar.f134763b - 1) {
            f14 = i15;
        } else {
            int iA = lVar.a(i14);
            int iA2 = lVar.a(i14 + 1);
            if (i15 == iA) {
                f14 = iA;
            } else {
                int i16 = iA2 - iA;
                p2<V> p2VarB = this.f155709b.b(iA);
                if (p2VarB == null || (b0Var = p2VarB.f155693b) == null) {
                    b0Var = this.f155712e;
                }
                float f15 = i16;
                float fA = b0Var.a((i15 - iA) / f15);
                if (z14) {
                    return fA;
                }
                f14 = (f15 * fA) + iA;
            }
        }
        return f14 / 1000;
    }

    public final void j(V v14, V v15, V v16) {
        float[] fArr;
        boolean z14 = this.f155722o != i2.f155602c;
        V v17 = this.f155716i;
        p1.n<p2<V>> nVar = this.f155709b;
        p1.l lVar = this.f155708a;
        if (v17 == null) {
            this.f155716i = (V) v14.c();
            this.f155717j = (V) v16.c();
            int i14 = lVar.f134763b;
            float[] fArr2 = new float[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                fArr2[i15] = lVar.a(i15) / 1000;
            }
            this.f155715h = fArr2;
            int i16 = lVar.f134763b;
            int[] iArr = new int[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                p2<V> p2VarB = nVar.b(lVar.a(i17));
                int i18 = p2VarB != null ? p2VarB.f155694c : this.f155713f;
                t.f155740b.getClass();
                if (i18 != 0) {
                    z14 = true;
                }
                iArr[i17] = i18;
            }
            this.f155714g = iArr;
        }
        if (z14) {
            if (this.f155722o != i2.f155602c && p005kotlin.jvm.internal.s.g(this.f155718k, v14) && p005kotlin.jvm.internal.s.g(this.f155719l, v15)) {
                return;
            }
            this.f155718k = v14;
            this.f155719l = v15;
            int f155699e = v14.getF155699e() + (v14.getF155699e() % 2);
            this.f155720m = new float[f155699e];
            this.f155721n = new float[f155699e];
            int i19 = lVar.f134763b;
            float[][] fArr3 = new float[i19][];
            for (int i24 = 0; i24 < i19; i24++) {
                int iA = lVar.a(i24);
                p2<V> p2VarB2 = nVar.b(iA);
                if (iA == 0 && p2VarB2 == null) {
                    fArr = new float[f155699e];
                    for (int i25 = 0; i25 < f155699e; i25++) {
                        fArr[i25] = v14.a(i25);
                    }
                } else if (iA == this.f155710c && p2VarB2 == null) {
                    fArr = new float[f155699e];
                    for (int i26 = 0; i26 < f155699e; i26++) {
                        fArr[i26] = v15.a(i26);
                    }
                } else {
                    p2VarB2.getClass();
                    V v18 = p2VarB2.f155692a;
                    float[] fArr4 = new float[f155699e];
                    for (int i27 = 0; i27 < f155699e; i27++) {
                        fArr4[i27] = v18.a(i27);
                    }
                    fArr = fArr4;
                }
                fArr3[i24] = fArr;
            }
            this.f155722o = new u(this.f155714g, this.f155715h, fArr3);
        }
    }

    private q2(p1.l lVar, p1.n<p2<V>> nVar, int i14, int i15, b0 b0Var, int i16) {
        this.f155708a = lVar;
        this.f155709b = nVar;
        this.f155710c = i14;
        this.f155711d = i15;
        this.f155712e = b0Var;
        this.f155713f = i16;
        this.f155714g = i2.f155600a;
        float[] fArr = i2.f155601b;
        this.f155715h = fArr;
        this.f155720m = fArr;
        this.f155721n = fArr;
        this.f155722o = i2.f155602c;
    }

    public /* synthetic */ q2(Map map, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(map, i14, (i16 & 4) != 0 ? 0 : i15);
    }

    public /* synthetic */ q2(p1.l lVar, p1.n nVar, int i14, int i15, b0 b0Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this(lVar, nVar, i14, i15, b0Var, i16);
    }
}
