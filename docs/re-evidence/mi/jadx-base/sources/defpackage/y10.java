package defpackage;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y10 implements d1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f39673b;
    public byte[] c;

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b2 = bArr[i];
        if (b2 != 1) {
            throw new ZipException("Unsupported version [" + ((int) b2) + "] for UniCode path extra data.");
        }
        this.f39672a = ZipLong.getValue(bArr, i + 1);
        int i3 = i2 - 5;
        byte[] bArr2 = new byte[i3];
        this.f39673b = bArr2;
        System.arraycopy(bArr, i + 5, bArr2, 0, i3);
        this.c = null;
    }
}
