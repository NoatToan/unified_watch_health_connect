package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class pds extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rls f30305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f30306b;
    public long c;
    public boolean d;
    public boolean e;

    public pds(InputStream inputStream) {
        super(inputStream);
        this.f30305a = new rls();
        this.f30306b = new byte[4096];
        this.d = false;
        this.e = false;
    }

    public final long a() {
        return this.c;
    }

    public final ups b() throws IOException {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.f30306b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new wcs(null, -1L, -1, false, false, null);
        }
        if (!m(30)) {
            this.d = true;
            return this.f30305a.c();
        }
        ups upsVarC = this.f30305a.c();
        if (upsVarC.d()) {
            this.e = true;
            return upsVarC;
        }
        if (upsVarC.b() == 4294967295L) {
            throw new ugs("Files bigger than 4GiB are not supported.");
        }
        int iA = this.f30305a.a() - 30;
        int length = this.f30306b.length;
        long j = iA;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.f30306b = Arrays.copyOf(this.f30306b, length);
        }
        if (!m(iA)) {
            this.d = true;
            return this.f30305a.c();
        }
        ups upsVarC2 = this.f30305a.c();
        this.c = upsVarC2.b();
        return upsVarC2;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public final int l(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final boolean m(int i) throws IOException {
        int iL = l(this.f30306b, 0, i);
        if (iL != i) {
            int i2 = i - iL;
            if (l(this.f30306b, iL, i2) != i2) {
                this.f30305a.b(this.f30306b, 0, iL);
                return false;
            }
        }
        this.f30305a.b(this.f30306b, 0, i);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int iL = l(bArr, i, (int) Math.min(j, i2));
        this.c -= (long) iL;
        if (iL != 0) {
            return iL;
        }
        this.d = true;
        return 0;
    }
}
