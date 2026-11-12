package vh;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lvh/h;", "Lvh/i;", "", "", "possibleTypes", "<init>", "(Ljava/util/Set;)V", "", "types", "([Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f178324a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String... strArr) {
        this((Set<String>) p13.u.m0(strArr));
        strArr.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f178324a, ((h) obj).f178324a);
    }

    public final int hashCode() {
        return this.f178324a.hashCode();
    }

    public final String toString() {
        return "BPossibleTypes(possibleTypes=" + this.f178324a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Set<String> set) {
        super(null);
        set.getClass();
        this.f178324a = set;
    }
}
