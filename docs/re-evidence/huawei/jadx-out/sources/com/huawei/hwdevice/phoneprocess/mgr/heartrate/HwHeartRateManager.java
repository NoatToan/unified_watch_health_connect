package com.huawei.hwdevice.phoneprocess.mgr.heartrate;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.HeartRateInfo;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync.HwWorkoutServiceAw70Manager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseLinkageUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.WorkoutTypeMapManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.remote.HwStressDataProvider;
import com.huawei.operation.ble.BleConstants;
import defpackage.cpl;
import defpackage.ecu;
import defpackage.eel;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.mjz;
import defpackage.mkf;
import defpackage.mxf;
import defpackage.nfo;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HwHeartRateManager implements ParserInterface {
    private static final String AM16_PRODUCT_ID = "6d5416d9-2167-41df-ab10-c492e152b44f";
    private static final String COM_HUAWEI_HEALTH = "com.huawei.health";
    private static final int DEFAULT_LENGTH = 1;
    private static final String DURATION = "duration";
    private static final int ERROR_PARAMS = 125001;
    private static final int ERROR_TYPE = 127;
    private static final int FIRST_LOCATION = 0;
    private static final int HEX_TO_BYTE = 2;
    private static final int HEX_TO_DECIMAL = 16;
    private static final String MAX_DURATION = "max_duration";
    private static final int MIN_SIZE = 0;
    private static final int MSG_CALIB_OPEN_TIMEOUT = 1;
    private static final int MSG_GAME_OPEN_TIMEOUT = 3;
    private static final int MSG_RELAX_OPEN_TIMEOUT = 2;
    private static final int MSG_STRESS_OPEN_TIMEOUT = 0;
    private static final String OPERATOR_TYPE = "operator_type";
    private static final int PLACEHOLDERS = 2;
    private static final String RESULT_CODE = "result_code";
    private static final String SCORE = "score";
    private static final int SECOND_TO_MILLISECOND = 1000;
    private static final int STATUS_RRI_CLOSE = 4;
    private static final int STRESS_SWITCH_OPEN_TIMEOUT_DELAY = 5000;
    private static final String TAG = "HwHeartRateManager";
    private static final int TLV_HEAD = 4;
    private static final String TYPE = "type";
    private static HwHeartRateManager sInstance = null;
    private static volatile boolean sIsHealthRriOpen = false;
    private boolean mHasReceiverDataStatus;
    private HeartRateStressHandler mHeartRateStressHandler;
    private String mProductId;
    private IBaseResponseCallback mRelaxAbortCallback;
    private IBaseResponseCallback mStressAbortCallback;
    private IBaseResponseCallback mStressCalibrationAbortCallback;
    private HandlerThread mStressHandlerThread;
    private static final Object NOTIFICATION_RRI_INFO_LOCK = new Object();
    private static final Object LOCK_OBJECT = new Object();
    private static final Object DEVICE_LIST_LOCK = new Object();
    private static List<IBaseResponseCallback> sCloseOrOpenReportSwitchCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sHeartRateStatusCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sDeviceHeartRateCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sStressStatusCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sDeviceStressCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sDevicePressCallbackList = new ArrayList(16);
    private static List<String> sKitHeartRateStatusCallerList = new ArrayList(16);
    private static List<String> sKitRriStatusCallerList = new ArrayList(16);
    private static Map<String, IBaseResponseCallback> sKitHeartRateCallbackList = new HashMap(16);
    private static Map<String, IBaseResponseCallback> sKitRriCallbackList = new HashMap(16);
    private int mLoudspeakerMuteStatus = 0;
    private Handler mHandler = new Handler();
    private List<Integer> mRriTimeGetterList = new ArrayList(16);
    private List<Integer> mRriList = new ArrayList(16);
    private List<Integer> mRriTimeList = new ArrayList(16);
    private List<Integer> mRealRriList = new ArrayList(16);
    private List<Integer> mRealTimeList = new ArrayList(16);
    private boolean mIsHealthHeartRateOpen = false;
    private int mSportType = -1;
    private IBaseResponseCallback mStressAlgorithmCallback = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a(HwHeartRateManager.TAG, "stressAlgorithmCallback onResponse");
            if (obj != null) {
                synchronized (HwHeartRateManager.DEVICE_LIST_LOCK) {
                    if (HwHeartRateManager.sDeviceStressCallbackList.size() != 0) {
                        LogUtil.a(HwHeartRateManager.TAG, "stressAlgorithmCallback onResponse sDeviceStressCallbackList back,objdata:", obj.toString());
                        ((IBaseResponseCallback) HwHeartRateManager.sDeviceStressCallbackList.get(0)).a(100000, nfo.a(obj, "notificationStressInfo"));
                    }
                }
                return;
            }
            LogUtil.j(HwHeartRateManager.TAG, "stressAlgorithmCallback onResponse object is null");
        }
    };
    private Runnable mRunnable = new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.2
        @Override // java.lang.Runnable
        public void run() {
            HwHeartRateManager.this.mHasReceiverDataStatus = false;
        }
    };

    private boolean isClose(int i) {
        return i == 2 || i == 5 || i == 10 || i == 3 || i == 6 || i == 11;
    }

    private HwHeartRateManager() {
        LogUtil.a(TAG, "enter HwHeartRateManager!");
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mStressHandlerThread = handlerThread;
        handlerThread.start();
        this.mHeartRateStressHandler = new HeartRateStressHandler(this.mStressHandlerThread.getLooper(), this);
    }

    public static HwHeartRateManager getInstance() {
        HwHeartRateManager hwHeartRateManager;
        synchronized (LOCK_OBJECT) {
            if (sInstance == null) {
                sInstance = new HwHeartRateManager();
            }
            hwHeartRateManager = sInstance;
        }
        return hwHeartRateManager;
    }

    public void setAw70LinkReportStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (LOCK_OBJECT) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, TAG);
            DeviceInfo deviceInfo = deviceList.size() != 0 ? deviceList.get(0) : null;
            if (deviceList.size() != 0 && deviceInfo != null) {
                LogUtil.a(TAG, "setRunPostureReportStatus enter");
                DeviceCommand deviceCommand = new DeviceCommand();
                deviceCommand.setServiceID(23);
                deviceCommand.setCommandID(15);
                deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                int i = jSONObject.getInt("status");
                int iOptInt = jSONObject.optInt(BleConstants.SPORT_TYPE, -1);
                String strD = eeq.d(i);
                String strB = eeq.b(1);
                String strD2 = eeq.d(1);
                StringBuilder sb = new StringBuilder(16);
                sb.append(strD2);
                sb.append(strB);
                sb.append(strD);
                this.mSportType = setSportType(iOptInt, sb);
                deviceCommand.setDataLen(sb.length() / 2);
                deviceCommand.setDataContent(eeq.c(sb.toString()));
                mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
                synchronized (DEVICE_LIST_LOCK) {
                    if (iBaseResponseCallback != null) {
                        sHeartRateStatusCallbackList.add(iBaseResponseCallback);
                    }
                }
                return;
            }
            LogUtil.j(TAG, "no device is connected.");
            iBaseResponseCallback.a(0, nfo.a(100001, "setAw70LinkReportStatus"));
        }
    }

    private int setSportType(int i, StringBuilder sb) {
        if (i == -1) {
            return 1;
        }
        Integer num = WorkoutTypeMapManager.getCloudWorkTypeMap().get(Integer.valueOf(i));
        int iIntValue = num != null ? num.intValue() : 1;
        sb.append(eeq.d(2));
        sb.append(eeq.d(1));
        sb.append(eeq.d(iIntValue));
        return iIntValue;
    }

    public void getAw70SupportSportType(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "getAw70SupportSportType callback is null.");
            return;
        }
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(BaseApplication.getContext());
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, TAG);
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            iBaseResponseCallback.a(100000, nfo.a(false, "getAw70SupportSportType"));
            return;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = hwDeviceMgrInterfaceE.queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), TAG);
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j(TAG, "getAw70SupportSportType, deviceCapabilityHashMaps is empty");
            iBaseResponseCallback.a(100000, nfo.a(false, "getAw70SupportSportType"));
            return;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null || !deviceCapability.isSupportWorkoutCapabilicy()) {
            iBaseResponseCallback.a(100000, nfo.a(false, "getAw70SupportSportType"));
        } else {
            getWorkoutBitmap(iBaseResponseCallback, 16);
        }
    }

    private void getWorkoutBitmap(final IBaseResponseCallback iBaseResponseCallback, final int i) {
        HwWorkoutServiceAw70Manager.getInstance().getWorkoutCapability(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                int i3 = i;
                boolean z = (iIntValue & i3) == i3;
                LogUtil.a(HwHeartRateManager.TAG, "isSupportSportType : ", Boolean.valueOf(z));
                iBaseResponseCallback.a(100000, nfo.a(Boolean.valueOf(z), "getAw70SupportSportType"));
            }
        });
    }

    public void setHeartRateReportStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        switchHeartRateDetection(2, jSONObject.getInt("status"), iBaseResponseCallback);
    }

    public void openOrCloseReport(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (LOCK_OBJECT) {
            int i = jSONObject.getInt(OPERATOR_TYPE);
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(18);
            String strD = eeq.d(i);
            String strB = eeq.b(1);
            String strD2 = eeq.d(1);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD2);
            sb.append(strB);
            sb.append(strD);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
            LogUtil.a(TAG, "Enter openOrCloseReport: ", Integer.valueOf(i), " 5.23.18:", deviceCommand.toString());
            synchronized (DEVICE_LIST_LOCK) {
                if (iBaseResponseCallback != null) {
                    sCloseOrOpenReportSwitchCallbackList.add(iBaseResponseCallback);
                }
            }
        }
    }

    public void setStressReportStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        if (jSONObject == null || iBaseResponseCallback == null) {
            LogUtil.j(TAG, "setStressReportStatus null");
            return;
        }
        LogUtil.a(TAG, "setStressReportStatus parameters :", jSONObject.toString());
        this.mProductId = jSONObject.optString("productId");
        int i = jSONObject.getInt("type");
        if (isClose(i) && AM16_PRODUCT_ID.equals(this.mProductId)) {
            parseRri(jSONObject);
        }
        cleanAbortCallback();
        LogUtil.a(TAG, "setStressReportStatus type: ", Integer.valueOf(i));
        switch (i) {
            case 1:
                processStressOpenCallback(jSONObject, iBaseResponseCallback);
                break;
            case 2:
                processStressClose(jSONObject);
                break;
            case 3:
                processStressAbort(getStressAbortCallback(iBaseResponseCallback));
                break;
            case 4:
                processCalibrationOpenCallback(jSONObject, iBaseResponseCallback);
                break;
            case 5:
                processCalibrationClose(jSONObject);
                break;
            case 6:
                processCalibrationAbort(getStressCalibAbortCallback(iBaseResponseCallback));
                break;
            case 7:
                getStressCalibrationFlag(this.mStressAlgorithmCallback);
                break;
            default:
                setStressReportSomeStatus(i, jSONObject, iBaseResponseCallback);
                break;
        }
    }

    private void setStressReportSomeStatus(int i, JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        if (i == 15) {
            processCheckConnected();
            return;
        }
        if (i != 16) {
            switch (i) {
                case 8:
                    HwStressDataProvider.c().d(8, (JSONObject) null, this.mStressAlgorithmCallback);
                    break;
                case 9:
                    processRelaxOpenCallback(jSONObject, iBaseResponseCallback);
                    break;
                case 10:
                    processRelaxClose(jSONObject);
                    break;
                case 11:
                    processRelaxAbort(getRelaxAbortCallback(iBaseResponseCallback));
                    break;
                default:
                    LogUtil.j(TAG, "setStressReportStatus default");
                    break;
            }
            return;
        }
        processRriValue(jSONObject);
    }

    private void processStressOpenCallback(JSONObject jSONObject, final IBaseResponseCallback iBaseResponseCallback) {
        processStressOpen(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (HwHeartRateManager.this.mHeartRateStressHandler != null && HwHeartRateManager.this.mHeartRateStressHandler.hasMessages(0)) {
                    HwHeartRateManager.this.mHeartRateStressHandler.removeMessages(0);
                }
                if (!(obj instanceof Integer)) {
                    LogUtil.j(HwHeartRateManager.TAG, "setStressReportStatus STRESS_OPEN object unsuitable");
                    return;
                }
                LogUtil.a(HwHeartRateManager.TAG, "stress open onResponse,objData :", obj.toString());
                int iIntValue = ((Integer) obj).intValue();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("type", 1);
                    if (iIntValue == 100000) {
                        jSONObject2.put("result_code", 0);
                    } else {
                        jSONObject2.put("result_code", 1);
                    }
                } catch (JSONException unused) {
                    LogUtil.e(HwHeartRateManager.TAG, "stress open fail");
                }
                LogUtil.a(HwHeartRateManager.TAG, "stress open callback data :", jSONObject2.toString());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(100000, nfo.a(jSONObject2.toString(), "setStressReportStatus"));
                } else {
                    LogUtil.j(HwHeartRateManager.TAG, "stress open callback is null");
                }
            }
        });
    }

    private void processStressClose(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", jSONObject.getInt("duration"));
        HwStressDataProvider.c().d(2, jSONObject2, this.mStressAlgorithmCallback);
        setR1OpenOrCloseStress(4, null);
    }

    private void processCalibrationOpenCallback(JSONObject jSONObject, final IBaseResponseCallback iBaseResponseCallback) {
        processCalibOpen(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (HwHeartRateManager.this.mHeartRateStressHandler != null && HwHeartRateManager.this.mHeartRateStressHandler.hasMessages(1)) {
                    HwHeartRateManager.this.mHeartRateStressHandler.removeMessages(1);
                }
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("type", 4);
                        if (iIntValue == 100000) {
                            jSONObject2.put("result_code", 0);
                        } else {
                            jSONObject2.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "calib open fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "calib open callback data :", jSONObject2.toString());
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 == null) {
                        LogUtil.j(HwHeartRateManager.TAG, "calib open callback is null");
                    } else {
                        iBaseResponseCallback2.a(100000, nfo.a(jSONObject2.toString(), "setStressReportStatus"));
                    }
                }
            }
        });
    }

    private void processCalibrationClose(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", jSONObject.getInt("duration"));
        HwStressDataProvider.c().d(5, jSONObject2, this.mStressAlgorithmCallback);
        setR1OpenOrCloseStress(4, null);
    }

    private void processRelaxOpenCallback(JSONObject jSONObject, final IBaseResponseCallback iBaseResponseCallback) {
        processRelaxOpen(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (HwHeartRateManager.this.mHeartRateStressHandler != null && HwHeartRateManager.this.mHeartRateStressHandler.hasMessages(2)) {
                    HwHeartRateManager.this.mHeartRateStressHandler.removeMessages(2);
                }
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("type", 9);
                        if (iIntValue == 100000) {
                            jSONObject2.put("result_code", 0);
                        } else {
                            jSONObject2.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "relax open fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "relax open callback data :", jSONObject2.toString());
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 == null) {
                        LogUtil.j(HwHeartRateManager.TAG, "relax open callback is null");
                    } else {
                        iBaseResponseCallback2.a(100000, nfo.a(jSONObject2.toString(), "setStressReportStatus"));
                    }
                }
            }
        });
    }

    private void processRelaxClose(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", jSONObject.getInt("duration"));
        HwStressDataProvider.c().d(10, jSONObject2, this.mStressAlgorithmCallback);
        setR1OpenOrCloseStress(4, null);
    }

    private void processGameOpenCallbck(JSONObject jSONObject, final IBaseResponseCallback iBaseResponseCallback) {
        processGameOpen(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (HwHeartRateManager.this.mHeartRateStressHandler != null && HwHeartRateManager.this.mHeartRateStressHandler.hasMessages(3)) {
                    HwHeartRateManager.this.mHeartRateStressHandler.removeMessages(3);
                }
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        if (iIntValue == 100000) {
                            jSONObject2.put("result_code", 0);
                        } else {
                            jSONObject2.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "game open fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "game open callback data :", jSONObject2.toString());
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(100000, nfo.a(jSONObject2.toString(), "setStressReportStatus"));
                    } else {
                        LogUtil.j(HwHeartRateManager.TAG, "game open callback is null");
                    }
                }
            }
        });
    }

    private void processGameCloseCallback(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", jSONObject.getInt("duration"));
        jSONObject2.put("score", jSONObject.getInt("score"));
        setR1OpenOrCloseStress(4, null);
    }

    private void processGameAbortCallback(final IBaseResponseCallback iBaseResponseCallback) {
        processGameAbort(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (iIntValue == 100000) {
                            jSONObject.put("result_code", 0);
                        } else {
                            jSONObject.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "game abort fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "game abort callback data :", jSONObject.toString());
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(100000, nfo.a(jSONObject.toString(), "setStressReportStatus"));
                    } else {
                        LogUtil.j(HwHeartRateManager.TAG, "game abort callback is null");
                    }
                }
            }
        });
    }

    private void processCheckConnected() throws JSONException {
        DeviceInfo currentConnectedDeviceInfo = getCurrentConnectedDeviceInfo();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 15);
        if (currentConnectedDeviceInfo != null) {
            LogUtil.a(TAG, "productType :", Integer.valueOf(currentConnectedDeviceInfo.getProductType()));
            Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, currentConnectedDeviceInfo.getDeviceIdentify(), TAG);
            DeviceCapability deviceCapability = new DeviceCapability();
            if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
                deviceCapability = mapQueryDeviceCapability.get(currentConnectedDeviceInfo.getDeviceIdentify());
            }
            if (deviceCapability == null) {
                LogUtil.j(TAG, "deviceCapability is null!");
            }
            if (currentConnectedDeviceInfo.getProductType() == 11 && deviceCapability != null && deviceCapability.isSupportStressInfo()) {
                LogUtil.a(TAG, "check connected success!");
                jSONObject.put("result_code", 0);
            } else {
                jSONObject.put("result_code", 1);
            }
        } else {
            jSONObject.put("result_code", 1);
        }
        IBaseResponseCallback iBaseResponseCallback = this.mStressAlgorithmCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, jSONObject.toString());
        }
    }

    private void processRriValue(JSONObject jSONObject) throws JSONException {
        this.mRealRriList.clear();
        this.mRealTimeList.clear();
        String string = jSONObject.getString("listrri");
        String string2 = jSONObject.getString("listtime");
        this.mRealRriList.addAll(stringToList(string));
        this.mRealTimeList.addAll(stringToList(string2));
        int[] iArrListToArryOfRri = listToArryOfRri(this.mRealRriList);
        int[] iArrListToArryOfRri2 = listToArryOfRri(this.mRealTimeList);
        LogUtil.a(TAG, "processRriValue arrayRri size :", Integer.valueOf(iArrListToArryOfRri.length), ", arrayTime size :", Integer.valueOf(iArrListToArryOfRri2.length));
        if (iArrListToArryOfRri.length == 0) {
            int[] iArr = {0};
            HwStressDataProvider.c().e(iArr, iArr);
        } else {
            HwStressDataProvider.c().e(iArrListToArryOfRri, iArrListToArryOfRri2);
        }
    }

    private IBaseResponseCallback getStressAbortCallback(final IBaseResponseCallback iBaseResponseCallback) {
        IBaseResponseCallback iBaseResponseCallback2 = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 3);
                        if (iIntValue == 100000) {
                            jSONObject.put("result_code", 0);
                        } else {
                            jSONObject.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "stress abort fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "stress abort callback data:", jSONObject.toString());
                    IBaseResponseCallback iBaseResponseCallback3 = iBaseResponseCallback;
                    if (iBaseResponseCallback3 == null) {
                        LogUtil.j(HwHeartRateManager.TAG, "stress abort callback is null");
                    } else {
                        iBaseResponseCallback3.a(100000, nfo.a(jSONObject.toString(), "setStressReportStatus"));
                    }
                }
            }
        };
        this.mStressAbortCallback = iBaseResponseCallback2;
        return iBaseResponseCallback2;
    }

    private IBaseResponseCallback getStressCalibAbortCallback(final IBaseResponseCallback iBaseResponseCallback) {
        IBaseResponseCallback iBaseResponseCallback2 = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 6);
                        if (iIntValue == 100000) {
                            jSONObject.put("result_code", 0);
                        } else {
                            jSONObject.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "calib abort fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "calib abort callback data:", jSONObject.toString());
                    IBaseResponseCallback iBaseResponseCallback3 = iBaseResponseCallback;
                    if (iBaseResponseCallback3 == null) {
                        LogUtil.j(HwHeartRateManager.TAG, "calib abort callback is null");
                    } else {
                        iBaseResponseCallback3.a(100000, nfo.a(jSONObject.toString(), "setStressReportStatus"));
                    }
                }
            }
        };
        this.mStressCalibrationAbortCallback = iBaseResponseCallback2;
        return iBaseResponseCallback2;
    }

    private IBaseResponseCallback getRelaxAbortCallback(final IBaseResponseCallback iBaseResponseCallback) {
        IBaseResponseCallback iBaseResponseCallback2 = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 11);
                        if (iIntValue == 100000) {
                            jSONObject.put("result_code", 0);
                        } else {
                            jSONObject.put("result_code", 1);
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(HwHeartRateManager.TAG, "relax abort fail");
                    }
                    LogUtil.a(HwHeartRateManager.TAG, "relax abort callback data:", jSONObject.toString());
                    IBaseResponseCallback iBaseResponseCallback3 = iBaseResponseCallback;
                    if (iBaseResponseCallback3 == null) {
                        LogUtil.j(HwHeartRateManager.TAG, "relax abort callback is null");
                    } else {
                        iBaseResponseCallback3.a(100000, nfo.a(jSONObject.toString(), "setStressReportStatus"));
                    }
                }
            }
        };
        this.mRelaxAbortCallback = iBaseResponseCallback2;
        return iBaseResponseCallback2;
    }

    private void cleanAbortCallback() {
        synchronized (DEVICE_LIST_LOCK) {
            IBaseResponseCallback iBaseResponseCallback = this.mRelaxAbortCallback;
            if (iBaseResponseCallback != null && sStressStatusCallbackList.contains(iBaseResponseCallback)) {
                LogUtil.a(TAG, "remove(mRelaxAbortCallback)");
                sStressStatusCallbackList.remove(this.mRelaxAbortCallback);
                this.mRelaxAbortCallback = null;
            }
            IBaseResponseCallback iBaseResponseCallback2 = this.mStressCalibrationAbortCallback;
            if (iBaseResponseCallback2 != null && sStressStatusCallbackList.contains(iBaseResponseCallback2)) {
                LogUtil.a(TAG, "remove(mStressCalibrationAbortCallback)");
                sStressStatusCallbackList.remove(this.mStressCalibrationAbortCallback);
                this.mStressCalibrationAbortCallback = null;
            }
            IBaseResponseCallback iBaseResponseCallback3 = this.mStressAbortCallback;
            if (iBaseResponseCallback3 != null && sStressStatusCallbackList.contains(iBaseResponseCallback3)) {
                LogUtil.a(TAG, "remove(mStressAbortCallback)");
                sStressStatusCallbackList.remove(this.mStressAbortCallback);
                this.mStressAbortCallback = null;
            }
        }
    }

    private void parseRri(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rri");
        this.mRealRriList.clear();
        this.mRealTimeList.clear();
        String strOptString = jSONObjectOptJSONObject.optString("listrri");
        String strOptString2 = jSONObjectOptJSONObject.optString("listtime");
        this.mRealRriList.addAll(stringToList(strOptString));
        this.mRealTimeList.addAll(stringToList(strOptString2));
        LogUtil.a(TAG, "arrayRri size :", Integer.valueOf(this.mRealRriList.size()), ", arraytime size :", Integer.valueOf(this.mRealTimeList.size()));
    }

    private List<Integer> stringToList(String str) {
        ArrayList arrayList = new ArrayList(16);
        if (!TextUtils.isEmpty(str) && str.contains(",")) {
            for (String str2 : str.split(",")) {
                arrayList.add(Integer.valueOf(CommonUtil.b(str2, 10)));
            }
        }
        return arrayList;
    }

    private void processStressOpen(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "stress open");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(MAX_DURATION, jSONObject.getInt(MAX_DURATION));
        } catch (JSONException unused) {
            LogUtil.e(TAG, "processStressOpen stress open fail");
        }
        HwStressDataProvider.c().d(1, jSONObject2, (IBaseResponseCallback) null);
        setR1OpenOrCloseStress(3, iBaseResponseCallback);
        if (this.mHeartRateStressHandler == null || AM16_PRODUCT_ID.equals(this.mProductId)) {
            return;
        }
        this.mHeartRateStressHandler.sendEmptyMessageDelayed(0, 5000L);
    }

    private void processStressAbort(IBaseResponseCallback iBaseResponseCallback) {
        HwStressDataProvider.c().d(3, (JSONObject) null, (IBaseResponseCallback) null);
        setR1OpenOrCloseStress(4, iBaseResponseCallback);
    }

    private void processCalibOpen(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("score", jSONObject.getInt("score"));
            jSONObject2.put(MAX_DURATION, jSONObject.getInt(MAX_DURATION));
        } catch (JSONException unused) {
            LogUtil.e(TAG, "processCalibOpen calib open fail");
        }
        HwStressDataProvider.c().d(4, jSONObject2, (IBaseResponseCallback) null);
        if (this.mHeartRateStressHandler != null && !AM16_PRODUCT_ID.equals(this.mProductId)) {
            this.mHeartRateStressHandler.sendEmptyMessageDelayed(1, 5000L);
        }
        setR1OpenOrCloseStress(3, iBaseResponseCallback);
    }

    private void processCalibrationAbort(IBaseResponseCallback iBaseResponseCallback) {
        HwStressDataProvider.c().d(6, (JSONObject) null, (IBaseResponseCallback) null);
        setR1OpenOrCloseStress(4, iBaseResponseCallback);
    }

    private void processRelaxOpen(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(MAX_DURATION, jSONObject.getInt(MAX_DURATION));
        } catch (JSONException unused) {
            LogUtil.e(TAG, "processRelaxOpen relax open fail");
        }
        HwStressDataProvider.c().d(9, jSONObject2, (IBaseResponseCallback) null);
        if (this.mHeartRateStressHandler != null && !AM16_PRODUCT_ID.equals(this.mProductId)) {
            this.mHeartRateStressHandler.sendEmptyMessageDelayed(2, 5000L);
        }
        setR1OpenOrCloseStress(3, iBaseResponseCallback);
    }

    private void processRelaxAbort(IBaseResponseCallback iBaseResponseCallback) {
        HwStressDataProvider.c().d(11, (JSONObject) null, (IBaseResponseCallback) null);
        setR1OpenOrCloseStress(4, iBaseResponseCallback);
    }

    private void processGameOpen(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        try {
            new JSONObject().put(MAX_DURATION, jSONObject.getInt(MAX_DURATION));
        } catch (JSONException unused) {
            LogUtil.e(TAG, "processGameOpen game open fail");
        }
        if (this.mHeartRateStressHandler != null && !AM16_PRODUCT_ID.equals(this.mProductId)) {
            this.mHeartRateStressHandler.sendEmptyMessageDelayed(3, 5000L);
        }
        setR1OpenOrCloseStress(3, iBaseResponseCallback);
    }

    private void processGameAbort(IBaseResponseCallback iBaseResponseCallback) {
        setR1OpenOrCloseStress(4, iBaseResponseCallback);
    }

    private void getStressCalibrationFlag(IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        int iN;
        String sharedPreference = getSharedPreference("calibration_flag");
        if (TextUtils.isEmpty(sharedPreference)) {
            iN = 1;
        } else {
            LogUtil.a(TAG, "calibrationFlagStr :", sharedPreference);
            iN = CommonUtil.n(BaseApplication.getContext(), sharedPreference);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 7);
        jSONObject.put("calibration_flag", iN);
        LogUtil.a(TAG, "stress calib check ret data :", jSONObject.toString());
        iBaseResponseCallback.a(0, jSONObject.toString());
    }

    private String getSharedPreference(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), str);
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class HeartRateStressHandler extends Handler {
        private WeakReference<HwHeartRateManager> hwHeartRateManagerWeakReference;

        HeartRateStressHandler(Looper looper, HwHeartRateManager hwHeartRateManager) {
            super(looper);
            this.hwHeartRateManagerWeakReference = new WeakReference<>(hwHeartRateManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j(HwHeartRateManager.TAG, "handleMessage message is null");
                return;
            }
            HwHeartRateManager hwHeartRateManager = this.hwHeartRateManagerWeakReference.get();
            if (hwHeartRateManager == null) {
                LogUtil.j(HwHeartRateManager.TAG, "handleMessage hwHeartRateManager is null");
                return;
            }
            super.handleMessage(message);
            LogUtil.a(HwHeartRateManager.TAG, "handleMessage message.what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                handleStressOpenTimeout(hwHeartRateManager);
                return;
            }
            if (i == 1) {
                handleClibOpenTimeout(hwHeartRateManager);
            } else if (i != 2) {
                LogUtil.j(HwHeartRateManager.TAG, "handleMessage no case");
            } else {
                handleRelaxOpenTimeout(hwHeartRateManager, 9);
            }
        }

        private void handleGameOpenTimeout(HwHeartRateManager hwHeartRateManager, int i) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", i);
                jSONObject.put("result_code", 1);
            } catch (JSONException unused) {
                LogUtil.e(HwHeartRateManager.TAG, "stress open timeout");
            }
            if (hwHeartRateManager.mStressAlgorithmCallback != null) {
                hwHeartRateManager.mStressAlgorithmCallback.a(0, jSONObject.toString());
            }
        }

        private void handleRelaxOpenTimeout(HwHeartRateManager hwHeartRateManager, int i) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", i);
                jSONObject.put("result_code", 1);
            } catch (JSONException unused) {
                LogUtil.e(HwHeartRateManager.TAG, "calib open timeout");
            }
            if (hwHeartRateManager.mStressAlgorithmCallback != null) {
                hwHeartRateManager.mStressAlgorithmCallback.a(0, jSONObject.toString());
            }
        }

        private void handleClibOpenTimeout(HwHeartRateManager hwHeartRateManager) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 4);
                jSONObject.put("result_code", 1);
            } catch (JSONException unused) {
                LogUtil.e(HwHeartRateManager.TAG, "calib open timeout");
            }
            if (hwHeartRateManager.mStressAlgorithmCallback != null) {
                hwHeartRateManager.mStressAlgorithmCallback.a(0, jSONObject.toString());
            }
        }

        private void handleStressOpenTimeout(HwHeartRateManager hwHeartRateManager) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("result_code", 1);
            } catch (JSONException unused) {
                LogUtil.e(HwHeartRateManager.TAG, "stress open timeout");
            }
            if (hwHeartRateManager.mStressAlgorithmCallback != null) {
                hwHeartRateManager.mStressAlgorithmCallback.a(0, jSONObject.toString());
            }
        }
    }

    public void setHeartRateResponse(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d(TAG, "response of HeartRate info");
        if (jSONObject == null || iBaseResponseCallback == null) {
            LogUtil.j(TAG, "setHeartRateResponse null");
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(25);
            deviceCommand.setCommandID(3);
            try {
                String strC = eeq.c(jSONObject.getInt("heart_rate_response"));
                String strD = eeq.d(strC.length() / 2);
                String strD2 = eeq.d(127);
                StringBuilder sb = new StringBuilder(16);
                sb.append(strD2);
                sb.append(strD);
                sb.append(strC);
                deviceCommand.setDataLen(sb.length() / 2);
                deviceCommand.setDataContent(eeq.c(sb.toString()));
                mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
                iBaseResponseCallback.a(100000, nfo.a("success", "setHeartRateResponse"));
            } catch (JSONException unused) {
                LogUtil.e(TAG, "setHeartRateResponse JSONException");
            }
        }
    }

    public void registerNotificationHeartRateCallback(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (DEVICE_LIST_LOCK) {
            if (iBaseResponseCallback != null) {
                if (!sDeviceHeartRateCallbackList.contains(iBaseResponseCallback)) {
                    sDeviceHeartRateCallbackList.add(iBaseResponseCallback);
                    return;
                }
            }
            LogUtil.j(TAG, "registerNotificationHeartRateCallback add callback failed");
        }
    }

    public void registerNotificationStressCallback(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "registerNotificationStressCallback");
        synchronized (DEVICE_LIST_LOCK) {
            if (iBaseResponseCallback != null) {
                if (!sDeviceStressCallbackList.contains(iBaseResponseCallback)) {
                    sDeviceStressCallbackList.add(iBaseResponseCallback);
                    return;
                }
            }
            LogUtil.j(TAG, "registerNotificationStressCallback add callback failed");
        }
    }

    public void registerNotificationPressCallback(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "registerNotificationPressCallback start");
        synchronized (DEVICE_LIST_LOCK) {
            if (iBaseResponseCallback != null) {
                if (!sDevicePressCallbackList.contains(iBaseResponseCallback)) {
                    LogUtil.a(TAG, "registerNotificationPressCallback add success");
                    sDevicePressCallbackList.add(iBaseResponseCallback);
                    return;
                }
            }
            LogUtil.j(TAG, "registerNotificationPressCallback add callback failed");
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || eet.e(bArr)) {
            LogUtil.j(TAG, "getResult isTimeout");
            return;
        }
        cpl.d(TAG, bArr, "getResult(): ");
        String strE = eeq.e(bArr);
        if (strE.length() <= 4) {
            LogUtil.e(TAG, "getResult received tlv error");
            return;
        }
        try {
            ees eesVarB = new eet().b(strE.substring(4));
            List<eew> listE = eesVarB.e();
            List<ees> listB = eesVarB.b();
            byte b2 = bArr[1];
            if (b2 == 1) {
                handleRemindResult(listE);
                return;
            }
            if (b2 == 2) {
                LogUtil.a(TAG, "getResult COMMAND_ID_GET_HEART_RATE_INFO");
                return;
            }
            if (b2 == 3) {
                handleHeartRateNotice(listB, deviceInfo);
                return;
            }
            if (b2 == 4) {
                handleRriResult(bArr, listB);
                return;
            }
            if (b2 == 5) {
                handleRriNotice(bArr, listE, listB);
                return;
            }
            if (b2 == 16) {
                handleRunPostureData(listB);
            } else if (b2 != 18) {
                LogUtil.j(TAG, "getResult default");
            } else {
                handleRecordRequestReport(listE);
            }
        } catch (eeu unused) {
            LogUtil.e(TAG, "getResult TlvException");
        }
    }

    private void handleRemindResult(List<eew> list) {
        if (list == null) {
            LogUtil.j(TAG, "handleRemindResult tlvList is null");
            return;
        }
        int iV = 0;
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 127) {
                iV = CommonUtil.v(eewVar.b());
            } else {
                LogUtil.j(TAG, "handleRemindResult default");
            }
        }
        Object obj = DEVICE_LIST_LOCK;
        synchronized (obj) {
            if (sHeartRateStatusCallbackList.size() != 0) {
                sHeartRateStatusCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "setHeartRateReportStatus"));
                sHeartRateStatusCallbackList.remove(0);
            }
        }
        synchronized (obj) {
            if (sStressStatusCallbackList.size() != 0) {
                sStressStatusCallbackList.get(0).a(0, Integer.valueOf(iV));
                sStressStatusCallbackList.remove(0);
            }
        }
    }

    private void handleRunPostureData(List<ees> list) {
        LogUtil.a(TAG, "handleRunPostureData enter");
        Map<String, Object> linkageData = HwExerciseLinkageUtil.parseLinkageData(list, this.mSportType);
        synchronized (DEVICE_LIST_LOCK) {
            if (sDeviceHeartRateCallbackList.size() != 0) {
                if (linkageData == null) {
                    sDeviceHeartRateCallbackList.get(0).a(100001, "");
                } else {
                    sDeviceHeartRateCallbackList.get(0).a(100000, linkageData);
                }
            }
        }
    }

    private void handleHeartRateNotice(List<ees> list, DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        String str = "";
        if (deviceInfo != null) {
            str = deviceInfo.getSecurityUuid() + "#ANDROID21";
        }
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                HeartRateInfo heartRateInfo = new HeartRateInfo();
                heartRateInfo.setUuid(str);
                configHeartRateNotice(listE, heartRateInfo);
                sendRefreshHeartRateBroadcast(heartRateInfo);
                arrayList.add(heartRateInfo);
            }
        }
        synchronized (DEVICE_LIST_LOCK) {
            if (sDeviceHeartRateCallbackList.size() != 0) {
                sDeviceHeartRateCallbackList.get(0).a(100000, nfo.a(arrayList, "notificationHeartRateInfo"));
            }
            Iterator<Map.Entry<String, IBaseResponseCallback>> it3 = sKitHeartRateCallbackList.entrySet().iterator();
            while (it3.hasNext()) {
                IBaseResponseCallback value = it3.next().getValue();
                if (value != null) {
                    value.a(100000, nfo.a(arrayList, "notificationHeartRateInfo"));
                }
            }
        }
    }

    private void configHeartRateNotice(List<eew> list, HeartRateInfo heartRateInfo) {
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 3) {
                heartRateInfo.setHeartRateQualityInfo(CommonUtil.v(eewVar.b()));
            } else if (iV == 4) {
                heartRateInfo.setTimeInfo(CommonUtil.x(eewVar.b()) * 1000);
            } else if (iV == 5) {
                LogUtil.d(TAG, "configHeartRateNotice has credibility");
                heartRateInfo.setHeartRateCredibility(CommonUtil.v(eewVar.b()));
            } else {
                LogUtil.d(TAG, "handleHeartRateNotice default");
            }
        }
    }

    private void handleRriResult(byte[] bArr, List<ees> list) {
        cpl.d(TAG, bArr, "original data: ");
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                HeartRateInfo heartRateInfo = new HeartRateInfo();
                Iterator<eew> it3 = listE.iterator();
                while (it3.hasNext()) {
                    parseHeartRateTlv(it3.next(), heartRateInfo);
                }
            }
        }
    }

    private void handleRriNotice(byte[] bArr, List<eew> list, List<ees> list2) {
        IBaseResponseCallback value;
        synchronized (NOTIFICATION_RRI_INFO_LOCK) {
            cpl.d(TAG, bArr, "5.25.5 orignal data: ");
            List<IBaseResponseCallback> list3 = sDevicePressCallbackList;
            if (list3 != null && list3.size() != 0) {
                for (IBaseResponseCallback iBaseResponseCallback : sDevicePressCallbackList) {
                    if (iBaseResponseCallback == null) {
                        LogUtil.j(TAG, "5.25.5 callback is null");
                        break;
                    } else if (!sIsHealthRriOpen) {
                        LogUtil.j(TAG, "5.25.5 is close");
                        break;
                    } else if (parseRriTlvCallback(list, list2, iBaseResponseCallback)) {
                        break;
                    }
                }
            } else {
                LogUtil.j(TAG, "no set callback about 5.25.5");
            }
            Iterator<Map.Entry<String, IBaseResponseCallback>> it = sKitRriCallbackList.entrySet().iterator();
            while (it.hasNext() && ((value = it.next().getValue()) == null || !parseRriTlvCallback(list, list2, value))) {
            }
        }
    }

    private void handleRecordRequestReport(List<eew> list) {
        if (list.size() == 0 || list.get(0) == null) {
            LogUtil.j(TAG, "handleRecordRequestReport tlv error");
            return;
        }
        int iV = CommonUtil.v(list.get(0).b());
        synchronized (DEVICE_LIST_LOCK) {
            if (sCloseOrOpenReportSwitchCallbackList.size() != 0) {
                sCloseOrOpenReportSwitchCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "setOperator"));
                sCloseOrOpenReportSwitchCallbackList.remove(0);
            }
        }
    }

    private boolean parseRriTlvCallback(List<eew> list, List<ees> list2, IBaseResponseCallback iBaseResponseCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (eew eewVar : list) {
                LogUtil.d(TAG, "5.25.5 parse tlv.value :", eewVar.b());
                if (isRriTlvErrorCode(iBaseResponseCallback, jSONObject, eewVar)) {
                    return true;
                }
            }
            LogUtil.a(TAG, "5.25.5 create rrl_list : init create");
            parseRriMessage(list2, jSONObject);
            iBaseResponseCallback.a(0, nfo.a(jSONObject.toString(), "registerNotificationPressCallBack"));
        } catch (JSONException unused) {
            iBaseResponseCallback.a(ERROR_PARAMS, nfo.a("param is error", "registerNotificationPressCallBack"));
        }
        return false;
    }

    private void parseRriMessage(List<ees> list, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                LogUtil.a(TAG, "5.25.5 struct : init create");
                JSONObject jSONObject2 = new JSONObject();
                Iterator<eew> it3 = listE.iterator();
                while (it3.hasNext()) {
                    dealRriTypeMessage(jSONObject2, it3.next());
                }
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("rri_list", jSONArray);
        LogUtil.a(TAG, "5.25.5 RRI result :", jSONObject.toString());
    }

    private void dealRriTypeMessage(JSONObject jSONObject, eew eewVar) throws JSONException {
        LogUtil.a(TAG, "dealRriTypeMessage tag:", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
        int i = Integer.parseInt(eewVar.e(), 16);
        if (i == 4) {
            jSONObject.put("rri_value", CommonUtil.v(eewVar.b()));
        } else if (i == 5) {
            jSONObject.put("rri_sqi", CommonUtil.v(eewVar.b()));
        } else {
            LogUtil.j(TAG, "5.25.5 parse default");
        }
    }

    private boolean isRriTlvErrorCode(IBaseResponseCallback iBaseResponseCallback, JSONObject jSONObject, eew eewVar) throws JSONException {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 1) {
            jSONObject.put("rri_time", CommonUtil.x(eewVar.b()));
            return false;
        }
        if (iV == 127) {
            int iV2 = CommonUtil.v(eewVar.b());
            LogUtil.a(TAG, "5.25.5 device push err code :", Integer.valueOf(iV2));
            iBaseResponseCallback.a(iV2, nfo.a("device test error", "registerNotificationPressCallBack"));
            return true;
        }
        if (iV == 6) {
            jSONObject.put("rri_intensity", CommonUtil.v(eewVar.b()));
            return false;
        }
        if (iV == 7) {
            jSONObject.put("rri_acc_state", CommonUtil.v(eewVar.b()));
            return false;
        }
        if (iV == 8) {
            jSONObject.put("rri_motion_state", CommonUtil.v(eewVar.b()));
            return false;
        }
        LogUtil.j(TAG, "5.25.5 parse default :", eewVar.b());
        return false;
    }

    private void sendRefreshHeartRateBroadcast(HeartRateInfo heartRateInfo) {
        LogUtil.a(TAG, "enter sendRefreshHeartRateBroadcast");
        if (nfo.b(ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, TAG))) {
            this.mHasReceiverDataStatus = true;
            this.mHandler.removeCallbacks(this.mRunnable);
            this.mHandler.postDelayed(this.mRunnable, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            LogUtil.a(TAG, "sendUpdateHeartRateBroadcast.");
            Intent intent = new Intent();
            intent.setAction("com.huawei.bone.action.HEART_RATE_REFRESH");
            intent.setPackage(BaseApplication.getContext().getPackageName());
            intent.putExtra(ObserveLabels.HEART_RATE, heartRateInfo.getHeartRateQualityInfo());
            BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
        }
    }

    public void remindSwitchHeartRateForKit(int i, int i2, IBaseResponseCallback iBaseResponseCallback, String str) {
        synchronized (LOCK_OBJECT) {
            int iHandleCallback = handleCallback(i2, str);
            LogUtil.a(TAG, "Enter openOrCloseHeartRateForKit isLoudspeakerMute :", Integer.valueOf(i), ";openOrClose :", Integer.valueOf(i2), " handleCallback openOrClose :", Integer.valueOf(iHandleCallback));
            dealOpenOrCloseHeartRate(i, iHandleCallback, iBaseResponseCallback);
        }
    }

    public void registerKitHeartRateCallback(String str, IBaseResponseCallback iBaseResponseCallback) {
        sKitHeartRateCallbackList.put(str, iBaseResponseCallback);
    }

    public void unregisterKitHeartRateCallback(String str) {
        if (sKitHeartRateCallbackList.containsKey(str)) {
            sKitHeartRateCallbackList.remove(str);
        }
    }

    public void registerKitRriCallback(String str, IBaseResponseCallback iBaseResponseCallback) {
        sKitRriCallbackList.put(str, iBaseResponseCallback);
    }

    public void unregisterKitRriCallback(String str) {
        if (sKitRriCallbackList.containsKey(str)) {
            sKitRriCallbackList.remove(str);
        }
    }

    public void switchHeartRateDetection(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (LOCK_OBJECT) {
            int iHandleCallback = handleCallback(i2, "com.huawei.health");
            LogUtil.a(TAG, "Enter switchHeartRateDetection isLoudspeakerMute: ", Integer.valueOf(i), " openOrClose: ", Integer.valueOf(i2), " handleCallback openOrClose: ", Integer.valueOf(iHandleCallback));
            dealOpenOrCloseHeartRate(i, iHandleCallback, iBaseResponseCallback);
        }
    }

    private void dealOpenOrCloseHeartRate(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        if (i == 1 && this.mHasReceiverDataStatus && this.mLoudspeakerMuteStatus == 2 && !mjz.c().j()) {
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(25);
        deviceCommand.setCommandID(1);
        String strD = eeq.d(i2);
        String strB = eeq.b(1);
        String strD2 = eeq.d(1);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        if (nfo.b(ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, TAG))) {
            String strD3 = eeq.d(2);
            String strB2 = eeq.b(1);
            String strD4 = eeq.d(i);
            sb.append(strD3);
            sb.append(strB2);
            sb.append(strD4);
        }
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        this.mLoudspeakerMuteStatus = i;
        synchronized (DEVICE_LIST_LOCK) {
            if (iBaseResponseCallback != null) {
                sHeartRateStatusCallbackList.add(iBaseResponseCallback);
            }
        }
    }

    public void getWearDeviceConnectStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (LOCK_OBJECT) {
            DeviceInfo deviceInfo = null;
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG);
            LogUtil.a(TAG, "getWearDeviceConnectStatus() deviceList.size() :", Integer.valueOf(deviceList.size()));
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (deviceInfo2.getDeviceActiveState() == 1) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
            int deviceConnectState = deviceInfo != null ? deviceInfo.getDeviceConnectState() : 0;
            LogUtil.a(TAG, "getWearDeviceConnectStatus :", Integer.valueOf(deviceConnectState));
            iBaseResponseCallback.a(100000, nfo.a(Integer.valueOf(deviceConnectState), "getWearDeviceConnectStatus"));
        }
    }

    public void setR1OpenOrCloseStress(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "isR1OpenOrCloseStress openOrClose :", Integer.valueOf(i));
        if (i == 4) {
            synchronized (this) {
                int[] iArrListToArryOfRri = listToArryOfRri(this.mRealRriList);
                int[] iArrListToArryOfRri2 = listToArryOfRri(this.mRealTimeList);
                LogUtil.a(TAG, "arrayRri size :", Integer.valueOf(iArrListToArryOfRri.length), ", arraytime size :", Integer.valueOf(iArrListToArryOfRri2.length));
                HwStressDataProvider.c().e(iArrListToArryOfRri, iArrListToArryOfRri2);
            }
        }
        synchronized (this) {
            LogUtil.a(TAG, "clear mRriList list");
            this.mRriList.clear();
            this.mRriTimeList.clear();
            this.mRriTimeGetterList.clear();
            this.mRealRriList.clear();
            this.mRealTimeList.clear();
        }
        if (!AM16_PRODUCT_ID.equals(this.mProductId)) {
            switchHeartRateDetection(2, i, null);
        } else if (i != 4 || !AM16_PRODUCT_ID.equals(this.mProductId)) {
            LogUtil.j(TAG, "setR1OpenOrCloseStress enter else branch");
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, 100000);
        }
        synchronized (DEVICE_LIST_LOCK) {
            if (iBaseResponseCallback != null) {
                sStressStatusCallbackList.add(iBaseResponseCallback);
            }
        }
    }

    private int[] listToArryOfRri(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (list.get(i) instanceof Integer) {
                iArr[i] = ((Integer) list.get(i)).intValue();
            }
        }
        return iArr;
    }

    private DeviceInfo getCurrentConnectedDeviceInfo() {
        LogUtil.a(TAG, "getCurrentConnectedDeviceInfo() enter");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, TAG);
        if (deviceList.size() != 0) {
            LogUtil.a(TAG, "getCurrentConnectedDeviceInfo() deviceInfoList.size() :", Integer.valueOf(deviceList.size()));
            for (DeviceInfo deviceInfo : deviceList) {
                if (deviceInfo.getDeviceConnectState() == 2 && ("main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType()))) {
                    return deviceInfo;
                }
            }
            LogUtil.e(TAG, "getCurrentConnectedDeviceInfo() deviceInfo's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
            return null;
        }
        LogUtil.e(TAG, "getCurrentConnectedDeviceInfo() deviceInfoList is null");
        return null;
    }

    public void onDestroy() {
        LogUtil.a(TAG, "onDestroy");
        HandlerThread handlerThread = this.mStressHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mStressHandlerThread = null;
        }
        clearInstance();
    }

    private static void clearInstance() {
        synchronized (LOCK_OBJECT) {
            sInstance = null;
        }
    }

    private void parseHeartRateTlv(eew eewVar, HeartRateInfo heartRateInfo) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 1) {
            heartRateInfo.setTimeInfo(CommonUtil.x(eewVar.b()) * 1000);
            synchronized (this) {
                this.mRriTimeGetterList.add(Integer.valueOf((int) heartRateInfo.getTimeInfo()));
            }
        } else {
            if (iV != 4) {
                if (iV == 5) {
                    heartRateInfo.setHeartRateSqiInfo(CommonUtil.b(eewVar.b(), 16));
                    return;
                } else {
                    LogUtil.j(TAG, "no support info.");
                    return;
                }
            }
            heartRateInfo.setHrriInfo(CommonUtil.b(eewVar.b(), 16));
            synchronized (this) {
                if (heartRateInfo.getHrriInfo() > 0) {
                    configHeartRateInfo(heartRateInfo);
                }
            }
        }
    }

    private void configHeartRateInfo(HeartRateInfo heartRateInfo) {
        if (heartRateInfo.getHrriInfo() > 32768) {
            this.mRriList.add(Integer.valueOf(heartRateInfo.getHrriInfo() - 32768));
        } else {
            this.mRriList.add(Integer.valueOf(heartRateInfo.getHrriInfo()));
        }
        List<Integer> list = this.mRriTimeList;
        List<Integer> list2 = this.mRriTimeGetterList;
        int iIntValue = list2.get(list2.size() - 1).intValue();
        int iIntValue2 = this.mRriTimeGetterList.get(0).intValue();
        List<Integer> list3 = this.mRriList;
        list.add(Integer.valueOf((iIntValue - iIntValue2) + list3.get(list3.size() - 1).intValue()));
        if (heartRateInfo.getHrriInfo() > 32768) {
            List<Integer> list4 = this.mRealTimeList;
            List<Integer> list5 = this.mRriTimeGetterList;
            int iIntValue3 = list5.get(list5.size() - 1).intValue();
            int iIntValue4 = this.mRriTimeGetterList.get(0).intValue();
            List<Integer> list6 = this.mRriList;
            list4.add(Integer.valueOf((iIntValue3 - iIntValue4) + list6.get(list6.size() - 1).intValue()));
            if (this.mRriTimeList.size() == 1) {
                this.mRealRriList.add(Integer.valueOf(heartRateInfo.getHrriInfo() - 32768));
            }
            if (this.mRriTimeList.size() > 1) {
                List<Integer> list7 = this.mRealRriList;
                List<Integer> list8 = this.mRriTimeList;
                int iIntValue5 = list8.get(list8.size() - 1).intValue();
                List<Integer> list9 = this.mRriTimeList;
                list7.add(Integer.valueOf(iIntValue5 - list9.get(list9.size() - 2).intValue()));
            }
        }
    }

    public void sendEcgBlockList(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        if (jSONObject == null) {
            LogUtil.j(TAG, "");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
        }
        mxf.e(BaseApplication.getContext()).a(jSONObject, iBaseResponseCallback);
    }

    private int handleCallback(int i, String str) {
        if (i == 1) {
            startHeartRateSwitch(str);
            return i;
        }
        if (i == 2) {
            return stopHeartRateSwitch(i, str);
        }
        if (i == 3) {
            startPriSwitch(str);
            return i;
        }
        if (i == 4) {
            return stopPriSwitch(i, str);
        }
        LogUtil.j(TAG, "handleCallback default");
        return i;
    }

    private void startHeartRateSwitch(String str) {
        if ("com.huawei.health".equals(str)) {
            this.mIsHealthHeartRateOpen = true;
        } else {
            if (sKitHeartRateStatusCallerList.contains(str)) {
                return;
            }
            sKitHeartRateStatusCallerList.add(str);
        }
    }

    private int stopHeartRateSwitch(int i, String str) {
        if ("com.huawei.health".equals(str)) {
            this.mIsHealthHeartRateOpen = false;
        } else if (sKitHeartRateStatusCallerList.contains(str)) {
            sKitHeartRateStatusCallerList.remove(str);
        }
        if (this.mIsHealthHeartRateOpen || !sKitHeartRateStatusCallerList.isEmpty()) {
            return 1;
        }
        return i;
    }

    private static void setIsHealthRriOpenValue(boolean z) {
        sIsHealthRriOpen = z;
    }

    private void startPriSwitch(String str) {
        if ("com.huawei.health".equals(str)) {
            setIsHealthRriOpenValue(true);
        } else {
            if (sKitRriStatusCallerList.contains(str)) {
                return;
            }
            sKitRriStatusCallerList.add(str);
        }
    }

    private int stopPriSwitch(int i, String str) {
        if ("com.huawei.health".equals(str)) {
            setIsHealthRriOpenValue(false);
        } else if (sKitRriStatusCallerList.contains(str)) {
            sKitRriStatusCallerList.remove(str);
        }
        if (sIsHealthRriOpen || !sKitRriStatusCallerList.isEmpty()) {
            return 3;
        }
        return i;
    }
}
