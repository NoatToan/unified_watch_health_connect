package com.huami.bluetooth.profile.channel.module.media;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007\u001a&\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003\"\u0016\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "low", "high", "", "twoBytesToUInt", "element", "startIndex", "", "data", "findFirstIndexOf", "stopIndex", "findStringEndIndex", "", "decodeToString", "EOF", "B", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class MeidaHelperKt {
    public static final byte EOF = 0;

    @NotNull
    public static final String decodeToString(@NotNull byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 - i];
        ArraysKt___ArraysJvmKt.copyInto(bArr, bArr2, 0, i, i2);
        return new String(bArr2, Charsets.UTF_8);
    }

    public static final int findFirstIndexOf(byte b, int i, @NotNull byte[] bArr) {
        return findFirstIndexOf(b, i, bArr.length, bArr);
    }

    public static final int findStringEndIndex(@NotNull byte[] bArr, int i) {
        return findFirstIndexOf((byte) 0, i, bArr);
    }

    public static final int twoBytesToUInt(byte b, byte b2) {
        return (b & 255) | ((b2 & 255) << 8);
    }

    public static final int findFirstIndexOf(byte b, int i, int i2, @NotNull byte[] bArr) {
        if (!(bArr.length == 0) && i <= i2 && i >= 0 && i2 <= bArr.length && i < i2) {
            while (true) {
                int i3 = i + 1;
                if (bArr[i] == b) {
                    return i;
                }
                if (i3 >= i2) {
                    break;
                }
                i = i3;
            }
        }
        return -1;
    }
}
