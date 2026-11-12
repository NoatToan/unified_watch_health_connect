package com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbsClassicBTProvider {
    private static final String TAG = "AbsClassicBTProvider";
    private final BluetoothAdapter mBluetoothAdapter;
    private UUID mUUIDTransport;
    private BluetoothDevice mDevice = null;
    private ConnectionThread mConnectionThread = null;
    private CommunicationThread mCommunicationThread = null;
    private int mState = 4;

    public class CommunicationThread extends Thread {
        private final InputStream mmInputStream;
        private final OutputStream mmOutputStream;
        private final BluetoothSocket mmSocket;
        private boolean mmIsRunning = false;
        private final String THREAD_TAG = "CommunicationThread";

        public CommunicationThread(BluetoothSocket bluetoothSocket) {
            InputStream inputStream;
            setName("CommunicationThread" + getId());
            this.mmSocket = bluetoothSocket;
            OutputStream outputStream = null;
            try {
                inputStream = bluetoothSocket.getInputStream();
                try {
                    outputStream = bluetoothSocket.getOutputStream();
                } catch (IOException e) {
                    e = e;
                    AbsClassicBTProvider.error("CommunicationThread", "Error occurred when getting input and output streams" + e.getMessage());
                }
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
            }
            this.mmInputStream = inputStream;
            this.mmOutputStream = outputStream;
        }

        private void listenStream() {
            byte[] bArr = new byte[1024];
            this.mmIsRunning = true;
            AbsClassicBTProvider.this.onCommunicationRunning();
            while (AbsClassicBTProvider.this.mState == 2 && this.mmIsRunning) {
                try {
                    int i = this.mmInputStream.read(bArr);
                    if (i > 0) {
                        byte[] bArr2 = new byte[i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        AbsClassicBTProvider.error("MyTest", "receiveData = " + AbsClassicBTProvider.byteToString(bArr2));
                        AbsClassicBTProvider.this.onDataFound(bArr2);
                    }
                } catch (IOException e) {
                    AbsClassicBTProvider.error("CommunicationThread", "Reception of data failed: exception occurred while reading: " + e.toString());
                    this.mmIsRunning = false;
                    if (AbsClassicBTProvider.this.mState == 2) {
                        AbsClassicBTProvider.this.onConnectionLost();
                    }
                    AbsClassicBTProvider.log("MyTest", "clear CommunicationThread:" + AbsClassicBTProvider.this.mCommunicationThread);
                    AbsClassicBTProvider.this.mCommunicationThread = null;
                    return;
                }
            }
        }

        public void cancel() {
            this.mmIsRunning = false;
            try {
                this.mmSocket.close();
            } catch (IOException e) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Cancellation of the Thread: Close of BluetoothSocket failed: " + e.toString());
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.mmInputStream == null) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Run thread failed: InputStream is null.");
                AbsClassicBTProvider.this.disconnect();
                return;
            }
            if (this.mmOutputStream == null) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Run thread failed: OutputStream is null.");
                AbsClassicBTProvider.this.disconnect();
                return;
            }
            BluetoothSocket bluetoothSocket = this.mmSocket;
            if (bluetoothSocket == null) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Run thread failed: BluetoothSocket is null.");
                AbsClassicBTProvider.this.disconnect();
            } else if (bluetoothSocket.isConnected()) {
                listenStream();
            } else {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Run thread failed: BluetoothSocket is not connected.");
                AbsClassicBTProvider.this.disconnect();
            }
        }

        public boolean sendStream(byte[] bArr) {
            BluetoothSocket bluetoothSocket = this.mmSocket;
            if (bluetoothSocket == null) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Sending of data failed: BluetoothSocket is null.");
                return false;
            }
            if (!bluetoothSocket.isConnected()) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Sending of data failed: BluetoothSocket is not connected.");
                return false;
            }
            if (AbsClassicBTProvider.this.mState != 2) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Sending of data failed: Provider is not connected.");
                return false;
            }
            OutputStream outputStream = this.mmOutputStream;
            if (outputStream == null) {
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Sending of data failed: OutputStream is null.");
                return false;
            }
            try {
                outputStream.write(bArr);
                this.mmOutputStream.flush();
                AbsClassicBTProvider.warn("MyTest", "sendData = " + AbsClassicBTProvider.byteToString(bArr));
                return true;
            } catch (IOException e) {
                AbsClassicBTProvider.log("MyTest", "sendData error");
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Sending of data failed: Exception occurred while writing data: " + e.toString());
                return false;
            }
        }
    }

    public class ConnectionThread extends Thread {
        private final String THREAD_TAG;
        private final BluetoothSocket mmConnectorSocket;

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.mmConnectorSocket.connect();
                AbsClassicBTProvider.this.onSocketConnected(this.mmConnectorSocket);
            } catch (IOException e) {
                AbsClassicBTProvider.log("MyTest", "ConnectException " + e.toString());
                AbsClassicBTProvider.warn("AbsClassicBTProvider:Exception while connecting: " + e.toString());
                try {
                    this.mmConnectorSocket.close();
                } catch (IOException e2) {
                    AbsClassicBTProvider.warn("AbsClassicBTProvider:Could not close the client socket" + e2.getMessage());
                }
                AbsClassicBTProvider.this.onConnectionFailed();
                AbsClassicBTProvider.this.mConnectionThread = null;
            }
        }

        private ConnectionThread(BluetoothSocket bluetoothSocket) {
            this.THREAD_TAG = "ConnectionThread";
            setName("ConnectionThread" + getId());
            this.mmConnectorSocket = bluetoothSocket;
        }
    }

    public AbsClassicBTProvider(BluetoothManager bluetoothManager) {
        if (bluetoothManager == null) {
            this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            log("AbsClassicBTProvider:No available BluetoothManager, BluetoothAdapter initialised with BluetoothAdapter.getDefaultAdapter.");
        } else {
            this.mBluetoothAdapter = bluetoothManager.getAdapter();
        }
        if (this.mBluetoothAdapter == null) {
            error(TAG, "Initialisation of the Bluetooth Adapter failed: unable to initialize BluetoothAdapter.");
        }
    }

    private boolean btIsSecure() {
        return true;
    }

    public static String byteToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length > 0) {
            for (byte b2 : bArr) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
        }
        return sb.toString();
    }

    private void cancelCommunicationThread() {
        if (this.mCommunicationThread != null) {
            log("MyTest", "cancel CommunicationThread: " + this.mCommunicationThread);
            this.mCommunicationThread.cancel();
            this.mCommunicationThread = null;
        }
    }

    private void cancelConnectionThread() {
        ConnectionThread connectionThread = this.mConnectionThread;
        if (connectionThread != null) {
            connectionThread.cancel();
            this.mConnectionThread = null;
        }
    }

    private BluetoothSocket createSocket(BluetoothDevice bluetoothDevice, UUID uuid) {
        try {
            return btIsSecure() ? bluetoothDevice.createInsecureRfcommSocketToServiceRecord(uuid) : bluetoothDevice.createRfcommSocketToServiceRecord(uuid);
        } catch (IOException e) {
            warn("AbsClassicBTProvider:Exception occurs while creating Bluetooth socket: " + e.toString());
            log("AbsClassicBTProvider:Attempting to invoke method to create Bluetooth Socket.");
            try {
                return (BluetoothSocket) bluetoothDevice.getClass().getMethod("createRfcommSocket", Integer.TYPE).invoke(bluetoothDevice, 1);
            } catch (Exception unused) {
                warn("AbsClassicBTProvider:Exception occurs while creating Bluetooth socket by invoking method: " + e.toString());
                return null;
            }
        }
    }

    public static void error(String str) {
        BluetoothLog.e("AbsClassicBTProvider:" + str);
    }

    private static String getConnectionStateName(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTING";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i != 3) {
            return i != 4 ? DeviceTypes.UNKNOWN : "NO STATE";
        }
        return "DISCONNECTING";
    }

    private boolean isBluetoothAvailable() {
        return this.mBluetoothAdapter != null;
    }

    public static void log(String str) {
        BluetoothLog.d("AbsClassicBTProvider:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnectionFailed() {
        setState(0);
        onConnectionError(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnectionLost() {
        setState(0);
        onConnectionError(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSocketConnected(BluetoothSocket bluetoothSocket) {
        cancelConnectionThread();
        cancelCommunicationThread();
        CommunicationThread communicationThread = new CommunicationThread(bluetoothSocket);
        this.mCommunicationThread = communicationThread;
        communicationThread.start();
        setState(2);
        log("AbsClassicBTProvider:Successful connection to device: " + getDevice().getAddress());
    }

    private synchronized void setState(int i) {
        this.mState = i;
        onConnectionStateChanged(i);
    }

    public static void warn(String str) {
        BluetoothLog.w("AbsClassicBTProvider:" + str);
    }

    public boolean connect(String str, UUID uuid) {
        if (str == null) {
            warn("AbsClassicBTProvider:connection failed: Bluetooth address is null.");
            return false;
        }
        if (str.length() == 0) {
            warn("AbsClassicBTProvider:connection failed: Bluetooth address null or empty.");
            return false;
        }
        if (!isBluetoothAvailable()) {
            warn("AbsClassicBTProvider:connection failed: unable to get the adapter to get the device object from BT address.");
            return false;
        }
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            warn("AbsClassicBTProvider:connection failed: unknown BT address.");
            return false;
        }
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice != null) {
            return connect(remoteDevice, uuid);
        }
        warn("AbsClassicBTProvider:connection failed: get device from BT address failed.");
        return false;
    }

    public boolean disconnect() {
        if (this.mState == 0) {
            warn("AbsClassicBTProvider:disconnection failed: no device connected.");
            return false;
        }
        setState(3);
        cancelConnectionThread();
        cancelCommunicationThread();
        setState(0);
        StringBuilder sb = new StringBuilder();
        sb.append("AbsClassicBTProvider:Provider disconnected from BluetoothDevice ");
        BluetoothDevice bluetoothDevice = this.mDevice;
        sb.append(bluetoothDevice != null ? bluetoothDevice.getAddress() : AbstractJsonLexerKt.NULL);
        log(sb.toString());
        return true;
    }

    public BluetoothDevice getDevice() {
        return this.mDevice;
    }

    public synchronized int getState() {
        return this.mState;
    }

    public boolean isReady() {
        CommunicationThread communicationThread;
        return this.mState == 2 && (communicationThread = this.mCommunicationThread) != null && communicationThread.mmIsRunning;
    }

    public abstract void onCommunicationRunning();

    public abstract void onConnectionError(int i);

    public abstract void onConnectionStateChanged(int i);

    public abstract void onDataFound(byte[] bArr);

    public boolean reconnectToDevice() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        return bluetoothDevice != null && connect(bluetoothDevice, this.mUUIDTransport);
    }

    public boolean sendData(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.mState != 2) {
                    warn("AbsClassicBTProvider:Attempt to send data failed: provider not currently connected to a device.");
                    return false;
                }
                CommunicationThread communicationThread = this.mCommunicationThread;
                if (communicationThread != null) {
                    return communicationThread.sendStream(bArr);
                }
                warn("AbsClassicBTProvider:Attempt to send data failed: CommunicationThread is null.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void error(String str, String str2) {
        BluetoothLog.e(str + ":" + str2);
    }

    public static void log(String str, String str2) {
        BluetoothLog.d(str + ":" + str2);
    }

    public static void warn(String str, String str2) {
        BluetoothLog.w(str + ":" + str2);
    }

    private boolean connect(BluetoothDevice bluetoothDevice, UUID uuid) {
        if (this.mState == 2) {
            warn("AbsClassicBTProvider:connection failed: a device is already connected");
            return false;
        }
        if (bluetoothDevice.getType() != 1 && bluetoothDevice.getType() != 3) {
            warn("AbsClassicBTProvider:connection failed: the device is not BR/EDR compatible.");
        }
        if (!isBluetoothAvailable()) {
            warn("AbsClassicBTProvider:connection failed: Bluetooth is not available.");
            return false;
        }
        if (!BluetoothAdapter.checkBluetoothAddress(bluetoothDevice.getAddress())) {
            warn("AbsClassicBTProvider:connection failed: device address not found in list of devices known by the system.");
            return false;
        }
        if (uuid == null) {
            warn("AbsClassicBTProvider:connection failed: device bonded and no compatible UUID available.");
            return false;
        }
        if (this.mState == 2 && this.mCommunicationThread != null) {
            warn("AbsClassicBTProvider:connection failed: Provider is already connected to a device with an active communication.");
            return false;
        }
        cancelConnectionThread();
        cancelCommunicationThread();
        setState(1);
        BluetoothSocket bluetoothSocketCreateSocket = createSocket(bluetoothDevice, uuid);
        if (bluetoothSocketCreateSocket == null) {
            warn("AbsClassicBTProvider:connection failed: creation of a Bluetooth socket failed.");
            return false;
        }
        this.mUUIDTransport = uuid;
        this.mDevice = bluetoothDevice;
        ConnectionThread connectionThread = new ConnectionThread(bluetoothSocketCreateSocket);
        this.mConnectionThread = connectionThread;
        connectionThread.start();
        return true;
    }
}
