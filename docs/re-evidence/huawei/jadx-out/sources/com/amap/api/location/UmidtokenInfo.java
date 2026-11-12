package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.amap.api.col.p0003sl.ip;
import com.autonavi.aps.amapapi.utils.c;

/* JADX INFO: loaded from: classes4.dex */
public class UmidtokenInfo {
    private static AMapLocationClient d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Handler f3363a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static String f3364b = null;
    private static long e = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f3365c = true;

    public static String getUmidtoken() {
        return f3364b;
    }

    public static void setLocAble(boolean z) {
        f3365c = z;
    }

    public static void setUmidtoken(Context context, String str) {
        synchronized (UmidtokenInfo.class) {
            try {
                f3364b = str;
                ip.a(str);
                if (d == null && f3365c) {
                    a aVar = new a();
                    d = new AMapLocationClient(context);
                    AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                    aMapLocationClientOption.setOnceLocation(true);
                    aMapLocationClientOption.setNeedAddress(false);
                    d.setLocationOption(aMapLocationClientOption);
                    d.setLocationListener(aVar);
                    d.startLocation();
                    f3363a.postDelayed(new Runnable() { // from class: com.amap.api.location.UmidtokenInfo.1
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

    /* JADX INFO: loaded from: classes21.dex */
    static final class a implements AMapLocationListener {
        a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.d != null) {
                    UmidtokenInfo.f3363a.removeCallbacksAndMessages(null);
                    UmidtokenInfo.d.onDestroy();
                }
            } catch (Throwable th) {
                c.a(th, "UmidListener", "onLocationChanged");
            }
        }
    }
}
