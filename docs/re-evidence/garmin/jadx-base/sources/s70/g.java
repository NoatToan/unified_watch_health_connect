package s70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f157696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f157697b;

    public g(e23.l lVar, List list) {
        this.f157696a = lVar;
        this.f157697b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f157696a.invoke(this.f157697b.get(num.intValue()));
    }
}
