package androidx.tracing;

import android.media.AudioProfile;
import android.media.MediaCodecInfo;
import android.media.MediaDrm;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.SurfaceControl;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Trace$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ AudioProfile m(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m717m(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m718m(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaParser$InputReader m720m(Object obj) {
        return (MediaParser$InputReader) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m721m(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PlaybackStateEvent.Builder m722m() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder m(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ SurfaceControl.Transaction m723m() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ SurfaceSyncGroup m(String str) {
        return new SurfaceSyncGroup(str);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m726m() {
    }
}
