package j70;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lj70/p;", "", "<init>", "()V", "a", "b", "Lj70/p$a;", "Lj70/p$b;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj70/p$a;", "Lj70/p;", "", "", "", "dataMap", "<init>", "(Ljava/util/Map;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, Double> f97617a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, Double> map) {
            super(null);
            map.getClass();
            this.f97617a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f97617a, ((a) obj).f97617a);
        }

        public final int hashCode() {
            return this.f97617a.hashCode();
        }

        public final String toString() {
            return "TimestampValue(dataMap=" + this.f97617a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj70/p$b;", "Lj70/p;", "", "", "Lo13/p;", "", "dataMap", "<init>", "(Ljava/util/Map;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, o13.p<Double, String>> f97618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, o13.p<Double, String>> map) {
            super(null);
            map.getClass();
            this.f97618a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f97618a, ((b) obj).f97618a);
        }

        public final int hashCode() {
            return this.f97618a.hashCode();
        }

        public final String toString() {
            return "TimestampValueStatus(dataMap=" + this.f97618a + ")";
        }
    }

    public /* synthetic */ p(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private p() {
    }
}
