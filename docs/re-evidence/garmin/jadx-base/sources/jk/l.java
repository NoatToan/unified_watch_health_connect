package jk;

/* JADX INFO: loaded from: classes7.dex */
public class l implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f99170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f99171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f99172c;

    public l(j jVar, f fVar, t tVar) {
        this.f99172c = jVar;
        this.f99170a = fVar;
        this.f99171b = tVar;
    }

    @Override // jk.u
    public final j.i run() {
        f fVar = this.f99170a;
        int i14 = fVar.f99038r;
        int i15 = fVar.f99039s;
        long j8 = fVar.f99043w;
        j jVar = this.f99172c;
        jVar.f99073u = j8;
        j.i iVarS = j.s(jVar, new b(jVar.f99063k, this.f99171b, jVar.f99074v, i14, i15, jVar.f99072t, j8, null), null);
        j.i iVar = j.i.SUCCESS;
        return iVarS != iVar ? iVarS : iVar;
    }
}
