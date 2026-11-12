package yi2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\b\tB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lyi2/n;", "", "", "name", "Lyi2/n$a;", "status", "<init>", "(Ljava/lang/String;Lyi2/n$a;)V", "a", "b", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f197426b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyi2/n$a;", "", "<init>", "(Ljava/lang/String;I)V", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        ACCEPTED,
        DECLINED,
        TENTATIVE,
        PENDING
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyi2/n$b;", "", "<init>", "()V", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f197432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f197433b;
    }

    public n(String str, a aVar) {
        this.f197425a = str;
        this.f197426b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f197425a, nVar.f197425a) && this.f197426b == nVar.f197426b;
    }

    public final int hashCode() {
        String str = this.f197425a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f197426b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "EventAttendee(name=" + this.f197425a + ", status=" + this.f197426b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
