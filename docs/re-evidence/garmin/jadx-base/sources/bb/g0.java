package bb;

/* JADX INFO: loaded from: classes.dex */
public interface g0 {
    long getDurationUs();

    a getSeekPoints(long j8);

    boolean isSeekable();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f17174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f17175b;

        public a(h0 h0Var, h0 h0Var2) {
            h0Var.getClass();
            this.f17174a = h0Var;
            h0Var2.getClass();
            this.f17175b = h0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f17174a.equals(aVar.f17174a) && this.f17175b.equals(aVar.f17175b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f17175b.hashCode() + (this.f17174a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb3 = new StringBuilder("[");
            h0 h0Var = this.f17174a;
            sb3.append(h0Var);
            h0 h0Var2 = this.f17175b;
            if (h0Var.equals(h0Var2)) {
                str = "";
            } else {
                str = ", " + h0Var2;
            }
            return am.j.o(str, "]", sb3);
        }

        public a(h0 h0Var) {
            this(h0Var, h0Var);
        }
    }

    public static class b implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f17177b;

        public b(long j8, long j14) {
            this.f17176a = j8;
            this.f17177b = new a(j14 == 0 ? h0.f17185c : new h0(0L, j14));
        }

        @Override // bb.g0
        public final long getDurationUs() {
            return this.f17176a;
        }

        @Override // bb.g0
        public final a getSeekPoints(long j8) {
            return this.f17177b;
        }

        @Override // bb.g0
        public final boolean isSeekable() {
            return false;
        }

        public b(long j8) {
            this(j8, 0L);
        }
    }
}
