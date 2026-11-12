package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyUserDefinedURLLink extends ID3v23FrameBody {
    private Encoding a;
    private String b;
    private String c;

    public ID3v23FrameBodyUserDefinedURLLink() {
        this(Encoding.ISO_8859_1, "", " ");
    }

    public String getDescription() {
        return this.b;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public String getURL() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
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
        this.c = new String(bArr, numBytesInNullTerminator, bArr.length - numBytesInNullTerminator, Encoding.ISO_8859_1.getCharacterSet()).trim();
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(this.a, this.b);
            byte[] bArrStringToBytes2 = ID3v23FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.c);
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

    public void setURL(String str) {
        if (str != null && str.length() != 0) {
            this.c = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The url field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: user defined url link\n");
        stringBuffer.append("   encoding...: " + this.a + "\n");
        stringBuffer.append("   description: " + this.b + "\n");
        stringBuffer.append("   url........: " + this.c + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyUserDefinedURLLink(Encoding encoding, String str, String str2) {
        super(FrameType.USER_DEFINED_URL_LINK_FRAME);
        setEncoding(encoding);
        setDescription(str);
        setURL(str2);
        this.dirty = true;
    }

    public ID3v23FrameBodyUserDefinedURLLink(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.USER_DEFINED_URL_LINK_FRAME, i);
    }
}
