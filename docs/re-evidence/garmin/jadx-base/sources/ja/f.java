package ja;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.g f97964c;

    public /* synthetic */ f(b.a aVar, androidx.media3.exoplayer.g gVar, int i14) {
        this.f97962a = i14;
        this.f97963b = aVar;
        this.f97964c = gVar;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97962a) {
            case 0:
                ((b) obj).s(this.f97963b, this.f97964c);
                break;
            case 1:
                ((b) obj).j(this.f97963b, this.f97964c);
                break;
            case 2:
                ((b) obj).f(this.f97963b, this.f97964c);
                break;
            default:
                ((b) obj).D(this.f97963b, this.f97964c);
                break;
        }
    }
}
