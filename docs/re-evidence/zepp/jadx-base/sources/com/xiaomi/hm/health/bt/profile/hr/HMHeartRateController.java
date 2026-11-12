package com.xiaomi.hm.health.bt.profile.hr;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule;
import com.huami.bluetooth.profile.channel.module.openapp.RealtimeHrState;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.hr.HeartRateControl;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class HMHeartRateController {
    private static final String i = "HMHeartRateController";
    private static final long j = 5000;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 20000;
    private static final int o = 10000;
    private HMHeartRateProfile a;
    private HMBaseDevice b;
    private OpenAppModule c;
    private Handler d;
    private ConditionVariable e;
    private volatile boolean f;
    private volatile boolean g;
    private volatile boolean h;

    public interface IHeartRateCallback {
        void onHeartRateChanged(int hr);

        void onOpen(boolean result);
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                HMHeartRateController.this.l();
            } else if (i == 1) {
                HMHeartRateController.this.j((IHeartRateCallback) msg.obj);
            } else {
                if (i != 2) {
                    return;
                }
                HMHeartRateController.this.k();
            }
        }
    }

    public class b implements IHeartRateCallback {
        public final /* synthetic */ HMHeartRateProfile.IHeartRateChangedCallback a;
        public final /* synthetic */ boolean[] b;
        public final /* synthetic */ CountDownLatch c;

        public b(final HMHeartRateProfile.IHeartRateChangedCallback val$callback, final boolean[] val$ret, final CountDownLatch val$countDownLatch) {
            this.a = val$callback;
            this.b = val$ret;
            this.c = val$countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
        public void onHeartRateChanged(int hr) {
            this.a.onHeartRateChanged(hr);
        }

        @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
        public void onOpen(boolean result) {
            this.b[0] = result;
            this.c.countDown();
        }
    }

    public HMHeartRateController(BluetoothCharacteristic control, BluetoothCharacteristic measurement) {
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = false;
        this.a = new HMHeartRateProfile(control, measurement);
        f();
    }

    private void f() {
        HandlerThread handlerThread = new HandlerThread(i);
        handlerThread.start();
        this.d = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(IHeartRateCallback iHeartRateCallback, int i2) {
        iHeartRateCallback.onHeartRateChanged(i2);
        Debug.fi(i, "HR_Log Manual:" + i2 + "(" + Calendar.getInstance().getTime() + ")");
        this.e.open();
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(IHeartRateCallback iHeartRateCallback, int i2) {
        Debug.fi(i, "HR_Log Realtime:" + i2 + "(" + Calendar.getInstance().getTime() + ")");
        if (iHeartRateCallback != null) {
            iHeartRateCallback.onHeartRateChanged(i2);
        }
    }

    private boolean i(HeartRateControl.Mode mode, HeartRateControl.Operation operation, int interval) {
        if (!this.a.init()) {
            Debug.fi(i, "profile init failed!!!");
            return false;
        }
        Debug.fi(i, "setHeartRateMode mode:" + mode + ",operation:" + operation + ",ret:" + this.a.k(mode, operation));
        boolean zL = this.a.l(interval);
        StringBuilder sb = new StringBuilder();
        sb.append("setRealtimeHeartRateInterval interval:");
        sb.append(interval);
        sb.append(",ret:");
        sb.append(zL);
        Debug.fi(i, sb.toString());
        this.a.deInit();
        return zL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(final IHeartRateCallback callback) {
        Debug.fi(i, "startRealtimeMeasure");
        HMBaseDevice hMBaseDevice = this.b;
        if (hMBaseDevice != null && this.c == null && hMBaseDevice.supportModule(29)) {
            this.c = (OpenAppModule) this.b.getChannelModule(OpenAppModule.class);
        }
        if (this.c == null ? !this.a.init() : !this.a.initZeppOs()) {
            Debug.fi(i, "init profile failed!!!");
            callback.onOpen(false);
            return false;
        }
        OpenAppModule openAppModule = this.c;
        if (openAppModule != null ? openAppModule.sendRealtimeHrState(RealtimeHrState.OPEN) : this.a.k(HeartRateControl.Mode.Continuous.INSTANCE, HeartRateControl.Operation.Open.INSTANCE)) {
            callback.onOpen(true);
            this.a.c(new HMHeartRateProfile.IHeartRateChangedCallback() { // from class: uz2
                @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateProfile.IHeartRateChangedCallback
                public final void onHeartRateChanged(int i2) {
                    HMHeartRateController.h(callback, i2);
                }
            });
            this.h = true;
            this.d.sendEmptyMessageDelayed(0, 10000L);
            Debug.fi(i, "startRealtimeMeasure out");
            return true;
        }
        Debug.fi(i, "return as command failed!!!");
        if (this.c != null) {
            this.a.deInitZeppOs();
            this.c = null;
        } else {
            this.a.deInit();
        }
        callback.onOpen(false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        Debug.fi(i, "stopRealtimeMeasure");
        OpenAppModule openAppModule = this.c;
        boolean zSendRealtimeHrState = openAppModule != null ? openAppModule.sendRealtimeHrState(RealtimeHrState.STOP) : this.a.k(HeartRateControl.Mode.Continuous.INSTANCE, HeartRateControl.Operation.Close.INSTANCE);
        this.h = false;
        this.d.removeMessages(0);
        if (this.c != null) {
            this.a.deInitZeppOs();
        } else {
            this.a.deInit();
        }
        this.c = null;
        this.a.j();
        Debug.fi(i, "stopRealtimeMeasure out");
        return zSendRealtimeHrState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Handler handler;
        OpenAppModule openAppModule = this.c;
        Debug.fi(i, "watchDog ret:" + (openAppModule != null ? openAppModule.sendRealtimeHrState(RealtimeHrState.KEEP) : this.a.f()));
        if (!this.h || (handler = this.d) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 10000L);
    }

    public void disconnect() {
        this.h = false;
        this.d.removeCallbacksAndMessages(null);
        stopManualMeasure();
    }

    @WorkerThread
    public Boolean enableAbnormalHRWarning(Request.Command command, HeartRateControl.Operation operation) {
        if (!this.a.init()) {
            return null;
        }
        boolean zE = this.a.e(command, operation);
        this.a.deInit();
        return Boolean.valueOf(zE);
    }

    public synchronized boolean enableAtrialFib(boolean enable) {
        if (!this.a.init()) {
            Debug.fi(i, "profile init failed!!!");
            return false;
        }
        boolean zK = this.a.k(HeartRateControl.Mode.AtrialFib.INSTANCE, enable ? HeartRateControl.Operation.Open.INSTANCE : HeartRateControl.Operation.Close.INSTANCE);
        Debug.fi(i, "atrial op ret :" + zK);
        this.a.deInit();
        return zK;
    }

    public synchronized boolean enableFull(boolean enable, int interval) {
        HeartRateControl.Mode.Sleep sleep;
        HeartRateControl.Operation.Close close;
        sleep = HeartRateControl.Mode.Sleep.INSTANCE;
        close = HeartRateControl.Operation.Close.INSTANCE;
        if (!enable) {
            interval = 0;
        }
        return i(sleep, close, interval);
    }

    public synchronized boolean enableHeartRate(boolean enable, int interval) {
        HeartRateControl.Mode.Sleep sleep;
        HeartRateControl.Operation operation;
        sleep = HeartRateControl.Mode.Sleep.INSTANCE;
        operation = enable ? HeartRateControl.Operation.Open.INSTANCE : HeartRateControl.Operation.Close.INSTANCE;
        if (!enable) {
            interval = 0;
        }
        return i(sleep, operation, interval);
    }

    public synchronized boolean enableSleepAssist(boolean enable) {
        return i(HeartRateControl.Mode.Sleep.INSTANCE, enable ? HeartRateControl.Operation.Open.INSTANCE : HeartRateControl.Operation.Close.INSTANCE, 0);
    }

    public synchronized HeartRateConfig getHeartRateConfig() {
        if (!this.a.init()) {
            return null;
        }
        HeartRateConfig heartRateConfigG = this.a.g();
        this.a.deInit();
        return heartRateConfigG;
    }

    public synchronized boolean setHrInterval(int interval) {
        if (!this.a.init()) {
            return false;
        }
        boolean zL = this.a.l(interval);
        Debug.fi(i, "setRealtimeHeartRateInterval:" + interval + ",ret:" + zL);
        this.a.deInit();
        return zL;
    }

    public synchronized boolean startManualMeasure(final IHeartRateCallback callback) {
        Debug.fi(i, "in startManualMeasure");
        this.e = new ConditionVariable();
        this.f = false;
        this.g = false;
        if (!this.a.init()) {
            callback.onOpen(false);
            return false;
        }
        HMHeartRateProfile hMHeartRateProfile = this.a;
        HeartRateControl.Mode.Manual manual = HeartRateControl.Mode.Manual.INSTANCE;
        if (!hMHeartRateProfile.k(manual, HeartRateControl.Operation.Open.INSTANCE)) {
            this.a.deInit();
            callback.onOpen(false);
            return false;
        }
        callback.onOpen(true);
        this.a.c(new HMHeartRateProfile.IHeartRateChangedCallback() { // from class: vz2
            @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateProfile.IHeartRateChangedCallback
            public final void onHeartRateChanged(int i2) {
                this.a.g(callback, i2);
            }
        });
        this.e.block(20000L);
        this.a.j();
        if (!this.f) {
            this.a.k(manual, HeartRateControl.Operation.Close.INSTANCE);
        }
        this.a.deInit();
        if (!this.f && !this.g) {
            callback.onHeartRateChanged(-1);
        }
        Debug.fi(i, "out startManualMeasure");
        return true;
    }

    public void startRealtimeMeasureAsync(IHeartRateCallback callback) {
        this.d.removeMessages(1);
        this.d.removeMessages(2);
        Message message = new Message();
        message.what = 1;
        message.obj = callback;
        this.d.sendMessage(message);
    }

    public boolean startRealtimeMeasureSync(HMHeartRateProfile.IHeartRateChangedCallback callback) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        startRealtimeMeasureAsync(new b(callback, zArr, countDownLatch));
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Debug.fi(i, "startRealtimeMeasureSync e: " + e);
        }
        return zArr[0];
    }

    public boolean stopManualMeasure() {
        Debug.fi(i, "stopManualMeasure");
        this.g = true;
        ConditionVariable conditionVariable = this.e;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
        return true;
    }

    public void stopRealtimeMeasureAsync() {
        this.d.removeMessages(1);
        this.d.removeMessages(2);
        this.d.sendEmptyMessage(2);
    }

    public HMHeartRateController(GattPeripheral gattPeripheral) {
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = false;
        this.a = new HMHeartRateProfile(gattPeripheral);
        f();
    }

    public HMHeartRateController(GattPeripheral gattPeripheral, HMBaseDevice device) {
        this(gattPeripheral);
        this.b = device;
    }
}
