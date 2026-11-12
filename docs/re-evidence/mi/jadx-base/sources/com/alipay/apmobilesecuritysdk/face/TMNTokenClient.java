package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.security.mobile.module.a.a;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TMNTokenClient f5791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5792b;

    public interface InitResultListener {
        void onResult(String str, int i);
    }

    private TMNTokenClient(Context context) {
        this.f5792b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f5792b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f5791a == null) {
            synchronized (TMNTokenClient.class) {
                try {
                    if (f5791a == null) {
                        f5791a = new TMNTokenClient(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5791a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.d(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.d(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f5792b));
        map.put("tid", "");
        map.put("userId", "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", UserConfig.KEY_MI_BRAIN_SETTING);
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int iA = new com.alipay.apmobilesecuritysdk.a.a(TMNTokenClient.this.f5792b).a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iA != 0) {
                    initResultListener2.onResult("", iA);
                } else {
                    initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(TMNTokenClient.this.f5792b, str), 0);
                }
            }
        });
    }
}
