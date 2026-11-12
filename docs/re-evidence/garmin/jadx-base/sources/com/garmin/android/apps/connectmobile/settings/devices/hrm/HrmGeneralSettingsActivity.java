package com.garmin.android.apps.connectmobile.settings.devices.hrm;

import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.bikesensors.c;
import com.garmin.android.apps.connectmobile.settings.devices.hrm.HrmGeneralSettingsActivity;
import fw.m;
import fw.p;
import i3.e5;
import java.io.File;
import java.util.Observable;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import uv.e;
import uv.h;
import uv.i;
import vg1.k0;
import vg1.s0;
import vv.f;
import vv.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/hrm/HrmGeneralSettingsActivity;", "Lvv/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HrmGeneralSettingsActivity extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f43025t = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lh1.a f43026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lh1.a f43027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lh1.a f43028r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43029a;

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
            f43029a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lh1.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [lh1.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lh1.a] */
    public HrmGeneralSettingsActivity() {
        final int i14 = 0;
        this.f43026p = new z0(this) { // from class: lh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HrmGeneralSettingsActivity f112448b;

            {
                this.f112448b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                HrmGeneralSettingsActivity hrmGeneralSettingsActivity = this.f112448b;
                m mVar = (m) obj;
                switch (i15) {
                    case 0:
                        int i16 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        int i17 = HrmGeneralSettingsActivity.b.f43029a[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            hrmGeneralSettingsActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            hrmGeneralSettingsActivity.f178102a.l();
                        } else if (i17 != 3) {
                            u0.r();
                        } else {
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            Toast.makeText(hrmGeneralSettingsActivity, hrmGeneralSettingsActivity.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                            hrmGeneralSettingsActivity.finish();
                        }
                        break;
                    case 1:
                        int i18 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            i sensorSettings = hrmGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings != null) {
                                sensorSettings.f172900c = ((Number) t7).intValue();
                                sensorSettings.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            hrmGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i19 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        i sensorSettings2 = hrmGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings2 != null) {
                            sensorSettings2.f172899b = (e) mVar.f73770c;
                        }
                        hrmGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f43027q = new z0(this) { // from class: lh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HrmGeneralSettingsActivity f112448b;

            {
                this.f112448b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                HrmGeneralSettingsActivity hrmGeneralSettingsActivity = this.f112448b;
                m mVar = (m) obj;
                switch (i16) {
                    case 0:
                        int i17 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        int i18 = HrmGeneralSettingsActivity.b.f43029a[mVar.f73769b.ordinal()];
                        if (i18 == 1) {
                            hrmGeneralSettingsActivity.showProgressOverlay();
                        } else if (i18 == 2) {
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            hrmGeneralSettingsActivity.f178102a.l();
                        } else if (i18 != 3) {
                            u0.r();
                        } else {
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            Toast.makeText(hrmGeneralSettingsActivity, hrmGeneralSettingsActivity.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                            hrmGeneralSettingsActivity.finish();
                        }
                        break;
                    case 1:
                        int i19 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            i sensorSettings = hrmGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings != null) {
                                sensorSettings.f172900c = ((Number) t7).intValue();
                                sensorSettings.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            hrmGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i110 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        i sensorSettings2 = hrmGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings2 != null) {
                            sensorSettings2.f172899b = (e) mVar.f73770c;
                        }
                        hrmGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f43028r = new z0(this) { // from class: lh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HrmGeneralSettingsActivity f112448b;

            {
                this.f112448b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                HrmGeneralSettingsActivity hrmGeneralSettingsActivity = this.f112448b;
                m mVar = (m) obj;
                switch (i17) {
                    case 0:
                        int i18 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        int i19 = HrmGeneralSettingsActivity.b.f43029a[mVar.f73769b.ordinal()];
                        if (i19 == 1) {
                            hrmGeneralSettingsActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            hrmGeneralSettingsActivity.f178102a.l();
                        } else if (i19 != 3) {
                            u0.r();
                        } else {
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            hrmGeneralSettingsActivity.hideProgressOverlay();
                            Toast.makeText(hrmGeneralSettingsActivity, hrmGeneralSettingsActivity.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                            hrmGeneralSettingsActivity.finish();
                        }
                        break;
                    case 1:
                        int i110 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        if (mVar.f73769b == p.SUCCESS && t7 != 0) {
                            i sensorSettings = hrmGeneralSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings != null) {
                                sensorSettings.f172900c = ((Number) t7).intValue();
                                sensorSettings.f172901d = new DateTime(System.currentTimeMillis());
                            }
                            hrmGeneralSettingsActivity.f178102a.l();
                            break;
                        }
                        break;
                    default:
                        int i111 = HrmGeneralSettingsActivity.f43025t;
                        mVar.getClass();
                        i sensorSettings2 = hrmGeneralSettingsActivity.f178102a.getSensorSettings();
                        if (sensorSettings2 != null) {
                            sensorSettings2.f172899b = (e) mVar.f73770c;
                        }
                        hrmGeneralSettingsActivity.f178102a.l();
                        break;
                }
            }
        };
    }

    @Override // vg1.f0
    public final void da() {
        ca(new vv.m(this, R.string.device_settings_vector_section_title_firmware, null, null, 12, null), 4);
        ca(new g(this), 4);
        ca(new vv.m(this, R.string.device_settings_vector_section_title_status, null, null, 12, null), 4);
        ca(new vv.b(this), 4);
    }

    @Override // vg1.f0
    public final k0 fa() {
        File filesDir = getFilesDir();
        filesDir.getClass();
        return new k0(this, this, 16, w.c(new s0(this, new h.a(28, "SETTINGS.FIT", filesDir), this.f43026p, null, this.f43027q, this.f43028r, 8, null)));
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
            linearLayout.addView(fb2.g.a(this), 0);
            linearLayout.addView(fb2.g.a(this), 3);
        }
    }

    @Override // vv.f
    public final o13.p<String, String> oa(vv.e eVar) {
        eVar.getClass();
        return new o13.p<>(getString(R.string.lbl_device_connection_lost), getString(R.string.msg_hrm_setup_instruction, this.f178102a.getDeviceName()));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            finish();
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i sensorSettings;
        i sensorSettings2;
        i sensorSettings3;
        String string;
        observable.getClass();
        if (observable instanceof g) {
            g gVar = (g) observable;
            i sensorSettings4 = this.f178102a.getSensorSettings();
            e eVar = sensorSettings4 != null ? sensorSettings4.f172899b : null;
            if (eVar == null || !eVar.a()) {
                if ((eVar != null ? eVar.f172884a : null) == null) {
                    i sensorSettings5 = this.f178102a.getSensorSettings();
                    sensorSettings5.getClass();
                    gVar.v(this, sensorSettings5);
                    this.f178102a.a();
                    return;
                }
                return;
            }
            i sensorSettings6 = this.f178102a.getSensorSettings();
            if ((sensorSettings6 != null && sensorSettings6.f172900c == 1) || (((sensorSettings = this.f178102a.getSensorSettings()) != null && sensorSettings.f172900c == 2) || ((sensorSettings2 = this.f178102a.getSensorSettings()) != null && sensorSettings2.f172900c == 3))) {
                DeviceSettingsFirmwareUpdate.da(this, new c.b("", eVar.f172884a, eVar.f172885b, eVar.f172886c), this.f178102a.getDeviceUnitId(), this.f178102a.i(), e5.g(getString(R.string.lbl_update), StringUtils.SPACE, this.f178102a.getDeviceName()));
                return;
            }
            i sensorSettings7 = this.f178102a.getSensorSettings();
            if ((sensorSettings7 == null || sensorSettings7.f172900c != 4) && ((sensorSettings3 = this.f178102a.getSensorSettings()) == null || sensorSettings3.f172900c != 5)) {
                string = getString(R.string.msg_device_battery_unknown, this.f178102a.getDeviceName());
                string.getClass();
            } else {
                string = getString(R.string.msg_device_battery_too_low, this.f178102a.getDeviceName());
                string.getClass();
            }
            new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.device_settings_vector_firmware_update_failed)).setMessage(string).setCancelable(true).setPositiveButton(getString(R.string.lbl_ok), new jm0.c(10)).create().show();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/hrm/HrmGeneralSettingsActivity$a;", "", "<init>", "()V", "", "DEVICE_SETTINGS_XML_FILE_INDEX", "I", "", "DEVICE_SETTINGS_FILE_NAME", "Ljava/lang/String;", "FIRMWARE_SECTION_HEADER_VIEW_INDEX", "BATTERY_SECTION_HEADER_VIEW_INDEX", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
