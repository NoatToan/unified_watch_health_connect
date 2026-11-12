package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.p f65933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f65934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f65935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f65936e;

    public /* synthetic */ x(e23.l lVar, pt1.p pVar, e23.l lVar2, e23.l lVar3) {
        this.f65932a = 2;
        this.f65934c = lVar;
        this.f65933b = pVar;
        this.f65935d = lVar2;
        this.f65936e = lVar3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f65932a) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                if (this.f65933b.f140952x) {
                    this.f65934c.invoke(Boolean.TRUE);
                } else {
                    this.f65935d.invoke(num);
                    this.f65936e.invoke(pt1.n.f.f140900a);
                }
                break;
            case 1:
                Integer num2 = (Integer) obj;
                num2.intValue();
                if (this.f65933b.f140952x) {
                    this.f65934c.invoke(Boolean.TRUE);
                } else {
                    this.f65935d.invoke(num2);
                    this.f65936e.invoke(pt1.n.f.f140900a);
                }
                break;
            case 2:
                us1.d dVar = (us1.d) obj;
                dVar.getClass();
                int i14 = n0.a.f65721b[dVar.ordinal()];
                e23.l lVar = this.f65934c;
                if (i14 == 1) {
                    lVar.invoke(new pt1.n.g(dVar));
                } else if (i14 != 2) {
                    lVar.invoke(new pt1.n.d(dVar));
                } else {
                    pt1.p pVar = this.f65933b;
                    if (pVar == null || !pVar.f140952x) {
                        this.f65936e.invoke(0);
                        lVar.invoke(pt1.n.f.f140900a);
                    } else {
                        this.f65935d.invoke(Boolean.TRUE);
                    }
                }
                break;
            case 3:
                Integer num3 = (Integer) obj;
                num3.intValue();
                if (this.f65933b.f140952x) {
                    this.f65934c.invoke(Boolean.TRUE);
                } else {
                    this.f65935d.invoke(num3);
                    this.f65936e.invoke(pt1.n.f.f140900a);
                }
                break;
            case 4:
                ((Integer) obj).intValue();
                if (this.f65933b.f140952x) {
                    this.f65934c.invoke(Boolean.TRUE);
                } else {
                    this.f65935d.invoke(0);
                    this.f65936e.invoke(pt1.n.f.f140900a);
                }
                break;
            default:
                ((Integer) obj).intValue();
                if (this.f65933b.f140952x) {
                    this.f65934c.invoke(Boolean.TRUE);
                } else {
                    this.f65935d.invoke(0);
                    this.f65936e.invoke(pt1.n.f.f140900a);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x(pt1.p pVar, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14) {
        this.f65932a = i14;
        this.f65933b = pVar;
        this.f65934c = lVar;
        this.f65935d = lVar2;
        this.f65936e = lVar3;
    }
}
