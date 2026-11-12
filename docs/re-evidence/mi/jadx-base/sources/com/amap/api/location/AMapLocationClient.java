package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amap.api.col.p0003sl.b1;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.y0;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.i;
import defpackage.h0t;
import defpackage.ris;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AMapLocationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f6371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ris f6372b;

    public AMapLocationClient(Context context) throws Exception {
        a(context);
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            Context applicationContext = context.getApplicationContext();
            this.f6371a = applicationContext;
            e.a(applicationContext);
            this.f6372b = new ris(this.f6371a, null, null);
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne1");
        }
    }

    private static void a(Context context) throws Exception {
        y0 y0VarA = iu.a(context, c.c());
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            throw new Exception(y0VarA.f6353b);
        }
    }

    public static String getDeviceId(Context context) {
        return h0t.X(context);
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.f6373a = str;
        } catch (Throwable th) {
            c.a(th, "AMClt", "sKey");
        }
    }

    public static void setHost(String str) {
        if (TextUtils.isEmpty(str)) {
            b1.f5970a = -1;
            b1.f5971b = "";
        } else {
            b1.f5970a = 1;
            b1.f5971b = str;
        }
    }

    public static void updatePrivacyAgree(Context context, boolean z) {
        iu.i(context, z, c.c());
    }

    public static void updatePrivacyShow(Context context, boolean z, boolean z2) {
        iu.j(context, z, z2, c.c());
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.E(z);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "dBackL");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.e(i, notification);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "eBackL");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                return risVar.g0();
            }
            return null;
        } catch (Throwable th) {
            c.a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public void getReGeoLocation(AMapLocation aMapLocation) {
        ris risVar = this.f6372b;
        if (risVar != null) {
            risVar.n(aMapLocation);
        }
    }

    public String getVersion() {
        return "6.4.9";
    }

    public boolean isStarted() {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                return risVar.F();
            }
            return false;
        } catch (Throwable th) {
            c.a(th, "AMClt", "isS");
            return false;
        }
    }

    public void onDestroy() {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.a0();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "onDy");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.r(aMapLocationListener);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sLocL");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.q(aMapLocationClientOption);
            }
            if (aMapLocationClientOption.f6374b) {
                aMapLocationClientOption.f6374b = false;
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(aMapLocationClientOption.c)) {
                    jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.c);
                }
                i.a(this.f6371a, "O019", jSONObject);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sLocnO");
        }
    }

    public void setReGeoLocationCallback(IReGeoLocationCallback iReGeoLocationCallback) {
        ris risVar = this.f6372b;
        if (risVar != null) {
            risVar.s(iReGeoLocationCallback);
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.m(webView);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sttAssL1");
        }
    }

    public void startLocation() {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.J();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stl");
        }
    }

    public void stopAssistantLocation() {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.k0();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stAssL");
        }
    }

    public void stopLocation() {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.U();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stl");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            ris risVar = this.f6372b;
            if (risVar != null) {
                risVar.N(aMapLocationListener);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "unRL");
        }
    }

    public AMapLocationClient(Context context, Intent intent) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.f6371a = context.getApplicationContext();
                this.f6372b = new ris(this.f6371a, intent, null);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(Looper looper, Context context) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.f6371a = context.getApplicationContext();
                this.f6372b = new ris(this.f6371a, null, looper);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne3");
        }
    }
}
