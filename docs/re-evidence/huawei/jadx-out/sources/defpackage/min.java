package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.callback.HwLocationCallback;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwmap.callback.ReverseGeocodeResultCallback;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import health.compact.a.Utils;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class min {
    private static min d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f41714b;
    private Location g;
    private npg n;
    private long i = 0;
    private boolean f = false;
    private Semaphore o = new Semaphore(1);
    private Handler l = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f41715c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwLocationCallback f41713a = null;
    private ILoactionCallback j = new ILoactionCallback() { // from class: min.1
        @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
        public void dispatchLocationChanged(Location location) {
            LogUtil.a("HwLocationUtil", "checkNewVersion location dispatchLocationChanged");
            if (min.this.l != null) {
                min.this.l.removeMessages(40);
            }
            if (min.this.n != null) {
                min.this.d();
            }
            min.this.g = location;
            min.this.c();
        }
    };
    private ServiceConnection h = new ServiceConnection() { // from class: min.3
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.a("HwLocationUtil", "getFromLocation onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            min.this.f = false;
            LogUtil.a("HwLocationUtil", "getFromLocation onServiceDisconnected");
        }
    };

    private min(Context context) {
        this.f41714b = context;
        e();
    }

    public void c(String str, HwLocationCallback hwLocationCallback) {
        try {
            this.o.acquire();
        } catch (InterruptedException e2) {
            LogUtil.e("HwLocationUtil", "initLocation Exception", ExceptionUtils.c(e2));
        }
        this.f41713a = hwLocationCallback;
        if (TextUtils.isEmpty(str)) {
            e("initLocation deviceId is null");
            return;
        }
        if (Math.abs(System.currentTimeMillis() - this.i) < 1800000) {
            e("initLocation is DURING_BINDING_TIME");
            return;
        }
        if (!Utils.o() && a() && nvd.j(str)) {
            LogUtil.a("HwLocationUtil", "can start to initLocation");
            if (this.n == null) {
                this.n = npg.d();
            }
            ArrayList arrayList = new ArrayList(0);
            arrayList.add("network");
            arrayList.add(GeocodeSearch.GPS);
            Location locationC = this.n.c(arrayList);
            if (locationC == null) {
                locationC = this.n.c();
            }
            arrayList.clear();
            if (locationC != null) {
                LogUtil.a("HwLocationUtil", "get location != null");
                this.g = locationC;
                c();
                return;
            } else {
                if (!TextUtils.isEmpty(nvd.g(this.f41714b)) && !nvd.i()) {
                    e("initLocation is existent");
                    return;
                }
                this.n.a(this.j, "wearCheckVersionLocation");
                Handler handler = this.l;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(40, 10000L);
                    return;
                }
                return;
            }
        }
        e("checkNewVersion no initLocation");
    }

    private boolean a() {
        Object systemService = BaseApplication.getContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            return locationManager.isProviderEnabled(GeocodeSearch.GPS) || locationManager.isProviderEnabled("network");
        }
        LogUtil.a("HwLocationUtil", "checkLocationServiceStatus() if (locationManager == null)");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HwLocationUtil", "processLocationForQuery() ENTER");
        nvd.r(this.f41714b);
        ThreadPoolManager.c().execute(new Runnable() { // from class: min.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LogUtil.a("HwLocationUtil", "dispatchLocationChanged location result");
                    double latitude = min.this.g.getLatitude();
                    double longitude = min.this.g.getLongitude();
                    double dDoubleValue = new BigDecimal(latitude).setScale(3, 4).doubleValue();
                    double dDoubleValue2 = new BigDecimal(longitude).setScale(3, 4).doubleValue();
                    if (cop.f()) {
                        min.this.l.sendEmptyMessageDelayed(41, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        min.this.b(dDoubleValue, dDoubleValue2);
                        return;
                    }
                    List<Address> fromLocation = new Geocoder(BaseApplication.getContext(), Locale.getDefault()).getFromLocation(dDoubleValue, dDoubleValue2, 1);
                    LogUtil.a("HwLocationUtil", "processLocationForQuery getFromLocation end");
                    min.this.h();
                    if (min.this.l != null) {
                        min.this.l.removeMessages(41);
                    }
                    if (fromLocation != null && fromLocation.size() > 0) {
                        if (fromLocation.get(0) instanceof Address) {
                            Address address = fromLocation.get(0);
                            if (address.getSubLocality() == null) {
                                min.this.e("location result getSubLocality is null");
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("country", address.getCountryCode());
                            jSONObject.put(DistrictSearchQuery.KEYWORDS_PROVINCE, address.getAdminArea());
                            jSONObject.put(DistrictSearchQuery.KEYWORDS_CITY, address.getLocality());
                            jSONObject.put("area", address.getSubLocality());
                            nvd.y(min.this.f41714b, address.getCountryCode() + "|" + address.getAdminArea() + "|" + address.getLocality() + "|" + address.getSubLocality());
                            nvd.w(min.this.f41714b, jSONObject.toString());
                            min.this.i = System.currentTimeMillis();
                            min.this.e("location request success");
                            return;
                        }
                        return;
                    }
                    min.this.e("location result is null");
                } catch (IOException | IllegalArgumentException | IllegalStateException | JSONException e2) {
                    min.this.e("processLocationForQuery Exception " + ExceptionUtils.c(e2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(double d2, double d3) {
        try {
            List<Address> fromLocation = new Geocoder(BaseApplication.getContext(), Locale.getDefault()).getFromLocation(d2, d3, 1);
            LogUtil.a("HwLocationUtil", "getFromLocationForRVersion getFromLocation end");
            h();
            Handler handler = this.l;
            if (handler != null) {
                handler.removeMessages(41);
            }
            if (fromLocation != null && fromLocation.size() > 0) {
                if (fromLocation.get(0) instanceof Address) {
                    Address address = fromLocation.get(0);
                    if (address.getSubLocality() == null) {
                        c(d2, d3);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("country", address.getCountryCode());
                    jSONObject.put(DistrictSearchQuery.KEYWORDS_PROVINCE, address.getAdminArea());
                    jSONObject.put(DistrictSearchQuery.KEYWORDS_CITY, address.getLocality());
                    jSONObject.put("area", address.getSubLocality());
                    nvd.y(this.f41714b, address.getCountryCode() + "|" + address.getAdminArea() + "|" + address.getLocality() + "|" + address.getSubLocality());
                    nvd.w(this.f41714b, jSONObject.toString());
                    this.i = System.currentTimeMillis();
                    e("location request success");
                    return;
                }
                c(d2, d3);
                return;
            }
            c(d2, d3);
        } catch (IOException | IllegalArgumentException | IllegalStateException | JSONException e2) {
            LogUtil.j("HwLocationUtil", "getFromLocationForRVersion exception :", ExceptionUtils.c(e2));
            c(d2, d3);
        }
    }

    private void c(double d2, double d3) {
        LogUtil.a("HwLocationUtil", "hwreverseGeocode requestMapsLocation location result");
        npx.a("HwLocationUtil", d3, d2, null, null, new ReverseGeocodeResultCallback() { // from class: min.5
            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onSuccess(ReverseGeocodeResponse reverseGeocodeResponse) {
                LogUtil.a("HwLocationUtil", "onRegeocodeSearched code ", reverseGeocodeResponse.getReturnCode());
                if (reverseGeocodeResponse == null || CollectionUtils.a(reverseGeocodeResponse.getSites())) {
                    min.this.e("requestMapsLocation regeocodeResult == null");
                    return;
                }
                ReverseGeocodeResponse.Site site = reverseGeocodeResponse.getSites().get(0);
                if (site == null || site.getAddress() == null) {
                    min.this.e("requestMapsLocation regeocodeResult == null");
                    return;
                }
                ReverseGeocodeResponse.Address address = site.getAddress();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("country", address.getCountry());
                    jSONObject.put(DistrictSearchQuery.KEYWORDS_PROVINCE, address.getAdminArea());
                    jSONObject.put(DistrictSearchQuery.KEYWORDS_CITY, address.getSubAdminArea());
                    jSONObject.put("area", address.getTertiaryAdminArea());
                    nvd.y(min.this.f41714b, address.getCountry() + "|" + address.getAdminArea() + "|" + address.getCity() + "|" + address.getTertiaryAdminArea());
                    nvd.w(BaseApplication.getContext(), jSONObject.toString());
                    min.this.i = System.currentTimeMillis();
                    min.this.e("location request success");
                } catch (JSONException e2) {
                    min.this.e("requestMapsLocation JSONException" + ExceptionUtils.c(e2));
                }
            }

            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onFailure(Throwable th) {
                min.this.e("requestMapsLocation AMapException: " + ExceptionUtils.c(th));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        HwLocationCallback hwLocationCallback = this.f41713a;
        if (hwLocationCallback != null) {
            hwLocationCallback.onResult(str);
        }
        this.o.release();
    }

    public void d() {
        LogUtil.a("HwLocationUtil", "stopLocationPosition() ENTER");
        npg npgVar = this.n;
        if (npgVar != null) {
            npgVar.c("wearCheckVersionLocation");
        }
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("HwLocationUtil");
        this.f41715c = handlerThread;
        handlerThread.start();
        this.l = new b(this.f41715c.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.h == null || !this.f) {
            return;
        }
        try {
            BaseApplication.getContext().unbindService(this.h);
            this.f = false;
            LogUtil.a("HwLocationUtil", "unBindLBSService");
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HwLocationUtil", "unBindLBSService exception");
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 40) {
                min.this.e("location time out");
                min.this.d();
                return;
            }
            if (i == 41) {
                Intent intent = new Intent();
                intent.setClassName("com.huawei.lbs", "com.huawei.lbs.HwLBSService");
                try {
                    min.this.f = true;
                    boolean zBindService = BaseApplication.getContext().bindService(intent, min.this.h, 1);
                    if (!zBindService) {
                        min.this.f = false;
                    }
                    LogUtil.a("HwLocationUtil", "getFromLocation bindLBSService result is ", Boolean.valueOf(zBindService));
                } catch (SecurityException e) {
                    LogUtil.j("HwLocationUtil", "start HwLBSService service SecurityException ,e = ", ExceptionUtils.c(e));
                }
            }
            LogUtil.j("HwLocationUtil", "handleMessage error");
        }
    }

    public static min b() {
        min minVar;
        synchronized (e) {
            if (d == null) {
                d = new min(BaseApplication.getContext());
            }
            minVar = d;
        }
        return minVar;
    }
}
