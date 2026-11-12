package b51;

import c2.l;
import c2.x2;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import y41.e;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o51.b f16108b;

    public /* synthetic */ b(o51.b bVar, int i14) {
        this.f16107a = 1;
        this.f16108b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16107a;
        o51.b bVar = this.f16108b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e.a(this.f16108b, l.A(rVarD, j92.b.f97899b.f97920e, 0.0f, 2), null, mVar, 0, 4);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                c.a(bVar, mVar, p0.t(1));
                break;
            default:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e.c(0, l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1), mVar, bVar.f129218k);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(o51.b bVar, int i14, byte b14) {
        this.f16107a = i14;
        this.f16108b = bVar;
    }
}
