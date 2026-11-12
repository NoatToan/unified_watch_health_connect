package r11;

import e23.p;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21.e f149363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b11.i f149364c;

    public /* synthetic */ c(v21.e eVar, b11.i iVar, int i14) {
        this.f149362a = i14;
        this.f149363b = eVar;
        this.f149364c = iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f149362a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    y01.f.a(this.f149363b, this.f149364c, null, null, null, null, mVar, 0, 60);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    y01.f.a(this.f149363b, this.f149364c, null, null, null, null, mVar2, 0, 60);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
