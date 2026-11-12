package com.xiaomi.fitness.sport.route.detail.util;

import com.xiaomi.fitness.common.utils.ByteUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¨\u0006\b"}, d2 = {"hexToByteArray", "", "inHex", "", "hexToByte", "", "bytesToHex", "bytes", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HexUtilsKt {
    @NotNull
    public static final String bytesToHex(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bytes) {
            String hexString = Integer.toHexString(ByteUtilKt.and(b2, 255));
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte hexToByte(@NotNull String inHex) {
        Intrinsics.checkNotNullParameter(inHex, "inHex");
        return (byte) Integer.parseInt(inHex, CharsKt__CharJVMKt.checkRadix(16));
    }

    @NotNull
    public static final byte[] hexToByteArray(@NotNull String inHex) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(inHex, "inHex");
        int length = inHex.length();
        if (length % 2 == 1) {
            length++;
            bArr = new byte[length / 2];
            inHex = "0" + inHex;
        } else {
            bArr = new byte[length / 2];
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 2;
            String strSubstring = inHex.substring(i, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            bArr[i2] = hexToByte(strSubstring);
            i2++;
            i = i3;
        }
        return bArr;
    }
}
