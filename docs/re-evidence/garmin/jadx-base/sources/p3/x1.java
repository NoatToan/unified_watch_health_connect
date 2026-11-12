package p3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp3/x1;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135385a;

    public x1(String str) {
        this.f135385a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && p005kotlin.jvm.internal.s.g(this.f135385a, ((x1) obj).f135385a);
    }

    public final int hashCode() {
        return this.f135385a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("OpaqueKey(key="), this.f135385a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
