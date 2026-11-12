package com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eel;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ScoUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ScoUtils f17511a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17512c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothDevice f17513b;
    private AudioManager e;
    private b f;
    private BluetoothHeadset g;
    private Context j;
    private OnScoConnectListener i = null;
    private boolean h = false;
    private int l = 0;
    private BluetoothProfile.ServiceListener d = new BluetoothProfile.ServiceListener() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.ScoUtils.2
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            LogUtil.a("HwVoiceKitManager_ScoUtils", "onServiceDisconnected:", Integer.valueOf(i));
            if (i == 1) {
                if (ScoUtils.this.g != null) {
                    try {
                        ScoUtils.this.g.stopVoiceRecognition(ScoUtils.this.f17513b);
                    } catch (SecurityException e) {
                        LogUtil.e("HwVoiceKitManager_ScoUtils", "onServiceDisconnected SecurityException:", ExceptionUtils.c(e));
                    }
                }
                ScoUtils.this.g = null;
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            LogUtil.a("HwVoiceKitManager_ScoUtils", "onServiceConnected:", Integer.valueOf(i));
            if (i == 1) {
                if (bluetoothProfile instanceof BluetoothHeadset) {
                    try {
                        ScoUtils.this.g = (BluetoothHeadset) bluetoothProfile;
                        DeviceInfo deviceInfo = null;
                        ScoUtils.this.f17513b = null;
                        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwVoiceKitManager_ScoUtils");
                        if (deviceList.size() > 0) {
                            for (DeviceInfo deviceInfo2 : deviceList) {
                                if (!eel.d(deviceInfo2.getProductType())) {
                                    deviceInfo = deviceInfo2;
                                    break;
                                }
                            }
                        }
                        if (deviceInfo != null) {
                            List<BluetoothDevice> connectedDevices = ScoUtils.this.g.getConnectedDevices();
                            if (connectedDevices != null && !connectedDevices.isEmpty()) {
                                LogUtil.a("HwVoiceKitManager_ScoUtils", "getConnectedDevices size:", Integer.valueOf(ScoUtils.this.g.getConnectedDevices().size()));
                                for (BluetoothDevice bluetoothDevice : connectedDevices) {
                                    if (bluetoothDevice.getAddress().equals(deviceInfo.getDeviceIdentify())) {
                                        ScoUtils.this.f17513b = bluetoothDevice;
                                    }
                                }
                                if (ScoUtils.this.f17513b != null) {
                                    ScoUtils.this.j();
                                    return;
                                } else {
                                    LogUtil.j("HwVoiceKitManager_ScoUtils", "onServiceConnected mBluetoothDevice is null");
                                    return;
                                }
                            }
                            LogUtil.j("HwVoiceKitManager_ScoUtils", "onServiceConnected connectedDeviceList is null or isEmpty");
                            return;
                        }
                        LogUtil.a("HwVoiceKitManager_ScoUtils", "onServiceConnected deviceInfo is null");
                        return;
                    } catch (SecurityException e) {
                        LogUtil.e("HwVoiceKitManager_ScoUtils", "onServiceConnected SecurityException:", ExceptionUtils.c(e));
                        return;
                    }
                }
                LogUtil.j("HwVoiceKitManager_ScoUtils", "onServiceConnected proxy not instanceof BluetoothHeadset");
            }
        }
    };
    private BroadcastReceiver n = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.ScoUtils.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("HwVoiceKitManager_ScoUtils", "onReceive intent is null");
                return;
            }
            if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                LogUtil.a("HwVoiceKitManager_ScoUtils", "onReceive state:", Integer.valueOf(intExtra));
                ScoUtils.this.l = intExtra;
                if (intExtra == 12) {
                    ScoUtils.this.f.removeMessages(1);
                    if (ScoUtils.this.i != null) {
                        ScoUtils.this.i.onConnectSuccess();
                        ScoUtils.this.e.adjustStreamVolume(3, -100, 0);
                        return;
                    }
                    return;
                }
                if (intExtra == 10) {
                    if (ScoUtils.this.i != null) {
                        ScoUtils.this.i.onConnectClose();
                        return;
                    }
                    return;
                }
                LogUtil.j("HwVoiceKitManager_ScoUtils", "scoReceiver other state");
            }
        }
    };

    public interface OnScoConnectListener {
        void connectTimeout();

        void onConnectClose();

        void onConnectSuccess();
    }

    private ScoUtils(Context context) {
        this.j = context;
        Object systemService = context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            this.e = (AudioManager) systemService;
        }
        HandlerThread handlerThread = new HandlerThread("HwVoiceKitManager_ScoUtils");
        handlerThread.start();
        this.f = new b(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            Method method = Class.forName("android.bluetooth.BluetoothHeadset").getMethod("setActiveDevice", BluetoothDevice.class);
            method.invoke(this.g, this.f17513b);
            LogUtil.a("HwVoiceKitManager_ScoUtils", "method: ", method);
            i();
            this.f.sendEmptyMessageDelayed(2, 200L);
        } catch (ClassNotFoundException unused) {
            LogUtil.e("HwVoiceKitManager_ScoUtils", "onServiceConnected ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            LogUtil.e("HwVoiceKitManager_ScoUtils", "onServiceConnected IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            LogUtil.e("HwVoiceKitManager_ScoUtils", "onServiceConnected NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            LogUtil.e("HwVoiceKitManager_ScoUtils", "onServiceConnected InvocationTargetException");
        }
    }

    public static ScoUtils d(Context context) {
        ScoUtils scoUtils;
        synchronized (f17512c) {
            if (f17511a == null) {
                f17511a = new ScoUtils(context);
            }
            scoUtils = f17511a;
        }
        return scoUtils;
    }

    private void b() {
        LogUtil.a("HwVoiceKitManager_ScoUtils", "initBlueToothHeadset");
        Object systemService = this.j.getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            ((BluetoothManager) systemService).getAdapter().getProfileProxy(this.j, this.d, 1);
        } else {
            LogUtil.j("HwVoiceKitManager_ScoUtils", "service is null");
        }
    }

    private void i() {
        LogUtil.a("HwVoiceKitManager_ScoUtils", "registerReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        if (this.h) {
            return;
        }
        BroadcastManagerUtil.a(this.j, this.n, intentFilter);
        this.h = true;
    }

    public void c() {
        if (!this.e.isBluetoothScoAvailableOffCall() && CommonUtil.bg()) {
            LogUtil.j("HwVoiceKitManager_ScoUtils", "system not support audio");
            return;
        }
        if (e()) {
            LogUtil.a("HwVoiceKitManager_ScoUtils", "openSco isScoOn is true");
            a();
        }
        if (this.e.getMode() == 2 || this.e.getMode() == 3) {
            LogUtil.j("HwVoiceKitManager_ScoUtils", "telephone is in call");
            return;
        }
        ReleaseLogUtil.d("R_HwVoiceKitManager_ScoUtils", "openSco");
        this.e.setMode(2);
        b();
        this.f.sendEmptyMessageDelayed(1, 10000L);
    }

    public void a(OnScoConnectListener onScoConnectListener) {
        if (onScoConnectListener != null) {
            this.i = onScoConnectListener;
        }
    }

    public void a() {
        BluetoothDevice bluetoothDevice;
        LogUtil.a("HwVoiceKitManager_ScoUtils", "closeSco mIsRegister: ", Boolean.valueOf(this.h));
        this.f.removeMessages(1);
        if (this.h) {
            this.h = false;
            try {
                this.j.unregisterReceiver(this.n);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("HwVoiceKitManager_ScoUtils", "closeSco IllegalArgumentException");
            }
        }
        try {
            this.e.setMode(0);
            this.e.adjustStreamVolume(3, 100, 0);
            BluetoothHeadset bluetoothHeadset = this.g;
            if (bluetoothHeadset != null && (bluetoothDevice = this.f17513b) != null) {
                bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
                LogUtil.a("HwVoiceKitManager_ScoUtils", "closeSco stopVoiceRecognition");
            }
            this.l = 0;
            ReleaseLogUtil.d("R_HwVoiceKitManager_ScoUtils", "closeSco: isBluetoothScoOn:", Boolean.valueOf(this.e.isBluetoothScoOn()));
        } catch (SecurityException e) {
            LogUtil.e("HwVoiceKitManager_ScoUtils", "closeSco SecurityException:", ExceptionUtils.c(e));
        }
    }

    public boolean e() {
        return this.e.isBluetoothScoOn();
    }

    public int d() {
        return this.l;
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("HwVoiceKitManager_ScoUtils", "handleMessage msg is null");
                return;
            }
            super.handleMessage(message);
            try {
                int i = message.what;
                if (i == 1) {
                    LogUtil.a("HwVoiceKitManager_ScoUtils", "handleMessage:", Boolean.valueOf(ScoUtils.this.e.isBluetoothScoOn()));
                    if (ScoUtils.this.i != null) {
                        ScoUtils.this.i.connectTimeout();
                    }
                    ScoUtils.this.a();
                    return;
                }
                if (i == 2) {
                    if (ScoUtils.this.g != null && ScoUtils.this.f17513b != null) {
                        if (ScoUtils.this.e != null) {
                            ScoUtils.this.e.setSpeakerphoneOn(false);
                        }
                        if (ScoUtils.this.g != null) {
                            ScoUtils.this.g.startVoiceRecognition(ScoUtils.this.f17513b);
                            LogUtil.a("HwVoiceKitManager_ScoUtils", "startVoiceRecognition");
                            return;
                        }
                        return;
                    }
                    LogUtil.j("HwVoiceKitManager_ScoUtils", "handleMessage START_SCO_WHAT is null");
                    return;
                }
                LogUtil.j("HwVoiceKitManager_ScoUtils", "handleMessage default");
            } catch (SecurityException e) {
                LogUtil.e("HwVoiceKitManager_ScoUtils", "handleMessage SecurityException:", ExceptionUtils.c(e));
            }
        }
    }
}
