package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f65304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.p f65305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f65306d;

    public /* synthetic */ a1(e23.l lVar, pt1.p pVar, e23.l lVar2, int i14) {
        this.f65303a = i14;
        this.f65304b = lVar;
        this.f65305c = pVar;
        this.f65306d = lVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f65303a;
        Integer num = (Integer) obj;
        num.intValue();
        switch (i14) {
            case 0:
                this.f65304b.invoke(num);
                if (!this.f65305c.f140952x) {
                    this.f65306d.invoke(pt1.n.f.f140900a);
                }
                break;
            default:
                this.f65304b.invoke(num);
                if (!this.f65305c.f140952x) {
                    this.f65306d.invoke(pt1.n.f.f140900a);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
