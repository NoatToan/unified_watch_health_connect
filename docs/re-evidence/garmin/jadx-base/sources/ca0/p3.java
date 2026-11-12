package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class p3 extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public p3(Object obj) {
        super(0, obj, kb0.r.class, "onReassignDayDismissed", "onReassignDayDismissed()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        Object value;
        mb0.f fVar;
        r53.p2 p2Var = ((kb0.r) this.receiver).f103807a;
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, null, mb0.d.a(fVar.f117732c, null, null, null, null, 15), null, null, 27)));
        return Unit.INSTANCE;
    }
}
