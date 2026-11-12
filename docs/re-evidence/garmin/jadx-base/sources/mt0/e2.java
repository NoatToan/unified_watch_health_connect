package mt0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e2 extends p005kotlin.jvm.internal.q implements e23.l<List<? extends ot0.g>, Unit> {
    public e2(Object obj) {
        super(1, obj, pt0.z.class, "setSelectedFilters", "setSelectedFilters(Ljava/util/List;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(List<? extends ot0.g> list) {
        List<? extends ot0.g> list2 = list;
        list2.getClass();
        pt0.z zVar = (pt0.z) this.receiver;
        zVar.getClass();
        zVar.f140796c.f120704b.m(new ArrayList(list2));
        ((s51.a) zVar.f140797d.getValue()).f157373d.invoke();
        return Unit.INSTANCE;
    }
}
