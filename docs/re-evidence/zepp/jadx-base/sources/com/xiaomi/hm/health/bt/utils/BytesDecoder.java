package com.xiaomi.hm.health.bt.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0011R\u0019\u0010\u0017\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/utils/BytesDecoder;", "", "", "defaultValue", "size", "e", "a", "", "c", "readLong", "readUInt32", "readInt32", "readUInt8", "readUInt16", "readSInt16", "", "readFloat", "", "readDouble", "", "[B", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "b", LogUtil.I, "index", "<init>", "([B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BytesDecoder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final byte[] bytes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private volatile int index;

    public BytesDecoder(@NotNull byte[] bArr) {
        this.bytes = bArr;
    }

    private final int a(int defaultValue, int size) {
        if (this.bytes.length - this.index < size) {
            this.index += size;
            return defaultValue;
        }
        int i = 0;
        if (size <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            i2 |= (this.bytes[this.index] & 255) << (i * 8);
            this.index++;
            if (i3 >= size) {
                return i2;
            }
            i = i3;
        }
    }

    public static /* synthetic */ int b(BytesDecoder bytesDecoder, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        return bytesDecoder.a(i, i2);
    }

    private final long c(long defaultValue, int size) {
        if (this.bytes.length - this.index < size) {
            this.index += size;
            return defaultValue;
        }
        long j = 0;
        int i = 0;
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                j |= (((long) this.bytes[this.index]) & 255) << (i * 8);
                this.index++;
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return j;
    }

    public static /* synthetic */ long d(BytesDecoder bytesDecoder, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return bytesDecoder.c(j, i);
    }

    private final int e(int defaultValue, int size) {
        if (this.bytes.length - this.index < size) {
            this.index += size;
            return defaultValue;
        }
        int i = 0;
        if (size <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            i2 |= (i == size + (-1) ? this.bytes[this.index] : this.bytes[this.index] & 255) << (i * 8);
            this.index++;
            if (i3 >= size) {
                return i2;
            }
            i = i3;
        }
    }

    public static /* synthetic */ int f(BytesDecoder bytesDecoder, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        return bytesDecoder.e(i, i2);
    }

    public static /* synthetic */ double readDouble$default(BytesDecoder bytesDecoder, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        return bytesDecoder.readDouble(d);
    }

    public static /* synthetic */ float readFloat$default(BytesDecoder bytesDecoder, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return bytesDecoder.readFloat(f);
    }

    public static /* synthetic */ int readInt32$default(BytesDecoder bytesDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return bytesDecoder.readInt32(i);
    }

    public static /* synthetic */ long readLong$default(BytesDecoder bytesDecoder, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return bytesDecoder.readLong(j);
    }

    public static /* synthetic */ int readSInt16$default(BytesDecoder bytesDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return bytesDecoder.readSInt16(i);
    }

    public static /* synthetic */ int readUInt16$default(BytesDecoder bytesDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return bytesDecoder.readUInt16(i);
    }

    public static /* synthetic */ long readUInt32$default(BytesDecoder bytesDecoder, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return bytesDecoder.readUInt32(j);
    }

    public static /* synthetic */ int readUInt8$default(BytesDecoder bytesDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return bytesDecoder.readUInt8(i);
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    public final double readDouble(double defaultValue) {
        return Double.longBitsToDouble(readLong$default(this, 0L, 1, null));
    }

    public final float readFloat(float defaultValue) {
        return Float.intBitsToFloat(readInt32$default(this, 0, 1, null));
    }

    public final int readInt32(int defaultValue) {
        return a(defaultValue, 4);
    }

    public final long readLong(long defaultValue) {
        return c(defaultValue, 8);
    }

    public final int readSInt16(int defaultValue) {
        return e(defaultValue, 2);
    }

    public final int readUInt16(int defaultValue) {
        return a(defaultValue, 2);
    }

    public final long readUInt32(long defaultValue) {
        return c(defaultValue, 4);
    }

    public final int readUInt8(int defaultValue) {
        return a(defaultValue, 1);
    }
}
