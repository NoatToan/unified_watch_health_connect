package ja;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97967c;

    public /* synthetic */ g(b.a aVar, boolean z14, int i14) {
        this.f97965a = i14;
        this.f97966b = aVar;
        this.f97967c = z14;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97965a) {
            case 0:
                b bVar = (b) obj;
                bVar.getClass();
                bVar.x(this.f97966b, this.f97967c);
                break;
            case 1:
                ((b) obj).m(this.f97966b, this.f97967c);
                break;
            case 2:
                ((b) obj).H(this.f97966b, this.f97967c);
                break;
            default:
                ((b) obj).c(this.f97966b, this.f97967c);
                break;
        }
    }
}
