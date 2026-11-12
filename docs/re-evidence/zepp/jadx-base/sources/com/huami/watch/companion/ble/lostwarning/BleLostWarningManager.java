package com.huami.watch.companion.ble.lostwarning;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ble.lostwarning.BleLostWarningManager;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.settings.WatchSettings;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class BleLostWarningManager {
    private static final boolean h = true;
    private static final String i = "BleLostWarningManager";
    private static BleLostWarningManager j = null;
    private static final int k = 30000;
    private static final int l = 104;
    private static final int m = 105;
    private static final int n = 106;
    private static final int o = 107;
    private static final int p = 108;
    private Context a;
    private HandlerThread b;
    private c c;
    private Disposable d;
    private com.huami.watch.companion.ble.lostwarning.a e;
    private boolean f = false;
    private Transporter g;

    public class a implements Consumer<Object> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            if (obj instanceof DisconnectedEvent) {
                if (DeviceManager.getManager(BleLostWarningManager.this.a).getCurrentDevice() == null) {
                    return;
                }
                BleLostWarningManager.this.c.sendEmptyMessage(106);
            } else if (obj instanceof ConnectedEvent) {
                BleLostWarningManager.this.c.sendEmptyMessage(105);
            } else if (obj instanceof DeviceUnboundEvent) {
                BleLostWarningManager.this.c.sendEmptyMessage(107);
            }
        }
    }

    public class b implements Transporter.ChannelListener {
        public b() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            if (z) {
                Log.d(BleLostWarningManager.i, "  Enable lost warning feature support to watch.", new Object[0]);
                SyncUtil.syncUserSettingToWatch(BleLostWarningManager.this.g, UserSettingsKeys.KEY_PHONE_SUPPORT_LOST_WARNING, Boolean.TRUE, (Transporter.DataSendResultCallback) null);
            }
        }
    }

    public class c extends Handler {
        private c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 105:
                    BleLostWarningManager.this.r();
                    break;
                case 106:
                    BleLostWarningManager.this.s();
                    break;
                case 107:
                    BleLostWarningManager.this.t();
                    break;
                case 108:
                    Log.d(BleLostWarningManager.i, "  CMD_ON_SETTING_CHANGED " + message.obj, new Object[0]);
                    boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                    if (BleLostWarningManager.this.f != zBooleanValue) {
                        BleLostWarningManager.this.f = zBooleanValue;
                        if (!BleLostWarningManager.this.f) {
                            Log.d(BleLostWarningManager.i, "  isLostWarningEnable false", new Object[0]);
                            BleLostWarningManager.this.v();
                        } else {
                            Log.d(BleLostWarningManager.i, "  isLostWarningEnable true", new Object[0]);
                            BleLostWarningManager.this.u();
                        }
                    }
                    break;
            }
        }
    }

    private BleLostWarningManager(Context context) {
        Log.d(i, "BleLostWarningManager 20180105", new Object[0]);
        this.a = context;
        HandlerThread handlerThread = new HandlerThread(i);
        this.b = handlerThread;
        handlerThread.start();
        this.c = new c(this.b.getLooper());
        checkDeviceState();
        m();
        n();
    }

    public static BleLostWarningManager get() {
        return j;
    }

    public static void init(Context context) {
        if (j == null) {
            j = new BleLostWarningManager(context);
        }
    }

    private void m() {
        this.d = RxBus.get().toObservable().subscribe(new a(), new Consumer() { // from class: py
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BleLostWarningManager.q((Throwable) obj);
            }
        });
    }

    private void n() {
        Transporter transporter = Transporter.get(this.a, "com.huami.watch.companion");
        this.g = transporter;
        transporter.connectTransportService();
        this.g.addChannelListener(new b());
    }

    private boolean o() {
        return "1".equals(WatchSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_WATCH_LOST_WARNING_ANTI_LOST)) || "1".equals(WatchSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_WATCH_LOST_WARNING_FAR_AWAY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Throwable th) throws Exception {
        HMLog.warn(i, th, new Function0() { // from class: qy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BleLostWarningManager.p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Log.d(i, "onDeviceConnected: ", new Object[0]);
        boolean zO = o();
        this.f = zO;
        if (zO) {
            Log.d(i, "  isLostWarningEnable true", new Object[0]);
            u();
        } else {
            Log.d(i, "  isLostWarningEnable false", new Object[0]);
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        Log.d(i, "onDeviceDisconnected", new Object[0]);
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Log.d(i, "onDeviceUnbound", new Object[0]);
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        Log.d(i, "startLostWarning", new Object[0]);
        com.huami.watch.companion.ble.lostwarning.a aVar = this.e;
        if (aVar != null) {
            aVar.k();
            this.e = null;
        }
        this.e = new com.huami.watch.companion.ble.lostwarning.a(this.a);
        Device currentDevice = DeviceManager.getManager(this.a).getCurrentDevice();
        if (currentDevice == null) {
            Toast.makeText(this.a, "No device bound.", 0).show();
            return;
        }
        if (!currentDevice.isConnected()) {
            Toast.makeText(this.a, "No device connected.", 0).show();
            return;
        }
        String strAddress = currentDevice.address();
        Log.d(i, "  current watch " + strAddress, new Object[0]);
        this.e.m(30000, strAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Log.d(i, "stopLostWarning", new Object[0]);
        com.huami.watch.companion.ble.lostwarning.a aVar = this.e;
        if (aVar != null) {
            aVar.k();
            this.e = null;
        }
    }

    public void checkDeviceState() {
        Device currentDevice = DeviceManager.getManager(this.a).getCurrentDevice();
        if (currentDevice == null) {
            this.c.sendEmptyMessage(107);
        } else if (currentDevice.isConnected()) {
            this.c.sendEmptyMessage(105);
        } else {
            this.c.sendEmptyMessage(106);
        }
    }

    public void onSettingsChanged(String str, String str2) throws Throwable {
        Log.d(i, "onSettingsChanged input: lost:" + str + " faraway:" + str2, new Object[0]);
        if (str == null) {
            str = WatchSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_WATCH_LOST_WARNING_ANTI_LOST);
        }
        if (str2 == null) {
            str2 = WatchSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_WATCH_LOST_WARNING_FAR_AWAY);
        }
        boolean z = "1".equals(str) || "1".equals(str2);
        Log.d(i, "  enable:" + z + " lost:" + str + " faraway:" + str2, new Object[0]);
        this.c.obtainMessage(108, Boolean.valueOf(z)).sendToTarget();
    }
}
