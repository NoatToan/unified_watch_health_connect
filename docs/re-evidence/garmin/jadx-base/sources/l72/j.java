package l72;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j implements e23.l<p007l6.d, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p007l6.e f111071a;

    public j(p007l6.e eVar) {
        this.f111071a = eVar;
    }

    @Override // e23.l
    public final Unit invoke(p007l6.d dVar) {
        p007l6.d dVar2 = dVar;
        dVar2.getClass();
        p007l6.c0.a(dVar2.f110451d, this.f111071a.f110468e);
        p007l6.q qVar = dVar2.f110453f;
        p007l6.e eVar = dVar2.f110450c;
        p007l6.c0.a(qVar, eVar.f110468e);
        p007l6.v.b(dVar2.f110452e, eVar.f110467d, 0.0f, 6);
        p007l6.v.b(dVar2.f110454g, eVar.f110469f, 0.0f, 6);
        p007l6.s.f110500a.getClass();
        dVar2.f110455h.setValue(dVar2, p007l6.d.f110447i[0], new p007l6.t("spread"));
        return Unit.INSTANCE;
    }
}
