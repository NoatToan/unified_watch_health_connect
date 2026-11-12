package okhttp3.internal.platform.android;

import com.huawei.hms.network.embedded.y;
import defpackage.zcm;
import defpackage.zcp;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter;", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketFactoryClass", "Ljavax/net/ssl/SSLSocketFactory;", "paramClass", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "matchesSocketFactory", "", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "Companion", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        zcp.c(cls, "");
        zcp.c(cls2, "");
        zcp.c(cls3, "");
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sslSocketFactory) {
        zcp.c(sslSocketFactory, "");
        return this.sslSocketFactoryClass.isInstance(sslSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) throws IllegalAccessException {
        zcp.c(sslSocketFactory, "");
        Object fieldOrNull = Util.readFieldOrNull(sslSocketFactory, this.paramClass, "sslParameters");
        zcp.e(fieldOrNull);
        X509TrustManager x509TrustManager = (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", "packageName", "", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SocketAdapter buildIfSupported$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(str);
        }

        public final SocketAdapter buildIfSupported(String packageName) {
            zcp.c(packageName, "");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                zcp.e(cls, "");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                zcp.e(cls2, "");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                zcp.b((Object) cls3, "");
                return new StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (Exception e) {
                Platform.INSTANCE.get().log("unable to load android socket classes", 5, e);
                return null;
            }
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
