package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyAudioEncryption extends ID3v23FrameBody {
    private String a;
    private int b;
    private int c;
    private byte[] d;

    public ID3v23FrameBodyAudioEncryption() {
        this("", 0, 0, new byte[0]);
    }

    public byte[] getEncrcrytpionInfo() {
        return this.d;
    }

    public String getOwnerId() {
        return this.a;
    }

    public int getPreviewLength() {
        return this.c;
    }

    public int getPreviewStart() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(0, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        this.a = new String(this.buffer, 0, nextNullTerminator, encoding.getCharacterSet()).trim();
        byte[] bArr = this.buffer;
        int i = this.nullTerminatorIndex;
        this.b = ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255);
        this.c = ((bArr[i + 3] & 255) << 8) + (bArr[i + 4] & 255);
        int i2 = i + 5;
        this.nullTerminatorIndex = i2;
        byte[] bArr2 = new byte[bArr.length - i2];
        this.d = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            byte[] bArr = new byte[bArrStringToBytes.length + 2 + 2 + this.d.length];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            int length = bArrStringToBytes.length;
            System.arraycopy(Utility.shortToBytes(this.b), 0, this.buffer, length, 2);
            int i = length + 2;
            System.arraycopy(Utility.shortToBytes(this.c), 0, this.buffer, i, 2);
            byte[] bArr2 = this.d;
            System.arraycopy(bArr2, 0, this.buffer, i + 2, bArr2.length);
            this.dirty = false;
        }
    }

    public void setEncrcrytpionInfo(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.d = bArr;
        this.dirty = true;
    }

    public void setOwnerId(String str) {
        if (str != null && str.length() != 0) {
            this.dirty = true;
            this.a = str;
        } else {
            throw new IllegalArgumentException("The owner id field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setPreviewLength(int i) {
        if (i >= 0) {
            this.c = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The preview length field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public void setPreviewStart(int i) {
        if (i >= 0) {
            this.b = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The preview start field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: audio encryption\n");
        stringBuffer.append("   bytes............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                      " + Utility.hex(this.buffer, 23) + "\n");
        stringBuffer.append("   owner id.........: " + this.a + "\n");
        stringBuffer.append("   preview start....: " + this.b + "\n");
        stringBuffer.append("   preview length...: " + this.c + "\n");
        stringBuffer.append("   encrcrytpion info: " + this.d + "bytes\n");
        stringBuffer.append("                      " + Utility.hex(this.d, 23) + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyAudioEncryption(String str, int i, int i2, byte[] bArr) {
        super(FrameType.AUDIO_ENCRYPTION);
        setOwnerId(str);
        setPreviewStart(i);
        setPreviewLength(i2);
        setEncrcrytpionInfo(bArr);
        this.dirty = true;
    }

    public ID3v23FrameBodyAudioEncryption(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.AUDIO_ENCRYPTION, i);
    }
}
