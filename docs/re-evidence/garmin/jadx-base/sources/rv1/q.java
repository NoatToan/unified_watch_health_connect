package rv1;

import java.util.Map;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f154747b;

    public /* synthetic */ q(Map map, int i14, int i15) {
        this.f154746a = i15;
        this.f154747b = map;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154746a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                r.a(this.f154747b, mVar, p0.t(1));
                break;
            case 1:
                r.b(this.f154747b, mVar, p0.t(1));
                break;
            case 2:
                ux1.j.c(this.f154747b, mVar, p0.t(1));
                break;
            default:
                xg2.j.a(this.f154747b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
