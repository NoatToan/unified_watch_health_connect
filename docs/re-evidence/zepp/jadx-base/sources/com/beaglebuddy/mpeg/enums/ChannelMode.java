package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum ChannelMode {
    STEREO("Stereo", true),
    JOINT_STEREO("Joint Stereo", true),
    DUAL_CHANNEL("Dual Channel", true),
    SINGLE_CHANNEL("Single channel", false);

    private String name;
    private boolean stereo;

    ChannelMode(String str, boolean z) {
        this.name = str;
        this.stereo = z;
    }

    public String getName() {
        return this.name;
    }

    public boolean isStereo() {
        return this.stereo;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static ChannelMode valueOf(int i) throws IllegalArgumentException {
        for (ChannelMode channelMode : values()) {
            if (i == channelMode.ordinal()) {
                return channelMode;
            }
        }
        throw new IllegalArgumentException("Invalid channel mode " + i + ".  It must be 0 <= channel mode <= 3.");
    }
}
