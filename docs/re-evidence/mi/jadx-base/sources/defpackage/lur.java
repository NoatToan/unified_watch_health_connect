package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lur {
    public static final Object h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25449a = "YRN_YRNV3_SDK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, List<m1d>> f25450b = new HashMap<>();
    public final List<String> c = new ArrayList();
    public fwr d = new fwr();
    public gur e;
    public String f;
    public String g;

    public void a(String str) {
        if (g(str)) {
            this.c.add(str);
        }
    }

    public boolean b(String str, m1d m1dVar) {
        boolean z;
        synchronized (h) {
            try {
                List<m1d> arrayList = this.f25450b.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f25450b.put(str, arrayList);
                }
                z = arrayList.size() > 0;
                zxr.a("YRN_YRNV3_SDK", "YRNBaseChannel.addLoadingModuleCallback: module is " + str + ",loading is " + z);
                if (m1dVar != null) {
                    arrayList.add(m1dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void c() {
        this.c.clear();
    }

    public our d(String str) {
        fwr fwrVar = this.d;
        if (fwrVar != null) {
            return fwrVar.j(str);
        }
        return null;
    }

    public jxr e(String str) {
        return TextUtils.equals(str, this.g) ? this.d : d(str);
    }

    public YRNBundleInfo f(String str) {
        fwr fwrVar = this.d;
        if (fwrVar != null) {
            return fwrVar.k(str);
        }
        return null;
    }

    public boolean g(String str) {
        return vwr.g().l(this.f, str, qur.j());
    }

    public boolean h(String str) {
        return this.c.contains(str);
    }

    public void i(String str, boolean z, String str2, String str3) {
        synchronized (h) {
            try {
                List<m1d> list = this.f25450b.get(str);
                if (list != null && list.size() > 0) {
                    for (m1d m1dVar : list) {
                        zxr.a("YRN_YRNV3_SDK", "YRNBaseChannel.notifyLoadingModuleCallbacks: module is " + str + ",success is " + z);
                        if (z) {
                            m1dVar.onLoadSuccess(str2);
                        } else {
                            m1dVar.onLoadFailure(str3);
                        }
                    }
                    list.clear();
                }
                this.f25450b.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(String str) {
        if (g(str)) {
            this.c.remove(str);
        }
    }

    public void k(String str, m1d m1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNBaseChannel.removeLoadingModuleCallback: module is " + str);
        synchronized (h) {
            try {
                List<m1d> list = this.f25450b.get(str);
                if (m1dVar != null && list != null && list.size() > 0) {
                    list.remove(m1dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(int i, String str, YRNBundleInfo yRNBundleInfo, Object obj) {
        ezr.c().f(YRNTraceEvent.newEvent(this.f, i, str, yRNBundleInfo, obj));
    }
}
