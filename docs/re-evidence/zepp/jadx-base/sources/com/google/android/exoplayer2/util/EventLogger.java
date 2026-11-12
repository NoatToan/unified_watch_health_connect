package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.device.authorization.RegionUtil;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import com.huami.nfc.bus.NoticesEntity;
import com.tencent.connect.share.QzonePublish;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes3.dex */
public class EventLogger implements AnalyticsListener {
    private static final String f = "EventLogger";
    private static final int g = 3;
    private static final NumberFormat h;

    @Nullable
    private final MappingTrackSelector a;
    private final String b;
    private final Timeline.Window c;
    private final Timeline.Period d;
    private final long e;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        h = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(@Nullable MappingTrackSelector trackSelector) {
        this(trackSelector, f);
    }

    private static String a(int trackCount, int adaptiveSupport) {
        if (trackCount < 2) {
            return ACRAConstants.NOT_AVAILABLE;
        }
        if (adaptiveSupport == 0) {
            return "NO";
        }
        if (adaptiveSupport == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (adaptiveSupport == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static String b(int reason) {
        if (reason == 0) {
            return "AUTO_TRANSITION";
        }
        if (reason == 1) {
            return "SEEK";
        }
        if (reason == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (reason == 3) {
            return "SKIP";
        }
        if (reason != 4) {
            return reason != 5 ? "?" : "INTERNAL";
        }
        return "REMOVE";
    }

    private String c(AnalyticsListener.EventTime eventTime, String eventName, @Nullable String eventDescription, @Nullable Throwable throwable) {
        String strD = d(eventTime);
        StringBuilder sb = new StringBuilder(String.valueOf(eventName).length() + 2 + String.valueOf(strD).length());
        sb.append(eventName);
        sb.append(" [");
        sb.append(strD);
        String string = sb.toString();
        if (throwable instanceof PlaybackException) {
            String strValueOf = String.valueOf(string);
            String errorCodeName = ((PlaybackException) throwable).getErrorCodeName();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12 + String.valueOf(errorCodeName).length());
            sb2.append(strValueOf);
            sb2.append(", errorCode=");
            sb2.append(errorCodeName);
            string = sb2.toString();
        }
        if (eventDescription != null) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 2 + eventDescription.length());
            sb3.append(strValueOf2);
            sb3.append(", ");
            sb3.append(eventDescription);
            string = sb3.toString();
        }
        String throwableString = Log.getThrowableString(throwable);
        if (!TextUtils.isEmpty(throwableString)) {
            String strValueOf3 = String.valueOf(string);
            String strReplace = throwableString.replace("\n", "\n  ");
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 4 + String.valueOf(strReplace).length());
            sb4.append(strValueOf3);
            sb4.append("\n  ");
            sb4.append(strReplace);
            sb4.append('\n');
            string = sb4.toString();
        }
        return String.valueOf(string).concat("]");
    }

