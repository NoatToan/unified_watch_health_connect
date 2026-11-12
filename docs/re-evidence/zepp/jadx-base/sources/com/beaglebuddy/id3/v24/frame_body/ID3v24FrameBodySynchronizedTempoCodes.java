package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.TimeStampFormat;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodySynchronizedTempoCodes extends ID3v24FrameBody {
    private TimeStampFormat a;
    private List<TempoChange> b;

    public class TempoChange {
        private int a;
        private int b;

        public TempoChange(int i, int i2) {
            if (i < 0 || i > 510) {
                throw new IllegalArgumentException("The beats per minute field in the " + FrameType.SYNCHRONIZED_TEMPO_CODES.getId() + " contains an invalid value, " + i + ". It must be 0 <= beats per minute <= 510.");
            }
            if (i2 >= 0) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException("The time stamp field in the " + FrameType.SYNCHRONIZED_TEMPO_CODES.getId() + " contains an invalid value, " + i2 + ".  It must be >= 0.");
        }

        public int getBeatsPerMinute() {
            return this.a;
        }

        public int getTimeStamp() {
            return this.b;
        }

        public String toString() {
            return "time stamp: " + this.b + " - " + this.a + " bpm";
        }
    }

    public ID3v24FrameBodySynchronizedTempoCodes() {
        this(TimeStampFormat.MS, new Vector());
    }

    public List<TempoChange> getTempoChanges() {
        return this.b;
    }

    public TimeStampFormat getTimeStampFormat() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        int i;
        try {
            setTimeStampFormat(TimeStampFormat.valueOf(this.buffer[0]));
            while (true) {
                int i2 = i + 5;
                byte[] bArr = this.buffer;
                if (i2 >= bArr.length) {
                    this.dirty = false;
                    return;
                }
                int i3 = (!(bArr[i] == 0 && bArr[i] == 1) && bArr[i] == -1) ? bArr[i + 1] + 255 : bArr[i];
                int i4 = i + (bArr[i] == -1 ? 2 : 1);
                this.b.add(new TempoChange(i3, ((bArr[i4] & 255) << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255)));
                i = i4 + 4;
            }
        } catch (IllegalArgumentException unused) {
            setTimeStampFormat(TimeStampFormat.MS);
        }
        this.b = new Vector();
        i = 1;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        int i;
        if (isDirty()) {
            Iterator<TempoChange> it2 = this.b.iterator();
            int i2 = 0;
            while (true) {
                i = 1;
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().getBeatsPerMinute() >= 256) {
                    i = 2;
                }
                i2 += i + 4;
            }
            byte[] bArr = new byte[i2 + 1];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.getValue();
            for (TempoChange tempoChange : this.b) {
                int beatsPerMinute = tempoChange.getBeatsPerMinute();
                if (beatsPerMinute != 255) {
                    this.buffer[i] = (byte) beatsPerMinute;
                    i++;
                } else {
                    byte[] bArr2 = this.buffer;
                    bArr2[i] = -1;
                    bArr2[i + 1] = (byte) (beatsPerMinute - 255);
                    i += 2;
                }
                System.arraycopy(Utility.intToBytes(tempoChange.getTimeStamp()), 0, this.buffer, i, 4);
            }
            this.dirty = false;
        }
    }

    public void setTempoChanges(List<TempoChange> list) {
        if (list != null) {
            this.b = list;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The tempo changes field in the " + this.frameType.getId() + " frame may not be empty.");
        }
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
        stringBuffer.append("frame body: synchronized tempo codes\n");
        stringBuffer.append("   bytes............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                      " + Utility.hex(this.buffer, 22) + "\n");
        stringBuffer.append("   time stamp format: " + this.a + "\n");
        stringBuffer.append("   tempo changes....: " + this.b.size() + "\n");
        Iterator<TempoChange> it2 = this.b.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(Utility.pad(24) + it2.next() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v24FrameBodySynchronizedTempoCodes(TimeStampFormat timeStampFormat, List<TempoChange> list) {
        super(FrameType.SYNCHRONIZED_TEMPO_CODES);
        setTimeStampFormat(timeStampFormat);
        setTempoChanges(list);
        this.dirty = true;
    }

    public ID3v24FrameBodySynchronizedTempoCodes(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.SYNCHRONIZED_TEMPO_CODES, i);
    }
}
