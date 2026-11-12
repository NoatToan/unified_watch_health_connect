package defpackage;

import android.content.Context;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.SystemClock;
import android.provider.Settings;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class npn {
    public static npf b(GpsStatus gpsStatus) {
        if (gpsStatus == null) {
            LogUtil.d("Track_DealGpsUtils", "getGpsSnr gpsStatus is null");
            return null;
        }
        int maxSatellites = gpsStatus.getMaxSatellites();
        ArrayList arrayList = new ArrayList();
        if (gpsStatus.getSatellites() != null) {
            Iterator<GpsSatellite> it = gpsStatus.getSatellites().iterator();
            int i = 0;
            while (it.hasNext() && i <= maxSatellites) {
                arrayList.add(Float.valueOf(it.next().getSnr()));
                i++;
            }
            if (i != 0) {
                return new npf(arrayList, i);
            }
        }
        return null;
    }

    public static npf d(GnssStatus gnssStatus) {
        if (gnssStatus == null) {
            LogUtil.d("Track_DealGpsUtils", "getGpsSnr gpsStatus is null");
            return null;
        }
        int satelliteCount = gnssStatus.getSatelliteCount();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < satelliteCount; i2++) {
            if (gnssStatus.usedInFix(i2)) {
                arrayList.add(Float.valueOf(gnssStatus.getCn0DbHz(i2)));
                i++;
            }
        }
        if (i != 0) {
            return new npf(arrayList, i);
        }
        return null;
    }

    public static int c(npf npfVar) {
        if (npfVar == null) {
            return 0;
        }
        float fE = e(npfVar.a());
        int iC = npfVar.c();
        if (fE >= 30.0f && iC >= 11) {
            return 6;
        }
        if (fE <= 20.0f || iC < 9) {
            return (fE <= 20.0f || iC < 4) ? 2 : 4;
        }
        return 5;
    }

    public static float e(List<Float> list) {
        if (list == null) {
            return 0.0f;
        }
        Collections.sort(list, new Comparator<Float>() { // from class: npn.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(Float f, Float f2) {
                return f.floatValue() > f2.floatValue() ? -1 : 0;
            }
        });
        float fFloatValue = list.get(0).floatValue();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - npk.d() > 30000) {
            npk.e(jElapsedRealtime);
        }
        return fFloatValue;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Settings.Secure.putInt(context.getContentResolver(), "location_mode", 3);
        } catch (SecurityException unused) {
            LogUtil.e("Track_DealGpsUtils", "isOpenGps: No permission or not release version");
        }
        return c(context);
    }

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.e("Track_DealGpsUtils", "isNetworkEnable: context is null");
            return false;
        }
        Object systemService = context.getSystemService("location");
        if (!(systemService instanceof LocationManager)) {
            return false;
        }
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("GpsMockProvider");
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.j("Track_DealGpsUtils", "isGpsEnabled, context is null.");
            return false;
        }
        final Object systemService = context.getSystemService("location");
        if (!(systemService instanceof LocationManager)) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        ThreadPoolManager.c().execute(new Runnable() { // from class: npo
            @Override // java.lang.Runnable
            public final void run() {
                npn.c(systemService, zArr, countDownLatch);
            }
        });
        try {
            LogUtil.a("Track_DealGpsUtils", "isGpsEnabled isOnTime:", Boolean.valueOf(countDownLatch.await(3L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.j("Track_DealGpsUtils", "isGpsEnabled InterruptedException");
        }
        return zArr[0];
    }

    static /* synthetic */ void c(Object obj, boolean[] zArr, CountDownLatch countDownLatch) {
        LocationManager locationManager = (LocationManager) obj;
        if (locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
            if (locationManager.isProviderEnabled("network")) {
                LogUtil.a("Track_DealGpsUtils", "isGpsEnabled current is gps & network provider support.");
            } else {
                LogUtil.a("Track_DealGpsUtils", "isGpsEnabled current is only gps provider support");
            }
            zArr[0] = true;
        } else if (locationManager.isProviderEnabled("GpsMockProvider")) {
            LogUtil.a("Track_DealGpsUtils", " Mock GPS provider running!!!");
            zArr[0] = true;
        } else {
            LogUtil.j("Track_DealGpsUtils", "isGpsEnabled gps disabled");
            zArr[0] = false;
        }
        countDownLatch.countDown();
    }

    public static void d(Context context) {
        if (context == null) {
            return;
        }
        try {
            Settings.Secure.putInt(context.getContentResolver(), "location_mode", 3);
        } catch (SecurityException unused) {
            LogUtil.e("Track_DealGpsUtils", "openNetworkLocation: No permission or not release version");
        }
    }
}
