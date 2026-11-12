package lh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112437a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f112438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f112439c;

    public /* synthetic */ p(r rVar, int i14) {
        this.f112438b = rVar;
        this.f112439c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112437a;
        int i15 = this.f112439c;
        r rVar = this.f112438b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f112444a;
        switch (i14) {
            case 0:
                rVar.b(i15, mVar, p0.t(1));
                break;
            default:
                rVar.a(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(r rVar, int i14, int i15) {
        this.f112438b = rVar;
        this.f112439c = i14;
    }
}
