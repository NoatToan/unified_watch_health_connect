package defpackage;

/* JADX INFO: loaded from: classes24.dex */
public class dda {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31637b;
    private long d;
    private long e;

    public dda(d dVar) {
        this.f31637b = dVar.f31639b;
        this.e = dVar.f31638a;
        this.d = dVar.d;
    }

    public long d() {
        return this.f31637b;
    }

    public long c() {
        return this.e;
    }

    public long b() {
        return this.d;
    }

    public String toString() {
        return "SleepRegularParam{mSleepBeginTime=" + this.f31637b + ", mSleepEndTime=" + this.e + ", mSleepValidTime=" + this.d + '}';
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f31638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f31639b;
        private long d;

        public d d(long j) {
            this.f31639b = j;
            return this;
        }

        public d b(long j) {
            this.f31638a = j;
            return this;
        }

        public d c(long j) {
            this.d = j;
            return this;
        }

        public dda a() {
            return new dda(this);
        }
    }
}
