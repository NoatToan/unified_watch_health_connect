package h5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo4/y;", "canvas", "Lr4/c;", "parentLayer", "", "invoke", "(Lo4/y;Lr4/c;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class d1 extends p005kotlin.jvm.internal.w implements e23.p<o4.y, r4.c, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f81750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f81751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c1 c1Var, e23.a<Unit> aVar) {
        super(2);
        this.f81750a = c1Var;
        this.f81751b = aVar;
    }

    @Override // e23.p
    public final Unit invoke(o4.y yVar, r4.c cVar) {
        o4.y yVar2 = yVar;
        r4.c cVar2 = cVar;
        c1 c1Var = this.f81750a;
        if (c1Var.f81711p.g()) {
            c1Var.f81710k0 = yVar2;
            c1Var.Z = cVar2;
            r1 snapshotObserver = i0.a(c1Var.f81711p).getSnapshotObserver();
            snapshotObserver.f81981a.d(c1Var, c1.O0, this.f81751b);
            c1Var.J0 = false;
        } else {
            c1Var.J0 = true;
        }
        return Unit.INSTANCE;
    }
}
