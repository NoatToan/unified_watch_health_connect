package za;

import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f203156c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f203158e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3791a f203154a = new C3791a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3791a f203155b = new C3791a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f203157d = C.TIME_UNSET;

    /* JADX INFO: renamed from: za.a$a, reason: collision with other inner class name */
    public static final class C3791a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f203159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f203160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f203161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f203162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f203163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f203164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f203165g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f203166h;

        public final boolean a() {
            return this.f203162d > 15 && this.f203166h == 0;
        }

        public final void b(long j8) {
            long j14 = this.f203162d;
            if (j14 == 0) {
                this.f203159a = j8;
            } else if (j14 == 1) {
                long j15 = j8 - this.f203159a;
                this.f203160b = j15;
                this.f203164f = j15;
                this.f203163e = 1L;
            } else {
                long j16 = j8 - this.f203161c;
                int i14 = (int) (j14 % 15);
                long jAbs = Math.abs(j16 - this.f203160b);
                boolean[] zArr = this.f203165g;
                if (jAbs <= 1000000) {
                    this.f203163e++;
                    this.f203164f += j16;
                    if (zArr[i14]) {
                        zArr[i14] = false;
                        this.f203166h--;
                    }
                } else if (!zArr[i14]) {
                    zArr[i14] = true;
                    this.f203166h++;
                }
            }
            this.f203162d++;
            this.f203161c = j8;
        }

        public final void c() {
            this.f203162d = 0L;
            this.f203163e = 0L;
            this.f203164f = 0L;
            this.f203166h = 0;
            Arrays.fill(this.f203165g, false);
        }
    }
}
