package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.CustomConfigWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.WatchFaceDeviceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.CustomConfig;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressCode;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressState;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.PackageInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceDto;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceIdReportInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceList;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceOperateInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.watchface.WatchFaceType;
import defpackage.lvb;
import defpackage.mgg;
import defpackage.mgu;
import defpackage.mhp;
import defpackage.qqt;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WatchFaceWearService {
    private static final int DEFAULT_STORAGE_SPACE = -1;
    private static final int DEVICE_REPORT_FILE_LIMITED = 140004;
    private static final int DEVICE_REPORT_NO_SPACE = 140009;
    private static final String KEY_MY_WATCHFACE_APPLY_TIME = "my_watchface_apply_time";
    private static final int MEGABYTES_CONVERT = 1048576;
    private static final int REPORT_STATUS_WATCHFACE_TRANSFER_SUCCESS = 2;
    private static final String TAG = "WatchFaceWearService";
    private static final String TAG_RELEASE = "R_WatchFaceWearService";
    private String mCurWatchFaceId;
    private mhp mTransFileInfo;

    private boolean getWatchOnTrial(int i) {
        return (i & 64) == 64;
    }

    public boolean isSignFailErrorCode(int i) {
        return i == 100007 || i == 100014;
    }

    public boolean isSuccessErrorCode(int i) {
        return i == 0 || i == 100000;
    }

    private WatchFaceWearService() {
        registerIdReportCb(TAG, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda8
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.handleWatchFaceReportId(i, (WatchFaceIdReportInfo) obj);
            }
        });
    }

    static class SingletonHolder {
        private static final WatchFaceWearService INSTANCE = new WatchFaceWearService();

        private SingletonHolder() {
        }
    }

    public static WatchFaceWearService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void queryWatchFaceParams(final ResponseCallback<WatchFaceParamsResult> responseCallback) {
        WatchFaceDeviceService.getInstance().queryWatchFaceParams(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                WatchFaceWearService.lambda$queryWatchFaceParams$0(responseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$queryWatchFaceParams$0(ResponseCallback responseCallback, int i, Object obj) {
        if (i != 0 || !(obj instanceof WatchFaceParamsResult)) {
            responseCallback.onResponse(i, null);
        } else {
            responseCallback.onResponse(0, (WatchFaceParamsResult) obj);
        }
    }

    public void obtainWatchFaceInfo(List<String> list, final ResponseCallback<WatchFaceInfoResponse> responseCallback) {
        WatchFaceDeviceService.getInstance().obtainWatchFaceInfo(list, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                responseCallback.onResponse(i, (WatchFaceInfoResponse) obj);
            }
        });
    }

    public void queryWatchFaceInfoList(final boolean z, final ResponseCallback<List<WatchFaceDto>> responseCallback) {
        WatchFaceDeviceService.getInstance().queryWatchFaceInfoList(z, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1428x110d9cf0(z, responseCallback, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queryWatchFaceInfoList$2$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-commonservice-WatchFaceWearService, reason: not valid java name */
    /* synthetic */ void m1428x110d9cf0(boolean z, ResponseCallback responseCallback, int i, Object obj) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        boolean z2 = false;
        for (WatchFaceList.WatchFace watchFace : ((WatchFaceList) obj).getWatchFaceList()) {
            String strAsciiNumToString = WatchFaceUtil.asciiNumToString(watchFace.getWatchFaceId());
            boolean z3 = (watchFace.getWatchFaceType() & 1) != 0;
            WatchFaceDto watchFaceDto = new WatchFaceDto();
            watchFaceDto.setWatchFaceId(strAsciiNumToString);
            watchFaceDto.setWatchFaceVersion(WatchFaceUtil.asciiNumToString(watchFace.getWatchFaceVersion()));
            watchFaceDto.setCurrent(z3);
            watchFaceDto.setSupportDelete((watchFace.getWatchFaceType() & 4) != 0);
            watchFaceDto.setWatchFaceType(getWatchType(watchFace.getWatchFaceType(), watchFace.getWatchFaceExpandType()));
            watchFaceDto.setPreset((watchFace.getWatchFaceType() & 2) != 0);
            watchFaceDto.setOnTrial(getWatchOnTrial(watchFace.getWatchFaceType()));
            if (z3) {
                arrayList.add(0, watchFaceDto);
                getInstance().setCurWatchFaceId(strAsciiNumToString);
                z2 = true;
            } else {
                arrayList.add(watchFaceDto);
            }
            if (z2) {
                arrayList2.add(watchFaceDto);
            } else {
                arrayList3.add(watchFaceDto);
            }
        }
        if (z) {
            LogUtil.a(TAG, "queryWatchFaceInfoList from MyWatchFaceCard");
            arrayList2.addAll(arrayList3);
            responseCallback.onResponse(0, arrayList2);
            return;
        }
        responseCallback.onResponse(0, arrayList);
    }

    private int getWatchType(int i, int i2) {
        int iValue = ((i & 16) == 16 || 1 == i2) ? WatchFaceType.VIDEO.value() : 0;
        if ((i & 32) == 32 || 2 == i2) {
            iValue = WatchFaceType.ALBUM.value();
        }
        if ((i & 128) == 128 || 3 == i2) {
            iValue = WatchFaceType.KALEIDOSCOPE.value();
        }
        if (4 == i2) {
            iValue = WatchFaceType.WEAR.value();
        }
        return 5 == i2 ? WatchFaceType.STICKER.value() : iValue;
    }

    public String getCurWatchFaceId() {
        return this.mCurWatchFaceId;
    }

    public void setCurWatchFaceId(String str) {
        this.mCurWatchFaceId = str;
    }

    public void displayWatchFace(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        refreshMyWatchFaceApplyTime();
        WatchFaceDeviceService.getInstance().applyWatchFace(str, str2, false, iBaseResponseCallback);
    }

    public void deleteWatchFace(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        WatchFaceDeviceService.getInstance().deleteWatchFace(str, str2, iBaseResponseCallback);
    }

    public void sendWatchFace(final String str, final String str2, final File file, final String str3, final PackageInfoResponse.PackageInfo packageInfo, final int i, final ResponseCallback<String> responseCallback) {
        final DeviceInfo deviceInfoD = mgg.d(TAG);
        WatchFaceManager.getInstance().queryWatchFaceInfo(deviceInfoD.getDeviceIdentify(), new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1432x25b34a8d(responseCallback, file, packageInfo, deviceInfoD, str, str2, i, str3, i2, (WatchFaceParamsResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendWatchFace$5$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-commonservice-WatchFaceWearService, reason: not valid java name */
    /* synthetic */ void m1432x25b34a8d(final ResponseCallback responseCallback, File file, final PackageInfoResponse.PackageInfo packageInfo, final DeviceInfo deviceInfo, final String str, final String str2, final int i, final String str3, int i2, final WatchFaceParamsResult watchFaceParamsResult) {
        if (i2 != 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "sendWatchFace get watchface info error");
            responseCallback.onResponse(-1, null);
        } else {
            final String filePathToBeSent = getFilePathToBeSent(file, watchFaceParamsResult, packageInfo, deviceInfo);
            final long fileSize = WatchFaceUtil.getFileSize(filePathToBeSent);
            LogUtil.a(TAG, "sendWatchFace file:", filePathToBeSent, ", fileSize: ", Long.valueOf(fileSize));
            WatchFaceDeviceService.getInstance().queryWatchStatus(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj) {
                    this.f$0.m1431x3cab858c(responseCallback, fileSize, watchFaceParamsResult, packageInfo, str, str2, i, deviceInfo, str3, filePathToBeSent, i3, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$sendWatchFace$4$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-commonservice-WatchFaceWearService, reason: not valid java name */
    /* synthetic */ void m1431x3cab858c(final ResponseCallback responseCallback, long j, WatchFaceParamsResult watchFaceParamsResult, final PackageInfoResponse.PackageInfo packageInfo, final String str, final String str2, final int i, final DeviceInfo deviceInfo, final String str3, final String str4, int i2, Object obj) {
        if (!(obj instanceof WatchFaceList)) {
            ReleaseLogUtil.e(TAG_RELEASE, "sendWatchFace watchStatusObj error");
            responseCallback.onResponse(-1, null);
            return;
        }
        WatchFaceList watchFaceList = (WatchFaceList) obj;
        if (watchFaceList.getIsWatchfaceFull()) {
            LogUtil.j(TAG, "Watchface quantity reach maximum, cant send file.");
            WatchFaceManager.getInstance().handleTransferError(DEVICE_REPORT_FILE_LIMITED, "");
        } else if (watchFaceList.getLeftSpace() != -1 && watchFaceList.getLeftSpace() < (j * 1.0d) / 1048576.0d) {
            LogUtil.j(TAG, "No enough space left for transferring current watch face.");
            WatchFaceManager.getInstance().handleTransferError(DEVICE_REPORT_NO_SPACE, "");
        } else {
            WatchFaceDeviceService.getInstance().applyWatchFace(str, str2, WatchFaceUtil.isNeedSyncWatchFace(watchFaceParamsResult, packageInfo), new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj2) {
                    this.f$0.m1430x53a3c08b(responseCallback, i, str, str2, deviceInfo, str3, str4, packageInfo, i3, obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$sendWatchFace$3$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-commonservice-WatchFaceWearService, reason: not valid java name */
    /* synthetic */ void m1430x53a3c08b(ResponseCallback responseCallback, int i, String str, String str2, DeviceInfo deviceInfo, String str3, String str4, PackageInfoResponse.PackageInfo packageInfo, int i2, Object obj) {
        if (!(obj instanceof WatchFaceOperateInfo)) {
            ReleaseLogUtil.e(TAG_RELEASE, "sendWatchFace objeData error");
            responseCallback.onResponse(-1, null);
            return;
        }
        WatchFaceOperateInfo watchFaceOperateInfo = (WatchFaceOperateInfo) obj;
        int errorCode = watchFaceOperateInfo.getErrorCode();
        if (!isSuccessErrorCode(errorCode)) {
            ReleaseLogUtil.e(TAG_RELEASE, "sendWatchFace install error:", Integer.valueOf(errorCode));
            WatchFaceCallback.onCall(ProgressCode.APPLY_OTHER_FAILED, "apply error");
            signFailedBiEvent(i, errorCode, str);
        } else if (watchFaceOperateInfo.getNeedReceive() == 0) {
            handleWatchFaceExist(str, str2, deviceInfo);
        } else {
            sendWatchFaceDetail(str3, str4, packageInfo, i, responseCallback);
        }
    }

    private void handleWatchFaceExist(final String str, String str2, DeviceInfo deviceInfo) {
        ReleaseLogUtil.e(TAG_RELEASE, "sendWatchFace skip transfer watchface");
        CustomConfig currentInstallCustomConfig = getCurrentInstallCustomConfig();
        if (currentInstallCustomConfig != null) {
            CustomConfigWatchFaceManager.getInstance().applyCustomConfig(deviceInfo.getDeviceIdentify(), currentInstallCustomConfig, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.APPLIED, str);
                }
            });
        } else {
            WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.APPLIED, str);
        }
    }

    private CustomConfig getCurrentInstallCustomConfig() {
        JSONObject curWatchFaceInstallParams = WatchFaceCallback.getCurWatchFaceInstallParams();
        if (curWatchFaceInstallParams == null) {
            return null;
        }
        String strOptString = curWatchFaceInstallParams.optString(WatchFaceConstant.INSTALL_CUSTOM_CONFIG_KEY);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return (CustomConfig) qqt.e(strOptString, CustomConfig.class);
    }

    private String getFilePathToBeSent(File file, WatchFaceParamsResult watchFaceParamsResult, PackageInfoResponse.PackageInfo packageInfo, DeviceInfo deviceInfo) {
        if (!WatchFaceUtil.isNeedSyncWatchFace(watchFaceParamsResult, packageInfo)) {
            return WatchFaceUtil.generateFileToSend(deviceInfo, file);
        }
        return WatchFaceUtil.generateSyncPackage(file, packageInfo);
    }

    private void sendWatchFaceDetail(final String str, String str2, PackageInfoResponse.PackageInfo packageInfo, int i, final ResponseCallback<String> responseCallback) {
        final String str3 = str.split("_")[0];
        DeviceInfo deviceInfoD = mgg.d(TAG);
        mhp mhpVar = new mhp();
        mhpVar.e(TransferFileReqType.APP_DELIVERY);
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        mhpVar.b(arrayList);
        mhpVar.a(str);
        mhpVar.c(1);
        mhpVar.h(str2);
        if (deviceInfoD != null) {
            mhpVar.d(deviceInfoD.getDeviceIdentify());
        }
        mhpVar.c(WatchFaceUtil.getFileSize(str2));
        if (deviceInfoD == null || deviceInfoD.getDeviceConnectState() != 2) {
            LogUtil.a(TAG, "sendWatchFaceDetail device not connected");
            responseCallback.onResponse(-1, "device not connected");
        } else {
            this.mTransFileInfo = mhpVar;
            WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.INSTALLING, str3);
            lvb.e().b(TransferBusinessType.FIVE_FORTY, mhpVar, new IAppTransferFileResultAIDLCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService.1
                private int lastProgress = 0;

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onFileTransferState(int i2, String str4) {
                    int i3 = this.lastProgress;
                    if (i2 == i3) {
                        return;
                    }
                    if (i2 >= i3 || i2 == 0) {
                        this.lastProgress = i2;
                        if (i2 % 5 == 0) {
                            LogUtil.a(WatchFaceWearService.TAG, "sendWatchFaceDetail onFileTransferState, progress: ", Integer.valueOf(i2), " fileName: ", str);
                        }
                        WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.INSTALL_PER, str3, Integer.valueOf(i2));
                    }
                }

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onUpgradeFailed(int i2, String str4) {
                    LogUtil.a(WatchFaceWearService.TAG, "onUpgradeFailed");
                    responseCallback.onResponse(i2, str4);
                }

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onFileRespond(int i2, String str4) {
                    LogUtil.a(WatchFaceWearService.TAG, "onFileRespond");
                    responseCallback.onResponse(0, str4);
                }
            });
        }
    }

    public void cancelInstallingWatchFace() {
        lvb.e().b(this.mTransFileInfo.f(), this.mTransFileInfo.n(), new IBaseCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService.2
            @Override // com.huawei.hwservicesmgr.IBaseCallback
            public void onResponse(int i, String str) {
                if (i == 20003) {
                    WatchFaceCallback.onCall(ProgressCode.CANCELED, "canceled");
                    WatchFaceCallback.resetState();
                } else {
                    WatchFaceCallback.onCall(ProgressCode.CANCEL_FAIL, "cancel fail");
                }
            }
        });
    }

    public void registerIdReportCb(String str, ResponseCallback<WatchFaceIdReportInfo> responseCallback) {
        WatchFaceDeviceService.getInstance().registerIdReportCb(str, responseCallback);
    }

    public void unregisterIdReportCb(String str) {
        WatchFaceDeviceService.getInstance().unregisterIdReportCb(str);
    }

    public void refreshMyWatchFaceApplyTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a(TAG, "setMyWatchFaceApplyTime ", Long.valueOf(jCurrentTimeMillis));
        SharedPreferenceManager.c(KEY_MY_WATCHFACE_APPLY_TIME, String.valueOf(jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWatchFaceReportId(int i, WatchFaceIdReportInfo watchFaceIdReportInfo) {
        LogUtil.a(TAG, "handleWatchFaceReportId enter");
        if (i != 0 || watchFaceIdReportInfo == null) {
            LogUtil.a(TAG, "handleWatchFaceReportId error :", Integer.valueOf(i));
            return;
        }
        int reportStatus = watchFaceIdReportInfo.getReportStatus();
        String watchFaceId = watchFaceIdReportInfo.getWatchFaceId();
        String watchFaceVersion = watchFaceIdReportInfo.getWatchFaceVersion();
        if (TextUtils.isEmpty(watchFaceId)) {
            LogUtil.a(TAG, "handleWatchFaceReportId error report watchFaceId is empty");
        } else if (reportStatus == 2) {
            handleWatchFaceTransferSuccess(watchFaceId, watchFaceVersion);
        }
    }

    private void handleWatchFaceTransferSuccess(String str, String str2) {
        LogUtil.a(TAG, "handleWatchFaceTransferSuccess enter");
        JSONObject curWatchFaceInstallParams = WatchFaceCallback.getCurWatchFaceInstallParams();
        if (curWatchFaceInstallParams == null) {
            LogUtil.a(TAG, "handleWatchFaceReportId installParams is null");
            return;
        }
        final String strOptString = curWatchFaceInstallParams.optString("watchFaceId");
        final int iOptInt = curWatchFaceInstallParams.optInt("operate");
        String strOptString2 = curWatchFaceInstallParams.optString(WatchFaceConstant.INSTALL_CUSTOM_CONFIG_KEY);
        String strOptString3 = curWatchFaceInstallParams.optString("deviceId");
        if (!Objects.equals(str, strOptString)) {
            LogUtil.a(TAG, "handleWatchFaceTransferSuccess reportWatchFaceId not equals to watchFaceId");
            return;
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            CustomConfig customConfig = (CustomConfig) qqt.e(strOptString2, CustomConfig.class);
            if (customConfig != null) {
                LogUtil.a(TAG, "handleWatchFaceTransferSuccess set custom config");
                sendCustomConfigAndApplyWatchFace(strOptString3, customConfig, strOptString, str2);
                return;
            } else {
                LogUtil.j(TAG, "handleWatchFaceTransferSuccess custom config error");
                mgu.d(iOptInt, "6", strOptString);
            }
        }
        if (isNeedApplyWatchFace(iOptInt, strOptString)) {
            LogUtil.a(TAG, "handleWatchFaceTransferSuccess apply watchface");
            displayWatchFace(strOptString, str2, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m1427x800173f9(iOptInt, strOptString, i, obj);
                }
            });
        } else {
            WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.INSTALLED, strOptString);
        }
    }

    /* JADX INFO: renamed from: lambda$handleWatchFaceTransferSuccess$7$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-commonservice-WatchFaceWearService, reason: not valid java name */
    /* synthetic */ void m1427x800173f9(int i, String str, int i2, Object obj) {
        if (!(obj instanceof WatchFaceOperateInfo)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWatchFaceTransferSuccess objeData error");
            WatchFaceCallback.onCall(ProgressCode.APPLY_OTHER_FAILED, "apply error");
            return;
        }
        int errorCode = ((WatchFaceOperateInfo) obj).getErrorCode();
        if (!isSuccessErrorCode(errorCode)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWatchFaceTransferSuccess apply error:", Integer.valueOf(errorCode));
            WatchFaceCallback.onCall(ProgressCode.APPLY_OTHER_FAILED, "install error");
            signFailedBiEvent(i, errorCode, str);
            return;
        }
        WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.APPLIED, str);
    }

    private void signFailedBiEvent(int i, int i2, String str) {
        if (isSignFailErrorCode(i2)) {
            mgu.d(i, "9", str);
        }
    }

    private void sendCustomConfigAndApplyWatchFace(String str, CustomConfig customConfig, final String str2, final String str3) {
        CustomConfigWatchFaceManager.getInstance().applyCustomConfig(str, customConfig, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1429xb0f153a7(str2, str3, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendCustomConfigAndApplyWatchFace$9$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-commonservice-WatchFaceWearService, reason: not valid java name */
    /* synthetic */ void m1429xb0f153a7(final String str, String str2, int i, Object obj) {
        displayWatchFace(str, str2, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj2) {
                WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.APPLIED, str);
            }
        });
    }

    private boolean isNeedApplyWatchFace(int i, String str) {
        if (i == 1) {
            return true;
        }
        return i == 4 && Objects.equals(getCurWatchFaceId(), str);
    }
}
