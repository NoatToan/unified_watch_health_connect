package lh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f112406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dh0.a f112407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112408d;

    public /* synthetic */ g(r rVar, dh0.a aVar, int i14, int i15) {
        this.f112405a = i15;
        this.f112406b = rVar;
        this.f112407c = aVar;
        this.f112408d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112405a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.b(this.f112406b, this.f112407c, mVar, p0.t(this.f112408d | 1));
                break;
            default:
                t.b(this.f112406b, this.f112407c, mVar, p0.t(this.f112408d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
