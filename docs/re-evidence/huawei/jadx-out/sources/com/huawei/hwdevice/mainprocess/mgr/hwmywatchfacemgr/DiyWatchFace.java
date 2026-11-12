package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.WatchFaceDeviceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransmitWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import defpackage.ecu;
import defpackage.lvb;
import defpackage.mhp;
import defpackage.nio;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DiyWatchFace<T> {
    private static final String TAG = "DiyWatchFaceBaseManager";
    private static final String TAG_RELEASE = "DEVMGR_DiyWatchFaceBaseManager";
    protected String mBackgroundDir;
    protected int mDeviceHeight;
    protected int mDeviceWidth;
    protected String mMyWatchFaceBackgroundDir;
    protected String mMyWatchFaceRootDir;
    protected String mWatchFaceRootDir;
    protected int mTransferTotalCount = 0;
    protected int mTransferCompleteCount = 0;
    protected int mCurrentTransferPercent = 0;
    protected int mFileTransferPerBackground = 1;
    private ExtendHandler mHandler = null;
    protected IAppTransferFileResultAIDLCallback mIAppTransferFileResultAIDLCallback = new IAppTransferFileResultAIDLCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace.1
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            LogUtil.a(DiyWatchFace.TAG, "mIAppTransferFileResultAIDLCallback onFileTransferState() percentage :", Integer.valueOf(i));
            if (DiyWatchFace.this.devicesCallbackFileInfoCheckFail(str)) {
                ReleaseLogUtil.e(DiyWatchFace.TAG_RELEASE, "mIAppTransferFileResultAIDLCallback onFileTransferState() check ", ParamConstants.CallbackMethod.ON_FAIL);
            } else if (i < DiyWatchFace.this.mCurrentTransferPercent) {
                ReleaseLogUtil.e(DiyWatchFace.TAG_RELEASE, "mIAppTransferFileResultAIDLCallback onFileTransferState() percentage: ", Integer.valueOf(i), " error");
            } else {
                DiyWatchFace.this.mCurrentTransferPercent = i;
                DiyWatchFace.this.callbackProgress();
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            ReleaseLogUtil.d(DiyWatchFace.TAG_RELEASE, "mIAppTransferFileResultAIDLCallback onUpgradeFailed() errorCode: ", Integer.valueOf(i));
            if (!DiyWatchFace.this.devicesCallbackFileInfoCheckFail(str)) {
                DiyWatchFace.this.sendFileFailCallback(i);
            } else {
                ReleaseLogUtil.e(DiyWatchFace.TAG_RELEASE, "mIAppTransferFileResultAIDLCallback onUpgradeFailed() check fail");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            ReleaseLogUtil.d(DiyWatchFace.TAG_RELEASE, "IPhotoFileCallback onSuccess() checkResult:", Integer.valueOf(i));
            if (DiyWatchFace.this.devicesCallbackFileInfoCheckFail(str)) {
                LogUtil.a(DiyWatchFace.TAG, "mIAppTransferFileResultAIDLCallback onFileRespond() check fail", str);
                return;
            }
            DiyWatchFace.this.mTransferCompleteCount++;
            DiyWatchFace.this.mCurrentTransferPercent = 0;
            DiyWatchFace.this.callbackProgress();
        }
    };

    protected abstract void deleteSaveWatchFace();

    protected abstract boolean devicesCallbackFileInfoCheckFail(String str);

    protected abstract List<Integer> getFileType();

    protected abstract void getNextFileByBt(int i);

    protected abstract ResultCallback<TransferProgressResp> getTransferCallback();

    protected abstract ResultCallback<TransmitWatchFace<T>> getTransmitWatchFaceCallback();

    protected abstract void notifyWatchFaceError(int i, String str);

    protected abstract void notifyWatchFaceReady();

    protected abstract void resetIsSync();

    protected abstract void saveFileFromDevice(String str, int i);

    protected abstract void sendWatchFaceInfoToDevice(String str, ResultCallback<TransferProgressResp> resultCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFileFailCallback(int i) {
        switch (i) {
            case 20000:
            case 140006:
                onSaveFailed(new DiyThrowable(10003, "save file not exist"));
                break;
            case 30004:
            case 141001:
                onSaveFailed(new DiyThrowable(10001, "device disconnect"));
                break;
            case 140009:
                ReleaseLogUtil.e(TAG_RELEASE, "sendFileFailCallback fail, save file watch device out of memory");
                onSaveFailed(new DiyThrowable(10006, "save file watch device out of memory"));
                break;
            case 141000:
                onSaveFailed(new DiyThrowable(10002, "save time out"));
                break;
            default:
                this.mTransferCompleteCount++;
                this.mCurrentTransferPercent = 0;
                callbackProgress();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackProgress() {
        int i = (this.mTransferCompleteCount / this.mFileTransferPerBackground) + 1;
        int i2 = this.mTransferTotalCount;
        if (i > i2) {
            i = i2;
        }
        int transferProgress = getTransferProgress();
        TransferProgressResp transferProgressResp = new TransferProgressResp();
        transferProgressResp.setResultCode(2);
        transferProgressResp.setTotalNum(this.mTransferTotalCount);
        transferProgressResp.setCurrentNum(i);
        transferProgressResp.setCurrentProgress(transferProgress);
        LogUtil.a(TAG, "callbackProgress mTransferTotalCount：", Integer.valueOf(this.mTransferTotalCount), ", currentNumber:", Integer.valueOf(i), ", progress:", Integer.valueOf(transferProgress));
        ResultCallback<TransferProgressResp> transferCallback = getTransferCallback();
        if (transferCallback != null) {
            transferCallback.onSuccess(transferProgressResp);
        }
        if (transferProgress >= 100) {
            registerTransferFileCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
            deleteSaveWatchFace();
        }
    }

    protected void notifyWatchFaceLoadingProgress() {
        ResultCallback<TransmitWatchFace<T>> transmitWatchFaceCallback = getTransmitWatchFaceCallback();
        if (transmitWatchFaceCallback == null) {
            return;
        }
        int transferProgress = getTransferProgress();
        TransmitWatchFace<T> transmitWatchFace = new TransmitWatchFace<>();
        transmitWatchFace.setResultCode(2);
        transmitWatchFace.setCurrentProgress(transferProgress);
        transmitWatchFaceCallback.onSuccess(transmitWatchFace);
    }

    private int getTransferProgress() {
        LogUtil.d(TAG, "getTransferProgress mTransferTotalCount:", Integer.valueOf(this.mTransferTotalCount), ", mTransferCompleteCount:", Integer.valueOf(this.mTransferCompleteCount), ", mCurrentTransferPercent:", Integer.valueOf(this.mCurrentTransferPercent));
        int i = this.mTransferTotalCount;
        if (i <= 0) {
            return 0;
        }
        double d = 100.0d / ((double) (i * this.mFileTransferPerBackground));
        int iCeil = (int) Math.ceil((((double) this.mTransferCompleteCount) * d) + ((((double) this.mCurrentTransferPercent) * d) / 100.0d));
        if (iCeil > 100) {
            return 100;
        }
        if (iCeil < 0) {
            return 0;
        }
        LogUtil.d(TAG, "progress value is normal");
        return iCeil;
    }

    protected DiyWatchFace(String str, boolean z) {
        try {
            this.mWatchFaceRootDir = BaseApplication.b().getFilesDir().getCanonicalPath() + str;
            String str2 = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "myWatchFace" + File.separator + str;
            this.mMyWatchFaceRootDir = str2;
            if (z) {
                this.mBackgroundDir = this.mWatchFaceRootDir;
                this.mMyWatchFaceBackgroundDir = str2;
                return;
            }
            this.mBackgroundDir = this.mWatchFaceRootDir + WatchFaceProvider.BACKGROUND_LABEL + File.separator;
            this.mMyWatchFaceBackgroundDir = this.mMyWatchFaceRootDir + WatchFaceProvider.BACKGROUND_LABEL + File.separator;
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "DiyWatchFaceBaseManager mWatchFaceRootDir IOException:", ExceptionUtils.c(e));
        }
    }

    protected void getWatchFaceBgFileFromDevice(int i, int i2, int i3, String str) {
        LogUtil.a(TAG, "getWatchFaceBgFileFromDevice TransferImagesFromDevice index: ", Integer.valueOf(i), ", size:", Integer.valueOf(i2), ", fileType:", Integer.valueOf(i3), ", fileName：", str);
        if (i2 < i) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWatchFaceBgFileFromDevice size and index is error");
            resetIsSync();
        } else if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWatchFaceBgFileFromDevice fileName is empty");
            resetIsSync();
        } else {
            startRequestWatchFaceFile(i, i2, i3, str);
        }
    }

    protected void initWatchFaceSize(final ResponseCallback<String> responseCallback) {
        int i;
        this.mDeviceWidth = WatchFaceDeviceService.getInstance().getDeviceWidth();
        int deviceHeight = WatchFaceDeviceService.getInstance().getDeviceHeight();
        this.mDeviceHeight = deviceHeight;
        if (deviceHeight == 0 || (i = this.mDeviceWidth) == 0) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
            if (deviceInfo == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "initWatchFaceSize currentDevice is null");
                this.mDeviceWidth = 466;
                this.mDeviceHeight = 466;
                responseCallback.onResponse(0, null);
                return;
            }
            WatchFaceManager.getInstance().queryWatchFaceInfo(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.f$0.m1411x3bdeaac(responseCallback, i2, (WatchFaceParamsResult) obj);
                }
            });
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "initWatchFaceSize is right mDeviceHeight:", Integer.valueOf(deviceHeight), ", mDeviceWidth:", Integer.valueOf(i));
        responseCallback.onResponse(0, null);
    }

    /* JADX INFO: renamed from: lambda$initWatchFaceSize$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-DiyWatchFace, reason: not valid java name */
    /* synthetic */ void m1411x3bdeaac(ResponseCallback responseCallback, int i, WatchFaceParamsResult watchFaceParamsResult) {
        this.mDeviceWidth = watchFaceParamsResult.getScreenWidth();
        int screenHeight = watchFaceParamsResult.getScreenHeight();
        this.mDeviceHeight = screenHeight;
        ReleaseLogUtil.d(TAG_RELEASE, "initWatchFaceSize queryWatchFaceInfo DeviceWidth:", Integer.valueOf(this.mDeviceWidth), ",mDeviceHeight:", Integer.valueOf(screenHeight));
        responseCallback.onResponse(0, null);
    }

    private void startRequestWatchFaceFile(final int i, final int i2, int i3, String str) {
        mhp mhpVar = new mhp();
        mhpVar.a(str);
        mhpVar.c(i3);
        mhpVar.e(false);
        mhpVar.c((int[]) null);
        mhpVar.d(null);
        lvb.e().e(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace.2
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i4, String str2, String str3) throws RemoteException {
                LogUtil.a(DiyWatchFace.TAG, "getWatchFaceBgFileFromDevice onSuccess transferDataContent:", str2);
                DiyWatchFace.this.saveFileFromDevice(str2, i);
                DiyWatchFace.this.getNextFile(i, i2);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i4, String str2) throws RemoteException {
                ReleaseLogUtil.e(DiyWatchFace.TAG_RELEASE, "getWatchFaceBgFileFromDevice onFailure errorCode:", Integer.valueOf(i4));
                DiyWatchFace.this.getNextFile(i, i2);
                DiyWatchFace.this.processFailure(i4);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i4, String str2) throws RemoteException {
                LogUtil.d(DiyWatchFace.TAG, "getWatchFaceBgFileFromDevice onProgress progress:", Integer.valueOf(i4));
                if (i4 <= DiyWatchFace.this.mCurrentTransferPercent || i4 - DiyWatchFace.this.mCurrentTransferPercent >= 10) {
                    return;
                }
                DiyWatchFace.this.mCurrentTransferPercent = i4;
                DiyWatchFace.this.notifyWatchFaceLoadingProgress();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getNextFile(int i, int i2) {
        int i3 = i + 1;
        if (i3 < i2) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWatchFaceBgFileFromDevice continue transfer next");
            this.mTransferCompleteCount++;
            this.mCurrentTransferPercent = 0;
            getNextFileByBt(i3);
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "getWatchFaceBgFileFromDevice transfer complete");
        this.mTransferCompleteCount = i2;
        this.mCurrentTransferPercent = 0;
        notifyWatchFaceReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processFailure(int i) {
        switch (i) {
            case 30004:
            case 141001:
                notifyWatchFaceError(10001, "processFailure disconnect");
                resetIsSync();
                break;
            case 140006:
                notifyWatchFaceError(10003, "processFailure file not exist");
                resetIsSync();
                break;
            case 141000:
                notifyWatchFaceError(10002, "processFailure time out");
                resetIsSync();
                break;
            default:
                LogUtil.j(TAG, "processFailure other error:", Integer.valueOf(i));
                break;
        }
        if (this.mTransferCompleteCount >= this.mTransferTotalCount) {
            resetIsSync();
        }
    }

    protected void onSaveSuccess() {
        LogUtil.a(TAG, "enter onSaveSuccess");
        registerTransferFileCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
        TransferProgressResp transferProgressResp = new TransferProgressResp();
        transferProgressResp.setResultCode(0);
        ResultCallback<TransferProgressResp> transferCallback = getTransferCallback();
        if (transferCallback != null) {
            transferCallback.onSuccess(transferProgressResp);
        }
        deleteSaveWatchFace();
    }

    protected void onSaveToTransferBackgrounds(int i, int i2) {
        if (i2 > 0) {
            this.mTransferTotalCount = i / i2;
        } else {
            this.mTransferTotalCount = i;
        }
        this.mFileTransferPerBackground = i2;
        this.mTransferCompleteCount = 0;
    }

    protected void onSaveFailed(DiyThrowable diyThrowable) {
        LogUtil.a(TAG, "enter onSaveFailed");
        registerTransferFileCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
        ResultCallback<TransferProgressResp> transferCallback = getTransferCallback();
        if (transferCallback != null) {
            transferCallback.onFailure(diyThrowable);
        }
        deleteSaveWatchFace();
    }

    protected void registerTransferFileCallback(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, List<Integer> list, TransferFileReqType transferFileReqType) {
        mhp mhpVar = new mhp();
        mhpVar.e(transferFileReqType);
        mhpVar.b(list);
        lvb.e().b(TransferBusinessType.FIVE_FORTY, mhpVar, iAppTransferFileResultAIDLCallback);
    }

    protected void copyWatchFaceToTransferDir(String str) {
        try {
            FileUtils.e(new File(getDeviceBgFilePath() + str), new File(getBackgroundFilePath() + str));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "copyWatchFaceToTransferDir copy file IOException:", ExceptionUtils.c(e));
        }
    }

    protected String getDeviceBgFilePath() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getDeviceBgFilePath currentDevice is null");
            return "";
        }
        String strE = nio.e(deviceInfo.getDeviceIdentify());
        String strReplaceAll = strE.replaceAll("[^a-zA-Z0-9]", "");
        ReleaseLogUtil.d(TAG_RELEASE, "getDeviceBgFilePath encryptedDeviceId:", strE, ", replacedDeviceId:", strReplaceAll);
        return WatchFaceUtil.getFileDirPath(this.mMyWatchFaceBackgroundDir + strReplaceAll + File.separator);
    }

    protected String getBackgroundFilePath() {
        return WatchFaceUtil.getFileDirPath(this.mBackgroundDir);
    }

    protected void deleteDeviceBgFile(List<String> list) {
        WatchFaceUtil.deleteOrRetainBgFile(new File(getDeviceBgFilePath()), list, true);
    }

    protected void deleteSaveBgFile(List<String> list) {
        LogUtil.a(TAG, "deleteSaveBgFile :", Arrays.toString(list.toArray()));
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d(TAG_RELEASE, "deleteSaveBgFile list is empty");
        } else {
            WatchFaceUtil.deleteOrRetainBgFile(new File(this.mBackgroundDir), list, false);
        }
    }
}
