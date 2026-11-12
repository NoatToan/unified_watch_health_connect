package an0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import e23.l;
import e23.p;
import ew1.i1;
import gv0.y;
import ht.s;
import i3.y5;
import java.util.List;
import km0.m;
import lc.u0;
import mt0.v;
import mt0.z;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p13.j0;
import p3.p1;
import vt1.f;
import ww1.b0;
import ww1.c0;
import ww1.h;
import ww1.t;
import ww1.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4473e;

    public /* synthetic */ d(l lVar, String str, p1 p1Var, boolean z14) {
        this.f4469a = 4;
        this.f4472d = p1Var;
        this.f4473e = str;
        this.f4471c = lVar;
        this.f4470b = z14;
    }

    @Override // e23.a
    public final Object invoke() {
        String trainingType;
        Long trainingPlanId;
        c0 trainingPlanDetailBrief;
        h athleteRace;
        int i14 = this.f4469a;
        String raceName = null;
        Boolean bool = null;
        raceName = null;
        raceName = null;
        Object obj = this.f4473e;
        boolean z14 = this.f4470b;
        Object obj2 = this.f4472d;
        Object obj3 = this.f4471c;
        switch (i14) {
            case 0:
                l lVar = (l) obj3;
                m mVar = (m) obj;
                l lVar2 = (l) obj2;
                if (z14) {
                    Long userId = mVar.f105412a.getUserId();
                    lVar.invoke(Long.valueOf(userId != null ? userId.longValue() : -1L));
                } else {
                    Long userId2 = mVar.f105412a.getUserId();
                    lVar2.invoke(Long.valueOf(userId2 != null ? userId2.longValue() : -1L));
                }
                return Unit.INSTANCE;
            case 1:
                i1 i1Var = (i1) obj3;
                f fVar = (f) obj2;
                Context context = (Context) obj;
                i1.a aVar = i1.f66514e;
                if (z14) {
                    dw1.a aVarH5 = i1Var.y6().H5();
                    aVarH5.f61435a.setValue(aVarH5.f61442h);
                } else {
                    if (z14) {
                        u0.r();
                        return null;
                    }
                    i1Var.y6().H5().f61443i = true;
                    aw1.h hVarY6 = i1Var.y6();
                    String strD = vw1.c.d(context);
                    fVar.getClass();
                    hVarY6.B6(fVar, strD, true);
                }
                return Unit.INSTANCE;
            case 2:
                p pVar = (p) obj3;
                pu0.b bVar = (pu0.b) obj2;
                y yVar = (y) obj;
                if (z14) {
                    j0 j0Var = j0.f134944a;
                    pVar.invoke(pu0.b.a(bVar, j0Var, null, j0Var, null, null, null, 65271), yVar);
                }
                return Unit.INSTANCE;
            case 3:
                return ParametersHolderKt.parametersOf((String) obj3, Boolean.valueOf(z14), (i53.c) obj2, (i53.c) obj);
            case 4:
                ((p1) obj2).setValue(y5.a((String) obj));
                ((l) obj3).invoke(Boolean.valueOf(!z14));
                return Unit.INSTANCE;
            case 5:
                t tVar = (t) obj3;
                Context context2 = (Context) obj2;
                mu1.a aVar2 = ((lu1.d) obj).f115003a;
                int i15 = lu1.d.f115002b;
                s sVar = s.f85508a;
                lt.e.n nVar = new lt.e.n(lt.e.a.Tapped);
                sVar.getClass();
                s.a(nVar);
                c0 trainingPlanDetailBrief2 = tVar.getTrainingPlanDetailBrief();
                if (trainingPlanDetailBrief2 == null) {
                    return Unit.INSTANCE;
                }
                long athletePlanId = trainingPlanDetailBrief2.getAthletePlanId();
                b0 b0VarB = tVar.b();
                int i16 = b0VarB == null ? -1 : lu1.d.b.f115004a[b0VarB.ordinal()];
                if (i16 == -1) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "TrainingPlanComposable", "Training plan classification is null");
                } else if (i16 == 1) {
                    TrainingPlanDashboardActivity.a aVar4 = TrainingPlanDashboardActivity.f45383n;
                    aVar4.getClass();
                    if (context2 != null) {
                        context2.startActivity(TrainingPlanDashboardActivity.a.b(aVar4, context2, athletePlanId, null, 32));
                    }
                } else if (i16 == 2) {
                    ITPDashboardActivity.a aVar5 = ITPDashboardActivity.f45618m;
                    if (context2 != null) {
                        aVar5.getClass();
                        context2.startActivity(ITPDashboardActivity.a.a(context2, athletePlanId, null, false));
                    } else {
                        aVar5.getClass();
                    }
                } else if (i16 != 3) {
                    if (i16 != 4) {
                        u0.r();
                        return null;
                    }
                    Intent intentB = ActiveTrainingPlansActivity.a.b(ActiveTrainingPlansActivity.f45098w, context2, true);
                    intentB.putExtra("GCM_extra_top_navigation", true);
                    context2.startActivity(intentB);
                } else if (z14) {
                    rt1.l.f154545a.getClass();
                    rt1.l.a("GarminCoachHomeCardProgressReportTapped");
                    u uVar = aVar2.f121119a.f97521b;
                    if (uVar != null && (trainingPlanDetailBrief = uVar.f187871a.getTrainingPlanDetailBrief()) != null && (athleteRace = trainingPlanDetailBrief.getAthleteRace()) != null) {
                        raceName = athleteRace.getRaceName();
                    }
                    boolean z15 = raceName != null;
                    u uVar2 = aVar2.f121119a.f97521b;
                    if (uVar2 != null && (trainingPlanId = uVar2.f187871a.getTrainingPlanId()) != null) {
                        long jLongValue = trainingPlanId.longValue();
                        FBTProgressReportActivity.f45512b.getClass();
                        FBTProgressReportActivity.a.a(context2, jLongValue, z15);
                    }
                } else {
                    c0 trainingPlanDetailBrief3 = tVar.getTrainingPlanDetailBrief();
                    if (trainingPlanDetailBrief3 == null || (trainingType = trainingPlanDetailBrief3.getTrainingType()) == null) {
                        return Unit.INSTANCE;
                    }
                    FBTDashBoardActivity.f45458n.getClass();
                    FBTDashBoardActivity.a.b(context2, athletePlanId, trainingType);
                }
                return Unit.INSTANCE;
            case 6:
                l lVar3 = (l) obj2;
                w20.b bVar2 = (w20.b) obj;
                ((l) obj3).invoke(Boolean.FALSE);
                if (!z14) {
                    lVar3.invoke(bVar2);
                }
                return Unit.INSTANCE;
            default:
                zt0.a aVar6 = (zt0.a) obj3;
                List listX4 = (List) obj2;
                com.garmin.android.apps.connectmobile.leaderboard.model.s sVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.s) obj;
                v vVar = aVar6.f206943n;
                if (listX4.isEmpty()) {
                    listX4 = aVar6.x4();
                }
                x xVar = x.f37955a;
                if (sVar2 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l || sVar2 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k) {
                    bool = Boolean.TRUE;
                } else if (sVar2 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d || sVar2 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g) {
                    bool = Boolean.FALSE;
                }
                return new z(vVar, listX4, z14, bool != null ? bool.booleanValue() : false);
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, boolean z14, Object obj3, int i14) {
        this.f4469a = i14;
        this.f4471c = obj;
        this.f4472d = obj2;
        this.f4470b = z14;
        this.f4473e = obj3;
    }

    public /* synthetic */ d(Object obj, boolean z14, Object obj2, Object obj3, int i14) {
        this.f4469a = i14;
        this.f4471c = obj;
        this.f4470b = z14;
        this.f4472d = obj2;
        this.f4473e = obj3;
    }

    public /* synthetic */ d(boolean z14, l lVar, m mVar, l lVar2) {
        this.f4469a = 0;
        this.f4470b = z14;
        this.f4471c = lVar;
        this.f4473e = mVar;
        this.f4472d = lVar2;
    }

    public /* synthetic */ d(boolean z14, Object obj, Object obj2, Object obj3, int i14) {
        this.f4469a = i14;
        this.f4470b = z14;
        this.f4471c = obj;
        this.f4472d = obj2;
        this.f4473e = obj3;
    }
}
