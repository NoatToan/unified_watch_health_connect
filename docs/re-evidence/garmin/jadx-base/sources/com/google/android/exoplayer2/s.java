package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class s implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExoPlayerImpl f53049b;

    public /* synthetic */ s(ExoPlayerImpl exoPlayerImpl, int i14) {
        this.f53048a = i14;
        this.f53049b = exoPlayerImpl;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f53048a) {
            case 0:
                this.f53049b.lambda$setPlaylistMetadata$7((Player.Listener) obj);
                break;
            default:
                this.f53049b.lambda$updateAvailableCommands$27((Player.Listener) obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f53049b.lambda$new$2(playbackInfoUpdate);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        this.f53049b.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
