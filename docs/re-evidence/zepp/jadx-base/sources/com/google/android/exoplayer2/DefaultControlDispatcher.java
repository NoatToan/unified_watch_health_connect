package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class DefaultControlDispatcher implements ControlDispatcher {
    private final long a;
    private final long b;
    private final boolean c;

    public DefaultControlDispatcher() {
        this.b = C.TIME_UNSET;
        this.a = C.TIME_UNSET;
        this.c = false;
    }

    private static void a(Player player, long offsetMs) {
        long currentPosition = player.getCurrentPosition() + offsetMs;
        long duration = player.getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        player.seekTo(Math.max(currentPosition, 0L));
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchFastForward(Player player) {
        if (!this.c) {
            player.seekForward();
            return true;
        }
        if (!isFastForwardEnabled() || !player.isCurrentWindowSeekable()) {
            return true;
        }
        a(player, this.b);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchNext(Player player) {
        player.seekToNext();
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchPrepare(Player player) {
        player.prepare();
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchPrevious(Player player) {
        player.seekToPrevious();
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchRewind(Player player) {
        if (!this.c) {
            player.seekBack();
            return true;
        }
        if (!isRewindEnabled() || !player.isCurrentWindowSeekable()) {
            return true;
        }
        a(player, -this.a);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int windowIndex, long positionMs) {
        player.seekTo(windowIndex, positionMs);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean playWhenReady) {
        player.setPlayWhenReady(playWhenReady);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlaybackParameters(Player player, PlaybackParameters playbackParameters) {
        player.setPlaybackParameters(playbackParameters);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int repeatMode) {
        player.setRepeatMode(repeatMode);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean shuffleModeEnabled) {
        player.setShuffleModeEnabled(shuffleModeEnabled);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean reset) {
        player.stop(reset);
        return true;
    }

    public long getFastForwardIncrementMs(Player player) {
        return this.c ? this.b : player.getSeekForwardIncrement();
    }

    public long getRewindIncrementMs(Player player) {
        return this.c ? this.a : player.getSeekBackIncrement();
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean isFastForwardEnabled() {
        return !this.c || this.b > 0;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean isRewindEnabled() {
        return !this.c || this.a > 0;
    }

    public DefaultControlDispatcher(long fastForwardIncrementMs, long rewindIncrementMs) {
        this.b = fastForwardIncrementMs;
        this.a = rewindIncrementMs;
        this.c = true;
    }
}
