package tg1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f164504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f164505b;

    public c(e23.l lVar, List list) {
        this.f164504a = lVar;
        this.f164505b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f164504a.invoke(this.f164505b.get(num.intValue()));
    }
}
