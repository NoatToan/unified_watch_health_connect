package defpackage;

import android.media.projection.MediaProjection;
import android.net.Uri;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder;

/* JADX INFO: loaded from: classes10.dex */
public class jfy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38561c = false;
    private long e = 0;
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38560a = true;

    public jfy e(long j) {
        this.e = j;
        return this;
    }

    public jfy c(boolean z) {
        this.f38561c = z;
        return this;
    }

    public TrackRecorder b(MediaProjection mediaProjection, String str, boolean z, boolean z2) {
        TrackRecorder trackRecorderB;
        if (this.d) {
            trackRecorderB = new jft(mediaProjection, str).b(this.e).c(this.f38561c);
        } else {
            trackRecorderB = new jgc(mediaProjection, str, this.e).b(this.f38561c);
        }
        return this.f38560a ? trackRecorderB.reviseVideoResolution(z, z2) : trackRecorderB;
    }

    public TrackRecorder b(MediaProjection mediaProjection, Uri uri, boolean z, boolean z2) {
        TrackRecorder trackRecorderB;
        if (this.d) {
            trackRecorderB = new jft(mediaProjection, uri).b(this.e).c(this.f38561c);
        } else {
            trackRecorderB = new jgc(mediaProjection, uri, this.e).b(this.f38561c);
        }
        return this.f38560a ? trackRecorderB.reviseVideoResolution(z, z2) : trackRecorderB;
    }
}
