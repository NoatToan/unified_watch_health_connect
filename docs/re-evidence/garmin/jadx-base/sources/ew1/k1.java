package ew1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f66554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f66555c;

    public /* synthetic */ k1(q1 q1Var, List list, int i14, int i15) {
        this.f66553a = i15;
        this.f66554b = q1Var;
        this.f66555c = list;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66553a;
        List<jv1.t> list = this.f66555c;
        q1 q1Var = this.f66554b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        q1.a aVar = q1.f66677f;
        switch (i14) {
            case 0:
                q1Var.y6(list, mVar, p3.p0.t(1));
                break;
            case 1:
                q1Var.y6(list, mVar, p3.p0.t(1));
                break;
            case 2:
                q1Var.E6(list, mVar, p3.p0.t(1));
                break;
            case 3:
                q1Var.E6(list, mVar, p3.p0.t(1));
                break;
            case 4:
                q1Var.w6(list, mVar, p3.p0.t(1));
                break;
            default:
                q1Var.w6(list, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
