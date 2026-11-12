package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.district.DistrictItem;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.geocoder.AoiItem;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.route.detail.model.AddressInfo;
import com.xiaomi.fitness.sport.route.detail.model.CityRouteCount;
import com.xiaomi.fitness.sport.view.route.GeoUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ2\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011J8\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u000e0\u0011J.\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/GeoUtils;", "", "<init>", "()V", "TAG", "", "getAddressByLocation", "Landroid/location/Address;", "context", "Landroid/content/Context;", "lat", "", "lon", "getAddressByAmap", "", "lng", "addressCallback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sport/route/detail/model/AddressInfo;", "getAddressList", "key", "city", "listCallback", "", "Lcom/amap/api/services/core/PoiItem;", "convertCityLatlng", "cityList", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRouteCount;", "callback", "Lkotlin/Function2;", "Lcom/amap/api/services/district/DistrictItem;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGeoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoUtils.kt\ncom/xiaomi/fitness/sport/view/route/GeoUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1863#2,2:133\n*S KotlinDebug\n*F\n+ 1 GeoUtils.kt\ncom/xiaomi/fitness/sport/view/route/GeoUtils\n*L\n110#1:133,2\n*E\n"})
public final class GeoUtils {

    @NotNull
    public static final GeoUtils INSTANCE = new GeoUtils();

    @NotNull
    public static final String TAG = "GeoUtils";

