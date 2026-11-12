package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.SdkConfig;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.weibo.ssosdk.VisitorLoginListener;
import com.weibo.ssosdk.WeiboSsoSdk;
import com.weibo.ssosdk.WeiboSsoSdkConfig;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class a {
    private static boolean a = false;
    private static AuthInfo b;
    private static String mAid;

    public static AuthInfo b() {
        a();
        return b;
    }

    public static /* synthetic */ boolean c() {
        a = true;
        return true;
    }

    public static String getAid() {
        a();
        return mAid;
    }

    public static void a(Context context, AuthInfo authInfo, final SdkListener sdkListener, SdkConfig sdkConfig) {
        boolean zIsUserAgreeWifiInfo;
        if (a) {
            return;
        }
        if (authInfo == null) {
            throw new RuntimeException("authInfo must not be null.");
        }
        b = authInfo;
        boolean zIsUserAgree = false;
        if (sdkConfig != null) {
            zIsUserAgree = sdkConfig.isUserAgree();
            zIsUserAgreeWifiInfo = sdkConfig.isUserAgreeWifiInfo();
        } else {
            zIsUserAgreeWifiInfo = false;
        }
        String appKey = authInfo.getAppKey();
        WeiboSsoSdkConfig weiboSsoSdkConfig = new WeiboSsoSdkConfig();
        weiboSsoSdkConfig.setContext(context.getApplicationContext());
        weiboSsoSdkConfig.setAppKey(appKey);
        weiboSsoSdkConfig.setFrom("1478195010");
        weiboSsoSdkConfig.setWm("1000_0001");
        weiboSsoSdkConfig.setUserChoise(zIsUserAgree);
        weiboSsoSdkConfig.setIsWifiInfors(zIsUserAgreeWifiInfo);
        WeiboSsoSdk.initConfig(weiboSsoSdkConfig);
        try {
            WeiboSsoSdk.getInstance().visitorLogin(new VisitorLoginListener() { // from class: com.sina.weibo.sdk.a.1
                @Override // com.weibo.ssosdk.VisitorLoginListener
                public final void handler(WeiboSsoSdk.VisitorLoginInfo visitorLoginInfo) {
                    if (visitorLoginInfo != null) {
                        try {
                            String unused = a.mAid = visitorLoginInfo.getAid();
                            a.c();
                            SdkListener sdkListener2 = sdkListener;
                            if (sdkListener2 != null) {
                                sdkListener2.onInitSuccess();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            SdkListener sdkListener3 = sdkListener;
                            if (sdkListener3 != null) {
                                sdkListener3.onInitFailure(e);
                            }
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            if (sdkListener != null) {
                sdkListener.onInitFailure(e);
            }
        }
    }

    public static boolean b(Context context) {
        com.sina.weibo.sdk.b.a.C0744a c0744aE;
        return a(context) && (c0744aE = com.sina.weibo.sdk.b.a.e(context)) != null && c0744aE.af >= 10772;
    }

    private static void a() {
        if (!a) {
            throw new RuntimeException("please init sdk before use it. Wb.install()");
        }
    }

    public static boolean a(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        String[] strArr = {"com.sina.weibo", "com.sina.weibog3"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !listQueryIntentServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
