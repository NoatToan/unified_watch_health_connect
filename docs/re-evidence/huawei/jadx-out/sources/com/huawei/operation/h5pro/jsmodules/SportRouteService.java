package com.huawei.operation.h5pro.jsmodules;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.algorithm.api.TrackFeatureExtractionApi;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.HistoricalRoutesActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteIntroductionActivity;
import com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.route.RouteOutputForApp;
import com.huawei.route.RouteTrackInfo;
import com.huawei.thirdpartservice.OauthStatusCallback;
import com.huawei.thirdpartservice.komootapi.KomootProviderApi;
import defpackage.gch;
import defpackage.gdm;
import defpackage.gqc;
import defpackage.jdo;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class SportRouteService extends JsBaseModule {
    private static final String PAGE_ASSIST_SETTINGS = "settings";
    private static final String PAGE_HISTORY_ROUTE_LIST = "historyRouteList";
    private static final String PAGE_ROUTES_INTRODUCTION = "introduction";
    private static final String PAGE_ROUTE_LIST_MAP = "routeListMap";

    @JavascriptInterface
    public void pathCapabilityAuthentication(final long j) {
        LogUtil.a(this.TAG, "Enter pathCapabilityAuthentication");
        if (RunPopularRoutesUtil.c(this.mContext)) {
            onSuccessCallback(j, true);
        } else {
            RunPopularRoutesUtil.e(this.mContext, 1, new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.operation.h5pro.jsmodules.SportRouteService.1
                @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                public void goNext() {
                    SportRouteService.this.onSuccessCallback(j, true);
                }

                @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                public void notGoNext() {
                    SportRouteService.this.onSuccessCallback(j, false);
                }
            });
        }
    }

    @JavascriptInterface
    public void getLocation(final long j) {
        LogUtil.a(this.TAG, "Enter getLocation");
        if (PermissionUtil.e(this.mContext, PermissionUtil.PermissionType.LOCATION) != PermissionUtil.PermissionResult.GRANTED) {
            PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.LOCATION, new PermissionsResultAction() { // from class: com.huawei.operation.h5pro.jsmodules.SportRouteService.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    SportRouteService.this.onSuccessCallback(j, RunningRouteUtils.a());
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    SportRouteService.this.onSuccessCallback(j, null);
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    SportRouteService.this.onSuccessCallback(j, null);
                }
            });
        } else {
            onSuccessCallback(j, RunningRouteUtils.a());
        }
    }

    @JavascriptInterface
    public void sendToDevice(long j, String str) {
        LogUtil.a(this.TAG, "Enter sendToDevice, param: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("pathId");
            String strOptString2 = jSONObject.optString("routeVersion");
            if (jSONObject.optBoolean("isFromKomoot")) {
                LogUtil.a(this.TAG, "send Komoot Route to Device");
                new RouteTransferDataHolder(this.mContext).j();
                onSuccessCallback(j, true);
            } else {
                if (!TextUtils.isEmpty(strOptString2)) {
                    LogUtil.a(this.TAG, "sendToDevice by routeVersion");
                    RouteData routeDataD = RunningRouteUtils.d(qrs.f(strOptString2));
                    if (routeDataD == null) {
                        LogUtil.a(this.TAG, "sendToDevice by routeVersion fail: routeData is null");
                        onSuccessCallback(j, false);
                        return;
                    } else {
                        new RouteTransferDataHolder(this.mContext).e((String) null, RouteTrackInfo.convertRouteTrackInfo(routeDataD), routeDataD.getRouteDistance());
                        onSuccessCallback(j, true);
                        return;
                    }
                }
                sendHotPathToDevice(j, strOptString);
            }
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "sendToDevice fail: param invalid");
            onSuccessCallback(j, false);
        }
    }

    private void sendHotPathToDevice(final long j, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(this.TAG, "sendToDevice fail: pathId is empty");
            onSuccessCallback(j, false);
        } else {
            jdo.a(str);
            gch.b().getHotPathDetail(false, str, new UiCallback<gdm>() { // from class: com.huawei.operation.h5pro.jsmodules.SportRouteService.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e(SportRouteService.this.TAG, "can't get hotPathDetail & errorCode = ", Integer.valueOf(i), " & errorInfo is ", str2);
                    SportRouteService.this.onSuccessCallback(j, false);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(gdm gdmVar) {
                    String strE;
                    String strA;
                    if (gdmVar == null) {
                        LogUtil.j(SportRouteService.this.TAG, "hotPathDetail is null");
                        SportRouteService.this.onSuccessCallback(j, false);
                        return;
                    }
                    jdo.b(1, "m7", gdmVar.o(), gdmVar.l(), false);
                    RouteTransferDataHolder routeTransferDataHolder = new RouteTransferDataHolder(SportRouteService.this.mContext);
                    if (gdmVar.n() == null) {
                        strE = "";
                        strA = "";
                    } else {
                        strE = gdmVar.n().e();
                        strA = gdmVar.n().a();
                    }
                    routeTransferDataHolder.b(strA);
                    routeTransferDataHolder.e(strE, RunningRouteUtils.d(gdmVar), gdmVar.y());
                }
            });
            onSuccessCallback(j, true);
        }
    }

    @JavascriptInterface
    public void getSupportMap(long j) {
        LogUtil.a(this.TAG, "Enter getSupportMap");
        onSuccessCallback(j, GsonUtil.toJson(RunningRouteUtils.c(this.mContext)));
        LogUtil.a(this.TAG, "getSupportMap complete");
    }

    @JavascriptInterface
    public void jumpToMap(long j, String str) {
        LogUtil.a(this.TAG, "Enter jumpToMap, param: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            double d = jSONObject.getDouble(JsbMapKeyNames.H5_LOC_LON);
            double d2 = jSONObject.getDouble(JsbMapKeyNames.H5_LOC_LAT);
            int i = jSONObject.getInt("mapType");
            RunningRouteUtils.e(this.mContext, i, new GpsPoint(d2, d));
            onSuccessCallback(j, true);
            LogUtil.a(this.TAG, "jumpToMap complete");
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "jumpToMap fail:param invalid");
            onSuccessCallback(j, false);
        }
    }

    @JavascriptInterface
    public void getOtherUserInfo(final int i, String str) {
        try {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getOtherUserInfo(new JSONObject(str).optString("data"), new UserInfoCallback<gqc>() { // from class: com.huawei.operation.h5pro.jsmodules.SportRouteService.4
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void infoCallback(gqc gqcVar) {
                    LogUtil.a(SportRouteService.this.TAG, "getOtherUserInfo infoCallback");
                    SportRouteService.this.onSuccessCallback(i, gqcVar.d().a());
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i2) {
                    LogUtil.e(SportRouteService.this.TAG, "errorCallback errorCode is ", Integer.valueOf(i2));
                    SportRouteService.this.onFailureCallback(i, "getOtherUserInfo errorCallback FAIL", i2);
                }
            });
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getOtherUserInfo jsonException", LogAnonymous.b(e));
            onFailureCallback(i, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void jumpToInnerPage(long j, String str) {
        LogUtil.a(this.TAG, "Enter jumpToInnerPage, param: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("page");
            if (string.equals(PAGE_ROUTES_INTRODUCTION)) {
                startRoutesIntroductionActivity();
            } else if (string.equals(PAGE_ASSIST_SETTINGS)) {
                startSportAssistSettingsActivity(jSONObject.getInt("currentSportType"));
            }
            onSuccessCallback(j, true);
            LogUtil.a(this.TAG, "jumpToInnerPage complete");
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "jumpToInnerPage fail:param invalid");
            onSuccessCallback(j, false);
        }
    }

    @JavascriptInterface
    public void showFeedBackDialog(long j, String str) {
        LogUtil.a(this.TAG, "Enter showFeedBackDialog, param: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            RunningRouteUtils.c(this.mContext, jSONObject.getString("pathId"), jSONObject.getString("pathName"));
            onSuccessCallback(j, true);
            LogUtil.a(this.TAG, "showFeedBackDialog complete");
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "showFeedBackDialog fail:param invalid");
            onSuccessCallback(j, false);
        }
    }

    @JavascriptInterface
    public void finishPage(long j, String str) {
        LogUtil.a(this.TAG, "Enter finishActivity, param: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("page");
            boolean z = jSONObject.getBoolean("isBackList");
            if (PAGE_ROUTE_LIST_MAP.equals(string)) {
                if (ClockingRankActivity.e() != null) {
                    ClockingRankActivity.e().d(z);
                }
            } else if (PAGE_HISTORY_ROUTE_LIST.equals(string) && HistoricalRoutesActivity.c() != null) {
                HistoricalRoutesActivity.c().c(z);
            }
            onSuccessCallback(j, true);
            LogUtil.a(this.TAG, "finishPage complete");
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "finishPage fail:param invalid");
            onSuccessCallback(j, false);
        }
    }

    @JavascriptInterface
    public void getTrackOutputForApp(long j, String str) {
        LogUtil.a(this.TAG, "Enter getTrackOutputForApp, param: ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(this.TAG, "Enter getTrackOutputForApp fail: param is null");
            onSuccessCallback(j, false);
            return;
        }
        RouteData routeData = (RouteData) qqt.e(str, RouteData.class);
        if (routeData == null) {
            LogUtil.e(this.TAG, "getTrackOutputForApp fail: routeData is null");
            onSuccessCallback(j, false);
        } else {
            RouteOutputForApp trackOutputForApp = ((TrackFeatureExtractionApi) Services.d("TrackFeatureExtractionAlgorithmService", TrackFeatureExtractionApi.class)).getTrackOutputForApp(RouteTrackInfo.convertRouteTrackInfo(routeData), 80000, routeData.getRouteDistance(), false);
            LogUtil.a(this.TAG, "getTrackOutputForApp complete");
            onSuccessCallback(j, trackOutputForApp);
        }
    }

    @JavascriptInterface
    public void getKomootOauth(final long j) {
        LogUtil.a(this.TAG, "Enter getKomootOauth");
        ((KomootProviderApi) Services.b("FeatureDataOpen", KomootProviderApi.class)).isOauth(new OauthStatusCallback() { // from class: com.huawei.operation.h5pro.jsmodules.SportRouteService$$ExternalSyntheticLambda0
            @Override // com.huawei.thirdpartservice.OauthStatusCallback
            public final void onOauthStatusCallback(boolean z) {
                this.f$0.m1585x893d9a69(j, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getKomootOauth$0$com-huawei-operation-h5pro-jsmodules-SportRouteService, reason: not valid java name */
    /* synthetic */ void m1585x893d9a69(long j, boolean z) {
        LogUtil.a(this.TAG, "getKomootOauth complete, isOauth: ", Boolean.valueOf(z));
        onSuccessCallback(j, Boolean.valueOf(z));
    }

    private void startRoutesIntroductionActivity() {
        this.mContext.startActivity(new Intent(this.mContext, (Class<?>) RunningRouteIntroductionActivity.class));
    }

    private void startSportAssistSettingsActivity(int i) {
        Intent intent = new Intent();
        intent.setClassName(this.mContext, "com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity");
        intent.putExtra("currentSportType", i);
        this.mContext.startActivity(intent);
    }
}
