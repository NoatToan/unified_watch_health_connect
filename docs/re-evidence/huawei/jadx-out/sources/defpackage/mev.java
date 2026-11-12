package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.datatype.DataDeviceAvoidDisturbInfo;
import com.huawei.datatype.DataDeviceIntelligentInfo;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mev {
    private static mev e;
    private DataDeviceIntelligentInfo f;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41529c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41530a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f41531b = new IBaseResponseCallback() { // from class: mev.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("DeviceSettingManager", "autoSendCommend response:", obj);
        }
    };
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: mev.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "mPeriodRriSyncReceiver intent is null");
            } else if ("com.huawei.health.action.PERIOD_RRI_SYNC_FINISH".equals(intent.getAction())) {
                ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "mPeriodRriSyncReceiver receive sync finish");
                mev.this.f();
                BroadcastManagerUtil.d(BaseApplication.getContext(), mev.this.j);
            }
        }
    };

    private mev() {
    }

    public String a() {
        return this.f41530a;
    }

    public static mev d() {
        mev mevVar;
        synchronized (d) {
            if (e == null) {
                e = new mev();
            }
            mevVar = e;
        }
        return mevVar;
    }

    public void c(int i, int i2, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        List<DeviceInfo> listE = mgg.e("DeviceSettingManager");
        if (listE == null || listE.isEmpty()) {
            LogUtil.j("DeviceSettingManager", "setDeviceDateDisplayFormat devices is null or empty");
            return;
        }
        for (DeviceInfo deviceInfo : listE) {
            if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
                boolean z2 = deviceCapabilityA != null && deviceCapabilityA.isSupportTimeSetting();
                LogUtil.a("03", 1, "DeviceSettingManager", "setDeviceDateDisplayFormat isCapability:", Boolean.valueOf(z2));
                if (z2) {
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(1);
                    deviceCommand.setCommandID(4);
                    deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    byteBufferAllocate.put((byte) -127);
                    byteBufferAllocate.put((byte) 6);
                    byteBufferAllocate.put((byte) 2);
                    byteBufferAllocate.put((byte) 1);
                    byteBufferAllocate.put(eeq.c(eeq.d(i)));
                    byteBufferAllocate.put((byte) 3);
                    byteBufferAllocate.put((byte) 1);
                    byteBufferAllocate.put(eeq.c(eeq.d(i2)));
                    c(deviceCommand, byteBufferAllocate, 4, iBaseResponseCallback, z);
                }
            }
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingManager", "getIntelligentHomeLinkage() dataDeviceIntelligentInfo :", this.f, ", callback :", iBaseResponseCallback == null ? Constants.NULL : "is no null");
        synchronized (f41529c) {
            DataDeviceIntelligentInfo dataDeviceIntelligentInfo = this.f;
            if (dataDeviceIntelligentInfo == null) {
                DeviceCommand deviceCommand = new DeviceCommand();
                deviceCommand.setServiceID(1);
                deviceCommand.setCommandID(34);
                deviceCommand.setPriority(2);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
                byteBufferAllocate.put((byte) 1);
                byteBufferAllocate.put((byte) 0);
                byteBufferAllocate.put((byte) 2);
                byteBufferAllocate.put((byte) 0);
                byteBufferAllocate.put((byte) 3);
                byteBufferAllocate.put((byte) 0);
                c(deviceCommand, byteBufferAllocate, 34, iBaseResponseCallback, true);
            } else if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, dataDeviceIntelligentInfo);
            }
        }
    }

    public void d(DataDeviceIntelligentInfo dataDeviceIntelligentInfo) {
        synchronized (f41529c) {
            this.f = dataDeviceIntelligentInfo;
        }
    }

    public void e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "DeviceSettingManager");
        if (deviceList != null) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                b(it.next().getDeviceIdentify());
            }
        }
    }

    public void b(String str) {
        ByteBuffer byteBufferAllocate;
        ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "enter getBattery deviceId is ", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(8);
        deviceCommand.setPriority(2);
        deviceCommand.setmIdentify(str);
        if (eey.d(mgg.c("DeviceSettingManager"), 112)) {
            byteBufferAllocate = ByteBuffer.allocate(6);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.put((byte) 3);
            byteBufferAllocate.put((byte) 3);
            byteBufferAllocate.put((byte) 3);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(2);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) 0);
        }
        c(deviceCommand, byteBufferAllocate, 8, null, true);
    }

    private void a(List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) && deviceInfo.getDeviceConnectState() == 2) {
                DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
                if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportAutoUpdate()) {
                    b(deviceInfo.getDeviceIdentify(), deviceInfo.getDeviceUdid());
                } else {
                    LogUtil.j("DeviceSettingManager", "autoSendCommend() not Support AutoUpdateStatus");
                }
            }
        }
    }

    private void b(final String str, String str2) {
        mhs.a().getSwitchSetting("auto_update_status", str2, new IBaseResponseCallback() { // from class: mev.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceSettingManager", "sendAutoUpdateStatus errorCode :", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    mbc.b().a(str, TextUtils.equals("true", String.valueOf(obj)));
                }
            }
        });
    }

    private void a(List<DeviceInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingManager", "setAutoLightScreen");
        for (DeviceInfo deviceInfo : list) {
            if (!lxc.a(deviceInfo.getDeviceIdentify())) {
                e(deviceInfo, iBaseResponseCallback);
            } else {
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "auto_light_screen");
                c(deviceInfo, TextUtils.isEmpty(strE) ? true : Boolean.parseBoolean(strE), iBaseResponseCallback);
            }
        }
    }

    private void e(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().getSwitchSetting("auto_light_screen", new IBaseResponseCallback() { // from class: mev.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "setAutoLightScreen errorCode :", Integer.valueOf(i), "; objectData :", obj);
                boolean zEquals = true;
                if (i == 0 && (obj instanceof String)) {
                    zEquals = true ^ "0".equals((String) obj);
                }
                mev.this.c(deviceInfo, zEquals, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA != null && deviceCapabilityA.isSupportAutoLightScreen()) {
            mhs.a().sendSetSwitchSettingCmd(z, deviceInfo.getDeviceIdentify(), 1, 9, iBaseResponseCallback);
        } else {
            LogUtil.j("DeviceSettingManager", "setAutoLightScreen not Support Auto_light_screen");
        }
    }

    private void b(final List<DeviceInfo> list) {
        if (CommonUtil.bg() && CommonUtil.ch()) {
            LogUtil.j("DeviceSettingManager", "setContactsDataSyncSwitch isUpEmui110");
        } else {
            mhs.a().getSwitchSetting("contacts_data_sync_switch", new IBaseResponseCallback() { // from class: mev.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    boolean z = (i == 0 && (obj instanceof String)) ? !"0".equals(obj) : true;
                    for (DeviceInfo deviceInfo : list) {
                        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                            LogUtil.j("DeviceSettingManager", "setContactsDataSyncSwitch deviceInfo is null");
                        } else if (!eey.d(deviceInfo, 23)) {
                            LogUtil.j("DeviceSettingManager", "setContactsDataSyncSwitch capability not Support");
                        } else {
                            if (!z) {
                                str = "0";
                            } else {
                                str = "1";
                            }
                            mhs.a().sendSetSwitchSettingCmd(1, str, deviceInfo.getDeviceIdentify());
                        }
                    }
                }
            });
        }
    }

    public void c(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        mfi.a(2, iBaseResponseCallback);
        LogUtil.a("04", 1, "DeviceSettingManager", "setWearMessagePushSwitchStatus:", Boolean.valueOf(z));
        mhs.a().sendSetSwitchSettingCmd(!z, "", 2, 8, null);
        a(z);
    }

    private void a(boolean z) {
        synchronized (this) {
            LogUtil.a("DeviceSettingManager", "setWearMessagePushToSharedPreference() :", Boolean.valueOf(z));
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo)) {
                accountInfo = "default_id";
            }
            lvb.e().setSharedPreference(accountInfo + "wear_push_message_key", String.valueOf(!z ? 1 : 0), null);
        }
    }

    private void d(final List<DeviceInfo> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingManager", "setRotateSwitchScreen");
        mhs.a().getSwitchSetting("rotate_switch_screen", new IBaseResponseCallback() { // from class: mev.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                boolean z = (i == 0 && (obj instanceof String)) ? !"0".equals((String) obj) : false;
                for (DeviceInfo deviceInfo : list) {
                    if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
                        if (deviceCapabilityA != null && deviceCapabilityA.isSupportRotateSwitchScreen()) {
                            mhs.a().sendSetSwitchSettingCmd(z, deviceInfo.getDeviceIdentify(), 1, 27, iBaseResponseCallback);
                        } else {
                            LogUtil.e("DeviceSettingManager", "autoSendCommend() not Support Rotate_switch_screen");
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        mhs.a().getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: mev.10
            /* JADX WARN: Code duplicated, block: B:11:0x001a  */
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                boolean z;
                if (i == 0 && (obj instanceof String)) {
                    String str = (String) obj;
                    if (TextUtils.isEmpty(str) || !"true".equals(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "sendWearPressMonitorSwitchStatus errorCode: ", Integer.valueOf(i), " isEnable: ", Boolean.valueOf(z));
                mbr.a().e(z ? 1 : 2);
            }
        });
    }

    public void b(final DeviceInfo deviceInfo) {
        mhs mhsVarA = mhs.a();
        if (BloodPressureSyncManager.b()) {
            BloodPressureSyncManager.d().c(0);
        }
        if (dfd.c(deviceInfo) && ipg.e()) {
            mhsVarA.getSwitchSetting("highland.blood.oxygen.switch", new IBaseResponseCallback() { // from class: meu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    mev.a(deviceInfo, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(DeviceInfo deviceInfo, int i, Object obj) {
        LogUtil.a("DeviceSettingManager", "syncSwitchStatus highLand errorCode: ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "send highLand switch status command: ", str);
            lvh.d().a(deviceInfo, CommonUtil.j(str));
        }
    }

    class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<DataDeviceAvoidDisturbInfo> f41548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IBaseResponseCallback f41549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f41550c;
        private String d;

        e(String str, List<DataDeviceAvoidDisturbInfo> list, IBaseResponseCallback iBaseResponseCallback, boolean z) {
            this.d = str;
            this.f41548a = list;
            this.f41549b = iBaseResponseCallback;
            this.f41550c = z;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!(obj instanceof List)) {
                LogUtil.e("DeviceSettingManager", "AvoidDisturbCallback objectData is null");
                return;
            }
            List list = (List) obj;
            if (list.size() != 0) {
                ArrayList arrayList = new ArrayList(5);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((DataDeviceAvoidDisturbInfo) it.next()).getDeviceAvoidDisturbIndex()));
                }
                mev mevVar = mev.this;
                mevVar.e(this.d, arrayList, mevVar.f41531b);
            }
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(1);
            deviceCommand.setCommandID(12);
            deviceCommand.setmIdentify(this.d);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(22);
            DeviceCapability deviceCapabilityA = eej.a(this.d);
            if (deviceCapabilityA != null && deviceCapabilityA.isSupportQueryAllowDisturbContent()) {
                byteBufferAllocate = ByteBuffer.allocate(26);
            }
            Iterator<DataDeviceAvoidDisturbInfo> it2 = this.f41548a.iterator();
            while (it2.hasNext()) {
                mev.this.c(byteBufferAllocate, it2.next(), deviceCapabilityA);
                mev.this.c(deviceCommand, byteBufferAllocate, 12, this.f41549b, this.f41550c);
                LogUtil.d("DeviceSettingManager", "addDeviceAvoidDisturbingInfo mIsNeedRespond:", Boolean.valueOf(this.f41550c), " size:", Integer.valueOf(list.size()));
                if (!this.f41550c) {
                    if (list.size() == 0) {
                        mev.this.b(this.f41548a, this.f41549b);
                    } else {
                        mev.this.e(this.f41548a, this.f41549b);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ByteBuffer byteBuffer, DataDeviceAvoidDisturbInfo dataDeviceAvoidDisturbInfo, DeviceCapability deviceCapability) {
        LogUtil.a("03", 1, "DeviceSettingManager", "addDeviceAvoidDisturbingInfo:", dataDeviceAvoidDisturbInfo);
        byteBuffer.put((byte) -127);
        if (deviceCapability != null && deviceCapability.isSupportQueryAllowDisturbContent()) {
            byteBuffer.put(Ascii.CAN);
        } else {
            byteBuffer.put(Ascii.DC4);
        }
        byteBuffer.put((byte) 2);
        byteBuffer.put((byte) 1);
        byteBuffer.put(eeq.c(eeq.d(dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbIndex())));
        byteBuffer.put((byte) 3);
        byteBuffer.put((byte) 1);
        if (dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbTimeSwitch() == 1 || dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch() == 1) {
            byteBuffer.put((byte) 1);
        } else {
            byteBuffer.put((byte) 0);
        }
        byteBuffer.put((byte) 4);
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 0);
        e(byteBuffer, dataDeviceAvoidDisturbInfo, deviceCapability);
    }

    private void e(ByteBuffer byteBuffer, DataDeviceAvoidDisturbInfo dataDeviceAvoidDisturbInfo, DeviceCapability deviceCapability) {
        byte[] bArrC;
        byte[] bArrC2;
        byteBuffer.put((byte) 5);
        byteBuffer.put((byte) 2);
        if (dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch() == 1) {
            bArrC = eeq.c(eeq.e(eeq.f(0)));
        } else {
            bArrC = eeq.c(eeq.e(eeq.f(dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbStartTime())));
        }
        byteBuffer.put(bArrC);
        byteBuffer.put((byte) 6);
        byteBuffer.put((byte) 2);
        if (dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch() == 1) {
            bArrC2 = eeq.c(eeq.e(eeq.f(2359)));
        } else {
            bArrC2 = eeq.c(eeq.e(eeq.f(dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbEndTime())));
        }
        byteBuffer.put(bArrC2);
        byteBuffer.put((byte) 7);
        byteBuffer.put((byte) 1);
        byteBuffer.put(eeq.c(eeq.d(dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbCycle())));
        if (deviceCapability == null || !deviceCapability.isSupportQueryAllowDisturbContent()) {
            return;
        }
        byteBuffer.put((byte) 8);
        byteBuffer.put((byte) 2);
        byteBuffer.put(eeq.c(eeq.e(dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbType())));
    }

    public void b(String str, List<DataDeviceAvoidDisturbInfo> list, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.a("DEVMGR_SETTING", "DeviceSettingManager", "addDeviceAvoidDisturbingInfo()");
        e(new e(str, list, iBaseResponseCallback, z));
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("DeviceSettingManager", "handleGetAvoidDisturbMessage callback is null");
        } else {
            mhs.a().getSwitchSetting("custom.avoid_disturb", new IBaseResponseCallback() { // from class: mev.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List arrayList = new ArrayList(16);
                    if (i == 0 && (obj instanceof String)) {
                        String str = (String) obj;
                        ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "handleGetAvoidDisturbMessage value :", str);
                        try {
                            arrayList = (List) new Gson().fromJson(str, new TypeToken<List<DataDeviceAvoidDisturbInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.settings.DeviceSettingManager$8$1
                            }.getType());
                        } catch (JsonSyntaxException unused) {
                            LogUtil.e("DeviceSettingManager", "handleGetAvoidDisturbMessage JsonSyntaxException");
                        } catch (NullPointerException unused2) {
                            LogUtil.e("DeviceSettingManager", "handleGetAvoidDisturbMessage NullPointerException");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        LogUtil.j("DeviceSettingManager", "handleGetAvoidDisturbMessage is null");
                        iBaseResponseCallback.a(100001, new ArrayList(10));
                    } else {
                        iBaseResponseCallback.a(0, arrayList);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<DataDeviceAvoidDisturbInfo> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (list == null || iBaseResponseCallback == null) {
            LogUtil.j("DeviceSettingManager", "handleUpdateAvoidDisturbMessage List and responseCallback is null");
            return;
        }
        LogUtil.a("DeviceSettingManager", "handleUpdateAvoidDisturbMessage dataDeviceAvoidDisturbList: ", Boolean.valueOf(list.isEmpty()));
        if (list.isEmpty()) {
            return;
        }
        mhs.a().setSwitchSetting("custom.avoid_disturb", new Gson().toJson(list), new IBaseResponseCallback() { // from class: mev.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceSettingManager", "handleInsertAvoidDisturbMessage errorCode :", Integer.valueOf(i));
                if (i == -1) {
                    iBaseResponseCallback.a(-1, 101001);
                } else {
                    iBaseResponseCallback.a(0, 100000);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<DataDeviceAvoidDisturbInfo> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null || list == null) {
            LogUtil.j("DeviceSettingManager", "handleInsertAvoidDisturbMessage List and baseResponseCallback is null");
            return;
        }
        LogUtil.a("DeviceSettingManager", "handleInsertAvoidDisturbMessage mHwSwitchSettingManager: ", " dataDeviceAvoidDisturbList: ", Boolean.valueOf(list.isEmpty()));
        if (list.isEmpty()) {
            return;
        }
        mhs.a().setSwitchSetting("custom.avoid_disturb", new Gson().toJson(list), new IBaseResponseCallback() { // from class: mev.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceSettingManager", "handleInsertAvoidDisturbMessage errorCode :", Integer.valueOf(i));
                if (i == -1) {
                    iBaseResponseCallback.a(-1, 101001);
                } else {
                    iBaseResponseCallback.a(0, 100000);
                }
            }
        });
    }

    private void a(String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(29);
        deviceCommand.setmIdentify(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        c(deviceCommand, byteBufferAllocate, 29, null, true);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(35);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        c(deviceCommand, byteBufferAllocate, 35, iBaseResponseCallback, true);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(36);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        c(deviceCommand, byteBufferAllocate, 36, iBaseResponseCallback, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, List<Integer> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("03", 1, "DeviceSettingManager", "deleteDeviceAvoidDisturbingInfo");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(11);
        deviceCommand.setmIdentify(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(list.size() + 4);
        byteBufferAllocate.put((byte) -127);
        byteBufferAllocate.put((byte) (list.size() + 2));
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(eeq.c(eeq.d(it.next().intValue())));
        }
        c(deviceCommand, byteBufferAllocate, 11, iBaseResponseCallback, true);
    }

    public void c(String str, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DEVMGR_SETTING", "DeviceSettingManager", " factoryReset status", Boolean.valueOf(z));
        this.f41530a = str;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(13);
        deviceCommand.setmIdentify(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        if (e(str) && z) {
            byteBufferAllocate.put((byte) 2);
            LogUtil.a("DeviceSettingManager", "Enter Command delivery 0x02");
        } else {
            byteBufferAllocate.put((byte) 1);
            LogUtil.a("DeviceSettingManager", "Enter Command delivery 0x01");
        }
        c(deviceCommand, byteBufferAllocate, 13, iBaseResponseCallback, true);
    }

    private boolean e(String str) {
        DeviceInfo deviceInfoB;
        Map<String, DeviceCapability> mapD;
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null && (deviceInfoB = mgg.b(str, "DeviceSettingManager")) != null && deviceInfoB.getDeviceConnectState() == 2 && (mapD = lvb.e().d(3, "", "DeviceSettingManager")) != null && mapD.get(str) != null) {
            deviceCapabilityA = mapD.get(str);
        }
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportEsim()) {
            return false;
        }
        LogUtil.a("DeviceSettingManager", "device support esim");
        return true;
    }

    public void c(DeviceCommand deviceCommand, ByteBuffer byteBuffer, int i, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        if (iBaseResponseCallback != null && z) {
            luh.a(i, iBaseResponseCallback);
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        lvb.e().c(deviceCommand);
    }

    public void c(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            luh.e(i, iBaseResponseCallback);
        } else {
            LogUtil.a("DeviceSettingManager", "removeCommandCallByCommandId callback is null");
        }
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
            if (deviceCapabilityA == null || !deviceCapabilityA.isSupportLeftRightHandWearMode()) {
                LogUtil.e("DeviceSettingManager", "autoSendCommend() not isSupportLeftRightHandWearMode");
            } else {
                LogUtil.a("DeviceSettingManager", "autoSendCommend() isSupportLeftRightHandWearMode");
                i();
            }
            if (deviceCapabilityA != null && deviceCapabilityA.isSupportWearMessagePush() && deviceCapabilityA.isAvoidDisturb()) {
                c(b(), (IBaseResponseCallback) null);
            }
            b(deviceCapabilityA, deviceInfo);
            c(deviceInfo);
            d(deviceInfo);
        }
        c(mgq.e(), mgq.a(), this.f41531b, true);
        c();
        if (deviceInfo != null) {
            b(deviceInfo.getDeviceIdentify());
        } else {
            e();
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (!mbt.a().b(deviceInfo)) {
            ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "setSleepBreatheSwitch deviceCapability isSupportSleepBreathe false");
        } else {
            mhs.a().getSwitchSetting("sleep_breathe_key", new IBaseResponseCallback() { // from class: mfa
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    mev.a(i, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("DeviceSettingManager", "changeSleepBreatheSwitch errorCode: ", Integer.valueOf(i));
        if (i != 0 || !(obj instanceof String)) {
            ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "setSleepBreatheSwitch getSwitchSetting errorCode:", Integer.valueOf(i));
            return;
        }
        String str = (String) obj;
        if ("1".equals(obj)) {
            str = "true";
        }
        ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "setSleepBreatheSwitch sleepBreatheSwitch:", str);
        mbt.a().a(str);
    }

    private void b(DeviceCapability deviceCapability, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_DeviceSettingManager", "enter startSendPressSwitch");
        if (deviceCapability == null || deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "startSendPressSwitch deviceCapability is null or deviceInfo is null");
            return;
        }
        boolean zD = eey.d(deviceInfo, 206);
        boolean zE = ets.e();
        if (!deviceCapability.isSupportPressAutoMonitor() && !zD) {
            ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "isSupportPressAutoMonitor and isSupportEmotionAutoMonitor is false");
            return;
        }
        if (zD && !zE) {
            b(deviceCapability);
            return;
        }
        if (qec.g().isPeriodRriSyncing()) {
            ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "SwitchTimerTask isPeriodRriSyncing.");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.PERIOD_RRI_SYNC_FINISH");
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.j, intentFilter);
            return;
        }
        f();
    }

    private void b(final DeviceCapability deviceCapability) {
        mgd.b(new IBaseResponseCallback() { // from class: mev.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof String)) {
                    String str = (String) obj;
                    ReleaseLogUtil.e("DEVMGR_DeviceSettingManager", "sendWearEmotionMonitorSwitchStatus switchStatus :", str);
                    mgd.e(str);
                    if ("1".equals(str) && deviceCapability.isSupportPressAutoMonitor()) {
                        mbr.a().e(1);
                    }
                }
            }
        });
    }

    public boolean b() {
        int iG = g();
        LogUtil.a("DeviceSettingManager", "getWearMessagePushSwitchStatus() flag:", Integer.valueOf(iG));
        return iG == 0;
    }

    private int g() {
        synchronized (this) {
            try {
                String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
                if (TextUtils.isEmpty(accountInfo)) {
                    accountInfo = "default_id";
                }
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1), accountInfo + "wear_push_message_key");
                int i = 0;
                if (TextUtils.isEmpty(strE)) {
                    return 0;
                }
                try {
                    i = Integer.parseInt(strE);
                } catch (NumberFormatException unused) {
                    LogUtil.e("DeviceSettingManager", "getWearMessagePushFromSharePreference NumberFormatException");
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i() {
        mhs.a().getSwitchSetting("left_or_right_hand_wear_status", new IBaseResponseCallback() { // from class: mex
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.d(i, obj);
            }
        });
    }

    /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("DeviceSettingManager", "sendLeftRightHandCmd errorCode = ", Integer.valueOf(i), " ; objectData = ", obj);
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            mhs.a().sendSetSwitchSettingCmd("1".equals(str), "", 1, 26, this.f41531b);
            if (mgg.c("DeviceSettingManager") != null) {
                mhs.a().setSwitchSetting("left_or_right_hand_wear_status", str, null);
            } else {
                LogUtil.j("DeviceSettingManager", "autoSendCommend() deviceInfo is null");
            }
        }
    }

    private void c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "DeviceSettingManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.e("DeviceSettingManager", "autoSendCommandPartThree() deviceInfoList is null");
            return;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                c(deviceInfo.getDeviceIdentify());
            }
        }
        d(deviceList, this.f41531b);
        a(deviceList, this.f41531b);
        e(deviceList);
        b(deviceList);
        a(deviceList);
    }

    private void c(String str) {
        LogUtil.a("DeviceSettingManager", "Enter requestDeviceAllowDisturbContent 5!");
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportQueryAllowDisturbContent()) {
            LogUtil.a("DeviceSettingManager", "Leave requestDeviceAllowDisturbContent no support return!");
        } else {
            a(str);
            LogUtil.a("DeviceSettingManager", "Leave requestDeviceAllowDisturbContent !");
        }
    }

    private void e(final List<DeviceInfo> list) {
        e(new IBaseResponseCallback() { // from class: mez
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f41553c.b(list, i, obj);
            }
        });
    }

    /* synthetic */ void b(List list, int i, Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.e("DeviceSettingManager", "sendAvoidDisturbCommand() objData is null");
            return;
        }
        List<DataDeviceAvoidDisturbInfo> list2 = (List) obj;
        if (list2.isEmpty()) {
            list2.add(new DataDeviceAvoidDisturbInfo());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                LogUtil.e("DeviceSettingManager", "sendAvoidDisturbCommand() info is null");
            } else {
                DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
                if (deviceCapabilityA == null || !deviceCapabilityA.isAvoidDisturb()) {
                    LogUtil.e("DeviceSettingManager", "sendAvoidDisturbCommand() not Support Avoid_disturb");
                } else {
                    b(deviceInfo.getDeviceIdentify(), list2, this.f41531b, true);
                }
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 114);
        LogUtil.a("DeviceSettingManager", "setMenstrualPredictSwitch isSupportMenstrualPredict = ", Boolean.valueOf(zD));
        if (zD) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY");
            LogUtil.a("DeviceSettingManager", "setMenstrualPredictSwitch showState = ", strE);
            if ("false".equals(strE)) {
                return;
            }
            mhs.a().getSwitchSetting("menstrual_predict_switch", new IBaseResponseCallback() { // from class: mey
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    mev.e(i, obj);
                }
            });
        }
    }

    static /* synthetic */ void e(int i, Object obj) {
        String str;
        LogUtil.a("DeviceSettingManager", "setMenstrualPredictSwitch errorCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        String str2 = str;
        LogUtil.a("DeviceSettingManager", "setMenstrualPredictSwitch switchStatus = ", str2);
        mhs.a().sendSettingSwitchCommand("hw.unitedevice.physiological", "hw.watch.health.physiological", 900300012L, str2);
    }
}
