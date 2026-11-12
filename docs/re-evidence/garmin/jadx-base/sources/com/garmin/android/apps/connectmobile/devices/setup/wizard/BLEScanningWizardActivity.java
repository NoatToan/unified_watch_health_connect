package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import a61.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import bd0.m;
import c22.e1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import dd0.j;
import dv.k;
import g.h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import p13.l0;
import vg1.t;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class BLEScanningWizardActivity extends dd0.a implements f.a, b.a, e.a, k, lv.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f34476l = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f34478d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bd0.a f34481g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.app.e f34483i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j22.e f34485k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f34477c = registerForActivityResult(new h(), new i(this, 13));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f34479e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList<bd0.a> f34480f = new LinkedList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lv.a f34482h = new lv.a(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f34484j = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            BLEScanningWizardActivity bLEScanningWizardActivity = BLEScanningWizardActivity.this;
            bLEScanningWizardActivity.getClass();
            if (10 == intExtra) {
                com.garmin.android.apps.connectmobile.navigation.b.a(ty0.b.f166858b2, bLEScanningWizardActivity, null);
                bLEScanningWizardActivity.finish();
            }
        }
    }

    public BLEScanningWizardActivity() {
        final int i14 = 0;
        e23.a aVar = new e23.a(this) { // from class: dd0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BLEScanningWizardActivity f59163b;

            {
                this.f59163b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                BLEScanningWizardActivity bLEScanningWizardActivity = this.f59163b;
                switch (i15) {
                    case 0:
                        int i16 = BLEScanningWizardActivity.f34476l;
                        return bLEScanningWizardActivity;
                    default:
                        int i17 = BLEScanningWizardActivity.f34476l;
                        bLEScanningWizardActivity.finish();
                        return null;
                }
            }
        };
        d4.h hVar = new d4.h(25);
        final int i15 = 1;
        e23.a aVar2 = new e23.a(this) { // from class: dd0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BLEScanningWizardActivity f59163b;

            {
                this.f59163b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                BLEScanningWizardActivity bLEScanningWizardActivity = this.f59163b;
                switch (i16) {
                    case 0:
                        int i17 = BLEScanningWizardActivity.f34476l;
                        return bLEScanningWizardActivity;
                    default:
                        int i18 = BLEScanningWizardActivity.f34476l;
                        bLEScanningWizardActivity.finish();
                        return null;
                }
            }
        };
        j22.e.f96744g.getClass();
        this.f34485k = j22.e.a.a("BLEScanningWizardActivity", aVar, hVar, aVar2);
    }

    public static void ga(BLEScanningWizardActivity bLEScanningWizardActivity, boolean z14, boolean z15) {
        if (z15) {
            bLEScanningWizardActivity.f59153b.o(true);
            if (z14) {
                super.onBackPressed();
            } else {
                super.onNavigateUp();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.e.a
    public final void V0() {
        ma();
    }

    @Override // lv.b
    public final void W1(long j8, long j14) {
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.f.a
    public final void X6() {
        oa();
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.b.a
    public final void Y5() {
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", "User rejected ".concat(this.f34481g.toString()));
        if (this.f34482h.f115024e) {
            na();
        }
        this.f34479e.add(this.f34481g.f17520a);
        this.f34480f.removeFirst();
        this.f34481g = null;
        ia();
    }

    @Override // lv.b
    public final void Z3(dk2.d dVar) {
        String str = dVar.f60238b;
        if (TextUtils.isEmpty(str) || this.f34479e.contains(str)) {
            return;
        }
        bd0.a aVar = new bd0.a(dVar);
        if (this.f34482h.f115024e) {
            LinkedList<bd0.a> linkedList = this.f34480f;
            if (!linkedList.contains(aVar)) {
                linkedList.add(aVar);
                i2.a(a2.DEVICES, "BLEScanningWizardActivity", "Added [" + aVar.f17522c + ", " + aVar.f17520a + ", " + aVar.f17521b + ", " + aVar.f17524e.name() + "] to queue. Size now [" + linkedList.size() + "].");
            }
            if (this.f34481g == null) {
                ia();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.b.a
    public final void a2() {
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", "User confirmed ".concat(this.f34481g.toString()));
        pa();
        lu2.a aVar = lu2.a.f115014a;
        String str = this.f34481g.f17520a;
        dd0.g gVar = new dd0.g(this);
        m80.a.C2223a c2223a = m80.a.f117132a;
        String str2 = this.f34481g.f17523d;
        c2223a.getClass();
        boolean zA = m80.a.C2223a.a(str2);
        aVar.getClass();
        if (lu2.a.b(this, str, gVar, zA)) {
            return;
        }
        ja();
    }

    @Override // dd0.a
    public final void ca(u0 u0Var) {
        super.ca(u0Var);
        this.f34478d = u0Var;
    }

    public final void ha() {
        boolean zA = ((mv0.e) KoinJavaComponent.get(mv0.e.class)).a("BLEScanningWizardActivity");
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96718g;
        j22.a aVar2 = j22.a.f96719h;
        bVar.getClass();
        if (j22.b.k(aVar, aVar2)) {
            if (zA) {
                return;
            }
            m.a(this);
        } else {
            if (!j22.b.C(this, aVar2)) {
                j22.b.u(this, 3, j22.g.f96765j);
                return;
            }
            androidx.appcompat.app.e eVar = this.f34483i;
            if (eVar == null || !eVar.isShowing()) {
                this.f34483i = m.c(this);
            }
        }
    }

    public final void ia() {
        if (this.f34481g == null) {
            LinkedList<bd0.a> linkedList = this.f34480f;
            if (linkedList.isEmpty()) {
                return;
            }
            i2.a(a2.DEVICES, "BLEScanningWizardActivity", ".confirmNextDevice()");
            this.f34481g = linkedList.peek();
            la();
        }
    }

    public final void ja() {
        pa();
        this.f34480f.clear();
        this.f34479e.clear();
        bd0.a aVar = this.f34481g;
        l lVar = this.f59152a;
        Intent intent = new Intent(this, (Class<?>) BLEDeviceSetupWizardActivity.class);
        intent.putExtra("GCM_deviceDTO", lVar);
        intent.putExtra("GCM_bleDevice", aVar);
        startActivityForResult(intent, 1);
    }

    public final void ka(Fragment fragment) {
        if (isFinishing()) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.device_setup_wizard_fragment, fragment, null);
        aVar.e();
    }

    public final void la() {
        b bVar;
        u0 u0Var;
        bd0.g gVar = this.f34481g.f17524e;
        if (gVar != bd0.g.DEVICE_FOUND) {
            if (gVar == bd0.g.SCAN_FINISHED) {
                String string = getString(R.string.msg_device_not_found, this.f59152a.getF143516f());
                String strS = this.f59153b.s();
                boolean z14 = this.f59153b.A() != -1;
                cd0.g gVar2 = this.f59153b;
                ka(z14 ? e.v6(gVar2.A(), string, strS) : e.u6(gVar2.B(), string, strS));
                return;
            }
            return;
        }
        String str = this.f34478d.f203854a.split(",")[0];
        Map<u0, t> map = n0.f203577a;
        if (!TextUtils.isEmpty(str) && (u0Var = (u0) u0.f203782n6.get(str)) != null && n0.a.f203583a[u0Var.ordinal()] == 30) {
            a2();
            return;
        }
        cd0.g gVar3 = this.f59153b;
        String string2 = gVar3.f26813a.getString(R.string.msg_device_setup_pair_code, gVar3.f26814b.getF143516f());
        bd0.a aVar = this.f34481g;
        String str2 = aVar != null ? aVar.f17521b : null;
        cd0.g gVar4 = this.f59153b;
        if (gVar4.t() == -1 || gVar4.u() == -1) {
            this.f59153b.getClass();
            bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putInt("MATCH_DEVICE_IMAGE_RES_ID", 2131231969);
            bundle.putString("INFO_MESSAGE", string2);
            bundle.putString("PASS_KEY_MESSAGE", str2);
            bVar.setArguments(bundle);
        } else {
            int iT = this.f59153b.t();
            int iU = this.f59153b.u();
            bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("MATCH_DEVICE_LAYOUT_RES_ID", iT);
            bundle2.putInt("MATCH_DEVICE_LAYOUT_TEXT_VIEW_ID", iU);
            bundle2.putString("INFO_MESSAGE", string2);
            bundle2.putString("PASS_KEY_MESSAGE", str2);
            bVar.setArguments(bundle2);
        }
        ka(bVar);
    }

    public final void ma() {
        f fVar;
        String strD = this.f59153b.D();
        int iC = this.f59153b.C();
        cd0.g gVar = this.f59153b;
        if (iC != -1) {
            int iC2 = gVar.C();
            fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putInt("HOW_TO_PAIR_LAYOUT_RES_ID", iC2);
            bundle.putString("INFO_MESSAGE", strD);
            fVar.setArguments(bundle);
        } else {
            gVar.getClass();
            fVar = new f();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("HOW_TO_PAIR_IMAGE_RES_ID", 2131231969);
            bundle2.putString("INFO_MESSAGE", strD);
            fVar.setArguments(bundle2);
        }
        ka(fVar);
    }

    public final void na() {
        int iV = this.f59153b.v();
        cd0.g gVar = this.f59153b;
        String string = gVar.f26813a.getString(R.string.msg_device_setup_searching, gVar.f26814b.getF143516f());
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("LOADING_IMAGE_RES_ID", iV);
        bundle.putString("LOADING_MESSAGE", string);
        jVar.setArguments(bundle);
        ka(jVar);
    }

    public final void oa() {
        Set<String> setG1;
        String str;
        if (!e1.a()) {
            this.f34477c.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
            return;
        }
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", ".startScanning()");
        this.f34480f.clear();
        this.f34479e.clear();
        this.f34481g = null;
        Context applicationContext = getApplicationContext();
        u0 u0Var = this.f34478d;
        if (u0Var == null || (str = u0Var.f203854a) == null || (setG1 = h0.g1(w.W(str, new String[]{","}))) == null) {
            setG1 = l0.f134950a;
        }
        this.f34482h.c(applicationContext, setG1);
        na();
        runOnUiThread(new cd0.h0(this, 27));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (1 != i14) {
            if (4 == i14) {
                ja();
            }
        } else {
            if (i15 == -1 || i15 == 0) {
                setResult(-1);
            } else {
                i2.f(a2.DEVICES, "BLEScanningWizardActivity", am.j.g(i15, i14, "Fix me developer! I don't know how to handle resultCode [", "] for requestCode [", "]."));
            }
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        new com.garmin.android.apps.connectmobile.devices.setup.a(this, new com.google.android.exoplayer2.trackselection.b(this, true, 2));
    }

    @Override // dd0.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GarminDeviceWakefulService.g("BLEScanningWizardActivity", true);
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", ".onCreate(): setIsUserInPairingFlow(true)");
    }

    @Override // dd0.a, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GarminDeviceWakefulService.g("BLEScanningWizardActivity", false);
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", ".onDestroy(): setIsUserInPairingFlow(false)");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        new com.garmin.android.apps.connectmobile.devices.setup.a(this, new com.google.android.exoplayer2.trackselection.b(this, false, 2));
        return true;
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        if (i14 != 3) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            i2.a(a2.DEVICES, "BLEScanningWizardActivity", "onRequestPermissionsResult:user granted permission to use location");
            return;
        }
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEScanningWizardActivity", "onRequestPermissionsResult:user denied permission to use location");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BLEScanningWizardActivity", "onRequestPermissionsResult:user denied permission to use location");
        androidx.appcompat.app.e eVar = this.f34483i;
        if (eVar != null && eVar.isShowing()) {
            this.f34483i.dismiss();
        }
        this.f34483i = m.b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        getWindow().addFlags(128);
        ha();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.f34484j, intentFilter);
        if (this.f34481g == null) {
            ma();
        } else {
            la();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.f34485k.a();
        } else {
            ha();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        pa();
        unregisterReceiver(this.f34484j);
        androidx.appcompat.app.e eVar = this.f34483i;
        if (eVar != null && eVar.isShowing()) {
            this.f34483i.dismiss();
        }
        getWindow().clearFlags(128);
    }

    public final void pa() {
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", ".stopScanning()");
        lv.a aVar = this.f34482h;
        aVar.f115024e = false;
        aVar.f115025f.removeCallbacks(aVar.f115026g);
        aVar.d();
    }

    @Override // lv.b
    public final void s4(dk2.f fVar) {
        if (fVar == null) {
            pa();
            bd0.a aVar = new bd0.a(null, null, null, -1, bd0.g.SCAN_FINISHED);
            LinkedList<bd0.a> linkedList = this.f34480f;
            if (linkedList.contains(aVar)) {
                return;
            }
            linkedList.add(aVar);
            i2.a(a2.DEVICES, "BLEScanningWizardActivity", "Added scan finish device to queue. Size now [" + linkedList.size() + "].");
            if (this.f34481g == null) {
                ia();
            }
        }
    }
}
