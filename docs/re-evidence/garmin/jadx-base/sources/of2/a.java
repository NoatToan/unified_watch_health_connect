package of2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131714b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f131713a = i14;
        this.f131714b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f131713a;
        b bVar = this.f131714b;
        switch (i14) {
            case 0:
                zg2.g.b bVar2 = (zg2.g.b) obj;
                int i15 = b.f131721p;
                bVar2.getClass();
                zg2.c.f204692a.getClass();
                zg2.c.a("LSVSession", "notifyDeviceDisconnected timer " + bVar2);
                zg2.a aVar = bVar.f131729h;
                u53.d dVar = bVar.f131732k;
                if (aVar != null) {
                    aVar.b();
                }
                int i16 = b.C2502b.f131737a[bVar2.ordinal()];
                if (i16 == 1) {
                    ge1.b.T(dVar, null, null, new f(bVar, null), 3);
                } else {
                    if (i16 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    ge1.b.T(dVar, null, null, new g(bVar, null), 3);
                }
                return Unit.INSTANCE;
            default:
                ge1.b.T(bVar.f131732k, null, null, new z(bVar, (Integer) obj, null), 3);
                return Unit.INSTANCE;
        }
    }
}
