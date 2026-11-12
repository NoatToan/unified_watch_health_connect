package gr2;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f78578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f78579b;

    public d(l lVar, List list) {
        this.f78578a = lVar;
        this.f78579b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f78578a.invoke(this.f78579b.get(num.intValue()));
    }
}
