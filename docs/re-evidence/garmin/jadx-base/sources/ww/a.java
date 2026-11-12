package ww;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f187494b;

    public /* synthetic */ a(f fVar, int i14, int i15) {
        this.f187493a = i15;
        this.f187494b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f187493a;
        f fVar = this.f187494b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        f.a aVar = f.f187506i;
        switch (i14) {
            case 0:
                fVar.p(mVar, p0.t(1));
                break;
            case 1:
                fVar.k(mVar, p0.t(1));
                break;
            case 2:
                fVar.g(mVar, p0.t(1));
                break;
            default:
                fVar.n(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
