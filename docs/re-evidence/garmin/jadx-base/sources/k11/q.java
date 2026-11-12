package k11;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class q extends p005kotlin.jvm.internal.q implements e23.l<String, Unit> {
    public q(Object obj) {
        super(1, obj, l11.k.class, "onChipsUpdated", "onChipsUpdated(Ljava/lang/String;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        Object value;
        String str2 = str;
        str2.getClass();
        l11.k kVar = (l11.k) this.receiver;
        kVar.getClass();
        p2 p2Var = kVar.f108177b;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, l11.i.a((l11.i) value, str2, null, false, false, false, false, 125)));
        kVar.y4();
        return Unit.INSTANCE;
    }
}
