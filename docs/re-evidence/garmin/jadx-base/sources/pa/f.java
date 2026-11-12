package pa;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<MediaCodec> f136702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f136703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f136704c;

    public interface a {

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final p6.b f136705n0 = new p6.b(3);
    }

    public f(a aVar) {
        this.f136702a = new HashSet<>();
        this.f136703b = aVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f136702a.remove(mediaCodec) || (loudnessCodecController = this.f136704c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public f() {
        this(a.f136705n0);
    }
}
