package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class v implements ListenerSet.Event, Bundleable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53136a;

    public /* synthetic */ v(int i14) {
        this.f53136a = i14;
    }

    public static int a(int i14, String str) {
        return String.valueOf(str).length() + i14;
    }

    public static String b(int i14, int i15, String str) {
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(str);
        sb3.append(i15);
        return sb3.toString();
    }

    public static String c(int i14, String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        return sb3.toString();
    }

    public static StringBuilder d(int i14, String str, String str2, String str3, String str4) {
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        return sb3;
    }

    public static void e(int i14, int i15, String str, String str2) {
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(str);
        sb3.append(i15);
        Log.w(str2, sb3.toString());
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.f53136a) {
            case 3:
                return DeviceInfo.lambda$static$0(bundle);
            case 4:
                return ExoPlaybackException.a(bundle);
            case 5:
            case 6:
            case 7:
            case 8:
            case 21:
            default:
                return TracksInfo.TrackGroupInfo.lambda$static$0(bundle);
            case 9:
                return Format.fromBundle(bundle);
            case 10:
                return HeartRating.fromBundle(bundle);
            case 11:
                return MediaItem.fromBundle(bundle);
            case 12:
                return MediaItem.ClippingConfiguration.lambda$static$0(bundle);
            case 13:
                return MediaItem.LiveConfiguration.lambda$static$0(bundle);
            case 14:
                return MediaMetadata.fromBundle(bundle);
            case 15:
                return PercentageRating.fromBundle(bundle);
            case 16:
                return new PlaybackException(bundle);
            case 17:
                return PlaybackParameters.lambda$static$0(bundle);
            case 18:
                return Player.Commands.fromBundle(bundle);
            case 19:
                return Player.PositionInfo.fromBundle(bundle);
            case 20:
                return Rating.fromBundle(bundle);
            case 22:
                return StarRating.fromBundle(bundle);
            case 23:
                return ThumbRating.fromBundle(bundle);
            case 24:
                return Timeline.fromBundle(bundle);
            case 25:
                return Timeline.Period.fromBundle(bundle);
            case 26:
                return Timeline.Window.fromBundle(bundle);
            case 27:
                return TracksInfo.lambda$static$0(bundle);
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.f53136a) {
            case 0:
                ExoPlayerImpl.lambda$release$5(listener);
                break;
            case 6:
                listener.onSeekProcessed();
                break;
            default:
                listener.onRenderedFirstFrame();
                break;
        }
    }
}
