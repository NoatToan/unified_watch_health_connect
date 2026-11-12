package com.xiaomi.fitness.common.utils;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.statistics.StatConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0007J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0007J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0007J\"\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u0007H\u0007J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0019H\u0007J\"\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\u0007H\u0007J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0018\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0007H\u0002J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020%H\u0007J\u001a\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0005J&\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u00052\b\u00101\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00102\u001a\u00020\u0007H\u0007J#\u00103\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u0007H\u0087\u0002J$\u00105\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0007J*\u00107\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007J\"\u0010:\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u00102\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0015J\u0016\u0010<\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0015J\u0016\u0010>\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0015J\u0014\u0010A\u001a\u0004\u0018\u00010\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010A\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0007J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u000eH\u0007J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020HH\u0002J\u0016\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ByteUtil;", "", "<init>", "()V", "EMPTY_BYTES", "", "BYTE_MAX", "", "isEmpty", "", "bytes", "getNonEmptyByte", "trimLast", "byteToString", "", "bytesToHex", "formatted", "stringToBytes", "text", "byteToInt", PluginDeviceInfo.FDESC, "", "isAllFF", "fromShort", "n", "", "toShort", StatConstants.PARAM_START, "littleEndian", "fromInt", "length", "toInt", "shortToUInt", "short", "shortToInt", "index", "getIntFor4Bytes", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "requireBytesAvailable", "", "bytesCount", "fromLong", "byteEquals", "lbytes", "rbytes", "equals", "array1", "array2", "len", "get", "offset", "getBytes", StatConstants.PARAM_END, "copy", "lstart", "rstart", "fillBeforeBytes", "fill", "cutBeforeBytes", "cut", "cutAfterBytes", "HEX_DIGITS", "", "bytesToHexString", "data", "array", "hexStringToBytes", "hexString", "toByte", PluginDeviceInfo.FICONON, "", "merger", "bt1", "bt2", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nByteUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteUtil.kt\ncom/xiaomi/fitness/common/utils/ByteUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n1802#2,6:390\n1#3:396\n*S KotlinDebug\n*F\n+ 1 ByteUtil.kt\ncom/xiaomi/fitness/common/utils/ByteUtil\n*L\n25#1:390,6\n*E\n"})
public final class ByteUtil {
    public static final int BYTE_MAX = 255;

    @NotNull
    public static final ByteUtil INSTANCE = new ByteUtil();

    @JvmField
    @NotNull
    public static final byte[] EMPTY_BYTES = new byte[0];

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private ByteUtil() {
    }

    @JvmStatic
    public static final int byteToInt(byte b2) {
        return b2 & 255;
    }

    @JvmStatic
    @NotNull
    public static final String byteToString(@Nullable byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty(bytes)) {
            Intrinsics.checkNotNull(bytes);
            for (byte b2 : bytes) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                sb.append(str);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    @NotNull
    public static final String bytesToHex(@NotNull byte[] bytes, boolean formatted) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        char[] cArr = new char[bytes.length * (formatted ? 3 : 2)];
        int i = 0;
        for (byte b2 : bytes) {
            cArr[i] = "0123456789ABCDEF".charAt((b2 & 255) >>> 4);
            int i2 = i + 2;
            cArr[i + 1] = "0123456789ABCDEF".charAt(b2 & 15);
            if (formatted) {
                i += 3;
                cArr[i2] = ',';
            } else {
                i = i2;
            }
        }
        return new String(cArr);
    }

    public static /* synthetic */ String bytesToHex$default(byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return bytesToHex(bArr, z);
    }

    @JvmStatic
    @Nullable
    public static final String bytesToHexString(@Nullable byte[] data) {
        if (data == null) {
            return null;
        }
        return bytesToHexString(data, 0, data.length);
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean equals(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        return equals$default(bArr, bArr2, 0, 4, null);
    }

    public static /* synthetic */ boolean equals$default(byte[] bArr, byte[] bArr2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            Intrinsics.checkNotNull(bArr);
            int length = bArr.length;
            Intrinsics.checkNotNull(bArr2);
            i = Math.min(length, bArr2.length);
        }
        return equals(bArr, bArr2, i);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final byte[] fromInt(int i, boolean z) {
        return fromInt$default(i, z, 0, 4, null);
    }

    public static /* synthetic */ byte[] fromInt$default(int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 4;
        }
        return fromInt(i, z, i2);
    }

