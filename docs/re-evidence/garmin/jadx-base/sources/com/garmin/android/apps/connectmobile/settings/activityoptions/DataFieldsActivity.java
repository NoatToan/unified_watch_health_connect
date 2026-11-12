package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.g;
import com.garmin.android.apps.connectmobile.i2;
import ig1.b0;
import ig1.d1;
import ig1.i1;
import ig1.k1;
import ig1.r0;
import ig1.v1;
import ig1.w;
import ig1.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DataFieldsActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f41623c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41621a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41624d = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41625a;

        static {
            int[] iArr = new int[u0.values().length];
            f41625a = iArr;
            try {
                iArr[u0.f203764l2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41625a[u0.M1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void ca(com.garmin.android.apps.connectmobile.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar, u0 u0Var, boolean z14, int i14) {
        Intent intent = new Intent(cVar, (Class<?>) DataFieldsActivity.class);
        intent.putExtra("GCM_deviceActivityOptions", fVar);
        intent.putExtra("EXTRA_HIDE_SPEED_TYPE_FIELD", z14);
        intent.putExtra("GCM_deviceEnumValue", u0Var);
        cVar.startActivityForResult(intent, i14);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f41622b != null) {
            getIntent().putExtra("GCM_deviceActivityOptions", this.f41622b);
            setResult(-1, getIntent());
        } else {
            setResult(0);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iD;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        int i14 = 1;
        initActionBar(true, R.string.run_options_data_fields);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f41622b = (com.garmin.android.apps.connectmobile.devices.model.f) extras.getParcelable("GCM_deviceActivityOptions");
            this.f41623c = (u0) extras.getSerializable("GCM_deviceEnumValue");
            this.f41624d = extras.getBoolean("EXTRA_HIDE_SPEED_TYPE_FIELD", false);
        }
        if (this.f41622b == null) {
            i2.f(a2.SETTINGS, "DataFieldsActivity", "Invalid device activity options object!");
            finish();
            return;
        }
        ArrayList<fb2.e> arrayList = this.f41621a;
        arrayList.clear();
        if (!this.f41624d) {
            arrayList.add(new v1(this));
        }
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f41622b;
        int size = fVar.P0() ? fVar.I().size() : 0;
        for (int i15 = 0; i15 < size; i15++) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f41622b;
            if (fVar2.P0()) {
                g gVar = fVar2.I().get(i15);
                gVar.getClass();
                iD = gVar.D();
            } else {
                iD = 0;
            }
            int i16 = a.f41625a[this.f41623c.ordinal()];
            arrayList.add(i16 != 1 ? i16 != 2 ? new b0(this, i15, iD) : new k1(this, i15, iD) : new d1(this, i15, iD));
        }
        arrayList.add(new r0(this));
        arrayList.add(new i1(this));
        if (this.f41623c == u0.f203764l2) {
            arrayList.add(new w(this));
        } else {
            arrayList.add(new z(this));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (!(eVar instanceof v1) && eVar.h(this.f41622b)) {
                TextView textView = new TextView(this);
                textView.setTextAppearance(R.style.GCM_Group_Header_Text);
                textView.setPadding((int) (getResources().getDimension(R.dimen.spacing_normal) + 0.5f), (int) (getResources().getDimension(R.dimen.gcm3_device_settings_margin_top) + 0.5f), 0, 0);
                textView.setText(String.format(getResources().getString(R.string.device_settings_data_fields_title), Integer.valueOf(i14)));
                textView.setVisibility(0);
                linearLayout.addView(textView);
                i14++;
            }
            linearLayout.addView(eVar.a());
            if ((eVar instanceof v1) && eVar.h(this.f41622b)) {
                int iE = fb2.g.e(10, this);
                TextView textView2 = new TextView(this);
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView2.setPadding(iE, iE, iE, iE);
                textView2.setText(getString(R.string.run_options_pace_speed_section_footer));
                textView2.setTextColor(getColor(R.color.gcm_text_secondary));
                textView2.setTextSize(2, 14.0f);
                linearLayout.addView(textView2);
            } else {
                linearLayout.findViewById(R.id.header_view).setVisibility(8);
            }
        }
        linearLayout.addView(fb2.g.a(this));
        if (this.f41622b != null) {
            for (fb2.e eVar2 : arrayList) {
                i2.k(a2.SETTINGS, "DataFieldsActivity", "Initializing: " + eVar2.toString());
                try {
                    boolean zG = eVar2.g(this, this.f41622b);
                    eVar2.addObserver(this);
                    eVar2.m(zG);
                } catch (IllegalArgumentException unused) {
                    Toast.makeText(this, getString(R.string.txt_empty_page_unable_load), 0).show();
                    finish();
                    return;
                }
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41621a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null || this.f41622b == null) {
            return;
        }
        Iterator it = this.f41621a.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).k(this.f41622b);
        }
    }
}
