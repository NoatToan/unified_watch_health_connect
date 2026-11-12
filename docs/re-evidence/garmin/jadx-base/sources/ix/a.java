package ix;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f95580b;

    public /* synthetic */ a(f fVar, int i14, int i15) {
        this.f95579a = i15;
        this.f95580b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95579a;
        f fVar = this.f95580b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = f.f95592j;
        switch (i14) {
            case 0:
                fVar.n(mVar, p0.t(1));
                break;
            case 1:
                fVar.m(mVar, p0.t(1));
                break;
            case 2:
                fVar.o(mVar, p0.t(1));
                break;
            case 3:
                fVar.k(mVar, p0.t(1));
                break;
            case 4:
                fVar.p(mVar, p0.t(1));
                break;
            default:
                fVar.l(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
