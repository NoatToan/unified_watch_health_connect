package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends InputStream implements r0 {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public InputStream abc;
    public q0 bcd;
    public final ByteBuffer cde;
    public boolean def;
    public long efg;

    public g(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    @Override // com.huawei.agconnect.apms.r0
    public final void abc(p0 p0Var) {
        q0 q0Var = this.bcd;
        synchronized (q0Var.cde) {
            q0Var.cde.remove(p0Var);
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return (this.def ? this.cde.remaining() : 0) + this.abc.available();
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    public final void bcd(p0 p0Var) {
        this.bcd.abc(p0Var);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        ArrayList arrayList;
        try {
            this.abc.close();
            q0 q0Var = this.bcd;
            synchronized (q0Var.abc) {
                z = q0Var.bcd;
            }
            if (z) {
                return;
            }
            q0 q0Var2 = this.bcd;
            o0 o0Var = new o0(this, this.efg, null);
            if (q0Var2.abc()) {
                return;
            }
            synchronized (q0Var2.cde) {
                arrayList = new ArrayList(q0Var2.cde);
                q0Var2.cde.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p0) it.next()).abc(o0Var);
            }
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.abc.markSupported()) {
            this.abc.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.abc.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        boolean z;
        ArrayList arrayList;
        if (this.def) {
            synchronized (this.cde) {
                if (this.cde.remaining() >= 1) {
                    byte b2 = !this.cde.hasRemaining() ? (byte) -1 : this.cde.get();
                    if (b2 >= 0) {
                        this.efg++;
                    }
                    return b2;
                }
            }
        }
        try {
            int i = this.abc.read();
            if (i >= 0) {
                this.efg++;
                return i;
            }
            q0 q0Var = this.bcd;
            synchronized (q0Var.abc) {
                z = q0Var.bcd;
            }
            if (!z) {
                q0 q0Var2 = this.bcd;
                o0 o0Var = new o0(this, this.efg, null);
                if (!q0Var2.abc()) {
                    synchronized (q0Var2.cde) {
                        arrayList = new ArrayList(q0Var2.cde);
                        q0Var2.cde.clear();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p0) it.next()).abc(o0Var);
                    }
                }
            }
            return i;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.abc.markSupported()) {
            try {
                this.abc.reset();
            } catch (IOException e) {
                abc(e);
                throw e;
            }
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.def) {
            synchronized (this.cde) {
                if (this.cde.remaining() >= j) {
                    this.cde.position((int) j);
                    this.efg += j;
                    return j;
                }
                j -= (long) this.cde.remaining();
                if (j <= 0) {
                    throw new IOException("failed to skip partial read from buffer.");
                }
                ByteBuffer byteBuffer = this.cde;
                byteBuffer.position(byteBuffer.remaining());
            }
        }
        try {
            long jSkip = this.abc.skip(j);
            this.efg += jSkip;
            return jSkip;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    public g(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, 0);
    }

    public g(InputStream inputStream, boolean z, int i) throws IOException {
        this.efg = 0L;
        if (inputStream != null) {
            this.abc = inputStream;
            this.def = z;
            this.bcd = new q0();
            if (z) {
                this.cde = ByteBuffer.allocate(4096);
                abc();
                return;
            } else {
                this.cde = null;
                return;
            }
        }
        throw new IOException("InputStreamExtension: input stream can not be null.");
    }

    public final void abc() {
        int i;
        ByteBuffer byteBuffer = this.cde;
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            return;
        }
        synchronized (this.cde) {
            int i2 = 0;
            while (i2 < this.cde.capacity() && (i = this.abc.read(this.cde.array(), i2, this.cde.capacity() - i2)) > 0) {
                try {
                    i2 += i;
                } catch (IOException e) {
                    fgh.warn("fill buffer error: " + e.toString());
                    this.cde.limit(0);
                }
            }
            this.cde.limit(i2);
        }
    }

    public final void abc(IOException iOException) {
        boolean z;
        ArrayList arrayList;
        q0 q0Var = this.bcd;
        synchronized (q0Var.abc) {
            z = q0Var.bcd;
        }
        if (z) {
            return;
        }
        q0 q0Var2 = this.bcd;
        o0 o0Var = new o0(this, this.efg, iOException);
        if (q0Var2.abc()) {
            return;
        }
        synchronized (q0Var2.cde) {
            arrayList = new ArrayList(q0Var2.cde);
            q0Var2.cde.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p0) it.next()).bcd(o0Var);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        boolean z;
        ArrayList arrayList;
        int length = bArr.length;
        int i = 0;
        if (this.def) {
            synchronized (this.cde) {
                int iRemaining = -1;
                if (this.cde.remaining() >= length) {
                    int length2 = bArr.length;
                    if (this.cde.hasRemaining()) {
                        int iRemaining2 = this.cde.remaining();
                        this.cde.get(bArr, 0, length2);
                        iRemaining = iRemaining2 - this.cde.remaining();
                    }
                    if (iRemaining >= 0) {
                        this.efg += (long) iRemaining;
                        return iRemaining;
                    }
                    throw new IOException("failed to read buffer bytes.");
                }
                int iRemaining3 = this.cde.remaining();
                if (iRemaining3 > 0) {
                    if (this.cde.hasRemaining()) {
                        int iRemaining4 = this.cde.remaining();
                        this.cde.get(bArr, 0, iRemaining3);
                        iRemaining = iRemaining4 - this.cde.remaining();
                    }
                    if (iRemaining >= 0) {
                        length -= iRemaining;
                        this.efg += (long) iRemaining;
                        i = iRemaining;
                    } else {
                        throw new IOException("failed to partial read from buffer.");
                    }
                }
            }
        }
        try {
            int i2 = this.abc.read(bArr, i, length);
            if (i2 >= 0) {
                this.efg += (long) i2;
                return i2 + i;
            }
            if (i > 0) {
                return i;
            }
            q0 q0Var = this.bcd;
            synchronized (q0Var.abc) {
                z = q0Var.bcd;
            }
            if (!z) {
                q0 q0Var2 = this.bcd;
                o0 o0Var = new o0(this, this.efg, null);
                if (!q0Var2.abc()) {
                    synchronized (q0Var2.cde) {
                        arrayList = new ArrayList(q0Var2.cde);
                        q0Var2.cde.clear();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p0) it.next()).abc(o0Var);
                    }
                }
            }
            return i2;
        } catch (IOException e) {
            AgentLog agentLog = fgh;
            StringBuilder sbAbc = abc.abc("failed to read input stream: ");
            sbAbc.append(e.getMessage());
            agentLog.warn(sbAbc.toString());
            abc(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        ArrayList arrayList;
        int i3 = 0;
        if (this.def) {
            synchronized (this.cde) {
                int iRemaining = -1;
                if (this.cde.remaining() >= i2) {
                    if (this.cde.hasRemaining()) {
                        int iRemaining2 = this.cde.remaining();
                        this.cde.get(bArr, i, i2);
                        iRemaining = iRemaining2 - this.cde.remaining();
                    }
                    if (iRemaining >= 0) {
                        this.efg += (long) iRemaining;
                        return iRemaining;
                    }
                    throw new IOException("failed to read buffer bytes.");
                }
                int iRemaining3 = this.cde.remaining();
                if (iRemaining3 > 0) {
                    if (this.cde.hasRemaining()) {
                        int iRemaining4 = this.cde.remaining();
                        this.cde.get(bArr, i, iRemaining3);
                        iRemaining = iRemaining4 - this.cde.remaining();
                    }
                    if (iRemaining >= 0) {
                        i2 -= iRemaining;
                        this.efg += (long) iRemaining;
                        i3 = iRemaining;
                    } else {
                        throw new IOException("failed to partial read from buffer.");
                    }
                }
            }
        }
        try {
            int i4 = this.abc.read(bArr, i + i3, i2);
            if (i4 >= 0) {
                this.efg += (long) i4;
                return i4 + i3;
            }
            if (i3 > 0) {
                return i3;
            }
            q0 q0Var = this.bcd;
            synchronized (q0Var.abc) {
                z = q0Var.bcd;
            }
            if (!z) {
                q0 q0Var2 = this.bcd;
                o0 o0Var = new o0(this, this.efg, null);
                if (!q0Var2.abc()) {
                    synchronized (q0Var2.cde) {
                        arrayList = new ArrayList(q0Var2.cde);
                        q0Var2.cde.clear();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p0) it.next()).abc(o0Var);
                    }
                }
            }
            return i4;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }
}
