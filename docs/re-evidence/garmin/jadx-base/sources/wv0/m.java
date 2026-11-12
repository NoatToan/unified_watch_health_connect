package wv0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f187439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f187440b;

    public m(e23.l lVar, List list) {
        this.f187439a = lVar;
        this.f187440b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f187439a.invoke(this.f187440b.get(num.intValue()));
    }
}
