package mt0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class i1 extends p005kotlin.jvm.internal.q implements e23.l<List<? extends ot0.g>, Unit> {
    public i1(Object obj) {
        super(1, obj, pt0.o.class, "filter", "filter(Ljava/util/List;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(List<? extends ot0.g> list) {
        List<? extends ot0.g> list2 = list;
        list2.getClass();
        pt0.o oVar = (pt0.o) this.receiver;
        oVar.getClass();
        oVar.f140744c.f120666b.m(new ArrayList(list2));
        oVar.x4();
        return Unit.INSTANCE;
    }
}
