package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.util.Log;
import com.huawei.openalliance.ad.ll;
import com.huawei.openalliance.ad.lm;
import com.huawei.openalliance.ad.net.http.HttpsConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class cy {
    public static void a(Context context) {
        String str;
        try {
            Context applicationContext = context.getApplicationContext();
            HttpsConfig.a(ll.a(applicationContext));
            HttpsConfig.a(new lm(applicationContext));
        } catch (IOException unused) {
            str = "SecureSSLSocketFactory create fail io";
            Log.w("SecurityHttpsConfig", str);
        } catch (Exception unused2) {
            str = "SecureSSLSocketFactory create fail";
            Log.w("SecurityHttpsConfig", str);
        }
    }
}
