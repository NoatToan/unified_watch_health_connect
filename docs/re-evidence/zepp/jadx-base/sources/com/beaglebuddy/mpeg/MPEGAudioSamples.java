package com.beaglebuddy.mpeg;

import com.beaglebuddy.exception.ParseException;

/* JADX INFO: loaded from: classes2.dex */
public class MPEGAudioSamples {
    private byte[] a;

    public MPEGAudioSamples() {
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
        stringBuffer.append("mpeg audio frame audio samples\n");
        stringBuffer.append("   size.: " + this.a.length + " bytes");
        return stringBuffer.toString();
    }

    public MPEGAudioSamples(byte[] bArr, int i) throws ParseException {
        if (i <= bArr.length) {
            byte[] bArr2 = new byte[bArr.length - i];
            this.a = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        } else {
            throw new ParseException("MPEG audio frame size, " + bArr.length + ", is too small for the MPEG audio samples.", bArr);
        }
    }
}
