package ix;

import e23.p;
import h82.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f95589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f95590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95591d;

    public /* synthetic */ e(f fVar, r rVar, int i14, int i15) {
        this.f95588a = i15;
        this.f95589b = fVar;
        this.f95590c = rVar;
        this.f95591d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95588a;
        int i15 = this.f95591d;
        r rVar = this.f95590c;
        f fVar = this.f95589b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = f.f95592j;
        switch (i14) {
            case 0:
                fVar.i(rVar, mVar, p0.t(i15 | 1));
                break;
            case 1:
                fVar.h(rVar, mVar, p0.t(i15 | 1));
                break;
            default:
                fVar.g(rVar, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
