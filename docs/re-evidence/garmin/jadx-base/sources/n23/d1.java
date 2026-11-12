package n23;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f122422a;

    public d1(e1 e1Var) {
        this.f122422a = e1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        List listL0;
        t23.u0 u0VarK0;
        k23.l<Object>[] lVarArr = e1.f122427e;
        e1 e1Var = this.f122422a;
        t23.o0 o0VarC = e1Var.c();
        int i14 = e1Var.f122429b;
        p0<?> p0Var = e1Var.f122428a;
        if (o0VarC instanceof t23.u0) {
            t23.b bVarE = p0Var.e();
            x33.c cVar = s4.f122608a;
            if (bVarE.H() != null) {
                t23.l lVarD = bVarE.d();
                lVarD.getClass();
                u0VarK0 = ((t23.e) lVarD).k0();
            } else {
                u0VarK0 = null;
            }
            if (p005kotlin.jvm.internal.s.g(u0VarK0, o0VarC) && p0Var.e().getKind() == t23.b.a.FAKE_OVERRIDE) {
                t23.l lVarD2 = p0Var.e().d();
                lVarD2.getClass();
                Class<?> clsI = s4.i((t23.e) lVarD2);
                if (clsI != null) {
                    return clsI;
                }
                lc.u0.t(o0VarC, "Cannot determine receiver Java type of inherited declaration: ");
                return null;
            }
        }
        o23.h<?> hVarA = p0Var.A();
        if (!(hVarA instanceof o23.m)) {
            if (!(hVarA instanceof o23.m.b)) {
                return hVarA.b().get(i14);
            }
            Class[] clsArr = (Class[]) ((Collection) ((o23.m.b) hVarA).f128741d.get(i14)).toArray(new Class[0]);
            Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
            int length = typeArr.length;
            if (length != 0) {
                return length != 1 ? new e1.a(typeArr) : (Type) p13.u.V(typeArr);
            }
            throw new d23.b("Expected at least 1 type for compound type");
        }
        if (gg.b.H(p0Var)) {
            o23.m mVar = (o23.m) hVarA;
            j23.l lVarD3 = mVar.d(i14 + 1);
            int i15 = mVar.d(0).f96797b + 1;
            listL0 = p13.h0.L0(mVar.f128730b.b(), new j23.l(lVarD3.f96796a - i15, lVarD3.f96797b - i15));
        } else {
            o23.m mVar2 = (o23.m) hVarA;
            listL0 = p13.h0.L0(mVar2.f128730b.b(), mVar2.d(i14));
        }
        Type[] typeArr2 = (Type[]) listL0.toArray(new Type[0]);
        Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
        int length2 = typeArr3.length;
        if (length2 != 0) {
            return length2 != 1 ? new e1.a(typeArr3) : (Type) p13.u.V(typeArr3);
        }
        throw new d23.b("Expected at least 1 type for compound type");
    }
}
