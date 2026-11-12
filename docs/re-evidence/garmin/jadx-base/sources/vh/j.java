package vh;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lvh/j;", "Lvh/i;", "", "name", "", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "(Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f178334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Boolean bool) {
        super(null);
        str.getClass();
        this.f178333a = str;
        this.f178334b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f178333a, jVar.f178333a) && p005kotlin.jvm.internal.s.g(this.f178334b, jVar.f178334b);
    }

    public final int hashCode() {
        int iHashCode = this.f178333a.hashCode() * 31;
        Boolean bool = this.f178334b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "BVariable(name=" + this.f178333a + ", defaultValue=" + this.f178334b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        this(str, Boolean.TRUE);
        str.getClass();
    }
}
