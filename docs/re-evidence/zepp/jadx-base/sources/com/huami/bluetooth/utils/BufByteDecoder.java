package com.huami.bluetooth.utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\nR%\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/utils/BufByteDecoder;", "", "", "byteArray", "", "append", "", "size", "readInt", "readIntBE", "", "readString", "readBytes", "readBytesGreedy", "", "readLong", "readLongBE", "readByte", "", "readBoolean", "readShort", "", "readFloat", "remain", "clear", "readBytesToAscii", "Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "()Lio/netty/buffer/ByteBuf;", "buf", "bufSize", "<init>", "([BI)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BufByteDecoder {
    private static final int b = 128;
    private static final int c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy buf;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ByteBuf> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteBuf invoke() {
            return Unpooled.buffer(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufByteDecoder() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public BufByteDecoder(@NotNull byte[] bArr, int i) {
        this.buf = LazyKt__LazyJVMKt.lazy(new a(i));
        append(bArr);
    }

    private final ByteBuf a() {
        return (ByteBuf) this.buf.getValue();
    }

    public static /* synthetic */ byte[] readBytes$default(BufByteDecoder bufByteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return bufByteDecoder.readBytes(i);
    }

    public static /* synthetic */ int readInt$default(BufByteDecoder bufByteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return bufByteDecoder.readInt(i);
    }

    public static /* synthetic */ int readIntBE$default(BufByteDecoder bufByteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return bufByteDecoder.readIntBE(i);
    }

    public static /* synthetic */ long readLong$default(BufByteDecoder bufByteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return bufByteDecoder.readLong(i);
    }

    public static /* synthetic */ long readLongBE$default(BufByteDecoder bufByteDecoder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return bufByteDecoder.readLongBE(i);
    }

    public final void append(@NotNull byte[] byteArray) {
        a().writeBytes(byteArray);
    }

    public final void clear() {
        a().clear();
    }

    public final boolean readBoolean() {
        return readByte() == 1;
    }

    public final int readByte() {
        return readInt(1);
    }

    @NotNull
    public final byte[] readBytes(int size) {
        byte[] bArr = size > 0 ? new byte[size] : new byte[remain()];
        a().readBytes(bArr);
        return bArr;
    }

    @NotNull
    public final byte[] readBytesGreedy(int size) {
        byte[] bArr = size <= remain() ? new byte[size] : new byte[remain()];
        a().readBytes(bArr);
        return bArr;
    }

    @NotNull
    public final String readBytesToAscii() {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : readBytes$default(this, 0, 1, null)) {
            stringBuffer.append((char) b2);
        }
        return stringBuffer.toString();
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt$default(this, 0, 1, null));
    }

    public final int readInt(int size) {
        if (a().readableBytes() < size) {
            throw new IndexOutOfBoundsException("No enough data remain");
        }
        int i = 0;
        if (size <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            i2 |= (a().readByte() & 255) << (i * 8);
            if (i3 >= size) {
                return i2;
            }
            i = i3;
        }
    }

    public final int readIntBE(int size) {
        if (a().readableBytes() < size) {
            throw new IndexOutOfBoundsException("No enough data remain");
        }
        int i = 0;
        if (size <= 0) {
            return 0;
        }
        int i2 = 0;
        do {
            i++;
            i2 = (i2 << 8) | (a().readByte() & 255);
        } while (i < size);
        return i2;
    }

    public final long readLong(int size) {
        if (a().readableBytes() < size) {
            throw new IndexOutOfBoundsException("No enough data remain");
        }
        long j = 0;
        int i = 0;
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                j |= (((long) a().readByte()) & 255) << (i * 8);
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return j;
    }

    public final long readLongBE(int size) {
        if (a().readableBytes() < size) {
            throw new IndexOutOfBoundsException("No enough data remain");
        }
        long j = 0;
        int i = 0;
        if (size > 0) {
            do {
                i++;
                j = (j << 8) | (((long) a().readByte()) & 255);
            } while (i < size);
        }
        return j;
    }

    public final int readShort() {
        return readInt(2);
    }

    @NotNull
    public final String readString() {
        if (a().readableBytes() <= 0) {
            return "";
        }
        int iBytesBefore = a().bytesBefore((byte) 0);
        if (iBytesBefore == 0) {
            a().readByte();
            return "";
        }
        if (iBytesBefore < 0) {
            return "";
        }
        ByteBuf bytes = a().readBytes(iBytesBefore);
        a().readByte();
        return bytes.toString(Charset.forName("utf-8"));
    }

    public final int remain() {
        return a().readableBytes();
    }

    public /* synthetic */ BufByteDecoder(byte[] bArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new byte[0] : bArr, (i2 & 2) != 0 ? 128 : i);
    }
}
