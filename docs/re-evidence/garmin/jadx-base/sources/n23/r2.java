package n23;

import java.util.HashSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class r2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122595a;

    public r2(f2 f2Var) {
        this.f122595a = f2Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        t23.e eVarA;
        r33.a aVar;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        HashSet hashSet = f2.f122440f;
        f2 f2Var = this.f122595a;
        x33.b bVarS = f2Var.S();
        Class<T> cls = f2Var.f122441d;
        c4.a aVar2 = ((f2.b) f2Var.f122442e.getValue()).f122508a;
        k23.l<Object> lVar = i3.b.f122507b[0];
        Object objInvoke = aVar2.invoke();
        objInvoke.getClass();
        y23.i iVar = (y23.i) objInvoke;
        l43.n nVar = iVar.f194355a;
        t23.c0 c0Var = nVar.f110052b;
        if (bVarS.f188593c && cls.isAnnotationPresent(Metadata.class)) {
            l43.l lVar2 = nVar.f110070t;
            l43.l.b bVar = l43.l.f110040c;
            lVar2.getClass();
            eVarA = (t23.e) lVar2.f110043b.invoke(new l43.l.a(bVarS, null));
        } else {
            eVarA = t23.u.a(c0Var, bVarS);
        }
        if (eVarA != null) {
            return eVarA;
        }
        if (cls.isSynthetic()) {
            return f2.R(bVarS, iVar);
        }
        y23.e.f194347c.getClass();
        y23.e eVarA2 = y23.e.a.a(cls);
        r33.a.EnumC2820a enumC2820a = (eVarA2 == null || (aVar = eVarA2.f194349b) == null) ? null : aVar.f150095a;
        switch (enumC2820a == null ? -1 : f2.d.f122465a[enumC2820a.ordinal()]) {
            case -1:
            case 6:
                j.u("Unresolved class: ", cls, " (kind = ", enumC2820a);
                return null;
            case 0:
            default:
                lc.u0.r();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return f2.R(bVarS, iVar);
            case 5:
                j.u("Unknown class: ", cls, " (kind = ", enumC2820a);
                return null;
        }
    }
}
