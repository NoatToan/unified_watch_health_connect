package defpackage;

import android.text.TextUtils;
import com.huawei.wearengine.auth.AuthListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class yia {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile yia f53364b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, AuthListener> f53365a = new ConcurrentHashMap();

    private yia() {
    }

    public static yia c() {
        if (f53364b == null) {
            synchronized (yia.class) {
                if (f53364b == null) {
                    f53364b = new yia();
                }
            }
        }
        return f53364b;
    }

    public void e(String str, AuthListener authListener) {
        if (TextUtils.isEmpty(str) || authListener == null || this.f53365a == null) {
            return;
        }
        yit.e("AuthCallbackManage", "putCallbackToMap mAuthListenerMap != null");
        this.f53365a.put(str, authListener);
    }

    public AuthListener d(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.b("AuthCallbackManage", "getCallbackFromMap key == null");
            return null;
        }
        if (!this.f53365a.containsKey(str)) {
            yit.b("AuthCallbackManage", "getCallbackFromMap mAuthListenerMap not containsKey");
            return null;
        }
        AuthListener authListener = this.f53365a.get(str);
        this.f53365a.remove(str);
        return authListener;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.b("AuthCallbackManage", "removeCallbackFromMap key isEmpty");
        } else if (!this.f53365a.containsKey(str)) {
            yit.b("AuthCallbackManage", "removeCallbackFromMap mAuthListenerMap not containsKey");
        } else {
            this.f53365a.remove(str);
        }
    }
}
