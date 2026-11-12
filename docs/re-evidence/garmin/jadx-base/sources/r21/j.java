package r21;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f149500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f149501b;

    public j(e23.l lVar, List list) {
        this.f149500a = lVar;
        this.f149501b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f149500a.invoke(this.f149501b.get(num.intValue()));
    }
}
