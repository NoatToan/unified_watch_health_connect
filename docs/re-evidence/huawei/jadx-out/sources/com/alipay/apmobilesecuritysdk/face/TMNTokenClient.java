package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.kj;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TMNTokenClient f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2053b;

    public interface InitResultListener {
        void onResult(String str, int i);
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (kj.c(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (kj.c(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f2053b));
        map.put("tid", "");
        map.put(JsbMapKeyNames.H5_USER_ID, "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", "8");
        b.a().a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            public final /* synthetic */ TMNTokenClient d;

            @Override // java.lang.Runnable
            public void run() {
                int iA = new a(this.d.f2053b).a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iA != 0) {
                    initResultListener2.onResult("", iA);
                } else {
                    initResultListener.onResult(a.a(this.d.f2053b, str), 0);
                }
            }

            {
                this.d = this;
            }
        });
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f2052a == null) {
            synchronized (TMNTokenClient.class) {
                if (f2052a == null) {
                    f2052a = new TMNTokenClient(context);
                }
            }
        }
        return f2052a;
    }

    private TMNTokenClient(Context context) {
        this.f2053b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f2053b = context;
    }
}
