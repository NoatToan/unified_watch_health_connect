package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LocalBroadcast;

/* JADX INFO: loaded from: classes7.dex */
public class drs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private efn f32269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32270c;
    private IDeviceEventHandler f;
    private String i;
    private HealthDevice j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32268a = false;
    private long h = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: drs.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                LogUtil.a("BluetoothScanUtil", "onReceive blueState: ", Integer.valueOf(intExtra));
                if (intExtra == 10) {
                    drs.this.e.sendEmptyMessage(10002);
                } else if (intExtra == 12) {
                    drs drsVar = drs.this;
                    drsVar.b(drsVar.i, drs.this.j);
                } else {
                    LogUtil.j("BluetoothScanUtil", "onReceive blueState is ", Integer.valueOf(intExtra));
                }
            }
        }
    };
    private Handler e = new Handler(Looper.getMainLooper()) { // from class: drs.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("BluetoothScanUtil", "receive null message");
                return;
            }
            LogUtil.a("BluetoothScanUtil", "handleMessage msg.what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 10001) {
                drs drsVar = drs.this;
                drsVar.d(drsVar.i);
            } else if (i == 10002) {
                drs.this.d();
            } else {
                LogUtil.j("BluetoothScanUtil", "BluetoothScanUtil handleMessage msg.what is error ", Integer.valueOf(message.what));
            }
        }
    };
    private IDeviceEventHandler d = new IDeviceEventHandler() { // from class: drs.2
        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            if (healthDevice == null || healthDevice.getAddress() == null || drs.this.j == null || drs.this.j.getAddress() == null || !healthDevice.getAddress().equals(drs.this.j.getAddress()) || drs.this.f == null) {
                return;
            }
            drs.this.f.onDeviceFound(healthDevice);
            drs.this.a();
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
            LogUtil.a("BluetoothScanUtil", "onScanFailed code: ", Integer.valueOf(i));
            drs.this.e();
            if (drs.this.f != null) {
                drs.this.f.onScanFailed(i);
            }
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
            LogUtil.a("BluetoothScanUtil", "onStateChanged code: ", Integer.valueOf(i));
            if (drs.this.f != null) {
                drs.this.f.onStateChanged(i);
            }
        }
    };

    public drs(IDeviceEventHandler iDeviceEventHandler) {
        this.f = iDeviceEventHandler;
    }

    public void b(String str, HealthDevice healthDevice) {
        if (TextUtils.isEmpty(str) || healthDevice == null) {
            LogUtil.j("BluetoothScanUtil", "startScan mProductId is null or device is null");
            return;
        }
        LogUtil.a("BluetoothScanUtil", "startScan productId: ", str, " is scanning ", Boolean.valueOf(this.f32268a));
        if (this.f32268a) {
            return;
        }
        this.j = healthDevice;
        this.i = str;
        if (BluetoothAdapter.getDefaultAdapter().getState() != 12) {
            LogUtil.j("BluetoothScanUtil", "startScan Bluetooth not open");
            return;
        }
        this.f32268a = true;
        this.h = 0L;
        e();
        this.h = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }

    public void a() {
        LogUtil.a("BluetoothScanUtil", "stopScan");
        this.j = null;
        this.i = null;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f32268a = false;
        efn efnVar = this.f32269b;
        if (efnVar != null) {
            efnVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("BluetoothScanUtil", "sendScannerMessage mScanTime: ", Long.valueOf(this.h));
        this.e.sendEmptyMessageDelayed(10001, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        LogUtil.a("BluetoothScanUtil", "startScanner productId: ", str);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            LogUtil.a("BluetoothScanUtil", "startScanner productInfo is not null");
            efn efnVar = new efn();
            this.f32269b = efnVar;
            boolean zA = efnVar.a(elhVarD.v(), elhVarD.x(), this.d);
            LogUtil.a("BluetoothScanUtil", "startScanner isScanner: ", Boolean.valueOf(zA));
            if (zA) {
                return;
            }
            e();
        }
    }

    public void b() {
        LogUtil.a("BluetoothScanUtil", "unRegisterBluetoothMonitor, hasReceiver: ", Boolean.valueOf(this.f32270c));
        if (this.f32270c) {
            try {
                BaseApplication.b().unregisterReceiver(this.g);
            } catch (IllegalArgumentException e) {
                LogUtil.e("BluetoothScanUtil", "BluetoothScanUtil Receiver not registered: ", e.getMessage());
            }
            this.f32270c = false;
        }
    }

    public void c() {
        LogUtil.a("BluetoothScanUtil", "registerBluetoothMonitor, hasReceiver: ", Boolean.valueOf(this.f32270c));
        if (this.f32270c) {
            return;
        }
        BaseApplication.b().registerReceiver(this.g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), LocalBroadcast.f36595c, null);
        this.f32270c = true;
    }
}
