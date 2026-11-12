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
import hg.f;
import java.util.HashMap;
import java.util.Map;
import oi0.c;

/* JADX INFO: loaded from: classes7.dex */
public class APSecuritySdk implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static APSecuritySdk f28385a;
    public static APSecBgCheckerInterface bgChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static IDeviceInfo f28386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object f28387d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28388b;

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

    public APSecuritySdk(Context context) {
        this.f28388b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f28386c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f28385a == null) {
            synchronized (f28387d) {
                try {
                    if (f28385a == null) {
                        f28385a = new APSecuritySdk(context);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f28385a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f28386c = iDeviceInfo;
    }

    @Override // hg.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f28386c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String strA = a.a(this.f28388b, "");
        if (c.g(strA)) {
            initToken(0, new HashMap(), null);
        }
        return strA;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202311031119";
    }

    @Override // hg.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f28386c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f28388b, "");
            tokenResult.clientKey = h.f(this.f28388b);
            tokenResult.apdid = a.a(this.f28388b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f28388b);
            if (c.g(tokenResult.apdid) || c.g(tokenResult.apdidToken) || c.g(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i14, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i14);
        String strB = h.b(this.f28388b);
        String strC = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (c.k(strB) && !c.h(strB, strC)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.f28388b);
            d.a(this.f28388b);
            g.a(this.f28388b);
            i.h();
        }
        if (!c.h(strB, strC)) {
            h.c(this.f28388b, strC);
        }
        String strF = c.f("utdid", map);
        String strF2 = c.f("tid", map);
        String strF3 = c.f("userId", map);
        if (c.g(strF)) {
            strF = UtdidWrapper.getUtdid(this.f28388b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strF);
        map2.put("tid", strF2);
        map2.put("userId", strF3);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", "8");
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.f28388b).a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }

    @Override // hg.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
