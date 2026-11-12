package com.xiaomi.fit.fitness.persist.utils;

import android.util.Base64;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/utils/HashCoder;", "", "<init>", "()V", "TAG", "", "hash4SHA1", "plain", "base64Flags", "", "", "plainBytes", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HashCoder {

    @NotNull
    public static final HashCoder INSTANCE = new HashCoder();

    @NotNull
    private static final String TAG = "HashCoder";

    private HashCoder() {
    }

    @Nullable
    public final String hash4SHA1(@NotNull String plain, int base64Flags) {
        Intrinsics.checkNotNullParameter(plain, "plain");
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = plain.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrHash4SHA1 = hash4SHA1(bytes);
            if (bArrHash4SHA1 != null) {
                return Base64.encodeToString(bArrHash4SHA1, base64Flags);
            }
            FitnessLogUtils.w(TAG, "hash4SHA1 failed");
            return null;
        } catch (UnsupportedEncodingException e) {
            FitnessLogUtils.INSTANCE.w(TAG, "hash4SHA1", e);
            throw new IllegalStateException("failed to SHA1");
        }
    }

    private final byte[] hash4SHA1(byte[] plainBytes) {
        if (plainBytes.length == 0) {
            return null;
        }
        try {
            return MessageDigest.getInstance("SHA1").digest(plainBytes);
        } catch (NoSuchAlgorithmException e) {
            FitnessLogUtils.INSTANCE.w(TAG, "hash4SHA1", e);
            throw new IllegalStateException("failed to SHA1");
        }
    }
}
