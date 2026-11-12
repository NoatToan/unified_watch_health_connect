package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.util.HashMap;
import oi0.c;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TMNTokenClient f28393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28394b;

    public interface InitResultListener {
        void onResult(String str, int i14);
    }

    public TMNTokenClient(Context context) {
        this.f28394b = null;
        if (context != null) {
            this.f28394b = context;
        } else {
            h.s("TMNTokenClient initialization error: context is null.");
            throw null;
        }
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f28393a == null) {
            synchronized (TMNTokenClient.class) {
                try {
                    if (f28393a == null) {
                        f28393a = new TMNTokenClient(context);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f28393a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (c.g(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (c.g(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f28394b));
        map.put("tid", "");
        map.put("userId", "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", "8");
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int iA = new a(TMNTokenClient.this.f28394b).a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iA != 0) {
                    initResultListener2.onResult("", iA);
                } else {
                    initResultListener.onResult(a.a(TMNTokenClient.this.f28394b, str), 0);
                }
            }
        });
    }
}
