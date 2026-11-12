package ma0;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f117620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f117621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f117622d;

    public /* synthetic */ f(int i14, l lVar, e23.a aVar, int i15) {
        this.f117619a = 1;
        this.f117620b = i14;
        this.f117621c = lVar;
        this.f117622d = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f117619a) {
            case 0:
                num.getClass();
                g.a(this.f117622d, this.f117621c, mVar, p0.t(this.f117620b | 1));
                break;
            case 1:
                num.getClass();
                rr0.m.b(this.f117620b, this.f117621c, this.f117622d, mVar, p0.t(385));
                break;
            default:
                num.intValue();
                w11.d.b(this.f117622d, this.f117621c, mVar, p0.t(this.f117620b | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(l lVar, e23.a aVar, int i14, int i15) {
        this.f117619a = i15;
        this.f117621c = lVar;
        this.f117622d = aVar;
        this.f117620b = i14;
    }
}
