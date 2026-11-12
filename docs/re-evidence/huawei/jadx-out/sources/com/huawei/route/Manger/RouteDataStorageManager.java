package com.huawei.route.Manger;

import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.route.TrackInfoModel;
import defpackage.ecu;
import defpackage.eey;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class RouteDataStorageManager {
    public static final String ACTIVITY_MY_ROUTE = "com.huawei.ui.main.stories.route.activity.MyRouteActivity";
    public static final String IS_ADD_NEW_ROUTE = "is_add_new_route";
    private static final String TAG = "Track_RouteDataStorageManager";
    private static List<RouteData> sRouteData;
    private static TrackInfoModel sTrackInfoModel;

    private RouteDataStorageManager() {
    }

    public static RouteData getRouteData() {
        if (njy.e(sRouteData)) {
            return null;
        }
        return sRouteData.get(0);
    }

    public static List<RouteData> getRouteDataList() {
        return sRouteData;
    }

    public static void setRouteData(RouteData routeData) {
        if (sRouteData == null) {
            sRouteData = new ArrayList();
        }
        if (routeData != null) {
            sRouteData.clear();
            sRouteData.add(routeData);
        }
    }

    public static void setRouteDataList(List<RouteData> list) {
        sRouteData = list;
    }

    public static TrackInfoModel getTrackInfoModel() {
        return sTrackInfoModel;
    }

    public static void setTrackInfoModel(TrackInfoModel trackInfoModel) {
        sTrackInfoModel = trackInfoModel;
    }

    public static void clearRouteData() {
        List<RouteData> list = sRouteData;
        if (list != null) {
            list.clear();
            sRouteData = null;
        }
    }

    public static void clearTrackInfoModel() {
        if (sTrackInfoModel != null) {
            sTrackInfoModel = null;
        }
    }

    public static boolean isSupportRouteDeliver() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG), 70);
    }
}
