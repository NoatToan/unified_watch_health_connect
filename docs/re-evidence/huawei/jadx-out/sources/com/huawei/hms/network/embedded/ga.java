package com.huawei.hms.network.embedded;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes34.dex */
public class ga extends ma {
    public static final int k = 4000;
    public final Class<?> e;
    public final la<Socket> f;
    public final la<Socket> g;
    public final la<Socket> h;
    public final la<Socket> i;
    public final c j = c.a();

    @Override // com.huawei.hms.network.embedded.ma
    @Nullable
    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        Object objA = ma.a(sSLSocketFactory, this.e, "sslParameters");
        if (objA == null) {
            try {
                objA = ma.a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.c(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) ma.a(objA, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) ma.a(objA, X509TrustManager.class, "trustManager");
    }

    @Override // com.huawei.hms.network.embedded.ma
    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public SSLContext b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    @Nullable
    public String b(SSLSocket sSLSocket) {
        byte[] bArr;
        la<Socket> laVar = this.h;
        if (laVar == null || !laVar.a(sSLSocket) || (bArr = (byte[]) this.h.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @Override // com.huawei.hms.network.embedded.ma
    public ta b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(SSLSocket sSLSocket, String str, List<r7> list) {
        if (str != null) {
            this.f.c(sSLSocket, true);
            this.g.c(sSLSocket, str);
        }
        la<Socket> laVar = this.i;
        if (laVar == null || !laVar.a(sSLSocket)) {
            return;
        }
        this.i.d(sSLSocket, ma.b(list));
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!f8.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(String str, Object obj) {
        if (this.j.a(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(int i, String str, @Nullable Throwable th) {
        int iMin;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(e8.a(th));
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public Object a(String str) {
        return this.j.a(str);
    }

    @Override // com.huawei.hms.network.embedded.ma
    public qa a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public static boolean k() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final class b implements ta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f14828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f14829b;

        public int hashCode() {
            return this.f14828a.hashCode() + (this.f14829b.hashCode() * 31);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14828a.equals(bVar.f14828a) && this.f14829b.equals(bVar.f14829b);
        }

        @Override // com.huawei.hms.network.embedded.ta
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f14829b.invoke(this.f14828a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f14829b = method;
            this.f14828a = x509TrustManager;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f14830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f14831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f14832c;

        public boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.f14832c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public Object a(String str) {
            Method method = this.f14830a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f14831b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public static c a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new c(method, method3, method2);
        }

        public c(Method method, Method method2, Method method3) {
            this.f14830a = method;
            this.f14831b = method2;
            this.f14832c = method3;
        }
    }

    public static int j() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    public static final class a extends qa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f14826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f14827b;

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        @Override // com.huawei.hms.network.embedded.qa
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f14827b.invoke(this.f14826a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), JceNames.RSA, str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public a(Object obj, Method method) {
            this.f14826a = obj;
            this.f14827b = method;
        }
    }

    public static ma i() {
        Class<?> cls;
        la laVar;
        la laVar2;
        if (j() == 0) {
            return null;
        }
        try {
            if (j() >= 21) {
                return null;
            }
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            la laVar3 = new la(null, "setUseSessionTickets", Boolean.TYPE);
            la laVar4 = new la(null, "setHostname", String.class);
            if (k()) {
                la laVar5 = new la(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                laVar2 = new la(null, "setAlpnProtocols", byte[].class);
                laVar = laVar5;
            } else {
                laVar = null;
                laVar2 = null;
            }
            return new ga(cls2, laVar3, laVar4, laVar, laVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return a(str, cls, obj);
        }
    }

    private boolean a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    public ga(Class<?> cls, la<Socket> laVar, la<Socket> laVar2, la<Socket> laVar3, la<Socket> laVar4) {
        this.e = cls;
        this.f = laVar;
        this.g = laVar2;
        this.h = laVar3;
        this.i = laVar4;
    }
}
