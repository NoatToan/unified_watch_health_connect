package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
public final class f1s {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17306b;
    }

    public static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f17306b;
        randomAccessFile.seek(aVar.f17305a);
        byte[] bArr = new byte[16384];
        int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (i != -1) {
            crc32.update(bArr, 0, i);
            j -= (long) i;
            if (j == 0) {
                break;
            }
            i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }

    public static a b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f17306b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f17305a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
