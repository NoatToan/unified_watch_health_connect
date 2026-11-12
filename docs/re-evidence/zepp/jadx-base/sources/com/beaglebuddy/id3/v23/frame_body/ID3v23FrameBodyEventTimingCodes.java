package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.EventType;
import com.beaglebuddy.id3.enums.TimeStampFormat;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.pojo.EventCode;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyEventTimingCodes extends ID3v23FrameBody {
    private TimeStampFormat a;
    private List<EventCode> b;

    public ID3v23FrameBodyEventTimingCodes() {
        this(TimeStampFormat.MS, new Vector());
    }

    public List<EventCode> getEventCodes() {
        return this.b;
    }

    public TimeStampFormat getTimeStampFormat() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        int i;
        try {
            setTimeStampFormat(TimeStampFormat.valueOf(this.buffer[0]));
            while (true) {
                byte[] bArr = this.buffer;
                if (i >= bArr.length) {
                    this.dirty = false;
                    return;
                }
                EventType eventTypeValueOf = EventType.valueOf(bArr[i]);
                byte[] bArr2 = this.buffer;
                int i2 = ((bArr2[i + 1] & 255) << 24) + ((bArr2[i + 2] & 255) << 16) + ((bArr2[i + 3] & 255) << 8) + (bArr2[i + 4] & 255);
                i += 5;
                this.b.add(new EventCode(eventTypeValueOf, i2));
            }
        } catch (IllegalArgumentException unused) {
            setTimeStampFormat(TimeStampFormat.MS);
        }
        this.b = new Vector();
        i = 1;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArr = new byte[(this.b.size() * 5) + 1];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.getValue();
            int i = 1;
            for (EventCode eventCode : this.b) {
                this.buffer[i] = (byte) eventCode.getEventType().ordinal();
                int i2 = i + 1;
                System.arraycopy(Utility.intToBytes(eventCode.getTimeStamp()), 0, this.buffer, i2, 4);
                i = i2 + 4;
            }
            this.dirty = false;
        }
    }

    public void setEventCodes(List<EventCode> list) {
        if (list == null) {
            list = new Vector<>();
        }
        this.b = list;
        this.dirty = true;
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
        stringBuffer.append("frame body: event timing codes\n");
        stringBuffer.append("   bytes............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                      " + Utility.hex(this.buffer, 22) + "\n");
        stringBuffer.append("   time stamp format: " + this.a + "\n");
        stringBuffer.append("   event codes......: " + this.b.size() + "\n");
        Iterator<EventCode> it2 = this.b.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(Utility.pad(24) + it2.next() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyEventTimingCodes(TimeStampFormat timeStampFormat, List<EventCode> list) {
        super(FrameType.EVENT_TIMING_CODES);
        setTimeStampFormat(timeStampFormat);
        setEventCodes(list);
    }

    public ID3v23FrameBodyEventTimingCodes(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.EVENT_TIMING_CODES, i);
    }
}
