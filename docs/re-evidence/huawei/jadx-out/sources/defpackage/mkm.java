package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.strategy.CommandTimerTask;
import com.huawei.haf.common.dfx.memory.MemoryMonitor;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class mkm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41811b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f41812c = new HashMap<Integer, String>(2) { // from class: mkm.4
        private static final long serialVersionUID = 6412797464020131549L;

        {
            put(9, "true");
            put(10, "true");
        }
    };
    private static mkm d = null;
    private static final Object e = new Object();
    private DeviceStateCallback h;
    private xgt i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CommandTimerTask> f41813a = new CopyOnWriteArrayList<>();
    private Context f = BaseApplication.getContext();
    private Timer j = new Timer("HwHandleUniteDeviceMgr");

    private mkm() {
    }

    public static mkm d() {
        mkm mkmVar;
        synchronized (f41811b) {
            if (d == null) {
                d = new mkm();
            }
            mkmVar = d;
        }
        return mkmVar;
    }

    public void b(xgt xgtVar) {
        this.i = xgtVar;
        if (xgtVar != null) {
            xgtVar.a(this.f);
        }
    }

    public void b() {
        j("");
    }

    private void j(String str) {
        if (str == null) {
            return;
        }
        if (str.isEmpty()) {
            LogUtil.a("HwHandleUniteDeviceMgr", "saveAutoRemoveDevice clear auto remove device info.");
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "saveAutoRemoveDevice identify", BTDeviceMgrUtil.c().e(str));
        SharedPreferenceManager.e(this.f, String.valueOf(1018), "deviceAutoRemoveIdentify", str, new StorageParams(1));
    }

    public List<Integer> c(List<DeviceInfo> list, String str) {
        LogUtil.a("HwHandleUniteDeviceMgr", "findWantedSwitchDevice enter");
        ArrayList arrayList = new ArrayList(24);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                DeviceInfo deviceInfo = list.get(i);
                if (deviceInfo != null && deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() != 2) {
                    if (!deviceInfo.getDeviceIdentify().equals(str)) {
                        LogUtil.j("HwHandleUniteDeviceMgr", "manual reconnect:", BTDeviceMgrUtil.c().e(str), ",traversal:", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
                    } else {
                        LogUtil.a("HwHandleUniteDeviceMgr", "findWantedSwitchDevice find ", deviceInfo.getDeviceName());
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean d(DeviceInfo deviceInfo) {
        boolean isLogined;
        if (deviceInfo == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "reconnectDeviceInfo is null");
            return false;
        }
        boolean z = deviceInfo.getSupportAccountSwitch() == 1;
        LogUtil.a("HwHandleUniteDeviceMgr", "reconnectDeviceInfo is ", deviceInfo.getDeviceName(), "isSupportAccountSwitch ", Boolean.valueOf(z));
        if (!z) {
            return true;
        }
        boolean zH = Utils.h();
        LogUtil.a("HwHandleUniteDeviceMgr", "isReconnectionDevice ifAllowLogin ", Boolean.valueOf(zH));
        if (!zH) {
            return true;
        }
        if (CommonUtil.z(this.f)) {
            String logoutFlag = ThirdLoginDataStorageUtil.getLogoutFlag();
            LogUtil.a("HwHandleUniteDeviceMgr", "isReconnectionDevice logoutFlag ", logoutFlag);
            isLogined = "false".equals(logoutFlag);
        } else {
            isLogined = LoginInit.getInstance(this.f).getIsLogined();
        }
        ReleaseLogUtil.c("R_HwHandleUniteDeviceMgr", "isReconnectionDevice isLogin ", Boolean.valueOf(isLogined));
        return isLogined;
    }

    public List<UniteDevice> i() {
        ArrayList arrayList = new ArrayList(24);
        Map<String, UniteDevice> mapC = c();
        if (!mapC.isEmpty()) {
            arrayList.addAll(mapC.values());
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "return getUniteDeviceInfolist() size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public List<DeviceInfo> e() {
        ArrayList arrayList = new ArrayList(24);
        List<UniteDevice> listI = i();
        if (listI.size() != 0) {
            Iterator<UniteDevice> it = listI.iterator();
            while (it.hasNext()) {
                arrayList.add(cox.c(it.next()));
            }
        }
        List<DeviceInfo> listA = mkl.d().a(arrayList);
        if (listA.size() == 0) {
            LogUtil.j("HwHandleUniteDeviceMgr", "getDeviceInfolist deviceRelationList size is zero.");
        }
        return listA;
    }

    public UniteDevice b(String str) {
        if (str == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "getUniteDeviceInfo mac is null.");
            return null;
        }
        Map<String, UniteDevice> mapC = c();
        if (mapC.size() == 0) {
            LogUtil.a("HwHandleUniteDeviceMgr", "return getUniteDeviceInfo is null.");
            return null;
        }
        return mapC.get(str);
    }

    public DeviceInfo e(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, List<DeviceInfo> list) {
        DeviceInfo deviceInfo2 = new DeviceInfo();
        if (deviceInfo == null) {
            LogUtil.a("HwHandleUniteDeviceMgr", "convertTargetDeviceInfo deviceInfo is null.");
            return deviceInfo2;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.a("HwHandleUniteDeviceMgr", "convertTargetDeviceInfo deviceInfo deviceIdentify is null.");
            return deviceInfo2;
        }
        if (coq.d(list)) {
            deviceInfo2.setDeviceBluetoothType(deviceInfo.getDeviceBtType());
            deviceInfo2.setDeviceIdentify(deviceInfo.getDeviceMac());
            deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
            deviceInfo2.setProductType(deviceInfo.getDeviceType());
            return deviceInfo2;
        }
        for (DeviceInfo deviceInfo3 : list) {
            if (deviceInfo.getDeviceMac().equalsIgnoreCase(deviceInfo3.getDeviceIdentify())) {
                deviceInfo2 = deviceInfo3;
                break;
            }
        }
        if (TextUtils.isEmpty(deviceInfo2.getDeviceIdentify())) {
            deviceInfo2.setDeviceIdentify(deviceInfo.getDeviceMac());
        }
        if (TextUtils.isEmpty(deviceInfo2.getDeviceName())) {
            deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        }
        if (deviceInfo2.getProductType() == -1) {
            deviceInfo2.setProductType(deviceInfo.getDeviceType());
        }
        if (deviceInfo2.getDeviceBluetoothType() == -1) {
            deviceInfo2.setDeviceBluetoothType(deviceInfo.getDeviceBtType());
        }
        return deviceInfo2;
    }

    public DeviceCapability a(DeviceInfo deviceInfo, Map<String, UniteDevice> map) {
        UniteDevice uniteDevice;
        if (deviceInfo == null || map == null || deviceInfo.getDeviceIdentify() == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "getDeviceInfoCapability input parameter is null.");
            return null;
        }
        if (map.containsKey(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("HwHandleUniteDeviceMgr", "getDeviceInfoCapability id:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            uniteDevice = map.get(deviceInfo.getDeviceIdentify());
        } else {
            uniteDevice = null;
        }
        if (uniteDevice == null) {
            LogUtil.a("HwHandleUniteDeviceMgr", "return getDeviceInfoCapability is null.");
            return null;
        }
        return cox.e(uniteDevice);
    }

    public void e(DeviceStateCallback deviceStateCallback) {
        LogUtil.a("HwHandleUniteDeviceMgr", "Enter registerDeviceStateCallback().");
        this.h = deviceStateCallback;
    }

    public void g() {
        LogUtil.a("HwHandleUniteDeviceMgr", "enter unRegisterDeviceStateCallback().");
        this.h = null;
    }

    public boolean a(String str) {
        boolean z = b(str) != null;
        LogUtil.a("HwHandleUniteDeviceMgr", "isNewDeviceList: ", Boolean.valueOf(z));
        return z;
    }

    public void e(UniteDevice uniteDevice) {
        String identify;
        DeviceInfo deviceInfoC;
        if (uniteDevice != null) {
            identify = uniteDevice.getIdentify();
            deviceInfoC = cox.c(uniteDevice);
        } else {
            identify = null;
            deviceInfoC = null;
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "disconnectBluetooth enter, goingDisconnectDevice", CommonUtil.n(identify));
        if (TextUtils.isEmpty(identify) || deviceInfoC == null) {
            return;
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "addDevice goingDisconnectDevice is not null.");
        this.i.disconnect(uniteDevice);
        if (deviceInfoC.getDeviceActiveState() == 1) {
            LogUtil.a("HwHandleUniteDeviceMgr", "Start to send disconnect broadcast to EMUI.");
            c(deviceInfoC);
        }
    }

    public void c(DeviceInfo deviceInfo) {
        LogUtil.a("HwHandleUniteDeviceMgr", "EMUI sendDisconnectBroadcastToEmui.");
        if (deviceInfo == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "deviceInfo is null.");
            return;
        }
        if (!deviceInfo.getDeviceIdentify().equalsIgnoreCase("AndroidWear")) {
            if (TextUtils.isEmpty(deviceInfo.getNodeId())) {
                try {
                    Intent intent = new Intent("com.huawei.iconnect.action.DEVICE_BOND_STATE_CHANGED");
                    intent.setComponent(new ComponentName("com.huawei.iconnect", "com.huawei.iconnect.MessageIntentService"));
                    if (mke.b()) {
                        intent.putExtra("DEVICE_ID", mke.e(deviceInfo.getDeviceIdentify()));
                    } else {
                        intent.putExtra("com.huawei.iconnect.extra.DEVICE_MAC_ADDRESS", deviceInfo.getDeviceIdentify());
                    }
                    intent.putExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                    intent.putExtra("com.huawei.iconnect.extra.PACKAGE_NAME", "com.huawei.health");
                    this.f.startService(intent);
                } catch (SecurityException unused) {
                    LogUtil.e("HwHandleUniteDeviceMgr", "0xA0200008", ",securityException");
                }
                LogUtil.d("HwHandleUniteDeviceMgr", "EMUI SendDisconnectBroadcastToEmui, send BOND_NONE broadcast, DeviceIdentify", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
                return;
            }
            return;
        }
        LogUtil.d("HwHandleUniteDeviceMgr", "EMUI SendDisconnectBroadcastToEmui, don't need send broadcast for AndroidWear");
    }

    public boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "isSupportBrConnect deviceInfo is null.");
            return false;
        }
        if (deviceInfo.getDeviceBluetoothType() == 1 && deviceInfo.getDeviceConnectState() != 2 && deviceInfo.getDeviceConnectState() != 1 && deviceInfo.getDeviceActiveState() == 1) {
            if (cok.d().b().contains(deviceInfo.getDeviceIdentify())) {
                LogUtil.d("HwHandleUniteDeviceMgr", "HFP or HID is Connected");
                return true;
            }
            if ("main_relationship".equals(deviceInfo.getRelationship())) {
                LogUtil.a("HwHandleUniteDeviceMgr", "isSupportBrConnect deviceInfo is main device, start to reconnect.");
                return true;
            }
            LogUtil.j("HwHandleUniteDeviceMgr", "isSupportBrConnect is false.");
        }
        return false;
    }

    public void a() {
        synchronized (f41811b) {
            c((mkm) null);
        }
    }

    private static void c(mkm mkmVar) {
        d = mkmVar;
    }

    public void e(DeviceCommand deviceCommand) {
        if (deviceCommand == null) {
            return;
        }
        mko.c(deviceCommand);
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo.setDeviceMac(deviceCommand.getmIdentify());
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(deviceCommand.getmIdentify());
        uniteDevice.setDeviceInfo(deviceInfo);
        c(uniteDevice, deviceCommand);
        a(uniteDevice, deviceCommand);
    }

    public void e(lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        e(mko.a(lnrVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UniteDevice uniteDevice, DeviceCommand deviceCommand) {
        byte[] dataContent = deviceCommand.getDataContent();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dataContent.length + 2);
        byteBufferAllocate.put((byte) deviceCommand.getServiceID());
        byteBufferAllocate.put((byte) deviceCommand.getCommandID());
        byteBufferAllocate.put(dataContent);
        cmg cmgVar = new cmg();
        cmgVar.a(byteBufferAllocate.array());
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        LogUtil.a("HwHandleUniteDeviceMgr", "sendTransparentCommand getServiceID: ", Integer.valueOf(deviceCommand.getServiceID()));
        cmg.b bVar = new cmg.b();
        bVar.b(d(deviceCommand.getServiceID(), deviceCommand.getNeedEncrypt()));
        bVar.a(deviceCommand.getPriority());
        this.i.sendCommand(uniteDevice, bVar.a(cmgVar));
    }

    private boolean d(int i, boolean z) {
        if (!z) {
            return false;
        }
        if ("true".equals(f41812c.get(Integer.valueOf(i)))) {
            z = false;
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "isNeedEncrypt is ", Boolean.valueOf(z));
        return z;
    }

    private void c(final UniteDevice uniteDevice, final DeviceCommand deviceCommand) {
        if (deviceCommand.getNeedAck()) {
            final String str = eeq.d(deviceCommand.getServiceId()) + eeq.d(deviceCommand.getCommandId());
            CommandTimerTask commandTimerTask = new CommandTimerTask(str, 2) { // from class: mkm.5
                @Override // com.huawei.devicesdk.strategy.CommandTimerTask
                public void doTaskAction() {
                    LogUtil.a("HwHandleUniteDeviceMgr", "checkAckCommand ServiceID: ", Integer.valueOf(deviceCommand.getServiceID()), ", CommandId:", Integer.valueOf(deviceCommand.getCommandId()));
                    if (!mkm.this.a(uniteDevice)) {
                        mkm.this.a(uniteDevice, deviceCommand);
                    } else {
                        LogUtil.j("HwHandleUniteDeviceMgr", "isCancelSendData");
                    }
                }

                @Override // com.huawei.devicesdk.strategy.CommandTimerTask
                public void doTimeoutAction() {
                    if (mkm.this.h != null) {
                        byte[] bArrC = eeq.c(str + (eeq.d(127) + eeq.d(4) + eeq.c(100009L)));
                        DeviceInfo deviceInfo = new DeviceInfo();
                        deviceInfo.setDeviceIdentify(uniteDevice.getIdentify());
                        mkm.this.h.onDataReceived(deviceInfo, bArrC.length, bArrC);
                    }
                }
            };
            this.j.schedule(commandTimerTask, 10000L, 10000L);
            this.f41813a.add(commandTimerTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(UniteDevice uniteDevice) {
        List<DeviceInfo> listE = d().e();
        if (listE.size() == 0) {
            return true;
        }
        for (DeviceInfo deviceInfo : listE) {
            if (deviceInfo.getDeviceIdentify().equals(uniteDevice.getIdentify()) && deviceInfo.getDeviceConnectState() == 3) {
                return true;
            }
        }
        return false;
    }

    public void d(String str) {
        CommandTimerTask commandTimerTask;
        Iterator<CommandTimerTask> it = this.f41813a.iterator();
        synchronized (e) {
            while (true) {
                if (!it.hasNext()) {
                    commandTimerTask = null;
                    break;
                }
                CommandTimerTask next = it.next();
                if (!(next instanceof CommandTimerTask)) {
                    return;
                }
                commandTimerTask = next;
                if (commandTimerTask.getActionName() != null && commandTimerTask.getActionName().equals(str)) {
                    break;
                }
            }
            if (commandTimerTask != null) {
                commandTimerTask.cancel();
                this.f41813a.remove(commandTimerTask);
                LogUtil.j("HwHandleUniteDeviceMgr", "remove task ", commandTimerTask.getActionName());
            }
        }
    }

    public void c(String str, boolean z) {
        LogUtil.a("HwHandleUniteDeviceMgr", "removeCurrentInstance isUnPairDevice: ", Boolean.valueOf(z));
        if (str == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "removeCurrentInstance mac is null ");
            return;
        }
        UniteDevice uniteDeviceB = b(str);
        if (uniteDeviceB == null) {
            uniteDeviceB = new UniteDevice();
            uniteDeviceB.setIdentify(str);
            com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
            deviceInfo.setDeviceMac(str);
            uniteDeviceB.setDeviceInfo(deviceInfo);
        }
        if (z) {
            this.i.unPairDevice(uniteDeviceB);
        } else {
            this.i.disconnect(uniteDeviceB);
        }
    }

    public void c(List<DeviceInfo> list) {
        boolean z = (!CommonUtil.bg() || a(list) || ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isNoneHonourAm16BondedDevice()) ? false : true;
        LogUtil.a("HwHandleUniteDeviceMgr", "processMemoryCheck isAllowSelfKill :", Boolean.valueOf(z));
        MemoryMonitor.d(z);
    }

    private boolean a(List<DeviceInfo> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo.getDeviceConnectState() == 1 || deviceInfo.getDeviceConnectState() == 2) {
                return true;
            }
        }
        return false;
    }

    public void e(Intent intent, boolean z) {
        if (intent == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "System Time intent is null");
            return;
        }
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction()) || "android.intent.action.TIME_SET".equals(intent.getAction()) || "android.intent.action.DATE_CHANGED".equals(intent.getAction()) || z) {
            ReleaseLogUtil.c("DEVMGR_HwUniteDeviceMgr", "System Time changed with type:", intent.getAction());
            if (EnvironmentInfo.l() || CommonUtil.ap()) {
                ReleaseLogUtil.c("DEVMGR_HwUniteDeviceMgr", "sendTimeSync harmony3.0 free start.");
                long jA = nft.a();
                if (jA > 0 && jA <= k.b.m) {
                    nft.c(jA);
                }
            }
            nfm.d().a();
            h();
        }
    }

    public void h() {
        lnr lnrVarA;
        LogUtil.a("HwHandleUniteDeviceMgr", "sendTimeSync previous logic start.");
        List<DeviceInfo> listB = b(e());
        if (listB.isEmpty()) {
            return;
        }
        DeviceCapability deviceCapabilityE = null;
        for (DeviceInfo deviceInfo : listB) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            if (deviceInfo.getProductType() == 275) {
                LogUtil.a("HwHandleUniteDeviceMgr", "no need send local time");
            } else {
                UniteDevice uniteDeviceB = b(deviceIdentify);
                if (uniteDeviceB != null) {
                    deviceCapabilityE = cox.e(uniteDeviceB);
                }
                if (deviceCapabilityE != null && deviceCapabilityE.isSupportTimeSetting()) {
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(1);
                    deviceCommand.setCommandID(4);
                    deviceCommand.setmIdentify(deviceIdentify);
                    cqj cqjVar = new cqj();
                    cqjVar.d(1);
                    byte[] bArrE = cqjVar.a(cqjVar.c(2, mgq.e()).c(3, mgq.a()).b()).e();
                    deviceCommand.setDataLen(bArrE.length);
                    deviceCommand.setDataContent(bArrE);
                    ReleaseLogUtil.c("DEVMGR_HwUniteDeviceMgr", "Support Time Setting content:", deviceCommand.toString());
                    e(deviceCommand);
                }
                boolean z = deviceCapabilityE != null && deviceCapabilityE.isSupportZoneId();
                ReleaseLogUtil.c("DEVMGR_HwUniteDeviceMgr", "isSupportZoneId:", Boolean.valueOf(z));
                if (z) {
                    lnrVarA = lmw.n();
                } else {
                    lnrVarA = lmw.a(false);
                }
                if (deviceIdentify.length() == 0) {
                    return;
                }
                lnrVarA.e(deviceIdentify);
                lnrVarA.d(d(lnrVarA.h(), lnrVarA.i()));
                e(lnrVarA);
                ReleaseLogUtil.c("DEVMGR_HwUniteDeviceMgr", "Support Zone content:", lnrVarA.toString());
            }
        }
    }

    public List<DeviceInfo> b(List<DeviceInfo> list) {
        ArrayList arrayList = new ArrayList(24);
        if (list != null && !list.isEmpty()) {
            for (DeviceInfo deviceInfo : list) {
                if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() == 2) {
                    LogUtil.a("HwHandleUniteDeviceMgr", "connected device name :", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        return arrayList;
    }

    public boolean e(String str) {
        Date dateC;
        LogUtil.a("HwHandleUniteDeviceMgr", "isAlreadyUpdated: lastTime", str);
        if (TextUtils.isEmpty(str) || (dateC = mko.c(str)) == null) {
            return false;
        }
        return Math.abs(System.currentTimeMillis() - dateC.getTime()) <= 259200000;
    }

    public void e(List<DeviceInfo> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwHandleUniteDeviceMgr", "unPairBtDevices input parameter is null.");
            return;
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "unPairBtDevices :", Integer.valueOf(list.size()));
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && deviceInfo.getDeviceBluetoothType() == 2 && deviceInfo.getDeviceActiveState() == 0 && !coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(deviceInfo.getDeviceIdentify()))) {
                LogUtil.j("HwHandleUniteDeviceMgr", "removeBTDeviceInstance Remove bond device fail.");
            }
        }
    }

    public Map<String, UniteDevice> c(Set set) {
        HashMap map = new HashMap(24);
        if (set == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "getConnectDeviceList allDeviceList is null.");
            return map;
        }
        for (UniteDevice uniteDevice : c().values()) {
            com.huawei.devicesdk.entity.DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
            if (deviceInfo.isUsing() && deviceInfo.getDeviceConnectState() == 2) {
                set.add(uniteDevice.getIdentify());
                if ("main_relationship".equals(mkl.d().a(deviceInfo.getDeviceMac())) || eel.d(deviceInfo.getDeviceType())) {
                    map.put(uniteDevice.getIdentify(), uniteDevice);
                }
            }
        }
        LogUtil.a("HwHandleUniteDeviceMgr", "getDeviceList deviceMap size is :", Integer.valueOf(map.size()));
        return map;
    }

    public Map<String, UniteDevice> c() {
        HashMap map = new HashMap(24);
        if (this.i == null) {
            xgt xgtVarB = xgt.b();
            this.i = xgtVarB;
            if (xgtVarB == null) {
                LogUtil.a("HwHandleUniteDeviceMgr", "getUdsDeviceList mUniteDeviceService is null.");
                return map;
            }
        }
        for (UniteDevice uniteDevice : this.i.getDeviceList().values()) {
            com.huawei.devicesdk.entity.DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
            if (deviceInfo != null && deviceInfo.getDeviceType() > 0) {
                map.put(uniteDevice.getIdentify(), uniteDevice);
            }
        }
        if (map.size() == 0) {
            LogUtil.j("HwHandleUniteDeviceMgr", "getUdsDeviceList deviceMap size is zero.");
        }
        return map;
    }

    public void c(String str) {
        LogUtil.a("HwHandleUniteDeviceMgr", "setDisconnectState enter.");
        b();
        c(str, false);
        c(cox.c(b(str)));
    }

    public void b(DeviceParameter deviceParameter) {
        LogUtil.a("HwHandleUniteDeviceMgr", "directConnectDevice enter");
        if (deviceParameter == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "directConnectDevice deviceParameter is null");
            return;
        }
        String mac = deviceParameter.getMac();
        if (mac != null && mac.endsWith("smart_watch")) {
            mac = "AndroidWear";
        }
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo.setDeviceMac(mac);
        deviceInfo.setDeviceName(deviceParameter.getDeviceNameInfo());
        deviceInfo.setDeviceBtType(deviceParameter.getBluetoothType());
        deviceInfo.setDeviceType(deviceParameter.getProductType());
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(mac);
        uniteDevice.setDeviceInfo(deviceInfo);
        c(uniteDevice, false, ConnectMode.GENERAL);
    }

    public void c(UniteDevice uniteDevice, boolean z, ConnectMode connectMode) {
        if (uniteDevice == null || uniteDevice.getDeviceInfo() == null) {
            LogUtil.j("HwHandleUniteDeviceMgr", "deviceInfo is null");
            return;
        }
        if (TextUtils.isEmpty(uniteDevice.getDeviceInfo().getDeviceMac())) {
            LogUtil.j("HwHandleUniteDeviceMgr", "deviceMac is empty");
            return;
        }
        List<DeviceInfo> listE = e();
        String identify = uniteDevice.getIdentify();
        for (DeviceInfo deviceInfo : listE) {
            if (deviceInfo != null && identify.equals(deviceInfo.getDeviceIdentify()) && deviceInfo.getDeviceConnectState() == 2) {
                LogUtil.a("HwHandleUniteDeviceMgr", "connectWearDevice simulatNotifyConnectionStateChanged isReconnect ", Boolean.valueOf(z));
                cpk.d("device_is_reconnect", String.valueOf(z));
                mkn.e().a(deviceInfo, 2);
                return;
            }
        }
        if (this.i == null) {
            LogUtil.a("HwHandleUniteDeviceMgr", "connectWearDevice mUniteDeviceService is null");
            return;
        }
        if (z) {
            LogUtil.a("HwHandleUniteDeviceMgr", "deviceInfo setTriggerType");
            uniteDevice.getDeviceInfo().setTriggerType((byte) 1);
        }
        this.i.connectDevice(uniteDevice, z, connectMode);
    }
}
