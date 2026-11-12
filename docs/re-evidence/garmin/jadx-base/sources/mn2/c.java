package mn2;

import c83.a0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f119781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f119783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f119784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.m f119785f;

    public /* synthetic */ c(b bVar, String str, String str2, String str3, pn2.m mVar, int i14) {
        this.f119780a = i14;
        this.f119781b = bVar;
        this.f119782c = str;
        this.f119783d = str2;
        this.f119784e = str3;
        this.f119785f = mVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f119780a;
        pn2.m<qn2.s, qn2.n> mVar = this.f119785f;
        String str = this.f119784e;
        String str2 = this.f119783d;
        String str3 = this.f119782c;
        b bVar = this.f119781b;
        switch (i14) {
            case 0:
                return bVar.i(str3, str2, str, mVar);
            case 1:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit = Unit.INSTANCE;
                return bVar.b(str3, str2, str, mVar);
            case 2:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit2 = Unit.INSTANCE;
                return bVar.g(str3, str2, str, mVar);
            case 3:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                return j.c(a0Var, "getCardUsageHistory", null, new c(this.f119781b, this.f119782c, this.f119783d, this.f119784e, this.f119785f, 7), 56);
            case 4:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit3 = Unit.INSTANCE;
                return bVar.q(str3, str2, str, mVar);
            case 5:
                return bVar.k(str3, str2, str, mVar);
            case 6:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit4 = Unit.INSTANCE;
                return bVar.a(str3, str2, str, mVar);
            case 7:
                return bVar.j(str3, str2, str, mVar);
            case 8:
                return bVar.s(str3, str2, str, mVar);
            case 9:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit5 = Unit.INSTANCE;
                return bVar.h(str3, str2, str, mVar);
            case 10:
                return bVar.n(str3, str2, str, mVar);
            case 11:
                return bVar.l(str3, str2, str, mVar);
            case 12:
                a0 a0Var2 = (a0) obj;
                a0Var2.getClass();
                return j.c(a0Var2, "updateCardInfo", null, new c(this.f119781b, this.f119782c, this.f119783d, this.f119784e, this.f119785f, 5), 56);
            case 13:
                return bVar.r(str3, str2, str, mVar);
            case 14:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit6 = Unit.INSTANCE;
                return bVar.t(str3, str2, str, mVar);
            default:
                return bVar.e(str3, str2, str, mVar);
        }
    }
}
