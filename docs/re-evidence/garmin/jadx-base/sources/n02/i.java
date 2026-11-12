package n02;

import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f122192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f122193c;

    public /* synthetic */ i(e23.l lVar, n1 n1Var, int i14) {
        this.f122191a = i14;
        this.f122192b = lVar;
        this.f122193c = n1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f122191a) {
            case 0:
                this.f122193c.t(num.intValue());
                this.f122192b.invoke(num);
                break;
            default:
                this.f122193c.t(num.intValue());
                this.f122192b.invoke(num);
                break;
        }
        return Unit.INSTANCE;
    }
}
