package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum MPEGVersion {
    MPEG_25("MPEG 2.5", ""),
    MPEG_RESERVED("Reserved", ""),
    MPEG_2("MPEG 2", "ISO/IEC 13818-3"),
    MPEG_1("MPEG 1", "ISO/IEC 11172-3");

    private String description;
    private String iso;

    MPEGVersion(String str, String str2) {
        this.description = str;
        this.iso = str2;
    }

    public String getDescription() {
        return this.description;
    }

    public String getISOStandard() {
        return this.iso;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.description;
    }

    public static MPEGVersion valueOf(int i) throws IllegalArgumentException {
        for (MPEGVersion mPEGVersion : values()) {
            if (i == mPEGVersion.ordinal()) {
                return mPEGVersion;
            }
        }
        throw new IllegalArgumentException("Invalid MPEG version " + i + ".  It must be 0 <= version <= 3.");
    }
}
