package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.b.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.sdk.m.d0.f;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.kj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class APSecuritySdk implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static APSecuritySdk f2045a;
    public static APSecBgCheckerInterface bgChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IDeviceInfo f2046c;
    private static Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2047b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    @Override // com.alipay.sdk.m.d0.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        a.a().a(i);
        String strB = h.b(this.f2047b);
        String strC = a.a().c();
        if (kj.e(strB) && !kj.c(strB, strC)) {
            com.alipay.apmobilesecuritysdk.e.a.b(this.f2047b);
            d.a(this.f2047b);
            g.a(this.f2047b);
            i.h();
        }
        if (!kj.c(strB, strC)) {
            h.c(this.f2047b, strC);
        }
        String strE = kj.e(map, "utdid", "");
        String strE2 = kj.e(map, "tid", "");
        String strE3 = kj.e(map, JsbMapKeyNames.H5_USER_ID, "");
        if (kj.c(strE)) {
            strE = UtdidWrapper.getUtdid(this.f2047b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strE);
        map2.put("tid", strE2);
        map2.put(JsbMapKeyNames.H5_USER_ID, strE3);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", "8");
        b.a().a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ APSecuritySdk f2050c;

            @Override // java.lang.Runnable
            public void run() {
                new com.alipay.apmobilesecuritysdk.a.a(this.f2050c.f2047b).a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(this.f2050c.getTokenResult());
                }
            }

            {
                this.f2050c = this;
            }
        });
    }

    public TokenResult getTokenResult() {
        TokenResult tokenResult;
        synchronized (this) {
            tokenResult = new TokenResult();
            try {
                tokenResult.apdidToken = com.alipay.apmobilesecuritysdk.a.a.a(this.f2047b, "");
                tokenResult.clientKey = h.f(this.f2047b);
                tokenResult.apdid = com.alipay.apmobilesecuritysdk.a.a.b(this.f2047b);
                tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f2047b);
                if (kj.c(tokenResult.apdid) || kj.c(tokenResult.apdidToken) || kj.c(tokenResult.clientKey)) {
                    initToken(0, new HashMap(), null);
                }
            } catch (Throwable unused) {
            }
        }
        return tokenResult;
    }

    @Override // com.alipay.sdk.m.d0.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f2046c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public String getSdkVersion() {
        return "3.4.0.202506100708";
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getApdidToken() {
        String strA = com.alipay.apmobilesecuritysdk.a.a.a(this.f2047b, "");
        if (kj.c(strA)) {
            initToken(0, new HashMap(), null);
        }
        return strA;
    }

    @Override // com.alipay.sdk.m.d0.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f2046c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f2046c = iDeviceInfo;
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f2045a == null) {
            synchronized (d) {
                if (f2045a == null) {
                    f2045a = new APSecuritySdk(context);
                }
            }
        }
        return f2045a;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f2046c;
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
        this.f2047b = context;
    }
}
