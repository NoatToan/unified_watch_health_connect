package vd0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v1 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f177418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f177419b;

    public v1(e23.l lVar, List list) {
        this.f177418a = lVar;
        this.f177419b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f177418a.invoke(this.f177419b.get(num.intValue()));
    }
}
