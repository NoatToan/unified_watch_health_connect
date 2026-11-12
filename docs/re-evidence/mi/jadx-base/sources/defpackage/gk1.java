package defpackage;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public class gk1 implements d1s, Cloneable {
    public static final ZipShort g = new ZipShort(30062);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19070a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19071b = 0;
    public int c = 0;
    public String d = "";
    public boolean e = false;
    public CRC32 f = new CRC32();

    public String a() {
        return this.d;
    }

    public int b(int i) {
        int i2;
        if (d()) {
            i2 = 40960;
        } else {
            i2 = c() ? 16384 : 32768;
        }
        return (i & 4095) | i2;
    }

    public boolean c() {
        return this.e && !d();
    }

    public Object clone() {
        try {
            gk1 gk1Var = (gk1) super.clone();
            gk1Var.f = new CRC32();
            return gk1Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean d() {
        return a().length() != 0;
    }

    public void e(boolean z) {
        this.e = z;
        this.f19070a = b(this.f19070a);
    }

    public void f(int i) {
        this.f19070a = b(i);
    }

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return g;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        long value = ZipLong.getValue(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.f.reset();
        this.f.update(bArr2);
        long value2 = this.f.getValue();
        if (value != value2) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(value) + " instead of " + Long.toHexString(value2));
        }
        int value3 = ZipShort.getValue(bArr2, 0);
        int value4 = (int) ZipLong.getValue(bArr2, 2);
        byte[] bArr3 = new byte[value4];
        this.f19071b = ZipShort.getValue(bArr2, 6);
        this.c = ZipShort.getValue(bArr2, 8);
        if (value4 == 0) {
            this.d = "";
        } else {
            if (value4 > i2 - 14) {
                throw new ZipException("Bad symbolic link name length " + value4 + " in ASI extra field");
            }
            System.arraycopy(bArr2, 10, bArr3, 0, value4);
            this.d = new String(bArr3);
        }
        e((value3 & 16384) != 0);
        f(value3);
    }
}
