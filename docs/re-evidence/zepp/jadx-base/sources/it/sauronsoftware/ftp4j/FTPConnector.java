package it.sauronsoftware.ftp4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes22.dex */
public abstract class FTPConnector {
    private boolean a;
    private Socket b;
    public int closeTimeout;
    public int connectionTimeout;
    public int readTimeout;

    public FTPConnector(boolean z) {
        this.connectionTimeout = 10;
        this.readTimeout = 10;
        this.closeTimeout = 10;
        String property = System.getProperty(c.d);
        if ("true".equalsIgnoreCase(property) || "yes".equalsIgnoreCase(property) || "1".equals(property)) {
            this.a = true;
        } else if ("false".equalsIgnoreCase(property) || "no".equalsIgnoreCase(property) || "0".equals(property)) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public boolean a() {
        return this.a;
    }

    public void abortConnectForCommunicationChannel() {
        Socket socket = this.b;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract Socket connectForCommunicationChannel(String str, int i) throws IOException;

    public abstract Socket connectForDataTransferChannel(String str, int i) throws IOException;

    public void setCloseTimeout(int i) {
        this.closeTimeout = i;
    }

    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }

    public void setUseSuggestedAddressForDataConnections(boolean z) {
        this.a = z;
    }

    public Socket tcpConnectForCommunicationChannel(String str, int i) throws IOException {
        try {
            Socket socket = new Socket();
            this.b = socket;
            socket.setKeepAlive(true);
            this.b.setSoTimeout(this.readTimeout * 1000);
            this.b.setSoLinger(true, this.closeTimeout);
            this.b.connect(new InetSocketAddress(str, i), this.connectionTimeout * 1000);
            return this.b;
        } finally {
            this.b = null;
        }
    }

    public Socket tcpConnectForDataTransferChannel(String str, int i) throws IOException {
        Socket socket = new Socket();
        socket.setSoTimeout(this.readTimeout * 1000);
        socket.setSoLinger(true, this.closeTimeout);
        socket.setReceiveBufferSize(524288);
        socket.setSendBufferSize(524288);
        socket.connect(new InetSocketAddress(str, i), this.connectionTimeout * 1000);
        return socket;
    }

    public FTPConnector() {
        this(false);
    }
}
