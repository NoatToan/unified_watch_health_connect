package com.garmin.android.apps.connectmobile.settings.devices.vivosmart4;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import c22.n0;
import ci1.b;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.garmin.android.apps.connectmobile.i2;
import d80.f;
import hb2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import sq0.e;

/* JADX INFO: loaded from: classes10.dex */
public class ReOrderableWidgetActivity extends c implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f43215i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f43216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f43217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceSettingsDTO f43218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f43219d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f43221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f43222g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43220e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f43223h = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<dc0.a> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            ReOrderableWidgetActivity reOrderableWidgetActivity = ReOrderableWidgetActivity.this;
            reOrderableWidgetActivity.hideProgressOverlay();
            DeviceSettingsDTO deviceSettingsDTO = reOrderableWidgetActivity.f43218c;
            if (deviceSettingsDTO != null) {
                b bVar = reOrderableWidgetActivity.f43216a;
                ArrayList arrayList = deviceSettingsDTO.f33874h;
                bVar.x(arrayList != null ? ((z) arrayList.get(0)).f34343c : null);
            }
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                ((zb0.e) KoinJavaComponent.get(zb0.e.class)).h(reOrderableWidgetActivity.f43220e);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, dc0.a aVar) {
            DeviceSettingsDTO deviceSettingsDTO = aVar.f59106a;
            if (deviceSettingsDTO != null) {
                ReOrderableWidgetActivity reOrderableWidgetActivity = ReOrderableWidgetActivity.this;
                reOrderableWidgetActivity.f43218c = deviceSettingsDTO;
                reOrderableWidgetActivity.f43219d = deviceSettingsDTO.Y1();
            }
        }
    }

    @Override // sq0.e
    public final void H6(RecyclerView.f0 f0Var) {
        this.f43217b.o(f0Var);
    }

    public void ca(List<y> list) {
        this.f43216a = new b(this, list, this, true);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ArrayList arrayList;
        List<y> list;
        b bVar = this.f43216a;
        List<y> list2 = bVar.f27669i;
        ArrayList arrayListL = j.l(list2);
        for (Object obj : list2) {
            if (!bVar.t((y) obj)) {
                arrayListL.add(obj);
            }
        }
        arrayListL.addAll(bVar.f27670j);
        Iterator it = arrayListL.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            ((y) it.next()).f34329b = i14;
            i14++;
        }
        y yVar = new y();
        yVar.f34329b = -1;
        yVar.f34330c = true;
        arrayListL.add(0, yVar);
        DeviceSettingsDTO deviceSettingsDTO = this.f43218c;
        if (deviceSettingsDTO != null) {
            ((z) deviceSettingsDTO.f33874h.get(0)).f34343c = arrayListL;
            ((z) this.f43218c.f33874h.get(0)).f34342b = false;
        }
        String strA = null;
        if (getCallingActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("GCM_deviceSettings", this.f43218c);
            DeviceSettingsDTO deviceSettingsDTO2 = this.f43218c;
            if (deviceSettingsDTO2 != null && (arrayList = deviceSettingsDTO2.f33874h) != null && arrayList.size() != 0 && (list = ((z) this.f43218c.f33874h.get(0)).f34343c) != null) {
                Iterator<y> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (it3.next().f34329b == -1) {
                        it3.remove();
                    }
                }
                ((z) this.f43218c.f33874h.get(0)).f34343c = list;
            }
            DeviceSettingsDTO deviceSettingsDTO3 = this.f43218c;
            intent.putExtra("activityForResult", deviceSettingsDTO3 != null ? deviceSettingsDTO3.Y1().toString() : null);
            setResult(-1, intent);
            super.onBackPressed();
            return;
        }
        f fVar = this.f43222g;
        if (fVar != null && !fVar.c()) {
            super.onBackPressed();
            return;
        }
        DeviceSettingsDTO deviceSettingsDTO4 = this.f43218c;
        if (deviceSettingsDTO4 != null && this.f43219d != null) {
            strA = n0.a(deviceSettingsDTO4.Y1(), this.f43219d, null);
        }
        i2.a(a2.SETTINGS, "ReOrderableWidgetActivity", "Settings JSON delta = " + strA);
        if (TextUtils.isEmpty(strA)) {
            finish();
            return;
        }
        if (!i.a(this)) {
            if (km2.a.d(this.f43220e, km2.a.b())) {
                Toast.makeText(this, getText(R.string.msg_settings_saved_successfully), 0).show();
                finish();
                return;
            }
            return;
        }
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f43220e;
        ci1.a aVar = new ci1.a(this);
        eVarN.getClass();
        this.f43222g = com.garmin.android.apps.connectmobile.settings.devices.e.Q(j8, strA, aVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f43218c = extras != null ? (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings") : null;
        this.f43220e = extras != null ? extras.getLong("GCM_deviceUnitID", -1L) : -1L;
        List<y> arrayList = new ArrayList<>();
        DeviceSettingsDTO deviceSettingsDTO = this.f43218c;
        if (deviceSettingsDTO != null) {
            if (this.f43220e == -1) {
                this.f43220e = deviceSettingsDTO.f33860a;
            }
            ArrayList arrayList2 = deviceSettingsDTO.f33874h;
            List<y> list = arrayList2 != null ? ((z) arrayList2.get(0)).f34343c : null;
            if (list == null) {
                i2.f(a2.SETTINGS, "ReOrderableWidgetActivity", "The list of screenDto is null!");
                finish();
                return;
            } else {
                ((zb0.e) KoinJavaComponent.get(zb0.e.class)).h(this.f43220e);
                arrayList = list;
            }
        } else {
            showProgressOverlay();
            this.f43221f = Long.valueOf(((zb0.e) KoinJavaComponent.get(zb0.e.class)).z(2, this.f43220e, this.f43223h));
        }
        String string = getString(R.string.connect_iq_widgets);
        setContentView(R.layout.gcm_generic_list_layout);
        initActionBar(true, string);
        ca(arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f43216a);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        s sVar = new s(new ci1.c(this.f43216a));
        this.f43217b = sVar;
        sVar.e(recyclerView);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Long l14 = this.f43221f;
        if (l14 != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.b(l14);
        }
    }
}
