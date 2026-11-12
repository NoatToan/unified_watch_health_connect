package ag0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.connectiq.DefaultConnectIQActivitiesAndAppsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import h2.j0;
import i3.qi;
import i3.ri;
import o70.o;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import p3.a2;
import ro0.l;
import v2.w1;
import z2.z;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3137c;

    public /* synthetic */ a(int i14, Object obj, int i15) {
        this.f3135a = i15;
        this.f3136b = i14;
        this.f3137c = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        ab1.a alertUserSettingsChanges;
        int i14 = this.f3135a;
        int i15 = this.f3136b;
        Object obj = this.f3137c;
        switch (i14) {
            case 0:
                p0 p0Var = (p0) obj;
                b.a aVar = b.Z0;
                int i16 = p0Var.f105807a;
                p0Var.f105807a = i16 + 1;
                Integer numValueOf = Integer.valueOf(i16);
                if (i16 < i15 + 60) {
                    return numValueOf;
                }
                return null;
            case 1:
                return ((DefaultConnectIQActivitiesAndAppsActivity) obj).findViewById(i15);
            case 2:
                cu1.b bVar = ((com.garmin.android.apps.connectmobile.training.atp.dashboard.d) obj).f45421i;
                if (bVar == null) {
                    s.m("presenter");
                    throw null;
                }
                if (i15 == 1) {
                    bVar.e();
                } else if (i15 == 2) {
                    bVar.g(bVar.f55633g);
                } else if (i15 == 3) {
                    bVar.f();
                } else if (i15 == 4) {
                    bVar.f55627a.U1();
                    bVar.f55630d.add(Long.valueOf(bVar.f55629c.L(bVar.f55628b, bVar.f55641o)));
                }
                return Unit.INSTANCE;
            case 3:
                return new a2(db0.c.d(i15 / DateTimeConstants.SECONDS_PER_HOUR, (i53.c) obj));
            case 4:
                return Boolean.valueOf(((j0) obj).l() == i15);
            case 5:
                return new h2.b(i15, 0.0f, (e23.a) obj);
            case 6:
                ri riVar = (ri) obj;
                int iC = riVar.c();
                qi.a aVar2 = qi.f89469b;
                if (i15 != iC) {
                    riVar.d(i15);
                }
                return Unit.INSTANCE;
            case 7:
                ((ds.c) obj).invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 8:
                ((ds.c) obj).invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 9:
                js0.c cVar = (js0.c) obj;
                ManageTripsActivity.a aVar3 = ManageTripsActivity.f36985h;
                if (cVar != null) {
                    cVar.notifyItemChanged(i15);
                }
                return Unit.INSTANCE;
            case 10:
                ht.s sVar = ht.s.f85508a;
                lt.e.g gVar = new lt.e.g(lt.e.a.LearnMore, o.TRAINING_STATUS);
                sVar.getClass();
                ht.s.a(gVar);
                HelpActivity.a.e(HelpActivity.f36653a, (Context) obj, l.TRAINING_STATUS, null, com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a.a(com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j, i15), 4);
                return Unit.INSTANCE;
            case 11:
                ((lg1.a.b) obj).f112181c.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 12:
                ((w1) obj).a2(i15);
                return Boolean.TRUE;
            case 13:
                return Integer.valueOf(((v30.f) obj).f175410a.f117196a.l() % i15);
            case 14:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj;
                ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                if (fVar == null) {
                    s.m("powerGuideStrategyDetails");
                    throw null;
                }
                ab1.d dVar = fVar.f2563a;
                if (dVar != null && (alertUserSettingsChanges = dVar.getAlertUserSettingsChanges()) != null) {
                    alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.C0028a.f2534a;
                }
                editPowerGuideStrategyActivity.ma(i15);
                return Unit.INSTANCE;
            case 15:
                return Integer.valueOf(((z) obj).f201853f.f157281b.d(i15));
            default:
                zt1.f fVar2 = ((ATPEditActivity) obj).f45204b;
                if (fVar2 != null) {
                    fVar2.y(i15);
                    return Unit.INSTANCE;
                }
                s.m("presenter");
                throw null;
        }
    }

    public /* synthetic */ a(Object obj, int i14, int i15) {
        this.f3135a = i15;
        this.f3137c = obj;
        this.f3136b = i14;
    }
}
