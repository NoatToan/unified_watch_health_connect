package w11;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class p implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f181239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f181240b;

    public p(e23.l lVar, List list) {
        this.f181239a = lVar;
        this.f181240b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f181239a.invoke(this.f181240b.get(num.intValue()));
    }
}
