package com.garmin.android.apps.connectmobile.settings.devices.edge530830;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import ch1.a6;
import ch1.b6;
import ch1.g3;
import ch1.h6;
import ch1.k2;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault;
import fb2.e;
import fb2.g;
import fb2.r;
import java.util.ArrayList;
import java.util.Observable;
import l80.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/edge530830/Edge530830GeneralSettingActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceGeneralSettingActivityDefault;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Edge530830GeneralSettingActivity extends DeviceGeneralSettingActivityDefault {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b6 f42946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a6 f42947p;

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        v vVar = new v(this, this.f125976b);
        vVar.f27482k = false;
        boolean booleanExtra = getIntent().getBooleanExtra("MilitaryTimeFormatSupported", false);
        this.f42946o = new b6(this, this.f125976b);
        this.f42947p = new a6(this, this.f125976b);
        arrayList.add(new h6(this, this.f125976b));
        b6 b6Var = this.f42946o;
        if (b6Var == null) {
            s.m("weatherConditions");
            throw null;
        }
        arrayList.add(b6Var);
        a6 a6Var = this.f42947p;
        if (a6Var == null) {
            s.m("weatherAlerts");
            throw null;
        }
        arrayList.add(a6Var);
        arrayList.add(vVar);
        arrayList.add(new g3(this));
        arrayList.add(new q2(this));
        arrayList.add(new s4(this, booleanExtra));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault, ng1.k0
    public final void ha() {
        if (this.f125985k != null) {
            View viewFindViewById = findViewById(R.id.page_content);
            viewFindViewById.getClass();
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            ArrayList<e> arrayList = this.f125956m;
            for (e eVar : arrayList) {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                deviceSettingsDTO.getClass();
                if (eVar.h(deviceSettingsDTO) && !(eVar instanceof r) && !(eVar instanceof q2) && !(eVar instanceof b6)) {
                    linearLayout.addView(g.a(this));
                }
                linearLayout.addView(eVar.a());
                if (eVar instanceof v) {
                    linearLayout.addView(g.c(this, getString(R.string.description_auto_upload_on_off)));
                }
                if (eVar instanceof b6) {
                    linearLayout.addView(g.c(this, getString(R.string.weather_setting_description)));
                }
            }
            linearLayout.addView(g.a(this));
            for (e eVar2 : arrayList) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                deviceSettingsDTO2.getClass();
                boolean zG = eVar2.g(this, deviceSettingsDTO2);
                eVar2.addObserver(this);
                eVar2.m(zG);
                if (eVar2 instanceof v) {
                    ((v) eVar2).l(true);
                } else if (eVar2 instanceof a6) {
                    a6 a6Var = this.f42947p;
                    if (a6Var == null) {
                        s.m("weatherAlerts");
                        throw null;
                    }
                    b6 b6Var = this.f42946o;
                    if (b6Var == null) {
                        s.m("weatherConditions");
                        throw null;
                    }
                    a6Var.l(b6Var.q(null));
                } else {
                    continue;
                }
            }
        }
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        a2 a2Var = a2.SETTINGS;
        String strJ = hb.a.j("update: observable=", observable, ", data=", obj);
        i2.f36769a.getClass();
        i2.a.n(a2Var, "Edge530830GeneralSettingActivity", strJ);
        if (obj != null) {
            d0 d0Var = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);
            if (observable instanceof h6) {
                d0Var.o(this, this.f125976b, this.f125978d, this.f125981g, this.f125983i);
                return;
            }
            if (!(observable instanceof q2)) {
                if ((observable instanceof b6) && (obj instanceof Boolean)) {
                    a6 a6Var = this.f42947p;
                    if (a6Var != null) {
                        a6Var.l(((Boolean) obj).booleanValue());
                        return;
                    } else {
                        s.m("weatherAlerts");
                        throw null;
                    }
                }
                return;
            }
            if (((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).a(this.f125976b)) {
                d0Var.O(this, this.f125976b);
                return;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
            aVar.setTitle(R.string.connect_iq_device_not_connected_title);
            aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            androidx.appcompat.app.e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/edge530830/Edge530830GeneralSettingActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
