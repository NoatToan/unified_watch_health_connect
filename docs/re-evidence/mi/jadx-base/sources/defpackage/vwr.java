package defpackage;

import android.app.Application;
import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class vwr {
    public static final ConcurrentHashMap<String, gur> c = new ConcurrentHashMap<>();
    public static volatile boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public iwr f37318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f37319b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final vwr f37320a = new vwr();
    }

    public static vwr g() {
        return b.f37320a;
    }

    public Application a() {
        return this.f37319b;
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, gur> entry : c.entrySet()) {
            if (entry != null) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public String c(String str) {
        k1d k1dVarH = h(str);
        return k1dVarH != null ? k1dVarH.getCommonModuleName() : "common";
    }

    public gur d(String str) {
        gur gurVar = !TextUtils.isEmpty(str) ? c.get(str) : null;
        if (gurVar == null) {
            ezr.c().f(YRNTraceEvent.newEvent(str, 1200, "YRNEnvManager.getConfig:appName is " + str + " and config is null,init is " + d, null, b() != null ? b().toString() : ""));
        }
        return gurVar;
    }

    public ConcurrentHashMap<String, gur> e() {
        return c;
    }

    public String f(String str) {
        gur gurVarD;
        return (TextUtils.isEmpty(str) || (gurVarD = d(str)) == null || TextUtils.isEmpty(gurVarD.o())) ? "production" : gurVarD.o();
    }

    public k1d h(String str) {
        gur gurVarD = d(str);
        if (gurVarD != null) {
            return gurVarD.p();
        }
        return null;
    }

    public void i(iwr iwrVar) {
        sk1.c(iwrVar);
        sk1.b(!d, "YRNEnvManager had been initialized!");
        d = true;
        this.f37318a = iwrVar;
        j();
    }

    public final void j() {
        this.f37319b = this.f37318a.d();
        zxr.f(this.f37318a.f());
        c.clear();
        if (this.f37318a.e() != null) {
            for (gur gurVar : this.f37318a.e()) {
                if (gurVar != null && !TextUtils.isEmpty(gurVar.j())) {
                    c.put(gurVar.j(), gurVar);
                }
            }
        }
    }

    public boolean k() {
        iwr iwrVar = this.f37318a;
        return iwrVar != null && iwrVar.g();
    }

    public boolean l(String str, String str2, j1d j1dVar) {
        YRNDevModeInfo yRNDevModeInfoA;
        return (!k() || j1dVar == null || (yRNDevModeInfoA = j1dVar.a(str, str2)) == null || TextUtils.isEmpty(yRNDevModeInfoA.c())) ? false : true;
    }

    public vwr() {
    }
}