    private String d(AnalyticsListener.EventTime eventTime) {
        int i = eventTime.windowIndex;
        StringBuilder sb = new StringBuilder(18);
        sb.append("window=");
        sb.append(i);
        String string = sb.toString();
        if (eventTime.mediaPeriodId != null) {
            String strValueOf = String.valueOf(string);
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append(strValueOf);
            sb2.append(", period=");
            sb2.append(indexOfPeriod);
            string = sb2.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                String strValueOf2 = String.valueOf(string);
                int i2 = eventTime.mediaPeriodId.adGroupIndex;
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 21);
                sb3.append(strValueOf2);
                sb3.append(", adGroup=");
                sb3.append(i2);
                String strValueOf3 = String.valueOf(sb3.toString());
                int i3 = eventTime.mediaPeriodId.adIndexInAdGroup;
                StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 16);
                sb4.append(strValueOf3);
                sb4.append(", ad=");
                sb4.append(i3);
                string = sb4.toString();
            }
        }
        String strJ = j(eventTime.realtimeMs - this.e);
        String strJ2 = j(eventTime.eventPlaybackPositionMs);
        StringBuilder sb5 = new StringBuilder(String.valueOf(strJ).length() + 23 + String.valueOf(strJ2).length() + String.valueOf(string).length());
        sb5.append("eventTime=");
        sb5.append(strJ);
        sb5.append(", mediaPos=");
        sb5.append(strJ2);
        sb5.append(", ");
        sb5.append(string);
        return sb5.toString();
    }

    private static String e(int reason) {
        if (reason == 0) {
            return "REPEAT";
        }
        if (reason == 1) {
            return RegionUtil.REGION_STRING_AUTO;
        }
        if (reason != 2) {
            return reason != 3 ? "?" : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String f(int reason) {
        if (reason == 1) {
            return "USER_REQUEST";
        }
        if (reason == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (reason == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (reason != 4) {
            return reason != 5 ? "?" : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String g(int playbackSuppressionReason) {
        if (playbackSuppressionReason != 0) {
            return playbackSuppressionReason != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return NoticesEntity.LOOP_TYPE_NONE;
    }

    private static String h(int repeatMode) {
        if (repeatMode == 0) {
            return Constant.OFF;
        }
        if (repeatMode != 1) {
            return repeatMode != 2 ? "?" : "ALL";
        }
        return "ONE";
    }

    private static String i(int state) {
        if (state == 1) {
            return "IDLE";
        }
        if (state == 2) {
            return "BUFFERING";
        }
        if (state != 3) {
            return state != 4 ? "?" : "ENDED";
        }
        return "READY";
    }

    private static String j(long timeMs) {
        return timeMs == C.TIME_UNSET ? "?" : h.format(timeMs / 1000.0f);
    }

    private static String k(int reason) {
        if (reason != 0) {
            return reason != 1 ? "?" : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String l(@Nullable TrackSelection selection, TrackGroup group, int trackIndex) {
        return m((selection == null || selection.getTrackGroup() != group || selection.indexOf(trackIndex) == -1) ? false : true);
    }

    private static String m(boolean enabled) {
        return enabled ? "[X]" : "[ ]";
    }

    private void n(AnalyticsListener.EventTime eventTime, String eventName) {
        logd(c(eventTime, eventName, null, null));
    }

    private void o(AnalyticsListener.EventTime eventTime, String eventName, String eventDescription) {
        logd(c(eventTime, eventName, eventDescription, null));
    }

    private void p(AnalyticsListener.EventTime eventTime, String eventName, String eventDescription, @Nullable Throwable throwable) {
        loge(c(eventTime, eventName, eventDescription, throwable));
    }

    private void q(AnalyticsListener.EventTime eventTime, String eventName, @Nullable Throwable throwable) {
        loge(c(eventTime, eventName, null, throwable));
    }

    private void r(AnalyticsListener.EventTime eventTime, String type, Exception e) {
        p(eventTime, "internalError", type, e);
    }

    private void s(Metadata metadata, String prefix) {
        for (int i = 0; i < metadata.length(); i++) {
            String strValueOf = String.valueOf(metadata.get(i));
            StringBuilder sb = new StringBuilder(String.valueOf(prefix).length() + strValueOf.length());
            sb.append(prefix);
            sb.append(strValueOf);
            logd(sb.toString());
        }
    }

    public void logd(String msg) {
        Log.d(this.b, msg);
    }

    public void loge(String msg) {
        Log.e(this.b, msg);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        int i = audioAttributes.contentType;
        int i2 = audioAttributes.flags;
        int i3 = audioAttributes.usage;
        int i4 = audioAttributes.allowedCapturePolicy;
        StringBuilder sb = new StringBuilder(47);
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        o(eventTime, "audioAttributes", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        com.google.android.exoplayer2.analytics.a.b(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String decoderName, long initializationDurationMs) {
        o(eventTime, "audioDecoderInitialized", decoderName);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        com.google.android.exoplayer2.analytics.a.d(this, eventTime, str, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String decoderName) {
        o(eventTime, "audioDecoderReleased", decoderName);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        n(eventTime, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        n(eventTime, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        com.google.android.exoplayer2.analytics.a.h(this, eventTime, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        o(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.a.j(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int audioSessionId) {
        o(eventTime, "audioSessionId", Integer.toString(audioSessionId));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        com.google.android.exoplayer2.analytics.a.l(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        StringBuilder sb = new StringBuilder(55);
        sb.append(bufferSize);
        sb.append(", ");
        sb.append(bufferSizeMs);
        sb.append(", ");
        sb.append(elapsedSinceLastFeedMs);
        p(eventTime, "audioTrackUnderrun", sb.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        com.google.android.exoplayer2.analytics.a.n(this, eventTime, commands);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.p(this, eventTime, i, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.q(this, eventTime, i, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        com.google.android.exoplayer2.analytics.a.r(this, eventTime, i, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
        com.google.android.exoplayer2.analytics.a.s(this, eventTime, i, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        o(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        n(eventTime, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        n(eventTime, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        n(eventTime, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.x(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int state) {
        StringBuilder sb = new StringBuilder(17);
        sb.append("state=");
        sb.append(state);
        o(eventTime, "drmSessionAcquired", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception error) {
        r(eventTime, "drmSessionManagerError", error);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        n(eventTime, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int droppedFrames, long elapsedMs) {
        o(eventTime, "droppedFrames", Integer.toString(droppedFrames));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
        com.google.android.exoplayer2.analytics.a.C(this, player, events);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean isLoading) {
        o(eventTime, "loading", Boolean.toString(isLoading));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean isPlaying) {
        o(eventTime, "isPlaying", Boolean.toString(isPlaying));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        r(eventTime, "loadError", error);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.a.J(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.K(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, @Nullable MediaItem mediaItem, int reason) {
        String strD = d(eventTime);
        String strE = e(reason);
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 21 + String.valueOf(strE).length());
        sb.append("mediaItem [");
        sb.append(strD);
        sb.append(", reason=");
        sb.append(strE);
        sb.append("]");
        logd(sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.analytics.a.M(this, eventTime, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        String strValueOf = String.valueOf(d(eventTime));
        logd(strValueOf.length() != 0 ? "metadata [".concat(strValueOf) : new String("metadata ["));
        s(metadata, "  ");
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean playWhenReady, int reason) {
        String strF = f(reason);
        StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 7);
        sb.append(playWhenReady);
        sb.append(", ");
        sb.append(strF);
        o(eventTime, "playWhenReady", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        o(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int state) {
        o(eventTime, "state", i(state));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int playbackSuppressionReason) {
        o(eventTime, "playbackSuppressionReason", g(playbackSuppressionReason));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException error) {
        q(eventTime, "playerFailed", error);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.T(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        com.google.android.exoplayer2.analytics.a.U(this, eventTime, z, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.analytics.a.V(this, eventTime, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.W(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(b(reason));
        sb.append(", PositionInfo:old [");
        sb.append("window=");
        sb.append(oldPosition.windowIndex);
        sb.append(", period=");
        sb.append(oldPosition.periodIndex);
        sb.append(", pos=");
        sb.append(oldPosition.positionMs);
        if (oldPosition.adGroupIndex != -1) {
            sb.append(", contentPos=");
            sb.append(oldPosition.contentPositionMs);
            sb.append(", adGroup=");
            sb.append(oldPosition.adGroupIndex);
            sb.append(", ad=");
            sb.append(oldPosition.adIndexInAdGroup);
        }
        sb.append("], PositionInfo:new [");
        sb.append("window=");
        sb.append(newPosition.windowIndex);
        sb.append(", period=");
        sb.append(newPosition.periodIndex);
        sb.append(", pos=");
        sb.append(newPosition.positionMs);
        if (newPosition.adGroupIndex != -1) {
            sb.append(", contentPos=");
            sb.append(newPosition.contentPositionMs);
            sb.append(", adGroup=");
            sb.append(newPosition.adGroupIndex);
            sb.append(", ad=");
            sb.append(newPosition.adIndexInAdGroup);
        }
        sb.append("]");
        o(eventTime, "positionDiscontinuity", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object output, long renderTimeMs) {
        o(eventTime, "renderedFirstFrame", String.valueOf(output));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int repeatMode) {
        o(eventTime, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, h(repeatMode));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.a.a0(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.a.b0(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.c0(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.d0(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean shuffleModeEnabled) {
        o(eventTime, "shuffleModeEnabled", Boolean.toString(shuffleModeEnabled));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean skipSilenceEnabled) {
        o(eventTime, "skipSilenceEnabled", Boolean.toString(skipSilenceEnabled));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
        com.google.android.exoplayer2.analytics.a.g0(this, eventTime, list);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int width, int height) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(width);
        sb.append(", ");
        sb.append(height);
        o(eventTime, "surfaceSize", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int reason) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        String strD = d(eventTime);
        String strK = k(reason);
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 69 + String.valueOf(strK).length());
        sb.append("timeline [");
        sb.append(strD);
        sb.append(", periodCount=");
        sb.append(periodCount);
        sb.append(", windowCount=");
        sb.append(windowCount);
        sb.append(", reason=");
        sb.append(strK);
        logd(sb.toString());
        for (int i = 0; i < Math.min(periodCount, 3); i++) {
            eventTime.timeline.getPeriod(i, this.d);
            String strJ = j(this.d.getDurationMs());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJ).length() + 11);
            sb2.append("  period [");
            sb2.append(strJ);
            sb2.append("]");
            logd(sb2.toString());
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i2 = 0; i2 < Math.min(windowCount, 3); i2++) {
            eventTime.timeline.getWindow(i2, this.c);
            String strJ2 = j(this.c.getDurationMs());
            Timeline.Window window = this.c;
            boolean z = window.isSeekable;
            boolean z2 = window.isDynamic;
            StringBuilder sb3 = new StringBuilder(String.valueOf(strJ2).length() + 42);
            sb3.append("  window [");
            sb3.append(strJ2);
            sb3.append(", seekable=");
            sb3.append(z);
            sb3.append(", dynamic=");
            sb3.append(z2);
            sb3.append("]");
            logd(sb3.toString());
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
        MappingTrackSelector mappingTrackSelector = this.a;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = mappingTrackSelector != null ? mappingTrackSelector.getCurrentMappedTrackInfo() : null;
        if (currentMappedTrackInfo == null) {
            o(eventTime, "tracks", "[]");
            return;
        }
        String strValueOf = String.valueOf(d(eventTime));
        logd(strValueOf.length() != 0 ? "tracks [".concat(strValueOf) : new String("tracks ["));
        int rendererCount = currentMappedTrackInfo.getRendererCount();
        int i = 0;
        while (true) {
            String str = "    Group:";
            String str2 = " [";
            if (i >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups2 = currentMappedTrackInfo.getTrackGroups(i);
            TrackSelection trackSelection = trackSelections.get(i);
            int i2 = rendererCount;
            if (trackGroups2.length == 0) {
                String rendererName = currentMappedTrackInfo.getRendererName(i);
                StringBuilder sb = new StringBuilder(String.valueOf(rendererName).length() + 5);
                sb.append("  ");
                sb.append(rendererName);
                sb.append(" []");
                logd(sb.toString());
            } else {
                String rendererName2 = currentMappedTrackInfo.getRendererName(i);
                StringBuilder sb2 = new StringBuilder(String.valueOf(rendererName2).length() + 4);
                sb2.append("  ");
                sb2.append(rendererName2);
                sb2.append(" [");
                logd(sb2.toString());
                int i3 = 0;
                while (i3 < trackGroups2.length) {
                    TrackGroup trackGroup = trackGroups2.get(i3);
                    TrackGroupArray trackGroupArray = trackGroups2;
                    String strA = a(trackGroup.length, currentMappedTrackInfo.getAdaptiveSupport(i, i3, false));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strA).length() + 44);
                    sb3.append(str);
                    sb3.append(i3);
                    sb3.append(", adaptive_supported=");
                    sb3.append(strA);
                    sb3.append(str2);
                    logd(sb3.toString());
                    int i4 = 0;
                    while (i4 < trackGroup.length) {
                        String strL = l(trackSelection, trackGroup, i4);
                        String formatSupportString = C.getFormatSupportString(currentMappedTrackInfo.getTrackSupport(i, i3, i4));
                        TrackGroup trackGroup2 = trackGroup;
                        String logString = Format.toLogString(trackGroup.getFormat(i4));
                        String str3 = str;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(strL).length() + 38 + String.valueOf(logString).length() + String.valueOf(formatSupportString).length());
                        sb4.append("      ");
                        sb4.append(strL);
                        sb4.append(" Track:");
                        sb4.append(i4);
                        sb4.append(", ");
                        sb4.append(logString);
                        sb4.append(", supported=");
                        sb4.append(formatSupportString);
                        logd(sb4.toString());
                        i4++;
                        str = str3;
                        trackGroup = trackGroup2;
                        str2 = str2;
                    }
                    logd("    ]");
                    i3++;
                    trackGroups2 = trackGroupArray;
                }
                if (trackSelection != null) {
                    for (int i5 = 0; i5 < trackSelection.length(); i5++) {
                        Metadata metadata = trackSelection.getFormat(i5).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            s(metadata, "      ");
                            logd("    ]");
                            break;
                        }
                    }
                }
                logd("  ]");
            }
            i++;
            rendererCount = i2;
        }
        String str4 = "    Group:";
        String str5 = " [";
        TrackGroupArray unmappedTrackGroups = currentMappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Unmapped [");
            int i6 = 0;
            while (i6 < unmappedTrackGroups.length) {
                StringBuilder sb5 = new StringBuilder(23);
                String str6 = str4;
                sb5.append(str6);
                sb5.append(i6);
                String str7 = str5;
                sb5.append(str7);
                logd(sb5.toString());
                TrackGroup trackGroup3 = unmappedTrackGroups.get(i6);
                int i7 = 0;
                while (i7 < trackGroup3.length) {
                    String strM = m(false);
                    String formatSupportString2 = C.getFormatSupportString(0);
                    String logString2 = Format.toLogString(trackGroup3.getFormat(i7));
                    String str8 = str6;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(strM).length() + 38 + String.valueOf(logString2).length() + String.valueOf(formatSupportString2).length());
                    sb6.append("      ");
                    sb6.append(strM);
                    sb6.append(" Track:");
                    sb6.append(i7);
                    sb6.append(", ");
                    sb6.append(logString2);
                    sb6.append(", supported=");
                    sb6.append(formatSupportString2);
                    logd(sb6.toString());
                    i7++;
                    unmappedTrackGroups = unmappedTrackGroups;
                    str6 = str8;
                }
                str4 = str6;
                logd("    ]");
                i6++;
                str5 = str7;
            }
            logd("  ]");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        o(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        com.google.android.exoplayer2.analytics.a.l0(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String decoderName, long initializationDurationMs) {
        o(eventTime, "videoDecoderInitialized", decoderName);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        com.google.android.exoplayer2.analytics.a.n0(this, eventTime, str, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String decoderName) {
        o(eventTime, "videoDecoderReleased", decoderName);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        n(eventTime, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        n(eventTime, "videoEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
        com.google.android.exoplayer2.analytics.a.r0(this, eventTime, j, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        com.google.android.exoplayer2.analytics.a.s0(this, eventTime, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        o(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f2) {
        com.google.android.exoplayer2.analytics.a.u0(this, eventTime, i, i2, i3, f2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        int i = videoSize.width;
        int i2 = videoSize.height;
        StringBuilder sb = new StringBuilder(24);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        o(eventTime, QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float volume) {
        o(eventTime, "volume", Float.toString(volume));
    }

    public EventLogger(@Nullable MappingTrackSelector trackSelector, String tag) {
        this.a = trackSelector;
        this.b = tag;
        this.c = new Timeline.Window();
        this.d = new Timeline.Period();
        this.e = android.os.SystemClock.elapsedRealtime();
    }
}
