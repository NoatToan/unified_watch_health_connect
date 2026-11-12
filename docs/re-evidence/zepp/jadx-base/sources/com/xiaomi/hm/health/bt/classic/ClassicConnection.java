package com.xiaomi.hm.health.bt.classic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import defpackage.fp0;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class ClassicConnection implements ITransport {
    public static final int CONNECTED = 1;
    public static final int CONNECTING = 0;
    public static final long CONNECTING_TIMEOUT = 120000;
    public static final int CONNECT_TIMEOUT = 3;
    public static final int DISCONNECTED = 2;
    private static final String n = "00001101-0000-1000-8000-00805F9B34FB";
    private static final int o = 2000;
    private BluetoothDevice f;
    private Context g;
    private BluetoothAdapter l;
    private String a = "CConn";
    private final Map<Integer, CountDownLatch> b = new ConcurrentHashMap();
    private final Map<Integer, ClassicResponse> c = new ConcurrentHashMap();
    private final HashMap<Protocol, IGattCallback.INotifyCallback> d = new HashMap<>();
    private BluetoothSocket e = null;
    private CopyOnWriteArraySet<IConnectionCallback> h = new CopyOnWriteArraySet<>();
    private boolean i = true;
    private AtomicBoolean j = new AtomicBoolean(false);
    private ExecutorService k = Executors.newSingleThreadExecutor();
    private BroadcastReceiver m = new a();

    public interface IConnectionCallback {
        void onStateChanged(int state);
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Debug.fi(ClassicConnection.this.a, "action:" + action);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                Debug.fi(ClassicConnection.this.a, "state:" + ClassicConnection.this.k(intExtra));
                if (intExtra != 10) {
                    if (intExtra == 12) {
                        if (ClassicConnection.this.j.get()) {
                            return;
                        }
                        ClassicConnection.this.connectAsync();
                        return;
                    } else if (intExtra != 13) {
                        return;
                    }
                }
                boolean z = ClassicConnection.this.j.get();
                ClassicConnection.this.disconnectAsync();
                ClassicConnection.this.j.set(z);
            }
        }
    }

    public ClassicConnection(Context context, BluetoothDevice device) {
        this.a += hashCode();
        this.g = context;
        this.f = device;
        this.l = BluetoothAdapter.getDefaultAdapter();
    }

    private void h() {
        if (this.l.isDiscovering()) {
            this.l.cancelDiscovery();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.l.isEnabled()) {
            Debug.i(this.a, "Bluetooth disabled, skip connect!");
            return;
        }
        if (isConnected()) {
            return;
        }
        try {
            o(0);
            this.e = this.f.createRfcommSocketToServiceRecord(UUID.fromString(n));
            Debug.i(this.a, "start connect");
            h();
            Debug.i(this.a, "before connect");
            this.e.connect();
            Debug.i(this.a, "after connect");
            q();
            o(1);
        } catch (Exception e) {
            Debug.fi(this.a, "bluetoothSocket connect exception:" + e.getMessage());
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.e == null) {
            return;
        }
        Debug.fi(this.a, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT);
        try {
            this.e.close();
        } catch (Exception e) {
            Debug.fi(this.a, "bluetoothSocket close exception:" + e.getMessage());
        }
        this.e = null;
        o(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k(int state) {
        if (state == Integer.MIN_VALUE) {
            return "STATE_ERROR";
        }
        switch (state) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "STATE Unknown:" + state;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        try {
            InputStream inputStream = this.e.getInputStream();
            while (!this.j.get()) {
                ClassicResponse classicResponseP = p(inputStream);
                if (classicResponseP != null) {
                    n(classicResponseP);
                }
            }
        } catch (Exception e) {
            Debug.fi(this.a, "receiveResponse exception:" + e.getMessage());
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        Debug.fi(this.a, "autoConnect: " + this.i + ", bluetoothEnable: " + GattUtils.isBluetoothEnable());
        if (this.i && GattUtils.isBluetoothEnable()) {
            t();
        } else {
            o(2);
        }
    }

    private void n(ClassicResponse response) {
        Debug.fi(this.a, "onResponse:" + response);
        synchronized (this.d) {
            IGattCallback.INotifyCallback iNotifyCallback = this.d.get(response.getProtocol());
            if (iNotifyCallback != null) {
                Debug.fi(this.a, "callback start.");
                iNotifyCallback.notify(response.a());
            }
        }
        Debug.fi(this.a, "callback finish.");
        int flag = response.getFlag();
        this.c.put(Integer.valueOf(flag), response);
        CountDownLatch countDownLatch = this.b.get(Integer.valueOf(flag));
        if (countDownLatch != null) {
            this.b.remove(Integer.valueOf(flag));
            countDownLatch.countDown();
        }
    }

    private void o(final int state) {
        Iterator<IConnectionCallback> it2 = this.h.iterator();
        while (it2.hasNext()) {
            it2.next().onStateChanged(state);
        }
    }

    @Nullable
    private ClassicResponse p(InputStream is) throws IOException {
        int i;
        byte[] bArr = new byte[10];
        int i2 = is.read(bArr, 0, 10);
        Debug.fi(this.a, "header: " + GattUtils.bytesToHexString(bArr));
        if (i2 != 10) {
            Debug.fi(this.a, "header len error: " + i2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + 10);
            return null;
        }
        int i3 = ByteUtilsKt.toInt(bArr, 2, 8);
        byte[] bArr2 = new byte[i3];
        if (i3 > 0 && (i = is.read(bArr2, 0, i3)) != i3) {
            Debug.fi(this.a, "payload len error: " + i + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i3);
            return null;
        }
        Debug.fi(this.a, "response: " + GattUtils.bytesToHexString(bArr2));
        byte[] bArr3 = new byte[4];
        int i4 = is.read(bArr3, 0, 4);
        if (i4 != 4) {
            Debug.fi(this.a, "crc len error: " + i4 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + 4);
            return null;
        }
        Debug.fi(this.a, "crc: " + GattUtils.bytesToHexString(bArr3));
        int i5 = 10 + i3;
        byte[] bArr4 = new byte[i5 + 4];
        System.arraycopy(bArr, 0, bArr4, 0, 10);
        System.arraycopy(bArr2, 0, bArr4, 10, i3);
        System.arraycopy(bArr3, 0, bArr4, i5, 4);
        Debug.fi(this.a, "data: " + GattUtils.bytesToHexString(bArr4));
        return ClassicResponse.from(bArr4);
    }

    private void q() {
        new Thread(new Runnable() { // from class: gp0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l();
            }
        }).start();
    }

    private void s() {
        this.k.execute(new Runnable() { // from class: dp0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        });
    }

    private void t() {
        Debug.fi(this.a, "retryConnect");
        j();
        try {
            if (this.j.get()) {
                return;
            }
            o(0);
            Thread.sleep(2000L);
            i();
        } catch (Exception e) {
            Debug.fi(this.a, "bluetoothSocket close exception:" + e.getMessage());
        }
    }

    private HMNotifyResponse u(ClassicCommand command, int timeout) {
        BluetoothSocket bluetoothSocket = this.e;
        if (bluetoothSocket == null || !bluetoothSocket.isConnected()) {
            Debug.fi(this.a, "no connection");
            return null;
        }
        int flag = command.getFlag();
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.b.put(Integer.valueOf(flag), countDownLatch);
            this.e.getOutputStream().write(command.getBytes());
            countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            ClassicResponse classicResponse = this.c.get(Integer.valueOf(flag));
            if (classicResponse == null || classicResponse.getDataLen() == 0) {
                return null;
            }
            this.c.remove(Integer.valueOf(flag));
            HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(classicResponse.a());
            Debug.i(this.a, "HMNotifyResponse:" + hMNotifyResponse);
            return hMNotifyResponse;
        } catch (Exception e) {
            Debug.fi(this.a, "sendCommand exception:" + e.getMessage());
            return null;
        }
    }

    public void connectAsync() {
        this.j.set(false);
        this.k.execute(new Runnable() { // from class: ep0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
    }

    public synchronized void create() {
        Debug.fi(this.a, "create");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.g.registerReceiver(this.m, intentFilter);
        connectAsync();
    }

    public synchronized void destroy() {
        Debug.fi(this.a, "destroy");
        this.i = false;
        BroadcastReceiver broadcastReceiver = this.m;
        if (broadcastReceiver != null) {
            this.g.unregisterReceiver(broadcastReceiver);
            this.m = null;
        }
        disconnectAsync();
    }

    public void disconnectAsync() {
        Debug.fi(this.a, "disconnectAsync");
        this.j.set(true);
        this.k.execute(new fp0(this));
    }

    @Override // com.xiaomi.hm.health.bt.classic.ITransport
    public BluetoothDevice getDevice() {
        return this.f;
    }

    public synchronized void invalidate() {
        Debug.fi(this.a, "invalidate");
        this.j.set(false);
        this.k.execute(new fp0(this));
    }

    public boolean isConnected() {
        BluetoothSocket bluetoothSocket = this.e;
        return bluetoothSocket != null && bluetoothSocket.isConnected();
    }

    public void r(IConnectionCallback callback) {
        this.h.remove(callback);
    }

    @Override // com.xiaomi.hm.health.bt.classic.ITransport
    @Nullable
    public byte[] read(Protocol protocol, int timeout) {
        ClassicCommand classicCommand = new ClassicCommand(protocol, null, RequestType.READ);
        Debug.fi(this.a, "read:" + classicCommand);
        HMNotifyResponse hMNotifyResponseU = u(classicCommand, timeout);
        if (hMNotifyResponseU == null) {
            return null;
        }
        return hMNotifyResponseU.getOriginResponseData();
    }

    @Override // com.xiaomi.hm.health.bt.classic.ITransport
    public boolean registerNotification(Protocol protocol, IGattCallback.INotifyCallback callback) {
        Debug.fi(this.a, "registerNotification:" + protocol);
        synchronized (this.d) {
            this.d.put(protocol, callback);
        }
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.classic.ITransport
    public boolean sendCommandNoResponse(Protocol protocol, byte[] data) {
        ClassicCommand classicCommand = new ClassicCommand(protocol, data, RequestType.WRITE_CMD);
        Debug.fi(this.a, "sendCommandNoResponse:" + classicCommand);
        BluetoothSocket bluetoothSocket = this.e;
        if (bluetoothSocket == null || !bluetoothSocket.isConnected()) {
            Debug.fi(this.a, "no connection");
            return false;
        }
        try {
            this.e.getOutputStream().write(classicCommand.getBytes());
            return true;
        } catch (Exception e) {
            Debug.fi(this.a, "sendCommand exception:" + e.getMessage());
            return false;
        }
    }

    @Override // com.xiaomi.hm.health.bt.classic.ITransport
    public HMNotifyResponse sendCommandWithResponse(Protocol protocol, byte[] data, int timeout) {
        ClassicCommand classicCommand = new ClassicCommand(protocol, data, RequestType.WRITE);
        Debug.fi(this.a, "sendCommandWithResponse:" + classicCommand);
        return u(classicCommand, timeout);
    }

    public void setAutoReConnect(boolean autoConnect) {
        this.i = autoConnect;
    }

    public void setConnectionCallback(IConnectionCallback callback) {
        this.h.add(callback);
    }

    @Override // com.xiaomi.hm.health.bt.classic.ITransport
    public boolean unregisterNotification(Protocol protocol) {
        boolean z;
        Debug.fi(this.a, "unregisterNotification:" + protocol);
        synchronized (this.d) {
            z = this.d.remove(protocol) != null;
        }
        return z;
    }
}
