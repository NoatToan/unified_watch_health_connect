package org.apache.commons.io.input;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class CountingInputStream extends ProxyInputStream {
    private long a;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public synchronized void afterRead(int i) {
        if (i != -1) {
            this.a += (long) i;
        }
    }

    public synchronized long getByteCount() {
        return this.a;
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= ParserMinimalBase.MAX_INT_L) {
            return (int) byteCount;
        }
        throw new ArithmeticException("The byte count " + byteCount + " is too large to be converted to an int");
    }

    public synchronized long resetByteCount() {
        long j;
        j = this.a;
        this.a = 0L;
        return j;
    }

    public int resetCount() {
        long jResetByteCount = resetByteCount();
        if (jResetByteCount <= ParserMinimalBase.MAX_INT_L) {
            return (int) jResetByteCount;
        }
        throw new ArithmeticException("The byte count " + jResetByteCount + " is too large to be converted to an int");
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long jSkip;
        jSkip = super.skip(j);
        this.a += jSkip;
        return jSkip;
    }
}
