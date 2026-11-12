package n23;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f122590a;

    public r0(t0 t0Var) {
        this.f122590a = t0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        o23.i<Constructor<?>> iVarF;
        k23.l<Object>[] lVarArr = t0.f122612n;
        m4 m4Var = m4.f122535a;
        t0 t0Var = this.f122590a;
        t23.v vVarE = t0Var.e();
        i3 i3Var = t0Var.f122613h;
        m4Var.getClass();
        a2 a2VarC = m4.c(vVarE);
        Object objG = null;
        if (a2VarC instanceof a2.d) {
            if (t0Var.C()) {
                Class<?> clsJ = i3Var.j();
                List<k23.k> parameters = t0Var.getParameters();
                ArrayList arrayList = new ArrayList(p13.y.r(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((k23.k) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new o23.a(clsJ, arrayList, o23.a.EnumC2467a.POSITIONAL_CALL, o23.a.b.KOTLIN, null, 16, null);
            }
            String str = ((a2.d) a2VarC).f122389a.f181896b;
            i3Var.getClass();
            str.getClass();
            Class<?> clsJ2 = i3Var.j();
            try {
                Class[] clsArr = (Class[]) i3Var.N(str, false).f122509a.toArray(new Class[0]);
                objG = clsJ2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            }
        } else if (a2VarC instanceof a2.e) {
            t23.v vVarE2 = t0Var.e();
            t23.l lVarD = vVarE2.d();
            lVarD.getClass();
            if (b43.j.c(lVarD) && (vVarE2 instanceof t23.k) && ((t23.k) vVarE2).L()) {
                t23.v vVarE3 = t0Var.e();
                String str2 = ((a2.e) a2VarC).f122391a.f181896b;
                List<t23.j1> listF = t0Var.e().f();
                listF.getClass();
                return new o23.m.b(vVarE3, i3Var, str2, listF);
            }
            w33.d.b bVar = ((a2.e) a2VarC).f122391a;
            objG = i3Var.G(bVar.f181895a, bVar.f181896b);
        } else if (a2VarC instanceof a2.c) {
            objG = ((a2.c) a2VarC).f122388a;
            objG.getClass();
        } else {
            if (!(a2VarC instanceof a2.b)) {
                if (!(a2VarC instanceof a2.a)) {
                    lc.u0.r();
                    return null;
                }
                List<Method> list = ((a2.a) a2VarC).f122386a;
                Class<?> clsJ3 = i3Var.j();
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Method) it3.next()).getName());
                }
                return new o23.a(clsJ3, arrayList2, o23.a.EnumC2467a.POSITIONAL_CALL, o23.a.b.JAVA, list);
            }
            objG = ((a2.b) a2VarC).f122387a;
            objG.getClass();
        }
        if (objG instanceof Constructor) {
            iVarF = t0Var.E((Constructor) objG, t0Var.e(), false);
        } else {
            if (!(objG instanceof Method)) {
                throw new w3("Could not compute caller for function: " + t0Var.e() + " (member = " + objG + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            Method method = (Method) objG;
            if (!Modifier.isStatic(method.getModifiers())) {
                iVarF = gg.b.H(t0Var) ? new o23.i.h.a(method, gl.b.h(t0Var.f122615j, t0Var.e())) : new o23.i.h.e(method);
            } else if (t0Var.e().getAnnotations().z(s4.f122608a) != null) {
                iVarF = gg.b.H(t0Var) ? new o23.i.h.b(method) : new o23.i.h.f(method);
            } else {
                iVarF = t0Var.F(method, false);
            }
        }
        return gl.b.o(t0Var.e(), iVarF, false);
    }
}
