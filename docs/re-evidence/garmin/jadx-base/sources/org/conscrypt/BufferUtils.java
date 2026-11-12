package org.conscrypt;

import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
final class BufferUtils {
    private BufferUtils() {
    }

    public static void checkNotNull(ByteBuffer[] byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer == null) {
                h.s("Null buffer in array");
                return;
            }
        }
    }

    public static void consume(ByteBuffer[] byteBufferArr, int i14) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            int iMin = Math.min(byteBuffer.remaining(), i14);
            if (iMin > 0) {
                byteBuffer.position(byteBuffer.position() + iMin);
                i14 -= iMin;
                if (i14 == 0) {
                    break;
                }
            }
        }
        if (i14 <= 0) {
            return;
        }
        h.s("toConsume > data size");
    }

    public static ByteBuffer copyNoConsume(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer, int i14) {
        Preconditions.checkArgument(byteBuffer.remaining() >= i14, "Destination buffer too small");
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            int iRemaining = byteBuffer2.remaining();
            if (iRemaining > 0) {
                int iPosition = byteBuffer2.position();
                if (iRemaining <= i14) {
                    byteBuffer.put(byteBuffer2);
                    i14 -= iRemaining;
                } else {
                    int iLimit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer2.position() + i14);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(iLimit);
                    i14 = 0;
                }
                byteBuffer2.position(iPosition);
                if (i14 == 0) {
                    break;
                }
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static ByteBuffer getBufferLargerThan(ByteBuffer[] byteBufferArr, int i14) {
        int length = byteBufferArr.length;
        int i15 = 0;
        while (i15 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i15];
            int iRemaining = byteBuffer.remaining();
            if (iRemaining > 0) {
                if (iRemaining < i14) {
                    do {
                        i15++;
                        if (i15 < length) {
                        }
                    } while (byteBufferArr[i15].remaining() <= 0);
                    return null;
                }
                return byteBuffer;
            }
            i15++;
        }
        return null;
    }

    public static long remaining(ByteBuffer[] byteBufferArr) {
        long jRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            jRemaining += (long) byteBuffer.remaining();
        }
        return jRemaining;
    }
}
