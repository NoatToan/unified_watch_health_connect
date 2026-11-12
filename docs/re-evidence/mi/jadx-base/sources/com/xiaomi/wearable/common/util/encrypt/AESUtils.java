package com.xiaomi.wearable.common.util.encrypt;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Base64;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.mbd;
import defpackage.u9j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\n\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0005H\u0003J\u0018\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005J\u0018\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005J\u001a\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u001aJ\u0014\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002R\u001b\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/wearable/common/util/encrypt/AESUtils;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "Ljava/lang/String;", "CipherMode", "initVector", "KEY_SIZE", "", "secretKeySpec", "Ljavax/crypto/spec/SecretKeySpec;", "getSecretKeySpec", "()Ljavax/crypto/spec/SecretKeySpec;", "setSecretKeySpec", "(Ljavax/crypto/spec/SecretKeySpec;)V", "encryptFile", "", "sourceFilePath", "targetFilePath", "password", "shortToBytes", "", RealNameWebViewActivity.NUMBER, "", "deriveKeyInsecurely", "SHA1_PRNG", "fixSmallVersion", "encrypt", "data", "key", "desEncrypt", "generateKey", "keySeed", "CryptoProvider", "crypt_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AESUtils {

    @Nullable
    private static SecretKeySpec secretKeySpec;

    @NotNull
    public static final AESUtils INSTANCE = new AESUtils();
    private static final String TAG = AESUtils.class.getSimpleName();

    @NotNull
    private static final String CipherMode = "AES/CBC/PKCS5Padding";

    @NotNull
    private static final String initVector = "A-16-Byte-String";
    private static final int KEY_SIZE = 32;

    @NotNull
    private static final String SHA1_PRNG = "SHA1PRNG";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/wearable/common/util/encrypt/AESUtils$CryptoProvider;", "Ljava/security/Provider;", "<init>", "()V", "crypt_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CryptoProvider extends Provider {
        public CryptoProvider() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }

        @Override // java.security.Provider, java.util.Hashtable, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Object> getValues() {
            return super.values();
        }

        @Override // java.security.Provider, java.util.Hashtable, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.security.Provider, java.util.Hashtable, java.util.Map
        public final /* bridge */ Collection<Object> values() {
            return getValues();
        }
    }

    private AESUtils() {
    }

    private final SecretKeySpec deriveKeyInsecurely(String password) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = password.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new SecretKeySpec(mbd.b(bytes, KEY_SIZE), "AES");
    }

    @SuppressLint({"DeletedProvider"})
    private final SecretKeySpec fixSmallVersion(String password) throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = SecureRandom.getInstance(SHA1_PRNG, new CryptoProvider());
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = password.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        secureRandom.setSeed(bytes);
        keyGenerator.init(KEY_SIZE * 8, secureRandom);
        return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES");
    }

    private final SecretKeySpec generateKey(byte[] keySeed) {
        if (keySeed == null) {
            return null;
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(keySeed);
            keyGenerator.init(KEY_SIZE, secureRandom);
            return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final String desEncrypt(@NotNull String data, @NotNull String key) throws Exception {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = key.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return desEncrypt(data, bytes);
    }

    @Nullable
    public final String encrypt(@NotNull String data, @NotNull String key) throws Exception {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Cipher cipher = Cipher.getInstance(CipherMode);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = key.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            cipher.init(1, new SecretKeySpec(bytes, "AES"));
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes2 = data.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return Base64.encodeToString(cipher.doFinal(bytes2), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: IOException -> 0x00ab, TRY_LEAVE, TryCatch #9 {IOException -> 0x00ab, blocks: (B:36:0x00a7, B:40:0x00af), top: B:60:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[Catch: IOException -> 0x00be, TRY_LEAVE, TryCatch #8 {IOException -> 0x00be, blocks: (B:46:0x00ba, B:50:0x00c2), top: B:58:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final boolean encryptFile(@Nullable String sourceFilePath, @Nullable String targetFilePath, @NotNull String password) throws Throwable {
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(password, "password");
        FileInputStream fileInputStream = null;
        try {
            String str = initVector;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes);
            SecretKeySpec secretKeySpecDeriveKeyInsecurely = Build.VERSION.SDK_INT >= 28 ? deriveKeyInsecurely(password) : fixSmallVersion(password);
            secretKeySpec = secretKeySpecDeriveKeyInsecurely;
            Cipher cipher = Cipher.getInstance(CipherMode);
            cipher.init(1, secretKeySpecDeriveKeyInsecurely, ivParameterSpec);
            byte[] encoded = secretKeySpecDeriveKeyInsecurely.getEncoded();
            if (encoded == null) {
                return false;
            }
            File file = new File(sourceFilePath);
            File file2 = new File(targetFilePath);
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, true);
                try {
                    fileOutputStream.write(u9j.a(encoded, u9j.b("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCaVoKfa8xcNfD+az990c55pmaENDcRiP7p3wqAEYdPMUWblXUwkFysnoHgpUooWlvQK/XYLxbzDJJv3bWGiMvaM6vJep6ow/NHAxUXmslm0SLIZTXXNIaHqzFwx6mi3B+cL02QP0YwC3XwBTuScvFeVncRRxWxIuU1sUzUdKCgPwIDAQAB")));
                    byte[] bArr = new byte[1024];
                    while (fileInputStream2.read(bArr) != -1) {
                        byte[] bArrDoFinal = cipher.doFinal(bArr);
                        int length = bArrDoFinal.length;
                        fileOutputStream.write(shortToBytes((short) length), 0, 2);
                        fileOutputStream.write(bArrDoFinal, 0, length);
                        fileOutputStream.flush();
                    }
                    try {
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return false;
                        }
                    }
                    if (fileOutputStream != null) {
                        return false;
                    }
                    fileOutputStream.close();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            e.printStackTrace();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                return false;
            }
            fileOutputStream.close();
            return false;
        } catch (Throwable th4) {
            th = th4;
            if (fileInputStream != null) {
                fileInputStream.close();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } else if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    @Nullable
    public final SecretKeySpec getSecretKeySpec() {
        return secretKeySpec;
    }

    public final String getTAG() {
        return TAG;
    }

    public final void setSecretKeySpec(@Nullable SecretKeySpec secretKeySpec2) {
        secretKeySpec = secretKeySpec2;
    }

    @Nullable
    public final byte[] shortToBytes(short number) {
        byte[] bArr = new byte[2];
        int i = 0;
        int i2 = number;
        while (i < 2) {
            bArr[i] = (byte) i2;
            i++;
            i2 >>= 8;
        }
        return bArr;
    }

    @Nullable
    public final String desEncrypt(@NotNull String data, @Nullable byte[] key) throws Exception {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = data.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Cipher cipher = Cipher.getInstance(CipherMode);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(key, "AES");
            String str = initVector;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes2 = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            cipher.init(2, secretKeySpec2, new IvParameterSpec(bytes2));
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            Intrinsics.checkNotNull(bArrDoFinal);
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return new String(bArrDoFinal, UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
