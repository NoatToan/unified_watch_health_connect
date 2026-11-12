package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzj {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZzf = zzf(randomAccessFile, 0);
        return pairZzf != null ? pairZzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j8) {
        zzg(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j8 < 0 || j8 > 4294967295L) {
            h.s(e.e(j8, "uint32 value of out range: "));
        } else {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j8);
        }
    }

    private static long zze(ByteBuffer byteBuffer, int i14) {
        return ((long) byteBuffer.getInt(i14)) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i14) throws IOException {
        int i15;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i14, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzg(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i16 = iCapacity - 22;
            int iMin = Math.min(i16, 65535);
            int i17 = 0;
            while (true) {
                if (i17 >= iMin) {
                    i15 = -1;
                    break;
                }
                i15 = i16 - i17;
                if (byteBufferAllocate.getInt(i15) == 101010256 && ((char) byteBufferAllocate.getShort(i15 + 20)) == i17) {
                    break;
                }
                i17++;
            }
        } else {
            i15 = -1;
            break;
        }
        if (i15 == -1) {
            return null;
        }
        byteBufferAllocate.position(i15);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i15)));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        h.s("ByteBuffer byte order must be little endian");
    }
}
