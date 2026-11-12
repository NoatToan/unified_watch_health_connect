package rb2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lrb2/l;", "", "Lrb2/l$a;", "heartRate", "<init>", "(Lrb2/l$a;)V", "a", "b", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class l implements vh.e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f151738a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrb2/l$a;", "", "", "restingValue", "Lrb2/l$b;", "heartRateEpochData", "<init>", "(Ljava/lang/Integer;Lrb2/l$b;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f151739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f151740b;

        public a(Integer num, b bVar) {
            this.f151739a = num;
            this.f151740b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f151739a, aVar.f151739a) && p005kotlin.jvm.internal.s.g(this.f151740b, aVar.f151740b);
        }

        public final int hashCode() {
            Integer num = this.f151739a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            b bVar = this.f151740b;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "HeartRate(restingValue=" + this.f151739a + ", heartRateEpochData=" + this.f151740b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrb2/l$b;", "", "", "", "labels", "data", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f151741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<Object>> f151742b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<String> list, List<? extends List<? extends Object>> list2) {
            this.f151741a = list;
            this.f151742b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f151741a, bVar.f151741a) && p005kotlin.jvm.internal.s.g(this.f151742b, bVar.f151742b);
        }

        public final int hashCode() {
            List<String> list = this.f151741a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<List<Object>> list2 = this.f151742b;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("HeartRateEpochData(labels=");
            sb3.append(this.f151741a);
            sb3.append(", data=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f151742b, sb3);
        }
    }

    public l(a aVar) {
        this.f151738a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && p005kotlin.jvm.internal.s.g(this.f151738a, ((l) obj).f151738a);
    }

    public final int hashCode() {
        a aVar = this.f151738a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "HeartRateFrag(heartRate=" + this.f151738a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
