package b43;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements e23.l<t23.b, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f15733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t23.b f15734b;

    public s(m mVar, t23.b bVar) {
        this.f15733a = mVar;
        this.f15734b = bVar;
    }

    @Override // e23.l
    public final Unit invoke(t23.b bVar) {
        this.f15733a.b(this.f15734b, bVar);
        return Unit.INSTANCE;
    }
}
