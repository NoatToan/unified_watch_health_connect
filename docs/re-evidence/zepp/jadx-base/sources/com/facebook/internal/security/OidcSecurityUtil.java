package com.facebook.internal.security;

import android.util.Base64;
import android.util.Log;
import com.alipay.sdk.m.n.d;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/security/OidcSecurityUtil;", "", "", "kid", "getRawKeyFromEndPoint", "key", "Ljava/security/PublicKey;", "getPublicKeyFromString", "publicKey", "data", "signature", "", "verify", "a", "Ljava/lang/String;", "getOPENID_KEYS_PATH", "()Ljava/lang/String;", "OPENID_KEYS_PATH", "SIGNATURE_ALGORITHM_SHA256", "", "TIMEOUT_IN_MILLISECONDS", "J", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class OidcSecurityUtil {

    @NotNull
    public static final String SIGNATURE_ALGORITHM_SHA256 = "SHA256withRSA";
    public static final long TIMEOUT_IN_MILLISECONDS = 5000;

    @NotNull
    public static final OidcSecurityUtil INSTANCE = new OidcSecurityUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ URL a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ReentrantLock d;
        public final /* synthetic */ Condition e;

        public a(URL url, Ref.ObjectRef objectRef, String str, ReentrantLock reentrantLock, Condition condition) {
            this.a = url;
            this.b = objectRef;
            this.c = str;
            this.d = reentrantLock;
            this.e = condition;
        }

        /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.String] */
        @Override // java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(this.a.openConnection());
                if (uRLConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    try {
                        Reader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), Charsets.UTF_8);
                        String text = TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                        httpURLConnection.getInputStream().close();
                        this.b.element = new JSONObject(text).optString(this.c);
                        httpURLConnection.disconnect();
                        reentrantLock = this.d;
                        reentrantLock.lock();
                        try {
                            this.e.signal();
                            Unit unit = Unit.INSTANCE;
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        ReentrantLock reentrantLock2 = this.d;
                        reentrantLock2.lock();
                        try {
                            this.e.signal();
                            Unit unit2 = Unit.INSTANCE;
                            throw th;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                } catch (Exception e) {
                    String name = OidcSecurityUtil.INSTANCE.getClass().getName();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    httpURLConnection.disconnect();
                    reentrantLock = this.d;
                    reentrantLock.lock();
                    try {
                        this.e.signal();
                        Unit unit3 = Unit.INSTANCE;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    private OidcSecurityUtil() {
    }

    @JvmStatic
    @NotNull
    public static final PublicKey getPublicKeyFromString(@NotNull String key) {
        return KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(Base64.decode(m.replace$default(m.replace$default(m.replace$default(key, "\n", "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final String getRawKeyFromEndPoint(@NotNull String kid) {
        URL url = new URL("https", "www." + FacebookSdk.getFacebookDomain(), OPENID_KEYS_PATH);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        FacebookSdk.getExecutor().execute(new a(url, objectRef, kid, reentrantLock, conditionNewCondition));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    @JvmStatic
    public static final boolean verify(@NotNull PublicKey publicKey, @NotNull String data, @NotNull String signature) {
        try {
            Signature signature2 = Signature.getInstance(SIGNATURE_ALGORITHM_SHA256);
            signature2.initVerify(publicKey);
            signature2.update(data.getBytes(Charsets.UTF_8));
            return signature2.verify(Base64.decode(signature, 8));
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final String getOPENID_KEYS_PATH() {
        return OPENID_KEYS_PATH;
    }
}
