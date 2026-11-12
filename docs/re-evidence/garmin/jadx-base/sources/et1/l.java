package et1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f65688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f65689b;

    public l(e23.l lVar, List list) {
        this.f65688a = lVar;
        this.f65689b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f65688a.invoke(this.f65689b.get(num.intValue()));
    }
}
