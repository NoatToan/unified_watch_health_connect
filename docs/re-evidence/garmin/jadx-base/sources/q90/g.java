package q90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/g;", "", "Lq90/c;", "pairedDevice", "Lq90/f;", "primaryDeviceAction", "<init>", "(Lq90/c;Lq90/f;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f143529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f143530b;

    public g(c cVar, f fVar) {
        cVar.getClass();
        fVar.getClass();
        this.f143529a = cVar;
        this.f143530b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f143529a.equals(gVar.f143529a) && this.f143530b.equals(gVar.f143530b);
    }

    public final int hashCode() {
        return this.f143530b.hashCode() + (this.f143529a.hashCode() * 31);
    }

    public final String toString() {
        return "PrimaryDeviceInfo(pairedDevice=" + this.f143529a + ", primaryDeviceAction=" + this.f143530b + ")";
    }
}
