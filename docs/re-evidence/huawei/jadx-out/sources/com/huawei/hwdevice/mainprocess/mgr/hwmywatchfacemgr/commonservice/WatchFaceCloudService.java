package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.DeviceTypeInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.PackageInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.RecommendWatchFacesResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchAbility;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceDetailRequest;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceDetailResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceVersion;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.chj;
import defpackage.ecu;
import defpackage.fxl;
import defpackage.oer;
import defpackage.oet;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class WatchFaceCloudService {
    private static final String TAG = "WatchFaceCloudService";
    private String mDeviceId;
    private String mDeviceType;
    private final chj mParamsFactory;
    private final Map<String, byte[]> previewSourceMap;

    private WatchFaceCloudService() {
        this.previewSourceMap = new ConcurrentHashMap();
        this.mParamsFactory = new chj();
    }

    static class SingletonHolder {
        private static final WatchFaceCloudService INSTANCE = new WatchFaceCloudService();

        private SingletonHolder() {
        }
    }

    public static WatchFaceCloudService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void fetchRecommendedBriefs(int i, int i2, List<WatchAbility> list, final List<WatchFaceVersion> list2, final ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            resultCallback.onFailure(new Throwable("fetchRecommendedBriefs, deviceInfo is null"));
            return;
        }
        HashMap map = new HashMap();
        map.put("deviceType", deviceInfo.getDeviceModel());
        map.put("lang", CommonUtil.u());
        map.put("pageStart", String.valueOf(i));
        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, String.valueOf(i2));
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCountryCode());
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        map.put("abilities", GsonUtil.toJson(list));
        if (list2 != null) {
            map.put("watchFaces", GsonUtil.toJson(list2));
        }
        callHttpGet(WatchFaceUtil.joinUrl(GRSManager.c(BaseApplication.b()).getUrl("healthOperationUrl"), WatchFaceConstant.RECOMMEND_REQUEST_URL), createRequestHeader(), map, RecommendWatchFacesResponse.class, new ResultCallback<RecommendWatchFacesResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(RecommendWatchFacesResponse recommendWatchFacesResponse) {
                if (recommendWatchFacesResponse.getResultCode() == 0) {
                    calculateFields(recommendWatchFacesResponse);
                    resultCallback.onSuccess(recommendWatchFacesResponse);
                } else {
                    int resultCode = recommendWatchFacesResponse.getResultCode();
                    LogUtil.e(WatchFaceCloudService.TAG, "invalid response, status: ", Integer.valueOf(resultCode), " msg: ", recommendWatchFacesResponse.getResultDesc());
                    resultCallback.onFailure(new Throwable("invalid response"));
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }

            private void calculateFields(RecommendWatchFacesResponse recommendWatchFacesResponse) {
                if (list2 == null) {
                    return;
                }
                for (RecommendWatchFacesResponse.RecommendWatchFace recommendWatchFace : recommendWatchFacesResponse.getWatchFaces()) {
                    if (TextUtils.isEmpty(recommendWatchFace.getLatestVersion())) {
                        recommendWatchFace.setUpdate(false);
                    } else {
                        for (WatchFaceVersion watchFaceVersion : list2) {
                            if (Objects.equals(recommendWatchFace.getWatchFaceId(), watchFaceVersion.getWatchFaceId()) && WatchFaceUtil.checkForUpdate(watchFaceVersion.getVersion(), recommendWatchFace.getLatestVersion())) {
                                recommendWatchFace.setUpdate(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
    }

    public void fetchWatchFaceDetail(String str, String str2, List<WatchAbility> list, String str3, String str4, final ResultCallback<WatchFaceDetailResponse> resultCallback) {
        new WatchFaceDetailRequest();
        HashMap map = new HashMap();
        map.put("deviceType", str);
        map.put("lang", CommonUtil.u());
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCountryCode());
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        map.put("abilities", GsonUtil.toJson(list));
        map.put("version", str3);
        callHttpGet(WatchFaceUtil.joinUrl(GRSManager.c(BaseApplication.b()).getUrl("healthOperationUrl"), WatchFaceConstant.DETAIL_REQUEST_URL).replace("{watchFaceId}", str2), createRequestHeader(str4), map, WatchFaceDetailResponse.class, new ResultCallback<WatchFaceDetailResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(WatchFaceDetailResponse watchFaceDetailResponse) {
                if (watchFaceDetailResponse.getResultCode() == 0) {
                    resultCallback.onSuccess(watchFaceDetailResponse);
                    return;
                }
                int resultCode = watchFaceDetailResponse.getResultCode();
                LogUtil.e(WatchFaceCloudService.TAG, "invalid response, status: ", Integer.valueOf(resultCode), " msg: ", watchFaceDetailResponse.getResultDesc());
                resultCallback.onFailure(new Throwable("invalid response"));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    public void updateDeviceInfo(String str, String str2) {
        this.mDeviceId = str;
        this.mDeviceType = str2;
    }

    public void fetchPreviewSource(final String str, String str2, final ResultCallback<byte[]> resultCallback) {
        LogUtil.a(TAG, "fetchPreviewSource enter, cacheKey: ", str, ", sourceUrl: ", str2);
        if (this.previewSourceMap.containsKey(str)) {
            LogUtil.a(TAG, "fetchPreviewSource load from cache");
            resultCallback.onSuccess(this.previewSourceMap.get(str));
        } else {
            callHttpGet(str2, createRequestHeader(), new HashMap(), byte[].class, new ResultCallback<byte[]>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService.3
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(byte[] bArr) {
                    LogUtil.a(WatchFaceCloudService.TAG, "fetchPreviewSource load from network");
                    WatchFaceCloudService.this.previewSourceMap.put(str, bArr);
                    resultCallback.onSuccess(bArr);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    resultCallback.onFailure(th);
                }
            });
        }
    }

    public void fetchDeviceTypeInfo(String str, final ResultCallback<DeviceTypeInfoResponse.DeviceTypeInfo> resultCallback) {
        HashMap map = new HashMap();
        map.put("deviceType", str);
        map.put("lang", CommonUtil.u());
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCountryCode());
        map.put(CloudParamKeys.CLIENT_TYPE, "1");
        callHttpGet(WatchFaceUtil.joinUrl(GRSManager.c(BaseApplication.b()).getUrl("healthOperationUrl"), WatchFaceConstant.DEVICE_TYPE_INFO_REQUEST_URL.replace("{deviceType}", str)), createRequestHeader(), map, DeviceTypeInfoResponse.class, new ResultCallback<DeviceTypeInfoResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService.4
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(DeviceTypeInfoResponse deviceTypeInfoResponse) {
                if (deviceTypeInfoResponse.getResultCode() == 0) {
                    resultCallback.onSuccess(deviceTypeInfoResponse.getDeviceTypeInfo());
                    return;
                }
                int resultCode = deviceTypeInfoResponse.getResultCode();
                LogUtil.e(WatchFaceCloudService.TAG, "invalid response, status: ", Integer.valueOf(resultCode), " msg: ", deviceTypeInfoResponse.getResultDesc());
                resultCallback.onFailure(new Throwable("invalid response"));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    public void fetchPackageInfo(String str, String str2, List<WatchAbility> list, String str3, final ResultCallback<PackageInfoResponse> resultCallback) {
        HashMap map = new HashMap();
        map.put("deviceType", str2);
        map.put("watchFaceId", str);
        map.put("lang", CommonUtil.u());
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCountryCode());
        map.put(CloudParamKeys.CLIENT_TYPE, "1");
        map.put("abilities", GsonUtil.toJson(list));
        callHttpGet(WatchFaceUtil.joinUrl(GRSManager.c(BaseApplication.b()).getUrl("healthOperationUrl"), WatchFaceConstant.PACKAGE_REQUEST_URL.replace("{watchFaceId}", str)), createRequestHeader(str3), map, PackageInfoResponse.class, new ResultCallback<PackageInfoResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService.5
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(PackageInfoResponse packageInfoResponse) {
                if (packageInfoResponse.getResultCode() == 0) {
                    resultCallback.onSuccess(packageInfoResponse);
                    return;
                }
                int resultCode = packageInfoResponse.getResultCode();
                LogUtil.e(WatchFaceCloudService.TAG, "fetchPackageInfo, invalid response, status: ", Integer.valueOf(resultCode), " msg: ", packageInfoResponse.getResultDesc());
                resultCallback.onFailure(new Throwable("invalid response"));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    public void downloadPackage(String str, File file, final ProgressListener<File> progressListener) {
        if (file.exists()) {
            LogUtil.a(TAG, "downloadPackage, DeleteFile : ", file.delete() ? "Success" : "Failed");
        }
        boolean zMkdirs = file.mkdirs();
        LogUtil.a(TAG, "CreateFile : ", zMkdirs ? "Success" : "Failed");
        if (!zMkdirs) {
            progressListener.onFail(new Throwable("file.mkdirs failed"));
        }
        PowerKitManager.a().b(TAG, 512, WatchFaceConstant.APPLY_POWER_WATCHFACE_KIT_CHECK_REASON);
        oet.d().a(new oer(str, null, file, new ProgressListener<File>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService.6
            @Override // com.huawei.networkclient.ProgressListener
            public void onFinish(File file2) {
                PowerKitManager.a().a(WatchFaceCloudService.TAG, 512, WatchFaceConstant.APPLY_POWER_WATCHFACE_KIT_CHECK_REASON);
                progressListener.onFinish(file2);
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                progressListener.onProgress(j, j2, z);
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                PowerKitManager.a().a(WatchFaceCloudService.TAG, 512, WatchFaceConstant.APPLY_POWER_WATCHFACE_KIT_CHECK_REASON);
                progressListener.onFail(th);
            }
        }));
    }

    public void cleanResponseDataCache() {
        this.previewSourceMap.clear();
    }

    private Map<String, String> createRequestHeader() {
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        String accountInfo = loginInit.getAccountInfo(1008);
        headers.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        headers.put(CloudParamKeys.X_TOKEN, accountInfo);
        headers.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        headers.put(CloudParamKeys.X_APP_ID, BaseApplication.d());
        headers.put(CloudParamKeys.X_SITE_ID, String.valueOf(loginInit.getAccountInfo(1009)));
        headers.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(BaseApplication.b()));
        return headers;
    }

    private Map<String, String> createRequestHeader(String str) {
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        String accountInfo = loginInit.getAccountInfo(1008);
        headers.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        headers.put(CloudParamKeys.X_TOKEN, accountInfo);
        headers.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        headers.put(CloudParamKeys.X_APP_ID, BaseApplication.d());
        headers.put(CloudParamKeys.X_SITE_ID, String.valueOf(loginInit.getAccountInfo(1009)));
        headers.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(BaseApplication.b()));
        if (str != null) {
            headers.put("x-scenario", str);
        }
        return headers;
    }

    private <Rsp> void callHttpGet(String str, Map<String, String> map, Map<String, String> map2, Class<Rsp> cls, ResultCallback<Rsp> resultCallback) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a(TAG, "callHttpGet, invalid url");
            resultCallback.onFailure(new Throwable("callHttpGet, invalid url"));
        } else {
            oet.d().e(str, map, map2, cls, resultCallback);
        }
    }
}
