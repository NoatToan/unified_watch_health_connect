package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyTextInformation extends ID3v23FrameBody {
    private Encoding a;
    private String b;

    public ID3v23FrameBodyTextInformation(FrameType frameType) {
        this(frameType, Encoding.ISO_8859_1, " ");
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public String getText() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        byte[] bArr = this.buffer;
        setText(new String(bArr, 1, bArr.length - 1, this.a.getCharacterSet()).trim());
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(this.a, this.b);
            byte[] bArr = new byte[bArrStringToBytes.length + 1];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 1, bArrStringToBytes.length);
            this.dirty = false;
        }
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
            this.dirty = true;
            this.b = str;
        } else {
            throw new IllegalArgumentException("The text field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: text information\n");
        stringBuffer.append("   bytes...: " + this.buffer.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.buffer, 13) + "\n");
        stringBuffer.append("   encoding: " + this.a + "\n");
        stringBuffer.append("   text....: " + this.b + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyTextInformation(FrameType frameType, Encoding encoding, String str) {
        super(frameType);
        setEncoding(encoding);
        setText(str);
        this.dirty = true;
    }

    public ID3v23FrameBodyTextInformation(InputStream inputStream, FrameType frameType, int i) throws IOException {
        super(inputStream, frameType, i);
    }
}
