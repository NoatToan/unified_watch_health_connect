package ja;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f97970c;

    public /* synthetic */ h(b.a aVar, String str, int i14) {
        this.f97968a = i14;
        this.f97969b = aVar;
        this.f97970c = str;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97968a) {
            case 0:
                ((b) obj).W(this.f97969b, this.f97970c);
                break;
            case 1:
                b bVar = (b) obj;
                bVar.getClass();
                bVar.X(this.f97969b, this.f97970c);
                break;
            case 2:
                ((b) obj).r(this.f97969b, this.f97970c);
                break;
            default:
                b bVar2 = (b) obj;
                bVar2.getClass();
                bVar2.J(this.f97969b, this.f97970c);
                break;
        }
    }

    public /* synthetic */ h(b.a aVar, String str, long j8, long j14, int i14) {
        this.f97968a = i14;
        this.f97969b = aVar;
        this.f97970c = str;
    }
}
