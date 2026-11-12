package org.apache.commons.io.output;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes23.dex */
public class CountingOutputStream extends ProxyOutputStream {
    private long a;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.a = 0L;
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    public synchronized void beforeWrite(int i) {
        this.a += (long) i;
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
}