    @JvmStatic
    @NotNull
    public static final byte[] fromLong(long n) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (n >>> (i * 8));
        }
        return bArr;
    }

    @JvmStatic
    @NotNull
    public static final byte[] fromShort(short n) {
        return new byte[]{(byte) n, (byte) ByteUtilKt.ushr(n, 8)};
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final byte[] get(@NotNull byte[] bytes, int i) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return get$default(bytes, i, 0, 4, null);
    }

    public static /* synthetic */ byte[] get$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return get(bArr, i, i2);
    }

    @JvmStatic
    @Nullable
    public static final byte[] getBytes(@Nullable byte[] bytes, int start, int end) {
        byte[] bArr = null;
        if (bytes == null) {
            return null;
        }
        if (start >= 0 && start < bytes.length && end >= 0 && end < bytes.length) {
            if (start <= end) {
                bArr = new byte[(end - start) + 1];
                if (start <= end) {
                    int i = start;
                    while (true) {
                        bArr[i - start] = bytes[i];
                        if (i == end) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                return null;
            }
        }
        return bArr;
    }

    @JvmStatic
    @NotNull
    public static final byte[] hexStringToBytes(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        int length = hexString.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            ByteUtil byteUtil = INSTANCE;
            bArr[i / 2] = (byte) (byteUtil.toByte(hexString.charAt(i + 1)) | (byteUtil.toByte(hexString.charAt(i)) << 4));
        }
        return bArr;
    }

    @JvmStatic
    public static final boolean isEmpty(@Nullable byte[] bytes) {
        return bytes == null || bytes.length == 0;
    }

    private final void requireBytesAvailable(ByteBuffer byteBuffer, int bytesCount) {
        if (byteBuffer.position() + bytesCount <= byteBuffer.capacity()) {
            return;
        }
        throw new IllegalArgumentException(("position = " + byteBuffer.position() + " + ,bytesCount = " + bytesCount + " + , cap = " + byteBuffer.capacity()).toString());
    }

    @JvmStatic
    public static final int shortToInt(short b2) {
        return b2 & UShort.MAX_VALUE;
    }

    @JvmStatic
    @NotNull
    public static final byte[] stringToBytes(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        byte[] bArr = new byte[(length + 1) / 2];
        for (int i = 0; i < length; i += 2) {
            String strSubstring = text.substring(i, RangesKt___RangesKt.coerceAtMost(2, length - i) + i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            bArr[i / 2] = (byte) Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
        }
        return bArr;
    }

    private final int toByte(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        throw new RuntimeException("Invalid hex char '" + c + "'");
    }

    @JvmStatic
    @JvmOverloads
    public static final int toInt(@NotNull byte[] bytes, boolean z) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return toInt$default(bytes, z, 0, 4, null);
    }

    public static /* synthetic */ int toInt$default(byte[] bArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return toInt(bArr, z, i);
    }

    @JvmStatic
    @NotNull
    public static final byte[] trimLast(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = -1;
        int length = bytes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (bytes[length] != 0) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return ArraysKt___ArraysJvmKt.copyOfRange(bytes, 0, i + 1);
    }

    public final boolean byteEquals(@Nullable byte[] lbytes, @Nullable byte[] rbytes) {
        int length;
        if (lbytes == null && rbytes == null) {
            return true;
        }
        if (lbytes == null || rbytes == null || (length = lbytes.length) != rbytes.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (lbytes[i] != rbytes[i]) {
                return false;
            }
        }
        return true;
    }

    public final void copy(@Nullable byte[] lbytes, @Nullable byte[] rbytes, int lstart, int rstart) {
        if (lbytes == null || rbytes == null || lstart < 0) {
            return;
        }
        while (rstart < rbytes.length && lstart < lbytes.length) {
            lbytes[lstart] = rbytes[rstart];
            lstart++;
            rstart++;
        }
    }

    @NotNull
    public final byte[] cutAfterBytes(@NotNull byte[] bytes, byte cut) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (isEmpty(bytes)) {
            return bytes;
        }
        int length = bytes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (bytes[length] != cut) {
                    return ArraysKt___ArraysJvmKt.copyOfRange(bytes, 0, length + 1);
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return EMPTY_BYTES;
    }

    @NotNull
    public final byte[] cutBeforeBytes(@NotNull byte[] bytes, byte cut) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (isEmpty(bytes)) {
            return bytes;
        }
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            if (bytes[i] != cut) {
                return ArraysKt___ArraysJvmKt.copyOfRange(bytes, i, bytes.length);
            }
        }
        return EMPTY_BYTES;
    }

    @Nullable
    public final byte[] fillBeforeBytes(@Nullable byte[] bytes, int len, byte fill) {
        int length = bytes != null ? bytes.length : 0;
        if (length >= len) {
            return bytes;
        }
        byte[] bArr = new byte[len];
        int i = len - 1;
        int i2 = length - 1;
        while (i >= 0) {
            if (i2 >= 0) {
                Intrinsics.checkNotNull(bytes);
                bArr[i] = bytes[i2];
            } else {
                bArr[i] = fill;
            }
            i--;
            i2--;
        }
        return bArr;
    }

    public final long getIntFor4Bytes(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        requireBytesAvailable(byteBuffer, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    @NotNull
    public final byte[] getNonEmptyByte(@Nullable byte[] bytes) {
        return bytes == null ? EMPTY_BYTES : bytes;
    }

    public final boolean isAllFF(@Nullable byte[] bytes) {
        int length = bytes != null ? bytes.length : 0;
        for (int i = 0; i < length; i++) {
            Intrinsics.checkNotNull(bytes);
            if (byteToInt(bytes[i]) != 255) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final byte[] merger(@NotNull byte[] bt1, @NotNull byte[] bt2) {
        Intrinsics.checkNotNullParameter(bt1, "bt1");
        Intrinsics.checkNotNullParameter(bt2, "bt2");
        byte[] bArr = new byte[bt1.length + bt2.length];
        System.arraycopy(bt1, 0, bArr, 0, bt1.length);
        System.arraycopy(bt2, 0, bArr, bt1.length, bt2.length);
        return bArr;
    }

    public final int shortToUInt(short s) {
        byte[] bArrArray = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort(s).array();
        return ByteUtilKt.and(bArrArray[0], 255) | (ByteUtilKt.and(bArrArray[1], 255) << 8);
    }

    public final short toShort(@NotNull byte[] bytes, int start) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return (short) (bytes[start + 1] | ByteUtilKt.shl(bytes[start], 8));
    }

    @JvmStatic
    @NotNull
    public static final String bytesToHexString(@NotNull byte[] array, int offset, int length) {
        Intrinsics.checkNotNullParameter(array, "array");
        char[] cArr = new char[length * 2];
        int i = length + offset;
        int i2 = 0;
        while (offset < i) {
            byte b2 = array[offset];
            int i3 = i2 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i2] = cArr2[ByteUtilKt.ushr(b2, 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[(byte) (b2 & 15)];
            offset++;
        }
        return new String(cArr);
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean equals(@Nullable byte[] array1, @Nullable byte[] array2, int len) {
        if (Intrinsics.areEqual(array1, array2)) {
            return true;
        }
        if (array1 == null || array2 == null || array1.length < len || array2.length < len) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    @NotNull
    public static final byte[] fromInt(int n) {
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (n >>> (i * 8));
        }
        return bArr;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final byte[] get(@NotNull byte[] bytes, int offset, int len) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] bArr = new byte[len];
        System.arraycopy(bytes, offset, bArr, 0, len);
        return bArr;
    }

    @JvmStatic
    public static final short toShort(@NotNull byte[] bytes, boolean littleEndian) {
        int iAnd;
        int iAnd2;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (littleEndian) {
            iAnd = ByteUtilKt.and(bytes[0], 255);
            iAnd2 = ByteUtilKt.and(bytes[1], 255);
        } else {
            iAnd = ByteUtilKt.and(bytes[1], 255);
            iAnd2 = ByteUtilKt.and(bytes[0], 255);
        }
        return (short) ((iAnd2 | iAnd) << 8);
    }

    public final int toInt(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = 0;
        if (bytes.length != 4) {
            return 0;
        }
        int iShl = 0;
        while (i < 4) {
            int i2 = i + 1;
            iShl += ByteUtilKt.shl(bytes[i], i * 8) & ((int) ((1 << (i2 * 8)) - 1));
            i = i2;
        }
        return iShl;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final byte[] fromInt(int n, boolean littleEndian, int length) {
        byte[] bArr = new byte[length];
        if (littleEndian) {
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) (n & 255);
                n >>= 8;
            }
        } else {
            int i2 = length - 1;
            if (i2 >= 0) {
                while (true) {
                    int i3 = i2 - 1;
                    bArr[i2] = (byte) (n & 255);
                    n >>= 8;
                    if (i3 < 0) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return bArr;
    }

    @JvmStatic
    @JvmOverloads
    public static final int toInt(@NotNull byte[] bytes, boolean littleEndian, int index) {
        int iAnd;
        int iAnd2;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length < index + 4) {
            throw new IllegalArgumentException("bytes length too short".toString());
        }
        if (littleEndian) {
            iAnd = ByteUtilKt.and(bytes[index], 255) | (ByteUtilKt.and(bytes[index + 1], 255) << 8) | (ByteUtilKt.and(bytes[index + 2], 255) << 16);
            iAnd2 = ByteUtilKt.and(bytes[index + 3], 255);
        } else {
            iAnd = ByteUtilKt.and(bytes[index + 3], 255) | (ByteUtilKt.and(bytes[index + 2], 255) << 8) | (ByteUtilKt.and(bytes[index + 1], 255) << 16);
            iAnd2 = ByteUtilKt.and(bytes[index], 255);
        }
        return (iAnd2 << 24) | iAnd;
    }
}
