package defpackage;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface gy1 {

    public interface a {

        /* JADX INFO: renamed from: gy1$a$a, reason: collision with other inner class name */
        public static final class C0948a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0949a> f19450a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: gy1$a$a$a, reason: collision with other inner class name */
            public static final class C0949a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f19451a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f19452b;
                public boolean c;

                public C0949a(Handler handler, a aVar) {
                    this.f19451a = handler;
                    this.f19452b = aVar;
                }

                public void d() {
                    this.c = true;
                }
            }

            public static /* synthetic */ void d(C0949a c0949a, int i, long j, long j2) {
                c0949a.f19452b.d(i, j, j2);
            }

            public void b(Handler handler, a aVar) {
                rk1.e(handler);
                rk1.e(aVar);
                e(aVar);
                this.f19450a.add(new C0949a(handler, aVar));
            }

            public void c(final int i, final long j, final long j2) {
                for (final C0949a c0949a : this.f19450a) {
                    if (!c0949a.c) {
                        c0949a.f19451a.post(new Runnable() { // from class: fy1
                            @Override // java.lang.Runnable
                            public final void run() {
                                gy1.a.C0948a.d(c0949a, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                for (C0949a c0949a : this.f19450a) {
                    if (c0949a.f19452b == aVar) {
                        c0949a.d();
                        this.f19450a.remove(c0949a);
                    }
                }
            }
        }

        void d(int i, long j, long j2);
    }

    long b();

    void e(a aVar);

    default long f() {
        return -9223372036854775807L;
    }

    fxp g();

    void h(Handler handler, a aVar);
}
