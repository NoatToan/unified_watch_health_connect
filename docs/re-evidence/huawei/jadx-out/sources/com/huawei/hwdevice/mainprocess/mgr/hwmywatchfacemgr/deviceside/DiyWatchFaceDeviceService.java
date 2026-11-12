package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside;

import com.google.common.base.Ascii;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.AlbumWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.KaleidoscopeWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WearWatchFaceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cpy;
import defpackage.cqj;
import defpackage.cql;
import defpackage.lvb;
import defpackage.lvg;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class DiyWatchFaceDeviceService implements BluetoothDataReceiveCallback {
    private static final int BACKGROUND_COLOR_TYPE = 16;
    private static final int BACKGROUND_IMAGE_INDEX = 4;
    private static final int BACKGROUND_IMAGE_LIST = 2;
    private static final int BACKGROUND_IMAGE_NAME = 5;
    private static final int BACKGROUND_IMAGE_NUM = 1;
    private static final int BACKGROUND_IMAGE_OPTION = 11;
    private static final int BACKGROUND_IMAGE_STRUCT = 3;
    private static final int BACKGROUND_IMAGE_TYPE = 3;
    private static final int BACKGROUND_INDEX = 6;
    private static final int BACKGROUND_LIST = 4;
    private static final int BACKGROUND_NAME = 7;
    private static final int CALLBACK_TYPE_FAILED = 102;
    private static final int CALLBACK_TYPE_SUCCESS = 101;
    private static final int CALLBACK_WATCH_FACE_PHOTO_TRANSFER_NUM = 111;
    private static final int CAN_INTELLECT_COLOR = 2;
    private static final int CAROUSEL_MODE_TYPE = 23;
    private static final int COMMAND_ID_GET_KALEIDOSCOPE_WATCH_FACE = 17;
    private static final int COMMAND_ID_GET_WEAR_WATCH_FACE = 19;
    private static final int COMMAND_ID_SET_KALEIDOSCOPE_WATCH_FACE = 18;
    private static final int COMMAND_ID_SET_WEAR_WATCH_FACE = 20;
    private static final int COMMAND_ID_WATCH_FACE_GET_PHOTO_INFO = 8;
    private static final int COMMAND_ID_WATCH_FACE_NOTIFY_DEVICE_RECEIVE = 9;
    private static final int CONTAINER_INDEX_TYPE = 21;
    private static final int DATA_LIST = 19;
    private static final int DEFAULT_ERROR_INT = -1;
    private static final int ERROR_CODE = 127;
    private static final int ERROR_CODE_SUCCESS = 100000;
    private static final int FONT_OPA_0x1E = 30;
    private static final int GAUSS_BLUR_RADIUS_0x1D = 29;
    private static final int GAUSS_COLOR_BRIGHTNESS_0x1C = 28;
    private static final int GAUSS_COLOR_SATURATION_0x1B = 27;
    private static final int GET_CLOCK_TYPE_CAPABILITY = 5;
    private static final int GET_CUR_STYLE_INDEX = 10;
    private static final int GET_KALEIDOSCOPE_CURRENT_MATERIAL_IMAGE_INDEX = 7;
    private static final int GET_KALEIDOSCOPE_HANDS_STYLE_INDEX = 8;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_INDEX = 5;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_LIST = 3;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_NAME = 6;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_STRUCT = 4;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_TYPE = 2;
    private static final int GET_KALEIDOSCOPE_MAX_MATERIAL_IMAGES = 1;
    private static final int GET_KALEIDOSCOPE_TYPE = 9;
    private static final int GET_MAX_STYLE_NUM = 1;
    private static final int GET_PREVIEW_NAME = 9;
    private static final int GET_TINT_CLOCK_OPTION = 12;
    private static final int GET_WEAR_IMAGE_OPTION = 11;
    private static final int GET_WEAR_IMAGE_RADIUS = 13;
    private static final int GET_WEAR_STYLE_ID = 8;
    private static final int GET_WEAR_STYLE_LIST = 6;
    private static final int GET_WEAR_STYLE_NUM = 2;
    private static final int GET_WEAR_STYLE_TYPE = 3;
    private static final int GET_WEAR_TYPE_CAPABILITY = 4;
    private static final int MAX_BACKGROUND_IMAGES = 1;
    private static final int NEED_TRANSFER_NUM = 8;
    private static final int OPTION_IDX_0x21 = 33;
    private static final int OPTION_INDEX_TYPE = 22;
    private static final int OPTION_SELECTED_LIST_0x1F = 31;
    private static final int OPTION_SELECTED_STRUCT_0x20 = 32;
    private static final int PORTRAIT_MODE_TYPE = 13;
    private static final int PORT_POSITION_INDEX_TYPE = 12;
    private static final int POSITION_INDEX = 8;
    private static final int POSITION_INDEX_VALUE = 6;
    private static final int SET_BACKGROUND_COLOR_TYPE = 14;
    private static final int SET_BG_IMAGE_NAME = 7;
    private static final int SET_CLOCK_STYLE_COLOR = 9;
    private static final int SET_CLOCK_STYLE_INDEX = 8;
    private static final int SET_CONTAINER_INDEX_TYPE = 19;
    private static final int SET_CUR_WEAR_IMAGE_INDEX = 10;
    private static final int SET_DATA_LIST_TYPE = 17;
    private static final int SET_DATA_STRUCT_TYPE = 18;
    private static final int SET_FONT_OPA_0x1B = 27;
    private static final int SET_GAUSS_BLUR_RADIUS_0x1A = 26;
    private static final int SET_GAUSS_COLOR_BRIGHTNESS_0x19 = 25;
    private static final int SET_GAUSS_COLOR_SATURATION_0x18 = 24;
    private static final int SET_IS_USE_GAUSS_COLOR_0x1C = 28;
    private static final int SET_KALEIDOSCOPE_CURRENT_MATERIAL_IMAGE_INDEX = 6;
    private static final int SET_KALEIDOSCOPE_HANDS_STYLE_INDEX = 7;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_INDEX = 4;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_LIST = 2;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_NAME = 5;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_NUM = 1;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_STRUCT = 3;
    private static final int SET_KALEIDOSCOPE_TRANSFER_NUM = 9;
    private static final int SET_KALEIDOSCOPE_TYPE = 8;
    private static final int SET_OPTION_IDX_0x1F = 31;
    private static final int SET_OPTION_INDEX_TYPE = 20;
    private static final int SET_OPTION_SELECTED_LIST_0x1D = 29;
    private static final int SET_OPTION_SELECTED_STRUCT_0X1E = 30;
    private static final int SET_PORTRAIT_MODE_TYPE = 11;
    private static final int SET_PORT_POSITION_INDEX_TYPE = 10;
    private static final int SET_PREVIEW_NAME_VALUE = 5;
    private static final int SET_SMART_FONT_INDEX_0x16 = 22;
    private static final int SET_SMART_POS_INDEX_0x17 = 23;
    private static final int SET_SMART_TIME_INDEX_0x15 = 21;
    private static final int SET_STYLE_APPLY_ALL_TYPE = 16;
    private static final int SET_TIME_COLOR_TYPE = 13;
    private static final int SET_TIME_SIZE_INDEX_TYPE = 41;
    private static final int SET_TIME_STYLE_INDEX_TYPE = 12;
    private static final int SET_VALUE_TYPE_INDEX_TYPE = 9;
    private static final int SET_WEAR_STYLE_ID_VALUE = 4;
    private static final int SET_WEAR_STYLE_LIST_VALUE = 2;
    private static final int SET_WEAR_STYLE_NUM_VALUE = 1;
    private static final int SET_WEAR_STYLE_STRUCT_VALUE = 3;
    private static final int SET_WEAR_TRANSFER_NUM = 11;
    private static final int SET_WEAR_TYPE_VALUE = 6;
    private static final int SET_WRIST_SWITCH_TYPE = 15;
    private static final int SMART_FONT_INDEX_0x19 = 25;
    private static final int SMART_POS_INDEX_0x1A = 26;
    private static final int SMART_TIME_INDEX_0x18 = 24;
    private static final int STYLE_APPLY_ALL_TYPE = 18;
    private static final int STYLE_INDEX = 9;
    private static final int STYLE_INDEX_VALUE = 7;
    private static final String TAG = "DiyWatchFaceDeviceService";
    private static final String TAG_RELEASE = "R_DiyWatchFaceDeviceService";
    private static final int TIME_COLOR_TYPE = 15;
    private static final int TIME_SIZE_INDEX_TYPE = 41;
    private static final int TIME_STYLE_INDEX_TYPE = 14;
    private static final int VALUE_TYPE_INDEX_TYPE = 10;
    private static final int WRIST_SWITCH_TYPE = 17;
    private static Map<Integer, List<IBaseResponseCallback>> sCommandCallbacks = new HashMap(16);
    private lvb mDeviceConfigManager;

    private DiyWatchFaceDeviceService() {
        this.mDeviceConfigManager = lvb.e();
        lvg.e().d(TAG, this);
    }

    public static DiyWatchFaceDeviceService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    static class SingletonHolder {
        private static final DiyWatchFaceDeviceService INSTANCE = new DiyWatchFaceDeviceService();

        private SingletonHolder() {
        }
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e(TAG_RELEASE, "onDataReceived data illegal");
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "onDataReceived commands id :", Byte.valueOf(bArr[1]));
        byte b2 = bArr[1];
        if (b2 == 8) {
            handlePhotoInfo(bArr);
            return;
        }
        if (b2 == 9) {
            handlePhotoStatus(bArr);
            return;
        }
        switch (b2) {
            case 17:
                handleKaleidoscopeInfo(bArr);
                break;
            case 18:
                handleKaleidoscopeStatus(bArr);
                break;
            case 19:
                handleWearInfo(bArr);
                break;
            case 20:
                handleWearStatus(bArr);
                break;
            default:
                LogUtil.j(TAG, "onDataReceived nothing to do");
                break;
        }
    }

    private void handlePhotoInfo(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handlePhotoInfo data is error");
            return;
        }
        AlbumWatchFaceInfo albumWatchFaceInfo = new AlbumWatchFaceInfo();
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            albumWatchFaceInfo.setMaxBackgroundImages(cVarA.d((byte) 1, -1));
            albumWatchFaceInfo.setCanIntellectColor(cVarA.d((byte) 2, -1));
            albumWatchFaceInfo.setBackgroundImageType(cVarA.d((byte) 3, -1));
            albumWatchFaceInfo.setPositionIndex(cVarA.d((byte) 8, -1));
            albumWatchFaceInfo.setStyleIndex(cVarA.d((byte) 9, -1));
            albumWatchFaceInfo.setBackgroundImageOption(cVarA.d((byte) 11, -1));
            albumWatchFaceInfo.setValueTypeIndex(cVarA.d((byte) 10, -1));
            albumWatchFaceInfo.setWristSwitch(cVarA.d((byte) 17, -1));
            albumWatchFaceInfo.setStyleApplyAll(cVarA.d((byte) 18, -1));
            albumWatchFaceInfo.setCarouselMode(cVarA.d(Ascii.ETB, -1));
            handleNewBackground(cVarA.b((byte) 4), albumWatchFaceInfo);
            handleCustomData(cVarA.b((byte) 19), albumWatchFaceInfo);
            LogUtil.a(TAG, "handlePhotoInfo get optionSelectedList");
            handleOptionSelectedList(cVarA.b(Ascii.US), albumWatchFaceInfo);
            LogUtil.a(TAG, "handlePhotoInfo albumWatchFaceInfo is:", albumWatchFaceInfo);
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handlePhotoInfo TlvException:", ExceptionUtils.c(e));
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(8);
            if (list != null && !list.isEmpty()) {
                list.get(list.size() - 1).a(101, albumWatchFaceInfo);
                sCommandCallbacks.remove(8);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handlePhotoInfo callback error");
            }
        }
    }

    private void handleOptionSelectedList(List<cql.c> list, AlbumWatchFaceInfo albumWatchFaceInfo) {
        LogUtil.a("handleOptionSelectedList enter", new Object[0]);
        if (CollectionUtils.a(list)) {
            LogUtil.a("handleOptionSelectedList optionSelectedList is empty", new Object[0]);
            return;
        }
        if (list.size() != 2) {
            LogUtil.a("handleOptionSelectedList length expected 2 but ", Integer.valueOf(list.size()), " found");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<cql.c> it = list.iterator();
        while (it.hasNext()) {
            int iD = it.next().d(PublicSuffixDatabase.i, -1);
            if (iD == -1) {
                LogUtil.e(TAG, "handleOptionSelectedList error");
                return;
            }
            arrayList.add(Integer.valueOf(iD));
        }
        albumWatchFaceInfo.setOptionSelectedList(arrayList);
        LogUtil.e(TAG, "handleOptionSelectedList out");
    }

    private void handleNewBackground(List<cql.c> list, AlbumWatchFaceInfo albumWatchFaceInfo) {
        LogUtil.a(TAG, "enter handleNewBackground");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleNewBackground backgroundTlvList is empty");
            return;
        }
        ArrayList<AlbumWatchFaceInfo.BackgroundBean> arrayList = new ArrayList<>(16);
        for (cql.c cVar : list) {
            AlbumWatchFaceInfo.BackgroundBean backgroundBean = new AlbumWatchFaceInfo.BackgroundBean();
            backgroundBean.setBackgroundIndex(cVar.d((byte) 6, -1));
            backgroundBean.setBackgroundName(cVar.e((byte) 7, ""));
            backgroundBean.setPortPositionIndex(cVar.d((byte) 12, -1));
            backgroundBean.setPortraitMode(cVar.d((byte) 13, -1));
            backgroundBean.setTimeStyleIndex(cVar.d((byte) 14, -1));
            backgroundBean.setTimeColor(cVar.e((byte) 15, ""));
            backgroundBean.setBackgroundColor(cVar.e((byte) 16, ""));
            backgroundBean.setTimeSizeIndex(cVar.d((byte) 41, -1));
            LogUtil.a(TAG, "handleNewBackground start set smart param");
            backgroundBean.setSmartTimeIndex(cVar.d(Ascii.CAN, -1));
            backgroundBean.setSmartFontIndex(cVar.d(Ascii.EM, -1));
            backgroundBean.setSmartPosIndex(cVar.d(Ascii.SUB, -1));
            backgroundBean.setGaussColorSaturation(cVar.d(Ascii.ESC, -1));
            backgroundBean.setGaussColorBrightness(cVar.d(Ascii.FS, -1));
            backgroundBean.setGaussBlurRadius(cVar.d(Ascii.GS, -1));
            backgroundBean.setFontOpa(cVar.d(Ascii.RS, -1));
            LogUtil.a(TAG, "handleNewBackground end set smart param");
            arrayList.add(backgroundBean);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handleNewBackground backgroundList size:", Integer.valueOf(arrayList.size()));
        albumWatchFaceInfo.setBackgroundList(arrayList);
    }

    private void handleCustomData(List<cql.c> list, AlbumWatchFaceInfo albumWatchFaceInfo) {
        LogUtil.a(TAG, "enter handleCustomData");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleNewBackground dataTlvList is empty");
            return;
        }
        ArrayList<AlbumWatchFaceInfo.WatchFacePhotoCustom> arrayList = new ArrayList<>(16);
        for (cql.c cVar : list) {
            AlbumWatchFaceInfo.WatchFacePhotoCustom watchFacePhotoCustom = new AlbumWatchFaceInfo.WatchFacePhotoCustom();
            watchFacePhotoCustom.setContainerIndex(cVar.d(Ascii.NAK, -1));
            watchFacePhotoCustom.setOptionIndex(cVar.d(Ascii.SYN, -1));
            arrayList.add(watchFacePhotoCustom);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handleNewBackground customList size:", Integer.valueOf(arrayList.size()));
        albumWatchFaceInfo.setDataList(arrayList);
    }

    private void handlePhotoStatus(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handlePhotoInfo data is error");
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            reportNewPhotoStatus(cVarA.d(Ascii.DEL, -1), cVarA.d((byte) 8, -1));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handlePhotoStatus error:", ExceptionUtils.c(e));
        }
    }

    private void reportNewPhotoStatus(int i, int i2) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(9);
            if (list == null || list.isEmpty()) {
                ReleaseLogUtil.e(TAG_RELEASE, "reportNewPhotoStatus callback error");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).a(101, 0);
                list.remove(list.size() - 1);
            } else if (i == 100000 && i2 > 0) {
                ReleaseLogUtil.d(TAG_RELEASE, "reportNewPhotoStatus need transfer num:", Integer.valueOf(i2));
                list.get(list.size() - 1).a(111, Integer.valueOf(i2));
            } else {
                ReleaseLogUtil.d(TAG_RELEASE, "reportNewPhotoStatus errorCode is failed");
                list.get(list.size() - 1).a(102, null);
                list.remove(list.size() - 1);
            }
        }
    }

    private void handleKaleidoscopeInfo(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleKaleidoscopeInfo data is error");
            return;
        }
        KaleidoscopeWatchFaceInfo kaleidoscopeWatchFaceInfo = new KaleidoscopeWatchFaceInfo();
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            kaleidoscopeWatchFaceInfo.setMaxMaterialImages(cVarA.d((byte) 1, -1));
            kaleidoscopeWatchFaceInfo.setMaterialImageType(cVarA.d((byte) 2, -1));
            handleMaterialImageList(cVarA.b((byte) 3), kaleidoscopeWatchFaceInfo);
            kaleidoscopeWatchFaceInfo.setCurrentMaterialImageIndex(cVarA.d((byte) 7, -1));
            kaleidoscopeWatchFaceInfo.setHandsStyleIndex(cVarA.d((byte) 8, -1));
            kaleidoscopeWatchFaceInfo.setKaleidoscopeType(cVarA.d((byte) 9, -1));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleKaleidoscopeInfo TlvException:", ExceptionUtils.c(e));
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(17);
            if (list != null && !list.isEmpty()) {
                list.get(list.size() - 1).a(101, kaleidoscopeWatchFaceInfo);
                sCommandCallbacks.remove(17);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleKaleidoscopeInfo callback error");
            }
        }
    }

    private void handleMaterialImageList(List<cql.c> list, KaleidoscopeWatchFaceInfo kaleidoscopeWatchFaceInfo) {
        LogUtil.a(TAG, "enter handleMaterialImageList");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleMaterialImageList materialImageList is empty");
            return;
        }
        ArrayList<KaleidoscopeWatchFaceInfo.MaterialImage> arrayList = new ArrayList<>(16);
        for (cql.c cVar : list) {
            KaleidoscopeWatchFaceInfo.MaterialImage materialImage = new KaleidoscopeWatchFaceInfo.MaterialImage();
            materialImage.setMaterialImageIndex(cVar.d((byte) 5, -1));
            materialImage.setMaterialImageName(cVar.e((byte) 6, ""));
            arrayList.add(materialImage);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handleMaterialImageList materialImages size:", Integer.valueOf(arrayList.size()));
        kaleidoscopeWatchFaceInfo.setMaterialImageList(arrayList);
    }

    private void handleKaleidoscopeStatus(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleKaleidoscopeStatus data is error");
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            reportKaleidoscopeStatus(cVarA.d(Ascii.DEL, -1), cVarA.d((byte) 9, -1));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleKaleidoscopeStatus error:", ExceptionUtils.c(e));
        }
    }

    private void reportKaleidoscopeStatus(int i, int i2) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(18);
            if (list == null || list.isEmpty()) {
                ReleaseLogUtil.e(TAG_RELEASE, "reportKaleidoscopeStatus callback error");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).a(101, 0);
                list.remove(list.size() - 1);
            } else if (i == 100000 && i2 > 0) {
                ReleaseLogUtil.d(TAG_RELEASE, "reportKaleidoscopeStatus need transfer num:", Integer.valueOf(i2));
                list.get(list.size() - 1).a(111, Integer.valueOf(i2));
            } else {
                ReleaseLogUtil.d(TAG_RELEASE, "reportKaleidoscopeStatus errorCode is failed");
                list.get(list.size() - 1).a(102, null);
                list.remove(list.size() - 1);
            }
        }
    }

    private void handleWearInfo(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWearInfo data is error");
            return;
        }
        WearWatchFaceInfo wearWatchFaceInfo = new WearWatchFaceInfo();
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            wearWatchFaceInfo.setMaxStyleNum(cVarA.d((byte) 1, -1));
            wearWatchFaceInfo.setWearStyleNum(cVarA.d((byte) 2, -1));
            wearWatchFaceInfo.setWearStyleType(cVarA.d((byte) 3, -1));
            wearWatchFaceInfo.setWearTypeCapability(cVarA.d((byte) 4, -1L));
            wearWatchFaceInfo.setClockTypeCapability(cVarA.d((byte) 5, -1L));
            handleWearStyleList(cVarA.b((byte) 6), wearWatchFaceInfo);
            wearWatchFaceInfo.setCurStyleIndex(cVarA.d((byte) 10, -1L));
            wearWatchFaceInfo.setWearImageOption(cVarA.d((byte) 11, -1));
            wearWatchFaceInfo.setTintClockOption(cVarA.d((byte) 12, -1));
            wearWatchFaceInfo.setRectRadius(cVarA.d((byte) 13, -1));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleWearInfo TlvException:", ExceptionUtils.c(e));
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(19);
            if (list != null && !list.isEmpty()) {
                list.get(list.size() - 1).a(101, wearWatchFaceInfo);
                sCommandCallbacks.remove(19);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleWearInfo callback error");
            }
        }
    }

    private void handleWearStyleList(List<cql.c> list, WearWatchFaceInfo wearWatchFaceInfo) {
        LogUtil.a(TAG, "enter handleWearStyleList");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWearStyleList wearStyleTlvList is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (cql.c cVar : list) {
            WearWatchFaceInfo.WearStyleStruct wearStyleStruct = new WearWatchFaceInfo.WearStyleStruct();
            wearStyleStruct.setWearStyleId(cVar.d((byte) 8, -1L));
            wearStyleStruct.setPreviewName(cVar.e((byte) 9, ""));
            arrayList.add(wearStyleStruct);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handleWearStyleList wearStyleList size:", Integer.valueOf(arrayList.size()));
        wearWatchFaceInfo.setWearStyleList(arrayList);
    }

    private void handleWearStatus(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWearStatus data is error");
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            reportWearStatus(cVarA.d(Ascii.DEL, -1), cVarA.d((byte) 11, -1));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleWearStatus error:", ExceptionUtils.c(e));
        }
    }

    private void reportWearStatus(int i, int i2) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(20);
            if (list == null || list.isEmpty()) {
                ReleaseLogUtil.e(TAG_RELEASE, "reportWearStatus callback error");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).a(101, 0);
                list.remove(list.size() - 1);
            } else if (i == 100000 && i2 > 0) {
                ReleaseLogUtil.d(TAG_RELEASE, "reportWearStatus need transfer num:", Integer.valueOf(i2));
                list.get(list.size() - 1).a(111, Integer.valueOf(i2));
            } else {
                ReleaseLogUtil.d(TAG_RELEASE, "reportWearStatus errorCode is failed");
                list.get(list.size() - 1).a(102, null);
                list.remove(list.size() - 1);
            }
        }
    }

    private static Object getCommandCallbackCallbackList() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (DiyWatchFaceDeviceService.class) {
            map = sCommandCallbacks;
        }
        return map;
    }

    public void getWatchFacePhotoInfo(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(8);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter getWatchFacePhotoInfo have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(8, arrayList);
                } else {
                    LogUtil.a(TAG, "enter getWatchFacePhotoInfo have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        getPhotoWatchInfo();
    }

    private void getPhotoWatchInfo() {
        cqj cqjVar = new cqj();
        cqjVar.c(1);
        cqjVar.c(2);
        cqjVar.c(3);
        cqjVar.c(4);
        cqjVar.c(8);
        cqjVar.c(9);
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(8);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "getPhotoWatchInfo, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    public void saveNewPhotoInfoToDevice(AlbumWatchFaceInfo albumWatchFaceInfo, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter saveNewPhotoInfoToDevice");
        if (albumWatchFaceInfo == null) {
            iBaseResponseCallback.a(102, "");
            ReleaseLogUtil.e(TAG_RELEASE, "saveNewPhotoInfoToDevice error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(9);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter saveNewPhotoInfoToDevice have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(9, arrayList);
                } else {
                    LogUtil.a(TAG, "enter saveNewPhotoInfoToDevice have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        LogUtil.a(TAG, "saveNewPhotoInfoToDevice:", albumWatchFaceInfo);
        makeNewPhotoInfoCommand(albumWatchFaceInfo);
    }

    private void makeNewPhotoInfoCommand(AlbumWatchFaceInfo albumWatchFaceInfo) {
        cqj cqjVar = new cqj();
        ArrayList<AlbumWatchFaceInfo.BackgroundBean> backgroundList = albumWatchFaceInfo.getBackgroundList();
        if (!CollectionUtils.a(backgroundList)) {
            cqjVar.g(1, backgroundList.size());
            combineWatchFaceBgListCommand(cqjVar, backgroundList, albumWatchFaceInfo.getIsUseGaussColor());
        }
        cqjVar.g(6, albumWatchFaceInfo.getPositionIndex());
        cqjVar.g(7, albumWatchFaceInfo.getStyleIndex());
        cqjVar.g(9, albumWatchFaceInfo.getValueTypeIndex());
        cqjVar.g(15, albumWatchFaceInfo.getWristSwitch());
        cqjVar.g(16, albumWatchFaceInfo.getStyleApplyAll());
        ArrayList<AlbumWatchFaceInfo.WatchFacePhotoCustom> dataList = albumWatchFaceInfo.getDataList();
        if (!CollectionUtils.a(dataList)) {
            cqjVar.a(17);
            for (AlbumWatchFaceInfo.WatchFacePhotoCustom watchFacePhotoCustom : dataList) {
                cqjVar.d(18);
                cqjVar.c(19, watchFacePhotoCustom.getContainerIndex());
                cqjVar.c(20, watchFacePhotoCustom.getOptionIndex());
                cqjVar.b(cqjVar.b());
            }
            cqjVar.a(cqjVar.d());
        }
        cqjVar.g(28, albumWatchFaceInfo.getIsUseGaussColor());
        List<Integer> optionSelectedList = albumWatchFaceInfo.getOptionSelectedList();
        if (!CollectionUtils.a(optionSelectedList)) {
            if (optionSelectedList.size() != 2) {
                LogUtil.j(TAG, "makeNewPhotoInfoCommand option size expected 2 but ", Integer.valueOf(optionSelectedList.size()));
            } else {
                LogUtil.j(TAG, "makeNewPhotoInfoCommand start create option_selected_list");
                cqjVar.a(29);
                for (Integer num : optionSelectedList) {
                    cqjVar.d(30);
                    cqjVar.c(31, num.intValue());
                    cqjVar.b(cqjVar.b());
                }
                cqjVar.a(cqjVar.d());
                LogUtil.j(TAG, "makeNewPhotoInfoCommand end create option_selected_list");
            }
        } else {
            LogUtil.j(TAG, "makeNewPhotoInfoCommand optionSelectedList is empty");
        }
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(9);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "makeNewPhotoInfoCommand, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    private void combineWatchFaceBgListCommand(cqj cqjVar, List<AlbumWatchFaceInfo.BackgroundBean> list, int i) {
        cqjVar.a(2);
        for (AlbumWatchFaceInfo.BackgroundBean backgroundBean : list) {
            cqjVar.d(3);
            cqjVar.c(4, backgroundBean.getBackgroundIndex());
            cqjVar.e(5, backgroundBean.getBackgroundName());
            cqjVar.c(10, backgroundBean.getPortPositionIndex());
            cqjVar.c(11, backgroundBean.getPortraitMode());
            cqjVar.c(12, backgroundBean.getTimeStyleIndex());
            cqjVar.e(13, backgroundBean.getTimeColor());
            cqjVar.e(14, backgroundBean.getBackgroundColor());
            cqjVar.c(41, backgroundBean.getTimeSizeIndex());
            LogUtil.a(TAG, "combineWatchFaceBgListCommand start create smart param");
            if (i != -1) {
                cqjVar.c(21, backgroundBean.getSmartTimeIndex());
                cqjVar.c(22, backgroundBean.getSmartFontIndex());
                cqjVar.c(23, backgroundBean.getSmartPosIndex());
                cqjVar.c(28, i);
            }
            if (i == 1) {
                LogUtil.a(TAG, "combineWatchFaceBgListCommand isUseGaussColor is 1");
                cqjVar.c(24, backgroundBean.getGaussColorSaturation());
                cqjVar.c(25, backgroundBean.getGaussColorBrightness());
                cqjVar.c(26, backgroundBean.getGaussBlurRadius());
                cqjVar.c(27, backgroundBean.getFontOpa());
            }
            LogUtil.a(TAG, "combineWatchFaceBgListCommand end create smart param");
            cqjVar.b(cqjVar.b());
        }
        cqjVar.a(cqjVar.d());
    }

    public void getKaleidoscopeWatchFaceInfo(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(17);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter getKaleidoscopeWatchFaceInfo have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(17, arrayList);
                } else {
                    LogUtil.a(TAG, "enter getKaleidoscopeWatchFaceInfo have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        sendKaleidoscopeWatchFaceCommand();
    }

    private void sendKaleidoscopeWatchFaceCommand() {
        cqj cqjVar = new cqj();
        cqjVar.c(1);
        cqjVar.c(2);
        cqjVar.c(3);
        cqjVar.c(5);
        cqjVar.c(6);
        cqjVar.c(7);
        cqjVar.c(8);
        cqjVar.c(9);
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(17);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "sendKaleidoscopeWatchFaceCommand, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    public void saveKaleidoscopeWatchFaceToDevice(KaleidoscopeWatchFaceInfo kaleidoscopeWatchFaceInfo, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter saveKaleidoscopeWatchFaceToDevice");
        if (kaleidoscopeWatchFaceInfo == null) {
            iBaseResponseCallback.a(102, "");
            ReleaseLogUtil.e(TAG_RELEASE, "saveKaleidoscopeWatchFaceToDevice error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(18);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter saveKaleidoscopeWatchFaceToDevice have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(18, arrayList);
                } else {
                    LogUtil.a(TAG, "enter saveKaleidoscopeWatchFaceToDevice have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        setKaleidoscopeWatchFaceCommand(kaleidoscopeWatchFaceInfo);
    }

    private void setKaleidoscopeWatchFaceCommand(KaleidoscopeWatchFaceInfo kaleidoscopeWatchFaceInfo) {
        cqj cqjVar = new cqj();
        ArrayList<KaleidoscopeWatchFaceInfo.MaterialImage> materialImageList = kaleidoscopeWatchFaceInfo.getMaterialImageList();
        if (!CollectionUtils.a(materialImageList)) {
            cqjVar.g(1, materialImageList.size());
            cqjVar.a(2);
            for (KaleidoscopeWatchFaceInfo.MaterialImage materialImage : materialImageList) {
                cqjVar.d(3);
                cqjVar.c(4, materialImage.getMaterialImageIndex());
                cqjVar.e(5, materialImage.getMaterialImageName());
                cqjVar.b(cqjVar.b());
            }
            cqjVar.a(cqjVar.d());
        }
        cqjVar.g(6, kaleidoscopeWatchFaceInfo.getCurrentMaterialImageIndex());
        cqjVar.g(7, kaleidoscopeWatchFaceInfo.getHandsStyleIndex());
        cqjVar.g(8, kaleidoscopeWatchFaceInfo.getKaleidoscopeType());
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(18);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "setKaleidoscopeWatchFaceCommand, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    public void getWearWatchFaceInfo(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(19);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter getWearWatchFaceInfo have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(19, arrayList);
                } else {
                    LogUtil.a(TAG, "enter getWearWatchFaceInfo have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        sendWearWatchFaceCommand();
    }

    private void sendWearWatchFaceCommand() {
        cqj cqjVar = new cqj();
        cqjVar.c(1);
        cqjVar.c(2);
        cqjVar.c(3);
        cqjVar.c(4);
        cqjVar.c(5);
        cqjVar.c(6);
        cqjVar.c(8);
        cqjVar.c(9);
        cqjVar.c(10);
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(19);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "sendWearWatchFaceCommand, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    public void saveWearWatchFaceToDevice(WearWatchFaceInfo wearWatchFaceInfo, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter saveWearWatchFaceToDevice");
        if (wearWatchFaceInfo == null) {
            iBaseResponseCallback.a(102, "");
            ReleaseLogUtil.e(TAG_RELEASE, "saveWearWatchFaceToDevice error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(20);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter saveWearWatchFaceToDevice have no callback");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(20, arrayList);
                } else {
                    LogUtil.a(TAG, "enter saveWearWatchFaceToDevice have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        setWearWatchFaceCommand(wearWatchFaceInfo);
    }

    private void setWearWatchFaceCommand(WearWatchFaceInfo wearWatchFaceInfo) {
        cqj cqjVar = new cqj();
        List<WearWatchFaceInfo.WearStyleStruct> wearStyleList = wearWatchFaceInfo.getWearStyleList();
        if (!CollectionUtils.a(wearStyleList)) {
            cqjVar.g(1, wearStyleList.size());
            cqjVar.a(2);
            for (WearWatchFaceInfo.WearStyleStruct wearStyleStruct : wearStyleList) {
                cqjVar.d(3);
                cqjVar.b(4, wearStyleStruct.getWearStyleId());
                cqjVar.e(5, wearStyleStruct.getPreviewName());
                cqjVar.c(6, wearStyleStruct.getWearType());
                cqjVar.e(7, wearStyleStruct.getBgImageName());
                cqjVar.c(8, wearStyleStruct.getClockStyleIndex());
                cqjVar.e(9, wearStyleStruct.getClockStyleColor());
                cqjVar.b(cqjVar.b());
            }
            cqjVar.a(cqjVar.d());
        }
        cqjVar.e(10, wearWatchFaceInfo.getCurWearImageIndex());
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(20);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "setWearWatchFaceCommand, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }
}
