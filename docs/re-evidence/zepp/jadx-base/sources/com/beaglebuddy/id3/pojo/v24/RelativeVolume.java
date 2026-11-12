package com.beaglebuddy.id3.pojo.v24;

/* JADX INFO: loaded from: classes2.dex */
public class RelativeVolume {
    private Channel a;
    private short b;
    private PeakVolumeSize c;
    private int d;

    public enum Channel {
        OTHER,
        MASTER_VOLUME,
        FRONT_RIGHT,
        FRONT_LEFT,
        BACK_RIGHT,
        BACK_LEFT,
        FRONT_CENTER,
        BACK_CENTER,
        SUB_WOOFER;

        public static Channel getChannel(int i) {
            for (Channel channel : values()) {
                if (i == channel.ordinal()) {
                    return channel;
                }
            }
            throw new IllegalArgumentException("Invalid speaker channel " + i + ".  It must be 0 <= channel <= " + SUB_WOOFER + ".");
        }

        @Override // java.lang.Enum
        public String toString() {
            return "" + ordinal() + " - " + super.toString().toLowerCase() + " channel";
        }
    }

    public enum PeakVolumeSize {
        SIZE_NONE,
        SIZE_32_BITS;

        public static PeakVolumeSize getPeakVolumeSize(int i) {
            for (PeakVolumeSize peakVolumeSize : values()) {
                if (i == peakVolumeSize.ordinal()) {
                    return peakVolumeSize;
                }
            }
            throw new IllegalArgumentException("Invalid peak volume size " + i + ".  It must be " + SIZE_NONE.ordinal() + " or " + SIZE_32_BITS.ordinal() + ".");
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(ordinal());
            sb.append(" - ");
            sb.append(this == SIZE_NONE ? "none" : "32 bits");
            return sb.toString();
        }
    }

    public RelativeVolume() {
        this(Channel.OTHER, 0.0d, PeakVolumeSize.SIZE_NONE, 0);
    }

    public Channel getChannel() {
        return this.a;
    }

    public int getPeakVolume() {
        return this.d;
    }

    public PeakVolumeSize getPeakVolumeSize() {
        return this.c;
    }

    public double getVolume() {
        return this.b / 512;
    }

    public void setChannel(Channel channel) {
        this.a = channel;
    }

    public void setPeakVolume(int i) {
        this.d = i;
    }

    public void setPeakVolumeSize(PeakVolumeSize peakVolumeSize) {
        this.c = peakVolumeSize;
    }

    public void setVolume(double d) {
        if (d >= -64.0d && d <= 64.0d) {
            this.b = (short) Math.round(d * 512.0d);
            return;
        }
        throw new IllegalArgumentException("Invalid volume " + d + ".  It must be in the range of ±64 db.");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(((double) this.b) / 512.0d);
        sb.append(" db with ");
        if (this.c == PeakVolumeSize.SIZE_NONE) {
            str = " no peak volume";
        } else {
            str = "32 bit peak volume of " + this.d;
        }
        sb.append(str);
        return sb.toString();
    }

    public RelativeVolume(Channel channel, double d, PeakVolumeSize peakVolumeSize, int i) {
        setChannel(channel);
        setVolume(d);
        setPeakVolumeSize(peakVolumeSize);
        setPeakVolume(i);
    }
}
