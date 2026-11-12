package pz0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import o13.m;
import o13.t;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import po2.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpz0/b;", "Lokhttp3/Interceptor;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Interceptor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f141922d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f141923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f141924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f141925c;

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f141923a = applicationContext;
        final int i14 = 0;
        this.f141924b = m.b(new e23.a(this) { // from class: pz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f141921b;

            {
                this.f141921b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Signature signature;
                Signature signature2;
                int i15 = i14;
                b bVar = this.f141921b;
                switch (i15) {
                    case 0:
                        return bVar.f141923a.getPackageName();
                    default:
                        int i16 = b.f141922d;
                        try {
                            PackageManager packageManager = bVar.f141923a.getPackageManager();
                            Object value = bVar.f141924b.getValue();
                            value.getClass();
                            PackageInfo packageInfo = packageManager.getPackageInfo((String) value, 134217728);
                            packageInfo.getClass();
                            SigningInfo signingInfo = packageInfo.signingInfo;
                            byte[] byteArray = null;
                            if (signingInfo != null) {
                                if (signingInfo.hasMultipleSigners()) {
                                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                                    if (apkContentsSigners != null && (signature2 = (Signature) u.H(apkContentsSigners)) != null) {
                                        byteArray = signature2.toByteArray();
                                    }
                                } else {
                                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                                    if (signingCertificateHistory != null && (signature = (Signature) u.H(signingCertificateHistory)) != null) {
                                        byteArray = signature.toByteArray();
                                    }
                                }
                            }
                            if (byteArray == null) {
                                return "";
                            }
                            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(byteArray);
                            bArrDigest.getClass();
                            return u.O(bArrDigest, "", new o(19), 30);
                        } catch (Exception unused) {
                            return "";
                        }
                }
            }
        });
        final int i15 = 1;
        this.f141925c = m.b(new e23.a(this) { // from class: pz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f141921b;

            {
                this.f141921b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Signature signature;
                Signature signature2;
                int i16 = i15;
                b bVar = this.f141921b;
                switch (i16) {
                    case 0:
                        return bVar.f141923a.getPackageName();
                    default:
                        int i17 = b.f141922d;
                        try {
                            PackageManager packageManager = bVar.f141923a.getPackageManager();
                            Object value = bVar.f141924b.getValue();
                            value.getClass();
                            PackageInfo packageInfo = packageManager.getPackageInfo((String) value, 134217728);
                            packageInfo.getClass();
                            SigningInfo signingInfo = packageInfo.signingInfo;
                            byte[] byteArray = null;
                            if (signingInfo != null) {
                                if (signingInfo.hasMultipleSigners()) {
                                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                                    if (apkContentsSigners != null && (signature2 = (Signature) u.H(apkContentsSigners)) != null) {
                                        byteArray = signature2.toByteArray();
                                    }
                                } else {
                                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                                    if (signingCertificateHistory != null && (signature = (Signature) u.H(signingCertificateHistory)) != null) {
                                        byteArray = signature.toByteArray();
                                    }
                                }
                            }
                            if (byteArray == null) {
                                return "";
                            }
                            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(byteArray);
                            bArrDigest.getClass();
                            return u.O(bArrDigest, "", new o(19), 30);
                        } catch (Exception unused) {
                            return "";
                        }
                }
            }
        });
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        Object value = this.f141924b.getValue();
        value.getClass();
        return chain.proceed(builderNewBuilder.addHeader("X-Android-Package", (String) value).addHeader("X-Android-Cert", (String) this.f141925c.getValue()).build());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpz0/b$a;", "", "<init>", "()V", "", "HEADER_ANDROID_PACKAGE", "Ljava/lang/String;", "HEADER_ANDROID_CERT", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
