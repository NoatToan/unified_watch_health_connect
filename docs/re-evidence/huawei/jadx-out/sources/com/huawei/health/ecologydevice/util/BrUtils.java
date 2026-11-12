package com.huawei.health.ecologydevice.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class BrUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6665b = false;

    public interface OnBrBondListener {
        void onBondError(int i);

        void onBondSuccess(BluetoothDevice bluetoothDevice);
    }

    public interface OnBrDiscoverListener {
        boolean onDiscoverResult(BluetoothDevice bluetoothDevice);

        void onDiscoverUnResult();
    }

    public interface OnBrOpenListener {
        void onStateError();

        void onStateOff();

        void onStateOn();
    }

    /* JADX INFO: loaded from: classes27.dex */
    public interface OnConnectListener {
        void onConnectFailure(String str);

        void onConnectSuccess(BluetoothSocket bluetoothSocket);
    }

    public interface OnSendDataListener {
        void onCommandFailure(String str);

        boolean onCommandSuccess(byte[] bArr, int i);
    }

    public boolean b() {
        return BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    public boolean a(OnBrOpenListener onBrOpenListener) {
        b(onBrOpenListener);
        try {
            return BluetoothAdapter.getDefaultAdapter().enable();
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "judgeBluetoothEnable SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    public Set<BluetoothDevice> e() {
        HashSet hashSet = new HashSet(Arrays.asList(new BluetoothDevice[0]));
        try {
            return BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "getBondedDevices SecurityException:", ExceptionUtils.c(e2));
            return hashSet;
        }
    }

    public BluetoothDevice b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : e()) {
            if (str.equals(bluetoothDevice.getAddress())) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    public BluetoothDevice e(String str) {
        return BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
    }

    public boolean c(String str) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return false;
        }
        BluetoothDevice bluetoothDeviceE = e(str);
        try {
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("isConnected", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(bluetoothDeviceE, new Object[0]);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            LogUtil.e("BrUtils", "isConnectDevice Exception:", e2.getMessage());
        }
        return false;
    }

    public boolean a(OnBrDiscoverListener onBrDiscoverListener) {
        b(onBrDiscoverListener);
        a();
        try {
            return BluetoothAdapter.getDefaultAdapter().startDiscovery();
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "discoverBr SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    public void a() {
        try {
            if (BluetoothAdapter.getDefaultAdapter().isDiscovering()) {
                BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
            }
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "closeBrDiscover SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public boolean e(BluetoothDevice bluetoothDevice, OnBrBondListener onBrBondListener) {
        if (bluetoothDevice == null) {
            LogUtil.j("BrUtils", "BluetoothDevice is null.");
            onBrBondListener.onBondError(-1);
            return false;
        }
        a(onBrBondListener);
        try {
            return bluetoothDevice.createBond();
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "brBond SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.util.BrUtils$4, reason: invalid class name */
    class AnonymousClass4 extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnSendDataListener f6666a;
        final /* synthetic */ BrUtils d;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 2) {
                if (i == 3) {
                    String str = (String) message.obj;
                    LogUtil.e("BrUtils", "Receiver Exception:", str);
                    this.f6666a.onCommandFailure(str);
                    return;
                }
                LogUtil.e("BrUtils", "Unknown Exception:", Integer.valueOf(message.what));
                return;
            }
            int i2 = message.arg1;
            byte[] byteArray = message.getData().getByteArray("0x02");
            if (!this.d.f6665b) {
                this.d.f6665b = this.f6666a.onCommandSuccess(byteArray, i2);
            }
            LogUtil.a("BrUtils", "mDataCorrect:", Boolean.valueOf(this.d.f6665b));
        }
    }

    private void b(OnBrOpenListener onBrOpenListener) {
        d dVar = new d(this, null);
        dVar.a(onBrOpenListener);
        BaseApplication.getContext().registerReceiver(dVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar) {
        LogUtil.d("BrUtils", "unregisterBrOpenReceiver");
        BaseApplication.getContext().unregisterReceiver(dVar);
    }

    class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnBrOpenListener f6670a;

        private d() {
        }

        /* synthetic */ d(BrUtils brUtils, AnonymousClass4 anonymousClass4) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                    case 10:
                        LogUtil.d("BrUtils", "Bluetooth state Off");
                        this.f6670a.onStateOff();
                        BrUtils.this.b(this);
                        break;
                    case 11:
                        LogUtil.d("BrUtils", "Bluetooth state Turning On");
                        break;
                    case 12:
                        LogUtil.d("BrUtils", "Bluetooth state On");
                        this.f6670a.onStateOn();
                        BrUtils.this.b(this);
                        break;
                    case 13:
                        LogUtil.d("BrUtils", "Bluetooth state Turning Off");
                        break;
                    default:
                        LogUtil.d("BrUtils", "Bluetooth state Error");
                        this.f6670a.onStateError();
                        BrUtils.this.b(this);
                        break;
                }
            }
        }

        public void a(OnBrOpenListener onBrOpenListener) {
            this.f6670a = onBrOpenListener;
        }
    }

    private void b(OnBrDiscoverListener onBrDiscoverListener) {
        e eVar = new e();
        eVar.b(onBrDiscoverListener);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            BaseApplication.getContext().registerReceiver(eVar, intentFilter);
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "registerBrFoundReceiver SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(e eVar) {
        LogUtil.d("BrUtils", "unregisterBrFoundReceiver");
        BaseApplication.getContext().unregisterReceiver(eVar);
    }

    public class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnBrDiscoverListener f6672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f6673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f6674c;
        private boolean e = false;

        e() {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f6673b = handler;
            Runnable runnable = new Runnable() { // from class: esl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33416b.e();
                }
            };
            this.f6674c = runnable;
            handler.postDelayed(runnable, 8000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            this.f6673b.removeCallbacks(this.f6674c);
            BrUtils.this.a();
            BrUtils.this.d(this);
            if (this.e) {
                return;
            }
            this.f6672a.onDiscoverUnResult();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                LogUtil.d("BrUtils", "Finished Found.");
                e();
            } else if (action.equals("android.bluetooth.device.action.FOUND")) {
                boolean zOnDiscoverResult = this.f6672a.onDiscoverResult((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
                this.e = zOnDiscoverResult;
                if (zOnDiscoverResult) {
                    e();
                }
            }
        }

        public void b(OnBrDiscoverListener onBrDiscoverListener) {
            this.f6672a = onBrDiscoverListener;
        }
    }

    private void a(OnBrBondListener onBrBondListener) {
        a aVar = new a();
        aVar.c(onBrBondListener);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            BaseApplication.getContext().registerReceiver(aVar, intentFilter);
        } catch (SecurityException e2) {
            LogUtil.e("BrUtils", "registerBrBondReceiver SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(a aVar) {
        LogUtil.d("BrUtils", "unregisterBrBondReceiver");
        BaseApplication.getContext().unregisterReceiver(aVar);
    }

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f6667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f6668b;
        private boolean d = false;
        private OnBrBondListener e;

        a() {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f6667a = handler;
            Runnable runnable = new Runnable() { // from class: esm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33417b.d();
                }
            };
            this.f6668b = runnable;
            handler.postDelayed(runnable, 12000L);
        }

        public /* synthetic */ void d() {
            this.d = true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            int bondState;
            try {
                if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction()) || (bondState = (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).getBondState()) == 11) {
                    return;
                }
                if (bondState != 12) {
                    BrUtils.this.d(this);
                    this.f6667a.removeCallbacks(this.f6668b);
                    if (this.d) {
                        this.e.onBondError(12000);
                        return;
                    } else {
                        this.e.onBondError(bluetoothDevice.getBondState());
                        return;
                    }
                }
                BrUtils.this.d(this);
                this.f6667a.removeCallbacks(this.f6668b);
                this.e.onBondSuccess(bluetoothDevice);
            } catch (SecurityException e) {
                LogUtil.e("BrUtils", "onReceive SecurityException:", ExceptionUtils.c(e));
            }
        }

        public void c(OnBrBondListener onBrBondListener) {
            this.e = onBrBondListener;
        }
    }
}
