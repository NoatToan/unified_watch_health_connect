package r40;

import c2.x2;
import e23.p;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import qw0.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f150280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f150281c;

    public /* synthetic */ h(List list, y yVar, int i14) {
        this.f150279a = i14;
        this.f150280b = list;
        this.f150281c = yVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f150279a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = i.f150282b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1256053415, new h(this.f150280b, this.f150281c, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = i.f150282b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    j.a(x2.f(r.S, 1.0f), this.f150280b, false, this.f150281c, mVar2, 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
