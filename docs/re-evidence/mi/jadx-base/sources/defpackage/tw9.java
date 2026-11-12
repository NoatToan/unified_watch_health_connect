package defpackage;

import java.util.Arrays;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class tw9 {
    public boolean c;
    public boolean d;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f35124a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f35125b = new a();
    public long e = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f35126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f35127b;
        public long c;
        public long d;
        public long e;
        public long f;
        public final boolean[] g = new boolean[15];
        public int h;

        public static int c(long j) {
            return (int) (j % 15);
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

        public void f(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.f35126a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f35126a;
                this.f35127b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int iC = c(j2);
                if (Math.abs(j4 - this.f35127b) <= FolmeCore.NANOS_TO_MS) {
                    this.e++;
                    this.f += j4;
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
            this.c = j;
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
        if (e()) {
            return this.f35124a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f35124a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f;
    }

    public long d() {
        if (e()) {
            return this.f35124a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f35124a.e();
    }

    public void f(long j) {
        this.f35124a.f(j);
        if (this.f35124a.e() && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.f35125b.d()) {
                this.f35125b.g();
                this.f35125b.f(this.e);
            }
            this.c = true;
            this.f35125b.f(j);
        }
        if (this.c && this.f35125b.e()) {
            a aVar = this.f35124a;
            this.f35124a = this.f35125b;
            this.f35125b = aVar;
            this.c = false;
            this.d = false;
        }
        this.e = j;
        this.f = this.f35124a.e() ? 0 : this.f + 1;
    }

    public void g() {
        this.f35124a.g();
        this.f35125b.g();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }
}
