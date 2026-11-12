package defpackage;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public class nqk implements d1s {
    public static final ZipShort d = new ZipShort(41246);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f28264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28265b;
    public int c = 0;

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return d;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 >= 2) {
            int value = ZipShort.getValue(bArr, i);
            this.f28264a = (short) (value & 32767);
            this.f28265b = (value & 32768) != 0;
        } else {
            throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): " + i2);
        }
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromCentralDirectoryData(bArr, i, i2);
        this.c = i2 - 2;
    }
}
