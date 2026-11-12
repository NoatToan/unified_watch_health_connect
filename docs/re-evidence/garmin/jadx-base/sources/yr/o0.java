package yr;

import am.r1;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorsFirmwareUpdateActivity;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DeviceUploadConsentActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.settings.tutorials.DeviceTutorialsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.activity.LactateThresholdSummaryActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.CaloriesLinkAccountsActivity;
import com.garmin.android.apps.connectmobile.performancescores.endurancescore.presentation.EnduranceScoreActivity;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import java.util.ArrayList;
import mt0.k4;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import r53.b2;
import z10.i3;
import z10.k3;
import z10.p3;
import z10.v2;
import zb0.l1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198891b;

    public /* synthetic */ o0(zo0.b0 b0Var, zo0.n nVar) {
        this.f198890a = 24;
        this.f198891b = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f198890a;
        Object obj = this.f198891b;
        switch (i14) {
            case 0:
                ((nr.g.q.b) obj).f127119b.invoke();
                return Unit.INSTANCE;
            case 1:
                e23.a<Unit> aVar = ((nr.g.s) obj).f127130g;
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                LactateThresholdSummaryActivity.a aVar2 = LactateThresholdSummaryActivity.f37141p;
                return ParametersHolderKt.parametersOf((xs0.a) obj);
            case 3:
                SensorsFirmwareUpdateActivity.a aVar3 = SensorsFirmwareUpdateActivity.f30877a;
                ((SensorsFirmwareUpdateActivity) obj).finish();
                return Unit.INSTANCE;
            case 4:
                SettingsDeviceActivity.a aVar4 = SettingsDeviceActivity.f52599w;
                ((xr.a) obj).invoke();
                return Unit.INSTANCE;
            case 5:
                com.garmin.realtimesettings.app.presentationlayer.c cVar = (com.garmin.realtimesettings.app.presentationlayer.c) obj;
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar5 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                zu2.a.f207132a.getClass();
                if (zu2.a.f207133b != null) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "CIQPromoFromDeviceSettingsClicked");
                }
                ew2.g.a aVar6 = ew2.g.f66907a;
                androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
                mVarRequireActivity.getClass();
                aVar6.getClass();
                ew2.g.a.a(mVarRequireActivity, null);
                return Unit.INSTANCE;
            case 6:
                DataStorageConsentActivity.a aVar7 = DataStorageConsentActivity.f32194t;
                ((DataStorageConsentActivity) obj).onNavigateUp();
                return Unit.INSTANCE;
            case 7:
                DeviceUploadConsentActivity.a aVar8 = DeviceUploadConsentActivity.f32201b;
                ((z10.j) ((DeviceUploadConsentActivity) obj).f32202a.getValue()).y4(q92.x.DI_CONNECT_UPLOAD);
                return Unit.INSTANCE;
            case 8:
                v2.b bVar = ((v2) obj).f201277b;
                if (bVar != null) {
                    bVar.i7();
                }
                return Unit.INSTANCE;
            case 9:
                int i15 = p3.f201204b;
                i3 i3VarFa = ((p3) obj).fa();
                ge1.b.T(v1.a(i3VarFa), null, null, new k3(i3VarFa, null), 3);
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b bVar2 = (com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b) obj;
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.a aVar9 = com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.f39610f;
                CaloriesLinkAccountsActivity.a aVar10 = CaloriesLinkAccountsActivity.f39595i;
                Context contextRequireContext = bVar2.requireContext();
                contextRequireContext.getClass();
                d20.f fVar = bVar2.f39615e;
                aVar10.getClass();
                Intent intent = new Intent(contextRequireContext, (Class<?>) CaloriesLinkAccountsActivity.class);
                intent.putExtra("CONSENT_THIRD_PARTY_DTO", fVar);
                intent.putExtra("myFitnessPal", true);
                bVar2.startActivityForResult(intent, 123);
                return Unit.INSTANCE;
            case 11:
                return p3.p0.n(((t41.f) obj).name());
            case 12:
                return p3.p0.n(((n02.g) obj).name());
            case 13:
                EnduranceScoreActivity.a aVar11 = EnduranceScoreActivity.f40255b;
                ((EnduranceScoreActivity) obj).onBackPressed();
                return Unit.INSTANCE;
            case 14:
                za0.i iVar = (za0.i) obj;
                ge1.b.T(v1.a(iVar), null, null, new za0.k(iVar, null), 3);
                return Unit.INSTANCE;
            case 15:
                int i16 = DeviceDetailsActivity.f33804q;
                ((DeviceDetailsActivity) obj).finish();
                return null;
            case 16:
                DeviceTutorialsActivity deviceTutorialsActivity = (DeviceTutorialsActivity) obj;
                DeviceTutorialsActivity.a aVar12 = DeviceTutorialsActivity.f34381b;
                String stringExtra = deviceTutorialsActivity.getIntent().getStringExtra("product_number");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = deviceTutorialsActivity.getIntent().getStringExtra("product_display_name");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String stringExtra3 = deviceTutorialsActivity.getIntent().getStringExtra("application_key");
                String str = stringExtra3 != null ? stringExtra3 : "";
                Parcelable parcelableExtra = deviceTutorialsActivity.getIntent().getParcelableExtra("image_data");
                if (parcelableExtra == null) {
                    parcelableExtra = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
                }
                return ParametersHolderKt.parametersOf(stringExtra, stringExtra2, str, parcelableExtra);
            case 17:
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.c((zd0.j.a) obj);
                return Unit.INSTANCE;
            case 18:
                zj1.e.a aVar13 = (zj1.e.a) obj;
                l20.a aVar14 = aVar13.f204917b;
                if (aVar14 != null) {
                    aVar13.f204916a.invoke(aVar14);
                }
                return Unit.INSTANCE;
            case 19:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.a aVar15 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.f43911a;
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d) obj).requireActivity().finish();
                return Unit.INSTANCE;
            case 20:
                mk2.e eVarJ = ((ok2.b) obj).getConfiguration().j();
                if (eVarJ instanceof qk2.a) {
                    return (qk2.a) eVarJ;
                }
                return null;
            case 21:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g.a aVar16 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g.f29350h;
                ArrayList arrayListC = r1.c(null, r1.a(((com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g) obj).requireContext()));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListC) {
                    if (bm.m.d(((am.x0) obj2).f4358a).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                return new ArrayList(arrayList);
            case 22:
                ap.d dVar = ((com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k) obj).f29372a;
                if (dVar != null) {
                    dVar.f11598j.m(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            case 23:
                return ((zo0.u) obj).f206197a.getContext().getSharedPreferences("prefs_event_search_settings", 0);
            case 24:
                zo0.n nVar = (zo0.n) obj;
                int i17 = zo0.b0.f206098b;
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICES, "SystemBondingLostDialogHandler", "onDialog Not Now " + nVar);
                l1 l1Var = l1.f203565a;
                String strValueOf = String.valueOf(((zo0.n.p) nVar).f206193a.getUnitID());
                l1Var.getClass();
                l1.a(strValueOf);
                return Unit.INSTANCE;
            case 25:
                e23.a<Unit> aVar17 = ((nr.u.b) obj).f127371i;
                if (aVar17 != null) {
                    aVar17.invoke();
                }
                return Unit.INSTANCE;
            default:
                zt0.c cVar2 = (zt0.c) obj;
                yt0.t0 t0Var = cVar2.f206953a;
                a22.i iVar2 = cVar2.f206954b;
                vt0.a aVar18 = (vt0.a) cVar2.f206955c.getValue();
                vt0.b bVar3 = (vt0.b) cVar2.f206957e.getValue();
                b2 b2Var = cVar2.f206960h;
                return new rt0.c(t0Var, iVar2, aVar18, bVar3, gg.b.D((k4) b2Var.f150540a.getValue()), gg.b.u((k4) b2Var.f150540a.getValue()), 1, 1001);
        }
    }

    public /* synthetic */ o0(Object obj, int i14) {
        this.f198890a = i14;
        this.f198891b = obj;
    }
}
