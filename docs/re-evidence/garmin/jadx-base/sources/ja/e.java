package ja;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97961b;

    public /* synthetic */ e(b.a aVar, int i14) {
        this.f97960a = i14;
        this.f97961b = aVar;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97960a) {
            case 0:
                ((b) obj).Q(this.f97961b);
                break;
            case 1:
                ((b) obj).d(this.f97961b);
                break;
            case 2:
                ((b) obj).Z(this.f97961b);
                break;
            default:
                ((b) obj).o(this.f97961b);
                break;
        }
    }
}
