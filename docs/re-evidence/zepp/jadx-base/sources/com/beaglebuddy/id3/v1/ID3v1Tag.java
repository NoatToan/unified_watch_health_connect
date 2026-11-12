package com.beaglebuddy.id3.v1;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.id3.enums.Genre;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v1Tag {
    public static final int TAG_SIZE = 128;
    private static final String k = "ISO-8859-1";
    private int a;
    private byte[] b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private byte i;
    private byte j;

    public ID3v1Tag(InputStream inputStream, int i, String str) throws ParseException, IOException {
        byte[] bArr = new byte[128];
        this.b = bArr;
        this.a = i;
        if (inputStream.read(bArr) == this.b.length) {
            a();
        }
    }

    private void a() throws ParseException, IOException {
        byte[] bArr = this.b;
        if (((char) bArr[0]) != 'T' || ((char) bArr[1]) != 'A' || ((char) bArr[2]) != 'G') {
            throw new ParseException(" mp3 file does not contain an ID3v1 tag.");
        }
        this.e = new String(bArr, 3, 30, "ISO-8859-1").trim();
        this.d = new String(this.b, 33, 30, "ISO-8859-1").trim();
        this.f = new String(this.b, 63, 30, "ISO-8859-1").trim();
        this.h = new String(this.b, 93, 4, "ISO-8859-1").trim();
        this.g = new String(this.b, 97, 30, "ISO-8859-1").trim();
        byte[] bArr2 = this.b;
        this.j = bArr2[127];
        if (bArr2[125] != 0) {
            this.c = "1.0";
        } else {
            this.i = bArr2[126];
            this.c = "1.1";
        }
    }

    public String getAlbum() {
        return this.f;
    }

    public String getArtist() {
        return this.d;
    }

    public String getComment() {
        return this.g;
    }

    public byte getGenre() {
        return this.j;
    }

    public String getGenreAsString() {
        int i = this.j & 255;
        return i < Genre.REMIX.ordinal() ? Genre.valueOf((byte) i).getName() : "";
    }

    public String getTitle() {
        return this.e;
    }

    public byte getTrack() {
        return this.i;
    }

    public String getVersion() {
        return this.c;
    }

    public String getYear() {
        return this.h;
    }

    public void setAlbum(String str) {
        this.f = str;
    }

    public void setArtist(String str) {
        this.d = str;
    }

    public void setComment(String str) {
        this.g = str;
    }

    public void setGenre(byte b) {
        if (b <= 80) {
            this.j = b;
            return;
        }
        throw new IllegalArgumentException("Invalid ID3v1 genre value, " + ((int) b) + ".  It must be between 0 <= genre <= 79.");
    }

    public void setTitle(String str) {
        this.e = str;
    }

    public void setTrack(byte b) {
        this.i = b;
    }

    public void setYear(String str) {
        this.h = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID3v" + this.c + " tag\n");
        stringBuffer.append("   file position: " + this.a + "\n");
        stringBuffer.append("   title........: " + this.e + "\n");
        stringBuffer.append("   artist.......: " + this.d + "\n");
        stringBuffer.append("   album........: " + this.f + "\n");
        stringBuffer.append("   year.........: " + this.h + "\n");
        stringBuffer.append("   comment......: " + this.f + "\n");
        stringBuffer.append("   track........: " + ((int) this.i) + "\n");
        stringBuffer.append("   genre........: " + ((int) this.j) + " - " + getGenreAsString());
        return stringBuffer.toString();
    }

    public ID3v1Tag(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        int length = (int) (randomAccessFile.length() - 128);
        this.a = length;
        this.b = new byte[128];
        randomAccessFile.seek(length);
        if (randomAccessFile.read(this.b) == 128) {
            a();
            return;
        }
        throw new IOException("Unable to read ID3v1 tag.");
    }
}
