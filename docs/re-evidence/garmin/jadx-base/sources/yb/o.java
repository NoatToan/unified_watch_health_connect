package yb;

import android.util.SparseArray;
import bb.g0;
import bb.l0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements bb.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb.p f195666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.a f195667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<p> f195668c = new SparseArray<>();

    public o(bb.p pVar, n.a aVar) {
        this.f195666a = pVar;
        this.f195667b = aVar;
    }

    @Override // bb.p
    public final void a(g0 g0Var) {
        this.f195666a.a(g0Var);
    }

    @Override // bb.p
    public final void endTracks() {
        this.f195666a.endTracks();
    }

    @Override // bb.p
    public final l0 track(int i14, int i15) {
        bb.p pVar = this.f195666a;
        if (i15 != 3) {
            return pVar.track(i14, i15);
        }
        SparseArray<p> sparseArray = this.f195668c;
        p pVar2 = sparseArray.get(i14);
        if (pVar2 != null) {
            return pVar2;
        }
        p pVar3 = new p(pVar.track(i14, i15), this.f195667b);
        sparseArray.put(i14, pVar3);
        return pVar3;
    }
}
