package d92;

import e23.p;
import i3.j2;
import i3.u7;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f58634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.e f58635c;

    public /* synthetic */ e(boolean z14, z3.e eVar, int i14) {
        this.f58633a = i14;
        this.f58634b = z14;
        this.f58635c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        j2 j2VarD;
        j2 j2VarD2;
        int i14 = this.f58633a;
        boolean z14 = this.f58634b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (z14) {
                        mVar.C(-137169822);
                        j2VarD = c.c(b.f58623a, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-137113247);
                        j2VarD = c.d(b.f58623a, mVar, 0);
                        mVar.f();
                    }
                    u7.b(j2VarD, null, null, this.f58635c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (z14) {
                        mVar2.C(-1601778316);
                        j2VarD2 = c.c(b.f58623a, mVar2, b.f58626d);
                        mVar2.f();
                    } else {
                        mVar2.C(-1601721741);
                        j2VarD2 = c.d(b.f58623a, mVar2, b.f58626d);
                        mVar2.f();
                    }
                    u7.b(j2VarD2, null, null, this.f58635c, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
