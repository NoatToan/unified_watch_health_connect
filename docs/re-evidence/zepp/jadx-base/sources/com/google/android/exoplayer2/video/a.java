package com.google.android.exoplayer2.video;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    public static final int g = 15;

    @VisibleForTesting
    public static final long h = 1000000;
    private boolean c;
    private boolean d;
    private int f;
    private C0156a a = new C0156a();
    private C0156a b = new C0156a();
    private long e = C.TIME_UNSET;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.a$a, reason: collision with other inner class name */
    public static final class C0156a {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        private static int c(long frameCount) {
            return (int) (frameCount % 15);
        }

        public long a() {
            long j = this.e;
            if (j == 0) {
                return 0L;
            }
            return this.f / j;
        }

        public long b() {
            return this.f;
        }

        public boolean d() {
            long j = this.d;
            if (j == 0) {
                return false;
            }
            return this.g[c(j - 1)];
        }

        public boolean e() {
            return this.d > 15 && this.h == 0;
        }

        public void f(long framePresentationTimeNs) {
            long j = this.d;
            if (j == 0) {
                this.a = framePresentationTimeNs;
            } else if (j == 1) {
                long j2 = framePresentationTimeNs - this.a;
                this.b = j2;
                this.f = j2;
                this.e = 1L;
            } else {
                long j3 = framePresentationTimeNs - this.c;
                int iC = c(j);
                if (Math.abs(j3 - this.b) <= 1000000) {
                    this.e++;
                    this.f += j3;
                    boolean[] zArr = this.g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.h--;
                    }
                } else {
                    boolean[] zArr2 = this.g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.h++;
                    }
                }
            }
            this.d++;
            this.c = framePresentationTimeNs;
        }

        public void g() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }

    public long a() {
        return e() ? this.a.a() : C.TIME_UNSET;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f;
    }

    public long d() {
        return e() ? this.a.b() : C.TIME_UNSET;
    }

    public boolean e() {
        return this.a.e();
    }

    public void f(long framePresentationTimeNs) {
        this.a.f(framePresentationTimeNs);
        if (this.a.e() && !this.d) {
            this.c = false;
        } else if (this.e != C.TIME_UNSET) {
            if (!this.c || this.b.d()) {
                this.b.g();
                this.b.f(this.e);
            }
            this.c = true;
            this.b.f(framePresentationTimeNs);
        }
        if (this.c && this.b.e()) {
            C0156a c0156a = this.a;
            this.a = this.b;
            this.b = c0156a;
            this.c = false;
            this.d = false;
        }
        this.e = framePresentationTimeNs;
        this.f = this.a.e() ? 0 : this.f + 1;
    }

    public void g() {
        this.a.g();
        this.b.g();
        this.c = false;
        this.e = C.TIME_UNSET;
        this.f = 0;
    }
}
