package cn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(h4.r rVar, qm1.k kVar, String str, p3.m mVar, int i14) {
        int i15;
        i53.f fVarA;
        o0 o0VarE = mVar.E(1344529762);
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(kVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (qm1.l.d(kVar)) {
                o0VarE.C(21296154);
                rl1.k.a aVar = rl1.k.f153439c;
                rl1.k kVar2 = rl1.k.MANUAL;
                aVar.getClass();
                fVarA = i53.a.a(new z72.l(100.0f, rl1.k.a.a(kVar2, o0VarE), null));
                o0VarE.g0(false);
                i15 = i16;
            } else {
                o0VarE.C(21431748);
                i53.c<qm1.n> cVar = kVar.f145623d;
                ArrayList arrayList = new ArrayList();
                for (qm1.n nVar : cVar) {
                    if (nVar.f145636a == rl1.k.DEEP) {
                        arrayList.add(nVar);
                    }
                }
                Iterator it = arrayList.iterator();
                double d14 = 0.0d;
                while (it.hasNext()) {
                    d14 += (double) ((qm1.n) it.next()).f145637b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (qm1.n nVar2 : cVar) {
                    if (nVar2.f145636a == rl1.k.LIGHT) {
                        arrayList2.add(nVar2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                double d15 = 0.0d;
                while (it3.hasNext()) {
                    d15 += (double) ((qm1.n) it3.next()).f145637b;
                }
                ArrayList arrayList3 = new ArrayList();
                for (qm1.n nVar3 : cVar) {
                    if (nVar3.f145636a == rl1.k.REM) {
                        arrayList3.add(nVar3);
                    }
                }
                double d16 = 0.0d;
                for (Iterator it4 = arrayList3.iterator(); it4.hasNext(); it4 = it4) {
                    d16 += (double) ((qm1.n) it4.next()).f145637b;
                }
                ArrayList arrayList4 = new ArrayList();
                for (qm1.n nVar4 : cVar) {
                    if (nVar4.f145636a == rl1.k.AWAKE) {
                        arrayList4.add(nVar4);
                    }
                }
                Iterator it5 = arrayList4.iterator();
                double d17 = 0.0d;
                while (it5.hasNext()) {
                    d17 += (double) ((qm1.n) it5.next()).f145637b;
                    i16 = i16;
                }
                i15 = i16;
                rl1.k.a aVar2 = rl1.k.f153439c;
                rl1.k kVar3 = rl1.k.DEEP;
                aVar2.getClass();
                fVarA = i53.a.a(new z72.l((float) d14, rl1.k.a.a(kVar3, o0VarE), null), new z72.l((float) d15, rl1.k.a.a(rl1.k.LIGHT, o0VarE), null), new z72.l((float) d16, rl1.k.a.a(rl1.k.REM, o0VarE), null), new z72.l((float) d17, rl1.k.a.a(rl1.k.AWAKE, o0VarE), null));
                o0VarE.g0(false);
            }
            z72.k.c(rVar, fVarA, null, null, yz1.k.d(o0VarE), qm1.l.d(kVar) ? 0.0f : 2.0f, z3.f.c(1646900676, new as.s(str, 5), o0VarE), o0VarE, (i15 & 14) | 12582912, 28);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(rVar, kVar, str, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    public static final void b(h4.r rVar, qm1.k kVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        o0 o0VarE = mVar.E(-1147903330);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            yz1.d dVar = kVar != null ? kVar.f145620a : null;
            yz1.i iVar = (kVar == null || kVar.f145623d.isEmpty()) ? yz1.i.EMPTY : yz1.i.VALID_DATA;
            yz1.i iVar2 = iVar;
            u4.d dVarB = o70.i.b(o70.i.f130001i);
            String strQ = y.Q(o0VarE, R.string.tr_sleep_score_display_none);
            z3.e eVarC = z3.f.c(972149388, new a71.n(kVar, 14), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a42.d(context, 22);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a42.d(context, 22);
                    o0VarE.K(objQ);
                }
            }
            rVar2 = rVar;
            yz1.k.b(rVar2, dVar, dVarB, eVarC, (e23.a) objQ, strQ, iVar2, o0VarE, (i15 & 14) | 3072);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar2, kVar, i14, 0);
        }
    }
}
