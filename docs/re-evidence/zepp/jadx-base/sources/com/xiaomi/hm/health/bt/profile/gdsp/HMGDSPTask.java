package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class HMGDSPTask extends HMBaseTask {
    private static final String i = "HMGDSPTask";
    private HMGDSPProfile c;
    private IHMDataCallback e;
    private Calendar f;
    private HMGDSPType g;
    private HMDeviceSource h;
    public final AtomicInteger b = new AtomicInteger(-1);
    private int d = 0;

    public HMGDSPTask(GattPeripheral gattPeripheral, Calendar startTime, HMGDSPType type, IHMDataCallback callback) {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.c = new HMGDSPProfile(gattPeripheral);
        this.f = startTime;
        this.g = type;
        this.e = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(HMGDSPData hMGDSPData, int i2, int i3, byte[] bArr) {
        Debug.fi(i, "fetchData data index:" + i3);
        if (this.b.get() + 1 != i3 && (this.b.get() != 255 || i3 != 0)) {
            Debug.fi(i, "missing package!!!");
        }
        hMGDSPData.parse(bArr);
        int length = this.d + bArr.length;
        this.d = length;
        this.e.onProgress(new Progress(i2, length));
        this.b.getAndSet(i3);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.e.onStart();
        if (!this.c.init()) {
            this.e.onStop(null, new HMDeviceError(2));
            return;
        }
        DataHeader dataHeader = this.c.getDataHeader(this.f, this.g.getValue());
        if (dataHeader == null) {
            this.c.deInit();
            this.e.onStop(null, new HMDeviceError(2));
            return;
        }
        final int i2 = dataHeader.size;
        if (i2 == 0) {
            this.c.deInit();
            this.e.onStop(null, new HMDeviceError(4));
            return;
        }
        this.d = 0;
        final HMGDSPData hMGDSPData = new HMGDSPData(this.g, this.h);
        hMGDSPData.init();
        this.c.startTransfer(new HMGDSPProfile.IMyListener() { // from class: iw2
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPProfile.IMyListener
            public final void onData(int i3, byte[] bArr) {
                this.a.b(hMGDSPData, i2, i3, bArr);
            }
        });
        hMGDSPData.deInit();
        this.e.onStop(hMGDSPData, new HMDeviceError(0));
        this.c.stopTransfer();
        this.c.deInit();
    }

    public HMGDSPTask(GattPeripheral gattPeripheral, HMGDSPParameter parameter) {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.c = new HMGDSPProfile(gattPeripheral);
        this.f = parameter.getCalendar();
        this.g = parameter.getGdspType();
        this.e = parameter.getCallback();
        this.h = parameter.getDeviceSource();
    }
}
