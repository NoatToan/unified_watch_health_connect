package cv0;

import ak0.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import gl1.y;
import l72.c1;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, e23.a aVar, l lVar, gv0.d dVar, m mVar, yu0.f fVar) {
        p1 p1Var;
        boolean z14;
        m.a.C2565a c2565a;
        String strQ;
        l lVar2 = lVar;
        fVar.getClass();
        dVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1275863818);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(fVar.f199712j, o0VarE);
            ev0.c cVar = (ev0.c) ((g3) p1VarC.getF182175a()).f35301b;
            boolean zD = g22.n.d(cVar != null ? cVar.f66156e : null);
            ev0.c cVar2 = (ev0.c) ((g3) p1VarC.getF182175a()).f35301b;
            String str = cVar2 != null ? cVar2.f66156e : null;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            if (!((Boolean) p1Var3.getF182175a()).booleanValue() || ((ge2.b) p1Var2.getF182175a()) == null) {
                p1Var = p1Var3;
                p1Var2 = p1Var2;
                z14 = false;
                c2565a = c2565a2;
                o0VarE.C(1203171628);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1202286547);
                if (((ge2.b) p1Var2.getF182175a()) == ge2.b.Everyone && g22.n.d(str)) {
                    strQ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1202379392, R.string.lbl_anyone_with_access_code, o0VarE, false);
                } else {
                    o0VarE.C(1202460612);
                    ge2.b bVar = (ge2.b) p1Var2.getF182175a();
                    bVar.getClass();
                    strQ = y.Q(o0VarE, lv0.c.a(bVar));
                    o0VarE.g0(false);
                }
                c1 c1Var = c1.f110940a;
                String strQ2 = y.Q(o0VarE, R.string.livetrack_confirm_change_past_sessions_privacy);
                String strP = y.P(R.string.livetrack_past_sessions_changed_msg, new Object[]{strQ}, o0VarE);
                String strQ3 = y.Q(o0VarE, R.string.lbl_common_continue);
                String strQ4 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean zR = o0VarE.r(dVar) | ((57344 & i15) == 16384);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a2) {
                    af0.e eVar = new af0.e((Object) dVar, (Object) aVar, (Object) p1Var3, (Object) p1Var2, 15);
                    o0VarE.K(eVar);
                    objQ3 = eVar;
                }
                e23.a<Unit> aVar2 = (e23.a) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new z(p1Var3, 27);
                    o0VarE.K(objQ4);
                }
                c2565a = c2565a2;
                p1Var = p1Var3;
                z14 = false;
                c1Var.a(false, strQ2, strP, null, null, strQ3, false, false, aVar2, strQ4, (e23.a) objQ4, o0VarE, 0, 6, 217);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            String strQ5 = y.Q(o0VarE, R.string.livetrack_update_past_sessions);
            i53.f fVarA = i53.a.a(new i3("menu_item_update", y.Q(o0VarE, R.string.lbl_update), ((ge2.b) p1Var2.getF182175a()) != null ? true : z14, (u4.d) null, (String) null, 24, (j) null));
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new am.c1(p1Var2, p1Var, 2);
                o0VarE.K(objQ5);
            }
            l lVar3 = (l) objQ5;
            lVar2 = lVar;
            gl1.d.b(strQ5, aVar, false, null, fVarA, lVar3, z3.f.c(790452996, new e(zD, lVar2, p1Var2), o0VarE), o0VarE, ((i15 >> 9) & 112) | 1802240, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(fVar, dVar, lVar2, aVar, i14);
        }
    }
}
