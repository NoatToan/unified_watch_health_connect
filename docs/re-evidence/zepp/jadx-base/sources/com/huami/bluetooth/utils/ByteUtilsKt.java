package com.huami.bluetooth.utils;

import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0003\u001a\f\u0010\u0005\u001a\u00020\u0000*\u0004\u0018\u00010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a \u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a \u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a \u0010\r\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a\u0019\u0010\u0011\u001a\u00020\u0006*\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b\u001a!\u0010\u0013\u001a\u00020\u0012*\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b¨\u0006\u0014"}, d2 = {"", "", "toInt", "", "toByte", "toBoolean", "", "bits", "toByteArray", "toByteArrayBE", "offset", "", "toLong", "toIntBE", "", "Ljava/nio/charset/Charset;", "charset", "toByteArrayWithEndFlag", "Lcom/huami/bluetooth/utils/ByteString;", "toByteString", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ByteUtilsKt {
    public static final boolean toBoolean(byte b) {
        return b == 1;
    }

    public static final boolean toBoolean(@Nullable byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        return ((bArr.length == 0) ^ true) && toBoolean(bArr[0]);
    }

    public static final byte toByte(boolean z) {
        return z ? (byte) 1 : (byte) 0;
    }

    @NotNull
    public static final byte[] toByteArray(int i, int i2) {
        return GattUtils.numberToBytes(i, i2);
    }

    public static /* synthetic */ byte[] toByteArray$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 4;
        }
        return toByteArray(i, i2);
    }

    @NotNull
    public static final byte[] toByteArrayBE(int i, int i2) {
        return GattUtils.numberToBytesBE(i, i2);
    }

    public static /* synthetic */ byte[] toByteArrayBE$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 4;
        }
        return toByteArrayBE(i, i2);
    }

    @NotNull
    public static final byte[] toByteArrayWithEndFlag(@Nullable String str, @NotNull Charset charset) {
        byte[] bArrPlus = str == null ? null : ArraysKt___ArraysJvmKt.plus(str.getBytes(charset), (byte) 0);
        return bArrPlus == null ? new byte[]{0} : bArrPlus;
    }

    public static /* synthetic */ byte[] toByteArrayWithEndFlag$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        byte[] bArrPlus = str == null ? null : ArraysKt___ArraysJvmKt.plus(str.getBytes(charset), (byte) 0);
        return bArrPlus == null ? new byte[]{0} : bArrPlus;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull byte[] bArr, int i, @NotNull Charset charset) {
        if (bArr.length <= 0 || i >= bArr.length) {
            return new ByteString("", 0);
        }
        if (i < 0) {
            i = 0;
        }
        int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(bArr, i);
        return iFindStringEndFlag < 0 ? new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, bArr.length), charset), bArr.length - i) : new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, iFindStringEndFlag), charset), (iFindStringEndFlag - i) + 1);
    }

    public static /* synthetic */ ByteString toByteString$default(byte[] bArr, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        if (bArr.length <= 0 || i >= bArr.length) {
            return new ByteString("", 0);
        }
        int i3 = i >= 0 ? i : 0;
        int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(bArr, i3);
        return iFindStringEndFlag < 0 ? new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i3, bArr.length), charset), bArr.length - i3) : new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i3, iFindStringEndFlag), charset), (iFindStringEndFlag - i3) + 1);
    }

    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final int toInt(@Nullable byte[] bArr, int i, int i2) {
        return GattUtils.bytesToInt(bArr, i2, i);
    }

    public static /* synthetic */ int toInt$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 4;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return toInt(bArr, i, i2);
    }

    public static final int toIntBE(@Nullable byte[] bArr, int i, int i2) {
        return GattUtils.bytesToIntBE(bArr, i2, i);
    }

    public static /* synthetic */ int toIntBE$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 4;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return toIntBE(bArr, i, i2);
    }

    public static final long toLong(@Nullable byte[] bArr, int i, int i2) {
        return GattUtils.bytesToLong(bArr, i2, i);
    }

    public static /* synthetic */ long toLong$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 4;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return toLong(bArr, i, i2);
    }
}
