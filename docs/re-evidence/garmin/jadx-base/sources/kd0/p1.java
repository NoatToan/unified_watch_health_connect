package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQStorageManagementActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.help.heartrate.HeartRateHelpActivity;
import com.garmin.android.apps.connectmobile.settings.CustomStrideLengthSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsVivomoveSetup;
import com.garmin.android.apps.connectmobile.settings.devices.EdgeDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.IntensityMinutesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr45.FR45ActivityAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.IndexDevicesGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigVivosmart3Activity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigVivosportActivity;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionActivity;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/p1;", "Lzb0/d0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1 implements zb0.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104277a = bo1.a.a().c().o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104278b = bo1.a.a().c().k0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Address;", "<anonymous>", "(Lo53/b0;)Landroid/location/Address;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSettingsDelegateImpl$getLocationNameFromCoordinates$address$1", f = "DeviceSettingsDelegateImpl.kt", l = {396}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Address>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f104280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.library.mapsdkadapter.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104280b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104280b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Address> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104279a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            c22.z1 z1Var = c22.z1.f23762a;
            this.f104279a = 1;
            Object objE = z1Var.e(this.f104280b, this);
            return objE == aVar ? aVar : objE;
        }
    }

    @Override // zb0.d0
    public final boolean A(String str) {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        new ng1.b0();
        String strA = ng1.b0.a(str);
        return strA == null || !strA.equals(EdgeDeviceSettings.class.getName());
    }

    @Override // zb0.d0
    public final void B(Activity activity, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, com.garmin.android.apps.connectmobile.devices.model.f fVar, long j8, String str, zb0.u0 u0Var) {
        aVar.getClass();
        bVar.getClass();
        fVar.getClass();
        str.getClass();
        u0Var.getClass();
        WellnessAlertsActivity.ea(activity, aVar, bVar, fVar, j8, str, u0Var);
    }

    @Override // zb0.d0
    public final boolean C(zb0.u0 u0Var) {
        vg1.z zVarD = zb0.n0.d(u0Var);
        if (zVarD == null || !zVarD.b()) {
            return false;
        }
        switch (zb0.n0.a.f203583a[u0Var.ordinal()]) {
            case 26:
            case 27:
            case 28:
            case 29:
                return true;
            default:
                return false;
        }
    }

    @Override // zb0.d0
    public final boolean D(ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting, boolean z14) {
        String str = z14 ? "BLOOD_EFFICIENCY_ACTION" : null;
        ic1.i.f92620g.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_PULSE_OX_SETTINGS_EXTRA", false);
        HelpActivity.a aVar = HelpActivity.f36653a;
        ro0.l lVar = ro0.l.PULSE_OX;
        aVar.getClass();
        return HelpActivity.a.d(activityTrackingPulseOXSetting, lVar, str, bundle);
    }

    @Override // zb0.d0
    public final void E(Context context, long j8) {
        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
        com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.WATCH_FACES;
        aVar.getClass();
        ConnectIQDownloadListActivity.a.a(context, j8, lVar);
    }

    @Override // zb0.d0
    public final boolean F(long j8, lu.a aVar) {
        aVar.getClass();
        hu.a.f85684b.a().getClass();
        return hu.a.V(j8, aVar);
    }

    @Override // zb0.d0
    public final void G(Activity activity, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, com.garmin.android.apps.connectmobile.devices.model.f fVar, long j8, String str, zb0.u0 u0Var) {
        aVar.getClass();
        bVar.getClass();
        fVar.getClass();
        str.getClass();
        u0Var.getClass();
        FR45ActivityAlertsActivity.f42990m.getClass();
        Intent intent = new Intent(activity, (Class<?>) FR45ActivityAlertsActivity.class);
        intent.putExtra("GCM_deviceActivityOptionsSport", aVar);
        intent.putExtra("GCM_deviceActivityOptionsSubSport", bVar);
        intent.putExtra("GCM_deviceActivityOptions", fVar);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceEnumValue", u0Var);
        if (TextUtils.isEmpty(str)) {
            str = activity.getString(R.string.activity_options_title);
        }
        intent.putExtra("GCM_deviceSettingsTitle", str);
        activity.startActivity(intent);
    }

    @Override // zb0.d0
    public final void H(ng1.k0 k0Var, long j8, String str, String str2, int i14) {
        GCMWiFiNetworksActivity.a aVar = GCMWiFiNetworksActivity.f43245f;
        aVar.getClass();
        if (GCMWiFiNetworksActivity.a.e(j8) || GCMWiFiNetworksActivity.a.f(str)) {
            k0Var.startActivity(GCMWiFiNetworksActivity.a.a(k0Var, j8, str, str2, i14));
        } else {
            GCMWiFiNetworksActivity.a.c(aVar, k0Var);
        }
    }

    @Override // zb0.d0
    public final Intent I(Context context, sd2.f fVar) {
        context.getClass();
        if (fVar == null) {
            return null;
        }
        RTSSettingsLauncherActivity.f34352a.getClass();
        return RTSSettingsLauncherActivity.a.a(context, fVar, GDIRealtimeSettingsProto.WellKnownCompositionId.NOTIFICATION_SETTINGS_VALUE, true, null, null);
    }

    @Override // zb0.d0
    public final vg1.z J(zb0.u0 u0Var) {
        return zb0.n0.d(u0Var);
    }

    @Override // zb0.d0
    public final Intent K(Context context) {
        NotificationSettingsActivity.f43568b.getClass();
        Intent intent = new Intent(context, (Class<?>) NotificationSettingsActivity.class);
        intent.putExtra("VIEW_PUSH_NOTIFICATION_SETTINGS", true);
        intent.putExtra("EXTRA_SCROLL_TO_ITEM", (Serializable) null);
        return intent;
    }

    @Override // zb0.d0
    public final void L(long j8, boolean z14, lu.a aVar) {
        aVar.getClass();
        hu.a.f85684b.a().getClass();
        hu.a.X(j8, z14, aVar);
    }

    @Override // zb0.d0
    public final void M(com.garmin.android.apps.connectmobile.settings.devices.a aVar, String str) {
        CustomStrideLengthSettingsActivity.f41512a.getClass();
        Intent intent = new Intent(aVar, (Class<?>) CustomStrideLengthSettingsActivity.class);
        intent.putExtra("GCM_deviceProductNbr", str);
        aVar.startActivityForResult(intent, 15);
    }

    @Override // zb0.d0
    public final void N(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_PULSE_OX_SETTINGS);
    }

    @Override // zb0.d0
    public final void O(ng1.k0 k0Var, long j8) {
        int i14 = ConnectIQStorageManagementActivity.f31803d;
        Intent intent = new Intent(k0Var, (Class<?>) ConnectIQStorageManagementActivity.class);
        intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", j8);
        k0Var.startActivity(intent);
    }

    @Override // zb0.d0
    public final void P(Context context, long j8) {
        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
        com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.WIDGETS;
        aVar.getClass();
        ConnectIQDownloadListActivity.a.a(context, j8, lVar);
    }

    @Override // zb0.d0
    public final String Q(Context context, double d14, double d15) {
        context.getClass();
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(d14, d15, com.garmin.android.library.mapsdkadapter.i.d.GOOGLE);
        Address addressD = (Address) ge1.b.W(t13.h.f161748a, new a(fVar, null));
        if (addressD == null) {
            c22.z1.f23762a.getClass();
            addressD = c22.z1.d(fVar);
        }
        return c22.t1.a(context, addressD);
    }

    @Override // zb0.d0
    public final void R(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_CUSTOMIZE_WATCH_FACE);
    }

    @Override // zb0.d0
    public final ur0.a S(Double d14) {
        int iDoubleValue = (int) d14.doubleValue();
        ur0.a.f172319e.getClass();
        Bundle bundle = new Bundle(1);
        bundle.putInt("arg.key.goal.intensity.minutes", iDoubleValue);
        ur0.a aVar = new ur0.a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // zb0.d0
    public final void T(long j8, Boolean bool) {
        hk0.a.f().o(j8, bool.booleanValue());
    }

    @Override // zb0.d0
    public final void U(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).f(j8, e31.a.ENTERED_ACTIVITY_TRACKING_SCREEN);
    }

    @Override // zb0.d0
    public final Intent V(ng1.j jVar, long j8, String str) {
        Intent intent = new Intent(jVar, (Class<?>) AudioPromptsSettingsActivity.class);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceProductNbr", str);
        return intent;
    }

    @Override // zb0.d0
    public final void W(long j8, Boolean bool) {
        hk0.a.f().p(j8, bool.booleanValue());
    }

    @Override // zb0.d0
    public final void X(com.garmin.android.apps.connectmobile.settings.devices.a aVar, DeviceSettingsDTO deviceSettingsDTO, String str, String str2) {
        ActivityTrackingPulseOXSetting.f41786l.getClass();
        ActivityTrackingPulseOXSetting.a.a(aVar, deviceSettingsDTO, str, str2);
    }

    @Override // zb0.d0
    public final boolean Y(vg1.z zVar) {
        return zVar != vg1.y.G;
    }

    @Override // zb0.d0
    public final long Z(DeviceSettingsVivomoveSetup deviceSettingsVivomoveSetup) {
        cw.d dVarM = cw.d.M();
        dVarM.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.d(dVarM), deviceSettingsVivomoveSetup);
    }

    @Override // zb0.d0
    public final long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b) {
        if (userSettingsDTO == null) {
            return -1L;
        }
        return cw.q.N().O(userSettingsDTO, jSONObject, interfaceC0995b);
    }

    @Override // zb0.d0
    public final String a0(String str, String[] strArr) {
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
        switch (sk1.a.f159931a[u0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return HRZonesConfigVivosportActivity.class.getName();
            case 6:
                return HRZonesConfigActivity.class.getName();
            default:
                vg1.z zVarJ = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).J(u0Var);
                if (zVarJ != null && zVarJ != vg1.y.U) {
                    return zVarJ.getF178180m();
                }
                Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                switch (zb0.n0.a.f203583a[u0Var.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        return HRZonesConfigVivosmart3Activity.class.getName();
                    default:
                        if (strArr == null || strArr.length <= 0 || !ArrayUtils.contains(strArr, td2.a.EnumC3084a.FITNESS.toString())) {
                            return null;
                        }
                        return HRZonesConfigActivity.class.getName();
                }
        }
    }

    @Override // zb0.d0
    public final void b(long j8, zb0.a aVar) {
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b bVarA = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
        bVarA.getClass();
        bVarA.b(new bd0.d(bVarA, j8, aVar, 4));
    }

    @Override // zb0.d0
    public final void c(GDISmartProto.Smart smart, long j8) {
        if (smart != null) {
            ProtobufRequestManager.getInstance().initiateNotification(smart, j8);
        }
    }

    @Override // zb0.d0
    public final lu.d d(long j8) {
        hu.a.f85684b.a().getClass();
        return hu.a.T(j8);
    }

    @Override // zb0.d0
    public final lu.c e(long j8) {
        hu.a.f85684b.a().getClass();
        return hu.a.R(j8);
    }

    @Override // zb0.d0
    public final String f(long j8, lu.a aVar) {
        aVar.getClass();
        hu.a.f85684b.a().getClass();
        return hu.a.Q(j8, aVar);
    }

    @Override // zb0.d0
    public final void g(long j8) {
        hu.a aVarA = hu.a.f85684b.a();
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new hu.c(j8, aVarA), null);
    }

    @Override // zb0.d0
    public final lu.b h(long j8, lu.a aVar) {
        aVar.getClass();
        hu.a.f85684b.a().getClass();
        return hu.a.P(j8, aVar);
    }

    @Override // zb0.d0
    public final long i(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> interfaceC0995b) {
        return cw.q.N().M(interfaceC0995b);
    }

    @Override // zb0.d0
    public final long j(String str, ng1.r rVar) {
        cw.q qVarN = cw.q.N();
        qVarN.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.k(str, qVarN), rVar);
    }

    @Override // zb0.d0
    public final void k(IndexDevicesGeneralSettingActivity indexDevicesGeneralSettingActivity, long j8) {
        WeatherLocationSelectionActivity.f47901b.getClass();
        Intent intent = new Intent(indexDevicesGeneralSettingActivity, (Class<?>) WeatherLocationSelectionActivity.class);
        intent.putExtra("extra_device_id", j8);
        indexDevicesGeneralSettingActivity.startActivityForResult(intent, 200);
    }

    @Override // zb0.d0
    public final boolean l(vg1.z zVar) {
        return zVar != vg1.y.J;
    }

    @Override // zb0.d0
    public final void m(Activity activity, String str, int i14) {
        CustomStrideLengthSettingsActivity.f41512a.getClass();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) CustomStrideLengthSettingsActivity.class);
            intent.putExtra("GCM_deviceProductNbr", str);
            activity.startActivityForResult(intent, i14);
        }
    }

    @Override // zb0.d0
    public final boolean n(long j8) {
        hu.a.f85684b.a().getClass();
        return hu.a.W(j8);
    }

    @Override // zb0.d0
    public final void o(ng1.k0 k0Var, long j8, String str, String str2, String str3) {
        GCMWiFiNetworksActivity.f43245f.g(k0Var, j8, str, str2, str3);
    }

    @Override // zb0.d0
    public final void p(androidx.fragment.app.m mVar) {
        HeartRateHelpActivity.a aVar = HeartRateHelpActivity.f36655a;
        so0.a aVar2 = so0.a.HEART_RATE_ZONES_WELLNESS_HELP;
        aVar.getClass();
        aVar2.getClass();
        Intent intent = new Intent(mVar, (Class<?>) HeartRateHelpActivity.class);
        intent.putExtra("args_heart_rate_help", aVar2.ordinal());
        mVar.startActivity(intent);
    }

    @Override // zb0.d0
    public final xg1.u q(boolean z14, String str, double d14) {
        xg1.u.f190921h.getClass();
        Bundle bundle = new Bundle();
        xg1.u uVar = new xg1.u();
        bundle.putString("DIALOG_TITLE", str);
        bundle.putDouble("WEIGHT_IN_KG", d14);
        bundle.putBoolean("IS_GOAL_WEIGHT", z14);
        bundle.putBoolean("IS_FROM_WEIGHT_REPORTS", false);
        uVar.setArguments(bundle);
        return uVar;
    }

    @Override // zb0.d0
    public final Uri r(long j8) {
        Uri uriE = zb0.n0.e(j8);
        uriE.getClass();
        return uriE;
    }

    @Override // zb0.d0
    public final void s(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_ALARMS);
    }

    @Override // zb0.d0
    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getF104278b() {
        return this.f104278b;
    }

    @Override // zb0.d0
    public final void u(com.garmin.android.apps.connectmobile.settings.devices.a aVar, UserSettingsDTO userSettingsDTO, int i14) {
        IntensityMinutesConfigActivity.da(aVar, userSettingsDTO, i14);
    }

    @Override // zb0.d0
    public final String v(List<String> list) {
        list.getClass();
        hu.a.f85684b.a().getClass();
        return hu.a.O(list);
    }

    @Override // zb0.d0
    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getF104277a() {
        return this.f104277a;
    }

    @Override // zb0.d0
    public final boolean x(long j8) {
        List listK = p13.x.k(ui1.k0.INREACH_ENABLED.f171313a, ui1.k0.INREACH_PREMIUM.f171313a, ui1.k0.INREACH_STANDARD.f171313a, ui1.k0.INREACH_ESSENTIAL.f171313a);
        try {
            ArrayList arrayListD = xx2.b.d();
            if (arrayListD == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListD) {
                yx2.c cVar = (yx2.c) obj;
                List<yx2.d> list = cVar.f200068w;
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g(((yx2.d) it.next()).f200072c, String.valueOf(j8))) {
                            if (!listK.contains(cVar.f200048a)) {
                                break;
                            }
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((yx2.c) it3.next()).f()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // zb0.d0
    public final String y(String str) {
        if (str == null) {
            return null;
        }
        new ng1.b0();
        return ng1.b0.b(str);
    }

    @Override // zb0.d0
    public final long z(boolean z14, ng1.d1 d1Var) {
        cw.d dVarM = cw.d.M();
        dVarM.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.h0(z14, dVarM), d1Var);
    }
}
