package com.beaglebuddy.lyrics3;

import com.beaglebuddy.exception.ParseException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class Lyrics3v2Tag {
    private static final String A = "CRC";
    private static final String B = "ISO-8859-1";
    private static final char C = '1';
    private static final int D = 3;
    private static final int E = 5;
    private static final int F = 6;
    private static final int G = 15;
    private static final String q = "LYRICSBEGIN";
    private static final String r = "LYRICS200";
    private static final String s = "IND";
    private static final String t = "LYR";
    private static final String u = "INF";
    private static final String v = "AUT";
    private static final String w = "EAL";
    private static final String x = "EAR";
    private static final String y = "ETT";
    private static final String z = "IMG";
    private int a;
    private int b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private int o;
    private String p;

    public Lyrics3v2Tag(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        int length = (int) ((randomAccessFile.length() - 128) - ((long) G));
        this.a = length;
        randomAccessFile.seek(length);
        try {
            this.o = a(randomAccessFile);
        } catch (ParseException unused) {
            int i = this.a + 128;
            this.a = i;
            randomAccessFile.seek(i);
            this.o = a(randomAccessFile);
        }
        int i2 = this.o;
        this.b = G + i2;
        int i3 = this.a - i2;
        this.a = i3;
        randomAccessFile.seek(i3);
        byte[] bArrD = d(randomAccessFile, 11);
        String str = new String(bArrD);
        this.c = str;
        if (!str.equals(q)) {
            throw new ParseException("Invalid id, " + this.c + ", found in the Lyrics3v2 tag.", bArrD);
        }
        do {
            String str2 = new String(d(randomAccessFile, 3));
            if (str2.equals(s)) {
                b(randomAccessFile, str2);
            } else if (str2.equals(t)) {
                this.g = c(randomAccessFile, str2);
            } else if (str2.equals(u)) {
                this.h = c(randomAccessFile, str2);
            } else if (str2.equals(v)) {
                this.i = c(randomAccessFile, str2);
            } else if (str2.equals(w)) {
                this.j = c(randomAccessFile, str2);
            } else if (str2.equals(x)) {
                this.k = c(randomAccessFile, str2);
            } else if (str2.equals(y)) {
                this.l = c(randomAccessFile, str2);
            } else if (str2.equals(z)) {
                this.m = c(randomAccessFile, str2);
            } else {
                if (!str2.equals(A)) {
                    throw new ParseException("Invalid field, " + str2 + ", found in the Lyrics3v2 tag.");
                }
                this.n = c(randomAccessFile, str2);
            }
        } while (((int) (randomAccessFile.getFilePointer() - ((long) this.a))) < this.o);
    }

    private int a(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        byte[] bArrD = d(randomAccessFile, G);
        byte[] bArr = new byte[6];
        byte[] bArr2 = new byte[9];
        System.arraycopy(bArrD, 0, bArr, 0, 6);
        System.arraycopy(bArrD, 6, bArr2, 0, 9);
        String str = new String(bArr2, "ISO-8859-1");
        this.p = str;
        if (!str.equals(r)) {
            throw new ParseException("Invalid end id, " + this.p + ", found in the Lyrics3v2 tag.", bArrD);
        }
        String str2 = null;
        try {
            String str3 = new String(bArr, "ISO-8859-1");
            try {
                return Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                str2 = str3;
                throw new ParseException("Unable to parse the tag size, " + str2 + ", from the end of the Lyrics3v2 tag.");
            }
        } catch (NumberFormatException unused2) {
        }
    }

    private void b(RandomAccessFile randomAccessFile, String str) throws ParseException, IOException {
        String strC = c(randomAccessFile, str);
        this.d = strC.charAt(0) == '1';
        this.e = strC.charAt(1) == '1';
        this.f = false;
    }

    private static String c(RandomAccessFile randomAccessFile, String str) throws ParseException, IOException {
        String str2 = new String(d(randomAccessFile, 5), "ISO-8859-1");
        try {
            return new String(d(randomAccessFile, Integer.parseInt(str2)), "ISO-8859-1");
        } catch (NumberFormatException unused) {
            throw new ParseException("Unable to parse the size, " + str2 + ", from the " + str + " field in the Lyrics3v2 tag.");
        }
    }

    private static byte[] d(RandomAccessFile randomAccessFile, int i) throws ParseException, IOException {
        byte[] bArr = new byte[i];
        int i2 = randomAccessFile.read(bArr);
        if (i2 == i) {
            return bArr;
        }
        if (i2 == -1) {
            throw new ParseException("EOF", bArr);
        }
        byte[] bArr2 = new byte[1];
        if (randomAccessFile.read(bArr2) == -1) {
            throw new ParseException("EOF", bArr2);
        }
        throw new IOException("Unable to read Lyrics3v2 tag.");
    }

    public String getAdditionalInfo() {
        return this.h;
    }

    public String getAlbumName() {
        return this.j;
    }

    public String getArtistName() {
        return this.k;
    }

    public String getAuthorName() {
        return this.i;
    }

    public String getCRC() {
        return this.n;
    }

    public int getFilePosition() {
        return this.a;
    }

    public String getImageLink() {
        return this.m;
    }

    public String getLyrics() {
        return this.g;
    }

    public int getSize() {
        return this.b;
    }

    public String getTrackTitle() {
        return this.l;
    }

    public boolean isLyricsPresent() {
        return this.d;
    }

    public boolean isRandomTrackSelectionAllowed() {
        return this.f;
    }

    public boolean isTimestampPresent() {
        return this.e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lyrics3v2 tag\n");
        stringBuffer.append("   begin id......................: " + this.c + "\n");
        stringBuffer.append("   file position.................: " + this.a + "\n");
        stringBuffer.append("   size..........................: " + this.b + " bytes\n");
        stringBuffer.append("   lyrics present................: " + this.d + "\n");
        stringBuffer.append("   timstamps present.............: " + this.e + "\n");
        stringBuffer.append("   random track selection allowed: " + this.f + "\n");
        stringBuffer.append("   author name...................: " + this.i + "\n");
        stringBuffer.append("   album name....................: " + this.j + "\n");
        stringBuffer.append("   artist name...................: " + this.k + "\n");
        stringBuffer.append("   track title...................: " + this.l + "\n");
        stringBuffer.append("   image link....................: " + this.m + "\n");
        stringBuffer.append("   additional information........: " + this.h + "\n");
        stringBuffer.append("   crc...........................: " + this.n + "\n");
        stringBuffer.append("   end size......................: " + this.b + "\n");
        stringBuffer.append("   end id........................: " + this.p + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   lyrics........................: ");
        sb.append(this.g);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }
}
