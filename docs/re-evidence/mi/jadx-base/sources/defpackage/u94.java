package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u94 f35542a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u94 f35543b = new b(-1);
    public static final u94 c = new b(1);

    public class a extends u94 {
        public a() {
            super(null);
        }

        @Override // defpackage.u94
        public u94 d(int i, int i2) {
            return l(ahd.d(i, i2));
        }

        @Override // defpackage.u94
        public u94 e(long j, long j2) {
            return l(dse.c(j, j2));
        }

        @Override // defpackage.u94
        public u94 f(Comparable<?> comparable, Comparable<?> comparable2) {
            return l(comparable.compareTo(comparable2));
        }

        @Override // defpackage.u94
        public <T> u94 g(T t, T t2, Comparator<T> comparator) {
            return l(comparator.compare(t, t2));
        }

        @Override // defpackage.u94
        public u94 h(boolean z, boolean z2) {
            return l(t43.a(z, z2));
        }

        @Override // defpackage.u94
        public u94 i(boolean z, boolean z2) {
            return l(t43.a(z2, z));
        }

        @Override // defpackage.u94
        public int j() {
            return 0;
        }

        public u94 l(int i) {
            if (i < 0) {
                return u94.f35543b;
            }
            return i > 0 ? u94.c : u94.f35542a;
        }
    }

    public static final class b extends u94 {
        public final int d;

        public b(int i) {
            super(null);
            this.d = i;
        }

        @Override // defpackage.u94
        public u94 d(int i, int i2) {
            return this;
        }

        @Override // defpackage.u94
        public u94 e(long j, long j2) {
            return this;
        }

        @Override // defpackage.u94
        public u94 f(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // defpackage.u94
        public <T> u94 g(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // defpackage.u94
        public u94 h(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.u94
        public u94 i(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.u94
        public int j() {
            return this.d;
        }
    }

    public u94() {
    }

    public /* synthetic */ u94(a aVar) {
        this();
    }

    public static u94 k() {
        return f35542a;
    }

    public abstract u94 d(int i, int i2);

    public abstract u94 e(long j, long j2);

    public abstract u94 f(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> u94 g(T t, T t2, Comparator<T> comparator);

    public abstract u94 h(boolean z, boolean z2);

    public abstract u94 i(boolean z, boolean z2);

    public abstract int j();
}
