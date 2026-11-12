package defpackage;

/* JADX INFO: loaded from: classes24.dex */
public class ddc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31660c;
    private int d;
    private String e;

    public ddc(d dVar) {
        this.e = dVar.f31663c;
        this.f31658a = dVar.d;
        this.d = dVar.e;
        this.f31659b = dVar.f31661a;
        this.f31660c = dVar.f31662b;
    }

    public String d() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public int b() {
        return this.f31658a;
    }

    public int a() {
        return this.f31659b;
    }

    public String e() {
        return this.f31660c;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f31662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31663c;
        private int d;
        private int e;

        public d(String str, String str2) {
            this.f31663c = str;
            this.f31662b = str2;
        }

        public d c(int i) {
            this.e = i;
            return this;
        }

        public d d(int i) {
            this.d = i;
            return this;
        }

        public d e(int i) {
            this.f31661a = i;
            return this;
        }

        public ddc c() {
            return new ddc(this);
        }
    }

    public String toString() {
        return "SleepMonitorParam{mId='" + this.e + "', mGender=" + this.d + ", mAge=" + this.f31658a + ", mMaxSleepDuration=" + this.f31659b + ", mActivityName='" + this.f31660c + "'}";
    }
}
