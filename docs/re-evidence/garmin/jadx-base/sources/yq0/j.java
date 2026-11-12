package yq0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends q implements e23.l<tq0.e, Unit> {
    public j(Object obj) {
        super(1, obj, f.class, "onGenderChanged", "onGenderChanged(Lcom/garmin/android/apps/connectmobile/insights/model/GenderDTO;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(tq0.e eVar) {
        Object value;
        tq0.e eVar2 = eVar;
        eVar2.getClass();
        f fVar = (f) this.receiver;
        fVar.getClass();
        p2 p2Var = fVar.f198748b;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, eVar2, null, null, null, 29)));
        return Unit.INSTANCE;
    }
}
