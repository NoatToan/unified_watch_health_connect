package jk;

/* JADX INFO: loaded from: classes7.dex */
public class k implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f99168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f99169b;

    public k(j jVar, f fVar) {
        this.f99169b = jVar;
        this.f99168a = fVar;
    }

    @Override // jk.u
    public final j.i run() {
        j jVar = this.f99169b;
        jVar.getClass();
        j.i iVarS = j.s(jVar, this.f99168a, null);
        j.i iVar = j.i.SUCCESS;
        return iVarS != iVar ? iVarS : iVar;
    }
}
