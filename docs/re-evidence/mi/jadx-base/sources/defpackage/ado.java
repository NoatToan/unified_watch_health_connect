package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ado {

    public static class b extends ado {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f909a;

        public b() {
            super();
        }

        @Override // defpackage.ado
        public void b(boolean z) {
            this.f909a = z;
        }

        @Override // defpackage.ado
        public void c() {
            if (this.f909a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public ado() {
    }

    public static ado a() {
        return new b();
    }

    public abstract void b(boolean z);

    public abstract void c();
}
