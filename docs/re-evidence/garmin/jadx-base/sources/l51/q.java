package l51;

import j23.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class q extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
    public q(Object obj) {
        super(1, obj, p51.e.class, "setGoalPace", "setGoalPace(I)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Integer num) {
        Object value;
        Object value2;
        o51.j jVar;
        int iIntValue = num.intValue();
        p2 p2Var = ((p51.e) this.receiver).f136172a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, o51.j.a((o51.j) value, null, null, null, 0, iIntValue, 15)));
        do {
            value2 = p2Var.getValue();
            jVar = (o51.j) value2;
        } while (!p2Var.b(value2, o51.j.a(jVar, null, null, null, t.e(MathKt.b((jVar.b() / (((double) 1000) * (jVar.f129274c == n02.g.KILOMETERS ? 1.0d : 1.609344d))) * ((double) jVar.f129276e)), jVar.d(), jVar.c()), 0, 23)));
        return Unit.INSTANCE;
    }
}
