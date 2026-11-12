package com.beaglebuddy.mpeg;

import com.beaglebuddy.exception.ParseException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MPEGFrame {
    private MPEGFrameHeader a;
    private MPEGSideInformation b;
    private XingHeader c;
    private LAMEHeader d;
    private VBRIHeader e;
    private MPEGAudioSamples f;
    private int g;

    public MPEGFrame() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.d = null;
        this.f = null;
        this.g = 0;
    }

    public int getFilePosition() {
        return this.g;
    }

    public LAMEHeader getLAMEHeader() {
        return this.d;
    }

    public MPEGFrameHeader getMPEGFrameHeader() {
        return this.a;
    }

    public int getSize() {
        return this.a.getFrameSize();
    }

    public VBRIHeader getVBRIHeader() {
        return this.e;
    }

    public XingHeader getXingHeader() {
        return this.c;
    }

    public void setFilePosition(int i) {
        this.g = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("mpeg audio frame\n");
        stringBuffer.append("   file position......: " + this.g + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        stringBuffer.append(sb.toString());
        stringBuffer.append(this.b + "\n");
        if (this.c != null) {
            stringBuffer.append(this.c + "\n");
        }
        if (this.e != null) {
            stringBuffer.append(this.e + "\n");
        }
        if (this.d != null) {
            stringBuffer.append(this.d + "\n");
        }
        stringBuffer.append(this.f);
        return stringBuffer.toString();
    }

    public MPEGFrame(InputStream inputStream) throws ParseException, IOException {
        MPEGFrameHeader mPEGFrameHeader = new MPEGFrameHeader(inputStream);
        this.a = mPEGFrameHeader;
        int frameSize = mPEGFrameHeader.getFrameSize() - this.a.getSize();
        byte[] bArr = new byte[frameSize];
        int i = inputStream.read(bArr);
        if (i == frameSize) {
            this.b = new MPEGSideInformation(bArr, this.a.getSideInfoSize());
            this.f = new MPEGAudioSamples(bArr, this.a.getSideInfoSize());
        } else {
            if (i != -1) {
                byte[] bArr2 = new byte[1];
                if (inputStream.read(bArr2) == -1) {
                    throw new ParseException("EOF", bArr2);
                }
                throw new IOException("Unable to read mpeg audio frame");
            }
            throw new ParseException("EOF", bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[Catch: ParseException -> 0x00a3, TRY_ENTER, TryCatch #1 {ParseException -> 0x00a3, blocks: (B:27:0x0086, B:28:0x0092, B:30:0x0097), top: B:37:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092 A[Catch: ParseException -> 0x00a3, TryCatch #1 {ParseException -> 0x00a3, blocks: (B:27:0x0086, B:28:0x0092, B:30:0x0097), top: B:37:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[Catch: ParseException -> 0x00a3, TRY_LEAVE, TryCatch #1 {ParseException -> 0x00a3, blocks: (B:27:0x0086, B:28:0x0092, B:30:0x0097), top: B:37:0x007f }] */
    public MPEGFrame(byte[] bArr, InputStream inputStream) throws ParseException, IOException {
        int size;
        int size2;
        MPEGFrameHeader mPEGFrameHeader = new MPEGFrameHeader(bArr, inputStream);
        this.a = mPEGFrameHeader;
        int frameSize = mPEGFrameHeader.getFrameSize() - this.a.getSize();
        byte[] bArr2 = new byte[frameSize];
        int i = inputStream.read(bArr2);
        if (i != frameSize) {
            if (i != -1) {
                byte[] bArr3 = new byte[1];
                if (inputStream.read(bArr3) == -1) {
                    throw new ParseException("EOF", bArr3);
                }
                throw new IOException("Unable to read mpeg audio frame.");
            }
            throw new ParseException("EOF", bArr2);
        }
        MPEGSideInformation mPEGSideInformation = new MPEGSideInformation(bArr2, this.a.getSideInfoSize());
        this.b = mPEGSideInformation;
        int size3 = mPEGSideInformation.getSize();
        if (frameSize - size3 >= 8) {
            try {
                XingHeader xingHeader = new XingHeader(bArr2, size3);
                this.c = xingHeader;
                size = xingHeader.getSize();
            } catch (ParseException unused) {
                if (this.a.isProtectedByCRC()) {
                    try {
                        XingHeader xingHeader2 = new XingHeader(bArr2, size3 - 2);
                        this.c = xingHeader2;
                        size = xingHeader2.getSize() - 2;
                    } catch (ParseException unused2) {
                    }
                }
                if (this.c == null) {
                    if (frameSize - size3 >= 26) {
                        VBRIHeader vBRIHeader = new VBRIHeader(bArr2, size3);
                        this.e = vBRIHeader;
                        size2 = vBRIHeader.getSize();
                        size3 += size2;
                    }
                } else if (frameSize - size3 >= 20) {
                    LAMEHeader lAMEHeader = new LAMEHeader(bArr2, size3);
                    this.d = lAMEHeader;
                    size2 = lAMEHeader.getSize();
                    size3 += size2;
                }
                this.f = new MPEGAudioSamples(bArr2, size3);
            }
            size3 += size;
        }
        try {
            if (this.c == null) {
                if (frameSize - size3 >= 26) {
                    VBRIHeader vBRIHeader2 = new VBRIHeader(bArr2, size3);
                    this.e = vBRIHeader2;
                    size2 = vBRIHeader2.getSize();
                    size3 += size2;
                }
            } else if (frameSize - size3 >= 20) {
                LAMEHeader lAMEHeader2 = new LAMEHeader(bArr2, size3);
                this.d = lAMEHeader2;
                size2 = lAMEHeader2.getSize();
                size3 += size2;
            }
        } catch (ParseException unused3) {
        }
        this.f = new MPEGAudioSamples(bArr2, size3);
    }
}
