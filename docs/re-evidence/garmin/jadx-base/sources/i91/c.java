package i91;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.m;
import androidx.lifecycle.v1;
import c.q;
import c22.s3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import e23.l;
import e23.p;
import g22.k;
import ib0.n;
import ih0.s;
import j02.b0;
import j02.j0;
import j02.m0;
import jy0.v;
import lc.y;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.c2;
import p3.p1;
import pt1.x;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92330c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f92328a = i14;
        this.f92329b = obj;
        this.f92330c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f92328a;
        int i15 = 0;
        Object obj = this.f92330c;
        Object obj2 = this.f92329b;
        switch (i14) {
            case 0:
                ((l) obj2).invoke((d91.h) obj);
                return Unit.INSTANCE;
            case 1:
                Uri uri = (Uri) ((o13.l) obj).getValue();
                uri.getClass();
                ((q) obj2).a(uri, null);
                return Unit.INSTANCE;
            case 2:
                ib0.g gVar = (ib0.g) obj2;
                ge1.b.T(v1.a(gVar), null, null, new ib0.i(gVar, new n((q) obj, i15), null), 3);
                return Unit.INSTANCE;
            case 3:
                ic1.i.a aVar = ic1.i.f92620g;
                h82.c.f((ic1.i) obj2, (Context) obj, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                return Unit.INSTANCE;
            case 4:
                new nl0.b((m) obj2, false, "scorecard", (String) obj).a().execute();
                return Unit.INSTANCE;
            case 5:
                ((p1) obj).setValue(Boolean.TRUE);
                ((q0) obj2).j();
                return Unit.INSTANCE;
            case 6:
                ((s) obj2).A4();
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 7:
                ((mi0.c) obj2).y4((Context) obj);
                return Unit.INSTANCE;
            case 8:
                ((gi0.a) obj2).c((Context) obj);
                return Unit.INSTANCE;
            case 9:
                al2.c cVar = (al2.c) obj;
                ((p) obj2).invoke(cVar.f3777c, cVar.f3778d);
                return Unit.INSTANCE;
            case 10:
                ((l) obj2).invoke((al2.c) obj);
                return Unit.INSTANCE;
            case 11:
                ((sm1.s) obj2).f160192l.i(new o82.a(k.z((DateTime) obj).b(), null, 2, null), true);
                return Unit.INSTANCE;
            case 12:
                l lVar = (l) obj2;
                ds1.a aVar2 = (ds1.a) obj;
                if (lVar != null) {
                    lVar.invoke(aVar2);
                }
                return Unit.INSTANCE;
            case 13:
                Long l14 = (Long) obj;
                com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar3 = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
                is0.c cVar2 = (is0.c) ((com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b) obj2).f37021n.getValue();
                if (l14 != null) {
                    w9.a aVarA = v1.a(cVar2);
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new is0.b(cVar2, l14, null), 2);
                }
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                return Unit.INSTANCE;
            case 14:
                ((e23.a) obj2).invoke();
                ((com.garmin.android.library.livetrack.b) obj).a(com.garmin.android.library.livetrack.b.a.EVENT_LIVETRACK_RESEND_DECLINED_REQUEST);
                return Unit.INSTANCE;
            case 15:
                Activity activity = (Activity) obj2;
                q qVar = (q) obj;
                if (activity != null) {
                    qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(activity, c80.q.LIVE_TRACK_PLUS, false), null);
                }
                return Unit.INSTANCE;
            case 16:
                int i16 = ix.f.f95592j;
                h82.c.f((ix.f) obj2, (Context) obj, "https://support.garmin.com/sas/grm/?contentId=VOFJAsiXut9K19k1qEn5W5");
                return Unit.INSTANCE;
            case 17:
                int i17 = ix0.i.f95700f;
                h82.c.f((ix0.i) obj2, (Context) obj, "https://www.mayoclinic.org/healthy-lifestyle/womens-health/in-depth/menstrual-cycle/art-20047186");
                return Unit.INSTANCE;
            case 18:
                g20.e eVar = (g20.e) obj;
                j02.s<?> sVar = ((j02.m) obj2).f96111a;
                c2 c2Var = sVar.f96136k;
                j02.g<?> gVarD = sVar.d();
                g6.k kVarA = gVarD != null ? g6.k.a(gVarD.d()) : null;
                j02.g<?> gVarD2 = sVar.d();
                if ((gVarD2 != null ? Integer.valueOf(gVarD2.getIndex()) : null) != null) {
                    sVar.f96144s.setValue(c2Var.getF182175a());
                    ge1.b.T(sVar.f96127b, null, null, new b0(sVar, sVar.e(), null), 3);
                }
                n4.c.f123541b.getClass();
                long j8 = 0;
                sVar.f96138m.setValue(n4.c.a(0L));
                c2Var.setValue(null);
                if (kVarA != null) {
                    j8 = kVarA.f76005a;
                } else {
                    g6.k.f76003b.getClass();
                }
                sVar.f96139n.setValue(g6.k.a(j8));
                j0 j0Var = sVar.f96131f;
                ge1.b.T(j0Var.f96074b, null, null, new m0(j0Var, null), 3);
                sVar.f96140o.setValue(null);
                sVar.f96141p.setValue(null);
                eVar.invoke();
                return Unit.INSTANCE;
            case 19:
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj2, ((j02.s) obj).f96136k.getF182175a()));
            case 20:
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar4 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                ((l) obj2).invoke((l20.c) obj);
                return Unit.INSTANCE;
            case 21:
                p1 p1Var = (p1) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar = ((com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f) obj2).f49520d;
                if (bVar != null) {
                    bVar.p6(((Boolean) p1Var.getF182175a()).booleanValue());
                }
                return Unit.INSTANCE;
            case 22:
                jf1.b bVar2 = (jf1.b) obj2;
                bVar2.getClass();
                ge1.b.T(v1.a(bVar2), null, null, new jf1.e(bVar2, null), 3);
                y.k(com.garmin.android.apps.connectmobile.running_tolerance.presentation.c.a.f41169b.f41168a, (y) obj);
                return Unit.INSTANCE;
            case 23:
                FitPayCardVerificationActivity fitPayCardVerificationActivity = (FitPayCardVerificationActivity) obj2;
                FitPayCardVerificationActivity.b bVar3 = FitPayCardVerificationActivity.f51449m;
                hn2.c.U9(fitPayCardVerificationActivity, fitPayCardVerificationActivity, null, 12);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(fitPayCardVerificationActivity, (com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a) obj, null);
                return Unit.INSTANCE;
            case 24:
                HelpActivity.a.e(HelpActivity.f36653a, (Context) obj2, (ro0.l) obj, null, null, 12);
                return Unit.INSTANCE;
            case 25:
                x xVar = (x) obj;
                ((p) obj2).invoke(Long.valueOf(xVar.f141004a), Boolean.valueOf(!xVar.f141015l));
                return Unit.INSTANCE;
            case 26:
                l lVar2 = (l) obj2;
                x xVar2 = (x) obj;
                if (lVar2 != null) {
                    lVar2.invoke(Long.valueOf(xVar2.f141004a));
                }
                return Unit.INSTANCE;
            case 27:
                x xVar3 = (x) obj;
                ((e23.q) obj2).invoke(0, xVar3.f141012i, Boolean.valueOf(xVar3.f141019p));
                return Unit.INSTANCE;
            case 28:
                e23.a aVar5 = (e23.a) obj2;
                c12.h hVar = (c12.h) obj;
                if (s3.b()) {
                    aVar5.invoke();
                } else {
                    hVar.b(v.i.f101834b);
                }
                return Unit.INSTANCE;
            default:
                ((l) obj2).invoke((sy0.m) obj);
                return Unit.INSTANCE;
        }
    }
}
