package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, cne> f1835a;

    private cnh() {
        this.f1835a = new ConcurrentHashMap<>();
    }

    public static cnh d() {
        return a.f1836b;
    }

    public boolean h(String str) {
        return this.f1835a.containsKey(str);
    }

    public void d(String str, int i) {
        cne cneVar;
        this.f1835a.put(str, new cne(str));
        if (i != 2 || (cneVar = this.f1835a.get(str)) == null) {
            return;
        }
        cneVar.b(true);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("HiChainLiteAuthManager", "clearHiChainLiteParams: deviceIdentify is empty");
        } else {
            this.f1835a.remove(str);
        }
    }

    public boolean g(String str) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            return cneVar.j();
        }
        return false;
    }

    public String e(String str) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            return cneVar.e();
        }
        LogUtil.e("HiChainLiteAuthManager", "getNextAuthenticateKey: hiChainLiteParams is not exist.");
        return "";
    }

    public void c(String str, String str2) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            cneVar.c(str2);
        }
    }

    public void c(String str, int i) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            cneVar.a(i);
        } else {
            LogUtil.d("HiChainLiteAuthManager", "device does not a hichainlite device when setEncryptAlgorithmType.");
        }
    }

    public int c(String str) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            return cneVar.d();
        }
        LogUtil.d("HiChainLiteAuthManager", "device does not a hichainlite device when getEncryptAlgorithmType.");
        return 0;
    }

    public void d(String str, String str2) {
        cne cneVar = this.f1835a.get(str2);
        if (cneVar != null) {
            cneVar.d(str);
        } else {
            LogUtil.d("HiChainLiteAuthManager", "device does not a hichainlite device when setReconnectionKey.");
        }
    }

    public String f(String str) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            return cneVar.b();
        }
        LogUtil.d("HiChainLiteAuthManager", "device does not a hichainlite device when getReconnectionKey.");
        return "";
    }

    public void e(String str, String str2) {
        cne cneVar = this.f1835a.get(str);
        if (cneVar != null) {
            cneVar.e(str2);
        } else {
            LogUtil.d("HiChainLiteAuthManager", "device does not a hichainlite device when setFirstAuthenticateKey");
        }
    }

    public String b(String str) {
        cne cneVar;
        if (this.f1835a.containsKey(str) && (cneVar = this.f1835a.get(str)) != null) {
            return cneVar.a();
        }
        LogUtil.d("HiChainLiteAuthManager", "device does not a hichainlite device when getFirstAuthenticateKey.");
        return "";
    }

    public byte[] a(String str) {
        cne cneVar;
        if (this.f1835a.containsKey(str) && (cneVar = this.f1835a.get(str)) != null) {
            byte[] bArrC = cneVar.c();
            if (bArrC == null || bArrC.length == 0) {
                b(str, cni.d(str, 2));
            }
            return cneVar.c();
        }
        LogUtil.e("HiChainLiteAuthManager", "getCurrentEncryptionKey: hiChainLiteParams is not exist.");
        return null;
    }

    public void b(String str, String str2) {
        if (this.f1835a.containsKey(str)) {
            cne cneVar = this.f1835a.get(str);
            if (cneVar != null) {
                cneVar.d(cph.d(str2));
                return;
            }
            return;
        }
        LogUtil.d("HiChainLiteAuthManager", "setCurrentEncryptionKey: hiChainLiteParams is not exist.");
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cnh f1836b = new cnh();
    }
}
