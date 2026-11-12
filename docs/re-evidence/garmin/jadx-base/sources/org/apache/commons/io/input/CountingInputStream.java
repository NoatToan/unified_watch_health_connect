package org.apache.commons.io.input;

import androidx.room.a0;
import java.io.InputStream;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public class CountingInputStream extends ProxyInputStream {
    private long count;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public synchronized void afterRead(int i14) {
        if (i14 != -1) {
            this.count += (long) i14;
        }
    }

    public synchronized long getByteCount() {
        return this.count;
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= 2147483647L) {
            return (int) byteCount;
        }
        e.u(a0.f(byteCount, "The byte count ", " is too large to be converted to an int"));
        return 0;
    }

    public synchronized long resetByteCount() {
        long j8;
        j8 = this.count;
        this.count = 0L;
        return j8;
    }

    public int resetCount() {
        long jResetByteCount = resetByteCount();
        if (jResetByteCount <= 2147483647L) {
            return (int) jResetByteCount;
        }
        e.u(a0.f(jResetByteCount, "The byte count ", " is too large to be converted to an int"));
        return 0;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j8) {
        long jSkip;
        jSkip = super.skip(j8);
        this.count += jSkip;
        return jSkip;
    }
}
