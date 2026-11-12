package com.garmin.android.apps.connectmobile.bikesensors.orca;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.z0;
import bs2.q00;
import ch1.a1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.bikesensors.c;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import fb2.k;
import fw.m;
import fw.p;
import gg1.o0;
import java.io.File;
import java.util.Observable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import uv.h;
import uv.i;
import vg1.k0;
import vg1.s0;
import vv.f;
import vv.g;
import vv.n;
import vv.o;
import zv.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/OrcaGeneralSettingsActivity;", "Lvv/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class OrcaGeneralSettingsActivity extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f30882v = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f30883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f30884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f30885r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f30886t;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30887a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30887a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zv.e] */
    /* JADX WARN: Type inference failed for: r0v1, types: [zv.e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zv.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [zv.e] */
    public OrcaGeneralSettingsActivity() {
        final int i14 = 0;
        this.f30883p = new z0(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaGeneralSettingsActivity f207146b;

            {
                this.f207146b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                OrcaGeneralSettingsActivity orcaGeneralSettingsActivity = this.f207146b;
                m mVar = (m) obj;
                switch (i15) {
                    case 0:
                        int i16 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        p pVar = mVar.f73769b;
                        int i17 = pVar == null ? -1 : OrcaGeneralSettingsActivity.b.f30887a[pVar.ordinal()];
                        if (i17 == 1) {
                            orcaGeneralSettingsActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            String str = (String) mVar.f73770c;
                            if (str != null) {
                                a aVar = new a(str);
                                uv.i sensorSettings = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                                if (sensorSettings != null) {
                                    sensorSettings.f172898a = aVar;
                                }
                                orcaGeneralSettingsActivity.f178102a.l();
                            }
                        } else if (i17 == 3) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var, "OrcaGeneralSettingsActivity", "Result is null");
                        }
                        break;
                    case 1:
                        int i18 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        if (mVar.f73769b != p.SUCCESS) {
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            orcaGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i19 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            uv.i sensorSettings2 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t7).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            orcaGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i24 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        uv.i sensorSettings3 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        orcaGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f30884q = new z0(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaGeneralSettingsActivity f207146b;

            {
                this.f207146b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                OrcaGeneralSettingsActivity orcaGeneralSettingsActivity = this.f207146b;
                m mVar = (m) obj;
                switch (i16) {
                    case 0:
                        int i17 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        p pVar = mVar.f73769b;
                        int i18 = pVar == null ? -1 : OrcaGeneralSettingsActivity.b.f30887a[pVar.ordinal()];
                        if (i18 == 1) {
                            orcaGeneralSettingsActivity.showProgressOverlay();
                        } else if (i18 == 2) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            String str = (String) mVar.f73770c;
                            if (str != null) {
                                a aVar = new a(str);
                                uv.i sensorSettings = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                                if (sensorSettings != null) {
                                    sensorSettings.f172898a = aVar;
                                }
                                orcaGeneralSettingsActivity.f178102a.l();
                            }
                        } else if (i18 == 3) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var, "OrcaGeneralSettingsActivity", "Result is null");
                        }
                        break;
                    case 1:
                        int i19 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        if (mVar.f73769b != p.SUCCESS) {
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            orcaGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i110 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            uv.i sensorSettings2 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t7).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            orcaGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i24 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        uv.i sensorSettings3 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        orcaGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f30885r = new z0(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaGeneralSettingsActivity f207146b;

            {
                this.f207146b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                OrcaGeneralSettingsActivity orcaGeneralSettingsActivity = this.f207146b;
                m mVar = (m) obj;
                switch (i17) {
                    case 0:
                        int i18 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        p pVar = mVar.f73769b;
                        int i19 = pVar == null ? -1 : OrcaGeneralSettingsActivity.b.f30887a[pVar.ordinal()];
                        if (i19 == 1) {
                            orcaGeneralSettingsActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            String str = (String) mVar.f73770c;
                            if (str != null) {
                                a aVar = new a(str);
                                uv.i sensorSettings = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                                if (sensorSettings != null) {
                                    sensorSettings.f172898a = aVar;
                                }
                                orcaGeneralSettingsActivity.f178102a.l();
                            }
                        } else if (i19 == 3) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var, "OrcaGeneralSettingsActivity", "Result is null");
                        }
                        break;
                    case 1:
                        int i110 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        if (mVar.f73769b != p.SUCCESS) {
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            orcaGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i111 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            uv.i sensorSettings2 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t7).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            orcaGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i24 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        uv.i sensorSettings3 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        orcaGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f30886t = new z0(this) { // from class: zv.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaGeneralSettingsActivity f207146b;

            {
                this.f207146b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i18 = i17;
                OrcaGeneralSettingsActivity orcaGeneralSettingsActivity = this.f207146b;
                m mVar = (m) obj;
                switch (i18) {
                    case 0:
                        int i19 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        p pVar = mVar.f73769b;
                        int i110 = pVar == null ? -1 : OrcaGeneralSettingsActivity.b.f30887a[pVar.ordinal()];
                        if (i110 == 1) {
                            orcaGeneralSettingsActivity.showProgressOverlay();
                        } else if (i110 == 2) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            String str = (String) mVar.f73770c;
                            if (str != null) {
                                a aVar = new a(str);
                                uv.i sensorSettings = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                                if (sensorSettings != null) {
                                    sensorSettings.f172898a = aVar;
                                }
                                orcaGeneralSettingsActivity.f178102a.l();
                            }
                        } else if (i110 == 3) {
                            orcaGeneralSettingsActivity.hideProgressOverlay();
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var, "OrcaGeneralSettingsActivity", "Result is null");
                        }
                        break;
                    case 1:
                        int i111 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        if (mVar.f73769b != p.SUCCESS) {
                            orcaGeneralSettingsActivity.pa(R.string.txt_something_went_wrong_try_again);
                        } else {
                            orcaGeneralSettingsActivity.pa(R.string.settings_saved_message);
                        }
                        break;
                    case 2:
                        int i112 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            uv.i sensorSettings2 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings2 != null) {
                                sensorSettings2.f172900c = ((Number) t7).intValue();
                                sensorSettings2.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            orcaGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i24 = OrcaGeneralSettingsActivity.f30882v;
                        mVar.getClass();
                        uv.i sensorSettings3 = orcaGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings3 != null) {
                            sensorSettings3.f172899b = (uv.e) mVar.f73770c;
                        }
                        orcaGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
    }

    @Override // vg1.f0
    public final void da() {
        ca(new vv.m(this, R.string.device_settings_vector_section_title_firmware, null, null, 12, null), 4);
        ca(new g(this), 4);
        ca(new a1(this), 2);
        ca(new o(this), 4);
        ca(new k(this), 2);
        ca(new vv.m(this, R.string.device_settings_vector_section_title_status, null, null, 12, null), 4);
        ca(new vv.b(this), 4);
        ca(new n(this), 4);
    }

    @Override // vg1.f0
    public final k0 fa() {
        File filesDir = getFilesDir();
        filesDir.getClass();
        return new k0(this, this, 16, w.c(new s0(this, new h.a(25, "settings.fit", filesDir), this.f30883p, this.f30884q, this.f30885r, this.f30886t)));
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.devices_settings_device_settings);
        string.getClass();
        return string;
    }

    @Override // vg1.f0
    public final void ka() {
        super.ka();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        if (linearLayout != null) {
            linearLayout.removeViewAt(0);
        }
    }

    @Override // vv.f
    public final o13.p<String, String> oa(vv.e eVar) {
        eVar.getClass();
        return new o13.p<>(getString(R.string.lbl_device_connection_lost), getString(R.string.speed_sensor2_pairing_instructions));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        if (i14 != 100) {
            if (i14 == 10 && i15 == -1) {
                finish();
                return;
            }
            return;
        }
        i sensorSettings = this.f178102a.getSensorSettings();
        zv.a aVar = (zv.a) (sensorSettings != null ? sensorSettings.f172898a : null);
        int i16 = extras.getInt("GCM_extra_bike_wheel_circumference_information", -1);
        if (i16 > 0 && aVar != null) {
            q00 q00Var = aVar.f207134a;
            if (q00Var != null) {
                q00Var.n(3, Integer.valueOf(i16));
            }
            aVar.f207136c = true;
        }
        if (extras.getBoolean("GCM_extra_bike_wheel_displayed_in_metric", true)) {
            l.f68084a.getClass();
            l.a.a().P2(o0.METRIC);
        } else {
            l.f68084a.getClass();
            l.a.a().P2(o0.STATUTE_US);
        }
        this.f178102a.l();
    }

    public final void pa(int i14) {
        hideProgressOverlay();
        Toast.makeText(this, getString(i14), 0).show();
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i sensorSettings;
        i sensorSettings2;
        i sensorSettings3;
        String string;
        int iIntValue;
        observable.getClass();
        i sensorSettings4 = this.f178102a.getSensorSettings();
        zv.a aVar = (zv.a) (sensorSettings4 != null ? sensorSettings4.f172898a : null);
        if (observable instanceof o) {
            if (aVar == null) {
                iIntValue = 0;
            } else {
                q00 q00Var = aVar.f207134a;
                Integer numI = q00Var != null ? q00Var.i(3) : null;
                if (numI != null) {
                    iIntValue = numI.intValue();
                } else {
                    iIntValue = 0;
                }
            }
            WheelCircumferenceActivity.a aVar2 = WheelCircumferenceActivity.f30899c;
            l.f68084a.getClass();
            boolean zA = l.a.a().k().a();
            aVar2.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("GCM_extra_bike_wheel_circumference_information", iIntValue);
            bundle.putBoolean("GCM_extra_bike_wheel_displayed_in_metric", zA);
            Intent intent = new Intent(this, (Class<?>) WheelCircumferenceActivity.class);
            intent.putExtras(bundle);
            startActivityForResult(intent, 100);
        }
        if (observable instanceof g) {
            g gVar = (g) observable;
            i sensorSettings5 = this.f178102a.getSensorSettings();
            uv.e eVar = sensorSettings5 != null ? sensorSettings5.f172899b : null;
            if (eVar == null || !eVar.a()) {
                if ((eVar != null ? eVar.f172884a : null) == null) {
                    i sensorSettings6 = this.f178102a.getSensorSettings();
                    sensorSettings6.getClass();
                    gVar.v(this, sensorSettings6);
                    this.f178102a.a();
                }
            } else {
                i sensorSettings7 = this.f178102a.getSensorSettings();
                if ((sensorSettings7 == null || sensorSettings7.f172900c != 1) && (((sensorSettings = this.f178102a.getSensorSettings()) == null || sensorSettings.f172900c != 2) && ((sensorSettings2 = this.f178102a.getSensorSettings()) == null || sensorSettings2.f172900c != 3))) {
                    i sensorSettings8 = this.f178102a.getSensorSettings();
                    if ((sensorSettings8 == null || sensorSettings8.f172900c != 4) && ((sensorSettings3 = this.f178102a.getSensorSettings()) == null || sensorSettings3.f172900c != 5)) {
                        string = getString(R.string.msg_device_battery_unknown, this.f178102a.getDeviceName());
                        string.getClass();
                    } else {
                        string = getString(R.string.msg_device_battery_too_low, this.f178102a.getDeviceName());
                        string.getClass();
                    }
                    new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.device_settings_vector_firmware_update_failed)).setMessage(string).setCancelable(true).setPositiveButton(getString(R.string.lbl_ok), new zo.g(3)).create().show();
                } else {
                    DeviceSettingsFirmwareUpdate.da(this, new c.b("", eVar.f172884a, eVar.f172885b, eVar.f172886c), this.f178102a.getDeviceUnitId(), this.f178102a.i(), getString(R.string.lbl_update_speed_sensor));
                }
            }
        }
        if (observable instanceof n) {
            startActivity(new Intent(this, (Class<?>) OrcaSensorsIndicatorsActivity.class));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/OrcaGeneralSettingsActivity$a;", "", "<init>", "()V", "", "CHANGE_WHEEL_DIAMETER_CODE", "I", "", "TAG", "Ljava/lang/String;", "DEVICE_SETTINGS_XML_FILE_INDEX", "DEVICE_SETTINGS_FILE_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
