package s11;

import i3.bc;
import j23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls11/a;", "", "", "fromDateMillis", "Li3/bc;", "selectableDates", "Lj23/l;", "yearRange", "<init>", "(JLi3/bc;Lj23/l;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f155873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc f155874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f155875c;

    public a(long j8, bc bcVar, l lVar) {
        bcVar.getClass();
        lVar.getClass();
        this.f155873a = j8;
        this.f155874b = bcVar;
        this.f155875c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f155873a == aVar.f155873a && this.f155874b.equals(aVar.f155874b) && this.f155875c.equals(aVar.f155875c);
    }

    public final int hashCode() {
        return this.f155875c.hashCode() + ((this.f155874b.hashCode() + (Long.hashCode(this.f155873a) * 31)) * 31);
    }

    public final String toString() {
        return "LegacyMoveCopyFoodUIState(fromDateMillis=" + this.f155873a + ", selectableDates=" + this.f155874b + ", yearRange=" + this.f155875c + ")";
    }
}
