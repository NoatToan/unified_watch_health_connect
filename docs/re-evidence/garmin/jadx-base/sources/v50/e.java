package v50;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x50.a f175747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<x50.b, Unit> f175748b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(x50.a aVar, l<? super x50.b, Unit> lVar) {
        this.f175747a = aVar;
        this.f175748b = lVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        String str = this.f175747a.f188968a;
        if (str != null) {
            this.f175748b.invoke(new x50.b.l(str));
        }
        return Unit.INSTANCE;
    }
}
