package com.huawei.healthcloud.plugintrack.runningroute.utils;

import android.app.Activity;
import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.motiontrack.api.LocationApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import defpackage.gch;
import defpackage.gcy;
import defpackage.jdf;
import defpackage.jpg;
import defpackage.qol;
import defpackage.qon;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteLocationHelper implements LocationApi {
    public static final int ERROR_CODE_GOOGLE_LOCATION = -1;
    public static final int ERROR_CODE_SDK_LOCATION = -2;
    private static final String TAG = "Sport_RunningPathLocationHelper";
    private jdf mGeoLocationManager = jdf.a();
    private boolean mIsLocationSuccess;

    public boolean isLocationFailed(int i) {
        return i == -1 || i == -2;
    }

    @Override // com.huawei.health.motiontrack.api.LocationApi
    public void getLocation(Context context, final ICityLatLonCallBack iCityLatLonCallBack, final UiCallback uiCallback) {
        this.mIsLocationSuccess = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        jpg jpgVarC = RunningRouteUtils.c(new GolfGetLocation.GetLocationCallback() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteLocationHelper.4
            @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
            public void onSuccess(jpg jpgVar) {
                if (RunningRouteLocationHelper.this.mIsLocationSuccess) {
                    return;
                }
                RunningRouteLocationHelper.this.mIsLocationSuccess = true;
                if (jpgVar == null) {
                    LogUtil.a(RunningRouteLocationHelper.TAG, "get real location onSuccess null");
                    uiCallback.onFailure(-1, BaseApplication.b().getResources().getString(R.string.IDS_track_runing_route_failed_obtain_location));
                } else {
                    RunningRouteLocationHelper.this.getCityCenterPoint(jpgVar, iCityLatLonCallBack, uiCallback);
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
            public void onFailure(int i, String str) {
                if (RunningRouteLocationHelper.this.mIsLocationSuccess) {
                    return;
                }
                LogUtil.a(RunningRouteLocationHelper.TAG, "get real location null");
                uiCallback.onFailure(-1, BaseApplication.b().getResources().getString(R.string.IDS_track_runing_route_failed_obtain_location));
            }
        });
        if (this.mIsLocationSuccess || jpgVarC == null || Math.abs(jpgVarC.d) <= 1.0E-6d || Math.abs(jpgVarC.f38787a) <= 1.0E-6d) {
            return;
        }
        this.mIsLocationSuccess = true;
        LogUtil.a(TAG, "get real location cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        getCityCenterPoint(jpgVarC, iCityLatLonCallBack, uiCallback);
    }

    @Override // com.huawei.health.motiontrack.api.LocationApi
    public qol getUserLocation(Activity activity) {
        jpg jpgVarA = RunningRouteUtils.a();
        if (jpgVarA != null) {
            return new qol(jpgVarA.d, jpgVarA.f38787a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getCityCenterPoint(jpg jpgVar, final ICityLatLonCallBack iCityLatLonCallBack, UiCallback uiCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        LatLonPoint latLonPoint = new LatLonPoint(jpgVar.d, jpgVar.f38787a);
        if (!Utils.o()) {
            this.mGeoLocationManager.c(latLonPoint, new ICityLatLonCallBack(this) { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteLocationHelper.2
                @Override // com.huawei.ui.commonui.model.ICityLatLonCallBack
                public void onPointBack(qon qonVar) {
                    LogUtil.a(RunningRouteLocationHelper.TAG, "getCityCenterPoint cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    ICityLatLonCallBack iCityLatLonCallBack2 = iCityLatLonCallBack;
                    if (iCityLatLonCallBack2 != null) {
                        iCityLatLonCallBack2.onPointBack(qonVar);
                    }
                }
            });
        } else if (iCityLatLonCallBack != null) {
            iCityLatLonCallBack.onPointBack(null);
        }
        gcy gcyVarE = new gcy.e().a(jpgVar.d).c(jpgVar.f38787a).e();
        LogUtil.a(TAG, "GetCityInfoWithGpsReq: ", gcyVarE);
        gch.b().getCityInfoWithGps(gcyVarE, uiCallback);
    }
}
