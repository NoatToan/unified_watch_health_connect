package com.xiaomi.hm.health.locweather.location;

import android.content.Context;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.locweather.event.LocationEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes21.dex */
public class AMapLocationService implements LocationService, AMapLocationListener {
    private static final String d = "MyLocation-AMapService";
    private static final String e = "LocationException";
    private Context a;
    private LocationListener b;
    private AMapLocationClient c;

    public AMapLocationService(Context context) {
        this.a = context;
        this.c = new AMapLocationClient(context);
    }

    private MyLocation a(AMapLocation aMapLocation) {
        MyLocation myLocation = new MyLocation();
        myLocation.setLatitude(aMapLocation.getLatitude());
        myLocation.setLongitude(aMapLocation.getLongitude());
        myLocation.setAltitude(aMapLocation.getAltitude());
        myLocation.setHasAltitude(aMapLocation.hasAltitude());
        MyLocation.Address address = new MyLocation.Address();
        address.setCountry(aMapLocation.getCountry());
        address.setAdmin(aMapLocation.getProvince());
        address.setLocality(aMapLocation.getCity());
        address.setSubLocality(aMapLocation.getDistrict());
        address.q(aMapLocation.getAdCode());
        address.r(aMapLocation.getCityCode());
        try {
            int iIndexOf = aMapLocation.getAddress().indexOf(aMapLocation.getDistrict());
            if (iIndexOf > 0) {
                address.setThoroughfare(aMapLocation.getAddress().substring(iIndexOf));
            } else {
                address.setThoroughfare(aMapLocation.getAddress());
            }
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
        }
        myLocation.setAddress(address);
        return myLocation;
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void cancelLocation() {
        HMLog.d(d, "Cancel MyLocation!!", new Object[0]);
        this.c.stopLocation();
        this.c.onDestroy();
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public MyLocation getLastLocation() {
        AMapLocation lastKnownLocation = this.c.getLastKnownLocation();
        HMLog.d(d, "Last Amap Known MyLocation : ", new Object[0]);
        if (lastKnownLocation != null) {
            return a(lastKnownLocation);
        }
        return null;
    }

    @Override // com.amap.api.location.AMapLocationListener
    public void onLocationChanged(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            int errorCode = aMapLocation.getErrorCode();
            if (errorCode == 0) {
                if (this.b != null) {
                    this.b.onReceiveLocation(a(aMapLocation));
                    return;
                }
                return;
            }
            Analytics.event(this.a, e, "Amap_" + errorCode);
            HMLog.i(d, "errorCode: " + aMapLocation.getErrorCode() + ", errorInfo: " + aMapLocation.getErrorInfo(), new Object[0]);
            EventBus.getDefault().post(new LocationEvent(null));
            LocWeatherManager.getInstance().cancelLocation();
        }
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void optionLocationService(LocationOption locationOption) {
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        if (LocationOption.a.HighAccuracy == locationOption.getMode()) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        } else if (LocationOption.a.BatterySave == locationOption.getMode()) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        } else if (LocationOption.a.GpsOnly == locationOption.getMode()) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Device_Sensors);
        }
        aMapLocationClientOption.setNeedAddress(locationOption.b());
        aMapLocationClientOption.setOnceLocation(true);
        this.c.setLocationOption(aMapLocationClientOption);
        this.c.setLocationListener(this);
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void registerLocationListener(LocationListener locationListener) {
        this.b = locationListener;
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void startLocation() {
        HMLog.d(d, "Start MyLocation!!", new Object[0]);
        this.c.startLocation();
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void stopLocation() {
        HMLog.d(d, "Stop MyLocation!!", new Object[0]);
        this.c.stopLocation();
    }
}
