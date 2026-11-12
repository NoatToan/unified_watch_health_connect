package c50;

import c2.b0;
import c2.j;
import c2.o3;
import c2.x2;
import c2.y;
import c2.z;
import c42.c0;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import o4.m1;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    public static final void a(e50.h hVar, l<? super e50.a, Unit> lVar, m mVar, int i14) {
        r rVarC;
        boolean z14;
        n50.b bVar = hVar.f63018b;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1723882452);
        int i15 = i14 | (o0VarE.B(hVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarB = a2.b(c2.l.A(rVarE, 0.0f, eVar.f97920e, 1), a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            GeoPointDTO geoPointDTO = hVar.f63022f;
            int i16 = i15 & 112;
            boolean z15 = i16 == 32;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z15) {
                objQ = new b71.n(lVar, 2, (byte) 0);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b71.n(lVar, 2, (byte) 0);
                    o0VarE.K(objQ);
                }
            }
            xy2.b.c(aVar, geoPointDTO, (p) objQ, o0VarE, (GeoPointDTO.f32803e << 3) | 6);
            bVar2.getClass();
            r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            int i17 = hVar.f63024h;
            boolean z16 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new a40.a(lVar, 15);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a40.a(lVar, 15);
                    o0VarE.K(objQ2);
                }
            }
            dh.b.b(i17, 0, (e23.a) objQ2, rVarC3, o0VarE);
            bVar2.getClass();
            r rVarC4 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            boolean z17 = hVar.f63023g;
            boolean z18 = i16 == 32;
            Object objQ3 = o0VarE.q();
            if (z18) {
                objQ3 = new a40.a(lVar, 16);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a40.a(lVar, 16);
                    o0VarE.K(objQ3);
                }
            }
            f0.a(0, (e23.a) objQ3, rVarC4, o0VarE, z17);
            if (bVar.f123731f) {
                bVar2.getClass();
                rVarC = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            } else {
                rVarC = aVar;
            }
            Object objQ4 = o0VarE.q();
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = new o3(11);
                o0VarE.K(objQ4);
            }
            l lVar2 = (l) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new bv0.b(24);
                o0VarE.K(objQ5);
            }
            e23.a aVar4 = (e23.a) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new bv0.b(25);
                o0VarE.K(objQ6);
            }
            e23.a aVar5 = (e23.a) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new o3(12);
                o0VarE.K(objQ7);
            }
            l lVar3 = (l) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new o3(13);
                o0VarE.K(objQ8);
            }
            l lVar4 = (l) objQ8;
            boolean z19 = i16 == 32;
            Object objQ9 = o0VarE.q();
            if (z19 || objQ9 == c2565a) {
                objQ9 = new a12.a(lVar, 19);
                o0VarE.K(objQ9);
            }
            f40.e.b(rVarC, bVar, lVar2, aVar4, aVar5, lVar3, lVar4, (l) objQ9, o0VarE, 1797504);
            bVar2.getClass();
            r rVarC5 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            boolean z24 = i16 == 32;
            Object objQ10 = o0VarE.q();
            if (z24 || objQ10 == c2565a) {
                objQ10 = new a40.a(lVar, 17);
                o0VarE.K(objQ10);
            }
            jg.b.b(0, (e23.a) objQ10, rVarC5, o0VarE);
            i53.c<fg0.k> cVar = hVar.f63026j;
            boolean z25 = i16 == 32;
            Object objQ11 = o0VarE.q();
            if (z25 || objQ11 == c2565a) {
                objQ11 = new a12.a(lVar, 20);
                o0VarE.K(objQ11);
            }
            jg.b.a(cVar, (l) objQ11, o0VarE, fg0.k.X);
            f40.f.a(0, hVar.f63028l, o0VarE, hVar.f63027k);
            boolean z26 = hVar.f63029m;
            i53.c<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> cVar2 = hVar.f63030n;
            boolean z27 = i16 == 32;
            Object objQ12 = o0VarE.q();
            if (z27 || objQ12 == c2565a) {
                objQ12 = new a40.a(lVar, 18);
                o0VarE.K(objQ12);
            }
            e23.a aVar6 = (e23.a) objQ12;
            boolean z28 = i16 == 32;
            Object objQ13 = o0VarE.q();
            if (z28 || objQ13 == c2565a) {
                objQ13 = new a12.a(lVar, 21);
                o0VarE.K(objQ13);
            }
            l lVar5 = (l) objQ13;
            boolean z29 = i16 == 32;
            Object objQ14 = o0VarE.q();
            if (z29 || objQ14 == c2565a) {
                objQ14 = new a12.a(lVar, 22);
                o0VarE.K(objQ14);
            }
            lg.d.c(z26, cVar2, aVar6, lVar5, (l) objQ14, o0VarE, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.f39762t << 3);
            String str = hVar.f63017a;
            Double dValueOf = Double.valueOf(hVar.f63019c);
            boolean z34 = hVar.f63031o;
            ab1.g gVar = hVar.f63032p;
            w01.c cVar3 = hVar.f63033q;
            boolean z35 = i16 == 32;
            Object objQ15 = o0VarE.q();
            if (z35 || objQ15 == c2565a) {
                objQ15 = new a12.a(lVar, 23);
                o0VarE.K(objQ15);
            }
            l lVar6 = (l) objQ15;
            boolean z36 = i16 == 32;
            Object objQ16 = o0VarE.q();
            if (z36 || objQ16 == c2565a) {
                objQ16 = new a12.a(lVar, 24);
                o0VarE.K(objQ16);
            }
            l lVar7 = (l) objQ16;
            boolean z37 = i16 == 32;
            Object objQ17 = o0VarE.q();
            if (z37 || objQ17 == c2565a) {
                objQ17 = new a12.a(lVar, 25);
                o0VarE.K(objQ17);
            }
            l lVar8 = (l) objQ17;
            boolean z38 = i16 == 32;
            Object objQ18 = o0VarE.q();
            if (z38 || objQ18 == c2565a) {
                z14 = false;
                objQ18 = new b71.n(lVar, 3, (byte) 0);
                o0VarE.K(objQ18);
            } else {
                z14 = false;
            }
            p pVar = (p) objQ18;
            if (i16 == 32) {
                z14 = true;
            }
            Object objQ19 = o0VarE.q();
            if (z14 || objQ19 == c2565a) {
                objQ19 = new a12.a(lVar, 26);
                o0VarE.K(objQ19);
            }
            d50.m.a(str, dValueOf, z34, gVar, cVar3, lVar6, lVar7, lVar8, pVar, (l) objQ19, o0VarE, (ab1.g.f2567w << 9) | (w01.c.f181027k << 12));
            o0VarE = o0VarE;
            bVar2.getClass();
            f40.b.a(c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), bVar.f123727b, Double.valueOf(hVar.f63020d), hVar.f63021e, null, o0VarE, 24576);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(hVar, lVar, i14, 2);
        }
    }
}
