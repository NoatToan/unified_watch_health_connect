package j30;

import e23.l;
import e23.p;
import k30.n;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96849a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f96850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f96851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f96852d;

    public /* synthetic */ e(n nVar, l lVar, l lVar2) {
        this.f96850b = nVar;
        this.f96851c = lVar;
        this.f96852d = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96849a;
        l lVar = this.f96852d;
        l lVar2 = this.f96851c;
        n nVar = this.f96850b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i.a(nVar, lVar2, lVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                i.a(nVar, lVar2, lVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(n nVar, l lVar, l lVar2, int i14) {
        this.f96850b = nVar;
        this.f96851c = lVar;
        this.f96852d = lVar2;
    }
}
