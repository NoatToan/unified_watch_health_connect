package com.huami.bluetooth.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/utils/ByteDecoder;", "", "", "size", "", "readLong", "readInt", "readByte", "readShort", "", "checkLength", "", "a", "[B", "getByteArray", "()[B", "byteArray", "b", LogUtil.I, "getOffset", "()I", "setOffset", "(I)V", "offset", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ByteDecoder {
    private static final int c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final byte[] byteArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int offset;

    public ByteDecoder(@NotNull byte[] bArr) {
        this.byteArray = bArr;
    }

    public static /* synthetic */ int readInt$default(ByteDecoder byteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return byteDecoder.readInt(i);
    }

    public static /* synthetic */ long readLong$default(ByteDecoder byteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return byteDecoder.readLong(i);
    }

    public final void checkLength(int size) {
        if (this.offset + size > this.byteArray.length) {
            throw new IndexOutOfBoundsException("No enough bytes remain");
        }
    }

    @NotNull
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int readByte() {
        return readInt(1);
    }

    public final int readInt(int size) {
        checkLength(size);
        int i = 0;
        if (size <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            byte[] bArr = this.byteArray;
            int i4 = this.offset;
            this.offset = i4 + 1;
            i2 |= (bArr[i4] & 255) << (i * 8);
            if (i3 >= size) {
                return i2;
            }
            i = i3;
        }
    }

    public final long readLong(int size) {
        checkLength(size);
        long j = 0;
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                byte[] bArr = this.byteArray;
                int i3 = this.offset;
                this.offset = i3 + 1;
                j |= (((long) bArr[i3]) & 255) << (i * 8);
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return j;
    }

    public final int readShort() {
        return readInt(2);
    }

    public final void setOffset(int i) {
        this.offset = i;
    }
}
