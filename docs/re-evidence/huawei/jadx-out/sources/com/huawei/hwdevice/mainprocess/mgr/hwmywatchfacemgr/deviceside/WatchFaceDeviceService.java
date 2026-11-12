package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.CompatibleDialStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceIdReportInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceList;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceOperateInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cpy;
import defpackage.cql;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.lvb;
import defpackage.lvg;
import defpackage.njy;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class WatchFaceDeviceService implements BluetoothDataReceiveCallback {
    private static final int APPLY_OPERATE_TYPE = 3;
    private static final int APPLY_SYNC_TYPE = 7;
    private static final int APPLY_WATCH_FACE_ID = 1;
    private static final int APPLY_WATCH_FACE_VERSION = 2;
    private static final int COMMAND_ID_DEVICE_WATCH_FACE_INFO = 1;
    private static final int COMMAND_ID_WATCH_FACE_APPLY = 3;
    private static final int COMMAND_ID_WATCH_FACE_INFO = 2;
    private static final int COMMAND_ID_WATCH_FACE_INFO_REPORT = 5;
    private static final int COMMAND_ID_WATCH_FACE_REQUEST_NAME = 6;
    private static final int COMMAND_ID_WATCH_FACE_SORT = 4;
    private static final int COMMAND_TL_NUM = 128;
    private static final int CONVERT_RADIX_HEX = 16;
    private static final int CURRENT_MODE_0x18 = 24;
    private static final int DEFAULT_TAG_LENGTH = 1;
    private static final int DIAL_HEIGHT = 10;
    private static final int DIAL_WIDTH = 9;
    private static final int ERROR_CODE = 127;
    private static final int ERROR_CODE_LENGTH = 4;
    private static final int ERROR_CODE_SUCCESS = 100000;
    private static final int GET_NAME_LANGUAGE_MODE = 1;
    private static final int GET_NAME_WATCH_FACE_BRIEF = 6;
    private static final int GET_NAME_WATCH_FACE_ID = 4;
    private static final int GET_NAME_WATCH_FACE_LIST = 2;
    private static final int GET_NAME_WATCH_FACE_NAME = 5;
    private static final int GET_NAME_WATCH_FACE_SIZE = 7;
    private static final int GET_NAME_WATCH_FACE_STRUCT = 3;
    private static final int INT_BIT_FIRST = 2;
    private static final int IS_WATCHFACE_FULL = 8;
    private static final int LIST_MAX_LENGTH = 20;
    private static final int MAX_FIRMWARE = 1;
    private static final int NEED_RECEIVE = 4;
    private static final int OTHER_FIRMWARE = 6;
    private static final int REMAINING_STORAGE_SPACE = 9;
    private static final int REPORT_WATCH_FACE_ID = 1;
    private static final int REPORT_WATCH_FACE_STATUS = 3;
    private static final int REPORT_WATCH_FACE_VERSION = 2;
    private static final int SCREEN_HEIGHT = 3;
    private static final int SCREEN_WIDTH = 2;
    private static final int SERVER_MODE = 6;
    private static final int SERVER_MODE_CHINA_RELEASE = 1;
    private static final int SERVER_MODE_CHINA_TEST = 2;
    private static final int SERVER_MODE_OVERSEA_RELEASE = 3;
    private static final int SUPPORT_AESTHETIC_ALBUM_COLOR_0X1B = 27;
    private static final int SUPPORT_ALBUM_FUNCTION_EXPANSION_0X1D = 29;
    private static final int SUPPORT_FILE_TYPE = 4;
    private static final int SUPPORT_GAUSSIAN_COLOR_0x1A = 26;
    private static final int SUPPORT_NEW_VIDEO_CUSTOMIZE_0X1C = 28;
    private static final int SUPPORT_ONE_TOUCH = 25;
    private static final int SUPPORT_SORT = 5;
    private static final int SUPPORT_SYNC_0x17 = 23;
    private static final int SUPPORT_VERSION = 11;
    private static final int SUPPORT_WATCHFACE_CAPABILITY_0X1E = 30;
    private static final String TAG = "WatchFaceDeviceService";
    private static final String TAG_RELEASE = "R_WatchFaceDeviceService";
    private static final int TLV_HEAD = 4;
    private static final int WATCH_FACE_EXPAND_TYPE = 7;
    private static final int WATCH_FACE_ID = 3;
    private static final int WATCH_FACE_LIST = 1;
    private static final int WATCH_FACE_TYPE = 5;
    private static final int WATCH_FACE_VERSION = 4;
    private static IBaseResponseCallback mMyWatchFaceCardCallback;
    private static Map<Integer, List<IBaseResponseCallback>> sCommandCallbacks = new HashMap(20);
    private lvb mDeviceConfigManager;
    private int mDeviceHeight;
    private int mDeviceWidth;
    private final eet mTlvUtils;
    private Map<String, ResponseCallback<WatchFaceIdReportInfo>> sWatchFaceCallbackList;

    private WatchFaceDeviceService() {
        this.sWatchFaceCallbackList = new HashMap(16);
        this.mTlvUtils = new eet();
        this.mDeviceConfigManager = lvb.e();
        lvg.e().d(TAG, this);
    }

    static class SingletonHolder {
        private static final WatchFaceDeviceService INSTANCE = new WatchFaceDeviceService();

        private SingletonHolder() {
        }
    }

    public static WatchFaceDeviceService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "data is null");
            return;
        }
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        if (b2 != 39) {
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "onDataReceived errorCode is, ", Integer.valueOf(i), Integer.valueOf(b2), " commandId is,", Integer.valueOf(b3));
        getResult(bArr);
    }

    public void queryWatchFaceParams(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter queryWatchFaceParams");
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(1);
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter queryWatchFaceParams have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(1, arrayList);
                } else {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter queryWatchFaceParams have callback,add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        getDeviceInfo();
    }

    public void queryWatchFaceInfoList(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter queryWatchFaceInfoList");
        if (z) {
            LogUtil.a(TAG, "queryWatchFaceInfoList from MyWatchFaceCard");
            mMyWatchFaceCardCallback = iBaseResponseCallback;
        } else {
            synchronized (getCommandCallbackCallbackList()) {
                if (iBaseResponseCallback != null) {
                    List<IBaseResponseCallback> list = sCommandCallbacks.get(2);
                    if (list == null) {
                        ReleaseLogUtil.d(TAG_RELEASE, "enter queryWatchFaceInfoList have no callback");
                        ArrayList arrayList = new ArrayList(20);
                        arrayList.add(iBaseResponseCallback);
                        sCommandCallbacks.put(2, arrayList);
                    } else {
                        ReleaseLogUtil.d(TAG_RELEASE, "enter queryWatchFaceInfoList have callback,add");
                        list.add(iBaseResponseCallback);
                    }
                }
            }
        }
        getDeviceWatchInfo();
    }

    public void obtainWatchFaceInfo(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter obtainWatchFaceInfo");
        int i = LanguageUtil.f(BaseApplication.getContext()) ? 2 : 1;
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list2 = sCommandCallbacks.get(6);
                if (list2 == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "enter obtainWatchFaceInfo have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(6, arrayList);
                } else {
                    LogUtil.a(TAG, "enter obtainWatchFaceInfo have callback,add");
                    list2.add(iBaseResponseCallback);
                }
            }
        }
        sendGetNameCommand(list, i);
    }

    private void getResult(byte[] bArr) {
        LogUtil.a(TAG, "getResult():", eeq.e(bArr));
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e(TAG_RELEASE, "data illegal");
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "getResult() id commandData 1:", Byte.valueOf(bArr[1]));
        switch (bArr[1]) {
            case 1:
                handleDeviceInfo(bArr);
                break;
            case 2:
                handleFaceInfo(bArr);
                break;
            case 3:
                handleApply(bArr);
                break;
            case 4:
                break;
            case 5:
                handleReportStatus(bArr);
                break;
            case 6:
                handleNameInfo(bArr);
                break;
            default:
                LogUtil.j(TAG, "getResult nothing to do");
                break;
        }
    }

    private void handleNameInfo(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a(TAG, "5.39.6 handleNameInfo:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleNameInfo data is error");
            return;
        }
        try {
            ees eesVar = this.mTlvUtils.b(strE.substring(4)).b().get(0);
            LogUtil.a(TAG, "handleNameInfo size:", Integer.valueOf(eesVar.b().size()));
            WatchFaceInfoResponse watchFaceInfoResponse = new WatchFaceInfoResponse();
            watchFaceInfoResponse.setWatchFaceList(new ArrayList(16));
            Iterator<ees> it = eesVar.b().iterator();
            while (it.hasNext()) {
                handleOneTlv(watchFaceInfoResponse, it.next());
            }
            LogUtil.a(TAG, "handleNameInfo End, watchFaceList size:", Integer.valueOf(watchFaceInfoResponse.getWatchFaceList().size()));
            reportWatchFaceNameInfo(watchFaceInfoResponse);
        } catch (eeu e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleNameInfo TlvException:", ExceptionUtils.c(e));
            xjt.aq("handleNameInfo request watch info TlvException: " + ExceptionUtils.c(e));
        } catch (IndexOutOfBoundsException e2) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleNameInfo IndexOutOfBoundsException:", ExceptionUtils.c(e2));
            xjt.aq("handleNameInfo request watch info IndexOutOfBoundsException: " + ExceptionUtils.c(e2));
        } catch (NumberFormatException e3) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleNameInfo NumberFormatException:", ExceptionUtils.c(e3));
            xjt.aq("handleNameInfo request watch info NumberFormatException: " + ExceptionUtils.c(e3));
        }
    }

    private void handleOneTlv(WatchFaceInfoResponse watchFaceInfoResponse, ees eesVar) {
        WatchFaceInfoResponse.WatchFaceInfoStruct watchFaceInfoStruct = new WatchFaceInfoResponse.WatchFaceInfoStruct();
        for (eew eewVar : eesVar.e()) {
            int iB = CommonUtil.b(eewVar.e(), 16);
            if (iB == 4) {
                watchFaceInfoStruct.setWatchFaceId(WatchFaceUtil.hexToIntList(eewVar.b()));
            } else if (iB == 5) {
                watchFaceInfoStruct.setWatchFaceName(WatchFaceUtil.hexToIntList(eewVar.b()));
            } else if (iB == 6) {
                watchFaceInfoStruct.setWatchFaceBrief(WatchFaceUtil.hexToIntList(eewVar.b()));
            } else if (iB == 7) {
                watchFaceInfoStruct.setWatchFaceSize(CommonUtil.b(eewVar.b(), 16));
            } else {
                LogUtil.j(TAG, "handleOneTlv default:", Integer.valueOf(CommonUtil.b(eewVar.e(), 16)));
            }
        }
        watchFaceInfoResponse.getWatchFaceList().add(watchFaceInfoStruct);
    }

    private void handleReportStatus(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a(TAG, "5.39.5 handleReportStatus, info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleReportStatus data is error");
            return;
        }
        WatchFaceIdReportInfo watchFaceIdReportInfo = new WatchFaceIdReportInfo();
        int iB = 100000;
        try {
            List<eew> listE = this.mTlvUtils.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    int iB2 = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB2 == 1) {
                        watchFaceIdReportInfo.setWatchFaceId(eeq.d(strB));
                    } else if (iB2 == 2) {
                        watchFaceIdReportInfo.setWatchFaceVersion(eeq.d(strB));
                    } else if (iB2 == 3) {
                        watchFaceIdReportInfo.setReportStatus(CommonUtil.b(strB, 16));
                    } else if (iB2 == 127) {
                        iB = CommonUtil.b(strB, 16);
                    } else {
                        LogUtil.j(TAG, "handleReportStatus, nothing to do");
                    }
                }
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleReportStatus tlvList error");
            }
        } catch (eeu e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleReportStatus TlvException:", ExceptionUtils.c(e));
        }
        reportAck(watchFaceIdReportInfo, iB);
        dispatchIdReportCb(watchFaceIdReportInfo);
    }

    private void dispatchIdReportCb(WatchFaceIdReportInfo watchFaceIdReportInfo) {
        Iterator<String> it = this.sWatchFaceCallbackList.keySet().iterator();
        while (it.hasNext()) {
            this.sWatchFaceCallbackList.get(it.next()).onResponse(0, watchFaceIdReportInfo);
        }
    }

    private void handleApply(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a(TAG, "5.39.3 handleApply:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleApply data is error");
            return;
        }
        WatchFaceOperateInfo watchFaceOperateInfo = new WatchFaceOperateInfo();
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            watchFaceOperateInfo.setWatchfaceId(cVarA.e((byte) 1, ""));
            watchFaceOperateInfo.setWatchfaceVersion(cVarA.e((byte) 2, ""));
            watchFaceOperateInfo.setOperate(cVarA.d((byte) 3, 0));
            watchFaceOperateInfo.setNeedReceive(cVarA.d((byte) 4, 1));
            watchFaceOperateInfo.setErrorCode(cVarA.d(Ascii.DEL, 0));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleApply TlvException:", ExceptionUtils.c(e));
            xjt.aq("handleApply tlv data is exception " + ExceptionUtils.c(e));
        }
        reportForUi(watchFaceOperateInfo);
    }

    private void handleFaceInfo(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a(TAG, "5.39.2 handleFaceInfo:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleFaceInfo data is error");
            return;
        }
        WatchFaceList watchFaceList = new WatchFaceList();
        watchFaceList.setWatchFaceList(new ArrayList(16));
        String strSubstring = strE.substring(4);
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            watchFaceList.setIsWatchfaceFull(cVarA.d((byte) 8, 0) == 1);
            watchFaceList.setLeftSpace(cVarA.d((byte) 9, -1));
        } catch (cpy e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleFaceInfo TlvException:", ExceptionUtils.c(e));
        }
        try {
            ees eesVar = this.mTlvUtils.b(strSubstring).b().get(0);
            LogUtil.a(TAG, "getTlvfathers size:", Integer.valueOf(eesVar.b().size()));
            for (ees eesVar2 : eesVar.b()) {
                WatchFaceList.WatchFace watchFace = new WatchFaceList.WatchFace();
                for (eew eewVar : eesVar2.e()) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    if (iB == 3) {
                        watchFace.setWatchFaceId(WatchFaceUtil.hexToIntList(eewVar.b()));
                    } else if (iB == 4) {
                        watchFace.setWatchFaceVersion(WatchFaceUtil.hexToIntList(eewVar.b()));
                    } else if (iB == 5) {
                        watchFace.setWatchFaceType(CommonUtil.b(eewVar.b(), 16));
                    } else if (iB == 7) {
                        watchFace.setWatchFaceExpandType(CommonUtil.b(eewVar.b(), 16));
                    } else {
                        LogUtil.j(TAG, "handleFaceInfo, nothing to do");
                    }
                }
                watchFaceList.getWatchFaceList().add(watchFace);
            }
            reportSuccessFaceInfo(watchFaceList);
        } catch (eeu e2) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleFaceInfo TlvException:", ExceptionUtils.c(e2));
        } catch (IndexOutOfBoundsException e3) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleFaceInfo IndexOutOfBoundsException:", ExceptionUtils.c(e3));
        }
    }

    private void reportSuccessFaceInfo(WatchFaceList watchFaceList) {
        IBaseResponseCallback iBaseResponseCallback = mMyWatchFaceCardCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, watchFaceList);
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(2);
            if (list != null && !list.isEmpty()) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(0, watchFaceList);
                }
                sCommandCallbacks.remove(2);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleFaceInfo callback error");
            }
        }
    }

    private void reportWatchFaceNameInfo(WatchFaceInfoResponse watchFaceInfoResponse) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(6);
            if (list != null && !list.isEmpty()) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(0, watchFaceInfoResponse);
                }
                sCommandCallbacks.remove(6);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleNameInfo callback error");
            }
        }
    }

    private void reportForUi(WatchFaceOperateInfo watchFaceOperateInfo) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(3);
            if (list != null && !list.isEmpty()) {
                LogUtil.j(TAG, "reportForUi, callbackList isn't null");
                sCommandCallbacks.remove(3);
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(0, watchFaceOperateInfo);
                }
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleApply callback error");
            }
        }
    }

    private void handleDeviceInfo(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a(TAG, "5.39.1 handleDeviceInfo ", strE);
        ReleaseLogUtil.d(TAG_RELEASE, "5.39.1 handleDeviceInfo is ok.");
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleDeviceInfo data is error");
            return;
        }
        String strSubstring = strE.substring(4);
        WatchFaceParamsResult watchFaceParamsResult = new WatchFaceParamsResult();
        try {
            ees eesVarB = this.mTlvUtils.b(strSubstring);
            List<eew> listE = eesVarB.e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    handleDeviceInfoTlv(CommonUtil.b(eewVar.e(), 16), eewVar.b(), watchFaceParamsResult);
                }
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleDeviceInfo tlv error");
            }
            addCompatibleDialList(eesVarB, watchFaceParamsResult);
            reportDeviceInfo(watchFaceParamsResult);
        } catch (eeu e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleDeviceInfo error:", ExceptionUtils.c(e));
        }
    }

    private void reportDeviceInfo(WatchFaceParamsResult watchFaceParamsResult) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(1);
            if (list != null && !list.isEmpty()) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(0, watchFaceParamsResult);
                }
                sCommandCallbacks.remove(1);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleDeviceInfo callback error");
            }
        }
    }

    private void addCompatibleDialList(ees eesVar, WatchFaceParamsResult watchFaceParamsResult) {
        if (njy.e(eesVar.b()) || watchFaceParamsResult == null) {
            return;
        }
        for (ees eesVar2 : eesVar.b()) {
            ArrayList arrayList = new ArrayList(10);
            Iterator<ees> it = eesVar2.b().iterator();
            while (it.hasNext()) {
                List<eew> listE = it.next().e();
                CompatibleDialStruct compatibleDialStruct = new CompatibleDialStruct();
                for (eew eewVar : listE) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 9) {
                        compatibleDialStruct.setDialWidth(CommonUtil.b(strB, 16));
                    } else if (iB == 10) {
                        compatibleDialStruct.setDialHeight(CommonUtil.b(strB, 16));
                    } else if (iB == 11) {
                        compatibleDialStruct.setSupportVersion(eeq.d(strB));
                    } else {
                        LogUtil.j(TAG, "addCompatibleDialList, invalid propType: ", Integer.valueOf(iB));
                    }
                }
                arrayList.add(compatibleDialStruct);
            }
            watchFaceParamsResult.setCompatibleDialList(arrayList);
        }
    }

    private void handleDeviceInfoTlv(int i, String str, WatchFaceParamsResult watchFaceParamsResult) {
        switch (i) {
            case 1:
                watchFaceParamsResult.setMaxFirmware(WatchFaceUtil.hexToIntList(str));
                break;
            case 2:
                this.mDeviceWidth = CommonUtil.b(str, 16);
                watchFaceParamsResult.setScreenWidth(CommonUtil.b(str, 16));
                break;
            case 3:
                this.mDeviceHeight = CommonUtil.b(str, 16);
                watchFaceParamsResult.setScreenHeight(CommonUtil.b(str, 16));
                break;
            case 4:
                watchFaceParamsResult.setSupportFileType(CommonUtil.b(str, 16));
                break;
            case 5:
                watchFaceParamsResult.setSupportSort(CommonUtil.b(str, 16));
                break;
            case 6:
                watchFaceParamsResult.setSupportEarlyFirmwareVersion(WatchFaceUtil.hexToIntList(str));
                break;
            default:
                switch (i) {
                    case 23:
                        watchFaceParamsResult.setSupportSync(CommonUtil.b(str, 16));
                        break;
                    case 24:
                        watchFaceParamsResult.setCurrentMode(CommonUtil.b(str, 16));
                        break;
                    case 25:
                        watchFaceParamsResult.setSupportOneTouch(String.valueOf(CommonUtil.b(str, 16)));
                        break;
                    case 26:
                        watchFaceParamsResult.setSupportGaussianColor(String.valueOf(CommonUtil.b(str, 16)));
                        break;
                    case 27:
                        watchFaceParamsResult.setSupportAestheticAlbumColor(CommonUtil.b(str, 16));
                        break;
                    case 28:
                        watchFaceParamsResult.setSupportNewVideoCustomize(CommonUtil.b(str, 16));
                        break;
                    case 29:
                        watchFaceParamsResult.setSupportAlbumFunctionExpansion(CommonUtil.b(str, 16));
                        break;
                    case 30:
                        watchFaceParamsResult.setSupportWatchfaceCapability(WatchFaceUtil.hexToIntList(str));
                        break;
                    default:
                        LogUtil.j(TAG, "handleDeviceInfoTlv default type:", Integer.valueOf(i));
                        break;
                }
                break;
        }
    }

    public int getDeviceWidth() {
        return this.mDeviceWidth;
    }

    public int getDeviceHeight() {
        return this.mDeviceHeight;
    }

    private static Object getCommandCallbackCallbackList() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (WatchFaceDeviceService.class) {
            map = sCommandCallbacks;
        }
        return map;
    }

    public void getDeviceInfo() {
        String str = (eeq.d(1) + eeq.d(0)) + (eeq.d(2) + eeq.d(0)) + (eeq.d(3) + eeq.d(0)) + (eeq.d(4) + eeq.d(0)) + (eeq.d(5) + eeq.d(0));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a(TAG, "getDeviceInfo, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    private void getDeviceWatchInfo() {
        String str = eeq.d(1) + eeq.d(0);
        int i = CommonUtil.cl() ? 2 : 1;
        if (Utils.o() && !TextUtils.equals("CN", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode())) {
            i = 3;
        }
        String str2 = str + (eeq.d(6) + eeq.d(1) + eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        LogUtil.a(TAG, "getDeviceWatchInfo, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    private void reportAck(WatchFaceIdReportInfo watchFaceIdReportInfo, int i) {
        if (i != 100000) {
            LogUtil.a(TAG, "reportAck fail errorCode:", Integer.valueOf(i));
            return;
        }
        String strA = eeq.a(watchFaceIdReportInfo.getWatchFaceId());
        String str = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String strA2 = eeq.a(watchFaceIdReportInfo.getWatchFaceVersion());
        String str2 = str + (eeq.d(2) + eeq.d(strA2.length() / 2) + strA2) + (eeq.d(127) + eeq.d(4) + eeq.c(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(5);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        LogUtil.a(TAG, "reportACK, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    private void sendGetNameCommand(List<String> list, int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        StringBuilder sb = new StringBuilder(20);
        for (String str2 : list) {
            String str3 = eeq.d(4) + eeq.d(eeq.a(str2).length() / 2) + eeq.a(str2);
            sb.append(eeq.d(131) + eeq.d(str3.length() / 2) + str3);
        }
        String str4 = str + (eeq.d(130) + eeq.b(sb.length() / 2) + ((Object) sb));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(6);
        deviceCommand.setDataContent(eeq.c(str4));
        deviceCommand.setDataLen(eeq.c(str4).length);
        LogUtil.a(TAG, "sendGetNameCommand, deviceCommand:", deviceCommand.toString());
        this.mDeviceConfigManager.c(deviceCommand);
    }

    public void queryWatchStatus(IBaseResponseCallback iBaseResponseCallback) {
        registerWatchFaceCallback(iBaseResponseCallback, 2);
        getDeviceWatchInfo();
    }

    public void applyWatchFace(String str, String str2, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        registerWatchFaceCallback(iBaseResponseCallback, 3);
        if (z) {
            OperateWatchFaceService.getInstance().sendApplySyncWatchFaceCommand(str, str2);
        } else {
            OperateWatchFaceService.getInstance().sendApplyWatchFaceCommand(str, str2);
        }
    }

    public void deleteWatchFace(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        registerWatchFaceCallback(iBaseResponseCallback, 3);
        OperateWatchFaceService.getInstance().sendDeleteWatchFaceCommand(str, str2);
    }

    private void registerWatchFaceCallback(IBaseResponseCallback iBaseResponseCallback, int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "registerWatchFaceCallback enter, command is 5.39.", Integer.valueOf(i));
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(i));
                if (list == null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "command 5.39.", Integer.valueOf(i), " have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(Integer.valueOf(i), arrayList);
                } else {
                    LogUtil.a(TAG, "command 5.39.", Integer.valueOf(i), " have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
    }

    public void registerIdReportCb(String str, ResponseCallback<WatchFaceIdReportInfo> responseCallback) {
        this.sWatchFaceCallbackList.put(str, responseCallback);
    }

    public void unregisterIdReportCb(String str) {
        this.sWatchFaceCallbackList.remove(str);
    }

    public void unregisterMyWatchFaceCardCallback() {
        mMyWatchFaceCardCallback = null;
    }
}
