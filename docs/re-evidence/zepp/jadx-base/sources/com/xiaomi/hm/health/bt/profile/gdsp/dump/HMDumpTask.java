package com.xiaomi.hm.health.bt.profile.gdsp.dump;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
public class HMDumpTask extends HMBaseTask {
    private static final String f = "HMDumpTask";
    private HMDumpProfile b;
    private HMDumpSettings c;
    private File d;
    private IHMDataCallback<File> e;

    public class a implements HMDumpProfile.IDataLisenter {
        public final /* synthetic */ FileOutputStream a;
        public final /* synthetic */ AtomicInteger b;
        public final /* synthetic */ int c;
        public final /* synthetic */ HMDeviceError d;

        public a(final FileOutputStream val$fos, final AtomicInteger val$currentSize, final int val$totalSize, final HMDeviceError val$deviceError) {
            this.a = val$fos;
            this.b = val$currentSize;
            this.c = val$totalSize;
            this.d = val$deviceError;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.dump.HMDumpProfile.IDataLisenter
        public void onData(byte[] data) {
            try {
                this.a.write(data);
                AtomicInteger atomicInteger = this.b;
                atomicInteger.set(atomicInteger.get() + data.length);
            } catch (Exception e) {
                Debug.fi(HMDumpTask.f, "Exception:" + e.getMessage());
            }
            HMDumpTask.this.e.onProgress(new Progress(this.c, this.b.get()));
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.dump.HMDumpProfile.IDataLisenter
        public void onError(int error) {
            this.d.setError(error);
        }
    }

    public HMDumpTask(GattPeripheral gattPeripheral, HMDumpSettings settings, File file, IHMDataCallback<File> callback) {
        this.b = null;
        this.c = null;
        this.e = null;
        this.b = new HMDumpProfile(gattPeripheral);
        this.c = settings;
        this.d = file;
        this.e = callback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.e.onStart();
        if (!this.b.init() || !this.b.config(this.c)) {
            this.e.onStop(this.d, new HMDeviceError(2));
            return;
        }
        HMDeviceError hMDeviceError = new HMDeviceError(0);
        try {
            int length = (int) this.c.getLength();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            FileOutputStream fileOutputStream = new FileOutputStream(this.d);
            this.b.start(new a(fileOutputStream, atomicInteger, length, hMDeviceError));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            Debug.fi(f, "Exception:" + e.getMessage());
        }
        this.e.onStop(this.d, hMDeviceError);
        this.b.stopTransfer();
        this.b.deInit();
    }
}
