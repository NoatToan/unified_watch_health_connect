package androidx.media3.exoplayer.drm;

import android.os.Handler;
import fa.z;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    default void a(int i14, androidx.media3.exoplayer.source.j.b bVar) {
    }

    default void b(int i14, androidx.media3.exoplayer.source.j.b bVar) {
    }

    default void f(int i14, androidx.media3.exoplayer.source.j.b bVar) {
    }

    default void j(int i14, androidx.media3.exoplayer.source.j.b bVar, int i15) {
    }

    default void l(int i14, androidx.media3.exoplayer.source.j.b bVar) {
    }

    default void m(int i14, androidx.media3.exoplayer.source.j.b bVar, Exception exc) {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j.b f8895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0123a> f8896c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.b$a$a, reason: collision with other inner class name */
        public static final class C0123a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f8897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f8898b;

            public C0123a(Handler handler, b bVar) {
                this.f8897a = handler;
                this.f8898b = bVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a() {
            for (C0123a c0123a : this.f8896c) {
                z.R(c0123a.f8897a, new la.a(this, c0123a.f8898b, 3));
            }
        }

        public final void b() {
            for (C0123a c0123a : this.f8896c) {
                z.R(c0123a.f8897a, new la.a(this, c0123a.f8898b, 1));
            }
        }

        public final void c() {
            for (C0123a c0123a : this.f8896c) {
                z.R(c0123a.f8897a, new la.a(this, c0123a.f8898b, 2));
            }
        }

        public final void d(int i14) {
            for (C0123a c0123a : this.f8896c) {
                z.R(c0123a.f8897a, new androidx.camera.camera2.internal.compat.j(this, c0123a.f8898b, i14, 10));
            }
        }

        public final void e(Exception exc) {
            for (C0123a c0123a : this.f8896c) {
                z.R(c0123a.f8897a, new fh2.a(this, 13, c0123a.f8898b, exc));
            }
        }

        public final void f() {
            for (C0123a c0123a : this.f8896c) {
                z.R(c0123a.f8897a, new la.a(this, c0123a.f8898b, 0));
            }
        }

        public final a g(int i14, androidx.media3.exoplayer.source.j.b bVar) {
            return new a(this.f8896c, i14, bVar);
        }

        private a(CopyOnWriteArrayList<C0123a> copyOnWriteArrayList, int i14, androidx.media3.exoplayer.source.j.b bVar) {
            this.f8896c = copyOnWriteArrayList;
            this.f8894a = i14;
            this.f8895b = bVar;
        }
    }
}
