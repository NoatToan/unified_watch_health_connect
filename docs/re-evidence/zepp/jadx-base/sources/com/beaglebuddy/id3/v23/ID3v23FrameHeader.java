package com.beaglebuddy.id3.v23;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyUtility;
import com.beaglebuddy.util.Utility;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameHeader {
    private static final int p = 10;
    private static final int q = 4;
    private static final int r = 1;
    private static final int s = 1;
    private static final int t = 16;
    private static final byte u = -128;
    private static final byte v = 64;
    private static final byte w = 32;
    private static final byte x = -128;
    private static final byte y = 64;
    private static final byte z = 32;
    private byte[] a;
    private FrameType b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private byte l;
    private byte m;
    private boolean n;
    private String o;

    public ID3v23FrameHeader(FrameType frameType) {
        this.a = new byte[10];
        this.b = frameType;
        this.c = false;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.l = (byte) 0;
        this.m = (byte) 0;
        this.n = true;
    }

    public byte getEncryptionMethod() {
        return this.l;
    }

    public int getFrameBodySize() {
        return this.d;
    }

    public FrameType getFrameType() {
        return this.b;
    }

    public byte getGroupId() {
        return this.m;
    }

    public String getInvalidFrameId() {
        return this.o;
    }

    public int getSize() {
        return this.a.length;
    }

    public int getUncompressedSize() {
        return this.k;
    }

    public boolean isBelongsToGroup() {
        return this.j;
    }

    public boolean isCompressed() {
        return this.h;
    }

    public boolean isDirty() {
        return this.n;
    }

    public boolean isEncrypted() {
        return this.i;
    }

    public boolean isFileAlterPreservation() {
        return this.f;
    }

    public boolean isPadding() {
        return this.c;
    }

    public boolean isReadOnly() {
        return this.g;
    }

    public boolean isTagAlterPreservation() {
        return this.e;
    }

    public void save(OutputStream outputStream) throws IOException {
        if (!this.n) {
            outputStream.write(this.a);
            return;
        }
        throw new IllegalStateException("ID3v2.3 frame " + this.b.getName() + " has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public void setBelongsToGroup(boolean z2) {
        this.n = true;
        this.j = z2;
    }

    public void setBuffer() {
        int i = 10;
        int i2 = (this.h ? 4 : 0) + 10 + (this.i ? 1 : 0) + (this.j ? 1 : 0);
        byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.b.getId());
        byte[] bArr = new byte[i2];
        this.a = bArr;
        System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
        byte[] bArr2 = this.a;
        int i3 = this.d;
        bArr2[4] = (byte) ((i3 & (-16777216)) >> 24);
        bArr2[5] = (byte) ((i3 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16);
        bArr2[6] = (byte) ((i3 & 65280) >> 8);
        bArr2[7] = (byte) (i3 & 255);
        bArr2[8] = (byte) (this.e ? bArr2[8] | (-128) : bArr2[8] & 127);
        bArr2[8] = (byte) (this.f ? bArr2[8] | 64 : bArr2[8] & ByteSourceJsonBootstrapper.UTF8_BOM_3);
        bArr2[8] = (byte) (this.g ? bArr2[8] | 32 : bArr2[8] & (-33));
        boolean z2 = this.h;
        bArr2[9] = (byte) (z2 ? bArr2[9] | (-128) : bArr2[9] & 127);
        boolean z3 = this.i;
        bArr2[9] = (byte) (z3 ? bArr2[9] | 64 : bArr2[9] & ByteSourceJsonBootstrapper.UTF8_BOM_3);
        boolean z4 = this.j;
        bArr2[9] = (byte) (z4 ? bArr2[9] | 32 : bArr2[9] & (-33));
        if (bArr2.length != 10) {
            if (z2) {
                int i4 = this.k;
                bArr2[10] = (byte) ((i4 & (-16777216)) >> 24);
                bArr2[11] = (byte) ((i4 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16);
                bArr2[12] = (byte) ((i4 & 65280) >> 8);
                bArr2[13] = (byte) (i4 & 255);
                i = 14;
            }
            if (z3) {
                bArr2[i] = this.l;
                i++;
            }
            if (z4) {
                bArr2[i] = this.m;
            }
        }
        this.n = false;
    }

    public void setCompressed(boolean z2) {
        this.n = true;
        this.h = z2;
    }

    public void setEncrypted(boolean z2) {
        this.n = true;
        this.i = z2;
    }

    public void setEncryptionMethod(byte b) {
        this.n = true;
        this.i = b != 0;
        this.l = b;
    }

    public void setFileAlterPreservation(boolean z2) {
        this.n = true;
        this.f = z2;
    }

    public void setFrameBodySize(int i) {
        if (i >= 0) {
            this.n = true;
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid ID3v2.3 frame body size, " + i + ", in frame " + this.b.getName() + ". It must be > 0.");
    }

    public void setFrameType(FrameType frameType) {
        this.n = true;
        this.b = frameType;
    }

    public void setGroupId(byte b) {
        this.n = true;
        this.j = b != 0;
        this.m = b;
    }

    public void setReadOnly(boolean z2) {
        this.n = true;
        this.g = z2;
    }

    public void setTagAlterPreservation(boolean z2) {
        this.n = true;
        this.e = z2;
    }

    public void setUncompressedSize(int i) {
        if (i >= 0) {
            this.n = true;
            this.h = i != 0;
            this.k = i;
        } else {
            throw new IllegalArgumentException("Invalid uncompressed size, " + i + ", in ID3v2.3 frame " + this.b.getName() + ". It must be >= 0.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame header\n");
        stringBuffer.append("   bytes..................: " + Utility.hex(this.a, 0) + "\n");
        stringBuffer.append("   frame type.............: " + this.b + "\n");
        stringBuffer.append("   frame header size......: " + this.a.length + "\n");
        stringBuffer.append("   frame body size........: " + this.d + "\n");
        stringBuffer.append("   tag  alter preservation: " + this.e + "\n");
        stringBuffer.append("   file alter preservation: " + this.f + "\n");
        stringBuffer.append("   read only..............: " + this.g + "\n");
        stringBuffer.append("   compression............: " + this.h + "\n");
        stringBuffer.append("   encryption.............: " + this.i + "\n");
        stringBuffer.append("   grouping identity......: " + this.j + "\n");
        stringBuffer.append("   uncompressed size......: " + this.k + "\n");
        stringBuffer.append("   encryption method......: " + ((int) this.l) + "\n");
        stringBuffer.append("   group Id...............: " + ((int) this.m) + "\n");
        return stringBuffer.toString();
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        if (!this.n) {
            randomAccessFile.write(this.a);
            return;
        }
        throw new IllegalStateException("ID3v2.3 frame " + this.b.getName() + " has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public ID3v23FrameHeader(InputStream inputStream) throws IOException {
        byte b = (byte) inputStream.read();
        if (b == 0) {
            this.c = true;
        } else {
            byte[] bArr = new byte[9];
            byte[] bArr2 = new byte[16];
            if (inputStream.read(bArr) == 9) {
                bArr2[0] = b;
                System.arraycopy(bArr, 0, bArr2, 1, 9);
                try {
                    this.b = FrameType.getFrameType(new String(bArr2, 0, 4, Encoding.ISO_8859_1.getCharacterSet()));
                } catch (IllegalArgumentException unused) {
                    this.o = new String(bArr2, 0, 4, Encoding.ISO_8859_1.getCharacterSet());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.d = Utility.bytesToInt(bArr2, 4);
                this.e = (bArr2[8] & (-128)) != 0;
                this.f = (bArr2[8] & 64) != 0;
                this.g = (bArr2[8] & 32) != 0;
                boolean z2 = (bArr2[9] & (-128)) != 0;
                this.h = z2;
                this.i = (bArr2[9] & 64) != 0;
                this.j = (bArr2[9] & 32) != 0;
                int i = 10;
                if (z2) {
                    byte[] bArr3 = new byte[4];
                    inputStream.read(bArr3);
                    System.arraycopy(bArr3, 0, bArr2, 10, 4);
                    i = 14;
                    this.k = ((bArr3[0] & 255) << 24) + ((bArr3[1] & 255) << 16) + ((bArr3[2] & 255) << 8) + (bArr3[3] & 255);
                }
                if (this.i) {
                    byte b2 = (byte) inputStream.read();
                    this.l = b2;
                    bArr2[i] = b2;
                    i++;
                }
                if (this.j) {
                    byte b3 = (byte) inputStream.read();
                    this.m = b3;
                    bArr2[i] = b3;
                    i++;
                }
                byte[] bArr4 = new byte[i];
                this.a = bArr4;
                System.arraycopy(bArr2, 0, bArr4, 0, i);
            } else {
                throw new IOException("Unable to read a ID3v2.3 frame header.");
            }
        }
        this.n = false;
    }

    public ID3v23FrameHeader(ID3v23FrameHeader iD3v23FrameHeader) {
        this.a = iD3v23FrameHeader.a;
        this.b = iD3v23FrameHeader.b;
        this.d = iD3v23FrameHeader.d;
        this.e = iD3v23FrameHeader.e;
        this.f = iD3v23FrameHeader.f;
        this.g = iD3v23FrameHeader.g;
        this.h = iD3v23FrameHeader.h;
        this.i = iD3v23FrameHeader.i;
        this.j = iD3v23FrameHeader.j;
        this.k = iD3v23FrameHeader.k;
        this.l = iD3v23FrameHeader.l;
        this.m = iD3v23FrameHeader.m;
        this.n = iD3v23FrameHeader.n;
    }
}
