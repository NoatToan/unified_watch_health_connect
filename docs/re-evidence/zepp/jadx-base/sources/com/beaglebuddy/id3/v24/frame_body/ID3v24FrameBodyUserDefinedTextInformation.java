package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyUserDefinedTextInformation extends ID3v24FrameBody {
    private Encoding a;
    private String b;
    private String c;

    public ID3v24FrameBodyUserDefinedTextInformation() {
        this(Encoding.ISO_8859_1, "", "");
    }

    public String getDescription() {
        return this.b;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public String getText() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        int nextNullTerminator = getNextNullTerminator(1, this.a);
        this.nullTerminatorIndex = nextNullTerminator;
        this.b = new String(this.buffer, 1, nextNullTerminator - 1, this.a.getCharacterSet()).trim();
        int numBytesInNullTerminator = this.nullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator;
        byte[] bArr = this.buffer;
        this.c = new String(bArr, numBytesInNullTerminator, bArr.length - numBytesInNullTerminator, this.a.getCharacterSet()).trim();
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(this.a, this.b);
            byte[] bArrStringToBytes2 = ID3v24FrameBodyUtility.stringToBytes(this.a, this.c);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + bArrStringToBytes2.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 1, bArrStringToBytes.length);
            System.arraycopy(bArrStringToBytes2, 0, this.buffer, bArrStringToBytes.length + 1, bArrStringToBytes2.length);
            this.dirty = false;
        }
    }

    public void setDescription(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.b = str;
    }

    public void setEncoding(Encoding encoding) {
        if (encoding != null) {
            this.a = encoding;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The encoding field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setText(String str) {
        if (str != null && str.length() != 0) {
            this.c = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The text field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: user defined text information\n");
        stringBuffer.append("   bytes......: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                " + Utility.hex(this.buffer, 16) + "\n");
        stringBuffer.append("   encoding...: " + this.a + "\n");
        stringBuffer.append("   description: " + this.b + "\n");
        stringBuffer.append("   text.......: " + this.c + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyUserDefinedTextInformation(Encoding encoding, String str, String str2) {
        super(FrameType.USER_DEFINED_TEXT_INFORMATION);
        setEncoding(encoding);
        setDescription(str);
        setText(str2);
        this.dirty = true;
    }

    public ID3v24FrameBodyUserDefinedTextInformation(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.USER_DEFINED_TEXT_INFORMATION, i);
    }
}
