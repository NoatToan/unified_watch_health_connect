package bv1;

import a03.t0;
import am.i1;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class y {
    public static final void a(List<iw1.a> list, boolean z14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1837847010);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            hw1.d.a(null, z3.f.c(2022171647, new a31.a(list, 2), o0VarE), o0VarE, 48);
            if (z14) {
                o0VarE.C(943603481);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar, j92.b.f97899b.f97918c, o0VarE, false);
            } else {
                o0VarE.C(943675556);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(list, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    public static final void b(ArrayList arrayList, Activity activity, p3.m mVar, int i14) {
        String str;
        o0 o0VarE = mVar.E(1694881213);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(activity) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(988246705);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iw1.a aVar = (iw1.a) it.next();
                String str2 = aVar.f95326m;
                m52.k kVar = aVar.I;
                if (g22.n.d(str2)) {
                    o0VarE.C(717132583);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_workout);
                    String strQ2 = gl1.y.Q(o0VarE, kVar.f116769e);
                    StringBuilder sbL = e5.l(strQ, StringUtils.SPACE, str2, ". ", gl1.y.Q(o0VarE, R.string.lbl_workout_category));
                    sbL.append(", ");
                    sbL.append(strQ2);
                    String string = sbL.toString();
                    o0VarE.g0(false);
                    str = string;
                } else {
                    o0VarE.C(717487719);
                    o0VarE.g0(false);
                    str = "";
                }
                u4.d dVar = kVar.f116772h;
                m52.k.f116753m.getClass();
                long jA = m52.k.a.a(kVar, o0VarE);
                String str3 = str2 == null ? "" : str2;
                String str4 = aVar.f95328o;
                String str5 = str4 == null ? "" : str4;
                String str6 = aVar.f95329p;
                boolean zR = o0VarE.r(activity) | o0VarE.r(aVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new x(activity, aVar, 0);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new x(activity, aVar, 0);
                        o0VarE.K(objQ);
                    }
                }
                arrayList2.add(new hw1.f(dVar, jA, str3, str5, null, str, str6, null, null, (e23.a) objQ, 400, null));
            }
            o0VarE.g0(false);
            hw1.i.a(x2.f(h4.r.S, 1.0f), arrayList2, o0VarE, 6);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(arrayList, activity, i14, 23);
        }
    }

    public static final void c(iw1.a aVar, boolean z14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-734034260);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ActivityListItemDTO activityListItemDTO = aVar.F;
            if (activityListItemDTO == null) {
                o0VarE.C(-1935929511);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1935929510);
                e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                h4.r.a aVar2 = h4.r.S;
                e3Var.v(3078, activityListItemDTO, null, x2.f(aVar2, 1.0f), o0VarE, aVar.f95323k);
                if (z14) {
                    o0VarE.C(1238587689);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar2, j92.b.f97899b.f97918c, o0VarE, false);
                } else {
                    o0VarE.C(1238667452);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(aVar, z14, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    public static final void d(iw1.a aVar, boolean z14, Activity activity, p3.m mVar, int i14) {
        o0 o0Var;
        String str;
        boolean z15;
        h4.r.a aVar2;
        o0 o0VarE = mVar.E(-1655541693);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(activity) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String str2 = aVar.f95326m;
            m52.k kVar = aVar.I;
            if (g22.n.d(str2)) {
                o0VarE.C(-1132837379);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_workout);
                String strQ2 = gl1.y.Q(o0VarE, kVar.f116769e);
                StringBuilder sbL = e5.l(strQ, StringUtils.SPACE, str2, ". ", gl1.y.Q(o0VarE, R.string.lbl_workout_category));
                sbL.append(", ");
                sbL.append(strQ2);
                String string = sbL.toString();
                o0VarE.g0(false);
                str = string;
            } else {
                o0VarE.C(-1132521179);
                o0VarE.g0(false);
                str = "";
            }
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            u4.d dVar = kVar.f116772h;
            m52.k.f116753m.getClass();
            long jA = m52.k.a.a(kVar, o0VarE);
            String str3 = str2 == null ? "" : str2;
            String str4 = aVar.f95328o;
            String str5 = str4 == null ? "" : str4;
            String str6 = aVar.f95329p;
            boolean zR = o0VarE.r(activity) | o0VarE.r(aVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new x(activity, aVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new x(activity, aVar, 1);
                    o0VarE.K(objQ);
                }
            }
            hw1.i.b(rVarF, new hw1.f(dVar, jA, str3, str5, null, str, str6, null, null, (e23.a) objQ, 400, null), o0VarE, 6, 0);
            String str7 = aVar.Y;
            if (str7 == null) {
                o0VarE.C(-1131346187);
                o0VarE.g0(false);
                o0Var = o0VarE;
                aVar2 = aVar3;
                z15 = false;
            } else {
                o0VarE.C(-1131346186);
                hv1.k.f85893b.getClass();
                String strA = hv1.k.a.a(activity, str7);
                if (strA == null) {
                    o0VarE.C(-414153000);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    aVar2 = aVar3;
                    z15 = false;
                } else {
                    o0VarE.C(-414152999);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, 1);
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                    z15 = false;
                    aVar2 = aVar3;
                    mh.c(strA, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                    Unit unit = Unit.INSTANCE;
                }
                o0Var.g0(z15);
            }
            if (z14) {
                o0Var.C(-1130972140);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar2, j92.b.f97899b.f97918c, o0Var, z15);
            } else {
                o0Var.C(-1130900065);
                o0Var.g0(z15);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(aVar, z14, activity, i14, 3);
        }
    }

    public static final void e(fg0.k kVar, fg0.t tVar, String str, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        h4.r.a aVar3;
        o0 o0VarE = mVar.E(933657200);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            int i16 = i15 << 3;
            jg0.d.a(x2.f(aVar4, 1.0f), kVar, tVar, false, null, true, gl1.y.Q(o0VarE, R.string.supporting_event), null, false, null, aVar, aVar2, o0VarE, (fg0.k.X << 3) | 224262 | (i16 & 112) | (fg0.t.f71346c << 6) | (i16 & 896), (i15 >> 12) & 126, 896);
            if (str == null) {
                o0VarE.C(374135324);
                z15 = false;
                o0VarE.g0(false);
                aVar3 = aVar4;
            } else {
                z15 = false;
                o0VarE.C(374135325);
                hv1.k.a aVar5 = hv1.k.f85893b;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                aVar5.getClass();
                String strA = hv1.k.a.a(context, str);
                if (strA == null) {
                    o0VarE.C(-942107381);
                    o0VarE.g0(false);
                    aVar3 = aVar4;
                } else {
                    o0VarE.C(-942107380);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    aVar3 = aVar4;
                    h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, 1);
                    d92.b.f58624b.getClass();
                    mh.c(strA, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE.C(374454439);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar3, j92.b.f97899b.f97918c, o0VarE, z15);
            } else {
                o0VarE.C(374526514);
                o0VarE.g0(z15);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(kVar, tVar, str, z14, aVar, aVar2, i14);
        }
    }
}
