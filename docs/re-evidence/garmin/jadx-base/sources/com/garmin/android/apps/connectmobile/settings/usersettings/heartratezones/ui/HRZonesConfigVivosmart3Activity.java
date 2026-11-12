package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import hb2.i;
import org.json.JSONException;
import p005kotlin.Metadata;
import vk1.f;
import xg1.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosmart3Activity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HRZonesConfigVivosmart3Activity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44037h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vk1.b f44039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vk1.b f44040c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c f44042e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44041d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f44043f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f44044g = new c();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosmart3Activity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            HRZonesConfigVivosmart3Activity hRZonesConfigVivosmart3Activity = HRZonesConfigVivosmart3Activity.this;
            hRZonesConfigVivosmart3Activity.f44041d = -1L;
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                sn.a.s("fetchConfigDTO: ", cVar.name(), i2.f36769a, a2.SETTINGS, "HRZonesConfigVivosmart3Activity");
                hRZonesConfigVivosmart3Activity.ca(R.string.txt_something_went_wrong_try_again);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            HRZonesConfigVivosmart3Activity hRZonesConfigVivosmart3Activity = HRZonesConfigVivosmart3Activity.this;
            hRZonesConfigVivosmart3Activity.f44041d = -1L;
            vk1.b bVar = (vk1.b) obj;
            hRZonesConfigVivosmart3Activity.f44039b = bVar;
            hRZonesConfigVivosmart3Activity.f44040c = bVar.a();
            hRZonesConfigVivosmart3Activity.hideProgressOverlay();
            hRZonesConfigVivosmart3Activity.getClass();
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.a aVar = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.I;
            vk1.b bVar2 = hRZonesConfigVivosmart3Activity.f44039b;
            bVar2.getClass();
            f fVar = bVar2.f178585e;
            fVar.getClass();
            aVar.getClass();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("dto", fVar);
            Fragment fragmentInstantiate = Fragment.instantiate(hRZonesConfigVivosmart3Activity, com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.class.getName(), bundle);
            fragmentInstantiate.getClass();
            hRZonesConfigVivosmart3Activity.f44042e = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c) fragmentInstantiate;
            v supportFragmentManager = hRZonesConfigVivosmart3Activity.getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c cVar = hRZonesConfigVivosmart3Activity.f44042e;
            cVar.getClass();
            aVarB.j(R.id.heartratezones_container, cVar, "HRZonesConfigVivosmart3Activity", 1);
            aVarB.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosmart3Activity$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            HRZonesConfigVivosmart3Activity hRZonesConfigVivosmart3Activity = HRZonesConfigVivosmart3Activity.this;
            hRZonesConfigVivosmart3Activity.hideProgressOverlay();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA || cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                int i14 = HRZonesConfigVivosmart3Activity.f44037h;
                hRZonesConfigVivosmart3Activity.ca(R.string.msg_settings_saved_successfully);
            } else {
                int i15 = HRZonesConfigVivosmart3Activity.f44037h;
                hRZonesConfigVivosmart3Activity.ca(R.string.txt_something_went_wrong_try_again);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    static {
        new a(null);
    }

    public final void ca(int i14) {
        Toast.makeText(this, i14, 0).show();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (!i.a(this)) {
            finish();
            return;
        }
        com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c cVar = this.f44042e;
        if (cVar != null) {
            EditText editText = cVar.f44137g;
            if (editText != null) {
                editText.clearFocus();
            }
            EditText editText2 = cVar.f44138h;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            EditText editText3 = cVar.f44139i;
            if (editText3 != null) {
                editText3.clearFocus();
            }
            EditText editText4 = cVar.f44140j;
            if (editText4 != null) {
                editText4.clearFocus();
            }
            EditText editText5 = cVar.f44141k;
            if (editText5 != null) {
                editText5.clearFocus();
            }
            EditText editText6 = cVar.f44142l;
            if (editText6 != null) {
                editText6.clearFocus();
            }
            EditText editText7 = cVar.f44143m;
            if (editText7 != null) {
                editText7.clearFocus();
            }
            EditText editText8 = cVar.f44144n;
            if (editText8 != null) {
                editText8.clearFocus();
            }
            EditText editText9 = cVar.f44145o;
            if (editText9 != null) {
                editText9.clearFocus();
            }
            EditText editText10 = cVar.f44146p;
            if (editText10 != null) {
                editText10.clearFocus();
            }
            EditText editText11 = cVar.f44147q;
            if (editText11 != null) {
                editText11.clearFocus();
            }
            EditText editText12 = cVar.f44148r;
            if (editText12 != null) {
                editText12.clearFocus();
            }
        }
        com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c cVar2 = this.f44042e;
        if (cVar2 == null || !cVar2.f44133c) {
            new e.a(this).setTitle(R.string.lbl_error_title_invalid_zone_data).setMessage(R.string.lbl_error_message_invalid_zone_data).setPositiveButton(R.string.lbl_ok, new l(this, 3)).create().show();
            return;
        }
        vk1.b bVar = this.f44039b;
        bVar.getClass();
        vk1.b bVar2 = this.f44040c;
        bVar2.getClass();
        vk1.c.j(bVar, bVar2);
        this.f44039b = bVar;
        try {
            String strC = vk1.c.c(bVar);
            if (strC == null) {
                finish();
                return;
            }
            showProgressOverlay();
            uk1.i iVarA = uk1.i.f171903b.a();
            c cVar3 = this.f44044g;
            iVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.l(strC, iVarA), cVar3);
        } catch (JSONException e4) {
            sn.a.s("Error creating json to save. ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "HRZonesConfigVivosmart3Activity");
            ca(R.string.txt_something_went_wrong_try_again);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f44038a = longExtra;
        if (longExtra == -1) {
            ca(R.string.msg_error_no_device_unit_id_specified);
        }
        setContentView(R.layout.gcm_settings_heartratezones_wellness_3_0);
        initActionBar(true, R.string.devices_lbl_heart_rate_zones);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        long j8 = this.f44041d;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f44039b == null && hasInternetConnection()) {
            showProgressOverlay();
            this.f44041d = uk1.i.f171903b.a().N(this.f44038a, this.f44043f);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosmart3Activity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
