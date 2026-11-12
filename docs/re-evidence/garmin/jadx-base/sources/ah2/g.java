package ah2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lah2/g;", "", "Lah2/j;", "screenFormatter", "Lah2/d;", "cardFormatter", "<init>", "(Lah2/j;Lah2/d;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3293b;

    public /* synthetic */ g(j jVar, d dVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? new c() : jVar, (i14 & 2) != 0 ? new a() : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f3292a, gVar.f3292a) && s.g(this.f3293b, gVar.f3293b);
    }

    public final int hashCode() {
        return this.f3293b.hashCode() + (this.f3292a.hashCode() * 31);
    }

    public final String toString() {
        return "LiveActivityFormatter(screenFormatter=" + this.f3292a + ", cardFormatter=" + this.f3293b + ")";
    }

    public g(j jVar, d dVar) {
        jVar.getClass();
        dVar.getClass();
        this.f3292a = jVar;
        this.f3293b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
