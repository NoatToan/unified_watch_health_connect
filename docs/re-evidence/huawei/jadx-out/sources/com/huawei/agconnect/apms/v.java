package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends OutputStream implements r0 {
    public OutputStream abc;
    public long bcd = 0;
    public q0 cde = new q0();

    public v(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IOException("OutputStreamExtension: output stream can not be null.");
        }
        this.abc = outputStream;
    }

    @Override // com.huawei.agconnect.apms.r0
    public final void abc(p0 p0Var) {
        q0 q0Var = this.cde;
        synchronized (q0Var.cde) {
            q0Var.cde.remove(p0Var);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        ArrayList arrayList;
        try {
            this.abc.close();
            q0 q0Var = this.cde;
            synchronized (q0Var.abc) {
                z = q0Var.bcd;
            }
            if (z) {
                return;
            }
            q0 q0Var2 = this.cde;
            o0 o0Var = new o0(this, this.bcd, null);
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
            q0 q0Var3 = this.cde;
            synchronized (q0Var3.abc) {
                if (!q0Var3.bcd) {
                    q0 q0Var4 = this.cde;
                    o0 o0Var2 = new o0(this, this.bcd, e);
                    if (!q0Var4.abc()) {
                        synchronized (q0Var4.cde) {
                            ArrayList arrayList2 = new ArrayList(q0Var4.cde);
                            q0Var4.cde.clear();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((p0) it2.next()).bcd(o0Var2);
                            }
                        }
                    }
                }
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.abc.flush();
        } catch (IOException e) {
            q0 q0Var = this.cde;
            synchronized (q0Var.abc) {
                if (!q0Var.bcd) {
                    q0 q0Var2 = this.cde;
                    o0 o0Var = new o0(this, this.bcd, e);
                    if (!q0Var2.abc()) {
                        synchronized (q0Var2.cde) {
                            ArrayList arrayList = new ArrayList(q0Var2.cde);
                            q0Var2.cde.clear();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((p0) it.next()).bcd(o0Var);
                            }
                        }
                    }
                }
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.abc.write(i);
            this.bcd++;
        } catch (IOException e) {
            q0 q0Var = this.cde;
            synchronized (q0Var.abc) {
                if (!q0Var.bcd) {
                    q0 q0Var2 = this.cde;
                    o0 o0Var = new o0(this, this.bcd, e);
                    if (!q0Var2.abc()) {
                        synchronized (q0Var2.cde) {
                            ArrayList arrayList = new ArrayList(q0Var2.cde);
                            q0Var2.cde.clear();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((p0) it.next()).bcd(o0Var);
                            }
                        }
                    }
                }
                throw e;
            }
        }
    }

    public final long abc() {
        return this.bcd;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.abc.write(bArr);
            this.bcd += (long) bArr.length;
        } catch (IOException e) {
            q0 q0Var = this.cde;
            synchronized (q0Var.abc) {
                if (!q0Var.bcd) {
                    q0 q0Var2 = this.cde;
                    o0 o0Var = new o0(this, this.bcd, e);
                    if (!q0Var2.abc()) {
                        synchronized (q0Var2.cde) {
                            ArrayList arrayList = new ArrayList(q0Var2.cde);
                            q0Var2.cde.clear();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((p0) it.next()).bcd(o0Var);
                            }
                        }
                    }
                }
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.abc.write(bArr, i, i2);
            this.bcd += (long) i2;
        } catch (IOException e) {
            q0 q0Var = this.cde;
            synchronized (q0Var.abc) {
                if (!q0Var.bcd) {
                    q0 q0Var2 = this.cde;
                    o0 o0Var = new o0(this, this.bcd, e);
                    if (!q0Var2.abc()) {
                        synchronized (q0Var2.cde) {
                            ArrayList arrayList = new ArrayList(q0Var2.cde);
                            q0Var2.cde.clear();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((p0) it.next()).bcd(o0Var);
                            }
                        }
                    }
                }
                throw e;
            }
        }
    }
}
