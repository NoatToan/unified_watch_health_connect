package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.Language;
import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyComments extends ID3v24FrameBody {
    private Encoding a;
    private Language b;
    private String c;
    private String d;

    public ID3v24FrameBodyComments() {
        this(Encoding.ISO_8859_1, Language.ENG, "", " ");
    }

    public String getDescription() {
        return this.c;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public Language getLanguage() {
        return this.b;
    }

    public String getText() {
        return this.d;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        try {
            setLanguage(Language.getLanguage(new String(this.buffer, 1, 3, Encoding.ISO_8859_1.getCharacterSet())));
        } catch (IllegalArgumentException unused2) {
            setLanguage(Language.ENG);
        }
        int nextNullTerminator = getNextNullTerminator(4, this.a);
        this.nullTerminatorIndex = nextNullTerminator;
        setDescription(new String(this.buffer, 4, nextNullTerminator - 4, this.a.getCharacterSet()).trim());
        int numBytesInNullTerminator = this.nullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator;
        byte[] bArr = this.buffer;
        setText(numBytesInNullTerminator == bArr.length ? "" : new String(bArr, numBytesInNullTerminator, bArr.length - numBytesInNullTerminator, this.a.getCharacterSet()).trim());
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] codeBytes = this.b.getCodeBytes();
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(this.a, this.c);
            byte[] bArrStringToBytes2 = ID3v24FrameBodyUtility.stringToBytes(this.a, this.d);
            byte[] bArr = new byte[codeBytes.length + 1 + bArrStringToBytes.length + bArrStringToBytes2.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(codeBytes, 0, this.buffer, 1, codeBytes.length);
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 4, bArrStringToBytes.length);
            System.arraycopy(bArrStringToBytes2, 0, this.buffer, bArrStringToBytes.length + 4, bArrStringToBytes2.length);
            this.dirty = false;
        }
    }

    public void setDescription(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.c = str;
    }

    public void setEncoding(Encoding encoding) {
        if (encoding != null) {
            this.a = encoding;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The encoding field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setLanguage(Language language) {
        if (language != null) {
            this.dirty = true;
            this.b = language;
        } else {
            throw new IllegalArgumentException("The language field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setText(String str) {
        if (str != null && str.length() != 0) {
            this.dirty = true;
            this.d = str;
        } else {
            throw new IllegalArgumentException("The text field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: comments\n");
        stringBuffer.append("   bytes.....: " + this.buffer.length + " bytes\n");
        stringBuffer.append("               " + Utility.hex(this.buffer, 15) + "\n");
        stringBuffer.append("   encoding..: " + this.a + "\n");
        stringBuffer.append("   language..: " + this.b + "\n");
        stringBuffer.append("   decription: " + this.c + "\n");
        stringBuffer.append("   text......: " + this.d + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyComments(Encoding encoding, Language language, String str, String str2) {
        super(FrameType.COMMENTS);
        setEncoding(encoding);
        setLanguage(language);
        setDescription(str);
        setText(str2);
        this.dirty = true;
    }

    public ID3v24FrameBodyComments(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.COMMENTS, i);
    }
}
