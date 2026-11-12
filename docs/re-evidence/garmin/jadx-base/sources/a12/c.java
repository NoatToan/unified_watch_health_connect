package a12;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import e23.l;
import e23.p;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    public static final void a(i53.c cVar, String str, r rVar, p pVar, l lVar, m mVar, int i14) {
        int i15;
        String str2;
        cVar.getClass();
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1298913257);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            d.f81522a.getClass();
            g.a aVar = d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean z14 = (57344 & i16) == 16384;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(lVar, 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(lVar, 0);
                    o0VarE.K(objQ);
                }
            }
            int i17 = i16 << 3;
            c82.g.b(null, cVar, str2, (l) objQ, o0VarE, (i17 & 112) | 64 | (i17 & 896));
            if (pVar == null) {
                o0VarE.C(1624499864);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-363238775);
                e5.q((i16 >> 9) & 14, pVar, o0VarE, false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(cVar, str, rVar, pVar, lVar, i14);
        }
    }
}
