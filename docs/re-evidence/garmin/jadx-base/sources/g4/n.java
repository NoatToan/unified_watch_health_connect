package g4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg4/n;", "", "", "group", "dataOffset", "<init>", "(ILjava/lang/Integer;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f75746b;

    public n(int i14, Integer num) {
        this.f75745a = i14;
        this.f75746b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f75745a == nVar.f75745a && p005kotlin.jvm.internal.s.g(this.f75746b, nVar.f75746b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f75745a) * 31;
        Integer num = this.f75746b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f75745a + ", dataOffset=" + this.f75746b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
