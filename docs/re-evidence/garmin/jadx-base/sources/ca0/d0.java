package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d0 extends p005kotlin.jvm.internal.q implements e23.l<Long, Unit> {
    public d0(Object obj) {
        super(1, obj, ja0.a.class, "onBackupDeviceSelected", "onBackupDeviceSelected(J)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Long l14) {
        Object value;
        la0.a aVar;
        long jLongValue = l14.longValue();
        r53.p2 p2Var = ((ja0.a) this.receiver).f98057h;
        do {
            value = p2Var.getValue();
            aVar = (la0.a) value;
        } while (!p2Var.b(value, la0.a.a(aVar, false, false, aVar.f111610c == jLongValue ? 0L : jLongValue, null, null, 27)));
        return Unit.INSTANCE;
    }
}
