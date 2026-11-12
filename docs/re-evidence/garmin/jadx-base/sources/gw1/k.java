package gw1;

import a11.u;
import c.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e11.c0;
import e23.p;
import h4.r;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(List<iw1.a> list, boolean z14, boolean z15, m mVar, int i14) {
        boolean z16;
        o0 o0VarE = mVar.E(-2141577165);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            z16 = z14;
            hw1.b.a(null, z16, 0.0f, 0L, null, z3.f.c(438788667, new a31.a(list, 7), o0VarE), o0VarE, (i15 & 112) | 196608);
            if (z15) {
                o0VarE.C(2014888612);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar, j92.b.f97899b.f97918c, o0VarE, false);
            } else {
                o0VarE.C(2014960687);
                o0VarE.g0(false);
            }
        } else {
            z16 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(list, i14, z16, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    public static final void b(ArrayList arrayList, boolean z14, androidx.fragment.app.m mVar, boolean z15, boolean z16, q qVar, m mVar2, int i14) {
        String str;
        Object gVar;
        ArrayList arrayList2;
        androidx.fragment.app.m mVar3 = mVar;
        q qVar2 = qVar;
        o0 o0VarE = mVar2.E(-1431313835);
        boolean z17 = z15;
        boolean z18 = z16;
        int i15 = i14 | (o0VarE.r(arrayList) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(mVar3) ? 256 : 128) | (o0VarE.h(z17) ? 2048 : 1024) | (o0VarE.h(z18) ? 16384 : 8192) | (o0VarE.r(qVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(-1103049248);
            ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iw1.a aVar = (iw1.a) it.next();
                String str2 = aVar.f95326m;
                m52.k kVar = aVar.I;
                if (g22.n.d(str2)) {
                    o0VarE.C(697325367);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_workout);
                    String strQ2 = gl1.y.Q(o0VarE, kVar.f116769e);
                    StringBuilder sbL = e5.l(strQ, StringUtils.SPACE, str2, ". ", gl1.y.Q(o0VarE, R.string.lbl_workout_category));
                    sbL.append(", ");
                    sbL.append(strQ2);
                    String string = sbL.toString();
                    o0VarE.g0(false);
                    str = string;
                } else {
                    o0VarE.C(697680503);
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
                boolean zR = o0VarE.r(aVar) | o0VarE.r(mVar3) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384) | ((458752 & i15) == 131072 || o0VarE.r(qVar2));
                Object objQ = o0VarE.q();
                if (zR) {
                    arrayList2 = arrayList3;
                    gVar = new g(aVar, mVar3, z17, z18, qVar2, 0);
                    o0VarE.K(gVar);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        arrayList2 = arrayList3;
                        gVar = new g(aVar, mVar3, z17, z18, qVar2, 0);
                        o0VarE.K(gVar);
                    } else {
                        arrayList2 = arrayList3;
                        gVar = objQ;
                    }
                }
                arrayList2.add(new hw1.f(dVar, jA, str3, str5, null, str, str6, null, null, (e23.a) gVar, 400, null));
                mVar3 = mVar;
                z17 = z15;
                z18 = z16;
                qVar2 = qVar;
                arrayList3 = arrayList2;
            }
            o0VarE.g0(false);
            hw1.b.a(null, z14, 0.0f, 0L, null, z3.f.c(1332401757, new h(0, arrayList3), o0VarE), o0VarE, (i15 & 112) | 196608);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(arrayList, z14, mVar, z15, z16, qVar, i14);
        }
    }

    public static final void c(iw1.a aVar, boolean z14, boolean z15, m mVar, int i14) {
        o0 o0VarE = mVar.E(605236197);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            ActivityListItemDTO activityListItemDTO = aVar.F;
            if (activityListItemDTO == null) {
                o0VarE.C(319066581);
                o0VarE.g0(false);
            } else {
                o0VarE.C(319066582);
                hw1.b.a(null, z14, 0.0f, 0L, null, z3.f.c(753403411, new c0(22, activityListItemDTO, aVar), o0VarE), o0VarE, (i15 & 112) | 196608);
                if (z15) {
                    o0VarE.C(-167180572);
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar2, j92.b.f97899b.f97918c, o0VarE, false);
                } else {
                    o0VarE.C(-167100809);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bg2.f(aVar, z14, z15, i14, 1);
        }
    }

    public static final void d(final iw1.a aVar, final boolean z14, final boolean z15, final androidx.fragment.app.m mVar, final boolean z16, final boolean z17, final q qVar, m mVar2, final int i14) {
        o0 o0Var;
        String string;
        String str = aVar.f95326m;
        o0 o0VarE = mVar2.E(1047777167);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(mVar) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192) | (o0VarE.h(z17) ? 131072 : 65536) | (o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            if (g22.n.d(str)) {
                o0VarE.C(-1492272815);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_workout);
                String strQ2 = gl1.y.Q(o0VarE, aVar.I.f116769e);
                StringBuilder sbL = e5.l(strQ, StringUtils.SPACE, str, ". ", gl1.y.Q(o0VarE, R.string.lbl_workout_category));
                sbL.append(", ");
                sbL.append(strQ2);
                string = sbL.toString();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1491956615);
                o0VarE.g0(false);
                string = "";
            }
            hw1.b.a(null, z14, 0.0f, 0L, null, z3.f.c(1484253079, new fv0.b(aVar, string, mVar, z16, z17, qVar, 1), o0VarE), o0VarE, (i15 & 112) | 196608);
            o0Var = o0VarE;
            if (z15) {
                o0Var.C(-1491033528);
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar2, j92.b.f97899b.f97918c, o0Var, false);
            } else {
                o0Var.C(-1490961453);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(z14, z15, mVar, z16, z17, qVar, i14) { // from class: gw1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f79863b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f79864c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.fragment.app.m f79865d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f79866e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f79867f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ q f79868g;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(2097153);
                    k.d(this.f79862a, this.f79863b, this.f79864c, this.f79865d, this.f79866e, this.f79867f, this.f79868g, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void e(iw1.a aVar, androidx.fragment.app.m mVar, boolean z14, boolean z15, q qVar) {
        if (z14) {
            Long l14 = aVar.f95315c;
            qVar.a(new tx1.c(l14 != null ? l14.longValue() : -1L, aVar.f95316d != null, z15), null);
        } else {
            ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).f(mVar, aVar.I == m52.k.A, aVar.f95314b);
        }
    }
}
