package com.beaglebuddy.id3.pojo;

import com.beaglebuddy.id3.enums.v23.FrameType;

/* JADX INFO: loaded from: classes2.dex */
public class SynchronizedLyric {
    private String a;
    private int b;

    public SynchronizedLyric(String str, int i) {
        if (i >= 0) {
            this.a = str == null ? "" : str;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("The time stamp field in a synchronized lyric, " + str + ", in the " + FrameType.SYNCHRONIZED_LYRIC_TEXT.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public String getText() {
        return this.a;
    }

    public int getTimeStamp() {
        return this.b;
    }

    public String toString() {
        return "" + this.b + ": " + this.a;
    }
}
