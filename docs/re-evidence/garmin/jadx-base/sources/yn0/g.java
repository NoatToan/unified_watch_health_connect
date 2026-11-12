package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in0.h.a f198155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un0.a f198156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198157d;

    public /* synthetic */ g(in0.h.a aVar, un0.a aVar2, int i14, int i15) {
        this.f198154a = i15;
        this.f198155b = aVar;
        this.f198156c = aVar2;
        this.f198157d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198154a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.d(this.f198155b, this.f198156c, mVar, p0.t(this.f198157d | 1));
                break;
            case 1:
                k.f(this.f198155b, this.f198156c, mVar, p0.t(this.f198157d | 1));
                break;
            case 2:
                l.d(this.f198155b, this.f198156c, mVar, p0.t(this.f198157d | 1));
                break;
            case 3:
                m.d(this.f198155b, this.f198156c, mVar, p0.t(this.f198157d | 1));
                break;
            default:
                n.d(this.f198155b, this.f198156c, mVar, p0.t(this.f198157d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
