package com.xiaomi.onetrack.api;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.CrashAnalysis;
import com.xiaomi.onetrack.OnMainThreadException;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.ServiceQualityEvent;
import com.xiaomi.onetrack.util.DeviceUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13767a = "OneTrackImp";
    private static ExecutorService c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f13768b;
    private Context d;
    private f e;
    private Configuration f;
    private OneTrack.ICommonPropertyProvider g;
    private OneTrack.IEventHook h;
    private com.xiaomi.onetrack.util.v i;
    private boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f13769k = new z(this);

    public h(Context context, Configuration configuration) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.f = configuration;
        b(applicationContext);
        StringBuilder sb = new StringBuilder();
        sb.append("OneTrackImp init : ");
        sb.append(configuration.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            if (this.f.getMode() != OneTrack.Mode.APP) {
                return;
            }
            long jD = com.xiaomi.onetrack.f.a.d();
            String strA = a(jD, com.xiaomi.onetrack.f.a.c());
            String strA2 = com.xiaomi.onetrack.util.aa.A();
            if (TextUtils.isEmpty(strA2)) {
                com.xiaomi.onetrack.util.aa.j(strA);
                return;
            }
            JSONObject jSONObject = new JSONObject(strA2);
            long jOptLong = jSONObject.optLong(b.X);
            String strOptString = jSONObject.optString(b.Y);
            if (jOptLong != jD) {
                com.xiaomi.onetrack.util.aa.j(strA);
                this.f13768b.a(b.j, c.a(jOptLong, strOptString, jD, com.xiaomi.onetrack.f.a.f(), this.f, this.h, this.i, this.j));
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b(f13767a, "trackUpgradeEvent error: " + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            com.xiaomi.onetrack.f.a.b().registerReceiver(this.f13769k, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        c.execute(new n(this));
    }

    private boolean e() {
        if (com.xiaomi.onetrack.util.p.f13986a) {
            com.xiaomi.onetrack.util.p.a(f13767a, "enable:" + f() + " isSupportEmptyEvent: " + g());
        }
        return f() && g();
    }

    private boolean f() {
        try {
            int componentEnabledSetting = com.xiaomi.onetrack.f.a.b().getPackageManager().getComponentEnabledSetting(new ComponentName("com.miui.analytics", an.f13741b));
            return componentEnabledSetting == 1 || componentEnabledSetting == 0;
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b(f13767a, "enable error:" + e.toString());
            return false;
        }
    }

    private static boolean g() {
        try {
            int i = com.xiaomi.onetrack.f.a.b().getPackageManager().getPackageInfo("com.miui.analytics", 0).versionCode;
            if (i >= 2020062900) {
                return true;
            }
            com.xiaomi.onetrack.util.p.a(f13767a, "system analytics version: " + i);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void h() {
        c.execute(new x(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (com.xiaomi.onetrack.c.i.d()) {
            c.execute(new y(this));
        }
    }

    private void b(Context context) {
        com.xiaomi.onetrack.util.p.a();
        com.xiaomi.onetrack.util.q.a(this.f.isInternational(), this.f.getRegion(), this.f.getMode());
        if (c == null) {
            c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.i = new com.xiaomi.onetrack.util.v(this.f);
        if (com.xiaomi.onetrack.util.q.a() && e() && c()) {
            com.xiaomi.onetrack.util.o.a().a(Boolean.TRUE);
            this.f13768b = new al(this.f, this.i);
        } else {
            com.xiaomi.onetrack.util.o.a().a(Boolean.FALSE);
            this.f13768b = new aj(context, this.f, this.i);
        }
        if (this.f.getMode() == OneTrack.Mode.APP) {
            com.xiaomi.onetrack.util.q.a(this.f.isOverrideMiuiRegionSetting());
            c(context);
            if (this.f.isExceptionCatcherEnable()) {
                CrashAnalysis.start(context, this);
                if (!CrashAnalysis.isSupport()) {
                    f fVar = new f();
                    this.e = fVar;
                    fVar.a();
                }
            }
        }
        c.execute(new i(this));
    }

    private boolean c() {
        if (this.f.isOverrideMiuiRegionSetting()) {
            return TextUtils.equals(com.xiaomi.onetrack.util.q.j(), this.f.getRegion());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        c.execute(new q(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str) {
        boolean zA = com.xiaomi.onetrack.util.r.a(str);
        if (!zA) {
            com.xiaomi.onetrack.util.p.b(f13767a, String.format("Invalid eventname: %s. Eventname can only consist of numbers, letters, underscores ,and can not start with a number or \"onetrack_\" or \"ot_\"", str));
        }
        return !zA;
    }

    private void c(Context context) {
        ((Application) context).registerActivityLifecycleCallbacks(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        if ("onetrack_dau".equals(str) || "view".equals(str) || "ot_login".equals(str) || "ot_logout".equals(str)) {
            return false;
        }
        boolean zA = com.xiaomi.onetrack.util.r.a(str);
        if (!zA) {
            com.xiaomi.onetrack.util.p.b(f13767a, String.format("Invalid eventname: %s. Eventname can only consist of numbers, letters, underscores ,and can not start with a number or \"onetrack_\" or \"ot_\"", str));
        }
        return !zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject f(String str) throws Throwable {
        try {
            OneTrack.ICommonPropertyProvider iCommonPropertyProvider = this.g;
            JSONObject jSONObjectA = com.xiaomi.onetrack.util.r.a(iCommonPropertyProvider != null ? iCommonPropertyProvider.getDynamicProperty(str) : null, false);
            String strA = com.xiaomi.onetrack.util.k.a(com.xiaomi.onetrack.util.r.a(this.f));
            return com.xiaomi.onetrack.util.r.a(jSONObjectA, !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b(f13767a, "getCommonProperty: " + e.toString());
            return null;
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        c.execute(new t(this, str2, map, str));
    }

    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        c.execute(new r(this, map));
    }

    public void a(String str, Map<String, Object> map) {
        c.execute(new ac(this, str, map));
    }

    public void c(String str) {
        c.execute(new v(this, str));
    }

    public void a(String str, Map<String, Object> map, List<String> list) {
        c.execute(new ad(this, str, map, list));
    }

    public void c(boolean z) {
        this.j = z;
    }

    public void a(String str) {
        c.execute(new ae(this, str));
    }

    public void a(String str, String str2, String str3, String str4, String str5, long j) {
        c.execute(new af(this, str, str2, str3, str5, str4, j));
    }

    public void a(Map<String, Object> map) {
        c.execute(new ag(this, map));
    }

    public void a(String str, Object obj) {
        c.execute(new ah(this, obj, str));
    }

    public void a(String str, OneTrack.UserIdType userIdType, Map<String, Object> map, boolean z) {
        c.execute(new ai(this, str, userIdType, z, map));
    }

    public void a(String str, Number number) {
        c.execute(new k(this, str, number));
    }

    public void a(Map<String, Object> map, boolean z) {
        c.execute(new l(this, z, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        c.execute(new o(this, str, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j) {
        c.execute(new p(this, str, j));
    }

    public void a() {
        c.execute(new s(this));
    }

    public void a(OneTrack.ICommonPropertyProvider iCommonPropertyProvider) {
        this.g = iCommonPropertyProvider;
    }

    public String a(Context context) throws OnMainThreadException {
        if (!com.xiaomi.onetrack.util.w.a()) {
            return DeviceUtil.y(context);
        }
        throw new OnMainThreadException("Can't call this method on main thread");
    }

    public void b(Map<String, ? extends Number> map) {
        c.execute(new j(this, map));
    }

    public void a(ServiceQualityEvent serviceQualityEvent) {
        if (serviceQualityEvent == null) {
            return;
        }
        c.execute(new w(this, serviceQualityEvent));
    }

    public void b(String str) {
        c.execute(new u(this, str));
    }

    public void a(boolean z) {
        com.xiaomi.onetrack.util.p.f13986a = z;
    }

    public String b() throws OnMainThreadException {
        if (!com.xiaomi.onetrack.util.w.a()) {
            return com.xiaomi.onetrack.util.o.a().b();
        }
        throw new OnMainThreadException("Can't call this method on main thread");
    }

    private String a(long j, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(b.Y, str);
        jSONObject.put(b.X, j);
        return jSONObject.toString();
    }

    public void b(boolean z) {
        if (this.f.isUseCustomPrivacyPolicy()) {
            c.execute(new ab(this, z));
        }
    }

    public void a(OneTrack.IEventHook iEventHook) {
        this.h = iEventHook;
        this.i.a(iEventHook);
    }
}
