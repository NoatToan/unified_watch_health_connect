package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class ehs extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rls f16659a = new rls();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f16660b;
    public final gps c;
    public long d;
    public long e;
    public FileOutputStream f;
    public ups g;

    public ehs(File file, gps gpsVar) {
        this.f16660b = file;
        this.c = gpsVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        while (i2 > 0) {
            if (this.d == 0 && this.e == 0) {
                int iB = this.f16659a.b(bArr, i, i2);
                if (iB == -1) {
                    return;
                }
                i += iB;
                i2 -= iB;
                ups upsVarC = this.f16659a.c();
                this.g = upsVarC;
                if (upsVarC.d()) {
                    this.d = 0L;
                    this.c.l(this.g.f(), 0, this.g.f().length);
                    this.e = this.g.f().length;
                } else if (this.g.h() && !this.g.g()) {
                    this.c.j(this.g.f());
                    File file = new File(this.f16660b, this.g.c());
                    file.getParentFile().mkdirs();
                    this.d = this.g.b();
                    this.f = new FileOutputStream(file);
                } else {
                    byte[] bArrF = this.g.f();
                    this.c.l(bArrF, 0, bArrF.length);
                    this.d = this.g.b();
                }
            }
            if (!this.g.g()) {
                long j = i2;
                if (this.g.d()) {
                    this.c.e(this.e, bArr, i, i2);
                    this.e += j;
                    iMin = i2;
                } else if (this.g.h()) {
                    iMin = (int) Math.min(j, this.d);
                    this.f.write(bArr, i, iMin);
                    long j2 = this.d - ((long) iMin);
                    this.d = j2;
                    if (j2 == 0) {
                        this.f.close();
                    }
                } else {
                    iMin = (int) Math.min(j, this.d);
                    this.c.e((((long) this.g.f().length) + this.g.b()) - this.d, bArr, i, iMin);
                    this.d -= (long) iMin;
                }
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
