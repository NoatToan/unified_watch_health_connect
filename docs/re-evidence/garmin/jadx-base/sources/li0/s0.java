package li0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f112857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f112858b;

    public s0(e23.l lVar, List list) {
        this.f112857a = lVar;
        this.f112858b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f112857a.invoke(this.f112858b.get(num.intValue()));
    }
}
