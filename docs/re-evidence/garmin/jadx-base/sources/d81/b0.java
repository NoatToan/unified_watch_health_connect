package d81;

import h2.j0;
import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f58290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f58291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f58292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f58293e;

    public /* synthetic */ b0(e23.l lVar, o53.b0 b0Var, h2.b bVar, n1 n1Var, int i14) {
        this.f58289a = i14;
        this.f58290b = lVar;
        this.f58291c = b0Var;
        this.f58292d = bVar;
        this.f58293e = n1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f58289a) {
            case 0:
                int iIntValue = num.intValue();
                this.f58290b.invoke(num);
                ge1.b.T(this.f58291c, null, null, new c0(this.f58292d, iIntValue, this.f58293e, null), 3);
                break;
            default:
                int iIntValue2 = num.intValue();
                this.f58290b.invoke(num);
                ge1.b.T(this.f58291c, null, null, new f0(this.f58292d, iIntValue2, this.f58293e, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
