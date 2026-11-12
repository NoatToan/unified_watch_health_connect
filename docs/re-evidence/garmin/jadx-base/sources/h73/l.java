package h73;

/* JADX INFO: loaded from: classes3.dex */
public class l extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f82370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f82371g;

    public l(String str, String str2) {
        this.f82370f = str;
        this.f82371g = str2;
    }

    @Override // h73.r
    public final void a(i03.k kVar) {
        ((i03.n) kVar).f(this);
    }

    @Override // h73.r
    public final String e() {
        return "destination=" + this.f82370f + ", title=" + this.f82371g;
    }

    public l() {
    }
}
