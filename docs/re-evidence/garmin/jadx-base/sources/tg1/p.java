package tg1;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164539a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg1.b f164540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f164541c;

    public /* synthetic */ p(sg1.b bVar, e23.a aVar) {
        this.f164540b = bVar;
        this.f164541c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f164539a;
        sg1.b bVar = this.f164540b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                q.a(bVar, this.f164541c, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f164541c, null, bVar.f159195e, mVar, null);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(sg1.b bVar, e23.a aVar, int i14) {
        this.f164540b = bVar;
        this.f164541c = aVar;
    }
}
