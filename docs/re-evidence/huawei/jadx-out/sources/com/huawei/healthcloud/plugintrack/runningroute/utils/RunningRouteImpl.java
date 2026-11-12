package com.huawei.healthcloud.plugintrack.runningroute.utils;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.motiontrack.api.ILocationChangeListener;
import com.huawei.health.motiontrack.api.RunningRouteApi;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.Constants;
import defpackage.gch;
import defpackage.gck;
import defpackage.gcp;
import defpackage.gcq;
import defpackage.gcr;
import defpackage.gcv;
import defpackage.gcw;
import defpackage.gcx;
import defpackage.gcy;
import defpackage.gcz;
import defpackage.gda;
import defpackage.gdb;
import defpackage.gdc;
import defpackage.gdd;
import defpackage.gde;
import defpackage.gdf;
import defpackage.gdg;
import defpackage.gdh;
import defpackage.gdi;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.gdm;
import defpackage.gdr;
import defpackage.iwh;
import defpackage.jdp;
import defpackage.jpg;
import defpackage.qqt;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class RunningRouteImpl implements RunningRouteApi {
    private static final int LOCATION_UPDATE_TIME = 30000;
    private static final String TAG = "RunningRouteImpl";
    private ILocationChangeListener mLocationChangeListener;
    private Handler mUiHandler = new Handler(Looper.getMainLooper());
    private int mConvertMode = 0;
    private LocationListener mLocationListener = new LocationListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.3
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            SharedPreferenceManager.e(BaseApplication.b(), "USER_LOCATION_LAT_LNG", "USER_LOCATION_LAT_LNG", qqt.b(new jpg(location.getLatitude(), location.getLongitude())), null);
            iwh iwhVar = new iwh(BaseApplication.b(), RunningRouteImpl.this.mConvertMode);
            if (RunningRouteImpl.this.mLocationChangeListener != null) {
                RunningRouteImpl.this.mLocationChangeListener.onLocationChange(iwhVar.b(location));
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            LogUtil.a(RunningRouteImpl.TAG, "sLocationListener onProviderDisabled ", str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            LogUtil.a(RunningRouteImpl.TAG, "sLocationListener onProviderEnabled ", str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            LogUtil.a(RunningRouteImpl.TAG, "sLocationListener onStatusChanged ", Integer.valueOf(i));
        }
    };

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getCityInfoList(final gcw gcwVar, final UiCallback<gda> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "queryCityInfoList: Request Received, processing.....");
        jdp.c(gcwVar, new ResultCallback<gda>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(final gda gdaVar) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.10.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Map map;
                        try {
                            map = (Map) qqt.c(SharedPreferenceManager.e(BaseApplication.b(), "ROUTE_CITY_INFO_LIST", "ROUTE_CITY_INFO_LIST"), new TypeToken<Map<String, gda>>(this) { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl$2$1$1
                            }.getType());
                        } catch (JsonSyntaxException unused) {
                            health.compact.a.util.LogUtil.c(RunningRouteImpl.TAG, "JsonSyntaxException");
                            map = new HashMap();
                        }
                        if (map == null) {
                            map = new HashMap();
                        }
                        map.put(gcwVar.d(), gdaVar);
                        SharedPreferenceManager.e(BaseApplication.b(), "ROUTE_CITY_INFO_LIST", "ROUTE_CITY_INFO_LIST", qqt.b(map), new StorageParams());
                    }
                });
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdaVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getAllCityInfoList(gcv gcvVar, final UiCallback<gcx> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "queryAllCityInfoList: Request Received, processing.....");
        jdp.b(gcvVar, new ResultCallback<gcx>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.11
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gcx gcxVar) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gcxVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getCityInfoWithGps(gcy gcyVar, final UiCallback<gdc> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "queryCityInfoWithGps: Request Received, processing.....");
        jdp.c(gcyVar, new ResultCallback<gdc>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.13
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdc gdcVar) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdcVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void feedbackHotPathInfo(gcr gcrVar, final UiCallback<CloudCommonReponse> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "feedbackHotPathInfo: Request Received, processing.....");
        jdp.b(gcrVar, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.14
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, cloudCommonReponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getFeedbackInfos(gcz gczVar, final UiCallback<gdb> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "getFeedbackInfos: Request Received, processing.....");
        jdp.d(gczVar, new ResultCallback<gdb>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.12
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdb gdbVar) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdbVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void deleteFeedbackInfo(gcq gcqVar, final UiCallback<CloudCommonReponse> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "deleteFeedbackInfo: Request Received, processing.....");
        jdp.b(gcqVar, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.15
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, cloudCommonReponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void deleteFeedbackByPathId(gcp gcpVar, final UiCallback<CloudCommonReponse> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "deleteFeedbackByPathId: Request Received, processing.....");
        jdp.c(gcpVar, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.16
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, cloudCommonReponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void addHotPathParticipateInfo(gck gckVar, final UiCallback<CloudCommonReponse> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "addHotPathParticipateInfo: Request Received, processing.....");
        jdp.d(gckVar, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.19
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, cloudCommonReponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getHotPathParticipateInfos(gdg gdgVar, final UiCallback<gdi> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "getHotPathParticipateInfos: Request Received, processing.....");
        jdp.c(gdgVar, new ResultCallback<gdi>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdi gdiVar) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdiVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getHotPathParticipateInfo(gdd gddVar, final UiCallback<gdf> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "GetHotPathParticipateInfoRsp: request");
        RunningRouteUtils.b(BaseApplication.b()).b(gddVar, new ResultCallback<gdf>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdf gdfVar) {
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdfVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getHotPaths(gdk gdkVar, final UiCallback<gdj> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "getHotPaths: Request Received, processing.....");
        jdp.b(gdkVar, new ResultCallback<gdj>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdj gdjVar) {
                health.compact.a.util.LogUtil.a(RunningRouteImpl.TAG, "response");
                if (gdjVar != null) {
                    for (gdr gdrVar : gdjVar.c()) {
                        if (gdrVar != null) {
                            health.compact.a.util.LogUtil.a(RunningRouteImpl.TAG, "operationInfo: ", gdrVar.toString());
                        }
                    }
                }
                RunningRouteImpl.this.saveHotPathOperationInfos(gdjVar);
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdjVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getHotPathDetail(gdh gdhVar, final UiCallback<gde> uiCallback) {
        health.compact.a.util.LogUtil.a(TAG, "getHotPathDetail: Request Received, processing.....");
        jdp.d(gdhVar, new ResultCallback<gde>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gde gdeVar) {
                StringBuilder sb = new StringBuilder("response: ");
                sb.append(gdeVar == null ? Constants.NULL : gdeVar.toString());
                health.compact.a.util.LogUtil.a(RunningRouteImpl.TAG, sb.toString());
                uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdeVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, -1, th.getMessage());
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getHotPathDetail(final String str, final UiCallback<gdm> uiCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.6
            @Override // java.lang.Runnable
            public void run() {
                RunningRouteImpl.this.getHotPathDetailFromSpOrCloud(str, uiCallback);
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void getHotPathDetail(final boolean z, final String str, final UiCallback<gdm> uiCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.8
            @Override // java.lang.Runnable
            public void run() {
                RunningRouteImpl.this.getHotPathDetailFromSpOrCloud(z, str, uiCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveHotPathOperationInfos(final gdj gdjVar) {
        ThreadPoolManager.c().execute(new Runnable(this) { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.7
            @Override // java.lang.Runnable
            public void run() {
                String strE = SharedPreferenceManager.e(BaseApplication.b(), "ROUTE_HOT_PATHS_LIST", "ROUTE_HOT_PATHS_LIST");
                Map map = new HashMap();
                if (strE != null) {
                    try {
                        try {
                            map = (Map) qqt.c(strE, new TypeToken<Map<String, gdr>>(this) { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.16.1
                            }.getType());
                        } catch (JsonSyntaxException unused) {
                            health.compact.a.util.LogUtil.c(RunningRouteImpl.TAG, "JsonSyntaxException");
                            map = new HashMap();
                        }
                    } catch (IllegalStateException unused2) {
                        health.compact.a.util.LogUtil.a(RunningRouteImpl.TAG, "saveHotPathOperationInfos IllegalStateException");
                        return;
                    }
                }
                if (map == null) {
                    map = new HashMap();
                }
                if (gdjVar.c() == null || strE == null) {
                    return;
                }
                for (gdr gdrVar : gdjVar.c()) {
                    if (gdrVar.j() != null) {
                        map.put(gdrVar.j(), gdrVar);
                    }
                }
                SharedPreferenceManager.e(BaseApplication.b(), "ROUTE_HOT_PATHS_LIST", "ROUTE_HOT_PATHS_LIST", qqt.b(map), new StorageParams());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHotPathDetailFromSpOrCloud(String str, UiCallback<gdm> uiCallback) {
        getHotPathDetailFromSpOrCloud(true, str, uiCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHotPathDetailFromSpOrCloud(boolean z, String str, UiCallback<gdm> uiCallback) {
        Map<String, gde> map;
        try {
            map = (Map) qqt.c(SharedPreferenceManager.e(BaseApplication.b(), "RUNNING_ROUTE_PATH_DETAIL_LIST", "RUNNING_ROUTE_PATH_DETAIL_LIST"), new TypeToken<Map<String, gde>>(this) { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.17
            }.getType());
        } catch (JsonSyntaxException unused) {
            health.compact.a.util.LogUtil.c(TAG, "JsonSyntaxException");
            map = new HashMap<>();
        }
        if (map != null && map.containsKey(str) && map.get(str) != null && z) {
            uiCallback.onSuccess(this.mUiHandler, map.get(str).b());
        }
        if (map == null) {
            map = new HashMap<>();
        }
        health.compact.a.util.LogUtil.c(TAG, "pathId: ", str, " request from cloud");
        getHotPathDetail(z, str, uiCallback, new gdh.b().b(str).c(), map);
    }

    private void getHotPathDetail(final boolean z, final String str, final UiCallback<gdm> uiCallback, gdh gdhVar, final Map<String, gde> map) {
        gch.b().getHotPathDetail(gdhVar, new UiCallback<gde>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(final gde gdeVar) {
                if (gdeVar != null && gdeVar.b() != null) {
                    final gdm gdmVarB = gdeVar.b();
                    ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl.9.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (map.containsKey(str) && qqt.b(map.get(str)).equals(qqt.b(gdeVar)) && z) {
                                health.compact.a.util.LogUtil.a(RunningRouteImpl.TAG, "data in sp and cloud is consistent");
                                return;
                            }
                            map.put(str, gdeVar);
                            SharedPreferenceManager.e(BaseApplication.b(), "RUNNING_ROUTE_PATH_DETAIL_LIST", "RUNNING_ROUTE_PATH_DETAIL_LIST", qqt.b(map), new StorageParams());
                            health.compact.a.util.LogUtil.a(RunningRouteImpl.TAG, "data in sp and cloud is not consistent");
                            uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, gdmVarB);
                        }
                    });
                } else {
                    uiCallback.onSuccess(RunningRouteImpl.this.mUiHandler, null);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                health.compact.a.util.LogUtil.c(RunningRouteImpl.TAG, "no match pathId in sp or cloud");
                if (map.containsKey(str) && map.get(str) != null && z) {
                    return;
                }
                uiCallback.onFailure(RunningRouteImpl.this.mUiHandler, i, str2);
            }
        });
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void requestLocationUpdates(ILocationChangeListener iLocationChangeListener) {
        requestLocationUpdates(iLocationChangeListener, 0);
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void requestLocationUpdates(ILocationChangeListener iLocationChangeListener, int i) {
        LocationManager locationManager = (LocationManager) BaseApplication.b().getSystemService("location");
        this.mLocationChangeListener = iLocationChangeListener;
        this.mConvertMode = i;
        boolean z = ActivityCompat.checkSelfPermission(BaseApplication.b(), "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = ActivityCompat.checkSelfPermission(BaseApplication.b(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
        health.compact.a.util.LogUtil.a(TAG, "requestLocationUpdates hasFineLocation:", Boolean.valueOf(z), " hasCoarseLocation:", Boolean.valueOf(z2));
        if (z || z2) {
            if (z) {
                try {
                    locationManager.requestLocationUpdates(GeocodeSearch.GPS, 30000L, 0.0f, this.mLocationListener);
                } catch (IllegalArgumentException unused) {
                    health.compact.a.util.LogUtil.c(TAG, "Exception: provider doesn't exist: GPS");
                }
            }
            try {
                locationManager.requestLocationUpdates("network", 30000L, 0.0f, this.mLocationListener);
            } catch (IllegalArgumentException unused2) {
                health.compact.a.util.LogUtil.c(TAG, "Exception: provider doesn't exist: NETWORK");
            }
        }
    }

    @Override // com.huawei.health.motiontrack.api.RunningRouteApi
    public void removeLocationUpdates() {
        LocationManager locationManager = (LocationManager) BaseApplication.b().getSystemService("location");
        LocationListener locationListener = this.mLocationListener;
        if (locationListener != null) {
            locationManager.removeUpdates(locationListener);
        }
    }
}
