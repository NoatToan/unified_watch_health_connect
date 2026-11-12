package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.CustomConfigWatchFaceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.StickerWatchFaceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.h5interact.WatchFaceJs;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchAbility;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceDto;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.operation.h5pro.jsmodules.device.FileServiceJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.WatchFaceApi;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.qpx;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@ApiDefine(uri = WatchFaceApi.class)
@Singleton
public class WatchFaceApiImpl implements WatchFaceApi {
    private static final String MY_WATCH_FACE = "myWatchFace";
    private static final String TAG_RELEASE = "R_WatchFaceApiManagerImpl";
    private static final String WATCH_FACE_DETAIL = "watchFaceDetail";

    @Override // com.huawei.watchface.WatchFaceApi
    public void openMyWatchFace(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "openMyWatchFace enter");
        startWatchFace(MY_WATCH_FACE, null, iBaseResponseCallback);
    }

    @Override // com.huawei.watchface.WatchFaceApi
    public void openWatchFaceDetail(int i, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "openWatchFaceDetail enter");
        queryWatchFaceDetailInfo(i, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == -1) {
                    ReleaseLogUtil.e(WatchFaceApiImpl.TAG_RELEASE, "openWatchFaceDetail error");
                    iBaseResponseCallback.a(-1, obj);
                } else if (!(obj instanceof WatchFaceDto)) {
                    ReleaseLogUtil.e(WatchFaceApiImpl.TAG_RELEASE, "openWatchFaceDetail objectData is not WatchFaceDto");
                    iBaseResponseCallback.a(-1, obj);
                } else {
                    WatchFaceApiImpl.this.startWatchFace(WatchFaceApiImpl.WATCH_FACE_DETAIL, (WatchFaceDto) obj, iBaseResponseCallback);
                }
            }
        });
    }

    private void queryWatchFaceDetailInfo(final int i, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "openMyWatchFace enter");
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "openMyWatchFace currentDevice is null");
        } else {
            WatchFaceManager.getInstance().getWearWatchInfoFromDevice(deviceInfo.getDeviceIdentify(), false, WatchFaceManager.WATCH_FACE_LOCAL_LIST_KEY_PREFIX, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    WatchFaceApiImpl.lambda$queryWatchFaceDetailInfo$0(iBaseResponseCallback, i, i2, (List) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$queryWatchFaceDetailInfo$0(IBaseResponseCallback iBaseResponseCallback, int i, int i2, List list) {
        if (i2 != 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "openMyWatchFace currentDevice is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WatchFaceDto watchFaceDto = (WatchFaceDto) it.next();
            if (watchFaceDto.getWatchFaceType() == i) {
                iBaseResponseCallback.a(0, watchFaceDto);
                return;
            }
        }
        iBaseResponseCallback.a(-1, null);
    }

    @Override // com.huawei.watchface.WatchFaceApi
    public void openWatchFaceDetail(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        WatchFaceDto watchFaceDto = new WatchFaceDto();
        watchFaceDto.setWatchFaceId(str);
        watchFaceDto.setWatchFaceVersion(str2);
        startWatchFace(WATCH_FACE_DETAIL, watchFaceDto, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWatchFace(final String str, final WatchFaceDto watchFaceDto, final IBaseResponseCallback iBaseResponseCallback) {
        final DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "openMyWatchFace currentDevice is null");
            xjt.aq("entry watch face getDeviceInfo is null");
            iBaseResponseCallback.a(-2, "openMyWatchFace currentDevice is null");
        } else {
            CustomConfigWatchFaceService.getInstance().registerDeviceSampleListener();
            StickerWatchFaceService.getInstance().registerDeviceSampleListener();
            WatchFaceManager.getInstance().queryWatchFaceInfo(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m1414x2e77622a(deviceInfo, watchFaceDto, str, iBaseResponseCallback, i, (WatchFaceParamsResult) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$startWatchFace$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceApiImpl, reason: not valid java name */
    /* synthetic */ void m1414x2e77622a(DeviceInfo deviceInfo, WatchFaceDto watchFaceDto, String str, IBaseResponseCallback iBaseResponseCallback, int i, WatchFaceParamsResult watchFaceParamsResult) {
        if (i != 0) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_device_not_support_my_watch_face);
            ReleaseLogUtil.e(TAG_RELEASE, "openMyWatchFace refreshWatchFaceInfo error:", Integer.valueOf(i));
            return;
        }
        JSONObject h5Params = getH5Params(deviceInfo, watchFaceParamsResult, watchFaceDto);
        if (h5Params == null) {
            return;
        }
        String str2 = Constants.H5PRO_PAGE_PREFIX + str + "?params=" + h5Params;
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath(str2).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class).addCustomizeJsModule("WatchFaceCallback", WatchFaceCallback.class).addCustomizeJsModule("FileService", FileServiceJsApi.class).setImmerse().showStatusBar().setActivityStartFlag(67108864);
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(WatchFaceJs.class);
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        iBaseResponseCallback.a(0, builder);
    }

    private JSONObject getH5Params(DeviceInfo deviceInfo, WatchFaceParamsResult watchFaceParamsResult, WatchFaceDto watchFaceDto) {
        int iJ;
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String deviceModel = deviceInfo.getDeviceModel();
        JSONObject jSONObject = new JSONObject();
        List<WatchAbility> listConvertParamsToAbility = WatchFaceManager.getInstance().convertParamsToAbility(watchFaceParamsResult);
        String supportOneTouch = watchFaceParamsResult.getSupportOneTouch();
        if (TextUtils.isEmpty(supportOneTouch)) {
            iJ = -1;
        } else {
            iJ = WatchFaceUtil.isPhoneSupportOneHop() ? CommonUtil.j(supportOneTouch) : 0;
        }
        String supportGaussianColor = watchFaceParamsResult.getSupportGaussianColor();
        int iJ2 = TextUtils.isEmpty(supportGaussianColor) ? -1 : CommonUtil.j(supportGaussianColor);
        int i = iJ2 != 1 ? iJ2 : 0;
        try {
            jSONObject.put("deviceType", deviceModel);
            jSONObject.put("deviceId", deviceIdentify);
            jSONObject.put("abilities", GsonUtil.toJson(listConvertParamsToAbility));
            jSONObject.put("watchFaceHeight", watchFaceParamsResult.getScreenHeight());
            jSONObject.put("watchFaceWidth", watchFaceParamsResult.getScreenWidth());
            jSONObject.put("supportOneTouch", iJ);
            jSONObject.put("supportGaussColor", i);
            jSONObject.put("supportAestheticAlbumColor", watchFaceParamsResult.getSupportAestheticAlbumColor());
            jSONObject.put("supportNewVideoCustomize", watchFaceParamsResult.getSupportNewVideoCustomize());
            jSONObject.put("supportAlbumFunctionExpansion", watchFaceParamsResult.getSupportAlbumFunctionExpansion());
            if (watchFaceDto != null) {
                jSONObject.put("watchFaceId", watchFaceDto.getWatchFaceId());
                jSONObject.put("watchFaceVersion", watchFaceDto.getWatchFaceVersion());
            }
            LogUtil.a(TAG_RELEASE, "watchFace params:", jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "openMyWatchFace catch JSONException");
            xjt.aq("entry watch face params is JSONException");
            return null;
        }
    }

    public static Context getStartMyWatchFaceContext() {
        Activity activity = BaseApplication.getActivity();
        return activity == null ? BaseApplication.getContext() : activity;
    }
}
