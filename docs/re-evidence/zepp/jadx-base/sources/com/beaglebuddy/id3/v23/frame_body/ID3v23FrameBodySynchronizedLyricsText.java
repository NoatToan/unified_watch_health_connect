package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.Language;
import com.beaglebuddy.id3.enums.TimeStampFormat;
import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.pojo.SynchronizedLyric;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodySynchronizedLyricsText extends ID3v23FrameBody {
    private Encoding a;
    private Language b;
    private TimeStampFormat c;
    private ContentType d;
    private String e;
    private List<SynchronizedLyric> f;

    public enum ContentType {
        OTHER("other"),
        LYRICS("lyrics"),
        TEXT("text transcription"),
        MOVEMENT("movement/part name (e.g. \"Adagio\")"),
        EVENT("events (e.g. \"Don Quijote enters the stage\")"),
        CHORD("chord (e.g. \"Bb F Fsus\")"),
        INFORMATION("trivia/'pop up' information");

        private String description;

        ContentType(String str) {
            this.description = str;
        }

        public static ContentType getContentType(byte b) throws IllegalArgumentException {
            for (ContentType contentType : values()) {
                if (b == contentType.ordinal()) {
                    return contentType;
                }
            }
            throw new IllegalArgumentException("Invalid synchronized lyric content type " + ((int) b) + ".  It must be between " + OTHER.ordinal() + " and " + INFORMATION.ordinal() + ".");
        }

        public String getDescription() {
            return this.description;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "" + ordinal() + " - " + this.description;
        }
    }

    public ID3v23FrameBodySynchronizedLyricsText() {
        this(Encoding.ISO_8859_1, Language.ENG, TimeStampFormat.MS, ContentType.LYRICS, "synchronized lyrics", new Vector());
    }

    public ContentType getContentType() {
        return this.d;
    }

    public String getDescription() {
        return this.e;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public Language getLanguage() {
        return this.b;
    }

    public List<SynchronizedLyric> getSynchronizedLyrics() {
        return this.f;
    }

    public TimeStampFormat getTimeStampFormat() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        Vector vector;
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        try {
            try {
                try {
                    setLanguage(Language.getLanguage(new String(this.buffer, 1, 3, Encoding.ISO_8859_1.getCharacterSet())));
                    while (true) {
                        int i = this.nullTerminatorIndex;
                        if (i >= this.buffer.length) {
                            setSynchronizedLyrics(vector);
                            this.dirty = false;
                            return;
                        }
                        int nextNullTerminator = getNextNullTerminator(i, this.a);
                        this.nextNullTerminatorIndex = nextNullTerminator;
                        byte[] bArr = this.buffer;
                        int i2 = this.nullTerminatorIndex;
                        String strTrim = new String(bArr, i2, nextNullTerminator - i2, this.a.getCharacterSet()).trim();
                        int numBytesInNullTerminator = this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
                        this.nullTerminatorIndex = numBytesInNullTerminator;
                        byte[] bArr2 = this.buffer;
                        int i3 = ((bArr2[numBytesInNullTerminator] & 255) << 24) + ((bArr2[numBytesInNullTerminator + 1] & 255) << 16) + ((bArr2[numBytesInNullTerminator + 2] & 255) << 8) + (bArr2[numBytesInNullTerminator + 3] & 255);
                        this.nullTerminatorIndex = numBytesInNullTerminator + 4;
                        vector.add(new SynchronizedLyric(strTrim, i3));
                    }
                } catch (IllegalArgumentException unused2) {
                    setLanguage(Language.ENG);
                }
                setContentType(ContentType.getContentType(this.buffer[5]));
            } catch (IllegalArgumentException unused3) {
                setContentType(ContentType.OTHER);
            }
            setTimeStampFormat(TimeStampFormat.valueOf(this.buffer[4]));
        } catch (IllegalArgumentException unused4) {
            setTimeStampFormat(TimeStampFormat.MS);
        }
        int nextNullTerminator2 = getNextNullTerminator(6, this.a);
        this.nullTerminatorIndex = nextNullTerminator2;
        this.e = new String(this.buffer, 6, nextNullTerminator2 - 6, this.a.getCharacterSet()).trim();
        this.nullTerminatorIndex += this.a.getNumBytesInNullTerminator();
        vector = new Vector();
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            Iterator<SynchronizedLyric> it2 = this.f.iterator();
            int length = 0;
            while (it2.hasNext()) {
                length += ID3v23FrameBodyUtility.stringToBytes(this.a, it2.next().getText()).length + 4;
            }
            byte[] codeBytes = this.b.getCodeBytes();
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(this.a, this.e);
            byte[] bArr = new byte[length];
            byte[] bArr2 = new byte[codeBytes.length + 1 + 1 + 1 + bArrStringToBytes.length + length];
            this.buffer = bArr2;
            bArr2[0] = (byte) this.a.ordinal();
            System.arraycopy(codeBytes, 0, this.buffer, 1, codeBytes.length);
            int length2 = codeBytes.length + 1;
            this.buffer[length2] = (byte) this.c.getValue();
            int i = length2 + 1;
            this.buffer[i] = (byte) this.d.ordinal();
            int i2 = i + 1;
            System.arraycopy(bArrStringToBytes, 0, this.buffer, i2, bArrStringToBytes.length);
            int length3 = i2 + bArrStringToBytes.length;
            for (SynchronizedLyric synchronizedLyric : this.f) {
                int length4 = ID3v23FrameBodyUtility.stringToBytes(this.a, synchronizedLyric.getText()).length;
                byte[] bArrStringToBytes2 = ID3v23FrameBodyUtility.stringToBytes(this.a, synchronizedLyric.getText());
                System.arraycopy(bArrStringToBytes2, 0, this.buffer, length3, bArrStringToBytes2.length);
                int length5 = length3 + bArrStringToBytes2.length;
                byte[] bArrIntToBytes = Utility.intToBytes(synchronizedLyric.getTimeStamp());
                System.arraycopy(bArrIntToBytes, 0, this.buffer, length5, bArrIntToBytes.length);
                length3 = length5 + bArrIntToBytes.length;
            }
            this.dirty = false;
        }
    }

    public void setContentType(ContentType contentType) {
        if (contentType != null) {
            this.d = contentType;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The content type field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setDescription(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.e = str;
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

    public void setSynchronizedLyrics(List<SynchronizedLyric> list) {
        int timeStamp = -1;
        for (SynchronizedLyric synchronizedLyric : list) {
            if (synchronizedLyric.getTimeStamp() <= timeStamp) {
                throw new IllegalArgumentException("The time stamps in the synchronized lyrics in the " + this.frameType.getId() + " frame must be in ascending chronological order.");
            }
            timeStamp = synchronizedLyric.getTimeStamp();
        }
        this.f = list;
        this.dirty = true;
    }

    public void setTimeStampFormat(TimeStampFormat timeStampFormat) {
        if (timeStampFormat != null) {
            this.dirty = true;
            this.c = timeStampFormat;
        } else {
            throw new IllegalArgumentException("The time stamp format field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: sychronized lyrics/text\n");
        stringBuffer.append("   bytes..............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                        " + Utility.hex(this.buffer, 24) + "\n");
        stringBuffer.append("   encoding...........: " + this.a + "\n");
        stringBuffer.append("   language...........: " + this.b + "\n");
        stringBuffer.append("   time stamp format..: " + this.c + "\n");
        stringBuffer.append("   content type.......: " + this.d + "\n");
        stringBuffer.append("   description........: " + this.e + "\n");
        stringBuffer.append("   synchronized lyrics: ");
        Iterator<SynchronizedLyric> it2 = this.f.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(Utility.pad(24) + it2.next() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v23FrameBodySynchronizedLyricsText(SynchronizedLyric[] synchronizedLyricArr) {
        this(Encoding.ISO_8859_1, Language.ENG, TimeStampFormat.MS, ContentType.LYRICS, "synchronized lyrics", synchronizedLyricArr);
    }

    public ID3v23FrameBodySynchronizedLyricsText(Encoding encoding, Language language, TimeStampFormat timeStampFormat, ContentType contentType, String str, SynchronizedLyric[] synchronizedLyricArr) {
        super(FrameType.SYNCHRONIZED_LYRIC_TEXT);
        Vector vector = new Vector();
        if (synchronizedLyricArr != null && synchronizedLyricArr.length != 0) {
            for (SynchronizedLyric synchronizedLyric : synchronizedLyricArr) {
                vector.add(synchronizedLyric);
            }
        }
        setEncoding(encoding);
        setLanguage(language);
        setTimeStampFormat(timeStampFormat);
        setContentType(contentType);
        setDescription(str);
        setSynchronizedLyrics(vector);
        this.dirty = true;
    }

    public ID3v23FrameBodySynchronizedLyricsText(Encoding encoding, Language language, TimeStampFormat timeStampFormat, ContentType contentType, String str, List<SynchronizedLyric> list) {
        super(FrameType.SYNCHRONIZED_LYRIC_TEXT);
        setEncoding(encoding);
        setLanguage(language);
        setTimeStampFormat(timeStampFormat);
        setContentType(contentType);
        setDescription(str);
        setSynchronizedLyrics(list);
        this.dirty = true;
    }

    public ID3v23FrameBodySynchronizedLyricsText(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.SYNCHRONIZED_LYRIC_TEXT, i);
    }
}
