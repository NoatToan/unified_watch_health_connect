package com.beaglebuddy.lyrics3;

import com.beaglebuddy.exception.ParseException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class Lyrics3v1Tag {
    private static final String f = "LYRICSBEGIN";
    private static final String g = "LYRICSEND";
    private static final String h = "ISO-8859-1";
    private static final int i = 5100;
    private static final int j = 11;
    private static final int k = 9;
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;

    public Lyrics3v1Tag(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        long length = randomAccessFile.length() - 128;
        int i2 = k;
        int i3 = (int) (length - ((long) i2));
        this.a = i3;
        randomAccessFile.seek(i3);
        String str = new String(b(randomAccessFile, i2), "ISO-8859-1");
        this.e = str;
        if (!str.equals(g)) {
            int i4 = this.a + 128;
            this.a = i4;
            randomAccessFile.seek(i4);
            byte[] bArrB = b(randomAccessFile, i2);
            String str2 = new String(bArrB, "ISO-8859-1");
            this.e = str2;
            if (!str2.equals(g)) {
                throw new ParseException("Invalid id, " + this.e + ", found in the Lyrics3v1 tag.", bArrB);
            }
        }
        randomAccessFile.seek(this.a);
        a(randomAccessFile);
    }

    private void a(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        byte[] bArrB = b(randomAccessFile, i);
        int length = (bArrB.length - j) - 1;
        boolean zEquals = false;
        while (length >= 0 && !zEquals) {
            if (bArrB[length] == 76 && bArrB[length + 1] == 89) {
                String str = new String(bArrB, length, j, "ISO-8859-1");
                this.c = str;
                zEquals = str.equals(f);
            }
            length--;
        }
        if (!zEquals) {
            throw new ParseException("Beginning id not found in the Lyrics3v1 tag.");
        }
        int i2 = j;
        String str2 = new String(bArrB, length + i2, (i - length) - i2, "ISO-8859-1");
        this.d = str2;
        this.b = k + i2 + str2.length();
        this.a -= this.d.length() + i2;
    }

    private static byte[] b(RandomAccessFile randomAccessFile, int i2) throws ParseException, IOException {
        byte[] bArr = new byte[i2];
        int i3 = randomAccessFile.read(bArr);
        if (i3 == i2) {
            return bArr;
        }
        if (i3 == -1) {
            throw new ParseException("EOF", bArr);
        }
        byte[] bArr2 = new byte[1];
        if (randomAccessFile.read(bArr2) == -1) {
            throw new ParseException("EOF", bArr2);
        }
        throw new IOException("Unable to read Lyrics3v1 tag.");
    }

    public int getFilePosition() {
        return this.a;
    }

    public String getLyrics() {
        return this.d;
    }

    public int getSize() {
        return this.b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lyrics3 v1 tag\n");
        stringBuffer.append("   begin id.....: " + this.c + "\n");
        stringBuffer.append("   file position: " + this.a + "\n");
        stringBuffer.append("   size.........: " + this.b + " bytes\n");
        stringBuffer.append("   lyrics.......: " + this.d + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   end id.......: ");
        sb.append(this.c);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }
}
