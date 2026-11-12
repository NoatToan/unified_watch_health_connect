package com.beaglebuddy.id3.v23;

import com.beaglebuddy.id3.enums.ID3TagVersion;
import com.beaglebuddy.util.Utility;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23TagHeader {
    public static final int TAG_HEADER_SIZE = 10;
    private static final byte h = -128;
    private static final byte i = 64;
    private static final byte j = 32;
    private byte[] a;
    private boolean b;
    private ID3TagVersion c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;

    public ID3v23TagHeader() {
        this.a = new byte[10];
        ID3TagVersion iD3TagVersion = ID3TagVersion.ID3V2_3;
        this.c = iD3TagVersion;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.b = true;
        System.arraycopy(iD3TagVersion.getIdBytes(), 0, this.a, 0, 5);
    }

    public int getSize() {
        return 10;
    }

    public int getTagSize() {
        return this.d;
    }

    public ID3TagVersion getVersion() {
        return this.c;
    }

    public boolean isDirty() {
        return this.b;
    }

    public boolean isExperimentalIndicator() {
        return this.g;
    }

    public boolean isExtendedHeaderPresent() {
        return this.f;
    }

    public boolean isUnsynchronization() {
        return this.e;
    }

    public void save(OutputStream outputStream) throws IOException {
        if (this.b) {
            throw new IllegalStateException("The ID3v2.3 tag header has been modified and requires setBuffer() to be called before it can be saved.");
        }
        outputStream.write(this.a);
    }

    public void setBuffer() {
        System.arraycopy(this.c.getIdBytes(), 0, this.a, 0, 5);
        byte[] bArr = this.a;
        bArr[5] = (byte) (this.e ? bArr[5] | (-128) : bArr[5] & 127);
        bArr[5] = (byte) (this.f ? bArr[5] | 64 : bArr[5] & ByteSourceJsonBootstrapper.UTF8_BOM_3);
        bArr[5] = (byte) (this.g ? bArr[5] | 32 : bArr[5] & (-33));
        System.arraycopy(Utility.synchsafeIntToBytes(this.d), 0, this.a, 6, 4);
        this.b = false;
    }

    public void setExperimentalIndicator(boolean z) {
        if (this.g != z) {
            this.g = z;
            this.b = true;
        }
    }

    public void setExtendedHeaderPresent(boolean z) {
        if (this.f != z) {
            this.f = z;
            this.b = true;
        }
    }

    public void setTagSize(int i2) {
        if (i2 >= 0) {
            if (this.d != i2) {
                this.d = i2;
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid ID3v2.3 tag size, " + i2 + ". It must be > 0.");
    }

    public void setUnsynchronization(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.b = true;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID3v2.3 tag header\n");
        stringBuffer.append("   bytes..................: " + this.a.length + " bytes\n");
        stringBuffer.append("                            " + Utility.hex(this.a, 38) + "\n");
        stringBuffer.append("   version................: " + this.c + "\n");
        stringBuffer.append("   tag size...............: " + this.d + " bytes\n");
        stringBuffer.append("   unsynchronization......: " + this.e + "\n");
        stringBuffer.append("   extended header present: " + this.f + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   experimental indicator.: ");
        sb.append(this.g);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        if (!this.b) {
            randomAccessFile.write(this.a);
            return;
        }
        throw new IllegalStateException("The ID3v2.3 tag header has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public ID3v23TagHeader(InputStream inputStream) throws IOException {
        this();
        byte[] bArr = new byte[5];
        if (inputStream.read(bArr) == 5) {
            System.arraycopy(bArr, 0, this.a, 5, 5);
            this.e = (bArr[0] & (-128)) != 0;
            this.f = (bArr[0] & 64) != 0;
            this.g = (bArr[0] & 32) != 0;
            this.d = Utility.bytesToSynchsafeInt(bArr, 1);
            this.b = false;
            return;
        }
        throw new IOException("Unable to read in the ID3v2.3 tag header from the .mp3 file.");
    }
}
