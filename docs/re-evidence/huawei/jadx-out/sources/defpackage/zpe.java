package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.inputstream.CipherInputStream;

/* JADX INFO: loaded from: classes46.dex */
class zpe extends CipherInputStream<zop> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f54427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54429c;
    private int d;
    private byte[] e;
    private int f;
    private int g;
    private byte[] h;
    private int j;

    public zpe(zpi zpiVar, zpz zpzVar, char[] cArr, int i, boolean z) throws IOException {
        super(zpiVar, zpzVar, cArr, i, z);
        this.h = new byte[1];
        this.e = new byte[16];
        this.f54429c = 0;
        this.f = 0;
        this.j = 0;
        this.g = 0;
        this.f54428b = 0;
        this.d = 0;
        this.f54427a = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zop initializeDecrypter(zpz zpzVar, char[] cArr, boolean z) throws IOException {
        return new zop(zpzVar.getAesExtraDataRecord(), cArr, b(zpzVar), e(), z);
    }

    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream, java.io.InputStream
    public int read() throws IOException {
        if (read(this.h) == -1) {
            return -1;
        }
        return this.h[0];
    }

    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.j = i2;
        this.g = i;
        this.f54428b = 0;
        if (this.f != 0) {
            c(bArr, i);
            int i3 = this.f54428b;
            if (i3 == i2) {
                return i3;
            }
        }
        if (this.j < 16) {
            byte[] bArr2 = this.e;
            int i4 = super.read(bArr2, 0, bArr2.length);
            this.f54427a = i4;
            this.f54429c = 0;
            if (i4 == -1) {
                this.f = 0;
                int i5 = this.f54428b;
                if (i5 > 0) {
                    return i5;
                }
                return -1;
            }
            this.f = i4;
            c(bArr, this.g);
            int i6 = this.f54428b;
            if (i6 == i2) {
                return i6;
            }
        }
        int i7 = this.g;
        int i8 = this.j;
        int i9 = super.read(bArr, i7, i8 - (i8 % 16));
        if (i9 == -1) {
            int i10 = this.f54428b;
            if (i10 > 0) {
                return i10;
            }
            return -1;
        }
        return i9 + this.f54428b;
    }

    private void c(byte[] bArr, int i) {
        int i2 = this.j;
        int i3 = this.f;
        if (i2 >= i3) {
            i2 = i3;
        }
        this.d = i2;
        System.arraycopy(this.e, this.f54429c, bArr, i, i2);
        d(this.d);
        e(this.d);
        int i4 = this.f54428b;
        int i5 = this.d;
        this.f54428b = i4 + i5;
        this.j -= i5;
        this.g += i5;
    }

    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream
    public void endOfEntryReached(InputStream inputStream, int i) throws IOException {
        a(e(inputStream), i);
    }

    private void a(byte[] bArr, int i) throws IOException {
        byte[] bArr2 = new byte[10];
        System.arraycopy(getDecrypter().c(i), 0, bArr2, 0, 10);
        if (!Arrays.equals(bArr, bArr2)) {
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
    }

    protected byte[] e(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[10];
        if (zqp.a(inputStream, bArr) == 10) {
            return bArr;
        }
        throw new ZipException("Invalid AES Mac bytes. Could not read sufficient data");
    }

    private byte[] b(zpz zpzVar) throws IOException {
        if (zpzVar.getAesExtraDataRecord() == null) {
            throw new IOException("invalid aes extra data record");
        }
        zpp aesExtraDataRecord = zpzVar.getAesExtraDataRecord();
        if (aesExtraDataRecord.a() == null) {
            throw new IOException("Invalid aes key strength in aes extra data record");
        }
        byte[] bArr = new byte[aesExtraDataRecord.a().getSaltLength()];
        readRaw(bArr);
        return bArr;
    }

    private byte[] e() throws IOException {
        byte[] bArr = new byte[2];
        readRaw(bArr);
        return bArr;
    }

    private void d(int i) {
        int i2 = this.f54429c + i;
        this.f54429c = i2;
        if (i2 >= 15) {
            this.f54429c = 15;
        }
    }

    private void e(int i) {
        int i2 = this.f - i;
        this.f = i2;
        if (i2 <= 0) {
            this.f = 0;
        }
    }
}
