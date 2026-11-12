package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class x extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public x(Object obj) {
        super(0, obj, pa0.i.class, "retryTransfer", "retryTransfer()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        pa0.i iVar = (pa0.i) this.receiver;
        Long l14 = iVar.f136741f;
        if (l14 != null) {
            iVar.z4(l14.longValue());
        }
        return Unit.INSTANCE;
    }
}
