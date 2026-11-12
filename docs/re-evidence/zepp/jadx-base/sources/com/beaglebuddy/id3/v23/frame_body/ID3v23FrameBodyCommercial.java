package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.Currency;
import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.pojo.Price;
import com.beaglebuddy.util.Utility;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyCommercial extends ID3v23FrameBody {
    private static final int j = 8;
    private Encoding a;
    private List<Price> b;
    private String c;
    private String d;
    private ReceivedType e;
    private String f;
    private String g;
    private String h;
    private byte[] i;

    public enum ReceivedType {
        OTHER(StatEvent.OTHER, StatEvent.OTHER),
        CD("CD", "Standard CD album with other songs"),
        COMPRESSED("Compressed", "Compressed audio on CD"),
        FILE("File", "File over the Internet"),
        STREAM("Stream", "Stream over the Internet"),
        NOTE_SHEETS("Note Sheets", "As note sheets"),
        BOOK_NOTE_SHEETS("Book of Note Sheets", "As note sheets in a book with other sheets"),
        OTHER_MEDIA("Other Media", "Music on other media"),
        NON_MUSICAL("Non-Musical", "Non-musical merchandise");

        private String description;
        private String toString;

        ReceivedType(String str, String str2) {
            this.toString = str;
            this.description = str2;
        }

        public static ReceivedType getReceivedType(byte b) throws IllegalArgumentException {
            for (ReceivedType receivedType : values()) {
                if (b == receivedType.ordinal()) {
                    return receivedType;
                }
            }
            throw new IllegalArgumentException("Invalid received type " + ((int) b) + ".");
        }

        public String getDescription() {
            return this.description;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "" + ordinal() + " - " + this.toString;
        }
    }

    public ID3v23FrameBodyCommercial() {
        this(Encoding.ISO_8859_1, new Vector(), "20990101", "", ReceivedType.OTHER, "", "", "", new byte[0]);
    }

    public String getContactURL() {
        return this.d;
    }

    public String getDescription() {
        return this.g;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public String getPictureMimeType() {
        return this.h;
    }

    public List<Price> getPrices() {
        return this.b;
    }

    public ReceivedType getReceivedAs() {
        return this.e;
    }

    public String getSeller() {
        return this.f;
    }

    public byte[] getSellerLogo() {
        return this.i;
    }

    public String getValidUntil() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(1, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        String[] strArrSplit = new String(this.buffer, 1, nextNullTerminator - 1, encoding.getCharacterSet()).trim().split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        Vector vector = new Vector();
        for (String str : strArrSplit) {
            vector.add(new Price(Currency.getCurrency(str.substring(0, 3)), str.substring(3)));
        }
        int i = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i;
        byte[] bArr = this.buffer;
        Encoding encoding2 = Encoding.ISO_8859_1;
        setValidUntil(new String(bArr, i, 8, encoding2.getCharacterSet()).trim());
        int i2 = this.nullTerminatorIndex + 8;
        this.nullTerminatorIndex = i2;
        int nextNullTerminator2 = getNextNullTerminator(i2, encoding2);
        this.nextNullTerminatorIndex = nextNullTerminator2;
        byte[] bArr2 = this.buffer;
        int i3 = this.nullTerminatorIndex;
        this.d = new String(bArr2, i3, nextNullTerminator2 - i3, encoding2.getCharacterSet()).trim();
        int i4 = this.nextNullTerminatorIndex + 1;
        this.nullTerminatorIndex = i4;
        try {
            setReceivedAs(ReceivedType.getReceivedType(this.buffer[i4]));
        } catch (IllegalArgumentException unused2) {
            setReceivedAs(ReceivedType.OTHER);
        }
        int i5 = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i5;
        int nextNullTerminator3 = getNextNullTerminator(i5, this.a);
        this.nextNullTerminatorIndex = nextNullTerminator3;
        byte[] bArr3 = this.buffer;
        int i6 = this.nullTerminatorIndex;
        this.f = new String(bArr3, i6, nextNullTerminator3 - i6, this.a.getCharacterSet()).trim();
        int numBytesInNullTerminator = this.nullTerminatorIndex + this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator;
        int nextNullTerminator4 = getNextNullTerminator(numBytesInNullTerminator, this.a);
        this.nextNullTerminatorIndex = nextNullTerminator4;
        byte[] bArr4 = this.buffer;
        int i7 = this.nullTerminatorIndex;
        this.g = new String(bArr4, i7, nextNullTerminator4 - i7, this.a.getCharacterSet()).trim();
        int numBytesInNullTerminator2 = this.nullTerminatorIndex + this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator2;
        Encoding encoding3 = Encoding.ISO_8859_1;
        int nextNullTerminator5 = getNextNullTerminator(numBytesInNullTerminator2, encoding3);
        this.nextNullTerminatorIndex = nextNullTerminator5;
        byte[] bArr5 = this.buffer;
        int i8 = this.nullTerminatorIndex;
        this.h = new String(bArr5, i8, nextNullTerminator5 - i8, encoding3.getCharacterSet()).trim();
        int i9 = this.nullTerminatorIndex + this.nextNullTerminatorIndex + 1;
        this.nullTerminatorIndex = i9;
        byte[] bArr6 = this.buffer;
        byte[] bArr7 = new byte[bArr6.length - i9];
        this.i = bArr7;
        System.arraycopy(bArr6, i9, bArr7, 0, bArr7.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            Encoding encoding = Encoding.ISO_8859_1;
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(encoding, ID3v23FrameBodyUtility.pricesToString(this.b));
            byte[] bArrStringToBytes2 = ID3v23FrameBodyUtility.stringToBytes(encoding, this.c);
            byte[] bArrStringToBytes3 = ID3v23FrameBodyUtility.stringToBytes(encoding, this.d);
            byte[] bArrStringToBytes4 = ID3v23FrameBodyUtility.stringToBytes(this.a, this.f);
            byte[] bArrStringToBytes5 = ID3v23FrameBodyUtility.stringToBytes(this.a, this.g);
            byte[] bArrStringToBytes6 = ID3v23FrameBodyUtility.stringToBytes(encoding, this.h);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + bArrStringToBytes2.length + bArrStringToBytes3.length + 1 + bArrStringToBytes4.length + bArrStringToBytes5.length + bArrStringToBytes6.length + this.i.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 1, bArrStringToBytes.length);
            int length = bArrStringToBytes.length;
            System.arraycopy(bArrStringToBytes2, 0, this.buffer, length, bArrStringToBytes2.length);
            int length2 = length + bArrStringToBytes2.length;
            System.arraycopy(bArrStringToBytes3, 0, this.buffer, length2, bArrStringToBytes3.length);
            int length3 = length2 + bArrStringToBytes3.length;
            this.buffer[length3] = (byte) this.e.ordinal();
            System.arraycopy(bArrStringToBytes4, 0, this.buffer, length3, bArrStringToBytes4.length);
            int length4 = length3 + bArrStringToBytes4.length;
            System.arraycopy(bArrStringToBytes5, 0, this.buffer, length4, bArrStringToBytes5.length);
            int length5 = length4 + bArrStringToBytes5.length;
            System.arraycopy(bArrStringToBytes6, 0, this.buffer, length5, bArrStringToBytes6.length);
            int length6 = length5 + bArrStringToBytes6.length;
            byte[] bArr2 = this.i;
            System.arraycopy(bArr2, 0, this.buffer, length6, bArr2.length);
            this.dirty = false;
        }
    }

    public void setContactURL(String str) {
        if (str != null && str.trim().length() != 0) {
            this.dirty = true;
            this.d = str;
        } else {
            throw new IllegalArgumentException("The contact URL field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setDescription(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "";
        }
        this.g = str;
    }

    public void setEncoding(Encoding encoding) {
        if (encoding != null) {
            this.a = encoding;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The encoding field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setPictureMimeType(String str) {
        if (str == null || str.equals("") || str.equals("image/") || str.equals("image/jpg") || str.equals("image/png")) {
            this.dirty = true;
            if (str == null || str.length() == 0) {
                str = "image/";
            }
            this.h = str;
            return;
        }
        throw new IllegalArgumentException("The picture mime type field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".\nIt must be either \"\", \"image/\", \"image/jpg\", or \"image/png\".");
    }

    public void setPrices(List<Price> list) {
        if (list.size() == 0) {
            list.add(new Price(Currency.USD, "0.00"));
        }
        for (Price price : list) {
            if (price.getCurrency() == null) {
                throw new IllegalArgumentException("The prices field in the " + this.frameType.getId() + " frame contains an invalid value.  It contains two different " + price.getCurrency().getCode() + " prices.");
            }
        }
        this.dirty = true;
        this.b = list;
    }

    public void setReceivedAs(ReceivedType receivedType) {
        if (receivedType != null) {
            this.dirty = true;
            this.e = receivedType;
        } else {
            throw new IllegalArgumentException("The received as field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setSeller(String str) {
        if (str != null && str.trim().length() != 0) {
            this.dirty = true;
            this.f = str;
        } else {
            throw new IllegalArgumentException("The seller field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setSellerLogo(byte[] bArr) {
        if (bArr == null) {
            this.h = "";
            this.i = new byte[0];
        } else if (bArr.length == 0) {
            this.h = "";
        } else {
            this.i = bArr;
        }
        this.dirty = true;
    }

    public void setValidUntil(String str) {
        if (str != null && str.length() == 8 && str.matches("\\d{8}")) {
            this.dirty = true;
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("The valid until date field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".  It must have the format YYYYMMDD.");
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: commercial\n");
        stringBuffer.append("   bytes................: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                          " + Utility.hex(this.buffer, 26) + "\n");
        stringBuffer.append("   encoding.............: " + this.a + "\n");
        stringBuffer.append("   price(s).............: " + ID3v23FrameBodyUtility.pricesToString(this.b) + "\n");
        stringBuffer.append("   valid until..........: " + this.c + "\n");
        stringBuffer.append("   contact url..........: " + this.d + "\n");
        stringBuffer.append("   received as..........: " + this.e + "\n");
        stringBuffer.append("   seller...............: " + this.f + "\n");
        stringBuffer.append("   description..........: " + this.g + "\n");
        if (("   seller logo mime type: " + this.h) == null) {
            str = "none";
        } else {
            str = this.h + "\n";
        }
        stringBuffer.append(str);
        stringBuffer.append("   seller logo..........: " + this.i.length + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyCommercial(Encoding encoding, List<Price> list, String str, String str2, ReceivedType receivedType, String str3, String str4, String str5, byte[] bArr) {
        super(FrameType.COMMERCIAL);
        setEncoding(encoding);
        setPrices(list);
        setValidUntil(str);
        setContactURL(str2);
        setReceivedAs(receivedType);
        setSeller(str3);
        setDescription(str4);
        setPictureMimeType(str5);
        setSellerLogo(bArr);
        this.dirty = true;
    }

    public ID3v23FrameBodyCommercial(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.COMMERCIAL, i);
    }
}
