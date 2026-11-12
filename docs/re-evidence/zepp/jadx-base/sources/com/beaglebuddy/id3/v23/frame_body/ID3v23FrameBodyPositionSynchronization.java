package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.TimeStampFormat;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyPositionSynchronization extends ID3v23FrameBody {
    private TimeStampFormat a;
    private int b;

    public ID3v23FrameBodyPositionSynchronization() {
        this(TimeStampFormat.MS, 0);
    }

    public int getPosition() {
        return this.b;
    }

    public TimeStampFormat getTimeStampFormat() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setTimeStampFormat(TimeStampFormat.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setTimeStampFormat(TimeStampFormat.MS);
        }
        byte[] bArr = this.buffer;
        this.b = ((bArr[1] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[3] & 255) << 8) + (bArr[4] & 255);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArr = new byte[5];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.getValue();
            System.arraycopy(Utility.intToBytes(this.b), 0, this.buffer, 1, 4);
            this.dirty = false;
        }
    }

    public void setPosition(int i) throws IllegalArgumentException {
        if (i >= 0) {
            this.dirty = true;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("The position field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public void setTimeStampFormat(TimeStampFormat timeStampFormat) {
        if (timeStampFormat != null) {
            this.dirty = true;
            this.a = timeStampFormat;
        } else {
            throw new IllegalArgumentException("The time stamp format field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: sychronized lyrics/text\n");
        stringBuffer.append("   time stamp format: " + this.a + "\n");
        stringBuffer.append("   position.........: " + this.b + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyPositionSynchronization(TimeStampFormat timeStampFormat, int i) {
        super(FrameType.POSITION_SYNCHRONIZATION);
        setTimeStampFormat(timeStampFormat);
        setPosition(i);
        this.dirty = true;
    }

    public ID3v23FrameBodyPositionSynchronization(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.POSITION_SYNCHRONIZATION, i);
    }
}
