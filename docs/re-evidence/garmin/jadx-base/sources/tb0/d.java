package tb0;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.garmin.feature.garminpay.providers.gpay.ui.common.FitPayA2AInstallAppActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import f5.u1;
import h5.h0;
import lc.m0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import p3.p1;
import r53.p2;
import u1.n0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f163618c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f163616a = i14;
        this.f163617b = obj;
        this.f163618c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() throws Exception {
        Object value;
        Object value2;
        a aVar;
        LocalDate localDate;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        int i14 = this.f163616a;
        int i15 = 0;
        Object obj = this.f163618c;
        Object obj2 = this.f163617b;
        switch (i14) {
            case 0:
                q qVar = (q) obj;
                ((e23.a) obj2).invoke();
                p2 p2Var = qVar.f163687h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, null));
                p2 p2Var2 = qVar.f163685f;
                do {
                    value2 = p2Var2.getValue();
                    a aVar2 = (a) value2;
                    if (aVar2 != null) {
                        aVar2.f163587a.f2199g.f2191b = -1;
                    }
                    if (aVar2 != null) {
                        aa0.d dVar = aVar2.f163587a;
                        aVar = new a(dVar, q.y4(dVar));
                    } else {
                        aVar = null;
                    }
                } while (!p2Var2.b(value2, aVar));
                return Unit.INSTANCE;
            case 1:
                ((e23.l) obj2).invoke((uf0.a) obj);
                return Unit.INSTANCE;
            case 2:
                ((e23.l) obj2).invoke(Long.valueOf(((sg1.c) obj).f159207e));
                return Unit.INSTANCE;
            case 3:
                HealthSnapshotActivity healthSnapshotActivity = (HealthSnapshotActivity) obj2;
                m0 m0Var = (m0) obj;
                if (healthSnapshotActivity.f29018c) {
                    healthSnapshotActivity.finish();
                } else {
                    m0Var.n();
                }
                return Unit.INSTANCE;
            case 4:
                ((tn.u) obj2).f165499d.invoke((sn.h) obj);
                return Unit.INSTANCE;
            case 5:
                UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                yr2.a.a((UserWalletActivity) obj2, s0.f105811a.b(FitPayA2AInstallAppActivity.class), t0.b(new o13.p("app.package.name", (String) obj)));
                return Unit.INSTANCE;
            case 6:
                UserWalletActivity userWalletActivity = (UserWalletActivity) obj2;
                CardRefundFailedException cardRefundFailedException = (CardRefundFailedException) obj;
                qy2.d dVar2 = qy2.d.f148594a;
                NewFitPayTransitRefundActivity.a aVar4 = NewFitPayTransitRefundActivity.f51706l;
                String cardName = cardRefundFailedException.getCardName();
                String userId = cardRefundFailedException.getUserId();
                String refundId = cardRefundFailedException.getRefundId();
                aVar4.getClass();
                oc.b.K(userWalletActivity, dVar2, NewFitPayTransitRefundActivity.a.a(userWalletActivity, cardName, userId, refundId));
                return Unit.INSTANCE;
            case 7:
                ActiveTrainingPlansActivity.a aVar5 = ActiveTrainingPlansActivity.f45098w;
                TrainingPlanDashboardActivity.a.c(TrainingPlanDashboardActivity.f45383n, (ActiveTrainingPlansActivity) obj2, ((ww1.a) obj).f187755a, false, null, null, 1002, 56);
                return Unit.INSTANCE;
            case 8:
                ActiveTrainingPlansActivity.a aVar6 = ActiveTrainingPlansActivity.f45098w;
                StrengthTrainingPlanDashboardActivity.a aVar7 = StrengthTrainingPlanDashboardActivity.f45641h;
                long j8 = ((ww1.d) obj).f187755a;
                aVar7.getClass();
                StrengthTrainingPlanDashboardActivity.a.a((ActiveTrainingPlansActivity) obj2, j8, false, null, 1008);
                return Unit.INSTANCE;
            case 9:
                ActiveTrainingPlansActivity activeTrainingPlansActivity = (ActiveTrainingPlansActivity) obj2;
                ActiveTrainingPlansActivity.a aVar8 = ActiveTrainingPlansActivity.f45098w;
                ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).c(activeTrainingPlansActivity, ((ww1.c) obj).f187755a, false, activeTrainingPlansActivity.f45113t);
                return Unit.INSTANCE;
            case 10:
                e23.l lVar = (e23.l) obj;
                DateTime dateTimeQ = ((kw.l) obj2).q();
                if (dateTimeQ != null && (localDate = dateTimeQ.toLocalDate()) != null) {
                    lVar.invoke(g22.k.t(localDate));
                }
                return Unit.INSTANCE;
            case 11:
                ((e23.l) obj2).invoke((pw.a) obj);
                return Unit.INSTANCE;
            case 12:
                my1.h hVar = (my1.h) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.d) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (hVar != null && (eVar = hVar.f121521e) != null) {
                    dVar3.E6(eVar);
                }
                return Unit.INSTANCE;
            case 13:
                my1.f fVar = (my1.f) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar4 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.d) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (fVar != null && (eVar2 = fVar.f121509b) != null) {
                    dVar4.E6(eVar2);
                }
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.e) obj2;
                fg0.k kVar = (fg0.k) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                ht.a.f85464a.getClass();
                ht.a.a(null, "AddGoalsClicked");
                EventGoalActivity.a aVar12 = EventGoalActivity.f45976e;
                androidx.fragment.app.m mVarRequireActivity = eVar3.requireActivity();
                mVarRequireActivity.getClass();
                Context contextRequireContext = eVar3.requireContext();
                contextRequireContext.getClass();
                aVar12.getClass();
                kVar.getClass();
                Intent intent = new Intent(contextRequireContext, (Class<?>) EventGoalActivity.class);
                intent.putExtra("GCM_extra_sharable_event_dto", kVar);
                ((EventDetailsActivity) mVarRequireActivity).startActivityForResult(intent, 123);
                return Unit.INSTANCE;
            case 15:
                AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                addTIEventViewModel.C6(addTIEventViewModel.n5().d());
                ((p1) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                ((e23.l) obj2).invoke((gg0.f) obj);
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.v) obj2;
                p1 p1Var = (p1) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                if (vVar.F6().D2) {
                    fy1.c.f73884a.getClass();
                    fy1.c.b("GarminCoachTriathlonTypeSelected");
                }
                AddTIEventViewModel addTIEventViewModelF6 = vVar.F6();
                m52.i iVar = (m52.i) p1Var.getF182175a();
                if (iVar == null) {
                    iVar = m52.i.CUSTOM;
                }
                addTIEventViewModelF6.O6(iVar);
                AddTIEventViewModel addTIEventViewModelF7 = vVar.F6();
                addTIEventViewModelF7.B2 = false;
                addTIEventViewModelF7.O5().m("TIAddTriathlonEventDistanceFragment");
                return Unit.INSTANCE;
            case 18:
                u1.o oVar = (u1.o) obj2;
                h0 h0Var = (h0) obj;
                oVar.f167645i = oVar.f167640d.a(h0Var.f81825a.b(), h0Var.getLayoutDirection(), h0Var);
                return Unit.INSTANCE;
            case 19:
                n0.a aVar16 = n0.f167625i;
                ((r0) obj2).f105810a = h5.i.a((n0) obj, u1.f69122a);
                return Unit.INSTANCE;
            case 20:
                FollowerRequestsPrivacyActivity.a aVar17 = FollowerRequestsPrivacyActivity.f47109c;
                ((p1) obj).setValue(Boolean.FALSE);
                ((FollowerRequestsPrivacyActivity) obj2).ga(false);
                return Unit.INSTANCE;
            case 21:
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                bp.h hVar2 = ((u40.b) obj2).f168545i;
                if (hVar2 != null) {
                    hVar2.invoke(gVar);
                }
                return Unit.INSTANCE;
            case 22:
                u40.o oVar2 = (u40.o) obj;
                u40.o.a aVar18 = u40.o.f168590m;
                int dimension = (int) ((GCMSingleLineEditTextView) obj2).getContext().getResources().getDimension(R.dimen.spacing_normal);
                GCMSingleLineEditTextView gCMSingleLineEditTextView = oVar2.f168595l;
                if (gCMSingleLineEditTextView == null) {
                    p005kotlin.jvm.internal.s.m("coursePointNameEditText");
                    throw null;
                }
                gCMSingleLineEditTextView.setPadding(0, dimension, 0, dimension);
                GCMSingleLineEditTextView gCMSingleLineEditTextView2 = oVar2.f168595l;
                if (gCMSingleLineEditTextView2 != null) {
                    gCMSingleLineEditTextView2.setHasError(false);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("coursePointNameEditText");
                throw null;
            case 23:
                ((e23.l) obj2).invoke((u70.a) obj);
                return Unit.INSTANCE;
            case 24:
                aa1.d dVar5 = (aa1.d) obj2;
                e23.p pVar = (e23.p) obj;
                Long l14 = dVar5.f2255g;
                if (l14 != null) {
                    pVar.invoke(l14, dVar5.f2257i);
                }
                return Unit.INSTANCE;
            case 25:
                ((e23.l) obj2).invoke((l90.b) obj);
                return Unit.INSTANCE;
            case 26:
                uc0.d dVar6 = (uc0.d) obj2;
                Logger logger = uc0.d.f169948i;
                ComposeView composeView = new ComposeView(dVar6.f169949a, null, 0, 6, null);
                composeView.setContent(new z3.e(-404527535, true, new uc0.b((String) obj, dVar6, composeView, i15)));
                return composeView;
            case 27:
                RaceTimePredictionActivity.a aVar19 = RaceTimePredictionActivity.f41078b;
                ((uc1.f) ((RaceTimePredictionActivity) obj2).f41079a.getValue()).x4((fg0.k) obj);
                return Unit.INSTANCE;
            case 28:
                ((uc1.f) obj2).x4((fg0.k) obj);
                return Unit.INSTANCE;
            default:
                p1 p1Var2 = (p1) obj2;
                ug0.q qVar2 = (ug0.q) obj;
                String str = (String) p1Var2.getF182175a();
                if (str != null) {
                    qVar2.f170633g = ge1.b.T(v1.a(qVar2), qVar2.f170630d.f22991c, null, new ug0.m(qVar2, str, null), 2);
                }
                p1Var2.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
