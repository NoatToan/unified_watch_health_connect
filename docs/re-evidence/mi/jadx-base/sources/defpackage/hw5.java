package defpackage;

import androidx.annotation.VisibleForTesting;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class hw5 implements c7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7h f20532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20533b;
    public final long c;
    public final xio d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20534k;
    public long l;

    public final class b implements arl {
        public b() {
        }

        @Override // defpackage.arl
        public arl.a d(long j) {
            return new arl.a(new crl(j, wlq.s((hw5.this.f20533b + ((hw5.this.d.c(j) * (hw5.this.c - hw5.this.f20533b)) / hw5.this.f)) - 30000, hw5.this.f20533b, hw5.this.c - 1)));
        }

        @Override // defpackage.arl
        public boolean e() {
            return true;
        }

        @Override // defpackage.arl
        public long i() {
            return hw5.this.d.b(hw5.this.f);
        }
    }

    public hw5(xio xioVar, long j, long j2, long j3, long j4, boolean z) {
        rk1.a(j >= 0 && j2 > j);
        this.d = xioVar;
        this.f20533b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.f20532a = new b7h();
    }

    @Override // defpackage.c7h
    public long a(jl8 jl8Var) throws IOException {
        int i = this.e;
        if (i == 0) {
            long position = jl8Var.getPosition();
            this.g = position;
            this.e = 1;
            long j = this.c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jI = i(jl8Var);
                if (jI != -1) {
                    return jI;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(jl8Var);
            this.e = 4;
            return -(this.f20534k + 2);
        }
        this.f = j(jl8Var);
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.c7h
    public void c(long j) {
        this.h = wlq.s(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.f20533b;
        this.j = this.c;
        this.f20534k = 0L;
        this.l = this.f;
    }

    @Override // defpackage.c7h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(jl8 jl8Var) throws IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long position = jl8Var.getPosition();
        if (!this.f20532a.e(jl8Var, this.j)) {
            long j = this.i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f20532a.b(jl8Var, false);
        jl8Var.l();
        long j2 = this.h;
        b7h b7hVar = this.f20532a;
        long j3 = b7hVar.c;
        long j4 = j2 - j3;
        int i = b7hVar.h + b7hVar.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = position;
            this.l = j3;
        } else {
            this.i = jl8Var.getPosition() + ((long) i);
            this.f20534k = this.f20532a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < 100000) {
            this.j = j6;
            return j6;
        }
        long position2 = jl8Var.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return wlq.s(position2 + ((j4 * (j7 - j8)) / (this.l - this.f20534k)), j8, j7 - 1);
    }

    @VisibleForTesting
    public long j(jl8 jl8Var) throws IOException {
        this.f20532a.c();
        if (!this.f20532a.d(jl8Var)) {
            throw new EOFException();
        }
        do {
            this.f20532a.b(jl8Var, false);
            b7h b7hVar = this.f20532a;
            jl8Var.p(b7hVar.h + b7hVar.i);
            b7h b7hVar2 = this.f20532a;
            if ((b7hVar2.f3885b & 4) == 4 || !b7hVar2.d(jl8Var)) {
                break;
            }
        } while (jl8Var.getPosition() < this.c);
        return this.f20532a.c;
    }

    public final void k(jl8 jl8Var) throws IOException {
        while (true) {
            this.f20532a.d(jl8Var);
            this.f20532a.b(jl8Var, false);
            b7h b7hVar = this.f20532a;
            if (b7hVar.c > this.h) {
                jl8Var.l();
                return;
            } else {
                jl8Var.p(b7hVar.h + b7hVar.i);
                this.i = jl8Var.getPosition();
                this.f20534k = this.f20532a.c;
            }
        }
    }
}
