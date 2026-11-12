package u4;

import kotlin.t1;
import o4.e0;
import o4.r;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final void a(c cVar, l lVar) {
        int size = lVar.f168517j.size();
        for (int i14 = 0; i14 < size; i14++) {
            n nVar = lVar.f168517j.get(i14);
            if (nVar instanceof q) {
                f fVar = new f();
                q qVar = (q) nVar;
                fVar.f168410d = qVar.f168528b;
                fVar.f168420n = true;
                fVar.c();
                fVar.f168425s.j(qVar.f168529c);
                fVar.c();
                fVar.c();
                fVar.f168408b = qVar.f168530d;
                fVar.c();
                fVar.f168409c = qVar.f168531e;
                fVar.c();
                fVar.f168413g = qVar.f168532f;
                fVar.c();
                fVar.f168411e = qVar.f168533g;
                fVar.c();
                fVar.f168412f = qVar.f168534h;
                fVar.f168421o = true;
                fVar.c();
                fVar.f168414h = qVar.f168535i;
                fVar.f168421o = true;
                fVar.c();
                fVar.f168415i = qVar.f168536j;
                fVar.f168421o = true;
                fVar.c();
                fVar.f168416j = qVar.f168537k;
                fVar.f168421o = true;
                fVar.c();
                fVar.f168417k = qVar.f168538l;
                fVar.f168422p = true;
                fVar.c();
                fVar.f168418l = qVar.f168539m;
                fVar.f168422p = true;
                fVar.c();
                fVar.f168419m = qVar.f168540n;
                fVar.f168422p = true;
                fVar.c();
                cVar.e(i14, fVar);
            } else if (nVar instanceof l) {
                c cVar2 = new c();
                l lVar2 = (l) nVar;
                cVar2.f168363k = lVar2.f168508a;
                cVar2.c();
                cVar2.f168364l = lVar2.f168509b;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168367o = lVar2.f168512e;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168368p = lVar2.f168513f;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168369q = lVar2.f168514g;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168370r = lVar2.f168515h;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168365m = lVar2.f168510c;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168366n = lVar2.f168511d;
                cVar2.f168371s = true;
                cVar2.c();
                cVar2.f168358f = lVar2.f168516i;
                cVar2.f168359g = true;
                cVar2.c();
                a(cVar2, lVar2);
                cVar.e(i14, cVar2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0076  */
    /* JADX WARN: Code duplicated, block: B:14:0x009d  */
    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    /* JADX WARN: Code duplicated, block: B:8:0x0069  */
    public static final o b(d dVar, p3.m mVar) {
        long jFloatToRawIntBits;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j8;
        int i14;
        r rVar;
        x1 x1Var = p3.n.f135158a;
        g6.c cVar = (g6.c) mVar.A(t1.f91490h);
        float f14 = dVar.f168385j;
        boolean zL = mVar.l((((long) Float.floatToRawIntBits(cVar.getF75991a())) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32));
        Object objQ = mVar.q();
        if (zL) {
            c cVar2 = new c();
            a(cVar2, dVar.f168381f);
            Unit unit = Unit.INSTANCE;
            float f15 = dVar.f168377b;
            float f16 = dVar.f168378c;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar.s0(f15))) << 32) | (((long) Float.floatToRawIntBits(cVar.s0(f16))) & 4294967295L);
            n4.g.a aVar = n4.g.f123559b;
            fIntBitsToFloat = dVar.f168379d;
            fIntBitsToFloat2 = dVar.f168380e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            o oVar = new o(cVar2);
            String str = dVar.f168376a;
            j8 = dVar.f168382g;
            i14 = dVar.f168383h;
            rVar = null;
            if (j8 != 16) {
                e0.f128843b.getClass();
                rVar = new r(j8, i14, (p005kotlin.jvm.internal.j) null);
            }
            boolean z14 = dVar.f168384i;
            oVar.f168520a.setValue(n4.g.a(jFloatToRawIntBits));
            oVar.f168521b.setValue(Boolean.valueOf(z14));
            k kVar = oVar.f168522c;
            kVar.f168498g.setValue(rVar);
            kVar.f168500i.setValue(n4.g.a(jFloatToRawIntBits2));
            kVar.f168494c = str;
            mVar.K(oVar);
            objQ = oVar;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                c cVar3 = new c();
                a(cVar3, dVar.f168381f);
                Unit unit2 = Unit.INSTANCE;
                float f17 = dVar.f168377b;
                float f18 = dVar.f168378c;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar.s0(f17))) << 32) | (((long) Float.floatToRawIntBits(cVar.s0(f18))) & 4294967295L);
                n4.g.a aVar2 = n4.g.f123559b;
                fIntBitsToFloat = dVar.f168379d;
                fIntBitsToFloat2 = dVar.f168380e;
                if (Float.isNaN(fIntBitsToFloat)) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                }
                if (Float.isNaN(fIntBitsToFloat2)) {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                }
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
                o oVar2 = new o(cVar3);
                String str2 = dVar.f168376a;
                j8 = dVar.f168382g;
                i14 = dVar.f168383h;
                rVar = null;
                if (j8 != 16) {
                    e0.f128843b.getClass();
                    rVar = new r(j8, i14, (p005kotlin.jvm.internal.j) null);
                }
                boolean z15 = dVar.f168384i;
                oVar2.f168520a.setValue(n4.g.a(jFloatToRawIntBits));
                oVar2.f168521b.setValue(Boolean.valueOf(z15));
                k kVar2 = oVar2.f168522c;
                kVar2.f168498g.setValue(rVar);
                kVar2.f168500i.setValue(n4.g.a(jFloatToRawIntBits3));
                kVar2.f168494c = str2;
                mVar.K(oVar2);
                objQ = oVar2;
            }
        }
        return (o) objQ;
    }
}
