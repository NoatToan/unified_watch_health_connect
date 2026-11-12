package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.c;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.j1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class dcs {
    public static dcs d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1 f15379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap<String, f7t> f15380b = new LinkedHashMap<>();
    public boolean c = true;

    public dcs() {
        try {
            if (this.f15379a == null) {
                this.f15379a = j1.k();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static dcs a() {
        return f();
    }

    public static synchronized dcs f() {
        try {
            dcs dcsVar = d;
            if (dcsVar == null) {
                d = new dcs();
            } else if (dcsVar.f15379a == null) {
                dcsVar.f15379a = j1.j();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return d;
    }

    public static void h() {
        d = null;
    }

    public final void b(acs acsVar) {
        synchronized (this.f15380b) {
            try {
                c cVar = (c) this.f15380b.get(acsVar.b());
                if (cVar == null) {
                    return;
                }
                cVar.a();
                this.f15380b.remove(acsVar.b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(acs acsVar, Context context) throws ik {
        if (!this.f15380b.containsKey(acsVar.b())) {
            c cVar = new c((kfs) acsVar, context.getApplicationContext(), (byte) 0);
            synchronized (this.f15380b) {
                this.f15380b.put(acsVar.b(), cVar);
            }
        }
        this.f15379a.b(this.f15380b.get(acsVar.b()));
    }

    public final void d() {
        g();
        this.f15379a.g();
        this.f15379a = null;
        h();
    }

    public final void e(acs acsVar) {
        c cVar = (c) this.f15380b.get(acsVar.b());
        if (cVar != null) {
            synchronized (this.f15380b) {
                cVar.b();
                this.f15380b.remove(acsVar.b());
            }
        }
    }

    public final void g() {
        synchronized (this.f15380b) {
            try {
                if (this.f15380b.size() <= 0) {
                    return;
                }
                for (Map.Entry<String, f7t> entry : this.f15380b.entrySet()) {
                    entry.getKey();
                    ((c) entry.getValue()).a();
                }
                this.f15380b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
