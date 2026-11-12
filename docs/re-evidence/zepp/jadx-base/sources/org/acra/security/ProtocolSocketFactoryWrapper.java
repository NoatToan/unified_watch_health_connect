package org.acra.security;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes23.dex */
public class ProtocolSocketFactoryWrapper extends SSLSocketFactory {
    private final SSLSocketFactory a;
    private final List<String> b;

    public ProtocolSocketFactoryWrapper(SSLSocketFactory sSLSocketFactory, List<TLS> list) {
        this.a = sSLSocketFactory;
        ArrayList arrayList = new ArrayList(list);
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            arrayList.remove(TLS.V1_3);
            if (i < 16) {
                arrayList.remove(TLS.V1_2);
                arrayList.remove(TLS.V1_1);
            }
        }
        this.b = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.b.add(((TLS) it2.next()).getId());
        }
    }

    private boolean a(SSLSocket sSLSocket) {
        for (String str : sSLSocket.getSupportedProtocols()) {
            if (this.b.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private Socket b(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (a(sSLSocket)) {
                sSLSocket.setEnabledProtocols((String[]) this.b.toArray(new String[0]));
            }
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return b(this.a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return b(this.a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return b(this.a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return b(this.a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return b(this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
