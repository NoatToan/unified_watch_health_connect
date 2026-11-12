package y8;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.time.Duration;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r"}, d2 = {"Ly8/p;", "", "<init>", "()V", "c", "b", "g", "d", "f", "h", "a", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/p$a;", "Ly8/p;", "Lc9/b;", "activeCalories", "<init>", "(Lc9/b;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.b f194929a;

        public a(c9.b bVar) {
            bVar.getClass();
            this.f194929a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f194929a, ((a) obj).f194929a);
        }

        public final int hashCode() {
            return this.f194929a.hashCode();
        }

        public final String toString() {
            return "ActiveCaloriesBurnedGoal(activeCalories=" + this.f194929a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/p$b;", "Ly8/p;", "Lc9/c;", "distance", "Ljava/time/Duration;", "duration", "<init>", "(Lc9/c;Ljava/time/Duration;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.c f194930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Duration f194931b;

        public b(c9.c cVar, Duration duration) {
            cVar.getClass();
            duration.getClass();
            this.f194930a = cVar;
            this.f194931b = duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f194930a, bVar.f194930a) && p005kotlin.jvm.internal.s.g(this.f194931b, bVar.f194931b);
        }

        public final int hashCode() {
            return this.f194931b.hashCode() + (this.f194930a.hashCode() * 31);
        }

        public final String toString() {
            return "DistanceAndDurationGoal(distance=" + this.f194930a + ", duration=" + this.f194931b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/p$c;", "Ly8/p;", "Lc9/c;", "distance", "<init>", "(Lc9/c;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.c f194932a;

        public c(c9.c cVar) {
            cVar.getClass();
            this.f194932a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f194932a, ((c) obj).f194932a);
        }

        public final int hashCode() {
            return this.f194932a.hashCode();
        }

        public final String toString() {
            return "DistanceGoal(distance=" + this.f194932a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/p$d;", "Ly8/p;", "Ljava/time/Duration;", "duration", "<init>", "(Ljava/time/Duration;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Duration f194933a;

        public d(Duration duration) {
            duration.getClass();
            this.f194933a = duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f194933a, ((d) obj).f194933a);
        }

        public final int hashCode() {
            return this.f194933a.hashCode();
        }

        public final String toString() {
            return "DurationGoal(duration=" + this.f194933a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly8/p$e;", "Ly8/p;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends p {
        static {
            new e();
        }

        private e() {
        }

        public final String toString() {
            return "ManualCompletion()";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/p$f;", "Ly8/p;", "", "repetitions", "<init>", "(I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f194934a;

        public f(int i14) {
            this.f194934a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f194934a == ((f) obj).f194934a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f194934a);
        }

        public final String toString() {
            return ds.e0.j(new StringBuilder("RepetitionsGoal(repetitions="), this.f194934a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/p$g;", "Ly8/p;", "", "steps", "<init>", "(I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f194935a;

        public g(int i14) {
            this.f194935a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return this.f194935a == ((g) obj).f194935a;
            }
            return false;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF194935a() {
            return this.f194935a;
        }

        public final String toString() {
            return ds.e0.j(new StringBuilder("StepsGoal(steps="), this.f194935a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/p$h;", "Ly8/p;", "Lc9/b;", "totalCalories", "<init>", "(Lc9/b;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c9.b f194936a;

        public h(c9.b bVar) {
            bVar.getClass();
            this.f194936a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f194936a, ((h) obj).f194936a);
        }

        public final int hashCode() {
            return this.f194936a.hashCode();
        }

        public final String toString() {
            return "TotalCaloriesBurnedGoal(totalCalories=" + this.f194936a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly8/p$i;", "Ly8/p;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends p {
        static {
            new i();
        }

        private i() {
        }

        public final String toString() {
            return "UnknownGoal()";
        }
    }
}
