package jk;

/* JADX INFO: loaded from: classes7.dex */
public class o implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ok.e f99177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f99178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f99179c;

    public o(j jVar, ok.e eVar, g gVar) {
        this.f99179c = jVar;
        this.f99177a = eVar;
        this.f99178b = gVar;
    }

    @Override // jk.u
    public final j.i run() {
        j.h hVar = j.h.NOT_CONNECTED;
        j jVar = this.f99179c;
        jVar.f99068p = hVar;
        ok.e eVar = this.f99177a;
        if (eVar instanceof p) {
            j.i iVarS = j.s(jVar, (p) eVar, null);
            if (iVarS != j.i.SUCCESS) {
                return iVarS;
            }
        } else {
            jVar.r(eVar, null);
        }
        j.i iVarS2 = j.s(jVar, this.f99178b, null);
        j.i iVar = j.i.SUCCESS;
        if (iVarS2 != iVar) {
            return iVarS2;
        }
        jVar.f99068p = j.h.LINK_IDLE;
        return iVar;
    }
}
