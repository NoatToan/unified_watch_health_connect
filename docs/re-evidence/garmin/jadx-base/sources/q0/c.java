package q0;

import android.util.Size;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f141971a = new Size(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f141972b = new Size(320, PsExtractor.VIDEO_STREAM_MASK);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f141973c = new Size(640, 480);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Size f141974d = new Size(720, 480);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f141975e = new Size(1280, 720);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f141976f = new Size(1920, 1080);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f141977g = new Size(1920, DateTimeConstants.MINUTES_PER_DAY);

    static {
        new Size(2560, DateTimeConstants.MINUTES_PER_DAY);
        new Size(3840, 2160);
    }

    private c() {
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
