package ug2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.j1;
import androidx.lifecycle.v1;
import androidx.work.impl.WorkDatabase;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.pendingactivity.api.UploadPendingActivityWorker;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewCompatibleActivityListActivity;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.accompanist.permissions.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;
import r53.c2;
import r53.m1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f170698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f170700d;

    public /* synthetic */ b0(lc.y yVar, p1 p1Var, e23.a aVar) {
        this.f170697a = 11;
        this.f170698b = yVar;
        this.f170700d = p1Var;
        this.f170699c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x02be  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        e23.l<i.c, Unit> lVar;
        final boolean z14;
        j1 j1VarA;
        String str;
        Long l14;
        long jLongValue;
        String str2;
        switch (this.f170697a) {
            case 0:
                r0 r0Var = (r0) this.f170698b;
                e23.l lVar2 = (e23.l) this.f170699c;
                if (q0.d((x3) this.f170700d)) {
                    r0Var.A4();
                }
                lVar2.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                i.c cVar = (i.c) this.f170698b;
                p1 p1Var = (p1) this.f170699c;
                dy1.r rVar = (dy1.r) this.f170700d;
                p1Var.setValue(Boolean.FALSE);
                if (cVar != null && rVar != null && (lVar = rVar.f61631w) != null) {
                    lVar.invoke(cVar);
                }
                return Unit.INSTANCE;
            case 2:
                ArrayList arrayList = (ArrayList) this.f170698b;
                uc.c cVar2 = (uc.c) this.f170699c;
                e23.a aVar = (e23.a) this.f170700d;
                int size = arrayList.size() - cVar2.a().size();
                for (int i14 = 0; i14 < size; i14++) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 3:
                e23.l lVar3 = (e23.l) this.f170699c;
                pe0.g gVar = (pe0.g) this.f170698b;
                ((p1) this.f170700d).setValue(Boolean.FALSE);
                lVar3.invoke(gVar);
                return Unit.INSTANCE;
            case 4:
                p1 p1Var2 = (p1) this.f170698b;
                e23.l lVar4 = (e23.l) this.f170699c;
                je0.j jVar = (je0.j) this.f170700d;
                p1Var2.setValue(Boolean.FALSE);
                lVar4.invoke(jVar);
                return Unit.INSTANCE;
            case 5:
                ge1.b.T((o53.b0) this.f170698b, null, null, new vd0.h0((oe0.l) this.f170699c, (e23.a) this.f170700d, null), 3);
                return Unit.INSTANCE;
            case 6:
                pe0.f fVar = (pe0.f) this.f170698b;
                e23.a aVar2 = (e23.a) this.f170699c;
                p1 p1Var3 = (p1) this.f170700d;
                if (fVar.f137427h == je0.j.ACTIVE) {
                    aVar2.invoke();
                } else {
                    p1Var3.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 7:
                ve.t0 t0Var = (ve.t0) this.f170698b;
                String str3 = (String) this.f170699c;
                ue.j0 j0Var = (ue.j0) this.f170700d;
                cf.u uVarJ = t0Var.f177606d.j();
                List<cf.t.b> listZ = uVarJ.z(str3);
                if (listZ.size() > 1) {
                    org.apache.commons.lang3.e.w("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                cf.t.b bVar = (cf.t.b) p13.h0.d0(listZ);
                if (bVar == null) {
                    df.f.a(new ve.c0(t0Var, str3, ue.l.KEEP, p13.w.c(j0Var)));
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                String str4 = bVar.f26966a;
                cf.t tVarI = uVarJ.i(str4);
                if (tVarI == null) {
                    vb.h.z(v.e0.g("WorkSpec with ", str4, ", that matches a name \"", str3, "\", wasn't found"));
                    return null;
                }
                if (!tVarI.c()) {
                    org.apache.commons.lang3.e.w("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    return null;
                }
                if (bVar.f26967b == ue.h0.c.CANCELLED) {
                    uVarJ.a(str4);
                    df.f.a(new ve.c0(t0Var, str3, ue.l.KEEP, p13.w.c(j0Var)));
                    Unit unit2 = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                final cf.t tVarB = cf.t.b(j0Var.f170094b, bVar.f26966a, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                ve.p pVar = t0Var.f177609g;
                pVar.getClass();
                final WorkDatabase workDatabase = t0Var.f177606d;
                workDatabase.getClass();
                androidx.work.a aVar3 = t0Var.f177605c;
                aVar3.getClass();
                final List<ve.r> list = t0Var.f177608f;
                list.getClass();
                final Set<String> set = j0Var.f170095c;
                final String str5 = tVarB.f26941a;
                final cf.t tVarI2 = workDatabase.j().i(str5);
                if (tVarI2 == null) {
                    vb.h.s(am.j.m("Worker with ", str5, " doesn't exist"));
                    return null;
                }
                if (tVarI2.f26942b.a()) {
                    ue.i0.b[] bVarArr = ue.i0.b.f170089a;
                } else {
                    if (tVarI2.c() ^ tVarB.c()) {
                        StringBuilder sb3 = new StringBuilder("Can't update ");
                        sb3.append(tVarI2.c() ? "Periodic" : "OneTime");
                        sb3.append(" Worker to ");
                        throw new UnsupportedOperationException(am.j.o(tVarB.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type.", sb3));
                    }
                    synchronized (pVar.f177591k) {
                        z14 = pVar.c(str5) != null;
                        break;
                    }
                    if (!z14) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ((ve.r) it.next()).c(str5);
                        }
                    }
                    workDatabase.runInTransaction(new Runnable() { // from class: ve.w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            WorkDatabase workDatabase2 = workDatabase;
                            cf.u uVarJ2 = workDatabase2.j();
                            cf.d0 d0VarK = workDatabase2.k();
                            cf.t tVar = tVarI2;
                            ue.h0.c cVar3 = tVar.f26942b;
                            int i15 = tVar.f26951k;
                            long j8 = tVar.f26954n;
                            int i16 = tVar.f26960t + 1;
                            int i17 = tVar.f26959s;
                            long j14 = tVar.f26961u;
                            int i18 = tVar.f26962v;
                            cf.t tVar2 = tVarB;
                            cf.t tVarB2 = cf.t.b(tVar2, null, cVar3, null, i15, j8, i17, i16, j14, i18, 29613053);
                            if (tVar2.f26962v == 1) {
                                tVarB2.f26961u = tVar2.f26961u;
                                tVarB2.f26962v++;
                            }
                            uVarJ2.l(df.g.b(list, tVarB2));
                            String str6 = str5;
                            d0VarK.a(str6);
                            d0VarK.b(str6, set);
                            if (z14) {
                                return;
                            }
                            uVarJ2.u(-1L, str6);
                            workDatabase2.i().a(str6);
                        }
                    });
                    if (!z14) {
                        ve.t.b(aVar3, workDatabase, list);
                    }
                    ue.i0.b[] bVarArr2 = ue.i0.b.f170089a;
                }
                return Unit.INSTANCE;
            case 8:
                kt0.a aVar4 = (kt0.a) this.f170698b;
                Context context = (Context) this.f170699c;
                com.garmin.android.apps.connectmobile.leaderboard.model.f0 f0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.f0) this.f170700d;
                String str6 = f0Var.f38156i;
                String str7 = f0Var.f38155h;
                b12.b bVar2 = f0Var.f38154g;
                aVar4.a(context, str6, str7, bVar2 != null ? bVar2.f14387a : null);
                return Unit.INSTANCE;
            case 9:
                e23.l lVar5 = (e23.l) this.f170699c;
                vt0.a aVar5 = (vt0.a) this.f170698b;
                ((p1) this.f170700d).setValue(Boolean.FALSE);
                lVar5.invoke(aVar5);
                return Unit.INSTANCE;
            case 10:
                vv0.f fVar2 = (vv0.f) this.f170698b;
                Context context2 = (Context) this.f170699c;
                String str8 = (String) this.f170700d;
                int i15 = vv0.f.f180442f;
                h82.c.f(fVar2, context2, str8);
                return Unit.INSTANCE;
            case 11:
                lc.y yVar = (lc.y) this.f170698b;
                x3 x3Var = (x3) this.f170700d;
                e23.a aVar6 = (e23.a) this.f170699c;
                lc.v vVarF = yVar.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(x3Var.getF182175a(), "REFRESH_DATA");
                }
                aVar6.invoke();
                return Unit.INSTANCE;
            case 12:
                PermissionState permissionState = (PermissionState) this.f170698b;
                p1 p1Var4 = (p1) this.f170699c;
                p1 p1Var5 = (p1) this.f170700d;
                p1Var4.setValue(Boolean.FALSE);
                permissionState.launchPermissionRequest();
                p1Var5.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                e23.l lVar6 = (e23.l) this.f170699c;
                m12.s.c cVar3 = (m12.s.c) this.f170698b;
                ((p1) this.f170700d).setValue(Boolean.FALSE);
                lVar6.invoke(new com.garmin.android.apps.connectmobile.userprofile.presentation.f.a(cVar3.f115862a));
                return Unit.INSTANCE;
            case 14:
                x21.c cVar4 = (x21.c) this.f170698b;
                e23.l lVar7 = (e23.l) this.f170699c;
                ((p1) this.f170700d).setValue(Boolean.TRUE);
                cVar4.f188496f.h();
                String strS0 = d53.y.s0(1000, d53.w.i0((String) cVar4.f188492b.getF182175a()).toString());
                if (strS0.length() > 0) {
                    lVar7.invoke(strS0);
                }
                return Unit.INSTANCE;
            case 15:
                w51.h0 h0Var = (w51.h0) this.f170698b;
                Context context3 = (Context) this.f170699c;
                e23.a aVar7 = (e23.a) this.f170700d;
                h0Var.getClass();
                String str9 = h0Var.f182270e;
                if (str9 != null && str9.length() != 0) {
                    str = h0Var.f182270e;
                    if (str != null) {
                        UploadPendingActivityWorker.a aVar8 = UploadPendingActivityWorker.f39807j;
                        l14 = h0Var.f182271f;
                        if (l14 != null) {
                            jLongValue = l14.longValue();
                        } else {
                            jLongValue = 1000;
                        }
                        aVar8.getClass();
                        UploadPendingActivityWorker.a.a(context3, jLongValue, str);
                    }
                } else if (h0Var.f182269d) {
                    sn.a.o(f12.l.f68084a, true);
                    str = h0Var.f182270e;
                    if (str != null) {
                        UploadPendingActivityWorker.a aVar9 = UploadPendingActivityWorker.f39807j;
                        l14 = h0Var.f182271f;
                        if (l14 != null) {
                            jLongValue = l14.longValue();
                        } else {
                            jLongValue = 1000;
                        }
                        aVar9.getClass();
                        UploadPendingActivityWorker.a.a(context3, jLongValue, str);
                    }
                }
                aVar7.invoke();
                return Unit.INSTANCE;
            case 16:
                e23.a aVar10 = (e23.a) this.f170698b;
                e23.l lVar8 = (e23.l) this.f170699c;
                z51.h hVar = (z51.h) this.f170700d;
                aVar10.invoke();
                lVar8.invoke(hVar.f202505a);
                return Unit.INSTANCE;
            case 17:
                e23.l lVar9 = (e23.l) this.f170699c;
                w51.a aVar11 = (w51.a) this.f170698b;
                p1 p1Var6 = (p1) this.f170700d;
                lVar9.invoke(aVar11.f182214a);
                p1Var6.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                z51.h hVar2 = (z51.h) this.f170698b;
                e23.p pVar2 = (e23.p) this.f170699c;
                e23.a aVar12 = (e23.a) this.f170700d;
                pVar2.invoke(hVar2.f202505a, hVar2.d().b());
                aVar12.invoke();
                return Unit.INSTANCE;
            case 19:
                Context context4 = (Context) this.f170698b;
                String str10 = (String) this.f170699c;
                List list2 = (List) this.f170700d;
                ViewCompatibleActivityListActivity.f48480a.getClass();
                context4.getClass();
                str10.getClass();
                Intent intent = new Intent(context4, (Class<?>) ViewCompatibleActivityListActivity.class);
                Bundle bundleD = b71.i.d("extras_workout_name", str10);
                bundleD.putParcelableArray("extras_compatible_activity_list", (Parcelable[]) list2.toArray(new ww1.i0[0]));
                l2.f37135b.getClass();
                l2.a.b().a(intent, bundleD);
                context4.startActivity(intent);
                return Unit.INSTANCE;
            case 20:
                ((e23.p) this.f170698b).invoke((String) this.f170699c, (com.garmin.android.apps.connectmobile.workouts.data.model.a) this.f170700d);
                return Unit.INSTANCE;
            case 21:
                ((xk2.d) this.f170698b).a((wk2.f) this.f170699c, (CoreTransferException) this.f170700d);
                return Unit.INSTANCE;
            case 22:
                wq0.l lVar10 = (wq0.l) this.f170698b;
                p1 p1Var7 = (p1) this.f170699c;
                p1 p1Var8 = (p1) this.f170700d;
                if (lVar10.x4()) {
                    ge1.b.T(v1.a(lVar10), null, null, new wq0.y(lVar10, null), 3);
                } else {
                    p1Var7.setValue(Boolean.FALSE);
                    p1Var8.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 23:
                Context context5 = (Context) this.f170698b;
                tt0.b bVar3 = (tt0.b) this.f170699c;
                c.q qVar = (c.q) this.f170700d;
                int i16 = wt0.h.f187018c;
                ht.s sVar = ht.s.f85508a;
                lt.e.d dVar = new lt.e.d(lt.e.a.Tapped);
                sVar.getClass();
                ht.s.a(dVar);
                tt0.e eVar = bVar3.f166367b;
                if (eVar instanceof tt0.e.a) {
                    tt0.e.a aVar13 = (tt0.e.a) eVar;
                    String str11 = aVar13.f166371a;
                    if (str11 != null) {
                        tt0.a aVar14 = aVar13.f166376f;
                        if (aVar14 instanceof tt0.a.C3128a) {
                            context5.startActivity(AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, context5, str11, null, 12));
                        } else {
                            if (!(aVar14 instanceof tt0.a.b)) {
                                lc.u0.r();
                                return null;
                            }
                            context5.startActivity(AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, context5, str11, ((tt0.a.b) aVar14).f166365a, 8));
                        }
                    } else {
                        i2.a aVar15 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar15.getClass();
                        i2.a.p(a2Var, "LeaderboardChallengesClickListenerUtils", "No uuid for " + eVar);
                    }
                } else if (eVar instanceof tt0.e.b) {
                    BadgeChallengeDetailsActivity.a aVar16 = BadgeChallengeDetailsActivity.f37204e;
                    String str12 = ((tt0.e.b) eVar).f166377a;
                    aVar16.getClass();
                    qVar.a(BadgeChallengeDetailsActivity.a.a(context5, str12), null);
                } else {
                    if (!(eVar instanceof tt0.e.c)) {
                        lc.u0.r();
                        return null;
                    }
                    BadgeChallengeDetailsActivity.a aVar17 = BadgeChallengeDetailsActivity.f37204e;
                    String str13 = ((tt0.e.c) eVar).f166388a;
                    aVar17.getClass();
                    context5.startActivity(BadgeChallengeDetailsActivity.a.a(context5, str13));
                }
                return Unit.INSTANCE;
            case 24:
                uv1.c cVar5 = (uv1.c) this.f170698b;
                Activity activity = (Activity) this.f170699c;
                lc.m0 m0Var = (lc.m0) this.f170700d;
                int i17 = wv1.b.a.f187456a[cVar5.ordinal()];
                if (i17 == 1) {
                    rt1.l.f154545a.getClass();
                    rt1.l.a("GarminCoachReportFindNewPlanTapped");
                    activity.setResult(11);
                    activity.finish();
                } else {
                    if (i17 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    lc.y.k(wv1.c.a.f187458b.f187457a, m0Var);
                }
                return Unit.INSTANCE;
            case 25:
                dy1.q qVar2 = (dy1.q) this.f170698b;
                p1 p1Var9 = (p1) this.f170699c;
                p1 p1Var10 = (p1) this.f170700d;
                mx1.b bVar4 = qVar2.f61607c;
                if (bVar4 == null || (str2 = bVar4.f121366a) == null) {
                    str2 = "";
                }
                p1Var9.setValue(str2);
                p1Var10.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 26:
                x40.l0 l0Var = (x40.l0) this.f170698b;
                PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) this.f170699c;
                String str14 = (String) this.f170700d;
                c30.n nVar = l0Var.f188726l;
                a50.g gVar2 = (a50.g) l0Var.F.getValue();
                com.garmin.android.library.mapsdkadapter.i.d dVar2 = l0Var.Y;
                nVar.getClass();
                gVar2.getClass();
                dVar2.getClass();
                r53.u uVar = new r53.u(new m1(new r53.v(new x40.u(l0Var, null), new c2(new c30.q(nVar, gVar2, dVar2, pointOfInterestDTO, str14, null))), new x40.v(l0Var, null)), new x40.w(l0Var, null));
                x53.c cVar6 = o53.s0.f129406a;
                r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(l0Var));
                return Unit.INSTANCE;
            case 27:
                ((x40.l0) this.f170698b).x4((com.garmin.android.library.mapsdkadapter.f) this.f170699c, (Integer) this.f170700d, -1L);
                return Unit.INSTANCE;
            case 28:
                ((x40.l0) this.f170698b).D4(new a50.e.c((com.garmin.android.apps.connectmobile.courses.model.f) this.f170699c, (com.garmin.android.library.mapsdkadapter.f) this.f170700d));
                return Unit.INSTANCE;
            default:
                p1 p1Var11 = (p1) this.f170698b;
                p1 p1Var12 = (p1) this.f170699c;
                r70.z zVar = (r70.z) this.f170700d;
                p1Var11.setValue(Boolean.FALSE);
                j70.r rVar2 = (j70.r) p1Var12.getF182175a();
                if (rVar2 != null) {
                    int i18 = r70.z.f151116t;
                    zVar.x4(rVar2, false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b0(Object obj, int i14, Object obj2, Object obj3) {
        this.f170697a = i14;
        this.f170698b = obj;
        this.f170699c = obj2;
        this.f170700d = obj3;
    }

    public /* synthetic */ b0(e23.l lVar, Object obj, p1 p1Var, int i14) {
        this.f170697a = i14;
        this.f170699c = lVar;
        this.f170698b = obj;
        this.f170700d = p1Var;
    }

    public /* synthetic */ b0(wt0.h hVar, Context context, tt0.b bVar, c.q qVar) {
        this.f170697a = 23;
        this.f170698b = context;
        this.f170699c = bVar;
        this.f170700d = qVar;
    }
}
