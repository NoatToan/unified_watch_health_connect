package zb0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsVivomoveSetup;
import com.garmin.android.apps.connectmobile.settings.devices.index.IndexDevicesGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.proto.generated.GDISmartProto;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface d0 {
    boolean A(String str);

    void B(Activity activity, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, com.garmin.android.apps.connectmobile.devices.model.f fVar, long j8, String str, u0 u0Var);

    boolean C(u0 u0Var);

    boolean D(ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting, boolean z14);

    void E(Context context, long j8);

    boolean F(long j8, lu.a aVar);

    void G(Activity activity, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, com.garmin.android.apps.connectmobile.devices.model.f fVar, long j8, String str, u0 u0Var);

    void H(ng1.k0 k0Var, long j8, String str, String str2, int i14);

    Intent I(Context context, sd2.f fVar);

    vg1.z J(u0 u0Var);

    Intent K(Context context);

    void L(long j8, boolean z14, lu.a aVar);

    void M(com.garmin.android.apps.connectmobile.settings.devices.a aVar, String str);

    void N(long j8);

    void O(ng1.k0 k0Var, long j8);

    void P(Context context, long j8);

    String Q(Context context, double d14, double d15);

    void R(long j8);

    ur0.a S(Double d14);

    void T(long j8, Boolean bool);

    void U(long j8);

    Intent V(ng1.j jVar, long j8, String str);

    void W(long j8, Boolean bool);

    void X(com.garmin.android.apps.connectmobile.settings.devices.a aVar, DeviceSettingsDTO deviceSettingsDTO, String str, String str2);

    boolean Y(vg1.z zVar);

    long Z(DeviceSettingsVivomoveSetup deviceSettingsVivomoveSetup);

    long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b);

    String a0(String str, String[] strArr);

    void b(long j8, a aVar);

    void c(GDISmartProto.Smart smart, long j8);

    lu.d d(long j8);

    lu.c e(long j8);

    String f(long j8, lu.a aVar);

    void g(long j8);

    lu.b h(long j8, lu.a aVar);

    long i(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> interfaceC0995b);

    long j(String str, ng1.r rVar);

    void k(IndexDevicesGeneralSettingActivity indexDevicesGeneralSettingActivity, long j8);

    boolean l(vg1.z zVar);

    void m(Activity activity, String str, int i14);

    boolean n(long j8);

    void o(ng1.k0 k0Var, long j8, String str, String str2, String str3);

    void p(androidx.fragment.app.m mVar);

    xg1.u q(boolean z14, String str, double d14);

    Uri r(long j8);

    void s(long j8);

    boolean t();

    void u(com.garmin.android.apps.connectmobile.settings.devices.a aVar, UserSettingsDTO userSettingsDTO, int i14);

    String v(List<String> list);

    boolean w();

    boolean x(long j8);

    String y(String str);

    long z(boolean z14, ng1.d1 d1Var);
}
