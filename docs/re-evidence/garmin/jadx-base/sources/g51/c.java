package g51;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f75940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75941c;

    public /* synthetic */ c(f fVar, int i14, int i15) {
        this.f75939a = i15;
        this.f75940b = fVar;
        this.f75941c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75939a;
        int i15 = this.f75941c;
        f fVar = this.f75940b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = f.f75946f;
        switch (i14) {
            case 0:
                fVar.i(mVar, p0.t(i15 | 1));
                break;
            case 1:
                fVar.j(mVar, p0.t(i15 | 1));
                break;
            case 2:
                fVar.g(mVar, p0.t(i15 | 1));
                break;
            case 3:
                fVar.k(mVar, p0.t(i15 | 1));
                break;
            case 4:
                fVar.l(mVar, p0.t(i15 | 1));
                break;
            default:
                fVar.h(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
