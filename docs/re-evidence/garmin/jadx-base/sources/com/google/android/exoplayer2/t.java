package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class t implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53088b;

    public /* synthetic */ t(int i14, int i15) {
        this.f53087a = i15;
        this.f53088b = i14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f53087a) {
            case 0:
                ((Player.Listener) obj).onRepeatModeChanged(this.f53088b);
                break;
            default:
                ((Player.Listener) obj).onAudioSessionIdChanged(this.f53088b);
                break;
        }
    }
}
