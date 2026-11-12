package rb2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrb2/i;", "", "Lrb2/i$a;", "calories", "<init>", "(Lrb2/i$a;)V", "a", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class i implements vh.e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f151731a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb2/i$a;", "", "", "burnedActive", "burnedTotal", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f151732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f151733b;

        public a(Integer num, Integer num2) {
            this.f151732a = num;
            this.f151733b = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f151732a, aVar.f151732a) && p005kotlin.jvm.internal.s.g(this.f151733b, aVar.f151733b);
        }

        public final int hashCode() {
            Integer num = this.f151732a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f151733b;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "Calories(burnedActive=" + this.f151732a + ", burnedTotal=" + this.f151733b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public i(a aVar) {
        this.f151731a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && p005kotlin.jvm.internal.s.g(this.f151731a, ((i) obj).f151731a);
    }

    public final int hashCode() {
        a aVar = this.f151731a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "CaloriesFrag(calories=" + this.f151731a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
