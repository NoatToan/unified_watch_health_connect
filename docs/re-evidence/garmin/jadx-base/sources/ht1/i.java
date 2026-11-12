package ht1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f85555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f85556b;

    public i(e23.l lVar, List list) {
        this.f85555a = lVar;
        this.f85556b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f85555a.invoke(this.f85556b.get(num.intValue()));
    }
}
