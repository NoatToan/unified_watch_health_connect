package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes13.dex */
public interface SeekMap {
    long getDurationUs();

    SeekPoints getSeekPoints(long j8);

    boolean isSeekable();

    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            String string;
            String strValueOf = String.valueOf(this.first);
            if (this.first.equals(this.second)) {
                string = "";
            } else {
                String strValueOf2 = String.valueOf(this.second);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 2);
                sb3.append(", ");
                sb3.append(strValueOf2);
                string = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(string.length() + strValueOf.length() + 2);
            sb4.append("[");
            sb4.append(strValueOf);
            sb4.append(string);
            sb4.append("]");
            return sb4.toString();
        }

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }
    }

    public static class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j8, long j14) {
            this.durationUs = j8;
            this.startSeekPoints = new SeekPoints(j14 == 0 ? SeekPoint.START : new SeekPoint(0L, j14));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekPoints getSeekPoints(long j8) {
            return this.startSeekPoints;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j8) {
            this(j8, 0L);
        }
    }
}
