package defpackage;

import android.text.TextUtils;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class dxr implements l1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, c1d> f16042a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final dxr f16043a = new dxr();
    }

    public static dxr k() {
        return b.f16043a;
    }

    @Override // defpackage.l1d
    public void a(String str, String str2) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            c1dVarL.g(str2);
        }
    }

    @Override // defpackage.l1d
    public boolean b(String str, String str2, Map<String, Object> map) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            return c1dVarL.n(str2, map);
        }
        return false;
    }

    @Override // defpackage.l1d
    public boolean c(String str) {
        return vwr.g() != null && vwr.g().k() && swr.e().d(str) != null && swr.e().d(str).c();
    }

    @Override // defpackage.l1d
    public fwr d(String str, String str2) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            return c1dVarL.o(str2);
        }
        return null;
    }

    @Override // defpackage.l1d
    public void e(String str, t1d t1dVar) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            c1dVarL.initReactNative(t1dVar);
        }
    }

    @Override // defpackage.l1d
    public void f(String str, String str2, m1d m1dVar) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            c1dVarL.k(str2, m1dVar);
        }
    }

    @Override // defpackage.l1d
    public void g(String str, fwr fwrVar, our ourVar) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            c1dVarL.i(fwrVar, ourVar);
        }
    }

    @Override // defpackage.l1d
    public HashMap<String, YRNBundleInfo> getLoadedBundleInfoMap(String str) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            return c1dVarL.m();
        }
        return null;
    }

    @Override // defpackage.l1d
    public void h(String str, String str2, m1d m1dVar) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            c1dVarL.l(str2, m1dVar);
        }
    }

    @Override // defpackage.l1d
    public void i(String str, jxr jxrVar) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            c1dVarL.f(jxrVar);
        }
    }

    @Override // defpackage.l1d
    public boolean j(String str, String str2, WritableMap writableMap) {
        c1d c1dVarL = l(str);
        if (c1dVarL != null) {
            return c1dVarL.h(str2, writableMap);
        }
        return false;
    }

    public final c1d l(String str) {
        c1d c1dVar = !TextUtils.isEmpty(str) ? this.f16042a.get(str) : null;
        if (c1dVar == null) {
            ezr.c().f(YRNTraceEvent.newEvent(str, 1200, "YRNInnerLibraryDispatcher.getYRNApp:appName is " + str + " and app is null", null, null));
            zxr.b("YRN_YRNV3_SDK", "YRNInnerLibraryDispatcher.getYRNApp:appName is " + str + " and app is null");
        }
        return c1dVar;
    }

    public dxr() {
        ConcurrentHashMap<String, c1d> concurrentHashMap = new ConcurrentHashMap<>();
        this.f16042a = concurrentHashMap;
        concurrentHashMap.clear();
        ConcurrentHashMap<String, gur> concurrentHashMapE = vwr.g().e();
        if (concurrentHashMapE != null) {
            for (Map.Entry<String, gur> entry : concurrentHashMapE.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    gur value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        this.f16042a.put(key, new cxr(value));
                    }
                }
            }
        }
    }
}
