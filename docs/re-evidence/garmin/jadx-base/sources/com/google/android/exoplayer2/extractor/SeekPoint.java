package com.google.android.exoplayer2.extractor;

import am.j;

/* JADX INFO: loaded from: classes13.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j8, long j14) {
        this.timeUs = j8;
        this.position = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public String toString() {
        long j8 = this.timeUs;
        long j14 = this.position;
        StringBuilder sb3 = new StringBuilder(60);
        sb3.append("[timeUs=");
        sb3.append(j8);
        sb3.append(", position=");
        return j.i(j14, "]", sb3);
    }
}
