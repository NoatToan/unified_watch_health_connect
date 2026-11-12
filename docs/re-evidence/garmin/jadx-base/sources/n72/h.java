package n72;

import lc.m0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f124891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f124892c;

    public /* synthetic */ h(m0 m0Var, e23.a aVar, int i14, int i15) {
        this.f124890a = i15;
        this.f124891b = m0Var;
        this.f124892c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f124890a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                gg.b.b(this.f124891b, this.f124892c, mVar, p0.t(1));
                break;
            case 1:
                gl.b.d(this.f124891b, this.f124892c, mVar, p0.t(1));
                break;
            default:
                v72.c.a(this.f124891b, this.f124892c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
