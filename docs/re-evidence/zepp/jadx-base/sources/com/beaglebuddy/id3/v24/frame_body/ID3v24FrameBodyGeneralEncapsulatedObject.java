package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyGeneralEncapsulatedObject extends ID3v24FrameBody {
    private Encoding a;
    private String b;
    private String c;
    private String d;
    private byte[] e;

    public ID3v24FrameBodyGeneralEncapsulatedObject() {
        this(Encoding.UTF_16, "", "", "encapsulated object", new byte[0]);
    }

    public String getDescription() {
        return this.d;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public String getFilename() {
        return this.c;
    }

    public String getMimeType() {
        return this.b;
    }

    public byte[] getObject() {
        return this.e;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(1, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        this.b = new String(this.buffer, 1, nextNullTerminator - 1, encoding.getCharacterSet()).trim();
        int i = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i;
        int nextNullTerminator2 = getNextNullTerminator(i, this.a);
        this.nextNullTerminatorIndex = nextNullTerminator2;
        byte[] bArr = this.buffer;
        int i2 = this.nullTerminatorIndex;
        this.c = new String(bArr, i2, nextNullTerminator2 - i2, this.a.getCharacterSet()).trim();
        int numBytesInNullTerminator = this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator;
        int nextNullTerminator3 = getNextNullTerminator(numBytesInNullTerminator, this.a);
        this.nextNullTerminatorIndex = nextNullTerminator3;
        byte[] bArr2 = this.buffer;
        int i3 = this.nullTerminatorIndex;
        this.d = new String(bArr2, i3, nextNullTerminator3 - i3, this.a.getCharacterSet()).trim();
        int numBytesInNullTerminator2 = this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator2;
        byte[] bArr3 = this.buffer;
        byte[] bArr4 = new byte[bArr3.length - numBytesInNullTerminator2];
        this.e = bArr4;
        System.arraycopy(bArr3, numBytesInNullTerminator2, bArr4, 0, bArr4.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.b);
            byte[] bArrStringToBytes2 = ID3v24FrameBodyUtility.stringToBytes(this.a, this.c);
            byte[] bArrStringToBytes3 = ID3v24FrameBodyUtility.stringToBytes(this.a, this.d);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + bArrStringToBytes2.length + bArrStringToBytes3.length + this.e.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 0, bArrStringToBytes.length);
            int length = bArrStringToBytes.length;
            System.arraycopy(bArrStringToBytes2, 0, this.buffer, length, bArrStringToBytes2.length);
            int length2 = length + bArrStringToBytes2.length;
            System.arraycopy(bArrStringToBytes3, 0, this.buffer, length2, bArrStringToBytes3.length);
            int length3 = length2 + bArrStringToBytes3.length;
            byte[] bArr2 = this.e;
            System.arraycopy(bArr2, 0, this.buffer, length3, bArr2.length);
            this.dirty = false;
        }
    }

    public void setDescription(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.d = str;
    }

    public void setEncoding(Encoding encoding) {
        if (encoding != null) {
            this.a = encoding;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The encoding field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setFilename(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.c = str;
    }

    public void setMimeType(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.b = str;
    }

    public void setObject(byte[] bArr) {
        this.dirty = true;
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.e = bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: encapsulated\n");
        stringBuffer.append("   bytes......: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                " + Utility.hex(this.buffer, 16) + "\n");
        stringBuffer.append("   encoding...: " + this.a + "\n");
        stringBuffer.append("   mime type..: " + this.b + "\n");
        stringBuffer.append("   file name..: " + this.c + "\n");
        stringBuffer.append("   description: " + this.d + "\n");
        stringBuffer.append("   object.....: " + this.e.length + " bytes\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyGeneralEncapsulatedObject(Encoding encoding, String str, String str2, String str3, byte[] bArr) {
        super(FrameType.GENERAL_ENCAPSULATED_OBJECT);
        setEncoding(encoding);
        setMimeType(str);
        setFilename(str2);
        setDescription(str3);
        setObject(bArr);
        this.dirty = true;
    }

    public ID3v24FrameBodyGeneralEncapsulatedObject(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.GENERAL_ENCAPSULATED_OBJECT, i);
    }
}
