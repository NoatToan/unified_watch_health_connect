package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.datatype.HeartRateInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ICallbackInterface;
import com.huawei.health.IRemoteProxyCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwLinkageServiceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwWorkoutServiceManager;
import com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IHeartRateStateAIDLCallback;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mjz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ICallbackInterface f41778c;
    private static e h;
    private static HwDeviceMgrInterface i;
    private ExecutorService f;
    private List<Integer> k;
    private Context l;
    private BroadcastReceiver m;
    private HiUnSubscribeListener n;
    private List<Integer> o;
    private ExecutorService p;
    private HiSubscribeListener q;
    private IRemoteProxyCallback r;
    private IBinder t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f41777b = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, ParserInterface> f41776a = new HashMap(16);
    private static String g = null;
    private static boolean j = false;
    private static Gson e = new Gson();
    private static IBaseResponseCallback d = new IBaseResponseCallback() { // from class: mjz.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i2, Object obj) {
            Map map;
            String string;
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = new HashMap();
            }
            map.put("code", Integer.valueOf(i2));
            if (map.get("funcName") == null) {
                string = "";
            } else {
                string = map.get("funcName").toString();
            }
            LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "retMap code:", Integer.valueOf(i2), ",funcName:", string);
            if ("registerGetRTSportDataListCallbackList".equals(string)) {
                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "workoutReportPlayData :", ((njw) peh.b(map.get("value").toString(), njw.class)).r());
            }
            if ("notificationHeartRateInfo".equals(string)) {
                List listC = peh.c(map.get("value").toString(), HeartRateInfo[].class);
                if (!listC.isEmpty()) {
                    LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "heartRateInfo :", ((HeartRateInfo) listC.get(0)).toEncryptionDataString());
                }
            }
            try {
                if (mjz.f41778c != null) {
                    mjz.f41778c.onResponse(map);
                } else {
                    LogUtil.e("HWhealthLinkage_RemoteServiceMgr", "sCallbackInterface is null, the AIDL communication is broken");
                }
            } catch (RemoteException e2) {
                LogUtil.e("HWhealthLinkage_RemoteServiceMgr", e2.getMessage());
                xjt.v("sCallbackInterface onResponse Exception " + e2.getMessage());
            }
        }
    };

    /* JADX INFO: loaded from: classes10.dex */
    static class e extends Handler {
        WeakReference<mjz> e;

        e(mjz mjzVar) {
            this.e = new WeakReference<>(mjzVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.e.get() == null) {
                return;
            }
            LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "handleMessage msg = ", Integer.valueOf(message.what));
            if (message.what != 1) {
                return;
            }
            try {
                if (mjz.f41778c != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", "health_deviceDisconnected");
                    mjz.f41778c.onResponse(nfo.a(jSONObject.toString(), "notificationStateConnectionStateChanged"));
                }
                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "set sIsDisconnectedReported ======> true");
                boolean unused = mjz.j = true;
            } catch (RemoteException | JSONException e) {
                LogUtil.e("HWhealthLinkage_RemoteServiceMgr", e.getMessage());
                xjt.v("MSG_EXERCISEADVICE_BT_DISCONNECTED Exception : " + e.getMessage());
            }
        }
    }

    private mjz(Context context) {
        this.t = new Binder();
        this.f = Executors.newSingleThreadExecutor();
        this.o = new ArrayList();
        this.p = Executors.newFixedThreadPool(20);
        this.k = null;
        this.n = new HiUnSubscribeListener() { // from class: mjz.2
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "mHiUnSubscribeListener onResult result : ", Boolean.valueOf(z));
            }
        };
        this.r = new IRemoteProxyCallback.Stub() { // from class: mjz.5
            @Override // com.huawei.health.IRemoteProxyCallback
            public void requestWearTask(final Map map) throws RemoteException {
                if (map == null) {
                    LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "map is null");
                    xjt.v("map is null");
                    return;
                }
                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "requestWearTask has been called the function name is:", map.get("funcName"), ",the parameters are:", map.get("parameters"));
                final String strD = mjz.this.d(map.get("parameters"));
                final ParserInterface parserInterface = (ParserInterface) mjz.f41776a.get(map.get("funcName"));
                if (parserInterface == null) {
                    HashMap map2 = new HashMap();
                    map2.put("code", SmartMsgConstant.SHOW_METHOD_SMART_CARD);
                    map2.put("value", map.get("funcName") + " not found");
                    if (mjz.f41778c != null) {
                        mjz.f41778c.onResponse(map2);
                        return;
                    }
                    return;
                }
                if ("syncFitnessDetailData".equals(map.get("funcName"))) {
                    mjz.this.l.sendBroadcast(new Intent("com.huawei.bone.action.ACTION_HEALTH_MANUAL_DROP_DO_REFRESH"), LocalBroadcast.f36595c);
                }
                mjz.this.p.execute(new Runnable() { // from class: mjz.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String str = strD;
                            if (str != null && str.length() != 0) {
                                JSONObject jSONObject = new JSONObject(strD);
                                parserInterface.getClass().getMethod((String) map.get("funcName"), jSONObject.getClass(), IBaseResponseCallback.class).invoke(parserInterface, jSONObject, mjz.d);
                                return;
                            }
                            Object obj = map.get("funcName");
                            if (!(obj instanceof String)) {
                                LogUtil.j("HWhealthLinkage_RemoteServiceMgr", "requestWearTask funcNameObject not instanceof String");
                                xjt.v("requestWearTask funcNameObject not instanceof String.");
                            } else {
                                Method method = parserInterface.getClass().getMethod((String) obj, IBaseResponseCallback.class);
                                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "the parser is :", parserInterface.getClass().getSimpleName(), ",the method is ", method.getName());
                                method.invoke(parserInterface, mjz.d);
                            }
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            LogUtil.e("HWhealthLinkage_RemoteServiceMgr", e.getMessage());
                            xjt.v("mRemoteProxyCallback Exception " + e.getMessage());
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            LogUtil.e("HWhealthLinkage_RemoteServiceMgr", e.getMessage());
                            xjt.v("mRemoteProxyCallback Exception " + e.getMessage());
                        } catch (InvocationTargetException e4) {
                            LogUtil.e("HWhealthLinkage_RemoteServiceMgr", "Parameter ERROR : ", e4.getTargetException().getMessage());
                            xjt.v("Parameter ERROR : " + e4.getMessage());
                        } catch (JSONException e5) {
                            e = e5;
                            LogUtil.e("HWhealthLinkage_RemoteServiceMgr", e.getMessage());
                            xjt.v("mRemoteProxyCallback Exception " + e.getMessage());
                        }
                    }
                });
            }
        };
        this.m = new BroadcastReceiver() { // from class: mjz.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (context2 == null || intent == null) {
                    return;
                }
                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "mConnectStateChangedReceiver() action : ", intent.getAction());
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    JSONObject jSONObject = new JSONObject();
                    DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                    if (deviceInfo != null) {
                        LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "mConnectStateChangedReceiver() status : ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                        mjz.this.e(deviceInfo, jSONObject);
                    }
                }
            }
        };
        this.q = new HiSubscribeListener() { // from class: mjz.1
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "regDeviceInfoConfigListener onResult");
                if (list != null && !list.isEmpty()) {
                    LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "regDeviceInfoConfigListener success");
                    mjz.this.k = list;
                }
                if (list2 != null) {
                    ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "failList size ", Integer.valueOf(list2.size()));
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i2, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j2) {
                LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "regDeviceInfoConfigListener success type : ", Integer.valueOf(i2), ",changeType : ", str);
                Intent intent = new Intent();
                intent.setPackage(mjz.this.l.getPackageName());
                switch (i2) {
                    case 100:
                        intent.setAction("com.huawei.bone.ACTION_RECEIVE_SEND_HEIGHT_WEIGHT");
                        mjz.this.l.sendBroadcast(intent, LocalBroadcast.f36595c);
                        break;
                    case 101:
                        intent.setAction("com.huawei.bone.ACTION_RECEIVE_SEND_SPORT_GOAL");
                        intent.setPackage(mjz.this.l.getPackageName());
                        mjz.this.l.sendBroadcast(intent, LocalBroadcast.f36595c);
                        break;
                    case 102:
                        if ("custom.UserPreference_HeartZone_Config".equals(str)) {
                            intent.setAction("com.huawei.bone.ACTION_RECEIVE_SEND_HEART_CONFIG");
                            mjz.this.l.sendBroadcast(intent, LocalBroadcast.f36595c);
                        }
                        break;
                    default:
                        ReleaseLogUtil.e("HWhealthLinkage_RemoteServiceMgr", "onChange Unknown type: ", Integer.valueOf(i2));
                        break;
                }
            }
        };
        this.l = context;
        o();
        h = new e(a.f41786b);
        i = mkf.e(BaseApplication.getContext());
        l();
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        intentFilter.addAction("com.huawei.plugin_device.am16_bind_success");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.m, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static mjz c() {
        return a.f41786b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public void f() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.m);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HWhealthLinkage_RemoteServiceMgr", "destroy IllegalArgumentException");
            xjt.v("destroy IllegalArgumentException : " + e2.getMessage());
        }
        g();
        this.f.shutdown();
        this.p.shutdown();
        if (njy.b(this.k)) {
            HiHealthManager.d(this.l).unSubscribeHiHealthData(this.k, this.n);
            this.o = null;
            this.k = null;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static mjz f41786b = new mjz(BaseApplication.getContext());
    }

    private static void d(String str) {
        g = str;
    }

    private static void g() {
        mjz unused = a.f41786b = null;
    }

    private List<DeviceCapability> i() {
        ArrayList arrayList = new ArrayList();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HWhealthLinkage_RemoteServiceMgr");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
                    Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, "", "HWhealthLinkage_RemoteServiceMgr");
                    if (!mapQueryDeviceCapability.isEmpty() && mapQueryDeviceCapability.containsKey(deviceInfo.getDeviceIdentify())) {
                        arrayList.add(mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify()));
                    }
                }
            }
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability2 = i.queryDeviceCapability(5, "", "HWhealthLinkage_RemoteServiceMgr");
        for (String str : mapQueryDeviceCapability2.keySet()) {
            if (str instanceof String) {
                arrayList.add(mapQueryDeviceCapability2.get(str));
            }
        }
        return arrayList;
    }

    private void e(DeviceInfo deviceInfo) {
        d(deviceInfo.getSecurityUuid());
        this.f.execute(new Runnable() { // from class: mjz.6
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1015), "key_device_last_device", mjz.g, null);
            }
        });
    }

    public static void e(Intent intent) {
        if (a.f41786b != null) {
            a.f41786b.c(intent);
        }
    }

    private void c(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("isFromCallbackService", false)) {
            return;
        }
        LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "setIsFromUiThread enter");
    }

    private static void l() {
        HwWorkoutServiceManager hwWorkoutServiceManager = HwWorkoutServiceManager.getInstance();
        HwExerciseAdviceManager hwExerciseAdviceManager = HwExerciseAdviceManager.getInstance();
        HwHeartRateManager hwHeartRateManager = HwHeartRateManager.getInstance();
        HwLinkageServiceManager hwLinkageServiceManager = HwLinkageServiceManager.getInstance();
        Method[] declaredMethods = hwWorkoutServiceManager.getClass().getDeclaredMethods();
        Method[] declaredMethods2 = hwExerciseAdviceManager.getClass().getDeclaredMethods();
        Method[] declaredMethods3 = hwHeartRateManager.getClass().getDeclaredMethods();
        Method[] declaredMethods4 = hwLinkageServiceManager.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            f41776a.put(method.getName(), hwWorkoutServiceManager);
        }
        for (Method method2 : declaredMethods2) {
            f41776a.put(method2.getName(), hwExerciseAdviceManager);
        }
        for (Method method3 : declaredMethods3) {
            f41776a.put(method3.getName(), hwHeartRateManager);
        }
        for (Method method4 : declaredMethods4) {
            f41776a.put(method4.getName(), hwLinkageServiceManager);
        }
    }

    private void o() {
        HwHeartRateManager hwHeartRateManager = HwHeartRateManager.getInstance();
        hwHeartRateManager.registerNotificationHeartRateCallback(d);
        hwHeartRateManager.registerNotificationStressCallback(d);
        hwHeartRateManager.registerNotificationPressCallback(d);
        HwExerciseAdviceManager.getInstance().registerNotificationRunPlanRecordInfoCallbackList(d);
        HwWorkoutServiceManager.getInstance().registerNotificationSportReminderCallbackList(d);
        HwLinkageServiceManager hwLinkageServiceManager = HwLinkageServiceManager.getInstance();
        hwLinkageServiceManager.registerNotificationStatusCallbackList(d);
        hwLinkageServiceManager.registerNotificationGetWorkoutRecordStatisticCallbackList(d);
        hwLinkageServiceManager.registerNotificationWorkoutRecordSpeechPlayCallbackList(d);
        hwLinkageServiceManager.registerGetRealtimeSportDataListCallbackList(d);
    }

    private void k() {
        m();
    }

    private void m() {
        LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "regDeviceInfoConfigListener");
        this.o.clear();
        this.o.add(102);
        this.o.add(100);
        this.o.add(101);
        HiHealthManager.d(this.l).subscribeHiHealthData(this.o, this.q);
    }

    private static List<com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo> h() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HWhealthLinkage_RemoteServiceMgr");
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        if (deviceList == null) {
            return arrayList;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "return getUsedDeviceList() with deviceInfoListBak size : ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo a(DeviceInfo deviceInfo) {
        com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo deviceInfo2 = new com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo();
        deviceInfo2.setDeviceActiveState(deviceInfo.getDeviceActiveState());
        deviceInfo2.setDeviceConnectState(deviceInfo.getDeviceConnectState());
        deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        deviceInfo2.setProductType(d(deviceInfo));
        deviceInfo2.setDeviceIdentify(deviceInfo.getDeviceIdentify());
        if (TextUtils.isEmpty(deviceInfo.getUuid())) {
            deviceInfo2.setUuid(deviceInfo.getDeviceIdentify());
        } else {
            deviceInfo2.setUuid(deviceInfo.getUuid());
        }
        deviceInfo2.setDeviceProtocol(deviceInfo.getDeviceProtocol());
        deviceInfo2.setEncryptType(deviceInfo.getEncryptType());
        deviceInfo2.setDeviceBtType(deviceInfo.getDeviceBluetoothType());
        deviceInfo2.setDeviceIdType(deviceInfo.getDeviceIdType());
        return deviceInfo2;
    }

    private static int d(DeviceInfo deviceInfo) {
        int iB = mij.b(deviceInfo);
        if (iB == 0 && deviceInfo.getProductType() == 11) {
            return 43;
        }
        return iB;
    }

    public void b(int i2, int i3, final IHeartRateStateAIDLCallback iHeartRateStateAIDLCallback) throws RemoteException {
        lng.g();
        HwHeartRateManager.getInstance().switchHeartRateDetection(i2, i3, new IBaseResponseCallback() { // from class: mjz.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj) {
                try {
                    IHeartRateStateAIDLCallback iHeartRateStateAIDLCallback2 = iHeartRateStateAIDLCallback;
                    if (iHeartRateStateAIDLCallback2 != null) {
                        iHeartRateStateAIDLCallback2.heartRateResponse(i4);
                    }
                } catch (Exception e2) {
                    LogUtil.e("HWhealthLinkage_RemoteServiceMgr", "isLoudspeakerMuteOpenOrCloseHeartRate exception");
                    xjt.v("isLoudspeakerMuteOpenOrCloseHeartRate exception : " + e2.getMessage());
                }
            }
        });
    }

    public boolean j() {
        boolean z;
        synchronized (f41777b) {
            z = f41778c == null;
        }
        return z;
    }

    private static void c(IBinder iBinder) {
        f41778c = ICallbackInterface.Stub.asInterface(iBinder);
    }

    public void c(IBinder iBinder, IBaseCallback iBaseCallback) {
        try {
            if (iBinder != null) {
                ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "initLinkageCallback begin");
                synchronized (f41777b) {
                    ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "sCallbackInterface old is: ", f41778c);
                    c(iBinder);
                    ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "sCallbackInterface new is: ", f41778c);
                    if (f41778c != null) {
                        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: mjz.9
                            @Override // android.os.IBinder.DeathRecipient
                            public void binderDied() {
                                mjz.this.n();
                            }
                        }, 0);
                        ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "initLinkageCallback callbackInterface start");
                        HwExerciseAdviceManager.getInstance().setCallbackInterface(f41778c);
                        f41778c.registerRemoteCallbackForHealth("com.huawei.health", this.r);
                        f41778c.setDeviceCapabilityForHealth(e.toJson(i()));
                        f41778c.setUsedDeviceListForHealth(h());
                        f41778c.registerBinder(this.t, "PhoneServiceInHealth", "");
                        ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "initLinkageCallback callbackInterface done");
                    } else {
                        ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "sCallbackInterface is null");
                    }
                }
                k();
                return;
            }
            ReleaseLogUtil.a("HWhealthLinkage_RemoteServiceMgr", "remote binder is null");
            if (iBaseCallback != null) {
                n();
                iBaseCallback.onResponse(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "binder is null");
            }
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("HWhealthLinkage_RemoteServiceMgr", "onServiceConnected Exception");
            xjt.v("onServiceConnected Exception : " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ReleaseLogUtil.e("HWhealthLinkage_RemoteServiceMgr", "handleBinderDied called");
        synchronized (f41777b) {
            ICallbackInterface iCallbackInterface = f41778c;
            if (iCallbackInterface != null) {
                try {
                    iCallbackInterface.unRegisterRemoteCallback(this.r);
                } catch (RemoteException e2) {
                    ReleaseLogUtil.a("HWhealthLinkage_RemoteServiceMgr", "handleBinderDied,", ExceptionUtils.c(e2));
                }
                f41778c = null;
            } else {
                f41778c = null;
            }
            throw th;
        }
        if (this.k != null) {
            HiHealthManager.d(this.l).unSubscribeHiHealthData(this.k, this.n);
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, JSONObject jSONObject) {
        try {
            jSONObject.put("product_type", deviceInfo.getProductType());
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            if (deviceConnectState == 2) {
                d(deviceInfo, jSONObject);
                return;
            }
            if (deviceConnectState != 3) {
                return;
            }
            if (!"main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType())) {
                ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "checkDeviceCapability not is main relationship.");
                return;
            }
            if (f41778c != null) {
                jSONObject.put("state", "health_deviceInstantDisconnected");
                f41778c.setUsedDeviceListForHealth(h());
                f41778c.onResponse(nfo.a(jSONObject.toString(), "notificationStateConnectionStateChanged"));
            }
            ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "deviceInstantDisconnected sent");
            h.sendEmptyMessageDelayed(1, 300000L);
        } catch (ClassCastException e2) {
            ReleaseLogUtil.a("HWhealthLinkage_RemoteServiceMgr", "mConnectStateChangedReceiver ClassCastException", ExceptionUtils.c(e2));
            xjt.v("mConnectStateChangedReceiver ClassCastException  " + e2.getMessage());
        } catch (Exception e3) {
            ReleaseLogUtil.a("HWhealthLinkage_RemoteServiceMgr", "mConnectStateChangedReceiver exception:", ExceptionUtils.c(e3));
            xjt.v("mConnectStateChangedReceiver exception  " + e3.getMessage());
        }
    }

    private void d(DeviceInfo deviceInfo, JSONObject jSONObject) throws JSONException, RemoteException, ClassCastException {
        h.removeMessages(1);
        ICallbackInterface iCallbackInterface = f41778c;
        if (iCallbackInterface != null) {
            iCallbackInterface.setDeviceCapabilityForHealth(e.toJson(i()));
            f41778c.setUsedDeviceListForHealth(h());
            jSONObject.put("state", "health_deviceInstantConnected");
            f41778c.onResponse(nfo.a(jSONObject.toString(), "notificationStateConnectionStateChanged"));
            if (g == null) {
                g = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1015), "key_device_last_device");
            }
            LogUtil.a("HWhealthLinkage_RemoteServiceMgr", "sLastKnownDeviceIdentify is ", BTDeviceMgrUtil.c().e(g), "deviceInfo.getSecUUID() is ", BTDeviceMgrUtil.c().e(deviceInfo.getSecurityUuid()));
            String str = g;
            if (str == null || !str.equalsIgnoreCase(deviceInfo.getSecurityUuid())) {
                jSONObject.put("state", "health_deviceDisconnected");
                ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "deviceDisconnected sent");
                f41778c.onResponse(nfo.a(jSONObject.toString(), "notificationStateConnectionStateChanged"));
            } else if (!g.equals(deviceInfo.getSecurityUuid()) || j) {
                LogUtil.j("HWhealthLinkage_RemoteServiceMgr", "mConnectStateChangedReceiver onReceive lastKnownDeviceIdentify : ", g);
            } else {
                ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "set sIsDisconnectedReported false");
                j = false;
                return;
            }
            e(deviceInfo);
            jSONObject.put("state", "health_deviceConnected");
            ReleaseLogUtil.d("HWhealthLinkage_RemoteServiceMgr", "deviceConnected sent");
            f41778c.onResponse(nfo.a(jSONObject.toString(), "notificationStateConnectionStateChanged"));
            return;
        }
        e(deviceInfo);
    }
}
