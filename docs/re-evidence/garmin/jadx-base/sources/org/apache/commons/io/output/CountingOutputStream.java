package org.apache.commons.io.output;

import androidx.room.a0;
import java.io.OutputStream;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public class CountingOutputStream extends ProxyOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.count = 0L;
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    public synchronized void beforeWrite(int i14) {
        this.count += (long) i14;
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
}
