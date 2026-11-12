package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface arl {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final crl f3390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final crl f3391b;

        public a(crl crlVar) {
            this(crlVar, crlVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3390a.equals(aVar.f3390a) && this.f3391b.equals(aVar.f3391b);
        }

        public int hashCode() {
            return (this.f3390a.hashCode() * 31) + this.f3391b.hashCode();
        }

        public String toString() {
            String string;
            String strValueOf = String.valueOf(this.f3390a);
            if (this.f3390a.equals(this.f3391b)) {
                string = "";
            } else {
                String strValueOf2 = String.valueOf(this.f3391b);
                StringBuilder sb = new StringBuilder(strValueOf2.length() + 2);
                sb.append(", ");
                sb.append(strValueOf2);
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(string).length());
            sb2.append("[");
            sb2.append(strValueOf);
            sb2.append(string);
            sb2.append("]");
            return sb2.toString();
        }

        public a(crl crlVar, crl crlVar2) {
            this.f3390a = (crl) rk1.e(crlVar);
            this.f3391b = (crl) rk1.e(crlVar2);
        }
    }

    a d(long j);

    boolean e();

    long i();

    public static class b implements arl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f3393b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // defpackage.arl
        public a d(long j) {
            return this.f3393b;
        }

        @Override // defpackage.arl
        public boolean e() {
            return false;
        }

        @Override // defpackage.arl
        public long i() {
            return this.f3392a;
        }

        public b(long j, long j2) {
            this.f3392a = j;
            this.f3393b = new a(j2 == 0 ? crl.c : new crl(0L, j2));
        }
    }
}
