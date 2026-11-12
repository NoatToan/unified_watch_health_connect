package zs1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class p implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f206878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f206879b;

    public p(e23.l lVar, List list) {
        this.f206878a = lVar;
        this.f206879b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f206878a.invoke(this.f206879b.get(num.intValue()));
    }
}
