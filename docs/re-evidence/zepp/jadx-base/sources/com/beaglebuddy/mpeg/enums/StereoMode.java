package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum StereoMode {
    MONO("mono"),
    STEREO("stereo"),
    DUAL("dual"),
    JOINT("joint"),
    FORCE("force"),
    INTENSITY("intensity"),
    UNDEFINED("undefined/different");

    private String name;

    StereoMode(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static StereoMode valueOf(int i) throws IllegalArgumentException {
        for (StereoMode stereoMode : values()) {
            if (i == stereoMode.ordinal()) {
                return stereoMode;
            }
        }
        throw new IllegalArgumentException("Invalid stereo mode " + i + ".  It must be 0 <= stereo mode <= " + UNDEFINED.ordinal() + ".");
    }
}
