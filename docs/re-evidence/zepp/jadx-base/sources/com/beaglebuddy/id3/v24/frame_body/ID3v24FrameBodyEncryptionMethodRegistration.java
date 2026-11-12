package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyEncryptionMethodRegistration extends ID3v24FrameBody {
    private String a;
    private byte b;
    private byte[] c;

    public ID3v24FrameBodyEncryptionMethodRegistration() {
        this("", (byte) 0, new byte[0]);
    }

    public byte[] getData() {
        return this.c;
    }

    public byte getMethodSymbol() {
        return this.b;
    }

    public String getOwnerId() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(0, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        this.a = new String(this.buffer, 0, nextNullTerminator, encoding.getCharacterSet()).trim();
        int i = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i;
        byte[] bArr = this.buffer;
        this.b = bArr[i];
        int i2 = i + 1;
        this.nullTerminatorIndex = i2;
        byte[] bArr2 = new byte[bArr.length - i2];
        this.c = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + this.c.length];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            int length = bArrStringToBytes.length;
            byte[] bArr2 = this.buffer;
            bArr2[length] = this.b;
            byte[] bArr3 = this.c;
            System.arraycopy(bArr3, 0, bArr2, length + 1, bArr3.length);
            this.dirty = false;
        }
    }

    public void setData(byte[] bArr) {
        this.dirty = true;
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.c = bArr;
    }

    public void setMethodSymbol(byte b) {
        this.dirty = true;
        this.b = b;
    }

    public void setOwnerId(String str) {
        if (str != null && str.length() != 0) {
            this.dirty = true;
            this.a = str;
        } else {
            throw new IllegalArgumentException("The owner id field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: encryption method registration\n");
        stringBuffer.append("   bytes..........: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                    " + Utility.hex(this.buffer, 21) + "\n");
        stringBuffer.append("   owner id.......: " + this.a + "\n");
        stringBuffer.append("   method symbol..: " + ((int) this.b) + "\n");
        stringBuffer.append("   encryption data: " + this.c.length + " bytes\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyEncryptionMethodRegistration(String str, byte b, byte[] bArr) {
        super(FrameType.ENCRYPTION_METHOD_REGISTRATION);
        setOwnerId(str);
        setMethodSymbol(b);
        setData(bArr);
        this.dirty = true;
    }

    public ID3v24FrameBodyEncryptionMethodRegistration(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.ENCRYPTION_METHOD_REGISTRATION, i);
    }
}
