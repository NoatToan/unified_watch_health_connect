package mn2;

import c83.a0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f119817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn2.i f119818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f119819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f119820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f119821g;

    public /* synthetic */ i(String str, int i14, tn2.i iVar, String str2, e23.l lVar, e23.l lVar2, int i15) {
        this.f119815a = i15;
        this.f119816b = str;
        this.f119817c = i14;
        this.f119818d = iVar;
        this.f119819e = str2;
        this.f119820f = lVar;
        this.f119821g = lVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f119815a) {
            case 0:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                g gVar = new g(a0Var, this.f119819e, this.f119818d, this.f119817c, this.f119820f, this.f119816b, this.f119821g);
                int i14 = w03.b.f181178a;
                return new e13.b(gVar);
            case 1:
                a0 a0Var2 = (a0) obj;
                a0Var2.getClass();
                g gVar2 = new g(a0Var2, this.f119819e, this.f119818d, this.f119817c, this.f119820f, this.f119816b, this.f119821g);
                int i15 = w03.b.f181178a;
                return new e13.b(gVar2);
            case 2:
                a0 a0Var3 = (a0) obj;
                a0Var3.getClass();
                g gVar3 = new g(a0Var3, this.f119819e, this.f119818d, this.f119817c, this.f119820f, this.f119816b, this.f119821g);
                int i16 = w03.b.f181178a;
                return new e13.b(gVar3);
            default:
                a0 a0Var4 = (a0) obj;
                a0Var4.getClass();
                g gVar4 = new g(a0Var4, this.f119819e, this.f119818d, this.f119817c, this.f119820f, this.f119816b, this.f119821g);
                int i17 = w03.b.f181178a;
                return new e13.b(gVar4);
        }
    }
}
