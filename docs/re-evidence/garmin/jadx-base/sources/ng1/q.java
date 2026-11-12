package ng1;

import android.os.Bundle;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f125986q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f125987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f125988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f125989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f125990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f125991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f125992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vg1.z f125993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f125994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UserSettingsDTO f125995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONObject f125996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f125997k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f125999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public oc1.d f126000n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f125998l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f126001o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f126002p = new b();

    public class a implements lj0.k {
        public a() {
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            q qVar = q.this;
            qVar.hideProgressOverlay();
            com.garmin.android.apps.connectmobile.g1.b(qVar, c22.y0.b(bVar));
        }

        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            JSONObject jSONObject;
            UserSettingsDTO userSettingsDTO;
            q qVar = q.this;
            qVar.hideProgressOverlay();
            try {
                jSONObject = new JSONObject((String) aVar.f112977a);
            } catch (JSONException e4) {
                qVar.f125998l = false;
                lc.u0.v(e4, new StringBuilder("fetchDeviceRegistrationDetails.onResultsSucceeded: "), a2.SETTINGS, "BaseUserSettings");
                jSONObject = null;
            }
            if (jSONObject != null) {
                qVar.f125998l = jSONObject.optBoolean("xcSkiPowerZonesCapable");
            }
            if (qVar.f125998l && (userSettingsDTO = qVar.f125995i) != null) {
                qVar.ca(userSettingsDTO);
                return;
            }
            qVar.showProgressOverlay();
            uk1.j jVarN = uk1.j.N();
            b bVar = qVar.f126002p;
            jVarN.getClass();
            bVar.getClass();
            qVar.f125991e = com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.b(jVarN), bVar);
        }
    }

    public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<PowerZonesDTO>> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            q qVar = q.this;
            qVar.hideProgressOverlay();
            qVar.ca(qVar.f125995i);
            com.garmin.android.apps.connectmobile.g1.b(qVar, cVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<PowerZonesDTO> list) {
            q.this.f125999m = o72.t.L(vk1.e.CYCLING.name(), list);
        }
    }

    public abstract void ca(UserSettingsDTO userSettingsDTO);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f125994h = extras.getString("GCM_deviceProductNbr");
            this.f125992f = extras.getLong("GCM_deviceUnitID", -1L);
            this.f125993g = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).J((zb0.u0) zb0.u0.f203782n6.get(this.f125994h));
        }
        if (this.f125994h == null) {
            i2.f(a2.SETTINGS, "BaseUserSettings", "Invalid device product number! Exit device user settings.");
            finish();
            return;
        }
        if (z10.d1.f()) {
            z10.d1.o(this, new kx0.f(this, 14));
        }
        this.f126000n = (oc1.d) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(oc1.d.class));
        showProgressOverlay();
        this.f125988b = new r(this);
        this.f125989c = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).j(String.valueOf(this.f125992f), this.f125988b);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle.containsKey("USER_SETTINGS_JSON_COPY")) {
            try {
                this.f125996j = new JSONObject(bundle.getString("USER_SETTINGS_JSON_COPY"));
            } catch (JSONException e4) {
                lc.u0.v(e4, new StringBuilder("Error restoring mUserSettingsJsonCopy. "), a2.SETTINGS, "BaseUserSettings");
            }
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        JSONObject jSONObject = this.f125996j;
        if (jSONObject != null) {
            bundle.putString("USER_SETTINGS_JSON_COPY", jSONObject.toString());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        cVar.a(this.f125989c);
        cVar.a(this.f125991e);
    }
}
