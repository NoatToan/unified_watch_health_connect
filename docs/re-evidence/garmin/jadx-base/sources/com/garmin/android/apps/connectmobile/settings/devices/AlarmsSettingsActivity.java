package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import c22.k0;
import c22.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import mt0.h0;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import yc.l2;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/AlarmsSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/settings/devices/d$b;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AlarmsSettingsActivity extends com.garmin.android.apps.connectmobile.c implements d.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f41854n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d80.f<DeviceSettingsDTO> f41855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d80.f<Object> f41856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DeviceSettingsDTO f41858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<i> f41859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f41860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f41861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f41862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f41863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f41866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u0 f41867m;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/AlarmsSettingsActivity$b", "Ld80/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements d80.b {
        public b() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            bVar.getClass();
            String str = "Error saving device settings to GC [" + bVar.f112957a.name() + "].";
            aVar.getClass();
            i2.a.f(a2Var, "AlarmsSettingsActivity", str);
            boolean zA = bVar.a();
            a aVar2 = AlarmsSettingsActivity.f41854n;
            AlarmsSettingsActivity alarmsSettingsActivity = AlarmsSettingsActivity.this;
            alarmsSettingsActivity.displayFailedMessage(zA);
            alarmsSettingsActivity.hideProgressOverlay();
            alarmsSettingsActivity.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            aVar.getClass();
            AlarmsSettingsActivity alarmsSettingsActivity = AlarmsSettingsActivity.this;
            Toast.makeText(alarmsSettingsActivity, alarmsSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
            alarmsSettingsActivity.hideProgressOverlay();
            ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).n(alarmsSettingsActivity, alarmsSettingsActivity.f41857c, "AlarmsSettingsActivity");
            alarmsSettingsActivity.finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.d.b
    public final void C7(int i14, i iVar) {
        CreateEditDeviceAlarmActivity.a aVar = CreateEditDeviceAlarmActivity.f41935r;
        boolean z14 = this.f41864j;
        u0 u0Var = this.f41867m;
        Boolean bool = this.f41866l;
        aVar.getClass();
        CreateEditDeviceAlarmActivity.a.a(this, i14, iVar, z14, u0Var, bool);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.d.b
    public final void Y6(int i14) {
        String string = getString(R.string.remove_alarm_confirmation);
        string.getClass();
        new androidx.appcompat.app.e.a(this).setMessage(string).setPositiveButton(R.string.lbl_delete, new ha1.c(this, i14, 1)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    public final void ca() {
        DeviceSettingsDTO deviceSettingsDTO = this.f41858d;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.getClass();
            this.f41864j = deviceSettingsDTO.h0() == DeviceSettingsDTO.p.TWELVE_HOUR;
            d dVar = this.f41860f;
            dVar.getClass();
            dVar.f42889c = this.f41864j;
            d dVar2 = this.f41860f;
            dVar2.getClass();
            DeviceSettingsDTO deviceSettingsDTO2 = this.f41858d;
            deviceSettingsDTO2.getClass();
            List<i> listD = deviceSettingsDTO2.D();
            listD.getClass();
            dVar2.d(listD);
            DeviceSettingsDTO deviceSettingsDTO3 = this.f41858d;
            deviceSettingsDTO3.getClass();
            ea(deviceSettingsDTO3);
            DeviceSettingsDTO deviceSettingsDTO4 = this.f41858d;
            deviceSettingsDTO4.getClass();
            fa(deviceSettingsDTO4);
        }
    }

    public final void da() {
        String string;
        if (getCallingActivity() != null) {
            if (this.f41858d != null) {
                getIntent().putExtra("GCM_deviceSettings", this.f41858d);
                Intent intent = getIntent();
                DeviceSettingsDTO deviceSettingsDTO = this.f41858d;
                deviceSettingsDTO.getClass();
                intent.putExtra("activityForResult", deviceSettingsDTO.Y1().toString());
                setResult(-1, getIntent());
            }
            finish();
            return;
        }
        if (!this.f41865k) {
            d dVar = this.f41860f;
            dVar.getClass();
            if (!dVar.f42890d) {
                finish();
                return;
            }
        }
        if (!hb2.i.a(this) || this.f41858d == null) {
            return;
        }
        ArrayList<i> arrayList = this.f41859e;
        d dVar2 = this.f41860f;
        dVar2.getClass();
        try {
            string = new JSONObject().put("alarms", k0.d(k0.a(arrayList, dVar2.f42891e))).toString();
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            String message = e4.getMessage();
            aVar.getClass();
            i2.a.f(a2Var, "AlarmsSettingsActivity", message);
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            finish();
        }
        showProgressOverlay();
        e eVarN = e.N();
        long j8 = this.f41857c;
        b bVar = new b();
        eVarN.getClass();
        this.f41856b = e.Q(j8, string, bVar);
    }

    public final void ea(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO.D() != null) {
            List<i> listD = deviceSettingsDTO.D();
            listD.getClass();
            int size = listD.size();
            Button button = this.f41861g;
            button.getClass();
            Integer num = deviceSettingsDTO.f33883l;
            if (num == null) {
                num = 0;
            }
            button.setVisibility(size >= num.intValue() ? 8 : 0);
        }
    }

    public final void fa(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO.D() != null) {
            List<i> listD = deviceSettingsDTO.D();
            listD.getClass();
            int size = listD.size();
            LinearLayout linearLayout = this.f41862h;
            linearLayout.getClass();
            linearLayout.setVisibility(size == 0 ? 0 : 8);
            LinearLayout linearLayout2 = this.f41863i;
            linearLayout2.getClass();
            linearLayout2.setVisibility(size != 0 ? 0 : 8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && intent != null && i14 == 101) {
            int intExtra = intent.getIntExtra("extras_alarm_id", -1);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("extras_device_alarm", i.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("extras_device_alarm");
                if (!(parcelableExtra instanceof i)) {
                    parcelableExtra = null;
                }
                parcelable = (i) parcelableExtra;
            }
            i iVar = (i) parcelable;
            if (iVar != null) {
                if (intExtra == -1) {
                    DeviceSettingsDTO deviceSettingsDTO = this.f41858d;
                    deviceSettingsDTO.getClass();
                    if (deviceSettingsDTO.D() == null) {
                        DeviceSettingsDTO deviceSettingsDTO2 = this.f41858d;
                        deviceSettingsDTO2.getClass();
                        deviceSettingsDTO2.f33876i = new ArrayList();
                        deviceSettingsDTO2.S1("alarms");
                    }
                    DeviceSettingsDTO deviceSettingsDTO3 = this.f41858d;
                    deviceSettingsDTO3.getClass();
                    List<i> listD = deviceSettingsDTO3.D();
                    listD.getClass();
                    listD.add(iVar);
                    d dVar = this.f41860f;
                    dVar.getClass();
                    DeviceSettingsDTO deviceSettingsDTO4 = this.f41858d;
                    deviceSettingsDTO4.getClass();
                    List<i> listD2 = deviceSettingsDTO4.D();
                    listD2.getClass();
                    dVar.d(listD2);
                    DeviceSettingsDTO deviceSettingsDTO5 = this.f41858d;
                    deviceSettingsDTO5.getClass();
                    ea(deviceSettingsDTO5);
                    DeviceSettingsDTO deviceSettingsDTO6 = this.f41858d;
                    deviceSettingsDTO6.getClass();
                    fa(deviceSettingsDTO6);
                } else {
                    d dVar2 = this.f41860f;
                    dVar2.getClass();
                    dVar2.e(intExtra, iVar);
                }
            }
            if (intent.getBooleanExtra("extras_alarm_deleted", false)) {
                d dVar3 = this.f41860f;
                dVar3.getClass();
                dVar3.a(intExtra);
                DeviceSettingsDTO deviceSettingsDTO7 = this.f41858d;
                deviceSettingsDTO7.getClass();
                ea(deviceSettingsDTO7);
                DeviceSettingsDTO deviceSettingsDTO8 = this.f41858d;
                deviceSettingsDTO8.getClass();
                fa(deviceSettingsDTO8);
            }
            this.f41865k = true;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object serializableExtra;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_alarms_settings_list);
        initActionBar(true, R.string.device_setting_alarms);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f41857c = extras.getLong("GCM_deviceUnitID", -1L);
            Intent intent = getIntent();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                serializableExtra = intent != null ? intent.getSerializableExtra("GCM_deviceEnumValue", u0.class) : null;
            } else {
                Object serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_deviceEnumValue") : null;
                if (!(serializableExtra2 instanceof u0)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (u0) serializableExtra2;
            }
            this.f41867m = (u0) serializableExtra;
            if (extras.containsKey("GCM_deviceDTO")) {
                Intent intent2 = getIntent();
                if (i14 >= 33) {
                    parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_deviceDTO", DeviceSettingsDTO.class) : null;
                } else {
                    Parcelable parcelableExtra = intent2 != null ? intent2.getParcelableExtra("GCM_deviceDTO") : null;
                    if (!(parcelableExtra instanceof DeviceSettingsDTO)) {
                        parcelableExtra = null;
                    }
                    parcelable2 = (DeviceSettingsDTO) parcelableExtra;
                }
                this.f41858d = (DeviceSettingsDTO) parcelable2;
            }
            if (extras.containsKey("GCM_alarmOnce")) {
                this.f41866l = Boolean.valueOf(getIntent().getBooleanExtra("GCM_alarmOnce", true));
            }
        }
        if (this.f41857c < 0) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "AlarmsSettingsActivity", "Invalid alarm settings object while entering device settings alarm screen!");
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.alarm_settings_list);
        viewFindViewById.getClass();
        ListView listView = (ListView) viewFindViewById;
        d dVar = new d(this, this);
        this.f41860f = dVar;
        listView.setAdapter((ListAdapter) dVar);
        listView.setDivider(null);
        View viewFindViewById2 = findViewById(R.id.create_edit_alarm);
        viewFindViewById2.getClass();
        Button button = (Button) viewFindViewById2;
        this.f41861g = button;
        button.setOnClickListener(new h0(this, 13));
        View viewFindViewById3 = findViewById(R.id.no_alarms_message_icon);
        viewFindViewById3.getClass();
        this.f41862h = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.alarm_list_container);
        viewFindViewById4.getClass();
        this.f41863i = (LinearLayout) viewFindViewById4;
        if (bundle != null) {
            if (bundle.containsKey("GCM_deviceDTO")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundle.getParcelable("GCM_deviceDTO", DeviceSettingsDTO.class);
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("GCM_deviceDTO");
                    if (!(parcelable3 instanceof DeviceSettingsDTO)) {
                        parcelable3 = null;
                    }
                    parcelable = (DeviceSettingsDTO) parcelable3;
                }
                this.f41858d = (DeviceSettingsDTO) parcelable;
            }
            if (bundle.containsKey("SAVED_STATUS")) {
                this.f41865k = bundle.getBoolean("SAVED_STATUS");
            }
            this.f41859e = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("INITIAL_ALARMS_LIST", i.class) : bundle.getParcelableArrayList("INITIAL_ALARMS_LIST");
        }
        if (this.f41858d != null) {
            ca();
        } else if (hb2.i.a(this)) {
            showProgressOverlay();
            this.f41855a = ((zb0.e) KoinJavaComponent.get$default(zb0.e.class, null, null, 6, null)).r(this.f41857c, new ng1.e(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        da();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        DeviceSettingsDTO deviceSettingsDTO = this.f41858d;
        if (deviceSettingsDTO != null) {
            bundle.putParcelable("GCM_deviceDTO", deviceSettingsDTO);
        }
        bundle.putBoolean("SAVED_STATUS", this.f41865k);
        bundle.putParcelableArrayList("INITIAL_ALARMS_LIST", this.f41859e);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        y0.a(this.f41855a);
        d80.f<Object> fVar = this.f41856b;
        if (fVar != null) {
            fVar.f58259c = null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/AlarmsSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_EDIT_ALARM", "I", "SAVED_STATUS", "INITIAL_ALARMS_LIST", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, u0 u0Var, DeviceSettingsDTO deviceSettingsDTO) {
            Intent intentD = l2.d(context, AlarmsSettingsActivity.class, "GCM_deviceUnitID", j8);
            if (u0Var != null) {
                intentD.putExtra("GCM_deviceEnumValue", u0Var);
            }
            if (deviceSettingsDTO != null) {
                intentD.putExtra("GCM_deviceDTO", deviceSettingsDTO);
            }
            return intentD;
        }

        public static void b(com.garmin.android.apps.connectmobile.c cVar, long j8, u0 u0Var) {
            cVar.startActivity(a(cVar, j8, u0Var, null));
        }

        private a() {
        }
    }
}
