package com.linecorp.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
@WorkerThread
public final class b {

    @NonNull
    private final String b;

    @NonNull
    private final SecureRandom d;

    @NonNull
    private final SecretKeyFactory e;

    @NonNull
    private final Cipher f;

    @NonNull
    private final Mac g;

    @Nullable
    private a h;

    @NonNull
    private final Object a = new Object();
    private final int c = 5000;

    public static class a {

        @NonNull
        public final SecretKey a;

        @NonNull
        public final SecretKey b;

        public a(@NonNull SecretKey secretKey, @NonNull SecretKey secretKey2) {
            this.a = secretKey;
            this.b = secretKey2;
        }
    }

    public b(@NonNull String str) {
        this.b = str;
        try {
            this.d = new SecureRandom();
            this.e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.g = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(@NonNull Context context) {
        synchronized (this.a) {
            if (this.h == null) {
                this.h = b(context);
            }
        }
    }

    @NonNull
    public final String b(@NonNull Context context, @NonNull String str) {
        String str2;
        synchronized (this.a) {
            a(context);
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, bArrDecode.length - 32, bArrDecode.length);
                this.g.init(this.h.b);
                this.g.update(bArrDecode, 0, bArrDecode.length - 32);
                if (!MessageDigest.isEqual(this.g.doFinal(), bArrCopyOfRange)) {
                    throw new com.linecorp.a.a.a.a("Cipher text has been tampered with.");
                }
                this.f.init(2, this.h.a, new IvParameterSpec(bArrDecode, 0, 16));
                str2 = new String(this.f.doFinal(bArrDecode, 16, (bArrDecode.length - 16) - 32), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (BadPaddingException e4) {
                throw new com.linecorp.a.a.a.a(e4);
            } catch (IllegalBlockSizeException e5) {
                e = e5;
                throw new RuntimeException(e);
            }
        }
        return str2;
    }

    @NonNull
    public final String a(@NonNull Context context, @NonNull String str) {
        String strEncodeToString;
        synchronized (this.a) {
            a(context);
            try {
                int blockSize = this.f.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.d.nextBytes(bArr);
                this.f.init(1, this.h.a, new IvParameterSpec(bArr));
                byte[] bArrDoFinal = this.f.doFinal(str.getBytes("UTF-8"));
                byte[] bArr2 = new byte[bArrDoFinal.length + blockSize + 32];
                System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                int i = blockSize + 0;
                System.arraycopy(bArrDoFinal, 0, bArr2, i, bArrDoFinal.length);
                this.g.init(this.h.b);
                this.g.update(bArr2, 0, blockSize + bArrDoFinal.length);
                byte[] bArrDoFinal2 = this.g.doFinal();
                System.arraycopy(bArrDoFinal2, 0, bArr2, i + bArrDoFinal.length, bArrDoFinal2.length);
                strEncodeToString = Base64.encodeToString(bArr2, 0);
            } catch (UnsupportedEncodingException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (BadPaddingException e4) {
                throw new com.linecorp.a.a.a.a(e4);
            } catch (IllegalBlockSizeException e5) {
                e = e5;
                throw new RuntimeException(e);
            }
        }
        return strEncodeToString;
    }

    @NonNull
    private a b(@NonNull Context context) {
        byte[] bArrDecode;
        String str = Build.MODEL + Build.MANUFACTURER + Build.SERIAL + Settings.Secure.getString(context.getContentResolver(), "android_id") + context.getPackageName();
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.b, 0);
        String string = sharedPreferences.getString("salt", null);
        if (!TextUtils.isEmpty(string)) {
            bArrDecode = Base64.decode(string, 0);
        } else {
            byte[] bArr = new byte[16];
            this.d.nextBytes(bArr);
            sharedPreferences.edit().putString("salt", Base64.encodeToString(bArr, 0)).apply();
            bArrDecode = bArr;
        }
        try {
            byte[] encoded = this.e.generateSecret(new PBEKeySpec(str.toCharArray(), bArrDecode, this.c, 512)).getEncoded();
            return new a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), com.huami.network.hmnetwork.utils.a.a), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }
}
