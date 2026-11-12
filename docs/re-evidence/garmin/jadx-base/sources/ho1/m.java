package ho1;

import e23.p;
import fo1.o0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f84824b;

    public /* synthetic */ m(o0 o0Var, int i14, int i15) {
        this.f84823a = i15;
        this.f84824b = o0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84823a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                n.b(this.f84824b, mVar, p0.t(1));
                break;
            case 1:
                n.a(this.f84824b, mVar, p0.t(1));
                break;
            default:
                n.c(this.f84824b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
