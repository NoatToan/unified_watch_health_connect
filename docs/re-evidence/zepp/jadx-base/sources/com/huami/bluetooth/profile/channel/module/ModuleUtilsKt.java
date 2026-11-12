package com.huami.bluetooth.profile.channel.module;

import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"", "", "offset", "findStringEndFlag", "", "sliceString", "len", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ModuleUtilsKt {
    public static final int findStringEndFlag(@NotNull byte[] bArr, int i) {
        int length;
        if (i >= 0 && i < bArr.length && i < (length = bArr.length)) {
            while (true) {
                int i2 = i + 1;
                if (bArr[i] == 0) {
                    return i;
                }
                if (i2 < length) {
                    i = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final String sliceString(@NotNull byte[] bArr, int i) {
        int iFindStringEndFlag;
        if (i < bArr.length && (iFindStringEndFlag = findStringEndFlag(bArr, i)) >= 0) {
            return sliceString(bArr, i, iFindStringEndFlag - i);
        }
        return null;
    }

    public static /* synthetic */ String sliceString$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return sliceString(bArr, i);
    }

    @Nullable
    public static final String sliceString(@NotNull byte[] bArr, int i, int i2) {
        if (i >= bArr.length) {
            return null;
        }
        if (i2 == 0) {
            return "";
        }
        if (i + i2 >= bArr.length) {
            return null;
        }
        return new String(bArr, i, i2, Charsets.UTF_8);
    }
}
