package b43;

import p43.l1;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends l1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f15735j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z14, boolean z15, boolean z16, u uVar, q43.e eVar, q43.f fVar) {
        super(z14, z15, z16, true, uVar, eVar, fVar);
        this.f15735j = uVar;
    }

    @Override // p43.l1
    public final boolean b(t43.h hVar, t43.h hVar2) {
        hVar.getClass();
        if (!(hVar instanceof n0)) {
            vb.h.s("Failed requirement.");
            return false;
        }
        if (hVar2 instanceof n0) {
            return this.f15735j.f15740e.invoke(hVar, hVar2).booleanValue();
        }
        vb.h.s("Failed requirement.");
        return false;
    }
}
