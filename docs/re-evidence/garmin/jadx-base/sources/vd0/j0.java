package vd0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f177304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f177305b;

    public j0(e23.l lVar, List list) {
        this.f177304a = lVar;
        this.f177305b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f177304a.invoke(this.f177305b.get(num.intValue()));
    }
}
