package si1;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159379a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ti1.a f159380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.j f159381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f159382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f159383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f159384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f159385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a f159386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a f159387i;

    public /* synthetic */ i(ti1.a aVar, ui1.j jVar, e23.a aVar2, boolean z14, e23.l lVar, e23.a aVar3, e23.a aVar4, e23.a aVar5) {
        this.f159380b = aVar;
        this.f159381c = jVar;
        this.f159384f = aVar2;
        this.f159382d = z14;
        this.f159383e = lVar;
        this.f159385g = aVar3;
        this.f159386h = aVar4;
        this.f159387i = aVar5;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f159379a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ti1.a aVar = this.f159380b;
                    w wVar = aVar.f164582h;
                    if (wVar == w.PROCESSING) {
                        mVar.C(-69148321);
                        j.f(mVar, 0);
                        mVar.f();
                    } else if (wVar == w.FAILED) {
                        mVar.C(-68988485);
                        j.g(mVar, 0);
                        mVar.f();
                    } else {
                        if (this.f159381c == ui1.j.GO_TO_UAC) {
                            mVar.C(-68827998);
                            if (aVar.f164576b) {
                                mVar.C(-68794828);
                                j.c(this.f159384f, mVar, 0);
                                mVar.f();
                            } else if (aVar.f164578d || aVar.f164575a) {
                                mVar.C(-68173991);
                                mVar.f();
                            } else {
                                mVar.C(-68622778);
                                j.a(aVar, this.f159382d, this.f159383e, this.f159385g, this.f159386h, this.f159387i, mVar, 0);
                                mVar.f();
                            }
                            mVar.f();
                        } else {
                            mVar.C(-68150183);
                            mVar.f();
                        }
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                j.d(this.f159380b, this.f159381c, this.f159382d, this.f159383e, this.f159384f, this.f159385g, this.f159386h, this.f159387i, (p3.m) obj, p0.t(196609));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(ti1.a aVar, ui1.j jVar, boolean z14, e23.l lVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, int i14) {
        this.f159380b = aVar;
        this.f159381c = jVar;
        this.f159382d = z14;
        this.f159383e = lVar;
        this.f159384f = aVar2;
        this.f159385g = aVar3;
        this.f159386h = aVar4;
        this.f159387i = aVar5;
    }
}
