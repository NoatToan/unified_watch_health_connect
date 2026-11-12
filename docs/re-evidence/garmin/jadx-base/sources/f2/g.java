package f2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f68201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68202c;

    public /* synthetic */ g(e23.p pVar, int i14, int i15) {
        this.f68200a = i15;
        this.f68201b = pVar;
        this.f68202c = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f68200a) {
            case 0:
                e0 e0Var = (e0) obj;
                int iB = e0Var.b();
                int iC = Integer.MIN_VALUE;
                for (int i14 = 0; i14 < iB; i14++) {
                    iC = r13.b.c(e0Var.a(i14), new int[0]);
                }
                if (iC != Integer.MIN_VALUE) {
                    this.f68201b.invoke(Integer.valueOf(this.f68202c), Integer.valueOf(iC));
                }
                break;
            case 1:
                ho.b bVar = (ho.b) obj;
                bVar.getClass();
                this.f68201b.invoke(Integer.valueOf(this.f68202c), bVar);
                break;
            case 2:
                eo.b bVar2 = (eo.b) obj;
                bVar2.getClass();
                this.f68201b.invoke(Integer.valueOf(this.f68202c), bVar2);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                this.f68201b.invoke(Integer.valueOf(this.f68202c), str);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                this.f68201b.invoke(Integer.valueOf(this.f68202c), str2);
                break;
        }
        return Unit.INSTANCE;
    }
}
