package xk1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxk1/p;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/y0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "statusListener", "<init>", "(Landroidx/lifecycle/y0;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f191275f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<g3<List<PowerZonesDTO>>> f191276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, Boolean> f191277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uk1.j f191278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f191279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f191280e;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"xk1/p$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends PowerZonesDTO>> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            int i14 = p.f191275f;
            p.this.getClass();
            String str = "Get PWZ operationCompleted: " + cVar;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "PowerZonesListViewModel", str);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends PowerZonesDTO> list) {
            List<? extends PowerZonesDTO> list2 = list;
            eVar.getClass();
            list2.getClass();
            int i14 = p.f191275f;
            p pVar = p.this;
            pVar.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "PowerZonesListViewModel", "GetPWZ onResultsObtained: " + list2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (p005kotlin.jvm.internal.s.g(pVar.f191277b.get(((PowerZonesDTO) obj).f43986a), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            y0<g3<List<PowerZonesDTO>>> y0Var = pVar.f191276a;
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xk1/p$c", "Llj0/k;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements lj0.k {
        public c() {
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            bVar.getClass();
            int i14 = p.f191275f;
            p pVar = p.this;
            pVar.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "PowerZonesListViewModel", "Could not load device capabilities: " + bVar);
            pVar.f191276a.j(g3.a.a(g3.f35298f, bVar.f112959c, null, null, null, 14));
        }

        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            JSONObject jSONObject;
            aVar.getClass();
            p pVar = p.this;
            HashMap<String, Boolean> map = pVar.f191277b;
            Object obj = aVar.f112977a;
            obj.getClass();
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException e4) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "PowerZonesListViewModel", "Could not parse jsonString to jsonObject: " + e4);
                jSONObject = null;
            }
            if (jSONObject != null) {
                map.clear();
                boolean zOptBoolean = jSONObject.optBoolean("cyclingPowerZonesCapable");
                boolean zOptBoolean2 = jSONObject.optBoolean("xcSkiPowerZonesCapable");
                boolean zOptBoolean3 = jSONObject.optBoolean("runningPowerZonesCapable");
                boolean zOptBoolean4 = jSONObject.optBoolean("powerZonesCapable");
                map.put("CYCLING", Boolean.valueOf(zOptBoolean));
                map.put("CROSS_COUNTRY_SKIING", Boolean.valueOf(zOptBoolean2));
                map.put("RUNNING", Boolean.valueOf(zOptBoolean3));
                map.put("ROWING", Boolean.valueOf(zOptBoolean4));
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "PowerZonesListViewModel", "Power Zones data: requesting power zones.");
            ge1.b.T(v1.a(pVar), null, null, new q(pVar, null), 3);
        }
    }

    static {
        new a(null);
    }

    public p(y0<g3<List<PowerZonesDTO>>> y0Var) {
        y0Var.getClass();
        this.f191276a = y0Var;
        this.f191277b = new HashMap<>();
        this.f191278c = uk1.j.f171905b.a();
        this.f191279d = new b();
        this.f191280e = new c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lxk1/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "POWER_ZONES_CYCLING_CAPABLE", "POWER_ZONES_XC_SKI_CAPABLE", "POWER_ZONES_RUNNING_CAPABLE", "POWER_ZONES_CAPABLE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
