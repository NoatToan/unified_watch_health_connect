package mk0;

import am.x0;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmk0/c;", "", "Lam/x0;", "activityType", "", "", "collectionUUIDs", "individualGearUUIDs", "<init>", "(Lam/x0;Ljava/util/Set;Ljava/util/Set;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f119102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f119103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f119104c;

    public c(x0 x0Var, Set<String> set, Set<String> set2) {
        x0Var.getClass();
        set.getClass();
        set2.getClass();
        this.f119102a = x0Var;
        this.f119103b = set;
        this.f119104c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f119102a == cVar.f119102a && s.g(this.f119103b, cVar.f119103b) && s.g(this.f119104c, cVar.f119104c);
    }

    public final int hashCode() {
        return this.f119104c.hashCode() + ((this.f119103b.hashCode() + (this.f119102a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DefaultGearConflict(activityType=" + this.f119102a + ", collectionUUIDs=" + this.f119103b + ", individualGearUUIDs=" + this.f119104c + ")";
    }

    public c(x0 x0Var, Set set, Set set2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, (i14 & 2) != 0 ? l0.f134950a : set, (i14 & 4) != 0 ? l0.f134950a : set2);
    }
}
