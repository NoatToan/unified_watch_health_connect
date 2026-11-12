package cw1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.GroupRideSummaryActivity;
import ew1.b3;
import ew1.m2;
import java.util.List;
import p005kotlin.Unit;
import p3.x3;
import r53.p2;
import yc.h2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56043d;

    public /* synthetic */ g0(p3.p1 p1Var, jv1.x xVar, p3.p1 p1Var2) {
        this.f56040a = 0;
        this.f56041b = p1Var;
        this.f56043d = xVar;
        this.f56042c = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        Object value;
        int i14 = this.f56040a;
        int i15 = 0;
        Object obj = this.f56043d;
        Object obj2 = this.f56042c;
        Object obj3 = this.f56041b;
        switch (i14) {
            case 0:
                ((p3.p1) obj2).setValue(Boolean.TRUE);
                ((p3.p1) obj3).setValue((jv1.x) obj);
                return Unit.INSTANCE;
            case 1:
                hv1.i iVar = (hv1.i) obj2;
                ((p3.p1) obj3).setValue(iVar);
                ((e23.l) obj).invoke(iVar);
                return Unit.INSTANCE;
            case 2:
                c.q qVar = (c.q) obj;
                cy1.c cVar = cy1.c.f56798a;
                int i16 = ey1.a.P;
                Intent intentD4 = ((ey1.a) obj3).D4((Context) obj2, null);
                if (intentD4 != null) {
                    qVar.a(intentD4, null);
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar = (e23.a) obj3;
                e21.a aVar2 = (e21.a) obj2;
                x3 x3Var = (x3) obj;
                if (((e21.a.d) x3Var.getF182175a()).f62621a.f35300a == fw.p.ERROR || (((e21.a.d) x3Var.getF182175a()).f62622b instanceof e21.d.a)) {
                    aVar.invoke();
                } else {
                    w9.a aVarA = androidx.lifecycle.v1.a(aVar2);
                    x53.c cVar2 = o53.s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new e21.c(aVar2, null), 2);
                }
                return Unit.INSTANCE;
            case 4:
                ComposeView composeView = (ComposeView) obj3;
                GroupRideSummaryActivity groupRideSummaryActivity = (GroupRideSummaryActivity) obj2;
                p005kotlin.jvm.internal.m0 m0Var = (p005kotlin.jvm.internal.m0) obj;
                int i17 = GroupRideSummaryActivity.f44755o;
                r22.q0.b bVar = r22.q0.f149800b;
                View rootView = composeView.getRootView();
                rootView.getClass();
                String string = groupRideSummaryActivity.getString(R.string.lbl_removed_groupride);
                string.getClass();
                r22.q0.b.c(bVar, rootView, string, null, 12).show();
                e32.j jVar = (e32.j) groupRideSummaryActivity.oa();
                if (jVar != null) {
                    jVar.a();
                }
                composeView.disposeComposition();
                m0Var.f105804a = false;
                return Unit.INSTANCE;
            case 5:
                gv0.d dVar = (gv0.d) obj2;
                yu0.f fVar = (yu0.f) obj;
                int i18 = dv0.g.d.f61389a[((ev0.a) obj3).ordinal()];
                if (i18 == 1) {
                    ge2.c cVar3 = ge2.c.ActiveSessionPrivacy;
                    ge2.b bVar2 = ge2.b.Everyone;
                    o13.p[] pVarArr = {new o13.p(cVar3, bVar2), new o13.p(ge2.c.ProfilePrivacy, bVar2)};
                    dVar.getClass();
                    dVar.Y4(new gv0.c(pVarArr, i15));
                } else if (i18 == 2) {
                    o13.p[] pVarArr2 = {new o13.p(ge2.c.ProfilePrivacy, ge2.b.Everyone)};
                    dVar.getClass();
                    dVar.Y4(new gv0.c(pVarArr2, i15));
                } else {
                    if (i18 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    o13.p[] pVarArr3 = {new o13.p(ge2.c.ActiveSessionPrivacy, ge2.b.Everyone)};
                    dVar.getClass();
                    dVar.Y4(new gv0.c(pVarArr3, i15));
                }
                fVar.A4();
                return Unit.INSTANCE;
            case 6:
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                ((e23.l) obj2).invoke(Boolean.valueOf(((f11.a) obj).f67890j));
                return Unit.INSTANCE;
            case 7:
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                ((e23.l) obj2).invoke(Boolean.valueOf(((f11.g) obj).f67938j));
                return Unit.INSTANCE;
            case 8:
                e2.i0 i0Var = (e2.i0) obj2;
                e2.m mVar = (e2.m) ((p3.d0) obj3).getF182175a();
                return new e2.p(i0Var, mVar, (e2.e) obj, new g2.q1((j23.l) i0Var.f62438e.f62426e.getF182175a(), mVar));
            case 9:
                AppPromoPopupActivity appPromoPopupActivity = (AppPromoPopupActivity) obj3;
                String str = (String) obj;
                long j8 = appPromoPopupActivity.f29003a;
                if (AppPromoPopupActivity.b.f29008b[((en.n) obj2).ordinal()] == 6) {
                    new en.l(appPromoPopupActivity, str).execute();
                    appPromoPopupActivity.f29004b.a(j8, e31.a.ENTERED_GARMIN_PILOT);
                }
                appPromoPopupActivity.finish();
                return Unit.INSTANCE;
            case 10:
                ge1.b.T((o53.b0) obj2, null, null, new et1.r.b((je2.b) obj, null), 3);
                ((p3.p1) obj3).setValue(Float.valueOf(0.0f));
                return Unit.INSTANCE;
            case 11:
                ge1.b.T((o53.b0) obj3, null, null, new et1.m0((h2.b) obj, null), 3);
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 12:
                e23.l lVar = (e23.l) obj2;
                kt1.b bVar3 = (kt1.b) obj;
                if (!((kt1.b) obj3).f106455i) {
                    lVar.invoke(Long.valueOf(bVar3.f106447a));
                }
                return Unit.INSTANCE;
            case 13:
                ((e23.l) obj2).invoke((us1.e) obj);
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                ge1.b.T((o53.b0) obj3, null, null, new et1.p1((je2.b) obj2, (pt1.c) obj, null), 3);
                return Unit.INSTANCE;
            case 15:
                ge1.b.T((o53.b0) obj3, null, null, new et1.q1((je2.b) obj, null), 3);
                ((e23.l) obj2).invoke(Float.valueOf(0.0f));
                return Unit.INSTANCE;
            case 16:
                ((e23.l) obj2).invoke((us1.o) obj);
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 17:
                ew1.k0.a aVar3 = ew1.k0.f66545d;
                ((ew1.k0) obj3).w6().A6((jv1.o) obj2, (Double) obj);
                return Unit.INSTANCE;
            case 18:
                p3.p1 p1Var = (p3.p1) obj3;
                e23.p pVar = (e23.p) obj2;
                vt1.o oVar = (vt1.o) obj;
                m2.a aVar4 = m2.f66581d;
                if (((vt1.d) p1Var.getF182175a()) != null) {
                    pVar.invoke(oVar, (vt1.d) p1Var.getF182175a());
                }
                return Unit.INSTANCE;
            case 19:
                b3.a aVar5 = b3.f66335d;
                ((b3) obj3).F6().j8((fg0.k) obj2, (fg0.k) obj);
                return Unit.INSTANCE;
            case 20:
                b3 b3Var = (b3) obj2;
                p3.p1 p1Var2 = (p3.p1) obj3;
                fw1.a aVar6 = (fw1.a) obj;
                b3.a aVar7 = b3.f66335d;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachSelectedEventUserEvent");
                fg0.k kVarB5 = b3Var.F6().B5();
                if (kVarB5 != null) {
                    p1Var2.setValue(kVarB5);
                    gg0.f eventType = kVarB5.getEventType();
                    if (eventType != null && eventType.g() && ((listH = kVarB5.h()) == null || listH.isEmpty())) {
                        aw1.h hVarF6 = b3Var.F6();
                        ge1.b.T(androidx.lifecycle.v1.a(hVarF6), null, null, new aw1.f0(hVarF6, kVarB5.getShareableEventUuid(), kVarB5.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), null), 3);
                    } else {
                        b3Var.C6(kVarB5, aVar6);
                    }
                }
                return Unit.INSTANCE;
            case 21:
                e23.l lVar2 = (e23.l) obj2;
                g21.f fVar2 = (g21.f) obj;
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                b63.v vVarF = g22.l.f(b63.v.INSTANCE);
                b63.v vVar = fVar2.f75415a;
                if (vVar != null && vVar.f16219a.getHour() != vVarF.f16219a.getHour()) {
                    vVarF = fVar2.f75415a;
                }
                lVar2.invoke(vVarF);
                return Unit.INSTANCE;
            case 22:
                e23.p pVar2 = (e23.p) obj2;
                g21.f fVar3 = (g21.f) obj;
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                b63.v vVarF2 = g22.l.f(b63.v.INSTANCE);
                b63.v vVar2 = fVar3.f75415a;
                if (vVar2 != null && vVar2.f16219a.getHour() != vVarF2.f16219a.getHour()) {
                    vVarF2 = fVar3.f75415a;
                }
                pVar2.invoke(vVarF2, null);
                return Unit.INSTANCE;
            case 23:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj2;
                boolean zE = k52.g.e(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj3).f49245a);
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = ((f62.x) obj).f69359a;
                if (zE) {
                    pVar3.c0(aVar8, true);
                } else {
                    pVar3.s0(aVar8);
                }
                return Unit.INSTANCE;
            case 24:
                ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj3).n1(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj).f49245a, ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.n) obj2).f49207a);
                return Unit.INSTANCE;
            case 25:
                e23.q qVar2 = (e23.q) obj2;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0.a.C0958a c0958a = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0.a.C0958a) obj;
                p3.p1 p1Var3 = (p3.p1) obj3;
                if (qVar2 != null) {
                    qVar2.invoke(c0958a.f49005a, c0958a.f49006b, c0958a.f49007c);
                }
                p1Var3.setValue(null);
                return Unit.INSTANCE;
            case 26:
                fa0.h hVar = (fa0.h) obj3;
                q92.x xVar = (q92.x) obj2;
                hVar.getClass();
                xVar.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(hVar), null, null, new fa0.k(xVar, hVar, null), 3);
                ((ca0.u0) obj).invoke();
                return Unit.INSTANCE;
            case 27:
                fa0.h hVar2 = (fa0.h) obj3;
                Context context = (Context) obj2;
                q92.x xVar2 = (q92.x) obj;
                hVar2.getClass();
                context.getClass();
                xVar2.getClass();
                z10.d1 d1Var = z10.d1.f200951a;
                hl.a.c cVar4 = hl.a.c.f84256b;
                d1Var.getClass();
                z10.n0 n0VarE = z10.d1.e(context, xVar2, cVar4);
                if (n0VarE != null) {
                    p2 p2Var = hVar2.f70132n;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, new fa0.c(false, null, n0VarE, null, null, 27, null)));
                } else {
                    ge1.b.T(androidx.lifecycle.v1.a(hVar2), null, null, new fa0.j(hVar2, xVar2, null), 3);
                }
                return Unit.INSTANCE;
            case 28:
                ((ff0.c) obj3).d((h2.d) obj2, (h2.a) obj);
                return Unit.INSTANCE;
            default:
                ((ff0.c) obj3).f((h2.c) obj2, (h2.b) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g0(Object obj, Object obj2, p3.p1 p1Var, int i14) {
        this.f56040a = i14;
        this.f56042c = obj;
        this.f56043d = obj2;
        this.f56041b = p1Var;
    }

    public /* synthetic */ g0(Object obj, p3.p1 p1Var, Object obj2, int i14) {
        this.f56040a = i14;
        this.f56042c = obj;
        this.f56041b = p1Var;
        this.f56043d = obj2;
    }

    public /* synthetic */ g0(Object obj, int i14, Object obj2, Object obj3) {
        this.f56040a = i14;
        this.f56041b = obj;
        this.f56042c = obj2;
        this.f56043d = obj3;
    }
}
