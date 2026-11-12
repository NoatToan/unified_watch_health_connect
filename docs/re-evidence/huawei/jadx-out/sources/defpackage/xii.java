package defpackage;

import health.compact.a.LogUtil;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: loaded from: classes20.dex */
public class xii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53046a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53047b = new Object();
    private static volatile xii e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ServerSocket f53048c = null;
    private Socket d;

    private xii() {
    }

    public int b() {
        try {
            synchronized (f53047b) {
                if (this.f53048c != null) {
                    LogUtil.b("WifiP2pTransferServerSocket", "serverSocket is ok.");
                    return this.f53048c.getLocalPort();
                }
                ServerSocket serverSocket = new ServerSocket();
                this.f53048c = serverSocket;
                serverSocket.setReuseAddress(true);
                this.f53048c.bind(new InetSocketAddress(0));
                return this.f53048c.getLocalPort();
            }
        } catch (IOException e2) {
            LogUtil.d("WifiP2pTransferServerSocket", "createWifiP2pTransferServerSocket IOException is: ", cpc.c(e2));
            return 0;
        }
    }

    public void c() {
        ServerSocket serverSocket;
        synchronized (f53047b) {
            serverSocket = this.f53048c;
            if (serverSocket == null) {
                serverSocket = null;
            }
        }
        if (serverSocket != null) {
            try {
                LogUtil.b("WifiP2pTransferServerSocket", "ServerSocket ready accept, will lock until tcp create success.");
                this.d = serverSocket.accept();
                LogUtil.b("WifiP2pTransferServerSocket", "socket accept success");
                return;
            } catch (IOException e2) {
                LogUtil.d("WifiP2pTransferServerSocket", "If lock accept, please check tcp dump. Before TCP, watch need check ARP,accept IOException is: ", cpc.c(e2));
                return;
            }
        }
        LogUtil.d("WifiP2pTransferServerSocket", "mServerSocket is null. Please check.");
    }

    public Socket e() {
        return this.d;
    }

    public static xii d() {
        xii xiiVar;
        synchronized (f53046a) {
            if (e == null) {
                e = new xii();
            }
            xiiVar = e;
        }
        return xiiVar;
    }

    public void a() {
        LogUtil.b("WifiP2pTransferServerSocket", "closeSocket");
        lng.h();
        try {
            Socket socket = this.d;
            if (socket != null) {
                cpm.d(socket.getOutputStream());
            }
        } catch (IOException e2) {
            LogUtil.d("WifiP2pTransferServerSocket", "closeSocket: ", cpc.c(e2));
        }
        cpm.d(this.d);
        synchronized (f53047b) {
            cpm.d(this.f53048c);
            this.f53048c = null;
        }
        this.d = null;
    }
}
