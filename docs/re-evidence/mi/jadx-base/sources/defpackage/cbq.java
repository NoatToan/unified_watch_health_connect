package defpackage;

import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public final class cbq implements d1s {
    public static final ZipShort c = new ZipShort(44225);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f5171b;

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return c;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        this.f5171b = Arrays.copyOfRange(bArr, i, i + i2);
        if (this.f5170a == null) {
            parseFromLocalFileData(bArr, i, i2);
        }
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f5170a = Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
