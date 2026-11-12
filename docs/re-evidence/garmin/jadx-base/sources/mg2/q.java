package mg2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class q extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public q(Object obj) {
        super(0, obj, f.class, "dismiss", "dismiss()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        ((f) this.receiver).dismiss();
        return Unit.INSTANCE;
    }
}
