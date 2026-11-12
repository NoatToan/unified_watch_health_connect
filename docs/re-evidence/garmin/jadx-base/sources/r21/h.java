package r21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Object, Unit> f149497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149498b;

    public h(e23.l<Object, Unit> lVar, Object obj) {
        this.f149497a = lVar;
        this.f149498b = obj;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f149497a.invoke(this.f149498b);
        return Unit.INSTANCE;
    }
}
