package vg1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f0 extends com.garmin.android.apps.connectmobile.c implements i0, yr1.f, Observer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f178101h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f178102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f178103b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f178104c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f178105d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f178106e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f178107f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f178108g = new ArrayList();

    @Override // yr1.f
    public final void K7(long j8) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        if (j8 < 0 || !bVar.a(j8)) {
            return;
        }
        bVar.n(this, j8, "DynamicSettingsActivity2");
    }

    @Override // vg1.i0
    public final void L2() {
        Toast.makeText(this, R.string.msg_settings_saved_successfully, 0).show();
        finish();
    }

    public final void ca(fb2.e eVar, int i14) {
        if (eVar != null) {
            this.f178103b.add(eVar);
            if (i14 == 0) {
                this.f178104c.add(eVar);
                return;
            }
            if (i14 == 1) {
                this.f178105d.add(eVar);
                return;
            }
            if (i14 == 2) {
                this.f178108g.add(eVar);
                return;
            }
            if (i14 == 3) {
                this.f178106e.add(eVar);
                return;
            }
            if (i14 == 4) {
                this.f178107f.add(eVar);
                return;
            }
            i2.f(a2.SETTINGS, "DynamicSettingsActivity2", "Field type not recognized" + i14);
        }
    }

    public abstract void da();

    public int ea() {
        return 32;
    }

    public abstract k0 fa();

    public abstract String ga();

    public final Bundle ha() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_deviceSettings", this.f178102a.e());
        bundle.putLong("GCM_deviceUnitID", this.f178102a.getDeviceUnitId());
        bundle.putString("GCM_deviceProductNbr", this.f178102a.i());
        return bundle;
    }

    public final void ia(Object obj, ArrayList arrayList) {
        if (obj == null || arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fb2.e eVar = (fb2.e) it.next();
            i2.k(a2.SETTINGS, "DynamicSettingsActivity2", "Initializing: " + eVar.toString());
            eVar.m(eVar.g(this, obj));
            eVar.addObserver(this);
            eVar.l(true);
        }
    }

    public void ja() {
        ia(new Object(), this.f178108g);
        ia(this.f178102a.e(), this.f178104c);
        ia(this.f178102a.g(), this.f178105d);
        ia(this.f178102a.n(), this.f178106e);
        ia(this.f178102a.getSensorSettings(), this.f178107f);
    }

    public void ka() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        if (linearLayout == null) {
            i2.f(a2.SETTINGS, "DynamicSettingsActivity2", "Could not find page content container");
            return;
        }
        linearLayout.addView(fb2.g.a(this));
        ArrayList arrayList = this.f178103b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linearLayout.addView(((fb2.e) it.next()).a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    public void la() {
    }

    public final void ma(DeviceSettingsDTO deviceSettingsDTO) {
        this.f178102a.j(deviceSettingsDTO);
    }

    @Override // vg1.i0
    public final void o2(int i14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        uv.i sensorSettings;
        ArrayList arrayList4;
        if (i14 == 0) {
            DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
            if (deviceSettingsDTOE == null || (arrayList = this.f178104c) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fb2.e) it.next()).k(deviceSettingsDTOE);
            }
            return;
        }
        if (i14 == 1) {
            UserSettingsDTO userSettingsDTOG = this.f178102a.g();
            if (userSettingsDTOG == null || (arrayList2 = this.f178105d) == null) {
                return;
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((fb2.e) it3.next()).k(userSettingsDTOG);
            }
            return;
        }
        if (i14 != 3) {
            if (i14 != 4 || (sensorSettings = this.f178102a.getSensorSettings()) == null || (arrayList4 = this.f178107f) == null) {
                return;
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((fb2.e) it4.next()).k(sensorSettings);
            }
            return;
        }
        com.garmin.android.apps.connectmobile.devices.model.f fVarN = this.f178102a.n();
        if (fVarN == null || (arrayList3 = this.f178106e) == null) {
            return;
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((fb2.e) it5.next()).k(fVarN);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Bundle bundleC;
        if (this.f178102a.m() && (bundleC = this.f178102a.c()) != null) {
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.putExtras(bundleC);
            setResult(-1, intent);
        }
        if (this.f178102a.d()) {
            super.onBackPressed();
        } else {
            if (this.f178102a.f()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, ga());
        k0 k0VarFa = fa();
        this.f178102a = k0VarFa;
        k0VarFa.f178128j = ea();
        this.f178102a.b(getIntent().getExtras());
        if (this.f178102a.hasModel()) {
            da();
            ja();
            ka();
            la();
        } else {
            this.f178102a.k(new tr2.b(this, 27));
        }
        int iH = this.f178102a.h();
        dc0.a.f59105c.getClass();
        if (dc0.a.C1256a.a(iH, 4) && z10.d1.f()) {
            z10.d1.o(this, new sa2.b(this, 19));
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f178103b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fb2.e) it.next()).n();
            }
        }
        arrayList.clear();
        this.f178104c.clear();
        this.f178105d.clear();
        this.f178108g.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f178102a.onStop();
    }

    @Override // vg1.i0
    public final void q2(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        g1.b(this, cVar);
        hideProgressOverlay();
        finish();
    }

    public void update(Observable observable, Object obj) {
    }
}
