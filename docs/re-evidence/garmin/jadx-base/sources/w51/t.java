package w51;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f182400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f182401b;

    public t(e23.l lVar, List list) {
        this.f182400a = lVar;
        this.f182401b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f182400a.invoke(this.f182401b.get(num.intValue()));
    }
}
