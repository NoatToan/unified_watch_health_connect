package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;
import com.google.gson.JsonSyntaxException;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DataDeviceIntelligentInfo;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.constant.ResultCodeMessage;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.HwMusicMgrCallback;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class lvb extends HwBaseManager {
    private static lvb d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f40875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40876c;
    private lup f;
    private final MutableLiveData<Boolean> g;
    private ExecutorService h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40874a = new Object();
    private static final Object e = new Object();

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public boolean onDataMigrate() {
        return true;
    }

    public MutableLiveData<Boolean> b() {
        return this.g;
    }

    private lvb(Context context) {
        super(context);
        this.h = Executors.newSingleThreadExecutor();
        this.g = new MutableLiveData<>(false);
        this.f40875b = new BroadcastReceiver() { // from class: lvb.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, final Intent intent) {
                if (intent != null && intent.getAction() != null) {
                    lvb.this.h.execute(new Runnable() { // from class: lvb.2.3
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("HwDeviceConfigManager", "mConnectStateChangedReceiver() intent is ", intent.getAction());
                            String action = intent.getAction();
                            action.hashCode();
                            if (action.equals("com.huawei.plugin.account.login")) {
                                LogUtil.a("HwDeviceConfigManager", "HwTwsManger login goto syncTwsPair.");
                            } else if (action.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                                luk.b().d(intent);
                                lvj.c();
                            } else {
                                LogUtil.j("HwDeviceConfigManager", "unknown broadcast.");
                            }
                        }
                    });
                } else {
                    LogUtil.j("HwDeviceConfigManager", "mConnectStateChangedReceiver() intent is null");
                }
            }
        };
        LogUtil.a("HwDeviceConfigManager", "HWDeviceConfigManager() start");
        g();
        this.f40876c = context;
        try {
            m();
            lug.e(this.f40876c);
            lug.e();
            n();
        } catch (SQLiteException e2) {
            LogUtil.e("HwDeviceConfigManager", "HWDeviceConfigManager() SQLiteException:", ExceptionUtils.c(e2));
        } catch (JsonSyntaxException e3) {
            LogUtil.e("HwDeviceConfigManager", "HWDeviceConfigManager() JsonSyntaxException:", ExceptionUtils.c(e3));
        }
        LogUtil.a("HwDeviceConfigManager", "HWDeviceConfigManager() end");
    }

    public void j() {
        LogUtil.a("HwDeviceConfigManager", "processPhoneServiceBindSucess");
        lvi.d(this.f40876c);
        new luj().a();
        l();
        lvj.c();
        this.g.postValue(true);
    }

    private void m() {
        lvi.i();
        this.f = lup.b();
    }

    private void n() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.setPriority(800);
        BroadcastManagerUtil.c(this.f40876c, this.f40875b, intentFilter, LocalBroadcast.f36595c, null);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.huawei.plugin.account.login");
        LogUtil.a("HwDeviceConfigManager", "broadcast com.huawei.plugin.account.login.");
        BroadcastManagerUtil.d(this.f40876c, this.f40875b, intentFilter2, LocalBroadcast.f36595c, null);
    }

    private void g() {
        if (CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            return;
        }
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB) || BaseApplication.getAppPackage().equals(strB)) {
            return;
        }
        throw new RuntimeException("DeviceConfig must init in main process." + strB);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1;
    }

    public static lvb e() {
        lvb lvbVar;
        luh.a();
        synchronized (f40874a) {
            if (d == null) {
                d = new lvb(BaseApplication.getContext());
            }
            lvbVar = d;
        }
        return lvbVar;
    }

    public void f() {
        lug.b(BaseApplication.getContext(), null);
    }

    public void d(int i, BluetoothDataReceiveCallback bluetoothDataReceiveCallback) {
        LogUtil.a("HwDeviceConfigManager", "registerManagerCallback() serviceId:", Integer.valueOf(i));
        if (e(i) || d(i)) {
            ReleaseLogUtil.d("DEVMGR_HwDeviceConfigManager", "registerManagerCallback serviceId:", Integer.valueOf(i));
        }
        lvk.e(i, bluetoothDataReceiveCallback);
    }

    public void c(int i) {
        LogUtil.a("HwDeviceConfigManager", "unRegisterBaseResponseCallback,serviceId:", Integer.valueOf(i));
        if (e(i) || d(i)) {
            ReleaseLogUtil.d("DEVMGR_HwDeviceConfigManager", "unRegisterManagerResponseCallback serviceId:", Integer.valueOf(i));
        }
        lvk.e(i);
    }

    public void d(DeviceParameter deviceParameter, String str, IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) throws RemoteException {
        this.f.a(deviceParameter, str, iAddDeviceStateAIDLCallback);
    }

    public List<DeviceInfo> a(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        return this.f.d(hwGetDevicesMode, hwGetDevicesParameter, str);
    }

    public void d(List<DeviceInfo> list, String str) throws RemoteException {
        LogUtil.a("HwDeviceConfigManager", "switchDevice() enter");
        this.f.b(list, str);
    }

    @Deprecated
    public void b(List<DeviceInfo> list) throws RemoteException {
        this.f.a(list);
    }

    public void a(TransferFileInfo transferFileInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        this.f.c(transferFileInfo, iTransferSleepAndDFXFileCallback);
    }

    public void c(DeviceCommand deviceCommand) {
        List<DeviceInfo> listA;
        if (TextUtils.isEmpty(deviceCommand.getmIdentify()) && ((listA = a(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwDeviceConfigManager")) == null || listA.isEmpty())) {
            return;
        }
        this.f.d(deviceCommand);
    }

    public void e(DeviceInfo deviceInfo, String str, String str2, int i, IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        this.f.a(deviceInfo, str, str2, i, iOTAResultAIDLCallback);
    }

    public void b(TransferBusinessType transferBusinessType, mhp mhpVar, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        d(transferBusinessType, mhpVar, iAppTransferFileResultAIDLCallback, null);
    }

    public void d(TransferBusinessType transferBusinessType, mhp mhpVar, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, ParcelFileDescriptor parcelFileDescriptor) {
        LogUtil.a("HwDeviceConfigManager", "commonTransferFile");
        if (mhpVar != null) {
            TransferFileReqType transferFileReqTypeK = mhpVar.k();
            if (TransferFileReqType.DEVICE_UNREGISTRATION.equals(transferFileReqTypeK)) {
                lul.e().a(mhpVar.a(), iAppTransferFileResultAIDLCallback);
            } else {
                if (TransferFileReqType.DEVICE_REGISTRATION.equals(transferFileReqTypeK)) {
                    lul.e().d(mhpVar.a(), iAppTransferFileResultAIDLCallback);
                    LogUtil.a("HwDeviceConfigManager", "mDeviceConfigAidlUtil commonTransferFile entry");
                    this.f.d(transferBusinessType, mhpVar, lul.e().b(), parcelFileDescriptor);
                    return;
                }
                this.f.d(transferBusinessType, mhpVar, iAppTransferFileResultAIDLCallback, parcelFileDescriptor);
            }
        }
    }

    @Deprecated
    public void b(String str, int i, IBaseCallback iBaseCallback) {
        this.f.c(str, i, iBaseCallback);
    }

    public void e(mhp mhpVar, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        LogUtil.a("HwDeviceConfigManager", " enter startRequestFile()");
        this.f.b(mhpVar, iTransferSleepAndDFXFileCallback);
    }

    public void b(HwMusicMgrCallback hwMusicMgrCallback) {
        this.f.b(hwMusicMgrCallback);
    }

    public void a(MenstrualSwitchStatus menstrualSwitchStatus) {
        this.f.b(menstrualSwitchStatus);
    }

    public void h() {
        LogUtil.a("HwDeviceConfigManager", "5.35.15 sendBlockList enter.");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "ecg_blocklist");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwDeviceConfigManager", "json is empty.");
        } else {
            LogUtil.d("HwDeviceConfigManager", "sendEcgBlockList json:", strE);
            this.f.e(strE, new IBaseCallback.Stub() { // from class: lvb.4
                @Override // com.huawei.hwservicesmgr.IBaseCallback
                public void onResponse(int i, String str) throws RemoteException {
                    LogUtil.a("HwDeviceConfigManager", "sendEcgBlockList response code :", Integer.valueOf(i));
                }
            });
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.h.shutdown();
        c(2);
        k();
        try {
            this.f40876c.unregisterReceiver(this.f40875b);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HwDeviceConfigManager", "mConnectStateChangedReceiver is not registered");
        }
        luh.b();
        this.f.e("ProcessInfoRequest");
        LogUtil.a("HwDeviceConfigManager", "onDestroy()");
    }

    private void k() {
        synchronized (e) {
            mfe.d().e();
            mfe.d().a();
            mev.d().d((DataDeviceIntelligentInfo) null);
        }
        synchronized (f40874a) {
            d = null;
        }
    }

    public SmartWatchInfo d() throws RemoteException {
        return this.f.d();
    }

    public void a(final String str) {
        if (o()) {
            LogUtil.j("HwDeviceConfigManager", "deleteUnbindMessage isExistConnectedDevice");
            return;
        }
        if (str == null) {
            LogUtil.j("HwDeviceConfigManager", "deviceName is null.");
            return;
        }
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        if (messageCenterApi == null) {
            LogUtil.j("HwDeviceConfigManager", "messageCenterApi is null");
        } else {
            messageCenterApi.getMessages(String.valueOf(19), "device_type_connected", new IBaseResponseCallback() { // from class: lvb.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwDeviceConfigManager", "deleteUnbindMessage errorCode: ", Integer.valueOf(i));
                    if (i != 0 || !(obj instanceof List)) {
                        LogUtil.j("HwDeviceConfigManager", "deleteUnbindMessage getMessages failed");
                        return;
                    }
                    List<MessageObject> list = (List) obj;
                    if (!list.isEmpty()) {
                        if (lvb.this.o()) {
                            LogUtil.j("HwDeviceConfigManager", "deleteUnbindMessage onResponse isExistConnectedDevice");
                            return;
                        }
                        for (MessageObject messageObject : list) {
                            String msgTitle = messageObject.getMsgTitle();
                            if (!TextUtils.isEmpty(msgTitle) && msgTitle.contains(str)) {
                                messageCenterApi.deleteMessage(messageObject.getMsgId());
                                lvb.this.setSharedPreference("kStorage_DeviceCfgMgr_Identify", "", null);
                                LogUtil.a("HwDeviceConfigManager", "deleteUnbindMessage success: ", msgTitle);
                                return;
                            }
                        }
                        return;
                    }
                    LogUtil.j("HwDeviceConfigManager", "deleteUnbindMessage messageList is empty");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        List<DeviceInfo> listA = a(HwGetDevicesMode.ACTIVE_DEVICES, null, "isExistConnectedDevice");
        if (listA == null) {
            LogUtil.j("HwDeviceConfigManager", "getConnectDeviceInfo() deviceInfoList is null");
            return false;
        }
        for (DeviceInfo deviceInfo : listA) {
            if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2 && ("main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType()))) {
                LogUtil.a("HwDeviceConfigManager", "isExistConnectedDevice deviceInfoList size ", Integer.valueOf(listA.size()));
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void a(boolean z) throws RemoteException {
        this.f.a(z);
    }

    public void d(List<String> list, boolean z) throws RemoteException {
        this.f.e(list, z);
    }

    @Deprecated
    public boolean c() throws RemoteException {
        return this.f.e();
    }

    @Deprecated
    public boolean a() throws RemoteException {
        return this.f.c();
    }

    public void a(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().a("startSyncWorkOut", new Runnable() { // from class: lvb.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwDeviceConfigManager", "ready register device info.");
                List<DeviceInfo> listA = lvb.this.a(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwDeviceConfigManager");
                if (listA == null) {
                    LogUtil.j("HwDeviceConfigManager", "startSyncWorkOut deviceInfoList is null");
                    return;
                }
                for (DeviceInfo deviceInfo : listA) {
                    if (deviceInfo != null) {
                        if (!mga.a(deviceInfo)) {
                            return;
                        } else {
                            mga.h(deviceInfo);
                        }
                    }
                }
                lvb.this.f.b(iBaseResponseCallback);
            }
        });
    }

    public Map<String, DeviceCapability> d(int i, String str, String str2) {
        return this.f.d(i, str, str2);
    }

    public void i() {
        this.f.a();
    }

    public void b(String str, NotifyPhoneServiceCallback notifyPhoneServiceCallback) {
        if (TextUtils.isEmpty(str) || notifyPhoneServiceCallback == null) {
            LogUtil.j("HwDeviceConfigManager", "registerCallback input parameter is null.");
        } else {
            lvc.e().c(str, notifyPhoneServiceCallback);
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwDeviceConfigManager", "unregisterCallback module is null.");
        } else {
            lvc.e().c(str);
        }
    }

    public boolean b(String str, DeviceInfo deviceInfo, int i, String str2) {
        if (TextUtils.isEmpty(str) || deviceInfo == null) {
            LogUtil.j("HwDeviceConfigManager", "notifyPhoneService input parameter is null.");
            return false;
        }
        LogUtil.a("HwDeviceConfigManager", "notifyPhoneService module: ", str);
        return this.f.d(str, deviceInfo, i, str2);
    }

    private void l() {
        this.f.b("ProcessInfoRequest", lvc.e().c());
        lug.e();
        HwDeviceReplyPhraseEngineManager.a().c();
        HwDeviceReplyPhraseEngineManager.a();
    }

    public boolean e(int i) {
        if (i != 27 && i != 39) {
            return false;
        }
        ReleaseLogUtil.d("DEVMGR_HwDeviceConfigManager", "isWatchFaceOrPayService");
        return true;
    }

    public boolean d(int i) {
        if (i != 37 && i != 42) {
            return false;
        }
        ReleaseLogUtil.d("DEVMGR_HwDeviceConfigManager", "isMusicOrMarketService");
        return true;
    }

    public dmx<Long> d(DeviceInfo deviceInfo, int i) {
        try {
            return this.f.a(deviceInfo, i);
        } catch (RemoteException e2) {
            LogUtil.e("HwDeviceConfigManager", "remote exception " + e2.getMessage());
            return dmx.c(ResultCodeMessage.REMOTE_ERR.value(), e2.getMessage());
        }
    }

    public dmx<?> e(DeviceInfo deviceInfo, String str, String str2) {
        return this.f.c(deviceInfo, str, str2);
    }
}
