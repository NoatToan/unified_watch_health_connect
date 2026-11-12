package com.xiaomi.hm.health.training.ui.fragment;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment$playerEventListener$1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$playerEventListener$1", "Lcom/google/android/exoplayer2/Player$EventListener;", "", "playbackState", "", "b", "", "isLoading", "", "onLoadingChanged", "playWhenReady", "onPlayerStateChanged", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCoursePlayFragment$playerEventListener$1 implements Player.EventListener {
    public final /* synthetic */ FeaturedCoursePlayFragment a;

    public FeaturedCoursePlayFragment$playerEventListener$1(FeaturedCoursePlayFragment featuredCoursePlayFragment) {
        this.a = featuredCoursePlayFragment;
    }

    private final String b(int playbackState) {
        if (playbackState == 1) {
            return "IDLE";
        }
        if (playbackState == 2) {
            return "BUFFERING";
        }
        if (playbackState != 3) {
            return playbackState != 4 ? "UNKNOWN" : "ENDED";
        }
        return "READY";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(int i, FeaturedCoursePlayFragment$playerEventListener$1 featuredCoursePlayFragment$playerEventListener$1, boolean z) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.CHINA, "onPlayerStateChanged -> playbackState: %d/%s, playWhenReady: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), featuredCoursePlayFragment$playerEventListener$1.b(i), Boolean.valueOf(z)}, 3));
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        m0.a(this, commands);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        m0.b(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        m0.c(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        m0.d(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean isLoading) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
        m0.f(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        m0.g(this, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        m0.h(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        m0.i(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        m0.j(this, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlaybackStateChanged(int i) {
        m0.k(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        m0.l(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        m0.m(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        m0.n(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(final boolean playWhenReady, final int playbackState) {
        Loggers.getLogger().v("Train-FeaturedCoursePlayFragment", new Supplier() { // from class: v32
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCoursePlayFragment$playerEventListener$1.c(playbackState, this, playWhenReady);
            }
        });
        if (playbackState == 3 && this.a.player.getDuration() > 0) {
            this.a.P().setPlayedVideoDuration(this.a.player.getDuration());
        }
        if (playbackState == 4 && playWhenReady) {
            this.a.J();
        }
        if (playbackState == 2) {
            ViewHolder viewHolder = this.a.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getBufferingProgress().setVisibility(0);
        } else {
            ViewHolder viewHolder2 = this.a.viewHolder;
            Objects.requireNonNull(viewHolder2);
            viewHolder2.getBufferingProgress().setVisibility(8);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        m0.p(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPositionDiscontinuity(int i) {
        m0.q(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        m0.r(this, positionInfo, positionInfo2, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onRepeatModeChanged(int i) {
        m0.s(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onSeekBackIncrementChanged(long j) {
        m0.t(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        m0.u(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onSeekProcessed() {
        m0.v(this);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        m0.w(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onStaticMetadataChanged(List list) {
        m0.x(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        m0.y(this, timeline, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        m0.z(this, trackGroupArray, trackSelectionArray);
    }
}
