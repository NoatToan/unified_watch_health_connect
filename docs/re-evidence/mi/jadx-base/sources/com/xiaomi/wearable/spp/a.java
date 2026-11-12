package com.xiaomi.wearable.spp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.xiaomi.wearable.core.CoreExtKt;
import defpackage.g7o;
import defpackage.h7o;
import defpackage.izc;
import defpackage.j7o;
import defpackage.ni4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements izc, SppVersionReader.VersionCallback {
    protected static final int SOCKET_TIMEOUT_MSG = 100119;
    private static final String TAG = "SppClient";
    private final BluetoothAdapter mAdapter;
    private final String mAddress;
    private final BluetoothDevice mBluetoothDevice;
    private g7o mConnectListener;
    c mConnectStateReceiver;
    private DataInputStream mDataInputStream;
    private DataOutputStream mDataOutputStream;
    protected Handler mMainHandler;
    private volatile boolean mReadStatus;
    private SppDataReceiver mReceiver;
    private final SppVersionReader mVersionReader;
    protected final UUID SPP_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private final List<h7o> mSppConnectStatusChangeListeners = new ArrayList(2);
    private volatile boolean isReadingVersion = false;
    private int mVersion = 0;
    private String mVersionName = "";
    protected volatile boolean isConnected = false;
    private boolean mDeviceBonding = false;
    private final BroadcastReceiver mBondStateReceiver = new C0895a();

    /* JADX INFO: renamed from: com.xiaomi.wearable.spp.a$a, reason: collision with other inner class name */
    public class C0895a extends BroadcastReceiver {
        public C0895a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                CoreExtKt.logger.i(a.TAG, "mBondStateReceiver intent = [" + bluetoothDevice + "], state = " + intExtra + ", preState = " + intExtra2 + ", mAddress = " + a.this.mAddress);
                if (bluetoothDevice == null) {
                    return;
                }
                if (!bluetoothDevice.getAddress().equals(a.this.mAddress)) {
                    if ((intExtra == 10 || intExtra == 12) && a.this.mDeviceBonding) {
                        boolean zCheckBluetoothPermission = a.this.checkBluetoothPermission();
                        CoreExtKt.logger.i(a.TAG, "onReceive() retry bond, permission" + zCheckBluetoothPermission);
                        if (zCheckBluetoothPermission) {
                            a.this.mBluetoothDevice.createBond();
                        }
                        a.this.mDeviceBonding = false;
                        return;
                    }
                    return;
                }
                if (intExtra == 12) {
                    CoreExtKt.logger.i(a.TAG, "mBondStateReceiver  BOND_BONDED");
                    a.this.unregisterBondStateReceiver();
                    a.this.connectAfterBond(bluetoothDevice);
                    a.this.mDeviceBonding = false;
                    return;
                }
                if (intExtra == 10 && intExtra2 == 11) {
                    int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.REASON", 0);
                    CoreExtKt.logger.i(a.TAG, "mBondStateReceiver  BOND_NONE reason = " + intExtra3);
                    a.this.unregisterBondStateReceiver();
                    a.this.notifyConnectFailure(2011, "bond fail reason = " + intExtra3);
                    a.this.mDeviceBonding = false;
                }
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CoreExtKt.logger.d(a.TAG, "handleMessage() called with: msg = [" + message + "]");
            if (message.what == a.SOCKET_TIMEOUT_MSG) {
                a.this.onDisconnected();
            }
        }
    }

    public class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String action = intent.getAction();
            if (action == null || (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null || !bluetoothDevice.getAddress().equals(a.this.mAddress)) {
                return;
            }
            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                CoreExtKt.logger.i(a.TAG, "spp connect = " + bluetoothDevice.getAddress());
                a.this.isConnected = true;
                return;
            }
            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                CoreExtKt.logger.i(a.TAG, "spp disconnect = " + bluetoothDevice.getAddress());
                a.this.onDisconnected();
            }
        }

        public c() {
        }
    }

    public a(String str, boolean z) {
        this.mAddress = str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mAdapter = defaultAdapter;
        this.mBluetoothDevice = defaultAdapter.getRemoteDevice(str);
        registerSppConnectReceiver();
        this.mMainHandler = new b(Looper.getMainLooper());
        this.mVersionReader = new SppVersionReader(this, this);
    }

    private boolean createDataOutputStreamIfNeed(j7o j7oVar) {
        boolean z = true;
        if (this.mDataOutputStream == null) {
            try {
                this.mDataOutputStream = getDataOutputStream();
                return true;
            } catch (Exception e) {
                z = false;
                if (j7oVar == null) {
                    return false;
                }
                if (e instanceof IOException) {
                    j7oVar.a(-1, "create dataOutputStream error:" + e.getMessage());
                } else if (e instanceof IllegalStateException) {
                    j7oVar.a(-1, "socket = null");
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyConnectFailure$2(int i, String str) {
        g7o g7oVar = this.mConnectListener;
        if (g7oVar != null) {
            g7oVar.onConnectFailure(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyConnectStateChanged$4(boolean z) {
        Iterator<h7o> it = this.mSppConnectStatusChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onConnectStatusChanged(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyConnectSuccess$3() {
        g7o g7oVar = this.mConnectListener;
        if (g7oVar != null) {
            g7oVar.onConnectSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerStatusChangeListener$0(h7o h7oVar) {
        if (this.mSppConnectStatusChangeListeners.contains(h7oVar)) {
            return;
        }
        this.mSppConnectStatusChangeListeners.add(h7oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeStatusChangeListener$1(h7o h7oVar) {
        this.mSppConnectStatusChangeListeners.remove(h7oVar);
    }

    private void notifyConnectStateChanged(final boolean z) {
        this.mMainHandler.post(new Runnable() { // from class: e7o
            @Override // java.lang.Runnable
            public final void run() {
                this.f16354a.lambda$notifyConnectStateChanged$4(z);
            }
        });
    }

    private void onDataReceived(byte[] bArr) {
        if (this.isReadingVersion) {
            this.mVersionReader.onVersionDataReceive(bArr);
            return;
        }
        SppDataReceiver sppDataReceiver = this.mReceiver;
        if (sppDataReceiver != null) {
            sppDataReceiver.onDataReceived(bArr);
        } else {
            CoreExtKt.logger.e(TAG, "error data , version are not confirm");
        }
    }

    private void performLoopRead() {
        try {
            this.mDataInputStream = getDataInputStream();
            this.mReadStatus = true;
            CoreExtKt.logger.d(TAG, "start socket loop read,thread:" + Thread.currentThread().getName());
            while (this.mReadStatus) {
                byte b2 = this.mDataInputStream.readByte();
                CoreExtKt.logger.d(TAG, "loop read firstByte:" + ((int) b2));
                int iAvailable = this.mDataInputStream.available();
                CoreExtKt.logger.d(TAG, "loop read length:" + iAvailable);
                byte[] bArr = new byte[iAvailable + 1];
                bArr[0] = b2;
                if (iAvailable > 0) {
                    this.mDataInputStream.read(bArr, 1, iAvailable);
                }
                onDataReceived(bArr);
            }
        } catch (Throwable th) {
            CoreExtKt.logger.e(TAG, "socket loop read error:" + th.getMessage());
            onDisconnected();
            th.printStackTrace();
        }
    }

    private void performSend(byte[] bArr, j7o j7oVar) {
        if (!createDataOutputStreamIfNeed(j7oVar)) {
            CoreExtKt.logger.i(TAG, "performSend() createDataOutputStreamIfNeed false");
            return;
        }
        try {
            CoreExtKt.logger.d(TAG, "socket performSend before");
            this.mDataOutputStream.write(bArr);
            this.mDataOutputStream.flush();
            CoreExtKt.logger.d(TAG, "socket performSend: after");
            if (j7oVar != null) {
                j7oVar.a(0, "");
            }
        } catch (Throwable th) {
            CoreExtKt.logger.e(TAG, "performSend error ", th);
            if (j7oVar != null) {
                j7oVar.a(-1, "socket sendData error:" + th.getMessage());
            }
        }
    }

    private void registerBondStateReceiver() {
        CoreExtKt.logger.i(TAG, "registerBondStateReceiver() called");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            com.xiaomi.wearable.CoreExtKt.context.registerReceiver(this.mBondStateReceiver, intentFilter, 2);
        } else {
            com.xiaomi.wearable.CoreExtKt.context.registerReceiver(this.mBondStateReceiver, intentFilter);
        }
    }

    private void registerSppConnectReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            c cVar = new c();
            this.mConnectStateReceiver = cVar;
            if (Build.VERSION.SDK_INT >= 33) {
                com.xiaomi.wearable.CoreExtKt.context.registerReceiver(cVar, intentFilter, 2);
            } else {
                com.xiaomi.wearable.CoreExtKt.context.registerReceiver(cVar, intentFilter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterBondStateReceiver() {
        CoreExtKt.logger.i(TAG, "unregisterBondStateReceiver() called");
        try {
            com.xiaomi.wearable.CoreExtKt.context.unregisterReceiver(this.mBondStateReceiver);
        } catch (Exception e) {
            CoreExtKt.logger.i(TAG, "unregisterBondStateReceiver() " + e.getMessage());
        }
    }

    private void unregisterSppConnectReceiver() {
        try {
            com.xiaomi.wearable.CoreExtKt.getContext().unregisterReceiver(this.mConnectStateReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkBluetoothPermission() {
        return Build.VERSION.SDK_INT < 31 || ni4.a(com.xiaomi.wearable.CoreExtKt.context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    @Override // defpackage.izc
    public void close() {
        try {
            this.mReadStatus = false;
            this.isConnected = false;
            DataOutputStream dataOutputStream = this.mDataOutputStream;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.mDataOutputStream = null;
            }
            DataInputStream dataInputStream = this.mDataInputStream;
            if (dataInputStream != null) {
                dataInputStream.close();
                this.mDataInputStream = null;
            }
            socketClose();
        } catch (Throwable th) {
            CoreExtKt.logger.i(TAG, "socket close failed,e:" + th.getMessage());
        }
    }

    @Override // defpackage.izc
    public void connect(boolean z, g7o g7oVar) {
        this.mConnectListener = g7oVar;
        CoreExtKt.logger.i(TAG, "connect() called with: mac = [" + this.mAddress + "], isConnected = " + isConnected() + ", readStatus = " + this.mReadStatus + ", forceBond = " + z);
        if (!checkBluetoothPermission()) {
            notifyConnectFailure(2013, "no permission");
            return;
        }
        if (isConnected() && this.mReadStatus) {
            notifyConnectSuccess();
            return;
        }
        close();
        if (this.mAdapter.isDiscovering()) {
            this.mAdapter.cancelDiscovery();
        }
        if (this.mBluetoothDevice.getBondState() == 12) {
            CoreExtKt.logger.i(TAG, "connect has been bonded");
            connectAfterBond(this.mBluetoothDevice);
            return;
        }
        if (!z) {
            CoreExtKt.logger.i(TAG, "no bond no connect");
            notifyConnectFailure(2011, "no bond, connect cancel");
            return;
        }
        registerBondStateReceiver();
        boolean zCreateBond = this.mBluetoothDevice.createBond();
        this.mDeviceBonding = true;
        CoreExtKt.logger.i(TAG, "connect createBond result = " + zCreateBond);
    }

    public abstract void connectAfterBond(BluetoothDevice bluetoothDevice);

    @Override // defpackage.izc
    public void destroy() {
        this.mConnectListener = null;
        unregisterBondStateReceiver();
        close();
        this.mMainHandler.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.izc
    public synchronized void disconnect() {
        close();
        notifyConnectStateChanged(false);
        unregisterSppConnectReceiver();
        unregisterBondStateReceiver();
    }

    public abstract DataInputStream getDataInputStream();

    public abstract DataOutputStream getDataOutputStream() throws IOException;

    @Override // defpackage.izc
    public int getVersion() {
        return this.mVersion;
    }

    @Override // defpackage.izc
    public String getVersionName() {
        return this.mVersionName;
    }

    public synchronized boolean isConnected() {
        return this.isConnected;
    }

    public void notifyConnectFailure(final int i, final String str) {
        this.mMainHandler.post(new Runnable() { // from class: d7o
            @Override // java.lang.Runnable
            public final void run() {
                this.f15196a.lambda$notifyConnectFailure$2(i, str);
            }
        });
    }

    public void notifyConnectSuccess() {
        CoreExtKt.logger.i(TAG, "notifyConnectSuccess: " + this.mConnectListener);
        this.mMainHandler.post(new Runnable() { // from class: b7o
            @Override // java.lang.Runnable
            public final void run() {
                this.f3898a.lambda$notifyConnectSuccess$3();
            }
        });
    }

    public void onDisconnected() {
        close();
        if (isConnected()) {
            return;
        }
        notifyConnectStateChanged(false);
    }

    public void onSocketConnectSuccess() {
        CoreExtKt.logger.i(TAG, "socket connect success");
        this.isReadingVersion = this.mVersionReader.readVersion();
        performLoopRead();
    }

    @Override // com.xiaomi.wearable.spp.SppVersionReader.VersionCallback
    public void onVersion(int i, String str) {
        this.isReadingVersion = false;
        this.mVersion = i;
        this.mVersionName = str;
        notifyConnectSuccess();
    }

    @Override // com.xiaomi.wearable.spp.SppVersionReader.VersionCallback
    public void onVersionTimeout() {
        CoreExtKt.logger.i(TAG, "onVersionTimeout() called");
        close();
        notifyConnectFailure(GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK, "readVersion timeout");
    }

    @Override // defpackage.izc
    public void registerStatusChangeListener(final h7o h7oVar) {
        this.mMainHandler.post(new Runnable() { // from class: a7o
            @Override // java.lang.Runnable
            public final void run() {
                this.f727a.lambda$registerStatusChangeListener$0(h7oVar);
            }
        });
    }

    @Override // defpackage.izc
    public synchronized void removeStatusChangeListener(final h7o h7oVar) {
        this.mMainHandler.post(new Runnable() { // from class: c7o
            @Override // java.lang.Runnable
            public final void run() {
                this.f5023a.lambda$removeStatusChangeListener$1(h7oVar);
            }
        });
    }

    @Override // defpackage.izc
    public synchronized void sendData(byte[] bArr, j7o j7oVar) {
        performSend(bArr, j7oVar);
    }

    @Override // defpackage.izc
    public void setDataReceiver(SppDataReceiver sppDataReceiver) {
        this.mReceiver = sppDataReceiver;
    }

    public abstract void socketClose();
}
