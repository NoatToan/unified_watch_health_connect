package l51;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class n extends p005kotlin.jvm.internal.q implements e23.l<t41.f, Unit> {
    public n(Object obj) {
        super(1, obj, p51.e.class, "setRaceDistance", "setRaceDistance(Lcom/garmin/android/apps/connectmobile/pacepro/domain/PaceProRaceDistance;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(t41.f fVar) {
        Object value;
        Object value2;
        t41.f fVar2 = fVar;
        p51.e eVar = (p51.e) this.receiver;
        p2 p2Var = eVar.f136172a;
        if (fVar2 == null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, new o51.j(null, null, null, 0, 0, 31, null)));
        } else {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o51.j.a((o51.j) value, fVar2, null, null, 0, 0, 30)));
            eVar.y4();
        }
        return Unit.INSTANCE;
    }
}
