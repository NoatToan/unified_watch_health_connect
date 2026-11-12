package q42;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.activities.powercurve.PowerCurveDetailsActivity;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.devices.sensors.SensorsActivity;
import com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailActivity;
import java.text.NumberFormat;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import ps.i1;
import ps.q1;
import r53.c2;
import r53.k2;
import r53.m1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142609b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f142608a = i14;
        this.f142609b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        q1 summaryDTO;
        q1 summaryDTO2;
        int i14 = this.f142608a;
        int i15 = 28;
        int i16 = 29;
        Object obj = this.f142609b;
        switch (i14) {
            case 0:
                i iVar = (i) obj;
                iVar.getClass();
                ge1.b.T(v1.a(iVar), null, null, new j(iVar, null), 3);
                return Unit.INSTANCE;
            case 1:
                int i17 = ItemPickerActivity.a.f39975d;
                return LayoutInflater.from(((ViewGroup) obj).getContext());
            case 2:
                com.garmin.android.apps.connectmobile.powercurve.view.b.a aVar = com.garmin.android.apps.connectmobile.powercurve.view.b.f40346q;
                return ParametersHolderKt.parametersOf((ma1.a) obj);
            case 3:
                qb0.b bVar = (qb0.b) obj;
                return new yr1.q("DeviceSetupSyncViewModel", bVar, Long.valueOf(bVar.f143958a.f143493a), null, 8, null);
            case 4:
                qb0.v vVar = (qb0.v) obj;
                return r53.s.K(vVar.f144027b.a(), v1.a(vVar), k2.a.a(k2.f150703a, 2), new z90.d(0.0f, false, null, 7, null));
            case 5:
                PregnancySetupActivity.a aVar2 = PregnancySetupActivity.f40934g;
                return (qb1.f) new x1((PregnancySetupActivity) obj).b(s0.f105811a.b(qb1.f.class));
            case 6:
                int i18 = qb1.f.D;
                return ((qb1.f) obj).K4();
            case 7:
                SensorsActivity sensorsActivity = (SensorsActivity) obj;
                int i19 = SensorsActivity.f34344b;
                if (sensorsActivity.isTaskRoot() && sensorsActivity.getSupportFragmentManager().M() == 0) {
                    bv.b.f21239a.getClass();
                    ((kd0.m) bv.b.a()).a(sensorsActivity, null, 603979776);
                    sensorsActivity.finish();
                } else {
                    sensorsActivity.getOnBackPressedDispatcher().d();
                }
                return Unit.INSTANCE;
            case 8:
                int i24 = qg0.a.f144654i;
                return (qg0.b) new x1((qg0.a) obj).b(s0.f105811a.b(qg0.b.class));
            case 9:
                return NumberFormat.getIntegerInstance().format(Integer.valueOf(((qk0.t) obj).f145156b.size()));
            case 10:
                ((qk0.i) obj).m2();
                return Unit.INSTANCE;
            case 11:
                qm.y yVar = (qm.y) obj;
                PowerCurveDetailsActivity.a aVar3 = PowerCurveDetailsActivity.f29752b;
                Context context = yVar.f145465a;
                zm.p pVar = yVar.f145466b;
                ps.o oVarM0 = pVar.m0();
                i1 i1VarW3 = pVar.W3();
                boolean z14 = pVar.getF113498h1() == 94;
                double dE2 = pVar.E2();
                aVar3.getClass();
                Intent intent = new Intent(context, (Class<?>) PowerCurveDetailsActivity.class);
                intent.putExtra("dataConfig", new ep.g(oVarM0, i1VarW3));
                intent.putExtra("isWattsPerKg", z14);
                intent.putExtra("userWeight", dE2);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 12:
                qm0.d.a aVar4 = qm0.d.E;
                Fragment fragmentRequireParentFragment = ((qm0.d) obj).requireParentFragment();
                fragmentRequireParentFragment.getClass();
                return fragmentRequireParentFragment;
            case 13:
                return ParametersHolderKt.parametersOf((b63.o) obj);
            case 14:
                NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity = (NewFitPayTermsAndConditionActivity) obj;
                NewFitPayTermsAndConditionActivity.a aVar5 = NewFitPayTermsAndConditionActivity.f51587j;
                newFitPayTermsAndConditionActivity.setResult(13);
                newFitPayTermsAndConditionActivity.finish();
                return Unit.INSTANCE;
            case 15:
                RabbitCardDetailActivity.a aVar6 = RabbitCardDetailActivity.f51749j;
                ((RabbitCardDetailActivity) obj).b().b0();
                return Unit.INSTANCE;
            case 16:
                int i25 = ActivityDetailsFragment.I;
                qr.t tVarZ6 = ((ActivityDetailsFragment) obj).z6();
                long j8 = tVarZ6.f146575z;
                ps.r value = tVarZ6.W4().getValue();
                Long lValueOf = (value == null || (summaryDTO2 = value.getSummaryDTO()) == null) ? null : Long.valueOf(summaryDTO2.c5());
                ps.r value2 = tVarZ6.W4().getValue();
                Double dC1 = (value2 == null || (summaryDTO = value2.getSummaryDTO()) == null) ? null : summaryDTO.getDuration();
                Double dValueOf = (lValueOf == null || dC1 == null) ? null : Double.valueOf((dC1.doubleValue() * ((double) 1000)) + lValueOf.longValue());
                Long lValueOf2 = dValueOf != null ? Long.valueOf((long) dValueOf.doubleValue()) : null;
                am.m mVar = tVarZ6.f146507c;
                mVar.getClass();
                c2 c2Var = new c2(new am.o(mVar, lValueOf, lValueOf2, j8, null));
                x53.c cVar = o53.s0.f129406a;
                r53.s.C(new r53.u(new r53.w(new m1(new r53.v(new qr.u(tVarZ6, null), r53.s.A(c2Var, x53.b.f189152a)), new qr.v(tVarZ6, null)), new qr.w(null)), new qr.x(tVarZ6, null)), v1.a(tVarZ6));
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.leaderboard.connections.a aVar7 = (com.garmin.android.apps.connectmobile.leaderboard.connections.a) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.a.C0674a c0674a = com.garmin.android.apps.connectmobile.leaderboard.connections.a.D;
                qd0.a aVar8 = new qd0.a(aVar7, 26);
                Context contextRequireContext = aVar7.requireContext();
                contextRequireContext.getClass();
                return new qt0.a(contextRequireContext, aVar8, aVar7.B);
            case 18:
                com.garmin.android.apps.connectmobile.leaderboard.connections.b bVar2 = (com.garmin.android.apps.connectmobile.leaderboard.connections.b) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.b.a aVar9 = com.garmin.android.apps.connectmobile.leaderboard.connections.b.D;
                qd0.a aVar10 = new qd0.a(bVar2, 27);
                Context contextRequireContext2 = bVar2.requireContext();
                contextRequireContext2.getClass();
                return new qt0.a(contextRequireContext2, aVar10, bVar2.B);
            case 19:
                com.garmin.android.apps.connectmobile.leaderboard.connections.c cVar2 = (com.garmin.android.apps.connectmobile.leaderboard.connections.c) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.c.a aVar11 = com.garmin.android.apps.connectmobile.leaderboard.connections.c.D;
                qc.c cVar3 = new qc.c(i15);
                Context contextRequireContext3 = cVar2.requireContext();
                contextRequireContext3.getClass();
                return new qt0.a(contextRequireContext3, cVar3, cVar2.B);
            case 20:
                com.garmin.android.apps.connectmobile.leaderboard.connections.d dVar = (com.garmin.android.apps.connectmobile.leaderboard.connections.d) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.d.a aVar12 = com.garmin.android.apps.connectmobile.leaderboard.connections.d.D;
                qd0.a aVar13 = new qd0.a(dVar, i15);
                Context contextRequireContext4 = dVar.requireContext();
                contextRequireContext4.getClass();
                return new qt0.a(contextRequireContext4, aVar13, dVar.B);
            case 21:
                com.garmin.android.apps.connectmobile.leaderboard.connections.e eVar = (com.garmin.android.apps.connectmobile.leaderboard.connections.e) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.e.a aVar14 = com.garmin.android.apps.connectmobile.leaderboard.connections.e.D;
                qc.c cVar4 = new qc.c(i16);
                Context contextRequireContext5 = eVar.requireContext();
                contextRequireContext5.getClass();
                return new qt0.a(contextRequireContext5, cVar4, eVar.B);
            case 22:
                com.garmin.android.apps.connectmobile.leaderboard.connections.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.connections.f) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.f.a aVar15 = com.garmin.android.apps.connectmobile.leaderboard.connections.f.D;
                qd0.a aVar16 = new qd0.a(fVar, i16);
                Context contextRequireContext6 = fVar.requireContext();
                contextRequireContext6.getClass();
                return new qt0.a(contextRequireContext6, aVar16, fVar.B);
            case 23:
                FBTProgressReportActivity.a aVar17 = FBTProgressReportActivity.f45512b;
                ((FBTProgressReportActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 24:
                int i26 = BloodPressureReportsActivity.f30903b;
                ((BloodPressureReportsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 25:
                r12.f fVar2 = (r12.f) obj;
                return new r12.d(fVar2.f149416c, fVar2.f149414a, fVar2.f149415b, 1, 50);
            case 26:
                r2.n nVar = (r2.n) obj;
                if (nVar.getIsAttached()) {
                    return r2.j.a(nVar);
                }
                o2.d.f128623b.getClass();
                return o2.d.f128624c;
            case 27:
                r31.j jVar = (r31.j) obj;
                int size = jVar.f150032e.size();
                i53.c<k31.c> cVar5 = jVar.f150033f;
                int size2 = cVar5.size() + size + 1;
                int size3 = jVar.f150032e.size() + cVar5.size() + jVar.f150031d.size() + 1;
                return new r31.s(size2, size3, size3 > 0 ? j23.t.d(size2 / size3, 0.0f, 1.0f) : 0.0f);
            case 28:
                ((r40.d) obj).invoke();
                return Unit.INSTANCE;
            default:
                c32.k kVar = ((r40.k) obj).f150285h;
                if (kVar != null) {
                    kVar.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
