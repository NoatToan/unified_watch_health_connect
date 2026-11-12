package com.beaglebuddy.id3.v24;

import com.beaglebuddy.id3.enums.v24.ImageEncodingRestriction;
import com.beaglebuddy.id3.enums.v24.ImageSizeRestriction;
import com.beaglebuddy.id3.enums.v24.TagSizeRestriction;
import com.beaglebuddy.id3.enums.v24.TextEncodingRestriction;
import com.beaglebuddy.id3.enums.v24.TextSizeRestriction;
import com.beaglebuddy.util.Utility;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24TagExtendedHeader {
    private static final int l = 6;
    private static final int m = 1;
    private static final byte n = 0;
    private static final byte o = 5;
    private static final byte p = 1;
    private static final byte q = 64;
    private static final byte r = 32;
    private static final byte s = 16;
    private static final byte t = -64;
    private static final byte u = 32;
    private static final byte v = 24;
    private static final byte w = 4;
    private static final byte x = 3;
    private boolean a;
    private boolean b;
    private boolean c;
    private byte[] d;
    private TagSizeRestriction e;
    private TextEncodingRestriction f;
    private TextSizeRestriction g;
    private ImageEncodingRestriction h;
    private ImageSizeRestriction i;
    private byte[] j;
    private boolean k;

    public ID3v24TagExtendedHeader() {
        this.j = new byte[6];
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = new byte[0];
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = true;
    }

    public byte[] getCRCData() throws IllegalStateException {
        if (this.b) {
            return this.d;
        }
        throw new IllegalStateException("You may not get the \"CRC data\" field in the ID3v2.4 extended tag header when the CRCDataPresent flag is false.");
    }

    public ImageEncodingRestriction getImageEncodingRestriction() throws IllegalStateException {
        if (this.c) {
            return this.h;
        }
        throw new IllegalStateException("You may not get the \"imageEncodingRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
    }

    public ImageSizeRestriction getImageSizeRestriction() throws IllegalStateException {
        if (this.c) {
            return this.i;
        }
        throw new IllegalStateException("You may not get the \"imageSizeRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
    }

    public int getSize() {
        if (this.k) {
            setBuffer();
        }
        return this.j.length;
    }

    public TagSizeRestriction getTagSizeRestriction() throws IllegalStateException {
        if (this.c) {
            return this.e;
        }
        throw new IllegalStateException("You may not get the \"tagSizeRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
    }

    public TextEncodingRestriction getTextEncodingRestriction() throws IllegalStateException {
        if (this.c) {
            return this.f;
        }
        throw new IllegalStateException("You may not get the \"textEncodingRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
    }

    public TextSizeRestriction getTextSizeRestriction() throws IllegalStateException {
        if (this.c) {
            return this.g;
        }
        throw new IllegalStateException("You may not get the \"textSizeRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
    }

    public boolean isCRCDataPresent() {
        return this.b;
    }

    public boolean isDirty() {
        return this.k;
    }

    public boolean isTagIsAnUpdate() throws IllegalStateException {
        return this.a;
    }

    public void save(OutputStream outputStream) throws IOException {
        if (this.k) {
            throw new IllegalStateException("The ID3v2.4 tag extended header has been modified and requires setBuffer() to be called before it can be saved.");
        }
        outputStream.write(this.j);
    }

    public void setBuffer() {
        int i = 6;
        int i2 = (this.a ? 1 : 0) + 6 + (this.b ? 6 : 0) + (this.c ? 2 : 0);
        this.j = new byte[i2];
        System.arraycopy(Utility.synchsafeIntToBytes(i2 - 4), 0, this.j, 0, 4);
        byte[] bArr = this.j;
        bArr[4] = 1;
        boolean z = this.a;
        bArr[5] = (byte) (z ? bArr[5] | 64 : bArr[5] & ByteSourceJsonBootstrapper.UTF8_BOM_3);
        boolean z2 = this.b;
        bArr[5] = (byte) (z2 ? bArr[5] | 32 : bArr[5] & (-33));
        bArr[5] = (byte) (this.c ? bArr[5] | 16 : bArr[5] & ByteSourceJsonBootstrapper.UTF8_BOM_1);
        if (z) {
            bArr[6] = 0;
            i = 7;
        }
        if (z2) {
            bArr[i] = 5;
            int i3 = i + 1;
            System.arraycopy(this.d, 0, bArr, i3, 5);
            i = i3 + 5;
        }
        if (this.c) {
            byte[] bArr2 = this.j;
            bArr2[i] = 1;
            int i4 = i + 1;
            bArr2[i4] = 0;
            TagSizeRestriction tagSizeRestriction = this.e;
            if (tagSizeRestriction != null) {
                bArr2[i4] = (byte) (tagSizeRestriction.getMask() | bArr2[i4]);
            }
            TextEncodingRestriction textEncodingRestriction = this.f;
            if (textEncodingRestriction != null) {
                byte[] bArr3 = this.j;
                bArr3[i4] = (byte) (textEncodingRestriction.getMask() | bArr3[i4]);
            }
            TextSizeRestriction textSizeRestriction = this.g;
            if (textSizeRestriction != null) {
                byte[] bArr4 = this.j;
                bArr4[i4] = (byte) (textSizeRestriction.getMask() | bArr4[i4]);
            }
            ImageEncodingRestriction imageEncodingRestriction = this.h;
            if (imageEncodingRestriction != null) {
                byte[] bArr5 = this.j;
                bArr5[i4] = (byte) (imageEncodingRestriction.getMask() | bArr5[i4]);
            }
            ImageSizeRestriction imageSizeRestriction = this.i;
            if (imageSizeRestriction != null) {
                byte[] bArr6 = this.j;
                bArr6[i4] = (byte) (imageSizeRestriction.getMask() | bArr6[i4]);
            }
        }
        this.k = false;
    }

    public void setCRCData(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.d = new byte[0];
            this.b = false;
        } else {
            if (bArr.length != 5) {
                throw new IllegalArgumentException("Invalid CRC data length, " + bArr.length + ".  It must be 5 bytes long.");
            }
            this.d = bArr;
            this.b = true;
        }
        this.k = true;
    }

    public void setCRCDataPresent(boolean z) {
        this.b = z;
        if (z) {
            return;
        }
        this.d = new byte[0];
    }

    public void setImageEncodingRestriction(ImageEncodingRestriction imageEncodingRestriction) {
        if (!this.c) {
            throw new IllegalStateException("You may not set the \"imageEncodingRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
        }
        this.h = imageEncodingRestriction;
        this.k = true;
    }

    public void setImageSizeRestriction(ImageSizeRestriction imageSizeRestriction) {
        this.i = imageSizeRestriction;
        this.k = true;
    }

    public void setTagHasRestrictions(boolean z) {
        if (this.c != z) {
            this.c = true;
            setTagSizeRestriction(TagSizeRestriction.TAG_SIZE_1_MB_AND_128_FRAMES);
            setTextEncodingRestriction(TextEncodingRestriction.NO_RESTRICTIONS);
            setTextSizeRestriction(TextSizeRestriction.NO_RESTRICTIONS);
            setImageEncodingRestriction(ImageEncodingRestriction.NO_RESTRICTIONS);
            setImageSizeRestriction(ImageSizeRestriction.NO_RESTRICTIONS);
            this.c = z;
            this.k = true;
        }
    }

    public void setTagIsAnUpdate(boolean z) {
        this.a = z;
        this.k = true;
    }

    public void setTagSizeRestriction(TagSizeRestriction tagSizeRestriction) {
        this.e = tagSizeRestriction;
        this.k = true;
    }

    public void setTextEncodingRestriction(TextEncodingRestriction textEncodingRestriction) {
        this.f = textEncodingRestriction;
        this.k = true;
    }

    public void setTextSizeRestriction(TextSizeRestriction textSizeRestriction) {
        if (!this.c) {
            throw new IllegalStateException("You may not set the \"textSizeRestriction\" field in the ID3v2.4 extended tag header when the tagHasRestrictions flag is false.");
        }
        this.g = textSizeRestriction;
        this.k = true;
    }

    public boolean tagHasRestrictions() {
        return this.c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID3v2.4 tag extended header\n");
        stringBuffer.append("   bytes.....................: " + getSize() + " bytes\n");
        stringBuffer.append("                               " + Utility.hex(this.j, 30) + "\n");
        stringBuffer.append("   tag is an update..........: " + this.a + "\n");
        stringBuffer.append("   crc data present..........: " + this.b + "\n");
        stringBuffer.append("   tag has restrictions......: " + this.c + "\n");
        stringBuffer.append("   CRC.......................: " + Utility.hex(this.d, 30) + "\n");
        stringBuffer.append("   tag size restriction......: " + this.e + "\n");
        stringBuffer.append("   text encoding restriction.: " + this.f + "\n");
        stringBuffer.append("   text size restriction.....: " + this.g + "\n");
        stringBuffer.append("   image encoding restriction: " + this.h + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   image size restriction....: ");
        sb.append(this.i);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        if (!this.k) {
            randomAccessFile.write(this.j);
            return;
        }
        throw new IllegalStateException("The ID3v2.4 tag extended header has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public ID3v24TagExtendedHeader(InputStream inputStream) throws IOException {
        this();
        if (inputStream.read(this.j) == 6) {
            byte[] bArr = this.j;
            if (bArr[4] == 1) {
                this.a = (bArr[5] & 64) != 0;
                this.b = (bArr[5] & 32) != 0;
                this.c = (bArr[5] & 16) != 0;
                int iBytesToSynchsafeInt = Utility.bytesToSynchsafeInt(bArr, 0);
                if (this.a) {
                    byte b = (byte) inputStream.read();
                    if (b == -1) {
                        throw new IOException("Unable to read the ID3v2.4 \"tag is an update\" data length byte from the ID3v2.4 extended tag header.");
                    }
                    if (b != 0) {
                        throw new IOException("Invalid \"tag is an update\" data length value, " + ((int) b) + ", read from the ID3v2.4 tag extended header.  It must be 0.");
                    }
                }
                if (this.b) {
                    byte b2 = (byte) inputStream.read();
                    if (b2 == -1) {
                        throw new IOException("Unable to read the ID3v2.4 \"crc data present\" data length byte from the ID3v2.4 extended tag header.");
                    }
                    if (b2 == 5) {
                        byte[] bArr2 = new byte[5];
                        this.d = bArr2;
                        if (inputStream.read(bArr2) != 5) {
                            throw new IOException("Unable to read the CRC data from the ID3v2.4 extended tag header.");
                        }
                        if (iBytesToSynchsafeInt < 7) {
                            throw new IllegalStateException("The ID3v2.4 tag extended header has the CRC data present flag set to true but the specified size is " + iBytesToSynchsafeInt + ".");
                        }
                    } else {
                        throw new IOException("Invalid \"crc data present\" data length value, " + ((int) b2) + ", read from the ID3v2.4 tag extended header.  It must be 5.");
                    }
                }
                if (this.c) {
                    byte b3 = (byte) inputStream.read();
                    if (b3 == -1) {
                        throw new IOException("Unable to read the ID3v2.4 \"tag has restrictions\" data length byte from the ID3v2.4 extended tag header.");
                    }
                    if (b3 == 1) {
                        byte b4 = (byte) inputStream.read();
                        if (b4 != -1) {
                            this.e = TagSizeRestriction.valueOf((b4 & t) >> 6);
                            this.f = TextEncodingRestriction.valueOf((b4 & 32) >> 5);
                            this.g = TextSizeRestriction.valueOf((b4 & 24) >> 3);
                            this.h = ImageEncodingRestriction.valueOf((b4 & 4) >> 2);
                            this.i = ImageSizeRestriction.valueOf(b4 & 3);
                        } else {
                            throw new IOException("Unable to read the \"tag has restrictions\" flag from the ID3v2.4 extended tag header.");
                        }
                    } else {
                        throw new IOException("Invalid \"tag has restrictions\" data length value, " + ((int) b3) + ", read from the ID3v2.4 tag extended header.  It must be 1.");
                    }
                }
                setBuffer();
                return;
            }
            throw new IOException("Invalid value for the number of flag bytes, " + ((int) this.j[0]) + " in the ID3v2.4 extended tag header.  It must be 1.");
        }
        throw new IOException("Unable to read the ID3v2.4 tag extended header.");
    }
}
