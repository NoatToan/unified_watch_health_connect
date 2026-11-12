package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in0.j f198165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un0.a f198166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nk0.l f198167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198168e;

    public /* synthetic */ j(in0.j jVar, un0.a aVar, nk0.l lVar, int i14, int i15) {
        this.f198164a = i15;
        this.f198165b = jVar;
        this.f198166c = aVar;
        this.f198167d = lVar;
        this.f198168e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198164a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                k.e(this.f198165b, this.f198166c, this.f198167d, mVar, p0.t(this.f198168e | 1));
                break;
            default:
                k.c(this.f198165b, this.f198166c, this.f198167d, mVar, p0.t(this.f198168e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
