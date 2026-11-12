package ln1;

import i3.mc;
import o53.b0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f113664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f113665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f113666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113667e;

    public /* synthetic */ g(km1.c cVar, mc mcVar, b0 b0Var, int i14, int i15) {
        this.f113663a = i15;
        this.f113664b = cVar;
        this.f113665c = mcVar;
        this.f113666d = b0Var;
        this.f113667e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f113663a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                k.b(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
            case 1:
                m.a(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
            case 2:
                n.a(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
            case 3:
                o.a(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
            case 4:
                p.a(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
            case 5:
                q.a(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
            default:
                r.a(this.f113664b, this.f113665c, this.f113666d, mVar, p0.t(this.f113667e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
