package com.huami.watch.companion.location;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class AMapLocationService implements LocationService, AMapLocationListener {
    private static final String e = "Location-AMapService";
    private Context a;
    private AMapLocationClient b;
    private AMapLocationClientOption c;
    private LocationListener d;

    public AMapLocationService(Context context) {
        this.a = context;
        AMapLocationClient aMapLocationClient = new AMapLocationClient(context.getApplicationContext());
        this.b = aMapLocationClient;
        aMapLocationClient.setLocationListener(this);
    }

    private void a(@NonNull AMapLocation aMapLocation) {
        StringBuilder sb = new StringBuilder();
        sb.append("Location : " + aMapLocation.getLatitude() + "  " + aMapLocation.getLongitude());
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Accuracy : ");
        sb2.append(String.valueOf(aMapLocation.getAccuracy()));
        sb.append(sb2.toString());
        sb.append('\n');
        sb.append("Provider : " + aMapLocation.getProvider());
        sb.append('\n');
        sb.append("Time : " + TimeUtil.formatDateTime(aMapLocation.getTime()));
        sb.append('\n');
        sb.append("Address : " + aMapLocation.getAddress());
        sb.append('\n');
        sb.append("Addr Province : " + aMapLocation.getProvince());
        sb.append('\n');
        sb.append("Addr City : " + aMapLocation.getCity());
        sb.append('\n');
        sb.append("Addr CityCode : " + aMapLocation.getCityCode());
        sb.append('\n');
        sb.append("Addr District : " + aMapLocation.getDistrict());
        sb.append('\n');
        sb.append("Addr Stress : " + aMapLocation.getStreet());
        sb.append('\n');
        sb.append("Addr AddrCode : " + aMapLocation.getAdCode());
        Log.d(e, aMapLocation.toString() + " : \n<" + sb.toString() + SearchCriteria.GT, new Object[0]);
    }

    private Location b(AMapLocation aMapLocation) {
        Location location = new Location();
        location.setLatitude(aMapLocation.getLatitude());
        location.setLongitude(aMapLocation.getLongitude());
        Location.Address address = new Location.Address();
        address.setAdmin(aMapLocation.getProvince());
        address.setLocality(aMapLocation.getCity());
        address.setSubLocality(aMapLocation.getDistrict());
        address.setThoroughfare(aMapLocation.getStreet());
        address.setAdCode(aMapLocation.getAdCode());
        address.setCityCode(aMapLocation.getCityCode());
        if (!TextUtils.isEmpty(address.getAdmin()) && !TextUtils.isEmpty(address.getLocality()) && !TextUtils.isEmpty(address.getSubLocality())) {
            location.setAddress(address);
        }
        return location;
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void cancelLocation() {
        Log.d(e, "Cancel Location!!", new Object[0]);
        this.b.stopLocation();
        this.b.onDestroy();
    }

    @Override // com.huami.watch.companion.location.LocationService
    public Location getLastLocation() {
        AMapLocation lastKnownLocation = this.b.getLastKnownLocation();
        Log.d(e, "Last AMap Known Location : ", new Object[0]);
        if (lastKnownLocation == null) {
            return null;
        }
        a(lastKnownLocation);
        return b(lastKnownLocation);
    }

    @Override // com.amap.api.location.AMapLocationListener
    public void onLocationChanged(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            Log.w(e, "AMapLocation Null!!", new Object[0]);
            return;
        }
        int errorCode = aMapLocation.getErrorCode();
        if (errorCode == 0) {
            a(aMapLocation);
            if (this.d != null) {
                this.d.onLocationReceived(b(aMapLocation));
                return;
            }
            return;
        }
        Log.w(e, "ErrorCode : " + errorCode, new Object[0]);
        LocationListener locationListener = this.d;
        if (locationListener != null) {
            if (errorCode == 4) {
                locationListener.onLocationError(1);
            } else if (errorCode == 13 || errorCode == 12) {
                locationListener.onLocationError(2);
            }
        }
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void optionLocationService(LocationOption locationOption) {
        LocationOption.LocationMode mode = locationOption.getMode();
        long updateInterval = locationOption.getUpdateInterval();
        boolean zIsNeedAddress = locationOption.isNeedAddress();
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        this.c = aMapLocationClientOption;
        if (LocationOption.LocationMode.HighAccuracy == mode) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        } else if (LocationOption.LocationMode.BatterySave == mode) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        } else if (LocationOption.LocationMode.GpsOnly == mode) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Device_Sensors);
        }
        this.c.setNeedAddress(zIsNeedAddress);
        this.c.setInterval(updateInterval);
        this.c.setOnceLocation(true);
        this.c.setOnceLocationLatest(true);
        AMapLocationClientOption.setLocationProtocol(AMapLocationClientOption.AMapLocationProtocol.HTTPS);
        this.b.setLocationOption(this.c);
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void registerLocationListener(LocationListener locationListener) {
        this.d = locationListener;
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void startLocation() {
        Log.d(e, "Start Location!!", new Object[0]);
        this.b.startLocation();
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void stopLocation() {
        Log.d(e, "Stop Location!!", new Object[0]);
        this.b.stopLocation();
    }
}
