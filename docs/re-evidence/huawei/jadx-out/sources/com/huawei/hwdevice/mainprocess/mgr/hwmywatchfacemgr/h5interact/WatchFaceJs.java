package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.CustomConfigWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.KaleidoscopeWatchFaceManger;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.VideoWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WearWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.CustomConfig;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.InstalledWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.KaleidoscopePreview;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.WearFilterPreview;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceDetailResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceVersion;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.PresetVideoWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceDto;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import defpackage.ecu;
import defpackage.mgu;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "WatchFaceManager", users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class WatchFaceJs {
    private static final String TAG = "WatchFaceJs";

    @H5ProCallback
    interface IH5ProCallback<T> {
        void onFailure(int i, String str);

        void onSuccess(T t);
    }

    @H5ProMethod(name = "applyCustomConfig")
    public static void applyCustomConfig(String str, CustomConfig customConfig, final IH5ProCallback<Boolean> iH5ProCallback) {
        CustomConfigWatchFaceManager.getInstance().applyCustomConfig(str, customConfig, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String str2 = obj instanceof String ? (String) obj : "";
                if (Objects.equals(Integer.valueOf(i), 0)) {
                    mgu.e("m5", "true", str2);
                    iH5ProCallback.onSuccess(true);
                } else {
                    iH5ProCallback.onFailure(i, "applyCustomConfig err");
                    mgu.e("m5", "6", str2);
                }
            }
        });
    }

    @H5ProMethod(name = "getAbilities")
    public static void getAbilities(final IH5ProCallback<String> iH5ProCallback) {
        LogUtil.a(TAG, "getAbilities enter");
        if (iH5ProCallback == null) {
            ReleaseLogUtil.e(TAG, "getAbilities: callback is null");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG, "getAbilities: currentDevice is null");
            iH5ProCallback.onFailure(-1, "currentDevice is null");
        } else {
            WatchFaceManager.getInstance().queryWatchFaceInfo(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs$$ExternalSyntheticLambda3
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    WatchFaceJs.lambda$getAbilities$0(iH5ProCallback, i, (WatchFaceParamsResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$getAbilities$0(IH5ProCallback iH5ProCallback, int i, WatchFaceParamsResult watchFaceParamsResult) {
        if (i != 0) {
            ReleaseLogUtil.e(TAG, "getAbilities: queryWatchFaceInfo error:", Integer.valueOf(i));
            iH5ProCallback.onFailure(-1, "getAbilities error");
        } else {
            iH5ProCallback.onSuccess(GsonUtil.toJson(WatchFaceManager.getInstance().convertParamsToAbility(watchFaceParamsResult)));
        }
    }

    @H5ProMethod(name = "jumpToThemePage")
    public static void jumpToThemePage(String str, IH5ProCallback<Void> iH5ProCallback) {
        WatchFaceManager.getInstance().jumpToThemePage(str);
    }

    @H5ProMethod(name = "obtainDeviceWatchFace")
    public static void obtainDeviceWatchFace(String str, final IH5ProCallback<List<InstalledWatchFace>> iH5ProCallback) {
        WatchFaceManager.getInstance().obtainDeviceWatchFace(str, false, new ResultCallback<List<InstalledWatchFace>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(List<InstalledWatchFace> list) {
                iH5ProCallback.onSuccess(list);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "obtainWatchFaceDetail")
    public static void obtainWatchFaceDetail(String str, final IH5ProCallback<WatchFaceDetailResponse> iH5ProCallback) {
        WatchFaceManager.getInstance().obtainWatchFaceDetail(str, new ResultCallback<WatchFaceDetailResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.3
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(WatchFaceDetailResponse watchFaceDetailResponse) {
                iH5ProCallback.onSuccess(watchFaceDetailResponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "getWatchFaceLocalList")
    public static void getWatchFaceLocalList(String str, final IH5ProCallback<List<WatchFaceDto>> iH5ProCallback) {
        WatchFaceManager.getInstance().getWatchFaceLocalList(str, false, new ResultCallback<List<WatchFaceDto>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.4
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(List<WatchFaceDto> list) {
                iH5ProCallback.onSuccess(list);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "obtainOhEntryDefaultImg")
    public static void obtainOhEntryDefaultImg(String str, final IH5ProCallback<String> iH5ProCallback) {
        WatchFaceManager.getInstance().obtainOhEntryDefaultImg(str, new ResultCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.5
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                iH5ProCallback.onSuccess(str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "obtainPreviewSource")
    public static void obtainPreviewSource(String str, IH5ProCallback<String> iH5ProCallback) {
        iH5ProCallback.onSuccess("");
    }

    @H5ProMethod(name = "deleteWatchFace")
    public static void deleteWatchFace(String str, final IH5ProCallback<List<WatchFaceVersion>> iH5ProCallback) {
        ArrayList arrayList = new ArrayList(1);
        try {
            JSONObject jSONObject = new JSONObject(str);
            WatchFaceVersion watchFaceVersion = new WatchFaceVersion();
            watchFaceVersion.setWatchFaceId(jSONObject.getString("watchFaceId"));
            watchFaceVersion.setVersion(jSONObject.getString("watchFaceVersion"));
            arrayList.add(watchFaceVersion);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "deleteWatchFace JSONException, params: ", str);
        }
        WatchFaceManager.getInstance().deleteWatchFaces(arrayList, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                iH5ProCallback.onSuccess((List) obj);
            }
        });
    }

    @H5ProMethod(name = "deleteWatchFaces")
    public static void deleteWatchFaces(String str, final IH5ProCallback<List<WatchFaceVersion>> iH5ProCallback) {
        WatchFaceManager.getInstance().deleteWatchFaces(str, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                iH5ProCallback.onSuccess((List) obj);
            }
        });
    }

    @H5ProMethod(name = "cancelInstallingWatchFace")
    public static void cancelInstallingWatchFace(String str, IH5ProCallback<Boolean> iH5ProCallback) {
        WatchFaceManager.getInstance().cancelInstallingWatchFace(str);
    }

    @H5ProMethod(name = "applyWatchFace")
    public static void applyWatchFace(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        WatchFaceManager.getInstance().applyWatchFace(str, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                iH5ProCallback.onSuccess((Boolean) obj);
            }
        });
    }

    @H5ProMethod(name = "getAlbumWatchFacePath")
    public static void getAlbumWatchFacePath(int i, final IH5ProCallback<String> iH5ProCallback) {
        AlbumWatchFaceManger.getInstance().getAlbumWatchFacePath(i, new ResponseCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.6
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i2, String str) {
                iH5ProCallback.onSuccess(str);
            }
        });
    }

    @H5ProMethod(name = "getColorPictures")
    public static void getColorPictures(String str, final IH5ProCallback<String> iH5ProCallback) {
        AlbumWatchFaceManger.getInstance().getColorPictures(str, new ResultCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.7
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                iH5ProCallback.onSuccess(str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "getSmartPictureList")
    public static void getSmartPictureList(String str, final IH5ProCallback<String> iH5ProCallback) {
        AlbumWatchFaceManger.getInstance().getSmartPictureList(str, new ResultCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.8
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                iH5ProCallback.onSuccess(str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "createWearWatchFace")
    public static void createWearWatchFace(String str, final IH5ProCallback<List<WearFilterPreview>> iH5ProCallback) {
        WearWatchFaceManager.getInstance().createWearWatchFace(str, new ResultCallback<List<WearFilterPreview>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.9
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(List<WearFilterPreview> list) {
                iH5ProCallback.onSuccess(list);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "getWearWatchFacePath")
    public static void getWearWatchFacePath(int i, final IH5ProCallback<String> iH5ProCallback) {
        WearWatchFaceManager.getInstance().getWearWatchFacePath(i, new ResponseCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.10
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i2, String str) {
                iH5ProCallback.onSuccess(str);
            }
        });
    }

    @H5ProMethod(name = "deleteRedundantWearWatchFace")
    public static void deleteRedundantWearWatchFace(String str, final IH5ProCallback<String> iH5ProCallback) {
        WearWatchFaceManager.getInstance().deleteRedundantWearWatchFace(str, new ResultCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.11
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                iH5ProCallback.onSuccess(str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "checkLocalResourceExist")
    public static void checkLocalResourceExist(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        WearWatchFaceManager.getInstance().checkLocalResourceExist(str, new ResultCallback<Boolean>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.12
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(Boolean bool) {
                iH5ProCallback.onSuccess(bool);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "getKaleidoscopeTypeInfo")
    public static void getKaleidoscopeTypeInfo(String str, final IH5ProCallback<List<KaleidoscopePreview>> iH5ProCallback) {
        KaleidoscopeWatchFaceManger.getInstance().getKaleidoscopeTypeInfo(str, new ResultCallback<List<KaleidoscopePreview>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.13
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(List<KaleidoscopePreview> list) {
                iH5ProCallback.onSuccess(list);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iH5ProCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod(name = "getKaleidoscopeWatchFacePath")
    public static void getKaleidoscopeWatchFacePath(final IH5ProCallback<String> iH5ProCallback) {
        KaleidoscopeWatchFaceManger.getInstance().getKaleidoscopeWatchFacePath(new ResponseCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs.14
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i, String str) {
                iH5ProCallback.onSuccess(str);
            }
        });
    }

    @H5ProMethod(name = "isSupportWatchFaceMarket")
    public static void isSupportWatchFaceMarket(IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "isSupportWatchFaceMarket enter");
        if (iH5ProCallback == null) {
            LogUtil.j(TAG, "isSupportWatchFaceMarket callback is null");
        } else {
            iH5ProCallback.onSuccess(Boolean.valueOf(WatchFaceUtil.isSupportWatchFaceMarket()));
        }
    }

    @H5ProMethod(name = "getWatchFaceMarketSite")
    public static void getWatchFaceMarketSite(IH5ProCallback<String> iH5ProCallback) {
        LogUtil.a(TAG, "getWatchFaceMarketSite enter");
        if (iH5ProCallback == null) {
            LogUtil.j(TAG, "getWatchFaceMarketSite callback is null");
            return;
        }
        String strE = (CommonUtil.ap() || CommonUtil.ao()) ? SharedPreferenceManager.e(BaseApplication.getContext(), "APP_WATCHFACE", "app_watchface_change_url") : "";
        LogUtil.a(TAG, "getWatchFaceMarketSite site:", strE);
        iH5ProCallback.onSuccess(strE);
    }

    @H5ProMethod(name = "getWatchFacePath")
    public static void getWatchFacePath(int i, IH5ProCallback<String> iH5ProCallback) {
        iH5ProCallback.onSuccess(WatchFaceManager.getInstance().getWatchFacePath(i));
    }

    @H5ProMethod(name = "getVideoWatchFacePath")
    public static void getVideoWatchFacePath(final IH5ProCallback<String> iH5ProCallback) {
        LogUtil.a(TAG, "getVideoWatchFacePath entry");
        VideoWatchFaceManager.getInstance().getVideoWatchFacePath(new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WatchFaceJs.lambda$getVideoWatchFacePath$4(iH5ProCallback, i, (String) obj);
            }
        });
    }

    static /* synthetic */ void lambda$getVideoWatchFacePath$4(IH5ProCallback iH5ProCallback, int i, String str) {
        LogUtil.a(TAG, "getVideoWatchFacePath data is : ", str);
        iH5ProCallback.onSuccess(str);
    }

    @H5ProMethod(name = "saveVideoListToFile")
    public static void saveVideoListToFile(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "saveVideoListToFile params is ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "saveVideoListToFile params is empty");
            return;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("presetVideoWatchFaceList");
            ArrayList<PresetVideoWatchFace> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                PresetVideoWatchFace presetVideoWatchFace = new PresetVideoWatchFace();
                presetVideoWatchFace.setVideoFileName(jSONObject.getString("videoFileName"));
                presetVideoWatchFace.setVideoUrl(jSONObject.getString("videoUrl"));
                arrayList.add(presetVideoWatchFace);
            }
            VideoWatchFaceManager.getInstance().saveVideoListToFile(arrayList, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    WatchFaceJs.lambda$saveVideoListToFile$5(iH5ProCallback, i2, (String) obj);
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "saveVideoListToFile JSONException: ", ExceptionUtils.c(e));
        }
    }

    static /* synthetic */ void lambda$saveVideoListToFile$5(IH5ProCallback iH5ProCallback, int i, String str) {
        LogUtil.j(TAG, "saveVideoListToFile status is ", Integer.valueOf(i));
        iH5ProCallback.onSuccess(Integer.valueOf(i));
    }

    @H5ProMethod(name = "isOneHopExecuting")
    public static void isOneHopExecuting(IH5ProCallback<Boolean> iH5ProCallback) {
        boolean zC = SmartClipManager.e(BaseApplication.getContext()).c();
        LogUtil.a(TAG, "isOneHopExecuting:", Boolean.valueOf(zC));
        iH5ProCallback.onSuccess(Boolean.valueOf(zC));
    }
}
