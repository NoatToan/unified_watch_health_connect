package com.huawei.openalliance.ad.net.http;

import android.os.Build;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.cv;
import com.huawei.openalliance.ad.utils.cw;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19708a = "m";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SSLSocketFactory f19709c;
    private static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLContext f19710b;
    private boolean e;

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f19710b.getSocketFactory().createSocket(socket, str, i, z);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketCreateSocket = this.f19710b.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketCreateSocket = this.f19710b.getSocketFactory().createSocket(inetAddress, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketCreateSocket = this.f19710b.getSocketFactory().createSocket(str, i, inetAddress, i2);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket socketCreateSocket = this.f19710b.getSocketFactory().createSocket(str, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    private static void b(SSLSocket sSLSocket) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        if (enabledCipherSuites == null || enabledCipherSuites.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : enabledCipherSuites) {
            if (!cw.a(str)) {
                arrayList.add(str);
            }
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    private void a(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
            } else if (Build.VERSION.SDK_INT < 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            }
        }
    }

    private void a(Socket socket) {
        if ((socket instanceof SSLSocket) && this.e) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            a(sSLSocket);
            b(sSLSocket);
        }
    }

    public static SSLSocketFactory a(boolean z) {
        String str;
        String str2;
        synchronized (d) {
            try {
                try {
                    try {
                        try {
                            try {
                                if (f19709c == null) {
                                    f19709c = new m(z);
                                }
                                return f19709c;
                            } catch (Exception unused) {
                                str = f19708a;
                                str2 = "Failed to new SSLSocketFactory instance. Exception";
                                hw.c(str, str2);
                                return null;
                            }
                        } catch (GeneralSecurityException unused2) {
                            str = f19708a;
                            str2 = "Failed to new SSLSocketFactory instance. GeneralSecurityException";
                            hw.c(str, str2);
                            return null;
                        }
                    } catch (KeyStoreException unused3) {
                        str = f19708a;
                        str2 = "Failed to new SSLSocketFactory instance. KeyStoreException";
                        hw.c(str, str2);
                        return null;
                    }
                } catch (KeyManagementException unused4) {
                    str = f19708a;
                    str2 = "Failed to new SSLSocketFactory instance. KeyManagementException";
                    hw.c(str, str2);
                    return null;
                } catch (NoSuchAlgorithmException unused5) {
                    str = f19708a;
                    str2 = "Failed to new SSLSocketFactory instance. NoSuchAlgorithmException";
                    hw.c(str, str2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private m(boolean z) throws KeyManagementException {
        SecureRandom secureRandom;
        this.e = true;
        this.f19710b = z ? cv.a() : SSLContext.getInstance("TLS");
        this.e = z;
        TrustManager[] trustManagerArrA = HttpsConfig.a();
        trustManagerArrA = trustManagerArrA.length == 0 ? null : trustManagerArrA;
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (Exception unused) {
            secureRandom = new SecureRandom();
        }
        this.f19710b.init(null, trustManagerArrA, secureRandom);
    }
}
