package com.google.android.exoplayer2;

import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class r implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53047b;

    public /* synthetic */ r(Object obj, int i14) {
        this.f53046a = i14;
        this.f53047b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f53046a) {
            case 0:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) this.f53047b);
                break;
            case 1:
                ((Player.Listener) obj).onAudioAttributesChanged((AudioAttributes) this.f53047b);
                break;
            case 2:
                ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) this.f53047b);
                break;
            case 3:
                ((Player.Listener) obj).onCues((List) this.f53047b);
                break;
            case 4:
                ((ExoPlayerImpl.ComponentListener) this.f53047b).lambda$onMetadata$3((Player.Listener) obj);
                break;
            case 5:
                ((Player.Listener) obj).onMetadata((Metadata) this.f53047b);
                break;
            case 6:
                ((Player.Listener) obj).onDeviceInfoChanged((DeviceInfo) this.f53047b);
                break;
            default:
                ((Player.Listener) obj).onVideoSizeChanged((VideoSize) this.f53047b);
                break;
        }
    }
}
