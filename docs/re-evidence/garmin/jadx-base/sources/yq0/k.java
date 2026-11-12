package yq0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class k extends q implements e23.l<String, Unit> {
    public k(Object obj) {
        super(1, obj, f.class, "onAgeRangeChanged", "onAgeRangeChanged(Ljava/lang/String;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        Object value;
        String str2 = str;
        str2.getClass();
        f fVar = (f) this.receiver;
        fVar.getClass();
        p2 p2Var = fVar.f198748b;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, null, str2, null, null, 27)));
        return Unit.INSTANCE;
    }
}
