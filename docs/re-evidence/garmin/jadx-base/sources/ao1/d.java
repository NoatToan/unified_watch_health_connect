package ao1;

import e23.p;
import li0.d0;
import li0.z;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f11551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ li0.f f11552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11553d;

    public /* synthetic */ d(d0 d0Var, li0.f fVar, int i14, int i15) {
        this.f11550a = i15;
        this.f11551b = d0Var;
        this.f11552c = fVar;
        this.f11553d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f11550a;
        m mVar = (m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                e.b(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
            case 1:
                z.e(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
            case 2:
                z.d(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
            case 3:
                z.a(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
            case 4:
                z.o(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
            case 5:
                z.n(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
            default:
                z.p(this.f11551b, this.f11552c, mVar, p0.t(this.f11553d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
