package qm0;

import am.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm0/v;", "", "", "resourceId", "Lam/c2;", "resourceType", "<init>", "(Ljava/lang/String;Lam/c2;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f145565b;

    public v(String str, c2 c2Var) {
        this.f145564a = str;
        this.f145565b = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f145564a, vVar.f145564a) && this.f145565b == vVar.f145565b;
    }

    public final int hashCode() {
        String str = this.f145564a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c2 c2Var = this.f145565b;
        return iHashCode + (c2Var != null ? c2Var.hashCode() : 0);
    }

    public final String toString() {
        return "CommentChangeEvent(resourceId=" + this.f145564a + ", resourceType=" + this.f145565b + ")";
    }
}
