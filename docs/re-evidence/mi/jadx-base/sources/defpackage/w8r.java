package defpackage;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.amap.api.maps.model.LatLng;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class w8r extends rf2 {
    public static w8r f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f37730b;
    public LocationManager c;
    public LocationListener d;
    public boolean e = false;

    public class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kah f37731a;

        public a(kah kahVar) {
            this.f37731a = kahVar;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            double d;
            double d2;
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            if (l5.y(Double.valueOf(latitude), Double.valueOf(longitude)).booleanValue()) {
                new LatLng(latitude, longitude);
                double[] dArrC = bxa.c(latitude, longitude);
                double d3 = dArrC[1];
                double d4 = dArrC[0];
                Logger.i("ChinaAndroid", "invokeLocation isAMapDataAvailable longitude = " + d3 + " latitude = " + d4);
                d = d3;
                d2 = d4;
            } else {
                d = longitude;
                d2 = latitude;
            }
            Logger.i("ChinaAndroid", "location success, longitude:" + d + "latitude：" + d2);
            kah kahVar = this.f37731a;
            if (kahVar != null) {
                kahVar.locationSuccess(d2, d, location.getAltitude());
            }
            w8r.this.h();
            w8r.this.d = null;
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            Logger.i("ChinaAndroid", "onProviderDisabled  " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            Logger.i("ChinaAndroid", "onProviderEnabled  " + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            Logger.i("ChinaAndroid", "onStatusChanged  provider:" + str + "   status:" + i);
            if (i != 2) {
                String str2 = str + ", status = " + w8r.this.f(i);
                kah kahVar = this.f37731a;
                if (kahVar != null) {
                    kahVar.locationFail(str2);
                }
                Logger.i("ChinaAndroid", "startLocation agin");
                w8r.this.h();
            }
        }
    }

    public w8r(Context context) {
        this.f37730b = context;
    }

    public static w8r e(Context context) {
        if (f == null) {
            f = new w8r(context);
        }
        return f;
    }

    @Override // defpackage.rf2
    public void a(boolean z) {
        this.c = (LocationManager) this.f37730b.getSystemService("location");
    }

    @Override // defpackage.rf2
    public void b(boolean z, kah kahVar) {
        FitnessLogUtils.i("ChinaAndroid", "isPositioning:" + this.e);
        if (this.e) {
            return;
        }
        Logger.i("ChinaAndroid", "use china location");
        if (this.d != null) {
            Logger.i("china stop pre location", new Object[0]);
            h();
        }
        this.d = new a(kahVar);
        g();
        this.f32481a.postDelayed(new Runnable() { // from class: u8r
            @Override // java.lang.Runnable
            public final void run() {
                this.f35527a.h();
            }
        }, 60000L);
    }

    public final String f(int i) {
        if (i == 0) {
            return "out of service";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "available";
        }
        return "temporarily unavailable";
    }

    public void g() {
        Logger.i("ChinaAndroid", "startLocation");
        this.e = true;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(true);
        criteria.setCostAllowed(true);
        criteria.setSpeedRequired(true);
        criteria.setPowerRequirement(1);
        criteria.setBearingAccuracy(1);
        criteria.setSpeedAccuracy(1);
        criteria.setHorizontalAccuracy(1);
        criteria.setVerticalAccuracy(1);
        try {
            Logger.i("ChinaAndroid", "requestLocationUpdates");
            this.c.requestLocationUpdates(100L, 1.0f, criteria, this.d, Looper.getMainLooper());
        } catch (IllegalArgumentException | SecurityException e) {
            Logger.i("ChinaAndroid", "requestLocationUpdates 1", e);
            try {
                Logger.i("ChinaAndroid", "requestLocationUpdates LocationManager.NETWORK_PROVIDER");
                this.c.requestLocationUpdates("network", 1000L, 10.0f, this.d, Looper.getMainLooper());
            } catch (Exception e2) {
                Logger.i("ChinaAndroid", "requestLocationUpdates 2", e2);
            }
        }
    }

    public void h() {
        Logger.i("ChinaAndroid", "stopLocation");
        this.e = false;
        if (this.c == null || this.d == null) {
            return;
        }
        Logger.i("ChinaAndroid", "stopLocation");
        this.c.removeUpdates(this.d);
    }
}
