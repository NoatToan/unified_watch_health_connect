package wq0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f186600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f186601b;

    public h(e23.l lVar, List list) {
        this.f186600a = lVar;
        this.f186601b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f186600a.invoke(this.f186601b.get(num.intValue()));
    }
}
