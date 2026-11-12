package defpackage;

/* JADX INFO: loaded from: classes22.dex */
public class bah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final azz f883c;
    private final baf e;

    bah(azz azzVar, baf bafVar) {
        this.f883c = azzVar;
        this.e = bafVar;
    }

    public void d(int i) {
        azz azzVar = this.f883c;
        azzVar.d(new b(azzVar, this.e, i));
    }

    public void b(int i, int i2) {
        azz azzVar = this.f883c;
        azzVar.d(new b(azzVar, this.e, i, i2));
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f884a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final baf f885c;
        private final azz d;
        private final int e;

        b(azz azzVar, baf bafVar, int i) {
            this(azzVar, bafVar, i, 0);
        }

        b(azz azzVar, baf bafVar, int i, int i2) {
            this.d = azzVar;
            this.f885c = bafVar;
            this.e = i;
            this.f884a = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f884a;
            if (i != 0) {
                this.d.b(this.f885c.b(this.e, i));
            } else {
                this.d.b(this.f885c.b(this.e));
            }
        }
    }
}
