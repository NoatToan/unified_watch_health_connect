package com.xiaomi.hm.health.bt.profile.gdsp.log;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMSyncLogTask extends HMBaseTask {
    private static final String g = "log.HMSyncLogTask";
    private HMSyncLogProfile b;
    private File c;
    private IHMDataCallback<File> d;
    private int e = 0;
    private AtomicBoolean f = new AtomicBoolean(false);

    public class a implements HMSyncLogProfile.IDataLisenter {
        public final /* synthetic */ FileWriter a;
        public final /* synthetic */ int b;
        public final /* synthetic */ HMDeviceError c;

        public a(final FileWriter val$fileWriter, final int val$totalSize, final HMDeviceError val$deviceError) {
            this.a = val$fileWriter;
            this.b = val$totalSize;
            this.c = val$deviceError;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.log.HMSyncLogProfile.IDataLisenter
        public void onData(byte[] data) {
            try {
                this.a.write(new String(data, Charset.defaultCharset()));
                HMSyncLogTask.b(HMSyncLogTask.this, data.length);
            } catch (Exception e) {
                Debug.fi(HMSyncLogTask.g, "Exception:" + e.getMessage());
            }
            HMSyncLogTask.this.d.onProgress(new Progress(this.b, HMSyncLogTask.this.e));
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.log.HMSyncLogProfile.IDataLisenter
        public void onError(int error) {
            this.c.setError(error);
        }
    }

    public HMSyncLogTask(GattPeripheral gattPeripheral, File file, IHMDataCallback<File> callback) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = new HMSyncLogProfile(gattPeripheral);
        this.c = file;
        this.d = callback;
    }

    public static /* synthetic */ int b(HMSyncLogTask hMSyncLogTask, int i) {
        int i2 = hMSyncLogTask.e + i;
        hMSyncLogTask.e = i2;
        return i2;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.d.onStart();
        if (this.f.get()) {
            this.d.onStop(this.c, new HMDeviceError(0));
            return;
        }
        if (!this.b.init()) {
            this.d.onStop(this.c, new HMDeviceError(2));
            return;
        }
        if (this.f.get()) {
            this.b.deInit();
            this.d.onStop(this.c, new HMDeviceError(0));
            return;
        }
        DataHeader dataHeader = this.b.getDataHeader(Calendar.getInstance());
        if (dataHeader == null) {
            this.b.deInit();
            this.d.onStop(this.c, new HMDeviceError(2));
            return;
        }
        if (!dataHeader.isSuccessfully()) {
            this.b.deInit();
            this.d.onStop(this.c, new HMDeviceError(dataHeader.getDeviceError()));
            return;
        }
        int i = dataHeader.size;
        if (i == 0) {
            this.b.deInit();
            this.d.onStop(this.c, new HMDeviceError(4));
            return;
        }
        HMDeviceError hMDeviceError = new HMDeviceError(0);
        if (this.f.get()) {
            this.b.deInit();
            this.d.onStop(this.c, hMDeviceError);
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.e = 0;
            FileWriter fileWriter = new FileWriter(this.c);
            this.b.fetchLog(new a(fileWriter, i, hMDeviceError));
            fileWriter.flush();
            fileWriter.close();
            Debug.fi(g, String.format(Locale.getDefault(), "LOG transfer rate: %.1f KBps", Float.valueOf(i / (System.currentTimeMillis() - jCurrentTimeMillis))));
        } catch (Exception e) {
            Debug.fi(g, "Exception:" + e.getMessage());
        }
        this.d.onStop(this.c, hMDeviceError);
        this.b.stopTransfer();
        this.b.deInit();
    }

    public void forceStop() {
        this.f.getAndSet(true);
        this.b.forceStop();
    }
}
