package ew0;

import i3.mc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66273a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f66274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f66275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc f66276d;

    public /* synthetic */ s(e23.q qVar, o53.b0 b0Var, mc mcVar) {
        this.f66275c = qVar;
        this.f66274b = b0Var;
        this.f66276d = mcVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f66273a) {
            case 0:
                String str = (String) obj;
                pv0.k kVar = (pv0.k) obj2;
                pv0.p pVar = (pv0.p) obj3;
                str.getClass();
                kVar.getClass();
                pVar.getClass();
                this.f66275c.invoke(str, kVar, pVar);
                ge1.b.T(this.f66274b, null, null, new c0.c(this.f66276d, null), 3);
                break;
            default:
                Long l14 = (Long) obj;
                l14.getClass();
                ge1.b.T(this.f66274b, null, null, new sg0.e(this.f66276d, null), 3);
                this.f66275c.invoke(l14, (String) obj2, (String) obj3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(o53.b0 b0Var, e23.q qVar, mc mcVar) {
        this.f66274b = b0Var;
        this.f66275c = qVar;
        this.f66276d = mcVar;
    }
}
