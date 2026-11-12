package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.d0;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public interface a {
        static {
            int i14 = l.f9529a;
        }

        default void a(yb.n.a aVar) {
        }

        j b(androidx.media3.common.t tVar);

        @Deprecated
        default void c(boolean z14) {
        }

        int[] getSupportedTypes();
    }

    public interface c {
        void a(androidx.media3.exoplayer.source.a aVar, d0 d0Var);
    }

    void a(Handler handler, k kVar);

    void b(c cVar);

    i c(b bVar, xa.b bVar2, long j8);

    void d(c cVar, ha.n nVar, ja.q qVar);

    void e(c cVar);

    void f(c cVar);

    void g(Handler handler, androidx.media3.exoplayer.drm.b bVar);

    default d0 getInitialTimeline() {
        return null;
    }

    androidx.media3.common.t getMediaItem();

    void h(i iVar);

    void i(k kVar);

    default boolean isSingleWindow() {
        return !(this instanceof d);
    }

    void j(androidx.media3.exoplayer.drm.b bVar);

    default void k(androidx.media3.common.t tVar) {
    }

    void maybeThrowSourceInfoRefreshError();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9523e;

        private b(Object obj, int i14, int i15, long j8, int i16) {
            this.f9519a = obj;
            this.f9520b = i14;
            this.f9521c = i15;
            this.f9522d = j8;
            this.f9523e = i16;
        }

        public final b a(Object obj) {
            if (this.f9519a.equals(obj)) {
                return this;
            }
            return new b(obj, this.f9520b, this.f9521c, this.f9522d, this.f9523e);
        }

        public final boolean b() {
            return this.f9520b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9519a.equals(bVar.f9519a) && this.f9520b == bVar.f9520b && this.f9521c == bVar.f9521c && this.f9522d == bVar.f9522d && this.f9523e == bVar.f9523e;
        }

        public final int hashCode() {
            return ((((((((this.f9519a.hashCode() + 527) * 31) + this.f9520b) * 31) + this.f9521c) * 31) + ((int) this.f9522d)) * 31) + this.f9523e;
        }

        public b(Object obj, long j8) {
            this(obj, -1, -1, j8, -1);
        }

        public b(Object obj, long j8, int i14) {
            this(obj, -1, -1, j8, i14);
        }

        public b(Object obj, int i14, int i15, long j8) {
            this(obj, i14, i15, j8, -1);
        }

        public b(Object obj) {
            this(obj, -1L);
        }
    }
}
