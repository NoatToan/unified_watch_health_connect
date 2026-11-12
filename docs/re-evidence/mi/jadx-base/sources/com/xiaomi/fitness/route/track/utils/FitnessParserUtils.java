package com.xiaomi.fitness.route.track.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/FitnessParserUtils;", "", "<init>", "()V", "TAG", "", "getFloatFor4Bytes", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "getIntFor4Bytes", "", "getIntFor2Bytes", "", "getIntFor1Byte", "getBytes", "", "bytesCount", "getLongForBytes", "bytes", "requireBytesAvailable", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessParserUtils {

    @NotNull
    public static final FitnessParserUtils INSTANCE = new FitnessParserUtils();

    @NotNull
    private static final String TAG = "FitnessParserUtils";

    private FitnessParserUtils() {
    }

    private final void requireBytesAvailable(ByteBuffer byteBuffer, int bytesCount) {
        if (byteBuffer.position() + bytesCount <= byteBuffer.capacity()) {
            return;
        }
        throw new IllegalArgumentException(("position = " + byteBuffer.position() + " + ,bytesCount = " + bytesCount + " + , cap = " + byteBuffer.capacity()).toString());
    }

    @NotNull
    public final byte[] getBytes(@NotNull ByteBuffer byteBuffer, int bytesCount) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        requireBytesAvailable(byteBuffer, bytesCount);
        byte[] bArr = new byte[bytesCount];
        byteBuffer.get(bArr);
        return bArr;
    }

    public final float getFloatFor4Bytes(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        return ByteBuffer.wrap(getBytes(byteBuffer, 4)).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }

    public final int getIntFor1Byte(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        requireBytesAvailable(byteBuffer, 1);
        return byteBuffer.get() & 255;
    }

    public final int getIntFor2Bytes(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        requireBytesAvailable(byteBuffer, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public final long getIntFor4Bytes(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        requireBytesAvailable(byteBuffer, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public final long getLongForBytes(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }
}
