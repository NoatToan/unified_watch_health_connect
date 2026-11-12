package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class vqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f51497a;
    private long d;
    private int e;

    private vqy(b bVar) {
        this.f51497a = bVar.d;
        this.d = bVar.e;
        this.e = bVar.f51498a;
    }

    public long e() {
        return this.f51497a;
    }

    public long a() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vqy)) {
            return false;
        }
        vqy vqyVar = (vqy) obj;
        return vqyVar.e() == this.f51497a && vqyVar.a() == this.d && vqyVar.d() == this.e;
    }

    public int hashCode() {
        return Long.valueOf(this.f51497a).hashCode() + Long.valueOf(this.d).hashCode() + Integer.valueOf(this.e).hashCode();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51498a;
        private long d;
        private long e;

        public vqy a() {
            return new vqy(this);
        }

        public b c(long j) {
            this.d = j;
            return this;
        }

        public b b(long j) {
            this.e = j;
            return this;
        }

        public b d(int i) {
            this.f51498a = i;
            return this;
        }
    }

    public String toString() {
        return "startTIme = " + this.f51497a + ", endTime = " + this.d + ", sportType = " + this.e;
    }
}
