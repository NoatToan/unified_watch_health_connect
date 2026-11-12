package v;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.f.a f174090b;

    public /* synthetic */ v(s.f.a aVar, int i14) {
        this.f174089a = i14;
        this.f174090b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f174089a) {
            case 0:
                s.f.a aVar = this.f174090b;
                if (!aVar.f174041b.getAndSet(true)) {
                    aVar.f174042c.f174039b.f174008c.execute(new v(aVar, 1));
                    break;
                }
                break;
            default:
                s.f.a aVar2 = this.f174090b;
                s.g gVar = aVar2.f174042c.f174039b.f174010e;
                s.g gVar2 = s.g.f174051i;
                s.f fVar = aVar2.f174042c;
                if (gVar == gVar2) {
                    fVar.f174039b.toString();
                    aVar2.f174042c.f174039b.D(s.g.f174050h);
                    aVar2.f174042c.f174039b.f174014i.b();
                } else {
                    s sVar = fVar.f174039b;
                    Objects.toString(sVar.f174010e);
                    sVar.toString();
                }
                break;
        }
    }
}
