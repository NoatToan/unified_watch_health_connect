package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f110958d;

    public /* synthetic */ d0(int i14, long j8, e23.a aVar, boolean z14) {
        this.f110955a = 4;
        this.f110957c = j8;
        this.f110956b = aVar;
        this.f110958d = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f110955a;
        Object obj3 = this.f110956b;
        switch (i14) {
            case 0:
                u4.d dVar = (u4.d) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                f0.a aVar = f0.a.f111000a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    i0.a(dVar, this.f110957c, this.f110958d, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                i0.a((u4.d) obj3, this.f110957c, this.f110958d, (p3.m) obj, p3.p0.t(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                li0.z.q((u4.d) obj3, this.f110957c, this.f110958d, (p3.m) obj, p3.p0.t(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                o72.l.d((u4.d) obj3, this.f110957c, this.f110958d, (p3.m) obj, p3.p0.t(1));
                break;
            default:
                e23.a aVar2 = (e23.a) obj3;
                ((Integer) obj2).getClass();
                aVar2.getClass();
                a03.i0.a(p3.p0.t(1), this.f110957c, aVar2, (p3.m) obj, this.f110958d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d0(u4.d dVar, long j8, boolean z14) {
        this.f110955a = 0;
        this.f110956b = dVar;
        this.f110957c = j8;
        this.f110958d = z14;
    }

    public /* synthetic */ d0(u4.d dVar, long j8, boolean z14, int i14, int i15) {
        this.f110955a = i15;
        this.f110956b = dVar;
        this.f110957c = j8;
        this.f110958d = z14;
    }
}
