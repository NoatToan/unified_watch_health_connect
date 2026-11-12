package ka;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import j20.x;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f103682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f103684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f103685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f103686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f103687f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f103688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f103689b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f103690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f103691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f103692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f103693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f103694g;

        public a(AudioTrack audioTrack) {
            this.f103688a = audioTrack;
        }
    }

    public g(AudioTrack audioTrack) {
        this.f103682a = new a(audioTrack);
        a();
    }

    public final void a() {
        if (this.f103682a != null) {
            b(0);
        }
    }

    public final void b(int i14) {
        this.f103683b = i14;
        if (i14 == 0) {
            this.f103686e = 0L;
            this.f103687f = -1L;
            this.f103684c = System.nanoTime() / 1000;
            this.f103685d = AbstractComponentTracker.LINGERING_TIMEOUT;
            return;
        }
        if (i14 == 1) {
            this.f103685d = AbstractComponentTracker.LINGERING_TIMEOUT;
            return;
        }
        if (i14 == 2 || i14 == 3) {
            this.f103685d = 10000000L;
        } else if (i14 == 4) {
            this.f103685d = 500000L;
        } else {
            x.h();
        }
    }
}
