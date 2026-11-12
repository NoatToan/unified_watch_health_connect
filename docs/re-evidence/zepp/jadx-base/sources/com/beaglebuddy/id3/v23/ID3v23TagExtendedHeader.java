package com.beaglebuddy.id3.v23;

import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23TagExtendedHeader {
    private static final int f = 4;
    private static final int g = 10;
    private static final int h = 4;
    private static final byte i = -128;
    private byte[] a;
    private boolean b;
    private boolean c;
    private int d;
    private byte[] e;

    public ID3v23TagExtendedHeader() {
        this.a = new byte[10];
        this.c = false;
        this.d = 0;
        this.e = new byte[0];
        this.b = true;
    }

    public byte[] getCRCData() throws IllegalStateException {
        if (this.c) {
            return this.e;
        }
        throw new IllegalStateException("CRC Data may not be read from the ID3v2.3 extended tag header when the CRCDataPresent flag is false.");
    }

    public int getPaddingSize() {
        return this.d;
    }

    public int getSize() {
        if (this.b) {
            setBuffer();
        }
        return this.a.length;
    }

    public boolean isCRCDataPresent() {
        return this.c;
    }

    public boolean isDirty() {
        return this.b;
    }

    public void save(OutputStream outputStream) throws IOException {
        if (this.b) {
            throw new IllegalStateException("The ID3v2.3 tag extended header has been modified and requires setBuffer() to be called before it can be saved.");
        }
        outputStream.write(this.a);
    }

    public void setBuffer() {
        System.arraycopy(Utility.intToBytes((this.c ? 4 : 0) + 6), 0, this.a, 0, 4);
        System.arraycopy(Utility.intToBytes(this.d), 0, this.a, 6, 4);
        byte[] bArr = this.a;
        bArr[4] = this.c ? (byte) -128 : (byte) 0;
        bArr[5] = 0;
        this.b = false;
    }

    public void setCRCData(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.e = new byte[0];
            this.c = false;
        } else {
            if (bArr.length != 4) {
                throw new IllegalArgumentException("Invalid CRC length, " + bArr.length + " bytes.  It must be 4 bytes long.");
            }
            this.e = bArr;
            this.c = true;
        }
        this.b = true;
    }

    public void setPaddingSize(int i2) {
        if (i2 >= 0) {
            if (this.d != i2) {
                this.d = i2;
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid padding size, " + i2 + ". It must be >= 0.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID3v2.3 tag extended header\n");
        stringBuffer.append("   bytes.............................: " + getSize() + " bytes\n");
        stringBuffer.append("                                       " + Utility.hex(this.a, 38) + "\n");
        stringBuffer.append("   padding size......................: " + this.d + "\n");
        stringBuffer.append("   crc data present..................: " + this.c + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   CRC...............................: ");
        sb.append(Utility.hex(this.e, 38));
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        if (!this.b) {
            randomAccessFile.write(this.a);
            return;
        }
        throw new IllegalStateException("The ID3v2.3 tag extended header has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public ID3v23TagExtendedHeader(InputStream inputStream) throws IOException {
        this();
        if (inputStream.read(this.a) == 10) {
            byte[] bArr = this.a;
            this.c = (bArr[4] & (-128)) != 0;
            this.d = Utility.bytesToInt(bArr, 6);
            if (this.c) {
                int iBytesToInt = Utility.bytesToInt(this.a, 0);
                if (iBytesToInt == 10) {
                    byte[] bArr2 = new byte[4];
                    this.e = bArr2;
                    if (inputStream.read(bArr2) != 4) {
                        throw new IOException("Unable to read the ID3v2.3 CRC data from the ID3v2.3 extended tag header.");
                    }
                } else {
                    throw new IllegalStateException("The ID3v2.3 tag extended header has the CRC data present flag set to true but the specified size is " + iBytesToInt + " bytes.  It must be 10 bytes.");
                }
            }
            setBuffer();
            return;
        }
        throw new IOException("Unable to read the ID3v2.3 tag extended header.");
    }
}
