package bt1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f21106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f21109e;

    public /* synthetic */ e(h4.r rVar, u uVar, boolean z14, e23.l lVar, int i14, int i15) {
        this.f21105a = i15;
        this.f21106b = rVar;
        this.f21107c = uVar;
        this.f21108d = z14;
        this.f21109e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21105a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                g.a(this.f21106b, this.f21107c, this.f21108d, this.f21109e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                i.a(this.f21106b, this.f21107c, this.f21108d, this.f21109e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
