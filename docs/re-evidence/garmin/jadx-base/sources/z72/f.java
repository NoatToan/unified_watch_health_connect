package z72;

import android.graphics.Canvas;
import java.util.Iterator;
import java.util.List;
import o4.d0;
import o4.q;
import p005kotlin.Unit;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f202923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f202924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f202925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f202926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f202927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f202928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f202929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f202930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f202931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i53.c f202932k;

    public /* synthetic */ f(float f14, float f15, float f16, float f17, List list, boolean z14, long j8, boolean z15, float f18, i53.c cVar, int i14) {
        this.f202922a = i14;
        this.f202923b = f14;
        this.f202924c = f15;
        this.f202925d = f16;
        this.f202926e = f17;
        this.f202927f = list;
        this.f202928g = z14;
        this.f202929h = j8;
        this.f202930i = z15;
        this.f202931j = f18;
        this.f202932k = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x017a A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:46:0x013e, B:57:0x017a, B:58:0x01b5, B:60:0x0242, B:61:0x0249, B:72:0x0280, B:71:0x0277, B:67:0x0267, B:76:0x02cb), top: B:87:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b5 A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:46:0x013e, B:57:0x017a, B:58:0x01b5, B:60:0x0242, B:61:0x0249, B:72:0x0280, B:71:0x0277, B:67:0x0267, B:76:0x02cb), top: B:87:0x013e }] */
    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        q4.a.b bVar;
        long j8;
        q4.a.b bVar2;
        long j14;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        List list;
        float f19;
        float f22;
        float f24;
        float f25;
        i53.c cVar;
        float f26;
        float f27;
        long j15;
        float f28;
        float f29;
        long j16;
        long j17;
        switch (this.f202922a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                f fVar2 = new f(this.f202923b, this.f202924c, this.f202925d, this.f202926e, this.f202927f, this.f202928g, this.f202929h, this.f202930i, this.f202931j, this.f202932k, 1);
                Canvas canvasA = o4.d.a(fVar.getF142543b().a());
                int iSaveLayer = canvasA.saveLayer(null, null);
                fVar2.invoke(fVar);
                canvasA.restoreToCount(iSaveLayer);
                return Unit.INSTANCE;
            default:
                float f34 = this.f202924c;
                List list2 = this.f202927f;
                i53.c cVar2 = this.f202932k;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                float f35 = n4.g.f(fVar3.b());
                float f36 = this.f202923b;
                float f37 = 2;
                float f38 = (f35 - f36) / f37;
                long jB = n4.g.b(fVar3.b());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) - f38;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L)) - f38;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                long jI1 = fVar3.i1();
                q4.a.b f142543b = fVar3.getF142543b();
                long jB2 = f142543b.b();
                f142543b.a().l();
                try {
                    f142543b.f142550a.f(f34, jI1);
                    float f39 = this.f202925d;
                    float f44 = this.f202926e;
                    float f45 = (0.0f > f39 || f39 > 1.0f || f39 == 0.0f) ? 0.0f : f44 * f39;
                    Iterator it = list2.iterator();
                    int i14 = 0;
                    float f46 = f44;
                    float f47 = 0.0f;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        float f48 = fIntBitsToFloat2;
                        float f49 = f45;
                        long j18 = this.f202929h;
                        if (!zHasNext) {
                            float f50 = f39;
                            List list3 = list2;
                            float f54 = f38;
                            float f55 = fIntBitsToFloat;
                            float f56 = f36;
                            q4.a.b bVar3 = f142543b;
                            long j19 = jB2;
                            float f57 = f37;
                            if (this.f202928g) {
                                long j24 = f50 > 0.0f ? j18 : ((l) h0.b0(list3)).f202961b;
                                long j25 = f50 == 1.0f ? j18 : ((l) h0.m0(list3)).f202961b;
                                float f58 = f56 / f57;
                                float f59 = f47;
                                q4.f.o0(fVar3, j24, f58, (((long) Float.floatToRawIntBits(k.h(f54, 0.0f, f55))) << 32) | (((long) Float.floatToRawIntBits(k.i(f54, 0.0f, f48))) & 4294967295L), null, 0, 120);
                                q4.f.o0(fVar3, j25, f58, (((long) Float.floatToRawIntBits(k.i(f54, f59, f48))) & 4294967295L) | (((long) Float.floatToRawIntBits(k.h(f54, f59, f55))) << 32), null, 0, 120);
                            }
                            if (this.f202930i) {
                                q4.f.o0(fVar3, j18, f56, (((long) Float.floatToRawIntBits(k.h(f54, f49, f55))) << 32) | (((long) Float.floatToRawIntBits(k.i(f54, f49, f48))) & 4294967295L), null, 0, 120);
                                float f64 = f56 / 4;
                                d0.f128823b.getClass();
                                float fH = k.h(f54, f49, f55);
                                float fI = k.i(f54, f49, f48);
                                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fH);
                                long jFloatToRawIntBits3 = Float.floatToRawIntBits(fI);
                                q4.k kVar = new q4.k(f64, 0.0f, 0, 0, null, 30, null);
                                q.f128930b.getClass();
                                q4.f.o0(fVar3, d0.f128831j, f56 + (f64 / f57), (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & 4294967295L), kVar, q.f128937i, 40);
                            }
                            tn.k.p(bVar3, j19);
                            return Unit.INSTANCE;
                        }
                        try {
                            Object next = it.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                x.q();
                                throw null;
                            }
                            l lVar = (l) next;
                            float f65 = lVar.f202960a * f46;
                            float f66 = f39;
                            float f67 = this.f202931j;
                            float f68 = (f46 != 360.0f && i14 == 0) ? 0.0f : f67 / f37;
                            if (f46 == 360.0f) {
                                f14 = f67;
                            } else {
                                if (i14 != 0) {
                                    f14 = f67;
                                    if (i14 == x.j(cVar2)) {
                                    }
                                    f16 = f65 - f15;
                                    f17 = f47 + f65;
                                    if (f17 <= f49) {
                                        float f69 = f38 * f37;
                                        f18 = f17;
                                        list = list2;
                                        f22 = fIntBitsToFloat;
                                        j14 = jB2;
                                        cVar = cVar2;
                                        f26 = f46;
                                        f27 = f49;
                                        f25 = f48;
                                        bVar = f142543b;
                                        try {
                                            f24 = f36;
                                            long j26 = jFloatToRawIntBits;
                                            bVar2 = bVar;
                                            f19 = f38;
                                            f28 = f37;
                                            try {
                                                q4.f.Q1(fVar3, j18, f47 + f68, f16, j26, (((long) Float.floatToRawIntBits(f69)) & 4294967295L) | (((long) Float.floatToRawIntBits(f69)) << 32), 0.0f, new q4.k(f36, 0.0f, 0, 0, null, 30, null), 832);
                                                j17 = j26;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } else {
                                        f18 = f17;
                                        list = list2;
                                        f19 = f38;
                                        f22 = fIntBitsToFloat;
                                        f24 = f36;
                                        j14 = jB2;
                                        f25 = f48;
                                        cVar = cVar2;
                                        f26 = f46;
                                        f27 = f49;
                                        j15 = jFloatToRawIntBits;
                                        bVar2 = f142543b;
                                        f28 = f37;
                                        if (f47 > f27) {
                                            float f74 = f19 * f28;
                                            q4.f.Q1(fVar3, lVar.f202961b, f47 + f68, f16, j15, (((long) Float.floatToRawIntBits(f74)) << 32) | (((long) Float.floatToRawIntBits(f74)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                            j17 = j15;
                                        } else {
                                            float f75 = f27 - f47;
                                            float f76 = f47 + f68;
                                            float f77 = f19 * f28;
                                            f29 = f27;
                                            q4.f.Q1(fVar3, j18, f76, f75, j15, (((long) Float.floatToRawIntBits(f77)) << 32) | (((long) Float.floatToRawIntBits(f77)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                            j16 = j15;
                                            q4.f.Q1(fVar3, lVar.f202961b, f76 + f75, f16 - f75, j16, (((long) Float.floatToRawIntBits(f77)) << 32) | (((long) Float.floatToRawIntBits(f77)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                        }
                                        fIntBitsToFloat = f22;
                                        fIntBitsToFloat2 = f25;
                                        f38 = f19;
                                        f37 = f28;
                                        f142543b = bVar2;
                                        i14 = i15;
                                        cVar2 = cVar;
                                        f46 = f26;
                                        f39 = f66;
                                        list2 = list;
                                        f36 = f24;
                                        jB2 = j14;
                                        jFloatToRawIntBits = j16;
                                        f45 = f29;
                                        f47 = f18;
                                    }
                                    f29 = f27;
                                    j16 = j17;
                                    fIntBitsToFloat = f22;
                                    fIntBitsToFloat2 = f25;
                                    f38 = f19;
                                    f37 = f28;
                                    f142543b = bVar2;
                                    i14 = i15;
                                    cVar2 = cVar;
                                    f46 = f26;
                                    f39 = f66;
                                    list2 = list;
                                    f36 = f24;
                                    jB2 = j14;
                                    jFloatToRawIntBits = j16;
                                    f45 = f29;
                                    f47 = f18;
                                } else {
                                    f14 = f67;
                                }
                                f15 = f14 - (f14 / f37);
                                f16 = f65 - f15;
                                f17 = f47 + f65;
                                if (f17 <= f49) {
                                    float f610 = f38 * f37;
                                    f18 = f17;
                                    list = list2;
                                    f22 = fIntBitsToFloat;
                                    j14 = jB2;
                                    cVar = cVar2;
                                    f26 = f46;
                                    f27 = f49;
                                    f25 = f48;
                                    bVar = f142543b;
                                    f24 = f36;
                                    long j27 = jFloatToRawIntBits;
                                    bVar2 = bVar;
                                    f19 = f38;
                                    f28 = f37;
                                    q4.f.Q1(fVar3, j18, f47 + f68, f16, j27, (((long) Float.floatToRawIntBits(f610)) & 4294967295L) | (((long) Float.floatToRawIntBits(f610)) << 32), 0.0f, new q4.k(f36, 0.0f, 0, 0, null, 30, null), 832);
                                    j17 = j27;
                                } else {
                                    f18 = f17;
                                    list = list2;
                                    f19 = f38;
                                    f22 = fIntBitsToFloat;
                                    f24 = f36;
                                    j14 = jB2;
                                    f25 = f48;
                                    cVar = cVar2;
                                    f26 = f46;
                                    f27 = f49;
                                    j15 = jFloatToRawIntBits;
                                    bVar2 = f142543b;
                                    f28 = f37;
                                    if (f47 > f27) {
                                        float f78 = f19 * f28;
                                        q4.f.Q1(fVar3, lVar.f202961b, f47 + f68, f16, j15, (((long) Float.floatToRawIntBits(f78)) << 32) | (((long) Float.floatToRawIntBits(f78)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                        j17 = j15;
                                    } else {
                                        float f79 = f27 - f47;
                                        float f710 = f47 + f68;
                                        float f711 = f19 * f28;
                                        f29 = f27;
                                        q4.f.Q1(fVar3, j18, f710, f79, j15, (((long) Float.floatToRawIntBits(f711)) << 32) | (((long) Float.floatToRawIntBits(f711)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                        j16 = j15;
                                        q4.f.Q1(fVar3, lVar.f202961b, f710 + f79, f16 - f79, j16, (((long) Float.floatToRawIntBits(f711)) << 32) | (((long) Float.floatToRawIntBits(f711)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                    }
                                    fIntBitsToFloat = f22;
                                    fIntBitsToFloat2 = f25;
                                    f38 = f19;
                                    f37 = f28;
                                    f142543b = bVar2;
                                    i14 = i15;
                                    cVar2 = cVar;
                                    f46 = f26;
                                    f39 = f66;
                                    list2 = list;
                                    f36 = f24;
                                    jB2 = j14;
                                    jFloatToRawIntBits = j16;
                                    f45 = f29;
                                    f47 = f18;
                                }
                                f29 = f27;
                                j16 = j17;
                                fIntBitsToFloat = f22;
                                fIntBitsToFloat2 = f25;
                                f38 = f19;
                                f37 = f28;
                                f142543b = bVar2;
                                i14 = i15;
                                cVar2 = cVar;
                                f46 = f26;
                                f39 = f66;
                                list2 = list;
                                f36 = f24;
                                jB2 = j14;
                                jFloatToRawIntBits = j16;
                                f45 = f29;
                                f47 = f18;
                            }
                            f15 = f14;
                            f16 = f65 - f15;
                            f17 = f47 + f65;
                            if (f17 <= f49) {
                                float f611 = f38 * f37;
                                f18 = f17;
                                list = list2;
                                f22 = fIntBitsToFloat;
                                j14 = jB2;
                                cVar = cVar2;
                                f26 = f46;
                                f27 = f49;
                                f25 = f48;
                                bVar = f142543b;
                                f24 = f36;
                                long j28 = jFloatToRawIntBits;
                                bVar2 = bVar;
                                f19 = f38;
                                f28 = f37;
                                q4.f.Q1(fVar3, j18, f47 + f68, f16, j28, (((long) Float.floatToRawIntBits(f611)) & 4294967295L) | (((long) Float.floatToRawIntBits(f611)) << 32), 0.0f, new q4.k(f36, 0.0f, 0, 0, null, 30, null), 832);
                                j17 = j28;
                            } else {
                                f18 = f17;
                                list = list2;
                                f19 = f38;
                                f22 = fIntBitsToFloat;
                                f24 = f36;
                                j14 = jB2;
                                f25 = f48;
                                cVar = cVar2;
                                f26 = f46;
                                f27 = f49;
                                j15 = jFloatToRawIntBits;
                                bVar2 = f142543b;
                                f28 = f37;
                                if (f47 > f27) {
                                    float f712 = f19 * f28;
                                    q4.f.Q1(fVar3, lVar.f202961b, f47 + f68, f16, j15, (((long) Float.floatToRawIntBits(f712)) << 32) | (((long) Float.floatToRawIntBits(f712)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                    j17 = j15;
                                } else {
                                    float f713 = f27 - f47;
                                    float f714 = f47 + f68;
                                    float f715 = f19 * f28;
                                    f29 = f27;
                                    q4.f.Q1(fVar3, j18, f714, f713, j15, (((long) Float.floatToRawIntBits(f715)) << 32) | (((long) Float.floatToRawIntBits(f715)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                    j16 = j15;
                                    q4.f.Q1(fVar3, lVar.f202961b, f714 + f713, f16 - f713, j16, (((long) Float.floatToRawIntBits(f715)) << 32) | (((long) Float.floatToRawIntBits(f715)) & 4294967295L), 0.0f, new q4.k(f24, 0.0f, 0, 0, null, 30, null), 832);
                                }
                                fIntBitsToFloat = f22;
                                fIntBitsToFloat2 = f25;
                                f38 = f19;
                                f37 = f28;
                                f142543b = bVar2;
                                i14 = i15;
                                cVar2 = cVar;
                                f46 = f26;
                                f39 = f66;
                                list2 = list;
                                f36 = f24;
                                jB2 = j14;
                                jFloatToRawIntBits = j16;
                                f45 = f29;
                                f47 = f18;
                            }
                            f29 = f27;
                            j16 = j17;
                            fIntBitsToFloat = f22;
                            fIntBitsToFloat2 = f25;
                            f38 = f19;
                            f37 = f28;
                            f142543b = bVar2;
                            i14 = i15;
                            cVar2 = cVar;
                            f46 = f26;
                            f39 = f66;
                            list2 = list;
                            f36 = f24;
                            jB2 = j14;
                            jFloatToRawIntBits = j16;
                            f45 = f29;
                            f47 = f18;
                        } catch (Throwable th5) {
                            th = th5;
                            bVar2 = f142543b;
                            j14 = jB2;
                        }
                        bVar = bVar2;
                        j8 = j14;
                        tn.k.p(bVar, j8);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bVar = f142543b;
                    j8 = jB2;
                }
                break;
        }
    }
}
