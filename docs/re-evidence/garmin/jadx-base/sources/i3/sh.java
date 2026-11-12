package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f89702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ri f89703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph f89704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89705e;

    public /* synthetic */ sh(h4.r rVar, ph phVar, ri riVar, int i14) {
        this.f89701a = 3;
        this.f89702b = rVar;
        this.f89704d = phVar;
        this.f89703c = riVar;
        this.f89705e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f89701a) {
            case 0:
                ((Integer) obj2).getClass();
                bi.q(p3.p0.t(this.f89705e | 1), this.f89702b, this.f89704d, this.f89703c, (p3.m) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bi.g(p3.p0.t(this.f89705e | 1), this.f89702b, this.f89704d, this.f89703c, (p3.m) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                bi.l(this.f89703c, this.f89702b, this.f89704d, this.f89705e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                bi.k(p3.p0.t(this.f89705e | 1), this.f89702b, this.f89704d, this.f89703c, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ sh(h4.r rVar, ri riVar, ph phVar, int i14, int i15) {
        this.f89701a = i15;
        this.f89702b = rVar;
        this.f89703c = riVar;
        this.f89704d = phVar;
        this.f89705e = i14;
    }

    public /* synthetic */ sh(ri riVar, h4.r rVar, ph phVar, int i14, int i15) {
        this.f89701a = 2;
        this.f89703c = riVar;
        this.f89702b = rVar;
        this.f89704d = phVar;
        this.f89705e = i14;
    }
}
