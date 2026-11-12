package com.airoha.android.lib.physical.spp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.airoha.android.lib.ProductType;
import com.airoha.android.lib.physical.IPhysical;
import com.airoha.android.lib.physical.PhysicalType;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.ITransport;
import com.airoha.android.lib.util.Converter;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.huami.wallet.datasource.cloud.Const;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaSppController implements IPhysical {
    private static final String k = "AirohaSppController";
    private static final byte l = 4;
    private static final byte m = 2;
    private static final byte n = 5;
    private static final int o = 3;
    private byte[] a;
    private BluetoothManager b;
    private BluetoothAdapter c;
    private BluetoothSocket d;
    private final Object e;
    private BluetoothServerSocket f;
    private Context g;
    private boolean h;
    private a i;
    private UUID j;
    public ITransport mAirohaLink;
    public InputStream mInStream;
    public OutputStream mOutStream;

    public class a extends Thread {
        private final RespIndPacketBuffer a = new RespIndPacketBuffer();
        private final Context b;
        private boolean c;

        public a(Context context) {
            this.c = false;
            this.b = context;
            this.c = true;
        }

        public void cancel() {
            this.c = false;
            AirohaSppController.this.mAirohaLink.logToFile(AirohaSppController.k, "ConnectedThread cancel");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AirohaSppController.this.mAirohaLink.logToFile(AirohaSppController.k, "ConnectedThread running");
            AirohaSppController.this.notifyConnected();
            while (this.c) {
                try {
                    if (AirohaSppController.this.d != null) {
                        AirohaSppController.this.handleInputStream(this.a);
                    }
                } catch (IOException e) {
                    if (this.c) {
                        AirohaSppController.this.mAirohaLink.logToFile(AirohaSppController.k, "ConnectedT io exec: " + e.getMessage());
                    } else {
                        AirohaSppController.this.mAirohaLink.logToFile(AirohaSppController.k, "ConnectedT io exec: " + e.getMessage() + "--by user");
                    }
                    AirohaSppController.this.disconnect();
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    AirohaSppController.this.mAirohaLink.logToFile(AirohaSppController.k, "Connected thread ioobe");
                    e2.printStackTrace();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public AirohaSppController(AirohaLink airohaLink) {
        this.a = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};
        this.c = null;
        this.d = null;
        this.e = new Object();
        this.f = null;
        this.mInStream = null;
        this.mOutStream = null;
        this.h = false;
        this.j = UUID.fromString("8901dfa8-5c7e-4d8f-9f0c-c2b70683f5f0");
        this.mAirohaLink = airohaLink;
        Context context = airohaLink.getContext();
        this.g = context;
        if (this.b == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
            this.b = bluetoothManager;
            if (bluetoothManager == null) {
                Log.e(k, "Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.b.getAdapter();
        this.c = adapter;
        if (adapter == null) {
            Log.e(k, "Unable to obtain a BluetoothAdapter.");
        }
    }

    private BluetoothSocket b(BluetoothDevice bluetoothDevice) {
        UUID uuidD = d(getConnUUID());
        if (ProductType.isForSony) {
            uuidD = this.j;
        }
        this.mAirohaLink.logToFile(k, "createRfcomm: " + uuidD.toString());
        try {
            return bluetoothDevice.createRfcommSocketToServiceRecord(uuidD);
        } catch (IOException unused) {
            return null;
        }
    }

    private byte[] c(UUID uuid) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    private static UUID d(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    private BluetoothServerSocket e(String str) {
        try {
            return this.c.listenUsingRfcommWithServiceRecord(str, d(this.a));
        } catch (IOException unused) {
            return null;
        }
    }

    private void f() {
        g();
        synchronized (this.e) {
            a aVar = new a(this.g);
            this.i = aVar;
            aVar.start();
        }
    }

    private void g() {
        synchronized (this.e) {
            a aVar = this.i;
            if (aVar != null) {
                aVar.cancel();
                this.i = null;
            }
        }
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public boolean connect(String str) {
        this.mAirohaLink.logToFile(k, "createConn");
        if (this.h) {
            return true;
        }
        if (!this.c.isEnabled()) {
            return false;
        }
        try {
            BluetoothSocket bluetoothSocketB = b(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str));
            this.d = bluetoothSocketB;
            bluetoothSocketB.connect();
            this.mOutStream = this.d.getOutputStream();
            this.mInStream = this.d.getInputStream();
            this.h = true;
            this.mAirohaLink.logToFile(k, "mIsConnectOK true");
            f();
            return true;
        } catch (IOException e) {
            notifyConnectionError(e.getMessage());
            this.mAirohaLink.logToFile(k, "EXCEPTION:" + e.getMessage());
            disconnect();
            return false;
        } catch (Exception e2) {
            this.mAirohaLink.logToFile(k, "EXCEPTION:" + e2.getMessage());
            return false;
        }
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void disconnect() {
        synchronized (this.e) {
            try {
                g();
                InputStream inputStream = this.mInStream;
                if (inputStream != null) {
                    inputStream.close();
                    this.mInStream = null;
                }
                OutputStream outputStream = this.mOutStream;
                if (outputStream != null) {
                    outputStream.close();
                    this.mOutStream = null;
                }
                if (this.d != null) {
                    this.mAirohaLink.logToFile(k, "BluetoothSocket closing");
                    this.d.close();
                    for (int i = 0; i < 3; i++) {
                        if (!this.d.isConnected()) {
                            this.mAirohaLink.logToFile(k, "BluetoothSocket closed");
                            break;
                        }
                        SystemClock.sleep(500L);
                    }
                    this.d = null;
                    if (this.h) {
                        notifyDisconnected();
                    }
                }
                BluetoothServerSocket bluetoothServerSocket = this.f;
                if (bluetoothServerSocket != null) {
                    bluetoothServerSocket.close();
                    this.f = null;
                    if (this.h) {
                        notifyDisconnected();
                    }
                }
                this.h = false;
                this.mAirohaLink.logToFile(k, "mIsConnectOK false, normal");
            } catch (IOException e) {
                this.mAirohaLink.logToFile(k, Const.CardState.EXCEPTION + e.getMessage());
                this.mInStream = null;
                this.mOutStream = null;
                this.d = null;
                this.h = false;
                this.mAirohaLink.logToFile(k, "mIsConnectOK false, exception");
            }
        }
    }

    public byte[] getConnUUID() {
        return this.a;
    }

    public void handleInputStream(RespIndPacketBuffer respIndPacketBuffer) throws IOException {
        byte[] bArr = new byte[SleepDetailFragment.START_VALID_INTO_TIME];
        byte[] bArr2 = new byte[SleepDetailFragment.START_VALID_INTO_TIME];
        byte b = (byte) this.mInStream.read();
        int i = 0;
        if ((b & 5) == 5) {
            bArr[0] = b;
            bArr[1] = (byte) this.mInStream.read();
            bArr[2] = (byte) this.mInStream.read();
            bArr[3] = (byte) this.mInStream.read();
            int iBytesToU16 = Converter.BytesToU16(bArr[3], bArr[2]);
            this.mInStream.read(bArr2, 0, iBytesToU16);
            System.arraycopy(bArr2, 0, bArr, 4, iBytesToU16);
            i = iBytesToU16 + 4;
        }
        respIndPacketBuffer.addArrayToPacket(bArr, i);
        byte[] packet = respIndPacketBuffer.getPacket();
        respIndPacketBuffer.resetPacket();
        this.mAirohaLink.handlePhysicalPacket(packet);
    }

    public boolean listen() {
        this.mAirohaLink.logToFile(k, "start socket server listen...");
        disconnect();
        if (!this.c.isEnabled()) {
            return false;
        }
        try {
            BluetoothServerSocket bluetoothServerSocketE = e("SPP_Server");
            this.f = bluetoothServerSocketE;
            BluetoothSocket bluetoothSocketAccept = bluetoothServerSocketE.accept();
            this.d = bluetoothSocketAccept;
            this.mOutStream = bluetoothSocketAccept.getOutputStream();
            this.mInStream = this.d.getInputStream();
            this.h = true;
            this.mAirohaLink.logToFile(k, "mIsConnectOK true");
            f();
            return true;
        } catch (IOException e) {
            this.mAirohaLink.logToFile(k, Const.CardState.EXCEPTION + e.getMessage());
            disconnect();
            return false;
        } catch (Exception e2) {
            this.mAirohaLink.logToFile(k, Const.CardState.EXCEPTION + e2.getMessage());
            return false;
        }
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void notifyConnected() {
        this.mAirohaLink.OnPhysicalConnected(typeName());
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void notifyConnectionError(String str) {
        this.mAirohaLink.OnPhysicalConnectionError(str);
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void notifyDisconnected() {
        this.mAirohaLink.OnPhysicalDisconnected(typeName());
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public String typeName() {
        return PhysicalType.SPP.toString();
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public boolean write(byte[] bArr) {
        this.mAirohaLink.logToFile(k, "write()");
        if (!this.h) {
            this.mAirohaLink.logToFile(k, "not connected");
            return false;
        }
        try {
            this.mAirohaLink.logToFile(k, "Tx packet: " + Converter.byte2HexStr(bArr));
            this.mOutStream.write(bArr);
            this.mAirohaLink.logToFile(k, "done");
            return true;
        } catch (IOException e) {
            this.mAirohaLink.logToFile(k, Const.CardState.EXCEPTION + e.getMessage());
            disconnect();
            return false;
        }
    }

    public AirohaSppController(AirohaLink airohaLink, UUID uuid) {
        this.a = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};
        this.c = null;
        this.d = null;
        this.e = new Object();
        this.f = null;
        this.mInStream = null;
        this.mOutStream = null;
        this.h = false;
        this.j = UUID.fromString("8901dfa8-5c7e-4d8f-9f0c-c2b70683f5f0");
        this.mAirohaLink = airohaLink;
        this.a = c(uuid);
        Context context = this.mAirohaLink.getContext();
        this.g = context;
        if (this.b == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
            this.b = bluetoothManager;
            if (bluetoothManager == null) {
                Log.e(k, "Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.b.getAdapter();
        this.c = adapter;
        if (adapter == null) {
            Log.e(k, "Unable to obtain a BluetoothAdapter.");
        }
    }
}
