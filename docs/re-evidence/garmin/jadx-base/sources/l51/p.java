package l51;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class p extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
    public p(Object obj) {
        super(1, obj, p51.e.class, "setGoalTime", "setGoalTime(I)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Integer num) {
        Object value;
        int iIntValue = num.intValue();
        p51.e eVar = (p51.e) this.receiver;
        p2 p2Var = eVar.f136172a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, o51.j.a((o51.j) value, null, null, null, iIntValue, 0, 23)));
        eVar.x4();
        return Unit.INSTANCE;
    }
}
