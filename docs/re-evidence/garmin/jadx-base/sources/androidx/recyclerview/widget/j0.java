package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public interface j0 {

    public static class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10513a = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.j0$a$a, reason: collision with other inner class name */
        public class C0147a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p1.z<Long> f10514a = new p1.z<>();

            public C0147a() {
            }

            @Override // androidx.recyclerview.widget.j0.d
            public final long a(long j8) {
                p1.z<Long> zVar = this.f10514a;
                Long lB = zVar.b(j8);
                if (lB == null) {
                    a aVar = a.this;
                    long j14 = aVar.f10513a;
                    aVar.f10513a = 1 + j14;
                    lB = Long.valueOf(j14);
                    zVar.f(j8, lB);
                }
                return lB.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.j0
        public final d a() {
            return new C0147a();
        }
    }

    public static class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f10516a = new a(this);

        public class a implements d {
            public a(b bVar) {
            }

            @Override // androidx.recyclerview.widget.j0.d
            public final long a(long j8) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.j0
        public final d a() {
            return this.f10516a;
        }
    }

    public static class c implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f10517a = new a(this);

        public class a implements d {
            public a(c cVar) {
            }

            @Override // androidx.recyclerview.widget.j0.d
            public final long a(long j8) {
                return j8;
            }
        }

        @Override // androidx.recyclerview.widget.j0
        public final d a() {
            return this.f10517a;
        }
    }

    public interface d {
        long a(long j8);
    }

    d a();
}
