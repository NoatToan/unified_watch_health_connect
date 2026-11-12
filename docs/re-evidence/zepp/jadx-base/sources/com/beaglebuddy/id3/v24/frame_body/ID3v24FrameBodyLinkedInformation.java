package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyLinkedInformation extends ID3v24FrameBody {
    public FrameType a;
    public String b;
    public byte[] c;

    public ID3v24FrameBodyLinkedInformation() {
        this(FrameType.ATTACHED_PICTURE, " ", new byte[0]);
    }

    public byte[] getAdditionalIdData() {
        return this.c;
    }

    public FrameType getLinkedFrameType() {
        return this.a;
    }

    public String getURL() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        Encoding encoding = Encoding.ISO_8859_1;
        setLinkedFrameType(FrameType.getFrameType(new String(bArr, 0, 4, encoding.getCharacterSet())));
        int nextNullTerminator = getNextNullTerminator(4, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        setURL(new String(this.buffer, 4, nextNullTerminator - 4, encoding.getCharacterSet()).trim());
        int numBytesInNullTerminator = this.nullTerminatorIndex + encoding.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator;
        byte[] bArr2 = this.buffer;
        byte[] bArr3 = new byte[bArr2.length - numBytesInNullTerminator];
        this.c = bArr3;
        System.arraycopy(bArr2, numBytesInNullTerminator, bArr3, 0, bArr3.length);
        this.dirty = false;
    }

    public void setAdditionalIdData(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.c = bArr;
        this.dirty = true;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            String id = this.a.getId();
            Encoding encoding = Encoding.ISO_8859_1;
            byte[] bytes = id.getBytes(encoding.getCharacterSet());
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(encoding, this.b);
            byte[] bArr = new byte[bytes.length + bArrStringToBytes.length + this.c.length];
            this.buffer = bArr;
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            int length = bytes.length + 0;
            System.arraycopy(bArrStringToBytes, 0, this.buffer, length, bArrStringToBytes.length);
            int length2 = length + bArrStringToBytes.length;
            byte[] bArr2 = this.c;
            System.arraycopy(bArr2, 0, this.buffer, length2, bArr2.length);
            this.dirty = false;
        }
    }

    public void setLinkedFrameType(FrameType frameType) {
        if (frameType != null) {
            this.a = frameType;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The linked frame type field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setURL(String str) {
        if (str != null && str.length() != 0) {
            this.b = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The url field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: linked information\n");
        stringBuffer.append("   bytes...........: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                     " + Utility.hex(this.buffer, 21) + "\n");
        stringBuffer.append(" frame type........: " + this.a + "\n");
        stringBuffer.append(" url...............: " + this.b + "\n");
        stringBuffer.append(" additional id data: " + Utility.hex(this.c, 21) + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyLinkedInformation(FrameType frameType, String str, byte[] bArr) {
        super(FrameType.LINKED_INFORMATION);
        setLinkedFrameType(frameType);
        setURL(str);
        setAdditionalIdData(bArr);
        this.dirty = true;
    }

    public ID3v24FrameBodyLinkedInformation(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.LINKED_INFORMATION, i);
    }
}
