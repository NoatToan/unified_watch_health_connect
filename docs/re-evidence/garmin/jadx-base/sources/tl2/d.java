package tl2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f165317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cs2.a f165318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f165319d;

    public /* synthetic */ d(c cVar, cs2.a aVar, int i14, int i15) {
        this.f165316a = i15;
        this.f165317b = cVar;
        this.f165318c = aVar;
        this.f165319d = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f165316a) {
            case 0:
                this.f165317b.g(this.f165318c, this.f165319d - 1);
                break;
            default:
                this.f165317b.h(this.f165318c, this.f165319d - 1);
                break;
        }
    }
}
