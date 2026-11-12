package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class j4<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f88518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f88519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f88520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.l f88521d;

    /* JADX WARN: Multi-variable type inference failed */
    public j4(e2.i0 i0Var, e23.l<? super Long, Unit> lVar, l3.e0 e0Var, j23.l lVar2) {
        this.f88518a = i0Var;
        this.f88519b = lVar;
        this.f88520c = e0Var;
        this.f88521d = lVar2;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        ((Number) obj).intValue();
        e2.i0 i0Var = this.f88518a;
        int iH = i0Var.h() / 12;
        int iH2 = (i0Var.h() % 12) + 1;
        this.f88519b.invoke(new Long(this.f88520c.e(this.f88521d.f96796a + iH, iH2).f109264e));
        return Unit.INSTANCE;
    }
}
