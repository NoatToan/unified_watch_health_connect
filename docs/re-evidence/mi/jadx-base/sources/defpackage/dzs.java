package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.services.district.DistrictSearchQuery;
import com.autonavi.aps.amapapi.utils.c;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.homeroom.model.Home;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dzs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f16102b;
    public WebView d;
    public b h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16101a = new Object();
    public AMapLocationClient c = null;
    public String e = "AMap.Geolocation.cbk";
    public AMapLocationClientOption f = null;
    public volatile boolean g = false;

    public class a implements ValueCallback<String> {
        public a() {
        }

        @Override // android.webkit.ValueCallback
        public final /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }
    }

    public class b implements AMapLocationListener {
        public b() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (dzs.this.g) {
                dzs.this.g(dzs.e(aMapLocation));
            }
        }
    }

    public dzs(Context context, WebView webView) {
        this.d = null;
        this.h = null;
        this.f16102b = context.getApplicationContext();
        this.d = webView;
        this.h = new b();
    }

    public static String e(AMapLocation aMapLocation) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (aMapLocation == null) {
                jSONObject.put("errorCode", -1);
                jSONObject.put(MyLocationStyle.ERROR_INFO, "unknownError");
            } else if (aMapLocation.getErrorCode() == 0) {
                jSONObject.put("errorCode", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", aMapLocation.getLongitude());
                jSONObject2.put("y", aMapLocation.getLatitude());
                jSONObject2.put("precision", aMapLocation.getAccuracy());
                jSONObject2.put("type", aMapLocation.getLocationType());
                jSONObject2.put("country", aMapLocation.getCountry());
                jSONObject2.put("province", aMapLocation.getProvince());
                jSONObject2.put("city", aMapLocation.getCity());
                jSONObject2.put(TSMAuthContants.PARAM_CITYCODE, aMapLocation.getCityCode());
                jSONObject2.put(DistrictSearchQuery.KEYWORDS_DISTRICT, aMapLocation.getDistrict());
                jSONObject2.put("adCode", aMapLocation.getAdCode());
                jSONObject2.put("street", aMapLocation.getStreet());
                jSONObject2.put("streetNum", aMapLocation.getStreetNum());
                jSONObject2.put("floor", aMapLocation.getFloor());
                jSONObject2.put(Home.JSON_KEY_ADDRESS, aMapLocation.getAddress());
                jSONObject.put("result", jSONObject2);
            } else {
                jSONObject.put("errorCode", aMapLocation.getErrorCode());
                jSONObject.put(MyLocationStyle.ERROR_INFO, aMapLocation.getErrorInfo());
                jSONObject.put("locationDetail", aMapLocation.getLocationDetail());
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public final void b() {
        if (this.d == null || this.f16102b == null || this.g) {
            return;
        }
        try {
            this.d.getSettings().setJavaScriptEnabled(true);
            this.d.addJavascriptInterface(this, "AMapAndroidLoc");
            if (!TextUtils.isEmpty(this.d.getUrl())) {
                this.d.reload();
            }
            if (this.c == null) {
                AMapLocationClient aMapLocationClient = new AMapLocationClient(this.f16102b);
                this.c = aMapLocationClient;
                aMapLocationClient.setLocationListener(this.h);
            }
            this.g = true;
        } catch (Throwable unused) {
        }
    }

    public final void d(String str) {
        boolean z;
        if (this.f == null) {
            this.f = new AMapLocationClientOption();
        }
        int iOptInt = 5;
        long jOptLong = 30000;
        boolean z2 = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jOptLong = jSONObject.optLong("to", 30000L);
            z = jSONObject.optInt("useGPS", 1) == 1;
            try {
                z2 = jSONObject.optInt(Constant.DeviceType.WATCH, 0) == 1;
                iOptInt = jSONObject.optInt("interval", 5);
                String strOptString = jSONObject.optString("callback", null);
                if (TextUtils.isEmpty(strOptString)) {
                    this.e = "AMap.Geolocation.cbk";
                } else {
                    this.e = strOptString;
                }
            } catch (Throwable unused) {
                z2 = z2;
                z = z;
            }
        } catch (Throwable unused2) {
            z2 = false;
            z = false;
        }
        try {
            this.f.setHttpTimeOut(jOptLong);
            if (z) {
                this.f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
            } else {
                this.f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
            }
            this.f.setOnceLocation(!z2);
            if (z2) {
                this.f.setInterval(iOptInt * 1000);
            }
        } catch (Throwable unused3) {
        }
    }

    public final void f() {
        synchronized (this.f16101a) {
            try {
                this.g = false;
                AMapLocationClient aMapLocationClient = this.c;
                if (aMapLocationClient != null) {
                    aMapLocationClient.unRegisterLocationListener(this.h);
                    this.c.stopLocation();
                    this.c.onDestroy();
                    this.c = null;
                }
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final void g(String str) {
        try {
            WebView webView = this.d;
            if (webView != null) {
                webView.evaluateJavascript("javascript:" + this.e + "('" + str + "')", new a());
            }
        } catch (Throwable th) {
            c.a(th, "H5LocationClient", "callbackJs()");
        }
    }

    @JavascriptInterface
    public final void getLocation(String str) {
        synchronized (this.f16101a) {
            try {
                if (this.g) {
                    d(str);
                    AMapLocationClient aMapLocationClient = this.c;
                    if (aMapLocationClient != null) {
                        aMapLocationClient.setLocationOption(this.f);
                        this.c.stopLocation();
                        this.c.startLocation();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JavascriptInterface
    public final void stopLocation() {
        AMapLocationClient aMapLocationClient;
        if (this.g && (aMapLocationClient = this.c) != null) {
            aMapLocationClient.stopLocation();
        }
    }
}
