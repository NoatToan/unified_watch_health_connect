package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyMusicCDIdentifier extends ID3v24FrameBody {
    private byte[] a;

    public ID3v24FrameBodyMusicCDIdentifier() {
        this(new byte[1]);
    }

    public byte[] getCdTOC() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        byte[] bArr2 = new byte[bArr.length];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArr = this.a;
            byte[] bArr2 = new byte[bArr.length];
            this.buffer = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.dirty = false;
        }
    }

    public void setCdTOC(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            this.a = bArr;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The cd Table of contents (cdTOC) field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: music cd identifier\n");
        stringBuffer.append("   cd table of contents: " + this.a.length + " bytes\n");
        stringBuffer.append("                         " + Utility.hex(this.a, 25) + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyMusicCDIdentifier(byte[] bArr) {
        super(FrameType.MUSIC_CD_IDENTIFIER);
        setCdTOC(bArr);
        this.dirty = true;
    }

    public ID3v24FrameBodyMusicCDIdentifier(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.MUSIC_CD_IDENTIFIER, i);
    }
}
