package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes14.dex */
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i14, int i15, String str) {
        this.profile = i14;
        this.level = i15;
        this.codecs = str;
    }

    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i14 = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i14 == 4 || i14 == 5 || i14 == 7) {
            str = "dvhe";
        } else if (i14 == 8) {
            str = "hev1";
        } else {
            if (i14 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = unsignedByte2 < 10 ? ".0" : ".";
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length() + 24);
        sb3.append(str);
        sb3.append(".0");
        sb3.append(i14);
        sb3.append(str2);
        sb3.append(unsignedByte2);
        return new DolbyVisionConfig(i14, unsignedByte2, sb3.toString());
    }
}
