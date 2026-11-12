package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class APSecuritySdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static APSecuritySdk f5786a;
    private static Object c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5787b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    private APSecuritySdk(Context context) {
        this.f5787b = context;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f5786a == null) {
            synchronized (c) {
                try {
                    if (f5786a == null) {
                        f5786a = new APSecuritySdk(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5786a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public String getApdidToken() {
        String strA = a.a(this.f5787b, "");
        if (com.alipay.security.mobile.module.a.a.d(strA)) {
            initToken(0, new HashMap(), null);
        }
        return strA;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.201910161639";
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f5787b, "");
            tokenResult.clientKey = h.f(this.f5787b);
            tokenResult.apdid = a.a(this.f5787b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f5787b);
            if (com.alipay.security.mobile.module.a.a.d(tokenResult.apdid) || com.alipay.security.mobile.module.a.a.d(tokenResult.apdidToken) || com.alipay.security.mobile.module.a.a.d(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i);
        String strB = h.b(this.f5787b);
        String strC = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (com.alipay.security.mobile.module.a.a.g(strB) && !com.alipay.security.mobile.module.a.a.e(strB, strC)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.f5787b);
            d.a(this.f5787b);
            g.a(this.f5787b);
            i.h();
        }
        if (!com.alipay.security.mobile.module.a.a.e(strB, strC)) {
            h.c(this.f5787b, strC);
        }
        String strC2 = com.alipay.security.mobile.module.a.a.c(map, "utdid", "");
        String strC3 = com.alipay.security.mobile.module.a.a.c(map, "tid", "");
        String strC4 = com.alipay.security.mobile.module.a.a.c(map, "userId", "");
        if (com.alipay.security.mobile.module.a.a.d(strC2)) {
            strC2 = UtdidWrapper.getUtdid(this.f5787b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strC2);
        map2.put("tid", strC3);
        map2.put("userId", strC4);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", UserConfig.KEY_MI_BRAIN_SETTING);
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.f5787b).a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }
}
