package sp;

import j53.l;
import n82.f;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsp/a;", "", "Ln82/f$a;", "pagerInitialValues", "Li53/f;", "Lo82/g;", "intervals", "<init>", "(Ln82/f$a;Li53/f;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f160495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.f<g> f160496b;

    public a(f.a aVar, i53.f fVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? new f.a(null, null, null, 7, null) : aVar, (i14 & 2) != 0 ? l.b() : fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f160495a, aVar.f160495a) && s.g(this.f160496b, aVar.f160496b);
    }

    public final int hashCode() {
        return this.f160496b.hashCode() + (this.f160495a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityReportsPagerConfig(pagerInitialValues=" + this.f160495a + ", intervals=" + this.f160496b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f.a aVar, i53.f<? extends g> fVar) {
        aVar.getClass();
        fVar.getClass();
        this.f160495a = aVar;
        this.f160496b = fVar;
    }

    public a() {
        this(null, null, 3, null);
    }
}
