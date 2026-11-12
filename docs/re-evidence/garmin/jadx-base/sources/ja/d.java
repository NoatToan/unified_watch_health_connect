package ja;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sa.j f97959c;

    public /* synthetic */ d(b.a aVar, sa.j jVar, int i14) {
        this.f97957a = i14;
        this.f97958b = aVar;
        this.f97959c = jVar;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97957a) {
            case 0:
                ((b) obj).u(this.f97958b, this.f97959c);
                break;
            default:
                ((b) obj).q(this.f97958b, this.f97959c);
                break;
        }
    }
}
