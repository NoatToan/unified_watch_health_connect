package com.amap.api.col.p0003sl;

import android.content.Context;
import android.net.SSLSessionCache;
import android.os.Build;
import defpackage.m2t;
import defpackage.p0t;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SSLSocketFactory f6013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6014b;
    public SSLContext c;

    public e1(Context context, SSLContext sSLContext) {
        SSLSocketFactory sSLSocketFactory;
        if (context != null) {
            try {
                this.f6014b = context.getApplicationContext();
            } catch (Throwable th) {
                try {
                    m2t.r(th, "myssl", "<init>");
                    try {
                        if (this.c == null) {
                            this.c = SSLContext.getDefault();
                        }
                    } catch (Throwable th2) {
                        m2t.r(th2, "myssl", "<init2>");
                    }
                    try {
                        if (sSLSocketFactory == null) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        return;
                    }
                } finally {
                    try {
                        if (this.c == null) {
                            this.c = SSLContext.getDefault();
                        }
                    } catch (Throwable th4) {
                        m2t.r(th4, "myssl", "<init2>");
                    }
                    try {
                        if (this.f6013a == null) {
                            this.f6013a = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        }
                    } catch (Throwable th5) {
                        m2t.r(th5, "myssl", "<init3>");
                    }
                }
            }
        }
        this.c = sSLContext;
        if (sSLContext != null) {
            this.f6013a = sSLContext.getSocketFactory();
        }
        try {
            if (this.c == null) {
                this.c = SSLContext.getDefault();
            }
        } catch (Throwable th6) {
            m2t.r(th6, "myssl", "<init2>");
        }
        try {
            if (this.f6013a == null) {
                this.f6013a = (SSLSocketFactory) SSLSocketFactory.getDefault();
            }
        } catch (Throwable th7) {
            m2t.r(th7, "myssl", "<init3>");
        }
    }

    public static Socket a(Socket socket) {
        try {
            if (x0.g.f6318b && (socket instanceof SSLSocket)) {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
            }
        } catch (Throwable th) {
            m2t.r(th, "myssl", "stlv2");
        }
        return socket;
    }

    public static void d(Socket socket) {
        int i = Build.VERSION.SDK_INT;
        if (x0.g.c && x0.g.e && (socket instanceof SSLSocket)) {
            int i2 = x0.g.f;
            int i3 = x0.g.d;
            if (i2 <= i3) {
                i3 = x0.g.f;
            }
            if (i3 <= 17 || i <= i3) {
                try {
                    socket.getClass().getMethod(p0t.t("Cc2V0VXNlU2Vzc2lvblRpY2tldHM"), Boolean.TYPE).invoke(socket, Boolean.TRUE);
                } catch (Throwable th) {
                    m2t.r(th, "myssl", "sust");
                }
            }
        }
    }

    public final void b() {
        int i = Build.VERSION.SDK_INT;
        if (!x0.g.c || this.f6014b == null || this.c == null) {
            return;
        }
        int i2 = x0.g.d;
        if (i2 <= 17 || i <= i2) {
            SSLSessionCache sSLSessionCache = new SSLSessionCache(this.f6014b);
            if (i >= 28) {
                c(sSLSessionCache);
                return;
            }
            try {
                sSLSessionCache.getClass().getMethod(p0t.t("MaW5zdGFsbA"), SSLSessionCache.class, SSLContext.class).invoke(sSLSessionCache, sSLSessionCache, this.c);
            } catch (Throwable th) {
                m2t.r(th, "myssl", "isc1");
                c(sSLSessionCache);
            }
        }
    }

    public final void c(SSLSessionCache sSLSessionCache) {
        SSLContext sSLContext = this.c;
        if (sSLContext == null) {
            return;
        }
        try {
            SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
            Field declaredField = sSLSessionCache.getClass().getDeclaredField(p0t.t("UbVNlc3Npb25DYWNoZQ"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(sSLSessionCache);
            Method[] methods = clientSessionContext.getClass().getMethods();
            String strT = p0t.t("Yc2V0UGVyc2lzdGVudENhY2hl");
            for (Method method : methods) {
                if (method.getName().equals(strT)) {
                    method.invoke(clientSessionContext, obj);
                    return;
                }
            }
        } catch (Throwable th) {
            m2t.r(th, "myssl", "isc2");
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket());
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            m2t.r(th, "myssl", "cs1");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory.getDefaultCipherSuites();
            }
        } catch (Throwable th) {
            m2t.r(th, "myssl", "gdcs");
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory.getSupportedCipherSuites();
            }
        } catch (Throwable th) {
            m2t.r(th, "myssl", "gscs");
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(socket, str, i, z));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            m2t.r(th, "myssl", "cs2");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(str, i));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            m2t.r(th, "myssl", "cs3");
            if (!(th instanceof UnknownHostException)) {
                if (th instanceof IOException) {
                    throw th;
                }
                return null;
            }
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(str, i, inetAddress, i2));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            m2t.r(th, "myssl", "cs4");
            if (!(th instanceof UnknownHostException)) {
                if (th instanceof IOException) {
                    throw th;
                }
                return null;
            }
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(inetAddress, i));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            m2t.r(th, "myssl", "cs5");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f6013a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
            d(socketA);
            return socketA;
        } catch (Throwable th) {
            m2t.r(th, "myssl", "cs6");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }
}
