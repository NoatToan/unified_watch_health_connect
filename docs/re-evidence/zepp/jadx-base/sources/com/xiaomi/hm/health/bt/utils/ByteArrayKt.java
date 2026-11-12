package com.xiaomi.hm.health.bt.utils;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a*\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b\u001a\n\u0010\f\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\r\u001a\u00020\u0000*\u00020\u0004\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0010"}, d2 = {"", "", "offset", "maxBytes", "", "toString", "Lkotlin/Pair;", "toStringAndIndex", "", "ignoreContinuousEnd", "", "toStrings", "toHexString", "hexToBytes", "subArrayWithoutFirstTwoElement", "subArrayWithoutFirstElement", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ByteArrayKt {
    @NotNull
    public static final byte[] hexToBytes(@NotNull String str) {
        return GattUtils.hexStringToBytes(m.replace$default(str, " ", "", false, 4, (Object) null));
    }

    @NotNull
    public static final byte[] subArrayWithoutFirstElement(@NotNull byte[] bArr) {
        int length = bArr.length;
        return ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr.length - 1));
    }

    @NotNull
    public static final byte[] subArrayWithoutFirstTwoElement(@NotNull byte[] bArr) {
        int length = bArr.length;
        return ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(2, bArr.length - 1));
    }

    @NotNull
    public static final String toHexString(@NotNull byte[] bArr) {
        return bArr.length == 0 ? "" : m.replace$default(GattUtils.bytesToHexString(bArr), " ", "", false, 4, (Object) null);
    }

    @NotNull
    public static final String toString(@NotNull byte[] bArr, int i, int i2) {
        if (i > bArr.length) {
            return "";
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2 > 0 ? Math.min(i2 + i, bArr.length) : bArr.length);
        int length = bArrCopyOfRange.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (bArrCopyOfRange[i3] == 0) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrCopyOfRange, 0, i3);
        }
        return new String(bArrCopyOfRange, Charsets.UTF_8);
    }

    public static /* synthetic */ String toString$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return toString(bArr, i, i2);
    }

    @NotNull
    public static final Pair<String, Integer> toStringAndIndex(@NotNull byte[] bArr, int i, int i2) {
        if (i >= bArr.length) {
            return new Pair<>("", 0);
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2 > 0 ? Math.min(i2 + i, bArr.length) : bArr.length);
        int length = bArrCopyOfRange.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (bArrCopyOfRange[i3] == 0) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrCopyOfRange, 0, i3);
        }
        return new Pair<>(new String(bArrCopyOfRange, Charsets.UTF_8), Integer.valueOf(i3));
    }

    public static /* synthetic */ Pair toStringAndIndex$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return toStringAndIndex(bArr, i, i2);
    }

    @NotNull
    public static final List<String> toStrings(@NotNull byte[] bArr, int i, int i2, boolean z) {
        if (i > bArr.length) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2 > 0 ? Math.min(i2 + i, bArr.length) : bArr.length);
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt__StringsKt.split$default((CharSequence) GattUtils.bytesToHexString(bArrCopyOfRange), new String[]{"00"}, false, 0, 6, (Object) null)) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            if (!(StringsKt__StringsKt.trim(str).toString().length() == 0)) {
                byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(m.replace$default(str, " ", "", false, 4, (Object) null));
                arrayList.add(toString(bArrHexStringToBytes, 0, bArrHexStringToBytes.length));
            } else if (!z) {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List toStrings$default(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return toStrings(bArr, i, i2, z);
    }
}
