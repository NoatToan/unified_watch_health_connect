package com.xiaomi.hm.health.bodyfat.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"", "", "hexStringToBytes", "", "defaultValue", "toIntValue", "bodyfat_midongRelease"}, k = 2, mv = {1, 5, 1})
public final class StringUtilsKt {
    @Nullable
    public static final byte[] hexStringToBytes(@NotNull String str) {
        int i = 0;
        if (str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length() / 2;
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                int i3 = i * 2;
                bArr[i] = (byte) Integer.parseInt(str.substring(i3, i3 + 2), 16);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return bArr;
    }

    public static final int toIntValue(@NotNull String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static /* synthetic */ int toIntValue$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return toIntValue(str, i);
    }
}
