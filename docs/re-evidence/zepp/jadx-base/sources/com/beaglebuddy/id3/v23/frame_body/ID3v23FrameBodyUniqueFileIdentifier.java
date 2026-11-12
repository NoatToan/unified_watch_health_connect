package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyUniqueFileIdentifier extends ID3v23FrameBody {
    private static int c = 64;
    private String a;
    private byte[] b;

    public ID3v23FrameBodyUniqueFileIdentifier() {
        this(" ", new byte[0]);
    }

    public byte[] getData() {
        return this.b;
    }

    public String getOwnerId() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(0, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        String strTrim = new String(this.buffer, 0, nextNullTerminator, encoding.getCharacterSet()).trim();
        this.a = strTrim;
        this.nullTerminatorIndex++;
        byte[] bArr = new byte[(this.buffer.length - strTrim.length()) - 1];
        this.b = bArr;
        System.arraycopy(this.buffer, this.nullTerminatorIndex, bArr, 0, bArr.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            byte[] bArr = new byte[bArrStringToBytes.length + this.b.length];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            byte[] bArr2 = this.b;
            System.arraycopy(bArr2, 0, this.buffer, bArrStringToBytes.length, bArr2.length);
            this.dirty = false;
        }
    }

    public void setData(byte[] bArr) throws IllegalArgumentException {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("The data field in the " + this.frameType.getId() + " frame may not be empty.");
        }
        if (bArr.length <= c) {
            this.b = bArr;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The data field in the " + this.frameType.getId() + " frame contains an invalid value.  It must be < " + c + " bytes long.");
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
        stringBuffer.append("frame body: unique file identifier\n");
        stringBuffer.append("   bytes...: " + this.buffer.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.buffer, 13) + "\n");
        stringBuffer.append("   owner id: " + this.a + "\n");
        stringBuffer.append("   data....: " + this.b.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.b, 13) + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyUniqueFileIdentifier(String str, byte[] bArr) {
        super(FrameType.UNIQUE_FILE_IDENTIFIER);
        setOwnerId(str);
        setData(bArr);
        this.dirty = true;
    }

    public ID3v23FrameBodyUniqueFileIdentifier(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.UNIQUE_FILE_IDENTIFIER, i);
    }
}
