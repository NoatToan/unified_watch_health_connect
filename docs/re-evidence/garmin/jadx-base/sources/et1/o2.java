package et1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class o2 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f65728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f65729b;

    public o2(e23.l lVar, List list) {
        this.f65728a = lVar;
        this.f65729b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f65728a.invoke(this.f65729b.get(num.intValue()));
    }
}
