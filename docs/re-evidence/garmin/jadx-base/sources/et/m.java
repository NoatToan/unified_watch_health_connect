package et;

import c2.a0;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import vy0.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f65262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f65263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f65264d;

    public /* synthetic */ m(a0 a0Var, List list, e23.l lVar, int i14, int i15) {
        this.f65261a = i15;
        this.f65262b = a0Var;
        this.f65263c = list;
        this.f65264d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f65261a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                n.a(this.f65262b, this.f65263c, this.f65264d, mVar, p0.t(7));
                break;
            default:
                f0.b(this.f65262b, this.f65263c, this.f65264d, mVar, p0.t(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
