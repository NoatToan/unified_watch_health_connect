package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes14.dex */
public class MediaPeriodId {
    public final int adGroupIndex;
    public final int adIndexInAdGroup;
    public final int nextAdGroupIndex;
    public final Object periodUid;
    public final long windowSequenceNumber;

    public MediaPeriodId(MediaPeriodId mediaPeriodId) {
        this.periodUid = mediaPeriodId.periodUid;
        this.adGroupIndex = mediaPeriodId.adGroupIndex;
        this.adIndexInAdGroup = mediaPeriodId.adIndexInAdGroup;
        this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        this.nextAdGroupIndex = mediaPeriodId.nextAdGroupIndex;
    }

    public MediaPeriodId copyWithPeriodUid(Object obj) {
        return this.periodUid.equals(obj) ? this : new MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
    }

    public MediaPeriodId copyWithWindowSequenceNumber(long j8) {
        return this.windowSequenceNumber == j8 ? this : new MediaPeriodId(this.periodUid, this.adGroupIndex, this.adIndexInAdGroup, j8, this.nextAdGroupIndex);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPeriodId)) {
            return false;
        }
        MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
        return this.periodUid.equals(mediaPeriodId.periodUid) && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber && this.nextAdGroupIndex == mediaPeriodId.nextAdGroupIndex;
    }

    public int hashCode() {
        return ((((((((this.periodUid.hashCode() + 527) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
    }

    public boolean isAd() {
        return this.adGroupIndex != -1;
    }

    public MediaPeriodId(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public MediaPeriodId(Object obj, long j8, int i14) {
        this(obj, -1, -1, j8, i14);
    }

    public MediaPeriodId(Object obj, int i14, int i15, long j8) {
        this(obj, i14, i15, j8, -1);
    }

    public MediaPeriodId(Object obj) {
        this(obj, -1L);
    }

    private MediaPeriodId(Object obj, int i14, int i15, long j8, int i16) {
        this.periodUid = obj;
        this.adGroupIndex = i14;
        this.adIndexInAdGroup = i15;
        this.windowSequenceNumber = j8;
        this.nextAdGroupIndex = i16;
    }
}
