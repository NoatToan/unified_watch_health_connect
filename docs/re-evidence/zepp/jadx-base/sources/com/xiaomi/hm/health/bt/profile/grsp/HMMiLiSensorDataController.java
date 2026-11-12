package com.xiaomi.hm.health.bt.profile.grsp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMMiLiSensorDataProfile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMMiLiSensorDataController {
    private static final String d = "HMMiLiSensorDataController";
    private static final int e = 25000;
    private static final int f = 0;
    private HMMiLiSensorDataProfile a;
    private Handler b;
    private AtomicBoolean c = new AtomicBoolean(false);

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what != 0) {
                return;
            }
            HMMiLiSensorDataController.this.c();
        }
    }

    public HMMiLiSensorDataController(GattPeripheral gattPeripheral) {
        this.a = null;
        this.b = null;
        this.a = new HMMiLiSensorDataProfile(gattPeripheral);
        HandlerThread handlerThread = new HandlerThread(d);
        handlerThread.start();
        this.b = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        if (!this.c.get()) {
            return false;
        }
        boolean zFeedDog = this.a.feedDog();
        this.b.sendEmptyMessageDelayed(0, 25000L);
        return zFeedDog;
    }

    private void d(final IHMSensorDataCallback callback) {
        new Thread(new Runnable() { // from class: x83
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(callback);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(IHMSensorDataCallback iHMSensorDataCallback) {
        this.a.getSensorData(iHMSensorDataCallback);
        iHMSensorDataCallback.onSensorStop(true);
    }

    public boolean isRunning() {
        return this.c.get();
    }

    public void start(IHMSensorDataCallback callback) {
        callback.onSensorStart();
        if (!this.a.init()) {
            callback.onSensorStop(false);
        } else {
            if (!this.a.startGetSensorData()) {
                callback.onSensorStop(false);
                return;
            }
            this.c.set(true);
            d(callback);
            this.b.sendEmptyMessageDelayed(0, 25000L);
        }
    }

    public void stop() {
        this.c.set(false);
        this.a.stopGetSensorData();
        this.a.deInit();
    }
}
