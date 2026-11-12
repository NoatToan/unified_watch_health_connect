package com.garmin.android.apps.connectmobile.devices.setup;

import a61.i;
import am.j;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import bd0.g;
import bd0.m;
import c22.e1;
import cd0.t0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import dv.k;
import g.h;
import java.util.LinkedList;
import java.util.Set;
import o53.m1;
import oe2.f;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import p13.l0;
import zb0.t;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class BLEScanningActivity extends com.garmin.android.apps.connectmobile.c implements k, lv.b {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f34413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f34416f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cd0.c f34418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f34419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34421k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProgressDialog f34423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f34424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bd0.a f34425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f34426p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u0 f34430v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j22.e f34434z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f34411a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<Intent> f34412b = registerForActivityResult(new h(), new i(this, 4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a32.b f34417g = new a32.b(this, 13);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedList<bd0.a> f34422l = new LinkedList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f34427q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f34428r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lv.a f34429t = new lv.a(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f34431w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a0.c f34432x = new a0.c(this, 21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f34433y = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (10 == intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)) {
                int i14 = BLEScanningActivity.A;
                BLEScanningActivity bLEScanningActivity = BLEScanningActivity.this;
                bLEScanningActivity.getClass();
                com.garmin.android.apps.connectmobile.navigation.b.a(ty0.b.f166858b2, bLEScanningActivity, null);
                bLEScanningActivity.finish();
            }
        }
    }

    public BLEScanningActivity() {
        final int i14 = 0;
        e23.a aVar = new e23.a(this) { // from class: bd0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BLEScanningActivity f17578b;

            {
                this.f17578b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                BLEScanningActivity bLEScanningActivity = this.f17578b;
                switch (i15) {
                    case 0:
                        int i16 = BLEScanningActivity.A;
                        return bLEScanningActivity;
                    default:
                        int i17 = BLEScanningActivity.A;
                        bLEScanningActivity.finish();
                        return null;
                }
            }
        };
        b4.b bVar = new b4.b(11);
        final int i15 = 1;
        e23.a aVar2 = new e23.a(this) { // from class: bd0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BLEScanningActivity f17578b;

            {
                this.f17578b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                BLEScanningActivity bLEScanningActivity = this.f17578b;
                switch (i16) {
                    case 0:
                        int i17 = BLEScanningActivity.A;
                        return bLEScanningActivity;
                    default:
                        int i18 = BLEScanningActivity.A;
                        bLEScanningActivity.finish();
                        return null;
                }
            }
        };
        j22.e.f96744g.getClass();
        this.f34434z = j22.e.a.a("BLEScanningActivity", aVar, bVar, aVar2);
    }

    @Override // lv.b
    public final void W1(long j8, long j14) {
        ProgressDialog progressDialog = this.f34423m;
        if (progressDialog != null) {
            progressDialog.setMessage(((Object) this.f34424n) + StringUtils.SPACE + (((int) j14) / 1000));
        }
        boolean z14 = this.f34420j;
        LinkedList<bd0.a> linkedList = this.f34422l;
        if (z14) {
            if (j8 / 1000 > 15) {
                if (linkedList.size() == 1) {
                    ha();
                    ea(linkedList.get(0));
                    return;
                } else {
                    if (linkedList.size() > 1) {
                        ha();
                        e eVarCreate = new e.a(this).setTitle(getText(R.string.lbl_multiple_devices_found)).setMessage(getText(R.string.pairing_truswing_multiple_found_message)).setCancelable(false).setPositiveButton(R.string.pairing_search_again_1, new bd0.h(this, 2)).setNegativeButton(R.string.lbl_cancel, new ag0.e(13)).create();
                        eVarCreate.show();
                        f.e(eVarCreate, 1.3f);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (!this.f34421k || j8 / 1000 <= 1) {
            return;
        }
        if (linkedList.size() == 1) {
            ha();
            ea(linkedList.get(0));
        } else if (linkedList.size() > 1) {
            ha();
            e eVarCreate2 = new e.a(this).setTitle(getText(R.string.lbl_multiple_devices_found)).setMessage(getText(R.string.pairing_index_smart_scale_multiple_found_message_a)).setCancelable(false).setPositiveButton(R.string.pairing_search_again_1, new bd0.h(this, 4)).setNegativeButton(R.string.lbl_cancel, new ag0.e(11)).create();
            eVarCreate2.show();
            f.e(eVarCreate2, 1.3f);
        }
    }

    @Override // lv.b
    public final void Z3(dk2.d dVar) {
        String str = dVar.f60238b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bd0.a aVar = new bd0.a(dVar);
        LinkedList<bd0.a> linkedList = this.f34422l;
        if (!linkedList.contains(aVar)) {
            linkedList.add(aVar);
            a2 a2Var = a2.DEVICES;
            StringBuilder sb3 = new StringBuilder("Added [");
            sn.a.t(sb3, aVar.f17522c, ", ", str, ", ");
            sb3.append(aVar.f17521b);
            sb3.append(", ");
            sb3.append(aVar.f17524e.name());
            sb3.append("] to queue. Size now [");
            sb3.append(linkedList.size());
            sb3.append("].");
            i2.a(a2Var, "BLEScanningActivity", sb3.toString());
        }
        if (!this.f34420j && !this.f34421k) {
            if (this.f34425o == null) {
                ca();
                return;
            }
            return;
        }
        i2.a(a2.DEVICES, "BLEScanningActivity", "mIsProductNbrTruSwing [" + this.f34420j + ", mIsProductNbrIndexSmartScale " + this.f34421k + "] to queue.");
    }

    public final void ca() {
        if (this.f34425o == null) {
            LinkedList<bd0.a> linkedList = this.f34422l;
            if (linkedList.isEmpty()) {
                return;
            }
            a2 a2Var = a2.DEVICES;
            i2.a(a2Var, "BLEScanningActivity", ".confirmNextDevice()");
            bd0.a aVarPeek = linkedList.peek();
            this.f34425o = aVarPeek;
            if (aVarPeek == null) {
                return;
            }
            g gVar = aVarPeek.f17524e;
            if (gVar != g.DEVICE_FOUND) {
                if (gVar == g.SCAN_FINISHED) {
                    fa();
                    return;
                }
                return;
            }
            ha();
            this.f34431w.postDelayed(this.f34432x, 5000L);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BLEScanningActivity", "Companion device -> Link triggered");
            lu2.a aVar = lu2.a.f115014a;
            String str = this.f34425o.f17520a;
            bd0.k kVar = new bd0.k(this);
            m80.a.C2223a c2223a = m80.a.f117132a;
            String str2 = this.f34425o.f17523d;
            c2223a.getClass();
            boolean zA = m80.a.C2223a.a(str2);
            aVar.getClass();
            if (lu2.a.b(this, str, kVar, zA)) {
                return;
            }
            da("Companion device -> failed to show device link dialog");
        }
    }

    public final void da(CharSequence charSequence) {
        i2.f(a2.DEVICES, "BLEScanningActivity", "Companion device -> failed to associate companion device: " + ((Object) charSequence));
        this.f34431w.removeCallbacksAndMessages(null);
        ha();
        this.f34422l.clear();
        ea(this.f34425o);
    }

    public final void ea(bd0.a aVar) {
        Intent intent = new Intent(this, (Class<?>) BLEDeviceSetupActivity.class);
        intent.putExtra("extra_device_dto", this.f34411a);
        intent.putExtra("extra_ble_device", aVar);
        intent.putExtra("extra_setup_strategy_classname", this.f34418h.getClass().getName());
        startActivityForResult(intent, 1);
    }

    public final void fa() {
        e eVarCreate = new e.a(this).setTitle("").setMessage(R.string.pairing_device_not_found).setCancelable(false).setPositiveButton(R.string.pairing_search_again_1, new bd0.h(this, 1)).setNegativeButton(R.string.lbl_cancel, new ag0.e(12)).create();
        eVarCreate.show();
        f.e(eVarCreate, 1.3f);
    }

    public final void ga() {
        Set<String> setG1;
        String str;
        if (!e1.a()) {
            this.f34412b.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
            return;
        }
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEScanningActivity", ".startScanning()");
        this.f34422l.clear();
        this.f34425o = null;
        Context applicationContext = getApplicationContext();
        u0 u0Var = this.f34430v;
        if (u0Var == null || (str = u0Var.f203854a) == null || (setG1 = h0.g1(w.W(str, new String[]{","}))) == null) {
            setG1 = l0.f134950a;
        }
        this.f34429t.c(applicationContext, setG1);
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var, "BLEScanningActivity", ".showScanningUI()");
        if (this.f34423m == null) {
            aVar.getClass();
            i2.a.b(a2Var, "BLEScanningActivity", ".showScanningUI() >> mProgressDialogScanning is null, creating the object... ");
            ProgressDialog progressDialog = new ProgressDialog(this, R.style.Theme_Gcm_Dialog);
            this.f34423m = progressDialog;
            progressDialog.setProgressStyle(0);
            this.f34423m.setIndeterminate(true);
            this.f34423m.setTitle(getText(R.string.pairing_searching_title));
            this.f34423m.setCancelable(false);
            this.f34423m.setCanceledOnTouchOutside(false);
            this.f34423m.setButton(-2, getText(R.string.lbl_cancel), new bd0.h(this, 0));
            this.f34423m.setOnDismissListener(new af2.b(this, 1));
            cd0.c cVar = this.f34418h;
            boolean z14 = cVar instanceof cd0.u0;
            if (z14 || (cVar instanceof t0)) {
                if (z14) {
                    this.f34423m.setButton(-1, getText(R.string.lbl_help), new bd0.h(this, 3));
                }
                this.f34424n = Html.fromHtml("<p>" + getText(R.string.bullet_point) + getString(R.string.pairing_scanning_instructions_1_generic, this.f34411a.getF143516f()) + "</p><p>" + getText(R.string.bullet_point) + getString(R.string.pairing_scanning_instructions_2_generic, this.f34411a.getF143516f()) + "</p>");
            } else {
                this.f34424n = getString(R.string.pairing_searching_message_a, this.f34411a.getF143516f());
            }
            this.f34423m.setMessage(this.f34424n);
        }
        this.f34423m.show();
    }

    public final void ha() {
        i2.a(a2.DEVICES, "BLEScanningActivity", ".stopScanning()");
        lv.a aVar = this.f34429t;
        aVar.f115024e = false;
        aVar.f115025f.removeCallbacks(aVar.f115026g);
        aVar.d();
        ProgressDialog progressDialog = this.f34423m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (1 == i14) {
            if (i15 == -1 || i15 == 0) {
                setResult(-1);
            } else {
                i2.f(a2.DEVICES, "BLEScanningActivity", j.g(i15, i14, "Fix me developer! I don't know how to handle resultCode [", "] for requestCode [", "]."));
            }
            finish();
            return;
        }
        if (4 == i14) {
            ha();
            this.f34422l.clear();
            ea(this.f34425o);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u0 u0Var;
        int iOrdinal;
        super.onCreate(bundle);
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEScanningActivity", ".onCreate()");
        if (!getIntent().hasExtra("extra_device_dto")) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEScanningActivity", "Aborting... intent is missing the device DTO extra.");
            Toast.makeText(this, R.string.txt_error_occurred, 1).show();
            finish();
        }
        l lVar = (l) getIntent().getParcelableExtra("extra_device_dto");
        this.f34411a = lVar;
        if (lVar == null) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEScanningActivity", "Aborting... mDeviceDTO is null.");
            Toast.makeText(this, R.string.txt_error_occurred, 1).show();
            finish();
        }
        if (TextUtils.isEmpty(this.f34411a.getF143517g())) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEScanningActivity", "Aborting... imDeviceDTO.getPartNumberPartial() is null or empty.");
            Toast.makeText(this, R.string.txt_error_occurred, 1).show();
            finish();
        }
        setContentView(R.layout.gcm_devices_pairing);
        initActionBar(true, !TextUtils.isEmpty(this.f34411a.getF143516f()) ? this.f34411a.getF143516f() : "");
        this.f34413c = (ImageView) findViewById(R.id.device_image);
        this.f34414d = (TextView) findViewById(R.id.ble_instructions_1);
        this.f34415e = (TextView) findViewById(R.id.ble_instructions_2);
        this.f34416f = (Button) findViewById(R.id.button_scan_for_device);
        String partNumberPartial = this.f34411a.getF143517g();
        u0 u0Var2 = u0.f203733h;
        if (TextUtils.isEmpty(partNumberPartial) || (u0Var = (u0) u0.f203782n6.get(partNumberPartial)) == null || (iOrdinal = u0Var.ordinal()) == 30 || iOrdinal == 81 || iOrdinal == 89 || iOrdinal == 287 || iOrdinal == 294 || iOrdinal == 302 || iOrdinal == 303) {
            return;
        }
        switch (iOrdinal) {
            case 298:
            case 299:
            case 300:
                break;
            default:
                TextView textView = (TextView) findViewById(R.id.ble_instructions_3);
                textView.setVisibility(0);
                textView.setText(getString(R.string.device_pin_input_msg, getString(R.string.pairing_lbl_search_for_device)));
                break;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f34421k) {
            getMenuInflater().inflate(R.menu.ble_scanning, menu);
            menu.findItem(R.id.menu_item_help).setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GarminDeviceWakefulService.g("BLEScanningActivity", false);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.da(this, ro0.l.BLE_INDEX_SCALE, null, null);
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
            if (this.f34428r) {
                cd0.c cVar = this.f34418h;
                if ((cVar instanceof cd0.u0) || (cVar instanceof t0)) {
                    ga();
                }
            }
            i2.a(a2.DEVICES, "BLEScanningActivity", "onRequestPermissionsResult:user granted permission to use location");
            return;
        }
        i2.a(a2.DEVICES, "BLEScanningActivity", "onRequestPermissionsResult:user denied permission to use location");
        e eVar = this.f34426p;
        if (eVar != null && eVar.isShowing()) {
            this.f34426p.dismiss();
        }
        this.f34426p = m.b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        i2.a(a2.DEVICES, "BLEScanningActivity", ".onStart(): setIsUserInPairingFlow(true)");
        GarminDeviceWakefulService.g("BLEScanningActivity", true);
        getWindow().addFlags(128);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.f34433y, intentFilter);
        b bVar = new b(this, 0);
        this.f34419i = bVar;
        bVar.c(new Void[0]);
        if (Build.VERSION.SDK_INT >= 31) {
            this.f34434z.a();
            return;
        }
        this.f34428r = ((mv0.e) KoinJavaComponent.get(mv0.e.class)).a("BLEScanningActivity");
        j22.b bVar2 = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96718g};
        bVar2.getClass();
        boolean zK = j22.b.k(aVarArr);
        this.f34427q = zK;
        if (zK) {
            if (this.f34428r) {
                return;
            }
            m.a(this);
        } else {
            if (!j22.b.C(this, j22.a.f96719h)) {
                j22.b.u(this, 3, j22.g.f96765j);
                return;
            }
            e eVar = this.f34426p;
            if (eVar == null || !eVar.isShowing()) {
                this.f34426p = m.c(this);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        i2.a(a2.DEVICES, "BLEScanningActivity", ".onStop()");
        ha();
        unregisterReceiver(this.f34433y);
        b bVar = this.f34419i;
        if (bVar != null) {
            bVar.a();
        }
        getWindow().clearFlags(128);
        e eVar = this.f34426p;
        if (eVar == null || !eVar.isShowing()) {
            return;
        }
        this.f34426p.dismiss();
    }

    @Override // lv.b
    public final void s4(dk2.f fVar) {
        if (fVar == null) {
            ha();
            if (this.f34420j) {
                fa();
                return;
            }
            bd0.a aVar = new bd0.a(null, null, null, -1, g.SCAN_FINISHED);
            LinkedList<bd0.a> linkedList = this.f34422l;
            if (linkedList.contains(aVar)) {
                return;
            }
            linkedList.add(aVar);
            i2.a(a2.DEVICES, "BLEScanningActivity", "Added scan finish device to queue. Size now [" + linkedList.size() + "].");
            if (this.f34425o == null) {
                ca();
            }
        }
    }

    public class b extends g22.c<Void, Boolean> {
        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
        /* JADX WARN: Instruction removed from duplicated block: B:31:0x00e4, please report this as an issue */
        @Override // g22.c
        public final Boolean b(Void[] voidArr) {
            u0 u0Var;
            String message;
            String str;
            Boolean bool = Boolean.FALSE;
            m1 m1Var = this.f75549a;
            boolean zIsActive = m1Var.isActive();
            BLEScanningActivity bLEScanningActivity = BLEScanningActivity.this;
            if (zIsActive) {
                u0Var = (u0) u0.f203782n6.get(bLEScanningActivity.f34411a.getF143517g());
                if (u0Var != null && TextUtils.isEmpty(u0Var.f203854a)) {
                    i2.f(a2.DEVICES, "BLEScanningActivity", "Initializing strategy for device: " + bLEScanningActivity.f34411a.toString() + " -- " + u0.class.getSimpleName() + " does not product numbers!");
                    return bool;
                }
            } else {
                u0Var = null;
            }
            if (m1Var.isActive()) {
                try {
                    bLEScanningActivity.f34420j = u0.n(bLEScanningActivity.f34411a.getF143517g(), u0.E5);
                    bLEScanningActivity.f34421k = u0.n(bLEScanningActivity.f34411a.getF143517g(), u0.H0);
                    if (u0Var == null || (str = u0Var.f203855b) == null) {
                        cd0.c cVar = (cd0.c) cd0.w.class.newInstance();
                        bLEScanningActivity.f34418h = cVar;
                        cVar.F(bLEScanningActivity, bLEScanningActivity.f34411a, null, null);
                        i2.a(a2.DEVICES, "BLEScanningActivity", "Fenix3SetupStrategy initialized for default device.");
                    } else {
                        bLEScanningActivity.f34430v = u0Var;
                        cd0.c cVar2 = (cd0.c) Class.forName(str).newInstance();
                        bLEScanningActivity.f34418h = cVar2;
                        cVar2.F(bLEScanningActivity, bLEScanningActivity.f34411a, null, null);
                        i2.a(a2.DEVICES, "BLEScanningActivity", str.concat(" initialized."));
                    }
                    return Boolean.TRUE;
                } catch (ClassNotFoundException e4) {
                    i2.e(a2.DEVICES, "BLEScanningActivity", e4);
                    message = e4.getMessage();
                    if (message != null) {
                        i2.f(a2.DEVICES, "BLEScanningActivity", "Initializing strategy for device: " + bLEScanningActivity.f34411a.toString() + " -- " + message);
                    }
                    return bool;
                } catch (IllegalAccessException e14) {
                    i2.e(a2.DEVICES, "BLEScanningActivity", e14);
                    message = e14.getMessage();
                    if (message != null) {
                        i2.f(a2.DEVICES, "BLEScanningActivity", "Initializing strategy for device: " + bLEScanningActivity.f34411a.toString() + " -- " + message);
                    }
                    return bool;
                } catch (InstantiationException e15) {
                    i2.e(a2.DEVICES, "BLEScanningActivity", e15);
                    message = e15.getMessage();
                    if (message != null) {
                        i2.f(a2.DEVICES, "BLEScanningActivity", "Initializing strategy for device: " + bLEScanningActivity.f34411a.toString() + " -- " + message);
                    }
                    return bool;
                }
            }
            return bool;
        }

        @Override // g22.c
        public final void d(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zB = true;
            BLEScanningActivity bLEScanningActivity = BLEScanningActivity.this;
            if (!zBooleanValue) {
                Toast.makeText(bLEScanningActivity, R.string.txt_error_occurred, 1).show();
                int i14 = BLEScanningActivity.A;
                bLEScanningActivity.getClass();
                com.garmin.android.apps.connectmobile.navigation.b.a(ty0.b.f166858b2, bLEScanningActivity, null);
                bLEScanningActivity.finish();
                return;
            }
            if (bLEScanningActivity.f34418h.t() != -1) {
                bLEScanningActivity.f34414d.setText(bLEScanningActivity.f34418h.t());
            } else {
                String strU = bLEScanningActivity.f34418h.u();
                TextView textView = bLEScanningActivity.f34414d;
                if (strU != null) {
                    textView.setText(bLEScanningActivity.f34418h.u());
                } else {
                    textView.setText("");
                }
            }
            if (bLEScanningActivity.f34418h.v() != -1) {
                bLEScanningActivity.f34415e.setText(bLEScanningActivity.f34418h.v());
            } else {
                String strW = bLEScanningActivity.f34418h.w();
                TextView textView2 = bLEScanningActivity.f34415e;
                if (strW != null) {
                    textView2.setText(bLEScanningActivity.f34418h.w());
                } else {
                    textView2.setText("");
                }
            }
            bLEScanningActivity.f34416f.setOnClickListener(bLEScanningActivity.f34417g);
            t.b(bLEScanningActivity.f34413c, bLEScanningActivity.f34411a);
            cd0.c cVar = bLEScanningActivity.f34418h;
            if ((cVar instanceof cd0.u0) || (cVar instanceof t0)) {
                if (Build.VERSION.SDK_INT >= 31) {
                    j22.b bVar = j22.b.f96736a;
                    Context baseContext = bLEScanningActivity.getBaseContext();
                    bVar.getClass();
                    zB = j22.b.b(baseContext);
                } else if (!bLEScanningActivity.f34427q || !bLEScanningActivity.f34428r) {
                    zB = false;
                }
                if (zB) {
                    bLEScanningActivity.ga();
                }
            }
        }

        public /* synthetic */ b(BLEScanningActivity bLEScanningActivity, int i14) {
            this();
        }
    }
}
