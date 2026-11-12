package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import uk1.i;
import uk1.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/a;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44088h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vk1.b f44089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vk1.b f44090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44091c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44093e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44092d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f44094f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f44095g = new c();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/a$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lvk1/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<vk1.b> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            a aVar = a.this;
            aVar.f44092d = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                aVar.ca();
                return;
            }
            String strN = fb1.c.n("fetchConfigDTO: ", cVar.name());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "BaseHRZonesConfig", strN);
            aVar.ea(R.string.txt_something_went_wrong_try_again);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, vk1.b bVar) {
            vk1.b bVar2 = bVar;
            eVar.getClass();
            bVar2.getClass();
            a aVar = a.this;
            aVar.f44089a = bVar2;
            aVar.f44090b = bVar2.a();
            aVar.hideProgressOverlay();
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/a$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            a aVar = a.this;
            aVar.hideProgressOverlay();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA || cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                int i14 = a.f44088h;
                aVar.ea(R.string.msg_settings_saved_successfully);
            } else {
                int i15 = a.f44088h;
                aVar.ea(R.string.txt_something_went_wrong_try_again);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    static {
        new C0826a(null);
    }

    public abstract void ca();

    public final void da() {
        vk1.b bVar = this.f44089a;
        bVar.getClass();
        vk1.b bVar2 = this.f44090b;
        bVar2.getClass();
        vk1.c.j(bVar, bVar2);
        this.f44089a = bVar;
        try {
            String strC = vk1.c.c(bVar);
            if (strC == null) {
                finish();
                return;
            }
            showProgressOverlay();
            i iVarA = i.f171903b.a();
            c cVar = this.f44095g;
            iVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new l(strC, iVarA), cVar);
        } catch (JSONException e4) {
            sn.a.s("Error creating json to save. ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "BaseHRZonesConfig");
            ea(R.string.txt_something_went_wrong_try_again);
        }
    }

    public final void ea(int i14) {
        Toast.makeText(this, i14, 0).show();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public abstract void onBackPressed();

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f44091c = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f44093e = getIntent().getStringExtra("GCM_deviceProductNbr");
        if (this.f44091c == -1) {
            ea(R.string.msg_error_no_device_unit_id_specified);
        }
        setContentView(R.layout.gcm_settings_heartratezones_3_0);
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
        long j8 = this.f44092d;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f44089a == null && hasInternetConnection()) {
            showProgressOverlay();
            this.f44092d = i.f171903b.a().N(this.f44091c, this.f44094f);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0826a {
        public /* synthetic */ C0826a(j jVar) {
            this();
        }

        private C0826a() {
        }
    }
}