    private GeoUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convertCityLatlng$lambda$2$lambda$1(Function2 callback, CityRouteCount it, DistrictResult districtResult) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "$it");
        ArrayList<DistrictItem> district = districtResult.getDistrict();
        if (district.isEmpty()) {
            return;
        }
        DistrictItem districtItem = district.get(0);
        Intrinsics.checkNotNullExpressionValue(districtItem, "get(...)");
        callback.invoke(it, districtItem);
        String name = district.get(0).getName();
        double latitude = district.get(0).getCenter().getLatitude();
        double longitude = district.get(0).getCenter().getLongitude();
        Logger.i(TAG, "convertCityLatlng,cityCode:" + it.getCityCode() + ",cityName:" + name + ",lat:" + latitude + ",lng:" + longitude);
    }

    public final void convertCityLatlng(@NotNull List<CityRouteCount> cityList, @NotNull final Function2<? super CityRouteCount, ? super DistrictItem, Unit> callback) {
        Intrinsics.checkNotNullParameter(cityList, "cityList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        for (final CityRouteCount cityRouteCount : cityList) {
            DistrictSearch districtSearch = new DistrictSearch(ApplicationExtKt.getApplication());
            DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
            districtSearchQuery.setKeywords(cityRouteCount.getCityCode());
            districtSearchQuery.setPageSize(1);
            districtSearch.setQuery(districtSearchQuery);
            districtSearch.setOnDistrictSearchListener(new DistrictSearch.OnDistrictSearchListener() { // from class: lya
                @Override // com.amap.api.services.district.DistrictSearch.OnDistrictSearchListener
                public final void onDistrictSearched(DistrictResult districtResult) {
                    GeoUtils.convertCityLatlng$lambda$2$lambda$1(callback, cityRouteCount, districtResult);
                }
            });
            districtSearch.searchDistrictAsyn();
        }
    }

    public final void getAddressByAmap(@NotNull Context context, double lat, double lng, @NotNull final Function1<? super AddressInfo, Unit> addressCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addressCallback, "addressCallback");
        GeocodeSearch geocodeSearch = new GeocodeSearch(context);
        RegeocodeQuery regeocodeQuery = new RegeocodeQuery(new LatLonPoint(lat, lng), 200.0f, GeocodeSearch.AMAP);
        regeocodeQuery.setExtensions("all");
        geocodeSearch.setOnGeocodeSearchListener(new GeocodeSearch.OnGeocodeSearchListener() { // from class: com.xiaomi.fitness.sport.view.route.GeoUtils.getAddressByAmap.1
            @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
            public void onGeocodeSearched(GeocodeResult result, int code) {
                Intrinsics.checkNotNullParameter(result, "result");
            }

            @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
            public void onRegeocodeSearched(RegeocodeResult result, int code) {
                String city;
                Intrinsics.checkNotNullParameter(result, "result");
                RegeocodeAddress regeocodeAddress = result.getRegeocodeAddress();
                List<AoiItem> aois = result.getRegeocodeAddress().getAois();
                Intrinsics.checkNotNullExpressionValue(aois, "getAois(...)");
                if (!aois.isEmpty()) {
                    List<AoiItem> aois2 = result.getRegeocodeAddress().getAois();
                    Intrinsics.checkNotNullExpressionValue(aois2, "getAois(...)");
                    city = ((AoiItem) CollectionsKt___CollectionsKt.first((List) aois2)).getAoiName();
                } else {
                    List<PoiItem> pois = result.getRegeocodeAddress().getPois();
                    Intrinsics.checkNotNullExpressionValue(pois, "getPois(...)");
                    if (!pois.isEmpty()) {
                        List<PoiItem> pois2 = result.getRegeocodeAddress().getPois();
                        Intrinsics.checkNotNullExpressionValue(pois2, "getPois(...)");
                        city = ((PoiItem) CollectionsKt___CollectionsKt.first((List) pois2)).getTitle();
                    } else {
                        city = result.getRegeocodeAddress().getCity();
                    }
                }
                FitnessLogUtils.i(GeoUtils.TAG, "onRegeocodeSearched address name:" + regeocodeAddress.getFormatAddress() + ",city:" + regeocodeAddress.getCity() + ",cityCode:" + regeocodeAddress.getCityCode() + ",neighbor:" + regeocodeAddress.getNeighborhood());
                Function1<AddressInfo, Unit> function1 = addressCallback;
                String cityCode = regeocodeAddress.getCityCode();
                Intrinsics.checkNotNullExpressionValue(cityCode, "getCityCode(...)");
                String city2 = regeocodeAddress.getCity();
                Intrinsics.checkNotNullExpressionValue(city2, "getCity(...)");
                String formatAddress = regeocodeAddress.getFormatAddress();
                Intrinsics.checkNotNullExpressionValue(formatAddress, "getFormatAddress(...)");
                function1.invoke2(new AddressInfo(city, cityCode, city2, formatAddress));
            }
        });
        geocodeSearch.getFromLocationAsyn(regeocodeQuery);
    }

    @Nullable
    public final Address getAddressByLocation(@NotNull Context context, double lat, double lon) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            List<Address> fromLocation = new Geocoder(context).getFromLocation(lat, lon, 10);
            if (fromLocation != null) {
                return (Address) CollectionsKt___CollectionsKt.first((List) fromLocation);
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void getAddressList(@NotNull Context context, @NotNull String key, @NotNull String city, @NotNull final Function1<? super List<? extends PoiItem>, Unit> listCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(listCallback, "listCallback");
        PoiSearch.Query query = new PoiSearch.Query(key, "", city);
        query.setPageSize(20);
        PoiSearch poiSearch = new PoiSearch(context, query);
        poiSearch.setOnPoiSearchListener(new PoiSearch.OnPoiSearchListener() { // from class: com.xiaomi.fitness.sport.view.route.GeoUtils.getAddressList.1
            @Override // com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener
            public void onPoiItemSearched(PoiItem poiItem, int code) {
            }

            @Override // com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener
            public void onPoiSearched(PoiResult result, int code) {
                if (result != null) {
                    Function1<List<? extends PoiItem>, Unit> function1 = listCallback;
                    ArrayList<PoiItem> pois = result.getPois();
                    Intrinsics.checkNotNullExpressionValue(pois, "getPois(...)");
                    Iterator<T> it = pois.iterator();
                    while (it.hasNext()) {
                        FitnessLogUtils.i(GeoUtils.TAG, "poi search item -> " + ((PoiItem) it.next()));
                    }
                    ArrayList<PoiItem> pois2 = result.getPois();
                    Intrinsics.checkNotNullExpressionValue(pois2, "getPois(...)");
                    function1.invoke2(pois2);
                }
            }
        });
        poiSearch.searchPOIAsyn();
    }
}
