package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import lc.u0;
import mt0.h0;
import ng1.c1;
import ng1.h1;
import ng1.i1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public class VivosmartDeviceSettingsOrientation extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f42372y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f42373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatButton f42374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageButton f42375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageButton f42376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageButton f42377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageButton f42378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f42379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f42380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f42381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f42382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DeviceSettingsDTO f42384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d80.f f42385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d80.f f42386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f42387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f42389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f42390r = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f42391t = new b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f42392v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f42393w = new d();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f42394x = new e();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = VivosmartDeviceSettingsOrientation.this;
            DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettingsOrientation.f42384l;
            DeviceSettingsDTO.d dVar = DeviceSettingsDTO.d.A;
            deviceSettingsDTO.getClass();
            dVar.getClass();
            deviceSettingsDTO.Y = dVar.f33946a;
            deviceSettingsDTO.S1("bandOrientation");
            vivosmartDeviceSettingsOrientation.ea();
            vivosmartDeviceSettingsOrientation.f42388p = true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = VivosmartDeviceSettingsOrientation.this;
            DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettingsOrientation.f42384l;
            DeviceSettingsDTO.d dVar = DeviceSettingsDTO.d.B;
            deviceSettingsDTO.getClass();
            dVar.getClass();
            deviceSettingsDTO.Y = dVar.f33946a;
            deviceSettingsDTO.S1("bandOrientation");
            vivosmartDeviceSettingsOrientation.ea();
            vivosmartDeviceSettingsOrientation.f42388p = true;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = VivosmartDeviceSettingsOrientation.this;
            vivosmartDeviceSettingsOrientation.f42384l.G1(DeviceSettingsDTO.s.LANDSCAPE);
            vivosmartDeviceSettingsOrientation.fa();
            vivosmartDeviceSettingsOrientation.f42388p = true;
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = VivosmartDeviceSettingsOrientation.this;
            vivosmartDeviceSettingsOrientation.f42384l.G1(DeviceSettingsDTO.s.PORTRAIT);
            vivosmartDeviceSettingsOrientation.fa();
            vivosmartDeviceSettingsOrientation.f42388p = true;
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = VivosmartDeviceSettingsOrientation.this;
            int iOrdinal = vivosmartDeviceSettingsOrientation.f42384l.e0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivosmartDeviceSettingsOrientation);
            aVar.setTitle(R.string.device_setting_wrist_worn_on).setSingleChoiceItems(DeviceSettingsDTO.v.a(vivosmartDeviceSettingsOrientation), iOrdinal, new c1(this, 2));
            aVar.create().show();
            vivosmartDeviceSettingsOrientation.f42388p = true;
        }
    }

    public class f extends androidx.core.view.a {
        public f() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(true);
            fVar.m(VivosmartDeviceSettingsOrientation.this.f42382j.getVisibility() == 0);
        }
    }

    public class g extends androidx.core.view.a {
        public g() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(true);
            fVar.m(VivosmartDeviceSettingsOrientation.this.f42381i.getVisibility() == 0);
        }
    }

    public final void ca() {
        String string;
        o oVar;
        if (this.f42388p) {
            showProgressOverlay();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mountingSide", this.f42384l.e0().f34072a);
                jSONObject.put("screenOrientation", this.f42384l.Z);
                jSONObject.put("bandOrientation", this.f42384l.Y);
                if (this.f42389q && (oVar = this.f42384l.f33872g) != null) {
                    jSONObject.put("enabledScreens", oVar.z0());
                }
                string = jSONObject.toString();
            } catch (JSONException e4) {
                u0.v(e4, new StringBuilder("Error creating save json string: "), a2.SETTINGS, "VVSSettingsOrientation");
                string = null;
            }
            if (TextUtils.isEmpty(string)) {
                hideProgressOverlay();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f42387o;
            i1 i1Var = new i1(this);
            eVarN.getClass();
            this.f42386n = com.garmin.android.apps.connectmobile.settings.devices.e.Q(j8, string, i1Var);
        }
    }

    public final void da() {
        DeviceSettingsDTO.v vVarE0 = this.f42384l.e0();
        DeviceSettingsDTO.v vVar = DeviceSettingsDTO.v.LEFT;
        ImageButton imageButton = this.f42375c;
        if (vVarE0 == vVar) {
            imageButton.setImageResource(2131232026);
            this.f42379g.setImageResource(2131232027);
            this.f42376d.setImageResource(2131232028);
            this.f42380h.setImageResource(2131232029);
            return;
        }
        imageButton.setImageResource(2131232034);
        this.f42379g.setImageResource(2131232035);
        this.f42376d.setImageResource(2131232036);
        this.f42380h.setImageResource(2131232037);
    }

    public final void ea() {
        DeviceSettingsDTO.d dVar;
        DeviceSettingsDTO deviceSettingsDTO = this.f42384l;
        deviceSettingsDTO.getClass();
        DeviceSettingsDTO.d.a aVar = DeviceSettingsDTO.d.f33941b;
        String str = deviceSettingsDTO.Y;
        aVar.getClass();
        if (str == null) {
            dVar = DeviceSettingsDTO.d.A;
            break;
        }
        w13.c cVar = DeviceSettingsDTO.d.f33945f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                dVar = DeviceSettingsDTO.d.A;
                break;
            }
            dVar = (DeviceSettingsDTO.d) bVarN.next();
        } while (!s.g(dVar.f33946a, str));
        DeviceSettingsDTO.d dVar2 = DeviceSettingsDTO.d.A;
        ImageView imageView = this.f42379g;
        if (dVar == dVar2) {
            imageView.setVisibility(0);
            this.f42380h.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            this.f42380h.setVisibility(0);
        }
    }

    public final void fa() {
        DeviceSettingsDTO deviceSettingsDTO = this.f42384l;
        deviceSettingsDTO.getClass();
        DeviceSettingsDTO.s.a aVar = DeviceSettingsDTO.s.f34047b;
        String str = deviceSettingsDTO.Z;
        aVar.getClass();
        DeviceSettingsDTO.s sVarA = DeviceSettingsDTO.s.a.a(str);
        DeviceSettingsDTO.s sVar = DeviceSettingsDTO.s.LANDSCAPE;
        ImageView imageView = this.f42381i;
        if (sVarA == sVar) {
            imageView.setVisibility(0);
            this.f42382j.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            this.f42382j.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (!this.f42383k) {
            getIntent().putExtra("GCM_deviceSettings", this.f42384l);
            setResult(-1, getIntent());
        } else if (this.f42388p) {
            ca();
        } else {
            bv.b.f21240b.a(this, null, 268468224);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivosmart_orientation);
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96716e;
        bVar.getClass();
        if (!j22.b.k(aVar)) {
            j22.b.x(this, 110, aVar);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_wrist_btn);
        this.f42373a = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42394x);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.band_orientation_layout);
        TextView textView = (TextView) findViewById(R.id.band_orientation_textview);
        ImageButton imageButton = (ImageButton) findViewById(R.id.device_settings_vivosmart_a_bo_image);
        this.f42375c = imageButton;
        imageButton.setOnClickListener(this.f42390r);
        this.f42379g = (ImageView) findViewById(R.id.device_settings_vivosmart_a_bo_overlay);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.device_settings_vivosmart_b_bo_image);
        this.f42376d = imageButton2;
        imageButton2.setOnClickListener(this.f42391t);
        this.f42380h = (ImageView) findViewById(R.id.device_settings_vivosmart_b_bo_overlay);
        View viewFindViewById = findViewById(R.id.bottom_divider);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.screen_orientation_layout);
        TextView textView2 = (TextView) findViewById(R.id.screen_orientation_textview);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.device_settings_vivosmart_landscape_orientation_image);
        this.f42377e = imageButton3;
        imageButton3.setContentDescription(getString(R.string.Landscape));
        this.f42377e.setOnClickListener(this.f42392v);
        this.f42381i = (ImageView) findViewById(R.id.device_settings_vivosmart_landscape_orientation_overlay);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.device_settings_vivosmart_portrait_orientation_image);
        this.f42378f = imageButton4;
        imageButton4.setContentDescription(getString(R.string.lbl_portrait));
        this.f42378f.setOnClickListener(this.f42393w);
        this.f42382j = (ImageView) findViewById(R.id.device_settings_vivosmart_portrait_orientation_overlay);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.orientation_save);
        this.f42374b = appCompatButton;
        appCompatButton.setOnClickListener(new h0(this, 21));
        s0.r(this.f42378f, new f());
        s0.r(this.f42377e, new g());
        String string = getString(R.string.device_setting_wrist_and_orientation);
        if (getIntent().getExtras() != null) {
            this.f42384l = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            this.f42383k = getIntent().getBooleanExtra("GCM_deviceSetupFollowedByIntent", false);
            this.f42387o = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        }
        boolean z14 = this.f42383k;
        if (!z14 && this.f42384l == null) {
            i2.f(a2.SETTINGS, "VVSSettingsOrientation", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        if (z14 && this.f42384l == null) {
            initActionBar(true, string);
            if (this.f42387o >= 0) {
                showProgressOverlay();
                this.f42385m = com.garmin.android.apps.connectmobile.settings.devices.e.N().r(this.f42387o, new h1(this));
            }
            textView.setVisibility(8);
            linearLayout.setVisibility(8);
            viewFindViewById.setVisibility(8);
            this.f42374b.setVisibility(0);
        }
        if (this.f42384l != null) {
            initActionBar(true, string);
            this.f42373a.setButtonBottomLeftLabel(getString(this.f42384l.e0().f34073b));
            if (this.f42384l.Y == null) {
                textView.setVisibility(8);
                linearLayout.setVisibility(8);
                viewFindViewById.setVisibility(8);
            }
            if (this.f42384l.Z == null) {
                textView2.setVisibility(8);
                linearLayout2.setVisibility(8);
            }
            da();
            ea();
            fa();
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        if (i14 == 110) {
            a2 a2Var = a2.SETTINGS;
            StringBuilder sb3 = new StringBuilder("Camera access ");
            j22.b.f96736a.getClass();
            sb3.append(j22.b.E(iArr));
            i2.a(a2Var, "VVSSettingsOrientation", sb3.toString());
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f42385m;
        if (fVar != null) {
            fVar.a();
        }
        d80.f fVar2 = this.f42386n;
        if (fVar2 != null) {
            fVar2.f58259c = null;
        }
    }
}
