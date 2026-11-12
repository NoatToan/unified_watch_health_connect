package ep1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lep1/j;", "", "Lip1/b;", "data", "", "isLoading", "hasFailed", "<init>", "(Lip1/b;ZZ)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip1.b f64943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64945c;

    public /* synthetic */ j(ip1.b bVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f64943a, jVar.f64943a) && this.f64944b == jVar.f64944b && this.f64945c == jVar.f64945c;
    }

    public final int hashCode() {
        ip1.b bVar = this.f64943a;
        return Boolean.hashCode(this.f64945c) + q6.f.g((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f64944b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UiState(data=");
        sb3.append(this.f64943a);
        sb3.append(", isLoading=");
        sb3.append(this.f64944b);
        sb3.append(", hasFailed=");
        return hb.a.k(sb3, this.f64945c, ")");
    }

    public j(ip1.b bVar, boolean z14, boolean z15) {
        this.f64943a = bVar;
        this.f64944b = z14;
        this.f64945c = z15;
    }

    public j() {
        this(null, false, false, 7, null);
    }
}
