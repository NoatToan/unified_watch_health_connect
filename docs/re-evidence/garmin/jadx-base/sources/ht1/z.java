package ht1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class z implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<pt1.u, Unit> f85618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.u f85619b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(e23.l<? super pt1.u, Unit> lVar, pt1.u uVar) {
        this.f85618a = lVar;
        this.f85619b = uVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f85618a.invoke(this.f85619b);
        return Unit.INSTANCE;
    }
}
