package mn2;

import c83.a0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f119787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f119788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f119789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f119790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn2.m f119792g;

    public /* synthetic */ d(e23.l lVar, b bVar, String str, String str2, String str3, pn2.m mVar, int i14) {
        this.f119786a = i14;
        this.f119787b = lVar;
        this.f119788c = bVar;
        this.f119789d = str;
        this.f119790e = str2;
        this.f119791f = str3;
        this.f119792g = mVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        a0 a0Var = (a0) obj;
        switch (this.f119786a) {
            case 0:
                a0Var.getClass();
                return j.c(a0Var, "endAccessCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 11), 24);
            case 1:
                a0Var.getClass();
                return j.c(a0Var, "endRecoverCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 10), 24);
            case 2:
                a0Var.getClass();
                return j.c(a0Var, "endDeleteCardWithEmail", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 9), 24);
            case 3:
                a0Var.getClass();
                return j.c(a0Var, "endPermanentDeleteCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 8), 24);
            case 4:
                a0Var.getClass();
                return j.c(a0Var, "beginDeleteCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 6), 24);
            case 5:
                a0Var.getClass();
                return j.c(a0Var, "endDeleteCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 13), 24);
            case 6:
                a0Var.getClass();
                return j.c(a0Var, "beginIssueCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 14), 24);
            case 7:
                a0Var.getClass();
                return j.c(a0Var, "endIssueCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 15), 24);
            case 8:
                a0Var.getClass();
                return j.c(a0Var, "beginAccessCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 2), 24);
            case 9:
                a0Var.getClass();
                return j.c(a0Var, "getScript", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 0), 24);
            case 10:
                a0Var.getClass();
                return j.c(a0Var, "beginPermanentDeleteCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 1), 24);
            default:
                a0Var.getClass();
                return j.c(a0Var, "beginRecoverCard", this.f119787b, new c(this.f119788c, this.f119789d, this.f119790e, this.f119791f, this.f119792g, 4), 24);
        }
    }
}
