package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyURLLink extends ID3v24FrameBody {
    private String a;

    public ID3v24FrameBodyURLLink(FrameType frameType) {
        this(frameType, " ");
    }

    public String getURL() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        this.a = new String(bArr, 0, bArr.length, Encoding.ISO_8859_1.getCharacterSet()).trim();
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            byte[] bArr = new byte[bArrStringToBytes.length];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            this.dirty = false;
        }
    }

    public void setURL(String str) {
        if (str != null && str.length() != 0) {
            this.a = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The url field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: URL link\n");
        stringBuffer.append("   bytes: " + this.buffer.length + " bytes\n");
        stringBuffer.append("          " + Utility.hex(this.buffer, 10) + "\n");
        stringBuffer.append("   url..: " + this.a + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyURLLink(FrameType frameType, String str) {
        super(frameType);
        setURL(str);
        this.dirty = true;
    }

    public ID3v24FrameBodyURLLink(InputStream inputStream, FrameType frameType, int i) throws IOException {
        super(inputStream, frameType, i);
    }
}
