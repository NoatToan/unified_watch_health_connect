package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class y extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public y(Object obj) {
        super(0, obj, pa0.i.class, "resetStatus", "resetStatus()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        Object value;
        r53.p2 p2Var = ((pa0.i) this.receiver).f136739d;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, pa0.h.a((pa0.h) value, null, pa0.m.c.f136761a, null, 5)));
        return Unit.INSTANCE;
    }
}
