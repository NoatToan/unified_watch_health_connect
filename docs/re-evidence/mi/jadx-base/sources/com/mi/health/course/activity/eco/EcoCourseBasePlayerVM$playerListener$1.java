package com.mi.health.course.activity.eco;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.v;
import com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$playerListener$1;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.aop;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.u56;
import defpackage.wrq;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"com/mi/health/course/activity/eco/EcoCourseBasePlayerVM$playerListener$1", "Lcom/google/android/exoplayer2/q$e;", "", "isPlaying", "", "onIsPlayingChanged", "(Z)V", "", "playbackState", "onPlaybackStateChanged", "(I)V", "Lcom/google/android/exoplayer2/source/TrackGroupArray;", "trackGroups", "Laop;", "trackSelections", "onTracksChanged", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;Laop;)V", "Lcom/google/android/exoplayer2/q$f;", "oldPosition", "newPosition", "reason", "onPositionDiscontinuity", "(Lcom/google/android/exoplayer2/q$f;Lcom/google/android/exoplayer2/q$f;I)V", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "error", "onPlayerError", "(Lcom/google/android/exoplayer2/ExoPlaybackException;)V", "", "totalDuration$delegate", "Lkotlin/Lazy;", "getTotalDuration", "()J", FitnessReportKey.totalDuration, "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoCourseBasePlayerVM$playerListener$1 implements q.e {
    final /* synthetic */ EcoCourseBasePlayerVM this$0;

    /* JADX INFO: renamed from: totalDuration$delegate, reason: from kotlin metadata */
    private final Lazy totalDuration;

    public EcoCourseBasePlayerVM$playerListener$1(final EcoCourseBasePlayerVM ecoCourseBasePlayerVM) {
        this.this$0 = ecoCourseBasePlayerVM;
        this.totalDuration = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(EcoCourseBasePlayerVM$playerListener$1.totalDuration_delegate$lambda$0(ecoCourseBasePlayerVM));
            }
        });
    }

    private final long getTotalDuration() {
        return ((Number) this.totalDuration.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long totalDuration_delegate$lambda$0(EcoCourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getPlayer().q();
    }

    @Override // defpackage.jn1
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(nm1 nm1Var) {
        super.onAudioAttributesChanged(nm1Var);
    }

    @Override // defpackage.jn1
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
        super.onAudioSessionIdChanged(i);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q.b bVar) {
        super.onAvailableCommandsChanged(bVar);
    }

    @Override // com.google.android.exoplayer2.q.e
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues(list);
    }

    @Override // defpackage.d96
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(u56 u56Var) {
        super.onDeviceInfoChanged(u56Var);
    }

    @Override // defpackage.d96
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        super.onDeviceVolumeChanged(i, z);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onEvents(q qVar, q.d dVar) {
        super.onEvents(qVar, dVar);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
        super.onIsLoadingChanged(z);
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onIsPlayingChanged(boolean isPlaying) {
        Logger.d("EcoCourseBasePlayerVM", "onIsPlayingChanged: " + isPlaying);
        if (!isPlaying) {
            this.this$0.timerPause();
            return;
        }
        this.this$0.timerStart();
        Function1 function1 = this.this$0.onPlayError;
        if (function1 != null) {
            function1.invoke2(Boolean.FALSE);
        }
    }

    @Override // com.google.android.exoplayer2.q.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
        super.onLoadingChanged(z);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onMediaItemTransition(m mVar, int i) {
        super.onMediaItemTransition(mVar, i);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(n nVar) {
        super.onMediaMetadataChanged(nVar);
    }

    @Override // com.google.android.exoplayer2.q.e, defpackage.stf
    public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
        super.onMetadata(metadata);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        super.onPlayWhenReadyChanged(z, i);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(n0i n0iVar) {
        super.onPlaybackParametersChanged(n0iVar);
    }

    @Override // com.google.android.exoplayer2.q.c
    @SuppressLint({"SwitchIntDef"})
    public void onPlaybackStateChanged(int playbackState) {
        if (playbackState == 2) {
            this.this$0.bufferReason = 3;
        } else if (playbackState == 3) {
            this.this$0.progressFactor = 100.0f / getTotalDuration();
            this.this$0.bufferReason = 3;
        } else if (playbackState == 4) {
            this.this$0.timerCancel();
            this.this$0.setProgress(100);
        }
        Logger.d("EcoCourseBasePlayerVM", "onPlaybackStateChanged: " + playbackState);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        super.onPlaybackSuppressionReasonChanged(i);
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onPlayerError(ExoPlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int i = error.type;
        if (i == 0) {
            Logger.d("EcoCourseBasePlayerVM", "onPlayerError:" + error.getSourceException().getMessage());
        } else if (i == 1) {
            Logger.d("EcoCourseBasePlayerVM", "onPlayerError:" + error.getRendererException().getMessage());
        } else if (i == 2) {
            Logger.d("EcoCourseBasePlayerVM", "onPlayerError:" + error.getUnexpectedException().getMessage());
        }
        Function1 function1 = this.this$0.onPlayError;
        if (function1 != null) {
            function1.invoke2(Boolean.TRUE);
        }
    }

    @Override // com.google.android.exoplayer2.q.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        super.onPlayerStateChanged(z, i);
    }

    @Override // com.google.android.exoplayer2.q.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        super.onPositionDiscontinuity(i);
    }

    @Override // defpackage.erq
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        super.onRepeatModeChanged(i);
    }

    @Override // com.google.android.exoplayer2.q.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
        super.onSeekProcessed();
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        super.onShuffleModeEnabledChanged(z);
    }

    @Override // defpackage.jn1
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        super.onSkipSilenceEnabledChanged(z);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
        super.onStaticMetadataChanged(list);
    }

    @Override // defpackage.erq
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        super.onSurfaceSizeChanged(i, i2);
    }

    @Override // com.google.android.exoplayer2.q.c
    public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, int i) {
        super.onTimelineChanged(vVar, i);
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onTracksChanged(TrackGroupArray trackGroups, aop trackSelections) {
        Intrinsics.checkNotNullParameter(trackGroups, "trackGroups");
        Intrinsics.checkNotNullParameter(trackSelections, "trackSelections");
        this.this$0.bufferReason = 1;
    }

    @Override // defpackage.erq
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
        super.onVideoSizeChanged(i, i2, i3, f);
    }

    @Override // defpackage.jn1
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
        super.onVolumeChanged(f);
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onPositionDiscontinuity(q.f oldPosition, q.f newPosition, int reason) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        this.this$0.bufferReason = 2;
    }

    @Override // com.google.android.exoplayer2.q.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, Object obj, int i) {
        super.onTimelineChanged(vVar, obj, i);
    }

    @Override // defpackage.erq
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(wrq wrqVar) {
        super.onVideoSizeChanged(wrqVar);
    }
}
