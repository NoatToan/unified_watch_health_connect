package defpackage;

import java.util.Date;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public class hpr implements d1s {
    public static final ZipShort d = new ZipShort(10);
    public static final ZipShort e = new ZipShort(1);
    public static final ZipShort f = new ZipShort(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZipEightByteInteger f20324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZipEightByteInteger f20325b;
    public ZipEightByteInteger c;

    public hpr() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.f20324a = zipEightByteInteger;
        this.f20325b = zipEightByteInteger;
        this.c = zipEightByteInteger;
    }

    public static Date f(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null || ZipEightByteInteger.ZERO.equals(zipEightByteInteger)) {
            return null;
        }
        return new Date((zipEightByteInteger.getLongValue() - 116444736000000000L) / 10000);
    }

    public Date a() {
        return f(this.f20325b);
    }

    public Date b() {
        return f(this.c);
    }

    public Date c() {
        return f(this.f20324a);
    }

    public final void d(byte[] bArr, int i, int i2) {
        if (i2 >= 26) {
            if (f.equals(new ZipShort(bArr, i))) {
                this.f20324a = new ZipEightByteInteger(bArr, i + 2);
                this.f20325b = new ZipEightByteInteger(bArr, i + 10);
                this.c = new ZipEightByteInteger(bArr, i + 18);
            }
        }
    }

    public final void e() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.f20324a = zipEightByteInteger;
        this.f20325b = zipEightByteInteger;
        this.c = zipEightByteInteger;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hpr)) {
            return false;
        }
        hpr hprVar = (hpr) obj;
        ZipEightByteInteger zipEightByteInteger = this.f20324a;
        ZipEightByteInteger zipEightByteInteger2 = hprVar.f20324a;
        if (zipEightByteInteger != zipEightByteInteger2 && (zipEightByteInteger == null || !zipEightByteInteger.equals(zipEightByteInteger2))) {
            return false;
        }
        ZipEightByteInteger zipEightByteInteger3 = this.f20325b;
        ZipEightByteInteger zipEightByteInteger4 = hprVar.f20325b;
        if (zipEightByteInteger3 != zipEightByteInteger4 && (zipEightByteInteger3 == null || !zipEightByteInteger3.equals(zipEightByteInteger4))) {
            return false;
        }
        ZipEightByteInteger zipEightByteInteger5 = this.c;
        ZipEightByteInteger zipEightByteInteger6 = hprVar.c;
        return zipEightByteInteger5 == zipEightByteInteger6 || (zipEightByteInteger5 != null && zipEightByteInteger5.equals(zipEightByteInteger6));
    }

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return d;
    }

    public int hashCode() {
        ZipEightByteInteger zipEightByteInteger = this.f20324a;
        int iHashCode = zipEightByteInteger != null ? (-123) ^ zipEightByteInteger.hashCode() : -123;
        ZipEightByteInteger zipEightByteInteger2 = this.f20325b;
        if (zipEightByteInteger2 != null) {
            iHashCode ^= Integer.rotateLeft(zipEightByteInteger2.hashCode(), 11);
        }
        ZipEightByteInteger zipEightByteInteger3 = this.c;
        return zipEightByteInteger3 != null ? iHashCode ^ Integer.rotateLeft(zipEightByteInteger3.hashCode(), 22) : iHashCode;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        e();
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i2 + i;
        int value = i + 4;
        while (value + 4 <= i3) {
            ZipShort zipShort = new ZipShort(bArr, value);
            int i4 = value + 2;
            if (zipShort.equals(e)) {
                d(bArr, i4, i3 - i4);
                return;
            }
            value = i4 + new ZipShort(bArr, i4).getValue() + 2;
        }
    }

    public String toString() {
        return "0x000A Zip Extra Field: Modify:[" + c() + "]  Access:[" + a() + "]  Create:[" + b() + "] ";
    }
}
