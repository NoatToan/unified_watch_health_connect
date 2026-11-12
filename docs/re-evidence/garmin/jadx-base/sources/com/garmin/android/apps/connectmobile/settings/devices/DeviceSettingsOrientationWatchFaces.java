package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.s0;
import ch1.b0;
import ch1.j5;
import ch1.k5;
import ch1.x5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.c0;
import ng1.d0;
import ng1.p;
import org.json.JSONException;
import org.json.JSONObject;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettingsOrientationWatchFaces extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d80.f f41989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d80.f f41990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageButton f41991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageButton f41992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f41993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f41994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DeviceSettingsDTO f41996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b0 f41999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u0 f42000m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41988a = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f42001n = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f42002o = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceSettingsOrientationWatchFaces deviceSettingsOrientationWatchFaces = DeviceSettingsOrientationWatchFaces.this;
            deviceSettingsOrientationWatchFaces.f41996i.G1(DeviceSettingsDTO.s.LANDSCAPE);
            deviceSettingsOrientationWatchFaces.da();
            deviceSettingsOrientationWatchFaces.update(deviceSettingsOrientationWatchFaces.f41999l, deviceSettingsOrientationWatchFaces.f41996i);
            deviceSettingsOrientationWatchFaces.f41998k = true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceSettingsOrientationWatchFaces deviceSettingsOrientationWatchFaces = DeviceSettingsOrientationWatchFaces.this;
            deviceSettingsOrientationWatchFaces.f41996i.G1(DeviceSettingsDTO.s.PORTRAIT);
            deviceSettingsOrientationWatchFaces.da();
            deviceSettingsOrientationWatchFaces.update(deviceSettingsOrientationWatchFaces.f41999l, deviceSettingsOrientationWatchFaces.f41996i);
            deviceSettingsOrientationWatchFaces.f41998k = true;
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(true);
            fVar.m(DeviceSettingsOrientationWatchFaces.this.f41994g.getVisibility() == 0);
        }
    }

    public class d extends androidx.core.view.a {
        public d() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(true);
            fVar.m(DeviceSettingsOrientationWatchFaces.this.f41993f.getVisibility() == 0);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42007a;

        static {
            int[] iArr = new int[u0.values().length];
            f42007a = iArr;
            try {
                iArr[u0.T1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42007a[u0.S1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42007a[u0.V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void ca(p pVar, DeviceSettingsDTO deviceSettingsDTO, String str, u0 u0Var) {
        Intent intent = new Intent(pVar, (Class<?>) DeviceSettingsOrientationWatchFaces.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        intent.putExtra("GCM_deviceEnumValue", u0Var);
        pVar.startActivityForResult(intent, 10);
    }

    public final void da() {
        DeviceSettingsDTO deviceSettingsDTO = this.f41996i;
        deviceSettingsDTO.getClass();
        DeviceSettingsDTO.s.a aVar = DeviceSettingsDTO.s.f34047b;
        String str = deviceSettingsDTO.Z;
        aVar.getClass();
        DeviceSettingsDTO.s sVarA = DeviceSettingsDTO.s.a.a(str);
        DeviceSettingsDTO.s sVar = DeviceSettingsDTO.s.LANDSCAPE;
        ImageView imageView = this.f41993f;
        if (sVarA == sVar) {
            imageView.setVisibility(0);
            this.f41994g.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            this.f41994g.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f41988a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        String string = null;
        this.f41999l = null;
        if (this.f41995h) {
            boolean z14 = this.f41998k;
            if (!z14) {
                bv.b.f21240b.a(this, null, 268468224);
            } else if (z14) {
                JSONObject jSONObject = new JSONObject();
                try {
                    DeviceSettingsDTO deviceSettingsDTO = this.f41996i;
                    deviceSettingsDTO.getClass();
                    DeviceSettingsDTO.s.a aVar = DeviceSettingsDTO.s.f34047b;
                    String str = deviceSettingsDTO.Z;
                    aVar.getClass();
                    jSONObject.put("screenOrientation", DeviceSettingsDTO.s.a.a(str));
                    jSONObject.put("watchFace", this.f41996i.i0());
                    string = jSONObject.toString();
                } catch (JSONException e4) {
                    lc.u0.v(e4, new StringBuilder("Error creating settings json to save: "), a2.SETTINGS, "DeviceSettingsOrientationWatchFaces");
                }
                if (!TextUtils.isEmpty(string)) {
                    showProgressOverlay();
                    com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
                    long j8 = this.f41997j;
                    d0 d0Var = new d0(this);
                    eVarN.getClass();
                    this.f41990c = com.garmin.android.apps.connectmobile.settings.devices.e.Q(j8, string, d0Var);
                }
            }
        } else {
            getIntent().putExtra("GCM_deviceSettings", this.f41996i);
            setResult(-1, getIntent());
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_screen_orientation_watch_faces);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen_orientation_layout);
        TextView textView = (TextView) findViewById(R.id.screen_orientation_textview);
        ImageButton imageButton = (ImageButton) findViewById(R.id.device_settings_vivosmart_landscape_orientation_image);
        this.f41991d = imageButton;
        imageButton.setOnClickListener(this.f42001n);
        this.f41991d.setContentDescription(getString(R.string.Landscape));
        this.f41993f = (ImageView) findViewById(R.id.device_settings_vivosmart_landscape_orientation_overlay);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.device_settings_vivosmart_portrait_orientation_image);
        this.f41992e = imageButton2;
        imageButton2.setOnClickListener(this.f42002o);
        this.f41992e.setContentDescription(getString(R.string.lbl_portrait));
        this.f41994g = (ImageView) findViewById(R.id.device_settings_vivosmart_portrait_orientation_overlay);
        s0.r(this.f41992e, new c());
        s0.r(this.f41991d, new d());
        String string = getString(R.string.orientation_and_watch_face);
        if (getIntent().getExtras() != null) {
            this.f41996i = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            this.f41995h = getIntent().getBooleanExtra("GCM_deviceSetupFollowedByIntent", false);
            this.f41997j = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
            this.f42000m = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
            string = getIntent().getExtras().getString("GCM_deviceSettingsTitle");
        }
        boolean z14 = this.f41995h;
        if (!z14 && this.f41996i == null) {
            i2.f(a2.SETTINGS, "DeviceSettingsOrientationWatchFaces", "Invalid device settings object while entering device settings orientation and watch face screen!");
            finish();
            return;
        }
        if (z14 && this.f41996i == null) {
            initActionBar(true, string);
            if (this.f41997j > 0) {
                showProgressOverlay();
                this.f41989b = com.garmin.android.apps.connectmobile.settings.devices.e.N().r(this.f41997j, new c0(this));
            }
        }
        if (this.f41996i != null) {
            initActionBar(true, string);
            if (this.f41996i.Z == null) {
                textView.setVisibility(8);
                linearLayout.setVisibility(8);
            }
            da();
        }
        int i14 = e.f42007a[this.f42000m.ordinal()];
        if (i14 == 1) {
            this.f41999l = new k5(this);
            textView.setVisibility(8);
            linearLayout.setVisibility(8);
        } else if (i14 == 2) {
            this.f41999l = new j5(this);
        } else if (i14 != 3) {
            this.f41999l = new b0(this);
        } else {
            this.f41999l = new x5(this);
        }
        ArrayList<fb2.e> arrayList = this.f41988a;
        arrayList.clear();
        arrayList.add(this.f41999l);
        for (fb2.e eVar : arrayList) {
            i2.k(a2.SETTINGS, "DeviceSettingsOrientationWatchFaces", "Initializing: " + eVar.toString());
            boolean zG = eVar.g(this, this.f41996i);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f41989b;
        if (fVar != null) {
            fVar.a();
        }
        d80.f fVar2 = this.f41990c;
        if (fVar2 != null) {
            fVar2.f58259c = null;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "DeviceSettingsOrientationWatchFaces", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            this.f41999l.A(this, this.f41996i);
            this.f41999l.m(true);
        }
    }
}
