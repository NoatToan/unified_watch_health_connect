package com.xiaomi.infra.galaxy.fds.buffer;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes22.dex */
public class ByteBufferArray {
    public static final Log e = LogFactory.getLog(ByteBufferArray.class);
    public static final int f = 4194304;
    public static final /* synthetic */ boolean g = false;
    private ByteBuffer[] a;
    private Lock[] b;
    private int c;
    private int d;

    public class a implements c {
        public a() {
        }

        @Override // com.xiaomi.infra.galaxy.fds.buffer.ByteBufferArray.c
        public void a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2) {
            byteBuffer.get(bArr, i, i2);
        }
    }

    public class b implements c {
        public b() {
        }

        @Override // com.xiaomi.infra.galaxy.fds.buffer.ByteBufferArray.c
        public void a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2) {
            byteBuffer.put(bArr, i, i2);
        }
    }

    public interface c {
        void a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2);
    }

    public ByteBufferArray(long j, boolean z) {
        this.c = 4194304;
        long j2 = j / 16;
        if (4194304 > j2) {
            this.c = (int) b(j2, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        }
        int iB = (int) (b(j, this.c) / ((long) this.c));
        this.d = iB;
        this.a = new ByteBuffer[iB + 1];
        this.b = new Lock[iB + 1];
        for (int i = 0; i <= this.d; i++) {
            this.b[i] = new ReentrantLock();
            if (i < this.d) {
                ByteBuffer[] byteBufferArr = this.a;
                int i2 = this.c;
                byteBufferArr[i] = z ? ByteBuffer.allocateDirect(i2) : ByteBuffer.allocate(i2);
            } else {
                this.a[i] = ByteBuffer.allocate(0);
            }
        }
    }

    private long b(long j, long j2) {
        return (((j + j2) - 1) / j2) * j2;
    }

    public void a(long j, int i, byte[] bArr, int i2, c cVar) {
        int i3;
        long j2 = ((long) i) + j;
        int i4 = this.c;
        int i5 = (int) (j / ((long) i4));
        int i6 = (int) (j % ((long) i4));
        int i7 = (int) (j2 / ((long) i4));
        int i8 = (int) (j2 % ((long) i4));
        if (i5 >= this.b.length || i5 < 0) {
            String str = "Failed multiple, start=" + j + ",startBuffer=" + i5 + ",bufferSize=" + this.c;
            e.error(str);
            throw new RuntimeException(str);
        }
        int i9 = 0;
        for (int i10 = i5; i10 <= i7; i10++) {
            Lock lock = this.b[i10];
            lock.lock();
            try {
                ByteBuffer byteBuffer = this.a[i10];
                if (i10 == i5) {
                    i3 = this.c - i6;
                    if (i3 > i) {
                        i3 = i;
                    }
                    byteBuffer.limit(i6 + i3).position(i6);
                } else if (i10 == i7) {
                    byteBuffer.limit(i8).position(0);
                    i3 = i8;
                } else {
                    i3 = this.c;
                    byteBuffer.limit(i3).position(0);
                }
                cVar.a(byteBuffer, bArr, i9 + i2, i3);
                i9 += i3;
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    public int getMultiple(long j, int i, byte[] bArr) {
        return getMultiple(j, i, bArr, 0);
    }

    public void putMultiple(long j, int i, byte[] bArr) {
        putMultiple(j, i, bArr, 0);
    }

    public int getMultiple(long j, int i, byte[] bArr, int i2) {
        a(j, i, bArr, i2, new a());
        return i;
    }

    public void putMultiple(long j, int i, byte[] bArr, int i2) {
        a(j, i, bArr, i2, new b());
    }
}
