package sg0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.v1;
import ca0.t1;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import i3.mc;
import java.util.List;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;
import sk0.h1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f159101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f159102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f159103d;

    public /* synthetic */ j(p1 p1Var, f0 f0Var, p1 p1Var2) {
        this.f159100a = 3;
        this.f159103d = p1Var;
        this.f159102c = f0Var;
        this.f159101b = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Long userId;
        int i14 = this.f159100a;
        w01.c cVarB = null;
        Object obj = this.f159103d;
        Object obj2 = this.f159102c;
        Object obj3 = this.f159101b;
        switch (i14) {
            case 0:
                ue0.l lVar = (ue0.l) obj3;
                f0 f0Var = (f0) obj2;
                ((o0) obj).invoke(lVar);
                Long userId2 = lVar.getUserId();
                if (userId2 != null) {
                    f0Var.y4(userId2.longValue());
                }
                return Unit.INSTANCE;
            case 1:
                ue0.l lVar2 = (ue0.l) obj3;
                f0 f0Var2 = (f0) obj2;
                ((o0) obj).invoke(lVar2);
                Long userId3 = lVar2.getUserId();
                if (userId3 != null) {
                    f0Var2.y4(userId3.longValue());
                }
                return Unit.INSTANCE;
            case 2:
                ue0.l lVar3 = (ue0.l) obj3;
                f0 f0Var3 = (f0) obj2;
                ((s0) obj).invoke(lVar3);
                Long userId4 = lVar3.getUserId();
                if (userId4 != null) {
                    f0Var3.y4(userId4.longValue());
                }
                return Unit.INSTANCE;
            case 3:
                f0 f0Var4 = (f0) obj2;
                p1 p1Var = (p1) obj3;
                ue0.l lVar4 = ((u) ((p1) obj).getF182175a()).f159156a;
                if (lVar4 != null && (userId = lVar4.getUserId()) != null) {
                    String strValueOf = String.valueOf(userId.longValue());
                    strValueOf.getClass();
                    f0Var4.f159089h = ge1.b.T(v1.a(f0Var4), f0Var4.f159086e.f22991c, null, new i0(f0Var4, strValueOf, null), 2);
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                ti1.b bVar = (ti1.b) obj;
                Context context = (Context) obj3;
                c.q qVar = (c.q) obj2;
                ht.a aVar = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachOpenMessengerApp"), new o13.p("Type", "CWS"), new o13.p("Action", "OpenStore"), new o13.p("IsFreeTrial", Boolean.valueOf(bVar.f164588f)), new o13.p("FromPlanSetupFlow", Boolean.valueOf(bVar.f164586d)));
                aVar.getClass();
                ht.a.a(bundleA, "UserAction");
                if (bVar.f164585c) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://messenger.garmin.com"));
                    intent.setPackage(hb2.g.a.GARMIN_MESSENGER.f82804a);
                    intent.setFlags(335675392);
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                    listQueryIntentActivities.getClass();
                    if (!listQueryIntentActivities.isEmpty()) {
                        context.startActivity(intent);
                    }
                } else {
                    qVar.a(hb2.g.a.GARMIN_MESSENGER, null);
                }
                return Unit.INSTANCE;
            case 5:
                p1 p1Var2 = (p1) obj2;
                p1Var2.setValue(sk0.l0.b((sk0.l0) p1Var2.getF182175a(), null, i53.a.e(p13.h0.y0((i53.c) obj, (uk0.a) obj3)), null, null, false, null, null, 251));
                return Unit.INSTANCE;
            case 6:
                ge1.b.T((o53.b0) obj, null, null, new sk0.y0.c((mc) obj3, null), 3).J(new s70.b0((h1) obj2, 10));
                return Unit.INSTANCE;
            case 7:
                Context context2 = (Context) obj;
                int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                t60.g gVar = new t60.g("SleepHelp");
                String strN = og2.k.n(context2, gVar.f162711a);
                gVar.a();
                h82.c.f((com.garmin.android.apps.connectmobile.sleep.presentation.a) obj3, context2, ((String) obj2) + strN);
                return Unit.INSTANCE;
            case 8:
                pm1.f fVar = (pm1.f) obj3;
                Context context3 = (Context) obj2;
                int i16 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                hc1.b bVar2 = (hc1.b) ((p1) obj).getF182175a();
                if (bVar2 != null) {
                    fVar.b(context3, bVar2.f83274a, bVar2.f83276c, bVar2.f83275b);
                }
                return Unit.INSTANCE;
            case 9:
                int i17 = sz0.u.E;
                ((sz0.u) obj).Y6((uz0.b) obj3, ((NotificationItem.Request) obj2).getRequestKey());
                return Unit.INSTANCE;
            case 10:
                s3.b bVar3 = (s3.b) obj;
                s3.l lVar5 = (s3.l) obj3;
                t3.e eVar = (t3.e) obj2;
                if (bVar3 != null) {
                    lVar5.a(lVar5.c(bVar3) - lVar5.f156382t);
                }
                List listA = g4.c.a(lVar5, null, lVar5.f156382t, null);
                g4.d dVar = (g4.d) p13.h0.n0(listA);
                Integer num = dVar != null ? dVar.f75735c : null;
                List<g4.d> listD = eVar.d(num);
                if (num != null && !listD.isEmpty()) {
                    g4.d dVar2 = (g4.d) p13.h0.b0(listD);
                    listD = p13.h0.C0(p13.w.c(new g4.d(dVar2.f75733a, dVar2.f75734b, num)), p13.h0.U(listD, 1));
                }
                return new g4.a(p13.h0.C0(listA, listD), eVar.b());
            case 11:
                t70.q qVar2 = (t70.q) obj;
                p1 p1Var3 = (p1) obj3;
                p1 p1Var4 = (p1) obj2;
                if (((Boolean) qVar2.f162968p.f150540a.getValue()).booleanValue()) {
                    qVar2.f162964l.k(null, Boolean.TRUE);
                } else {
                    p1Var3.setValue(Boolean.FALSE);
                    p1Var4.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 12:
                t70.l0 l0Var = (t70.l0) obj;
                p1 p1Var5 = (p1) obj3;
                p1 p1Var6 = (p1) obj2;
                if (p005kotlin.jvm.internal.s.g(l0Var.f162918o, l0Var.A4())) {
                    p1Var5.setValue(Boolean.FALSE);
                    p1Var6.setValue(Boolean.TRUE);
                } else {
                    l0Var.f162916m.k(null, Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 13:
                t70.x0 x0Var = (t70.x0) obj;
                p1 p1Var7 = (p1) obj3;
                p1 p1Var8 = (p1) obj2;
                if (p005kotlin.jvm.internal.s.g(x0Var.f163067w, x0Var.f163069y) && p005kotlin.jvm.internal.s.g(x0Var.f163068x, x0Var.f163070z)) {
                    p1Var7.setValue(Boolean.FALSE);
                    p1Var8.setValue(Boolean.TRUE);
                } else {
                    x0Var.f163063q.k(null, Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 14:
                e23.l lVar6 = (e23.l) obj2;
                q91.b bVar4 = (q91.b) p13.h0.e0(((n1) obj3).getIntValue(), (i53.c) obj);
                if (bVar4 != null) {
                    lVar6.invoke(bVar4);
                }
                return Unit.INSTANCE;
            case 15:
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentPrefsImpl", "observeSyncDeviceDataStatus() awaitClose");
                ((t92.c) obj3).j().unregisterOnSharedPreferenceChangeListener((lp.k) obj2);
                return Unit.INSTANCE;
            case 16:
                ((ta0.x) obj).y4(l90.c.CONFIRM);
                ((e23.l) obj3).invoke((l90.k) obj2);
                return Unit.INSTANCE;
            case 17:
                ta0.x xVar = (ta0.x) obj;
                l90.k kVar = (l90.k) obj3;
                t1 t1Var = (t1) obj2;
                xVar.y4(l90.c.CONFIRM);
                String str = kVar.f111578b;
                str.getClass();
                bm2.a aVar2 = xVar.A.get(str);
                if (aVar2 != null) {
                    t1Var.invoke(new q90.d.a(aVar2, kVar.f111582f, null, 4, null));
                }
                return Unit.INSTANCE;
            case 18:
                ta0.b bVar5 = (ta0.b) obj;
                e23.a aVar3 = (e23.a) obj3;
                if (((va0.a) ((p1) obj2).getF182175a()).f176570d) {
                    ge1.b.T(v1.a(bVar5), null, null, new ta0.a(bVar5, null), 3);
                } else {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                ht.a.f85464a.getClass();
                ht.a.a(null, "ST_CustomerSupportClicked");
                ((e23.p) obj).invoke((Context) obj3, (String) obj2);
                return Unit.INSTANCE;
            case 20:
                return ParametersHolderKt.parametersOf((String) obj, (String) obj3, (String) obj2);
            case 21:
                ((e23.l) obj).invoke(tf0.d.f164432a);
                ((e23.l) obj3).invoke(tf0.l.a((tf0.l) obj2, 55));
                return Unit.INSTANCE;
            case 22:
                sg1.b bVar6 = (sg1.b) obj3;
                ((pg1.a) obj).invoke(Long.valueOf(bVar6.f159194d), Long.valueOf(bVar6.f159191a));
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 23:
                sn.h hVar = (sn.h) obj3;
                ((com.garmin.android.apps.connectmobile.activities.health.presentation.c) obj).f29046a.A4(new com.garmin.android.apps.connectmobile.activities.health.presentation.b.a(hVar.d(), hVar.getCalendarDate()));
                ((p1) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 24:
                tn.m mVar = (tn.m) obj;
                lc.m0 m0Var = (lc.m0) obj3;
                boolean zG = p005kotlin.jvm.internal.s.g(mVar.f165480d, mVar.f165477a);
                ((p1) obj2).setValue(Boolean.valueOf(!zG));
                if (zG) {
                    m0Var.n();
                }
                return Unit.INSTANCE;
            case 25:
                ActiveTrainingPlansActivity.a aVar4 = ActiveTrainingPlansActivity.f45098w;
                FBTDashBoardActivity.a.c(FBTDashBoardActivity.f45458n, (ActiveTrainingPlansActivity) obj, ((ww1.b) obj3).f187755a, (vt1.o) obj2, 1007, 88);
                return Unit.INSTANCE;
            case 26:
                w01.c cVar = (w01.c) obj;
                ab1.g gVar2 = (ab1.g) obj3;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.d) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (cVar != null) {
                    Integer num2 = gVar2.f2581n;
                    Long l14 = gVar2.f2568a;
                    Float f14 = gVar2.f2580m;
                    w01.b bVar7 = cVar.f181028a;
                    cVarB = w01.c.b(cVar, num2, l14, f14, bVar7 != null ? Double.valueOf(bVar7.getHeatIndexTemperatureCelsius()) : null, null, 839);
                }
                if (cVarB != null) {
                    jy1.b bVar8 = dVar3.f45890b;
                    androidx.fragment.app.m mVarRequireActivity = dVar3.requireActivity();
                    mVarRequireActivity.getClass();
                    bVar8.z(mVarRequireActivity, cVarB, dVar3.f45892d);
                }
                return Unit.INSTANCE;
            case 27:
                ((p1) obj2).setValue(Boolean.TRUE);
                ((u82.d) obj).a(obj3);
                return Unit.INSTANCE;
            case 28:
                e23.p pVar = (e23.p) obj3;
                q91.d dVar4 = (q91.d) obj2;
                Long l15 = ((aa1.d) obj).f2256h;
                if (l15 != null) {
                    pVar.invoke(l15, dVar4);
                }
                return Unit.INSTANCE;
            default:
                int i18 = ub1.b.f169785e;
                ((p1) obj2).setValue(Boolean.FALSE);
                ((ub1.b) obj).f169788c.invoke();
                ((e23.a) obj3).invoke();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(Object obj, int i14, Object obj2, Object obj3) {
        this.f159100a = i14;
        this.f159103d = obj;
        this.f159101b = obj2;
        this.f159102c = obj3;
    }
}
