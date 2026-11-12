package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.devicesdk.strategy.ScanStrategy;
import com.huawei.health.device.open.data.model.HealthData;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class cob extends ScanStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cjs f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f1895c = null;
    private boolean d;
    private cok e;
    private a f;

    /* JADX INFO: loaded from: classes23.dex */
    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("ScanStrategyBr", "scan brdevice intent is null");
                cob.this.c(21);
                return;
            }
            String action = intent.getAction();
            LogUtil.b("ScanStrategyBr", "onReceive action:", action);
            if ("android.bluetooth.device.action.FOUND".equals(action)) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", HealthData.INVALID_VALUES_SHORT);
                if (cob.this.f1893a != null) {
                    cob.this.f1893a.d(bluetoothDevice, shortExtra, null, 1);
                }
            }
            if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                if (cob.this.f1895c != null) {
                    ReleaseLogUtil.c("DEVMGR_ScanStrategyBr", "DeviceReceiver mCountDownLatch != null");
                    cob.this.f1895c.countDown();
                    cob.this.f1895c = null;
                }
                if (cob.this.f1893a != null) {
                    cob.this.f1893a.e(false);
                }
            }
        }
    }

    @Override // com.huawei.devicesdk.strategy.ScanStrategy
    public void scan() {
        ReleaseLogUtil.c("DEVMGR_ScanStrategyBr", "ScanStrategyBr Scan Start");
        c();
        if (!this.e.e()) {
            LogUtil.e("ScanStrategyBr", "ScanStrategyBr Bluetooth error");
            return;
        }
        a aVar = new a();
        this.f = aVar;
        this.d = this.e.a(aVar);
        this.e.a();
    }

    @Override // com.huawei.devicesdk.strategy.ScanStrategy
    public void stopScan(boolean z) {
        ReleaseLogUtil.c("DEVMGR_ScanStrategyBr", "stopScan. isScanFinish:", Boolean.valueOf(this.f1894b));
        c();
        if (this.f1894b) {
            return;
        }
        this.e.c();
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f1895c = countDownLatch;
            countDownLatch.await(200L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.d("ScanStrategyBr", "stopScan InterruptedException exception");
        }
        if (this.d) {
            this.e.c(this.f);
            this.d = false;
        }
        this.f1893a.e(z);
        this.f1894b = true;
    }

    private void c() {
        if (this.e == null) {
            this.e = cok.d();
        }
    }

    @Override // com.huawei.devicesdk.strategy.ScanStrategy
    public void init(cjs cjsVar) {
        this.f1893a = cjsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        cjs cjsVar = this.f1893a;
        if (cjsVar != null) {
            cjsVar.e(i, "");
        }
    }
}
