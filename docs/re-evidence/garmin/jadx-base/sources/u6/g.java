package u6;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f168824m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f168807e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f168807e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // u6.f
    public final void d(int i14) {
        if (this.f168812j) {
            return;
        }
        this.f168812j = true;
        this.f168809g = i14;
        for (d dVar : this.f168813k) {
            dVar.a(dVar);
        }
    }
}
