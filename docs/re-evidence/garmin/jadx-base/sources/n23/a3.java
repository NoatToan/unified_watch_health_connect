package n23;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.b f122393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f122394b;

    public a3(f2.b bVar, f2 f2Var) {
        this.f122393a = bVar;
        this.f122394b = f2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        f2.b bVar = this.f122393a;
        f2 f2Var = this.f122394b;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        if (p4.f122570a) {
            List<t23.d1> listQ = bVar.a().q();
            listQ.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(listQ, 10));
            for (t23.d1 d1Var : listQ) {
                d1Var.getClass();
                arrayList.add(new t3(f2Var, d1Var));
            }
            return arrayList;
        }
        if (bVar.b() != null) {
            return bVar.c().f122599a;
        }
        TypeVariable[] typeParameters = f2Var.f122441d.getTypeParameters();
        typeParameters.getClass();
        int iA = p13.t0.a(typeParameters.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (TypeVariable typeVariable : typeParameters) {
            f2 f2VarC = u.c(typeVariable);
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new t3(f2VarC, name, k23.s.INVARIANT, false));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            t3 t3Var = (t3) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            bounds.getClass();
            ArrayList arrayList2 = new ArrayList(bounds.length);
            for (Type type : bounds) {
                type.getClass();
                arrayList2.add(u.e(type, linkedHashMap, null, false, 6));
            }
            t3Var.getClass();
            t3Var.f122628f = arrayList2;
        }
        return p13.h0.b1(linkedHashMap.values());
    }
}
