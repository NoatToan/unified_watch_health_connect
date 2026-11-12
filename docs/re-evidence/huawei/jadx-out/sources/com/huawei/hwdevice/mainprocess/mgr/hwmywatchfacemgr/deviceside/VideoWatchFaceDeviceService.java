package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.VideoStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceVideoInfo;
import defpackage.cpy;
import defpackage.cqj;
import defpackage.cql;
import defpackage.lvb;
import defpackage.lvg;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class VideoWatchFaceDeviceService implements BluetoothDataReceiveCallback {
    private static final int CALLBACK_TYPE_FAILED = 102;
    private static final int CALLBACK_TYPE_SUCCESS = 101;
    private static final int CALLBACK_WATCH_FACE_VIDEO_TRANSFER_NUM = 111;
    private static final int COMMAND_ID_SET_VIDEO_WATCH_FACE = 16;
    private static final int COMMAND_ID_WATCH_FACE_GET_VIDEO_INFO = 15;
    private static final int CONTAINER_INDEX = 23;
    private static final int DATA_LIST = 21;
    private static final int DATA_STRUCT = 22;
    private static final int DEFAULT_ERROR_INT = -1;
    private static final int ERROR_CODE = 127;
    private static final int ERROR_CODE_SUCCESS = 100000;
    private static final int OPTION_INDEX = 24;
    private static final int POSITION_INDEX = 10;
    private static final int SET_WRIST_SWITCH_VALUE = 15;
    private static final int STYLE_INDEX = 11;
    public static final String TAG = "WatchFaceVideoManagerService";
    private static final String TAG_RELEASE = "R_WatchFaceVideoManagerService";
    private static final int TIME_COLOR_VALUE = 19;
    private static final int TIME_FONT_INDEX_VALUE = 17;
    private static final int TIME_POSITION_INDEX_VALUE = 20;
    private static final int TIME_SIZE_INDEX_VALUE = 18;
    private static final int TIME_STYLE_INDEX_VALUE = 16;
    private static final int TRANSFER_VIDEO_NUM = 14;
    private static final int VALUE_TYPE_INDEX = 12;
    private static final int VIDEO_ATTRIBUTE_VALUE = 7;
    private static final int VIDEO_INDEX_VALUE = 5;
    private static final int VIDEO_LIST_TYPE = 3;
    private static final int VIDEO_NAME_VALUE = 6;
    private static final int VIDEO_NUM = 1;
    private static final int VIDEO_PREVIEW_NAME_VALUE = 8;
    private static final int VIDEO_STATUS_VALUE = 9;
    private static final int VIDEO_STRUCT_TYPE = 4;
    private static final int VIDEO_TYPE = 2;
    private static final int WRIST_SWITCH_VALUE = 13;
    private static Map<Integer, List<IBaseResponseCallback>> sCommandCallbacks = new HashMap(16);
    private lvb mDeviceConfigManager;
    private int mPresetVideoSize;

    private VideoWatchFaceDeviceService() {
        this.mPresetVideoSize = 0;
        this.mDeviceConfigManager = lvb.e();
        lvg.e().d(TAG, this);
    }

    static class SingletonHolder {
        private static final VideoWatchFaceDeviceService INSTANCE = new VideoWatchFaceDeviceService();

        private SingletonHolder() {
        }
    }

    public static VideoWatchFaceDeviceService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e(TAG_RELEASE, "onDataReceived data illegal");
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "onDataReceived data is :", bArr, " commands id :", Byte.valueOf(bArr[1]));
        byte b2 = bArr[1];
        if (b2 == 15) {
            handleVideoInfo(bArr);
        } else if (b2 == 16) {
            handleVideoStatus(bArr);
        } else {
            LogUtil.e(TAG, "onDataReceived nothing to do");
        }
    }

    private static Object getCommandCallbackCallbackList() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (VideoWatchFaceDeviceService.class) {
            map = sCommandCallbacks;
        }
        return map;
    }

    private void handleVideoInfo(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleVideoInfo data is error");
            return;
        }
        WatchFaceVideoInfo watchFaceVideoInfo = new WatchFaceVideoInfo();
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            watchFaceVideoInfo.setVideoType(cVarA.d((byte) 2, -1));
            watchFaceVideoInfo.setPositionIndex(cVarA.d((byte) 10, -1));
            watchFaceVideoInfo.setStyleIndex(cVarA.d((byte) 11, -1));
            watchFaceVideoInfo.setDataIndex(cVarA.d((byte) 12, -1));
            watchFaceVideoInfo.setWristSwitch(cVarA.d((byte) 13, -1));
            List<cql.c> listB = cVarA.b((byte) 3);
            ArrayList<VideoStruct> arrayListHandleVideoStruct = handleVideoStruct(listB);
            watchFaceVideoInfo.setDataList(handleVideoCustom(cVarA.b(Ascii.NAK)));
            watchFaceVideoInfo.setVideoList(arrayListHandleVideoStruct);
            if (CollectionUtils.a(listB)) {
                watchFaceVideoInfo.setMaxVideoNum(1);
                LogUtil.b(TAG, "handleVideoInfo setMaxVideoNum  is 1");
            } else {
                int size = listB.size();
                if (size > this.mPresetVideoSize) {
                    watchFaceVideoInfo.setMaxVideoNum(size);
                } else {
                    watchFaceVideoInfo.setMaxVideoNum(size + 1);
                }
                LogUtil.b(TAG, "handleVideoInfo setMaxVideoNum mPresetVideoSize is ", Integer.valueOf(this.mPresetVideoSize), ", videoNum is ", Integer.valueOf(size));
            }
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleVideoInfo error:", ExceptionUtils.c(e));
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(15);
            if (list != null && !list.isEmpty()) {
                list.get(list.size() - 1).a(101, watchFaceVideoInfo);
                sCommandCallbacks.remove(15);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleVideoInfo callback error");
            }
        }
    }

    private ArrayList<VideoStruct> handleVideoStruct(List<cql.c> list) {
        ArrayList<VideoStruct> arrayList = new ArrayList<>(16);
        LogUtil.b(TAG, "enter handleVideoStruct");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleVideoStruct backgroundTlvList is empty");
            return arrayList;
        }
        for (cql.c cVar : list) {
            VideoStruct videoStruct = new VideoStruct();
            videoStruct.setVideoIndex(cVar.d((byte) 5, -1));
            videoStruct.setVideoName(cVar.e((byte) 6, ""));
            videoStruct.setVideoAttribute(cVar.d((byte) 7, -1));
            videoStruct.setVideoPreviewName(cVar.e((byte) 8, ""));
            videoStruct.setVideoStatus(cVar.d((byte) 9, -1));
            videoStruct.setTimeStyleIndex(cVar.d((byte) 16, -1));
            videoStruct.setTimeFontIndex(cVar.d((byte) 17, -1));
            videoStruct.setTimeSizeIndex(cVar.d((byte) 18, -1));
            videoStruct.setTimeColor(cVar.e((byte) 19, ""));
            videoStruct.setTimePositionIndex(cVar.d(Ascii.DC4, -1));
            arrayList.add(videoStruct);
        }
        LogUtil.b(TAG, "handleVideoStruct structList size is ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private ArrayList<WatchFaceVideoInfo.WatchFaceVideoCustom> handleVideoCustom(List<cql.c> list) {
        ArrayList<WatchFaceVideoInfo.WatchFaceVideoCustom> arrayList = new ArrayList<>(16);
        LogUtil.b(TAG, "enter handleVideoCustom");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleVideoInfo handleVideoCustom dataList is empty");
            return arrayList;
        }
        for (cql.c cVar : list) {
            WatchFaceVideoInfo.WatchFaceVideoCustom watchFaceVideoCustom = new WatchFaceVideoInfo.WatchFaceVideoCustom();
            watchFaceVideoCustom.setContainerIndex(cVar.d(Ascii.ETB, -1));
            watchFaceVideoCustom.setOptionIndex(cVar.d(Ascii.CAN, -1));
            arrayList.add(watchFaceVideoCustom);
        }
        LogUtil.b(TAG, "handleVideoCustom watchFaceVideoCustoms size is ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void handleVideoStatus(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleVideoStatus data is error");
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            int iD = cVarA.d((byte) 14, -1);
            int iD2 = cVarA.d(Ascii.DEL, -1);
            ReleaseLogUtil.e(TAG_RELEASE, "handleVideoStatus errorCode is ", Integer.valueOf(iD2));
            synchronized (getCommandCallbackCallbackList()) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(16);
                if (CollectionUtils.a(list)) {
                    ReleaseLogUtil.e(TAG_RELEASE, "handleVideoStatus callback error");
                    return;
                }
                if (iD2 == 100000 && iD == 0) {
                    list.get(list.size() - 1).a(101, 0);
                } else if (iD2 == 100000 && iD > 0) {
                    ReleaseLogUtil.d(TAG_RELEASE, "handleVideoStatus need transfer num:", Integer.valueOf(iD));
                    list.get(list.size() - 1).a(111, Integer.valueOf(iD));
                } else {
                    ReleaseLogUtil.d(TAG_RELEASE, "handleVideoStatus errorCode is failed");
                    list.get(list.size() - 1).a(102, null);
                }
                list.remove(list.size() - 1);
            }
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleVideoStatus error:", ExceptionUtils.c(e));
        }
    }

    public void getWatchFaceVideoInfo(IBaseResponseCallback iBaseResponseCallback, int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter getWatchFaceVideoInfo");
        this.mPresetVideoSize = i;
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(15);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter getWatchFaceVideoInfo have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(15, arrayList);
                } else {
                    LogUtil.b(TAG, "enter getWatchFaceVideoInfo have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        getWatchFaceVideoInfoCommand();
    }

    public void getWatchFaceVideoInfoCommand() {
        cqj cqjVar = new cqj();
        cqjVar.g(1, 0);
        cqjVar.g(2, 0);
        cqjVar.g(3, 0);
        cqjVar.g(10, 0);
        cqjVar.g(11, 0);
        cqjVar.g(12, 0);
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(15);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.b(TAG, "getWatchFaceVideoInfoCommand, deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public void sendWatchVideoInfoToDevice(WatchFaceVideoInfo watchFaceVideoInfo, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.b(TAG_RELEASE, "enter sendWatchVideoInfoToDevice");
        if (watchFaceVideoInfo == null) {
            iBaseResponseCallback.a(102, "");
            ReleaseLogUtil.e(TAG_RELEASE, "sendWatchVideoInfoToDevice error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(16);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter sendWatchVideoInfoToDevice have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(16, arrayList);
                } else {
                    LogUtil.b(TAG, "enter sendWatchVideoInfoToDevice have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        sendWatchVideoInfoCommand(watchFaceVideoInfo);
    }

    public void sendWatchVideoInfoCommand(WatchFaceVideoInfo watchFaceVideoInfo) {
        LogUtil.b(TAG, "sendWatchVideoInfoCommand entry");
        if (watchFaceVideoInfo == null) {
            LogUtil.b(TAG, "sendWatchVideoInfoCommand, watchFaceVideoInfo is null");
            return;
        }
        cqj cqjVar = new cqj();
        ArrayList<VideoStruct> videoList = watchFaceVideoInfo.getVideoList();
        if (!CollectionUtils.a(videoList)) {
            combineVideoStructListCommand(cqjVar, videoList);
        }
        cqjVar.g(1, CollectionUtils.a(videoList) ? 0 : videoList.size());
        cqjVar.g(2, watchFaceVideoInfo.getVideoType());
        cqjVar.g(10, watchFaceVideoInfo.getPositionIndex());
        cqjVar.g(11, watchFaceVideoInfo.getStyleIndex());
        cqjVar.g(12, watchFaceVideoInfo.getDataIndex());
        cqjVar.g(15, watchFaceVideoInfo.getWristSwitch());
        ArrayList<WatchFaceVideoInfo.WatchFaceVideoCustom> dataList = watchFaceVideoInfo.getDataList();
        if (!CollectionUtils.a(dataList)) {
            cqjVar.a(21);
            for (WatchFaceVideoInfo.WatchFaceVideoCustom watchFaceVideoCustom : dataList) {
                cqjVar.d(22);
                cqjVar.c(23, watchFaceVideoCustom.getContainerIndex());
                cqjVar.c(24, watchFaceVideoCustom.getOptionIndex());
                cqjVar.b(cqjVar.b());
            }
            cqjVar.a(cqjVar.d());
        }
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(16);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        lvb.e().c(deviceCommand);
        LogUtil.b(TAG, "sendWatchVideoInfoCommand, deviceCommand:", deviceCommand.toString());
    }

    private static void combineVideoStructListCommand(cqj cqjVar, List<VideoStruct> list) {
        cqjVar.a(3);
        for (VideoStruct videoStruct : list) {
            if (TextUtils.isEmpty(videoStruct.getVideoName())) {
                LogUtil.b(TAG, "sendWatchVideoInfoCommand VideoName is empty, continue");
            } else {
                cqjVar.d(4);
                cqjVar.c(5, videoStruct.getVideoIndex());
                cqjVar.e(6, videoStruct.getVideoName());
                cqjVar.c(7, videoStruct.getVideoAttribute());
                cqjVar.e(8, "");
                cqjVar.c(9, videoStruct.getVideoStatus());
                cqjVar.c(16, videoStruct.getTimeStyleIndex());
                cqjVar.c(17, videoStruct.getTimeFontIndex());
                cqjVar.c(18, videoStruct.getTimeSizeIndex());
                cqjVar.e(19, videoStruct.getTimeColor());
                cqjVar.c(20, videoStruct.getTimePositionIndex());
                cqjVar.b(cqjVar.b());
            }
        }
        cqjVar.a(cqjVar.d());
    }
}
