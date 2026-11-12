package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.model.MyLocationStyle;
import com.facebook.appevents.integrity.IntegrityManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class h {
    public a c;
    private Context d;
    private WebView f;
    public Object a = new Object();
    private AMapLocationClient e = null;
    private String g = "AMap.Geolocation.cbk";
    public AMapLocationClientOption b = null;
    private volatile boolean h = false;

    public class a implements AMapLocationListener {
        public a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (h.this.h) {
                h.a(h.this, h.b(aMapLocation));
            }
        }
    }

    public h(Context context, WebView webView) {
        this.f = null;
        this.c = null;
        this.d = context.getApplicationContext();
        this.f = webView;
        this.c = new a();
    }

    public static /* synthetic */ void a(h hVar, final String str) {
        try {
            WebView webView = hVar.f;
            if (webView != null) {
                if (Build.VERSION.SDK_INT < 19) {
                    webView.post(new Runnable() { // from class: com.loc.h.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.this.f.loadUrl("javascript:" + h.this.g + "('" + str + "')");
                        }
                    });
                    return;
                }
                webView.evaluateJavascript("javascript:" + hVar.g + "('" + str + "')", new ValueCallback<String>() { // from class: com.loc.h.1
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
            }
        } catch (Throwable th) {
            ei.a(th, "H5LocationClient", "callbackJs()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(AMapLocation aMapLocation) {
        String locationDetail;
        JSONObject jSONObject = new JSONObject();
        String str = MyLocationStyle.ERROR_INFO;
        try {
            if (aMapLocation != null) {
                if (aMapLocation.getErrorCode() == 0) {
                    jSONObject.put("errorCode", 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", aMapLocation.getLongitude());
                    jSONObject2.put("y", aMapLocation.getLatitude());
                    jSONObject2.put("precision", aMapLocation.getAccuracy());
                    jSONObject2.put("type", aMapLocation.getLocationType());
                    jSONObject2.put("country", aMapLocation.getCountry());
                    jSONObject2.put("province", aMapLocation.getProvince());
                    jSONObject2.put("city", aMapLocation.getCity());
                    jSONObject2.put("cityCode", aMapLocation.getCityCode());
                    jSONObject2.put("district", aMapLocation.getDistrict());
                    jSONObject2.put("adCode", aMapLocation.getAdCode());
                    jSONObject2.put("street", aMapLocation.getStreet());
                    jSONObject2.put("streetNum", aMapLocation.getStreetNum());
                    jSONObject2.put("floor", aMapLocation.getFloor());
                    jSONObject2.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, aMapLocation.getAddress());
                    jSONObject.put("result", jSONObject2);
                } else {
                    jSONObject.put("errorCode", aMapLocation.getErrorCode());
                    jSONObject.put(MyLocationStyle.ERROR_INFO, aMapLocation.getErrorInfo());
                    str = "locationDetail";
                    locationDetail = aMapLocation.getLocationDetail();
                }
                return jSONObject.toString();
            }
            jSONObject.put("errorCode", -1);
            locationDetail = "unknownError";
            jSONObject.put(str, locationDetail);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public final void a() {
        if (this.f == null || this.d == null || Build.VERSION.SDK_INT < 17 || this.h) {
            return;
        }
        try {
            this.f.getSettings().setJavaScriptEnabled(true);
            this.f.addJavascriptInterface(this, "AMapAndroidLoc");
            if (!TextUtils.isEmpty(this.f.getUrl())) {
                this.f.reload();
            }
            if (this.e == null) {
                AMapLocationClient aMapLocationClient = new AMapLocationClient(this.d);
                this.e = aMapLocationClient;
                aMapLocationClient.setLocationListener(this.c);
            }
            this.h = true;
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.h = false;
            AMapLocationClient aMapLocationClient = this.e;
            if (aMapLocationClient != null) {
                aMapLocationClient.unRegisterLocationListener(this.c);
                this.e.stopLocation();
                this.e.onDestroy();
                this.e = null;
            }
            this.b = null;
        }
    }

    @JavascriptInterface
    public final void getLocation(String str) {
        boolean z;
        boolean z2;
        AMapLocationClientOption aMapLocationClientOption;
        AMapLocationClientOption.AMapLocationMode aMapLocationMode;
        synchronized (this.a) {
            if (this.h) {
                if (this.b == null) {
                    this.b = new AMapLocationClientOption();
                }
                int iOptInt = 5;
                long jOptLong = 30000;
                boolean z3 = true;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jOptLong = jSONObject.optLong("to", 30000L);
                    z = jSONObject.optInt("useGPS", 1) == 1;
                    try {
                        z2 = jSONObject.optInt("watch", 0) == 1;
                        try {
                            iOptInt = jSONObject.optInt("interval", 5);
                            String strOptString = jSONObject.optString("callback", null);
                            if (TextUtils.isEmpty(strOptString)) {
                                strOptString = "AMap.Geolocation.cbk";
                            }
                            this.g = strOptString;
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        z2 = false;
                    }
                } catch (Throwable unused3) {
                    z = false;
                }
                try {
                    this.b.setHttpTimeOut(jOptLong);
                    if (z) {
                        aMapLocationClientOption = this.b;
                        aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
                    } else {
                        aMapLocationClientOption = this.b;
                        aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Battery_Saving;
                    }
                    aMapLocationClientOption.setLocationMode(aMapLocationMode);
                    AMapLocationClientOption aMapLocationClientOption2 = this.b;
                    if (z2) {
                        z3 = false;
                    }
                    aMapLocationClientOption2.setOnceLocation(z3);
                    if (z2) {
                        this.b.setInterval(iOptInt * 1000);
                    }
                } catch (Throwable unused4) {
                }
                AMapLocationClient aMapLocationClient = this.e;
                if (aMapLocationClient != null) {
                    aMapLocationClient.setLocationOption(this.b);
                    this.e.stopLocation();
                    this.e.startLocation();
                }
            }
        }
    }

    @JavascriptInterface
    public final void stopLocation() {
        AMapLocationClient aMapLocationClient;
        if (this.h && (aMapLocationClient = this.e) != null) {
            aMapLocationClient.stopLocation();
        }
    }
}
