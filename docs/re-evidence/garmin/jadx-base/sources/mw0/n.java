package mw0;

import b63.t;
import c2.x2;
import c22.g0;
import com.garmin.android.apps.connectmobile.R;
import gw0.h0;
import gw0.u;
import java.util.ArrayList;
import lc.u0;
import mt0.e0;
import o53.b0;
import p13.y;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121281a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.SUMMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121281a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u uVar, t tVar, kw0.f fVar, pv0.r rVar, String str, p3.m mVar, int i14) {
        int i15;
        uVar.getClass();
        rVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-1526087222);
        int i16 = i14 | (o0VarE.r(uVar) ? 4 : 2) | (o0VarE.r(tVar) ? 32 : 16) | (o0VarE.r(fVar) ? 256 : 128) | (o0VarE.k(rVar.ordinal()) ? 2048 : 1024) | (o0VarE.B(str) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(uVar.f79771l, o0VarE);
            w13.c cVar = r.f121291d;
            int iIndexOf = cVar.indexOf(((h0) p1VarC.getF182175a()).f79611c);
            boolean zR = o0VarE.r(cVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new mh1.i(cVar, 16);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new mh1.i(cVar, 16);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(iIndexOf, (e23.a) objQ, o0VarE, 0, 2);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            o0VarE.C(-1985951013);
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                r rVar2 = (r) bVar.next();
                zv0.d.f207169a.getClass();
                rVar2.getClass();
                int i17 = zv0.d.a.f207171b[rVar2.ordinal()];
                if (i17 == 1) {
                    i15 = R.string.activity_details_summary;
                } else {
                    if (i17 != 2) {
                        u0.r();
                        return;
                    }
                    i15 = R.string.lbl_details;
                }
                arrayList.add(gl1.y.Q(o0VarE, i15));
            }
            o0VarE.g0(false);
            boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(bVarB) | o0VarE.r(uVar) | o0VarE.r(cVar);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == p3.m.a.f135155b) {
                e0 e0Var = new e0(b0Var, uVar, cVar, bVarB, 3);
                o0VarE.K(e0Var);
                objQ3 = e0Var;
            }
            g0.a(iIndexOf, arrayList, null, false, (e23.l) objQ3, o0VarE, 0, 12);
            h2.u.a(bVarB, x2.d(h4.r.S, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-1409695255, new aa2.q(cVar, tVar, fVar, rVar, str, uVar, 8), o0VarE), o0VarE, 100663344, 24576, 16124);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            boolean zB = o0VarE.B(bVarB) | o0VarE.k(iIndexOf);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == p3.m.a.f135155b) {
                objQ4 = new m(bVarB, iIndexOf, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, numValueOf, o0VarE);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(uVar, tVar, fVar, rVar, str, i14, 26);
        }
    }
}
