package defpackage;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public class a1s implements d1s {
    public static final ZipShort f = new ZipShort(1);
    public static final byte[] g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZipEightByteInteger f537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZipEightByteInteger f538b;
    public ZipEightByteInteger c;
    public ZipLong d;
    public byte[] e;

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return f;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArr2 = new byte[i2];
        this.e = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (i2 >= 28) {
            parseFromLocalFileData(bArr, i, i2);
            return;
        }
        if (i2 == 24) {
            this.f537a = new ZipEightByteInteger(bArr, i);
            this.f538b = new ZipEightByteInteger(bArr, i + 8);
            this.c = new ZipEightByteInteger(bArr, i + 16);
        } else if (i2 % 8 == 4) {
            this.d = new ZipLong(bArr, (i + i2) - 4);
        }
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 == 0) {
            return;
        }
        if (i2 < 16) {
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
        this.f537a = new ZipEightByteInteger(bArr, i);
        this.f538b = new ZipEightByteInteger(bArr, i + 8);
        int i3 = i + 16;
        int i4 = i2 - 16;
        if (i4 >= 8) {
            this.c = new ZipEightByteInteger(bArr, i3);
            i3 = i + 24;
            i4 = i2 - 24;
        }
        if (i4 >= 4) {
            this.d = new ZipLong(bArr, i3);
        }
    }
}
