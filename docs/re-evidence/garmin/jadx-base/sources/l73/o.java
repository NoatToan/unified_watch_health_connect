package l73;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f111472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f111473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f111474c = true;

    public o(Object obj, m mVar) {
        this.f111472a = obj;
        this.f111473b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f111472a == oVar.f111472a && this.f111473b.equals(oVar.f111473b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f111473b.f111460f.hashCode() + this.f111472a.hashCode();
    }
}
