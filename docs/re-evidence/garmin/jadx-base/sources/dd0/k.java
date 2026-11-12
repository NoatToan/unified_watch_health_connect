package dd0;

import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import gg1.o0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.setup.wizard.g f59173b;

    public /* synthetic */ k(com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar, int i14) {
        this.f59172a = i14;
        this.f59173b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f59172a) {
            case 0:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar = this.f59173b;
                gVar.f34543f = gVar.getString(R.string.user_gender_value_male);
                f12.l.f68084a.getClass();
                f12.l.a.a().R(gVar.getString(R.string.user_gender_value_male));
                gVar.w6();
                break;
            case 1:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar2 = this.f59173b;
                new z22.a(gVar2.getActivity(), true, new com.google.android.exoplayer2.trackselection.b(gVar2, true, 3));
                break;
            case 2:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar3 = this.f59173b;
                new z22.a(gVar3.getActivity(), false, new com.google.android.exoplayer2.trackselection.b(gVar3, false, 3));
                break;
            case 3:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar4 = this.f59173b;
                if (gVar4.z6()) {
                    UserSettingsDTO userSettingsDTO = gVar4.T;
                    if (userSettingsDTO != null) {
                        f12.l.f68084a.getClass();
                        userSettingsDTO.f43523a = f12.l.a.a().U1();
                        String strW = f12.l.a.a().w();
                        if (!TextUtils.isEmpty(strW)) {
                            UserSettingsDTO userSettingsDTO2 = gVar4.T;
                            UserSettingsDTO.c.f43531c.getClass();
                            userSettingsDTO2.P0(UserSettingsDTO.c.a.a(strW));
                        }
                        String strK = f12.l.a.a().K();
                        if (!TextUtils.isEmpty(strK)) {
                            UserSettingsDTO userSettingsDTO3 = gVar4.T;
                            UserSettingsDTO.d.f43539c.getClass();
                            userSettingsDTO3.R0(UserSettingsDTO.d.a.a(strK));
                        }
                        if (f12.l.a.a().v3() > 0.0d) {
                            gVar4.T.s1(f12.l.a.a().v3() * 1000.0d);
                        }
                        if (f12.l.a.a().t() != -1.0f) {
                            gVar4.T.S0(f12.l.a.a().t());
                        }
                        UserSettingsDTO userSettingsDTO4 = gVar4.T;
                        String str = GCMSettingManager.m().f77367a;
                        UserSettingsDTO.e.f43546b.getClass();
                        userSettingsDTO4.c1(UserSettingsDTO.e.a.a(str));
                        if (!gVar4.Z.booleanValue() && f12.l.a.a().l1() != null) {
                            gVar4.T.L0(f12.l.a.a().l1());
                        }
                        UserSettingsDTO userSettingsDTO5 = gVar4.T;
                        String str2 = f12.l.a.a().g().f77291a;
                        o0.f77285d.getClass();
                        userSettingsDTO5.V0(o0.a.b(str2));
                        if (f12.l.a.a().e2() != -1) {
                            gVar4.T.J0(f12.l.a.a().e2());
                        }
                        if (f12.l.a.a().h() != -1) {
                            gVar4.T.Z0(f12.l.a.a().h());
                        }
                        if (f12.l.a.a().d() != -1) {
                            gVar4.T.j1(f12.l.a.a().d());
                        }
                    }
                    UserSettingsDTO userSettingsDTO6 = gVar4.T;
                    if (userSettingsDTO6 == null) {
                        gVar4.f34554p.setEnabled(true);
                        Toast.makeText(gVar4.getActivity(), R.string.txt_error_occurred, 0).show();
                    } else {
                        JSONObject jSONObjectB = t3.b(userSettingsDTO6.t1(), gVar4.X);
                        i2.a(a2.DEVICES, "PersonalInfoEditingWizardFragment", "User Settings JSON delta = " + jSONObjectB);
                        if (jSONObjectB == null) {
                            com.garmin.android.apps.connectmobile.devices.setup.wizard.g.c cVar = gVar4.f34549k0;
                            if (cVar != null) {
                                cVar.M8();
                            }
                        } else {
                            if (gVar4.isAdded()) {
                                ((com.garmin.android.apps.connectmobile.c) gVar4.getActivity()).showProgressOverlay();
                            }
                            gVar4.Y = cw.q.N().O(userSettingsDTO6, jSONObjectB, gVar4.H0);
                        }
                    }
                }
                break;
            case 4:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar5 = this.f59173b;
                gVar5.f34545h = gVar5.getString(R.string.user_handedness_capable_value_left);
                f12.l.f68084a.getClass();
                f12.l.a.a().T0(gVar5.f34545h);
                gVar5.y6();
                break;
            case 5:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar6 = this.f59173b;
                gVar6.f34545h = gVar6.getString(R.string.user_handedness_capable_value_right);
                f12.l.f68084a.getClass();
                f12.l.a.a().T0(gVar6.f34545h);
                gVar6.y6();
                break;
            case 6:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar7 = this.f59173b;
                gVar7.f34543f = gVar7.getString(R.string.user_gender_value_female);
                f12.l.f68084a.getClass();
                f12.l.a.a().R(gVar7.getString(R.string.user_gender_value_female));
                gVar7.w6();
                break;
            case 7:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar8 = this.f59173b;
                new com.garmin.android.apps.connectmobile.settings.d(gVar8.getActivity(), new l(gVar8));
                break;
            case 8:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar9 = this.f59173b;
                new j42.b(gVar9.getActivity(), new l(gVar9));
                break;
            case 9:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar10 = this.f59173b;
                new gg1.b(gVar10.getActivity(), new l(gVar10));
                break;
            case 10:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar11 = this.f59173b;
                gVar11.f34544g = 2;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(gVar11.f34544g);
                gVar11.v6();
                break;
            case 11:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar12 = this.f59173b;
                gVar12.f34544g = 5;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(gVar12.f34544g);
                gVar12.v6();
                break;
            default:
                com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar13 = this.f59173b;
                gVar13.f34544g = 8;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(gVar13.f34544g);
                gVar13.v6();
                break;
        }
    }
}
