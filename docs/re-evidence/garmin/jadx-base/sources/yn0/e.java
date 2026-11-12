package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in0.j f198147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un0.a f198148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198149d;

    public /* synthetic */ e(in0.j jVar, un0.a aVar, int i14, int i15) {
        this.f198146a = i15;
        this.f198147b = jVar;
        this.f198148c = aVar;
        this.f198149d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198146a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.b(this.f198147b, this.f198148c, mVar, p0.t(this.f198149d | 1));
                break;
            case 1:
                k.b(this.f198147b, this.f198148c, mVar, p0.t(this.f198149d | 1));
                break;
            case 2:
                l.b(this.f198147b, this.f198148c, mVar, p0.t(this.f198149d | 1));
                break;
            case 3:
                m.b(this.f198147b, this.f198148c, mVar, p0.t(this.f198149d | 1));
                break;
            default:
                n.b(this.f198147b, this.f198148c, mVar, p0.t(this.f198149d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
