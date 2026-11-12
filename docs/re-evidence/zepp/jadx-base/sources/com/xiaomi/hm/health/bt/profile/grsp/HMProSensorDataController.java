package com.xiaomi.hm.health.bt.profile.grsp;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.generic.GenericController;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;

/* JADX INFO: loaded from: classes18.dex */
public class HMProSensorDataController implements HMProSensorDataProfile.ISensorDataListener {
    private static final String f = "HMProSensorDataController";
    private static final int g = 25;
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 3;
    private static final int l = 4;
    private static final int m = 50000;
    private HMProSensorDataProfile a;
    private Handler b;
    private IHMSensorDataCallback c;
    private HeartRateController d;
    private boolean e;

    public interface HeartRateController {
        void startRealtimeHr();

        void stopRealtimeHr();
    }

    public class a implements HeartRateController {
        private HMHeartRateController a;
        private volatile boolean b = false;
        public final /* synthetic */ GattPeripheral c;
        public final /* synthetic */ HMBaseDevice d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController$a$a, reason: collision with other inner class name */
        public class C0792a implements HMHeartRateController.IHeartRateCallback {
            public final /* synthetic */ ConditionVariable a;

            public C0792a(final ConditionVariable val$lock) {
                this.a = val$lock;
            }

            @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
            public void onHeartRateChanged(int hr) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
            public void onOpen(boolean result) {
                a.this.b = result;
                this.a.open();
            }
        }

        public a(final GattPeripheral val$gattPeripheral, final HMBaseDevice val$device) {
            this.c = val$gattPeripheral;
            this.d = val$device;
            this.a = new HMHeartRateController(val$gattPeripheral, val$device);
        }

        @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController.HeartRateController
        public void startRealtimeHr() {
            if (this.b) {
                return;
            }
            ConditionVariable conditionVariable = new ConditionVariable();
            this.a.startRealtimeMeasureAsync(new C0792a(conditionVariable));
            conditionVariable.block();
        }

        @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController.HeartRateController
        public void stopRealtimeHr() {
            if (this.b) {
                this.b = false;
                this.a.stopRealtimeMeasureAsync();
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                Debug.i(HMProSensorDataController.f, "MSG_WATCHDOG");
                HMProSensorDataController.this.g();
                return;
            }
            if (i == 1) {
                HMProSensorDataController.this.sendSensorData((SensorDataFragment) msg.obj);
                return;
            }
            if (i == 2) {
                c cVar = (c) msg.obj;
                HMProSensorDataController.this.f(cVar.b, cVar.c, cVar.a);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                HMProSensorDataController.this.c.onSensorOriginData((byte[]) msg.obj);
            } else if (HMProSensorDataController.this.e) {
                HMProSensorDataController.this.e = false;
                CheckData checkDataStop = HMProSensorDataController.this.stop();
                if (HMProSensorDataController.this.c == null) {
                    return;
                }
                if (HMProSensorDataController.this.c instanceof SensorCheckCallback) {
                    ((SensorCheckCallback) HMProSensorDataController.this.c).onSensorStop(checkDataStop);
                } else {
                    HMProSensorDataController.this.c.onSensorStop(true);
                }
            }
        }
    }

    public static class c {
        public IHMSensorDataCallback a;
        public int b;
        public int c;

        public c(IHMSensorDataCallback callback, int type, int hz) {
            this.a = callback;
            this.b = type;
            this.c = hz;
        }
    }

    public HMProSensorDataController(@NonNull GattPeripheral gattPeripheral, HMBaseDevice device) {
        this(newHeartRateController(gattPeripheral, device), gattPeripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int type, int hz, IHMSensorDataCallback callback) {
        this.c = callback;
        callback.onSensorStart();
        Debug.fi(f, "in start...");
        if (!this.a.init()) {
            Debug.fi(f, "init profile failed!!!");
            this.c.onSensorStop(false);
            return;
        }
        if (!this.a.config(type, (byte) hz)) {
            Debug.fi(f, "config profile failed!!!");
            this.c.onSensorStop(false);
            return;
        }
        if ((type & SensorType.PPG.getValue()) != 0) {
            this.d.startRealtimeHr();
        }
        if (!this.a.start(this)) {
            Debug.fi(f, "start profile failed!!!");
            this.c.onSensorStop(false);
        } else {
            this.e = true;
            this.b.removeMessages(0);
            this.b.sendEmptyMessageDelayed(0, 50000L);
            Debug.fi(f, "out start...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Debug.i(f, "watchDog");
        if (!this.a.O()) {
            Debug.fi(f, "watchDog failed!!!");
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(0, 50000L);
        }
    }

    public static HeartRateController newHeartRateController(GattPeripheral gattPeripheral, HMBaseDevice device) {
        return new a(gattPeripheral, device);
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataProfile.ISensorDataListener
    public boolean ignoreLostData() {
        IHMSensorDataCallback iHMSensorDataCallback = this.c;
        if (iHMSensorDataCallback instanceof SensorCheckCallback) {
            return ((SensorCheckCallback) iHMSensorDataCallback).ignoreLostData();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataProfile.ISensorDataListener
    public void onOriginData(byte[] data) {
        if (this.b == null) {
            Debug.fi(f, "onOriginData handler is null...");
            return;
        }
        Message message = new Message();
        message.what = 4;
        message.obj = data;
        this.b.sendMessage(message);
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataProfile.ISensorDataListener
    public void onSensorData(SensorDataFragment fragment) {
        if (this.b == null) {
            Debug.fi(f, "onECGSensorData handler is null...");
            return;
        }
        Message message = new Message();
        message.what = 1;
        message.obj = fragment;
        this.b.sendMessage(message);
    }

    public void sendSensorData(SensorDataFragment sensorData) {
        this.c.onSensorData(sensorData);
    }

    public synchronized void startAsync(int type, IHMSensorDataCallback callback) {
        this.b.removeCallbacksAndMessages(null);
        Message message = new Message();
        message.what = 2;
        message.obj = new c(callback, type, 25);
        this.b.sendMessage(message);
    }

    public CheckData stop() {
        Debug.fi(f, "in stop...");
        this.d.stopRealtimeHr();
        CheckData checkDataStop = this.a.stop();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Debug.fi(f, "out stop...");
        return checkDataStop;
    }

    public synchronized void stopAsync() {
        this.b.removeCallbacksAndMessages(null);
        this.b.sendEmptyMessage(3);
    }

    public HMProSensorDataController(@NonNull GattPeripheral gattPeripheral) {
        this(gattPeripheral, (HMBaseDevice) null);
    }

    private HMProSensorDataController(@NonNull HeartRateController hrController, @NonNull GattPeripheral gattPeripheral) {
        this(hrController, new HMProSensorDataProfile(gattPeripheral));
    }

    public HMProSensorDataController(@NonNull HeartRateController hrController, @NonNull GenericController genericController, @NonNull BluetoothCharacteristic control, BluetoothCharacteristic data) {
        this(hrController, new HMProSensorDataProfile(control, data, genericController));
    }

    public HMProSensorDataController(@NonNull HeartRateController hrController, @NonNull HMProSensorDataProfile profile) {
        this.c = null;
        this.e = false;
        this.d = hrController;
        this.a = profile;
        HandlerThread handlerThread = new HandlerThread(f);
        handlerThread.start();
        this.b = new b(handlerThread.getLooper());
    }
}
