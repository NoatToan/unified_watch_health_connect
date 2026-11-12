package t70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f162851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f162852b;

    public g0(e23.l lVar, List list) {
        this.f162851a = lVar;
        this.f162852b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f162851a.invoke(this.f162852b.get(num.intValue()));
    }
}
