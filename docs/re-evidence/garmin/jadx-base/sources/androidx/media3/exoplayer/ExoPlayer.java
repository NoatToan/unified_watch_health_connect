package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.exoplayer2.C;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends androidx.media3.common.z {

    public interface a {
        default void a() {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f8660b = new c(C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8661a;

        public c(long j8) {
            this.f8661a = j8;
        }
    }

    @Override // androidx.media3.common.z
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    ExoPlaybackException getPlayerError();

    void f(androidx.media3.exoplayer.source.a aVar);

    void release();

    void setImageOutput(ImageOutput imageOutput);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final fa.t f8638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Supplier<w0> f8639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Supplier<androidx.media3.exoplayer.source.j.a> f8640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Supplier<wa.l> f8641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Supplier<c0> f8642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Supplier<xa.c> f8643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Function<fa.c, ja.a> f8644h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Looper f8645i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f8646j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final androidx.media3.common.d f8647k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f8648l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f8649m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final x0 f8650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long f8651o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f8652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final long f8653q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final i f8654r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final long f8655s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f8656t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f8657u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8658v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final String f8659w;

        private b(Context context, Supplier<w0> supplier, Supplier<androidx.media3.exoplayer.source.j.a> supplier2, Supplier<wa.l> supplier3, Supplier<c0> supplier4, Supplier<xa.c> supplier5, Function<fa.c, ja.a> function) {
            context.getClass();
            this.f8637a = context;
            this.f8639c = supplier;
            this.f8640d = supplier2;
            this.f8641e = supplier3;
            this.f8642f = supplier4;
            this.f8643g = supplier5;
            this.f8644h = function;
            int i14 = fa.z.f70071a;
            Looper looperMyLooper = Looper.myLooper();
            this.f8645i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f8647k = androidx.media3.common.d.f8178g;
            this.f8648l = 1;
            this.f8649m = true;
            this.f8650n = x0.f9876c;
            this.f8651o = 5000L;
            this.f8652p = 15000L;
            this.f8653q = 3000L;
            i.b bVar = new i.b();
            this.f8654r = new i(0.97f, 1.03f, 1000L, 1.0E-7f, bVar.f9167a, bVar.f9168b, bVar.f9169c);
            this.f8638b = fa.c.f70004a;
            this.f8655s = 500L;
            this.f8656t = 2000L;
            this.f8657u = true;
            this.f8659w = "";
            this.f8646j = -1000;
        }

        public final v a() {
            fa.a.d(!this.f8658v);
            this.f8658v = true;
            int i14 = fa.z.f70071a;
            return new v(this, null);
        }

        @CanIgnoreReturnValue
        public final void b(wa.l lVar) {
            fa.a.d(!this.f8658v);
            lVar.getClass();
            this.f8641e = new m(lVar, 4);
        }

        public b(Context context, w0 w0Var) {
            this(context, new m(w0Var, 0), new androidx.media3.exoplayer.c(context, 2));
            w0Var.getClass();
        }

        public b(Context context, androidx.media3.exoplayer.source.j.a aVar) {
            this(context, new androidx.media3.exoplayer.c(context, 4), new m(aVar, 3));
            aVar.getClass();
        }

        public b(Context context, w0 w0Var, androidx.media3.exoplayer.source.j.a aVar) {
            this(context, new m(w0Var, 0), new m(aVar, 3));
            w0Var.getClass();
            aVar.getClass();
        }

        public b(Context context, w0 w0Var, androidx.media3.exoplayer.source.j.a aVar, wa.l lVar, c0 c0Var, xa.c cVar, ja.a aVar2) {
            this(context, new m(w0Var, 0), new m(aVar, 3), new m(lVar, 4), new m(c0Var, 1), new m(cVar, 2), new n(aVar2, 0));
            w0Var.getClass();
            aVar.getClass();
            lVar.getClass();
            cVar.getClass();
            aVar2.getClass();
        }

        private b(Context context, Supplier<w0> supplier, Supplier<androidx.media3.exoplayer.source.j.a> supplier2) {
            this(context, supplier, supplier2, new androidx.media3.exoplayer.c(context, 1), new o(0), new androidx.media3.exoplayer.c(context, 3), new androidx.media3.common.p(1));
        }

        public b(Context context) {
            this(context, new androidx.media3.exoplayer.c(context, 5), new androidx.media3.exoplayer.c(context, 6));
        }
    }
}
