package gr2;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<Object, Unit> f78575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78576b;

    public b(l<Object, Unit> lVar, Object obj) {
        this.f78575a = lVar;
        this.f78576b = obj;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f78575a.invoke(this.f78576b);
        return Unit.INSTANCE;
    }
}
