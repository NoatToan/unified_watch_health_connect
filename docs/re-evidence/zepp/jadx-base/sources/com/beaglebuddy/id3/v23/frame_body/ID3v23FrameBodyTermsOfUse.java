package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.Language;
import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyTermsOfUse extends ID3v23FrameBody {
    private Encoding a;
    private Language b;
    private String c;

    public ID3v23FrameBodyTermsOfUse() {
        this(Encoding.ISO_8859_1, Language.ENG, " ");
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public Language getLanguage() {
        return this.b;
    }

    public String getText() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
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
        byte[] bArr = this.buffer;
        this.c = new String(bArr, 4, bArr.length - 4, this.a.getCharacterSet()).trim();
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] codeBytes = this.b.getCodeBytes();
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(this.a, this.c);
            byte[] bArr = new byte[codeBytes.length + 1 + bArrStringToBytes.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(codeBytes, 0, this.buffer, 1, codeBytes.length);
            System.arraycopy(bArrStringToBytes, 0, this.buffer, codeBytes.length + 1, bArrStringToBytes.length);
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
            this.c = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The text field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: terms of use\n");
        stringBuffer.append("   bytes.....: " + this.buffer.length + " bytes\n");
        stringBuffer.append("               " + Utility.hex(this.buffer, 15) + "\n");
        stringBuffer.append("   encoding..: " + this.a + "\n");
        stringBuffer.append("   language..: " + this.b + "\n");
        stringBuffer.append("   text......: " + this.c + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyTermsOfUse(Encoding encoding, Language language, String str) {
        super(FrameType.TERMS_OF_USE);
        setEncoding(encoding);
        setLanguage(language);
        setText(str);
        this.dirty = true;
    }

    public ID3v23FrameBodyTermsOfUse(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.TERMS_OF_USE, i);
    }
}
