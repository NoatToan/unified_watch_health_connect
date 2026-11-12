package zs1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f206862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f206863b;

    public g(e23.l lVar, List list) {
        this.f206862a = lVar;
        this.f206863b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f206862a.invoke(this.f206863b.get(num.intValue()));
    }
}
