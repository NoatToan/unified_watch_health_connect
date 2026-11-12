package np;

import b63.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnp/i;", "", "Lo82/g;", "pageInterval", "Lb63/o;", "date", "<init>", "(Lo82/g;Lb63/o;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o82.g f126831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f126832b;

    public i(o82.g gVar, o oVar) {
        gVar.getClass();
        oVar.getClass();
        this.f126831a = gVar;
        this.f126832b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f126831a == iVar.f126831a && this.f126832b.equals(iVar.f126832b);
    }

    public final int hashCode() {
        return this.f126832b.f16206a.hashCode() + (this.f126831a.hashCode() * 31);
    }

    public final String toString() {
        return "StrengthStatsActivityResult(pageInterval=" + this.f126831a + ", date=" + this.f126832b + ")";
    }
}
