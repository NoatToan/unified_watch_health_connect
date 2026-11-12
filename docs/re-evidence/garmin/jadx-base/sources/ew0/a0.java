package ew0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a0 extends p005kotlin.jvm.internal.q implements e23.l<Long, Unit> {
    public a0(Object obj) {
        super(1, obj, m.class, "toggleBehaviourSelection", "toggleBehaviourSelection(J)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Long l14) {
        Object value;
        Object value2;
        long jLongValue = l14.longValue();
        m mVar = (m) this.receiver;
        p2 p2Var = mVar.f66243j;
        List list = (List) p2Var.getValue();
        mVar.f66235b.getClass();
        List listA = tv0.w.a(jLongValue, list);
        if (listA.equals(list)) {
            p2 p2Var2 = mVar.f66249p;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, new d0(true, ((d0) value).f66201b)));
        } else {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, listA));
        }
        return Unit.INSTANCE;
    }
}
