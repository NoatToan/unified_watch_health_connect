package org.cybergarage.http;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import org.cybergarage.util.Debug;
import org.cybergarage.util.ListenerList;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPServer implements Runnable {
    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_TIMEOUT = 80000;
    public static final String NAME = "CyberHTTP";
    public static final String VERSION = "1.0";
    private ServerSocket serverSock;
    private InetAddress bindAddr = null;
    private int bindPort = 0;
    public int timeout = 80000;
    private ListenerList httpRequestListenerList = new ListenerList();
    private Thread httpServerThread = null;

    public HTTPServer() {
        this.serverSock = null;
        this.serverSock = null;
    }

    public static String getName() {
        return System.getProperty("os.name") + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + System.getProperty("os.version") + " " + NAME + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + "1.0";
    }

    public Socket accept() {
        ServerSocket serverSocket = this.serverSock;
        if (serverSocket == null) {
            return null;
        }
        try {
            Socket socketAccept = serverSocket.accept();
            socketAccept.setSoTimeout(getTimeout());
            return socketAccept;
        } catch (Exception unused) {
            return null;
        }
    }

    public void addRequestListener(HTTPRequestListener hTTPRequestListener) {
        this.httpRequestListenerList.add(hTTPRequestListener);
    }

    public boolean close() {
        ServerSocket serverSocket = this.serverSock;
        if (serverSocket == null) {
            return true;
        }
        try {
            serverSocket.close();
            this.serverSock = null;
            this.bindAddr = null;
            this.bindPort = 0;
            return true;
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }

    public String getBindAddress() {
        InetAddress inetAddress = this.bindAddr;
        return inetAddress == null ? "" : inetAddress.toString();
    }

    public int getBindPort() {
        return this.bindPort;
    }

    public ServerSocket getServerSock() {
        return this.serverSock;
    }

    public synchronized int getTimeout() {
        return this.timeout;
    }

    public boolean isOpened() {
        return this.serverSock != null;
    }

    public boolean open(InetAddress inetAddress, int i) {
        if (this.serverSock != null) {
            return true;
        }
        try {
            this.serverSock = new ServerSocket(this.bindPort, 0, this.bindAddr);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void performRequestListener(HTTPRequest hTTPRequest) {
        int size = this.httpRequestListenerList.size();
        for (int i = 0; i < size; i++) {
            ((HTTPRequestListener) this.httpRequestListenerList.get(i)).httpRequestRecieved(hTTPRequest);
        }
    }

    public void removeRequestListener(HTTPRequestListener hTTPRequestListener) {
        this.httpRequestListenerList.remove(hTTPRequestListener);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isOpened()) {
            Thread threadCurrentThread = Thread.currentThread();
            while (this.httpServerThread == threadCurrentThread) {
                Thread.yield();
                try {
                    Debug.message("accept ...");
                    Socket socketAccept = accept();
                    if (socketAccept != null) {
                        Debug.message("sock = " + socketAccept.getRemoteSocketAddress());
                    }
                    new HTTPServerThread(this, socketAccept).start();
                    Debug.message("httpServThread ...");
                } catch (Exception e) {
                    Debug.warning(e);
                    return;
                }
            }
        }
    }

    public synchronized void setTimeout(int i) {
        this.timeout = i;
    }

    public boolean start() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.HTTPServer/");
        stringBuffer.append(this.serverSock.getLocalSocketAddress());
        Thread thread = new Thread(this, stringBuffer.toString());
        this.httpServerThread = thread;
        thread.start();
        return true;
    }

    public boolean stop() {
        this.httpServerThread = null;
        return true;
    }

    public boolean open(String str, int i) {
        if (this.serverSock != null) {
            return true;
        }
        try {
            this.bindAddr = InetAddress.getByName(str);
            this.bindPort = i;
            this.serverSock = new ServerSocket(this.bindPort, 0, this.bindAddr);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
