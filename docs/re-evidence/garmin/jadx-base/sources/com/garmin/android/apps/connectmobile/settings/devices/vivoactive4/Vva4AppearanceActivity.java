package com.garmin.android.apps.connectmobile.settings.devices.vivoactive4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.e;
import ch1.a1;
import ch1.i6;
import ch1.z5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;
import da2.d;
import i3.e5;
import java.util.Observable;
import la2.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/Vva4AppearanceActivity;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vva4AppearanceActivity extends f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f43184j = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43185a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.f203764l2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.f203728g2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.f203717e2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.f203722f2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u0.f203792p2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u0.f203798q2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u0.f203804r2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u0.f203809s2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u0.f203815t2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u0.f203820u2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u0.f203826v2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u0.f203832w2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f43185a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/vivoactive4/Vva4AppearanceActivity$c", "Lla2/a;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements la2.a {
        public c() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            Vva4AppearanceActivity vva4AppearanceActivity = Vva4AppearanceActivity.this;
            e.a aVar = new e.a(vva4AppearanceActivity);
            aVar.setTitle(R.string.connect_iq_device_has_disconnected_title);
            aVar.setMessage(R.string.connect_iq_device_has_disconnected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, new ai1.a(vva4AppearanceActivity, 0));
            e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
    }

    static {
        new a(null);
    }

    @Override // vg1.f0
    public final void da() {
        ca(new z5(this), 0);
        ca(new i6(this, u0.c(this.f178102a.i()) ? R.string.ciq_glances_title : R.string.connect_iq_widgets), 0);
        ca(new a1(this), 2);
        ca(new ch1.f0(this), 0);
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.appearance_title);
        string.getClass();
        return string;
    }

    public final boolean na() {
        boolean zA = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(this.f178102a.getDeviceUnitId());
        if (!zA) {
            e.a aVar = new e.a(this);
            aVar.setTitle(R.string.connect_iq_device_not_connected_title);
            aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
        return zA;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        a2 a2Var = a2.SETTINGS;
        StringBuilder sbJ = e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data=");
        sbJ.append(intent);
        String string = sbJ.toString();
        i2.f36769a.getClass();
        i2.a.n(a2Var, "Vva4AppearanceActivity", string);
        if (i15 == -1 && i14 == 100) {
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras != null) {
                ma((DeviceSettingsDTO) extras.get("GCM_deviceSettings"));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f43183i) {
            d.b().f58886a.i(this.f43184j);
            this.f43183i = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f43183i) {
            return;
        }
        d.b().f58886a.b(this.f43184j);
        this.f43183i = true;
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTOE;
        observable.getClass();
        if (obj != null) {
            if (observable instanceof z5) {
                if (na()) {
                    ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).E(this, this.f178102a.getDeviceUnitId());
                    return;
                }
                return;
            }
            if (observable instanceof i6) {
                if (na()) {
                    ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).P(this, this.f178102a.getDeviceUnitId());
                }
            } else {
                if (!(observable instanceof ch1.f0) || (deviceSettingsDTOE = this.f178102a.e()) == null) {
                    return;
                }
                String strI = this.f178102a.i();
                strI.getClass();
                u0 u0VarB = u0.b(strI);
                int i14 = 2131231517;
                switch (u0VarB == null ? -1 : b.f43185a[u0VarB.ordinal()]) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    default:
                        i14 = 2131231519;
                        break;
                }
                ControlsMenuActivity.ia(this, deviceSettingsDTOE, null, i14, 100, deviceSettingsDTOE.f33860a, false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/Vva4AppearanceActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
