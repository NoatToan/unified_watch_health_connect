package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public class OutputChannels {
    public static final int BOTH_CHANNELS = 0;
    public static final int DOWNMIX_CHANNELS = 3;
    public static final int LEFT_CHANNEL = 1;
    public static final int RIGHT_CHANNEL = 2;
    private int a;
    public static final OutputChannels LEFT = new OutputChannels(1);
    public static final OutputChannels RIGHT = new OutputChannels(2);
    public static final OutputChannels BOTH = new OutputChannels(0);
    public static final OutputChannels DOWNMIX = new OutputChannels(3);

    private OutputChannels(int i) {
        this.a = i;
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("channels");
        }
    }

    public static OutputChannels fromInt(int i) {
        if (i == 0) {
            return BOTH;
        }
        if (i == 1) {
            return LEFT;
        }
        if (i == 2) {
            return RIGHT;
        }
        if (i == 3) {
            return DOWNMIX;
        }
        throw new IllegalArgumentException("Invalid channel code: " + i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof OutputChannels) && ((OutputChannels) obj).a == this.a;
    }

    public int getChannelCount() {
        return this.a == 0 ? 2 : 1;
    }

    public int getChannelsOutputCode() {
        return this.a;
    }

    public int hashCode() {
        return this.a;
    }
}
