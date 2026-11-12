package uk0;

import i3.b6;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f171836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f171837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f171838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f171839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f171840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.q f171841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1 f171842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f171843i;

    public /* synthetic */ k(b6 b6Var, List list, e23.l lVar, e23.l lVar2, Object obj, e23.q qVar, p1 p1Var, int i14, int i15) {
        this.f171835a = i15;
        this.f171836b = b6Var;
        this.f171837c = list;
        this.f171838d = lVar;
        this.f171839e = lVar2;
        this.f171840f = obj;
        this.f171841g = qVar;
        this.f171842h = p1Var;
        this.f171843i = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171835a;
        int i15 = this.f171843i;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                m.d(this.f171836b, this.f171837c, this.f171838d, this.f171839e, this.f171840f, this.f171841g, this.f171842h, (p3.m) obj, p0.t(i15 | 1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    m.d(this.f171836b, this.f171837c, this.f171838d, this.f171839e, this.f171840f, this.f171841g, this.f171842h, mVar, (i15 & 8) << 12);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
