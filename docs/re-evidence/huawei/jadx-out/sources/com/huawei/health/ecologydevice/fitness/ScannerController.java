package com.huawei.health.ecologydevice.fitness;

import android.text.TextUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmm;
import defpackage.efn;
import defpackage.elh;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class ScannerController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private efn f6501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f6502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6503c;
    private elh d;
    private String e;
    private ScanResultCallback f;

    public interface ScanResultCallback {
        void onResult(int i, HealthDevice healthDevice);
    }

    public ScannerController(elh elhVar, String str) {
        this.d = elhVar;
        this.e = str;
        this.f6502b = new a();
    }

    public ScannerController(String str) {
        this(null, null);
        this.f6503c = str;
    }

    class a implements IDeviceEventHandler {
        private a() {
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            LogUtil.a("ScannerController", "Callback, onDeviceFound device = ", healthDevice.getDeviceName());
            b(1, healthDevice);
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
            LogUtil.d("ScannerController", "onScanFailed");
            if (i == 1) {
                b(2, null);
            }
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
            if (i == 1001) {
                b(3, null);
            }
        }

        private void b(int i, HealthDevice healthDevice) {
            if (ScannerController.this.f != null) {
                ScannerController.this.f.onResult(i, healthDevice);
            }
        }
    }

    public void a() {
        this.f6501a = new efn();
        if (this.d != null) {
            LogUtil.a("ScannerController", "productInfo is not null");
            if (this.d.x() == null) {
                this.d.c(ScanFilter.c("moredevice", this.e, ScanFilter.MatchRule.FRONT));
            }
            this.f6501a.a(this.d.v(), this.d.x(), this.f6502b);
            return;
        }
        if (!TextUtils.isEmpty(this.f6503c)) {
            LogUtil.a("ScannerController", "scanDevice from mac");
            dmm.e eVar = new dmm.e();
            eVar.e(1);
            eVar.b(10L, TimeUnit.SECONDS);
            this.f6501a.a(eVar.b(), ScanFilter.c(null, this.f6503c, ScanFilter.MatchRule.STRICT), this.f6502b);
            return;
        }
        LogUtil.a("ScannerController", "for more heart rate device");
        dmm.e eVar2 = new dmm.e();
        eVar2.e(1);
        eVar2.b(10L, TimeUnit.SECONDS);
        this.f6501a.a(eVar2.b(), ScanFilter.c("moredevice", this.e, ScanFilter.MatchRule.FRONT), this.f6502b);
    }

    public void e() {
        this.f6502b = null;
        efn efnVar = this.f6501a;
        if (efnVar != null) {
            efnVar.c();
        }
    }

    public void d(ScanResultCallback scanResultCallback) {
        this.f = scanResultCallback;
    }
}
