package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.id3.pojo.v24.RelativeVolume;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyRelativeVolumeAdjustment extends ID3v24FrameBody {
    private String a;
    private List<RelativeVolume> b;

    public ID3v24FrameBodyRelativeVolumeAdjustment() {
        this("standard", new Vector());
    }

    public String getIdentification() {
        return this.a;
    }

    public RelativeVolume getVolume(RelativeVolume.Channel channel) {
        for (RelativeVolume relativeVolume : this.b) {
            if (relativeVolume.getChannel() == channel) {
                return relativeVolume;
            }
        }
        return null;
    }

    public List<RelativeVolume> getVolumes() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        int iBytesToInt;
        RelativeVolume relativeVolume;
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(0, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        setIdentification(new String(this.buffer, 0, nextNullTerminator - 1, encoding.getCharacterSet()).trim());
        int i = this.nullTerminatorIndex + 1;
        this.b = new Vector();
        while (true) {
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.dirty = false;
                return;
            }
            RelativeVolume.Channel channel = RelativeVolume.Channel.getChannel(bArr[i]);
            short sBytesToShort = Utility.bytesToShort(this.buffer, i);
            int i2 = i + 2;
            byte[] bArr2 = this.buffer;
            byte b = bArr2[i2];
            i = i2 + 1;
            if (b == 0) {
                relativeVolume = new RelativeVolume(channel, ((double) sBytesToShort) / 512.0d, RelativeVolume.PeakVolumeSize.SIZE_NONE, 0);
            } else {
                int i3 = b % 8;
                int i4 = b / 8;
                if (i3 != 0) {
                    i4++;
                }
                if (i4 == 1) {
                    iBytesToInt = bArr2[i];
                } else if (i4 == 2) {
                    iBytesToInt = Utility.bytesToShort(bArr2, i);
                } else if (i4 == 3) {
                    iBytesToInt = ((bArr2[i] & 255) << ((bArr2[i + 1] & 255) + 16)) << ((bArr2[i + 2] & 255) + 8);
                } else {
                    iBytesToInt = i4 == 4 ? Utility.bytesToInt(bArr2, i) : bArr2[(i + i4) - 1];
                }
                i += i4;
                relativeVolume = new RelativeVolume(channel, ((double) sBytesToShort) / 512.0d, RelativeVolume.PeakVolumeSize.SIZE_32_BITS, iBytesToInt == true ? 1 : 0);
            }
            this.b.add(relativeVolume);
        }
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            Iterator<RelativeVolume> it2 = this.b.iterator();
            int i = 0;
            while (true) {
                int i2 = 4;
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().getPeakVolumeSize() != RelativeVolume.PeakVolumeSize.SIZE_NONE) {
                    i2 = 8;
                }
                i += i2;
            }
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            byte[] bArr = new byte[bArrStringToBytes.length + i];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            int length = bArrStringToBytes.length + 0;
            for (RelativeVolume relativeVolume : this.b) {
                this.buffer[length] = (byte) relativeVolume.getChannel().ordinal();
                int i3 = length + 1;
                System.arraycopy(Utility.shortToBytes((short) (relativeVolume.getVolume() * 512.0d)), 0, this.buffer, i3, 2);
                int i4 = i3 + 2;
                this.buffer[i4] = (byte) (relativeVolume.getPeakVolumeSize() == RelativeVolume.PeakVolumeSize.SIZE_NONE ? 0 : 32);
                length = i4 + 1;
                if (relativeVolume.getPeakVolumeSize() == RelativeVolume.PeakVolumeSize.SIZE_32_BITS) {
                    System.arraycopy(Utility.intToBytes(relativeVolume.getPeakVolume()), 0, this.buffer, length, 4);
                }
            }
        }
        this.dirty = false;
    }

    public void setIdentification(String str) {
        this.a = str;
    }

    public void setVolume(RelativeVolume relativeVolume) {
        if (relativeVolume != null) {
            RelativeVolume volume = getVolume(relativeVolume.getChannel());
            if (volume != null) {
                this.b.remove(volume);
            }
            this.b.add(relativeVolume);
        }
        this.dirty = true;
    }

    public void setVolumes(RelativeVolume[] relativeVolumeArr) {
        Vector vector = new Vector();
        if (relativeVolumeArr != null) {
            for (RelativeVolume relativeVolume : relativeVolumeArr) {
                vector.add(relativeVolume);
            }
        }
        setVolumes(vector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: relative volume adjustment\n");
        stringBuffer.append("   bytes......................: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                                " + Utility.hex(this.buffer, 32) + "\n");
        stringBuffer.append("   identification.............: " + this.a + "\n");
        stringBuffer.append("   relative volume adjustments: " + this.b.size() + "\n");
        Iterator<RelativeVolume> it2 = this.b.iterator();
        while (it2.hasNext()) {
            stringBuffer.append("                                " + it2.next() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyRelativeVolumeAdjustment(String str, RelativeVolume[] relativeVolumeArr) {
        super(FrameType.RELATIVE_VOLUME_ADJUSTMENT);
        setIdentification(str);
        setVolumes(relativeVolumeArr);
    }

    public ID3v24FrameBodyRelativeVolumeAdjustment(String str, List<RelativeVolume> list) {
        super(FrameType.RELATIVE_VOLUME_ADJUSTMENT);
        setIdentification(str);
        setVolumes(list);
        this.dirty = true;
    }

    public void setVolumes(List<RelativeVolume> list) {
        if (list == null) {
            list = new Vector<>();
        }
        this.b = list;
        this.dirty = true;
    }

    public ID3v24FrameBodyRelativeVolumeAdjustment(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.RELATIVE_VOLUME_ADJUSTMENT, i);
    }
}
