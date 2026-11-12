package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.route.WalkStep;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.healthcloud.plugintrack.runningroute.manager.IGetPoiByLocationName;
import com.huawei.hwmap.callback.ReverseGeocodeResultCallback;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import com.huawei.ui.commonui.model.ITwoPointDistanceCallBack;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class jdf implements RouteSearch.OnRouteSearchListener, PoiSearch.OnPoiSearchListener {
    private static volatile jdf d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ITwoPointDistanceCallBack f38424c;
    private IGetPoiByLocationName e;

    @Override // com.amap.api.services.route.RouteSearch.OnRouteSearchListener
    public void onBusRouteSearched(BusRouteResult busRouteResult, int i) {
    }

    @Override // com.amap.api.services.route.RouteSearch.OnRouteSearchListener
    public void onDriveRouteSearched(DriveRouteResult driveRouteResult, int i) {
    }

    @Override // com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener
    public void onPoiItemSearched(PoiItem poiItem, int i) {
    }

    @Override // com.amap.api.services.route.RouteSearch.OnRouteSearchListener
    public void onRideRouteSearched(RideRouteResult rideRouteResult, int i) {
    }

    private jdf() {
        MapsInitializer.updatePrivacyShow(BaseApplication.b(), true, true);
        MapsInitializer.updatePrivacyAgree(BaseApplication.b(), true);
    }

    public static jdf a() {
        if (d == null) {
            synchronized (jdf.class) {
                if (d == null) {
                    d = new jdf();
                }
            }
        }
        return d;
    }

    public void c(LatLonPoint latLonPoint, ICityLatLonCallBack iCityLatLonCallBack) {
        if (latLonPoint == null) {
            return;
        }
        LogUtil.b("GeoLocationManager", "getCityCenterPoint, lat: ", Double.valueOf(latLonPoint.getLatitude()), " lng: ", Double.valueOf(latLonPoint.getLongitude()));
        npx.a("getCityCenterPoint", latLonPoint.getLongitude(), latLonPoint.getLatitude(), null, null, new b(this, 0, iCityLatLonCallBack));
    }

    public void d(LatLonPoint latLonPoint, ICityLatLonCallBack iCityLatLonCallBack) {
        if (latLonPoint == null) {
            return;
        }
        LogUtil.b("GeoLocationManager", "getCityDetailInfoByLatLng, lat: ", Double.valueOf(latLonPoint.getLatitude()), " lng: ", Double.valueOf(latLonPoint.getLongitude()));
        npx.a("getCityDetailInfoByLatLng", latLonPoint.getLongitude(), latLonPoint.getLatitude(), null, null, new b(this, 1, iCityLatLonCallBack));
    }

    public void e(Context context, String str, String str2, IGetPoiByLocationName iGetPoiByLocationName) {
        this.e = iGetPoiByLocationName;
        PoiSearch.Query query = new PoiSearch.Query(str, "", str2);
        query.setPageSize(10);
        try {
            PoiSearch poiSearch = new PoiSearch(context, query);
            poiSearch.setOnPoiSearchListener(this);
            poiSearch.searchPOIAsyn();
            jaj.d(1003);
        } catch (AMapException e) {
            LogUtil.e("GeoLocationManager", "getPoiByLocationName: ", LogAnonymous.b(e));
        }
    }

    @Override // com.amap.api.services.route.RouteSearch.OnRouteSearchListener
    public void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i) {
        Iterator<WalkPath> it = walkRouteResult.getPaths().iterator();
        double distance = 0.0d;
        while (it.hasNext()) {
            Iterator<WalkStep> it2 = it.next().getSteps().iterator();
            while (it2.hasNext()) {
                distance += (double) it2.next().getDistance();
            }
        }
        ITwoPointDistanceCallBack iTwoPointDistanceCallBack = this.f38424c;
        if (iTwoPointDistanceCallBack != null) {
            iTwoPointDistanceCallBack.onDistanceBack(distance);
        }
    }

    @Override // com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener
    public void onPoiSearched(PoiResult poiResult, int i) {
        ArrayList<PoiItem> pois = poiResult.getPois();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (PoiItem poiItem : pois) {
            LatLonPoint latLonPoint = poiItem.getLatLonPoint();
            arrayList.add(poiItem.getCityName());
            arrayList2.add(new jpg(latLonPoint.getLatitude(), latLonPoint.getLongitude()));
            arrayList3.add(poiItem.getTitle());
        }
        IGetPoiByLocationName iGetPoiByLocationName = this.e;
        if (iGetPoiByLocationName != null) {
            iGetPoiByLocationName.onPoiListBack(arrayList, arrayList2, arrayList3);
        }
    }

    static class b implements ReverseGeocodeResultCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ICityLatLonCallBack f38425b;
        private final WeakReference<jdf> d;
        private final int e;

        public b(jdf jdfVar, int i, ICityLatLonCallBack iCityLatLonCallBack) {
            this.d = new WeakReference<>(jdfVar);
            this.e = i;
            this.f38425b = iCityLatLonCallBack;
        }

        @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
        public void onSuccess(ReverseGeocodeResponse reverseGeocodeResponse) {
            String str;
            if (this.d.get() == null) {
                LogUtil.b("GeoLocationManager", "onHWMapSearched: mWeakReference is empty");
                return;
            }
            jdf jdfVar = this.d.get();
            LogUtil.b("GeoLocationManager", "invoke huawei reverse geocoding.");
            if (reverseGeocodeResponse == null) {
                LogUtil.b("GeoLocationManager", "onHWMapSearched response is null");
                return;
            }
            LogUtil.b("GeoLocationManager", "onHWMapSearched code ", reverseGeocodeResponse.getReturnCode());
            if (reverseGeocodeResponse.getSites() == null || reverseGeocodeResponse.getSites().isEmpty()) {
                LogUtil.b("GeoLocationManager", "hwMapRequestLocation hwMapResult == null");
                return;
            }
            ReverseGeocodeResponse.Site site = reverseGeocodeResponse.getSites().get(0);
            if (site == null || site.getAddress() == null) {
                LogUtil.b("GeoLocationManager", "hwMapRequestLocation siteResult or address == null");
                return;
            }
            ReverseGeocodeResponse.Address address = site.getAddress();
            qon qonVar = new qon();
            String city = address.getCity();
            qonVar.b(city);
            if (TextUtils.isEmpty(address.getSubLocality())) {
                str = city + address.getTertiaryAdminArea();
            } else {
                str = city + address.getTertiaryAdminArea() + address.getSubLocality();
            }
            qonVar.d(str);
            LogUtil.b("GeoLocationManager", "hwmap detailAddress: " + str);
            int i = this.e;
            if (i == 0) {
                try {
                    GeocodeQuery geocodeQuery = new GeocodeQuery(city, city);
                    GeocodeSearch geocodeSearch = new GeocodeSearch(BaseApplication.b());
                    geocodeSearch.setOnGeocodeSearchListener(new c(jdfVar, qonVar, this.f38425b));
                    geocodeSearch.getFromLocationNameAsyn(geocodeQuery);
                    jaj.d(1004);
                } catch (AMapException e) {
                    LogUtil.e("GeoLocationManager", "getCityCenterPoint: ", LogAnonymous.b(e));
                }
            } else if (i == 1) {
                this.f38425b.onPointBack(qonVar);
            } else {
                LogUtil.b("GeoLocationManager", "regeocodeQueryType invalid");
            }
            LogUtil.b("GeoLocationManager", "hwmap city: ", address.getCity());
        }

        @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
        public void onFailure(Throwable th) {
            LogUtil.b("requestMapsLocation HWMapException: " + ExceptionUtils.c(th), new Object[0]);
        }
    }

    static class c implements GeocodeSearch.OnGeocodeSearchListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<jdf> f38426c;
        private final qon d;
        private final ICityLatLonCallBack e;

        public c(jdf jdfVar, qon qonVar, ICityLatLonCallBack iCityLatLonCallBack) {
            this.f38426c = new WeakReference<>(jdfVar);
            this.d = qonVar;
            this.e = iCityLatLonCallBack;
        }

        @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
        public void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i) {
            LogUtil.b("GeoLocationManager", "onRegeocodeSearched, regeocodeResult is null: ", Boolean.valueOf(regeocodeResult == null), ", code: ", Integer.valueOf(i));
        }

        @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
        public void onGeocodeSearched(GeocodeResult geocodeResult, int i) {
            GeocodeAddress geocodeAddress;
            if (this.f38426c.get() == null) {
                LogUtil.b("GeoLocationManager", "onRegeocodeSearched: mWeakReference is empty");
                return;
            }
            LogUtil.b("GeoLocationManager", "onGeocodeSearched, geocodeResult is null: ", Boolean.valueOf(geocodeResult == null), ", code: ", Integer.valueOf(i));
            if (geocodeResult == null) {
                this.e.onPointBack(null);
                return;
            }
            if (geocodeResult.getGeocodeAddressList() == null || geocodeResult.getGeocodeAddressList().isEmpty() || (geocodeAddress = geocodeResult.getGeocodeAddressList().get(0)) == null || this.e == null || this.d == null) {
                return;
            }
            LatLonPoint latLonPoint = geocodeAddress.getLatLonPoint();
            this.d.e(new qol(latLonPoint.getLatitude(), latLonPoint.getLongitude()));
            if (!TextUtils.isEmpty(geocodeAddress.getCity())) {
                this.d.b(geocodeAddress.getCity());
            }
            this.e.onPointBack(this.d);
        }
    }
}
