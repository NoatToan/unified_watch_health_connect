package gm0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vh.s0;
import vh.s0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgm0/e;", "Lvh/s0$a;", "T", "", "Lyz1/d;", "status", "data", "<init>", "(Lyz1/d;Lvh/s0$a;)V", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e<T extends s0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f78008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f78009b;

    public e(yz1.d dVar, T t7) {
        dVar.getClass();
        this.f78008a = dVar;
        this.f78009b = t7;
    }

    public static e a(e eVar, yz1.d dVar) {
        T t7 = eVar.f78009b;
        eVar.getClass();
        return new e(dVar, t7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f78008a, eVar.f78008a) && s.g(this.f78009b, eVar.f78009b);
    }

    public final int hashCode() {
        int iHashCode = this.f78008a.hashCode() * 31;
        T t7 = this.f78009b;
        return iHashCode + (t7 == null ? 0 : t7.hashCode());
    }

    public final String toString() {
        return "GraphQLQueryResponse(status=" + this.f78008a + ", data=" + this.f78009b + ")";
    }

    public /* synthetic */ e(yz1.d dVar, s0.a aVar, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : aVar);
    }
}
