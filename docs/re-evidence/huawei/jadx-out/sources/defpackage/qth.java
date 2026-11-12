package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qth {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f46800c;
    private final int[] d;
    private final int e;

    public qth(b bVar) {
        this.f46800c = bVar.d;
        this.d = bVar.f46801a;
        this.e = bVar.f46802c;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f46801a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46802c;
        private int[] d;

        public b d(int i) {
            this.f46802c = i;
            return this;
        }

        public b d(int[] iArr) {
            this.d = iArr;
            return this;
        }

        public b e(int[] iArr) {
            this.f46801a = iArr;
            return this;
        }

        public qth c() {
            return new qth(this);
        }
    }

    public int a() {
        return this.e;
    }

    public int[] e() {
        return this.f46800c;
    }

    public int[] d() {
        return this.d;
    }
}
