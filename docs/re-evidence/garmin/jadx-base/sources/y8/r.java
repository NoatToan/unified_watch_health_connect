package y8;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"Ly8/r;", "", "<init>", "()V", "d", "f", "b", "c", "h", JWKParameterNames.RSA_EXPONENT, "a", "g", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly8/r$a;", "Ly8/r;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends r {
        static {
            new a();
        }

        private a() {
        }

        public final String toString() {
            return "AmrapTarget()";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly8/r$b;", "Ly8/r;", "", "minCadence", "maxCadence", "<init>", "(DD)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f194949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f194950b;

        public b(double d14, double d15) {
            this.f194949a = d14;
            this.f194950b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f194949a == bVar.f194949a && this.f194950b == bVar.f194950b;
        }

        public final int hashCode() {
            return Double.hashCode(this.f194950b) + (Double.hashCode(this.f194949a) * 31);
        }

        public final String toString() {
            return "CadenceTarget(minCadence=" + this.f194949a + ", maxCadence=" + this.f194950b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly8/r$c;", "Ly8/r;", "", "minHeartRate", "maxHeartRate", "<init>", "(DD)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f194951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f194952b;

        public c(double d14, double d15) {
            this.f194951a = d14;
            this.f194952b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f194951a == cVar.f194951a && this.f194952b == cVar.f194952b;
        }

        public final int hashCode() {
            return Double.hashCode(this.f194952b) + (Double.hashCode(this.f194951a) * 31);
        }

        public final String toString() {
            return "HeartRateTarget(minHeartRate=" + this.f194951a + ", maxHeartRate=" + this.f194952b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly8/r$d;", "Ly8/r;", "Lc9/f;", "minPower", "maxPower", "<init>", "(Lc9/f;Lc9/f;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.f f194953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c9.f f194954b;

        public d(c9.f fVar, c9.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f194953a = fVar;
            this.f194954b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f194953a, dVar.f194953a) && p005kotlin.jvm.internal.s.g(this.f194954b, dVar.f194954b);
        }

        public final int hashCode() {
            return this.f194954b.hashCode() + (this.f194953a.hashCode() * 31);
        }

        public final String toString() {
            return "PowerTarget(minPower=" + this.f194953a + ", maxPower=" + this.f194954b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/r$e;", "Ly8/r;", "", "rpe", "<init>", "(I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f194955a;

        public e(int i14) {
            this.f194955a = i14;
            if (i14 < 0 || i14 >= 11) {
                vb.h.s("RPE value must be between 0 and 10, inclusive.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f194955a == ((e) obj).f194955a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f194955a);
        }

        public final String toString() {
            return ds.e0.j(new StringBuilder("RateOfPerceivedExertionTarget(rpe="), this.f194955a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly8/r$f;", "Ly8/r;", "Lc9/k;", "minSpeed", "maxSpeed", "<init>", "(Lc9/k;Lc9/k;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.k f194956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c9.k f194957b;

        public f(c9.k kVar, c9.k kVar2) {
            kVar.getClass();
            kVar2.getClass();
            this.f194956a = kVar;
            this.f194957b = kVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f194956a, fVar.f194956a) && p005kotlin.jvm.internal.s.g(this.f194957b, fVar.f194957b);
        }

        public final int hashCode() {
            return this.f194957b.hashCode() + (this.f194956a.hashCode() * 31);
        }

        public final String toString() {
            return "SpeedTarget(minSpeed=" + this.f194956a + ", maxSpeed=" + this.f194957b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly8/r$g;", "Ly8/r;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends r {
        static {
            new g();
        }

        private g() {
        }

        public final String toString() {
            return "UnknownTarget()";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/r$h;", "Ly8/r;", "Lc9/d;", "mass", "<init>", "(Lc9/d;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.d f194958a;

        public h(c9.d dVar) {
            dVar.getClass();
            this.f194958a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f194958a, ((h) obj).f194958a);
        }

        public final int hashCode() {
            return this.f194958a.hashCode();
        }

        public final String toString() {
            return "WeightTarget(mass=" + this.f194958a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }
}
