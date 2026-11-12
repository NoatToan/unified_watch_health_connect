package a51;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o51.f f1447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f1448c;

    public /* synthetic */ i(o51.f fVar, e23.a aVar, int i14, int i15) {
        this.f1446a = i15;
        this.f1447b = fVar;
        this.f1448c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1446a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                j.a(this.f1447b, this.f1448c, mVar, p0.t(1));
                break;
            default:
                z41.i.a(this.f1447b, this.f1448c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
