package l72;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i implements e23.l<p007l6.d, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p007l6.e f111055a;

    public i(p007l6.e eVar) {
        this.f111055a = eVar;
    }

    @Override // e23.l
    public final Unit invoke(p007l6.d dVar) {
        p007l6.d dVar2 = dVar;
        dVar2.getClass();
        p007l6.q qVar = dVar2.f110451d;
        p007l6.e eVar = dVar2.f110450c;
        p007l6.c0.a(qVar, eVar.f110466c);
        p007l6.v.b(dVar2.f110452e, eVar.f110467d, 0.0f, 6);
        p007l6.v.b(dVar2.f110454g, eVar.f110469f, 0.0f, 6);
        p007l6.c0.a(dVar2.f110453f, this.f111055a.f110466c);
        p007l6.s.f110500a.getClass();
        dVar2.f110455h.setValue(dVar2, p007l6.d.f110447i[0], new p007l6.t("spread"));
        return Unit.INSTANCE;
    }
}
