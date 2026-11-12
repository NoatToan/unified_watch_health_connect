package com.tencent.open.a;

import android.os.Build;
import com.huawei.hms.network.embedded.y;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f31014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f31015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f31016c;

    protected f() {
        b();
    }

    private void b() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + com.tencent.open.utils.f.a().b(com.tencent.open.utils.g.a()) + "_" + Build.VERSION.RELEASE;
        try {
            this.f31016c = new e(str);
        } catch (NoClassDefFoundError e) {
            SLog.e("openSDK_LOG.OpenHttpService", "initClient okHttp catch error", e);
        } catch (Throwable th) {
            SLog.e("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f31016c == null) {
            this.f31016c = new b(str);
        }
    }

    public static f a() {
        if (f31014a == null) {
            synchronized (f.class) {
                if (f31014a == null) {
                    f31014a = new f();
                }
            }
        }
        f31014a.c();
        return f31014a;
    }

    public void a(i iVar) {
        this.f31015b = iVar;
        c();
    }

    private void c() {
        i iVar = this.f31015b;
        if (iVar == null) {
            return;
        }
        int iA = iVar.a("Common_HttpConnectionTimeout");
        if (iA == 0) {
            iA = y.f15619c;
        }
        int iA2 = this.f31015b.a("Common_SocketConnectionTimeout");
        if (iA2 == 0) {
            iA2 = 30000;
        }
        a(iA, iA2);
    }

    public void a(long j, long j2) {
        a aVar = this.f31016c;
        if (aVar != null) {
            aVar.a(j, j2);
        }
    }

    public g a(String str, Map<String, String> map) throws IOException {
        if (map == null || map.isEmpty()) {
            return a(str, "");
        }
        StringBuilder sb = new StringBuilder("");
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null) {
                sb.append(URLEncoder.encode(str2, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "UTF-8"));
                sb.append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return a(str, sb.toString());
    }

    public g a(String str, String str2) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "get.");
        return this.f31016c.a(str, str2);
    }

    public g b(String str, Map<String, String> map) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "post data");
        return this.f31016c.a(str, map);
    }

    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() == 0) {
            return b(str, map);
        }
        return this.f31016c.a(str, map, map2);
    }
}
