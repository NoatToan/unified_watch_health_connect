package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: classes.dex */
public interface y {

    public static class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2970a = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.y$a$a, reason: collision with other inner class name */
        public class C0071a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LongSparseArray<Long> f2971a = new LongSparseArray<>();

            public C0071a() {
            }

            @Override // androidx.recyclerview.widget.y.d
            public long a(long j) {
                Long lValueOf = this.f2971a.get(j);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(a.this.b());
                    this.f2971a.put(j, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.y
        public d a() {
            return new C0071a();
        }

        public long b() {
            long j = this.f2970a;
            this.f2970a = 1 + j;
            return j;
        }
    }

    public static class b implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2973a = new a();

        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.y.d
            public long a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.y
        public d a() {
            return this.f2973a;
        }
    }

    public static class c implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2975a = new a();

        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.y.d
            public long a(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.y
        public d a() {
            return this.f2975a;
        }
    }

    public interface d {
        long a(long j);
    }

    d a();
}
