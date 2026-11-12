package com.beaglebuddy.id3.v24.frame_body;

import androidx.exifinterface.media.ExifInterface;
import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyTextInformation extends ID3v24FrameBody {
    private Encoding a;
    private String b;

    public ID3v24FrameBodyTextInformation(FrameType frameType) throws IllegalArgumentException {
        this(frameType, Encoding.ISO_8859_1, " ");
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public String getText() {
        return this.b;
    }

    public List<String> getTextList() {
        Vector vector = new Vector();
        int numBytesInNullTerminator = 1;
        while (true) {
            byte[] bArr = this.buffer;
            if (numBytesInNullTerminator >= bArr.length) {
                return vector;
            }
            int nextNullTerminator = ID3v24FrameBodyUtility.getNextNullTerminator(bArr, numBytesInNullTerminator, this.a);
            byte[] bArr2 = this.buffer;
            if (nextNullTerminator > bArr2.length) {
                nextNullTerminator = bArr2.length;
            }
            int i = nextNullTerminator - numBytesInNullTerminator;
            vector.add(new String(bArr2, numBytesInNullTerminator, i, this.a.getCharacterSet()).trim());
            numBytesInNullTerminator += i + this.a.getNumBytesInNullTerminator();
        }
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
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

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(this.a, this.b);
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
            throw new IllegalArgumentException("The encoding field in the ID3v2.4 " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setText(String str) {
        if (str != null && str.length() != 0) {
            this.dirty = true;
            this.b = str;
        } else {
            throw new IllegalArgumentException("The text field in the ID3v2.4 " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setTextList(List<String> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("The text field in the ID3v2.4 " + this.frameType.getId() + " frame may not be empty.");
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(it2.next());
            stringBuffer.append((char) 0);
            if (this.a.getNumBytesInNullTerminator() == 2) {
                stringBuffer.append((char) 0);
            }
        }
        this.b = stringBuffer.toString();
        this.dirty = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0111  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0111, please report this as an issue */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: text information\n");
        stringBuffer.append("   bytes...: " + this.buffer.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.buffer, 13) + "\n");
        stringBuffer.append("   encoding: " + this.a + "\n");
        List<String> textList = getTextList();
        FrameType frameType = this.frameType;
        if (frameType == FrameType.INVOLVED_PEOPLE_LIST || frameType == FrameType.MUSICIANS_CREDIT_LIST) {
            if (textList.size() >= 2) {
                stringBuffer.append("   text....: ");
                String[] strArr = (String[]) textList.toArray(new String[textList.size()]);
                int length = 0;
                for (String str : textList) {
                    if (str.length() > length) {
                        length = str.length();
                    }
                }
                stringBuffer.append(strArr[0] + Utility.pad(length - strArr[0].length()) + "  -  " + strArr[1] + "\n");
                for (int i = 2; i < strArr.length; i += 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utility.pad(13));
                    sb.append(strArr[i]);
                    sb.append(Utility.pad(length - strArr[i].length()));
                    sb.append("  -  ");
                    int i2 = i + 1;
                    sb.append(i2 < strArr.length ? strArr[i2] : "");
                    sb.append("\n");
                    stringBuffer.append(sb.toString());
                }
            } else {
                stringBuffer.append("   text....: " + this.b + "\n");
            }
        } else {
            stringBuffer.append("   text....: " + this.b + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyTextInformation(FrameType frameType, Encoding encoding, String str) throws IllegalArgumentException {
        super(frameType);
        if (frameType.getId().startsWith(ExifInterface.GPS_DIRECTION_TRUE)) {
            setEncoding(encoding);
            setText(str);
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("Invalid ID3v2.4 text frame type, " + frameType + ".  All ID3v2.4 text frame id's start with the letter 'T'.");
        }
    }

    public ID3v24FrameBodyTextInformation(InputStream inputStream, FrameType frameType, int i) throws IOException {
        super(inputStream, frameType, i);
    }
}
