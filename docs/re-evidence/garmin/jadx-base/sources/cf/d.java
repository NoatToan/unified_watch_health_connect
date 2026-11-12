package cf;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lcf/d;", "", "", Action.KEY_ATTRIBUTE, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f26908b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z14) {
        this(str, Long.valueOf(z14 ? 1L : 0L));
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f26907a, dVar.f26907a) && p005kotlin.jvm.internal.s.g(this.f26908b, dVar.f26908b);
    }

    public final int hashCode() {
        int iHashCode = this.f26907a.hashCode() * 31;
        Long l14 = this.f26908b;
        return iHashCode + (l14 == null ? 0 : l14.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f26907a + ", value=" + this.f26908b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public d(String str, Long l14) {
        str.getClass();
        this.f26907a = str;
        this.f26908b = l14;
    }
}
