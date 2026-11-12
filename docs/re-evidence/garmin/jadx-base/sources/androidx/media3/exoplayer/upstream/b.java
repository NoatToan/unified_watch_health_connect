package androidx.media3.exoplayer.upstream;

import java.io.IOException;
import sa.i;
import sa.j;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9720d;

        public a(int i14, int i15, int i16, int i17) {
            this.f9717a = i14;
            this.f9718b = i15;
            this.f9719c = i16;
            this.f9720d = i17;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    public static final class C0129b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9722b;

        public C0129b(int i14, long j8) {
            fa.a.a(j8 >= 0);
            this.f9721a = i14;
            this.f9722b = j8;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IOException f9723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9724b;

        public c(i iVar, j jVar, IOException iOException, int i14) {
            this.f9723a = iOException;
            this.f9724b = i14;
        }
    }

    C0129b a(a aVar, c cVar);

    long b(c cVar);

    int getMinimumLoadableRetryCount(int i14);
}
