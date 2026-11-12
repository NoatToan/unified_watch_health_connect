package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.amap.api.col.p0003sl.d;
import com.amap.api.col.p0003sl.ip;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.iv;
import com.amap.api.col.p0003sl.kt;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AMapLocationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f3338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f3339b;

    public AMapLocationClient(Context context) throws Exception {
        a(context);
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            Context applicationContext = context.getApplicationContext();
            this.f3338a = applicationContext;
            e.a(applicationContext);
            this.f3339b = new d(this.f3338a, null, null);
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne1");
        }
    }

    public AMapLocationClient(Context context, Intent intent) throws Exception {
        a(context);
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f3338a = context.getApplicationContext();
            this.f3339b = new d(this.f3338a, intent, null);
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(Looper looper, Context context) throws Exception {
        a(context);
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f3338a = context.getApplicationContext();
            this.f3339b = new d(this.f3338a, null, looper);
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne3");
        }
    }

    private static void a(Context context) throws Exception {
        iv ivVarA = iu.a(context, c.c());
        if (ivVarA.f2835a == iu.c.SuccessCode) {
            return;
        }
        Log.e("AMapLocationClient", ivVarA.f2836b);
        throw new Exception(ivVarA.f2836b);
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption.f3341b) {
                aMapLocationClientOption.f3341b = false;
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(aMapLocationClientOption.f3342c)) {
                    jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.f3342c);
                }
                i.a(this.f3338a, "O019", jSONObject);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sLocnO");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.a(aMapLocationListener);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sLocL");
        }
    }

    public void startLocation() {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.b();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stl");
        }
    }

    public void stopLocation() {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.c();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stl");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                return dVar.e();
            }
            return null;
        } catch (Throwable th) {
            c.a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.a(webView);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sttAssL1");
        }
    }

    public void stopAssistantLocation() {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.f();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stAssL");
        }
    }

    public String getVersion() {
        return "6.4.9";
    }

    public static void updatePrivacyShow(Context context, boolean z, boolean z2) {
        iu.a(context, z, z2, c.c());
    }

    public static void updatePrivacyAgree(Context context, boolean z) {
        iu.a(context, z, c.c());
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.f3340a = str;
        } catch (Throwable th) {
            c.a(th, "AMClt", "sKey");
        }
    }

    public boolean isStarted() {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                return dVar.a();
            }
            return false;
        } catch (Throwable th) {
            c.a(th, "AMClt", "isS");
            return false;
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.b(aMapLocationListener);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "unRL");
        }
    }

    public void setReGeoLocationCallback(IReGeoLocationCallback iReGeoLocationCallback) {
        d dVar = this.f3339b;
        if (dVar != null) {
            dVar.a(iReGeoLocationCallback);
        }
    }

    public void getReGeoLocation(AMapLocation aMapLocation) {
        d dVar = this.f3339b;
        if (dVar != null) {
            dVar.a(aMapLocation);
        }
    }

    public void onDestroy() {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.d();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "onDy");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.a(i, notification);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "eBackL");
        }
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            d dVar = this.f3339b;
            if (dVar != null) {
                dVar.a(z);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "dBackL");
        }
    }

    public static String getDeviceId(Context context) {
        return ip.q(context);
    }

    public static void setHost(String str) {
        if (TextUtils.isEmpty(str)) {
            kt.f2983a = -1;
            kt.f2984b = "";
        } else {
            kt.f2983a = 1;
            kt.f2984b = str;
        }
    }
}
