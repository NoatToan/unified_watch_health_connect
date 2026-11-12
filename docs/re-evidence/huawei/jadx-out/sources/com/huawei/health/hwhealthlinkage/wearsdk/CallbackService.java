package com.huawei.health.hwhealthlinkage.wearsdk;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.exercise.modle.RunPlanParameter;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.IBinderInterceptor;
import com.huawei.health.ICallbackInterface;
import com.huawei.health.IGetbindDeviceCommonCallback;
import com.huawei.health.IRemoteProxyCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.HealthSupportModel;
import com.huawei.hwcommonmodel.datatypes.HuaweiHealthData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.dxm;
import defpackage.eem;
import defpackage.fif;
import defpackage.llm;
import defpackage.lsb;
import defpackage.lsc;
import defpackage.lsy;
import defpackage.peh;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class CallbackService extends Service {
    private static final int GET_SUPPORT_DEVICE = 1;
    private static final int GET_SWITCH_STATE = 2;
    private static final String HEALTH = "health";
    private static final int NOTICE_ID = 20220531;
    public static final String PACKAGE_NAME_HUAWEI_WEAR = "com.huawei.bone";
    private static final int SEND_SUPPORT_DEVICE_TO_WEAR = 1000;
    private static final String TAG = "HWhealthLinkage_CallbackService";
    private static final String WEAR = "wear";
    private static String mCallingApp = "";
    private static boolean mIsHuaweiHealthConnected = false;
    private static boolean mIsHuaweiWearConnected = false;
    private JSONObject mDeviceCapability;
    private List<DeviceCapability> mDeviceCapabilityListForHealth;
    private JSONObject mOldDeviceCapabilityForHealth;
    private static final Object OBJECT_LOCK = new Object();
    private static final byte[] LOCK = new byte[1];
    private final IBinder mBinder = new MyBinder();
    private DeviceCapability mWearDeviceCapability = null;
    private DeviceCapability mOldhealthDeviceCapability = null;
    private List<DeviceInfo> mUsedDeviceList = new ArrayList(10);
    private List<DeviceInfo> mUsedDeviceListInHealth = new CopyOnWriteArrayList();
    private List<c> mClients = new ArrayList(10);
    private IBaseResponseCallback mRemoteServerListener = null;
    private Gson mGson = new Gson();
    private Map<String, a> mRemoteFunctionDataList = new HashMap(16);
    private Map<String, a> mNoDeviceRemoteFunctionDataList = new HashMap(16);
    private Map<String, IBaseResponseCallback> mOneTimeCallbackCache = Collections.synchronizedMap(new HashMap(16));
    private Map<String, List<IBaseResponseCallback>> mNotificationCallbackCache = new HashMap(16);
    private RemoteCallbackList<IRemoteProxyCallback> mCallbackList = new RemoteCallbackList<>();
    private RemoteCallbackList<IRemoteProxyCallback> mCallbackListForHealth = new RemoteCallbackList<>();
    private Map<String, Integer> mRunPlanMap = new HashMap(16);
    private int mCount = 0;
    private IBinderInterceptor.Stub binderIntercepter = new b(this);
    private ICallbackInterface.Stub iCallback = new ICallbackInterface.Stub() { // from class: com.huawei.health.hwhealthlinkage.wearsdk.CallbackService.3
        @Override // com.huawei.health.ICallbackInterface
        public void registerRemoteCallback(IRemoteProxyCallback iRemoteProxyCallback) throws RemoteException {
            ReleaseLogUtil.d(CallbackService.TAG, "registerRemoteCallback called mCallingApp:", CallbackService.mCallingApp, "is connect PhoneService", Boolean.valueOf(CallbackService.isConnectedWithRemote()));
            if ("com.huawei.bone".equals(CallbackService.mCallingApp)) {
                boolean unused = CallbackService.mIsHuaweiWearConnected = true;
                ReleaseLogUtil.d(CallbackService.TAG, "connection to wear isSussess:", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_CONNECTION_TO_WEAR", "0", null)));
                if (CommonUtil.al(BaseApplication.getContext())) {
                    CallbackService.this.sendSupportDeviceToWear();
                }
                CallbackService.this.mCallbackList.register(iRemoteProxyCallback);
            }
            d();
        }

        @Override // com.huawei.health.ICallbackInterface
        public void registerRemoteCallbackForHealth(String str, IRemoteProxyCallback iRemoteProxyCallback) throws RemoteException {
            ReleaseLogUtil.d(CallbackService.TAG, "registerRemoteCallback called packageName:", str);
            if ("com.huawei.health".equals(str) || BaseApplication.APP_PACKAGE_GOOGLE_HEALTH.equals(str)) {
                boolean unused = CallbackService.mIsHuaweiHealthConnected = true;
                CallbackService.this.mCallbackListForHealth.register(iRemoteProxyCallback);
            }
            d();
        }

        private void d() {
            synchronized (CallbackService.LOCK) {
                Iterator it = CallbackService.this.mNoDeviceRemoteFunctionDataList.entrySet().iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((Map.Entry) it.next()).getValue();
                    ReleaseLogUtil.d(CallbackService.TAG, "registerRemoteCallback remoteFunctionData funcName = ", aVar.e());
                    CallbackService.this.requestWearTask(aVar.e(), aVar.c(), aVar.d());
                }
                CallbackService.this.mNoDeviceRemoteFunctionDataList.clear();
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void unRegisterRemoteCallback(IRemoteProxyCallback iRemoteProxyCallback) throws RemoteException {
            ReleaseLogUtil.d(CallbackService.TAG, "unRegisterRemoteCallback:", iRemoteProxyCallback);
            try {
                CallbackService.this.mCallbackList.unregister(iRemoteProxyCallback);
            } catch (RuntimeException e) {
                ReleaseLogUtil.d(CallbackService.TAG, "mCallbackList RuntimeException:", e.getMessage());
                xjt.v("mCallbackList RuntimeException:" + e.getMessage());
            }
            try {
                CallbackService.this.mCallbackListForHealth.unregister(iRemoteProxyCallback);
            } catch (RuntimeException e2) {
                ReleaseLogUtil.d(CallbackService.TAG, "mCallbackListForHealth RuntimeException:", e2.getMessage());
                xjt.v("mCallbackListForHealth RuntimeException:" + e2.getMessage());
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public boolean onResponse(Map map) throws RemoteException {
            IBaseResponseCallback iBaseResponseCallback;
            if (map != null) {
                LogUtil.d(CallbackService.TAG, "onResponse called!!", map.get("funcName"));
                synchronized (CallbackService.LOCK) {
                    iBaseResponseCallback = (IBaseResponseCallback) CallbackService.this.mOneTimeCallbackCache.remove(map.get("funcName"));
                }
                Object obj = map.get("code");
                if (iBaseResponseCallback == null) {
                    LogUtil.a(CallbackService.TAG, "oneTime callback iBaseResponseCallback is null");
                    if (obj == null) {
                        return true;
                    }
                    List list = (List) CallbackService.this.mNotificationCallbackCache.get(map.get("funcName"));
                    CallbackService.this.printRealTimeSportData(map);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                ((IBaseResponseCallback) it.next()).a(Integer.parseInt(obj.toString()), map.get("value"));
                            } catch (NumberFormatException e) {
                                ReleaseLogUtil.d(CallbackService.TAG, "onResponse NumberFormatException");
                                xjt.v("onResponse NumberFormatException:" + e.getMessage());
                            }
                        }
                    }
                } else {
                    try {
                        if ("getRunPlanParameter".equals(map.get("funcName"))) {
                            LogUtil.a(CallbackService.TAG, "runplanlog onResponse value", String.valueOf(map.get("value")));
                            LogUtil.a(CallbackService.TAG, "runplanlog onResponse code", String.valueOf(obj));
                            RunPlanParameter runPlanParameter = (RunPlanParameter) peh.b((String) map.get("value"), RunPlanParameter.class);
                            LogUtil.a(CallbackService.TAG, "runplanlog onResponse getRun_plan_sync_size_sub:", Integer.valueOf(runPlanParameter.getRun_plan_sync_size_sub()));
                            CallbackService.this.mRunPlanMap.put("wear", Integer.valueOf(runPlanParameter.getRun_plan_sync_size_sub() + runPlanParameter.getRun_plan_sync_size_sub()));
                        }
                        if ("getRunPlanParameterforhealth".equals(map.get("funcName"))) {
                            LogUtil.a(CallbackService.TAG, "runplanlog onResponse health value", String.valueOf(map.get("value")));
                            LogUtil.a(CallbackService.TAG, "runplanlog onResponse health code", String.valueOf(obj));
                            RunPlanParameter runPlanParameter2 = (RunPlanParameter) peh.b((String) map.get("value"), RunPlanParameter.class);
                            LogUtil.a(CallbackService.TAG, "runplanlog onResponse health getRun_plan_sync_size_sub", Integer.valueOf(runPlanParameter2.getRun_plan_sync_size_sub()));
                            CallbackService.this.mRunPlanMap.put(CallbackService.HEALTH, Integer.valueOf(runPlanParameter2.getRun_plan_sync_size_sub() + runPlanParameter2.getRun_plan_sync_size_sub()));
                        }
                    } catch (JsonSyntaxException e2) {
                        ReleaseLogUtil.d(CallbackService.TAG, "onResponse JsonSyntaxException:", e2.getMessage());
                        xjt.v("onResponse JsonSyntaxException:" + e2.getMessage());
                    }
                    if (obj == null) {
                        return true;
                    }
                    try {
                        iBaseResponseCallback.a(Integer.parseInt(obj.toString()), map.get("value"));
                    } catch (NumberFormatException e3) {
                        ReleaseLogUtil.d(CallbackService.TAG, "onResponse NumberFormatException");
                        xjt.v("onResponse NumberFormatException:" + e3.getMessage());
                    }
                }
            } else {
                ReleaseLogUtil.d(CallbackService.TAG, "obj is null");
            }
            return true;
        }

        @Override // com.huawei.health.ICallbackInterface
        public void registerBinder(IBinder iBinder, String str, String str2) throws RemoteException {
            LogUtil.d(CallbackService.TAG, "registerBinder called ");
            if (iBinder == null) {
                ReleaseLogUtil.d(CallbackService.TAG, "registerBinder token is null");
                return;
            }
            c cVar = CallbackService.this.new c(iBinder, str, str2);
            iBinder.linkToDeath(cVar, 0);
            CallbackService.this.mClients.add(cVar);
            ReleaseLogUtil.d(CallbackService.TAG, "mRemoteServerListener is called!!!!");
            if (CallbackService.this.mRemoteServerListener != null) {
                CallbackService.this.mRemoteServerListener.a(100000, "success");
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void setUsedDeviceList(List<DeviceInfo> list) throws RemoteException {
            if (!CallbackService.this.isSameDevice(list)) {
                ReleaseLogUtil.d(CallbackService.TAG, "setUsedDeviceList the different device");
                synchronized (CallbackService.LOCK) {
                    CallbackService.this.mRemoteFunctionDataList.clear();
                }
            }
            CallbackService.this.mUsedDeviceList = list;
            if (CallbackService.this.mUsedDeviceList != null) {
                for (DeviceInfo deviceInfo : CallbackService.this.mUsedDeviceList) {
                    LogUtil.a(CallbackService.TAG, "setUsedDeviceList remoteFunctionData active = ", Integer.valueOf(deviceInfo.getDeviceActiveState()), "connectstats  ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    ReleaseLogUtil.d(CallbackService.TAG, "setUsedDeviceList remoteFunctionData deviceInfo = ", deviceInfo.toString());
                    if (1 == deviceInfo.getDeviceActiveState() && 2 == deviceInfo.getDeviceConnectState()) {
                        synchronized (CallbackService.LOCK) {
                            Iterator it = CallbackService.this.mRemoteFunctionDataList.entrySet().iterator();
                            while (it.hasNext()) {
                                a aVar = (a) ((Map.Entry) it.next()).getValue();
                                ReleaseLogUtil.d(CallbackService.TAG, "setUsedDeviceList remoteFunctionData funcName = ", aVar.e(), "callback ", aVar.d());
                                CallbackService.this.requestWearTask(aVar.e(), aVar.c(), aVar.d());
                            }
                            CallbackService.this.mRemoteFunctionDataList.clear();
                        }
                    }
                }
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void setDeviceCapability(String str) throws RemoteException {
            try {
                ReleaseLogUtil.d(CallbackService.TAG, "calling deviceCapability ：", str);
                CallbackService.this.mDeviceCapability = new JSONObject(str);
            } catch (JSONException e) {
                ReleaseLogUtil.a(CallbackService.TAG, LogAnonymous.b(e));
                xjt.v("setDeviceCapability JSONException:" + e.getMessage());
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void unbindAllDevice(IBaseCommonCallback iBaseCommonCallback) {
            ReleaseLogUtil.d(CallbackService.TAG, "calling unbindAllDevice......");
            fif.c().d();
        }

        @Override // com.huawei.health.ICallbackInterface
        public void getDeviceList(IGetbindDeviceCommonCallback iGetbindDeviceCommonCallback) {
            ReleaseLogUtil.d(CallbackService.TAG, "calling getDeviceList......");
            if (iGetbindDeviceCommonCallback != null) {
                try {
                    iGetbindDeviceCommonCallback.onResponse(0, 0);
                } catch (RemoteException e) {
                    ReleaseLogUtil.d(CallbackService.TAG, "RemoteException:", e.getMessage());
                    xjt.v("getDeviceList RemoteException:" + e.getMessage());
                }
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void isHealthSupportWearDevice(IBaseCommonCallback iBaseCommonCallback) {
            ReleaseLogUtil.d(CallbackService.TAG, "calling isHealthSupportWearDevice......");
            if (iBaseCommonCallback != null) {
                try {
                    iBaseCommonCallback.onResponse(0, "false");
                } catch (RemoteException e) {
                    ReleaseLogUtil.d(CallbackService.TAG, "RemoteException:", e.getMessage());
                    xjt.v("call isHealthSupportWearDevice RemoteException:" + e.getMessage());
                }
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void sendDataToHealth(String str, IBaseCommonCallback iBaseCommonCallback) {
            ReleaseLogUtil.d(CallbackService.TAG, "calling sendDataToHealth...... data", str);
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.homewear21.intentservice.MessageCenterIntentService"));
                intent.putExtra("data", str);
                BaseApplication.getContext().startService(intent);
                if (iBaseCommonCallback != null) {
                    iBaseCommonCallback.onResponse(0, "success");
                }
            } catch (RemoteException e) {
                ReleaseLogUtil.d(CallbackService.TAG, "RemoteException:", e.getMessage());
                xjt.v("call sendDataToHealth RemoteException:" + e.getMessage());
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void getDeviceListSize(IGetbindDeviceCommonCallback iGetbindDeviceCommonCallback) {
            LogUtil.a(CallbackService.TAG, "calling getDeviceListSize......");
            int iN = CommonUtil.n(BaseApplication.getContext(), eem.a());
            ReleaseLogUtil.d(CallbackService.TAG, "calling getDeviceList size:", Integer.valueOf(iN));
            if (iGetbindDeviceCommonCallback != null) {
                try {
                    iGetbindDeviceCommonCallback.onResponse(0, iN);
                } catch (RemoteException e) {
                    ReleaseLogUtil.d(CallbackService.TAG, "RemoteException:", e.getMessage());
                    xjt.v("call getDeviceListSize RemoteException:" + e.getMessage());
                }
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void getCommonData(int i, IBaseCommonCallback iBaseCommonCallback) {
            ReleaseLogUtil.d(CallbackService.TAG, "calling getCommonData commandType:", Integer.valueOf(i));
            try {
                if (1 == i) {
                    HealthSupportModel healthSupportModelC = eem.c();
                    if (iBaseCommonCallback != null) {
                        iBaseCommonCallback.onResponse(0, CallbackService.this.mGson.toJson(healthSupportModelC));
                        return;
                    }
                    return;
                }
                if (i != 2 || iBaseCommonCallback == null) {
                    return;
                }
                iBaseCommonCallback.onResponse(0, "false");
            } catch (RemoteException e) {
                ReleaseLogUtil.d(CallbackService.TAG, "RemoteException:", e.getMessage());
                xjt.v("call getCommonData RemoteException:" + e.getMessage());
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void setUsedDeviceListForHealth(List<DeviceInfo> list) throws RemoteException {
            if (!CallbackService.this.isSameDeviceInHealth(list)) {
                LogUtil.a(CallbackService.TAG, "setUsedDeviceList the different device");
                synchronized (CallbackService.LOCK) {
                    CallbackService.this.mRemoteFunctionDataList.clear();
                }
            }
            CallbackService.this.mUsedDeviceListInHealth = list;
            if (CallbackService.this.mUsedDeviceListInHealth != null) {
                for (DeviceInfo deviceInfo : CallbackService.this.mUsedDeviceListInHealth) {
                    ReleaseLogUtil.d(CallbackService.TAG, "setUsedDeviceListForHealth remoteFunctionData active = ", Integer.valueOf(deviceInfo.getDeviceActiveState()), "connectstats  ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    LogUtil.a(CallbackService.TAG, "setUsedDeviceListForHealth remoteFunctionData deviceInfo = ", deviceInfo.toString());
                    if (1 == deviceInfo.getDeviceActiveState() && 2 == deviceInfo.getDeviceConnectState()) {
                        synchronized (CallbackService.LOCK) {
                            Iterator it = CallbackService.this.mRemoteFunctionDataList.entrySet().iterator();
                            while (it.hasNext()) {
                                a aVar = (a) ((Map.Entry) it.next()).getValue();
                                LogUtil.a(CallbackService.TAG, "setUsedDeviceListForHealth remoteFunctionData funcName = ", aVar.e() + "callback ", aVar.d());
                                CallbackService.this.requestWearTask(aVar.e(), aVar.c(), aVar.d());
                            }
                            CallbackService.this.mRemoteFunctionDataList.clear();
                        }
                    }
                }
            }
        }

        @Override // com.huawei.health.ICallbackInterface
        public void setDeviceCapabilityForHealth(String str) throws RemoteException {
            ReleaseLogUtil.d(CallbackService.TAG, "calling setDeviceCapabilityForHealth ：", str);
            CallbackService.this.mDeviceCapabilityListForHealth = (List) new Gson().fromJson(CommonUtil.ac(str), new TypeToken<List<DeviceCapability>>() { // from class: com.huawei.health.hwhealthlinkage.wearsdk.CallbackService$1$1
            }.getType());
        }
    };

    public static boolean isConnectedWithRemote() {
        LogUtil.d(TAG, "mIsHuaweiWearConnected:", Boolean.valueOf(mIsHuaweiWearConnected), " mIsHuaweiHealthConnected:", Boolean.valueOf(mIsHuaweiHealthConnected));
        return mIsHuaweiHealthConnected || mIsHuaweiWearConnected;
    }

    static class b extends IBinderInterceptor.Stub {
        private CallbackService e;

        public b(CallbackService callbackService) {
            this.e = callbackService;
        }

        @Override // com.huawei.health.IBinderInterceptor
        public IBinder getServiceBinder(String str) {
            synchronized (CallbackService.OBJECT_LOCK) {
                String unused = CallbackService.mCallingApp = BaseApplication.getContext().getPackageManager().getNameForUid(Binder.getCallingUid());
                ReleaseLogUtil.d(CallbackService.TAG, "mCallingApp is:", CallbackService.mCallingApp, "packageName:", str);
                if (llm.c(BaseApplication.getContext(), str)) {
                    return this.e.iCallback;
                }
                if (!BaseApplication.getContext().getPackageName().equals(CallbackService.mCallingApp) && !BaseApplication.APP_PACKAGE_GOOGLE_HEALTH.equals(CallbackService.mCallingApp)) {
                    return null;
                }
                return this.e.iCallback;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSupportDeviceToWear() {
        ReleaseLogUtil.d(TAG, "Enter sendSupportDeviceToWear");
        HuaweiHealthData huaweiHealthData = new HuaweiHealthData();
        huaweiHealthData.setCommandType(1000);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.homewear21.intentservice.MessageCenterIntentService"));
        intent.putExtra("data", this.mGson.toJson(huaweiHealthData));
        BaseApplication.getContext().startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printRealTimeSportData(Map map) {
        String str;
        Object obj;
        if (!(map.get("funcName") instanceof String)) {
            str = "";
        } else {
            str = (String) map.get("funcName");
        }
        if (!"registerGetRTSportDataListCallbackList".equals(str) || (obj = map.get("value")) == null) {
            return;
        }
        try {
            LogUtil.a(TAG, "printRealTimeSportData hr:", CommonUtil.m(new JSONObject(obj.toString()).get("hr").toString()));
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "printRealTimeSportData JSONException");
            xjt.v("printRealTimeSportData JSONException:" + e.getMessage());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.mCount++;
        ReleaseLogUtil.d(TAG, "onBind from_flag ", intent.getStringExtra("from_flag"), " count:", Integer.valueOf(this.mCount));
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("callbackServiceError", "onBind from_flag " + intent.getStringExtra("from_flag") + " count:" + this.mCount);
        if (intent != null && "local.proxy".equals(intent.getAction())) {
            return this.mBinder;
        }
        return this.binderIntercepter;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        this.mCount--;
        ReleaseLogUtil.d(TAG, "onUnbind from_flag ", intent.getStringExtra("from_flag"), " count:", Integer.valueOf(this.mCount));
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("callbackServiceError", "onUnbind from_flag " + intent.getStringExtra("from_flag") + " count:" + this.mCount);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ReleaseLogUtil.d(TAG, "checkIsWearAPPInstalled is true");
        try {
            if (isStartForegroundNotification()) {
                startForeground(NOTICE_ID, lsb.d().c().build());
            }
        } catch (Exception e) {
            ReleaseLogUtil.a(TAG, "startForeground Exception ", ExceptionUtils.c(e));
            xjt.v("startForeground NOTICE_ID Exception:" + e.getMessage());
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_CONNECTION_TO_WEAR", "1", null);
        startRemoteService();
    }

    private boolean isStartForegroundNotification() {
        if (CommonUtil.bg() || NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            return true;
        }
        LogUtil.j(TAG, "notifyMsg notification bar permission is not enabled.");
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReleaseLogUtil.d(TAG, "onDestroy count:", Integer.valueOf(this.mCount));
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("callbackServiceError", "onDestroy count:" + this.mCount);
        super.onDestroy();
    }

    public boolean isWearDeviceSupportHeart() {
        JSONObject jSONObject = this.mDeviceCapability;
        if (jSONObject != null) {
            try {
                this.mWearDeviceCapability = (DeviceCapability) this.mGson.fromJson(jSONObject.toString(), DeviceCapability.class);
            } catch (JsonSyntaxException e) {
                ReleaseLogUtil.d(TAG, "mWearDeviceCapability JsonSyntaxException:", e.getMessage());
                xjt.v("mWearDeviceCapability JsonSyntaxException:" + e.getMessage());
                this.mWearDeviceCapability = null;
            }
        }
        DeviceCapability deviceCapability = this.mWearDeviceCapability;
        boolean zIsSupportHeartRateInfo = deviceCapability != null ? deviceCapability.isSupportHeartRateInfo() : false;
        ReleaseLogUtil.d(TAG, "isWearDeviceSupportHeart :", Boolean.valueOf(zIsSupportHeartRateInfo));
        return zIsSupportHeartRateInfo;
    }

    public boolean isHealthDeviceSupportHeart() {
        List<DeviceCapability> list = this.mDeviceCapabilityListForHealth;
        if (list != null) {
            for (DeviceCapability deviceCapability : list) {
                if (deviceCapability != null && deviceCapability.isSupportHeartRateInfo()) {
                    LogUtil.a(TAG, "isHealthDeviceSupportHeart HAS device support heart rate");
                    return true;
                }
            }
        }
        ReleaseLogUtil.d(TAG, "isHealthDeviceSupportHeart no device support heart rate");
        return false;
    }

    public boolean isHealthDeviceSupportStress() {
        List<DeviceCapability> list = this.mDeviceCapabilityListForHealth;
        if (list != null) {
            for (DeviceCapability deviceCapability : list) {
                if (deviceCapability != null && deviceCapability.isSupportStressInfo()) {
                    LogUtil.a(TAG, "isHealthDeviceSupportHeart no device support StressInfo");
                    return true;
                }
            }
        }
        ReleaseLogUtil.d(TAG, "isHealthDeviceSupportHeart no device support heart rate");
        return false;
    }

    public class MyBinder extends Binder {
        public MyBinder() {
        }

        public CallbackService getCallbackService() {
            ReleaseLogUtil.d(CallbackService.TAG, "CallbackService.this is", CallbackService.this);
            return CallbackService.this;
        }

        public List<DeviceInfo> getUsedDeviceList() {
            if (CallbackService.this.mUsedDeviceList == null) {
                if (CallbackService.this.mUsedDeviceListInHealth == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(10);
                arrayList.addAll(CallbackService.this.mUsedDeviceListInHealth);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(10);
            if (CallbackService.this.mUsedDeviceListInHealth != null) {
                arrayList2.addAll(CallbackService.this.mUsedDeviceListInHealth);
            }
            arrayList2.addAll(CallbackService.this.mUsedDeviceList);
            return arrayList2;
        }

        public List<DeviceInfo> getUsedDeviceListInHealth() {
            if (CallbackService.this.mUsedDeviceListInHealth == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(10);
            arrayList.addAll(CallbackService.this.mUsedDeviceListInHealth);
            return arrayList;
        }

        public List<DeviceInfo> getUsedDeviceListInWear() {
            if (CallbackService.this.mUsedDeviceList == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(10);
            arrayList.addAll(CallbackService.this.mUsedDeviceList);
            return arrayList;
        }

        public JSONObject getDeviceCapability() {
            JSONObject jSONObjectC;
            ReleaseLogUtil.d(CallbackService.TAG, "Enter getDeviceCapability");
            if (CallbackService.this.mDeviceCapabilityListForHealth != null) {
                LogUtil.a(CallbackService.TAG, "getDeviceCapability null != mDeviceCapabilityListForHealth");
                if (CallbackService.this.mDeviceCapabilityListForHealth.size() > 1) {
                    ReleaseLogUtil.d(CallbackService.TAG, "getDeviceCapability has two devices");
                    for (DeviceCapability deviceCapability : CallbackService.this.mDeviceCapabilityListForHealth) {
                        if (!deviceCapability.isSupportRunPosture()) {
                            LogUtil.a(CallbackService.TAG, "getDeviceCapability has extra device");
                            try {
                                CallbackService.this.mOldhealthDeviceCapability = deviceCapability;
                                CallbackService.this.mOldDeviceCapabilityForHealth = new JSONObject(CallbackService.this.mGson.toJson(deviceCapability, DeviceCapability.class));
                                break;
                            } catch (Exception e) {
                                ReleaseLogUtil.d(CallbackService.TAG, "getDeviceCapability Exception");
                                xjt.v("getDeviceCapability Exception:" + e.getMessage());
                                break;
                            }
                        }
                    }
                } else {
                    ReleaseLogUtil.d(CallbackService.TAG, "getDeviceCapability has one devices");
                    try {
                        CallbackService callbackService = CallbackService.this;
                        callbackService.mOldhealthDeviceCapability = (DeviceCapability) callbackService.mDeviceCapabilityListForHealth.get(0);
                        CallbackService.this.mOldDeviceCapabilityForHealth = new JSONObject(CallbackService.this.mGson.toJson(CallbackService.this.mDeviceCapabilityListForHealth.get(0), DeviceCapability.class));
                    } catch (Exception e2) {
                        ReleaseLogUtil.d(CallbackService.TAG, "getDeviceCapability Exception");
                        if (CommonUtil.ap()) {
                            xjt.v("getDeviceCapability Exception :" + e2.getMessage());
                        }
                    }
                }
            }
            if (CallbackService.this.mDeviceCapability != null) {
                LogUtil.a(CallbackService.TAG, "getDeviceCapability null != mDeviceCapability");
                try {
                    CallbackService callbackService2 = CallbackService.this;
                    callbackService2.mWearDeviceCapability = (DeviceCapability) callbackService2.mGson.fromJson(CallbackService.this.mDeviceCapability.toString(), DeviceCapability.class);
                } catch (JsonSyntaxException e3) {
                    ReleaseLogUtil.d(CallbackService.TAG, "mWearDeviceCapability JsonSyntaxException:", e3.getMessage());
                    xjt.v("mWearDeviceCapability JsonSyntaxException:" + e3.getMessage());
                    CallbackService.this.mWearDeviceCapability = null;
                }
            }
            if (CallbackService.this.mWearDeviceCapability == null || CallbackService.this.mOldDeviceCapabilityForHealth == null) {
                jSONObjectC = CallbackService.this.mOldDeviceCapabilityForHealth != null ? CallbackService.this.mOldDeviceCapabilityForHealth : CallbackService.this.mDeviceCapability;
            } else {
                jSONObjectC = c();
            }
            ReleaseLogUtil.d(CallbackService.TAG, "CallbackService getDeviceCapability");
            return jSONObjectC;
        }

        private JSONObject c() {
            DeviceCapability deviceCapability = new DeviceCapability();
            deviceCapability.configureSupportExerciseAdvice(CallbackService.this.mWearDeviceCapability.isSupportExerciseAdvice() || CallbackService.this.mOldhealthDeviceCapability.isSupportExerciseAdvice());
            deviceCapability.configureSupportWorkoutExerciseDisplayLink(CallbackService.this.mWearDeviceCapability.isSupportWorkoutExerciseDisplayLink() || CallbackService.this.mOldhealthDeviceCapability.isSupportWorkoutExerciseDisplayLink());
            deviceCapability.configureSupportHeartRateInfo(CallbackService.this.mWearDeviceCapability.isSupportHeartRateInfo() || CallbackService.this.mOldhealthDeviceCapability.isSupportHeartRateInfo());
            deviceCapability.configureSupportStressInfo(CallbackService.this.mWearDeviceCapability.isSupportStressInfo() || CallbackService.this.mOldhealthDeviceCapability.isSupportStressInfo());
            deviceCapability.configureSupportWorkoutExerciseDisplayLink(CallbackService.this.mWearDeviceCapability.isSupportWorkoutExerciseDisplayLink() || CallbackService.this.mOldhealthDeviceCapability.isSupportWorkoutExerciseDisplayLink());
            deviceCapability.configureSupportAutoDetectMode(CallbackService.this.mWearDeviceCapability.isSupportAutoDetectMode() || CallbackService.this.mOldhealthDeviceCapability.isSupportAutoDetectMode());
            deviceCapability.configureSupportRunPosture(CallbackService.this.mWearDeviceCapability.isSupportRunPosture() || CallbackService.this.mOldhealthDeviceCapability.isSupportRunPosture());
            deviceCapability.configureSupportFootWear(CallbackService.this.mWearDeviceCapability.isSupportFootWear() || CallbackService.this.mOldhealthDeviceCapability.isSupportFootWear());
            deviceCapability.configureSupportInformCloseOrOpen(CallbackService.this.mWearDeviceCapability.isSupportInformCloseOrOpen() || CallbackService.this.mOldhealthDeviceCapability.isSupportInformCloseOrOpen());
            ReleaseLogUtil.d(CallbackService.TAG, "mOldhealthDeviceCapability 5.23.18", Boolean.valueOf(CallbackService.this.mWearDeviceCapability.isSupportInformCloseOrOpen()), "", Boolean.valueOf(CallbackService.this.mOldhealthDeviceCapability.isSupportInformCloseOrOpen()));
            try {
                ReleaseLogUtil.d(CallbackService.TAG, "mOldhealthDeviceCapability json string:", CallbackService.this.mGson.toJson(deviceCapability));
                JSONObject jSONObject = new JSONObject(CallbackService.this.mGson.toJson(deviceCapability));
                LogUtil.a(CallbackService.TAG, "result = ", jSONObject);
                return jSONObject;
            } catch (Exception e) {
                LogUtil.a(CallbackService.TAG, "mWearDeviceCapability JsonSyntaxException");
                xjt.v("mWearDeviceCapability JsonSyntaxException :" + e.getMessage());
                JSONObject jSONObject2 = CallbackService.this.mDeviceCapability;
                ReleaseLogUtil.d(CallbackService.TAG, "result = ", jSONObject2);
                return jSONObject2;
            }
        }

        public DeviceCapability getWearDeviceCapability() {
            if (CallbackService.this.mDeviceCapability != null) {
                try {
                    CallbackService callbackService = CallbackService.this;
                    callbackService.mWearDeviceCapability = (DeviceCapability) callbackService.mGson.fromJson(CallbackService.this.mDeviceCapability.toString(), DeviceCapability.class);
                } catch (JsonSyntaxException e) {
                    ReleaseLogUtil.d(CallbackService.TAG, "mWearDeviceCapability JsonSyntaxException:", e.getMessage());
                    xjt.v("mWearDeviceCapability JsonSyntaxException : " + e.getMessage());
                    CallbackService.this.mWearDeviceCapability = null;
                }
            }
            return CallbackService.this.mWearDeviceCapability;
        }

        public List<DeviceCapability> getHealthDeviceCapability() {
            return CallbackService.this.mDeviceCapabilityListForHealth;
        }

        public void setRemoteServerListener(IBaseResponseCallback iBaseResponseCallback) {
            CallbackService.this.mRemoteServerListener = iBaseResponseCallback;
        }

        public List<DeviceInfo> getWearDeviceList() {
            return CallbackService.this.mUsedDeviceList;
        }

        public void removeFunctionCallback(String str) {
            LogUtil.a(CallbackService.TAG, "Enter removeFunctionCallback()");
            if (CallbackService.this.mOneTimeCallbackCache.containsKey(str)) {
                ReleaseLogUtil.d(CallbackService.TAG, "Enter removeFunctionCallback() contains ", str);
                CallbackService.this.mOneTimeCallbackCache.remove(str);
            } else {
                ReleaseLogUtil.d(CallbackService.TAG, "Enter removeFunctionCallback() not contains ", str);
            }
            if (CallbackService.this.mRemoteFunctionDataList.containsKey(str)) {
                ReleaseLogUtil.d(CallbackService.TAG, "Enter removeFunctionCallback() mRemoteFunctionDataList contains ", str);
                CallbackService.this.mRemoteFunctionDataList.remove(str);
            } else {
                ReleaseLogUtil.d(CallbackService.TAG, "Enter removeFunctionCallback() mRemoteFunctionDataList not contains ", str);
            }
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBaseResponseCallback f7131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7132b;
        private String e;

        public a(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
            this.f7132b = str;
            this.e = str2;
            this.f7131a = iBaseResponseCallback;
        }

        public String e() {
            return this.f7132b;
        }

        public String c() {
            return this.e;
        }

        public IBaseResponseCallback d() {
            return this.f7131a;
        }
    }

    public void requestWearTask(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        RunPlanInfo runPlanInfo;
        synchronized (LOCK) {
            LogUtil.d(TAG, "wear app has been installed");
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.d(TAG, "requestWearTask funcName is empty");
                xjt.v("funcName is empty");
                return;
            }
            if (iBaseResponseCallback != null) {
                if (str.equals("getRunPlanParameter")) {
                    if (mIsHuaweiWearConnected) {
                        this.mOneTimeCallbackCache.put("getRunPlanParameter", iBaseResponseCallback);
                    }
                    if (mIsHuaweiHealthConnected) {
                        this.mOneTimeCallbackCache.put("getRunPlanParameterforhealth", iBaseResponseCallback);
                    }
                } else {
                    this.mOneTimeCallbackCache.put(str, iBaseResponseCallback);
                }
            }
            if (str.equals("setRunPlan") && str2 != null) {
                try {
                    try {
                        runPlanInfo = (RunPlanInfo) this.mGson.fromJson(new JSONObject(str2).getString("runPlanInfo"), RunPlanInfo.class);
                    } catch (JsonSyntaxException e) {
                        ReleaseLogUtil.d(TAG, "runplanlog JsonSyntaxException :", e.getMessage());
                        xjt.v("runplanlog JsonSyntaxException:" + e.getMessage());
                        runPlanInfo = null;
                    }
                } catch (JSONException e2) {
                    ReleaseLogUtil.d(TAG, "runplanlog JSONException :", e2.getMessage());
                    xjt.v("runplanlog JSONException:" + e2.getMessage());
                    runPlanInfo = null;
                }
                if (runPlanInfo == null) {
                    runPlanInfo = new RunPlanInfo();
                }
                if (runPlanInfo.getRunPlanStructList() != null) {
                    LogUtil.a(TAG, "runplanlog mRunPlanMap.get(\"health\") :", this.mRunPlanMap.get(HEALTH));
                    LogUtil.a(TAG, "runplanlog mRunPlanMap.get(\"wear\") :", this.mRunPlanMap.get("wear"));
                    ReleaseLogUtil.d(TAG, "runplanlog mRunPlanMap.get runPlanInfo size:", Integer.valueOf(runPlanInfo.getRunPlanStructList().size()));
                    if (runPlanInfo.getRunPlanStructList().size() == 1 && "00000000000000000000000000000000".equals(runPlanInfo.getRunPlanTotalSign())) {
                        LogUtil.a(TAG, "runplanlog finish plan");
                        exeRequest(str, str2, iBaseResponseCallback);
                        exeRequest("setRunPlanForHealth", str2, iBaseResponseCallback);
                        this.mRunPlanMap.remove("wear");
                        this.mRunPlanMap.remove(HEALTH);
                        return;
                    }
                    if (isMatchWear(runPlanInfo)) {
                        ReleaseLogUtil.d(TAG, "containsKey(wear)");
                        this.mRunPlanMap.remove("wear");
                    }
                    if (isMatchHealth(runPlanInfo)) {
                        ReleaseLogUtil.d(TAG, "containsKey(health)");
                        str = "setRunPlanForHealth";
                        this.mRunPlanMap.remove(HEALTH);
                    }
                }
                ReleaseLogUtil.d(TAG, "runplanlog runplan funcName:", str);
            }
            exeRequest(str, str2, iBaseResponseCallback);
        }
    }

    private boolean isMatchWear(RunPlanInfo runPlanInfo) {
        boolean z;
        if (runPlanInfo == null) {
            LogUtil.a(TAG, "runplanlog isMatchWear runPlanInfo is null");
        } else {
            if (!this.mRunPlanMap.containsKey(HEALTH) ? !(!this.mRunPlanMap.containsKey("wear") || runPlanInfo.getRunPlanStructList() == null || this.mRunPlanMap.get("wear").intValue() < runPlanInfo.getRunPlanStructList().size()) : !(!this.mRunPlanMap.containsKey("wear") || runPlanInfo.getRunPlanStructList() == null || (this.mRunPlanMap.get("wear").intValue() != runPlanInfo.getRunPlanStructList().size() && (this.mRunPlanMap.get("wear").intValue() <= runPlanInfo.getRunPlanStructList().size() || this.mRunPlanMap.get(HEALTH).intValue() >= runPlanInfo.getRunPlanStructList().size())))) {
                z = true;
            }
            LogUtil.a(TAG, "runplanlog isMatchWear:", Boolean.valueOf(z));
            return z;
        }
        z = false;
        LogUtil.a(TAG, "runplanlog isMatchWear:", Boolean.valueOf(z));
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    private boolean isMatchHealth(RunPlanInfo runPlanInfo) {
        boolean z = false;
        if (runPlanInfo == null) {
            LogUtil.a(TAG, "runplanlog isMatchHealth runPlanInfo is null");
        } else if (this.mRunPlanMap.containsKey("wear")) {
            boolean z2 = this.mRunPlanMap.get(HEALTH).intValue() == runPlanInfo.getRunPlanStructList().size() || (this.mRunPlanMap.get(HEALTH).intValue() > runPlanInfo.getRunPlanStructList().size() && (this.mRunPlanMap.get("wear").intValue() > runPlanInfo.getRunPlanStructList().size()));
            if (this.mRunPlanMap.containsKey(HEALTH) && runPlanInfo.getRunPlanStructList() != null && z2) {
                z = true;
            }
        } else if (this.mRunPlanMap.containsKey(HEALTH) && runPlanInfo.getRunPlanStructList() != null && this.mRunPlanMap.get(HEALTH).intValue() >= runPlanInfo.getRunPlanStructList().size()) {
            z = true;
        }
        LogUtil.a(TAG, "runplanlog isMatchHealth:", Boolean.valueOf(z));
        return z;
    }

    private void exeRequest(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        if ("workoutOperateRealtimeData".equals(str)) {
            LogUtil.a(TAG, "exeRequest connect state:", Boolean.valueOf(isConnectedWithRemote()), "funcName:", str);
        } else {
            ReleaseLogUtil.d(TAG, "exeRequest connect state:", Boolean.valueOf(isConnectedWithRemote()), "funcName:", str);
        }
        if (!isConnectedWithRemote()) {
            LogUtil.a(TAG, "service is not connected!");
            if ("syncFitnessDetailData".equals(str) && iBaseResponseCallback != null) {
                iBaseResponseCallback.a(100001, null);
            }
            startRemoteService();
            ReleaseLogUtil.d(TAG, "requestWearTask funcName ", str);
            if (lsc.b(str)) {
                if (this.mNoDeviceRemoteFunctionDataList.get(str) != null) {
                    LogUtil.a(TAG, "requestWearTask funcName exist in noDeviceRemoteFunciotnDataList");
                }
                LogUtil.a(TAG, "requestWearTask funcName put noDeviceRemoteFunciotnDataList");
                this.mNoDeviceRemoteFunctionDataList.put(str, new a(str, str2, iBaseResponseCallback));
                return;
            }
            if (this.mRemoteFunctionDataList.get(str) != null) {
                LogUtil.a(TAG, "requestWearTask funcName exist in mRemoteFunctionDataList");
            }
            this.mRemoteFunctionDataList.put(str, new a(str, str2, iBaseResponseCallback));
            return;
        }
        LogUtil.a(TAG, "exeRequest: the callbackservice is calling ", str);
        HashMap map = new HashMap(16);
        map.put("funcName", str);
        if (str2 != null) {
            map.put("parameters", str2);
        }
        if (!"setOperator".equals(str) && !"setHeartRateReportStatus".equals(str)) {
            if ("setStressReportStatus".equals(str) && !dxm.r(str2)) {
                if (isWeaR1PConnected() && isWearDeviceSupportStress()) {
                    ReleaseLogUtil.d(TAG, "send to requestWearTaskForWear");
                    requestWearTaskForWear(map, str);
                    return;
                } else if (isHealthR1PConnected() && isHealthDeviceSupportStress()) {
                    ReleaseLogUtil.d(TAG, "send to requestWearTaskForHealth");
                    requestWearTaskForHealth(map, str);
                    return;
                } else {
                    ReleaseLogUtil.d(TAG, "send to other");
                    requestWearTaskForWear(map, str);
                    requestWearTaskForHealth(map, str);
                    return;
                }
            }
            if (checkConnected(str)) {
                if (!dxm.r(str2)) {
                    requestWearTaskForWear(map, str);
                }
            } else {
                ReleaseLogUtil.d(TAG, "don't send command:", str);
            }
            requestWearTaskForHealth(map, str);
            if ("syncFitnessDetailData".equals(str)) {
                fif.c().a();
                return;
            }
            return;
        }
        if (isWearDeviceSupportHeart() && !dxm.r(str2)) {
            requestWearTaskForWear(map, str);
        }
        if (isHealthDeviceSupportHeart()) {
            requestWearTaskForHealth(map, str);
        }
    }

    private boolean checkConnected(String str) {
        List<DeviceInfo> list = this.mUsedDeviceList;
        return (!(list != null && list.size() > 0) && "syncFitnessDetailData".equals(str) && mIsHuaweiHealthConnected) ? false : true;
    }

    public boolean isWearDeviceSupportStress() {
        JSONObject jSONObject = this.mDeviceCapability;
        if (jSONObject != null) {
            try {
                this.mWearDeviceCapability = (DeviceCapability) this.mGson.fromJson(jSONObject.toString(), DeviceCapability.class);
            } catch (JsonSyntaxException e) {
                ReleaseLogUtil.d(TAG, "mWearDeviceCapability JsonSyntaxException:", e.getMessage());
                xjt.v("mWearDeviceCapability JsonSyntaxException:" + e.getMessage());
                this.mWearDeviceCapability = null;
            }
        }
        DeviceCapability deviceCapability = this.mWearDeviceCapability;
        boolean zIsSupportStressInfo = deviceCapability != null ? deviceCapability.isSupportStressInfo() : false;
        LogUtil.a(TAG, "isWearDeviceSupportStress :", Boolean.valueOf(zIsSupportStressInfo));
        return zIsSupportStressInfo;
    }

    private boolean isWeaR1PConnected() {
        List<DeviceInfo> list = this.mUsedDeviceList;
        boolean z = false;
        if (list != null) {
            for (DeviceInfo deviceInfo : list) {
                if (1 == deviceInfo.getDeviceActiveState() && 2 == deviceInfo.getDeviceConnectState() && deviceInfo.getProductType() == 43) {
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean isHealthR1PConnected() {
        List<DeviceInfo> list = this.mUsedDeviceListInHealth;
        boolean z = false;
        if (list != null) {
            for (DeviceInfo deviceInfo : list) {
                if (1 == deviceInfo.getDeviceActiveState() && 2 == deviceInfo.getDeviceConnectState() && deviceInfo.getProductType() == 43) {
                    z = true;
                }
            }
        }
        return z;
    }

    private void requestWearTaskForWear(Map<String, String> map, String str) {
        int iBeginBroadcast = this.mCallbackList.beginBroadcast();
        if ("workoutOperateRealtimeData".equals(str)) {
            LogUtil.a(TAG, "requestWearTaskForWear: calling remote callback, the length is", Integer.valueOf(iBeginBroadcast));
        } else {
            ReleaseLogUtil.d(TAG, "requestWearTaskForWear: calling remote callback, the length is", Integer.valueOf(iBeginBroadcast));
        }
        for (int i = 0; i < iBeginBroadcast; i++) {
            executeTask(map, this.mCallbackList.getBroadcastItem(i));
        }
        this.mCallbackList.finishBroadcast();
    }

    private void requestWearTaskForHealth(Map<String, String> map, String str) {
        int iBeginBroadcast = this.mCallbackListForHealth.beginBroadcast();
        if ("workoutOperateRealtimeData".equals(str)) {
            LogUtil.a(TAG, "requestWearTaskForHealth: calling remote callback, the length is", Integer.valueOf(iBeginBroadcast));
        } else {
            ReleaseLogUtil.d(TAG, "requestWearTaskForHealth: calling remote callback, the length is", Integer.valueOf(iBeginBroadcast));
        }
        for (int i = 0; i < iBeginBroadcast; i++) {
            executeTask(map, this.mCallbackListForHealth.getBroadcastItem(i));
        }
        this.mCallbackListForHealth.finishBroadcast();
    }

    private void executeTask(final Map<String, String> map, final IInterface iInterface) {
        Runnable runnable = new Runnable() { // from class: com.huawei.health.hwhealthlinkage.wearsdk.CallbackService.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IInterface iInterface2 = iInterface;
                    if (iInterface2 == null) {
                        ReleaseLogUtil.a(CallbackService.TAG, "calling remote callback, item is null");
                    } else {
                        ((IRemoteProxyCallback) iInterface2).requestWearTask(map);
                    }
                } catch (RemoteException e) {
                    ReleaseLogUtil.a(CallbackService.TAG, LogAnonymous.b(e));
                    xjt.v("executeTask remoteException:" + e.getMessage());
                } catch (Exception e2) {
                    ReleaseLogUtil.a(CallbackService.TAG, "executeTask Exception");
                    xjt.v("executeTask exception:" + e2.getMessage());
                }
            }
        };
        if (lsy.a(runnable) != 0) {
            ThreadPoolManager.c().execute(runnable);
        }
    }

    public void registerNotification(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG, "notificationName ", str, " registered");
        List<IBaseResponseCallback> copyOnWriteArrayList = this.mNotificationCallbackCache.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.mNotificationCallbackCache.put(str, copyOnWriteArrayList);
        }
        if (copyOnWriteArrayList.contains(iBaseResponseCallback)) {
            return;
        }
        copyOnWriteArrayList.add(iBaseResponseCallback);
    }

    public void unRegisterNotification(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG, "start ----unRegisterNotification ", str, " registered");
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.d(TAG, "the callback is null. from function : ", str);
            return;
        }
        List<IBaseResponseCallback> list = this.mNotificationCallbackCache.get(str);
        if (list == null) {
            ReleaseLogUtil.d(TAG, "You have not registerNotification any callback from function : ", str);
        } else if (!list.contains(iBaseResponseCallback)) {
            LogUtil.a(TAG, "list do not contain callback. from function : ", str);
        } else {
            ReleaseLogUtil.d(TAG, "done --- unRegisterNotification ", str, " registered");
            list.remove(iBaseResponseCallback);
        }
    }

    private void startRemoteService() {
        fif.c().b();
    }

    final class c implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBinder f7134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f7135c;
        private final String d;

        public c(IBinder iBinder, String str, String str2) {
            this.f7134b = iBinder;
            this.d = str;
            this.f7135c = str2;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            if (CallbackService.this.mClients.indexOf(this) < 0) {
                return;
            }
            ReleaseLogUtil.d(CallbackService.TAG, "client died mPackageName: ", this.d, " the size of mClients is ", Integer.valueOf(CallbackService.this.mClients.size()));
            CallbackService.this.mClients.remove(this);
            if (this.d.equals("PhoneService")) {
                boolean unused = CallbackService.mIsHuaweiWearConnected = false;
                LogUtil.a(CallbackService.TAG, "与穿戴App断开的连接状态是否存入成功 (binderDied)：", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_CONNECTION_TO_WEAR", "1", null)));
            } else if (this.d.equals("PhoneServiceInHealth")) {
                boolean unused2 = CallbackService.mIsHuaweiHealthConnected = false;
                Intent intent = new Intent();
                intent.setAction("com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD");
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
                ReleaseLogUtil.d(CallbackService.TAG, "send ", "com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSameDevice(List<DeviceInfo> list) {
        String uuid;
        String uuid2;
        List<DeviceInfo> list2 = this.mUsedDeviceList;
        if (list2 != null && list != null) {
            Iterator<DeviceInfo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uuid2 = "";
                    break;
                }
                DeviceInfo next = it.next();
                if (1 == next.getDeviceActiveState()) {
                    uuid2 = next.getUuid();
                    break;
                }
            }
            Iterator<DeviceInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    uuid = "";
                    break;
                }
                DeviceInfo next2 = it2.next();
                if (1 == next2.getDeviceActiveState()) {
                    uuid = next2.getUuid();
                    break;
                }
            }
        } else {
            uuid = "";
            uuid2 = uuid;
        }
        return !uuid.equals("") && uuid.equals(uuid2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSameDeviceInHealth(List<DeviceInfo> list) {
        String uuid;
        String uuid2;
        List<DeviceInfo> list2 = this.mUsedDeviceListInHealth;
        if (list2 != null && list != null) {
            Iterator<DeviceInfo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uuid2 = "";
                    break;
                }
                DeviceInfo next = it.next();
                if (1 == next.getDeviceActiveState()) {
                    uuid2 = next.getUuid();
                    break;
                }
            }
            Iterator<DeviceInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    uuid = "";
                    break;
                }
                DeviceInfo next2 = it2.next();
                if (1 == next2.getDeviceActiveState()) {
                    uuid = next2.getUuid();
                    break;
                }
            }
        } else {
            uuid = "";
            uuid2 = uuid;
        }
        return !uuid.equals("") && uuid.equals(uuid2);
    }

    public IBinder getLinkageBinder() {
        ICallbackInterface.Stub stub;
        synchronized (OBJECT_LOCK) {
            stub = this.iCallback;
        }
        return stub;
    }
}
