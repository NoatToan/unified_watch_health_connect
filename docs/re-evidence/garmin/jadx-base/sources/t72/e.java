package t72;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f163124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f163125c;

    public /* synthetic */ e(f fVar, int i14, int i15) {
        this.f163123a = i15;
        this.f163124b = fVar;
        this.f163125c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f163123a;
        int i15 = this.f163125c;
        f fVar = this.f163124b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = f.f163126f;
        switch (i14) {
            case 0:
                fVar.g(mVar, p0.t(i15 | 1));
                break;
            default:
                fVar.h(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
