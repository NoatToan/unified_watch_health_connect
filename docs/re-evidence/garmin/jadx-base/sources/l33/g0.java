package l33;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k33.i f109739b;

    public g0(h0 h0Var, k33.i iVar) {
        this.f109738a = h0Var;
        this.f109739b = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        h0.b aVar;
        t23.e eVar;
        h0.a aVar2 = (h0.a) obj;
        int i14 = h0.f109741r;
        aVar2.getClass();
        h0 h0Var = this.f109738a;
        x33.b bVar = new x33.b(h0Var.f109743o.f181639e, aVar2.f109746a);
        o33.f fVarA = aVar2.f109747b;
        k33.i iVar = this.f109739b;
        q33.v.a.C2679a c2679aC = fVarA != null ? iVar.f102785a.f102753c.c(fVarA, h0Var.w()) : iVar.f102785a.f102753c.b(bVar, h0Var.w());
        q33.x xVar = c2679aC != null ? c2679aC.f142539a : null;
        x33.b bVarD = xVar != null ? xVar.d() : null;
        if (bVarD == null || (!bVarD.g() && !bVarD.f188593c)) {
            if (xVar == null) {
                aVar = h0.b.C2099b.f109749a;
            } else if (xVar.a().f150095a == r33.a.EnumC2820a.CLASS) {
                q33.o oVar = h0Var.f109810b.f102785a.f102754d;
                oVar.getClass();
                l43.i iVarF = oVar.f(xVar);
                if (iVarF == null) {
                    eVar = null;
                } else {
                    l43.l lVar = oVar.c().f110070t;
                    x33.b bVarD2 = xVar.d();
                    lVar.getClass();
                    eVar = (t23.e) lVar.f110043b.invoke(new l43.l.a(bVarD2, iVarF));
                }
                aVar = eVar != null ? new h0.b.a(eVar) : h0.b.C2099b.f109749a;
            } else {
                aVar = h0.b.c.f109750a;
            }
            if (aVar instanceof h0.b.a) {
                return ((h0.b.a) aVar).f109748a;
            }
            if (!(aVar instanceof h0.b.c)) {
                if (!(aVar instanceof h0.b.C2099b)) {
                    lc.u0.r();
                    return null;
                }
                if (fVarA == null) {
                    fVarA = iVar.f102785a.f102752b.a(new h33.o.a(bVar, null, null, 4, null));
                }
                o33.f fVar = fVarA;
                if (o33.y.BINARY == null) {
                    StringBuilder sb3 = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                    sb3.append(fVar);
                    sb3.append("\nClassId: ");
                    sb3.append(bVar);
                    sb3.append("\nfindKotlinClass(JavaClass) = ");
                    q33.v vVar = iVar.f102785a.f102753c;
                    u33.c cVarW = h0Var.w();
                    vVar.getClass();
                    fVar.getClass();
                    cVarW.getClass();
                    q33.v.a.C2679a c2679aC2 = vVar.c(fVar, cVarW);
                    sb3.append(c2679aC2 != null ? c2679aC2.f142539a : null);
                    sb3.append("\nfindKotlinClass(ClassId) = ");
                    sb3.append(q33.w.a(iVar.f102785a.f102753c, bVar, h0Var.w()));
                    sb3.append('\n');
                    throw new IllegalStateException(sb3.toString());
                }
                x33.c cVarC = fVar != null ? fVar.c() : null;
                if (cVarC != null && !cVarC.f188596a.c() && cVarC.b().equals(h0Var.f109743o.f181639e)) {
                    m mVar = new m(iVar, h0Var.f109743o, fVar, null, 8, null);
                    iVar.f102785a.f102769s.a(mVar);
                    return mVar;
                }
            }
        }
        return null;
    }
}
