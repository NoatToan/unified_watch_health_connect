package sa;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fa.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.k.a f158126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f158127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f158128d;

    public /* synthetic */ k(androidx.media3.exoplayer.source.k.a aVar, i iVar, j jVar, int i14) {
        this.f158125a = i14;
        this.f158126b = aVar;
        this.f158127c = iVar;
        this.f158128d = jVar;
    }

    @Override // fa.g
    public final void accept(Object obj) {
        androidx.media3.exoplayer.source.k kVar = (androidx.media3.exoplayer.source.k) obj;
        switch (this.f158125a) {
            case 0:
                androidx.media3.exoplayer.source.k.a aVar = this.f158126b;
                kVar.i(aVar.f9524a, aVar.f9525b, this.f158127c, this.f158128d);
                break;
            case 1:
                androidx.media3.exoplayer.source.k.a aVar2 = this.f158126b;
                kVar.h(aVar2.f9524a, aVar2.f9525b, this.f158127c, this.f158128d);
                break;
            default:
                androidx.media3.exoplayer.source.k.a aVar3 = this.f158126b;
                kVar.c(aVar3.f9524a, aVar3.f9525b, this.f158127c, this.f158128d);
                break;
        }
    }
}
