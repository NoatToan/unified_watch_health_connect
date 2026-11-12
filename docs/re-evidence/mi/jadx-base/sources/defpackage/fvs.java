package defpackage;

import android.text.TextUtils;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.district.DistrictItem;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.geocoder.AoiItem;
import com.amap.api.services.geocoder.BusinessArea;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeRoad;
import com.amap.api.services.geocoder.StreetNumber;
import com.amap.api.services.help.Tip;
import com.amap.api.services.nearby.NearbyInfo;
import com.amap.api.services.poisearch.Business;
import com.amap.api.services.poisearch.IndoorData;
import com.amap.api.services.poisearch.IndoorDataV2;
import com.amap.api.services.poisearch.Photo;
import com.amap.api.services.poisearch.PoiItemExtension;
import com.amap.api.services.poisearch.PoiNavi;
import com.amap.api.services.poisearch.SubPoiItem;
import com.amap.api.services.poisearch.SubPoiItemV2;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.route.BusPath;
import com.amap.api.services.route.BusPathV2;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.BusRouteResultV2;
import com.amap.api.services.route.BusStep;
import com.amap.api.services.route.BusStepV2;
import com.amap.api.services.route.ChargeStationInfo;
import com.amap.api.services.route.Cost;
import com.amap.api.services.route.DistanceItem;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.District;
import com.amap.api.services.route.Doorway;
import com.amap.api.services.route.DrivePath;
import com.amap.api.services.route.DrivePathV2;
import com.amap.api.services.route.DrivePlanPath;
import com.amap.api.services.route.DrivePlanStep;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.DriveRouteResultV2;
import com.amap.api.services.route.DriveStep;
import com.amap.api.services.route.DriveStepV2;
import com.amap.api.services.route.ElecConsumeInfo;
import com.amap.api.services.route.Navi;
import com.amap.api.services.route.Path;
import com.amap.api.services.route.Railway;
import com.amap.api.services.route.RailwaySpace;
import com.amap.api.services.route.RailwayStationItem;
import com.amap.api.services.route.RidePath;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RideRouteResultV2;
import com.amap.api.services.route.RideStep;
import com.amap.api.services.route.RouteBusLineItem;
import com.amap.api.services.route.RouteBusWalkItem;
import com.amap.api.services.route.RouteRailwayItem;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.RouteSearchCity;
import com.amap.api.services.route.TMC;
import com.amap.api.services.route.TaxiItem;
import com.amap.api.services.route.TaxiItemV2;
import com.amap.api.services.route.TimeInfo;
import com.amap.api.services.route.TimeInfosElement;
import com.amap.api.services.route.TruckPath;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.TruckStep;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.route.WalkRouteResultV2;
import com.amap.api.services.route.WalkStep;
import com.amap.api.services.routepoisearch.RoutePOIItem;
import com.amap.api.services.weather.LocalDayWeatherForecast;
import com.amap.api.services.weather.LocalWeatherForecast;
import com.amap.api.services.weather.LocalWeatherLive;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f18305a = {"010", "021", "022", "023", "1852", "1853"};

    public static void A(PoiItemV2 poiItemV2, JSONObject jSONObject) throws JSONException {
        poiItemV2.setPhotos(q(jSONObject));
    }

    public static TruckRouteRestult A0(String str) throws AMapException {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("data")) {
                return null;
            }
            TruckRouteRestult truckRouteRestult = new TruckRouteRestult();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data").optJSONObject("route");
            truckRouteRestult.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            truckRouteRestult.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            if (!jSONObjectOptJSONObject.has("paths") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths")) == null) {
                return truckRouteRestult;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                TruckPath truckPath = new TruckPath();
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                truckPath.setDistance(N0(v(jSONObject2, "distance")));
                truckPath.setDuration(R0(v(jSONObject2, "duration")));
                truckPath.setStrategy(v(jSONObject2, "strategy"));
                truckPath.setTolls(N0(v(jSONObject2, "tolls")));
                truckPath.setTollDistance(N0(v(jSONObject2, "toll_distance")));
                truckPath.setTotalTrafficlights(L0(v(jSONObject2, "traffic_lights")));
                truckPath.setRestriction(L0(v(jSONObject2, "restriction")));
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("steps");
                if (jSONArrayOptJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        TruckStep truckStep = new TruckStep();
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        if (jSONObjectOptJSONObject2 != null) {
                            truckStep.setInstruction(v(jSONObjectOptJSONObject2, "instruction"));
                            truckStep.setOrientation(v(jSONObjectOptJSONObject2, "orientation"));
                            truckStep.setRoad(v(jSONObjectOptJSONObject2, "road"));
                            truckStep.setDistance(N0(v(jSONObjectOptJSONObject2, "distance")));
                            truckStep.setTolls(N0(v(jSONObjectOptJSONObject2, "tolls")));
                            truckStep.setTollDistance(N0(v(jSONObjectOptJSONObject2, "toll_distance")));
                            truckStep.setTollRoad(v(jSONObjectOptJSONObject2, "toll_road"));
                            truckStep.setDuration(N0(v(jSONObjectOptJSONObject2, "duration")));
                            truckStep.setPolyline(a0(jSONObjectOptJSONObject2, "polyline"));
                            truckStep.setAction(v(jSONObjectOptJSONObject2, "action"));
                            truckStep.setAssistantAction(v(jSONObjectOptJSONObject2, "assistant_action"));
                            G(truckStep, jSONObjectOptJSONObject2);
                            Q(truckStep, jSONObjectOptJSONObject2);
                            arrayList2.add(truckStep);
                        }
                    }
                    truckPath.setSteps(arrayList2);
                    arrayList.add(truckPath);
                }
            }
            truckRouteRestult.setPaths(arrayList);
            return truckRouteRestult;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseTruckRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static void B(RegeocodeAddress regeocodeAddress) {
        if ((regeocodeAddress.getCity() == null || regeocodeAddress.getCity().length() <= 0) && E0(regeocodeAddress.getCityCode())) {
            regeocodeAddress.setCity(regeocodeAddress.getProvince());
        }
    }

    public static BusStationItem B0(JSONObject jSONObject) throws JSONException {
        BusStationItem busStationItemD0 = D0(jSONObject);
        busStationItemD0.setAdCode(v(jSONObject, "adcode"));
        busStationItemD0.setCityCode(v(jSONObject, "citycode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("buslines");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray == null) {
            busStationItemD0.setBusLineItems(arrayList);
            return busStationItemD0;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(F0(jSONObjectOptJSONObject));
            }
        }
        busStationItemD0.setBusLineItems(arrayList);
        return busStationItemD0;
    }

    public static void C(Cost cost, JSONObject jSONObject) throws AMapException {
        try {
            cost.setTolls(N0(v(jSONObject, "tolls")));
            cost.setTollDistance(N0(v(jSONObject, "toll_distance")));
            cost.setTollRoad(v(jSONObject, "toll_road"));
            cost.setDuration(N0(v(jSONObject, "duration")));
            cost.setTrafficLights(L0(v(jSONObject, "traffic_lights")));
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseCostDetail");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0208  */
    /* JADX WARN: Code duplicated, block: B:98:0x0220  */
    public static DriveRoutePlanResult C0(String str) throws AMapException {
        String str2;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        String str3;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str4;
        JSONArray jSONArray3;
        String str5 = "协议解析错误 - ProtocolException";
        String str6 = "starttime";
        try {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(CommonConstants.KEY_ERR_CODE)) {
                        jSONObject.optInt(CommonConstants.KEY_ERR_CODE);
                        jSONObject.optString("errmsg");
                        jSONObject.optString("errdetail");
                    }
                    if (!jSONObject.has("data")) {
                        return null;
                    }
                    DriveRoutePlanResult driveRoutePlanResult = new DriveRoutePlanResult();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("paths") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths")) == null) {
                        return driveRoutePlanResult;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        DrivePlanPath drivePlanPath = new DrivePlanPath();
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject2 != null) {
                            drivePlanPath.setDistance(N0(v(jSONObjectOptJSONObject2, "distance")));
                            drivePlanPath.setTrafficLights(L0(v(jSONObjectOptJSONObject2, "traffic_lights")));
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("steps");
                            if (jSONArrayOptJSONArray3 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i2 = 0;
                                while (i2 < jSONArrayOptJSONArray3.length()) {
                                    DrivePlanStep drivePlanStep = new DrivePlanStep();
                                    JSONArray jSONArray4 = jSONArrayOptJSONArray;
                                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i2);
                                    if (jSONObjectOptJSONObject3 != null) {
                                        drivePlanStep.setAdCode(v(jSONObjectOptJSONObject3, "adcode"));
                                        drivePlanStep.setRoad(v(jSONObjectOptJSONObject3, "road"));
                                        drivePlanStep.setDistance(N0(v(jSONObjectOptJSONObject3, "distance")));
                                        str2 = str5;
                                        try {
                                            drivePlanStep.setToll(L0(v(jSONObjectOptJSONObject3, RouteSearch.DRIVING_EXCLUDE_TOLL)) == 1);
                                            drivePlanStep.setPolyline(a0(jSONObjectOptJSONObject3, "polyline"));
                                            arrayList2.add(drivePlanStep);
                                        } catch (JSONException e) {
                                            e = e;
                                            str5 = str2;
                                        } catch (Throwable th) {
                                            th = th;
                                            xts.i(th, "JSONHelper", "parseDriveRouteThrowable");
                                            throw new AMapException(str2);
                                        }
                                    } else {
                                        str2 = str5;
                                    }
                                    i2++;
                                    jSONArrayOptJSONArray = jSONArray4;
                                    jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                                    str5 = str2;
                                }
                                str4 = str5;
                                jSONArray3 = jSONArrayOptJSONArray;
                                drivePlanPath.setSteps(arrayList2);
                                arrayList.add(drivePlanPath);
                            } else {
                                str4 = str5;
                                jSONArray3 = jSONArrayOptJSONArray;
                            }
                        } else {
                            str4 = str5;
                            jSONArray3 = jSONArrayOptJSONArray;
                        }
                        i++;
                        jSONArrayOptJSONArray = jSONArray3;
                        str5 = str4;
                    }
                    str2 = str5;
                    driveRoutePlanResult.setPaths(arrayList);
                    if (!jSONObjectOptJSONObject.has("time_infos") || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("time_infos")) == null) {
                        return driveRoutePlanResult;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    while (i3 < jSONArrayOptJSONArray2.length()) {
                        TimeInfo timeInfo = new TimeInfo();
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                        if (jSONObjectOptJSONObject4 == null) {
                            str3 = str6;
                            jSONArray = jSONArrayOptJSONArray2;
                        } else {
                            if (!jSONObjectOptJSONObject4.has(str6)) {
                                return driveRoutePlanResult;
                            }
                            timeInfo.setStartTime(R0(v(jSONObjectOptJSONObject4, str6)));
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject4.optJSONArray("elements");
                            if (jSONArrayOptJSONArray4 != null) {
                                ArrayList arrayList4 = new ArrayList();
                                int i4 = 0;
                                while (i4 < jSONArrayOptJSONArray4.length()) {
                                    TimeInfosElement timeInfosElement = new TimeInfosElement();
                                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray4.optJSONObject(i4);
                                    if (jSONObjectOptJSONObject5 != null) {
                                        timeInfosElement.setPathindex(L0(v(jSONObjectOptJSONObject5, "pathindex")));
                                        timeInfosElement.setDuration(N0(v(jSONObjectOptJSONObject5, "duration")));
                                        timeInfosElement.setTolls(N0(v(jSONObjectOptJSONObject5, "tolls")));
                                        int iL0 = L0(v(jSONObjectOptJSONObject5, "restriction"));
                                        timeInfosElement.setRestriction((iL0 == 2 || iL0 == -1) ? 0 : 1);
                                        JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject5.optJSONArray("tmcs");
                                        if (jSONArrayOptJSONArray5 != null) {
                                            ArrayList arrayList5 = new ArrayList();
                                            int i5 = 0;
                                            while (i5 < jSONArrayOptJSONArray5.length()) {
                                                TMC tmc = new TMC();
                                                JSONArray jSONArray5 = jSONArrayOptJSONArray2;
                                                JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray5.optJSONObject(i5);
                                                if (jSONObjectOptJSONObject6 != null) {
                                                    tmc.setStatus(v(jSONObjectOptJSONObject6, "status"));
                                                    tmc.setDistance(L0(v(jSONObjectOptJSONObject6, "distance")));
                                                    tmc.setPolyline(a0(jSONObjectOptJSONObject6, "polyline"));
                                                    arrayList5.add(tmc);
                                                }
                                                i5++;
                                                jSONArrayOptJSONArray2 = jSONArray5;
                                                jSONArrayOptJSONArray5 = jSONArrayOptJSONArray5;
                                            }
                                            jSONArray2 = jSONArrayOptJSONArray2;
                                            timeInfosElement.setTMCs(arrayList5);
                                            arrayList4.add(timeInfosElement);
                                        } else {
                                            jSONArray2 = jSONArrayOptJSONArray2;
                                        }
                                    } else {
                                        jSONArray2 = jSONArrayOptJSONArray2;
                                    }
                                    i4++;
                                    str6 = str6;
                                    jSONArrayOptJSONArray2 = jSONArray2;
                                }
                                str3 = str6;
                                jSONArray = jSONArrayOptJSONArray2;
                                timeInfo.setElements(arrayList4);
                                arrayList3.add(timeInfo);
                            } else {
                                str3 = str6;
                                jSONArray = jSONArrayOptJSONArray2;
                            }
                        }
                        i3++;
                        str6 = str3;
                        jSONArrayOptJSONArray2 = jSONArray;
                    }
                    driveRoutePlanResult.setTimeInfos(arrayList3);
                    return driveRoutePlanResult;
                } catch (JSONException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = str5;
            }
        } catch (JSONException e3) {
            e = e3;
        }
        xts.i(e, "JSONHelper", "parseDriveRoute");
        throw new AMapException(str5);
    }

    public static void D(DriveStep driveStep, JSONObject jSONObject) throws AMapException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tmcs");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                TMC tmc = new TMC();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    tmc.setDistance(L0(v(jSONObjectOptJSONObject, "distance")));
                    tmc.setStatus(v(jSONObjectOptJSONObject, "status"));
                    tmc.setPolyline(a0(jSONObjectOptJSONObject, "polyline"));
                    arrayList.add(tmc);
                }
            }
            driveStep.setTMCs(arrayList);
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseTMCs");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static BusStationItem D0(JSONObject jSONObject) throws JSONException {
        BusStationItem busStationItem = new BusStationItem();
        busStationItem.setBusStationId(v(jSONObject, "id"));
        busStationItem.setLatLonPoint(S(jSONObject, "location"));
        busStationItem.setBusStationName(v(jSONObject, "name"));
        return busStationItem;
    }

    public static void E(Path path, List<WalkStep> list) {
        List<LatLonPoint> polyline = path.getPolyline();
        if (polyline == null) {
            polyline = new ArrayList<>();
        }
        for (WalkStep walkStep : list) {
            if (walkStep != null && walkStep.getPolyline() != null) {
                polyline.addAll(walkStep.getPolyline());
            }
        }
        path.setPolyline(polyline);
    }

    public static boolean E0(String str) {
        if (str != null && str.length() > 0) {
            for (String str2 : f18305a) {
                if (str.trim().equals(str2.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void F(RouteSearchCity routeSearchCity, JSONObject jSONObject) throws AMapException {
        if (jSONObject.has("districts")) {
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("districts");
                if (jSONArrayOptJSONArray == null) {
                    routeSearchCity.setDistricts(arrayList);
                    return;
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    District district = new District();
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        district.setDistrictName(v(jSONObjectOptJSONObject, "name"));
                        district.setDistrictAdcode(v(jSONObjectOptJSONObject, "adcode"));
                        arrayList.add(district);
                    }
                }
                routeSearchCity.setDistricts(arrayList);
            } catch (JSONException e) {
                xts.i(e, "JSONHelper", "parseCrossDistricts");
                throw new AMapException("协议解析错误 - ProtocolException");
            }
        }
    }

    public static BusLineItem F0(JSONObject jSONObject) throws JSONException {
        BusLineItem busLineItem = new BusLineItem();
        busLineItem.setBusLineId(v(jSONObject, "id"));
        busLineItem.setBusLineType(v(jSONObject, "type"));
        busLineItem.setBusLineName(v(jSONObject, "name"));
        busLineItem.setDirectionsCoordinates(a0(jSONObject, "polyline"));
        busLineItem.setCityCode(v(jSONObject, "citycode"));
        busLineItem.setOriginatingStation(v(jSONObject, "start_stop"));
        busLineItem.setTerminalStation(v(jSONObject, "end_stop"));
        return busLineItem;
    }

    public static void G(TruckStep truckStep, JSONObject jSONObject) throws AMapException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cities");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                RouteSearchCity routeSearchCity = new RouteSearchCity();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    routeSearchCity.setSearchCityName(v(jSONObjectOptJSONObject, "name"));
                    routeSearchCity.setSearchCitycode(v(jSONObjectOptJSONObject, "citycode"));
                    routeSearchCity.setSearchCityhAdCode(v(jSONObjectOptJSONObject, "adcode"));
                    F(routeSearchCity, jSONObjectOptJSONObject);
                    arrayList.add(routeSearchCity);
                }
            }
            truckStep.setRouteSearchCityList(arrayList);
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseCrossCity");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static ArrayList<LatLonPoint> G0(String str) {
        ArrayList<LatLonPoint> arrayList = new ArrayList<>();
        for (String str2 : str.split(";")) {
            arrayList.add(I0(str2));
        }
        return arrayList;
    }

    public static void H(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Crossroad crossroad = new Crossroad();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                crossroad.setId(v(jSONObjectOptJSONObject, "id"));
                crossroad.setDirection(v(jSONObjectOptJSONObject, "direction"));
                crossroad.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
                crossroad.setCenterPoint(S(jSONObjectOptJSONObject, "location"));
                crossroad.setFirstRoadId(v(jSONObjectOptJSONObject, "first_id"));
                crossroad.setFirstRoadName(v(jSONObjectOptJSONObject, "first_name"));
                crossroad.setSecondRoadId(v(jSONObjectOptJSONObject, "second_id"));
                crossroad.setSecondRoadName(v(jSONObjectOptJSONObject, "second_name"));
                arrayList.add(crossroad);
            }
        }
        regeocodeAddress.setCrossroads(arrayList);
    }

    public static BusLineItem H0(JSONObject jSONObject) throws JSONException {
        BusLineItem busLineItemF0 = F0(jSONObject);
        busLineItemF0.setFirstBusTime(xts.n(v(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)));
        busLineItemF0.setLastBusTime(xts.n(v(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)));
        busLineItemF0.setBusCompany(v(jSONObject, "company"));
        busLineItemF0.setDistance(N0(v(jSONObject, "distance")));
        busLineItemF0.setBasicPrice(N0(v(jSONObject, "basic_price")));
        busLineItemF0.setTotalPrice(N0(v(jSONObject, "total_price")));
        busLineItemF0.setBounds(a0(jSONObject, "bounds"));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("busstops");
        if (jSONArrayOptJSONArray == null) {
            busLineItemF0.setBusStations(arrayList);
            return busLineItemF0;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(D0(jSONObjectOptJSONObject));
            }
        }
        busLineItemF0.setBusStations(arrayList);
        return busLineItemF0;
    }

    public static void I(JSONArray jSONArray, ArrayList<DistrictItem> arrayList, DistrictItem districtItem) throws JSONException {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(J0(jSONObjectOptJSONObject));
            }
        }
        if (districtItem != null) {
            districtItem.setSubDistrict(arrayList);
        }
    }

    public static LatLonPoint I0(String str) {
        if (str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return null;
        }
        String[] strArrSplit = str.split(",| ");
        if (strArrSplit.length != 2) {
            return null;
        }
        return new LatLonPoint(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0]));
    }

    public static void J(JSONObject jSONObject, RegeocodeAddress regeocodeAddress) throws JSONException {
        regeocodeAddress.setCountry(v(jSONObject, "country"));
        regeocodeAddress.setCountryCode(v(jSONObject, "countrycode"));
        regeocodeAddress.setProvince(v(jSONObject, "province"));
        regeocodeAddress.setCity(v(jSONObject, "city"));
        regeocodeAddress.setCityCode(v(jSONObject, "citycode"));
        regeocodeAddress.setAdCode(v(jSONObject, "adcode"));
        regeocodeAddress.setDistrict(v(jSONObject, DistrictSearchQuery.KEYWORDS_DISTRICT));
        regeocodeAddress.setTownship(v(jSONObject, "township"));
        regeocodeAddress.setNeighborhood(v(jSONObject.optJSONObject("neighborhood"), "name"));
        regeocodeAddress.setBuilding(v(jSONObject.optJSONObject("building"), "name"));
        StreetNumber streetNumber = new StreetNumber();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("streetNumber");
        streetNumber.setStreet(v(jSONObjectOptJSONObject, "street"));
        streetNumber.setNumber(v(jSONObjectOptJSONObject, RealNameWebViewActivity.NUMBER));
        streetNumber.setLatLonPoint(S(jSONObjectOptJSONObject, "location"));
        streetNumber.setDirection(v(jSONObjectOptJSONObject, "direction"));
        streetNumber.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
        regeocodeAddress.setStreetNumber(streetNumber);
        regeocodeAddress.setBusinessAreas(M0(jSONObject));
        regeocodeAddress.setTowncode(v(jSONObject, "towncode"));
        B(regeocodeAddress);
    }

    public static DistrictItem J0(JSONObject jSONObject) throws JSONException {
        String strOptString;
        DistrictItem districtItem = new DistrictItem();
        districtItem.setCitycode(v(jSONObject, "citycode"));
        districtItem.setAdcode(v(jSONObject, "adcode"));
        districtItem.setName(v(jSONObject, "name"));
        districtItem.setLevel(v(jSONObject, "level"));
        districtItem.setCenter(S(jSONObject, "center"));
        if (jSONObject.has("polyline") && (strOptString = jSONObject.optString("polyline")) != null && strOptString.length() > 0) {
            districtItem.setDistrictBoundary(strOptString.split("\\|"));
        }
        I(jSONObject.optJSONArray("districts"), new ArrayList(), districtItem);
        return districtItem;
    }

    public static int K(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optInt(str);
        }
        return -1;
    }

    public static boolean K0(String str) {
        return str == null || str.equals("") || str.equals("0");
    }

    public static BusRouteResultV2 L(String str) throws AMapException {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            BusRouteResultV2 busRouteResultV2 = new BusRouteResultV2();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            if (jSONObjectOptJSONObject == null) {
                return busRouteResultV2;
            }
            busRouteResultV2.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            busRouteResultV2.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            busRouteResultV2.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cost");
            if (jSONObjectOptJSONObject2 != null) {
                busRouteResultV2.setTaxiCost(N0(v(jSONObjectOptJSONObject2, "taxi_fee")));
            }
            if (!jSONObjectOptJSONObject.has("transits") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("transits")) == null) {
                return busRouteResultV2;
            }
            busRouteResultV2.setPaths(N(jSONArrayOptJSONArray));
            return busRouteResultV2;
        } catch (JSONException unused) {
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static int L0(String str) {
        if (str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            xts.i(e, "JSONHelper", "str2int");
            return 0;
        }
    }

    public static ArrayList<String> M(JSONObject jSONObject) throws JSONException {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keywords");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.optString(i));
        }
        return arrayList;
    }

    public static List<BusinessArea> M0(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("businessAreas");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                BusinessArea businessArea = new BusinessArea();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    businessArea.setCenterPoint(S(jSONObjectOptJSONObject, "location"));
                    businessArea.setName(v(jSONObjectOptJSONObject, "name"));
                    arrayList.add(businessArea);
                }
            }
        }
        return arrayList;
    }

    public static List<BusPathV2> N(JSONArray jSONArray) throws JSONException {
        BusStepV2 busStepV2Q0;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            BusPathV2 busPathV2 = new BusPathV2();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cost");
                if (jSONObjectOptJSONObject2 != null) {
                    busPathV2.setDuration(R0(v(jSONObjectOptJSONObject2, "duration")));
                    busPathV2.setCost(N0(v(jSONObjectOptJSONObject2, "transit_fee")));
                }
                busPathV2.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
                busPathV2.setNightBus(U0(v(jSONObjectOptJSONObject, "nightflag")));
                busPathV2.setWalkDistance(N0(v(jSONObjectOptJSONObject, "walking_distance")));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("segments");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    float distance = 0.0f;
                    float distance2 = 0.0f;
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject3 != null && (busStepV2Q0 = Q0(jSONObjectOptJSONObject3)) != null) {
                            arrayList2.add(busStepV2Q0);
                            if (busStepV2Q0.getWalk() != null) {
                                distance2 += busStepV2Q0.getWalk().getDistance();
                            }
                            if (busStepV2Q0.getBusLines() != null && busStepV2Q0.getBusLines().size() > 0) {
                                distance += busStepV2Q0.getBusLines().get(0).getDistance();
                            }
                        }
                    }
                    busPathV2.setSteps(arrayList2);
                    busPathV2.setBusDistance(distance);
                    busPathV2.setWalkDistance(distance2);
                    arrayList.add(busPathV2);
                }
            }
        }
        return arrayList;
    }

    public static float N0(String str) {
        if (str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            xts.i(e, "JSONHelper", "str2float");
            return 0.0f;
        }
    }

    public static void O(DriveStep driveStep, JSONObject jSONObject) throws AMapException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cities");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                RouteSearchCity routeSearchCity = new RouteSearchCity();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    routeSearchCity.setSearchCityName(v(jSONObjectOptJSONObject, "name"));
                    routeSearchCity.setSearchCitycode(v(jSONObjectOptJSONObject, "citycode"));
                    routeSearchCity.setSearchCityhAdCode(v(jSONObjectOptJSONObject, "adcode"));
                    F(routeSearchCity, jSONObjectOptJSONObject);
                    arrayList.add(routeSearchCity);
                }
            }
            driveStep.setRouteSearchCityList(arrayList);
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseCrossCity");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static BusStep O0(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        BusStep busStep = new BusStep();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("walking");
        if (jSONObjectOptJSONObject != null) {
            busStep.setWalk(S0(jSONObjectOptJSONObject));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bus");
        if (jSONObjectOptJSONObject2 != null) {
            busStep.setBusLines(V0(jSONObjectOptJSONObject2));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("entrance");
        if (jSONObjectOptJSONObject3 != null) {
            busStep.setEntrance(X0(jSONObjectOptJSONObject3));
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(LifecycleConstantKt.ACTION_EXIT);
        if (jSONObjectOptJSONObject4 != null) {
            busStep.setExit(X0(jSONObjectOptJSONObject4));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("railway");
        if (jSONObjectOptJSONObject5 != null) {
            busStep.setRailway(g(jSONObjectOptJSONObject5));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("taxi");
        if (jSONObjectOptJSONObject6 != null) {
            busStep.setTaxi(m(jSONObjectOptJSONObject6));
        }
        if ((busStep.getWalk() == null || busStep.getWalk().getSteps().size() == 0) && busStep.getBusLines().size() == 0 && busStep.getRailway() == null && busStep.getTaxi() == null) {
            return null;
        }
        return busStep;
    }

    public static void P(Path path, List<DriveStep> list) {
        List<LatLonPoint> polyline = path.getPolyline();
        if (polyline == null) {
            polyline = new ArrayList<>();
        }
        for (DriveStep driveStep : list) {
            if (driveStep != null && driveStep.getPolyline() != null) {
                polyline.addAll(driveStep.getPolyline());
            }
        }
        path.setPolyline(polyline);
    }

    public static double P0(String str) {
        if (str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            xts.i(e, "JSONHelper", "str2float");
            return 0.0d;
        }
    }

    public static void Q(TruckStep truckStep, JSONObject jSONObject) throws AMapException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tmcs");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                TMC tmc = new TMC();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    tmc.setDistance(L0(v(jSONObjectOptJSONObject, "distance")));
                    tmc.setStatus(v(jSONObjectOptJSONObject, "status"));
                    tmc.setPolyline(a0(jSONObjectOptJSONObject, "polyline"));
                    arrayList.add(tmc);
                }
            }
            truckStep.setTMCs(arrayList);
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseTMCs");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static BusStepV2 Q0(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        BusStepV2 busStepV2 = new BusStepV2();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("walking");
        if (jSONObjectOptJSONObject != null) {
            busStepV2.setWalk(T0(jSONObjectOptJSONObject));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bus");
        if (jSONObjectOptJSONObject2 != null) {
            busStepV2.setBusLines(W0(jSONObjectOptJSONObject2));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("entrance");
        if (jSONObjectOptJSONObject3 != null) {
            busStepV2.setEntrance(X0(jSONObjectOptJSONObject3));
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(LifecycleConstantKt.ACTION_EXIT);
        if (jSONObjectOptJSONObject4 != null) {
            busStepV2.setExit(X0(jSONObjectOptJSONObject4));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("railway");
        if (jSONObjectOptJSONObject5 != null) {
            busStepV2.setRailway(g(jSONObjectOptJSONObject5));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("taxi");
        if (jSONObjectOptJSONObject6 != null) {
            busStepV2.setTaxi(n(jSONObjectOptJSONObject6));
        }
        if ((busStepV2.getWalk() == null || busStepV2.getWalk().getSteps().size() == 0) && busStepV2.getBusLines().size() == 0 && busStepV2.getRailway() == null && busStepV2.getTaxi() == null) {
            return null;
        }
        return busStepV2;
    }

    public static void R(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            RegeocodeRoad regeocodeRoad = new RegeocodeRoad();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                regeocodeRoad.setId(v(jSONObjectOptJSONObject, "id"));
                regeocodeRoad.setName(v(jSONObjectOptJSONObject, "name"));
                regeocodeRoad.setLatLngPoint(S(jSONObjectOptJSONObject, "location"));
                regeocodeRoad.setDirection(v(jSONObjectOptJSONObject, "direction"));
                regeocodeRoad.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
                arrayList.add(regeocodeRoad);
            }
        }
        regeocodeAddress.setRoads(arrayList);
    }

    public static long R0(String str) {
        if (str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            xts.i(e, "JSONHelper", "str2long");
            return 0L;
        }
    }

    public static LatLonPoint S(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            return I0(jSONObject.optString(str));
        }
        return null;
    }

    public static RouteBusWalkItem S0(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null) {
            return null;
        }
        RouteBusWalkItem routeBusWalkItem = new RouteBusWalkItem();
        routeBusWalkItem.setOrigin(S(jSONObject, "origin"));
        routeBusWalkItem.setDestination(S(jSONObject, "destination"));
        routeBusWalkItem.setDistance(N0(v(jSONObject, "distance")));
        routeBusWalkItem.setDuration(R0(v(jSONObject, "duration")));
        if (!jSONObject.has("steps") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("steps")) == null) {
            return routeBusWalkItem;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(a(jSONObjectOptJSONObject));
            }
        }
        routeBusWalkItem.setSteps(arrayList);
        E(routeBusWalkItem, arrayList);
        return routeBusWalkItem;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x016c  */
    public static DriveRouteResult T(String str) throws AMapException {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            DriveRouteResult driveRouteResult = new DriveRouteResult();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            if (jSONObjectOptJSONObject == null) {
                return driveRouteResult;
            }
            driveRouteResult.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            driveRouteResult.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            driveRouteResult.setTaxiCost(N0(v(jSONObjectOptJSONObject, "taxi_cost")));
            if (!jSONObjectOptJSONObject.has("paths") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths")) == null) {
                return driveRouteResult;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                DrivePath drivePath = new DrivePath();
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    drivePath.setDistance(N0(v(jSONObjectOptJSONObject2, "distance")));
                    drivePath.setDuration(R0(v(jSONObjectOptJSONObject2, "duration")));
                    drivePath.setStrategy(v(jSONObjectOptJSONObject2, "strategy"));
                    drivePath.setTolls(N0(v(jSONObjectOptJSONObject2, "tolls")));
                    drivePath.setTollDistance(N0(v(jSONObjectOptJSONObject2, "toll_distance")));
                    drivePath.setTotalTrafficlights(L0(v(jSONObjectOptJSONObject2, "traffic_lights")));
                    drivePath.setRestriction(L0(v(jSONObjectOptJSONObject2, "restriction")));
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("steps");
                    if (jSONArrayOptJSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            DriveStep driveStep = new DriveStep();
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject3 != null) {
                                driveStep.setInstruction(v(jSONObjectOptJSONObject3, "instruction"));
                                driveStep.setOrientation(v(jSONObjectOptJSONObject3, "orientation"));
                                driveStep.setRoad(v(jSONObjectOptJSONObject3, "road"));
                                driveStep.setDistance(N0(v(jSONObjectOptJSONObject3, "distance")));
                                driveStep.setTolls(N0(v(jSONObjectOptJSONObject3, "tolls")));
                                driveStep.setTollDistance(N0(v(jSONObjectOptJSONObject3, "toll_distance")));
                                driveStep.setTollRoad(v(jSONObjectOptJSONObject3, "toll_road"));
                                driveStep.setDuration(N0(v(jSONObjectOptJSONObject3, "duration")));
                                driveStep.setPolyline(a0(jSONObjectOptJSONObject3, "polyline"));
                                driveStep.setAction(v(jSONObjectOptJSONObject3, "action"));
                                driveStep.setAssistantAction(v(jSONObjectOptJSONObject3, "assistant_action"));
                                O(driveStep, jSONObjectOptJSONObject3);
                                D(driveStep, jSONObjectOptJSONObject3);
                                arrayList2.add(driveStep);
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        drivePath.setSteps(arrayList2);
                        P(drivePath, arrayList2);
                        arrayList.add(drivePath);
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                    }
                } else {
                    jSONArray = jSONArrayOptJSONArray;
                }
                i++;
                jSONArrayOptJSONArray = jSONArray;
            }
            driveRouteResult.setPaths(arrayList);
            return driveRouteResult;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseDriveRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        } catch (Throwable th) {
            xts.i(th, "JSONHelper", "parseDriveRouteThrowable");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static RouteBusWalkItem T0(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null) {
            return null;
        }
        RouteBusWalkItem routeBusWalkItem = new RouteBusWalkItem();
        routeBusWalkItem.setOrigin(S(jSONObject, "origin"));
        routeBusWalkItem.setDestination(S(jSONObject, "destination"));
        routeBusWalkItem.setDistance(N0(v(jSONObject, "distance")));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cost");
        if (jSONObjectOptJSONObject != null) {
            routeBusWalkItem.setDuration(R0(v(jSONObjectOptJSONObject, "duration")));
        }
        if (!jSONObject.has("steps") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("steps")) == null) {
            return routeBusWalkItem;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null) {
                arrayList.add(b(jSONObjectOptJSONObject2));
            }
        }
        routeBusWalkItem.setSteps(arrayList);
        E(routeBusWalkItem, arrayList);
        return routeBusWalkItem;
    }

    public static ArrayList<PoiItem> U(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList<PoiItem> arrayList = new ArrayList<>();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("pois")) != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(d0(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public static boolean U0(String str) {
        return (str == null || str.equals("") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI) || str.equals("0") || !str.equals("1")) ? false : true;
    }

    public static List<ChargeStationInfo> V(JSONArray jSONArray) throws AMapException {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ChargeStationInfo chargeStationInfo = new ChargeStationInfo();
                chargeStationInfo.setName(v(jSONObject, "name"));
                chargeStationInfo.setPoiId(v(jSONObject, "poiid"));
                chargeStationInfo.setBrandName(v(jSONObject, "brand_name"));
                chargeStationInfo.setShowPoint(S(jSONObject, "show_point"));
                chargeStationInfo.setProjectivePoint(S(jSONObject, "projective_point"));
                chargeStationInfo.setMaxPower(K(jSONObject, "max_power"));
                chargeStationInfo.setChargePercent(K(jSONObject, "charge_percent"));
                chargeStationInfo.setChargeTime(K(jSONObject, "charge_time"));
                chargeStationInfo.setRemainingCapacity(K(jSONObject, "remaining_capacity"));
                chargeStationInfo.setVoltage(K(jSONObject, "voltage"));
                chargeStationInfo.setAmperage(K(jSONObject, "amperage"));
                chargeStationInfo.setStepIndex(K(jSONObject, "step_index"));
                arrayList.add(chargeStationInfo);
            }
            return arrayList;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseChargeStationInfo");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static List<RouteBusLineItem> V0(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("buslines")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(c(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static void W(Path path, List<DriveStepV2> list) {
        List<LatLonPoint> polyline = path.getPolyline();
        if (polyline == null) {
            polyline = new ArrayList<>();
        }
        for (DriveStepV2 driveStepV2 : list) {
            if (driveStepV2 != null && driveStepV2.getPolyline() != null) {
                polyline.addAll(driveStepV2.getPolyline());
            }
        }
        path.setPolyline(polyline);
    }

    public static List<RouteBusLineItem> W0(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("buslines")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(d(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static void X(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            AoiItem aoiItem = new AoiItem();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                aoiItem.setId(v(jSONObjectOptJSONObject, "id"));
                aoiItem.setName(v(jSONObjectOptJSONObject, "name"));
                aoiItem.setAdcode(v(jSONObjectOptJSONObject, "adcode"));
                aoiItem.setLocation(S(jSONObjectOptJSONObject, "location"));
                aoiItem.setArea(Float.valueOf(N0(v(jSONObjectOptJSONObject, "area"))));
                aoiItem.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
                aoiItem.setType(v(jSONObjectOptJSONObject, "type"));
                arrayList.add(aoiItem);
            }
        }
        regeocodeAddress.setAois(arrayList);
    }

    public static Doorway X0(JSONObject jSONObject) throws JSONException {
        Doorway doorway = new Doorway();
        doorway.setName(v(jSONObject, "name"));
        doorway.setLatLonPoint(S(jSONObject, "location"));
        return doorway;
    }

    public static DriveRouteResultV2 Y(String str) throws AMapException {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            DriveRouteResultV2 driveRouteResultV2 = new DriveRouteResultV2();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            if (jSONObjectOptJSONObject == null) {
                return driveRouteResultV2;
            }
            driveRouteResultV2.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            driveRouteResultV2.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            driveRouteResultV2.setTaxiCost(N0(v(jSONObjectOptJSONObject, "taxi_cost")));
            if (!jSONObjectOptJSONObject.has("paths") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths")) == null) {
                return driveRouteResultV2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                DrivePathV2 drivePathV2 = new DrivePathV2();
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    drivePathV2.setDistance(N0(v(jSONObjectOptJSONObject2, "distance")));
                    drivePathV2.setStrategy(v(jSONObjectOptJSONObject2, "strategy"));
                    drivePathV2.setRestriction(L0(v(jSONObjectOptJSONObject2, "restriction")));
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("cost");
                    if (jSONObjectOptJSONObject3 != null) {
                        Cost cost = new Cost();
                        C(cost, jSONObjectOptJSONObject3);
                        drivePathV2.setCost(cost);
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("elec_consume_info");
                    if (jSONObjectOptJSONObject4 != null) {
                        drivePathV2.setElecConsumeInfo(o(jSONObjectOptJSONObject4));
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("charge_station_info");
                    if (jSONArrayOptJSONArray2 != null) {
                        drivePathV2.setChargeStationInfo(V(jSONArrayOptJSONArray2));
                    }
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("steps");
                    if (jSONArrayOptJSONArray3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                            DriveStepV2 driveStepV2 = new DriveStepV2();
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(i2);
                            if (jSONObjectOptJSONObject5 != null) {
                                driveStepV2.setInstruction(v(jSONObjectOptJSONObject5, "instruction"));
                                driveStepV2.setOrientation(v(jSONObjectOptJSONObject5, "orientation"));
                                driveStepV2.setStepDistance(L0(v(jSONObjectOptJSONObject5, "step_distance")));
                                driveStepV2.setRoad(v(jSONObjectOptJSONObject5, "road_name"));
                                driveStepV2.setPolyline(a0(jSONObjectOptJSONObject5, "polyline"));
                                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("cost");
                                if (jSONObjectOptJSONObject6 != null) {
                                    Cost cost2 = new Cost();
                                    C(cost2, jSONObjectOptJSONObject6);
                                    driveStepV2.setCostDetail(cost2);
                                }
                                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject5.optJSONObject("navi");
                                if (jSONObjectOptJSONObject7 != null) {
                                    driveStepV2.setNavi(p(jSONObjectOptJSONObject7));
                                }
                                JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject5.optJSONArray("cities");
                                if (jSONArrayOptJSONArray4 != null) {
                                    driveStepV2.setRouteSearchCityList(g0(jSONArrayOptJSONArray4));
                                }
                                JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject5.optJSONArray("tmcs");
                                if (jSONArrayOptJSONArray5 != null) {
                                    driveStepV2.setTMCs(b0(jSONArrayOptJSONArray5));
                                }
                                arrayList2.add(driveStepV2);
                            }
                        }
                        drivePathV2.setSteps(arrayList2);
                        W(drivePathV2, arrayList2);
                        arrayList.add(drivePathV2);
                    }
                }
            }
            driveRouteResultV2.setPaths(arrayList);
            return driveRouteResultV2;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseDriveRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        } catch (Throwable th) {
            xts.i(th, "JSONHelper", "parseDriveRouteThrowable");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static ArrayList<PoiItemV2> Z(JSONObject jSONObject) throws JSONException {
        ArrayList<PoiItemV2> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(h0(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public static WalkStep a(JSONObject jSONObject) throws JSONException {
        WalkStep walkStep = new WalkStep();
        walkStep.setInstruction(v(jSONObject, "instruction"));
        walkStep.setOrientation(v(jSONObject, "orientation"));
        walkStep.setRoad(v(jSONObject, "road"));
        walkStep.setDistance(N0(v(jSONObject, "distance")));
        walkStep.setDuration(N0(v(jSONObject, "duration")));
        walkStep.setPolyline(a0(jSONObject, "polyline"));
        walkStep.setAction(v(jSONObject, "action"));
        walkStep.setAssistantAction(v(jSONObject, "assistant_action"));
        return walkStep;
    }

    public static ArrayList<LatLonPoint> a0(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return G0(jSONObject.optString(str));
        }
        return null;
    }

    public static WalkStep b(JSONObject jSONObject) throws JSONException {
        WalkStep walkStep = new WalkStep();
        walkStep.setInstruction(v(jSONObject, "instruction"));
        walkStep.setOrientation(v(jSONObject, "orientation"));
        walkStep.setRoad(v(jSONObject, "road"));
        walkStep.setDistance(N0(v(jSONObject, "distance")));
        walkStep.setDuration(N0(v(jSONObject, "duration")));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("polyline");
        if (jSONObjectOptJSONObject != null) {
            walkStep.setPolyline(a0(jSONObjectOptJSONObject, "polyline"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("navi");
        if (jSONObjectOptJSONObject2 != null) {
            walkStep.setAction(v(jSONObjectOptJSONObject2, "action"));
            walkStep.setAssistantAction(v(jSONObjectOptJSONObject2, "assistant_action"));
            walkStep.setRoadType(L0(v(jSONObjectOptJSONObject2, "walk_type")));
        }
        return walkStep;
    }

    public static List<TMC> b0(JSONArray jSONArray) throws AMapException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                TMC tmc = new TMC();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    tmc.setDistance(L0(v(jSONObjectOptJSONObject, "tmc_distance")));
                    tmc.setStatus(v(jSONObjectOptJSONObject, "tmc_status"));
                    tmc.setPolyline(a0(jSONObjectOptJSONObject, "tmc_polyline"));
                    arrayList.add(tmc);
                }
            } catch (JSONException e) {
                xts.i(e, "JSONHelper", "parseTMCsV5");
                throw new AMapException("协议解析错误 - ProtocolException");
            }
        }
        return arrayList;
    }

    public static RouteBusLineItem c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        RouteBusLineItem routeBusLineItem = new RouteBusLineItem();
        routeBusLineItem.setDepartureBusStation(f(jSONObject.optJSONObject("departure_stop")));
        routeBusLineItem.setArrivalBusStation(f(jSONObject.optJSONObject("arrival_stop")));
        routeBusLineItem.setBusLineName(v(jSONObject, "name"));
        routeBusLineItem.setBusLineId(v(jSONObject, "id"));
        routeBusLineItem.setBusLineType(v(jSONObject, "type"));
        routeBusLineItem.setDistance(N0(v(jSONObject, "distance")));
        routeBusLineItem.setDuration(N0(v(jSONObject, "duration")));
        routeBusLineItem.setPolyline(a0(jSONObject, "polyline"));
        routeBusLineItem.setFirstBusTime(xts.n(v(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)));
        routeBusLineItem.setLastBusTime(xts.n(v(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)));
        routeBusLineItem.setPassStationNum(L0(v(jSONObject, "via_num")));
        routeBusLineItem.setPassStations(e(jSONObject));
        return routeBusLineItem;
    }

    public static void c0(Path path, List<RideStep> list) {
        List<LatLonPoint> polyline = path.getPolyline();
        if (polyline == null) {
            polyline = new ArrayList<>();
        }
        for (RideStep rideStep : list) {
            if (rideStep != null && rideStep.getPolyline() != null) {
                polyline.addAll(rideStep.getPolyline());
            }
        }
        path.setPolyline(polyline);
    }

    public static RouteBusLineItem d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        RouteBusLineItem routeBusLineItem = new RouteBusLineItem();
        routeBusLineItem.setDepartureBusStation(f(jSONObject.optJSONObject("departure_stop")));
        routeBusLineItem.setArrivalBusStation(f(jSONObject.optJSONObject("arrival_stop")));
        routeBusLineItem.setBusLineName(v(jSONObject, "name"));
        routeBusLineItem.setBusLineId(v(jSONObject, "id"));
        routeBusLineItem.setBusLineType(v(jSONObject, "type"));
        routeBusLineItem.setDistance(N0(v(jSONObject, "distance")));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cost");
        if (jSONObjectOptJSONObject != null) {
            routeBusLineItem.setDuration(N0(v(jSONObjectOptJSONObject, "duration")));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("polyline");
        if (jSONObjectOptJSONObject2 != null) {
            routeBusLineItem.setPolyline(a0(jSONObjectOptJSONObject2, "polyline"));
        }
        routeBusLineItem.setFirstBusTime(xts.n(v(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)));
        routeBusLineItem.setLastBusTime(xts.n(v(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)));
        routeBusLineItem.setPassStationNum(L0(v(jSONObject, "via_num")));
        routeBusLineItem.setPassStations(e(jSONObject));
        return routeBusLineItem;
    }

    public static PoiItem d0(JSONObject jSONObject) throws JSONException {
        PoiItem poiItem = new PoiItem(v(jSONObject, "id"), S(jSONObject, "location"), v(jSONObject, "name"), v(jSONObject, Home.JSON_KEY_ADDRESS));
        poiItem.setAdCode(v(jSONObject, "adcode"));
        poiItem.setProvinceName(v(jSONObject, "pname"));
        poiItem.setCityName(v(jSONObject, "cityname"));
        poiItem.setAdName(v(jSONObject, "adname"));
        poiItem.setCityCode(v(jSONObject, "citycode"));
        poiItem.setProvinceCode(v(jSONObject, "pcode"));
        poiItem.setDirection(v(jSONObject, "direction"));
        if (jSONObject.has("distance")) {
            String strV = v(jSONObject, "distance");
            if (!s0(strV)) {
                try {
                    poiItem.setDistance((int) Float.parseFloat(strV));
                } catch (NumberFormatException e) {
                    xts.i(e, "JSONHelper", "parseBasePoi");
                } catch (Exception e2) {
                    xts.i(e2, "JSONHelper", "parseBasePoi");
                }
            }
        }
        poiItem.setTel(v(jSONObject, "tel"));
        poiItem.setTypeDes(v(jSONObject, "type"));
        poiItem.setEnter(S(jSONObject, "entr_location"));
        poiItem.setExit(S(jSONObject, "exit_location"));
        poiItem.setWebsite(v(jSONObject, "website"));
        poiItem.setPostcode(v(jSONObject, "postcode"));
        String strV2 = v(jSONObject, "business_area");
        if (s0(strV2)) {
            strV2 = v(jSONObject, "businessarea");
        }
        poiItem.setBusinessArea(strV2);
        poiItem.setEmail(v(jSONObject, "email"));
        if (K0(v(jSONObject, "indoor_map"))) {
            poiItem.setIndoorMap(false);
        } else {
            poiItem.setIndoorMap(true);
        }
        poiItem.setParkingType(v(jSONObject, "parking_type"));
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("children")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(x0(jSONObjectOptJSONObject));
                    }
                }
            }
            poiItem.setSubPois(arrayList);
        }
        poiItem.setIndoorDate(e0(jSONObject, "indoor_data"));
        poiItem.setPoiExtension(q0(jSONObject, "biz_ext"));
        poiItem.setTypeCode(v(jSONObject, "typecode"));
        poiItem.setShopID(v(jSONObject, "shopid"));
        z(poiItem, jSONObject);
        return poiItem;
    }

    public static List<BusStationItem> e(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("via_stops")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(f(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static IndoorData e0(JSONObject jSONObject, String str) throws JSONException {
        String strV;
        int iL0;
        String strV2;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject.has(str) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null && jSONObjectOptJSONObject.has("cpid") && jSONObjectOptJSONObject.has("floor")) {
            strV = v(jSONObjectOptJSONObject, "cpid");
            iL0 = L0(v(jSONObjectOptJSONObject, "floor"));
            strV2 = v(jSONObjectOptJSONObject, "truefloor");
        } else {
            strV = "";
            iL0 = 0;
            strV2 = "";
        }
        return new IndoorData(strV, iL0, strV2);
    }

    public static BusStationItem f(JSONObject jSONObject) throws JSONException {
        BusStationItem busStationItem = new BusStationItem();
        busStationItem.setBusStationName(v(jSONObject, "name"));
        busStationItem.setBusStationId(v(jSONObject, "id"));
        busStationItem.setLatLonPoint(S(jSONObject, "location"));
        return busStationItem;
    }

    public static WalkRouteResult f0(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            WalkRouteResult walkRouteResult = new WalkRouteResult();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            walkRouteResult.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            walkRouteResult.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            if (!jSONObjectOptJSONObject.has("paths")) {
                return walkRouteResult;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths");
            if (jSONArrayOptJSONArray == null) {
                walkRouteResult.setPaths(arrayList);
                return walkRouteResult;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                WalkPath walkPath = new WalkPath();
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    walkPath.setDistance(N0(v(jSONObjectOptJSONObject2, "distance")));
                    walkPath.setDuration(R0(v(jSONObjectOptJSONObject2, "duration")));
                    if (jSONObjectOptJSONObject2.has("steps")) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("steps");
                        ArrayList arrayList2 = new ArrayList();
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                WalkStep walkStep = new WalkStep();
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject3 != null) {
                                    walkStep.setInstruction(v(jSONObjectOptJSONObject3, "instruction"));
                                    walkStep.setOrientation(v(jSONObjectOptJSONObject3, "orientation"));
                                    walkStep.setRoad(v(jSONObjectOptJSONObject3, "road"));
                                    walkStep.setDistance(N0(v(jSONObjectOptJSONObject3, "distance")));
                                    walkStep.setDuration(N0(v(jSONObjectOptJSONObject3, "duration")));
                                    walkStep.setPolyline(a0(jSONObjectOptJSONObject3, "polyline"));
                                    walkStep.setAction(v(jSONObjectOptJSONObject3, "action"));
                                    walkStep.setAssistantAction(v(jSONObjectOptJSONObject3, "assistant_action"));
                                    arrayList2.add(walkStep);
                                }
                            }
                            walkPath.setSteps(arrayList2);
                            E(walkPath, arrayList2);
                            arrayList.add(walkPath);
                        }
                    } else {
                        arrayList.add(walkPath);
                    }
                }
            }
            walkRouteResult.setPaths(arrayList);
            return walkRouteResult;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseWalkRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static RouteRailwayItem g(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("id") || !jSONObject.has("name")) {
            return null;
        }
        RouteRailwayItem routeRailwayItem = new RouteRailwayItem();
        routeRailwayItem.setID(v(jSONObject, "id"));
        routeRailwayItem.setName(v(jSONObject, "name"));
        routeRailwayItem.setTime(v(jSONObject, "time"));
        routeRailwayItem.setTrip(v(jSONObject, "trip"));
        routeRailwayItem.setDistance(N0(v(jSONObject, "distance")));
        routeRailwayItem.setType(v(jSONObject, "type"));
        routeRailwayItem.setDeparturestop(h(jSONObject.optJSONObject("departure_stop")));
        routeRailwayItem.setArrivalstop(h(jSONObject.optJSONObject("arrival_stop")));
        routeRailwayItem.setViastops(i(jSONObject));
        routeRailwayItem.setAlters(j(jSONObject));
        routeRailwayItem.setSpaces(k(jSONObject));
        return routeRailwayItem;
    }

    public static List<RouteSearchCity> g0(JSONArray jSONArray) throws AMapException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                RouteSearchCity routeSearchCity = new RouteSearchCity();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    routeSearchCity.setSearchCityName(v(jSONObjectOptJSONObject, "name"));
                    routeSearchCity.setSearchCitycode(v(jSONObjectOptJSONObject, "citycode"));
                    routeSearchCity.setSearchCityhAdCode(v(jSONObjectOptJSONObject, "adcode"));
                    F(routeSearchCity, jSONObjectOptJSONObject);
                    arrayList.add(routeSearchCity);
                }
            } catch (JSONException e) {
                xts.i(e, "JSONHelper", "parseCrossCity");
                throw new AMapException("协议解析错误 - ProtocolException");
            }
        }
        return arrayList;
    }

    public static RailwayStationItem h(JSONObject jSONObject) throws JSONException {
        RailwayStationItem railwayStationItem = new RailwayStationItem();
        railwayStationItem.setID(v(jSONObject, "id"));
        railwayStationItem.setName(v(jSONObject, "name"));
        railwayStationItem.setLocation(S(jSONObject, "location"));
        railwayStationItem.setAdcode(v(jSONObject, "adcode"));
        railwayStationItem.setTime(v(jSONObject, "time"));
        railwayStationItem.setisStart(U0(v(jSONObject, StatConstants.PARAM_START)));
        railwayStationItem.setisEnd(U0(v(jSONObject, StatConstants.PARAM_END)));
        railwayStationItem.setWait(N0(v(jSONObject, "wait")));
        return railwayStationItem;
    }

    public static PoiItemV2 h0(JSONObject jSONObject) throws JSONException {
        PoiItemV2 poiItemV2 = new PoiItemV2(v(jSONObject, "id"), S(jSONObject, "location"), v(jSONObject, "name"), v(jSONObject, Home.JSON_KEY_ADDRESS));
        poiItemV2.setTypeDes(v(jSONObject, "type"));
        poiItemV2.setTypeCode(v(jSONObject, "typecode"));
        poiItemV2.setProvinceName(v(jSONObject, "pname"));
        poiItemV2.setCityName(v(jSONObject, "cityname"));
        poiItemV2.setAdName(v(jSONObject, "adname"));
        poiItemV2.setProvinceCode(v(jSONObject, "pcode"));
        poiItemV2.setAdCode(v(jSONObject, "adcode"));
        poiItemV2.setCityCode(v(jSONObject, "citycode"));
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("children")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(z0(jSONObjectOptJSONObject));
                    }
                }
            }
            poiItemV2.setSubPois(arrayList);
        }
        poiItemV2.setBusiness(k0(jSONObject, OneTrackExtKt.KEY_BUSINESS));
        poiItemV2.setIndoorData(i0(jSONObject, "indoor"));
        poiItemV2.setPoiNavi(n0(jSONObject, "navi"));
        A(poiItemV2, jSONObject);
        return poiItemV2;
    }

    public static List<RailwayStationItem> i(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("via_stops")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(h(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static IndoorDataV2 i0(JSONObject jSONObject, String str) throws JSONException {
        String strV;
        String strV2;
        int iL0;
        JSONObject jSONObjectOptJSONObject;
        boolean z = false;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            strV = "";
            strV2 = "";
            iL0 = 0;
        } else {
            z = L0(v(jSONObjectOptJSONObject, "indoor_map")) == 1;
            strV = v(jSONObjectOptJSONObject, "cpid");
            iL0 = L0(v(jSONObjectOptJSONObject, "floor"));
            strV2 = v(jSONObjectOptJSONObject, "truefloor");
        }
        return new IndoorDataV2(z, strV, iL0, strV2);
    }

    public static List<Railway> j(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("alters")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                Railway railway = new Railway();
                railway.setID(v(jSONObjectOptJSONObject, "id"));
                railway.setName(v(jSONObjectOptJSONObject, "name"));
                arrayList.add(railway);
            }
        }
        return arrayList;
    }

    public static WalkRouteResultV2 j0(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            WalkRouteResultV2 walkRouteResultV2 = new WalkRouteResultV2();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            walkRouteResultV2.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            walkRouteResultV2.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            if (!jSONObjectOptJSONObject.has("paths")) {
                return walkRouteResultV2;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths");
            if (jSONArrayOptJSONArray == null) {
                walkRouteResultV2.setPaths(arrayList);
                return walkRouteResultV2;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                WalkPath walkPath = new WalkPath();
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    walkPath.setDistance(N0(v(jSONObjectOptJSONObject2, "distance")));
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("cost");
                    if (jSONObjectOptJSONObject3 != null) {
                        walkPath.setDuration(R0(v(jSONObjectOptJSONObject3, "duration")));
                    }
                    if (jSONObjectOptJSONObject2.has("steps")) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("steps");
                        ArrayList arrayList2 = new ArrayList();
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                WalkStep walkStep = new WalkStep();
                                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject4 != null) {
                                    walkStep.setInstruction(v(jSONObjectOptJSONObject4, "instruction"));
                                    walkStep.setOrientation(v(jSONObjectOptJSONObject4, "orientation"));
                                    walkStep.setRoad(v(jSONObjectOptJSONObject4, "road_name"));
                                    walkStep.setDistance(N0(v(jSONObjectOptJSONObject4, "step_distance")));
                                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("cost");
                                    if (jSONObjectOptJSONObject5 != null) {
                                        walkStep.setDuration(N0(v(jSONObjectOptJSONObject5, "duration")));
                                    }
                                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject4.optJSONObject("navi");
                                    if (jSONObjectOptJSONObject6 != null) {
                                        walkStep.setAction(v(jSONObjectOptJSONObject6, "action"));
                                        walkStep.setAssistantAction(v(jSONObjectOptJSONObject6, "assistant_action"));
                                        walkStep.setRoadType(L0(v(jSONObjectOptJSONObject6, "work_type")));
                                    }
                                    walkStep.setPolyline(a0(jSONObjectOptJSONObject4, "polyline"));
                                    arrayList2.add(walkStep);
                                }
                            }
                            walkPath.setSteps(arrayList2);
                            E(walkPath, arrayList2);
                            arrayList.add(walkPath);
                        }
                    } else {
                        arrayList.add(walkPath);
                    }
                }
            }
            walkRouteResultV2.setPaths(arrayList);
            return walkRouteResultV2;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseWalkRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static List<RailwaySpace> k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("spaces")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(l(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static Business k0(JSONObject jSONObject, String str) throws JSONException {
        String strV;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            strV = "";
            str2 = strV;
            str3 = str2;
            str4 = str3;
            str5 = str4;
            str6 = str5;
            str7 = str6;
            str8 = str7;
            str9 = str8;
            str10 = str9;
        } else {
            String strV2 = v(jSONObjectOptJSONObject, "business_area");
            String strV3 = v(jSONObjectOptJSONObject, "opentime_today");
            String strV4 = v(jSONObjectOptJSONObject, "opentime_week");
            String strV5 = v(jSONObjectOptJSONObject, "tel");
            String strV6 = v(jSONObjectOptJSONObject, "tag");
            String strV7 = v(jSONObjectOptJSONObject, "rating");
            String strV8 = v(jSONObjectOptJSONObject, "cost");
            String strV9 = v(jSONObjectOptJSONObject, "parking_type");
            String strV10 = v(jSONObjectOptJSONObject, "alias");
            strV = v(jSONObjectOptJSONObject, "cpid");
            str9 = strV9;
            str10 = strV10;
            str7 = strV7;
            str8 = strV8;
            str5 = strV5;
            str6 = strV6;
            str3 = strV3;
            str4 = strV4;
            str2 = strV2;
        }
        Business business = new Business(str2, str3, str4, str5, str6, str7, str8, str9, str10);
        business.setCPID(strV);
        return business;
    }

    public static RailwaySpace l(JSONObject jSONObject) throws JSONException {
        return new RailwaySpace(v(jSONObject, "code"), N0(v(jSONObject, "cost")));
    }

    public static LocalWeatherLive l0(String str) throws AMapException {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("lives")) {
                return null;
            }
            LocalWeatherLive localWeatherLive = new LocalWeatherLive();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("lives");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                return localWeatherLive;
            }
            localWeatherLive.setAdCode(v(jSONObjectOptJSONObject, "adcode"));
            localWeatherLive.setProvince(v(jSONObjectOptJSONObject, "province"));
            localWeatherLive.setCity(v(jSONObjectOptJSONObject, "city"));
            localWeatherLive.setWeather(v(jSONObjectOptJSONObject, "weather"));
            localWeatherLive.setTemperature(v(jSONObjectOptJSONObject, "temperature"));
            localWeatherLive.setWindDirection(v(jSONObjectOptJSONObject, "winddirection"));
            localWeatherLive.setWindPower(v(jSONObjectOptJSONObject, "windpower"));
            localWeatherLive.setHumidity(v(jSONObjectOptJSONObject, DialWidgetType.HUMIDITY));
            localWeatherLive.setReportTime(v(jSONObjectOptJSONObject, "reporttime"));
            return localWeatherLive;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "WeatherForecastResult");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static TaxiItem m(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        TaxiItem taxiItem = new TaxiItem();
        taxiItem.setOrigin(S(jSONObject, "origin"));
        taxiItem.setDestination(S(jSONObject, "destination"));
        taxiItem.setDistance(N0(v(jSONObject, "distance")));
        taxiItem.setDuration(N0(v(jSONObject, "duration")));
        taxiItem.setSname(v(jSONObject, "sname"));
        taxiItem.setTname(v(jSONObject, "tname"));
        return taxiItem;
    }

    public static ArrayList<BusStationItem> m0(JSONObject jSONObject) throws JSONException {
        ArrayList<BusStationItem> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("busstops");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(B0(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public static TaxiItemV2 n(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        TaxiItemV2 taxiItemV2 = new TaxiItemV2();
        taxiItemV2.setOrigin(S(jSONObject, "startpoint"));
        taxiItemV2.setDestination(S(jSONObject, "endpoint"));
        taxiItemV2.setDistance(N0(v(jSONObject, "distance")));
        taxiItemV2.setDuration(N0(v(jSONObject, "drivetime")));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("polyline");
        if (jSONObjectOptJSONObject != null) {
            taxiItemV2.setPolyline(a0(jSONObjectOptJSONObject, "polyline"));
        }
        taxiItemV2.setSname(v(jSONObject, "startname"));
        taxiItemV2.setTname(v(jSONObject, "endname"));
        return taxiItemV2;
    }

    public static PoiNavi n0(JSONObject jSONObject, String str) throws JSONException {
        String strV;
        LatLonPoint latLonPointS;
        String strV2;
        LatLonPoint latLonPointS2;
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            strV = "";
            latLonPointS = null;
            strV2 = "";
            latLonPointS2 = null;
        } else {
            strV = v(jSONObjectOptJSONObject, "navi_poiid");
            latLonPointS = S(jSONObjectOptJSONObject, "entr_location");
            latLonPointS2 = S(jSONObjectOptJSONObject, "exit_location");
            strV2 = v(jSONObjectOptJSONObject, "gridcode");
        }
        return new PoiNavi(strV, latLonPointS, latLonPointS2, strV2);
    }

    public static ElecConsumeInfo o(JSONObject jSONObject) throws AMapException {
        try {
            ElecConsumeInfo elecConsumeInfo = new ElecConsumeInfo();
            elecConsumeInfo.setRunOutPoint(S(jSONObject, "runout_point"));
            elecConsumeInfo.setRunOutStepIndex(K(jSONObject, "runout_step_index"));
            elecConsumeInfo.setConsumeEnergy(K(jSONObject, "consume_energy"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("left_energy");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
                }
            }
            elecConsumeInfo.setLeftEnergy(arrayList);
            return elecConsumeInfo;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseElecConsumeInfo");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static LocalWeatherForecast o0(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("forecasts")) {
                return null;
            }
            LocalWeatherForecast localWeatherForecast = new LocalWeatherForecast();
            JSONArray jSONArray = jSONObject.getJSONArray("forecasts");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
                if (jSONObjectOptJSONObject == null) {
                    return localWeatherForecast;
                }
                localWeatherForecast.setCity(v(jSONObjectOptJSONObject, "city"));
                localWeatherForecast.setAdCode(v(jSONObjectOptJSONObject, "adcode"));
                localWeatherForecast.setProvince(v(jSONObjectOptJSONObject, "province"));
                localWeatherForecast.setReportTime(v(jSONObjectOptJSONObject, "reporttime"));
                if (!jSONObjectOptJSONObject.has("casts")) {
                    return localWeatherForecast;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("casts");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        LocalDayWeatherForecast localDayWeatherForecast = new LocalDayWeatherForecast();
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject2 != null) {
                            localDayWeatherForecast.setDate(v(jSONObjectOptJSONObject2, DialWidgetType.DATE));
                            localDayWeatherForecast.setWeek(v(jSONObjectOptJSONObject2, "week"));
                            localDayWeatherForecast.setDayWeather(v(jSONObjectOptJSONObject2, "dayweather"));
                            localDayWeatherForecast.setNightWeather(v(jSONObjectOptJSONObject2, "nightweather"));
                            localDayWeatherForecast.setDayTemp(v(jSONObjectOptJSONObject2, "daytemp"));
                            localDayWeatherForecast.setNightTemp(v(jSONObjectOptJSONObject2, "nighttemp"));
                            localDayWeatherForecast.setDayWindDirection(v(jSONObjectOptJSONObject2, "daywind"));
                            localDayWeatherForecast.setNightWindDirection(v(jSONObjectOptJSONObject2, "nightwind"));
                            localDayWeatherForecast.setDayWindPower(v(jSONObjectOptJSONObject2, "daypower"));
                            localDayWeatherForecast.setNightWindPower(v(jSONObjectOptJSONObject2, "nightpower"));
                            arrayList.add(localDayWeatherForecast);
                        }
                    }
                    localWeatherForecast.setWeatherForecast(arrayList);
                    return localWeatherForecast;
                }
                localWeatherForecast.setWeatherForecast(arrayList);
            }
            return localWeatherForecast;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "WeatherForecastResult");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static Navi p(JSONObject jSONObject) throws AMapException {
        try {
            Navi navi = new Navi();
            navi.setAction(v(jSONObject, "action"));
            navi.setAssistantAction(v(jSONObject, "assistant_action"));
            return navi;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseNavi");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static ArrayList<BusLineItem> p0(JSONObject jSONObject) throws JSONException {
        ArrayList<BusLineItem> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("buslines");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(H0(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static List<Photo> q(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || !jSONObject.has("photos")) {
            return arrayList;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("photos");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            Photo photo = new Photo();
            photo.setTitle(v(jSONObjectOptJSONObject, "title"));
            photo.setUrl(v(jSONObjectOptJSONObject, "url"));
            arrayList.add(photo);
        }
        return arrayList;
    }

    public static PoiItemExtension q0(JSONObject jSONObject, String str) throws JSONException {
        String strV;
        String strV2;
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            strV = "";
            strV2 = "";
        } else {
            strV = v(jSONObjectOptJSONObject, "open_time");
            strV2 = v(jSONObjectOptJSONObject, "rating");
        }
        return new PoiItemExtension(strV, strV2);
    }

    public static RoutePOIItem r(JSONObject jSONObject) throws JSONException {
        RoutePOIItem routePOIItem = new RoutePOIItem();
        routePOIItem.setID(v(jSONObject, "id"));
        routePOIItem.setTitle(v(jSONObject, "name"));
        routePOIItem.setPoint(S(jSONObject, "location"));
        routePOIItem.setDistance(N0(v(jSONObject, "distance")));
        routePOIItem.setDuration(N0(v(jSONObject, "duration")));
        routePOIItem.setCPID(v(jSONObject, "cpid"));
        return routePOIItem;
    }

    public static ArrayList<GeocodeAddress> r0(JSONObject jSONObject) throws JSONException {
        ArrayList<GeocodeAddress> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("geocodes");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    GeocodeAddress geocodeAddress = new GeocodeAddress();
                    geocodeAddress.setFormatAddress(v(jSONObjectOptJSONObject, "formatted_address"));
                    geocodeAddress.setProvince(v(jSONObjectOptJSONObject, "province"));
                    geocodeAddress.setCity(v(jSONObjectOptJSONObject, "city"));
                    geocodeAddress.setDistrict(v(jSONObjectOptJSONObject, DistrictSearchQuery.KEYWORDS_DISTRICT));
                    geocodeAddress.setTownship(v(jSONObjectOptJSONObject, "township"));
                    geocodeAddress.setNeighborhood(v(jSONObjectOptJSONObject.optJSONObject("neighborhood"), "name"));
                    geocodeAddress.setBuilding(v(jSONObjectOptJSONObject.optJSONObject("building"), "name"));
                    geocodeAddress.setAdcode(v(jSONObjectOptJSONObject, "adcode"));
                    geocodeAddress.setLatLonPoint(S(jSONObjectOptJSONObject, "location"));
                    geocodeAddress.setLevel(v(jSONObjectOptJSONObject, "level"));
                    geocodeAddress.setCountry(v(jSONObjectOptJSONObject, "country"));
                    geocodeAddress.setPostcode(v(jSONObjectOptJSONObject, "postcode"));
                    arrayList.add(geocodeAddress);
                }
            }
        }
        return arrayList;
    }

    public static RidePath s(JSONObject jSONObject) throws AMapException {
        RidePath ridePath = new RidePath();
        if (jSONObject == null) {
            return null;
        }
        try {
            ridePath.setDistance(N0(v(jSONObject, "distance")));
            ridePath.setDuration(R0(v(jSONObject, "duration")));
            if (jSONObject.has("steps")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("steps");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray == null) {
                    return null;
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    RideStep rideStep = new RideStep();
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        rideStep.setInstruction(v(jSONObjectOptJSONObject, "instruction"));
                        rideStep.setOrientation(v(jSONObjectOptJSONObject, "orientation"));
                        rideStep.setRoad(v(jSONObjectOptJSONObject, "road"));
                        rideStep.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
                        rideStep.setDuration(N0(v(jSONObjectOptJSONObject, "duration")));
                        rideStep.setPolyline(a0(jSONObjectOptJSONObject, "polyline"));
                        rideStep.setAction(v(jSONObjectOptJSONObject, "action"));
                        rideStep.setAssistantAction(v(jSONObjectOptJSONObject, "assistant_action"));
                        arrayList.add(rideStep);
                    }
                }
                ridePath.setSteps(arrayList);
                c0(ridePath, arrayList);
            }
            return ridePath;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseRidePath");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static boolean s0(String str) {
        return str == null || str.equals("");
    }

    public static RidePath t(JSONObject jSONObject) throws AMapException {
        RidePath ridePath = new RidePath();
        if (jSONObject == null) {
            return null;
        }
        try {
            ridePath.setDistance(N0(v(jSONObject, "distance")));
            ridePath.setDuration(R0(v(jSONObject, "duration")));
            if (jSONObject.has("steps")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("steps");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray == null) {
                    return null;
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    RideStep rideStep = new RideStep();
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        rideStep.setInstruction(v(jSONObjectOptJSONObject, "instruction"));
                        rideStep.setOrientation(v(jSONObjectOptJSONObject, "orientation"));
                        rideStep.setRoad(v(jSONObjectOptJSONObject, "road_name"));
                        rideStep.setDistance(N0(v(jSONObjectOptJSONObject, "step_distance")));
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cost");
                        if (jSONObjectOptJSONObject2 != null) {
                            rideStep.setDuration(N0(v(jSONObjectOptJSONObject2, "duration")));
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("navi");
                        if (jSONObjectOptJSONObject3 != null) {
                            rideStep.setAction(v(jSONObjectOptJSONObject3, "action"));
                            rideStep.setAssistantAction(v(jSONObjectOptJSONObject3, "assistant_action"));
                            rideStep.setRoadType(L0(v(jSONObjectOptJSONObject3, "work_type")));
                        }
                        rideStep.setPolyline(a0(jSONObjectOptJSONObject, "polyline"));
                        arrayList.add(rideStep);
                    }
                }
                ridePath.setSteps(arrayList);
                c0(ridePath, arrayList);
            }
            return ridePath;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseRidePathV2");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static RideRouteResult t0(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("data")) {
                return null;
            }
            RideRouteResult rideRouteResult = new RideRouteResult();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            rideRouteResult.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            rideRouteResult.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            ArrayList arrayList = new ArrayList();
            Object objOpt = jSONObjectOptJSONObject.opt("paths");
            if (objOpt == null) {
                rideRouteResult.setPaths(arrayList);
                return rideRouteResult;
            }
            if (objOpt instanceof JSONArray) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths");
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    RidePath ridePathS = s(jSONArrayOptJSONArray.optJSONObject(i));
                    if (ridePathS != null) {
                        arrayList.add(ridePathS);
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("paths");
                if (!jSONObjectOptJSONObject2.has("path")) {
                    rideRouteResult.setPaths(arrayList);
                    return rideRouteResult;
                }
                RidePath ridePathS2 = s(jSONObjectOptJSONObject2.optJSONObject("path"));
                if (ridePathS2 != null) {
                    arrayList.add(ridePathS2);
                }
            }
            rideRouteResult.setPaths(arrayList);
            return rideRouteResult;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseRideRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static BusRouteResult u(String str) throws AMapException {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            BusRouteResult busRouteResult = new BusRouteResult();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            if (jSONObjectOptJSONObject == null) {
                return busRouteResult;
            }
            busRouteResult.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            busRouteResult.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            busRouteResult.setTaxiCost(N0(v(jSONObjectOptJSONObject, "taxi_cost")));
            if (!jSONObjectOptJSONObject.has("transits") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("transits")) == null) {
                return busRouteResult;
            }
            busRouteResult.setPaths(y(jSONArrayOptJSONArray));
            return busRouteResult;
        } catch (JSONException unused) {
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static ArrayList<Tip> u0(JSONObject jSONObject) throws JSONException {
        ArrayList<Tip> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tips");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            Tip tip = new Tip();
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                tip.setName(v(jSONObjectOptJSONObject, "name"));
                tip.setDistrict(v(jSONObjectOptJSONObject, DistrictSearchQuery.KEYWORDS_DISTRICT));
                tip.setAdcode(v(jSONObjectOptJSONObject, "adcode"));
                tip.setID(v(jSONObjectOptJSONObject, "id"));
                tip.setAddress(v(jSONObjectOptJSONObject, Home.JSON_KEY_ADDRESS));
                tip.setTypeCode(v(jSONObjectOptJSONObject, "typecode"));
                String strV = v(jSONObjectOptJSONObject, "location");
                if (!TextUtils.isEmpty(strV)) {
                    String[] strArrSplit = strV.split(",");
                    if (strArrSplit.length == 2) {
                        tip.setPostion(new LatLonPoint(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0])));
                    }
                }
                arrayList.add(tip);
            }
        }
        return arrayList;
    }

    public static String v(JSONObject jSONObject, String str) throws JSONException {
        return (jSONObject == null || !jSONObject.has(str) || jSONObject.optString(str).equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) ? "" : jSONObject.optString(str).trim();
    }

    public static RideRouteResultV2 v0(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            RideRouteResultV2 rideRouteResultV2 = new RideRouteResultV2();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("route");
            rideRouteResultV2.setStartPos(S(jSONObjectOptJSONObject, "origin"));
            rideRouteResultV2.setTargetPos(S(jSONObjectOptJSONObject, "destination"));
            ArrayList arrayList = new ArrayList();
            Object objOpt = jSONObjectOptJSONObject.opt("paths");
            if (objOpt == null) {
                rideRouteResultV2.setPaths(arrayList);
                return rideRouteResultV2;
            }
            if (objOpt instanceof JSONArray) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("paths");
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    RidePath ridePathT = t(jSONArrayOptJSONArray.optJSONObject(i));
                    if (ridePathT != null) {
                        arrayList.add(ridePathT);
                    }
                }
            }
            rideRouteResultV2.setPaths(arrayList);
            return rideRouteResultV2;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseRideRouteV2");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static ArrayList<SuggestionCity> w(JSONObject jSONObject) throws JSONException, NumberFormatException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList<SuggestionCity> arrayList = new ArrayList<>();
        if (!jSONObject.has("cities") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("cities")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new SuggestionCity(v(jSONObjectOptJSONObject, "name"), v(jSONObjectOptJSONObject, "citycode"), v(jSONObjectOptJSONObject, "adcode"), L0(v(jSONObjectOptJSONObject, "num"))));
            }
        }
        return arrayList;
    }

    public static ArrayList<RoutePOIItem> w0(JSONObject jSONObject) throws JSONException {
        ArrayList<RoutePOIItem> arrayList = new ArrayList<>();
        Object objOpt = jSONObject.opt("pois");
        if (objOpt instanceof JSONArray) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return arrayList;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(r(jSONObjectOptJSONObject));
                }
            }
        } else if (objOpt instanceof JSONObject) {
            arrayList.add(r(((JSONObject) objOpt).optJSONObject("poi")));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    public static ArrayList<NearbyInfo> x(JSONObject jSONObject, boolean z) throws JSONException {
        double dP0;
        double dP1;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("datas");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<NearbyInfo> arrayList = new ArrayList<>();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strV = v(jSONObjectOptJSONObject, AuthorizeActivityBase.KEY_USERID);
            String strV2 = v(jSONObjectOptJSONObject, "location");
            if (strV2 != null) {
                String[] strArrSplit = strV2.split(",");
                if (strArrSplit.length == 2) {
                    dP0 = P0(strArrSplit[0]);
                    dP1 = P0(strArrSplit[1]);
                } else {
                    dP0 = 0.0d;
                    dP1 = 0.0d;
                }
            } else {
                dP0 = 0.0d;
                dP1 = 0.0d;
            }
            String strV3 = v(jSONObjectOptJSONObject, "distance");
            long jR0 = R0(v(jSONObjectOptJSONObject, "updatetime"));
            int iL0 = L0(strV3);
            LatLonPoint latLonPoint = new LatLonPoint(dP1, dP0);
            NearbyInfo nearbyInfo = new NearbyInfo();
            nearbyInfo.setUserID(strV);
            nearbyInfo.setTimeStamp(jR0);
            nearbyInfo.setPoint(latLonPoint);
            if (z) {
                nearbyInfo.setDrivingDistance(iL0);
            } else {
                nearbyInfo.setDistance(iL0);
            }
            arrayList.add(nearbyInfo);
        }
        return arrayList;
    }

    public static SubPoiItem x0(JSONObject jSONObject) throws JSONException {
        SubPoiItem subPoiItem = new SubPoiItem(v(jSONObject, "id"), S(jSONObject, "location"), v(jSONObject, "name"), v(jSONObject, Home.JSON_KEY_ADDRESS));
        subPoiItem.setSubName(v(jSONObject, "sname"));
        subPoiItem.setSubTypeDes(v(jSONObject, "subtype"));
        if (jSONObject.has("distance")) {
            String strV = v(jSONObject, "distance");
            if (!s0(strV)) {
                try {
                    subPoiItem.setDistance((int) Float.parseFloat(strV));
                } catch (NumberFormatException e) {
                    xts.i(e, "JSONHelper", "parseSubPoiItem");
                } catch (Exception e2) {
                    xts.i(e2, "JSONHelper", "parseSubPoiItem");
                }
            }
        }
        return subPoiItem;
    }

    public static List<BusPath> y(JSONArray jSONArray) throws JSONException {
        BusStep busStepO0;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            BusPath busPath = new BusPath();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                busPath.setCost(N0(v(jSONObjectOptJSONObject, "cost")));
                busPath.setDuration(R0(v(jSONObjectOptJSONObject, "duration")));
                busPath.setNightBus(U0(v(jSONObjectOptJSONObject, "nightflag")));
                busPath.setWalkDistance(N0(v(jSONObjectOptJSONObject, "walking_distance")));
                busPath.setDistance(N0(v(jSONObjectOptJSONObject, "distance")));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("segments");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    float distance = 0.0f;
                    float distance2 = 0.0f;
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject2 != null && (busStepO0 = O0(jSONObjectOptJSONObject2)) != null) {
                            arrayList2.add(busStepO0);
                            if (busStepO0.getWalk() != null) {
                                distance2 += busStepO0.getWalk().getDistance();
                            }
                            if (busStepO0.getBusLines() != null && busStepO0.getBusLines().size() > 0) {
                                distance += busStepO0.getBusLines().get(0).getDistance();
                            }
                        }
                    }
                    busPath.setSteps(arrayList2);
                    busPath.setBusDistance(distance);
                    busPath.setWalkDistance(distance2);
                    arrayList.add(busPath);
                }
            }
        }
        return arrayList;
    }

    public static DistanceResult y0(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("results")) {
                return null;
            }
            DistanceResult distanceResult = new DistanceResult();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("results");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                DistanceItem distanceItem = new DistanceItem();
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                distanceItem.setOriginId(L0(v(jSONObject2, "origin_id")));
                distanceItem.setDestId(L0(v(jSONObject2, "dest_id")));
                distanceItem.setDistance(N0(v(jSONObject2, "distance")));
                distanceItem.setDuration(N0(v(jSONObject2, "duration")));
                String strV = v(jSONObject2, "info");
                if (!TextUtils.isEmpty(strV)) {
                    distanceItem.setErrorInfo(strV);
                    distanceItem.setErrorCode(L0(v(jSONObject2, "code")));
                }
                arrayList.add(distanceItem);
            }
            distanceResult.setDistanceResults(arrayList);
            return distanceResult;
        } catch (JSONException e) {
            xts.i(e, "JSONHelper", "parseRouteDistance");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static void z(PoiItem poiItem, JSONObject jSONObject) throws JSONException {
        List<Photo> listQ = q(jSONObject.optJSONObject("deep_info"));
        if (listQ.size() == 0) {
            listQ = q(jSONObject);
        }
        poiItem.setPhotos(listQ);
    }

    public static SubPoiItemV2 z0(JSONObject jSONObject) throws JSONException {
        SubPoiItemV2 subPoiItemV2 = new SubPoiItemV2(v(jSONObject, "id"), S(jSONObject, "location"), v(jSONObject, "name"), v(jSONObject, Home.JSON_KEY_ADDRESS));
        subPoiItemV2.setSubTypeDes(v(jSONObject, "subtype"));
        subPoiItemV2.setTypeCode(v(jSONObject, "typecode"));
        return subPoiItemV2;
    }
}
