package com.tencent.open.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f31092a = new n(101010256);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f31093b = new o(38651);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Properties f31094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f31095b;

        private a() {
            this.f31094a = new Properties();
        }

        void a(byte[] bArr) throws IOException {
            if (bArr == null) {
                return;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int length = b.f31093b.a().length;
            byte[] bArr2 = new byte[length];
            byteBufferWrap.get(bArr2);
            if (!b.f31093b.equals(new o(bArr2))) {
                throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
            }
            if (bArr.length - length <= 2) {
                return;
            }
            byte[] bArr3 = new byte[2];
            byteBufferWrap.get(bArr3);
            int iB = new o(bArr3).b();
            if ((bArr.length - length) - 2 < iB) {
                return;
            }
            byte[] bArr4 = new byte[iB];
            byteBufferWrap.get(bArr4);
            this.f31094a.load(new ByteArrayInputStream(bArr4));
            int length2 = ((bArr.length - length) - iB) - 2;
            if (length2 > 0) {
                byte[] bArr5 = new byte[length2];
                this.f31095b = bArr5;
                byteBufferWrap.get(bArr5);
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.f31094a + ", otherData=" + Arrays.toString(this.f31095b) + "]";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(File file, String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        Object[] objArr = 0;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrA = a(randomAccessFile2);
                if (bArrA != null) {
                    a aVar = new a();
                    aVar.a(bArrA);
                    String property = aVar.f31094a.getProperty(str);
                    randomAccessFile2.close();
                    return property;
                }
                randomAccessFile2.close();
                return null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(File file) throws IOException {
        return a(file, "channelNo");
    }

    private static byte[] a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArrA = f31092a.a();
        int i = randomAccessFile.read();
        while (i != -1) {
            if (i != bArrA[0] || randomAccessFile.read() != bArrA[1] || randomAccessFile.read() != bArrA[2] || randomAccessFile.read() != bArrA[3]) {
                length--;
                randomAccessFile.seek(length);
                i = randomAccessFile.read();
            } else {
                randomAccessFile.seek(length + 20);
                byte[] bArr = new byte[2];
                randomAccessFile.readFully(bArr);
                int iB = new o(bArr).b();
                if (iB == 0) {
                    return null;
                }
                byte[] bArr2 = new byte[iB];
                randomAccessFile.read(bArr2);
                return bArr2;
            }
        }
        throw new ZipException("archive is not a ZIP archive");
    }
}
