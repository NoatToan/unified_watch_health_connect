package com.huami.watch.companion.ecg.media;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0016J,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006J.\u0010\u000f\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rJ\u001c\u0010\u000f\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006J\u0006\u0010\u0010\u001a\u00020\bR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0012¨\u0006'"}, d2 = {"Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "Lkotlin/Function1;", "", "", "durationCallback", "setUrl", "", "callback", "Lkotlin/Function0;", "errorCallback", "play", Command.STOP, "a", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "b", "Lkotlin/jvm/functions/Function1;", "mCallback", "c", "Lkotlin/jvm/functions/Function0;", "mErrorCallback", GoogleApiAvailabilityLight.a, "isDurationSet", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "e", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "exoPlayer", "f", "isRetry", "<init>", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class ExoMediaPlayHelper {

    @NotNull
    private static final String g = "ExoMediaPlayHelper";
    private static final long h = 104857600;
    private static final long i = 5242880;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> mCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> mErrorCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isDurationSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SimpleExoPlayer exoPlayer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isRetry;

    public ExoMediaPlayHelper() {
        this(false, 1, null);
    }

    public ExoMediaPlayHelper(boolean z) {
        this.isLoop = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(ExoMediaPlayHelper exoMediaPlayHelper, Function1 function1, Function0 function0, int i2, Object obj) throws Exception {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        exoMediaPlayHelper.play(function1, function0);
    }

    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public final boolean getIsLoop() {
        return this.isLoop;
    }

    public final void play(@Nullable Function1<? super Boolean, Unit> callback, @Nullable Function0<Unit> errorCallback) throws Exception {
        if (this.exoPlayer == null) {
            throw new Exception("Must call setUrl before play");
        }
        this.mErrorCallback = errorCallback;
        this.mCallback = callback;
        if (callback != null) {
            callback.invoke(Boolean.TRUE);
        }
        if (this.isRetry) {
            this.exoPlayer.retry();
        } else {
            this.exoPlayer.setPlayWhenReady(true);
        }
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setUrl(@NotNull Context context, @NotNull final String url, @Nullable final Function1<? super Long, Unit> durationCallback) {
        this.isDurationSet = false;
        this.isRetry = false;
        stop();
        Log.d(g, Intrinsics.stringPlus("Prepare play: ", url), new Object[0]);
        this.exoPlayer = new SimpleExoPlayer.Builder(context).build();
        this.exoPlayer.setMediaSource(new ProgressiveMediaSource.Factory(new ExoCacheSource(context, h, 5242880L)).createMediaSource(new MediaItem.Builder().setUri(Uri.parse(url)).build()));
        this.exoPlayer.prepare();
        this.exoPlayer.setRepeatMode(this.isLoop ? 1 : 0);
        this.exoPlayer.addListener(new Player.EventListener() { // from class: com.huami.watch.companion.ecg.media.ExoMediaPlayHelper.setUrl.1
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
            public /* synthetic */ void onLoadingChanged(boolean z) {
                m0.e(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i2) {
                m0.f(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
                m0.g(this, mediaItem, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                m0.h(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
                m0.i(this, z, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                m0.j(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaybackStateChanged(int i2) {
                m0.k(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
                m0.l(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public void onPlayerError(@NotNull PlaybackException error) {
                Log.e(ExoMediaPlayHelper.g, "Play " + url + " error", error, new Object[0]);
                Function0 function0 = this.mErrorCallback;
                if (function0 != null) {
                    function0.invoke();
                }
                Function1 function1 = this.mCallback;
                if (function1 == null) {
                    return;
                }
                function1.invoke(Boolean.FALSE);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                m0.n(this, playbackException);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                if (playbackState == 4) {
                    Function1 function1 = this.mCallback;
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                    this.isRetry = true;
                }
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                m0.p(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPositionDiscontinuity(int i2) {
                m0.q(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
                m0.r(this, positionInfo, positionInfo2, i2);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onRepeatModeChanged(int i2) {
                m0.s(this, i2);
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
            public void onTimelineChanged(@NotNull Timeline timeline, int reason) {
                long duration = this.exoPlayer.getDuration();
                Log.d(ExoMediaPlayHelper.g, Intrinsics.stringPlus("Timeline Duration:", Long.valueOf(duration)), new Object[0]);
                if (duration <= 0 || this.isDurationSet) {
                    return;
                }
                Function1<Long, Unit> function1 = durationCallback;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(this.exoPlayer.getDuration()));
                }
                this.isDurationSet = true;
                Function1 function2 = this.mCallback;
                if (function2 == null) {
                    return;
                }
                function2.invoke(Boolean.TRUE);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                m0.z(this, trackGroupArray, trackSelectionArray);
            }
        });
    }

    public final void stop() {
        Function1<? super Boolean, Unit> function1 = this.mCallback;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
            this.mCallback = null;
        }
        this.mErrorCallback = null;
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.stop(true);
        simpleExoPlayer.release();
        this.exoPlayer = null;
    }

    public /* synthetic */ ExoMediaPlayHelper(boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z);
    }

    public final void play(@Nullable Function1<? super Boolean, Unit> callback) throws Exception {
        play(callback, null);
    }
}
