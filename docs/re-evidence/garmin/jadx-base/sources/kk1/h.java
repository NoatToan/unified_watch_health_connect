package kk1;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import androidx.navigation.fragment.NavHostFragment;
import by1.q;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.ActivitiesEditIntervalsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.WeeklyLeaderboardActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import e23.p;
import gl1.y;
import gy0.d1;
import h4.r;
import h5.e0;
import i3.mh;
import i3.wd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.t3;
import kq.c0;
import kq.j0;
import ky0.b2;
import ky0.c2;
import ky0.w0;
import l30.y0;
import l72.w;
import lc.u0;
import lc.v0;
import m63.b0;
import m63.q0;
import o13.t;
import o53.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.h1;
import p006l2.j3;
import p006l2.l0;
import p006l2.m2;
import p3.b4;
import p3.m;
import p3.n;
import p3.p0;
import p3.v;
import p3.x1;
import r53.p2;
import s5.x0;
import sy0.k;
import v62.h6;
import z2.h2;
import z2.q1;
import z2.s1;
import zd0.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105158b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f105157a = i14;
        this.f105158b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x064d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0389  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object value3;
        ArrayList arrayList2;
        Object value4;
        LinkedHashMap linkedHashMapN;
        int i14 = this.f105157a;
        m.a aVar = m.f135153a;
        ?? r14 = this.f105158b;
        switch (i14) {
            case 0:
                g gVar = (g) r14;
                Map map = (Map) obj;
                gVar.f105151e = (List) obj2;
                p2 p2Var = gVar.f105154h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, false, false, i53.a.k(map), false, 54)));
                return Unit.INSTANCE;
            case 1:
                GroupCreationActivity groupCreationActivity = (GroupCreationActivity) r14;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = GroupCreationActivity.f36131b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1733274147, new jt1.m((Object) y.I(new v0[0], mVar), (Object) groupCreationActivity, (Object) zc.g.a(groupCreationActivity.da().f105345l, mVar), false, 17), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                kn1.f.b((nn1.a) r14, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = (ActivitiesEditIntervalsActivity) r14;
                Integer num = (Integer) obj;
                num.getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ko.j jVar = activitiesEditIntervalsActivity.f29115h;
                if (jVar != null) {
                    LinkedHashSet linkedHashSet = jVar.f105741l;
                    if (zBooleanValue) {
                        linkedHashSet.add(num);
                    } else {
                        linkedHashSet.remove(num);
                    }
                    jVar.f105735f.m(Boolean.valueOf(linkedHashSet.isEmpty()));
                    Objects.toString(linkedHashSet);
                }
                activitiesEditIntervalsActivity.f29117j = true;
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int i16 = c0.f106052g;
                ((c0) r14).g((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i17 = j0.f106090g;
                ((j0) r14).g((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                WeeklyLeaderboardActivity weeklyLeaderboardActivity = (WeeklyLeaderboardActivity) r14;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WeeklyLeaderboardActivity.a aVar2 = WeeklyLeaderboardActivity.f37160b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    zt0.c cVar = (zt0.c) weeklyLeaderboardActivity.f37161a.getValue();
                    boolean zR = mVar2.r(weeklyLeaderboardActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new WeeklyLeaderboardActivity.b(weeklyLeaderboardActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new WeeklyLeaderboardActivity.b(weeklyLeaderboardActivity);
                            mVar2.K(objQ);
                        }
                    }
                    vt0.f.d(cVar, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 7:
                p2 p2Var2 = ((kv0.j) r14).f106667d;
                uu0.d dVar = (uu0.d) obj;
                long jLongValue = ((Long) obj2).longValue();
                int i18 = kv0.j.f106663m;
                dVar.getClass();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "LivetrackStatusViewModel", "Processing event from device " + dVar + " and device unit id " + jLongValue);
                if (dVar.equals(uu0.d.a.f172804a)) {
                    do {
                        value3 = p2Var2.getValue();
                        List<ou0.c> list = (List) ((g3) value3).f35301b;
                        if (list != null) {
                            arrayList2 = new ArrayList(p13.y.r(list, 10));
                            for (ou0.c cVarA : list) {
                                if (cVarA.f133964a == jLongValue) {
                                    cVarA = ou0.c.a(cVarA, Boolean.TRUE, false, false, false, false, 1007);
                                }
                                arrayList2.add(cVarA);
                            }
                        } else {
                            arrayList2 = null;
                        }
                        g3.f35298f.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(arrayList2)));
                } else {
                    if (!dVar.equals(uu0.d.b.f172805a)) {
                        u0.r();
                        return null;
                    }
                    do {
                        value2 = p2Var2.getValue();
                        List<ou0.c> list2 = (List) ((g3) value2).f35301b;
                        if (list2 != null) {
                            arrayList = new ArrayList(p13.y.r(list2, 10));
                            for (ou0.c cVarA2 : list2) {
                                if (cVarA2.f133964a == jLongValue) {
                                    cVarA2 = ou0.c.a(cVarA2, Boolean.FALSE, false, false, false, false, 1007);
                                }
                                arrayList.add(cVarA2);
                            }
                        } else {
                            arrayList = null;
                        }
                        g3.f35298f.getClass();
                    } while (!p2Var2.b(value2, g3.a.d(arrayList)));
                }
                return Unit.INSTANCE;
            case 8:
                ky0.a2 a2Var2 = (ky0.a2) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                MultiDayActivitiesDetailActivity.a aVar4 = MultiDayActivitiesDetailActivity.f39233a;
                a2Var2.getClass();
                w0 w0Var = (w0) r14.getValue();
                w0Var.getClass();
                p2 p2Var3 = w0Var.C1;
                do {
                    value4 = p2Var3.getValue();
                    i53.g gVar2 = (i53.g) value4;
                    d1 d1Var = (d1) w0Var.B.getValue();
                    String str = w0Var.f107579b;
                    d1Var.getClass();
                    t tVar = d1Var.f80132b;
                    str.getClass();
                    String strA = ((gy0.n) tVar.getValue()).a(str);
                    if (strA != null) {
                        n63.b.a aVar5 = n63.b.f123892d;
                        aVar5.getClass();
                        b0 b0Var = new b0("com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesReportsSettingsType", ky0.a2.values());
                        m63.g gVar3 = m63.g.f116948a;
                        Map map2 = (Map) aVar5.c(new q0(b0Var, gVar3), strA);
                        map2.put(a2Var2, bool);
                        ((gy0.n) tVar.getValue()).b(str, aVar5.b(new q0(new b0("com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesReportsSettingsType", ky0.a2.values()), gVar3), map2));
                    }
                    linkedHashMapN = p13.u0.n(gVar2);
                    linkedHashMapN.put(a2Var2, bool);
                } while (!p2Var3.b(value4, i53.a.k(linkedHashMapN)));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                b2.a((sy0.d) r14, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                c2.a((k) r14, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                Long l14 = (Long) obj2;
                if (s1.a((q1) r14, l14.longValue())) {
                    return l14;
                }
                return null;
            case 12:
                ge1.b.T((o53.b0) r14, null, d0.UNDISPATCHED, new l0((m2) obj2, (w2.n) obj, null), 1);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                h1.d((h2) r14, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((p006l2.p2) r14).d(((n4.c) obj2).f123544a);
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((j3) r14).a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                f01.j jVar2 = (f01.j) r14;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    String strQ = y.Q(mVar3, jVar2.f67718a);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 17:
                t3 t3Var = (t3) r14;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l31.a aVar6 = l31.a.f109686a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strQ2 = y.Q(mVar4, R.string.lbl_garmin_voice_command);
                    String strQ3 = y.Q(mVar4, R.string.msg_onboarding_garmin_voice_command);
                    String strQ4 = y.Q(mVar4, R.string.lbl_how_to_set_up_garmin_voice_command);
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA = a72.f.a(h6.f175899a);
                    boolean zR2 = mVar4.r(t3Var);
                    Object objQ2 = mVar4.q();
                    if (zR2) {
                        objQ2 = new q(t3Var, 3);
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new q(t3Var, 3);
                            mVar4.K(objQ2);
                        }
                    }
                    m31.a.a(strQ2, strQ3, strQ4, dVarA, (e23.a) objQ2, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 18:
                k2.h hVar = (k2.h) r14;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                w wVar = w.f111301a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    r rVarE = u1.n.e(rVarF, d92.b.a(mVar5).c().e(), hVar);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, aVar7, mVar5, 48);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    p3.i2 i2VarX = mVar5.x();
                    r rVarC = h4.k.c(rVarE, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar8);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar5);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    w.f111301a.b(mVar5, 6);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 19:
                wd wdVar = (wd) r14;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97932i;
                    v.a(mh.f89022a.c(x0Var), z3.f.c(-479562721, new y0(4, wdVar, x0.a(x0Var, ((o4.d0) d92.b.a(mVar6).h().f63515b.getF182175a()).f128833a, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214)), mVar6), mVar6, 56);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 20:
                t2 t2Var = (t2) r14;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    lg2.i.f112327a.getClass();
                    r1.c0.d(t2Var, true, null, null, null, null, lg2.i.f112329c, mVar7, 1572912, 30);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                li0.c0 c0Var = li0.c0.f112641a;
                ((li0.c0) r14).e((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                nj2.a aVar9 = (nj2.a) r14;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                ge1.b.T(v1.a(aVar9), null, null, new nj2.e(aVar9, str2, str3, null), 3);
                return Unit.INSTANCE;
            case 23:
                o.a aVar10 = (o.a) r14;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    wf.f.a aVar11 = new wf.f.a((Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar11.f184930c = aVar10.f204093d;
                    wf.g.a(aVar11);
                    wf.f fVarA = aVar11.a();
                    t4.d dVarA2 = n5.c.a(2131231969, mVar8, 0);
                    t4.d dVarA3 = n5.c.a(2131231969, mVar8, 0);
                    g6.f.a aVar12 = g6.f.f75994b;
                    jf.r.b(fVarA, "", x2.q(r.S, 48), dVarA2, dVarA3, null, null, null, null, null, null, null, mVar8, 432, 0, 32736);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 24:
                lo.t tVar2 = (lo.t) r14;
                tVar2.f113949a.m1(((Double) obj).doubleValue(), ((Boolean) obj2).booleanValue());
                tVar2.w6();
                return Unit.INSTANCE;
            case 25:
                FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment = (FitPayApp2WebVerificationFragment) r14;
                ((Integer) obj2).getClass();
                ((DialogInterface) obj).getClass();
                androidx.fragment.app.m activity = fitPayApp2WebVerificationFragment.getActivity();
                activity.getClass();
                ((FitPayCardVerificationActivity) activity).ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a(fitPayApp2WebVerificationFragment).m();
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar13 = LostWatchActivity.f52015j;
                ((DialogInterface) obj).getClass();
                ((LostWatchActivity) r14).startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:0492679114")));
                return Unit.INSTANCE;
            case 27:
                gm2.b bVar2 = (gm2.b) r14;
                bVar2.getClass();
                ((ek2.a) obj2).getClass();
                dk2.d.a aVar14 = dk2.d.f60235m;
                gm2.a aVar15 = new gm2.a(bVar2);
                aVar14.getClass();
                return dk2.d.a.a((ScanResult) obj, aVar15);
            case 28:
                n11.a aVar16 = (n11.a) r14;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    String strA2 = aVar16.a();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar9), mVar9, 0, 0, 131070);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            default:
                n72.i iVar = (n72.i) r14;
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    iVar.getContent().invoke(mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, int i14, int i15) {
        this.f105157a = i15;
        this.f105158b = obj;
    }
}
