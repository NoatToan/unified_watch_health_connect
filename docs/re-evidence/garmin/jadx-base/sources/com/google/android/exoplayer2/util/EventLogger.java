package com.google.android.exoplayer2.util;

import am.j;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import j20.x;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import okhttp3.HttpUrl;
import org.apache.commons.codec.language.bm.Rule;

/* JADX INFO: loaded from: classes14.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final MappingTrackSelector trackSelector;
    private final Timeline.Window window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector, String str) {
        this.trackSelector = mappingTrackSelector;
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    private static String getAdaptiveSupportString(int i14, int i15) {
        if (i14 < 2) {
            return "N/A";
        }
        if (i15 == 0) {
            return "NO";
        }
        if (i15 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i15 == 16) {
            return "YES";
        }
        x.h();
        return null;
    }

    private static String getDiscontinuityReasonString(int i14) {
        if (i14 == 0) {
            return "AUTO_TRANSITION";
        }
        if (i14 == 1) {
            return "SEEK";
        }
        if (i14 == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (i14 == 3) {
            return "SKIP";
        }
        if (i14 != 4) {
            return i14 != 5 ? CallerData.NA : "INTERNAL";
        }
        return "REMOVE";
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th3) {
        String eventTimeString = getEventTimeString(eventTime);
        String strC = v.c(v.a(v.a(2, str), eventTimeString), str, " [", eventTimeString);
        if (th3 instanceof PlaybackException) {
            String errorCodeName = ((PlaybackException) th3).getErrorCodeName();
            strC = v.c(v.a(strC.length() + 12, errorCodeName), strC, ", errorCode=", errorCodeName);
        }
        if (str2 != null) {
            strC = v.c(str2.length() + strC.length() + 2, strC, ", ", str2);
        }
        String throwableString = Log.getThrowableString(th3);
        if (!TextUtils.isEmpty(throwableString)) {
            String strReplace = throwableString.replace("\n", "\n  ");
            StringBuilder sb3 = new StringBuilder(v.a(strC.length() + 4, strReplace));
            sb3.append(strC);
            sb3.append("\n  ");
            sb3.append(strReplace);
            sb3.append('\n');
            strC = sb3.toString();
        }
        return strC.concat("]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String strB = v.b(18, eventTime.windowIndex, "window=");
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            StringBuilder sb3 = new StringBuilder(strB.length() + 20);
            sb3.append(strB);
            sb3.append(", period=");
            sb3.append(indexOfPeriod);
            strB = sb3.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                int i14 = eventTime.mediaPeriodId.adGroupIndex;
                StringBuilder sb4 = new StringBuilder(strB.length() + 21);
                sb4.append(strB);
                sb4.append(", adGroup=");
                sb4.append(i14);
                String string = sb4.toString();
                int i15 = eventTime.mediaPeriodId.adIndexInAdGroup;
                StringBuilder sb5 = new StringBuilder(string.length() + 16);
                sb5.append(string);
                sb5.append(", ad=");
                sb5.append(i15);
                strB = sb5.toString();
            }
        }
        String timeString = getTimeString(eventTime.realtimeMs - this.startTimeMs);
        String timeString2 = getTimeString(eventTime.eventPlaybackPositionMs);
        return j.o(", ", strB, v.d(strB.length() + v.a(v.a(23, timeString), timeString2), "eventTime=", timeString, ", mediaPos=", timeString2));
    }

    private static String getMediaItemTransitionReasonString(int i14) {
        if (i14 == 0) {
            return "REPEAT";
        }
        if (i14 == 1) {
            return "AUTO";
        }
        if (i14 != 2) {
            return i14 != 3 ? CallerData.NA : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String getPlayWhenReadyChangeReasonString(int i14) {
        if (i14 == 1) {
            return "USER_REQUEST";
        }
        if (i14 == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i14 == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i14 != 4) {
            return i14 != 5 ? CallerData.NA : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String getPlaybackSuppressionReasonString(int i14) {
        if (i14 != 0) {
            return i14 != 1 ? CallerData.NA : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static String getRepeatModeString(int i14) {
        if (i14 == 0) {
            return "OFF";
        }
        if (i14 != 1) {
            return i14 != 2 ? CallerData.NA : Rule.ALL;
        }
        return "ONE";
    }

    private static String getStateString(int i14) {
        if (i14 == 1) {
            return "IDLE";
        }
        if (i14 == 2) {
            return "BUFFERING";
        }
        if (i14 != 3) {
            return i14 != 4 ? CallerData.NA : "ENDED";
        }
        return "READY";
    }

    private static String getTimeString(long j8) {
        return j8 == C.TIME_UNSET ? CallerData.NA : TIME_FORMAT.format(j8 / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i14) {
        if (i14 != 0) {
            return i14 != 1 ? CallerData.NA : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(TrackSelection trackSelection, TrackGroup trackGroup, int i14) {
        return getTrackStatusString((trackSelection == null || !trackSelection.getTrackGroup().equals(trackGroup) || trackSelection.indexOf(i14) == -1) ? false : true);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, Throwable th3) {
        loge(getEventString(eventTime, str, null, th3));
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i14 = 0; i14 < metadata.length(); i14++) {
            String strValueOf = String.valueOf(metadata.get(i14));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + String.valueOf(str).length());
            sb3.append(str);
            sb3.append(strValueOf);
            logd(sb3.toString());
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        int i14 = audioAttributes.contentType;
        int i15 = audioAttributes.flags;
        int i16 = audioAttributes.usage;
        int i17 = audioAttributes.allowedCapturePolicy;
        StringBuilder sb3 = new StringBuilder(47);
        sb3.append(i14);
        sb3.append(",");
        sb3.append(i15);
        sb3.append(",");
        sb3.append(i16);
        sb3.append(",");
        sb3.append(i17);
        logd(eventTime, "audioAttributes", sb3.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j8) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i14) {
        logd(eventTime, "audioSessionId", Integer.toString(i14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i14, long j8, long j14) {
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append(i14);
        sb3.append(", ");
        sb3.append(j8);
        sb3.append(", ");
        sb3.append(j14);
        loge(eventTime, "audioTrackUnderrun", sb3.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i14, long j8, long j14) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i14) {
        logd(eventTime, "drmSessionAcquired", v.b(17, i14, "state="));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i14, long j8) {
        logd(eventTime, "droppedFrames", Integer.toString(i14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z14) {
        logd(eventTime, "loading", Boolean.toString(z14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z14) {
        logd(eventTime, "isPlaying", Boolean.toString(z14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z14) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i14) {
        String eventTimeString = getEventTimeString(eventTime);
        String mediaItemTransitionReasonString = getMediaItemTransitionReasonString(i14);
        StringBuilder sbD = v.d(v.a(v.a(21, eventTimeString), mediaItemTransitionReasonString), "mediaItem [", eventTimeString, ", reason=", mediaItemTransitionReasonString);
        sbD.append("]");
        logd(sbD.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        String strValueOf = String.valueOf(getEventTimeString(eventTime));
        logd(strValueOf.length() != 0 ? "metadata [".concat(strValueOf) : new String("metadata ["));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z14, int i14) {
        String playWhenReadyChangeReasonString = getPlayWhenReadyChangeReasonString(i14);
        StringBuilder sb3 = new StringBuilder(v.a(7, playWhenReadyChangeReasonString));
        sb3.append(z14);
        sb3.append(", ");
        sb3.append(playWhenReadyChangeReasonString);
        logd(eventTime, "playWhenReady", sb3.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i14) {
        logd(eventTime, RemoteConfigConstants.ResponseFieldKey.STATE, getStateString(i14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i14) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i14) {
        StringBuilder sb3 = new StringBuilder("reason=");
        sb3.append(getDiscontinuityReasonString(i14));
        sb3.append(", PositionInfo:old [mediaItem=");
        sb3.append(positionInfo.mediaItemIndex);
        sb3.append(", period=");
        sb3.append(positionInfo.periodIndex);
        sb3.append(", pos=");
        sb3.append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            sb3.append(", contentPos=");
            sb3.append(positionInfo.contentPositionMs);
            sb3.append(", adGroup=");
            sb3.append(positionInfo.adGroupIndex);
            sb3.append(", ad=");
            sb3.append(positionInfo.adIndexInAdGroup);
        }
        sb3.append("], PositionInfo:new [mediaItem=");
        sb3.append(positionInfo2.mediaItemIndex);
        sb3.append(", period=");
        sb3.append(positionInfo2.periodIndex);
        sb3.append(", pos=");
        sb3.append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            sb3.append(", contentPos=");
            sb3.append(positionInfo2.contentPositionMs);
            sb3.append(", adGroup=");
            sb3.append(positionInfo2.adGroupIndex);
            sb3.append(", ad=");
            sb3.append(positionInfo2.adIndexInAdGroup);
        }
        sb3.append("]");
        logd(eventTime, "positionDiscontinuity", sb3.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j8) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i14) {
        logd(eventTime, "repeatMode", getRepeatModeString(i14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z14) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z14) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z14));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i14, int i15) {
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append(i14);
        sb3.append(", ");
        sb3.append(i15);
        logd(eventTime, "surfaceSize", sb3.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i14) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        String eventTimeString = getEventTimeString(eventTime);
        String timelineChangeReasonString = getTimelineChangeReasonString(i14);
        StringBuilder sb3 = new StringBuilder(v.a(v.a(69, eventTimeString), timelineChangeReasonString));
        sb3.append("timeline [");
        sb3.append(eventTimeString);
        sb3.append(", periodCount=");
        sb3.append(periodCount);
        sb3.append(", windowCount=");
        sb3.append(windowCount);
        sb3.append(", reason=");
        sb3.append(timelineChangeReasonString);
        logd(sb3.toString());
        for (int i15 = 0; i15 < Math.min(periodCount, 3); i15++) {
            eventTime.timeline.getPeriod(i15, this.period);
            String timeString = getTimeString(this.period.getDurationMs());
            StringBuilder sb4 = new StringBuilder(v.a(11, timeString));
            sb4.append("  period [");
            sb4.append(timeString);
            sb4.append("]");
            logd(sb4.toString());
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i16 = 0; i16 < Math.min(windowCount, 3); i16++) {
            eventTime.timeline.getWindow(i16, this.window);
            String timeString2 = getTimeString(this.window.getDurationMs());
            Timeline.Window window = this.window;
            boolean z14 = window.isSeekable;
            boolean z15 = window.isDynamic;
            StringBuilder sb5 = new StringBuilder(v.a(42, timeString2));
            sb5.append("  window [");
            sb5.append(timeString2);
            sb5.append(", seekable=");
            sb5.append(z14);
            sb5.append(", dynamic=");
            sb5.append(z15);
            sb5.append("]");
            logd(sb5.toString());
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
        int i14;
        MappingTrackSelector mappingTrackSelector = this.trackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = mappingTrackSelector != null ? mappingTrackSelector.getCurrentMappedTrackInfo() : null;
        if (currentMappedTrackInfo == null) {
            logd(eventTime, "tracks", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        String strValueOf = String.valueOf(getEventTimeString(eventTime));
        logd(strValueOf.length() != 0 ? "tracks [".concat(strValueOf) : new String("tracks ["));
        int rendererCount = currentMappedTrackInfo.getRendererCount();
        int i15 = 0;
        while (true) {
            String str = "    ]";
            if (i15 >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i15);
            TrackSelection trackSelection = trackSelectionArray.get(i15);
            int i16 = rendererCount;
            if (trackGroups.length == 0) {
                String rendererName = currentMappedTrackInfo.getRendererName(i15);
                StringBuilder sb3 = new StringBuilder(v.a(5, rendererName));
                sb3.append("  ");
                sb3.append(rendererName);
                sb3.append(" []");
                logd(sb3.toString());
                mappedTrackInfo = currentMappedTrackInfo;
                i14 = i15;
            } else {
                String rendererName2 = currentMappedTrackInfo.getRendererName(i15);
                StringBuilder sb4 = new StringBuilder(v.a(4, rendererName2));
                sb4.append("  ");
                sb4.append(rendererName2);
                sb4.append(" [");
                logd(sb4.toString());
                int i17 = 0;
                while (i17 < trackGroups.length) {
                    TrackGroup trackGroup = trackGroups.get(i17);
                    TrackGroupArray trackGroupArray2 = trackGroups;
                    String adaptiveSupportString = getAdaptiveSupportString(trackGroup.length, currentMappedTrackInfo.getAdaptiveSupport(i15, i17, false));
                    String str2 = trackGroup.f53055id;
                    String str3 = str;
                    StringBuilder sbD = v.d(v.a(v.a(33, str2), adaptiveSupportString), "    Group:", str2, ", adaptive_supported=", adaptiveSupportString);
                    sbD.append(" [");
                    logd(sbD.toString());
                    int i18 = 0;
                    while (i18 < trackGroup.length) {
                        String trackStatusString = getTrackStatusString(trackSelection, trackGroup, i18);
                        int capabilities = currentMappedTrackInfo.getCapabilities(i15, i17, i18);
                        String formatSupportString = Util.getFormatSupportString(RendererCapabilities.getFormatSupport(capabilities));
                        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = currentMappedTrackInfo;
                        int i19 = i17;
                        String str4 = "";
                        String str5 = RendererCapabilities.getHardwareAccelerationSupport(capabilities) == 64 ? ", accelerated=YES" : "";
                        if (RendererCapabilities.getDecoderSupport(capabilities) == 0) {
                            str4 = ", fallback=YES";
                        }
                        String str6 = str4;
                        String logString = Format.toLogString(trackGroup.getFormat(i18));
                        int i24 = i15;
                        StringBuilder sb5 = new StringBuilder(str6.length() + str5.length() + v.a(v.a(v.a(38, trackStatusString), logString), formatSupportString));
                        sb5.append("      ");
                        sb5.append(trackStatusString);
                        sb5.append(" Track:");
                        sb5.append(i18);
                        sn.a.t(sb5, ", ", logString, ", supported=", formatSupportString);
                        sb5.append(str5);
                        sb5.append(str6);
                        logd(sb5.toString());
                        i18++;
                        currentMappedTrackInfo = mappedTrackInfo2;
                        i17 = i19;
                        trackGroup = trackGroup;
                        i15 = i24;
                    }
                    logd(str3);
                    i17++;
                    str = str3;
                    trackGroups = trackGroupArray2;
                    currentMappedTrackInfo = currentMappedTrackInfo;
                }
                mappedTrackInfo = currentMappedTrackInfo;
                i14 = i15;
                String str7 = str;
                if (trackSelection != null) {
                    for (int i25 = 0; i25 < trackSelection.length(); i25++) {
                        Metadata metadata = trackSelection.getFormat(i25).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd(str7);
                            break;
                        }
                    }
                }
                logd("  ]");
            }
            i15 = i14 + 1;
            rendererCount = i16;
            currentMappedTrackInfo = mappedTrackInfo;
        }
        TrackGroupArray unmappedTrackGroups = currentMappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Unmapped [");
            for (int i26 = 0; i26 < unmappedTrackGroups.length; i26++) {
                StringBuilder sb6 = new StringBuilder(23);
                sb6.append("    Group:");
                sb6.append(i26);
                sb6.append(" [");
                logd(sb6.toString());
                TrackGroup trackGroup2 = unmappedTrackGroups.get(i26);
                int i27 = 0;
                while (i27 < trackGroup2.length) {
                    String trackStatusString2 = getTrackStatusString(false);
                    String formatSupportString2 = Util.getFormatSupportString(0);
                    String logString2 = Format.toLogString(trackGroup2.getFormat(i27));
                    TrackGroupArray trackGroupArray3 = unmappedTrackGroups;
                    StringBuilder sb7 = new StringBuilder(v.a(v.a(v.a(38, trackStatusString2), logString2), formatSupportString2));
                    sb7.append("      ");
                    sb7.append(trackStatusString2);
                    sb7.append(" Track:");
                    sb7.append(i27);
                    logd(e5.h(sb7, ", ", logString2, ", supported=", formatSupportString2));
                    i27++;
                    trackGroup2 = trackGroup2;
                    unmappedTrackGroups = trackGroupArray3;
                }
                logd("    ]");
            }
            logd("  ]");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j8) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        int i14 = videoSize.width;
        int i15 = videoSize.height;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append(i14);
        sb3.append(", ");
        sb3.append(i15);
        logd(eventTime, "videoSize", sb3.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f14) {
        logd(eventTime, "volume", Float.toString(f14));
    }

    public void logd(String str) {
        Log.d(this.tag, str);
    }

    public void loge(String str) {
        Log.e(this.tag, str);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th3) {
        loge(getEventString(eventTime, str, str2, th3));
    }

    private static String getTrackStatusString(boolean z14) {
        return z14 ? "[X]" : "[ ]";
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector) {
        this(mappingTrackSelector, DEFAULT_TAG);
    }
}
