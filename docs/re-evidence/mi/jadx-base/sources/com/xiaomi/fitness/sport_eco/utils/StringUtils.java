package com.xiaomi.fitness.sport_eco.utils;

import com.xiaomi.fitness.common.utils.StringUtil;
import com.xiaomi.hm.health.baseutil.Language;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/StringUtils;", "", "<init>", "()V", "getSHA1Digest", "", "pInput", "getBytes", "", "s", "isBlank", "", Language.CS, "", "isNotBlank", "str", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringUtils {

    @NotNull
    public static final StringUtils INSTANCE = new StringUtils();

    private StringUtils() {
    }

    private final byte[] getBytes(String s) {
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = s.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            byte[] bytes2 = s.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return bytes2;
        }
    }

    @JvmStatic
    public static final boolean isBlank(@Nullable CharSequence cs) {
        return StringUtil.isBlank(cs);
    }

    @JvmStatic
    public static final boolean isNotBlank(@Nullable String str) {
        return StringUtil.isNotBlank(str);
    }

    @NotNull
    public final String getSHA1Digest(@NotNull String pInput) {
        Intrinsics.checkNotNullParameter(pInput, "pInput");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(getBytes(pInput));
            BigInteger bigInteger = new BigInteger(1, messageDigest.digest());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%1$040X", Arrays.copyOf(new Object[]{bigInteger}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
