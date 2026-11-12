package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: loaded from: classes20.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f31112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile WeakReference<SharedPreferences> f31113b = null;

    public static j a() {
        j jVar;
        synchronized (j.class) {
            if (f31112a == null) {
                f31112a = new j();
            }
            jVar = f31112a;
        }
        return jVar;
    }

    public String a(Context context, String str) {
        if (this.f31113b == null || this.f31113b.get() == null) {
            this.f31113b = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                SLog.e("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = this.f31113b.get().getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                SLog.v("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            SLog.v("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            SLog.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e.getMessage());
            return str;
        }
    }
}
