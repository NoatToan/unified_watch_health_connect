package jk;

/* JADX INFO: loaded from: classes7.dex */
public class h implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f99057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f99058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f99059d;

    public h(j jVar, int i14, int i15, int i16) {
        this.f99059d = jVar;
        this.f99056a = i14;
        this.f99057b = i15;
        this.f99058c = i16;
    }

    @Override // jk.u
    public final j.i run() {
        j jVar = this.f99059d;
        return j.s(jVar, new d(jVar.f99063k, this.f99056a, this.f99057b, this.f99058c, jVar.f99076x, jVar.f99075w), null);
    }
}
