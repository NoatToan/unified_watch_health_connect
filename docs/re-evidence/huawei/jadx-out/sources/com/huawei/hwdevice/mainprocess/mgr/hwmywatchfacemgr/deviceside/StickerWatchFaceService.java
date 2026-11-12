package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.StickerWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransmitWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.StickerEventDTO;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import defpackage.eef;
import defpackage.eeg;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class StickerWatchFaceService implements DataReceiveCallback {
    private static final long CONFIG_REPORT_STICKER_WATCHFACE_ID = 900500033;
    public static final String STICKER_CONFIG_APP_PACKAGE_NAME = "hw.unitedevice.watchface";
    public static final String STICKER_CONFIG_DEVICE_PACKAGE_NAME = "hw.watch.watchface.sticker";
    private static final int SUCCEED_RESPONSE = 100000;
    private static final String TAG = "StickerWatchFaceService";
    private static final String TAG_RELEASE = "R_StickerWatchFaceService";
    private static final long WATCHFACE_STICKER_EVENT_ID = 800100016;
    private ResultCallback<List<StickerEventDTO.FileInfo>> mNeedTransferFileListener;
    private final List<ResultCallback<TransmitWatchFace<String>>> mStickerConfigListenerList;
    private final List<ResultCallback<StickerEventDTO>> mStickerUIReadyListenerList;

    static class SingletonHolder {
        private static final StickerWatchFaceService INSTANCE = new StickerWatchFaceService();

        private SingletonHolder() {
        }
    }

    private StickerWatchFaceService() {
        this.mStickerConfigListenerList = new ArrayList();
        this.mStickerUIReadyListenerList = new ArrayList();
    }

    public static StickerWatchFaceService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void registerDeviceSampleListener() {
        edc.e().registerDeviceSampleListener(STICKER_CONFIG_APP_PACKAGE_NAME, this);
    }

    public void registerNeedTransferFileListener(ResultCallback<List<StickerEventDTO.FileInfo>> resultCallback) {
        this.mNeedTransferFileListener = resultCallback;
    }

    public void unregisterNeedTransferFileListener() {
        this.mNeedTransferFileListener = null;
    }

    public void setStickerWatchFaceInfo(DeviceInfo deviceInfo, String str, ResultCallback<StickerEventDTO> resultCallback) {
        LogUtil.a(TAG, "setStickerWatchFaceInfo enter");
        synchronized (this.mStickerUIReadyListenerList) {
            this.mStickerUIReadyListenerList.add(resultCallback);
        }
        LogUtil.a(TAG, "setStickerWatchFaceInfo send");
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        eef eefVar = new eef();
        eefVar.setSrcPkgName(STICKER_CONFIG_APP_PACKAGE_NAME);
        eefVar.setWearPkgName(STICKER_CONFIG_DEVICE_PACKAGE_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(CONFIG_REPORT_STICKER_WATCHFACE_ID);
        eegVar.b(1);
        eegVar.d(bytes);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, TAG);
    }

    public void setStickerWatchFaceInfo(DeviceInfo deviceInfo, StickerWatchFaceInfo stickerWatchFaceInfo, ResultCallback<StickerEventDTO> resultCallback) {
        LogUtil.a(TAG, "setStickerWatchFaceInfo enter");
        synchronized (this.mStickerUIReadyListenerList) {
            this.mStickerUIReadyListenerList.add(resultCallback);
        }
        String strDumps = StickerWatchFaceInfo.dumps(stickerWatchFaceInfo);
        LogUtil.a(TAG, "setStickerWatchFaceInfo json:", strDumps);
        byte[] bytes = strDumps.getBytes(StandardCharsets.UTF_8);
        eef eefVar = new eef();
        eefVar.setSrcPkgName(STICKER_CONFIG_APP_PACKAGE_NAME);
        eefVar.setWearPkgName(STICKER_CONFIG_DEVICE_PACKAGE_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(CONFIG_REPORT_STICKER_WATCHFACE_ID);
        eegVar.b(1);
        eegVar.d(bytes);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, TAG);
    }

    public void getStickerConfig(DeviceInfo deviceInfo, ResultCallback<TransmitWatchFace<String>> resultCallback) {
        LogUtil.a(TAG, "getStickerConfig enter");
        synchronized (this.mStickerConfigListenerList) {
            this.mStickerConfigListenerList.add(resultCallback);
        }
        eee eeeVar = new eee();
        eeeVar.a(WATCHFACE_STICKER_EVENT_ID);
        eeeVar.a(0);
        eeeVar.setSrcPkgName(STICKER_CONFIG_APP_PACKAGE_NAME);
        eeeVar.setWearPkgName(STICKER_CONFIG_DEVICE_PACKAGE_NAME);
        StickerEventDTO stickerEventDTO = new StickerEventDTO();
        stickerEventDTO.setRequest(0);
        eeeVar.e(StickerEventDTO.dumps(stickerEventDTO).getBytes(StandardCharsets.UTF_8));
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, TAG);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a(TAG, "onDataReceived enter");
        if (i != 100000) {
            ReleaseLogUtil.a(TAG_RELEASE, "onDataReceived error: ", Integer.valueOf(i));
            return;
        }
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.a(TAG_RELEASE, "onDataReceived error device or message is empty");
            return;
        }
        String srcPkgName = eecVar.getSrcPkgName();
        String wearPkgName = eecVar.getWearPkgName();
        if (!isCheckPkgName(srcPkgName, wearPkgName)) {
            ReleaseLogUtil.e(TAG_RELEASE, "channel onDataReceived pkg error. srcPkgNam: ", srcPkgName, ", wearPkgName:", wearPkgName);
            return;
        }
        LogUtil.a(TAG, "onDataReceived dispatch sample");
        if (eecVar instanceof eef) {
            handleSampleConfig(deviceInfo, (eef) eecVar);
        } else if (eecVar instanceof eee) {
            handleSampleEvent(deviceInfo, (eee) eecVar);
        } else {
            ReleaseLogUtil.e(TAG, "onDataReceived unsupported sample type");
        }
    }

    private void handleSampleEvent(DeviceInfo deviceInfo, eee eeeVar) {
        LogUtil.a("handleSampleEvent enter", new Object[0]);
        if (!Objects.equals(Long.valueOf(eeeVar.d()), Long.valueOf(WATCHFACE_STICKER_EVENT_ID))) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleSampleEvent event id not supported:", Long.valueOf(eeeVar.d()));
            return;
        }
        StickerEventDTO stickerEventDTOLoads = StickerEventDTO.loads(new String(eeeVar.c(), StandardCharsets.UTF_8));
        List<StickerEventDTO.FileInfo> fileInfo = stickerEventDTOLoads.getFileInfo();
        if (fileInfo != null) {
            LogUtil.a(TAG, "handleSampleEvent need transfer file");
            ResultCallback<List<StickerEventDTO.FileInfo>> resultCallback = this.mNeedTransferFileListener;
            if (resultCallback == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "handleSampleEvent transfer listener not set");
                return;
            } else {
                resultCallback.onSuccess(fileInfo);
                this.mNeedTransferFileListener = null;
                return;
            }
        }
        if (stickerEventDTOLoads.getResult() != null) {
            LogUtil.a(TAG, "handleSampleEvent set sticker success");
            synchronized (this.mStickerUIReadyListenerList) {
                if (CollectionUtils.a(this.mStickerUIReadyListenerList)) {
                    ReleaseLogUtil.e(TAG_RELEASE, "handleSampleEvent callback error");
                    return;
                }
                List<ResultCallback<StickerEventDTO>> list = this.mStickerUIReadyListenerList;
                list.get(list.size() - 1).onSuccess(stickerEventDTOLoads);
                List<ResultCallback<StickerEventDTO>> list2 = this.mStickerUIReadyListenerList;
                list2.remove(list2.size() - 1);
                return;
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "handleSampleEvent unsupported event data");
    }

    private void handleSampleConfig(DeviceInfo deviceInfo, eef eefVar) {
        LogUtil.a(TAG, "handleSampleConfig enter config:", eefVar);
        if (CollectionUtils.a(eefVar.getConfigInfoList())) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleSampleConfig config info list is empty");
            return;
        }
        eeg eegVar = eefVar.getConfigInfoList().get(0);
        long jC = eegVar.c();
        if (!Objects.equals(Long.valueOf(CONFIG_REPORT_STICKER_WATCHFACE_ID), Long.valueOf(jC))) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleSampleConfig bed config id:", Long.valueOf(jC));
            return;
        }
        String str = new String(eegVar.e(), StandardCharsets.UTF_8);
        LogUtil.a(TAG, "handleSampleConfig sticker json:", str);
        synchronized (this.mStickerConfigListenerList) {
            if (CollectionUtils.a(this.mStickerConfigListenerList)) {
                ReleaseLogUtil.e(TAG_RELEASE, "handleSampleConfig callback error");
                return;
            }
            List<ResultCallback<TransmitWatchFace<String>>> list = this.mStickerConfigListenerList;
            ResultCallback<TransmitWatchFace<String>> resultCallback = list.get(list.size() - 1);
            TransmitWatchFace<String> transmitWatchFace = new TransmitWatchFace<>();
            transmitWatchFace.setWatchFaceInfo(str);
            transmitWatchFace.setResultCode(0);
            resultCallback.onSuccess(transmitWatchFace);
            List<ResultCallback<TransmitWatchFace<String>>> list2 = this.mStickerConfigListenerList;
            list2.remove(list2.size() - 1);
        }
    }

    private boolean isCheckPkgName(String str, String str2) {
        return STICKER_CONFIG_DEVICE_PACKAGE_NAME.equals(str) && STICKER_CONFIG_APP_PACKAGE_NAME.equals(str2);
    }
}
