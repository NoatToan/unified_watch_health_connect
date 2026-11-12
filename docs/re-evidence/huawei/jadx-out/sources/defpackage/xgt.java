package defpackage;

import android.content.Context;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.DeviceCompatibleCallback;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.unitedevice.api.EngineChannelInterface;
import com.huawei.unitedevice.api.UniteChannelInterface;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.config.IwearLinkConfig;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import com.huawei.unitedevice.p2p.P2pReceiver;
import health.compact.a.LogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class xgt implements EngineChannelInterface, UniteChannelInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<WearEngineModule, EngineLogicBaseManager> f52895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, DeviceStatusChangeCallback> f52897c;
    private boolean d;
    private MessageReceiveCallback e;
    private Map<String, MessageReceiveCallback> f;
    private final xgw g;

    public boolean a() {
        return this.f52896b;
    }

    public void e(boolean z) {
        this.f52896b = z;
    }

    private xgt() {
        this.g = xgw.d();
        this.f52895a = new ConcurrentHashMap();
        this.f52897c = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.d = false;
        this.f52896b = false;
        this.e = new MessageReceiveCallback() { // from class: xgt.1
            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
                xgt.this.d(i, deviceInfo, cmmVar);
            }

            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onChannelEnable(final DeviceInfo deviceInfo, final String str, final int i) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: xgt.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it = xgt.this.f.values().iterator();
                        while (it.hasNext()) {
                            ((MessageReceiveCallback) it.next()).onChannelEnable(deviceInfo, str, i);
                        }
                    }
                });
            }
        };
        LogUtil.b("UniteDeviceService", "enter UniteDeviceService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, DeviceInfo deviceInfo, cmm cmmVar) {
        if (deviceInfo == null || cmmVar == null) {
            LogUtil.e("UniteDeviceService", "data is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<MessageReceiveCallback> it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next().onDataReceived(deviceInfo, cmmVar, i);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 5) {
            LogUtil.b("UniteDeviceService", "repo data suspected block msg:", Long.valueOf(jCurrentTimeMillis2), ",command:", cpq.a(cmmVar.d()));
        }
    }

    public static void e(IwearLinkConfig iwearLinkConfig) {
        xgx.a(iwearLinkConfig);
    }

    public static xgt b() {
        return a.f52904b;
    }

    public void a(Context context) {
        if (this.d) {
            return;
        }
        this.d = true;
        this.g.c(context);
        this.g.registerDeviceStateListener(UUID.randomUUID().toString(), new DeviceStatusChangeCallback() { // from class: xgt.5
            @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
            public void onConnectStatusChanged(final DeviceInfo deviceInfo, final int i, final int i2) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: xgt.5.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectState connectState = ConnectState.getConnectState(i);
                        Iterator it = xgt.this.f52897c.values().iterator();
                        while (it.hasNext()) {
                            ((DeviceStatusChangeCallback) it.next()).onConnectStatusChanged(deviceInfo, i, i2);
                        }
                        Iterator it2 = xgt.this.f52895a.values().iterator();
                        while (it2.hasNext()) {
                            ((EngineLogicBaseManager) it2.next()).onConnectionChange(connectState, cox.c(deviceInfo));
                        }
                    }
                });
            }
        });
        this.g.registerDeviceMessageListener(UUID.randomUUID().toString(), this.e);
    }

    public void d(WearEngineModule wearEngineModule, EngineLogicBaseManager engineLogicBaseManager) {
        if (wearEngineModule == null) {
            LogUtil.d("UniteDeviceService", "WearEngineModule is null");
        } else if (engineLogicBaseManager == null) {
            LogUtil.d("UniteDeviceService", "EngineLogicBaseManager is null");
        } else {
            this.f52895a.put(wearEngineModule, engineLogicBaseManager);
        }
    }

    public void d(WearEngineModule wearEngineModule) {
        if (wearEngineModule == null) {
            LogUtil.d("UniteDeviceService", "WearEngineModule is null");
        } else if (this.f52895a.containsKey(wearEngineModule)) {
            this.f52895a.remove(wearEngineModule);
        }
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void p2pSendForWearEngine(Context context, UniteDevice uniteDevice, xgz xgzVar, SendCallback sendCallback) {
        xgu.c().p2pSendForWearEngine(context, uniteDevice, xgzVar, sendCallback);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void startTransferFileToWear(xhr xhrVar, IResultAIDLCallback iResultAIDLCallback) {
        xgu.c().startTransferFileToWear(xhrVar, iResultAIDLCallback);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void registerReceiver(Context context, xgz xgzVar, P2pReceiver p2pReceiver, SendCallback sendCallback) {
        xgu.c().registerReceiver(context, xgzVar, p2pReceiver, sendCallback);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void unregisterReceiver(Context context, P2pReceiver p2pReceiver, xgz xgzVar) {
        xgu.c().unregisterReceiver(context, p2pReceiver, xgzVar);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void pingSendForWearEngine(Context context, UniteDevice uniteDevice, String str, PingCallback pingCallback, int i) {
        xgu.c().pingSendForWearEngine(context, uniteDevice, str, pingCallback, i);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void startReceiveFileFromWear(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        xgu.c().startReceiveFileFromWear(requestFileInfo, iTransferFileCallback);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void stopReceiveFileFromWear(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        xgu.c().stopReceiveFileFromWear(requestFileInfo, iTransferFileCallback);
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void stopTransferFileToWear(xhr xhrVar, ITransferFileCallback iTransferFileCallback) {
        xgu.c().stopTransferFileToWear(xhrVar, iTransferFileCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void scanDevice(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        this.f52896b = true;
        this.g.scanDevice(scanMode, list, deviceScanCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void stopScanDevice() {
        this.g.stopScanDevice();
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void connectDevice(UniteDevice uniteDevice, boolean z, ConnectMode connectMode) {
        this.g.connectDevice(uniteDevice, z, connectMode);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void connectDevice(UniteDevice uniteDevice, boolean z, ConnectMode connectMode, ConnectFilter connectFilter) {
        this.g.connectDevice(uniteDevice, z, connectMode, connectFilter);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void createSystemBond(UniteDevice uniteDevice) {
        this.g.createSystemBond(uniteDevice);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void sendCommand(UniteDevice uniteDevice, cmg cmgVar) {
        this.g.sendCommand(uniteDevice, cmgVar);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public Map<String, UniteDevice> getDeviceList() {
        return this.g.getDeviceList();
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unPairDevice(UniteDevice uniteDevice) {
        this.g.unPairDevice(uniteDevice);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void disconnect(UniteDevice uniteDevice) {
        this.g.disconnect(uniteDevice);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public boolean isSupportService(UniteDevice uniteDevice, String str) {
        return this.g.isSupportService(uniteDevice, str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public boolean isSupportCharactor(UniteDevice uniteDevice, String str, String str2) {
        return this.g.isSupportCharactor(uniteDevice, str, str2);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceStateListener(String str, DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.f52897c.put(str, deviceStatusChangeCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceMessageListener(String str, MessageReceiveCallback messageReceiveCallback) {
        this.f.put(str, messageReceiveCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceStateListener(String str) {
        this.f52897c.remove(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceMessageListener(String str) {
        this.f.remove(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerHandshakeFilter(ConnectFilter connectFilter) {
        this.g.registerHandshakeFilter(connectFilter);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void setCharacteristicNotify(UniteDevice uniteDevice, String str, String str2, SendMode sendMode, boolean z) {
        this.g.setCharacteristicNotify(uniteDevice, str, str2, sendMode, z);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceCompatibleListener(String str, DeviceCompatibleCallback deviceCompatibleCallback) {
        this.g.registerDeviceCompatibleListener(str, deviceCompatibleCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceCompatibleListener(String str) {
        this.g.unregisterDeviceCompatibleListener(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerListener(String str, String str2, DataReceiveCallback dataReceiveCallback) {
        this.g.registerListener(str, str2, dataReceiveCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterListener(String str, String str2) {
        this.g.unregisterListener(str, str2);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void updateDeviceAfterSimulatConnected(String str) {
        this.g.updateDeviceAfterSimulatConnected(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public List<com.huawei.health.devicemgr.business.entity.DeviceInfo> getDeviceMgrList(int i, String str) {
        return this.g.getDeviceMgrList(i, str);
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static xgt f52904b = new xgt();
    }
}
