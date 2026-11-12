package zb0;

import android.text.TextUtils;
import android.view.View;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f203609b;

    public /* synthetic */ o1(r1 r1Var, int i14) {
        this.f203608a = i14;
        this.f203609b = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f203608a) {
            case 0:
                r1 r1Var = this.f203609b;
                if (r1Var.z6()) {
                    UserSettingsDTO userSettingsDTO = r1Var.I;
                    if (userSettingsDTO != null) {
                        f12.l.f68084a.getClass();
                        userSettingsDTO.f43523a = f12.l.a.a().U1();
                        String strW = f12.l.a.a().w();
                        if (!TextUtils.isEmpty(strW)) {
                            UserSettingsDTO userSettingsDTO2 = r1Var.I;
                            UserSettingsDTO.c.f43531c.getClass();
                            userSettingsDTO2.P0(UserSettingsDTO.c.a.a(strW));
                        }
                        String strK = f12.l.a.a().K();
                        if (!TextUtils.isEmpty(strK)) {
                            UserSettingsDTO userSettingsDTO3 = r1Var.I;
                            UserSettingsDTO.d.f43539c.getClass();
                            userSettingsDTO3.R0(UserSettingsDTO.d.a.a(strK));
                        }
                        if (f12.l.a.a().v3() > 0.0d) {
                            r1Var.I.s1(f12.l.a.a().v3() * 1000.0d);
                        }
                        if (f12.l.a.a().t() != -1.0f) {
                            r1Var.I.S0(f12.l.a.a().t());
                        }
                        UserSettingsDTO userSettingsDTO4 = r1Var.I;
                        String str = GCMSettingManager.m().f77367a;
                        UserSettingsDTO.e.f43546b.getClass();
                        userSettingsDTO4.c1(UserSettingsDTO.e.a.a(str));
                        if (!r1Var.X.booleanValue() && f12.l.a.a().l1() != null) {
                            r1Var.I.L0(f12.l.a.a().l1());
                        }
                        UserSettingsDTO userSettingsDTO5 = r1Var.I;
                        String str2 = f12.l.a.a().g().f77291a;
                        gg1.o0.f77285d.getClass();
                        userSettingsDTO5.V0(gg1.o0.a.b(str2));
                        if (f12.l.a.a().e2() != -1) {
                            r1Var.I.J0(f12.l.a.a().e2());
                        }
                        if (f12.l.a.a().h() != -1) {
                            r1Var.I.Z0(f12.l.a.a().h());
                        }
                        if (f12.l.a.a().d() != -1) {
                            r1Var.I.j1(f12.l.a.a().d());
                        }
                    }
                    UserSettingsDTO userSettingsDTO6 = r1Var.I;
                    if (userSettingsDTO6 != null) {
                        JSONObject jSONObjectB = t3.b(userSettingsDTO6.t1(), r1Var.P);
                        i2.a(a2.DEVICES, "TellUsMoreFragment", "User Settings JSON delta = " + jSONObjectB);
                        if (jSONObjectB == null) {
                            r1.c cVar = r1Var.Y;
                            if (cVar != null) {
                                cVar.U0(r1Var.T);
                            }
                        } else {
                            r1Var.A6();
                            r1Var.F = cw.q.N().O(userSettingsDTO6, jSONObjectB, r1Var.I0);
                        }
                    }
                }
                break;
            case 1:
                r1 r1Var2 = this.f203609b;
                r1Var2.getClass();
                new j42.b(r1Var2.getActivity(), new q1(r1Var2));
                break;
            case 2:
                r1 r1Var3 = this.f203609b;
                new gg1.b(r1Var3.getActivity(), new q1(r1Var3));
                break;
            case 3:
                r1 r1Var4 = this.f203609b;
                r1Var4.f203628e = 2;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(r1Var4.f203628e);
                r1Var4.v6();
                break;
            case 4:
                r1 r1Var5 = this.f203609b;
                r1Var5.f203628e = 5;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(r1Var5.f203628e);
                r1Var5.v6();
                break;
            case 5:
                r1 r1Var6 = this.f203609b;
                r1Var6.f203628e = 8;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(r1Var6.f203628e);
                r1Var6.v6();
                break;
            case 6:
                r1 r1Var7 = this.f203609b;
                r1Var7.f203627d = r1Var7.getString(R.string.user_gender_value_male);
                f12.l.f68084a.getClass();
                f12.l.a.a().R(r1Var7.getString(R.string.user_gender_value_male));
                r1Var7.w6();
                break;
            case 7:
                r1 r1Var8 = this.f203609b;
                r1Var8.getClass();
                new z22.a(r1Var8.getActivity(), true, new com.google.android.exoplayer2.trackselection.b(r1Var8, true, 4));
                break;
            case 8:
                r1 r1Var9 = this.f203609b;
                r1Var9.getClass();
                new z22.a(r1Var9.getActivity(), false, new com.google.android.exoplayer2.trackselection.b(r1Var9, false, 4));
                break;
            case 9:
                r1 r1Var10 = this.f203609b;
                r1Var10.f203629f = r1Var10.getString(R.string.user_handedness_capable_value_left);
                f12.l.f68084a.getClass();
                f12.l.a.a().T0(r1Var10.f203629f);
                r1Var10.y6();
                break;
            case 10:
                r1 r1Var11 = this.f203609b;
                r1Var11.f203629f = r1Var11.getString(R.string.user_handedness_capable_value_right);
                f12.l.f68084a.getClass();
                f12.l.a.a().T0(r1Var11.f203629f);
                r1Var11.y6();
                break;
            case 11:
                r1 r1Var12 = this.f203609b;
                r1Var12.f203627d = r1Var12.getString(R.string.user_gender_value_female);
                f12.l.f68084a.getClass();
                f12.l.a.a().R(r1Var12.getString(R.string.user_gender_value_female));
                r1Var12.w6();
                break;
            default:
                r1 r1Var13 = this.f203609b;
                new com.garmin.android.apps.connectmobile.settings.d(r1Var13.getActivity(), new q1(r1Var13));
                break;
        }
    }
}
