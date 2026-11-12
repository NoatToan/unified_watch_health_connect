package defpackage;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public final class rqd implements d1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ZipShort f32798a = new ZipShort(51966);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ZipShort f32799b = new ZipShort(0);
    public static final byte[] c = new byte[0];
    public static final rqd d = new rqd();

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return f32798a;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
