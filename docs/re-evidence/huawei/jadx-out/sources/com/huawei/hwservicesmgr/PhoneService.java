package com.huawei.hwservicesmgr;

import android.app.Service;
import android.app.job.JobScheduler;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;
import com.google.gson.Gson;
import com.huawei.callback.OtaResultCallbackInterface;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.constant.ResultCodeMessage;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.devicemgr.business.entity.Result;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.IAddDeviceStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwcommonservice.IServiceBinder;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.binder.HeartStudyBinder;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback;
import com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder;
import com.huawei.hwdevice.phoneprocess.mgr.connectmgr.DeviceDialogMessage;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager;
import com.huawei.hwdevice.phoneprocess.receiver.IntegratedServicesReceiver;
import com.huawei.hwdevice.phoneprocess.receiver.NetworkConnectReceiver;
import com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription;
import com.huawei.hwdevice.phoneprocess.util.LanguageChangedReceiver;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.phdkit.DvLiteCoreBinder;
import com.huawei.syncmgr.SyncOption;
import com.huawei.wearengine.HiWearCoreBinder;
import com.huawei.wearengine.HwWearEngineNative;
import com.huawei.wearmgr.outofprocess.datatype.BluetoothType;
import defpackage.cio;
import defpackage.clz;
import defpackage.cmm;
import defpackage.cnk;
import defpackage.cnl;
import defpackage.cph;
import defpackage.cqp;
import defpackage.ecu;
import defpackage.iof;
import defpackage.llm;
import defpackage.lnm;
import defpackage.lsl;
import defpackage.ltm;
import defpackage.mei;
import defpackage.mhp;
import defpackage.mir;
import defpackage.mis;
import defpackage.miy;
import defpackage.mjn;
import defpackage.mjw;
import defpackage.mjx;
import defpackage.mjy;
import defpackage.mjz;
import defpackage.mkb;
import defpackage.mkf;
import defpackage.mkm;
import defpackage.mkn;
import defpackage.mku;
import defpackage.mlb;
import defpackage.mld;
import defpackage.mlh;
import defpackage.mlu;
import defpackage.mmo;
import defpackage.mms;
import defpackage.mmx;
import defpackage.mnc;
import defpackage.mnl;
import defpackage.mnn;
import defpackage.mqn;
import defpackage.mqu;
import defpackage.mrj;
import defpackage.mro;
import defpackage.mrr;
import defpackage.mrx;
import defpackage.mrz;
import defpackage.mvx;
import defpackage.mwe;
import defpackage.mwt;
import defpackage.mwx;
import defpackage.mxf;
import defpackage.mxn;
import defpackage.mxw;
import defpackage.myl;
import defpackage.mzj;
import defpackage.mzz;
import defpackage.nac;
import defpackage.naf;
import defpackage.nau;
import defpackage.nby;
import defpackage.ncl;
import defpackage.ndb;
import defpackage.ndn;
import defpackage.ndq;
import defpackage.nei;
import defpackage.nej;
import defpackage.nem;
import defpackage.nfs;
import defpackage.nsn;
import defpackage.xgt;
import defpackage.xgv;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.BuildConfigProperties;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAllowListConfig;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f17677a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f17678b = true;
    private static boolean d = false;
    private static IDeviceStateAIDLCallback e;
    private static ncl j;
    private BroadcastReceiver ab;
    private d ac;
    private nej ae;
    private ndq af;
    private mwx ag;
    private mlh ah;
    private BroadcastReceiver ai;
    private PhoneListManager aj;
    private BroadcastReceiver ak;
    private nei ao;
    private mrz ap;
    private mjz aq;
    private mjw ax;
    private mqu m;
    private mro n;
    private mrj p;
    private HwDeviceMgrInterface q;
    private IAddDeviceStateAIDLCallback t;
    private DeviceSettingSubscription w;
    private static Map<String, IDeviceStateAIDLCallback> h = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Integer> f17679c = null;
    private List<a> l = new ArrayList();
    private Handler ad = new Handler();
    private ExecutorService z = Executors.newSingleThreadExecutor();
    private BroadcastReceiver an = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "mLogReceiver onReceive intent is null");
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.health.action.ACTION_OVERSEA_BETA_LOG".equals(action)) {
                ReleaseLogUtil.d("DEVMGR_PhoneService", "begin to switch beta log from oversea to domestic");
                LogAllowListConfig.d(!Boolean.parseBoolean(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(2039), "beta_log_switch")));
                LogUtil.f();
            }
            if ("com.huawei.health.action.ACTION_BETA_DEBUG_LOG".equals(action)) {
                ReleaseLogUtil.d("DEVMGR_PhoneService", "begin to open debug level for beta log");
                LogConfig.d(Boolean.parseBoolean(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(Constants.START_TO_INDOOR_RUNNING), "beta_debug_log_switch")));
                LogUtil.a("DEVMGR_PhoneService", "begin to set log level, current minimum logLevel is debug: true, BUILD_TYPE: ", BuildConfigProperties.d(), ", LOG_LEVEL: ", Integer.valueOf(health.compact.a.LogConfig.e()));
            }
        }
    };
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.13
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v8, types: [int] */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            ?? N;
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "mAppInstalledReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            String[] strArrSplit = intent.getDataString().split(":");
            if (strArrSplit.length > 1) {
                str = strArrSplit[1];
            } else {
                str = strArrSplit[0];
            }
            LogUtil.a("DEVMGR_PhoneService", "mAppInstalledReceiver action:", action, " packageName:", str);
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                boolean zContains = cio.e.contains(str);
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10001), str);
                if (!TextUtils.isEmpty(strE)) {
                    N = zContains;
                    N = CommonUtil.n(BaseApplication.getContext(), strE);
                }
                N = zContains;
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10001), str, String.valueOf((int) N), new StorageParams(0));
                NotificationContentProviderUtil.a(str, N);
                if (N == 1) {
                    nby.a().d(str);
                    return;
                }
                return;
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                NotificationContentProviderUtil.a(str, 0);
            }
        }
    };
    private KitWearBinder ar = new KitWearBinder();
    private HeartStudyBinder aa = new HeartStudyBinder();
    private DvLiteCoreBinder v = new DvLiteCoreBinder();
    private final b f = new b();
    private long r = 1000;
    private BTDeviceMgrUtil o = BTDeviceMgrUtil.c();
    private DeviceStateCallback u = new DeviceStateCallback() { // from class: com.huawei.hwservicesmgr.PhoneService.14
        @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback
        public void onDataReceived(DeviceInfo deviceInfo, int i, byte[] bArr) {
            if (PhoneService.this.ax != null) {
                PhoneService.this.ax.a(deviceInfo, i, bArr, PhoneService.e, PhoneService.h);
            } else {
                ReleaseLogUtil.d("DEVMGR_PhoneService", "onDataReceived mlayerDataOrder is null");
            }
        }

        @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback
        public void onAckReceived(DeviceInfo deviceInfo, int i, byte[] bArr) {
            if (PhoneService.e != null) {
                try {
                    PhoneService.e.onAckReceived(deviceInfo, i, bArr);
                } catch (RemoteException unused) {
                    LogUtil.e("DEVMGR_PhoneService", "onAckReceived remoteException RemoteException");
                }
            }
        }

        @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback
        public void onDatasReceived(DeviceInfo deviceInfo, int i, String str) {
            LogUtil.a("DEVMGR_PhoneService", "onDatasReceived remoteException:", str);
            if (PhoneService.e != null) {
                try {
                    PhoneService.e.onDatasReceived(deviceInfo, i, str);
                } catch (RemoteException unused) {
                    LogUtil.e("DEVMGR_PhoneService", "onDataReceived remoteException RemoteException");
                }
            }
        }

        @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback
        public void onConnectStatusChanged(DeviceInfo deviceInfo) {
            if (deviceInfo != null) {
                DeviceStatusParam deviceStatusParamD = PhoneService.this.d(deviceInfo);
                if (PhoneService.e != null) {
                    try {
                        PhoneService.e.onDeviceConnectionStateChanged(deviceInfo, deviceInfo.getDeviceConnectState(), deviceStatusParamD);
                    } catch (RemoteException unused) {
                        LogUtil.e("DEVMGR_PhoneService", "onDataReceived remoteException RemoteException");
                    }
                }
                mjn.d(deviceInfo, deviceStatusParamD);
                return;
            }
            LogUtil.j("DEVMGR_PhoneService", "onConnectStatusChanged deviceInfo is null.");
        }
    };
    private BroadcastReceiver x = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.12
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("DEVMGR_PhoneService", "EmergencyInfoBroadcastReceiver");
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "EmergencyInfoBroadcastReceiver is null");
                xjt.ak("PhoneService mEmergencyInfoChangeReceiver onReceive: intent is null");
            } else if ("emergency_info_change".equals(intent.getAction()) && (intent.getSerializableExtra("emergency_info_value") instanceof iof)) {
                iof iofVar = (iof) intent.getSerializableExtra("emergency_info_value");
                mxw.e().a(intent.getStringExtra("emergency_info_key"), iofVar);
            }
        }
    };
    private BroadcastReceiver am = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.19
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "mBluetoothSwitchStateReceiver onReceive intent is null");
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.health.action.MOCK_REPORT_COMMAND".equals(action)) {
                byte[] bArrD = cph.d(intent.getStringExtra("dataInfos"));
                int length = bArrD.length;
                Parcelable parcelableExtra = intent.getParcelableExtra("device_info");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("DEVMGR_PhoneService", "onReceive deviceStatusReceiver is not deviceInfo");
                    return;
                }
                LogUtil.j("DEVMGR_PhoneService", "mMockBlueCmdReceiver deviceStatusReceiver  " + cph.d(bArrD));
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                String stringExtra = intent.getStringExtra("type");
                byte b2 = bArrD[0];
                stringExtra.hashCode();
                if (stringExtra.equals("sendInfoToWatch")) {
                    LogUtil.j("DEVMGR_PhoneService", "mMockBlueCmdReceiver  sendInfoToWatch");
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(bArrD[0]);
                    deviceCommand.setCommandId(bArrD[1]);
                    int length2 = bArrD.length - 2;
                    byte[] bArr = new byte[length2];
                    System.arraycopy(bArrD, 2, bArr, 0, bArrD.length - 2);
                    deviceCommand.setDataContent(bArr);
                    deviceCommand.setDataLen(length2);
                    mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
                    return;
                }
                if (!stringExtra.equals("receiveWatchInfo")) {
                    LogUtil.j("DEVMGR_PhoneService", "mMockBlueCmdReceiver  other");
                    return;
                }
                LogUtil.j("DEVMGR_PhoneService", "mMockBlueCmdReceiver  receiveWatchInfo");
                if (Arrays.asList(52, 44, 40, 55, 57).contains(Integer.valueOf(b2))) {
                    cmm cmmVar = new cmm();
                    cmmVar.a(bArrD);
                    cnl.b().e(cnk.c().j(deviceInfo.getDeviceIdentify()), cmmVar, 0);
                    return;
                }
                PhoneService.this.ax.a(deviceInfo, length, bArrD, PhoneService.e, PhoneService.h);
                return;
            }
            LogUtil.j("DEVMGR_PhoneService", "mMockBlueCmdReceiver  action is " + action);
        }
    };
    private BroadcastReceiver k = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.18
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothAdapter defaultAdapter;
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "mBluetoothSwitchStateReceiver onReceive intent is null");
                return;
            }
            if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return;
            }
            int state = defaultAdapter.getState();
            LogUtil.a("DEVMGR_PhoneService", "bt switch status:", Integer.valueOf(state));
            if (state != 10) {
                LogUtil.j("DEVMGR_PhoneService", "mBluetoothSwitchStateReceiver default");
            } else {
                PhoneService.this.stopSelf();
            }
        }
    };
    private BroadcastReceiver y = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.20
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "onReceive deviceStatusReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            ReleaseLogUtil.d("DEVMGR_PhoneService", "onReceive deviceStatusReceiver:", action);
            if (TextUtils.isEmpty(action) || CommonUtil.bg()) {
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("DEVMGR_PhoneService", "onReceive deviceStatusReceiver is not deviceInfo");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (deviceInfo.getDeviceConnectState() == 2) {
                    PhoneService.this.ae.d();
                    mir.c(BaseApplication.getContext(), "device_connected");
                }
                PhoneService.this.ae.b(deviceInfo);
                return;
            }
            if (!"com.huawei.health.action.unbindNotification".equals(action)) {
                LogUtil.j("DEVMGR_PhoneService", "onReceive deviceStatusReceiver default");
            } else {
                PhoneService.this.stopForeground(false);
            }
        }
    };
    private BroadcastReceiver al = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.17
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("DEVMGR_PhoneService", "onReceive mLoginStatusReceiver:start");
            if (intent == null) {
                LogUtil.j("DEVMGR_PhoneService", "onReceive mLoginStatusReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("DEVMGR_PhoneService", "onReceive mLoginStatusReceiver:", action);
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if ("com.huawei.plugin.account.logout".equals(action)) {
                PhoneService.this.o();
                miy.e(context).a();
            }
            if ("com.huawei.plugin.account.login".equals(action)) {
                mzz.c().a();
            }
        }
    };
    private final IServiceBinder.Stub s = new IServiceBinder.Stub() { // from class: com.huawei.hwservicesmgr.PhoneService.9
        @Override // com.huawei.hwcommonservice.IServiceBinder
        public IBinder getServiceBinder(String str, int i) {
            LogUtil.a("DEVMGR_PhoneService", "getServiceBinder input packageName is ", str);
            String[] packagesForUid = BaseApplication.getContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null) {
                for (String str2 : packagesForUid) {
                    if (BaseApplication.getAppPackage().equals(str2)) {
                        LogUtil.a("DEVMGR_PhoneService", "Enter verifyPackageNameByUid true");
                        return PhoneService.this.f;
                    }
                }
            }
            if (!llm.c(BaseApplication.getContext(), str)) {
                return null;
            }
            if ("com.plagh.heartstudy".equals(str)) {
                return PhoneService.this.aa;
            }
            if ("com.huawei.dmsdp".equals(str)) {
                return PhoneService.this.v;
            }
            LogUtil.j("DEVMGR_PhoneService", "NOT PHD KIT packageName");
            return null;
        }
    };
    private final BtSwitchStateCallback g = new BtSwitchStateCallback() { // from class: com.huawei.hwservicesmgr.PhoneService.2
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i) {
            LogUtil.a("DEVMGR_PhoneService", "btSwitchState:", Integer.valueOf(i));
        }
    };
    private BroadcastReceiver as = new BroadcastReceiver() { // from class: com.huawei.hwservicesmgr.PhoneService.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long j2;
            long j3;
            if (intent == null || !"android.intent.action.TIME_TICK".equals(intent.getAction())) {
                LogUtil.e("DEVMGR_PhoneService", "intent is null or action not is ACTION_TIME_TICK");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jD = SharedPreferenceManager.d("HEARTBEAT_INFO", "last_heartbeat_time", 0L);
            long jD2 = SharedPreferenceManager.d("HEARTBEAT_INFO", "heartbeat_count", 0L);
            long jD3 = SharedPreferenceManager.d("HEARTBEAT_INFO", "HUAWEI Translate_count", 0L);
            long jD4 = SharedPreferenceManager.d("HEARTBEAT_INFO", "heartbeat_total_time", 0L);
            if (lsl.c(jCurrentTimeMillis, jD)) {
                if (PhoneService.f17678b) {
                    jD2++;
                    SharedPreferenceManager.c("HEARTBEAT_INFO", "heartbeat_count", jD2);
                    boolean unused = PhoneService.f17678b = false;
                } else if (jCurrentTimeMillis - jD > 120000) {
                    j3 = jD3 + 1;
                    j2 = jD4;
                } else {
                    jD4 += 60;
                }
                j2 = jD4;
                j3 = jD3;
            } else {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
                linkedHashMap.put("companionFlag", Boolean.valueOf(SharedPreferenceManager.b("HEARTBEAT_INFO", "companion_device_manager_flag", false)).toString());
                linkedHashMap.put("heartBeatCount", jD2 + "");
                linkedHashMap.put("freezeCount", jD3 + "");
                linkedHashMap.put("heartbeatTotalTime", jD4 + "");
                OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_PROBABILITY_PROBLEM_85070032.value(), linkedHashMap);
                j2 = 0;
                j3 = 0;
                jD2 = 0;
            }
            SharedPreferenceManager.c("HEARTBEAT_INFO", "last_heartbeat_time", jCurrentTimeMillis);
            SharedPreferenceManager.c("HEARTBEAT_INFO", "heartbeat_total_time", j2);
            SharedPreferenceManager.c("HEARTBEAT_INFO", "heartbeat_count", jD2);
            SharedPreferenceManager.c("HEARTBEAT_INFO", "HUAWEI Translate_count", j3);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceStatusParam d(DeviceInfo deviceInfo) {
        List<DeviceInfo> listA;
        boolean zC;
        DeviceStatusParam deviceStatusParam = new DeviceStatusParam();
        deviceStatusParam.setErrorCode(clz.c());
        if (mjx.d(deviceInfo.getProductType())) {
            zC = mkn.e().c();
            listA = mkm.d().e();
        } else {
            listA = mkf.d().a();
            zC = false;
        }
        deviceStatusParam.setIsDeviceConnectDirectly(zC);
        deviceStatusParam.setDeviceInfoList(listA);
        return deviceStatusParam;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.q != null) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DEVMGR_PhoneService");
            ArrayList arrayList = new ArrayList(16);
            d(deviceList, arrayList, SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false));
            this.q.unPair(arrayList, false);
        }
    }

    private void d(List<DeviceInfo> list, List<String> list2, boolean z) {
        if (z) {
            SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "basic_service_switch", true);
            Iterator<DeviceInfo> it = list.iterator();
            while (it.hasNext()) {
                list2.add(it.next().getDeviceIdentify());
            }
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && mkb.c(deviceInfo.getDeviceIdentify()).isSupportAccountSwitch()) {
                LogUtil.a("DEVMGR_PhoneService", "disconnectSupportAccountSwitchDevice", CommonUtil.n(deviceInfo.getDeviceIdentify()));
                list2.add(deviceInfo.getDeviceIdentify());
            }
        }
    }

    class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.huawei.health.user.exit".equals(intent.getAction())) {
                return;
            }
            LogUtil.a("ExitBroadcastReceiver", "exit by user");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwservicesmgr.PhoneService.d.3
                @Override // java.lang.Runnable
                public void run() {
                    if (PhoneService.this.q != null) {
                        LogUtil.a("ExitBroadcastReceiver", "user exit, so disconnectAllDevices");
                        PhoneService.this.q.unPair(null, false);
                    }
                    try {
                        Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    } catch (InterruptedException unused) {
                        LogUtil.e("ExitBroadcastReceiver", "exit by user, InterruptedException");
                    }
                    Process.killProcess(Process.myPid());
                }
            });
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        mei.e().d();
        f();
        mmx.b();
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(this);
        this.q = hwDeviceMgrInterfaceE;
        hwDeviceMgrInterfaceE.registerAdapter(nfs.d());
        nem.d().e(new IBaseResponseCallback() { // from class: nso
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(i, obj);
            }
        });
        mkf.d().registerDeviceStateCallback(this.u);
        this.q.registerDeviceStateCallback(this.u);
        this.aq = mjz.c();
        mjw mjwVar = new mjw();
        this.ax = mjwVar;
        mjwVar.e(this);
        k();
        t();
        cqp.a(100054, "", "", "");
        q();
        mrr.c().d();
        mis.e().b();
        c((Context) this);
        nau.c().a();
        y();
        if (ScreenUtil.d() && mwe.a().h()) {
            mwe.a().l();
        }
    }

    public /* synthetic */ void d(int i, Object obj) {
        c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r() {
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(103, new HiSubscribeListener() { // from class: com.huawei.hwservicesmgr.PhoneService.4
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                List unused = PhoneService.f17679c = list;
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j2) {
                if (i != 103) {
                    return;
                }
                LogUtil.a("DEVMGR_PhoneService", "subscribeNotificationSampleConfig onChange changeKey=", str);
                if ("900500009".equals(str)) {
                    LogUtil.a("DEVMGR_PhoneService", "subscribeNotificationSampleConfig onChange notification main switch");
                    mjn.j();
                }
                if ("900500010".equals(str)) {
                    LogUtil.a("DEVMGR_PhoneService", "subscribeNotificationSampleConfig onChange notification reminder switch");
                    mjn.h();
                }
                if ("900500035".equals(str)) {
                    LogUtil.a("DEVMGR_PhoneService", "subscribeNotificationSampleConfig onChange notification app sub switch");
                    mjn.e();
                }
            }
        });
    }

    private static void y() {
        if (f17679c != null) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(new ArrayList(f17679c), new HiUnSubscribeListener() { // from class: com.huawei.hwservicesmgr.PhoneService.1
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    LogUtil.a("DEVMGR_PhoneService", "subscribeNotificationSampleConfig first unSubscribe isSuccess=", Boolean.valueOf(z));
                    if (z) {
                        List unused = PhoneService.f17679c = null;
                        if (PhoneService.f17679c == null) {
                            ReleaseLogUtil.d("DEVMGR_PhoneService", "subscribeNotificationSampleConfigConnected unSubAfterSub");
                            PhoneService.r();
                        }
                    }
                }
            });
        } else {
            ReleaseLogUtil.d("DEVMGR_PhoneService", "subscribeNotificationSampleConfigConnected mUnSubscribePreferenceInfoType is null");
            r();
        }
    }

    private void c(final Context context) {
        this.z.execute(new Runnable() { // from class: com.huawei.hwservicesmgr.PhoneService.10
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("DEVMGR_PhoneService", "startDaemonService");
                Intent intent = new Intent();
                intent.setAction("com.huawei.daemonservice");
                intent.setPackage(context.getPackageName());
                intent.putExtra("phoneServiceStarted", "phoneServiceStarted");
                try {
                    context.startService(intent);
                } catch (IllegalStateException | SecurityException unused) {
                    LogUtil.j("DEVMGR_PhoneService", "start daemon service fail");
                }
            }
        });
    }

    private void f() {
        if (CommonUtil.bc()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwservicesmgr.PhoneService.6
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("DEVMGR_PhoneService", "PowerKitManager reconnectDevice request");
                    PowerKitManager.a().d("DEVMGR_PhoneService", 65535, 10000L, "user-reconnectDevice");
                    LogUtil.a("DEVMGR_PhoneService", "PowerKitManager reconnectDevice request end");
                }
            });
        }
    }

    private void q() {
        if (!CommonUtil.bg()) {
            m();
        }
        a(this.ar);
        OpAnalyticsUtil.getInstance().init(BaseApplication.getContext());
    }

    private void m() {
        nej nejVar = new nej();
        this.ae = nejVar;
        nejVar.c(this);
    }

    private void a(KitWearBinder kitWearBinder) {
        if (kitWearBinder == null) {
            LogUtil.j("DEVMGR_PhoneService", "setDaemonBinder wearBinder is null.");
        }
        HiHealthNativeApi.a(BaseApplication.getContext()).setBinder("KitWearBinderFromPhoneService", kitWearBinder, new HiCommonListener() { // from class: com.huawei.hwservicesmgr.PhoneService.8
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.j("DEVMGR_PhoneService", "setDaemonBinder onSuccess :", Integer.valueOf(i));
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("DEVMGR_PhoneService", "setDaemonBinder onFailure :", Integer.valueOf(i));
            }
        });
    }

    private void e(Intent intent) {
        String stringExtra = intent.getStringExtra("WearEngineDataKey");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if ("WearEngineStartPhoneService".equals(stringExtra)) {
            LogUtil.a("DEVMGR_PhoneService", "setWearEngineBinder ", "WearEngineStartPhoneService");
            HwWearEngineNative hwWearEngineNative = new HwWearEngineNative(BaseApplication.getContext());
            HiWearCoreBinder hiWearCoreBinder = new HiWearCoreBinder();
            hwWearEngineNative.b("WearEngine", hiWearCoreBinder);
            hiWearCoreBinder.setHwWearEngineNative(hwWearEngineNative);
        }
        if ("WearEnginePhdkitStartPhoneService".equals(stringExtra)) {
            LogUtil.a("DEVMGR_PhoneService", "setWearEngineBinder ", "WearEnginePhdkitStartPhoneService");
            new HwWearEngineNative(BaseApplication.getContext()).b("WearEnginePhdkit", this.v);
        }
    }

    private void t() {
        this.ak = new NetworkConnectReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        registerReceiver(this.ak, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.huawei.plugin.account.logout");
        intentFilter2.addAction("com.huawei.plugin.account.login");
        BroadcastManagerUtil.d(this, this.al, intentFilter2, LocalBroadcast.f36595c, null);
        this.ai = new LanguageChangedReceiver();
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.ai, intentFilter3);
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.k, intentFilter4);
        IntentFilter intentFilter5 = new IntentFilter();
        intentFilter5.addAction("com.huawei.health.action.MOCK_REPORT_COMMAND");
        BroadcastManagerUtil.d(this, this.am, intentFilter5, LocalBroadcast.f36595c, null);
        IntentFilter intentFilter6 = new IntentFilter();
        intentFilter6.addAction("emergency_info_change");
        BroadcastManagerUtil.d(this, this.x, intentFilter6, LocalBroadcast.f36595c, null);
        IntentFilter intentFilter7 = new IntentFilter();
        intentFilter7.addAction("com.huawei.health.user.exit");
        d dVar = new d();
        this.ac = dVar;
        BroadcastManagerUtil.d(this, dVar, intentFilter7);
        IntentFilter intentFilter8 = new IntentFilter();
        intentFilter8.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter8.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter8.addDataScheme("package");
        registerReceiver(this.i, intentFilter8);
        if (Build.VERSION.SDK_INT >= 35) {
            IntentFilter intentFilter9 = new IntentFilter();
            intentFilter9.addAction("android.intent.action.TIME_TICK");
            registerReceiver(this.as, intentFilter9);
        }
        if (LogConfig.b()) {
            IntentFilter intentFilter10 = new IntentFilter();
            intentFilter10.addAction("com.huawei.health.action.ACTION_OVERSEA_BETA_LOG");
            intentFilter10.addAction("com.huawei.health.action.ACTION_BETA_DEBUG_LOG");
            BroadcastManagerUtil.d(this, this.an, intentFilter10, LocalBroadcast.f36595c, null);
        }
        x();
        p();
    }

    private void p() {
        if (f17677a) {
            ReleaseLogUtil.e("DEVMGR_PhoneService", "system wrong, service not invoke onDestroy, but system repeat invoke onCreate");
            return;
        }
        this.ab = new IntegratedServicesReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        intentFilter.addAction("com.huawei.intelligent.action.NOTIFY_MSG");
        intentFilter.addAction("com.huawei.bone.ACTION_NOTIFICATION_DELETE");
        intentFilter.addAction("com.huawei.health.ACTION_WEATHER_PUSH");
        intentFilter.addAction("com.huawei.health.ACTION_WEATHER_DATA_PUSH");
        intentFilter.addAction("com.huawei.health.ACTION_LOCAL_PRESSURE_PUSH");
        intentFilter.addAction("com.huawei.health.ACTION_NOTIFICATION_ENABLE_PUSH");
        intentFilter.addAction("com.huawei.health.ACTION_NOTIFY_PUSH_MULTI_LINK");
        intentFilter.addAction("com.huawei.health.ACTION_NOTIFICATION_CLOCK_STATE");
        BroadcastManagerUtil.e(BaseApplication.getContext(), this.ab, intentFilter);
        f17677a = true;
    }

    private void x() {
        if (CommonUtil.bg()) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.unbindNotification");
        BroadcastManagerUtil.c(this, this.y, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void w() {
        try {
            LogUtil.a("DEVMGR_PhoneService", "Enter unregisterReceiver()");
            f17677a = false;
            unregisterReceiver(this.ak);
            unregisterReceiver(this.ai);
            unregisterReceiver(this.y);
            unregisterReceiver(this.k);
            unregisterReceiver(this.al);
            unregisterReceiver(this.x);
            unregisterReceiver(this.i);
            unregisterReceiver(this.am);
            if (this.ab != null) {
                ReleaseLogUtil.d("DEVMGR_PhoneService", "onDestroy unregisterReceiver mHandleIntentReceiver");
                BroadcastManagerUtil.b(getApplicationContext(), this.ab);
                this.ab = null;
            }
            if (this.ac != null) {
                LogUtil.a("DEVMGR_PhoneService", "onDestroy unregisterReceiverPackage()");
                BroadcastManagerUtil.d(getApplicationContext(), this.ac);
                this.ac = null;
            }
            naf.e().c();
            if (this.an == null || !LogConfig.b()) {
                return;
            }
            unregisterReceiver(this.an);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DEVMGR_PhoneService", "unregisterReceiver IllegalArgumentException");
        }
    }

    private void k() {
        ndn.b(this);
        this.ah = mlh.e(this);
        j = ncl.d(this);
        nac.e(this);
        this.ao = nei.c();
        this.n = mro.e();
        this.p = mrj.e();
        this.w = DeviceSettingSubscription.d();
        this.af = ndq.c();
        this.m = mqu.b();
        this.ap = mrz.b();
        mwx.e().b();
        s();
        LogUtil.a("DEVMGR_PhoneService", "initManager finish");
    }

    private void s() {
        if (d) {
            ReleaseLogUtil.e("DEVMGR_PhoneService", "registerSystemIncomingMonitor system wrong, service not invoke onDestroy,but system repeat invoke onCreate");
            return;
        }
        PhoneListManager phoneListManager = new PhoneListManager(this);
        this.aj = phoneListManager;
        phoneListManager.d();
        d = true;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("DEVMGR_PhoneService", "onStartCommand enter");
        try {
            mjz.c();
            mjz.e(intent);
            if (intent != null) {
                b(intent);
                return super.onStartCommand(intent, i, i2);
            }
            LogUtil.j("DEVMGR_PhoneService", "error, intent is null");
            return 1;
        } catch (Exception e2) {
            LogUtil.e("DEVMGR_PhoneService", "onStartCommand Exception error,", ExceptionUtils.c(e2));
            return 1;
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        LogUtil.a("onTaskRemoved", new Object[0]);
        mrr.c().b();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        LogUtil.e("DEVMGR_PhoneService", "onLowMemory");
        super.onLowMemory();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d(intent);
        return super.onUnbind(intent);
    }

    private void d(Intent intent) {
        if (TextUtils.isEmpty(intent.getAction())) {
            mld.d().e(-1, "ui process is killed, can not sync sleep.");
        } else {
            LogUtil.j("DEVMGR_PhoneService", "other situation, no need send kit message.");
        }
    }

    private void b(Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            LogUtil.j("DEVMGR_PhoneService", "error, action is null");
        } else {
            LogUtil.a("DEVMGR_PhoneService", "handleIntent: action :", action);
            e(action, intent);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    private void e(String str, Intent intent) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "com.huawei.bone.action.REGISTER_PHONE_LISTEN":
                b2 = 0;
                break;
            case "com.huawei.iconnect.ACTION_CONNECT_DEVICE":
                b2 = 1;
                break;
            case "android.intent.action.USER_PRESENT":
                b2 = 2;
                break;
            case "com.huawei.iconnect.ACTION_RECONNECT_MSG":
                b2 = 3;
                break;
            case "com.huawei.bone.action.StartPhoneService":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            LogUtil.a("DEVMGR_PhoneService", "REGISTER_PHONE_LISTEN_ACTION enter");
            PhoneListManager phoneListManager = this.aj;
            if (phoneListManager != null) {
                phoneListManager.b();
                return;
            }
            return;
        }
        if (b2 == 1) {
            ReleaseLogUtil.d("DEVMGR_PhoneService", "ICONNECT_CONNECT_DEVICE_ACTION");
            nem.d().e(false);
            String stringExtra = intent.getStringExtra("DEVICE_NAME");
            String stringExtra2 = intent.getStringExtra("DEVICE_ID");
            String stringExtra3 = intent.getStringExtra("DEVICE_MODULE_ID");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
                mku.a();
                SharedPreferenceManager.c(String.valueOf(10), "app_big_data_device_name", stringExtra);
                mms.b().a(stringExtra3, stringExtra, stringExtra2);
                return;
            }
            LogUtil.j("DEVMGR_PhoneService", "deviceName or encryptId or moduleId is empty.");
            return;
        }
        if (b2 == 2) {
            ReleaseLogUtil.d("DEVMGR_PhoneService", "Receive unlock phone msg, so force connect device.");
            cqp.a(100060, "", "", "");
            HwDeviceMgrInterface hwDeviceMgrInterface = this.q;
            if (hwDeviceMgrInterface != null) {
                hwDeviceMgrInterface.connectDevice(null, BluetoothType.BR.getValue() | BluetoothType.AW.getValue());
                return;
            } else {
                LogUtil.j("DEVMGR_PhoneService", "mDeviceManager is null.");
                return;
            }
        }
        if (b2 == 3) {
            ReleaseLogUtil.d("DEVMGR_PhoneService", "EMUI iConnect start reconnect");
            cqp.a(100059, "", "", "");
            HwDeviceMgrInterface hwDeviceMgrInterface2 = this.q;
            if (hwDeviceMgrInterface2 != null) {
                hwDeviceMgrInterface2.connectDevice(null, BluetoothType.BLE.getValue());
                return;
            }
            return;
        }
        if (b2 == 4) {
            a(this.ar);
            e(intent);
            c(intent);
            a(intent);
            return;
        }
        LogUtil.j("DEVMGR_PhoneService", "handle intent default");
    }

    private void a(Intent intent) {
        if (!intent.hasExtra("reconnect")) {
            LogUtil.a("DEVMGR_PhoneService", "not reconnect");
        } else {
            LogUtil.a("DEVMGR_PhoneService", "startReconnect");
        }
    }

    private void c(Intent intent) {
        LogUtil.a("DEVMGR_PhoneService", "onTwsDeviceUpdate isProfileDeviceUpdate enter ");
        if (!intent.getBooleanExtra("isProfileDeviceUpdate", false)) {
            LogUtil.j("DEVMGR_PhoneService", "onTwsDeviceUpdate isProfileDeviceUpdate is false");
            return;
        }
        HwDeviceMgrInterface hwDeviceMgrInterface = this.q;
        if (hwDeviceMgrInterface == null) {
            LogUtil.j("DEVMGR_PhoneService", "onTwsDeviceUpdate mDeviceManager is null ");
            return;
        }
        Iterator<Map.Entry<String, DeviceCapability>> it = hwDeviceMgrInterface.queryDeviceCapability(2, "", "DEVMGR_PhoneService").entrySet().iterator();
        while (it.hasNext()) {
            DeviceCapability value = it.next().getValue();
            if (value != null && value.isSupportTws()) {
                LogUtil.a("DEVMGR_PhoneService", "onTwsDeviceUpdate triggerByBroadcast");
                mzz.c().e();
                return;
            }
            LogUtil.d("DEVMGR_PhoneService", "onReceive deviceCapability not Support Tws");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        w();
        LogUtil.a("DEVMGR_PhoneService", "phone service destroyManager");
        g();
        if (!CommonUtil.bg()) {
            n();
        }
        this.ar = null;
        a((KitWearBinder) null);
        Process.killProcess(Process.myPid());
        this.z.shutdown();
        i();
    }

    private void i() {
        if (f17679c != null) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(new ArrayList(f17679c), new HiUnSubscribeListener() { // from class: com.huawei.hwservicesmgr.PhoneService.7
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    LogUtil.a("DEVMGR_PhoneService", "onDestroy subscribeNotificationSampleConfig first unSubscribe isSuccess=", Boolean.valueOf(z));
                    if (z) {
                        List unused = PhoneService.f17679c = null;
                    }
                }
            });
        }
    }

    private void n() {
        nej nejVar = this.ae;
        if (nejVar == null) {
            LogUtil.j("DEVMGR_PhoneService", "onDestroy mkeepAliveOptimize null");
        } else {
            nejVar.b();
        }
    }

    private void g() {
        PhoneListManager phoneListManager = this.aj;
        if (phoneListManager != null) {
            d = false;
            phoneListManager.c();
        }
        ncl nclVar = j;
        if (nclVar != null) {
            nclVar.a();
        }
        mlh mlhVar = this.ah;
        if (mlhVar != null) {
            mlhVar.b();
        }
        nei neiVar = this.ao;
        if (neiVar != null) {
            neiVar.a();
        }
        mwx mwxVar = this.ag;
        if (mwxVar != null) {
            mwxVar.c();
        }
        if (mlu.d() != null) {
            mlu.d().e();
        }
        if (mxw.e() != null) {
            mxw.e().d();
        }
        mrx.d().c();
        try {
            mrj mrjVar = this.p;
            if (mrjVar != null) {
                mrjVar.a();
            }
            mro mroVar = this.n;
            if (mroVar != null) {
                mroVar.d();
            }
            HwDeviceMgrInterface hwDeviceMgrInterface = this.q;
            if (hwDeviceMgrInterface != null) {
                hwDeviceMgrInterface.destroy();
            }
            mjz mjzVar = this.aq;
            if (mjzVar != null) {
                mjzVar.f();
            }
            DeviceSettingSubscription deviceSettingSubscription = this.w;
            if (deviceSettingSubscription != null) {
                deviceSettingSubscription.c();
            }
            ndq ndqVar = this.af;
            if (ndqVar != null) {
                ndqVar.e();
            }
            mqu mquVar = this.m;
            if (mquVar != null) {
                mquVar.d();
            }
            mrz mrzVar = this.ap;
            if (mrzVar != null) {
                mrzVar.a();
            }
            if (!mwt.d()) {
                mwt.c().b();
            }
            mlb.e().a();
            mvx.e().h();
            mnc.e().c();
            HwExerciseAdviceManager.getInstance().destroy();
            mnl.d().a();
            HwHeartRateManager.getInstance().onDestroy();
            mzj.b().e();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DEVMGR_PhoneService", "destroy manager IllegalArgumentException");
        }
        mrr.c().b();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            LogUtil.j("DEVMGR_PhoneService", "on bind intent is null.");
            return null;
        }
        return this.s;
    }

    class b extends IWearPhoneServiceAIDL.Stub {
        private b() {
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void sendDeviceData(DeviceCommand deviceCommand) throws RemoteException {
            if (PhoneService.this.q != null) {
                PhoneService.this.q.sendDeviceData(deviceCommand);
            } else {
                LogUtil.j("DEVMGR_PhoneService", "sendDeviceData, HwDeviceManager is null");
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerDeviceStateCallBack(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) throws RemoteException {
            if (PhoneService.this.q == null) {
                LogUtil.j("DEVMGR_PhoneService", "registerDeviceStateCallback, HwDeviceManager is null");
                return;
            }
            a(iDeviceStateAIDLCallback);
            IDeviceStateAIDLCallback unused = PhoneService.e = iDeviceStateAIDLCallback;
            PhoneService.this.q.registerDeviceStateCallback(PhoneService.this.u);
        }

        private void a(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) {
            String strB = CommonUtil.b(Binder.getCallingPid());
            ReleaseLogUtil.d("DEVMGR_PhoneService", "callProcess is ", strB);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            if (BaseApplication.getAppPackage().equals(strB)) {
                PhoneService.h.put(BaseApplication.getAppPackage(), iDeviceStateAIDLCallback);
                return;
            }
            if (strB.endsWith(":PhoneService")) {
                PhoneService.h.put(":PhoneService", iDeviceStateAIDLCallback);
            } else if (!strB.endsWith(":DaemonService")) {
                PhoneService.h.put("other", iDeviceStateAIDLCallback);
            } else {
                PhoneService.h.put(":DaemonService", iDeviceStateAIDLCallback);
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void unRegisterDeviceStateCallBack(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) throws RemoteException {
            if (PhoneService.this.q != null) {
                PhoneService.this.q.unRegisterDeviceStateCallback(PhoneService.this.u);
            } else {
                LogUtil.j("DEVMGR_PhoneService", "unRegisterDeviceStateCallback, HwDeviceManager is null");
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void addDevice(DeviceParameter deviceParameter, String str, final IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) throws RemoteException {
            if (PhoneService.this.q == null) {
                LogUtil.j("DEVMGR_PhoneService", "addDevice, HwDeviceManager is null");
                return;
            }
            if (deviceParameter == null) {
                LogUtil.j("DEVMGR_PhoneService", "addDevice, deviceParameter is null");
                return;
            }
            nem.d().e(false);
            mku.a();
            ReleaseLogUtil.d("DEVMGR_PhoneService", "addDevice bluetoothType is ", Integer.valueOf(deviceParameter.getBluetoothType()));
            PhoneService.this.t = iAddDeviceStateAIDLCallback;
            PhoneService.this.q.addDevice(deviceParameter, new IAddDeviceStateCallback() { // from class: com.huawei.hwservicesmgr.PhoneService.b.4
                @Override // com.huawei.hwbtsdk.btdatatype.callback.IAddDeviceStateCallback
                public void onAddDeviceState(int i) {
                    try {
                        IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback2 = iAddDeviceStateAIDLCallback;
                        if (iAddDeviceStateAIDLCallback2 != null) {
                            iAddDeviceStateAIDLCallback2.onAddDeviceState(i);
                        }
                    } catch (RemoteException e) {
                        LogUtil.e("DEVMGR_PhoneService", e.getMessage());
                    }
                }
            }, str);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void switchDevice(List<DeviceInfo> list, String str) throws RemoteException {
            if (PhoneService.this.q != null) {
                PhoneService.this.q.switchDevice(list, str);
            } else {
                LogUtil.j("DEVMGR_PhoneService", "setUsedDeviceList, HwDeviceManager is null");
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void migrateUsedDeviceList(List<DeviceInfo> list) throws RemoteException {
            if (PhoneService.this.q == null) {
                LogUtil.j("DEVMGR_PhoneService", "migrateUsedDeviceList, HwDeviceManager is null");
            } else {
                mkf.d().a(list);
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void sendOTAFileData(DeviceInfo deviceInfo, String str, String str2, int i, IOTAResultAIDLCallback iOTAResultAIDLCallback) throws RemoteException {
            String str3;
            String str4;
            String deviceIdentify;
            int productType;
            if (PhoneService.this.q == null) {
                LogUtil.j("DEVMGR_PhoneService", "getUsedDeviceList, HwDeviceManager is null");
                return;
            }
            String[] strArrSplit = str.split("@");
            if (strArrSplit != null && strArrSplit.length == 2) {
                str3 = strArrSplit[0];
                str4 = strArrSplit[1];
            } else {
                str3 = "";
                str4 = "";
            }
            String[] strArrSplit2 = str3.split(File.separatorChar == '\\' ? "\\\\" : File.separator);
            LogUtil.a("DEVMGR_PhoneService", "sendOTAFileData filePath :", str3, ",and version :", str4, ",otaParameter:", str2, ",updateMode:", Integer.valueOf(i), "sendOTAFileData tmpFilePath :", strArrSplit2[strArrSplit2.length - 1]);
            if (deviceInfo != null) {
                LogUtil.a("DEVMGR_PhoneService", "sendOtaFileData current upgrade device is not aw70");
                deviceIdentify = deviceInfo.getDeviceIdentify();
                productType = deviceInfo.getProductType();
            } else {
                deviceIdentify = null;
                productType = -1;
            }
            if (TextUtils.isEmpty(deviceIdentify)) {
                LogUtil.j("DEVMGR_PhoneService", "sendOtaFileData not find target device, please check the name of version");
                return;
            }
            DeviceParameter deviceParameter = new DeviceParameter();
            deviceParameter.setMac(deviceIdentify);
            deviceParameter.setFilePath(str3);
            deviceParameter.setVersion(str4);
            deviceParameter.setProductType(productType);
            PhoneService.this.d(deviceParameter, str2, i, iOTAResultAIDLCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void forceConnectDevice() throws RemoteException {
            if (PhoneService.this.q != null) {
                PhoneService.this.q.connectDevice(null, BluetoothType.BR.getValue() | BluetoothType.AW.getValue());
            } else {
                LogUtil.j("DEVMGR_PhoneService", "forceConnectBTDevice, HwDeviceManager is null");
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public Map<String, DeviceCapability> queryDeviceCapability(int i, String str, String str2) throws RemoteException {
            if (PhoneService.this.q != null) {
                return PhoneService.this.q.queryDeviceCapability(i, str, str2);
            }
            LogUtil.j("DEVMGR_PhoneService", "queryDeviceCapability, HwDeviceManager is null");
            return null;
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerBinder(IBinder iBinder, String str, String str2) throws RemoteException {
            LogUtil.d("DEVMGR_PhoneService", "registerBinder called");
            a aVar = PhoneService.this.new a(str, str2);
            iBinder.linkToDeath(aVar, 0);
            PhoneService.this.l.add(aVar);
            if (PhoneService.this.aq != null) {
                mjz unused = PhoneService.this.aq;
                mjz.e((Intent) null);
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void getFile(TransferFileInfo transferFileInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) throws RemoteException {
            LogUtil.d("DEVMGR_PhoneService", "getFile called");
            mnn.a().e(transferFileInfo, iTransferSleepAndDFXFileCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void openSystemBluetoothSwitch(boolean z) {
            try {
                if (z) {
                    PhoneService.this.o.c(PhoneService.this.g);
                    return;
                }
                if (PhoneService.this.t != null) {
                    try {
                        PhoneService.this.t.onAddDeviceState(1);
                        return;
                    } catch (RemoteException e) {
                        ReleaseLogUtil.a("DEVMGR_PhoneService", "onAddDeviceState: ", ExceptionUtils.c(e));
                        return;
                    }
                }
                ReleaseLogUtil.e("DEVMGR_PhoneService", "openSystemBluetoothSwitch mDeviceListStateCallback is null");
            } catch (RuntimeException e2) {
                ReleaseLogUtil.a("DEVMGR_PhoneService", "openSystemBluetoothSwitch exception ", ExceptionUtils.c(e2));
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("PhoneService_openSystemBluetoothSwitch", DfxUtils.d(Thread.currentThread(), e2));
                throw e2;
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void isLoudspeakerMuteOpenOrCloseHeartRate(int i, int i2, IHeartRateStateAIDLCallback iHeartRateStateAIDLCallback) throws RemoteException {
            if (PhoneService.this.aq != null) {
                PhoneService.this.aq.b(i, i2, iHeartRateStateAIDLCallback);
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void startSyncWorkOut() throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "start synchronization");
            HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerWorkOutCallback(IBaseCallback iBaseCallback) throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "register Workout Callback do nothing");
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void unPair(List<String> list, boolean z) {
            mxn.c().c(list, z);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public boolean isPrompt() {
            if (PhoneService.j != null) {
                return PhoneService.j.c();
            }
            return true;
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public boolean isOutgoingCall() {
            if (PhoneService.j != null) {
                return PhoneService.j.e();
            }
            return false;
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void transFileUnite(String str, String str2, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
            if (str2 == null) {
                LogUtil.j("DEVMGR_PhoneService", "startAppTransFile, transferFileInfo is null");
            } else {
                PhoneService.this.e(str, str2, iAppTransferFileResultAIDLCallback, parcelFileDescriptor);
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void stopTransferFile(String str, int i, IBaseCallback iBaseCallback) throws RemoteException {
            if (PhoneService.this.n != null) {
                PhoneService.this.n.b(str, i, iBaseCallback);
            } else {
                LogUtil.j("DEVMGR_PhoneService", "stopTransferFile, mCommonFileManager is null");
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void startRequestFile(String str, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) throws RemoteException {
            if (PhoneService.this.p == null) {
                LogUtil.j("DEVMGR_PhoneService", "startRequestFile, mCommonFileRequestManager is null");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("DEVMGR_PhoneService", "startRequestFile transFileInfo is null");
                return;
            }
            mhp mhpVar = (mhp) new Gson().fromJson(str, mhp.class);
            if (mhpVar == null || iTransferSleepAndDFXFileCallback == null) {
                return;
            }
            LogUtil.a("DEVMGR_PhoneService", "startRequestFile() transferFileInfo, fileName: ", mhpVar.f(), " fileType: ", Integer.valueOf(mhpVar.n()));
            PhoneService.this.p.a(mhpVar, iTransferSleepAndDFXFileCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void stopRequestFile(String str, IBaseCallback iBaseCallback) throws RemoteException {
            if (PhoneService.this.p == null) {
                LogUtil.j("DEVMGR_PhoneService", "stopRequestFile, mCommonFileRequestManager is null");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("DEVMGR_PhoneService", "stopRequestFile transFileInfo is null");
                return;
            }
            mhp mhpVar = (mhp) new Gson().fromJson(str, mhp.class);
            if (mhpVar == null || iBaseCallback == null) {
                return;
            }
            LogUtil.a("DEVMGR_PhoneService", "stopRequestFile() transferFileInfo, fileName: ", mhpVar.f(), " fileType: ", Integer.valueOf(mhpVar.n()));
            PhoneService.this.p.d(mhpVar, iBaseCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registMusicMgrCallback(HwMusicMgrCallback hwMusicMgrCallback) throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", " phone register MusicMgrCallback");
            if (PhoneService.this.ar != null) {
                if (hwMusicMgrCallback == null) {
                    LogUtil.j("DEVMGR_PhoneService", "callback is null");
                }
                PhoneService.this.ar.registerMusicMgrCallback(hwMusicMgrCallback);
                return;
            }
            LogUtil.j("DEVMGR_PhoneService", "register MusicMgrCallback, mWearBinder is null");
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void unRegisterMusicMgrCallback() throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "phone unRegister MusicMgrCallback");
            if (PhoneService.this.ar != null) {
                PhoneService.this.ar.unRegisterMusicMgrCallback();
            } else {
                LogUtil.j("DEVMGR_PhoneService", "unregister MusicMgrCallback, mWearBinder is null");
            }
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public SmartWatchInfo getPendingConnectWatchInfo() throws RemoteException {
            return lnm.c();
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void setAwFileCallback(IBaseCallback iBaseCallback) throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "setAwFileCallback called");
            mkf.d().b(iBaseCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public String dialogMessage(DeviceDialogMessage deviceDialogMessage, IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback) {
            return mmo.a(deviceDialogMessage, iBluetoothDialogAidlCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void setBinder(String str, IBinder iBinder, IBaseCallback iBaseCallback) throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "setBinder called tag:", str);
            mjz.c().c(iBinder, iBaseCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void setSuggestionBinder(IBinder iBinder) {
            LogUtil.a("DEVMGR_PhoneService", "setSuggestionBinder()");
            HwExerciseAdviceManager.getInstance().setSuggestionAidl(iBinder);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void sendMenstrualSwitch(MenstrualSwitchStatus menstrualSwitchStatus) {
            if (menstrualSwitchStatus == null) {
                LogUtil.j("DEVMGR_PhoneService", "sendMenstrualSwitch error");
            }
            mwt.c().a(menstrualSwitchStatus);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void notifyAllSyncTask() throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "notifyAllSyncTask enter.");
            mzj.b().a("DEVMGR_PhoneService");
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void sendEcgBlockList(String str, IBaseCallback iBaseCallback) {
            mxf.e(BaseApplication.getContext()).a(str, iBaseCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void sendWifiConfigurationInformation() {
            naf.e().a();
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public boolean isCouldGetWifiConfigurationInformation() {
            return naf.e().d();
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public List<DeviceInfo> getDeviceList(int i, HwGetDevicesParameter hwGetDevicesParameter, String str) {
            return PhoneService.this.q.getDeviceList(HwGetDevicesMode.getValue(i), hwGetDevicesParameter, str);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public boolean notifyPhoneService(String str, DeviceInfo deviceInfo, int i, String str2) {
            return mjy.b().b(str, deviceInfo, i, str2, PhoneService.this);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerCallback(String str, INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallback) {
            mjy.b().c(str, iNoitifyPhoneServiceCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void unregisterCallback(String str) {
            mjy.b().c(str);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void starSycnCoreSleep(SyncOption syncOption, final IBaseCallback iBaseCallback) {
            LogUtil.a("DEVMGR_PhoneService", "enter phoneservce to starSycnCoreSleep");
            ltm.c(myl.b()).d(syncOption, new IBaseResponseCallback() { // from class: com.huawei.hwservicesmgr.PhoneService.b.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    try {
                        if (obj == null) {
                            iBaseCallback.onResponse(i, "");
                        } else {
                            iBaseCallback.onResponse(i, obj.toString());
                        }
                    } catch (RemoteException e) {
                        LogUtil.e("DEVMGR_PhoneService", "startSyncCoreSleep() exception = ", e.getMessage());
                    }
                }
            });
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public boolean isCoreSleepSyncing() {
            LogUtil.a("DEVMGR_PhoneService", "enter phoneservce to isCoreSleepSyncing");
            return ltm.c(myl.b()).g();
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerCoreSleepProgressListener(final IBaseCallback iBaseCallback) {
            LogUtil.a("DEVMGR_PhoneService", "enter phoneservce to registerCoreSleepProgressListener");
            ltm.c(myl.b()).c(new IBaseResponseCallback() { // from class: com.huawei.hwservicesmgr.PhoneService.b.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    try {
                        if (obj == null) {
                            iBaseCallback.onResponse(i, "");
                        } else {
                            iBaseCallback.onResponse(i, obj.toString());
                        }
                    } catch (RemoteException e) {
                        LogUtil.e("DEVMGR_PhoneService", "registerProgressListener() exception = ", e.getMessage());
                    }
                }
            });
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerLinkageDeviceCommandListener(LinkageDeviceCommandListener linkageDeviceCommandListener) throws RemoteException {
            nau.c().c(linkageDeviceCommandListener);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public void registerLinkageDeviceDataListener(IBaseCallback iBaseCallback) throws RemoteException {
            nau.c().e(iBaseCallback);
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public Result getMatterTimeInfo(DeviceInfo deviceInfo, int i) throws RemoteException {
            LogUtil.a("DEVMGR_PhoneService", "matter time query mode is " + i);
            if (deviceInfo == null) {
                LogUtil.e("DEVMGR_PhoneService", "getMatterTimeInfo deviceInfo is null ");
                return Result.error(ResultCodeMessage.GET_TIME_ERROR_CODE.value(), "deviceInfo is null");
            }
            if (i == 1) {
                return mqn.d().e(deviceInfo);
            }
            if (i == 2) {
                return mqn.d().d(deviceInfo);
            }
            if (i == 3) {
                return mqn.d().a(deviceInfo);
            }
            return Result.error(ResultCodeMessage.NO_SUCH_METHOD_ERROR_CODE.value(), "no such method");
        }

        @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
        public Result getCommonData(DeviceInfo deviceInfo, String str, String str2) throws RemoteException {
            try {
                return nsn.d(str).getData(deviceInfo, str2);
            } catch (IllegalArgumentException e) {
                return Result.error(ResultCodeMessage.WRONG_MODULE_ERROR_CODE.value(), e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceParameter deviceParameter, String str, int i, final IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        ndb.b().c(deviceParameter, str, i, new OtaResultCallbackInterface() { // from class: com.huawei.hwservicesmgr.PhoneService.15
            @Override // com.huawei.callback.OtaResultCallbackInterface
            public void onFileTransferState(String str2, int i2) {
                try {
                    IOTAResultAIDLCallback iOTAResultAIDLCallback2 = iOTAResultAIDLCallback;
                    if (iOTAResultAIDLCallback2 != null) {
                        iOTAResultAIDLCallback2.onFileTransferState(i2);
                    }
                } catch (Exception unused) {
                    LogUtil.e("DEVMGR_PhoneService", "sendOtaInfo onFileTransferState RemoteException");
                }
            }

            @Override // com.huawei.callback.OtaResultCallbackInterface
            public void onUpgradeFailed(String str2, int i2, String str3) {
                try {
                    IOTAResultAIDLCallback iOTAResultAIDLCallback2 = iOTAResultAIDLCallback;
                    if (iOTAResultAIDLCallback2 != null) {
                        iOTAResultAIDLCallback2.onUpgradeFailed(i2, str3);
                    }
                } catch (Exception unused) {
                    LogUtil.e("DEVMGR_PhoneService", "sendOtaInfo onUpgradeFailed RemoteException");
                }
            }

            @Override // com.huawei.callback.OtaResultCallbackInterface
            public void onFileRespond(String str2, int i2) {
                try {
                    IOTAResultAIDLCallback iOTAResultAIDLCallback2 = iOTAResultAIDLCallback;
                    if (iOTAResultAIDLCallback2 != null) {
                        iOTAResultAIDLCallback2.onFileRespond(i2);
                    }
                } catch (Exception unused) {
                    LogUtil.e("DEVMGR_PhoneService", "sendOtaInfo onFileRespond RemoteException");
                }
            }

            @Override // com.huawei.callback.OtaResultCallbackInterface
            public void onFileTransferReport(String str2) {
                try {
                    IOTAResultAIDLCallback iOTAResultAIDLCallback2 = iOTAResultAIDLCallback;
                    if (iOTAResultAIDLCallback2 != null) {
                        iOTAResultAIDLCallback2.onFileTransferReport(str2);
                    }
                } catch (RemoteException unused) {
                    LogUtil.e("DEVMGR_PhoneService", "sendOtaInfo onFileTransferReport RemoteException");
                }
            }
        });
    }

    final class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17692a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f17693c;

        a(String str, String str2) {
            this.f17693c = str;
            this.f17692a = str2;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            if (PhoneService.this.l != null) {
                if (PhoneService.this.z != null) {
                    if (PhoneService.this.l.indexOf(this) < 0) {
                        return;
                    }
                    LogUtil.a("DEVMGR_PhoneService", "client died:", this.f17693c);
                    PhoneService.this.l.remove(this);
                    PhoneService.this.z.execute(new Runnable() { // from class: com.huawei.hwservicesmgr.PhoneService.a.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Intent intent = new Intent();
                            intent.setAction(a.this.f17692a);
                            intent.setPackage(a.this.f17693c);
                            try {
                                PhoneService.this.startService(intent);
                            } catch (IllegalStateException e) {
                                ReleaseLogUtil.e("DEVMGR_PhoneService", "binderDied startService exception", ExceptionUtils.c(e));
                            }
                            LogUtil.a("DEVMGR_PhoneService", "restart service:", a.this.f17693c, " action is ", a.this.f17692a);
                            if (a.this.b() || PhoneService.this.ad == null) {
                                PhoneService.this.r = 1000L;
                                if (PhoneService.this.aq != null) {
                                    mjz unused = PhoneService.this.aq;
                                    mjz.e((Intent) null);
                                    return;
                                }
                                return;
                            }
                            PhoneService.this.ad.postDelayed(this, PhoneService.this.l());
                        }
                    });
                    return;
                }
                LogUtil.j("DEVMGR_PhoneService", "client died binderDied mExecutor is null");
                return;
            }
            LogUtil.j("DEVMGR_PhoneService", "client died binderDied mClients is null");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            for (int i = 0; i < PhoneService.this.l.size(); i++) {
                if (((a) PhoneService.this.l.get(i)).f17693c.equals(this.f17693c) && ((a) PhoneService.this.l.get(i)).f17692a.equals(this.f17692a)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long l() {
        long j2 = this.r * 2000;
        this.r = j2;
        if (j2 <= 600000) {
            return j2;
        }
        return 600000L;
    }

    private void c(final int i) {
        LogUtil.a("DEVMGR_PhoneService", "stopPhoneServiceProcess,", Integer.valueOf(i));
        stopSelf();
        this.ad.postDelayed(new Runnable() { // from class: nsm
            @Override // java.lang.Runnable
            public final void run() {
                this.f43594a.b(i);
            }
        }, 2000L);
    }

    public /* synthetic */ void b(int i) {
        if (i == 2 && this.q != null) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "stopPhoneServiceProcess");
            if (deviceList == null || !deviceList.isEmpty()) {
                return;
            }
            j();
            return;
        }
        LogUtil.j("DEVMGR_PhoneService", "unknown status");
    }

    private void j() {
        if (!nem.d().c()) {
            LogUtil.j("DEVMGR_PhoneService", "stopPhoneServiceProcess no kill process.");
            return;
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            LogUtil.e("DEVMGR_PhoneService", "dealPhoneServiceKill InterruptedException.");
        }
        if (!nem.d().c()) {
            LogUtil.j("DEVMGR_PhoneService", "stopPhoneServiceProcess again no kill process.");
            return;
        }
        if (xgt.b().a()) {
            LogUtil.j("DEVMGR_PhoneService", "cancelKillSelf because isKillSelfFlag is true");
            nem.d().d(ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "cancelKillSelf"));
            xgt.b().e(false);
            return;
        }
        LogUtil.a("DEVMGR_PhoneService", "kill PhoneService start");
        xgv.b().a();
        LogUtil.a("DEVMGR_PhoneService", "kill UniteDeviceService");
        ((JobScheduler) BaseApplication.getContext().getSystemService("jobscheduler")).cancel(10009);
        mjn.f41758b = false;
        LogUtil.a("DEVMGR_PhoneService", "kill PhoneJobService");
        Process.killProcess(Process.myPid());
        LogUtil.a("DEVMGR_PhoneService", "kill PhoneService end");
    }

    public void e(String str, String str2, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, ParcelFileDescriptor parcelFileDescriptor) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("DEVMGR_PhoneService", "transFileUniteDistribution transFileInfo is null");
            return;
        }
        TransferBusinessType busiTypeByValue = TransferBusinessType.getBusiTypeByValue(str);
        if (busiTypeByValue == null) {
            LogUtil.j("DEVMGR_PhoneService", "transferBusiType is null");
            return;
        }
        LogUtil.j("DEVMGR_PhoneService", "transFileUniteDistribution entry. busiType is :", str, ParamConstants.Param.CALLBACK, iAppTransferFileResultAIDLCallback);
        mhp mhpVar = (mhp) new Gson().fromJson(str2, mhp.class);
        mhpVar.c(parcelFileDescriptor);
        if (mhpVar != null) {
            LogUtil.a("DEVMGR_PhoneService", "startAppTransFile() transferFileInfo, fileName: ", mhpVar.f(), " fileType: ", Integer.valueOf(mhpVar.n()));
        }
        int i = AnonymousClass11.f17682a[busiTypeByValue.ordinal()];
        if (i == 1) {
            mro mroVar = this.n;
            if (mroVar == null) {
                LogUtil.j("DEVMGR_PhoneService", "transFileUniteDistribution, mCommonFileManager is null");
                return;
            } else {
                mroVar.e(mhpVar, iAppTransferFileResultAIDLCallback);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        mrj mrjVar = this.p;
        if (mrjVar == null) {
            LogUtil.j("DEVMGR_PhoneService", "startRequestFile, mCommonFileRequestManager is null");
        } else {
            mrjVar.a(mhpVar, iAppTransferFileResultAIDLCallback);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hwservicesmgr.PhoneService$11, reason: invalid class name */
    static /* synthetic */ class AnonymousClass11 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17682a;

        static {
            int[] iArr = new int[TransferBusinessType.values().length];
            f17682a = iArr;
            try {
                iArr[TransferBusinessType.FIVE_FORTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17682a[TransferBusinessType.FIVE_FORTY_FOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
