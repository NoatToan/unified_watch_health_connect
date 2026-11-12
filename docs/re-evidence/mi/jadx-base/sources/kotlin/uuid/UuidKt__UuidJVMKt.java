package kotlin.uuid;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,257:1\n257#1:258\n257#1:259\n257#1:260\n257#1:261\n257#1:262\n257#1:263\n257#1:264\n257#1:265\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n119#1:258\n120#1:259\n164#1:260\n165#1:261\n204#1:262\n205#1:263\n251#1:264\n252#1:265\n*E\n"})
class UuidKt__UuidJVMKt {
    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid getUuid(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long jReverseBytes = byteBuffer.getLong();
        long jReverseBytes2 = byteBuffer.getLong();
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        return Uuid.Companion.fromLongs(jReverseBytes, jReverseBytes2);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final ByteBuffer putUuid(@NotNull ByteBuffer byteBuffer, @NotNull Uuid uuid) {
        ByteBuffer byteBufferPutLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            byteBufferPutLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            byteBufferPutLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
        return byteBufferPutLong;
    }

    public static final long reverseBytes(long j) {
        return Long.reverseBytes(j);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid secureRandomUuid() {
        byte[] bArr = new byte[16];
        SecureRandomHolder.INSTANCE.getInstance().nextBytes(bArr);
        return UuidKt__UuidKt.uuidFromRandomBytes(bArr);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Object serializedUuid(@NotNull Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final UUID toJavaUuid(@NotNull Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return new UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid toKotlinUuid(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return Uuid.Companion.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid getUuid(@NotNull ByteBuffer byteBuffer, int i) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                long jReverseBytes = byteBuffer.getLong(i);
                long jReverseBytes2 = byteBuffer.getLong(i + 8);
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                    jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                }
                return Uuid.Companion.fromLongs(jReverseBytes, jReverseBytes2);
            }
            throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final ByteBuffer putUuid(@NotNull ByteBuffer byteBuffer, int i, @NotNull Uuid uuid) {
        ByteBuffer byteBufferPutLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i, mostSignificantBits);
                    byteBufferPutLong = byteBuffer.putLong(i + 8, leastSignificantBits);
                } else {
                    byteBuffer.putLong(i, Long.reverseBytes(mostSignificantBits));
                    byteBufferPutLong = byteBuffer.putLong(i + 8, Long.reverseBytes(leastSignificantBits));
                }
                Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
                return byteBufferPutLong;
            }
            throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i);
    }
}
