package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.autonavi.aps.amapapi.utils.c;
import defpackage.h0t;

/* JADX INFO: loaded from: classes4.dex */
public class UmidtokenInfo {
    private static AMapLocationClient d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Handler f6395a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static String f6396b = null;
    private static long e = 30000;
    static boolean c = true;

    public static class a implements AMapLocationListener {
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.d != null) {
                    UmidtokenInfo.f6395a.removeCallbacksAndMessages(null);
                    UmidtokenInfo.d.onDestroy();
                }
            } catch (Throwable th) {
                c.a(th, "UmidListener", "onLocationChanged");
            }
        }
    }

    public static String getUmidtoken() {
        return f6396b;
    }

    public static void setLocAble(boolean z) {
        c = z;
    }

    public static synchronized void setUmidtoken(Context context, String str) {
        try {
            f6396b = str;
            h0t.r(str);
            if (d == null && c) {
                a aVar = new a();
                d = new AMapLocationClient(context);
                AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                aMapLocationClientOption.setOnceLocation(true);
                aMapLocationClientOption.setNeedAddress(false);
                d.setLocationOption(aMapLocationClientOption);
                d.setLocationListener(aVar);
                d.startLocation();
                f6395a.postDelayed(new Runnable() { // from class: com.amap.api.location.UmidtokenInfo.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (UmidtokenInfo.d != null) {
                                UmidtokenInfo.d.onDestroy();
                            }
                        } catch (Throwable th) {
                            c.a(th, "UmidListener", "postDelayed");
                        }
                    }
                }, 30000L);
            }
        } catch (Throwable th) {
            c.a(th, "UmidListener", "setUmidtoken");
        }
    }
}
