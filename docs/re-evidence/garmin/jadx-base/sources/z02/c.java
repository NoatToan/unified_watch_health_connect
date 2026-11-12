package z02;

import c2.k3;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200733a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f200734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f200735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k3 f200736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f200737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f200738f;

    public /* synthetic */ c(p pVar, p pVar2, k3 k3Var, p pVar3, p pVar4) {
        this.f200734b = pVar;
        this.f200735c = pVar2;
        this.f200736d = k3Var;
        this.f200737e = pVar3;
        this.f200738f = pVar4;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f200733a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    d.b(this.f200734b, this.f200735c, this.f200736d, this.f200737e, this.f200738f, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                d.b(this.f200734b, this.f200735c, this.f200736d, this.f200737e, this.f200738f, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(p pVar, p pVar2, k3 k3Var, p pVar3, p pVar4, int i14) {
        this.f200734b = pVar;
        this.f200735c = pVar2;
        this.f200736d = k3Var;
        this.f200737e = pVar3;
        this.f200738f = pVar4;
    }
}
