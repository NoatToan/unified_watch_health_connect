package t21;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f161857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f161858b;

    public e0(e23.l lVar, List list) {
        this.f161857a = lVar;
        this.f161858b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f161857a.invoke(this.f161858b.get(num.intValue()));
    }
}
