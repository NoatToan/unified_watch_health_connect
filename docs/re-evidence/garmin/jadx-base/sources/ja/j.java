package ja;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.q f97976c;

    public /* synthetic */ j(b.a aVar, androidx.media3.common.q qVar, androidx.media3.exoplayer.h hVar, int i14) {
        this.f97974a = i14;
        this.f97975b = aVar;
        this.f97976c = qVar;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97974a) {
            case 0:
                ((b) obj).e(this.f97975b, this.f97976c);
                break;
            default:
                ((b) obj).N(this.f97975b, this.f97976c);
                break;
        }
    }
}
