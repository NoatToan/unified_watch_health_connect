package defpackage;

import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.apache.commons.compress.archivers.zip.e;

/* JADX INFO: loaded from: classes3.dex */
public class ebq implements d1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZipShort f16471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f16472b;
    public byte[] c;

    public void a(byte[] bArr) {
        this.c = e.c(bArr);
    }

    public void b(ZipShort zipShort) {
        this.f16471a = zipShort;
    }

    public void c(byte[] bArr) {
        this.f16472b = e.c(bArr);
    }

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return this.f16471a;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        a(bArrCopyOfRange);
        if (this.f16472b == null) {
            c(bArrCopyOfRange);
        }
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        c(Arrays.copyOfRange(bArr, i, i2 + i));
    }
}
