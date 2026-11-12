package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes20.dex */
public class zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f54835a;
    private final String e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f54837c = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f54836b = new AtomicLong();
    private final AtomicLong i = new AtomicLong(-1);
    private final int d = 0;

    public zzr(String str, d dVar) {
        this.e = str;
        this.f54835a = dVar.e(this);
    }

    public void h() {
        synchronized (this.f54836b) {
            this.f54836b.addAndGet(this.f54837c.getAndSet(0L));
        }
    }

    public String b(int i) {
        long j;
        long j2;
        synchronized (this.f54836b) {
            j = this.f54837c.get();
            j2 = this.f54836b.get();
        }
        return e(i, this.e, j) + String.format(" (%8d overall).", Long.valueOf(j2));
    }

    public String d() {
        return this.e;
    }

    public void c(long j) {
        synchronized (this.f54836b) {
            long j2 = this.i.get();
            if (j2 < 0) {
                this.i.set(0L);
                j2 = 0;
            }
            this.f54837c.set((j - this.f54836b.get()) - j2);
        }
    }

    public long b() {
        return this.f54837c.incrementAndGet();
    }

    public long a() {
        long j;
        long j2;
        synchronized (this.f54836b) {
            j = this.f54836b.get();
            j2 = this.f54837c.get();
        }
        return j + j2;
    }

    public long i() {
        long andSet;
        synchronized (this.f54836b) {
            this.f54836b.addAndGet(this.f54837c.getAndSet(0L));
            andSet = this.f54836b.getAndSet(0L);
            long j = this.i.get();
            if (j > 0) {
                this.i.set(j + andSet);
            } else {
                this.i.set(andSet);
            }
        }
        return andSet;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f54836b) {
            z = this.f54837c.get() > 0 || this.f54836b.get() > 0;
        }
        return z;
    }

    public boolean e() {
        return this.i.get() >= 0;
    }

    public String toString() {
        d dVar = this.f54835a;
        return b(dVar == null ? this.d : dVar.b());
    }

    public static String e(int i, String str, long j) {
        if (i == 0) {
            return String.format("%s: %8d", str, Long.valueOf(j));
        }
        return String.format("%" + i + "s: %8d", str, Long.valueOf(j));
    }

    public static class d {
        int d;

        public d e(zzr zzrVar) {
            return c(zzrVar.d());
        }

        public d c(String str) {
            int length = str.length();
            if (length > this.d) {
                this.d = length;
            }
            return this;
        }

        public int b() {
            return -(this.d + 1);
        }
    }
}
