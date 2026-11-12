package defpackage;

import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes46.dex */
public class zos implements Decrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zox f54408a = new zox();

    public zos(char[] cArr, long j, long j2, byte[] bArr, boolean z) throws ZipException {
        b(bArr, cArr, j2, j, z);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] bArr, int i, int i2) throws ZipException {
        if (i < 0 || i2 < 0) {
            throw new ZipException("one of the input parameters were null in standard decrypt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b2 = bArr[i3];
            byte b3 = (byte) (((b2 & 255) ^ this.f54408a.b()) & 255);
            this.f54408a.a(b3);
            bArr[i3] = b3;
        }
        return i2;
    }

    private void b(byte[] bArr, char[] cArr, long j, long j2, boolean z) throws ZipException {
        byte b2;
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
        }
        this.f54408a.b(cArr, z);
        int i = 0;
        byte b3 = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12 && (b2 = (byte) (this.f54408a.b() ^ b3)) != ((byte) (j2 >> 24)) && b2 != ((byte) (j >> 8))) {
                throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
            }
            zox zoxVar = this.f54408a;
            zoxVar.a((byte) (zoxVar.b() ^ b3));
            if (i != 12) {
                b3 = bArr[i];
            }
        }
    }
}
