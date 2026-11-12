package com.xiaomi.fit.fitness.persist.utils;

import android.util.Base64;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/utils/AESCoder;", "", "aesKey", "", "<init>", "([B)V", "", "(Ljava/lang/String;)V", "TAG", "getTAG", "()Ljava/lang/String;", "AES_ALGORITHM", "getAES_ALGORITHM", "base64Flag", "", "keySpec", "Ljavax/crypto/spec/SecretKeySpec;", "decrypt", "base64EncodeData", "cipherData", "getInitialVector", "encrypt", "rawData", "encryptToString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AESCoder {

    @NotNull
    private final String AES_ALGORITHM;

    @NotNull
    private final String TAG;
    private final int base64Flag;

    @Nullable
    private SecretKeySpec keySpec;

    public AESCoder(@NotNull byte[] aesKey) {
        Intrinsics.checkNotNullParameter(aesKey, "aesKey");
        this.TAG = com.xiaomi.accountsdk.utils.AESCoder.TAG;
        this.AES_ALGORITHM = "AES/CBC/PKCS5Padding";
        this.base64Flag = 11;
        if (aesKey.length != 16) {
            FitnessLogUtils.e(com.xiaomi.accountsdk.utils.AESCoder.TAG, "aesKey is invalid");
        }
        this.keySpec = new SecretKeySpec(aesKey, "AES");
    }

    private final byte[] getInitialVector() {
        byte[] bytes = "1234567887654321".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Nullable
    public final byte[] decrypt(@NotNull String base64EncodeData) {
        Intrinsics.checkNotNullParameter(base64EncodeData, "base64EncodeData");
        try {
            byte[] bArrDecode = Base64.decode(base64EncodeData, this.base64Flag);
            Intrinsics.checkNotNull(bArrDecode);
            return decrypt(bArrDecode);
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "decrypt", e);
            return null;
        }
    }

    @Nullable
    public final byte[] encrypt(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        try {
            Cipher cipher = Cipher.getInstance(this.AES_ALGORITHM);
            cipher.init(1, this.keySpec, new IvParameterSpec(getInitialVector()));
            return cipher.doFinal(rawData);
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "encrypt", e);
            return null;
        }
    }

    @Nullable
    public final String encryptToString(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        byte[] bArrEncrypt = encrypt(rawData);
        if (bArrEncrypt == null) {
            return null;
        }
        return Base64.encodeToString(bArrEncrypt, this.base64Flag);
    }

    @NotNull
    public final String getAES_ALGORITHM() {
        return this.AES_ALGORITHM;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Nullable
    public final byte[] decrypt(@NotNull byte[] cipherData) {
        Intrinsics.checkNotNullParameter(cipherData, "cipherData");
        try {
            Cipher cipher = Cipher.getInstance(this.AES_ALGORITHM);
            cipher.init(2, this.keySpec, new IvParameterSpec(getInitialVector()));
            return cipher.doFinal(cipherData);
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "decrypt", e);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AESCoder(@NotNull String aesKey) {
        Intrinsics.checkNotNullParameter(aesKey, "aesKey");
        byte[] bArrDecode = Base64.decode(aesKey, 8);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        this(bArrDecode);
    }
}
