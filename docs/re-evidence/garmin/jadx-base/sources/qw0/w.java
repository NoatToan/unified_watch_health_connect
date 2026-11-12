package qw0;

import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f148367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f148368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po.j f148369d;

    public /* synthetic */ w(List list, int i14, po.j jVar, int i15) {
        this.f148366a = i15;
        this.f148367b = list;
        this.f148368c = i14;
        this.f148369d = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f148366a;
        po.j jVar = this.f148369d;
        int i15 = this.f148368c;
        List list = this.f148367b;
        int i16 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-349723286, new w(list, i15, jVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x.a(list, jVar, mVar, i15, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
