package com.beaglebuddy.id3.v24;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyUtility;
import com.beaglebuddy.util.Utility;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameHeader {
    private static final byte A = 16;
    private static final byte B = 64;
    private static final byte C = 8;
    private static final byte D = 4;
    private static final byte E = 2;
    private static final byte F = 1;
    private static final int s = 10;
    private static final int t = 4;
    private static final int u = 1;
    private static final int v = 1;
    private static final int w = 4;
    private static final int x = 20;
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
    private boolean k;
    private boolean l;
    private byte m;
    private int n;
    private byte o;
    private int p;
    private boolean q;
    private String r;

    public ID3v24FrameHeader(FrameType frameType) {
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
        this.k = false;
        this.l = false;
        this.m = (byte) 0;
        this.n = 0;
        this.o = (byte) 0;
        this.p = 0;
        this.q = true;
    }

    public int getDataLengthIndicator() {
        return this.p;
    }

    public byte getEncryptionMethod() {
        return this.o;
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
        return this.r;
    }

    public int getSize() {
        return this.a.length;
    }

    public int getUncompressedSize() {
        return this.n;
    }

    public boolean isBelongsToGroup() {
        return this.h;
    }

    public boolean isCompressed() {
        return this.i;
    }

    public boolean isDataLengthIndicatorPresent() {
        return this.l;
    }

    public boolean isDirty() {
        return this.q;
    }

    public boolean isEncrypted() {
        return this.j;
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

    public boolean isUnsynchronized() {
        return this.k;
    }

    public void save(OutputStream outputStream) throws IOException {
        if (!this.q) {
            outputStream.write(this.a);
            return;
        }
        throw new IllegalStateException("ID3v2.4 frame " + this.b.getName() + " has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public void setBelongsToGroup(boolean z2) {
        this.q = true;
        this.h = z2;
    }

    public void setBuffer() {
        int i = 10;
        this.a = new byte[(this.i ? 4 : 0) + 10 + (this.j ? 1 : 0) + (this.h ? 1 : 0) + (this.l ? 4 : 0)];
        System.arraycopy(ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.b.getId()), 0, this.a, 0, 4);
        System.arraycopy(Utility.synchsafeIntToBytes(this.d), 0, this.a, 4, 4);
        byte[] bArr = this.a;
        bArr[8] = (byte) (this.e ? bArr[8] | 64 : bArr[8] & ByteSourceJsonBootstrapper.UTF8_BOM_3);
        bArr[8] = (byte) (this.f ? bArr[8] | 32 : bArr[8] & (-33));
        bArr[8] = (byte) (this.g ? bArr[8] | 16 : bArr[8] & ByteSourceJsonBootstrapper.UTF8_BOM_1);
        boolean z2 = this.h;
        bArr[9] = (byte) (z2 ? bArr[9] | 64 : bArr[9] & ByteSourceJsonBootstrapper.UTF8_BOM_3);
        boolean z3 = this.i;
        bArr[9] = (byte) (z3 ? 8 | bArr[9] : bArr[9] & (-9));
        bArr[9] = (byte) (this.j ? bArr[9] | 4 : bArr[9] & (-5));
        bArr[9] = (byte) (this.k ? bArr[9] | 2 : bArr[9] & (-3));
        bArr[9] = (byte) (this.l ? bArr[9] | 1 : bArr[9] & (-2));
        if (bArr.length != 10) {
            if (z2) {
                bArr[10] = this.m;
                i = 11;
            }
            if (z3) {
                System.arraycopy(Utility.synchsafeIntToBytes(this.n), 0, this.a, i, 4);
                i += 4;
            }
            if (this.j) {
                this.a[i] = this.o;
                i++;
            }
            if (this.l) {
                System.arraycopy(Utility.synchsafeIntToBytes(this.p), 0, this.a, i, 4);
            }
        }
        this.q = false;
    }

    public void setCompressed(boolean z2) {
        this.q = true;
        this.i = z2;
    }

    public void setDataLengthIndicator(int i) {
        if (i >= 0) {
            this.q = true;
            this.l = i != 0;
            this.p = i;
        } else {
            throw new IllegalArgumentException("Invalid data length indicator, " + i + ", in ID3v2.4 frame " + this.b.getName() + ". It must be >= 0.");
        }
    }

    public void setDataLengthIndicatorPresent(boolean z2) {
        this.q = true;
        this.l = z2;
        if (z2) {
            return;
        }
        this.p = 0;
    }

    public void setEncrypted(boolean z2) {
        this.q = true;
        this.j = z2;
    }

    public void setEncryptionMethod(byte b) {
        this.q = true;
        this.j = b != 0;
        this.o = b;
    }

    public void setFileAlterPreservation(boolean z2) {
        this.q = true;
        this.f = z2;
    }

    public void setFrameBodySize(int i) {
        if (i >= 0) {
            this.q = true;
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid ID3v2.4 frame body size, " + i + ", in frame " + this.b.getName() + ". It must be > 0.");
    }

    public void setFrameType(FrameType frameType) {
        this.q = true;
        this.b = frameType;
    }

    public void setGroupId(byte b) {
        this.q = true;
        this.h = b != 0;
        this.m = b;
    }

    public void setReadOnly(boolean z2) {
        this.q = true;
        this.g = z2;
    }

    public void setTagAlterPreservation(boolean z2) {
        this.q = true;
        this.e = z2;
    }

    public void setUncompressedSize(int i) {
        if (i >= 0) {
            this.q = true;
            this.i = i != 0;
            this.n = i;
        } else {
            throw new IllegalArgumentException("Invalid uncompressed size, " + i + ", in ID3v2.4 frame " + this.b.getName() + ". It must be >= 0.");
        }
    }

    public void setUnsynchronized(boolean z2) {
        this.q = true;
        this.k = z2;
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
        stringBuffer.append("   compression............: " + this.i + "\n");
        stringBuffer.append("   encryption.............: " + this.j + "\n");
        stringBuffer.append("   grouping identity......: " + this.h + "\n");
        stringBuffer.append("   uncompressed size......: " + this.n + "\n");
        stringBuffer.append("   encryption method......: " + ((int) this.o) + "\n");
        stringBuffer.append("   unsynchronized.........: " + this.k + "\n");
        stringBuffer.append("   data length indicator..: " + this.p + "\n");
        stringBuffer.append("   group Id...............: " + ((int) this.m) + "\n");
        return stringBuffer.toString();
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        if (!this.q) {
            randomAccessFile.write(this.a);
            return;
        }
        throw new IllegalStateException("ID3v2.4 frame " + this.b.getName() + " has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public ID3v24FrameHeader(InputStream inputStream) throws IOException {
        byte b = (byte) inputStream.read();
        if (b == 0) {
            this.c = true;
        } else {
            byte[] bArr = new byte[9];
            byte[] bArr2 = new byte[20];
            if (inputStream.read(bArr) == 9) {
                bArr2[0] = b;
                System.arraycopy(bArr, 0, bArr2, 1, 9);
                try {
                    this.b = FrameType.getFrameType(new String(bArr2, 0, 4, Encoding.ISO_8859_1.getCharacterSet()));
                } catch (IllegalArgumentException unused) {
                    this.r = new String(bArr2, 0, 4, Encoding.ISO_8859_1.getCharacterSet());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.d = Utility.bytesToSynchsafeInt(bArr2, 4);
                this.e = (bArr2[8] & 64) != 0;
                this.f = (bArr2[8] & 32) != 0;
                this.g = (bArr2[8] & 16) != 0;
                boolean z2 = (bArr2[9] & 64) != 0;
                this.h = z2;
                this.i = (8 & bArr2[9]) != 0;
                this.j = (bArr2[9] & 4) != 0;
                this.k = (bArr2[9] & 2) != 0;
                this.l = (bArr2[9] & 1) != 0;
                int i = 10;
                if (z2) {
                    byte b2 = (byte) inputStream.read();
                    this.m = b2;
                    bArr2[10] = b2;
                    i = 11;
                }
                if (this.i) {
                    byte[] bArr3 = new byte[4];
                    if (inputStream.read(bArr3) == 4) {
                        System.arraycopy(bArr3, 0, bArr2, i, 4);
                        i += 4;
                        this.n = Utility.bytesToSynchsafeInt(bArr3, 0);
                    } else {
                        throw new IOException("Unable to read the uncompressed size from an ID3v2.4 " + this.b.getName() + " frame.");
                    }
                }
                if (this.j) {
                    byte b3 = (byte) inputStream.read();
                    this.o = b3;
                    bArr2[i] = b3;
                    i++;
                }
                if (this.l) {
                    byte[] bArr4 = new byte[4];
                    if (inputStream.read(bArr4) == 4) {
                        System.arraycopy(bArr4, 0, bArr2, i, 4);
                        i += 4;
                        this.p = Utility.bytesToSynchsafeInt(bArr4, 0);
                    } else {
                        throw new IOException("Unable to read the data length indicator from an ID3v2.4 " + this.b.getName() + " frame.");
                    }
                }
                byte[] bArr5 = new byte[i];
                this.a = bArr5;
                System.arraycopy(bArr2, 0, bArr5, 0, i);
            } else {
                throw new IOException("Unable to read a ID3v2.4 frame header.");
            }
        }
        this.q = false;
    }

    public ID3v24FrameHeader(ID3v24FrameHeader iD3v24FrameHeader) {
        this.a = iD3v24FrameHeader.a;
        this.b = iD3v24FrameHeader.b;
        this.c = iD3v24FrameHeader.c;
        this.d = iD3v24FrameHeader.d;
        this.e = iD3v24FrameHeader.e;
        this.f = iD3v24FrameHeader.f;
        this.g = iD3v24FrameHeader.g;
        this.h = iD3v24FrameHeader.h;
        this.i = iD3v24FrameHeader.i;
        this.j = iD3v24FrameHeader.j;
        this.j = iD3v24FrameHeader.k;
        this.l = iD3v24FrameHeader.l;
        this.m = iD3v24FrameHeader.m;
        this.n = iD3v24FrameHeader.n;
        this.o = iD3v24FrameHeader.o;
        this.m = iD3v24FrameHeader.m;
        this.p = iD3v24FrameHeader.p;
        this.q = iD3v24FrameHeader.q;
        this.r = iD3v24FrameHeader.r;
    }
}
