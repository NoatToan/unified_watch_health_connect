package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.Currency;
import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.id3.pojo.Price;
import com.beaglebuddy.util.Utility;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyOwnership extends ID3v24FrameBody {
    private static final int e = 8;
    private Encoding a;
    private List<Price> b;
    private String c;
    private String d;

    public ID3v24FrameBodyOwnership() {
        this(Encoding.ISO_8859_1, new Vector(), Utility.formateDate(null), "");
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public List<Price> getPrices() {
        return this.b;
    }

    public String getPurchaseDate() {
        return this.c;
    }

    public String getSeller() {
        return this.d;
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
        String[] strArrSplit = new String(this.buffer, 1, nextNullTerminator - 1, encoding.getCharacterSet()).trim().split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        Vector vector = new Vector();
        for (String str : strArrSplit) {
            vector.add(new Price(Currency.getCurrency(str.substring(0, 3)), str.substring(3)));
        }
        setPrices(vector);
        int i = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i;
        this.c = new String(this.buffer, i, 8, Encoding.ISO_8859_1.getCharacterSet()).trim();
        int i2 = this.nullTerminatorIndex + 8;
        this.nullTerminatorIndex = i2;
        byte[] bArr = this.buffer;
        this.d = new String(bArr, i2, bArr.length - i2, this.a.getCharacterSet()).trim();
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            Encoding encoding = Encoding.ISO_8859_1;
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(encoding, ID3v24FrameBodyUtility.pricesToString(this.b));
            byte[] bArrStringToBytes2 = ID3v24FrameBodyUtility.stringToBytes(encoding, this.c);
            byte[] bArrStringToBytes3 = ID3v24FrameBodyUtility.stringToBytes(this.a, this.d);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + bArrStringToBytes2.length + bArrStringToBytes3.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 1, bArrStringToBytes.length);
            int length = bArrStringToBytes.length + 1;
            System.arraycopy(bArrStringToBytes2, 0, this.buffer, length, bArrStringToBytes2.length);
            System.arraycopy(bArrStringToBytes3, 0, this.buffer, length + bArrStringToBytes2.length, bArrStringToBytes3.length);
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

    public void setPrices(List<Price> list) {
        if (list == null) {
            throw new IllegalArgumentException("The prices field in the " + this.frameType.getId() + " frame may not be empty.");
        }
        if (list.size() == 0) {
            list.add(new Price(Currency.USD, "0.00"));
        }
        for (Price price : list) {
            if (price.getCurrency() == null) {
                throw new IllegalArgumentException("Invalid price list.  It contains two different " + price.getCurrency().getCode() + " prices.");
            }
        }
        this.dirty = true;
        this.b = list;
    }

    public void setPurchaseDate(String str) {
        if (str == null || str.length() != 8 || !str.matches("\\d{8}")) {
            throw new IllegalArgumentException("The purchase date field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".  It must have the format YYYYMMDD.");
        }
        try {
            int iIntValue = Integer.valueOf(str.substring(5, 6)).intValue();
            if (iIntValue < 1 || iIntValue > 12) {
                throw new IllegalArgumentException("The purchase date field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".  It must have the format YYYYMMDD.");
            }
            try {
                int iIntValue2 = Integer.valueOf(str.substring(7, 8)).intValue();
                if (iIntValue2 >= 1 && iIntValue2 <= 31) {
                    this.c = str;
                    this.dirty = true;
                    return;
                }
                throw new IllegalArgumentException("The purchase date field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".  It must have the format YYYYMMDD.");
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("The purchase date field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".  It must have the format YYYYMMDD.");
            }
        } catch (NumberFormatException unused2) {
            throw new IllegalArgumentException("The purchase date field in the " + this.frameType.getId() + " frame contains an invalid value, " + str + ".  It must have the format YYYYMMDD.");
        }
    }

    public void setSeller(String str) {
        if (str != null && str.length() != 0) {
            this.d = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The seller field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: ownership\n");
        stringBuffer.append("   bytes............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                      " + Utility.hex(this.buffer, 22) + "\n");
        stringBuffer.append("   encoding.........: " + this.a + "\n");
        stringBuffer.append("   price(s).........: " + ID3v24FrameBodyUtility.pricesToString(this.b) + "\n");
        stringBuffer.append("   purchase date....: " + this.c + "\n");
        stringBuffer.append("   seller...........: " + this.d + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyOwnership(Encoding encoding, List<Price> list, String str, String str2) {
        super(FrameType.OWNERSHIP);
        setEncoding(encoding);
        setPrices(list);
        setPurchaseDate(str);
        setSeller(str2);
        this.dirty = true;
    }

    public ID3v24FrameBodyOwnership(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.OWNERSHIP, i);
    }
}
