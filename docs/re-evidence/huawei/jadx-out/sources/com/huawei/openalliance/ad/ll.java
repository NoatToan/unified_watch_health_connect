package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes12.dex */
public class ll extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X509HostnameVerifier f19494a = new BrowserCompatHostnameVerifier();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X509HostnameVerifier f19495b = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f19496c = {"TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_RSA", "aNULL", "eNULL", "CBC"};
    private static final String[] d = {"TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_RSA", "aNULL", "eNULL"};
    private static volatile ll e = null;
    private static String[] f = null;
    private SSLContext g;
    private Context h;

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] strArr = f;
        return strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.g.getSocketFactory().createSocket(socket, str, i, z);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket socketCreateSocket = this.g.getSocketFactory().createSocket(str, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    private void b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
            } else if (Build.VERSION.SDK_INT < 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            }
        }
    }

    private static void a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        for (String str : enabledCipherSuites) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            String[] strArr = f19496c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    arrayList.add(str);
                    break;
                } else if (upperCase.contains(strArr[i].toUpperCase(Locale.ENGLISH))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        f = strArr2;
        sSLSocket.setEnabledCipherSuites(strArr2);
    }

    private void a(Socket socket) {
        if (socket == null || !(socket instanceof SSLSocket)) {
            return;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        b(sSLSocket);
        a(sSLSocket);
    }

    public static ll a(Context context) {
        if (e == null) {
            synchronized (ll.class) {
                if (e == null) {
                    e = new ll(context);
                }
            }
        }
        return e;
    }

    private ll(Context context) throws KeyManagementException {
        SecureRandom secureRandom;
        this.g = null;
        this.h = context;
        this.g = com.huawei.openalliance.ad.utils.cv.a();
        lm lmVar = new lm(this.h);
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (Exception unused) {
            secureRandom = new SecureRandom();
        }
        this.g.init(null, new X509TrustManager[]{lmVar}, secureRandom);
    }
}
