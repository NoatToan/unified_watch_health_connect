package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import androidx.core.view.j;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.v;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class DebugTextViewHelper implements Player.Listener, Runnable {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        Assertions.checkArgument(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        int i14 = decoderCounters.skippedInputBufferCount;
        int i15 = decoderCounters.skippedOutputBufferCount;
        int i16 = decoderCounters.renderedOutputBufferCount;
        int i17 = decoderCounters.droppedBufferCount;
        int i18 = decoderCounters.maxConsecutiveDroppedBufferCount;
        int i19 = decoderCounters.droppedToKeyframeCount;
        StringBuilder sb3 = new StringBuilder(93);
        sb3.append(" sib:");
        sb3.append(i14);
        sb3.append(" sb:");
        sb3.append(i15);
        j.m(i16, i17, " rb:", " db:", sb3);
        sb3.append(" mcdb:");
        sb3.append(i18);
        sb3.append(" dk:");
        sb3.append(i19);
        return sb3.toString();
    }

    private static String getPixelAspectRatioString(float f14) {
        if (f14 == -1.0f || f14 == 1.0f) {
            return "";
        }
        String str = String.format(Locale.US, "%.02f", Float.valueOf(f14));
        return str.length() != 0 ? " par:".concat(str) : new String(" par:");
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j8, int i14) {
        return i14 == 0 ? "N/A" : String.valueOf((long) (j8 / ((double) i14)));
    }

    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        String str = audioFormat.sampleMimeType;
        String str2 = audioFormat.f52873id;
        int i14 = audioFormat.sampleRate;
        int i15 = audioFormat.channelCount;
        String decoderCountersBufferCountString = getDecoderCountersBufferCountString(audioDecoderCounters);
        StringBuilder sbD = v.d(v.a(v.a(v.a(36, str), str2), decoderCountersBufferCountString), "\n", str, "(id:", str2);
        j.m(i14, i15, " hz:", " ch:", sbD);
        return am.j.o(decoderCountersBufferCountString, ")", sbD);
    }

    public String getDebugString() {
        String playerStateString = getPlayerStateString();
        String videoString = getVideoString();
        String audioString = getAudioString();
        return v.c(v.a(v.a(String.valueOf(playerStateString).length(), videoString), audioString), playerStateString, videoString, audioString);
    }

    public String getPlayerStateString() {
        String str;
        int playbackState = this.player.getPlaybackState();
        if (playbackState == 1) {
            str = "idle";
        } else if (playbackState == 2) {
            str = "buffering";
        } else if (playbackState != 3) {
            str = playbackState != 4 ? PrivacyUpdateRequestError.UNKNOWN : "ended";
        } else {
            str = "ready";
        }
        return "playWhenReady:" + this.player.getPlayWhenReady() + " playbackState:" + str + " item:" + this.player.getCurrentMediaItemIndex();
    }

    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        String str = videoFormat.sampleMimeType;
        String str2 = videoFormat.f52873id;
        int i14 = videoFormat.width;
        int i15 = videoFormat.height;
        String pixelAspectRatioString = getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio);
        String decoderCountersBufferCountString = getDecoderCountersBufferCountString(videoDecoderCounters);
        String videoFrameProcessingOffsetAverageString = getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount);
        StringBuilder sbD = v.d(v.a(v.a(v.a(v.a(v.a(39, str), str2), pixelAspectRatioString), decoderCountersBufferCountString), videoFrameProcessingOffsetAverageString), "\n", str, "(id:", str2);
        j.m(i14, i15, " r:", "x", sbD);
        sn.a.t(sbD, pixelAspectRatioString, decoderCountersBufferCountString, " vfpo: ", videoFrameProcessingOffsetAverageString);
        sbD.append(")");
        return sbD.toString();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z14, int i14) {
        updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(int i14) {
        updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i14) {
        updateAndPost();
    }

    @Override // java.lang.Runnable
    public final void run() {
        updateAndPost();
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this);
            this.textView.removeCallbacks(this);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this);
        this.textView.postDelayed(this, 1000L);
    }
}
