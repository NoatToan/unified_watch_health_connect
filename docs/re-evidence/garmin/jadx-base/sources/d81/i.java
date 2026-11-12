package d81;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g81.p f58331b;

    public /* synthetic */ i(g81.p pVar, int i14, int i15) {
        this.f58330a = i15;
        this.f58331b = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58330a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                j.a(this.f58331b, mVar, p0.t(1));
                break;
            default:
                s.a(this.f58331b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
