package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.StickerWatchFaceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.StickerWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransmitWatchFace;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.networkclient.ResultCallback;
import com.huawei.profile.utils.file.FileUtils;
import defpackage.ecu;
import defpackage.lvb;
import defpackage.mgg;
import defpackage.mhp;
import defpackage.nio;
import defpackage.xhd;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes38.dex */
public class StickerWatchFaceManager {
    private static final String BIN_STICKER_IMAGE_DIR = "bin";
    private static final String DES_CERT = "SystemApp";
    private static final String DES_PKGNAME = "hw.watch.watchface.sticker";
    private static final String DIY_STICKER_IMAGE_DIR = "diy";
    private static final String PRESET_STICKER_IMAGE_DIR = "preset";
    private static final String SRC_CERT = "UniteDeviceManagement";
    private static final String SRC_PKGNAME = "hw.unitedevice.watchface";
    private static final int STICKER_TYPE_PRESET = 1;
    private static final String TAG = "StickerWatchFaceManager";
    private static final String TAG_RELEASE = "DEVMGR_StickerWatchFaceManager";
    private final Object mGetStickerWatchFaceInfoLock;
    private ResultCallback<TransmitWatchFace<String>> mH5TransmitWatchFaceCallback;
    private volatile StickerConfigTask mStickerConfigTask;
    private String mStickerWatchFaceImageDir;
    private TransmitWatchFace<String> mTransmitWatchFace;

    private StickerWatchFaceManager() {
        this.mGetStickerWatchFaceInfoLock = new Object();
        try {
            this.mStickerWatchFaceImageDir = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "myWatchFace" + File.separator + "sticker" + File.separator;
        } catch (IOException e) {
            ReleaseLogUtil.e(TAG_RELEASE, "init StickerWatchFaceManager error:", ExceptionUtils.c(e));
        }
    }

    public String getStickerWatchFaceBinFilePath() {
        return WatchFaceUtil.getFileDirPath(getCurrentStickerBaseDir() + "bin" + File.separator);
    }

    public String getDIYStickerWatchFacePath() {
        return WatchFaceUtil.getFileDirPath(getCurrentStickerBaseDir() + DIY_STICKER_IMAGE_DIR + File.separator);
    }

    public String getPresetStickerWatchFacePath() {
        return WatchFaceUtil.getFileDirPath(getCurrentStickerBaseDir() + PRESET_STICKER_IMAGE_DIR + File.separator);
    }

