package z72;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o4.d0;
import o4.q;
import o4.w;
import o4.w1;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p13.y;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f202886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f202887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f202888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f202889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f202890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f202891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Float f202892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x3 f202893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f202894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f202895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i53.c f202896l;

    public /* synthetic */ c(float f14, float f15, boolean z14, float f16, List list, boolean z15, Float f17, x3 x3Var, d0 d0Var, float f18, i53.c cVar, int i14) {
        this.f202885a = i14;
        this.f202886b = f14;
        this.f202887c = f15;
        this.f202888d = z14;
        this.f202889e = f16;
        this.f202890f = list;
        this.f202891g = z15;
        this.f202892h = f17;
        this.f202893i = x3Var;
        this.f202894j = d0Var;
        this.f202895k = f18;
        this.f202896l = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02d2 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #3 {all -> 0x01e6, blocks: (B:69:0x020b, B:74:0x0262, B:84:0x0282, B:86:0x0287, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:99:0x02be, B:102:0x02c6, B:104:0x02ca, B:105:0x02cd, B:108:0x02d2, B:109:0x02d4, B:76:0x026e, B:57:0x01d1, B:64:0x01f4, B:65:0x01fb), top: B:124:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x020b A[Catch: all -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01e6, blocks: (B:69:0x020b, B:74:0x0262, B:84:0x0282, B:86:0x0287, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:99:0x02be, B:102:0x02c6, B:104:0x02ca, B:105:0x02cd, B:108:0x02d2, B:109:0x02d4, B:76:0x026e, B:57:0x01d1, B:64:0x01f4, B:65:0x01fb), top: B:124:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x025e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0262 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #3 {all -> 0x01e6, blocks: (B:69:0x020b, B:74:0x0262, B:84:0x0282, B:86:0x0287, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:99:0x02be, B:102:0x02c6, B:104:0x02ca, B:105:0x02cd, B:108:0x02d2, B:109:0x02d4, B:76:0x026e, B:57:0x01d1, B:64:0x01f4, B:65:0x01fb), top: B:124:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x026e A[Catch: all -> 0x01e6, TryCatch #3 {all -> 0x01e6, blocks: (B:69:0x020b, B:74:0x0262, B:84:0x0282, B:86:0x0287, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:99:0x02be, B:102:0x02c6, B:104:0x02ca, B:105:0x02cd, B:108:0x02d2, B:109:0x02d4, B:76:0x026e, B:57:0x01d1, B:64:0x01f4, B:65:0x01fb), top: B:124:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0286  */
    /* JADX WARN: Code duplicated, block: B:89:0x029b A[Catch: all -> 0x01e6, TryCatch #3 {all -> 0x01e6, blocks: (B:69:0x020b, B:74:0x0262, B:84:0x0282, B:86:0x0287, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:99:0x02be, B:102:0x02c6, B:104:0x02ca, B:105:0x02cd, B:108:0x02d2, B:109:0x02d4, B:76:0x026e, B:57:0x01d1, B:64:0x01f4, B:65:0x01fb), top: B:124:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a3 A[Catch: all -> 0x01e6, TryCatch #3 {all -> 0x01e6, blocks: (B:69:0x020b, B:74:0x0262, B:84:0x0282, B:86:0x0287, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:99:0x02be, B:102:0x02c6, B:104:0x02ca, B:105:0x02cd, B:108:0x02d2, B:109:0x02d4, B:76:0x026e, B:57:0x01d1, B:64:0x01f4, B:65:0x01fb), top: B:124:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ba  */
    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        q4.a.b bVar;
        long j8;
        float f14;
        float f15;
        float f16;
        List list;
        long j14;
        int i14;
        q4.a.b bVar2;
        float f17;
        float f18;
        float f19;
        float f22;
        Float f24;
        x3 x3Var;
        float fFloatValue;
        float f25;
        float f26;
        long j15;
        int i15;
        d0 d0Var;
        int i16;
        float f27;
        int i17;
        q4.a.b bVar3;
        switch (this.f202885a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                c cVar = new c(this.f202886b, this.f202887c, this.f202888d, this.f202889e, this.f202890f, this.f202891g, this.f202892h, this.f202893i, this.f202894j, this.f202895k, this.f202896l, 1);
                Canvas canvasA = o4.d.a(fVar.getF142543b().a());
                int iSaveLayer = canvasA.saveLayer(null, null);
                cVar.invoke(fVar);
                canvasA.restoreToCount(iSaveLayer);
                return Unit.INSTANCE;
            default:
                float f28 = this.f202887c;
                i53.c cVar2 = this.f202896l;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                float f29 = n4.g.f(fVar2.b());
                float f34 = this.f202886b;
                float f35 = 2;
                float f36 = (f29 - f34) / f35;
                long jB = n4.g.b(fVar2.b());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) - f36;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L)) - f36;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                long jI1 = fVar2.i1();
                q4.a.b f142543b = fVar2.getF142543b();
                long jB2 = f142543b.b();
                f142543b.a().l();
                try {
                    f142543b.f142550a.f(f28, jI1);
                    boolean z14 = this.f202888d;
                    float f37 = this.f202889e;
                    List list2 = this.f202890f;
                    if (z14) {
                        float f38 = f37 + 0.0f;
                        try {
                            ArrayList arrayList = new ArrayList(y.r(list2, 10));
                            Iterator it = list2.iterator();
                            float f39 = 0.0f;
                            while (it.hasNext()) {
                                l lVar = (l) it.next();
                                float f44 = f38;
                                Iterator it3 = it;
                                q4.f fVar3 = fVar2;
                                float f45 = fIntBitsToFloat2;
                                p pVar = new p(Float.valueOf(f39), d0.a(lVar.f202961b));
                                f39 += lVar.f202960a;
                                arrayList.add(pVar);
                                f38 = f44;
                                it = it3;
                                fVar2 = fVar3;
                                fIntBitsToFloat2 = f45;
                            }
                            float f46 = f38;
                            q4.f fVar4 = fVar2;
                            float f47 = fIntBitsToFloat2;
                            p[] pVarArr = (p[]) arrayList.toArray(new p[0]);
                            w1 w1VarG = w.a.g(w.f129023a, (p[]) Arrays.copyOf(pVarArr, pVarArr.length));
                            float f48 = f36 * f35;
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f48)) & 4294967295L) | (((long) Float.floatToRawIntBits(f48)) << 32);
                            try {
                                list = list2;
                                j14 = jB2;
                                i14 = 0;
                                bVar3 = f142543b;
                                f15 = fIntBitsToFloat;
                                try {
                                    q4.k kVar = new q4.k(f34, 0.0f, 0, 0, null, 30, null);
                                    q4.f.f142555o0.getClass();
                                    fVar2 = fVar4;
                                    f14 = f47;
                                    fVar2.R0(w1VarG, f37, jFloatToRawIntBits, jFloatToRawIntBits2, kVar, q4.f.a.f142557b);
                                    f16 = f37;
                                    bVar2 = bVar3;
                                    f17 = f34;
                                    f18 = f46;
                                    f19 = f35;
                                    f22 = f36;
                                    if (this.f202891g) {
                                        float f49 = f17 / f19;
                                        q4.f.o0(fVar2, ((l) h0.b0(list)).f202961b, f49, (((long) Float.floatToRawIntBits(k.h(f22, 0.0f, f15))) << 32) | (((long) Float.floatToRawIntBits(k.i(f22, 0.0f, f14))) & 4294967295L), null, 0, 120);
                                        q4.f.o0(fVar2, ((l) h0.m0(list)).f202961b, f49, (((long) Float.floatToRawIntBits(k.i(f22, f18, f14))) & 4294967295L) | (((long) Float.floatToRawIntBits(k.h(f22, f18, f15))) << 32), null, 0, 120);
                                    }
                                    f24 = this.f202892h;
                                    if (f24 != null) {
                                        x3Var = this.f202893i;
                                        if (x3Var != null) {
                                            fFloatValue = ((Number) x3Var.getF182175a()).floatValue();
                                        } else {
                                            fFloatValue = f24.floatValue();
                                        }
                                        f25 = 0.0f;
                                        if (0.0f <= fFloatValue || fFloatValue > 1.0f || fFloatValue == 0.0f) {
                                            f26 = 0.0f;
                                        } else {
                                            f26 = f16 * fFloatValue;
                                        }
                                        j15 = ((l) h0.b0(list)).f202961b;
                                        i15 = i14;
                                        for (Object obj2 : list) {
                                            i16 = i15 + 1;
                                            if (i15 >= 0) {
                                                x.q();
                                                throw null;
                                            }
                                            l lVar2 = (l) obj2;
                                            f27 = lVar2.f202960a;
                                            f25 += f27;
                                            i17 = 1;
                                            if (i15 == list.size() - 1) {
                                                if (fFloatValue <= f25) {
                                                    i17 = i14;
                                                }
                                            } else if (fFloatValue >= f25) {
                                                i17 = i14;
                                            }
                                            if (fFloatValue < f25 - f27 && i17 != 0) {
                                                j15 = lVar2.f202961b;
                                            }
                                            i15 = i16;
                                        }
                                        d0Var = this.f202894j;
                                        if (d0Var != null) {
                                            j15 = d0Var.f128833a;
                                        }
                                        float f50 = f17;
                                        q4.f.o0(fVar2, j15, f50, (((long) Float.floatToRawIntBits(k.h(f22, f26, f15))) << 32) | (((long) Float.floatToRawIntBits(k.i(f22, f26, f14))) & 4294967295L), null, 0, 120);
                                        float f54 = f50 / 4;
                                        d0.f128823b.getClass();
                                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(k.i(f22, f26, f14))) & 4294967295L) | (((long) Float.floatToRawIntBits(k.h(f22, f26, f15))) << 32);
                                        q4.k kVar2 = new q4.k(f54, 0.0f, 0, 0, null, 30, null);
                                        q.f128930b.getClass();
                                        q4.f.o0(fVar2, d0.f128831j, f50 + (f54 / f19), jFloatToRawIntBits3, kVar2, q.f128937i, 40);
                                    }
                                    tn.k.p(bVar2, j14);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bVar = bVar3;
                                    j8 = j14;
                                    tn.k.p(bVar, j8);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bVar3 = f142543b;
                                j14 = jB2;
                                bVar = bVar3;
                                j8 = j14;
                                tn.k.p(bVar, j8);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bVar3 = f142543b;
                        }
                    } else {
                        f14 = fIntBitsToFloat2;
                        bVar = f142543b;
                        float f55 = f34;
                        f15 = fIntBitsToFloat;
                        f16 = f37;
                        list = list2;
                        j14 = jB2;
                        i14 = 0;
                        try {
                            int i18 = 0;
                            float f56 = 0.0f;
                            for (Object obj3 : list) {
                                try {
                                    int i19 = i18 + 1;
                                    if (i18 < 0) {
                                        x.q();
                                        throw null;
                                    }
                                    l lVar3 = (l) obj3;
                                    float f57 = lVar3.f202960a * f16;
                                    float f58 = this.f202895k;
                                    float f59 = (f16 != 360.0f && i18 == 0) ? 0.0f : f58 / f35;
                                    if (f16 != 360.0f) {
                                        if (i18 != 0) {
                                            try {
                                                if (i18 == x.j(cVar2)) {
                                                    f58 -= f58 / f35;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                j8 = j14;
                                                tn.k.p(bVar, j8);
                                                throw th;
                                            }
                                        } else {
                                            f58 -= f58 / f35;
                                        }
                                    }
                                    try {
                                        long j16 = lVar3.f202961b;
                                        float f64 = f56 + f59;
                                        float f65 = f57 - f58;
                                        float f66 = f36 * f35;
                                        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f66)) << 32) | (((long) Float.floatToRawIntBits(f66)) & 4294967295L);
                                        float f67 = f55;
                                        float f68 = f36;
                                        i53.c cVar3 = cVar2;
                                        long j17 = jFloatToRawIntBits;
                                        q4.a.b bVar4 = bVar;
                                        float f69 = f35;
                                        try {
                                            q4.f.Q1(fVar2, j16, f64, f65, j17, jFloatToRawIntBits4, 0.0f, new q4.k(f67, 0.0f, 0, 0, null, 30, null), 832);
                                            f56 += f57;
                                            f36 = f68;
                                            f35 = f69;
                                            bVar = bVar4;
                                            i18 = i19;
                                            f55 = f67;
                                            cVar2 = cVar3;
                                            jFloatToRawIntBits = j17;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bVar = bVar4;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                                j8 = j14;
                                break;
                            }
                            bVar2 = bVar;
                            f17 = f55;
                            f18 = f56;
                            f19 = f35;
                            f22 = f36;
                            if (this.f202891g) {
                                float f410 = f17 / f19;
                                q4.f.o0(fVar2, ((l) h0.b0(list)).f202961b, f410, (((long) Float.floatToRawIntBits(k.h(f22, 0.0f, f15))) << 32) | (((long) Float.floatToRawIntBits(k.i(f22, 0.0f, f14))) & 4294967295L), null, 0, 120);
                                q4.f.o0(fVar2, ((l) h0.m0(list)).f202961b, f410, (((long) Float.floatToRawIntBits(k.i(f22, f18, f14))) & 4294967295L) | (((long) Float.floatToRawIntBits(k.h(f22, f18, f15))) << 32), null, 0, 120);
                            }
                            f24 = this.f202892h;
                            if (f24 != null) {
                                x3Var = this.f202893i;
                                if (x3Var != null) {
                                    fFloatValue = ((Number) x3Var.getF182175a()).floatValue();
                                } else {
                                    fFloatValue = f24.floatValue();
                                }
                                f25 = 0.0f;
                                if (0.0f <= fFloatValue) {
                                    f26 = 0.0f;
                                } else {
                                    f26 = 0.0f;
                                }
                                j15 = ((l) h0.b0(list)).f202961b;
                                i15 = i14;
                                while (r9.hasNext()) {
                                    i16 = i15 + 1;
                                    if (i15 >= 0) {
                                        x.q();
                                        throw null;
                                    }
                                    l lVar4 = (l) obj2;
                                    f27 = lVar4.f202960a;
                                    f25 += f27;
                                    i17 = 1;
                                    if (i15 == list.size() - 1) {
                                        if (fFloatValue <= f25) {
                                            i17 = i14;
                                        }
                                    } else if (fFloatValue >= f25) {
                                        i17 = i14;
                                    }
                                    if (fFloatValue < f25 - f27) {
                                    }
                                    i15 = i16;
                                }
                                d0Var = this.f202894j;
                                if (d0Var != null) {
                                    j15 = d0Var.f128833a;
                                }
                                float f510 = f17;
                                q4.f.o0(fVar2, j15, f510, (((long) Float.floatToRawIntBits(k.h(f22, f26, f15))) << 32) | (((long) Float.floatToRawIntBits(k.i(f22, f26, f14))) & 4294967295L), null, 0, 120);
                                float f511 = f510 / 4;
                                d0.f128823b.getClass();
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(k.i(f22, f26, f14))) & 4294967295L) | (((long) Float.floatToRawIntBits(k.h(f22, f26, f15))) << 32);
                                q4.k kVar3 = new q4.k(f511, 0.0f, 0, 0, null, 30, null);
                                q.f128930b.getClass();
                                q4.f.o0(fVar2, d0.f128831j, f510 + (f511 / f19), jFloatToRawIntBits5, kVar3, q.f128937i, 40);
                            }
                            tn.k.p(bVar2, j14);
                            return Unit.INSTANCE;
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    bVar = f142543b;
                    j8 = jB2;
                }
                tn.k.p(bVar, j8);
                throw th;
        }
    }
}
