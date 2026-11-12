package vc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvc2/m;", "", "", "serverStatus", "Lvc2/l;", "serverStatusData", "<init>", "(ILvc2/l;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f177129b;

    public /* synthetic */ m(int i14, l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f177128a == mVar.f177128a && s.g(this.f177129b, mVar.f177129b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f177128a) * 31;
        l lVar = this.f177129b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "ServerStatusResponse(serverStatus=" + this.f177128a + ", serverStatusData=" + this.f177129b + ")";
    }

    public m(int i14, l lVar) {
        this.f177128a = i14;
        this.f177129b = lVar;
    }
}
