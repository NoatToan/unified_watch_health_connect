package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class z3 extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
    public z3(Object obj) {
        super(1, obj, ab0.a.class, "onWheelchairToggleChanged", "onWheelchairToggleChanged(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        Object obj;
        r53.p2 p2Var;
        z80.l lVarA;
        Boolean bool2 = bool;
        bool2.getClass();
        r53.p2 p2Var2 = ((ab0.a) this.receiver).f2517j;
        while (true) {
            Object value = p2Var2.getValue();
            r53.p2 p2Var3 = p2Var2;
            z80.l lVar = (z80.l) value;
            if (lVar != null) {
                obj = value;
                p2Var = p2Var3;
                lVarA = z80.l.a(lVar, null, null, null, null, null, 0L, null, null, null, bool2, false, null, null, 7679);
            } else {
                obj = value;
                p2Var = p2Var3;
                lVarA = null;
            }
            if (p2Var.b(obj, lVarA)) {
                return Unit.INSTANCE;
            }
            p2Var2 = p2Var;
        }
    }
}
