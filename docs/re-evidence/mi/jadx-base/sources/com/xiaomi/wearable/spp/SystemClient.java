package com.xiaomi.wearable.spp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.bluetooth.BluetoothSocketException;
import android.os.Build;
import android.os.Message;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.NearbyService;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.spp.SystemClient;
import defpackage.m7o;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/wearable/spp/SystemClient;", "Lcom/xiaomi/wearable/spp/a;", "Landroid/bluetooth/BluetoothDevice;", "device", "", "connectAfterBond", "(Landroid/bluetooth/BluetoothDevice;)V", "Landroid/bluetooth/BluetoothSocket;", "socket", "", "socketConnect", "(Landroid/bluetooth/BluetoothSocket;)I", "Ljava/io/DataInputStream;", "getDataInputStream", "()Ljava/io/DataInputStream;", "Ljava/io/DataOutputStream;", "getDataOutputStream", "()Ljava/io/DataOutputStream;", "socketClose", "()V", "", "getLastConnectTime", "()J", "", "data", "write", "([B)V", "getConnectionType", "()I", "", "bondWithoutDialog", "Z", "mSocket", "Landroid/bluetooth/BluetoothSocket;", "", Home.JSON_KEY_ADDRESS, "<init>", "(Ljava/lang/String;Z)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class SystemClient extends a {
    public static final int SOCKET_CONNECT_SUCCESS = 1000;
    public static final int SOCKET_CONNECT_THROWABLE = -1;

    @NotNull
    private static final String TAG = "SystemClient";
    private final boolean bondWithoutDialog;

    @Nullable
    private volatile BluetoothSocket mSocket;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemClient(@NotNull String address, boolean z) {
        super(address, z);
        Intrinsics.checkNotNullParameter(address, "address");
        this.bondWithoutDialog = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectAfterBond$lambda$0(SystemClient this$0, BluetoothDevice device, BluetoothSocket socket) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        Intrinsics.checkNotNullParameter(socket, "$socket");
        if (this$0.bondWithoutDialog) {
            NearbyService nearbyService = NearbyService.INSTANCE;
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            nearbyService.createBondWithoutDialog(address);
        }
        Message messageObtainMessage = this$0.mMainHandler.obtainMessage(100119);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
        this$0.mMainHandler.sendMessageDelayed(messageObtainMessage, FusionLocationRequest.timeout);
        int iSocketConnect = this$0.socketConnect(socket);
        this$0.mMainHandler.removeMessages(100119);
        if (iSocketConnect == 1000) {
            this$0.isConnected = true;
            this$0.onSocketConnectSuccess();
            return;
        }
        this$0.close();
        this$0.notifyConnectFailure(2012, "socket connect error = " + iSocketConnect);
    }

    @Override // com.xiaomi.wearable.spp.a
    public void connectAfterBond(@NotNull final BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        if (Build.VERSION.SDK_INT >= 31 && !checkBluetoothPermission()) {
            notifyConnectFailure(2013, "no permission");
            return;
        }
        try {
            final BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = device.createRfcommSocketToServiceRecord(this.SPP_UUID);
            m7o.f25850a.execute(new Runnable() { // from class: pvo
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    SystemClient.connectAfterBond$lambda$0(this.f30833a, device, bluetoothSocketCreateRfcommSocketToServiceRecord);
                }
            });
        } catch (IOException e) {
            notifyConnectFailure(2019, "socket init failed:" + e.getMessage());
        }
    }

    public int getConnectionType() {
        return 2;
    }

    @Override // com.xiaomi.wearable.spp.a
    @NotNull
    public DataInputStream getDataInputStream() {
        BluetoothSocket bluetoothSocket = this.mSocket;
        return new DataInputStream(bluetoothSocket != null ? bluetoothSocket.getInputStream() : null);
    }

    @Override // com.xiaomi.wearable.spp.a
    @NotNull
    public DataOutputStream getDataOutputStream() throws Exception {
        if (this.mSocket == null) {
            throw new IllegalStateException("Socket == null");
        }
        BluetoothSocket bluetoothSocket = this.mSocket;
        Intrinsics.checkNotNull(bluetoothSocket);
        return new DataOutputStream(bluetoothSocket.getOutputStream());
    }

    @Override // defpackage.izc
    public long getLastConnectTime() {
        return 0L;
    }

    @Override // com.xiaomi.wearable.spp.a
    public void socketClose() throws IOException {
        if (this.mSocket != null) {
            Logger logger = CoreExtKt.getLogger();
            BluetoothSocket bluetoothSocket = this.mSocket;
            BluetoothSocket bluetoothSocket2 = this.mSocket;
            logger.i(TAG, "close() called socket = " + bluetoothSocket + ", state = " + (bluetoothSocket2 != null ? Boolean.valueOf(bluetoothSocket2.isConnected()) : null));
            BluetoothSocket bluetoothSocket3 = this.mSocket;
            if (bluetoothSocket3 != null) {
                bluetoothSocket3.close();
            }
            this.mSocket = null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public final int socketConnect(@NotNull BluetoothSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        CoreExtKt.getLogger().i(TAG, "start socket connect, socket = " + socket);
        this.mSocket = socket;
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                socket.connect();
            } catch (BluetoothSocketException e) {
                CoreExtKt.getLogger().e(TAG, "socket connect failure, bluetooth exception code = " + e.getErrorCode() + ", message = " + e.getMessage() + " ");
                return e.getErrorCode();
            } catch (Throwable th) {
                CoreExtKt.getLogger().e(TAG, "socket connect failure, >= u message = " + th.getMessage());
                return -1;
            }
        } else {
            try {
                socket.connect();
            } catch (Throwable th2) {
                CoreExtKt.getLogger().e(TAG, "socket connect failure, < u message = " + th2.getMessage());
                return -1;
            }
        }
        return 1000;
    }

    public void write(@Nullable byte[] data) {
    }
}
