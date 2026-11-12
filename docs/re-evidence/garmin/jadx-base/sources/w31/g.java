package w31;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f181859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z31.b f181860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f181861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f181862e;

    public /* synthetic */ g(h hVar, z31.b bVar, double d14, double d15, int i14) {
        this.f181858a = i14;
        this.f181859b = hVar;
        this.f181860c = bVar;
        this.f181861d = d14;
        this.f181862e = d15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f181858a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(461447028, new g(this.f181859b, this.f181860c, this.f181861d, this.f181862e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    this.f181859b.f(this.f181860c, String.valueOf((int) this.f181861d), String.valueOf((int) this.f181862e), mVar2, 8, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
