package com.garmin.android.connectiq.adb;

import android.content.Context;
import com.garmin.android.connectiq.IQDevice;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class AdbConnection {
    public static final int DEFAULT_PORT = 7381;
    private static final int MAX_BUFFER_SIZE = 16384;
    private static AdbConnection instance;
    private Context context;
    private ServerSocket server;
    private Socket client = null;
    private int connectionPort = DEFAULT_PORT;
    private InputStream inputStream = null;
    private OutputStream outputStream = null;
    private Thread serverThread = null;
    private AdbConnectionListener connListener = null;
    private IQDevice device = new IQDevice(12345, "Simulator");

    public interface AdbConnectionListener {
        void onConnectionStatusChanged(IQDevice iQDevice, IQDevice.IQDeviceStatus iQDeviceStatus);
    }

    public class ServerThread implements Runnable {
        public ServerThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdbConnection adbConnection;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    AdbConnection.this.server = new ServerSocket(AdbConnection.this.connectionPort);
                    AdbConnection.this.server.setSoTimeout(5000);
                    while (!Thread.currentThread().isInterrupted()) {
                        try {
                            AdbConnection adbConnection2 = AdbConnection.this;
                            adbConnection2.client = adbConnection2.server.accept();
                            break;
                        } catch (SocketTimeoutException unused) {
                        }
                    }
                    AdbConnection.this.inputStream = new BufferedInputStream(AdbConnection.this.client.getInputStream());
                    AdbConnection adbConnection3 = AdbConnection.this;
                    adbConnection3.outputStream = adbConnection3.client.getOutputStream();
                    if (AdbConnection.this.connListener != null) {
                        AdbConnection.this.connListener.onConnectionStatusChanged(AdbConnection.this.device, IQDevice.IQDeviceStatus.CONNECTED);
                    }
                    try {
                        adbConnection = AdbConnection.this;
                    } catch (IOException unused2) {
                    }
                } catch (IOException unused3) {
                    adbConnection = AdbConnection.this;
                } catch (Throwable th3) {
                    try {
                        AdbConnection.this.server.close();
                    } catch (IOException unused4) {
                    }
                    throw th3;
                }
                adbConnection.server.close();
                if (AdbConnection.this.client != null) {
                    byte[] bArr = new byte[16384];
                    while (!Thread.currentThread().isInterrupted() && AdbConnection.this.client.isConnected() && !AdbConnection.this.client.isInputShutdown()) {
                        try {
                            int i14 = AdbConnection.this.inputStream.read(bArr, 0, 16384);
                            if (i14 == -1) {
                                break;
                            }
                            AdbDataHandler.handleMessage(AdbConnection.this.context, Arrays.copyOf(bArr, i14));
                        } catch (IOException unused5) {
                        }
                    }
                    if (AdbConnection.this.connListener != null) {
                        AdbConnection.this.connListener.onConnectionStatusChanged(AdbConnection.this.device, IQDevice.IQDeviceStatus.NOT_CONNECTED);
                    }
                    try {
                        AdbConnection.this.client.close();
                        AdbConnection.this.client = null;
                    } catch (IOException unused6) {
                    }
                }
            }
        }
    }

    private AdbConnection() {
    }

    public static AdbConnection getInstance() {
        if (instance == null) {
            instance = new AdbConnection();
        }
        return instance;
    }

    public void disconnect() {
        Socket socket = this.client;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        Thread thread = this.serverThread;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public void establishConnection(AdbConnectionListener adbConnectionListener) {
        this.connListener = adbConnectionListener;
        Thread thread = new Thread(new ServerThread());
        this.serverThread = thread;
        thread.start();
    }

    public int getPort() {
        return this.connectionPort;
    }

    public boolean isActive() {
        Thread thread = this.serverThread;
        return thread != null && thread.isAlive();
    }

    public boolean isConnected() {
        Socket socket = this.client;
        return socket != null && socket.isConnected();
    }

    public boolean sendMessage(byte[] bArr) {
        Socket socket;
        if (this.outputStream != null && (socket = this.client) != null && socket.isConnected() && !this.client.isOutputShutdown()) {
            long length = (bArr.length / 600) * 1000;
            if (length > 0) {
                try {
                    Thread.sleep(length);
                } catch (InterruptedException unused) {
                }
            }
            try {
                this.outputStream.write(bArr);
                this.outputStream.flush();
                return true;
            } catch (IOException unused2) {
            }
        }
        return false;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setPort(int i14) {
        this.connectionPort = i14;
    }
}
