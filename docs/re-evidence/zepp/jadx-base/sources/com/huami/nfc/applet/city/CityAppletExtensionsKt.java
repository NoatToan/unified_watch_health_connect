package com.huami.nfc.applet.city;

import com.huami.nfc.applet.BalanceException;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.applet.OverdraftException;
import com.huami.nfc.base.ApduNotResponseException;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0005H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0005H\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0005\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0005\u001a\f\u0010\f\u001a\u00020\n*\u00020\u0005H\u0000\u001a\n\u0010\r\u001a\u00020\n*\u00020\u0005\u001a\n\u0010\u000e\u001a\u00020\u0005*\u00020\b\u001a\u0012\u0010\u0011\u001a\u00020\u0010*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\u0005H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0010*\u00020\u0005H\u0000\u001a\u0012\u0010\u0014\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005\u001a\n\u0010\u0014\u001a\u00020\u0005*\u00020\u0010¨\u0006\u0015"}, d2 = {"", "amount", "overdraft", "", "checkBalance", "", "toAmount", "toDecimal", "", "toBytes", "", "isSuccess", "isLastRecord", "matchZero", "toApduScript", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "toTimestamp", "activationDate", "expiredDate", "toDateString", "nfc-applet_release"}, k = 2, mv = {1, 5, 1})
public final class CityAppletExtensionsKt {
    public static final long activationDate(@NotNull String str) {
        return toTimestamp(str, "yyyyMMdd");
    }

    public static final void checkBalance(int i, int i2) throws OverdraftException, BalanceException {
        if (Math.abs(i) > 0 && Math.abs(i2) > 0) {
            throw new BalanceException(i, i2);
        }
        if (i2 < 0) {
            throw new OverdraftException(i, i2);
        }
    }

    public static final long expiredDate(@NotNull String str) {
        long timestamp = toTimestamp(str, "yyyyMMdd");
        return timestamp > 0 ? timestamp + ((long) 86399999) : timestamp;
    }

    public static final boolean isLastRecord(@NotNull String str) {
        return matchZero(StringsKt___StringsKt.dropLast(str, 4));
    }

    public static final boolean isSuccess(@NotNull String str) {
        return m.endsWith$default(str, "9000", false, 2, null);
    }

    public static final boolean matchZero(@NotNull String str) {
        return Pattern.matches("[0]*", str);
    }

    public static final int toAmount(@NotNull String str) {
        return toDecimal(str);
    }

    @NotNull
    public static final String toApduScript(@NotNull byte[] bArr) throws ApduNotResponseException {
        if (bArr.length == 0) {
            throw new ApduNotResponseException();
        }
        return Hex.bytesToHexString(bArr);
    }

    @NotNull
    public static final byte[] toBytes(@NotNull String str) {
        return Hex.hexStringToBytes(str);
    }

    @NotNull
    public static final String toDateString(long j, @NotNull String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(j));
    }

    public static final int toDecimal(@NotNull String str) {
        return Integer.parseInt(str, 16);
    }

    public static final long toTimestamp(@NotNull String str, @NotNull String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
            if (Intrinsics.areEqual(toDateString(simpleDateFormat.parse(str).getTime(), str2), str)) {
                return simpleDateFormat.parse(str).getTime();
            }
            return -1L;
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @NotNull
    public static final String toDateString(long j) {
        return toDateString(j, TrainingDateUtils.PATTERN_YMD_HMSS);
    }
}
