package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodySignature extends ID3v24FrameBody {
    private byte a;
    private byte[] b;

    public ID3v24FrameBodySignature() {
        this((byte) 0, new byte[0]);
    }

    public byte getId() {
        return this.a;
    }

    public byte[] getSignature() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        this.a = bArr[0];
        byte[] bArr2 = new byte[bArr.length - 1];
        this.b = bArr2;
        System.arraycopy(bArr, 1, bArr2, 0, bArr2.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArr = this.b;
            byte[] bArr2 = new byte[bArr.length + 1];
            this.buffer = bArr2;
            bArr2[0] = this.a;
            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            this.dirty = false;
        }
    }

    public void setId(byte b) {
        this.a = b;
        this.dirty = true;
    }

    public void setSignature(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.b = bArr;
        this.dirty = true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: signature\n");
        stringBuffer.append("   bytes....: " + this.buffer.length + " bytes\n");
        stringBuffer.append("              " + Utility.hex(this.buffer, 14) + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   id.......: ");
        sb.append((int) this.a);
        stringBuffer.append(sb.toString());
        stringBuffer.append("   signature: " + this.b.length + " bytes\n");
        stringBuffer.append("              " + Utility.hex(this.b, 14) + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodySignature(byte b, byte[] bArr) {
        super(FrameType.SIGNATURE);
        setId(b);
        setSignature(bArr);
        this.dirty = true;
    }

    public ID3v24FrameBodySignature(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.SIGNATURE, i);
    }
}
