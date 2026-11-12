package bb;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f17146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17147d;

    public static class a implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f17148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f17151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f17153f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f17154g;

        public a(d dVar, long j8, long j14, long j15, long j16, long j17, long j18) {
            this.f17148a = dVar;
            this.f17149b = j8;
            this.f17150c = j14;
            this.f17151d = j15;
            this.f17152e = j16;
            this.f17153f = j17;
            this.f17154g = j18;
        }

        @Override // bb.g0
        public final long getDurationUs() {
            return this.f17149b;
        }

        @Override // bb.g0
        public final g0.a getSeekPoints(long j8) {
            return new g0.a(new h0(j8, c.a(this.f17148a.timeUsToTargetTime(j8), this.f17150c, this.f17151d, this.f17152e, this.f17153f, this.f17154g)));
        }

        @Override // bb.g0
        public final boolean isSeekable() {
            return true;
        }
    }

    public static final class b implements d {
        @Override // bb.e.d
        public final long timeUsToTargetTime(long j8) {
            return j8;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f17158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f17160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f17161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f17162h;

        public c(long j8, long j14, long j15, long j16, long j17, long j18, long j19) {
            this.f17155a = j8;
            this.f17156b = j14;
            this.f17158d = j15;
            this.f17159e = j16;
            this.f17160f = j17;
            this.f17161g = j18;
            this.f17157c = j19;
            this.f17162h = a(j14, j15, j16, j17, j18, j19);
        }

        public static long a(long j8, long j14, long j15, long j16, long j17, long j18) {
            if (j16 + 1 >= j17 || j14 + 1 >= j15) {
                return j16;
            }
            long j19 = (long) ((j8 - j14) * ((j17 - j16) / (j15 - j14)));
            return fa.z.j(((j19 + j16) - j18) - (j19 / 20), j16, j17 - 1);
        }
    }

    public interface d {
        long timeUsToTargetTime(long j8);
    }

    /* JADX INFO: renamed from: bb.e$e, reason: collision with other inner class name */
    public static final class C0241e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0241e f17163d = new C0241e(-3, C.TIME_UNSET, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17166c;

        private C0241e(int i14, long j8, long j14) {
            this.f17164a = i14;
            this.f17165b = j8;
            this.f17166c = j14;
        }

        public static C0241e a(long j8, long j14) {
            return new C0241e(-1, j8, j14);
        }

        public static C0241e b(long j8) {
            return new C0241e(0, C.TIME_UNSET, j8);
        }

        public static C0241e c(long j8, long j14) {
            return new C0241e(-2, j8, j14);
        }
    }

    public interface f {
        C0241e a(o oVar, long j8);

        default void onSeekFinished() {
        }
    }

    public e(d dVar, f fVar, long j8, long j14, long j15, long j16, long j17, long j18, int i14) {
        this.f17145b = fVar;
        this.f17147d = i14;
        this.f17144a = new a(dVar, j8, j14, j15, j16, j17, j18);
    }

    public static int b(o oVar, long j8, f0 f0Var) {
        if (j8 == oVar.getPosition()) {
            return 0;
        }
        f0Var.f17167a = j8;
        return 1;
    }

    public final int a(o oVar, f0 f0Var) {
        while (true) {
            c cVar = this.f17146c;
            fa.a.f(cVar);
            long j8 = cVar.f17160f;
            long j14 = cVar.f17161g;
            long j15 = cVar.f17162h;
            long j16 = j14 - j8;
            long j17 = this.f17147d;
            f fVar = this.f17145b;
            if (j16 <= j17) {
                this.f17146c = null;
                fVar.onSeekFinished();
                return b(oVar, j8, f0Var);
            }
            long position = j15 - oVar.getPosition();
            if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                return b(oVar, j15, f0Var);
            }
            oVar.skipFully((int) position);
            oVar.resetPeekPosition();
            C0241e c0241eA = fVar.a(oVar, cVar.f17156b);
            int i14 = c0241eA.f17164a;
            long j18 = c0241eA.f17165b;
            long j19 = c0241eA.f17166c;
            if (i14 == -3) {
                this.f17146c = null;
                fVar.onSeekFinished();
                return b(oVar, j15, f0Var);
            }
            if (i14 == -2) {
                cVar.f17158d = j18;
                cVar.f17160f = j19;
                cVar.f17162h = c.a(cVar.f17156b, j18, cVar.f17159e, j19, cVar.f17161g, cVar.f17157c);
            } else {
                if (i14 != -1) {
                    if (i14 != 0) {
                        vb.h.z("Invalid case");
                        return 0;
                    }
                    long position2 = j19 - oVar.getPosition();
                    if (position2 >= 0 && position2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        oVar.skipFully((int) position2);
                    }
                    this.f17146c = null;
                    fVar.onSeekFinished();
                    return b(oVar, j19, f0Var);
                }
                cVar.f17159e = j18;
                cVar.f17161g = j19;
                cVar.f17162h = c.a(cVar.f17156b, cVar.f17158d, j18, cVar.f17160f, j19, cVar.f17157c);
            }
        }
    }

    public final void c(long j8) {
        c cVar = this.f17146c;
        if (cVar == null || cVar.f17155a != j8) {
            a aVar = this.f17144a;
            this.f17146c = new c(j8, aVar.f17148a.timeUsToTargetTime(j8), aVar.f17150c, aVar.f17151d, aVar.f17152e, aVar.f17153f, aVar.f17154g);
        }
    }
}
