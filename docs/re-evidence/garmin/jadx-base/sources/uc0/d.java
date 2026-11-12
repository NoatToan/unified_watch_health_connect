package uc0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import ci2.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.androiddynamicsettings.networklayer.util.DynamicSettingsException;
import cw.q;
import ei2.h;
import gw.g;
import hk0.p;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import sd2.f;
import tn2.t;
import vc0.m;
import vc0.n;
import vc0.o;
import vc0.s;
import vc0.u;
import vc0.w;
import yr1.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Luc0/d;", "Lzh2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "databaseRecord", "Lgj1/c;", "primaryDevice", "<init>", "(Landroid/content/Context;Lsd2/f;Lgj1/c;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements zh2.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f169948i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f169949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f169950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gj1.c f169951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f169952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f169953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f169954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f169955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f169956h;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"uc0/d$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                d.f169948i.debug("User settings caching to shared preference success.");
            } else {
                d.f169948i.error("User settings caching to shared preference failed.");
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
        int i14 = gt2.c.f79010a;
        f169948i = gt2.b.f79005a.h("DSL-DynamicSettingsTunnel");
    }

    public d(Context context, f fVar, gj1.c cVar) {
        context.getClass();
        fVar.getClass();
        this.f169949a = context;
        this.f169950b = fVar;
        this.f169951c = cVar;
        String string = context.getString(R.string.txt_something_went_wrong_try_again);
        string.getClass();
        this.f169952d = string;
        this.f169953e = "user";
        this.f169954f = "deviceUser";
        this.f169955g = "activityOptions";
        this.f169956h = new b();
        f169948i.debug("Initializing DynamicSettingsTunnel for product display name: " + fVar.getProductDisplayName() + " || for display name: " + fVar.getDisplayName());
    }

    @Override // li2.f
    public final void a(ai2.a aVar) {
        aVar.b("Consuming App did not handle Search Index", new DynamicSettingsException("Consuming App did not handle Search Index"));
    }

    @Override // li2.f
    public final void b(String str, ni2.c cVar, boolean z14) {
        if (z14) {
            f fVar = this.f169950b;
            if (fVar.getUnitID() >= 0 && p.k(fVar.getUnitID())) {
                long unitID = fVar.getUnitID();
                String name = f169948i.getName();
                name.getClass();
                e.g(unitID, -1L, this.f169949a, name);
            }
            if (cVar != null) {
                String str2 = cVar.f126218b;
                if (str.equals(this.f169953e) || str.equals(this.f169954f)) {
                    q qVarN = q.N();
                    qVarN.getClass();
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new g(qVarN, str2), this.f169956h);
                } else if (str.equals(this.f169955g)) {
                    GCMSettingManager.V(fVar.getUnitID(), new DeviceSettingsDTO(new JSONObject(str2)));
                }
            }
        }
    }

    @Override // li2.f
    public final void c(String str, ni2.c cVar, j jVar) {
        jVar.b("Consuming App did not handle Save Data", new DynamicSettingsException("Consuming App did not handle Save Data"));
    }

    @Override // li2.f
    public final void d(String str, ai2.e.a aVar) {
        str.getClass();
        aVar.b("Consuming App did not handle Data Values", new DynamicSettingsException("Consuming App did not handle Data Values"));
    }

    @Override // li2.f
    public final void e(String str, ai2.c cVar) {
        str.getClass();
        cVar.b("Consuming App did not handle UI Composition", new DynamicSettingsException("Consuming App did not handle UI Composition"));
    }

    public final lh2.c f(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new lh2.c(new tb0.d(26, this, str), new t(this, 25));
    }

    public final h g(Context context, String str) {
        context.getClass();
        str.getClass();
        wc0.b.f184269a.getClass();
        f fVar = this.f169950b;
        fVar.getClass();
        if (str.equals(wc0.d.ALERT_VOLUME.f184309a)) {
            return new vc0.a(context, fVar);
        }
        if (str.equals(wc0.d.AUDIO_PROMPT_DIALECT.f184309a)) {
            return new vc0.b(context, fVar);
        }
        if (str.equals(wc0.d.CONTROLS_MENU_WATCH_FACE.f184309a)) {
            return new vc0.c(context, fVar);
        }
        if (str.equals(wc0.d.DEVICE.f184309a)) {
            return new vc0.d(context, fVar);
        }
        if (str.equals(wc0.d.FEATURE_SETUP.f184309a)) {
            return new vc0.g(context, fVar);
        }
        if (str.equals(wc0.d.FIND_MY_DEVICE.f184309a)) {
            return new vc0.j(context, fVar);
        }
        if (str.equals(wc0.d.HYDRATION_GOAL_RANGES.f184309a)) {
            return new n(context);
        }
        if (str.equals(wc0.d.PREFERRED_ACTIVITY_TRACKER.f184309a)) {
            return new vc0.q(context, fVar);
        }
        if (str.equals(wc0.d.PREFERRED_ACTIVITY_TRACKER_TEXT.f184309a)) {
            return new vc0.p(context);
        }
        if (str.equals(wc0.d.PULSE_OX_SLEEP.f184309a)) {
            return new s(context, fVar);
        }
        boolean zEquals = str.equals(wc0.d.REMOVE_DEVICE.f184309a);
        gj1.c cVar = this.f169951c;
        if (zEquals) {
            return new u(context, fVar, cVar);
        }
        if (str.equals(wc0.d.SYNC.f184309a)) {
            return new w(context, fVar);
        }
        if (str.equals(wc0.d.HAND_ALIGNMENT.f184309a)) {
            return new m(context, fVar);
        }
        if (str.equals(wc0.d.MENU_MANAGE_DEVICE_PRIORITY.f184309a)) {
            return new o(context, fVar, cVar);
        }
        return null;
    }

    public final void h() {
        throw new IllegalStateException("Consumers using the library's Wifi flow must supply a delegate");
    }

    public final boolean i() {
        NetworkInfo activeNetworkInfo;
        Object systemService = this.f169949a.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT < 29) {
            return (connectivityManager.getActiveNetworkInfo() == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(0);
    }

    public final void j(String str) {
        Toast.makeText(this.f169949a, this.f169952d, 0).show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luc0/d$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(Context context, f fVar, gj1.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, fVar, (i14 & 4) != 0 ? null : cVar);
    }
}
