package com.garmin.android.apps.connectmobile.bikesensors.orca;

import android.widget.LinearLayout;
import androidx.lifecycle.z0;
import bs2.q00;
import c22.l3;
import ch1.e6;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import fw.m;
import fw.p;
import java.io.File;
import java.util.Observable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import uv.h;
import uv.i;
import vg1.e1;
import vg1.k0;
import vg1.s0;
import vv.e;
import vv.f;
import zv.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/OrcaUserSettingsActivity;", "Lvv/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OrcaUserSettingsActivity extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f30895t = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f30897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f30898r;

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zv.j] */
    /* JADX WARN: Type inference failed for: r0v1, types: [zv.j] */
    public OrcaUserSettingsActivity() {
        final int i14 = 0;
        this.f30897q = new z0(this) { // from class: zv.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaUserSettingsActivity f207157b;

            {
                this.f207157b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                String str;
                int i15 = i14;
                OrcaUserSettingsActivity orcaUserSettingsActivity = this.f207157b;
                m mVar = (m) obj;
                switch (i15) {
                    case 0:
                        int i16 = OrcaUserSettingsActivity.f30895t;
                        mVar.getClass();
                        if (mVar.f73769b == p.SUCCESS && (str = (String) mVar.f73770c) != null) {
                            a aVar = new a(str);
                            uv.i sensorSettings = orcaUserSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings != null) {
                                sensorSettings.f172898a = aVar;
                            }
                            UserSettingsDTO userSettingsDTOG = orcaUserSettingsActivity.f178102a.g();
                            if (userSettingsDTOG != null) {
                                double dE2 = userSettingsDTOG.E2();
                                l3.f23124b.getClass();
                                float fP1 = (float) l3.a.P1(dE2);
                                q00 q00Var = aVar.f207134a;
                                if (!s.b(fP1, q00Var != null ? q00Var.h(0) : null)) {
                                    orcaUserSettingsActivity.f30896p = true;
                                    uv.i sensorSettings2 = orcaUserSettingsActivity.f178102a.getSensorSettings();
                                    a aVar2 = (a) (sensorSettings2 != null ? sensorSettings2.f172898a : null);
                                    if (aVar2 != null) {
                                        q00 q00Var2 = aVar2.f207134a;
                                        if (q00Var2 != null) {
                                            q00Var2.n(0, Float.valueOf(fP1));
                                        }
                                        aVar2.f207136c = true;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        int i17 = OrcaUserSettingsActivity.f30895t;
                        mVar.getClass();
                        if (orcaUserSettingsActivity.f30896p) {
                            orcaUserSettingsActivity.hideProgressOverlay();
                            orcaUserSettingsActivity.finish();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f30898r = new z0(this) { // from class: zv.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaUserSettingsActivity f207157b;

            {
                this.f207157b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                String str;
                int i16 = i15;
                OrcaUserSettingsActivity orcaUserSettingsActivity = this.f207157b;
                m mVar = (m) obj;
                switch (i16) {
                    case 0:
                        int i17 = OrcaUserSettingsActivity.f30895t;
                        mVar.getClass();
                        if (mVar.f73769b == p.SUCCESS && (str = (String) mVar.f73770c) != null) {
                            a aVar = new a(str);
                            uv.i sensorSettings = orcaUserSettingsActivity.f178102a.getSensorSettings();
                            if (sensorSettings != null) {
                                sensorSettings.f172898a = aVar;
                            }
                            UserSettingsDTO userSettingsDTOG = orcaUserSettingsActivity.f178102a.g();
                            if (userSettingsDTOG != null) {
                                double dE2 = userSettingsDTOG.E2();
                                l3.f23124b.getClass();
                                float fP1 = (float) l3.a.P1(dE2);
                                q00 q00Var = aVar.f207134a;
                                if (!s.b(fP1, q00Var != null ? q00Var.h(0) : null)) {
                                    orcaUserSettingsActivity.f30896p = true;
                                    uv.i sensorSettings2 = orcaUserSettingsActivity.f178102a.getSensorSettings();
                                    a aVar2 = (a) (sensorSettings2 != null ? sensorSettings2.f172898a : null);
                                    if (aVar2 != null) {
                                        q00 q00Var2 = aVar2.f207134a;
                                        if (q00Var2 != null) {
                                            q00Var2.n(0, Float.valueOf(fP1));
                                        }
                                        aVar2.f207136c = true;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        int i18 = OrcaUserSettingsActivity.f30895t;
                        mVar.getClass();
                        if (orcaUserSettingsActivity.f30896p) {
                            orcaUserSettingsActivity.hideProgressOverlay();
                            orcaUserSettingsActivity.finish();
                        }
                        break;
                }
            }
        };
    }

    @Override // vg1.f0
    public final void da() {
        ca(new vv.m(this, R.string.personal_info_title_help, null, null, 12, null), 4);
        ca(new e6(this), 1);
    }

    @Override // vg1.f0
    public final k0 fa() {
        File filesDir = getFilesDir();
        filesDir.getClass();
        return new k0(this, this, 20, x.k(new s0(this, new h.a(25, "settings.fit", filesDir), this.f30897q, this.f30898r, null, null, 48, null), new e1()));
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.devices_settings_user_settings);
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
    public final o13.p<String, String> oa(e eVar) {
        eVar.getClass();
        return new o13.p<>(getString(R.string.lbl_device_connection_lost), getString(R.string.speed_sensor2_pairing_instructions));
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof e6) {
            this.f30896p = false;
            obj.getClass();
            double dDoubleValue = ((Double) obj).doubleValue();
            i sensorSettings = this.f178102a.getSensorSettings();
            zv.a aVar = (zv.a) (sensorSettings != null ? sensorSettings.f172898a : null);
            if (aVar != null) {
                float f14 = (float) dDoubleValue;
                q00 q00Var = aVar.f207134a;
                if (q00Var != null) {
                    q00Var.n(0, Float.valueOf(f14));
                }
                aVar.f207136c = true;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/OrcaUserSettingsActivity$a;", "", "<init>", "()V", "", "DEVICE_SETTINGS_XML_FILE_INDEX", "I", "", "DEVICE_SETTINGS_FILE_NAME", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
