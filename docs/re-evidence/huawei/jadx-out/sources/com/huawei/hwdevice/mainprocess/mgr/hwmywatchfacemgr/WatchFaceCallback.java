package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.google.gson.JsonObject;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.H5ProWebViewActivity;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.VideoChoosePicUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.CustomConfig;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressCode;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressState;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransmitWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.AlbumWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.KaleidoscopeWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceIdReportInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceVideoInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WearWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerWatchFaceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.coq;
import defpackage.mgg;
import defpackage.mgu;
import defpackage.yly;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WatchFaceCallback extends JsBaseModule {
    private static final String TAG = "WatchFaceCallback";
    private static final String TAG_RELEASE = "DEVMGR_WatchFaceCallback";
    private static JSONObject sCurWatchFaceInstallParams;
    private static ProgressResp sLastResp;
    private static ResultCallback<ProgressResp> sProgressRespCallback;
    private static long sProgressRespCbId;
    private H5ProWebViewActivity mActivity;
    private ActivityResultLauncher<Intent> mActivityResultLauncherCamera;
    private final Set<String> mOneHopH5CallbackIdSet = new HashSet();
    private Map<String, List<Long>> queryCustomConfigCallbacks;

    @JavascriptInterface
    public void queryCustomConfig(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("deviceId");
            String string2 = jSONObject.getString("marketId");
            LogUtil.a(TAG, "queryCustomConfig:", CommonUtil.n(string), " ", string2);
            LogUtil.a(TAG, "queryCustomConfig callbackId:", Long.valueOf(j), " marketId:", string2);
            registerQueryCustomConfigCallback(string, string2, j);
            CustomConfigWatchFaceManager.getInstance().queryCustomConfig(string, string2);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "queryCustomConfig catch JSONException, params: ", str);
            onFailureCallback(j, "params error");
        }
    }

    @JavascriptInterface
    public void installWatchFace(long j, String str) {
        String string;
        String string2;
        String string3;
        String strOptString = "";
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("watchFaceId");
            try {
                string2 = jSONObject.getString("deviceType");
                try {
                    string3 = jSONObject.getString("deviceId");
                    try {
                        i = jSONObject.getInt("operate");
                        strOptString = jSONObject.optString(ParsedFieldTag.KAKA_TASK_SCENARIO, "0");
                        sCurWatchFaceInstallParams = jSONObject;
                    } catch (JSONException unused) {
                        LogUtil.e(TAG, "installWatchFace catch JSONException, params: ", str);
                        sCurWatchFaceInstallParams = null;
                    }
                } catch (JSONException unused2) {
                    string3 = "";
                    LogUtil.e(TAG, "installWatchFace catch JSONException, params: ", str);
                    sCurWatchFaceInstallParams = null;
                    String str2 = string;
                    String str3 = string2;
                    String str4 = string3;
                    sProgressRespCbId = j;
                    WatchFaceManager watchFaceManager = WatchFaceManager.getInstance();
                    watchFaceManager.installWatchFace(str2, str3, str4, i, strOptString);
                }
            } catch (JSONException unused3) {
                string2 = "";
            }
        } catch (JSONException unused4) {
            string = "";
            string2 = string;
            string3 = string2;
        }
        String str5 = string;
        String str6 = string2;
        String str7 = string3;
        sProgressRespCbId = j;
        WatchFaceManager watchFaceManager2 = WatchFaceManager.getInstance();
        watchFaceManager2.installWatchFace(str5, str6, str7, i, strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void installAndApplyWatchFaceBiEvent(int i, ProgressResp.Data data, int i2, String str) {
        if (i == ProgressCode.SUCCESS.value()) {
            if (data != null) {
                if (data.getState() == ProgressState.APPLIED.value() || data.getState() == ProgressState.INSTALLED.value()) {
                    LogUtil.a(TAG, "installAndApplyWatchFaceBiEvent resultCode is success");
                    mgu.d(i2, "true", str);
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.a(TAG, "installAndApplyWatchFaceBiEvent resultCode is ", Integer.valueOf(i));
        if (i == ProgressCode.DOWNLOAD_NETWORK_FAILED.value()) {
            mgu.d(i2, "1", str);
            return;
        }
        if (i == ProgressCode.DOWNLOAD_OTHER_FAILED.value()) {
            mgu.d(i2, "2", str);
            return;
        }
        if (i == ProgressCode.TRANSFER_OTHER_FAILED.value()) {
            DeviceInfo deviceInfoD = mgg.d(TAG);
            if (deviceInfoD != null && deviceInfoD.getDeviceConnectState() == 2) {
                mgu.d(i2, "4", str);
                return;
            } else {
                LogUtil.a(TAG, "installAndApplyWatchFaceBiEvent device disConnect");
                mgu.d(i2, "7", str);
                return;
            }
        }
        LogUtil.a(TAG, "installAndApplyWatchFaceBiEvent resultCode is other");
    }

    @JavascriptInterface
    public void queryState(long j, String str) {
        LogUtil.a(TAG, "queryState: ", Long.valueOf(j), " ", str, " ", sLastResp);
        sProgressRespCbId = j;
        ResultCallback<ProgressResp> resultCallback = sProgressRespCallback;
        ProgressResp progressResp = sLastResp;
        if (progressResp == null || resultCallback == null) {
            return;
        }
        resultCallback.onSuccess(progressResp);
    }

    public static void onCall(ProgressCode progressCode, ProgressState progressState, String str, Integer num) {
        ProgressResp progressResp = new ProgressResp();
        progressResp.setResultCode(progressCode.value());
        ProgressResp.Data data = new ProgressResp.Data();
        data.setState(progressState.value());
        data.setWatchFaceId(str);
        if (num != null) {
            data.setProgress(num.intValue());
        }
        progressResp.setResultData(data);
        sLastResp = progressResp;
        ResultCallback<ProgressResp> resultCallback = sProgressRespCallback;
        if (resultCallback != null) {
            resultCallback.onSuccess(progressResp);
        }
    }

    public static void onCall(ProgressCode progressCode, ProgressState progressState, String str) {
        onCall(progressCode, progressState, str, null);
    }

    public static void onCall(ProgressCode progressCode, String str) {
        ProgressResp progressResp = new ProgressResp();
        progressResp.setResultCode(progressCode.value());
        progressResp.setResultDesc(str);
        ResultCallback<ProgressResp> resultCallback = sProgressRespCallback;
        if (resultCallback != null) {
            resultCallback.onSuccess(progressResp);
        }
        sLastResp = null;
    }

    @JavascriptInterface
    public void registerIdReportCb(final long j) {
        WatchFaceManager.getInstance().registerIdReportCb(TAG, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1419x9411e08f(j, i, (WatchFaceIdReportInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$registerIdReportCb$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceCallback, reason: not valid java name */
    /* synthetic */ void m1419x9411e08f(long j, int i, WatchFaceIdReportInfo watchFaceIdReportInfo) {
        onSuccessCallback(j, watchFaceIdReportInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFailureResult(Throwable th, long j) {
        if (th instanceof DiyThrowable) {
            DiyThrowable diyThrowable = (DiyThrowable) th;
            onFailureCallback(j, diyThrowable.getMessage(), diyThrowable.getErrorCode());
        }
    }

    @JavascriptInterface
    public void getAlbumWatchFaceInfo(final long j) {
        AlbumWatchFaceManger.getInstance().getDeviceWatchFaceInfo(new ResultCallback<TransmitWatchFace<AlbumWatchFaceInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(TransmitWatchFace<AlbumWatchFaceInfo> transmitWatchFace) {
                LogUtil.a(WatchFaceCallback.TAG, "getAlbumWatchFaceInfo callback response: ", HiJsonUtil.d(transmitWatchFace));
                WatchFaceCallback.this.onSuccessCallback(j, transmitWatchFace);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                WatchFaceCallback.this.onFailureResult(th, j);
            }
        });
    }

    @JavascriptInterface
    public void setAlbumWatchFaceInfo(final long j, String str) {
        String string;
        try {
            string = new JSONObject(str).getString("albumWatchFaceInfo");
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "setAlbumWatchFaceInfo JSONException: ", ExceptionUtils.c(e));
            string = "";
        }
        AlbumWatchFaceManger.getInstance().sendWatchFaceInfoToDevice(string, new ResultCallback<TransferProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(TransferProgressResp transferProgressResp) {
                LogUtil.a(WatchFaceCallback.TAG, "setAlbumWatchFaceInfo callback response: ", HiJsonUtil.d(transferProgressResp));
                WatchFaceCallback.this.onSuccessCallback(j, transferProgressResp);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                WatchFaceCallback.this.onFailureResult(th, j);
            }
        });
    }

    @JavascriptInterface
    public void getWearWatchFaceInfo(final long j, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWearWatchFaceInfo params is empty");
        } else {
            WearWatchFaceManager.getInstance().getWearWatchFaceInfo(str, new ResultCallback<TransmitWatchFace<WearWatchFaceInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.3
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(TransmitWatchFace<WearWatchFaceInfo> transmitWatchFace) {
                    LogUtil.a(WatchFaceCallback.TAG, "getWearWatchFaceInfo callback response: ", HiJsonUtil.d(transmitWatchFace));
                    WatchFaceCallback.this.onSuccessCallback(j, transmitWatchFace);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    WatchFaceCallback.this.onFailureResult(th, j);
                }
            });
        }
    }

    @JavascriptInterface
    public void setWearWatchFaceInfo(final long j, String str) {
        String string;
        try {
            string = new JSONObject(str).getString("wearWatchFaceInfo");
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "setWearWatchFaceInfo JSONException: ", ExceptionUtils.c(e));
            string = "";
        }
        WearWatchFaceManager.getInstance().setWearWatchFaceInfo(string, new ResultCallback<TransferProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.4
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(TransferProgressResp transferProgressResp) {
                LogUtil.a(WatchFaceCallback.TAG, "setWearWatchFaceInfo callback response: ", HiJsonUtil.d(transferProgressResp));
                WatchFaceCallback.this.onSuccessCallback(j, transferProgressResp);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                WatchFaceCallback.this.onFailureResult(th, j);
            }
        });
    }

    @JavascriptInterface
    public void getKaleidoscopeWatchFaceInfo(final long j, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getKaleidoscopeWatchFaceInfo params is empty");
        } else {
            KaleidoscopeWatchFaceManger.getInstance().getKaleidoscopeWatchFaceInfo(str, new ResultCallback<TransmitWatchFace<KaleidoscopeWatchFaceInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.5
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(TransmitWatchFace<KaleidoscopeWatchFaceInfo> transmitWatchFace) {
                    LogUtil.a(WatchFaceCallback.TAG, "getKaleidoscopeWatchFaceInfo callback response: ", HiJsonUtil.d(transmitWatchFace));
                    WatchFaceCallback.this.onSuccessCallback(j, transmitWatchFace);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    WatchFaceCallback.this.onFailureResult(th, j);
                }
            });
        }
    }

    @JavascriptInterface
    public void setKaleidoscopeWatchFaceInfo(final long j, String str) {
        String string;
        try {
            string = new JSONObject(str).getString("kaleidoscopeWatchFaceInfo");
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "setKaleidoscopeWatchFaceInfo JSONException: ", ExceptionUtils.c(e));
            string = "";
        }
        KaleidoscopeWatchFaceManger.getInstance().setKaleidoscopeWatchFaceInfo(string, new ResultCallback<TransferProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.6
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(TransferProgressResp transferProgressResp) {
                LogUtil.a(WatchFaceCallback.TAG, "setKaleidoscopeWatchFaceInfo callback response: ", HiJsonUtil.d(transferProgressResp));
                WatchFaceCallback.this.onSuccessCallback(j, transferProgressResp);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                WatchFaceCallback.this.onFailureResult(th, j);
            }
        });
    }

    @JavascriptInterface
    public void setStickerWatchFaceInfo(final long j, String str) {
        ReleaseLogUtil.d(TAG_RELEASE, "setStickerWatchFaceInfo enter");
        try {
            String string = new JSONObject(str).getString("stickerWatchFaceInfo");
            LogUtil.a(TAG, "setStickerWatchFaceInfo raw:", string);
            StickerWatchFaceManager.getInstance().setStickerWatchFaceInfo(string, new ResultCallback<TransferProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.7
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(TransferProgressResp transferProgressResp) {
                    LogUtil.a(WatchFaceCallback.TAG, String.format(Locale.ENGLISH, "setStickerWatchFaceInfo callback resultCode:%s, progress: %d", Integer.valueOf(transferProgressResp.getResultCode()), Integer.valueOf(transferProgressResp.getCurrentProgress())));
                    WatchFaceCallback.this.onSuccessCallback(j, transferProgressResp);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.a("setStickerWatchFaceInfo error:", ExceptionUtils.c(th));
                    WatchFaceCallback.this.onFailureResult(th, j);
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "setStickerWatchFaceInfo JSONException: ", ExceptionUtils.c(e));
            onFailureCallback(j, "params error");
        }
    }

    @JavascriptInterface
    public void getStickerWatchFaceInfo(final long j, String str) {
        ReleaseLogUtil.d(TAG_RELEASE, "getStickerWatchFaceInfo enter");
        try {
            String string = new JSONObject(str).getString("deviceId");
            LogUtil.a(TAG, "getStickerWatchFaceInfo:", CommonUtil.n(string));
            StickerWatchFaceManager.getInstance().getStickerWatchFaceInfo(string, new ResultCallback<TransmitWatchFace<String>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.8
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(TransmitWatchFace<String> transmitWatchFace) {
                    LogUtil.a(WatchFaceCallback.TAG, String.format(Locale.ENGLISH, "getStickerWatchFaceInfo callback resultCode:%s, progress: %d", Integer.valueOf(transmitWatchFace.getResultCode()), Integer.valueOf(transmitWatchFace.getCurrentProgress())));
                    TransmitWatchFace transmitWatchFace2 = new TransmitWatchFace();
                    transmitWatchFace2.setResultCode(transmitWatchFace.getResultCode());
                    transmitWatchFace2.setCurrentProgress(transmitWatchFace.getCurrentProgress());
                    if (!TextUtils.isEmpty(transmitWatchFace.getWatchFaceInfo())) {
                        transmitWatchFace2.setWatchFaceInfo((JsonObject) yly.c(transmitWatchFace.getWatchFaceInfo(), JsonObject.class));
                    }
                    WatchFaceCallback.this.onSuccessCallback(j, transmitWatchFace2);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e(WatchFaceCallback.TAG_RELEASE, "getStickerWatchFaceInfo:", ExceptionUtils.c(th));
                    WatchFaceCallback.this.onFailureResult(th, j);
                }
            });
        } catch (JSONException unused) {
            LogUtil.e(TAG, "getStickerWatchFaceInfo catch JSONException, params: ", str);
            onFailureCallback(j, "params error");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        LogUtil.a(TAG, "onCreate invoke");
        this.queryCustomConfigCallbacks = new ConcurrentHashMap();
        setsProgressRespCallback(buildWatchFaceInstallProcessChangedCallback());
        if (this.mContext instanceof H5ProWebViewActivity) {
            this.mActivity = (H5ProWebViewActivity) this.mContext;
        }
        registerActivityResultCamera();
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(TAG, "onDestroy invoke");
        this.queryCustomConfigCallbacks.clear();
        sProgressRespCallback = null;
        CustomConfigWatchFaceManager.getInstance().destroyWatchFace();
        WatchFaceManager.getInstance().unregisterIdReportCb(TAG);
        WatchFaceCloudService.getInstance().cleanResponseDataCache();
        Iterator<String> it = this.mOneHopH5CallbackIdSet.iterator();
        while (it.hasNext()) {
            AlbumWatchFaceManger.getInstance().unregisterOneHopCallback(it.next());
        }
    }

    public static JSONObject getCurWatchFaceInstallParams() {
        return sCurWatchFaceInstallParams;
    }

    public static ResultCallback<ProgressResp> getsProgressRespCallback() {
        return sProgressRespCallback;
    }

    public static void setsProgressRespCallback(ResultCallback<ProgressResp> resultCallback) {
        sProgressRespCallback = resultCallback;
    }

    public static void resetState() {
        LogUtil.a(TAG, "resetState");
        sProgressRespCbId = 0L;
        sLastResp = null;
        sCurWatchFaceInstallParams = null;
    }

    private ResultCallback<ProgressResp> buildWatchFaceInstallProcessChangedCallback() {
        return new ResultCallback<ProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.9
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(ProgressResp progressResp) {
                int i;
                if (WatchFaceCallback.sCurWatchFaceInstallParams == null) {
                    return;
                }
                String string = "";
                try {
                    string = WatchFaceCallback.sCurWatchFaceInstallParams.getString("watchFaceId");
                    i = WatchFaceCallback.sCurWatchFaceInstallParams.getInt("operate");
                } catch (JSONException unused) {
                    ReleaseLogUtil.a(WatchFaceCallback.TAG, "onInstallWatchFace process catch JSONException, params: ", WatchFaceCallback.sCurWatchFaceInstallParams);
                    JSONObject unused2 = WatchFaceCallback.sCurWatchFaceInstallParams = null;
                    i = 0;
                }
                LogUtil.a(WatchFaceCallback.TAG, "installWatchFace callback response: ", progressResp.toString());
                int resultCode = progressResp.getResultCode();
                ProgressResp.Data resultData = progressResp.getResultData();
                WatchFaceCallback.this.onSuccessCallback(WatchFaceCallback.sProgressRespCbId, progressResp);
                WatchFaceCallback.installAndApplyWatchFaceBiEvent(resultCode, resultData, i, string);
                if (resultData != null) {
                    if (resultData.getState() == ProgressState.APPLIED.value() || resultData.getState() == ProgressState.INSTALLED.value()) {
                        WatchFaceCallback.resetState();
                    }
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                int i;
                LogUtil.a("installWatchFace callback onFailure：", th.getMessage());
                WatchFaceCallback.this.onFailureCallback(WatchFaceCallback.sProgressRespCbId, th.getMessage());
                String string = "";
                try {
                    string = WatchFaceCallback.sCurWatchFaceInstallParams.getString("watchFaceId");
                    i = WatchFaceCallback.sCurWatchFaceInstallParams.getInt("operate");
                } catch (JSONException unused) {
                    ReleaseLogUtil.a(WatchFaceCallback.TAG, "onInstallWatchFace process catch JSONException, params: ", WatchFaceCallback.sCurWatchFaceInstallParams);
                    i = 0;
                }
                WatchFaceCallback.resetState();
                if (CommonUtil.ab(BaseApplication.b())) {
                    mgu.d(i, "2", string);
                } else {
                    mgu.d(i, "1", string);
                }
            }
        };
    }

    private void registerQueryCustomConfigCallback(String str, String str2, long j) {
        if (str == null || str2 == null) {
            return;
        }
        String callbackIdKey = getCallbackIdKey(str, str2);
        if (!this.queryCustomConfigCallbacks.containsKey(callbackIdKey)) {
            this.queryCustomConfigCallbacks.put(callbackIdKey, new ArrayList());
        }
        List<Long> list = this.queryCustomConfigCallbacks.get(callbackIdKey);
        if (list == null) {
            LogUtil.j(TAG, "callbackIdList is null");
        } else {
            list.add(Long.valueOf(j));
            CustomConfigWatchFaceManager.getInstance().registerCustomConfigListener(TAG, new Consumer() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback$$ExternalSyntheticLambda5
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f$0.onCustomConfigReceived((CustomConfig) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCustomConfigReceived(CustomConfig customConfig) {
        DeviceInfo deviceInfoD = mgg.d(TAG);
        if (deviceInfoD == null) {
            LogUtil.j(TAG, "deviceInfo is null");
            return;
        }
        String callbackIdKey = getCallbackIdKey(deviceInfoD.getDeviceIdentify(), customConfig.getMarketId());
        if (this.queryCustomConfigCallbacks.containsKey(callbackIdKey)) {
            List<Long> list = this.queryCustomConfigCallbacks.get(callbackIdKey);
            if (coq.d(list)) {
                return;
            }
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                onSuccessCallback(it.next().longValue(), customConfig);
            }
        }
    }

    private String getCallbackIdKey(String str, String str2) {
        return String.format(Locale.ENGLISH, "%s#%s", str, str2);
    }

    @JavascriptInterface
    public void getVideoWatchFaceInfo(final long j) {
        LogUtil.a(TAG, "getVideoWatchFaceInfo entry");
        VideoWatchFaceManager.getInstance().getVideoWatchFaceInfo(new ResultCallback<TransmitWatchFace<WatchFaceVideoInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.10
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(TransmitWatchFace<WatchFaceVideoInfo> transmitWatchFace) {
                LogUtil.a(WatchFaceCallback.TAG, "getVideoWatchFaceInfo callback response: ", HiJsonUtil.d(transmitWatchFace));
                WatchFaceCallback.this.onSuccessCallback(j, transmitWatchFace);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a(WatchFaceCallback.TAG, "getVideoWatchFaceInfo callback onFailure: ", th.toString());
                WatchFaceCallback.this.onFailureResult(th, j);
            }
        });
    }

    @JavascriptInterface
    public void setVideoWatchFaceInfo(final long j, String str) {
        LogUtil.a(TAG, "setVideoWatchFaceInfo params is ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "setVideoWatchFaceInfo params is empty");
        } else {
            VideoWatchFaceManager.getInstance().setVideoWatchFaceInfo(str, new ResultCallback<TransferProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.11
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(TransferProgressResp transferProgressResp) {
                    LogUtil.a(WatchFaceCallback.TAG, "setWearWatchFaceInfo callback onSuccess ", HiJsonUtil.d(transferProgressResp));
                    WatchFaceCallback.this.onSuccessCallback(j, transferProgressResp);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.a(WatchFaceCallback.TAG, "setWearWatchFaceInfo callback onFailure: ", th);
                    WatchFaceCallback.this.onFailureResult(th, j);
                }
            });
        }
    }

    @JavascriptInterface
    public void getBtNegotiatedDeviceInfo(long j, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.e(TAG_RELEASE, "getBtNegotiatedDeviceInfo params is empty");
                onFailureCallback(j, "getBtNegotiatedDeviceInfo method is empty");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("method");
            LogUtil.a(TAG, "getBtNegotiatedDeviceInfo callbackId:", Long.valueOf(j), ", method:", string);
            if (TextUtils.isEmpty(string)) {
                ReleaseLogUtil.e(TAG_RELEASE, "getBtNegotiatedDeviceInfo method is empty");
                onFailureCallback(j, "getBtNegotiatedDeviceInfo method is empty");
                return;
            }
            if (string.hashCode() == 356242094 && string.equals(WatchFaceConstant.GET_WATCHFACE_CAPABILITY_METHOD)) {
                getWatchfaceCapability(j, jSONObject.getString("deviceId"));
                return;
            }
            ReleaseLogUtil.e(TAG_RELEASE, "getBtNegotiatedDeviceInfo other method");
            onFailureCallback(j, "other method");
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getBtNegotiatedDeviceInfo JSONException exception: ", ExceptionUtils.c(e));
            onFailureCallback(j, "getBtNegotiatedDeviceInfo JSONException exception " + ExceptionUtils.c(e));
        }
    }

    private void getWatchfaceCapability(final long j, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getWatchfaceCapability deviceId is empty");
            DeviceInfo deviceInfoD = mgg.d(TAG);
            if (deviceInfoD == null || deviceInfoD.getDeviceConnectState() != 2) {
                ReleaseLogUtil.e(TAG_RELEASE, "getWatchfaceCapability device disConnect");
                onFailureCallback(j, "getWatchfaceCapability device disConnect");
                return;
            }
            str = deviceInfoD.getDeviceIdentify();
        }
        LogUtil.a(TAG, "getWatchfaceCapability deviceId: ", CommonUtil.n(str));
        WatchFaceManager.getInstance().queryWatchFaceCapability(str, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1417xf19907d1(j, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getWatchfaceCapability$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceCallback, reason: not valid java name */
    /* synthetic */ void m1417xf19907d1(long j, int i, List list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watchfaceCapability", new JSONArray((Collection) list));
            String string = jSONObject.toString();
            LogUtil.a(TAG, "getWatchfaceCapability callbackData is ", string);
            onSuccessCallback(j, string);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getWatchfaceCapability JSONException exception: ", ExceptionUtils.c(e));
            onFailureCallback(j, "getWatchfaceCapability JSONException exception: " + ExceptionUtils.c(e));
        }
    }

    @JavascriptInterface
    public void clipVideo(final long j, final int i) {
        LogUtil.a(TAG, "clipVideo type is ", Integer.valueOf(i));
        if (this.mActivity == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "clipVideo mActivity is null");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1416x96829eac(i, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$clipVideo$3$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceCallback, reason: not valid java name */
    /* synthetic */ void m1416x96829eac(int i, final long j) {
        if (i == 1) {
            VideoChoosePicUtil.goCamera(this.mActivity, this.mActivityResultLauncherCamera);
        } else if (i == 2) {
            VideoChoosePicUtil.choosePhotoOrVideo(this.mActivity);
        } else {
            LogUtil.j(TAG, "clipVideo is other type");
        }
        VideoWatchFaceManager.getInstance().registerClipVideoCallbackId(new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1415x1437e9cd(j, i2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$clipVideo$2$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceCallback, reason: not valid java name */
    /* synthetic */ void m1415x1437e9cd(long j, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "clipVideo data is empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("videoName", str);
            jSONObject.put("index", 1);
        } catch (JSONException e) {
            LogUtil.a(TAG, "JSONException exception, ", ExceptionUtils.c(e));
        }
        String string = jSONObject.toString();
        LogUtil.a(TAG, "clipVideo callbackData is ", string);
        onSuccessCallback(j, string);
    }

    @JavascriptInterface
    public void registerOneHopCallback(final long j) {
        String str = TAG + j;
        this.mOneHopH5CallbackIdSet.add(str);
        AlbumWatchFaceManger.getInstance().registerOneHopCallback(str, new ResultCallback<TransferProgressResp>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback.12
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(TransferProgressResp transferProgressResp) {
                LogUtil.a(WatchFaceCallback.TAG, "oneHop callback response: ", HiJsonUtil.d(transferProgressResp));
                WatchFaceCallback.this.onSuccessCallback(j, transferProgressResp);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a(WatchFaceCallback.TAG, "oneHop callback error: ", ExceptionUtils.c(th));
                WatchFaceCallback.this.onFailureResult(th, j);
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult requestCode is ", Integer.valueOf(i), " resultCode is ", Integer.valueOf(i2));
        if (i2 == -1) {
            if (intent == null) {
                LogUtil.j(TAG, "onActivityResult intent is null");
            } else if (i == 0 || i == 2) {
                LogUtil.a(TAG, "onActivityResultTwo GO_VIDEO_EDIT_REQUEST_CODE video");
                VideoWatchFaceManager.getInstance().clipVideo(intent);
            }
        }
    }

    private void registerActivityResultCamera() {
        if (this.mActivity == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "registerForActivityResult mActivity is null");
        } else {
            LogUtil.a(TAG, "registerActivityResultBt entry");
            this.mActivityResultLauncherCamera = this.mActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback$$ExternalSyntheticLambda1
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    this.f$0.m1418xaa4d5c08((ActivityResult) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$registerActivityResultCamera$4$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceCallback, reason: not valid java name */
    /* synthetic */ void m1418xaa4d5c08(ActivityResult activityResult) {
        if (activityResult == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "registerForActivityResult onActivityResult result is null");
            return;
        }
        int resultCode = activityResult.getResultCode();
        LogUtil.a(TAG, "registerActivityResultBt camera back, ResultCode is ", Integer.valueOf(resultCode));
        if (resultCode == -1) {
            VideoWatchFaceManager.getInstance().handleVideoEditEvent(this.mActivity);
        }
    }
}
