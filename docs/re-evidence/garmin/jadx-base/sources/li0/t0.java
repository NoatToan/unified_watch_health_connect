package li0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f112866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f112867b;

    public t0(e23.l lVar, List list) {
        this.f112866a = lVar;
        this.f112867b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f112866a.invoke(this.f112867b.get(num.intValue()));
    }
}
