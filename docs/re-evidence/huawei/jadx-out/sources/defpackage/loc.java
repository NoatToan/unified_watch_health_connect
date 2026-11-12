package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Node;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.SmartWatchCallback;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceAWService;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BtDeviceAwHostService;
import health.compact.a.LogUtil;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public class loc implements BTDeviceServiceBase {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40537a;
    private BtDeviceStateCallback d;
    private GoogleApiClient g;
    private ExtendHandler i;
    private String j;
    private Node f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40538b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f40539c = new DeviceInfo();
    private SmartWatchCallback h = new SmartWatchCallback() { // from class: loc.3
        @Override // com.huawei.hwbtsdk.btdatatype.callback.SmartWatchCallback
        public void onAckReceived(String str, int i, byte[] bArr) {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x005e A[Catch: all -> 0x0065, TryCatch #0 {, blocks: (B:9:0x0050, B:11:0x0058, B:13:0x0063, B:12:0x005e), top: B:18:0x0050 }] */
        @Override // com.huawei.hwbtsdk.btdatatype.callback.SmartWatchCallback
        public void onDeviceConnectionStateChanged(String str, int i) {
            LogUtil.b("DEVMGR_SETTING", loc.this.b(), "onDeviceConnectionStateChanged:", loc.this.j, ";nodeId:", str);
            if (TextUtils.isEmpty(loc.this.j)) {
                loc.this.j = str;
                BTDeviceAWService.c(loc.this.f40537a).b().put(loc.this.j, loc.this.h);
            }
            synchronized (loc.e) {
                if (i == 2) {
                    if (loc.this.f == null) {
                        loc.this.d();
                    } else {
                        loc.this.a(i);
                    }
                } else {
                    loc.this.a(i);
                }
                throw th;
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.SmartWatchCallback
        public void onDataReceived(String str, int i, byte[] bArr) {
            if (loc.this.d != null) {
                LogUtil.b(loc.this.b(), "onDataReceived, nodeid:", str, ";deviceName:", loc.this.f40539c.getDeviceName());
                loc.this.d.onDataReceived(loc.this.f40539c, i, bArr);
            }
        }
    };

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void connectBTDevice(BluetoothDevice bluetoothDevice) {
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void removeV1CheckCommand() {
    }

    public loc(Context context, String str, BtDeviceStateCallback btDeviceStateCallback) {
        this.j = "";
        this.f40537a = null;
        this.d = null;
        LogUtil.b("DEVMGR_SETTING", b(), "create BTDeviceSmartWatchService", str);
        this.f40537a = context;
        this.j = str;
        this.f40539c.setNodeId(str);
        this.f40539c.setDeviceProtocol(2);
        this.d = btDeviceStateCallback;
        if (str == null) {
            BTDeviceAWService.c(this.f40537a).e(this.h);
            this.f40539c.setDeviceIdentify("AndroidWear");
            this.f40539c.setDeviceBluetoothType(0);
        } else {
            BTDeviceAWService.c(this.f40537a).b().put(this.j, this.h);
            this.f40539c.setDeviceIdentify(this.j + "smart_watch");
            this.f40539c.setDeviceBluetoothType(5);
        }
        g();
    }

    private void g() {
        this.i = HandlerCenter.b(new Handler.Callback() { // from class: loc.5
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                loc.this.d();
                return true;
            }
        }, "BTDeviceSmartWatchService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return "BTDeviceSmartWatchService" + this.j;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void connectBTDevice(String str) {
        LogUtil.b("DEVMGR_SETTING", b(), "Enter connectBTDevice()");
        Context context = this.f40537a;
        if (context == null) {
            a(4);
            return;
        }
        BtDeviceAwHostService.d(context);
        a(1);
        GoogleApiClient googleApiClientD = BTDeviceAWService.c(this.f40537a).d();
        this.g = googleApiClientD;
        if (googleApiClientD == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "blockingConnect mGoogleApiClient is null");
            return;
        }
        if (googleApiClientD.isConnected()) {
            a();
            return;
        }
        if (this.g.isConnecting()) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "GoogleApiClient isConnecting");
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.wearable.app.cn", "com.google.android.gms.wearable.service.WearableService"));
        try {
            this.f40537a.startService(intent);
        } catch (IllegalStateException e2) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceSmartWatchService", e2.getMessage());
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceSmartWatchService", "started gms service");
        this.g.connect();
        LogUtil.e("0xA0200009", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "GoogleApiClient try connect");
    }

    private void a() {
        LogUtil.b("DEVMGR_SETTING", b(), "Enter connectedSuccess");
        ExtendHandler extendHandler = this.i;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "getConnectedNodes is ", Integer.valueOf(getBTDeviceConnectState()));
        Collection<Node> collectionA = BTDeviceAWService.c(this.f40537a).a();
        if (collectionA == null || collectionA.size() == 0) {
            LogUtil.b("DEVMGR_SETTING", b(), " StateThread no watch in iterator");
            i();
            return;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "StateThread watch names.size() is ", Integer.valueOf(collectionA.size()));
        for (Node node : collectionA) {
            if (TextUtils.isEmpty(this.j)) {
                String strE = BTDeviceAWService.c(BaseApplication.b()).e(node);
                if (!TextUtils.isEmpty(strE)) {
                    this.j = strE;
                    e(node);
                    BTDeviceAWService.c(this.f40537a).b().put(this.j, this.h);
                    a(2);
                }
            } else if (this.j.equals(node.getId())) {
                e(node);
                a(2);
                return;
            }
        }
        i();
    }

    private void e(Node node) {
        synchronized (this) {
            this.f = node;
        }
    }

    private void i() {
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        LogUtil.b(b(), "reconnect device node is: ", this.j);
        ymp.d().d(this.j);
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void disconnectBTDevice() {
        LogUtil.b("DEVMGR_SETTING", b(), "start to disconnect.");
        disconnectGMS();
        e();
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public boolean sendBTDeviceData(byte[] bArr) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "sendBTDeviceData");
        BTDeviceAWService.c(this.f40537a).b(this.j, bArr);
        return true;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void onDestroy() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "Enter onDestroy().");
        this.f40537a = null;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public DeviceInfo getDeviceInfo() {
        return this.f40539c;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void btSwitchChangeInfo(int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "Enter btSwitchChangeInfo() with status = ", Integer.valueOf(i));
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void sendBTFilePath(String str) throws Throwable {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, b(), "sendBTDeviceAssetData");
        BTDeviceAWService.c(this.f40537a).d(this.j, str);
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setFileCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
        BTDeviceAWService.c(this.f40537a).c(btDeviceResponseCallback);
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void disconnectGMS() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "start to disconnectGMS.");
        e();
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setPathExtendNum(int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "Enter setPathExtendNum ");
        BTDeviceAWService.c(this.f40537a).a(i);
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public int getBTDeviceConnectState() {
        int i;
        synchronized (this) {
            i = this.f40538b;
        }
        return i;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setAwAssetCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
        BTDeviceAWService.c(this.f40537a).b(btDeviceResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        DeviceInfo deviceInfo;
        synchronized (this) {
            if (this.d != null && (deviceInfo = this.f40539c) != null) {
                if (i == this.f40538b) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "reportConnectState , status not changed = ", Integer.valueOf(i));
                    return;
                }
                this.f40538b = i;
                if (i != deviceInfo.getDeviceConnectState()) {
                    Node node = this.f;
                    if (node != null) {
                        a(node.getDisplayName());
                    }
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "reportConnectState , awConnectState = ", Integer.valueOf(i));
                    loa loaVarA = loa.a();
                    String deviceIdentify = this.f40539c.getDeviceIdentify();
                    if (i == 4) {
                        loaVarA.a(deviceIdentify, System.currentTimeMillis());
                        loaVarA.e(deviceIdentify, AgdConstant.INSTALL_TYPE_DEFAULT);
                        loaVarA.d(deviceIdentify, 1003001);
                    }
                    this.d.onDeviceConnectionStateChanged(this.f40539c, i, loaVarA.d(deviceIdentify));
                }
            } else {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "reportConnectState error with mBtDeviceStateCallback is null.");
            }
        }
    }

    private void a(String str) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "setName , AndroidWear name = ", str);
        this.f40539c.setDeviceName(str);
    }

    private void e() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, b(), "connectionLost() called");
        this.i.removeTasksAndMessages();
        a(3);
    }
}
