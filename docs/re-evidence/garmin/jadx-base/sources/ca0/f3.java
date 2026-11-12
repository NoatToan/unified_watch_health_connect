package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f3 extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
    public f3(Object obj) {
        super(1, obj, kb0.r.class, "onDndNotificationItemSelected", "onDndNotificationItemSelected(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        Object value;
        boolean zBooleanValue = bool.booleanValue();
        r53.p2 p2Var = ((kb0.r) this.receiver).f103807a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, mb0.f.a((mb0.f) value, null, null, null, new z80.h.a(zBooleanValue), null, 23)));
        return Unit.INSTANCE;
    }
}
