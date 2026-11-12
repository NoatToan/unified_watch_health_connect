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
import com.amap.api.services.core.AMapException;
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
import com.mibi.sdk.common.MibiSdkConstants;
import defpackage.xts;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static y f6321a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AutoTChargeStationResult f6322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AutoTSearch.OnChargeStationListener f6323b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BusLineResult f6324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BusLineSearch.OnBusLineSearchListener f6325b;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BusStationResult f6326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BusStationSearch.OnBusStationSearchListener f6327b;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CloudItemDetail f6328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CloudSearch.OnCloudSearchListener f6329b;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CloudResult f6330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CloudSearch.OnCloudSearchListener f6331b;
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GeocodeResult f6332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GeocodeSearch.OnGeocodeSearchListener f6333b;
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<NearbySearch.NearbyListener> f6334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public NearbySearchResult f6335b;
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiItem f6336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearch.OnPoiSearchListener f6337b;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiItemV2 f6338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearchV2.OnPoiSearchListener f6339b;
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiResult f6340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearch.OnPoiSearchListener f6341b;
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PoiResultV2 f6342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PoiSearchV2.OnPoiSearchListener f6343b;
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RegeocodeResult f6344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GeocodeSearch.OnGeocodeSearchListener f6345b;
    }

    public static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RoutePOISearchResult f6346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RoutePOISearch.OnRoutePOISearchListener f6347b;
    }

    public static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalWeatherForecastResult f6348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeatherSearch.OnWeatherSearchListener f6349b;
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalWeatherLiveResult f6350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeatherSearch.OnWeatherSearchListener f6351b;
    }

    public y() {
    }

    public static synchronized y a() {
        try {
            if (f6321a == null) {
                if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
                    f6321a = new y(Looper.getMainLooper());
                } else {
                    f6321a = new y();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6321a;
    }

    public static void b(Message message) {
        int i2 = message.arg2;
        ShareSearch.OnShareSearchListener onShareSearchListener = (ShareSearch.OnShareSearchListener) message.obj;
        String string = message.getData().getString("shareurlkey");
        if (onShareSearchListener == null) {
        }
        switch (message.what) {
            case 1100:
                onShareSearchListener.onPoiShareUrlSearched(string, i2);
                break;
            case AMapException.CODE_AMAP_ENGINE_RESPONSE_DATA_ERROR /* 1101 */:
                onShareSearchListener.onLocationShareUrlSearched(string, i2);
                break;
            case AMapException.CODE_AMAP_ENGINE_CONNECT_TIMEOUT /* 1102 */:
                onShareSearchListener.onNaviShareUrlSearched(string, i2);
                break;
            case AMapException.CODE_AMAP_ENGINE_RETURN_TIMEOUT /* 1103 */:
                onShareSearchListener.onBusRouteShareUrlSearched(string, i2);
                break;
            case MibiSdkConstants.RESULT_CHECK_RISK_ERROR /* 1104 */:
                onShareSearchListener.onDrivingRouteShareUrlSearched(string, i2);
                break;
            case 1105:
                onShareSearchListener.onWalkRouteShareUrlSearched(string, i2);
                break;
        }
    }

    public static void c(Message message) {
        List list = (List) message.obj;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((NearbySearch.NearbyListener) it.next()).onNearbyInfoUploaded(message.what);
        }
    }

    public static void d(Message message) {
        List<NearbySearch.NearbyListener> list;
        g gVar = (g) message.obj;
        if (gVar == null || (list = gVar.f6334a) == null || list.size() == 0) {
            return;
        }
        NearbySearchResult nearbySearchResult = message.what == 1000 ? gVar.f6335b : null;
        Iterator<NearbySearch.NearbyListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onNearbyInfoSearched(nearbySearchResult, message.what);
        }
    }

    public static void e(Message message) {
        List list = (List) message.obj;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((NearbySearch.NearbyListener) it.next()).onUserInfoCleared(message.what);
        }
    }

    public static void f(Message message) {
        BusStationSearch.OnBusStationSearchListener onBusStationSearchListener;
        c cVar = (c) message.obj;
        if (cVar == null || (onBusStationSearchListener = cVar.f6327b) == null) {
            return;
        }
        int i2 = message.what;
        onBusStationSearchListener.onBusStationSearched(i2 == 1000 ? cVar.f6326a : null, i2);
    }

    public static void g(Message message) {
        h hVar;
        PoiSearch.OnPoiSearchListener onPoiSearchListener;
        Bundle data;
        int i2 = message.what;
        if (i2 == 600) {
            j jVar = (j) message.obj;
            if (jVar == null || (onPoiSearchListener = jVar.f6341b) == null || (data = message.getData()) == null) {
                return;
            }
            onPoiSearchListener.onPoiSearched(jVar.f6340a, data.getInt("errorCode"));
            return;
        }
        if (i2 != 602 || (hVar = (h) message.obj) == null) {
            return;
        }
        PoiSearch.OnPoiSearchListener onPoiSearchListener2 = hVar.f6337b;
        Bundle data2 = message.getData();
        if (data2 != null) {
            onPoiSearchListener2.onPoiItemSearched(hVar.f6336a, data2.getInt("errorCode"));
        }
    }

    public static void h(Message message) {
        i iVar;
        PoiSearchV2.OnPoiSearchListener onPoiSearchListener;
        Bundle data;
        int i2 = message.what;
        if (i2 == 603) {
            k kVar = (k) message.obj;
            if (kVar == null || (onPoiSearchListener = kVar.f6343b) == null || (data = message.getData()) == null) {
                return;
            }
            onPoiSearchListener.onPoiSearched(kVar.f6342a, data.getInt("errorCode"));
            return;
        }
        if (i2 != 604 || (iVar = (i) message.obj) == null) {
            return;
        }
        PoiSearchV2.OnPoiSearchListener onPoiSearchListener2 = iVar.f6339b;
        Bundle data2 = message.getData();
        if (data2 != null) {
            onPoiSearchListener2.onPoiItemSearched(iVar.f6338a, data2.getInt("errorCode"));
        }
    }

    public static void i(Message message) {
        a aVar;
        if (message.what != 600 || (aVar = (a) message.obj) == null) {
            return;
        }
        AutoTSearch.OnChargeStationListener onChargeStationListener = aVar.f6323b;
        Bundle data = message.getData();
        if (data != null) {
            int i2 = data.getInt("errorCode");
            if (onChargeStationListener != null) {
                onChargeStationListener.onChargeStationSearched(aVar.f6322a, i2);
            }
        }
    }

    public static void j(Message message) {
        Inputtips.InputtipsListener inputtipsListener = (Inputtips.InputtipsListener) message.obj;
        if (inputtipsListener == null) {
            return;
        }
        inputtipsListener.onGetInputtips(message.what == 1000 ? message.getData().getParcelableArrayList("result") : null, message.what);
    }

    public static void k(Message message) {
        f fVar;
        GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener;
        GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener2;
        int i2 = message.what;
        if (i2 == 201) {
            l lVar = (l) message.obj;
            if (lVar == null || (onGeocodeSearchListener2 = lVar.f6345b) == null) {
                return;
            }
            onGeocodeSearchListener2.onRegeocodeSearched(lVar.f6344a, message.arg2);
            return;
        }
        if (i2 != 200 || (fVar = (f) message.obj) == null || (onGeocodeSearchListener = fVar.f6333b) == null) {
            return;
        }
        onGeocodeSearchListener.onGeocodeSearched(fVar.f6332a, message.arg2);
    }

    public static void l(Message message) {
        DistrictSearch.OnDistrictSearchListener onDistrictSearchListener = (DistrictSearch.OnDistrictSearchListener) message.obj;
        if (onDistrictSearchListener == null) {
            return;
        }
        onDistrictSearchListener.onDistrictSearched((DistrictResult) message.getData().getParcelable("result"));
    }

    public static void m(Message message) {
        BusLineSearch.OnBusLineSearchListener onBusLineSearchListener;
        b bVar = (b) message.obj;
        if (bVar == null || (onBusLineSearchListener = bVar.f6325b) == null) {
            return;
        }
        int i2 = message.what;
        onBusLineSearchListener.onBusLineSearched(i2 == 1000 ? bVar.f6324a : null, i2);
    }

    public static void n(Message message) {
        Bundle data;
        RouteSearch.OnRouteSearchListener onRouteSearchListener = (RouteSearch.OnRouteSearchListener) message.obj;
        if (onRouteSearchListener == null) {
            return;
        }
        int i2 = message.what;
        if (i2 == 100) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                onRouteSearchListener.onBusRouteSearched((BusRouteResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 101) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                onRouteSearchListener.onDriveRouteSearched((DriveRouteResult) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                onRouteSearchListener.onWalkRouteSearched((WalkRouteResult) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 103) {
            Bundle data5 = message.getData();
            if (data5 != null) {
                onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data5.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 != 104 || (data = message.getData()) == null) {
            return;
        }
        onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void o(Message message) {
        Bundle data;
        RouteSearchV2.OnRouteSearchListener onRouteSearchListener = (RouteSearchV2.OnRouteSearchListener) message.obj;
        if (onRouteSearchListener == null) {
            return;
        }
        int i2 = message.what;
        if (i2 == 101) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                onRouteSearchListener.onDriveRouteSearched((DriveRouteResultV2) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 100) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                onRouteSearchListener.onBusRouteSearched((BusRouteResultV2) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                onRouteSearchListener.onWalkRouteSearched((WalkRouteResultV2) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 != 103 || (data = message.getData()) == null) {
            return;
        }
        onRouteSearchListener.onRideRouteSearched((RideRouteResultV2) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void p(Message message) {
        Bundle data;
        RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener = (RouteSearch.OnTruckRouteSearchListener) message.obj;
        if (onTruckRouteSearchListener == null || message.what != 104 || (data = message.getData()) == null) {
            return;
        }
        onTruckRouteSearchListener.onTruckRouteSearched((TruckRouteRestult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void q(Message message) {
        Bundle data;
        RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener = (RouteSearch.OnRoutePlanSearchListener) message.obj;
        if (onRoutePlanSearchListener == null || message.what != 105 || (data = message.getData()) == null) {
            return;
        }
        onRoutePlanSearchListener.onDriveRoutePlanSearched((DriveRoutePlanResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void r(Message message) {
        d dVar;
        int i2 = message.what;
        if (i2 == 700) {
            e eVar = (e) message.obj;
            if (eVar == null) {
                return;
            }
            eVar.f6331b.onCloudSearched(eVar.f6330a, message.arg2);
            return;
        }
        if (i2 != 701 || (dVar = (d) message.obj) == null) {
            return;
        }
        dVar.f6329b.onCloudItemDetailSearched(dVar.f6328a, message.arg2);
    }

    public static void s(Message message) {
        n nVar;
        WeatherSearch.OnWeatherSearchListener onWeatherSearchListener;
        Bundle data;
        WeatherSearch.OnWeatherSearchListener onWeatherSearchListener2;
        Bundle data2;
        int i2 = message.what;
        if (i2 == 1301) {
            o oVar = (o) message.obj;
            if (oVar == null || (onWeatherSearchListener2 = oVar.f6351b) == null || (data2 = message.getData()) == null) {
                return;
            }
            onWeatherSearchListener2.onWeatherLiveSearched(oVar.f6350a, data2.getInt("errorCode"));
            return;
        }
        if (i2 != 1302 || (nVar = (n) message.obj) == null || (onWeatherSearchListener = nVar.f6349b) == null || (data = message.getData()) == null) {
            return;
        }
        onWeatherSearchListener.onWeatherForecastSearched(nVar.f6348a, data.getInt("errorCode"));
    }

    public static void t(Message message) {
        RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener;
        Bundle data;
        m mVar = (m) message.obj;
        if (mVar == null || (onRoutePOISearchListener = mVar.f6347b) == null || (data = message.getData()) == null) {
            return;
        }
        onRoutePOISearchListener.onRoutePoiSearched(mVar.f6346a, data.getInt("errorCode"));
    }

    public static void u(Message message) {
        Bundle data;
        DistanceSearch.OnDistanceSearchListener onDistanceSearchListener = (DistanceSearch.OnDistanceSearchListener) message.obj;
        if (onDistanceSearchListener == null || message.what != 400 || (data = message.getData()) == null) {
            return;
        }
        onDistanceSearchListener.onDistanceSearched((DistanceResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i2 = message.arg1;
            if (i2 == 101) {
                o(message);
                return;
            }
            switch (i2) {
                case 1:
                    n(message);
                    break;
                case 2:
                    k(message);
                    break;
                case 3:
                    m(message);
                    break;
                case 4:
                    l(message);
                    break;
                case 5:
                    j(message);
                    break;
                case 6:
                    g(message);
                    break;
                case 7:
                    f(message);
                    break;
                case 8:
                    e(message);
                    break;
                case 9:
                    d(message);
                    break;
                case 10:
                    c(message);
                    break;
                case 11:
                    b(message);
                    break;
                case 12:
                    r(message);
                    break;
                case 13:
                    s(message);
                    break;
                case 14:
                    t(message);
                    break;
                default:
                    switch (i2) {
                        case 16:
                            u(message);
                            break;
                        case 17:
                            p(message);
                            break;
                        case 18:
                            q(message);
                            break;
                        case 19:
                            h(message);
                            break;
                        case 20:
                            i(message);
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } catch (Throwable th) {
            xts.i(th, "MessageHandler", "handleMessage");
        }
    }

    public y(Looper looper) {
        super(looper);
    }
}
