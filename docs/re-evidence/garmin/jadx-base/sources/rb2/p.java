package rb2;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lrb2/p;", "", "Lrb2/p$c;", "movement", "<init>", "(Lrb2/p$c;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class p implements vh.e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f151749a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrb2/p$a;", "", "", "", "labels", "data", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f151750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<Object>> f151751b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<String> list, List<? extends List<? extends Object>> list2) {
            this.f151750a = list;
            this.f151751b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f151750a, aVar.f151750a) && p005kotlin.jvm.internal.s.g(this.f151751b, aVar.f151751b);
        }

        public final int hashCode() {
            List<String> list = this.f151750a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<List<Object>> list2 = this.f151751b;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("EpochData(labels=");
            sb3.append(this.f151750a);
            sb3.append(", data=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f151751b, sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrb2/p$b;", "", "Lrb2/p$e;", "wholeFloorsEpochData", "<init>", "(Lrb2/p$e;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f151752a;

        public b(e eVar) {
            this.f151752a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f151752a, ((b) obj).f151752a);
        }

        public final int hashCode() {
            e eVar = this.f151752a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "FloorsAscended(wholeFloorsEpochData=" + this.f151752a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrb2/p$c;", "", "Lrb2/p$d;", "steps", "Lrb2/p$b;", "floorsAscended", "<init>", "(Lrb2/p$d;Lrb2/p$b;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f151753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f151754b;

        public c(d dVar, b bVar) {
            this.f151753a = dVar;
            this.f151754b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f151753a, cVar.f151753a) && p005kotlin.jvm.internal.s.g(this.f151754b, cVar.f151754b);
        }

        public final int hashCode() {
            d dVar = this.f151753a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            b bVar = this.f151754b;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "Movement(steps=" + this.f151753a + ", floorsAscended=" + this.f151754b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrb2/p$d;", "", "", "distanceInMeters", "", "value", "Lrb2/p$a;", "epochData", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Lrb2/p$a;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f151755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f151756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f151757c;

        public d(Double d14, Integer num, a aVar) {
            this.f151755a = d14;
            this.f151756b = num;
            this.f151757c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f151755a, dVar.f151755a) && p005kotlin.jvm.internal.s.g(this.f151756b, dVar.f151756b) && p005kotlin.jvm.internal.s.g(this.f151757c, dVar.f151757c);
        }

        public final int hashCode() {
            Double d14 = this.f151755a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Integer num = this.f151756b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            a aVar = this.f151757c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "Steps(distanceInMeters=" + this.f151755a + ", value=" + this.f151756b + ", epochData=" + this.f151757c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0018\u00010\u0002\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrb2/p$e;", "", "", "data", "", "labels", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<List<Object>> f151758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f151759b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends List<? extends Object>> list, List<String> list2) {
            this.f151758a = list;
            this.f151759b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p005kotlin.jvm.internal.s.g(this.f151758a, eVar.f151758a) && p005kotlin.jvm.internal.s.g(this.f151759b, eVar.f151759b);
        }

        public final int hashCode() {
            List<List<Object>> list = this.f151758a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.f151759b;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WholeFloorsEpochData(data=");
            sb3.append(this.f151758a);
            sb3.append(", labels=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f151759b, sb3);
        }
    }

    public p(c cVar) {
        this.f151749a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && p005kotlin.jvm.internal.s.g(this.f151749a, ((p) obj).f151749a);
    }

    public final int hashCode() {
        c cVar = this.f151749a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "MovementFrag(movement=" + this.f151749a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
