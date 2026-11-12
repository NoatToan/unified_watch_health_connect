package ao1;

import e23.p;
import h4.r;
import li0.d0;
import li0.k0;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f11541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ li0.f f11542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11544e;

    public /* synthetic */ b(d0 d0Var, li0.f fVar, r rVar, int i14, int i15) {
        this.f11540a = i15;
        this.f11541b = d0Var;
        this.f11542c = fVar;
        this.f11543d = rVar;
        this.f11544e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f11540a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                e.c(this.f11541b, this.f11542c, this.f11543d, mVar, p0.t(this.f11544e | 1));
                break;
            case 1:
                e.c(this.f11541b, this.f11542c, this.f11543d, mVar, p0.t(this.f11544e | 1));
                break;
            case 2:
                k0.b(this.f11541b, this.f11542c, this.f11543d, mVar, p0.t(this.f11544e | 1));
                break;
            default:
                s12.a.a(this.f11541b, this.f11542c, this.f11543d, mVar, p0.t(this.f11544e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
