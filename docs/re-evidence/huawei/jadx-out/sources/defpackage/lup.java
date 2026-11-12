package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;
import com.google.gson.Gson;
import com.huawei.callback.BindPhoneServiceCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.constant.ResultCodeMessage;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.devicemgr.business.entity.Result;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.HwMusicMgrCallback;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lup f40855c;
    private String f;
    private List<DeviceInfo> g;
    private String j;
    private List<DeviceInfo> k;
    private IAddDeviceStateAIDLCallback n;
    private DeviceParameter o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40854b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40853a = new Object();
    private boolean d = false;
    private boolean e = false;
    private boolean h = false;
    private BindPhoneServiceCallback i = new BindPhoneServiceCallback() { // from class: lup.3
        @Override // com.huawei.callback.BindPhoneServiceCallback
        public void onBind() {
            LogUtil.a("DeviceConfigAidlUtil", "forceInit bindPhoneServiceCallback success", " isAddDevice == ", Boolean.valueOf(lup.this.d), " isMigrateUsedDeviceList == ", Boolean.valueOf(lup.this.e));
            if (lup.this.e) {
                try {
                    lup.this.e = false;
                    lup lupVar = lup.this;
                    lupVar.a(lupVar.g);
                } catch (RemoteException unused) {
                    LogUtil.e("DeviceConfigAidlUtil", "migrateUsedDeviceList() onbind exception");
                }
            }
            if (lup.this.d) {
                lup.this.d = false;
                try {
                    lup lupVar2 = lup.this;
                    lupVar2.a(lupVar2.o, lup.this.f, lup.this.n);
                } catch (RemoteException unused2) {
                    LogUtil.e("DeviceConfigAidlUtil", "addDevice() onbind exception");
                }
            }
            if (lup.this.h) {
                lup.this.h = false;
                try {
                    lup lupVar3 = lup.this;
                    lupVar3.b(lupVar3.k, lup.this.j);
                } catch (RemoteException unused3) {
                    LogUtil.e("DeviceConfigAidlUtil", "setUsedDeviceList() onbind exception");
                }
            }
        }
    };

    private lup() {
    }

    public static lup b() {
        lup lupVar;
        synchronized (f40854b) {
            if (f40855c == null) {
                f40855c = new lup();
            }
            lupVar = f40855c;
        }
        return lupVar;
    }

    public void a(DeviceParameter deviceParameter, String str, IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) throws RemoteException {
        synchronized (f40854b) {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                iWearPhoneServiceAIDLC.addDevice(deviceParameter, str, iAddDeviceStateAIDLCallback);
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "addDevice() iPhoneServiceAIDL is null");
                this.d = true;
                this.o = deviceParameter;
                this.f = str;
                this.n = iAddDeviceStateAIDLCallback;
                lug.b(BaseApplication.getContext(), this.i);
            }
        }
    }

    public void b(List<DeviceInfo> list, String str) throws RemoteException {
        synchronized (f40854b) {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                iWearPhoneServiceAIDLC.switchDevice(list, str);
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "setUsedDeviceList() iPhoneServiceAIDL is null");
                this.h = true;
                this.k = list;
                this.j = str;
                lug.b(BaseApplication.getContext(), this.i);
            }
        }
    }

    public void a(List<DeviceInfo> list) throws RemoteException {
        synchronized (f40854b) {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                iWearPhoneServiceAIDLC.migrateUsedDeviceList(list);
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "migrateUsedDeviceList() iPhoneServiceAIDL is null");
                this.e = true;
                this.g = list;
                lug.b(BaseApplication.getContext(), this.i);
            }
        }
    }

    public void d(DeviceCommand deviceCommand) {
        try {
            if (deviceCommand == null) {
                LogUtil.j("DeviceConfigAidlUtil", "deviceCommand is null");
                return;
            }
            LogUtil.a("DeviceConfigAidlUtil", "sendDeviceData(): Command = ", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.sendDeviceData(deviceCommand);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "sendDeviceData() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException e) {
            LogUtil.e("DeviceConfigAidlUtil", "sendDeviceData() exception = ", e.getMessage());
        }
    }

    public void c(TransferFileInfo transferFileInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC == null) {
                LogUtil.j("DeviceConfigAidlUtil", "getFile() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            } else {
                iWearPhoneServiceAIDLC.getFile(transferFileInfo, iTransferSleepAndDFXFileCallback);
            }
        } catch (RemoteException e) {
            LogUtil.e("DeviceConfigAidlUtil", "getFile() exception = ", e.getMessage());
        }
    }

    public void a(DeviceInfo deviceInfo, String str, String str2, int i, IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.sendOTAFileData(deviceInfo, str, str2, i, iOTAResultAIDLCallback);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "sendOtaFileData() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException e) {
            LogUtil.e("DeviceConfigAidlUtil", "sendOtaFileData() exception = ", e.getMessage());
        }
    }

    public void d(TransferBusinessType transferBusinessType, mhp mhpVar, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    String json = new Gson().toJson(mhpVar);
                    if (TextUtils.isEmpty(json)) {
                        LogUtil.j("DeviceConfigAidlUtil", "commonTransferFile() transferFileInfo: ", json);
                    }
                    if (transferBusinessType == null) {
                        LogUtil.j("DeviceConfigAidlUtil", "busiType is null");
                        return;
                    } else {
                        iWearPhoneServiceAIDLC.transFileUnite(transferBusinessType.getValue(), json, iAppTransferFileResultAIDLCallback, parcelFileDescriptor);
                        return;
                    }
                }
            }
            LogUtil.j("DeviceConfigAidlUtil", "commonTransferFile(busiType) iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "commonTransferFile() RemoteException");
        }
    }

    public void c(String str, int i, IBaseCallback iBaseCallback) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.stopTransferFile(str, i, iBaseCallback);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "commonStopTransfer() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException e) {
            LogUtil.e("DeviceConfigAidlUtil", "commonStopTransfer() exception = ", e.getMessage());
        }
    }

    public void b(mhp mhpVar, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        LogUtil.a("DeviceConfigAidlUtil", " enter startRequestFile()");
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    String json = new Gson().toJson(mhpVar);
                    if (!TextUtils.isEmpty(json)) {
                        LogUtil.j("DeviceConfigAidlUtil", "startRequestFile() transferFileInfo: ", json);
                        iWearPhoneServiceAIDLC.startRequestFile(json, iTransferSleepAndDFXFileCallback);
                    }
                }
                return;
            }
            LogUtil.j("DeviceConfigAidlUtil", "startRequestFile() iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
        } catch (RemoteException e) {
            LogUtil.e("DeviceConfigAidlUtil", "startRequestFile() exception = ", e.getMessage());
        }
    }

    public void b(HwMusicMgrCallback hwMusicMgrCallback) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.registMusicMgrCallback(hwMusicMgrCallback);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "registMusicMgrCallback() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException e) {
            LogUtil.e("DeviceConfigAidlUtil", "registMusicMgrCallback() exception = ", e.getMessage());
        }
    }

    public Map<String, DeviceCapability> d(int i, String str, String str2) {
        Map<String, DeviceCapability> mapQueryDeviceCapability;
        synchronized (f40854b) {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                try {
                    mapQueryDeviceCapability = iWearPhoneServiceAIDLC.queryDeviceCapability(i, str, str2);
                } catch (RemoteException e) {
                    LogUtil.e("DeviceConfigAidlUtil", "capabilityNegotiation() exception = ", e.getMessage());
                    mapQueryDeviceCapability = null;
                }
            } else {
                mapQueryDeviceCapability = null;
            }
            throw th;
        }
        return mapQueryDeviceCapability;
    }

    public SmartWatchInfo d() throws RemoteException {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            return iWearPhoneServiceAIDLC.getPendingConnectWatchInfo();
        }
        LogUtil.j("DeviceConfigAidlUtil", "forceConnectBTDevice() iPhoneServiceAIDL is null");
        lug.e(BaseApplication.getContext());
        return null;
    }

    public void a(boolean z) throws RemoteException {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            iWearPhoneServiceAIDLC.openSystemBluetoothSwitch(z);
        } else {
            LogUtil.j("DeviceConfigAidlUtil", "openSystemBluetoothSwitch() iPhoneServiceAIDL is null");
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public void e(List<String> list, boolean z) throws RemoteException {
        if (z) {
            for (String str : list) {
                SharedPreferenceManager.b(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + Sha256.d(str, "SHA-256"));
            }
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            iWearPhoneServiceAIDLC.unPair(list, z);
        } else {
            LogUtil.j("DeviceConfigAidlUtil", "unPair() iPhoneServiceAIDL is null");
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public boolean e() throws RemoteException {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            return iWearPhoneServiceAIDLC.isPrompt();
        }
        LogUtil.j("DeviceConfigAidlUtil", "isPrompt() iPhoneServiceAIDL is null");
        lug.e(BaseApplication.getContext());
        return true;
    }

    public boolean c() throws RemoteException {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            return iWearPhoneServiceAIDLC.isOutgoingCall();
        }
        LogUtil.j("DeviceConfigAidlUtil", "isOutgoingCall iPhoneServiceAIDL is null");
        lug.e(BaseApplication.getContext());
        return false;
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                iWearPhoneServiceAIDLC.startSyncWorkOut();
                return;
            } catch (RemoteException e) {
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(-1, "send command error");
                }
                lug.e(BaseApplication.getContext());
                LogUtil.e("DeviceConfigAidlUtil", "startSyncWorkOut exception:", e.getMessage());
                return;
            }
        }
        LogUtil.j("DeviceConfigAidlUtil", "startSyncWorkOut() iPhoneServiceAIDL is null");
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(-1, "send command error");
        }
        lug.e(BaseApplication.getContext());
    }

    public void b(MenstrualSwitchStatus menstrualSwitchStatus) {
        if (menstrualSwitchStatus == null) {
            LogUtil.j("DeviceConfigAidlUtil", "sendMenstrualSwitch switchStatus null");
            return;
        }
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.sendMenstrualSwitch(menstrualSwitchStatus);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "sendMenstrualSwitch() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "sendMenstrualSwitch() RemoteException");
        }
    }

    public void e(String str, IBaseCallback iBaseCallback) {
        if (iBaseCallback == null) {
            LogUtil.j("DeviceConfigAidlUtil", "sendEcgBlockList callback is null.");
            return;
        }
        LogUtil.a("DeviceConfigAidlUtil", "sendEcgBlockList callback");
        synchronized (f40854b) {
            try {
                IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
                if (iWearPhoneServiceAIDLC != null) {
                    iWearPhoneServiceAIDLC.sendEcgBlockList(str, iBaseCallback);
                } else {
                    LogUtil.j("DeviceConfigAidlUtil", "sendEcgBlockList() iPhoneServiceAIDL is null");
                    lug.e(BaseApplication.getContext());
                }
            } catch (RemoteException unused) {
                LogUtil.e("DeviceConfigAidlUtil", "sendMenstrualSwitch() RemoteException");
            }
        }
    }

    public void a() {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.sendWifiConfigurationInformation();
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "sendWifiData() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "sendWifiData() RemoteException");
        }
    }

    public List<DeviceInfo> d(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        List<DeviceInfo> deviceList = null;
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40853a) {
                    deviceList = hwGetDevicesMode != null ? iWearPhoneServiceAIDLC.getDeviceList(hwGetDevicesMode.value(), hwGetDevicesParameter, str) : null;
                }
                return deviceList;
            }
            LogUtil.j("DeviceConfigAidlUtil", "getDeviceList iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
            return null;
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "getDeviceList RemoteException");
            return deviceList;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0013 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0014, code lost:
    
        r5 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(String str, DeviceInfo deviceInfo, int i, String str2) throws Throwable {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    boolean zNotifyPhoneService = iWearPhoneServiceAIDLC.notifyPhoneService(str, deviceInfo, i, str2);
                    try {
                        return zNotifyPhoneService;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
            LogUtil.j("DeviceConfigAidlUtil", "notifyPhoneService iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
            return false;
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "notifyPhoneService RemoteException");
            return false;
        }
    }

    public void b(String str, INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallback) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.registerCallback(str, iNoitifyPhoneServiceCallback);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "registerCallback iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "registerCallback RemoteException");
        }
    }

    public void e(String str) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                synchronized (f40854b) {
                    iWearPhoneServiceAIDLC.unregisterCallback(str);
                }
            } else {
                LogUtil.j("DeviceConfigAidlUtil", "unregisterCallback iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "unregisterCallback RemoteException");
        }
    }

    public dmx<Long> a(DeviceInfo deviceInfo, int i) throws RemoteException {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            Result matterTimeInfo = iWearPhoneServiceAIDLC.getMatterTimeInfo(deviceInfo, i);
            if (matterTimeInfo.getCode().intValue() != 0) {
                return dmx.c(matterTimeInfo.getCode().intValue(), matterTimeInfo.getMessage());
            }
            try {
                return dmx.e(Long.valueOf(Long.parseLong(matterTimeInfo.getData())));
            } catch (NumberFormatException unused) {
                return dmx.c(ResultCodeMessage.PARSE_NUMBER_FORMAT_ERROR_CODE.value(), "parse number format error");
            }
        }
        LogUtil.j("DeviceConfigAidlUtil", "syncCommonSingleSamplePointInner() iPhoneServiceAIDL is null");
        lug.e(BaseApplication.getContext());
        return dmx.c(ResultCodeMessage.BINDER_IS_NULL_ERROR_CODE.value(), "binder is null");
    }

    public dmx<?> c(DeviceInfo deviceInfo, String str, String str2) {
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC == null) {
                LogUtil.j("DeviceConfigAidlUtil", "syncCommonSingleSamplePointInner() iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
                return dmx.c(ResultCodeMessage.BINDER_IS_NULL_ERROR_CODE.value(), "binder is null");
            }
            Result commonData = iWearPhoneServiceAIDLC.getCommonData(deviceInfo, str, str2);
            if (commonData.getCode().intValue() != 0) {
                return dmx.c(commonData.getCode().intValue(), commonData.getMessage());
            }
            return dmx.e(commonData.getData());
        } catch (RemoteException unused) {
            LogUtil.e("DeviceConfigAidlUtil", "getCommonData RemoteException");
            return dmx.c(ResultCodeMessage.REMOTE_ERR.value(), "getCommonData RemoteException");
        }
    }
}
