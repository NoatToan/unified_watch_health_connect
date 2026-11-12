package wb;

import androidx.media3.common.q;
import bb.g0;
import bb.l0;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.C;
import fa.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f183843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f183844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f183845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f183846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f183847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f183848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f183849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f183850i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f183852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f183853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f183854m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f183842a = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f183851j = new b();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f183855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public wb.b.a f183856b;
    }

    public static final class c implements f {
        private c() {
        }

        @Override // wb.f
        public final long a(o oVar) {
            return -1L;
        }

        @Override // wb.f
        public final g0 createSeekMap() {
            return new g0.b(C.TIME_UNSET);
        }

        @Override // wb.f
        public final void startSeek(long j8) {
        }
    }

    public void a(long j8) {
        this.f183848g = j8;
    }

    public abstract long b(r rVar);

    public abstract boolean c(r rVar, long j8, b bVar);

    public void d(boolean z14) {
        if (z14) {
            this.f183851j = new b();
            this.f183847f = 0L;
            this.f183849h = 0;
        } else {
            this.f183849h = 1;
        }
        this.f183846e = -1L;
        this.f183848g = 0L;
    }
}
