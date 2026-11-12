package androidx.media3.exoplayer.source;

import android.os.Handler;
import com.google.android.exoplayer2.C;
import fa.z;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface k {
    default void c(int i14, j.b bVar, sa.i iVar, sa.j jVar) {
    }

    default void d(int i14, j.b bVar, sa.i iVar, sa.j jVar, IOException iOException, boolean z14) {
    }

    default void e(int i14, j.b bVar, sa.j jVar) {
    }

    default void g(int i14, j.b bVar, sa.j jVar) {
    }

    default void h(int i14, j.b bVar, sa.i iVar, sa.j jVar) {
    }

    default void i(int i14, j.b bVar, sa.i iVar, sa.j jVar) {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j.b f9525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0128a> f9526c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.k$a$a, reason: collision with other inner class name */
        public static final class C0128a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f9527a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final k f9528b;

            public C0128a(Handler handler, k kVar) {
                this.f9527a = handler;
                this.f9528b = kVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(fa.g<k> gVar) {
            for (C0128a c0128a : this.f9526c) {
                z.R(c0128a.f9527a, new r0.h(11, gVar, c0128a.f9528b));
            }
        }

        public final void b(sa.i iVar, int i14, int i15, androidx.media3.common.q qVar, int i16, Object obj, long j8, long j14) {
            a(new sa.k(this, iVar, new sa.j(i14, i15, qVar, i16, obj, z.Y(j8), z.Y(j14)), 2));
        }

        public final void c(sa.i iVar, int i14, int i15, androidx.media3.common.q qVar, int i16, Object obj, long j8, long j14) {
            a(new sa.k(this, iVar, new sa.j(i14, i15, qVar, i16, obj, z.Y(j8), z.Y(j14)), 1));
        }

        public final void d(sa.i iVar, int i14, int i15, androidx.media3.common.q qVar, int i16, Object obj, long j8, long j14, IOException iOException, boolean z14) {
            a(new com.google.android.exoplayer2.analytics.n(this, iVar, new sa.j(i14, i15, qVar, i16, obj, z.Y(j8), z.Y(j14)), iOException, z14));
        }

        public final void e(sa.i iVar, int i14, IOException iOException, boolean z14) {
            d(iVar, i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z14);
        }

        public final void f(sa.i iVar, int i14, int i15, androidx.media3.common.q qVar, int i16, Object obj, long j8, long j14) {
            a(new sa.k(this, iVar, new sa.j(i14, i15, qVar, i16, obj, z.Y(j8), z.Y(j14)), 0));
        }

        public final a g(int i14, j.b bVar) {
            return new a(this.f9526c, i14, bVar);
        }

        private a(CopyOnWriteArrayList<C0128a> copyOnWriteArrayList, int i14, j.b bVar) {
            this.f9526c = copyOnWriteArrayList;
            this.f9524a = i14;
            this.f9525b = bVar;
        }
    }
}
