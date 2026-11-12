package yi;

import wi.k;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class g extends qj.i<ui.e, u<?>> implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f197304d;

    public g(long j8) {
        super(j8);
    }

    @Override // qj.i
    public final int b(u<?> uVar) {
        u<?> uVar2 = uVar;
        if (uVar2 == null) {
            return 1;
        }
        return uVar2.getSize();
    }

    @Override // qj.i
    public final void c(ui.e eVar, u<?> uVar) {
        u<?> uVar2 = uVar;
        k kVar = this.f197304d;
        if (kVar == null || uVar2 == null) {
            return;
        }
        kVar.f185373e.a(uVar2, true);
    }
}
