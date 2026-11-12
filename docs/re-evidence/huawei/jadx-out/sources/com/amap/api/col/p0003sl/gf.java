package com.amap.api.col.p0003sl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.services.auto.AutoTChargeStationResult;
import com.amap.api.services.auto.AutoTSearch;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiResultV2;
import com.amap.api.services.poisearch.PoiSearch;
import com.amap.api.services.poisearch.PoiSearchV2;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.BusRouteResultV2;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.DriveRouteResultV2;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RideRouteResultV2;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.RouteSearchV2;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.route.WalkRouteResultV2;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.amap.api.services.share.ShareSearch;
import com.amap.api.services.weather.LocalWeatherForecastResult;
import com.amap.api.services.weather.LocalWeatherLiveResult;
import com.amap.api.services.weather.WeatherSearch;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gf extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static gf f2550a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AutoTChargeStationResult f2551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AutoTSearch.OnChargeStationListener f2552b;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BusLineResult f2553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BusLineSearch.OnBusLineSearchListener f2554b;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BusStationResult f2555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BusStationSearch.OnBusStationSearchListener f2556b;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CloudItemDetail f2557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CloudSearch.OnCloudSearchListener f2558b;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CloudResult f2559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CloudSearch.OnCloudSearchListener f2560b;
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GeocodeResult f2561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GeocodeSearch.OnGeocodeSearchListener f2562b;
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<NearbySearch.NearbyListener> f2563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public NearbySearchResult f2564b;
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiItem f2565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearch.OnPoiSearchListener f2566b;
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiItemV2 f2567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearchV2.OnPoiSearchListener f2568b;
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiResult f2569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearch.OnPoiSearchListener f2570b;
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiResultV2 f2571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearchV2.OnPoiSearchListener f2572b;
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RegeocodeResult f2573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GeocodeSearch.OnGeocodeSearchListener f2574b;
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RoutePOISearchResult f2575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RoutePOISearch.OnRoutePOISearchListener f2576b;
    }

    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalWeatherForecastResult f2577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeatherSearch.OnWeatherSearchListener f2578b;
    }

    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalWeatherLiveResult f2579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeatherSearch.OnWeatherSearchListener f2580b;
    }

    public static gf a() {
        gf gfVar;
        synchronized (gf.class) {
            if (f2550a == null) {
                if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
                    f2550a = new gf(Looper.getMainLooper());
                } else {
                    f2550a = new gf();
                }
            }
            gfVar = f2550a;
        }
        return gfVar;
    }

    gf() {
    }

    private gf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i2 = message.arg1;
            if (i2 != 101) {
                switch (i2) {
                    case 1:
                        m(message);
                        break;
                    case 2:
                        j(message);
                        break;
                    case 3:
                        l(message);
                        break;
                    case 4:
                        k(message);
                        break;
                    case 5:
                        i(message);
                        break;
                    case 6:
                        f(message);
                        break;
                    case 7:
                        e(message);
                        break;
                    case 8:
                        d(message);
                        break;
                    case 9:
                        c(message);
                        break;
                    case 10:
                        b(message);
                        break;
                    case 11:
                        a(message);
                        break;
                    case 12:
                        q(message);
                        break;
                    case 13:
                        r(message);
                        break;
                    case 14:
                        s(message);
                        break;
                    default:
                        switch (i2) {
                            case 16:
                                t(message);
                                break;
                            case 17:
                                o(message);
                                break;
                            case 18:
                                p(message);
                                break;
                            case 19:
                                g(message);
                                break;
                            case 20:
                                h(message);
                                break;
                        }
                        break;
                }
                return;
            }
            n(message);
        } catch (Throwable th) {
            fu.a(th, "MessageHandler", "handleMessage");
        }
    }

    private static void a(Message message) {
        int i2 = message.arg2;
        ShareSearch.OnShareSearchListener onShareSearchListener = (ShareSearch.OnShareSearchListener) message.obj;
        String string = message.getData().getString("shareurlkey");
        if (onShareSearchListener == null) {
            return;
        }
        switch (message.what) {
            case 1100:
                onShareSearchListener.onPoiShareUrlSearched(string, i2);
                break;
            case 1101:
                onShareSearchListener.onLocationShareUrlSearched(string, i2);
                break;
            case 1102:
                onShareSearchListener.onNaviShareUrlSearched(string, i2);
                break;
            case 1103:
                onShareSearchListener.onBusRouteShareUrlSearched(string, i2);
                break;
            case ExceptionCode.CHECK_FILE_HASH_FAILED /* 1104 */:
                onShareSearchListener.onDrivingRouteShareUrlSearched(string, i2);
                break;
            case ExceptionCode.CHECK_FILE_SIZE_FAILED /* 1105 */:
                onShareSearchListener.onWalkRouteShareUrlSearched(string, i2);
                break;
        }
    }

    private static void b(Message message) {
        List list = (List) message.obj;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((NearbySearch.NearbyListener) it.next()).onNearbyInfoUploaded(message.what);
        }
    }

    private static void c(Message message) {
        List<NearbySearch.NearbyListener> list;
        g gVar = (g) message.obj;
        if (gVar == null || (list = gVar.f2563a) == null || list.size() == 0) {
            return;
        }
        NearbySearchResult nearbySearchResult = message.what == 1000 ? gVar.f2564b : null;
        Iterator<NearbySearch.NearbyListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onNearbyInfoSearched(nearbySearchResult, message.what);
        }
    }

    private static void d(Message message) {
        List list = (List) message.obj;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((NearbySearch.NearbyListener) it.next()).onUserInfoCleared(message.what);
        }
    }

    private static void e(Message message) {
        BusStationSearch.OnBusStationSearchListener onBusStationSearchListener;
        c cVar = (c) message.obj;
        if (cVar == null || (onBusStationSearchListener = cVar.f2556b) == null) {
            return;
        }
        onBusStationSearchListener.onBusStationSearched(message.what == 1000 ? cVar.f2555a : null, message.what);
    }

    private static void f(Message message) {
        h hVar;
        PoiSearch.OnPoiSearchListener onPoiSearchListener;
        Bundle data;
        if (message.what == 600) {
            j jVar = (j) message.obj;
            if (jVar == null || (onPoiSearchListener = jVar.f2570b) == null || (data = message.getData()) == null) {
                return;
            }
            onPoiSearchListener.onPoiSearched(jVar.f2569a, data.getInt("errorCode"));
            return;
        }
        if (message.what != 602 || (hVar = (h) message.obj) == null) {
            return;
        }
        PoiSearch.OnPoiSearchListener onPoiSearchListener2 = hVar.f2566b;
        Bundle data2 = message.getData();
        if (data2 != null) {
            onPoiSearchListener2.onPoiItemSearched(hVar.f2565a, data2.getInt("errorCode"));
        }
    }

    private static void g(Message message) {
        i iVar;
        PoiSearchV2.OnPoiSearchListener onPoiSearchListener;
        Bundle data;
        if (message.what == 603) {
            k kVar = (k) message.obj;
            if (kVar == null || (onPoiSearchListener = kVar.f2572b) == null || (data = message.getData()) == null) {
                return;
            }
            onPoiSearchListener.onPoiSearched(kVar.f2571a, data.getInt("errorCode"));
            return;
        }
        if (message.what != 604 || (iVar = (i) message.obj) == null) {
            return;
        }
        PoiSearchV2.OnPoiSearchListener onPoiSearchListener2 = iVar.f2568b;
        Bundle data2 = message.getData();
        if (data2 != null) {
            onPoiSearchListener2.onPoiItemSearched(iVar.f2567a, data2.getInt("errorCode"));
        }
    }

    private static void h(Message message) {
        a aVar;
        if (message.what != 600 || (aVar = (a) message.obj) == null) {
            return;
        }
        AutoTSearch.OnChargeStationListener onChargeStationListener = aVar.f2552b;
        Bundle data = message.getData();
        if (data != null) {
            int i2 = data.getInt("errorCode");
            if (onChargeStationListener != null) {
                onChargeStationListener.onChargeStationSearched(aVar.f2551a, i2);
            }
        }
    }

    private static void i(Message message) {
        Inputtips.InputtipsListener inputtipsListener = (Inputtips.InputtipsListener) message.obj;
        if (inputtipsListener == null) {
            return;
        }
        inputtipsListener.onGetInputtips(message.what == 1000 ? message.getData().getParcelableArrayList("result") : null, message.what);
    }

    private static void j(Message message) {
        f fVar;
        GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener;
        GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener2;
        if (message.what == 201) {
            l lVar = (l) message.obj;
            if (lVar == null || (onGeocodeSearchListener2 = lVar.f2574b) == null) {
                return;
            }
            onGeocodeSearchListener2.onRegeocodeSearched(lVar.f2573a, message.arg2);
            return;
        }
        if (message.what != 200 || (fVar = (f) message.obj) == null || (onGeocodeSearchListener = fVar.f2562b) == null) {
            return;
        }
        onGeocodeSearchListener.onGeocodeSearched(fVar.f2561a, message.arg2);
    }

    private static void k(Message message) {
        DistrictSearch.OnDistrictSearchListener onDistrictSearchListener = (DistrictSearch.OnDistrictSearchListener) message.obj;
        if (onDistrictSearchListener == null) {
            return;
        }
        onDistrictSearchListener.onDistrictSearched((DistrictResult) message.getData().getParcelable("result"));
    }

    private static void l(Message message) {
        BusLineSearch.OnBusLineSearchListener onBusLineSearchListener;
        b bVar = (b) message.obj;
        if (bVar == null || (onBusLineSearchListener = bVar.f2554b) == null) {
            return;
        }
        onBusLineSearchListener.onBusLineSearched(message.what == 1000 ? bVar.f2553a : null, message.what);
    }

    private static void m(Message message) {
        Bundle data;
        RouteSearch.OnRouteSearchListener onRouteSearchListener = (RouteSearch.OnRouteSearchListener) message.obj;
        if (onRouteSearchListener == null) {
            return;
        }
        if (message.what == 100) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                onRouteSearchListener.onBusRouteSearched((BusRouteResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what == 101) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                onRouteSearchListener.onDriveRouteSearched((DriveRouteResult) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                onRouteSearchListener.onWalkRouteSearched((WalkRouteResult) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what == 103) {
            Bundle data5 = message.getData();
            if (data5 != null) {
                onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data5.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what != 104 || (data = message.getData()) == null) {
            return;
        }
        onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    private static void n(Message message) {
        Bundle data;
        RouteSearchV2.OnRouteSearchListener onRouteSearchListener = (RouteSearchV2.OnRouteSearchListener) message.obj;
        if (onRouteSearchListener == null) {
            return;
        }
        if (message.what == 101) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                onRouteSearchListener.onDriveRouteSearched((DriveRouteResultV2) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what == 100) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                onRouteSearchListener.onBusRouteSearched((BusRouteResultV2) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                onRouteSearchListener.onWalkRouteSearched((WalkRouteResultV2) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                return;
            }
            return;
        }
        if (message.what != 103 || (data = message.getData()) == null) {
            return;
        }
        onRouteSearchListener.onRideRouteSearched((RideRouteResultV2) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    private static void o(Message message) {
        Bundle data;
        RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener = (RouteSearch.OnTruckRouteSearchListener) message.obj;
        if (onTruckRouteSearchListener == null || message.what != 104 || (data = message.getData()) == null) {
            return;
        }
        onTruckRouteSearchListener.onTruckRouteSearched((TruckRouteRestult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    private static void p(Message message) {
        Bundle data;
        RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener = (RouteSearch.OnRoutePlanSearchListener) message.obj;
        if (onRoutePlanSearchListener == null || message.what != 105 || (data = message.getData()) == null) {
            return;
        }
        int i2 = data.getInt("errorCode");
        DriveRoutePlanResult driveRoutePlanResult = (DriveRoutePlanResult) message.getData().getParcelable("result");
        if (onRoutePlanSearchListener != null) {
            onRoutePlanSearchListener.onDriveRoutePlanSearched(driveRoutePlanResult, i2);
        }
    }

    private static void q(Message message) {
        d dVar;
        if (message.what == 700) {
            e eVar = (e) message.obj;
            if (eVar == null) {
                return;
            }
            eVar.f2560b.onCloudSearched(eVar.f2559a, message.arg2);
            return;
        }
        if (message.what != 701 || (dVar = (d) message.obj) == null) {
            return;
        }
        dVar.f2558b.onCloudItemDetailSearched(dVar.f2557a, message.arg2);
    }

    private static void r(Message message) {
        n nVar;
        WeatherSearch.OnWeatherSearchListener onWeatherSearchListener;
        Bundle data;
        WeatherSearch.OnWeatherSearchListener onWeatherSearchListener2;
        Bundle data2;
        if (message.what == 1301) {
            o oVar = (o) message.obj;
            if (oVar == null || (onWeatherSearchListener2 = oVar.f2580b) == null || (data2 = message.getData()) == null) {
                return;
            }
            onWeatherSearchListener2.onWeatherLiveSearched(oVar.f2579a, data2.getInt("errorCode"));
            return;
        }
        if (message.what != 1302 || (nVar = (n) message.obj) == null || (onWeatherSearchListener = nVar.f2578b) == null || (data = message.getData()) == null) {
            return;
        }
        onWeatherSearchListener.onWeatherForecastSearched(nVar.f2577a, data.getInt("errorCode"));
    }

    private static void s(Message message) {
        RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener;
        Bundle data;
        m mVar = (m) message.obj;
        if (mVar == null || (onRoutePOISearchListener = mVar.f2576b) == null || (data = message.getData()) == null) {
            return;
        }
        onRoutePOISearchListener.onRoutePoiSearched(mVar.f2575a, data.getInt("errorCode"));
    }

    private static void t(Message message) {
        Bundle data;
        DistanceSearch.OnDistanceSearchListener onDistanceSearchListener = (DistanceSearch.OnDistanceSearchListener) message.obj;
        if (onDistanceSearchListener == null || message.what != 400 || (data = message.getData()) == null) {
            return;
        }
        onDistanceSearchListener.onDistanceSearched((DistanceResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }
}
