package com.huawei.hms.network.embedded;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
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
public class ha extends ma {
    public static final int l = 4000;
    public final Class<?> e;
    public final Class<?> f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final b k = b.a();

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
        if (!this.f.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.i.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if ("ssl == null".equals(e2.getMessage())) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public ta b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(SSLSocket sSLSocket, String str, List<r7> list) throws IOException {
        if (this.f.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.g.invoke(sSLSocket, true);
                    this.h.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.j.invoke(sSLSocket, ma.b(list));
        }
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
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // com.huawei.hms.network.embedded.ma
    public void a(String str, Object obj) {
        if (this.k.a(obj)) {
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
    @Nullable
    public Object a(String str) {
        return this.k.a(str);
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

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f14883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f14884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f14885c;

        public boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.f14885c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public Object a(String str) {
            Method method = this.f14883a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f14884b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public static b a() {
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
            return new b(method, method3, method2);
        }

        public b(Method method, Method method2, Method method3) {
            this.f14883a = method;
            this.f14884b = method2;
            this.f14885c = method3;
        }
    }

    public static final class c implements ta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f14886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f14887b;

        public int hashCode() {
            return this.f14886a.hashCode() + (this.f14887b.hashCode() * 31);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f14886a.equals(cVar.f14886a) && this.f14887b.equals(cVar.f14887b);
        }

        @Override // com.huawei.hms.network.embedded.ta
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f14887b.invoke(this.f14886a, x509Certificate);
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

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f14887b = method;
            this.f14886a = x509TrustManager;
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
        public final Object f14881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f14882b;

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        @Override // com.huawei.hms.network.embedded.qa
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f14882b.invoke(this.f14881a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), JceNames.RSA, str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public a(Object obj, Method method) {
            this.f14881a = obj;
            this.f14882b = method;
        }
    }

    @Nullable
    public static ma i() {
        if (!ma.g()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new ha(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
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

    public ha(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.e = cls;
        this.f = cls2;
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = method4;
    }
}
