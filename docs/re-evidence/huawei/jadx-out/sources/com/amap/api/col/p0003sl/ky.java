package com.amap.api.col.p0003sl;

import android.content.Context;
import android.net.SSLSessionCache;
import android.os.Build;
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
public final class ky extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f3020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SSLContext f3021c;

    public ky(Context context, SSLContext sSLContext) {
        SSLSocketFactory sSLSocketFactory;
        if (context != null) {
            try {
                this.f3020b = context.getApplicationContext();
            } catch (Throwable th) {
                try {
                    jv.c(th, "myssl", "<init>");
                    try {
                        if (sSLSocketFactory == null) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        return;
                    }
                } finally {
                    try {
                        if (this.f3021c == null) {
                            this.f3021c = SSLContext.getDefault();
                        }
                    } catch (Throwable th3) {
                        jv.c(th3, "myssl", "<init2>");
                    }
                    try {
                        if (this.f3019a == null) {
                            this.f3019a = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        }
                    } catch (Throwable th4) {
                        jv.c(th4, "myssl", "<init3>");
                    }
                }
            }
        }
        this.f3021c = sSLContext;
        if (sSLContext != null) {
            this.f3019a = sSLContext.getSocketFactory();
        }
        try {
            if (this.f3021c == null) {
                this.f3021c = SSLContext.getDefault();
            }
        } catch (Throwable th5) {
            jv.c(th5, "myssl", "<init2>");
        }
        try {
            if (this.f3019a == null) {
                this.f3019a = (SSLSocketFactory) SSLSocketFactory.getDefault();
            }
        } catch (Throwable th6) {
            jv.c(th6, "myssl", "<init3>");
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory.getDefaultCipherSuites();
            }
        } catch (Throwable th) {
            jv.c(th, "myssl", "gdcs");
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory.getSupportedCipherSuites();
            }
        } catch (Throwable th) {
            jv.c(th, "myssl", "gscs");
        }
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket());
            b(socketA);
            return socketA;
        } catch (Throwable th) {
            jv.c(th, "myssl", "cs1");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(socket, str, i, z));
            b(socketA);
            return socketA;
        } catch (Throwable th) {
            jv.c(th, "myssl", "cs2");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(str, i));
            b(socketA);
            return socketA;
        } catch (Throwable th) {
            jv.c(th, "myssl", "cs3");
            if (th instanceof UnknownHostException) {
                throw th;
            }
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(str, i, inetAddress, i2));
            b(socketA);
            return socketA;
        } catch (Throwable th) {
            jv.c(th, "myssl", "cs4");
            if (th instanceof UnknownHostException) {
                throw th;
            }
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(inetAddress, i));
            b(socketA);
            return socketA;
        } catch (Throwable th) {
            jv.c(th, "myssl", "cs5");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        try {
            SSLSocketFactory sSLSocketFactory = this.f3019a;
            if (sSLSocketFactory == null) {
                return null;
            }
            Socket socketA = a(sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
            b(socketA);
            return socketA;
        } catch (Throwable th) {
            jv.c(th, "myssl", "cs6");
            if (th instanceof IOException) {
                throw th;
            }
            return null;
        }
    }

    private static Socket a(Socket socket) {
        try {
            if (im.f.f2788b && (socket instanceof SSLSocket)) {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
                return socket;
            }
        } catch (Throwable th) {
            jv.c(th, "myssl", "stlv2");
        }
        return socket;
    }

    private static void b(Socket socket) {
        int i;
        if (im.f.f2789c && im.f.e && (socket instanceof SSLSocket)) {
            if (im.f.f > im.f.d) {
                i = im.f.d;
            } else {
                i = im.f.f;
            }
            if (i <= 17 || Build.VERSION.SDK_INT <= i) {
                try {
                    socket.getClass().getMethod(iy.c("Cc2V0VXNlU2Vzc2lvblRpY2tldHM"), Boolean.TYPE).invoke(socket, Boolean.TRUE);
                } catch (Throwable th) {
                    jv.c(th, "myssl", "sust");
                }
            }
        }
    }

    public final void a() {
        if (!im.f.f2789c || this.f3020b == null || this.f3021c == null) {
            return;
        }
        int i = im.f.d;
        if (i <= 17 || Build.VERSION.SDK_INT <= i) {
            SSLSessionCache sSLSessionCache = new SSLSessionCache(this.f3020b);
            if (Build.VERSION.SDK_INT >= 28) {
                a(sSLSessionCache);
                return;
            }
            try {
                sSLSessionCache.getClass().getMethod(iy.c("MaW5zdGFsbA"), SSLSessionCache.class, SSLContext.class).invoke(sSLSessionCache, sSLSessionCache, this.f3021c);
            } catch (Throwable th) {
                jv.c(th, "myssl", "isc1");
                a(sSLSessionCache);
            }
        }
    }

    private void a(SSLSessionCache sSLSessionCache) {
        SSLContext sSLContext = this.f3021c;
        if (sSLContext == null) {
            return;
        }
        try {
            SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
            Field declaredField = sSLSessionCache.getClass().getDeclaredField(iy.c("UbVNlc3Npb25DYWNoZQ"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(sSLSessionCache);
            Method[] methods = clientSessionContext.getClass().getMethods();
            String strC = iy.c("Yc2V0UGVyc2lzdGVudENhY2hl");
            for (Method method : methods) {
                if (method.getName().equals(strC)) {
                    method.invoke(clientSessionContext, obj);
                    return;
                }
            }
        } catch (Throwable th) {
            jv.c(th, "myssl", "isc2");
        }
    }
}
