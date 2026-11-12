package com.xmlywind.sdk.b.a;

import com.xmlywind.sdk.b.n;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes22.dex */
public class b implements com.xmlywind.sdk.b.a {
    public File a;
    private final a b;
    private RandomAccessFile c;

    public b(File file, a aVar) throws n {
        File file2;
        try {
            if (aVar == null) {
                throw new NullPointerException();
            }
            this.b = aVar;
            d.a(file.getParentFile());
            boolean zExists = file.exists();
            if (zExists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.a = file2;
            this.c = new RandomAccessFile(this.a, zExists ? "r" : "rw");
        } catch (IOException e) {
            throw new n("Error using file " + file + " as disc cache", e);
        }
    }

    private boolean a(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // com.xmlywind.sdk.b.a
    public int a(byte[] bArr, long j, int i) {
        int i2;
        synchronized (this) {
            try {
                this.c.seek(j);
                i2 = this.c.read(bArr, 0, i);
            } catch (IOException e) {
                throw new n(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(a()), Integer.valueOf(bArr.length)), e);
            }
        }
        return i2;
    }

    @Override // com.xmlywind.sdk.b.a
    public long a() {
        long length;
        synchronized (this) {
            try {
                length = (int) this.c.length();
            } catch (IOException e) {
                throw new n("Error reading length of file " + this.a, e);
            }
        }
        return length;
    }

    @Override // com.xmlywind.sdk.b.a
    public void a(byte[] bArr, int i) {
        synchronized (this) {
            try {
                if (d()) {
                    throw new n("Error append cache: cache file " + this.a + " is completed!");
                }
                this.c.seek(a());
                this.c.write(bArr, 0, i);
            } catch (IOException e) {
                throw new n(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.c, Integer.valueOf(bArr.length)), e);
            }
        }
    }

    @Override // com.xmlywind.sdk.b.a
    public void b() {
        synchronized (this) {
            try {
                this.c.close();
                this.b.a(this.a);
            } catch (IOException e) {
                throw new n("Error closing file " + this.a, e);
            }
        }
    }

    @Override // com.xmlywind.sdk.b.a
    public void c() {
        synchronized (this) {
            if (!d()) {
                b();
                File file = new File(this.a.getParentFile(), this.a.getName().substring(0, this.a.getName().length() - 9));
                if (!this.a.renameTo(file)) {
                    throw new n("Error renaming file " + this.a + " to " + file + " for completion!");
                }
                this.a = file;
                try {
                    this.c = new RandomAccessFile(this.a, "r");
                    this.b.a(this.a);
                } catch (IOException e) {
                    throw new n("Error opening " + this.a + " as disc cache", e);
                }
            }
        }
    }

    @Override // com.xmlywind.sdk.b.a
    public boolean d() {
        boolean z;
        synchronized (this) {
            z = !a(this.a);
        }
        return z;
    }
}
