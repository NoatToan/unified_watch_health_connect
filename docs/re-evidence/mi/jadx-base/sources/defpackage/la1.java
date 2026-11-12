package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes5.dex */
public final class la1 implements q1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyStore f24817b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24818a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public KeyStore f24819b;

        public b() {
            this.f24819b = null;
            if (!la1.f()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
                this.f24819b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }

        public la1 a() {
            return new la1(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.f24819b = keyStore;
            return this;
        }
    }

    public static void d(String str) throws GeneralSecurityException {
        if (new la1().e(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String strB = fnq.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", IECDHAlgorithm.KEY_STORE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static boolean f() {
        return true;
    }

    public static xu0 g(xu0 xu0Var) throws GeneralSecurityException {
        byte[] bArrC = mbj.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrC, xu0Var.b(xu0Var.a(bArrC, bArr), bArr))) {
            return xu0Var;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // defpackage.q1e
    public synchronized boolean a(String str) {
        String str2 = this.f24816a;
        if (str2 == null || !str2.equals(str)) {
            return this.f24816a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // defpackage.q1e
    public synchronized xu0 b(String str) throws GeneralSecurityException {
        try {
            String str2 = this.f24816a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f24816a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(new ka1(fnq.b("android-keystore://", str), this.f24817b));
    }

    public synchronized boolean e(String str) throws GeneralSecurityException {
        String strB;
        strB = fnq.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
                this.f24817b = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f24817b.containsAlias(strB);
        }
        return this.f24817b.containsAlias(strB);
    }

    public la1() throws GeneralSecurityException {
        this(new b());
    }

    public la1(b bVar) {
        this.f24816a = bVar.f24818a;
        this.f24817b = bVar.f24819b;
    }
}
