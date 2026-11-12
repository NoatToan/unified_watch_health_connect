package pk2;

import ok2.g0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f138355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f138356c;

    public /* synthetic */ a(b bVar, g0 g0Var, int i14) {
        this.f138354a = i14;
        this.f138355b = bVar;
        this.f138356c = g0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f138354a;
        g0 g0Var = this.f138356c;
        b bVar = this.f138355b;
        wk2.i iVar = (wk2.i) obj;
        switch (i14) {
            case 0:
                int i15 = b.f138357m;
                iVar.getClass();
                break;
            default:
                int i16 = b.f138357m;
                iVar.getClass();
                break;
        }
        return cl2.c.r(bVar.f138360c, iVar, bVar.f138359b, g0Var);
    }
}
