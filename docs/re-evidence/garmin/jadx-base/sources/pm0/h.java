package pm0;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;
import com.garmin.android.apps.connectmobile.bikesensors.VectorDeviceSettingsEditActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.settings.HydrationGoalSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import com.google.android.gms.common.GooglePlayServicesUtil;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import po.b0;
import ps.t1;
import qh1.o;
import qs.x;
import r22.m;
import r22.q0;
import r70.v;
import ro1.l0;
import ro1.u;
import vr2.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f138622c;

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f138620a = i14;
        this.f138621b = obj;
        this.f138622c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        s92.e eVar;
        ro1.b bVar;
        int i14 = this.f138620a;
        Object obj = this.f138622c;
        Object obj2 = this.f138621b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.group.details.challenges.b bVar2 = (com.garmin.android.apps.connectmobile.group.details.challenges.b) obj;
                int i15 = com.garmin.android.apps.connectmobile.group.details.challenges.d.e.f36334c;
                com.garmin.android.apps.connectmobile.group.details.challenges.d.c cVar = ((com.garmin.android.apps.connectmobile.group.details.challenges.d) obj2).f36323c;
                if (cVar != null) {
                    cVar.g2(bVar2);
                    return;
                }
                return;
            case 1:
                b0 b0Var = (b0) obj2;
                view2.getClass();
                ((AppCompatCheckedTextView) view2).setChecked(true);
                b0Var.f138822b.invoke((t1) obj);
                b0Var.notifyDataSetChanged();
                return;
            case 2:
                na1.a aVar = (na1.a) obj2;
                qa1.b bVar3 = (qa1.b) obj;
                if (aVar.getActivityId() != null) {
                    bVar3.f143869c.invoke(aVar.getActivityId());
                    return;
                }
                return;
            case 3:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.b bVar4 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.b) obj2;
                View view3 = (View) obj;
                Double d14 = bVar4.f40957e;
                if (d14 != null) {
                    double dDoubleValue = d14.doubleValue();
                    HydrationGoalSettingsActivity.a aVar2 = HydrationGoalSettingsActivity.f36691k;
                    Context context = view3.getContext();
                    context.getClass();
                    q22.b bVar5 = bVar4.f40955c;
                    if (bVar5 == null) {
                        s.m("mMeasurementUnit");
                        throw null;
                    }
                    aVar2.getClass();
                    bVar4.startActivityForResult(HydrationGoalSettingsActivity.a.a(context, dDoubleValue, null, bVar5, true), 101);
                    return;
                }
                return;
            case 4:
                ((o) obj2).f144753c.invoke((Double) obj);
                return;
            case 5:
                LocalDate localDate = (LocalDate) obj;
                l<LocalDate, Unit> lVar = ((o) obj2).f144752b;
                localDate.getClass();
                lVar.invoke(localDate);
                return;
            case 6:
                qt0.a aVar3 = (qt0.a) obj2;
                kt0.a aVar4 = aVar3.f147457c;
                Context context2 = aVar3.getContext();
                context2.getClass();
                com.garmin.android.apps.connectmobile.connections.model.c cVar2 = ((MetricsMapDTO) obj).f38035c;
                aVar4.a(context2, cVar2.f31696b, cVar2.f31697c, cVar2.f31699e);
                return;
            case 7:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj2;
                qw0.a aVar5 = (qw0.a) obj;
                int i16 = qw0.a.f148289g;
                if (dVar != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
                    i2.a.c(i2.f36769a, "GCMAbstractMapFragment", "Baidu map is unavailable");
                    return;
                }
                Dialog errorDialog = GooglePlayServicesUtil.getErrorDialog(-1, aVar5.requireActivity(), -1);
                if (errorDialog != null) {
                    errorDialog.show();
                    return;
                }
                return;
            case 8:
                m.a aVar6 = (m.a) obj2;
                m mVar = (m) obj;
                int i17 = m.a.f149753f;
                int bindingAdapterPosition = aVar6.getBindingAdapterPosition() - mVar.f34942a.size();
                if (bindingAdapterPosition >= 0) {
                    r22.t1 t1Var = (r22.t1) mVar.f149751d.get(bindingAdapterPosition);
                    l<? super r22.t1, Boolean> lVar2 = mVar.f149752e;
                    if (lVar2 == null || lVar2.invoke(t1Var).booleanValue()) {
                        mVar.g(aVar6.getBindingAdapterPosition());
                        return;
                    }
                    return;
                }
                return;
            case 9:
                q0.b bVar6 = q0.f149800b;
                ((View.OnClickListener) obj2).onClick(view2);
                ((q0) obj).dispatchDismiss(1);
                return;
            case 10:
                DashboardActivity dashboardActivity = (DashboardActivity) obj;
                int i18 = DashboardActivity.f33444q;
                List<s92.e> listD = ((s92.g) obj2).d();
                if (listD == null || (eVar = (s92.e) h0.d0(listD)) == null) {
                    return;
                }
                GCMWebViewActivity.fa(dashboardActivity, eVar.getText(), eVar.getUrl());
                return;
            case 11:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                v.a aVar7 = v.f151104f;
                ((v) obj2).dismiss();
                if (onClickListener != null) {
                    onClickListener.onClick(view2);
                    return;
                }
                return;
            case 12:
                ro1.c cVar3 = (ro1.c) obj2;
                ro1.c.a aVar8 = (ro1.c.a) obj;
                int i19 = ro1.c.a.f153917c;
                u uVar = cVar3.f153916a;
                ro1.b bVarD = uVar.f154017f.d();
                if (bVarD != null) {
                    int iOrdinal = bVarD.ordinal();
                    if (iOrdinal != aVar8.getBindingAdapterPosition()) {
                        y0<ro1.b> y0Var = uVar.f154017f;
                        ro1.b.a aVar9 = ro1.b.f153905d;
                        int bindingAdapterPosition2 = aVar8.getBindingAdapterPosition();
                        aVar9.getClass();
                        if (bindingAdapterPosition2 > 0) {
                            w13.c cVar4 = ro1.b.f153909h;
                            if (bindingAdapterPosition2 < cVar4.getF134973e()) {
                                bVar = (ro1.b) cVar4.get(bindingAdapterPosition2);
                            } else {
                                bVar = ro1.b.Default;
                            }
                        } else {
                            bVar = ro1.b.Default;
                        }
                        y0Var.m(bVar);
                        int bindingAdapterPosition3 = aVar8.getBindingAdapterPosition();
                        Unit unit = Unit.INSTANCE;
                        cVar3.notifyItemChanged(bindingAdapterPosition3, unit);
                        cVar3.notifyItemChanged(iOrdinal, unit);
                    }
                    if (iOrdinal != 0) {
                        uVar.x4();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ro1.h0 h0Var = (ro1.h0) obj2;
                int i24 = ro1.h0.b.f153961c;
                u uVar2 = h0Var.f153960b;
                l0 l0Var = h0Var.r().get(((ro1.h0.b) obj).getBindingAdapterPosition());
                uVar2.getClass();
                l0Var.getClass();
                uVar2.f154020i.m(l0Var);
                return;
            case 14:
                ((p) obj2).invoke((com.garmin.android.library.mapsdkadapter.i.d) obj, -1);
                return;
            case 15:
                rw.g gVar = (rw.g) obj2;
                EditText editText = gVar.f154809w;
                pw.a aVar10 = (pw.a) obj;
                String notes = aVar10 != null ? aVar10.getNotes() : null;
                v22.e.j(gVar.f154805s);
                v22.e.q(gVar.f154806t);
                editText.setText(notes);
                editText.requestFocus();
                return;
            case 16:
                ((com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a) obj2).f48398c.U4((com.garmin.android.apps.connectmobile.workouts.data.model.b) obj);
                return;
            case 17:
                so2.a.b bVar7 = (so2.a.b) obj;
                so2.a.c cVar5 = ((so2.a) obj2).f160456a;
                if (cVar5 != null) {
                    fo2.i iVar = bVar7.f160467c;
                    cVar5.b(iVar, iVar.getTotalCost().b(bVar7.f160459f.getTotalCost()));
                    return;
                }
                return;
            case 18:
                so2.a.d dVar2 = (so2.a.d) obj;
                so2.a.c cVar6 = ((so2.a) obj2).f160456a;
                if (cVar6 != null) {
                    fo2.i iVar2 = dVar2.f160467c;
                    cVar6.b(iVar2, dVar2.f160462e.b(iVar2.getTotalCredit()));
                    return;
                }
                return;
            case 19:
                po2.s sVar = (po2.s) obj;
                SnowballAddCardActivity.i iVar3 = ((so2.f) obj2).f160489a;
                if (iVar3 != null) {
                    SnowballAddCardActivity.this.b().V(sVar);
                    return;
                }
                return;
            case 20:
                com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a aVar11 = (com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a) obj2;
                th2.c cVar7 = (th2.c) obj;
                int i25 = com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a.f50618g;
                Boolean bool = aVar11.f50621c.get(cVar7.getAdapterPosition()).f159309c;
                if (bool != null ? bool.booleanValue() : false) {
                    return;
                }
                uh2.a aVar12 = aVar11.f50619a;
                int adapterPosition = cVar7.getAdapterPosition();
                y0<ArrayList<sh2.a>> y0Var2 = aVar12.f171140b;
                ArrayList<sh2.a> arrayListD = y0Var2.d();
                if (arrayListD != null) {
                    arrayListD.get(adapterPosition).f159308b = 9631;
                    int i26 = aVar12.f171143e;
                    for (int i27 = adapterPosition + 1; i27 < i26; i27++) {
                        arrayListD.get(i27).f159308b = Integer.valueOf(i27 - 1);
                    }
                    y0Var2.m(aVar12.y4(arrayListD));
                    aVar12.f171141c.m(aVar12.x4());
                    return;
                }
                return;
            case 21:
                int i28 = com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a.f50618g;
                uh2.a aVar13 = ((com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a) obj2).f50619a;
                int adapterPosition2 = ((th2.d) obj).getAdapterPosition();
                y0<ArrayList<sh2.a>> y0Var3 = aVar13.f171140b;
                ArrayList<sh2.a> arrayListD2 = y0Var3.d();
                if (arrayListD2 != null) {
                    arrayListD2.get(adapterPosition2).f159308b = Integer.valueOf(aVar13.f171143e);
                    y0Var3.m(aVar13.y4(arrayListD2));
                    aVar13.f171141c.m(aVar13.x4());
                    return;
                }
                return;
            case 22:
                int i29 = to0.a.d.f165835d;
                ((to0.a) obj2).f165831e.z3(((to0.a.AbstractC3116a.C3117a) obj).f165833a);
                return;
            case 23:
                tq.d dVar3 = (tq.d) obj2;
                tq.d.a aVar14 = (tq.d.a) obj;
                int i30 = tq.d.a.f166018b;
                x xVar = dVar3.f166015b.get(aVar14.getBindingAdapterPosition());
                if (dVar3.f166017d != aVar14.getBindingAdapterPosition()) {
                    int bindingAdapterPosition4 = aVar14.getBindingAdapterPosition();
                    dVar3.notifyDataSetChanged();
                    dVar3.f166017d = bindingAdapterPosition4;
                    l<x, Unit> lVar3 = dVar3.f166016c;
                    if (lVar3 != null) {
                        lVar3.invoke(xVar);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                fj2.a aVar15 = (fj2.a) obj;
                ((com.garmin.feature.garminpay.ui.userwallet.c) obj2).f52259c.c(new com.garmin.feature.garminpay.ui.userwallet.c.d.b(aVar15 != null ? aVar15.getAddressId() : null));
                return;
            case 25:
                ((com.garmin.feature.garminpay.ui.userwallet.d) obj2).f52285b.c(new com.garmin.feature.garminpay.ui.userwallet.d.c.b((q) obj, false));
                return;
            case 26:
                ActiveTrainingPlansActivity.a aVar16 = ActiveTrainingPlansActivity.f45098w;
                TrainingPlanDashboardActivity.a.c(TrainingPlanDashboardActivity.f45383n, (ActiveTrainingPlansActivity) obj2, ((ww1.a) obj).f187755a, false, null, null, 1002, 56);
                return;
            case 27:
                CalibrationSettingsActivity calibrationSettingsActivity = (CalibrationSettingsActivity) obj2;
                CalibrationSettingsActivity.a aVar17 = CalibrationSettingsActivity.f30766m;
                Timer timer = new Timer();
                calibrationSettingsActivity.f30777j = timer;
                timer.schedule(new tv.c(calibrationSettingsActivity), 25000L);
                calibrationSettingsActivity.showProgressOverlay(calibrationSettingsActivity.getString(R.string.lbl_calibrating_pedals, (String) obj));
                calibrationSettingsActivity.setTitle(R.string.lbl_calibrate);
                Button button = calibrationSettingsActivity.f30768a;
                if (button == null) {
                    s.m("calibrateButton");
                    throw null;
                }
                button.setText(calibrationSettingsActivity.getString(R.string.lbl_calibrate));
                TextView textView = calibrationSettingsActivity.f30769b;
                if (textView == null) {
                    s.m("calibrationStatusTextView");
                    throw null;
                }
                textView.setVisibility(4);
                Button button2 = calibrationSettingsActivity.f30768a;
                if (button2 == null) {
                    s.m("calibrateButton");
                    throw null;
                }
                button2.setVisibility(4);
                calibrationSettingsActivity.fa();
                return;
            case 28:
                VectorDeviceSettingsEditActivity vectorDeviceSettingsEditActivity = (VectorDeviceSettingsEditActivity) obj2;
                String str = (String) obj;
                tv.j jVar = vectorDeviceSettingsEditActivity.f30809a;
                if (jVar != null) {
                    GCMWebViewActivity.fa(vectorDeviceSettingsEditActivity, str, jVar.f166517g);
                    return;
                } else {
                    s.m("settingProprieties");
                    throw null;
                }
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar18 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.c) obj2).y6((String) obj);
                return;
        }
    }
}
