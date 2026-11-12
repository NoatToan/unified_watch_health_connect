package gw0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pv0.h f79733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pv0.s f79734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<pv0.h, pv0.s, pv0.o, Unit> f79735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<i53.c<pv0.h>> f79736d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(pv0.h hVar, pv0.s sVar, e23.q<? super pv0.h, ? super pv0.s, ? super pv0.o, Unit> qVar, p1<i53.c<pv0.h>> p1Var) {
        this.f79733a = hVar;
        this.f79734b = sVar;
        this.f79735c = qVar;
        this.f79736d = p1Var;
    }

    @Override // e23.a
    public final Unit invoke() {
        p1<i53.c<pv0.h>> p1Var = this.f79736d;
        i53.c<pv0.h> f182175a = p1Var.getF182175a();
        pv0.h hVar = this.f79733a;
        Long l14 = hVar.f141374a;
        pv0.s sVar = this.f79734b;
        p1Var.setValue(j.n(f182175a, l14, sVar, null));
        this.f79735c.invoke(hVar, sVar, null);
        return Unit.INSTANCE;
    }
}