    public String getCurrentStickerBaseDir() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getStickerDeviceDirName currentDevice is null");
            return "";
        }
        String strE = nio.e(deviceInfo.getDeviceIdentify());
        String strReplaceAll = strE.replaceAll("[^a-zA-Z0-9]", "");
        ReleaseLogUtil.d(TAG_RELEASE, "getStickerDeviceDirName encryptedDeviceId:", strE, ", replacedDeviceId:", strReplaceAll);
        return WatchFaceUtil.getFileDirPath(this.mStickerWatchFaceImageDir + strReplaceAll + File.separator);
    }

    public void setStickerWatchFaceInfo(String str, ResultCallback<TransferProgressResp> resultCallback) {
        LogUtil.a(TAG, "setStickerInfo enter");
        DeviceInfo deviceInfoD = mgg.d(TAG);
        if (deviceInfoD == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "setStickerInfo device is null");
            resultCallback.onFailure(new DiyThrowable(-1, "setStickerWatchFaceInfo fail"));
            return;
        }
        StickerWatchFaceInfo stickerWatchFaceInfoLoads = StickerWatchFaceInfo.loads(str);
        if (stickerWatchFaceInfoLoads == null) {
            resultCallback.onFailure(new DiyThrowable(-1, "setStickerWatchFaceInfo json error"));
            return;
        }
        if (!createBinImageList(stickerWatchFaceInfoLoads.getStickerTplInfo())) {
            resultCallback.onFailure(new DiyThrowable(-1, "setStickerWatchFaceInfo create bin file error"));
            return;
        }
        if (this.mStickerConfigTask != null && !this.mStickerConfigTask.isStop()) {
            this.mStickerConfigTask.stop();
        }
        StickerConfigTask stickerConfigTask = new StickerConfigTask(getStickerWatchFaceBinFilePath());
        this.mStickerConfigTask = stickerConfigTask;
        stickerConfigTask.start(deviceInfoD, str, resultCallback);
    }

    private boolean createBinImageList(List<StickerWatchFaceInfo.StickerTPLInfo> list) {
        LogUtil.a(TAG, "createBinImageList enter");
        if (CollectionUtils.a(list)) {
            LogUtil.j(TAG, "createBinImageList tpl info is empty");
            return true;
        }
        String dIYStickerWatchFacePath = getDIYStickerWatchFacePath();
        String presetStickerWatchFacePath = getPresetStickerWatchFacePath();
        for (StickerWatchFaceInfo.StickerTPLInfo stickerTPLInfo : list) {
            String customStickerName = stickerTPLInfo.getCustomResource().getCustomStickerName();
            String str = stickerTPLInfo.getTplType().intValue() == 1 ? presetStickerWatchFacePath + customStickerName : dIYStickerWatchFacePath + customStickerName;
            if (!createBinImage(str, getStickerWatchFaceBinFilePath() + customStickerName, stickerTPLInfo.getTplType().intValue())) {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                ReleaseLogUtil.e(TAG, "createBinImageList fail. image is error:", str);
                return false;
            }
        }
        return true;
    }

    private boolean createBinImage(String str, String str2, int i) {
        LogUtil.a(TAG, "createBinImage enter");
        if (!FileUtils.fileExists(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "createBinImage file not exist:", str);
            return false;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "createBinImage sourcePathFile length is:", Long.valueOf(new File(str).length()));
        LogUtil.a(TAG, "createBinImage start");
        if (!DiyWatchFaceBitmapUtils.createBinFile(str, str2, 3)) {
            return false;
        }
        File file = new File(str2);
        if (file.exists()) {
            ReleaseLogUtil.d(TAG_RELEASE, "createBinImage destPathFile length is:", Long.valueOf(file.length()));
            return true;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "createBinImage create bin file fail", Long.valueOf(file.length()));
        return false;
    }

    public void getStickerWatchFaceInfo(String str, ResultCallback<TransmitWatchFace<String>> resultCallback) {
        LogUtil.a(TAG, "getStickerWatchFaceInfo enter");
        DeviceInfo deviceInfoD = mgg.d(TAG);
        if (deviceInfoD == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getStickerWatchFaceInfo device is null");
            resultCallback.onFailure(new DiyThrowable(-1, "getStickerWatchFaceInfo fail"));
            return;
        }
        if (!Objects.equals(deviceInfoD.getDeviceIdentify(), str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getStickerWatchFaceInfo device id changed");
            resultCallback.onFailure(new DiyThrowable(-1, "getStickerWatchFaceInfo fail"));
            return;
        }
        synchronized (this.mGetStickerWatchFaceInfoLock) {
            this.mH5TransmitWatchFaceCallback = resultCallback;
            TransmitWatchFace<String> transmitWatchFace = this.mTransmitWatchFace;
            if (transmitWatchFace != null && transmitWatchFace.getResultCode() == 2) {
                this.mH5TransmitWatchFaceCallback.onSuccess(this.mTransmitWatchFace);
            } else {
                StickerWatchFaceService.getInstance().getStickerConfig(deviceInfoD, new ResultCallback<TransmitWatchFace<String>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerWatchFaceManager.1
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(TransmitWatchFace<String> transmitWatchFace2) {
                        List appNotExistFileList = StickerWatchFaceManager.this.getAppNotExistFileList(transmitWatchFace2.getWatchFaceInfo());
                        if (CollectionUtils.a(appNotExistFileList)) {
                            synchronized (StickerWatchFaceManager.this.mGetStickerWatchFaceInfoLock) {
                                StickerWatchFaceManager.this.mTransmitWatchFace = transmitWatchFace2;
                                StickerWatchFaceManager.this.mH5TransmitWatchFaceCallback.onSuccess(transmitWatchFace2);
                            }
                            return;
                        }
                        ReleaseLogUtil.d(StickerWatchFaceManager.TAG_RELEASE, "getStickerWatchFaceInfo request file count:", Integer.valueOf(appNotExistFileList.size()));
                        StickerWatchFaceManager.this.requestDeviceFileList(appNotExistFileList, 0, transmitWatchFace2);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        ReleaseLogUtil.e(StickerWatchFaceManager.TAG_RELEASE, "getStickerWatchFaceInfo fail");
                        synchronized (StickerWatchFaceManager.this.mGetStickerWatchFaceInfoLock) {
                            StickerWatchFaceManager.this.mTransmitWatchFace = null;
                            StickerWatchFaceManager.this.mH5TransmitWatchFaceCallback.onFailure(th);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestDeviceFileList(final List<String> list, final int i, final TransmitWatchFace<String> transmitWatchFace) {
        if (list.size() <= i) {
            synchronized (this.mGetStickerWatchFaceInfoLock) {
                this.mTransmitWatchFace = transmitWatchFace;
                this.mH5TransmitWatchFaceCallback.onSuccess(transmitWatchFace);
            }
            return;
        }
        final int size = list.size();
        final String str = list.get(i);
        LogUtil.a(TAG, "requestDeviceFileList name:", str, ", index:", Integer.valueOf(i));
        mhp mhpVar = new mhp();
        mhpVar.a(str);
        mhpVar.c(10);
        mhpVar.e(true);
        mhpVar.d(null);
        mhpVar.f("hw.unitedevice.watchface");
        mhpVar.i(SRC_CERT);
        mhpVar.c("hw.watch.watchface.sticker");
        mhpVar.e("SystemApp");
        lvb.e().e(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerWatchFaceManager.2
            private int mLastProgress = 0;

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i2, String str2, String str3) throws Throwable {
                LogUtil.a(StickerWatchFaceManager.TAG, "getWatchFaceBgFileFromDevice onSuccess transferDataContent:", str2);
                StickerWatchFaceManager.this.saveFileFromDevice(str2);
                StickerWatchFaceManager.this.requestDeviceFileList(list, i + 1, transmitWatchFace);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i2, String str2) {
                ReleaseLogUtil.e(StickerWatchFaceManager.TAG_RELEASE, "requestDeviceFileList onFailure errorCode:", Integer.valueOf(i2));
                StickerWatchFaceManager.this.requestDeviceFileList(list, i + 1, transmitWatchFace);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i2, String str2) {
                if (i2 == this.mLastProgress) {
                    return;
                }
                if (i2 % 5 == 0) {
                    LogUtil.a(StickerWatchFaceManager.TAG, "transferFileListToDevice onFileTransferState, progress: ", Integer.valueOf(i2), " fileName: ", str);
                }
                this.mLastProgress = i2;
                TransmitWatchFace transmitWatchFace2 = new TransmitWatchFace();
                transmitWatchFace2.setResultCode(2);
                transmitWatchFace2.setCurrentProgress(StickerWatchFaceManager.this.calculateProgress(size, i, i2));
                synchronized (StickerWatchFaceManager.this.mGetStickerWatchFaceInfoLock) {
                    StickerWatchFaceManager.this.mTransmitWatchFace = transmitWatchFace2;
                    StickerWatchFaceManager.this.mH5TransmitWatchFaceCallback.onSuccess(transmitWatchFace2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveFileFromDevice(String str) throws Throwable {
        LogUtil.a(TAG, "saveFileFromDevice ", str);
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveFileFromDevice() safePath is empty");
            return;
        }
        File file = new File(strC);
        String name = file.getName();
        LogUtil.a(TAG, "saveFileFromDevice() fileName :", name, ",length:", Long.valueOf(file.length()));
        if (name.contains(".")) {
            name = name.substring(0, name.lastIndexOf("."));
        }
        xhd.b().b(strC, getDIYStickerWatchFacePath() + name + ".png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> getAppNotExistFileList(String str) {
        StickerWatchFaceInfo stickerWatchFaceInfoLoads = StickerWatchFaceInfo.loads(str);
        ArrayList arrayList = new ArrayList();
        if (stickerWatchFaceInfoLoads == null) {
            LogUtil.j(TAG, "getAppNotExistFileList stickerWatchFaceInfo is null");
            return arrayList;
        }
        List<StickerWatchFaceInfo.StickerTPLInfo> stickerTplInfo = stickerWatchFaceInfoLoads.getStickerTplInfo();
        ArrayList<String> arrayList2 = new ArrayList();
        for (StickerWatchFaceInfo.StickerTPLInfo stickerTPLInfo : stickerTplInfo) {
            if (stickerTPLInfo.getTplType().intValue() != 1) {
                StickerWatchFaceInfo.CustomResource customResource = stickerTPLInfo.getCustomResource();
                if (customResource == null) {
                    LogUtil.a(TAG, "getAppNotExistFileList customResource is empty");
                } else {
                    String customStickerName = customResource.getCustomStickerName();
                    if (TextUtils.isEmpty(customStickerName)) {
                        LogUtil.a(TAG, "getAppNotExistFileList customStickerName is empty");
                    } else {
                        arrayList2.add(customStickerName);
                    }
                }
            }
        }
        String strC = CommonUtil.c(getDIYStickerWatchFacePath());
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getAppNotExistFileList safePath is empty");
            return arrayList;
        }
        File file = new File(strC);
        String[] list = file.list();
        if (!file.exists() || CollectionUtils.d(list)) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(Arrays.asList(list));
        for (String str2 : arrayList2) {
            if (!arrayList3.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public int calculateProgress(int i, int i2, int i3) {
        if (i <= 0) {
            return 0;
        }
        double d = 100.0d / ((double) i);
        int iCeil = (int) Math.ceil((((double) i2) * d) + ((((double) i3) * d) / 100.0d));
        if (iCeil > 100) {
            return 100;
        }
        if (iCeil < 0) {
            return 0;
        }
        LogUtil.d(TAG, "progress value is normal");
        return iCeil;
    }

    public static StickerWatchFaceManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    static class SingletonHolder {
        private static final StickerWatchFaceManager INSTANCE = new StickerWatchFaceManager();

        private SingletonHolder() {
        }
    }
}
