package h73;

/* JADX INFO: loaded from: classes3.dex */
public class n extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f82373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f82374g;

    public n(String str, String str2) {
        this.f82373f = str;
        this.f82374g = str2;
    }

    @Override // h73.r
    public final void a(i03.k kVar) {
        ((i03.n) kVar).f(this);
    }

    @Override // h73.r
    public final String e() {
        return "destination=" + this.f82373f + ", title=" + this.f82374g;
    }

    public n() {
    }
}
