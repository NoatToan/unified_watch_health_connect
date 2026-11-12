package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in0.j f198144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un0.a f198145c;

    public /* synthetic */ d(in0.j jVar, un0.a aVar, int i14) {
        this.f198143a = i14;
        this.f198144b = jVar;
        this.f198145c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198143a;
        in0.j jVar = this.f198144b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i.a(jVar.f94475e, jVar.f94476f, jVar.f94472b, this.f198145c, mVar, un0.a.f172042b << 9);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    k.a(jVar.f94475e, jVar.f94476f, jVar.f94472b, this.f198145c, mVar2, un0.a.f172042b << 9);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l.a(jVar.f94475e, jVar.f94476f, jVar.f94472b, this.f198145c, mVar3, un0.a.f172042b << 9);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    m.a(jVar.f94475e, jVar.f94476f, jVar.f94472b, this.f198145c, mVar4, un0.a.f172042b << 9);
                } else {
                    mVar4.e();
                }
                break;
            default:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    n.a(jVar.f94475e, jVar.f94476f, jVar.f94472b, this.f198145c, jVar.f94471a, mVar5, un0.a.f172042b << 9);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
