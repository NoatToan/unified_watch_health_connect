package tn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f165593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f165594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f165595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f165596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f165597g;

    public /* synthetic */ l0(r0 r0Var, String str, String str2, String str3, String str4, e23.l lVar, int i14) {
        this.f165591a = i14;
        this.f165592b = r0Var;
        this.f165593c = str;
        this.f165594d = str2;
        this.f165595e = str3;
        this.f165596f = str4;
        this.f165597g = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165591a;
        String str = this.f165593c;
        switch (i14) {
            case 0:
                c83.a0 a0Var = (c83.a0) obj;
                Logger logger = r0.f165631n;
                a0Var.getClass();
                pn2.a.f138690a.getClass();
                String str2 = pn2.a.e().f138762b;
                e23.l lVar = this.f165597g;
                String str3 = this.f165594d;
                String str4 = this.f165596f;
                String str5 = this.f165595e;
                r0 r0Var = this.f165592b;
                return new r0.e(r0Var, str3, str5, str2, str4, new g0(0, lVar, str3, str4, str5, r0Var), new m(r0Var, 14), lVar).c(a0Var, str);
            case 1:
                c83.a0 a0Var2 = (c83.a0) obj;
                Logger logger2 = r0.f165631n;
                a0Var2.getClass();
                pn2.a.f138690a.getClass();
                String str6 = pn2.a.e().f138762b;
                e23.l lVar2 = this.f165597g;
                String str7 = this.f165594d;
                String str8 = this.f165596f;
                String str9 = this.f165595e;
                r0 r0Var2 = this.f165592b;
                r0.e eVar = new r0.e(r0Var2, str7, str9, str6, str8, new g0(3, lVar2, str7, str8, str9, r0Var2), new i0(r0Var2, 4), lVar2);
                r0Var2.getClass();
                return eVar.c(a0Var2, str);
            case 2:
                c83.a0 a0Var3 = (c83.a0) obj;
                Logger logger3 = r0.f165631n;
                a0Var3.getClass();
                pn2.a.f138690a.getClass();
                String str10 = pn2.a.e().f138762b;
                e23.l lVar3 = this.f165597g;
                String str11 = this.f165594d;
                String str12 = this.f165596f;
                String str13 = this.f165595e;
                r0 r0Var3 = this.f165592b;
                return new r0.c(r0Var3, str11, str13, str10, str12, new g0(2, lVar3, str11, str12, str13, r0Var3), new n0(r0Var3, 3), lVar3).c(a0Var3, str);
            default:
                r0.b bVar = (r0.b) obj;
                Logger logger4 = r0.f165631n;
                bVar.getClass();
                String str14 = bVar.f165645a;
                String str15 = bVar.f165646b;
                r0 r0Var4 = this.f165592b;
                pn2.n nVar = r0Var4.f165637f;
                String str16 = this.f165595e;
                str16.getClass();
                qn2.v vVarA = nVar.a(str, this.f165594d, str15, str16);
                r0Var4.f165638g.getClass();
                pn2.m mVar = new pn2.m(vVarA, new rn2.e(str14));
                mn2.b bVar2 = r0Var4.f165633b;
                String strValueOf = String.valueOf(r0Var4.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                return mn2.j.b(bVar2, strValueOf, this.f165596f, pn2.a.e().f138762b, mVar, this.f165597g);
        }
    }
}
