package com.huawei.agconnect.common.platform;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.secure.android.common.ssl.SSLUtil;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes22.dex */
public class OkhttpAndroidPlatform extends Platform {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4845c = "OkhttpAndroidPlatform";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkhttpCloseGuard f4846a = OkhttpCloseGuard.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4847b;

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        try {
            return new SecureX509TrustManager(this.f4847b);
        } catch (Throwable unused) {
            Log.e("TAG", "new SecureX509TrustManager error");
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (this.f4846a.a(obj)) {
            return;
        }
        log(5, str, (Throwable) null);
    }

    public void log(int i, String str, Throwable th) {
        super.log(i, str, th);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        return super.isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
        return this.f4846a.a(str);
    }

    public SSLContext getSSLContext() {
        try {
            return SSLUtil.setSSLContext();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("get TLS provider error", e);
        }
    }

    static final class OkhttpAndroidTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f4850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f4851b;

        public int hashCode() {
            return (this.f4851b.hashCode() * 31) + this.f4850a.hashCode();
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f4851b.invoke(this.f4850a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OkhttpAndroidTrustRootIndex)) {
                return false;
            }
            OkhttpAndroidTrustRootIndex okhttpAndroidTrustRootIndex = (OkhttpAndroidTrustRootIndex) obj;
            return this.f4850a.equals(okhttpAndroidTrustRootIndex.f4850a) && this.f4851b.equals(okhttpAndroidTrustRootIndex.f4851b);
        }

        OkhttpAndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f4851b = method;
            this.f4850a = x509TrustManager;
        }
    }

    static final class OkhttpCloseGuard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f4852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f4853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f4854c;

        boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.f4854c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception e) {
                    Logger.e(OkhttpAndroidPlatform.f4845c, e.getMessage());
                }
            }
            return false;
        }

        Object a(String str) {
            Method method = this.f4852a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f4853b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception e) {
                    Logger.e(OkhttpAndroidPlatform.f4845c, e.getMessage());
                }
            }
            return null;
        }

        static OkhttpCloseGuard a() {
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
            return new OkhttpCloseGuard(method, method3, method2);
        }

        OkhttpCloseGuard(Method method, Method method2, Method method3) {
            this.f4852a = method;
            this.f4853b = method2;
            this.f4854c = method3;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    static final class OkHttpCertificateChainCleaner extends CertificateChainCleaner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f4848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f4849b;

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object obj) {
            return obj instanceof OkHttpCertificateChainCleaner;
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public List<Certificate> clean(List<Certificate> list, String str) {
            try {
                return (List) this.f4849b.invoke(this.f4848a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), JceNames.RSA, str);
            } catch (Throwable unused) {
                return null;
            }
        }

        OkHttpCertificateChainCleaner(Object obj, Method method) {
            this.f4848a = obj;
            this.f4849b = method;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new OkhttpAndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new OkHttpCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    public OkhttpAndroidPlatform(Context context) {
        this.f4847b = context;
    }
}
