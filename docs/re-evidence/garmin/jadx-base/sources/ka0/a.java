package ka0;

import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import da0.v;
import e23.l;
import gl1.y;
import gt1.k;
import h4.r;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    public static final void a(long j8, List<qv.b> list, l<? super Long, Unit> lVar, l<? super la0.b, Unit> lVar2, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        boolean z15;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1343850188);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_activity_profiles);
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            String strQ2 = y.Q(o0VarE, R.string.bic_transfer_activity_profiles_button);
            String strQ3 = y.Q(o0VarE, R.string.lbl_skip_button);
            if (j8 != 0) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = false;
            }
            int i16 = i15 & 7168;
            boolean z16 = i16 == 2048 ? z14 : false;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z16) {
                objQ = new k(lVar2, 11);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k(lVar2, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z17 = i16 == 2048;
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new k(lVar2, 12);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new k(lVar2, 12);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            p.b("activity_profiles_backup_screen", strQ, dVarA, null, null, strQ2, aVar3, z15, strQ3, (e23.a) objQ2, false, null, null, false, false, aVar, null, null, null, null, null, z3.f.c(-949081140, new a82.d(j8, list, lVar), o0VarE), o0Var, 6, (i15 << 3) & 458752, 384, 4160536);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e(j8, list, lVar, lVar2, aVar, i14);
        }
    }

    public static final void b(r rVar, long j8, List list, z3.e eVar, l lVar, m mVar, int i14) {
        long j14 = j8;
        o0 o0VarE = mVar.E(-770357879);
        int i15 = i14 | (o0VarE.l(j14) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 16384 : 8192);
        boolean z14 = false;
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            eVar.invoke(o0VarE, 6);
            o0VarE.C(-646148849);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qv.b bVar2 = (qv.b) it.next();
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC2 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                boolean z16 = z15;
                boolean z17 = bVar2.f147910f;
                boolean z18 = j14 == bVar2.f147905a ? z16 : false;
                String str = bVar2.f147907c;
                if (str == null) {
                    str = "";
                }
                String strP = y.P(R.string.txt_last_updated, new Object[]{bVar2.f147911g}, o0VarE);
                String str2 = bVar2.f147906b;
                String str3 = str2 != null ? str2 : "";
                List<String> list2 = bVar2.f147908d;
                int i16 = i15;
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                Iterator it3 = it;
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new jy0.b(28);
                    o0VarE.K(objQ);
                }
                String strK0 = h0.k0(list2, ", ", null, null, (l) objQ, 30);
                boolean zR = ((i16 & 57344) == 16384) | o0VarE.r(bVar2);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new jt1.d(9, lVar, bVar2);
                    o0VarE.K(objQ2);
                }
                v.a(rVarC2, z18, z17, str, strP, str3, strK0, (l) objQ2, o0VarE, 0, 0);
                j14 = j8;
                z14 = false;
                z15 = true;
                i15 = i16;
                it = it3;
            }
            o0VarE.g0(z14);
            o0VarE.g0(z15);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e(rVar, j8, list, eVar, lVar, i14);
        }
    }
}
