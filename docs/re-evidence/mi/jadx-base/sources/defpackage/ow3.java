package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.security.keystore.KeyGenParameterSpec;
import androidx.collection.ArrayMap;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes7.dex */
public class ow3 {
    public static final byte[] d = "personalization".getBytes(StandardCharsets.UTF_8);
    public static final Map<String, ow3> e = new ArrayMap();
    public static String f;
    public static String g;
    public static SharedPreferences h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f29750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29751b;
    public boolean c;

    public static class a implements jw3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f29753b;
        public Cipher c;
        public Cipher d;
        public Key e;

        public a(String str, Key key, byte[] bArr) {
            this.f29752a = str;
            this.e = key;
            Objects.requireNonNull(bArr);
            this.f29753b = bArr;
        }

        @Override // defpackage.jw3
        public byte[] a(byte[] bArr) throws CipherException {
            try {
                return e().doFinal(bArr);
            } catch (Exception e) {
                throw new CipherException("Encrypt fail", e);
            }
        }

        @Override // defpackage.jw3
        public byte[] b(byte[] bArr) throws CipherException {
            try {
                return d().doFinal(bArr);
            } catch (Exception e) {
                throw new CipherException("Decrypt fail", e);
            }
        }

        public final Cipher c(boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Cipher cipher = Cipher.getInstance(this.f29752a);
            cipher.init(z ? 1 : 2, this.e, new IvParameterSpec(this.f29753b));
            return cipher;
        }

        public Cipher d() {
            Cipher cipher = this.d;
            if (cipher != null) {
                return cipher;
            }
            try {
                synchronized (this) {
                    try {
                        Cipher cipher2 = this.d;
                        if (cipher2 != null) {
                            return cipher2;
                        }
                        Cipher cipherC = c(false);
                        this.d = cipherC;
                        return cipherC;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Initialize decrypt fail", e);
            }
        }

        public Cipher e() {
            Cipher cipher = this.c;
            if (cipher != null) {
                return cipher;
            }
            try {
                synchronized (this) {
                    try {
                        Cipher cipher2 = this.c;
                        if (cipher2 != null) {
                            return cipher2;
                        }
                        Cipher cipherC = c(true);
                        this.c = cipherC;
                        return cipherC;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Initialize encrypt fail", e);
            }
        }
    }

    public ow3(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
            keyStore.load(null);
            SecretKey secretKeyC = (SecretKey) keyStore.getKey(str, null);
            if (secretKeyC == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("create new key for ");
                sb.append(str);
                secretKeyC = c(str);
                this.c = true;
            }
            this.f29750a = secretKeyC;
            this.f29751b = str;
        } catch (Exception e2) {
            throw new IllegalStateException("Initialize CipherProvider fail", e2);
        }
    }

    public static SecretKey c(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", IECDHAlgorithm.KEY_STORE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setKeySize(128).setDigests(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, "SHA-512").setRandomizedEncryptionRequired(false).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build());
        return keyGenerator.generateKey();
    }

    public static String d() {
        if (g == null) {
            String string = h.getString("bd", null);
            if (string == null) {
                string = Build.BRAND;
                h.edit().putString("bd", string).apply();
            }
            g = string;
        }
        return g;
    }

    public static ow3 f() {
        return g(null);
    }

    public static ow3 g(String str) {
        ow3 ow3Var;
        String lowerCase = (str == null || str.trim().length() == 0) ? "key_provider" : str.trim().toLowerCase();
        Map<String, ow3> map = e;
        ow3 ow3Var2 = map.get(lowerCase);
        if (ow3Var2 != null) {
            return ow3Var2;
        }
        synchronized (map) {
            try {
                ow3Var = map.get(lowerCase);
                if (ow3Var == null) {
                    ow3Var = new ow3(lowerCase);
                    map.put(lowerCase, ow3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ow3Var;
    }

    public static String h() {
        if (f == null) {
            String string = h.getString("id", null);
            if (string == null) {
                string = String.valueOf(Process.myUid());
                h.edit().putString("id", string).apply();
            }
            f = string;
        }
        return f;
    }

    public static void i(Context context) {
        h = context.getSharedPreferences(".cpf", 0);
    }

    public static byte[] k(byte[] bArr, byte[]... bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            if (bArr.length > 128) {
                throw new IllegalStateException("Personalisation too long");
            }
            messageDigest.update(Arrays.copyOf(bArr, 128));
            for (byte[] bArr3 : bArr2) {
                messageDigest.update(bArr3);
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("NoSuchAlgorithmException for SHA-512", e2);
        }
    }

    public jw3 a(byte[] bArr) {
        return new a("AES/CBC/PKCS7Padding", this.f29750a, e(bArr, false));
    }

    public jw3 b(byte[] bArr) {
        return new a("AES/CBC/PKCS7Padding", this.f29750a, e(bArr, true));
    }

    public final byte[] e(byte[] bArr, boolean z) {
        byte[] bArrK;
        if (z) {
            String strH = h();
            String strD = d();
            if (strH == null || strD == null) {
                throw new IllegalStateException("you need initialize first.");
            }
            byte[] bArr2 = d;
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = strH.getBytes(charset);
            byte[] bytes2 = strD.getBytes(charset);
            byte[] bytes3 = this.f29751b.getBytes(charset);
            Objects.requireNonNull(bArr);
            bArrK = k(bArr2, bytes, bytes2, bytes3, bArr);
        } else {
            byte[] bArr3 = d;
            byte[] bytes4 = this.f29751b.getBytes(StandardCharsets.UTF_8);
            Objects.requireNonNull(bArr);
            bArrK = k(bArr3, bytes4, bArr);
        }
        return Arrays.copyOfRange(bArrK, 0, 16);
    }

    public boolean j() {
        return this.c;
    }
}
