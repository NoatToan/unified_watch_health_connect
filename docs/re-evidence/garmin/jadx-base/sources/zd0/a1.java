package zd0;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a1 extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public a1(Object obj) {
        super(0, obj, u0.class, "triggerWhatsNewListener", "triggerWhatsNewListener()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        u0 u0Var = (u0) this.receiver;
        int i14 = u0.f204141p;
        u0Var.getClass();
        f12.l.f68084a.getClass();
        Set<String> setF1 = p13.h0.f1(f12.l.a.a().L1("whats_new_cards"));
        f12.l.a.a().E4("whats_new_cards");
        f12.l.a.a().X1("whats_new_cards", setF1);
        return Unit.INSTANCE;
    }
}
