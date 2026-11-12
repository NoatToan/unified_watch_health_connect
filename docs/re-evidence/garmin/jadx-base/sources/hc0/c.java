package hc0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.h0;
import androidx.media3.common.k0;
import androidx.media3.common.o;
import androidx.media3.common.w;
import androidx.media3.common.y;
import androidx.media3.common.z;
import c22.e1;
import c22.l3;
import c22.m3;
import ch1.f3;
import ch1.g2;
import ch1.h2;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.s;
import com.garmin.android.apps.connectmobile.leaderboard.model.p;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645SoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.feature.garminpay.GarminPayInitializer;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.maps.model.LatLng;
import gg1.o0;
import i3.e5;
import ig1.d0;
import ig1.d2;
import ig1.f2;
import ig1.m1;
import j1.v;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import l52.u;
import lo.q3;
import lo.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.x0;
import p006l2.r3;
import p13.j0;
import pt0.r;
import r22.c0;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements gc0.b.InterfaceC1548b, u03.a, xg1.c, com.garmin.android.apps.connectmobile.settings.activityoptions.b.a, com.garmin.android.apps.connectmobile.settings.activityoptions.d.a, lo.i.a, com.garmin.android.apps.connectmobile.settings.activityoptions.e.a, androidx.concurrent.futures.b.c, com.garmin.android.library.mapsdkadapter.i.f, fa.j.a, fa.j.b, e22.c, gu.e, r3, u, c0.b, u03.e, q1.a, GCMCheckableRow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83233c;

    public /* synthetic */ c(ja.b.a aVar, Object obj, long j8) {
        this.f83231a = 18;
        this.f83232b = aVar;
        this.f83233c = obj;
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow.b
    public void a(View view2, boolean z14) {
        List list = (List) this.f83232b;
        com.garmin.android.apps.connectmobile.devices.model.a aVar = (com.garmin.android.apps.connectmobile.devices.model.a) this.f83233c;
        String str = aVar.f34086a;
        AlarmDeviceSettings.a aVar2 = AlarmDeviceSettings.f41833n;
        if (!z14) {
            list.remove(str);
            return;
        }
        int i14 = 0;
        while (i14 < list.size()) {
            com.garmin.android.apps.connectmobile.devices.model.a.C0576a c0576a = com.garmin.android.apps.connectmobile.devices.model.a.f34075c;
            String str2 = (String) list.get(i14);
            c0576a.getClass();
            if (com.garmin.android.apps.connectmobile.devices.model.a.C0576a.a(str2).ordinal() >= aVar.ordinal()) {
                break;
            } else {
                i14++;
            }
        }
        list.add(i14, str);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.d.a
    public void b(int i14) {
        m1 m1Var = (m1) this.f83232b;
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) this.f83233c;
        int i15 = m1.f93365j;
        GCMComplexOneLineButton gCMComplexOneLineButton = m1Var.f93324g;
        l3.f23124b.getClass();
        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i14));
        fVar.b2(i14);
        m1Var.p();
    }

    @Override // fa.j.b
    public void c(Object obj, o oVar) {
        ja.b bVar = (ja.b) obj;
        bVar.L((z) this.f83233c, new ja.b.C1872b(oVar, ((ja.m) this.f83232b).f97988e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        switch (this.f83231a) {
            case 8:
                j1.e eVar = (j1.e) this.f83232b;
                k7.d<androidx.concurrent.futures.b.a<Void>, T> dVar = eVar.f96233a;
                if (dVar != 0) {
                    androidx.concurrent.futures.b.a aVar2 = (androidx.concurrent.futures.b.a) dVar.f103262a;
                    Objects.requireNonNull(aVar2);
                    aVar2.c();
                }
                Object obj = this.f83233c;
                eVar.f96233a = new k7.d<>(aVar, obj);
                return e5.f(obj, "PendingValue ");
            default:
                j1.z zVar = (j1.z) this.f83232b;
                Surface surface = (Surface) this.f83233c;
                zVar.f96334h.b(surface, k0.b.a(), new v(aVar, 1));
                return "provideSurface[request=" + zVar.f96334h + " surface=" + surface + "]";
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.b.a
    public void e(double d14) {
        int i14 = this.f83231a;
        Object obj = this.f83233c;
        Object obj2 = this.f83232b;
        switch (i14) {
            case 3:
                d0 d0Var = (d0) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i15 = d0.f93294l;
                m3 m3VarR = d0Var.r(fVar);
                l3.f23124b.getClass();
                double dH = l3.a.h(d14, m3VarR);
                d0Var.f93324g.setButtonRightLabel(l3.a.R(null, dH, m3VarR, l3.f23137o, false, null));
                d0Var.v(fVar, d0Var.r(fVar), Double.valueOf(dH));
                d0Var.p();
                break;
            default:
                d2 d2Var = (d2) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar2 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i16 = d2.f93297m;
                d2Var.f93324g.setButtonRightLabel(Double.toString(d14));
                fVar2.Y1(fVar2.C0());
                fVar2.V1(d14);
                d2Var.p();
                break;
        }
    }

    @Override // gu.e
    public void f(Serializable serializable) {
        dt2.k kVar = (dt2.k) this.f83232b;
        ju.a aVar = (ju.a) this.f83233c;
        List<Locale> list = (List) serializable;
        int i14 = ju.a.f100865c;
        if (list == null) {
            list = j0.f134944a;
        }
        GDIAudioPromptsProto.SupportedLanguagesResponse.Builder builderNewBuilder = GDIAudioPromptsProto.SupportedLanguagesResponse.newBuilder();
        if (!list.isEmpty()) {
            for (Locale locale : list) {
                builderNewBuilder.addLanguages(GDIAudioPromptsProto.Language.newBuilder().setCountryCode(locale.getCountry()).setLanguageCode(locale.getLanguage()));
            }
        }
        GDIAudioPromptsProto.SupportedLanguagesResponse supportedLanguagesResponseBuild = builderNewBuilder.build();
        ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
        GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder2.getClass();
        GDIAudioPromptsProto.AudioPromptsService.Builder supportedLanguagesResponse = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setSupportedLanguagesResponse(supportedLanguagesResponseBuild);
        supportedLanguagesResponse.getClass();
        GDISmartProto.Smart smartBuild = companion.setAudioPromptsService(builderNewBuilder2, supportedLanguagesResponse).build();
        smartBuild.getClass();
        companion.sendResponse(smartBuild, kVar, new iz1.f(supportedLanguagesResponseBuild, aVar));
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        s sVar = (s) this.f83232b;
        p pVar = (p) this.f83233c;
        s.a aVar = s.F;
        if (z14) {
            sVar.getClass();
            if (pVar.getUuid() == null || pVar.getBadgeId() == null) {
                return;
            }
            pt0.p pVarE6 = sVar.E6();
            String strE0 = pVar.getUuid();
            long jLongValue = pVar.getBadgeId().longValue();
            pVarE6.getClass();
            strE0.getClass();
            xy2.b.L(pVarE6, pVarE6.f140762i, new r(pVarE6, strE0, jLongValue, null));
        }
    }

    @Override // r22.c0.b
    public void h(Calendar calendar) {
        t tVar = (t) this.f83232b;
        Calendar calendar2 = (Calendar) this.f83233c;
        tVar.getClass();
        int i14 = calendar2.get(11);
        int i15 = calendar2.get(12);
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.set(11, i14);
        calendar2.set(12, i15);
        tVar.f113949a.J0(calendar2);
        tVar.w6();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.f
    public void i(com.garmin.android.library.mapsdkadapter.e eVar) {
        int i14 = this.f83231a;
        Object obj = this.f83233c;
        Object obj2 = this.f83232b;
        switch (i14) {
            case 10:
                j40.c cVar = (j40.c) obj;
                int i15 = j40.c.V0;
                ie2.c cameraState = ((qe2.h) obj2).f144584a.getCameraState();
                if (cameraState != null) {
                    cVar.X6().a((float) cameraState.f93112b);
                }
                break;
            default:
                ly0.o oVar = (ly0.o) obj2;
                eVar.getClass();
                oVar.y4((qe2.h) obj);
                com.garmin.android.library.mapsdkadapter.f fVar = eVar.f50274b;
                LatLng latLng = fVar.f50283a;
                ke2.b bVar = new ke2.b(latLng.latitude, latLng.longitude, fVar.f50284b);
                com.garmin.android.library.mapsdkadapter.f fVar2 = eVar.f50273a;
                LatLng latLng2 = fVar2.f50283a;
                oVar.T = new le2.a(bVar, new ke2.b(latLng2.latitude, latLng2.longitude, fVar2.f50284b));
                break;
        }
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        switch (this.f83231a) {
            case 11:
                ((ja.b) obj).l((ja.b.a) this.f83232b, (y) this.f83233c);
                break;
            case 12:
                ((ja.b) obj).M((ja.b.a) this.f83232b, (h0) this.f83233c);
                break;
            case 13:
                ((ja.b) obj).b((ja.b.a) this.f83232b, (w) this.f83233c);
                break;
            case 14:
                ((ja.b) obj).B((ja.b.a) this.f83232b, (PlaybackException) this.f83233c);
                break;
            case 15:
            default:
                ((ja.b) obj).a((ja.b.a) this.f83232b, this.f83233c);
                break;
            case 16:
                ((ja.b) obj).R((ja.b.a) this.f83232b, (Exception) this.f83233c);
                break;
            case 17:
                ja.b.a aVar = (ja.b.a) this.f83232b;
                k0 k0Var = (k0) this.f83233c;
                ((ja.b) obj).U(aVar, k0Var);
                int i14 = k0Var.f8335a;
                break;
        }
    }

    @Override // lo.i.a
    public void j(double d14) {
        f2 f2Var = (f2) this.f83232b;
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) this.f83233c;
        f2Var.f93318k = (int) d14;
        l3.a aVar = l3.f23124b;
        Context context = f2Var.f70343a;
        context.getClass();
        aVar.getClass();
        String strR0 = aVar.r0(context, d14, true, false, "");
        o0.a aVar2 = o0.f77285d;
        String strO0 = fVar.o0();
        aVar2.getClass();
        String strB = f2Var.b((o0.a.b(strO0).a() ? m3.METER : m3.YARD).f23164e);
        strB.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = f2Var.f93324g;
        x0 x0Var = x0.f105818a;
        gCMComplexOneLineButton.setButtonRightLabel(String.format("%s (/%d %s)", Arrays.copyOf(new Object[]{strR0, 100, strB}, 3)));
        fVar.y1("swimPacingAlertValue", Integer.valueOf((int) (q3.a(d14, am.x0.f4313o1, f2Var.f93317j.a()) * ((double) 1000))));
        f2Var.p();
    }

    @Override // e22.c
    public void k(Object obj) {
        FR645SoundsAndAlertsSettingActivity fR645SoundsAndAlertsSettingActivity = (FR645SoundsAndAlertsSettingActivity) this.f83232b;
        LinearLayout linearLayout = (LinearLayout) this.f83233c;
        fb2.e eVar = (fb2.e) obj;
        int i14 = FR645SoundsAndAlertsSettingActivity.f43014p;
        if (eVar.h(fR645SoundsAndAlertsSettingActivity.f125985k)) {
            if (fR645SoundsAndAlertsSettingActivity.ja(eVar)) {
                linearLayout.addView(fb2.g.a(fR645SoundsAndAlertsSettingActivity));
            }
            linearLayout.addView(eVar.a());
            if (eVar instanceof g2) {
                linearLayout.addView(fb2.g.c(fR645SoundsAndAlertsSettingActivity, fR645SoundsAndAlertsSettingActivity.getString(R.string.device_settings_key_tones_help)));
            }
            if (eVar instanceof h2) {
                linearLayout.addView(fb2.g.c(fR645SoundsAndAlertsSettingActivity, fR645SoundsAndAlertsSettingActivity.getString(R.string.device_settings_key_vibration_help)));
            }
            if (eVar instanceof f3) {
                linearLayout.addView(fb2.g.a(fR645SoundsAndAlertsSettingActivity));
            }
            if (eVar instanceof ch1.d0) {
                linearLayout.addView(fb2.g.a(fR645SoundsAndAlertsSettingActivity));
            }
        }
    }

    @Override // xg1.c
    public xg1.s l() {
        ig1.b bVar = (ig1.b) this.f83232b;
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) this.f83233c;
        int i14 = ig1.b.f93283f;
        xg1.a.C3552a c3552a = xg1.a.f190872b;
        String strU = bVar.u();
        userSettingsDTO.getClass();
        wi1.j jVar = userSettingsDTO.f43524b;
        int i15 = jVar != null ? jVar.f185545h : 0;
        c3552a.getClass();
        Bundle bundle = new Bundle();
        xg1.a aVar = new xg1.a();
        bundle.putString("dialog_title", strU);
        bundle.putInt("current_value", i15);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.e.a
    public void m(int i14) {
        ig1.g2 g2Var = (ig1.g2) this.f83232b;
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) this.f83233c;
        int i15 = ig1.g2.f93329j;
        String strD = new oi0.h(g2Var.f70343a).d(i14, true);
        GCMComplexOneLineButton gCMComplexOneLineButton = g2Var.f93324g;
        l3.f23124b.getClass();
        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i14));
        gCMComplexOneLineButton.f47763c.setContentDescription(strD);
        fVar.getClass();
        if (i14 < 1 || i14 > 32395) {
            i14 = 1800;
        }
        fVar.y1("timeAlertSeconds", Integer.valueOf(i14));
        g2Var.p();
    }

    @Override // gc0.b.InterfaceC1548b
    public void n(gc0.b.c cVar) {
        k kVar = (k) this.f83232b;
        sd2.f fVar = (sd2.f) this.f83233c;
        int i14 = k.e.f83262a[cVar.ordinal()];
        if (i14 == 2) {
            if (fVar.O()) {
                gc0.l lVar = kVar.J0;
                lVar.getClass();
                ge1.b.T(v1.a(lVar), null, null, new gc0.o(lVar, fVar, null), 3);
                return;
            }
            String string = kVar.getString(R.string.lbl_gear_remove_item_title, fVar.getDisplayName());
            boolean zX = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).x(fVar.getUnitID());
            Context context = kVar.getContext();
            hj1.b.f83993a.getClass();
            String strB = hj1.b.a.b(context, zX);
            if (!e1.a()) {
                Toast.makeText(kVar.getActivity(), R.string.txt_bluetooth_must_be_turned_on_for_action, 0).show();
                return;
            }
            if (!fVar.S()) {
                kVar.c7(string, strB, fVar, null);
                return;
            }
            gj1.f fVar2 = kVar.J0.f104965b;
            if (!fVar.T() || fVar2 == null) {
                kVar.c7(string, strB, fVar, null);
                return;
            }
            gj1.c cVarA = hj1.b.a(kVar.requireActivity(), fVar2, fVar.getUnitID());
            String str = cVarA.f77656e;
            i2.a(a2.DEVICES, "DevicesDashboardFragment", "Device " + fVar.getUnitID() + "PrimaryDevice: " + str);
            kVar.c7(string, str, fVar, cVarA);
            return;
        }
        if (i14 == 3) {
            fVar.getClass();
            yr1.d.d(fVar, "DevicesDashboardFragment", null);
            return;
        }
        if (i14 == 4 && (fVar instanceof sd2.j)) {
            String str2 = ((sd2.j) fVar).J0;
            rd2.f.a().f152047c.getClass();
            if (!TextUtils.isEmpty(str2)) {
                try {
                    rd2.a.b().rawQuery(am.j.m("UPDATE devices SET gble_ediv = NULL, gble_ltk = NULL, gble_rand = NULL WHERE mac_address = '", str2, "'"), null);
                    rd2.i.e(1);
                } catch (Exception e4) {
                    rd2.i.f152075b.error("clearGarminAuth: macAddr [" + str2 + "]", (Throwable) e4);
                }
            }
            Map<u0, vg1.t> map = n0.f203577a;
            hk0.p pVar = hk0.p.f84079d;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (da2.c.f58878b == null) {
                da2.c.f58878b = new da2.c();
            }
            da2.c cVar2 = da2.c.f58878b;
            Context context2 = GarminConnectMobileApp.f28688j;
            Logger logger = cVar2.f58879a;
            logger.debug("changeConnectionToSystemLevelBond: {}", str2);
            BluetoothManager bluetoothManager = (BluetoothManager) context2.getSystemService("bluetooth");
            BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
            if (adapter != null) {
                BluetoothDevice remoteDevice = adapter.getRemoteDevice(str2);
                if (remoteDevice.getBondState() == 10 && bluetoothManager.getConnectionState(remoteDevice, 7) == 2) {
                    remoteDevice.createBond();
                } else {
                    logger.warn("Device not currently able to add system bonding.");
                }
            }
        }
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        switch (this.f83231a) {
            case 22:
                l52.i.a aVar2 = (l52.i.a) this.f83232b;
                e23.l lVar = (e23.l) this.f83233c;
                if (aVar.getParent() == aVar2) {
                    lVar.invoke(aVar);
                }
                break;
            default:
                e23.l lVar2 = (e23.l) this.f83232b;
                p0 p0Var = (p0) this.f83233c;
                if (((Boolean) lVar2.invoke(aVar)).booleanValue()) {
                    p0Var.f105807a++;
                }
                break;
        }
    }

    @Override // u03.a
    public void run() {
        GarminPayInitializer.handleUserSignedOut$lambda$0((Context) this.f83232b, (GarminPayInitializer) this.f83233c);
    }

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f83231a = i14;
        this.f83232b = obj;
        this.f83233c = obj2;
    }
}
