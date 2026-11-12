package w51;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f182392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f182393b;

    public s(e23.l lVar, List list) {
        this.f182392a = lVar;
        this.f182393b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f182392a.invoke(this.f182393b.get(num.intValue()));
    }
}
