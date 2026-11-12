package t70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f162856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f162857b;

    public h0(e23.l lVar, List list) {
        this.f162856a = lVar;
        this.f162857b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f162856a.invoke(this.f162857b.get(num.intValue()));
    }
}
