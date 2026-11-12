package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.BtSwitchCallback;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.ConnectStatusInterface;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.strategy.ConnectStrategy;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class cnf implements ConnectStatusInterface, MessageReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ConnectFilter f1830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BtSwitchCallback f1831b;
    protected DeviceStatusChangeCallback e;
    private CountDownLatch f;
    private HandlerThread g;
    private Handler h;
    private Map<String, String> i;
    private coi j;
    private static Map<String, ConnectStrategy> d = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Boolean> f1829c = new ConcurrentHashMap(16);

    private int b(int i) {
        if (i == 32) {
            return 60032;
        }
        return i == 34 ? 70034 : 100000;
    }

    private cnf() {
        this.i = new HashMap(16);
        BtSwitchCallback btSwitchCallback = new BtSwitchCallback() { // from class: cnf.4
            @Override // com.huawei.devicesdk.callback.BtSwitchCallback
            public void onBtSwitchStateCallback(int i) {
                if (i != 1) {
                    if (i == 2) {
                        ReleaseLogUtil.c("DEVMGR_ConnectManage", "BLUETOOTH_STATE_TURNING_OFF!");
                        return;
                    } else if (i == 3) {
                        ReleaseLogUtil.c("DEVMGR_ConnectManage", "BLUETOOTH_STATE_ON!");
                        return;
                    } else {
                        if (i != 4) {
                            return;
                        }
                        ReleaseLogUtil.c("DEVMGR_ConnectManage", "BLUETOOTH_STATE_TURNING_ON!");
                        return;
                    }
                }
                ReleaseLogUtil.c("DEVMGR_ConnectManage", "BLUETOOTH_STATE_OFF!");
                for (DeviceInfo deviceInfo : cnk.c().b().values()) {
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    if (deviceConnectState != 1 && deviceConnectState != 2 && deviceConnectState != 13 && deviceConnectState != 14) {
                        switch (deviceConnectState) {
                            case 9:
                            case 10:
                            case 11:
                                break;
                            default:
                                continue;
                        }
                    }
                    cnk.c().c(deviceInfo.getDeviceMac(), 3);
                    cnf.this.e(deviceInfo);
                    cnf cnfVar = cnf.this;
                    cnfVar.d(deviceInfo, 3, cnfVar.c(deviceInfo.getDeviceBtType()));
                }
            }
        };
        this.f1831b = btSwitchCallback;
        c();
        coi coiVarB = coi.b();
        this.j = coiVarB;
        coiVarB.d(btSwitchCallback);
        this.j.i();
        i();
    }

    public ConnectFilter a() {
        return this.f1830a;
    }

    private void c() {
        cll.c().c(this);
        cnm.d().d(this);
    }

    public static cnf d() {
        return e.f1833b;
    }

    public void c(ConnectMode connectMode, final DeviceInfo deviceInfo, boolean z) {
        if (!cnx.d()) {
            cnx.e(true);
        }
        LogUtil.b("ConnectManage", "isHiChain3FirstTag: ", Boolean.valueOf(cnx.d()));
        if (connectMode == null || deviceInfo == null || !xgx.d().getAuthorizationStatus(BaseApplication.b())) {
            LogUtil.e("ConnectManage", "connect device failed, param is error.");
            d(deviceInfo, 4, cpi.c(7, 303));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && !cpp.e(BaseApplication.b(), new String[]{"android.permission.BLUETOOTH_CONNECT"})) {
            LogUtil.e("ConnectManage", "connect device failed, no permission");
            return;
        }
        if (cop.b()) {
            ThreadPoolManager.c().a("cancelBtConfirmDialog", new Runnable() { // from class: cnn
                @Override // java.lang.Runnable
                public final void run() {
                    cnf.a(deviceInfo);
                }
            });
        }
        cpk.d("device_is_reconnect", String.valueOf(z));
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "start to connect. connectMode: ", connectMode, cpl.e(deviceInfo), " reconnect: ", Boolean.valueOf(z));
        this.i.put(deviceInfo.getDeviceMac(), z ? "2" : "1");
        b(deviceInfo.getDeviceMac(), 200L);
        ConnectStrategy connectStrategyB = b(connectMode, deviceInfo.getDeviceMac());
        if (connectStrategyB == null) {
            LogUtil.d("ConnectManage", "obtain connect strategy error.", cpl.a(deviceInfo));
            d(deviceInfo, 4, cpi.c(7, 303));
            return;
        }
        connectStrategyB.registerHandshakeStatusReporter(this);
        if (this.f1830a != null) {
            connectStrategyB.registerHandshakeFilter(deviceInfo, this.f1830a);
        }
        if (!b(deviceInfo, z)) {
            LogUtil.b("ConnectManage", "device is not need to connect.");
            return;
        }
        e(connectMode);
        cqp.a(100056, deviceInfo.getDeviceName(), String.valueOf(z), "");
        d(deviceInfo, 1, 100000);
        connectStrategyB.connect(connectMode, deviceInfo);
        cno.a().d(deviceInfo);
        cno.a().a(deviceInfo.getDeviceMac());
    }

    static /* synthetic */ void a(DeviceInfo deviceInfo) {
        boolean zD = coj.d(deviceInfo.getDeviceMac());
        LogUtil.b("ConnectManage", "isDeviceInBonded: ", Boolean.valueOf(zD));
        cqp.a(100096, deviceInfo.getDeviceName(), "", Boolean.toString(zD));
        if (zD) {
            return;
        }
        coj.b(deviceInfo.getDeviceMac());
    }

    private void b(String str, long j) {
        Boolean bool = f1829c.get(str);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "waiting for completion.");
        b();
        e(j);
    }

    private void e(ConnectMode connectMode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("action", String.valueOf(connectMode.value()));
        lng.e("89010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    private boolean b(DeviceInfo deviceInfo, boolean z) {
        synchronized (this) {
            if (!j(deviceInfo)) {
                return false;
            }
            deviceInfo.setUsing(true);
            deviceInfo.setDeviceConnectState(1);
            deviceInfo.setReconnect(z);
            cnk.c().d(deviceInfo);
            cnk.c().c(deviceInfo);
            return true;
        }
    }

    private boolean j(DeviceInfo deviceInfo) {
        String deviceMac = deviceInfo.getDeviceMac();
        DeviceInfo deviceInfoA = cnk.c().a(deviceMac);
        if (deviceInfoA == null) {
            deviceInfoA = cnk.c().j(deviceMac);
        }
        if (deviceInfoA != null) {
            int deviceConnectState = deviceInfoA.getDeviceConnectState();
            if (deviceConnectState == 2) {
                d(deviceInfo, 2, 100000);
                return false;
            }
            if (deviceConnectState == 1 || deviceConnectState == 9 || deviceConnectState == 13 || deviceConnectState == 10 || deviceConnectState == 14 || deviceConnectState == 11) {
                ReleaseLogUtil.c("DEVMGR_ConnectManage", "device is connecting. ", cpl.e(deviceInfo));
                return false;
            }
            Boolean bool = f1829c.get(deviceMac);
            if (bool == null || !bool.booleanValue()) {
                ReleaseLogUtil.c("DEVMGR_ConnectManage", "device need to connect.", cpl.e(deviceInfoA));
            } else {
                ReleaseLogUtil.c("DEVMGR_ConnectManage", "device is clearing. ", cpl.e(deviceInfoA));
                return false;
            }
        }
        return true;
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("ConnectManage", "device info is null");
            return;
        }
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "start to disconnect.", cpl.e(deviceInfo));
        cnk.c().d(deviceInfo.getDeviceMac(), false);
        ConnectStrategy connectStrategyB = b(deviceInfo.getDeviceMac());
        if (connectStrategyB == null) {
            LogUtil.e("ConnectManage", "strategy is null.", cpl.a(deviceInfo));
        } else {
            cno.a().a(deviceInfo);
            connectStrategyB.disconnect(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("ConnectManage", "clearDeviceCache: device is invalid.");
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        LogUtil.b("ConnectManage", "clearDeviceCache. identify: ", cpl.a(deviceMac));
        cnk.c().c(deviceMac, false);
        cnk.c().e(deviceMac);
        cnm.d().a(deviceInfo);
        cnm.d().e(deviceMac);
        cmt.b().clearDevice(deviceMac);
        ConnectStrategy connectStrategy = d.get(deviceMac);
        if (connectStrategy != null) {
            connectStrategy.destroy(deviceMac);
            d.remove(deviceMac);
        }
        cll.c().b(deviceMac);
    }

    private ConnectStrategy b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d.get(str);
    }

    private ConnectStrategy b(ConnectMode connectMode, String str) {
        if (TextUtils.isEmpty(str) || connectMode == null) {
            LogUtil.e("ConnectManage", "obtainConnectStrategy param is invalid.");
            return null;
        }
        ConnectStrategy connectStrategy = d.get(str);
        if (connectStrategy == null) {
            Object objD = new cof().d(connectMode);
            if (objD instanceof ConnectStrategy) {
                ConnectStrategy connectStrategy2 = (ConnectStrategy) objD;
                d.put(str, connectStrategy2);
                return connectStrategy2;
            }
        }
        return connectStrategy;
    }

    @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
    public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null || cmmVar == null) {
            LogUtil.e("ConnectManage", "onConnectStatusChanged device error", cpl.a(deviceInfo));
            return;
        }
        LogUtil.b("ConnectManage", "onDataReceived", cpl.a(deviceInfo));
        ConnectStrategy connectStrategyB = b(deviceInfo.getDeviceMac());
        if (connectStrategyB != null) {
            connectStrategyB.onDataReceived(deviceInfo, cmmVar, i);
        }
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onPhysicalLayerConnected(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onPhysicalLayerConnected error: ", cpl.a(deviceInfo));
            return;
        }
        cmo cmoVarF = cnk.c().f(deviceInfo.getDeviceMac());
        ConnectStrategy connectStrategyB = b(cmoVarF == null ? null : cmoVarF.b(), deviceInfo.getDeviceMac());
        if (connectStrategyB == null) {
            LogUtil.e("ConnectManage", "onPhysicalLayerConnected strategy is null");
            return;
        }
        cnm.d().d(deviceInfo);
        cnk.c().c(deviceInfo.getDeviceMac(), true);
        b(deviceInfo);
        cnm.d().e(deviceInfo.getDeviceMac());
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "start handshake.", cpl.e(deviceInfo));
        connectStrategyB.startHandshake(deviceInfo);
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onPhysicalLayerConnectFailed(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onPhysicalLayerConnectFailed error: ", cpl.a(deviceInfo));
            return;
        }
        c(deviceInfo);
        f1829c.put(deviceInfo.getDeviceMac(), true);
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "onPhysicalLayerConnectFailed: ", cpl.e(deviceInfo));
        cnk.c().c(deviceInfo.getDeviceMac(), 4);
        e(deviceInfo);
        c(deviceInfo, i);
        d(deviceInfo, 4, i);
        cno.a().d(deviceInfo, i);
        f1829c.put(deviceInfo.getDeviceMac(), false);
        h();
        coy.d(deviceInfo.getDeviceMac());
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onPhysicalLayerDisconnected(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onPhysicalLayerDisconnected error: ", cpl.a(deviceInfo));
            return;
        }
        c(deviceInfo);
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "onPhysicalLayerDisconnected: ", cpl.e(deviceInfo));
        String deviceMac = deviceInfo.getDeviceMac();
        e(deviceInfo);
        if (g(deviceInfo)) {
            LogUtil.b("ConnectManage", "onPhysicalLayerDisconnected processBondStateKeyMiss");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 3) {
            cnk.c().c(deviceMac, 3);
            d(deviceInfo, 3, i);
        }
        cno.a().d(deviceInfo, i);
        this.i.remove(deviceInfo.getDeviceMac());
        this.j.a(deviceInfo.getDeviceMac(), false);
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onHandshakeStartOobe(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onHandshakeStartOobe error: ", cpl.a(deviceInfo));
        } else {
            c(deviceInfo);
        }
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onHandshakeFinish(DeviceInfo deviceInfo) {
        String strA;
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onHandshakeFinish error: ", cpl.a(deviceInfo));
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        c(deviceInfo);
        DeviceInfo deviceInfoJ = cnk.c().j(deviceMac);
        if (cop.e() && deviceInfoJ != null && deviceInfoJ.getDeviceConnectState() == 3) {
            ReleaseLogUtil.d("DEVMGR_ConnectManage", "onHandshakeFinish device connect state is disconnect, so return, deviceName is", deviceInfoJ.getDeviceName());
            lng.c("ConnectMessage", "onHandshakeFinish device connect state is disconnect, so return, deviceName is" + deviceInfoJ.getDeviceName());
            return;
        }
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "onHandshakeFinish: ", cpl.e(deviceInfo));
        cnk.c().b(deviceMac, deviceInfo);
        cnk.c().c(deviceMac, 2);
        cnk.c().a(deviceInfo);
        cnk.c().e(deviceMac);
        SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
        boolean zB = cpg.b(deviceInfo);
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "isSmartWatch: ", Boolean.valueOf(zB));
        if (zB) {
            strA = cpg.b(cph.a(deviceInfo.getDeviceSn()));
        } else {
            strA = cpg.a(deviceMac, cph.a(deviceInfo.getDeviceSn()));
        }
        cqp.a(100051, deviceInfo.getDeviceName(), "", strA + "&" + this.i.get(deviceInfo.getDeviceMac()));
        cnk.c().c(deviceMac, false);
        deviceInfo.setUdid(cpg.a(deviceMac, cph.a(deviceInfo.getDeviceSn())));
        d(deviceInfo, 2, 100000);
        cns.c();
        coy.d(deviceInfo.getDeviceMac());
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onHandshakeFailed(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onHandshakeFailed error: ", cpl.a(deviceInfo));
            return;
        }
        c(deviceInfo);
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "onHandshakeFailed: ", cpl.e(deviceInfo));
        cnk.c().c(deviceInfo.getDeviceMac(), 4);
        e(deviceInfo);
        c(deviceInfo, i);
        d(deviceInfo, 4, i);
        coy.d(deviceInfo.getDeviceMac());
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onDeviceBond(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "onDeviceBond error", cpl.a(deviceInfo));
        } else {
            LogUtil.b("ConnectManage", "onDeviceBond: ", cpl.a(deviceInfo), " status: ", Integer.valueOf(i));
            d(deviceInfo, i, b(i));
        }
    }

    @Override // com.huawei.devicesdk.callback.ConnectStatusInterface
    public void onCapabilityChanged(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", " deviceInfo or mac is null");
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        cnk.c().c(deviceMac, cnk.c().b(deviceMac));
    }

    private void c(DeviceInfo deviceInfo, int i) {
        cqp.a(100109, deviceInfo.getDeviceName(), String.valueOf(i), "&" + this.i.get(deviceInfo.getDeviceMac()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(int i) {
        int iC = cpi.c(6, 0);
        if (i == 1) {
            return 30002;
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, int i, int i2) {
        if (deviceInfo == null) {
            LogUtil.e("ConnectManage", "can not notify device status to client, device info is null");
            return;
        }
        if (this.e == null) {
            LogUtil.e("ConnectManage", "not find callback, device ", cpl.a(deviceInfo.getDeviceMac()));
            return;
        }
        a(deviceInfo.getDeviceMac(), i);
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "notifyStatusToClient, [ERROR_CODE]-->", Integer.valueOf(i2));
        LogUtil.b("ConnectManage", "notifyStatusToClient: ", cpl.a(deviceInfo));
        cpt.a(deviceInfo.getDeviceMac(), i);
        int i3 = (i == 4 && i2 == 100000) ? 888888 : i2;
        String str = String.valueOf(i) + "&" + this.i.get(deviceInfo.getDeviceMac());
        if (cpg.b(deviceInfo)) {
            str = str + "&" + deviceInfo.getPowerSaveMode();
        }
        this.e.onConnectStatusChanged(deviceInfo, i, i2);
        if (10304 == i3 && !coy.b(deviceInfo.getDeviceMac()).a()) {
            LogUtil.e("ConnectManage", "ble gatt timeout is normal, not report.");
            str = str + "&normalGattTimeout";
        }
        cqp.a(100050, deviceInfo.getDeviceName(), String.valueOf(i3), str);
    }

    private void a(String str, int i) {
        LogUtil.b("ConnectManage", "updateSocketService enter.");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i == 3 || i == 4) {
            LogUtil.b("ConnectManage", "deviceStatus value disconnected");
            ckl.f1682a.remove(str);
            ckl.f1683b.remove(str);
            ckl.j.remove(str);
            ckl.e.remove(str);
            ckl.d.remove(str);
            cou.a().c();
        }
    }

    @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
    public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
        if (deviceInfo == null) {
            return;
        }
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "onChannelEnable", " uuid ", str, " errorCode ", Integer.valueOf(i), cpl.e(deviceInfo));
        ConnectStrategy connectStrategyB = b(deviceInfo.getDeviceMac());
        if (connectStrategyB != null) {
            connectStrategyB.onChannelEnable(deviceInfo, i);
        }
    }

    public void a(ConnectFilter connectFilter) {
        if (connectFilter == null) {
            LogUtil.e("ConnectManage", "registerHandshakeFilter error");
        } else {
            this.f1830a = connectFilter;
        }
    }

    public void d(DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.e = deviceStatusChangeCallback;
    }

    public void e() {
        this.e = null;
    }

    public void c(DeviceInfo deviceInfo, boolean z) {
        ConnectStrategy connectStrategyB;
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("ConnectManage", "unPairDevice error. input param is invalid.");
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        this.j.b(deviceMac);
        cno.a().a(deviceInfo);
        DeviceInfo deviceInfoJ = cnk.c().j(deviceMac);
        DeviceInfo deviceInfoA = cnk.c().a(deviceMac);
        if (deviceInfoJ == null && deviceInfoA == null) {
            LogUtil.e("ConnectManage", "unPairDevice local device not exist");
            return;
        }
        cmo cmoVarF = cnk.c().f(deviceMac);
        ConnectMode connectModeB = cmoVarF == null ? null : cmoVarF.b();
        cnk.c().e(deviceInfo);
        ConnectStrategy connectStrategyB2 = b(deviceMac);
        if (connectStrategyB2 != null) {
            connectStrategyB2.unPairDevice(deviceInfo, connectModeB, z);
        } else {
            if (connectModeB == null || (connectStrategyB = b(connectModeB, deviceMac)) == null) {
                return;
            }
            connectStrategyB.unPairDevice(deviceInfo, connectModeB, z);
        }
    }

    public void a(DeviceInfo deviceInfo, ConnectMode connectMode) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null || connectMode == null) {
            LogUtil.e("ConnectManage", "pair device error. input param is invalid.");
            return;
        }
        ConnectStrategy connectStrategyB = b(connectMode, deviceInfo.getDeviceMac());
        if (connectStrategyB != null) {
            connectStrategyB.pairDevice(deviceInfo, connectMode);
        }
    }

    private void b() {
        if (this.f == null) {
            this.f = new CountDownLatch(1);
        }
    }

    private void e(long j) {
        LogUtil.b("ConnectManage", "waitClearingProcessEnd: start");
        CountDownLatch countDownLatch = this.f;
        if (countDownLatch == null) {
            LogUtil.e("ConnectManage", "mClearingProcessLatch is invalid.");
            return;
        }
        try {
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                return;
            }
            LogUtil.e("ConnectManage", "await timeout, waitClearingProcessEnd failed");
        } catch (InterruptedException unused) {
            LogUtil.d("ConnectManage", "waitAuthFinish: InterruptedException");
        }
    }

    private void h() {
        CountDownLatch countDownLatch = this.f;
        if (countDownLatch == null) {
            LogUtil.e("ConnectManage", "releaseLock: clearingProcessLatch is null");
            return;
        }
        LogUtil.b("ConnectManage", "releaseLock: countdown");
        countDownLatch.countDown();
        this.f = null;
    }

    private boolean g(DeviceInfo deviceInfo) {
        String deviceMac;
        cml cmlVarC;
        if (deviceInfo.getDeviceBtType() != 2 || (cmlVarC = cnk.c().c((deviceMac = deviceInfo.getDeviceMac()))) == null) {
            return false;
        }
        int iA = cmlVarC.a();
        boolean zN = cmlVarC.n();
        if (iA != 2 || !zN) {
            return false;
        }
        ReleaseLogUtil.c("DEVMGR_ConnectManage", "processBondStateKeyMiss");
        cnk.c().c(deviceMac, 3);
        cmo cmoVarF = cnk.c().f(deviceInfo.getDeviceMac());
        c(cmoVarF == null ? null : cmoVarF.b(), deviceInfo, true);
        return true;
    }

    private void i() {
        HandlerThread handlerThread = new HandlerThread("ConnectManage");
        this.g = handlerThread;
        handlerThread.start();
        this.h = new c(this.g.getLooper());
    }

    public void b(DeviceInfo deviceInfo) {
        Message messageObtainMessage = this.h.obtainMessage(12);
        messageObtainMessage.obj = deviceInfo.getDeviceMac().intern();
        this.h.sendMessageDelayed(messageObtainMessage, 60000L);
    }

    public void c(DeviceInfo deviceInfo) {
        this.h.removeMessages(12, deviceInfo.getDeviceMac().intern());
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cnf f1833b = new cnf();
    }

    static class c extends Handler {
        private c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.d("ConnectManage", "handleMessage scanUtil is null");
                return;
            }
            DeviceInfo deviceInfoA = cnk.c().a(String.valueOf(message.obj));
            LogUtil.e("ConnectManage", "Handshake timeout: ", cpl.a(deviceInfoA));
            cnf.d().onHandshakeFailed(deviceInfoA, cpi.c(5, 306));
        }
    }
}
