package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyPrivate extends ID3v24FrameBody {
    private String a;
    private byte[] b;

    public ID3v24FrameBodyPrivate() {
        this(" ", new byte[1]);
    }

    public byte[] getData() {
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
        setOwnerId(new String(this.buffer, 0, nextNullTerminator, encoding.getCharacterSet()).trim());
        int i = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i;
        byte[] bArr = this.buffer;
        if (i < bArr.length) {
            byte[] bArr2 = new byte[bArr.length - i];
            this.b = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            this.dirty = false;
            return;
        }
        throw new IllegalArgumentException("The data field in the " + this.frameType.getId() + " frame may not be empty.");
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            byte[] bArr = new byte[bArrStringToBytes.length + this.b.length];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            byte[] bArr2 = this.b;
            System.arraycopy(bArr2, 0, this.buffer, bArrStringToBytes.length, bArr2.length);
            this.dirty = false;
        }
    }

    public void setData(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            this.b = bArr;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The data field in the " + this.frameType.getId() + " frame may not be empty.");
        }
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
        stringBuffer.append("frame body: private\n");
        stringBuffer.append("   bytes...: " + this.buffer.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.buffer, 13) + "\n");
        stringBuffer.append("   owner id: " + this.a + "\n");
        stringBuffer.append("   data....: " + this.b.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.b, 13) + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyPrivate(String str, byte[] bArr) {
        super(FrameType.PRIVATE);
        setOwnerId(str);
        setData(bArr);
        this.dirty = true;
    }

    public ID3v24FrameBodyPrivate(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.PRIVATE, i);
    }
}
