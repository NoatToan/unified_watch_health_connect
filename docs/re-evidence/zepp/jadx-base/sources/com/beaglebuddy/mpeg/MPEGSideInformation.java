package com.beaglebuddy.mpeg;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MPEGSideInformation {
    public static final int HEADER_MAX_SIZE = 32;
    public static final int HEADER_MIN_SIZE = 17;
    private byte[] a;

    public MPEGSideInformation() {
        this.a = null;
    }

    public byte[] getData() {
        return this.a;
    }

    public int getSize() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("mpeg audio frame side information\n");
        stringBuffer.append("   size.: " + this.a.length + " bytes\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   bytes: ");
        sb.append(Utility.hex(this.a, 10));
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public MPEGSideInformation(byte[] bArr, int i) throws ParseException {
        if (i != 17 && i != 32) {
            throw new ParseException("Invalid size specified for MPEG side information, " + i + ".  It must be either 17 or 32.", bArr);
        }
        if (bArr.length >= i) {
            byte[] bArr2 = new byte[i];
            this.a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, i);
        } else {
            throw new ParseException("MPEG audio frame size, " + bArr.length + ", is too small for the " + i + " byte MPEG side information.", bArr);
        }
    }

    public MPEGSideInformation(InputStream inputStream, int i) throws ParseException, IOException {
        if (i != 17 && i != 32) {
            throw new ParseException("Invalid size specified for MPEG side information, " + i + ".  It must be either 17 or 32.", new byte[0]);
        }
        byte[] bArr = new byte[i];
        this.a = bArr;
        int i2 = inputStream.read(bArr);
        if (i2 != this.a.length) {
            if (i2 != -1) {
                if (inputStream.read() == -1) {
                    throw new ParseException("EOF reached while reading the MPEG side information.", this.a);
                }
                throw new IOException("Unable to read the side information from the mpeg audio frame in the mp3 file.");
            }
            throw new ParseException("EOF reached while reading the MPEG side information.", this.a);
        }
    }
}
