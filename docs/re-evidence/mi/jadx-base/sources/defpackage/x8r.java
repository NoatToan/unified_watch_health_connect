package defpackage;

import android.content.Context;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.model.LatLng;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class x8r extends rf2 {
    public static x8r f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38870b;
    public AMapLocationClient c;
    public AMapLocationClientOption d;
    public boolean e = false;

    public x8r(Context context) {
        this.f38870b = context;
    }

    public static x8r d(Context context) {
        if (f == null) {
            f = new x8r(context);
            AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
            AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        }
        return f;
    }

    @Override // defpackage.rf2
    public void a(boolean z) {
        this.e = z;
        try {
            this.c = new AMapLocationClient(this.f38870b);
            AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
            this.d = aMapLocationClientOption;
            if (z) {
                aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
                this.d.setGpsFirst(true);
                this.d.setSensorEnable(true);
            } else {
                aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
            }
            this.d.setOnceLocation(true);
        } catch (Exception e) {
            Logger.i("WeatherLocationManager", "AMapLocationClient  init failed!!!");
            e.printStackTrace();
        }
    }

    @Override // defpackage.rf2
    public void b(boolean z, final kah kahVar) {
        Logger.i("use china location , locationByAndroid:" + z, new Object[0]);
        if (z) {
            Logger.i("WeatherLocationManager", "use android location");
            w8r w8rVarE = w8r.e(AppUtil.getApp());
            w8rVarE.a(this.e);
            w8rVarE.b(z, kahVar);
            return;
        }
        Logger.i("WeatherLocationManager", "use amap location");
        AMapLocationClient aMapLocationClient = this.c;
        if (aMapLocationClient != null) {
            aMapLocationClient.setLocationOption(this.d);
            this.c.setLocationListener(new AMapLocationListener() { // from class: v8r
                @Override // com.amap.api.location.AMapLocationListener
                public final void onLocationChanged(AMapLocation aMapLocation) {
                    this.f36628a.e(kahVar, aMapLocation);
                }
            });
            this.c.startLocation();
        }
    }

    public final /* synthetic */ void e(kah kahVar, AMapLocation aMapLocation) {
        double d;
        double d2;
        if (aMapLocation == null || aMapLocation.getErrorCode() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("syncLocationToDevice: location fail ");
            sb.append(aMapLocation == null ? AbstractJsonLexerKt.NULL : aMapLocation.getErrorInfo());
            String string = sb.toString();
            if (kahVar != null) {
                kahVar.locationFail(string);
            }
            this.c.onDestroy();
            return;
        }
        double longitude = aMapLocation.getLongitude();
        double latitude = aMapLocation.getLatitude();
        Logger.i("invokeLocation longitude = " + longitude + " latitude = " + latitude, new Object[0]);
        if (l5.y(Double.valueOf(latitude), Double.valueOf(longitude)).booleanValue()) {
            d = longitude;
            d2 = latitude;
        } else {
            LatLng latLngN = l5.n(new LatLng(latitude, longitude));
            double d3 = latLngN.longitude;
            double d4 = latLngN.latitude;
            Logger.i("invokeLocation isAMapDataAvailable longitude = " + d3 + " latitude = " + d4, new Object[0]);
            d = d3;
            d2 = d4;
        }
        if (kahVar != null) {
            kahVar.locationSuccess(d2, d, aMapLocation.getAltitude());
        }
        this.c.onDestroy();
    }
}
