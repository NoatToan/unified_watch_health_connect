package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes14.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j8, long j14, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j8, -1, adPlaybackState);
        int i14 = adPlaybackState.removedAdGroupCount;
        while (i14 < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i14).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i14).timeUs <= mediaPeriodPositionUsForContent) {
            i14++;
        }
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i14, mediaPeriodPositionUsForContent).withIsServerSideInserted(i14, true).withAdCount(i14, jArr.length).withAdDurationsUs(i14, jArr).withContentResumeOffsetUs(i14, j14);
        AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackStateWithContentResumeOffsetUs;
        for (int i15 = 0; i15 < jArr.length && jArr[i15] == 0; i15++) {
            adPlaybackStateWithSkippedAd = adPlaybackStateWithSkippedAd.withSkippedAd(i14, i15);
        }
        return correctFollowingAdGroupTimes(adPlaybackStateWithSkippedAd, i14, Util.sum(jArr), j14);
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i14, long j8, long j14) {
        long j15 = (-j8) + j14;
        while (true) {
            i14++;
            if (i14 >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j16 = adPlaybackState.getAdGroup(i14).timeUs;
            if (j16 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i14, j16 + j15);
            }
        }
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i14) {
        int i15 = adPlaybackState.getAdGroup(i14).count;
        if (i15 == -1) {
            return 0;
        }
        return i15;
    }

    public static long getMediaPeriodPositionUs(long j8, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j8, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : getMediaPeriodPositionUsForContent(j8, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j8, int i14, int i15, AdPlaybackState adPlaybackState) {
        int i16;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i14);
        long j14 = j8 - adGroup.timeUs;
        int i17 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i16 = 0;
            if (i17 >= i14) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i17);
            while (i16 < getAdCountInGroup(adPlaybackState, i17)) {
                j14 -= adGroup2.durationsUs[i16];
                i16++;
            }
            j14 += adGroup2.contentResumeOffsetUs;
            i17++;
        }
        if (i15 < getAdCountInGroup(adPlaybackState, i14)) {
            while (i16 < i15) {
                j14 -= adGroup.durationsUs[i16];
                i16++;
            }
        }
        return j14;
    }

    public static long getMediaPeriodPositionUsForContent(long j8, int i14, AdPlaybackState adPlaybackState) {
        if (i14 == -1) {
            i14 = adPlaybackState.adGroupCount;
        }
        long j14 = 0;
        for (int i15 = adPlaybackState.removedAdGroupCount; i15 < i14; i15++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i15);
            long j15 = adGroup.timeUs;
            if (j15 == Long.MIN_VALUE || j15 > j8 - j14) {
                break;
            }
            for (int i16 = 0; i16 < getAdCountInGroup(adPlaybackState, i15); i16++) {
                j14 += adGroup.durationsUs[i16];
            }
            long j16 = adGroup.contentResumeOffsetUs;
            j14 -= j16;
            long j17 = adGroup.timeUs;
            long j18 = j8 - j14;
            if (j16 + j17 > j18) {
                return Math.max(j17, j18);
            }
        }
        return j8 - j14;
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new Timeline.Period());
        if (!Util.areEqual(period.getAdsId(), adPlaybackState.adsId)) {
            return C.TIME_UNSET;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, adPlaybackState);
        }
        return getStreamPositionUsForAd(Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adPlaybackState);
    }

    public static long getStreamPositionUsForAd(long j8, int i14, int i15, AdPlaybackState adPlaybackState) {
        int i16;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i14);
        long j14 = j8 + adGroup.timeUs;
        int i17 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i16 = 0;
            if (i17 >= i14) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i17);
            while (i16 < getAdCountInGroup(adPlaybackState, i17)) {
                j14 += adGroup2.durationsUs[i16];
                i16++;
            }
            j14 -= adGroup2.contentResumeOffsetUs;
            i17++;
        }
        if (i15 < getAdCountInGroup(adPlaybackState, i14)) {
            while (i16 < i15) {
                j14 += adGroup.durationsUs[i16];
                i16++;
            }
        }
        return j14;
    }

    public static long getStreamPositionUsForContent(long j8, int i14, AdPlaybackState adPlaybackState) {
        if (i14 == -1) {
            i14 = adPlaybackState.adGroupCount;
        }
        long j14 = 0;
        for (int i15 = adPlaybackState.removedAdGroupCount; i15 < i14; i15++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i15);
            long j15 = adGroup.timeUs;
            if (j15 == Long.MIN_VALUE || j15 > j8) {
                break;
            }
            long j16 = j15 + j14;
            for (int i16 = 0; i16 < getAdCountInGroup(adPlaybackState, i15); i16++) {
                j14 += adGroup.durationsUs[i16];
            }
            long j17 = adGroup.contentResumeOffsetUs;
            j14 -= j17;
            if (adGroup.timeUs + j17 > j8) {
                return Math.max(j16, j8 + j14);
            }
        }
        return j8 + j14;
    }

    public static long getStreamPositionUs(long j8, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j8, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j8, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
