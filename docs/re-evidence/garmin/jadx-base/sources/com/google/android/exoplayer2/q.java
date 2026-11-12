package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class q implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f53045b;

    public /* synthetic */ q(boolean z14, int i14) {
        this.f53044a = i14;
        this.f53045b = z14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f53044a) {
            case 0:
                ((Player.Listener) obj).onShuffleModeEnabledChanged(this.f53045b);
                break;
            case 1:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f53045b);
                break;
            default:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f53045b);
                break;
        }
    }
}
