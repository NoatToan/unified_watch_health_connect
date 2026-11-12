package com.huawei.hwcloudjs.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcloudjs.api.ValidateWhiteListListener;
import com.huawei.hwcloudjs.service.auth.bean.AuthBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17070a = "AuthManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ValidateWhiteListListener f17071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f17072c = new c();
    private final HashMap<String, AuthBean> d = new HashMap<>();
    private final ArrayList<String> e = new ArrayList<>();
    private final com.huawei.hwcloudjs.d.a.a f = new com.huawei.hwcloudjs.d.a.a();

    /* JADX INFO: loaded from: classes37.dex */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f17073a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f17074b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f17075c = -2;
        public static final int d = -3;
        public static final int e = -4;

        void a(int i);
    }

    public void b(String str) {
        synchronized (this.e) {
            if (!this.e.contains(str)) {
                this.e.add(str);
            }
        }
    }

    public boolean a(String str, String str2, List<String> list) {
        boolean z;
        synchronized (this.d) {
            AuthBean authBean = this.d.get(str);
            z = authBean != null && d.a(str2, list, authBean);
        }
        return z;
    }

    public boolean a(String str, String str2, Context context) {
        com.huawei.hwcloudjs.service.auth.bean.b bVar = (com.huawei.hwcloudjs.service.auth.bean.b) com.huawei.hwcloudjs.d.b.b.a(new com.huawei.hwcloudjs.service.auth.bean.a(str), context);
        return bVar.c() == 1 && bVar.e() == 0 && d.a(bVar.f(), str2);
    }

    public boolean a(String str) {
        com.huawei.hwcloudjs.f.d.c(f17070a, "isUrlWhileList begin", true);
        if (!TextUtils.isEmpty(str)) {
            return c(str) || d(str);
        }
        com.huawei.hwcloudjs.f.d.b(f17070a, "isUrlWhileList isEmpty", true);
        return false;
    }

    public void a(String str, String str2, List<String> list, a aVar, Context context) {
        com.huawei.hwcloudjs.f.d.c(f17070a, "auth begin", true);
        com.huawei.hwcloudjs.f.d.c(f17070a, "auth appId:" + str, false);
        com.huawei.hwcloudjs.f.d.c(f17070a, "auth url:" + str2, false);
        if (!a(str, str2, list)) {
            new Thread(new b(this, str, str2, list, aVar, context)).start();
        } else {
            com.huawei.hwcloudjs.f.d.c(f17070a, "auth memoryAuth", true);
            aVar.a(0);
        }
    }

    private boolean d(String str) {
        com.huawei.hwcloudjs.f.d.c(f17070a, "isUrlAllowDomin begin", true);
        try {
            String host = new URL(str).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            synchronized (this.e) {
                try {
                    if (this.e.size() == 0) {
                        com.huawei.hwcloudjs.f.d.b(f17070a, "getSercuredUrl empty ,true", true);
                        return false;
                    }
                    Iterator<String> it = this.e.iterator();
                    while (it.hasNext()) {
                        try {
                            if (Pattern.compile(it.next()).matcher(host).matches()) {
                                com.huawei.hwcloudjs.f.d.b(f17070a, "pattern true", true);
                                return true;
                            }
                            continue;
                        } catch (PatternSyntaxException unused) {
                            com.huawei.hwcloudjs.f.d.b(f17070a, "PatternSyntaxException", true);
                        }
                    }
                    com.huawei.hwcloudjs.f.d.b(f17070a, "isUrlWhileList false!", true);
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (MalformedURLException unused2) {
            com.huawei.hwcloudjs.f.d.b(f17070a, "isUrlWhileList MalformedURLException", true);
            return false;
        }
    }

    private boolean c(String str) {
        String str2;
        String str3;
        com.huawei.hwcloudjs.f.d.c(f17070a, "isUrlAllow begin", true);
        synchronized (this.e) {
            if (this.e.size() == 0) {
                str2 = f17070a;
                str3 = "getSercuredUrl empty";
            } else {
                Iterator<String> it = this.e.iterator();
                while (it.hasNext()) {
                    if (Pattern.matches(it.next(), str)) {
                        return true;
                    }
                }
                str2 = f17070a;
                str3 = "isUrlWhileList false!";
            }
            com.huawei.hwcloudjs.f.d.b(str2, str3, true);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, List<String> list, a aVar, Context context) throws Throwable {
        com.huawei.hwcloudjs.f.d.c(f17070a, "getAuthFromGw begin", true);
        com.huawei.hwcloudjs.f.d.c(f17070a, "getAuthFromGw appId:" + str, false);
        com.huawei.hwcloudjs.f.d.c(f17070a, "getAuthFromGw url:" + str2, false);
        com.huawei.hwcloudjs.f.d.c(f17070a, "getAuthFromGw permissionList:" + list, false);
        if (!com.huawei.hwcloudjs.f.b.f()) {
            com.huawei.hwcloudjs.f.d.b(f17070a, "isNetOpen is not open", true);
            aVar.a(-2);
            return;
        }
        com.huawei.hwcloudjs.service.auth.bean.b bVar = (com.huawei.hwcloudjs.service.auth.bean.b) com.huawei.hwcloudjs.d.b.b.a(new com.huawei.hwcloudjs.service.auth.bean.a(str), context);
        if (bVar.c() != 1) {
            if (bVar.c() == 2) {
                aVar.a(bVar.b());
                return;
            } else if (bVar.c() == 3) {
                aVar.a(-3);
                return;
            } else {
                aVar.a(-4);
                return;
            }
        }
        if (bVar.e() == 0) {
            com.huawei.hwcloudjs.f.d.c(f17070a, "response getUrlList:" + bVar.f(), false);
            com.huawei.hwcloudjs.f.d.c(f17070a, "response getPermissionList:" + bVar.d(), false);
            AuthBean authBean = new AuthBean();
            authBean.setUrlList(bVar.f());
            authBean.setPermissionList(bVar.d());
            authBean.setAppId(str);
            authBean.setTimestamp(System.currentTimeMillis());
            if (!d.a(str2, list, authBean)) {
                com.huawei.hwcloudjs.f.d.b(f17070a, "getAuthFromGw checkH5App failed", true);
                aVar.a(-1);
                return;
            } else {
                aVar.a(0);
                a(str, authBean);
                a(authBean);
                return;
            }
        }
        com.huawei.hwcloudjs.f.d.b(f17070a, "getAuthFromGw callback failed", true);
        aVar.a(bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, AuthBean authBean) {
        synchronized (this.d) {
            this.d.put(str, authBean);
        }
    }

    private void a(AuthBean authBean) throws Throwable {
        this.f.a(authBean);
    }

    public static void a(ValidateWhiteListListener validateWhiteListListener) {
        f17071b = validateWhiteListListener;
    }

    public static c a() {
        return f17072c;
    }

    private c() {
    }
}
